package org.terasology.blender.api

/**
 * Created by synopia on 11/10/14.
 */
class Type {
    int id
    String name
    int length

    Type(int id, String name, int length) {
        this.id = id
        this.name = name
        this.length = length
    }

    BObject create(RandomAccessDataInput input) {
        return new BPrimitiveObject(this, input)
    }

    boolean isStructure() {
        false
    }

    @Override
    String toString() {
        name
    }

    String inspect() {
        "${name} (id=${id}, len=${length})"
    }
}
