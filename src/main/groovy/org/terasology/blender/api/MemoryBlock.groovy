package org.terasology.blender.api

/**
 * Created by synopia on 11/10/14.
 */
class MemoryBlock {
    String code
    int size
    long address
    int sdnaIndex
    int count
    int position
    RandomAccessDataInput input
    StructureParser sdna

    Type getType() {
        sdna.structures.get(sdnaIndex)
    }

    BObject get(int index) {
        input.block = this
        input.seek(position + index * type.length)
        type.create(input)
    }

    boolean contains(long addr) {
        return address <= addr && addr < address + size
    }

    void load(RandomAccessDataInput input) {
        code = input.readString(4)
        size = input.readInt()
        address = input.readPointer()
        sdnaIndex = input.readInt()
        count = input.readInt()
        position = input.position
        this.input = input.dup()
    }
}
