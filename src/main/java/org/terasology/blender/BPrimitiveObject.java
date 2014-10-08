package org.terasology.blender;

/**
 * @author synopia
 */
public class BPrimitiveObject extends BObject {
    private Object value;

    public BPrimitiveObject(Type type, Object value) {
        super(type);
        this.value = value;
    }

    @Override
    public BObject get(String name) {
        throw new IllegalStateException();
    }

    @Override
    public void set(String name, BObject value) {
        throw new IllegalStateException();
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
