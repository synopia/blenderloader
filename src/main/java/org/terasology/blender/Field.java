package org.terasology.blender;

import java.io.DataInput;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.google.common.collect.Lists;

/**
 * @author synopia
 */
public class Field {
    static Pattern ARRAY = Pattern.compile("\\[([0-9]+)\\]");
    private Type type;
    private String name;
    private String fullName;

    private boolean isPointer;
    private boolean isArray;
    private int arrayLength;
    private List<Integer> arrayDim = Lists.newArrayList();

    public Field(Type type, String fullName) {
        this.type = type;
        this.fullName = fullName;

        name = fullName;
        isPointer = fullName.startsWith("*");
        if( isPointer ) {
            name = fullName.substring(1);
        }
        Matcher matcher = ARRAY.matcher(fullName);
        arrayLength = 1;
        while (matcher.find()) {
            isArray = true;
            int dim = Integer.parseInt(matcher.group(1));
            arrayLength *= dim;
            arrayDim.add(dim);
        }
        if( isArray ) {
            name = fullName.split("\\[")[0];
        }
    }

    public BObject load( DataInput dis ) throws IOException {
        if( isArray ) {
            BArray array = new BArray(getType());
            for (int i = 0; i < arrayLength; i++) {
                BObject value = loadSingleValue(dis);
                array.add(value);
            }
            return array;
        } else {
            return loadSingleValue(dis);
        }
    }

    private BObject loadSingleValue(DataInput dis) throws IOException {
        if( isPointer ) {
            return new BPointer(type, Parser.readPointer(dis));
        } else {
            return type.load(dis);
        }
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isPointer() {
        return isPointer;
    }

    public boolean isArray() {
        return isArray;
    }

    public String getFullName() {
        return fullName;
    }

    public void set( BStructuredObject object, BObject value ) {
        object.set(name, value);
    }

    public int getLength() {
        int fieldLength = isPointer ? Parser.pointerSize : type.getLength();
        return arrayLength*fieldLength;
    }
}
