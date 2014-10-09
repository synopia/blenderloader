package org.terasology.blender.gui;

import java.util.List;
import org.terasology.blender.BArray;
import org.terasology.blender.BObject;
import org.terasology.blender.BPointer;
import org.terasology.blender.BStructuredObject;
import org.terasology.blender.Field;
import org.terasology.blender.Parser;
import org.terasology.blender.Structure;

/**
 * @author synopia
 */
public class BlenderTreeModel extends AbstractTreeTableModel {

    public static class BoundField {
        public Field field;
        public BStructuredObject object;

        public BoundField(Field field, BStructuredObject object) {
            this.field = field;
            this.object = object;
        }

        public BObject get() {
            return field.get(object);
        }

        @Override
        public String toString() {
            return field.getName();
        }
    }

    private Parser parser;
    public BlenderTreeModel(Parser parser, BObject root) {
        super(root);

        this.parser = parser;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Class getColumnClass(int column) {
        return column==0 ? TreeTableModel.class : String.class;
    }

    @Override
    public String getColumnName(int column) {
        return "";
    }

    @Override
    public Object getValueAt(Object node, int column) {
        switch (column) {
            case 1:
                if (node instanceof BArray) {
                    BArray array = (BArray) node;
                    return array.getType().getName();
                }
                if (node instanceof BoundField) {
                    BoundField field = (BoundField) node;
                    return field.field.getType().getName();
                }
            case 2:
                if (node instanceof BArray) {
                    BArray array = (BArray) node;
                    return array.size();
                }
                if (node instanceof BoundField) {
                    BoundField field = (BoundField) node;
                    return field.get();
                }
            default: return null;
        }
    }

    @Override
    public Object getChild(Object parent, int index) {
        if (parent instanceof BArray) {
            BArray array = (BArray) parent;
            return array.get(index);
        }
        if (parent instanceof BStructuredObject) {
            BStructuredObject object = (BStructuredObject) parent;
            Structure structure = object.getType();
            return new BoundField(structure.getFields().get(index), object);
        }
        if (parent instanceof BoundField) {
            BoundField field = (BoundField) parent;
            return getChild(field.get(), index);
        }
        if (parent instanceof BPointer) {
            BPointer pointer = (BPointer) parent;
            List<BStructuredObject> list = parser.getStructure(pointer.getAddress());
            return list.get(index);
        }
        return null;
    }

    @Override
    public int getChildCount(Object parent) {
        if (parent instanceof BArray) {
            BArray array = (BArray) parent;
            return array.size();
        }
        if (parent instanceof BStructuredObject) {
            BStructuredObject object = (BStructuredObject) parent;
            Structure structure = object.getType();
            return structure.getFields().size();
        }
        if (parent instanceof BoundField) {
            BoundField field = (BoundField) parent;
            return getChildCount(field.get());
        }
        if (parent instanceof BPointer) {
            BPointer pointer = (BPointer) parent;
            List<BStructuredObject> list = parser.getStructure(pointer.getAddress());
            return list!=null ? list.size() : 0;
        }
        return 0;
    }
}
