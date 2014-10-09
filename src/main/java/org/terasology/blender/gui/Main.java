package org.terasology.blender.gui;

import org.terasology.blender.BObject;
import org.terasology.blender.Parser;
import org.terasology.blender.RAFDataInput;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * @author synopia
 */
public class Main {

    public void start() throws URISyntaxException, IOException {
        File file = new File(this.getClass().getResource("/killerbunny103_export.blend").toURI());
        RAFDataInput dis = new RAFDataInput(new RandomAccessFile(file, "r"));
        Parser parser = new Parser(dis);
        BObject root = parser.load();

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTreeTable table = new JTreeTable(new BlenderTreeModel(parser, root));
        frame.add(new JScrollPane(table));

        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public static void main(String[] args) throws InvocationTargetException, InterruptedException {
        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                try {
                    new Main().start();
                } catch (URISyntaxException | IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
