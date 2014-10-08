package org.terasology.blender;

import java.io.DataInput;
import java.io.IOException;
import java.util.List;
import com.google.common.collect.Lists;

/**
 * @author synopia
 */
public class Structure extends Type {
    public final List<Field> fields = Lists.newArrayList();

    public Structure(int id, String name) {
        super(id, name, 0);
    }

    public void addField(Type type, String name) {
        fields.add(new Field(type, name));
    }

    @Override
    public BStructuredObject load( DataInput dis) throws IOException {
        BStructuredObject object = new BStructuredObject(this);
        for (Field field : fields) {
            BObject fieldValue = field.load(dis);
            field.set(object, fieldValue);
        }
        return object;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName()).append(" {\n");
        for (Field field : fields) {
            sb.append("\t").append(field.getType().getName()).append(" ").append(field.getFullName()).append("; // size=").append(field.getLength()).append("\n");
        }
        sb.append("}\n");
        return sb.toString();
    }

    public void resolveTypes(List<Structure> structures) {
        for (Field field : fields) {
            Structure structure = findStructure(field.getType().getName(), structures);
            if( structure!=null ) {
                field.setType(structure);
            }
        }
    }


    private Structure findStructure( String type, List<Structure> structures ) {
        for (Structure structure : structures) {
            if( structure.getName().equals(type) ) {
                return structure;
            }
        }
        return null;
    }
}
