package org.terasology.blender;

import java.util.List;

/**
 * @author synopia
 */
public class BObject {
    private Type type;

    public BObject(Type type) {
        this.type = type;
    }

    public int size() {
        return 1;
    }

    public BObject resolve(String name) {
        return this;
    }

    public Type getType() {
        return type;
    }

    public <T> T as( Class<T> type) {
        throw new IllegalStateException();
    }

    public <T> List<T> asList(Class<T> type) {
        throw new IllegalStateException();
    }

    @Override
    public String toString() {
        return "@"+type;
    }
}
