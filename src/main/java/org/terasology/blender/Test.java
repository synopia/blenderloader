package org.terasology.blender;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URISyntaxException;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author synopia
 */
public class Test {

    public static void main(String[] args) throws IOException, URISyntaxException {
        File file = new File(Test.class.getResource("/killerbunny103_export.blend").toURI());
        RAFDataInput dis = new RAFDataInput(new RandomAccessFile(file, "r"));
        Parser parser = new Parser(dis);
        BObject root = parser.load();
        System.out.println(parser.getStructure("Bone"));
        List<String> boneNames = root.resolve("Bone").resolve("name").asList(String.class);
        List<BObject> bones = root.resolve("Bone").resolve("prop").asList(BObject.class);

        System.out.println(parser.getStructure(-1412465148L));
        BObject mPoly = root.resolve("MPoly");
        List<Integer> loopStart = mPoly.resolve("loopstart").asList(Integer.class);
        List<Integer> totalLoops = mPoly.resolve("totloop").asList(Integer.class);
        List<Integer> material = mPoly.resolve("mat_nr").asList(Integer.class);
        List<List<Float>> uv = root.resolve("MLoopUV").resolve("uv").as(List.class);
        List<List<Float>> co = root.resolve("MVert").resolve("co").as(List.class);
        List<List<Float>> no = root.resolve("MVert").resolve("co").as(List.class);

        for (int i = 0; i < co.size(); i++) {
            System.out.println("vert "+i+" ("+uv.get(i).get(0)+" "+uv.get(i).get(1)+") "+i+" 1");
        }
        for (int i = 0; i < loopStart.size(); i++) {
            int loop = loopStart.get(i);
            if( totalLoops.get(i)!=3) {
                throw new IllegalStateException("Only triangles are supported!");
            }
            System.out.println("tri "+i+" "+loop+" "+(loop+1)+" "+(loop+2));
        }
        for (int i = 0; i < co.size(); i++) {
            System.out.println("weight "+i+" 0 1 (" +co.get(i).get(0)+" "+co.get(i).get(1)+" "+co.get(i).get(2)+") ");
        }
    }

}
