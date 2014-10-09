package org.terasology.blender;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Set;
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
        List<String> boneNames = root.resolve("Bone").resolve("name").asList(String.class);
        List<BObject> bones = root.resolve("Bone").resolve("prop").asList(BObject.class);

        BObject mPoly = root.resolve("MPoly");
        List<Integer> loopStart = mPoly.resolve("loopstart").asList(Integer.class);
        List<Integer> totalLoops = mPoly.resolve("totloop").asList(Integer.class);
        List<Integer> loopsVertex = root.resolve("MLoop").resolve("v").asList(Integer.class);
        List<List<Float>> uv = root.resolve("MLoopUV").resolve("uv").as(List.class);
        List<List<Float>> co = root.resolve("MVert").resolve("co").as(List.class);
        List<List<Float>> no = root.resolve("MVert").resolve("no").as(List.class);
        List<Integer> dg = root.resolve("MDeformWeight").resolve("def_nr").asList(Integer.class);
        List<String> groups = root.resolve("bDeformGroup").resolve("name").asList(String.class);

        StringBuilder sb = new StringBuilder();
        sb.append("MD5Version 10\n" +
                "commandline \"Exported from blenderloader\"\n" +
                "\n");
        sb.append("numJoints ").append(1).append("\n");
        sb.append("numMeshes 1\n\n");
        sb.append("joints {\n");
//        for (Bone bone : bones) {
//
//            sb.append("\t\"").append(bone.getName()).append("\" ").append(bone.getParentIndex()).append(" ( ");
//            sb.append(bone.getObjectPosition().x).append(" ");
//            sb.append(bone.getObjectPosition().y).append(" ");
//            sb.append(bone.getObjectPosition().z).append(" ) ( ");
//            Quat4f rot = new Quat4f(bone.getObjectRotation());
//            rot.normalize();
//            if (rot.w > 0) {
//                rot.x = -rot.x;
//                rot.y = -rot.y;
//                rot.z = -rot.z;
//            }
//            sb.append(rot.x).append(" ");
//            sb.append(rot.y).append(" ");
//            sb.append(rot.z).append(" )\n");
//        }
        sb.append("\t\"root\"\t-1 ( 0.000000 0.184340 0.000000 ) ( -0.001601 -0.000000 -0.000000 )\n");
        sb.append("}\n\n");

        sb.append("mesh {\n");
        sb.append("\tshader \"texture.png\"\n");
        sb.append("\tnumverts ").append(co.size()).append("\n");
        for (int i = 0; i < co.size(); i++) {
            sb.append("\tvert ").append(i).append(" ( ").append(f(uv.get(i).get(0))).append(" ").append(f(uv.get(i).get(1))).append(" ) ");
            sb.append(i).append(" ").append(1).append("\n");
        }
        sb.append("\n");
        sb.append("\tnumtris ").append(loopStart.size()).append("\n");
        for (int i = 0; i < loopStart.size(); i++) {
            int l1 = loopStart.get(i);
            int l2 = l1+1;
            int l3 = l1+2;

            int ve1 = loopsVertex.get(l1);
            int ve2 = loopsVertex.get(l2);
            int ve3 = loopsVertex.get(l3);

            int i1 = ve1;
            int i2 = ve2;
            int i3 = ve3;
            sb.append("\ttri ").append(i).append(" ").append(i1).append(" ").append(i2).append(" ").append(i3).append("\n");
        }
        sb.append("\n");
        sb.append("\tnumweights ").append(co.size()).append("\n");
        for (int i = 0; i < co.size(); i++) {
            sb.append("\tweight ").append(i).append(" ").append(0).append(" ");
            sb.append(1).append(" ( ");
            sb.append(f(co.get(i).get(0))).append(" ").append(f(co.get(i).get(1))).append(" ").append(f(co.get(i).get(2))).append(" )\n");
        }
        sb.append("}\n");
        System.out.println(sb.toString());
        FileWriter writer = new FileWriter("test.md5mesh");
        writer.write(sb.toString());
        writer.close();
    }

    private static String f(float number) {
        return String.format("%.6f", number);
    }
}
