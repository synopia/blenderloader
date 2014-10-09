package org.terasology.blender;

import java.util.List;

/**
 * @author synopia
 */
public class BPointer extends BObject {
    private long address;
    private Parser parser;

    public BPointer(Type type, long address) {
        super(type);
        this.address = address;
    }

    @Override
    public BObject resolve(String name) {
        return parser.getStructure(address).resolve(name);
    }

    @Override
    public <T> T as(Class<T> type) {
        return (T) parser.getStructure(address);
    }

    @Override
    public <T> List<T> asList(Class<T> type) {
        return (List<T>) parser.getStructures(address);
    }

    public long getAddress() {
        return address;
    }

    public void setAddress(long address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return getType().getName()+"@"+getAddress();
    }

    public void setParser(Parser parser) {
        this.parser = parser;
    }
}
