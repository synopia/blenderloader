package org.terasology.blender;

import java.util.Map;
import com.google.common.collect.Maps;

/**
 * @author synopia
 */
public class BObject {
    private Type type;
    private Map<String, BObject> data = Maps.newHashMap();

    public BObject(Type type) {
        this.type = type;
    }

    public BObject get( String name ) {
        return data.get(name);
    }

    public void set(String name, BObject value) {
        data.put(name,value );
    }
}
