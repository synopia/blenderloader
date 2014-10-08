package org.terasology.blender;

import java.io.DataInput;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author synopia
 */
public class RAFDataInput implements DataInput {
    private RandomAccessFile file;
    private byte[] work = new byte[8];
    private boolean littleEndian;

    public RAFDataInput(RandomAccessFile file) {
        this.file = file;
    }

    public long position() {
        try {
            return file.getFilePointer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void seek(long pos) {
        try {
            file.seek(pos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setLittleEndian(boolean littleEndian) {
        this.littleEndian = littleEndian;
    }

    @Override
    public void readFully(byte[] b) throws IOException {
        file.readFully(b);
    }

    @Override
    public void readFully(byte[] b, int off, int len) throws IOException {
        file.readFully(b, off, len);
    }

    @Override
    public int skipBytes(int n) throws IOException {
        return file.skipBytes(n);
    }

    @Override
    public boolean readBoolean() throws IOException {
        return file.readBoolean();
    }

    @Override
    public byte readByte() throws IOException {
        return file.readByte();
    }

    @Override
    public int readUnsignedByte() throws IOException {
        return file.readUnsignedByte();
    }

    @Override
    public short readShort() throws IOException {
        if( littleEndian ) {
            file.readFully(work, 0, 2);
            return (short) ((work[1] & 0xff) << 8 | (work[0] & 0xff));
        } else {
            return file.readShort();
        }
    }

    @Override
    public int readUnsignedShort() throws IOException {
        if( littleEndian ) {
            file.readFully(work, 0, 2);
            return ((work[1] & 0xff) << 8 | (work[0] & 0xff));
        } else {
            return file.readUnsignedShort();
        }
    }

    @Override
    public char readChar() throws IOException {
        if( littleEndian ) {
            file.readFully(work, 0, 2);
            return (char) ((work[1] & 0xff) << 8 | (work[0] & 0xff));
        } else {
            return file.readChar();
        }
    }

    @Override
    public int readInt() throws IOException {
        if( littleEndian ) {
            file.readFully(work, 0, 4);
            return (work[3]) << 24
                    | (work[2] & 0xff) << 16
                    | (work[1] & 0xff) << 8
                    | (work[0] & 0xff);
        } else {
            return file.readInt();
        }
    }

    @Override
    public long readLong() throws IOException {
        if( littleEndian ) {
            file.readFully(work, 0, 8);
            return (long) (work[7]) << 56
                    |
                    (long) (work[6] & 0xff) << 48
                    | (long) (work[5] & 0xff) << 40
                    | (long) (work[4] & 0xff) << 32
                    | (long) (work[3] & 0xff) << 24
                    | (long) (work[2] & 0xff) << 16
                    | (long) (work[1] & 0xff) << 8
                    | (long) (work[0] & 0xff);
        } else {
            return file.readLong();
        }
    }

    @Override
    public float readFloat() throws IOException {
        return Float.intBitsToFloat( readInt() );
    }

    @Override
    public double readDouble() throws IOException {
        return Double.longBitsToDouble( readLong() );
    }

    @Override
    public String readLine() throws IOException {
        return file.readLine();
    }

    @Override
    public String readUTF() throws IOException {
        return file.readUTF();
    }

    public void close() throws IOException {
        file.close();
    }
}
