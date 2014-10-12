package org.terasology.blender
/**
 * Created by synopia on 11/10/14.
 */
class BArray extends BObject {
    int size

    BArray(Type type, RandomAccessDataInput input, int size) {
        super(type, input)
        this.size = size

        if (size == -1) {
            this.size = input.block.size / type.length
        }
    }

    @Override
    def get() {
        if (type.name == "char") {
            StringBuilder sb = new StringBuilder()
            for (int i = 0; i < size; i++) {
                def ch = (char) this[i].get()
                if (ch == 0) {
                    break;
                }
                sb.append(ch)
            }
            return sb.toString()
        } else {
            List list = []
            for (int i = 0; i < size; i++) {
                list << this[i].get()
            }
            return list
        }
    }

    /**
     * Returns BObject at index
     */
    def getAt(int index) {
        def i = input.dup()
        i.skipBytes(type.length * index)
        type.create(i)
    }

    def propertyMissing(String name) {
        if (type.isStructure()) {
            type.get(input.dup(), name)
        }
    }

}
