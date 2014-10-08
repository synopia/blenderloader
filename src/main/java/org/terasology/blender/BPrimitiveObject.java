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

    public Object get() {
        return value;
    }

    public void set(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public <T> T as(Class<T> type) {
        return (T) value;
    }
}