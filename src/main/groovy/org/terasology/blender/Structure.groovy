package org.terasology.blender

/**
 * Created by synopia on 11/10/14.
 */
class Structure extends Type {
    List<Field> fields = []

    Structure(int id, String name, int length) {
        super(id, name, length)
    }

    @Override
    BObject create(RandomAccessDataInput input) {
        return new BStructuredObject(this, input)
    }

    BObject get(RandomAccessDataInput input, String name) {
        for (Field it : fields) {
            if (it.name == name) {
                return it.get(input)
            }
            input.skipBytes(it.length(input))
        }
    }

    @Override
    boolean isStructure() {
        true
    }

    @Override
    String inspect() {
        def sb = new StringBuilder()
        sb.append(super.inspect()).append(" {\n")
        fields.each { field ->
            sb.append("\t${field.type.name} ${field.fqname}\n")
        }
        sb.append("}")
        sb.toString()
    }
}
