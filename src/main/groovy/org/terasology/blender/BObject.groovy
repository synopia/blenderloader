package org.terasology.blender

/**
 * Created by synopia on 11/10/14.
 */
abstract class BObject {
    static BObject NULL = new BObject(null, null) {
        @Override
        def get() {
            return null
        }

        @Override
        String toString() {
            return "null"
        }

        @Override
        boolean isNull() {
            true
        }
    }
    Type type
    RandomAccessDataInput input

    BObject(Type type, RandomAccessDataInput input) {
        this.type = type
        this.input = input != null ? input.dup() : null
    }

    abstract def get()

    boolean isNull() {
        false
    }

    @Override
    String toString() {
        get().toString()
    }
}
