package org.terasology.blender.api

/**
 * Created by synopia on 11/10/14.
 */
class BStructuredObject extends BObject {
    BStructuredObject(Type type, RandomAccessDataInput input) {
        super(type, input)
    }

    @Override
    BStructuredObject get() {
        this
    }

    @Override
    Structure getType() {
        return (Structure) super.getType()
    }

    def propertyMissing(String name) {
        type.get(input.dup(), name)
    }

    @Override
    String toString() {
        return type.toString()
    }
}
