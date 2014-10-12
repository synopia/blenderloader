package org.terasology.blender

import java.util.regex.Matcher
import java.util.regex.Pattern

/**
 * Created by synopia on 11/10/14.
 */
class Field {
    private static Pattern ARRAY = Pattern.compile("\\[([0-9]+)\\]");

    Type type
    String name
    String fqname
    int arrayLength
    List<Integer> arrayDim = []
    int pointerDepth

    Field(Type type, String fqname) {
        this.type = type
        this.fqname = fqname

        name = fqname
        while (name.startsWith("*")) {
            pointerDepth++
            name = name.substring(1)
        }

        Matcher matcher = ARRAY.matcher(name)
        arrayLength = 1
        boolean first = true
        while (matcher.find()) {
            if (first) {
                name = name.substring(0, matcher.toMatchResult().start())
                first = false
            }
            int dim = Integer.parseInt(matcher.group(1));
            arrayLength *= dim
            arrayDim << dim
        }
    }

    BObject get(RandomAccessDataInput input) {
        if (isArray()) {
            return new BArray(type, input, arrayLength)
        }
        if (isPointer()) {
            input = input.dup()
            def position = input.goTo(input.readPointer())
            if (position != 0) {
                return new BArray(type, input, -1)
            } else {
                return BObject.NULL
            }
        }

        type.create(input)
    }

    int length(RandomAccessDataInput input) {
        if (isPointer()) {
            return input.pointerSize
        }
        int cnt = isArray() ? arrayLength : 1
        return type.length * cnt
    }

    boolean isArray() {
        arrayDim.size() > 0
    }

    boolean isPointer() {
        pointerDepth > 0
    }

    @Override
    String toString() {
        return type.toString() + " " + fqname
    }
}
