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
    static Pattern ARRAY = Pattern.compile("\\[([0-9])+\\]");
    public Type type;
    public String fullName;
    public String name;

    public boolean isPointer;
    public boolean isArray;
    public int arrayLength;
    List<Integer> arrayDim = Lists.newArrayList();

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
            if( type.name.equals("char")) {
                byte []string = new byte[arrayLength];
                dis.readFully(string);
                return new BPrimitiveObject(new String(string));
            }
            BArray array = new BArray();
            for (int i = 0; i < arrayLength; i++) {
                BObject value = loadSingleValue(dis);
                array.set(Integer.toString(i), value);
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

    public void set( BObject object, BObject value ) {
        object.set(name, value);
    }

    public int getLength() {
        int fieldLength = isPointer ? Parser.pointerSize : type.length;
        return arrayLength*fieldLength;
    }
}
