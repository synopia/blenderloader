package org.terasology.blender;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URISyntaxException;

/**
 * @author synopia
 */
public class Test {

    public static void main(String[] args) throws IOException, URISyntaxException {
        File file = new File(Test.class.getResource("/killerbunny103_export.blend").toURI());
        RAFDataInput dis = new RAFDataInput(new RandomAccessFile(file, "r"));
        Parser parser = new Parser(dis);
        BObject root = parser.load();
        System.out.println(root);
    }

}
