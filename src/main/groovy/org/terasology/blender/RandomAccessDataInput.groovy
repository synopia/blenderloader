package org.terasology.blender

import com.google.common.io.ByteArrayDataInput
import com.google.common.io.ByteStreams

/**
 * Created by synopia on 11/10/14.
 */
class RandomAccessDataInput implements ByteArrayDataInput {
    boolean littleEndian
    int pointerSize
    byte[] data
    int position
    ByteArrayDataInput current
    byte[] work = new byte[8]
    BlenderParser parser
    MemoryBlock block

    RandomAccessDataInput(byte[] data, int position = 0) {
        this.data = data
        seek(position)
    }

    def dup() {
        def input = new RandomAccessDataInput(data, position)
        input.littleEndian = littleEndian
        input.pointerSize = pointerSize
        input.parser = parser
        input.block = block
        input
    }

    def goTo(long address) {
        block = parser.memory.find({ b -> b.contains(address) })
        if (block == null) {
            return 0
        }
        int offset = address - block.address

        seek(block.position + offset)

        return position
    }

    def seek(int pos) {
        position = pos
        current = ByteStreams.newDataInput(data, pos)
    }

    def align() {
        while ((position & 3) != 0) {
            skipBytes(1)
        }
    }

    String readString() {
        byte ch = -1;
        StringBuilder sb = new StringBuilder();
        while (ch != 0) {
            ch = readByte();
            if (ch != 0) {
                sb.append((char) ch);
            }
        }
        return sb.toString();
    }

    String readString(int size) {
        byte[] buf = new byte[size];
        readFully(buf);
        return new String(buf);
    }

    long readPointer() {
        switch (pointerSize) {
            case 4:
                return readInt();
            case 8:
                return readLong()
            default:
                throw new IllegalStateException("Unsupported pointer size " + pointerSize)
        }
    }

    @Override
    void readFully(byte[] b) {
        position += b.length
        current.readFully(b)
    }

    @Override
    void readFully(byte[] b, int off, int len) {
        position += len
        current.readFully(b, off, len)
    }

    @Override
    int skipBytes(int n) {
        position += n
        return current.skipBytes(n)
    }

    @Override
    boolean readBoolean() {
        position += 1
        return current.readBoolean()
    }

    @Override
    byte readByte() {
        position += 1
        return current.readByte()
    }

    @Override
    int readUnsignedByte() {
        position += 1
        return current.readUnsignedByte()
    }

    @Override
    short readShort() {
        position += 2
        if (littleEndian) {
            current.readFully(work, 0, 2);
            return (short) ((work[1] & 0xff) << 8 | (work[0] & 0xff));
        } else {
            return current.readShort();
        }
    }

    @Override
    int readUnsignedShort() {
        position += 2
        if (littleEndian) {
            current.readFully(work, 0, 2);
            return (short) ((work[1] & 0xff) << 8 | (work[0] & 0xff));
        } else {
            return current.readUnsignedShort();
        }
    }

    @Override
    char readChar() {
        position += 2
        if (littleEndian) {
            current.readFully(work, 0, 2);
            return (char) ((work[1] & 0xff) << 8 | (work[0] & 0xff));
        } else {
            return current.readChar()
        }
    }

    @Override
    int readInt() {
        position += 4
        if (littleEndian) {
            current.readFully(work, 0, 4);
            return ((work[3]) << 24
                    | (work[2] & 0xff) << 16
                    | (work[1] & 0xff) << 8
                    | (work[0] & 0xff));
        } else {
            return current.readInt();
        }
    }

    @Override
    long readLong() {
        position += 8
        if (littleEndian) {
            current.readFully(work, 0, 8);
            return (long) ((work[7]) << 56
                    | (long) (work[6] & 0xff) << 48
                    | (long) (work[5] & 0xff) << 40
                    | (long) (work[4] & 0xff) << 32
                    | (long) (work[3] & 0xff) << 24
                    | (long) (work[2] & 0xff) << 16
                    | (long) (work[1] & 0xff) << 8
                    | (long) (work[0] & 0xff));
        } else {
            return current.readLong();
        }
    }

    @Override
    float readFloat() {
        Float.intBitsToFloat(readInt());
    }

    @Override
    double readDouble() {
        Double.longBitsToDouble(readLong());
    }

    @Override
    String readLine() {
        throw new IllegalStateException();
    }

    @Override
    String readUTF() {
        throw new IllegalStateException();
    }
}
