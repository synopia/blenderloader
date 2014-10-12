package org.terasology.blender

/**
 * Created by synopia on 11/10/14.
 */
class BPrimitiveObject extends BObject {
    BPrimitiveObject(Type type, RandomAccessDataInput input) {
        super(type, input)
    }

    /**
     * Returns embedded value, real primitives if possible
     */
    @Override
    def get() {
        switch (type.name) {
            case "byte": return input.readByte()
            case "short": return input.readShort();
            case "float": return input.readFloat();
            case "int": return input.readInt();
            case "uint64_t": return input.readLong();
            case "char": return (char) input.readByte();
            case "double": return input.readDouble();
            default:
                throw new IllegalStateException("Unknown primitive type $type.name");
        }
    }

    def getf() {
        def value = get()
        String.format(Locale.ENGLISH, "%.6f", value);
    }

}
