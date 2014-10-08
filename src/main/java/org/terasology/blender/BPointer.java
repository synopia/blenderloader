package org.terasology.blender;

import java.util.StringTokenizer;

/**
 * @author synopia
 */
public class BPointer extends BObject {
    private long address;

    public BPointer(Type type, long address) {
        super(type);
        this.address = address;
    }

    @Override
    public BObject resolve(String name) {
        return null; // todo
    }

    public long getAddress() {
        return address;
    }

    public void setAddress(long address) {
        this.address = address;
    }
}
