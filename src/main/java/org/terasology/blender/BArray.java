package org.terasology.blender;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.StringTokenizer;

/**
 * @author synopia
 */
public class BArray extends BObject {
    private final List<BObject> list = Lists.newArrayList();

    public BArray() {
        super(Type.BASE);
    }

    public BArray(Type type) {
        super(type);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public <T> List<T> asList(Class<T> type) {
        List<T> result = Lists.newArrayList();
        for (BObject object : list) {
            result.add(object.as(type));
        }
        return result;
    }

    @Override
    public <T> T as(Class<T> type) {
        List<T> ts = asList(type);
        return (T) ts;
    }

    public void add( BObject object ) {
        list.add(object);
    }
    public BObject get(int index) {
        if( index>=0 && index<size() ) {
            return list.get(index);
        }
        return null;
    }
    public BObject first() {
        return get(0);
    }

    public boolean isString() {
        return getType().getName().equals("char");
    }

    @Override
    public BObject resolve(String name) {
        BArray result = new BArray();
        for (BObject object : list) {
            BObject element = object.resolve(name);
            if( element!=null ) {
                result.add(element);
            }
        }
        if( result.size()==0 ) {
            return null;
        } else if( result.size()==1 ) {
            return result.first();
        }
        return result;
    }

    @Override
    public String toString() {
        if( isString() ) {
            StringBuilder sb = new StringBuilder();
            for (BObject object : list) {
                if( object.as(Character.class)==0 ) {
                    break;
                }
                sb.append( object.as(Character.class));
            }
            return sb.toString();
        } else {
            return super.toString();
        }
    }
}
