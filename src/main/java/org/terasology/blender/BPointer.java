package org.terasology.blender;

/**
 * @author synopia
 */
public class BPointer extends BObject {
    private long address;

    public BPointer(Type type, long address) {
        super(type);
        this.address = address;
    }
}
