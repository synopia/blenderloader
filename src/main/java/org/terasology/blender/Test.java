package org.terasology.blender;

import com.google.common.io.LittleEndianDataInputStream;

import java.io.BufferedInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by synopia on 07/10/14.
 */
public class Test {
    public static int pointerSize;
    public abstract static class BaseReader {
        public abstract long load(DataInput dis) throws IOException;
        String readString(DataInput dis, int size) throws IOException {
            byte buf[] = new byte[size];
            dis.readFully(buf);
            return new String(buf);
        }
        long readPointer(DataInput dis) throws IOException {
            switch (pointerSize) {
                case 4: return dis.readInt();
                case 8: return dis.readLong();
            }
            return 0;
        }
    }
    public static class FileHeader extends BaseReader {
        public String identifier;
        public boolean littleEndian;
        public String version;

        @Override
        public long load(DataInput dis) throws IOException {
            identifier = readString(dis, 7);
            pointerSize = dis.readByte()=='_' ? 4 : 8;
            littleEndian = dis.readByte()=='v';
            version = readString(dis, 3);

            return 7 + 1 + 1 + 3;
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

        @Override
        public long load( DataInput dis ) throws IOException{
            code = readString(dis, 4);
            size = dis.readInt();
            memoryAddress = readPointer(dis);
            sdnaIndex = dis.readInt();
            count = dis.readInt();

            return 4 + 4 + pointerSize + 4 + 4;
        }

        @Override
        public String toString() {
            return code+" size="+size+" memory="+memoryAddress+" sdna="+sdnaIndex + " count="+count;
        }
    }
    private void load() throws IOException {
        InputStream file = getClass().getResourceAsStream("/killerbunny103_export.blend");
        DataInput dis = new DataInputStream(file);
        FileHeader header = new FileHeader();
        FileBlock block = new FileBlock();

        file.mark(12);
        long pos = header.load(dis);
        System.out.println(header);
        if( header.littleEndian ) {
            file.reset();
            dis = new LittleEndianDataInputStream(file);
            dis.skipBytes((int)pos);
        }

        while(  !block.code.equals("ENDB")) {
            pos += block.load(dis);
            System.out.println(block);

            pos += block.size;
            int remain = block.size;
            while( remain>0 ) {
                remain -= dis.skipBytes(remain);
            }
        }

        System.out.println(pos);

        file.close();
    }

    public static void main(String[] args) throws IOException {
        Test test = new Test();
        test.load();
    }
}
