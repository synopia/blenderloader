package org.terasology.blender;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author synopia
 */
public class BStructuredObject extends BObject {
    private long memoryAddress;

    public BStructuredObject(Structure structure) {
        super(structure);
    }

    private Map<String, BObject> data = Maps.newHashMap();

    public BObject get( String name ) {
        return data.get(name);
    }

    public void set(String name, BObject value) {
        data.put(name,value );
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public BObject resolve(String name) {
        if( getType().isA(name) ) {
            return this;
        }
        return data.get(name);
    }

    @Override
    public Structure getType() {
        return (Structure) super.getType();
    }

    public void setMemoryAddress(long memoryAddress) {
        this.memoryAddress = memoryAddress;
    }

    public long getMemoryAddress() {
        return memoryAddress;
    }
}
