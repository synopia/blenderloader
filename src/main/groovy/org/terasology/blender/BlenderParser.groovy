package org.terasology.blender

import java.util.zip.GZIPInputStream

/**
 * Created by synopia on 11/10/14.
 */
class BlenderParser {
    InputStream inputStream
    RandomAccessDataInput input
    int pointerSize
    boolean littleEndian
    String version
    StructureParser sdna
    List<MemoryBlock> memory = []
    Map<String, Type> types = [:]

    BlenderParser(InputStream inputStream) {
        this.inputStream = new BufferedInputStream(inputStream);
    }

    def findByType(String typeName) {
        List<BObject> result = []
        def type = types[typeName]
        if (type == null) {
            throw new IllegalStateException("Type $typeName is unknown")
        }
        for (MemoryBlock block : memory) {
            if (block.sdnaIndex == type.id) {
                for (int i = 0; i < block.count; i++) {
                    result << block.get(i)
                }
            }
        }
        result
    }

    def load() {
        loadFile()
        scanFile()
        for (Type type : sdna.types.values()) {
            types[type.name] = type
        }
    }

    def loadFile() {
        inputStream.mark(12)
        String fileId
        fileId = loadHeader(inputStream)

        if ("BLENDER" != fileId) {
            inputStream.reset()
            inputStream = new GZIPInputStream(inputStream)
            fileId = loadHeader(inputStream)
        }
        byte[] buf = new byte[4096]
        ByteArrayOutputStream baos = new ByteArrayOutputStream()
        while (inputStream.available() > 0) {
            int bytes = inputStream.read(buf)
            if (bytes > 0) {
                baos.write(buf, 0, bytes)
            }
        }
        input = new RandomAccessDataInput(baos.toByteArray())
        input.littleEndian = littleEndian
        input.pointerSize = pointerSize
        input.parser = this
    }

    def scanFile() {
        sdna = new StructureParser()
        MemoryBlock block = new MemoryBlock()
        while (block.code != "ENDB") {
            block = new MemoryBlock()
            block.sdna = sdna
            block.load(input)
            memory << block
            int pos = input.position

            if (block.code == "DNA1") {
                sdna.parse(input)
            }
            input.seek(pos + block.size)
        }
    }

    private String loadHeader(InputStream inputStream) {
        DataInputStream dis = new DataInputStream(inputStream)

        def fileId = readString(dis, 7)
        pointerSize = dis.readByte() == '_' ? 4 : 8
        littleEndian = dis.readByte() == 'v'
        version = readString(dis, 3)
        fileId
    }

    static String readString(DataInput dis, int size) throws IOException {
        byte[] buf = new byte[size];
        dis.readFully(buf);
        return new String(buf);
    }
}
