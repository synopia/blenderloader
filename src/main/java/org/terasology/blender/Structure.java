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
        this.id = id;
        this.name = name;
    }

    public void addField(Type type, String name) {
        fields.add(new Field(type, name));
    }

    @Override
    public BObject load( DataInput dis) throws IOException {
        BStructureObject object = new BStructureObject(this);
        for (Field field : fields) {
            BObject fieldValue = field.load(dis);
            field.set(object, fieldValue);
        }
        return object;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" {\n");
        for (Field field : fields) {
            sb.append("\t").append(field.type).append(" ").append(field.fullName).append("; // size=").append(field.getLength()).append("\n");
        }
        sb.append("}\n");
        return sb.toString();
    }
}
