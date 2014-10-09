package org.terasology.blender;

import java.io.DataInput;
import java.io.IOException;

/**
 * @author synopia
 */
public class Type {
    public static Type BASE = new Type(-1, "base", 0);
    private int id;
    private String name;
    private int length;


    public Type(int id, String name, int length) {
        this.id = id;
        this.name = name;
        this.length = length;
    }

    public BObject load(DataInput dis) throws IOException {
        switch (name) {
            case "byte":
                return new BPrimitiveObject(this, dis.readByte());
            case "short":
                return new BPrimitiveObject(this, dis.readShort());
            case "float":
                return new BPrimitiveObject(this, dis.readFloat());
            case "int":
                return new BPrimitiveObject(this, dis.readInt());
            case "uint64_t":
                return new BPrimitiveObject(this, dis.readLong());
            case "char":
                return new BPrimitiveObject(this, (char) dis.readByte());
            default:
                throw new IllegalStateException("Unknown primitive type " + name);
        }
    }

    public boolean isA(String type) {
        return getName().equals(type);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return name;
    }
}
