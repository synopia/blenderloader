package org.terasology.blender;

import com.google.common.collect.Lists;

import java.io.DataInput;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

/**
 * Created by synopia on 07/10/14.
 */
public class Parser {
    private List<FileBlock> blocks = Lists.newArrayList();

    public static int pointerSize;
    private RAFDataInput dis;

    public Parser(RAFDataInput dis) {
        this.dis = dis;
    }

    public static long readPointer(DataInput dis) throws IOException {
        switch (pointerSize) {
            case 4: return dis.readInt();
            case 8: return dis.readLong();
        }
        return 0;
    }

    public abstract static class BaseReader {
        public abstract void load(DataInput dis) throws IOException;
        String readString(DataInput dis, int size) throws IOException {
            byte buf[] = new byte[size];
            dis.readFully(buf);
            return new String(buf);
        }

        String readString(DataInput dis) throws IOException {
            byte ch = -1;
            StringBuilder sb = new StringBuilder();
            while (ch!=0) {
                ch = dis.readByte();
                if( ch!=0 ) {
                    sb.append((char) ch);
                }
            }
            return sb.toString();
        }

        void align( DataInput dis, int pos) throws IOException {
            dis.skipBytes(pos%4);
        }
    }
    public static class FileHeader extends BaseReader {
        public String identifier;
        public boolean littleEndian;
        public String version;

        @Override
        public void load(DataInput dis) throws IOException {
            identifier = readString(dis, 7);
            pointerSize = dis.readByte()=='_' ? 4 : 8;
            littleEndian = dis.readByte()=='v';
            version = readString(dis, 3);
        }

        @Override
        public String toString() {
            return identifier+ " v" + version+ " littleEndian="+littleEndian;
        }
    }
    public static class FileBlock extends BaseReader {
        String code="";
        int size;
        long memoryAddress;
        int sdnaIndex;
        int count;
        long offset;

        @Override
        public void load(DataInput dis) throws IOException{
            code = readString(dis, 4);
            size = dis.readInt();
            memoryAddress = readPointer(dis);
            sdnaIndex = dis.readInt();
            count = dis.readInt();
        }

        @Override
        public String toString() {
            return code+" size="+size+" memory="+memoryAddress+" sdna="+sdnaIndex + " count="+count;
        }
    }

    public static class SDNA extends BaseReader {
        String identifier;
        String nameIdentifier;
        List<String> names = Lists.newArrayList();

        String typeIdentifier;
        List<String> typeNames = Lists.newArrayList();

        String lengthIdentifier;
        List<Short> lengths = Lists.newArrayList();

        String structureIdentifier;

        List<Type> types = Lists.newArrayList();
        List<Structure> structures = Lists.newArrayList();
        @Override
        public void load(DataInput dis) throws IOException {
            identifier = readString(dis, 4);
            nameIdentifier = readString(dis, 4);
            int nameCnt = dis.readInt();
            int pos = 0;
            for (int i = 0; i < nameCnt; i++) {
                String str = readString(dis);
                pos += str.length()+1;
                names.add(str);
            }

            align(dis, pos);
            typeIdentifier = readString(dis, 4);
            int typeCnt = dis.readInt();
            pos = 0;
            for (int i = 0; i < typeCnt; i++) {
                String str = readString(dis);
                pos += str.length()+1;
                typeNames.add(str);
            }

            align(dis, pos);
            pos = 0;
            lengthIdentifier = readString(dis, 4);
            for (int i = 0; i < typeCnt; i++) {
                short length = dis.readShort();
                lengths.add(length);
                pos += 2;

                types.add(new Type(i, typeNames.get(i), length));
            }

            align(dis,pos);
            structureIdentifier = readString(dis, 4);
            int structureCnt = dis.readInt();
            for (int i = 0; i < structureCnt; i++) {
                int structureType;
                int fieldCnt;

                structureType = dis.readShort();
                Structure structure = new Structure(i, typeNames.get(structureType));
                fieldCnt = dis.readShort();
                for (int j = 0; j < fieldCnt; j++) {
                    short type = dis.readShort();
                    short name = dis.readShort();

                    structure.addField( types.get(type), names.get(name));
                }
                structures.add(structure);
            }
            for (Structure structure : structures) {
                for (Field field : structure.fields) {
                    field.type.structure = findStructure(field.type.name, structures);
                }
            }
        }

        private Structure findStructure( String type, List<Structure> structures ) {
            for (Structure structure : structures) {
                if( structure.name.equals(type) ) {
                    return structure;
                }
            }
            return null;
        }
    }

    BObject load() throws IOException, URISyntaxException {
        FileHeader header = new FileHeader();
        FileBlock block = new FileBlock();
        header.load(dis);
        dis.setLittleEndian(header.littleEndian);
        SDNA sdna = new SDNA();

        while(  !block.code.equals("ENDB")) {
            block = new FileBlock();
            block.load(dis);
            long pos = dis.position();
            block.offset = pos;
            if( block.code.equals("DNA1")) {
                sdna.load(dis);
            } else if( !block.code.equals("ENDB")) {
                blocks.add(block);
            }

            dis.seek(pos + block.size);
        }

        BObject root = new BObject();
        int id = 0;
        for (FileBlock b : blocks) {
            Structure structure = sdna.structures.get(b.sdnaIndex);
            if( any(structure.name, "Bone", "bPoseChannel", "Material", "MTex", "Mesh", "MVert", "MEdge", "MLoopUV", "MLoop", "MTexPoly", "MPoly", "") ) {
                BArray target = new BArray();
                root.set(id+"", target);
                dis.seek(b.offset);
                for (int i = 0; i < b.count; i++) {
                    BStructureObject object = structure.load(dis);
                    target.set(i+"", object);
                }
            }
            id++;
        }
        dis.close();
        return root;
    }

    private boolean any( String value, String ... any) {
        for (int i = 0; i < any.length; i++) {
            if( any[i].equals(value) ) {
                return true;
            }
        }
        return false;
    }
}
