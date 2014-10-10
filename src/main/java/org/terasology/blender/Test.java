package org.terasology.blender;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/**
 * @author synopia
 */
public class Test {

    public static void main(String[] args) throws IOException, URISyntaxException {
        File file = new File(Test.class.getResource("/blackpawn.blend").toURI());
/*
        File file = new File(Test.class.getResource("/Skeleton.blend").toURI());
        GZIPInputStream zipStream = new GZIPInputStream(new FileInputStream(file));
        FileOutputStream outputStream = new FileOutputStream("file.blend");
        byte[] buf = new byte[4096];
        while (zipStream.available()>0) {
            int bytes = zipStream.read(buf);
            if( bytes>0 ) {
                outputStream.write(buf, 0, bytes);
            }
        }
        outputStream.close();
        zipStream.close();
*/
        RAFDataInput dis = new RAFDataInput(new RandomAccessFile(file, "r"));
        Parser parser = new Parser(dis);
        BObject root = parser.load();

        BObject mesh = root.resolve("Mesh");
        List<BObject> polys = mesh.resolve("mpoly").asList(BObject.class);
        List<BObject> loops = mesh.resolve("mloop").asList(BObject.class);
        List<BObject> uvLoops = mesh.resolve("mloopuv").asList(BObject.class);
        List<BObject> verts = mesh.resolve("mvert").asList(BObject.class);
        List<BObject> dverts = mesh.resolve("dvert").asList(BObject.class);
        List<BObject> defGroups = root.resolve("bDeformGroup").asList(BObject.class);
        List<BObject> bones = root.resolve("bPoseChannel").asList(BObject.class);

        Map<String, BObject> boneMap = Maps.newHashMap();
        Map<String, BObject> defgMap = Maps.newHashMap();
        List<String> groups = Lists.newArrayList();
//        groups.add("root");
        for (BObject object : defGroups) {
            String name = object.resolve("name").as(String.class);
            groups.add(name);
            defgMap.put(name, object);
        }
        for (BObject bone : bones) {
            String name = bone.resolve("name").as(String.class);
            boneMap.put(name, bone);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("MD5Version 10\n" +
                "commandline \"Exported from blenderloader\"\n" +
                "\n");
        sb.append("numJoints ").append(defGroups.size() + 1).append("\n");
        sb.append("numMeshes 1\n\n");
        sb.append("joints {\n");
        for (int i = 0; i < groups.size(); i++) {
            String name = groups.get(i);

            BObject group = defgMap.get(name);
            BObject bone = boneMap.get(name);
            int parentId = -1;
            if( bone!=null ) {
                BStructuredObject parent = bone.resolve("parent").as(BStructuredObject.class);
                if (parent != null) {
                    parentId = groups.indexOf(parent.resolve("name").as(String.class));
                }
            }
            sb.append("\t\"").append(name).append("\" ").append(parentId).append(" ( ");

            List<Float> quat = bone.resolve("quat").asList(Float.class);
            List<Float> location = bone.resolve("loc").asList(Float.class);
            sb.append(location.get(0)).append(" ");
            sb.append(location.get(1)).append(" ");
            sb.append(location.get(2)).append(" ) ( ");

            sb.append(quat.get(3)).append(" ");
            sb.append(quat.get(2)).append(" ");
            sb.append(quat.get(1)).append(" )\n");
        }
        sb.append("}\n\n");

        sb.append("mesh {\n");
        sb.append("\tshader \"texture.png\"\n");
        sb.append("\tnumverts ").append(loops.size()).append("\n");
        for (int i = 0; i < loops.size(); i++) {
            List<Float> uv = uvLoops.get(i).resolve("uv").asList(Float.class);
            Integer vertex = loops.get(i).resolve("v").as(Integer.class);
            sb.append("\tvert ").append(i).append(" ( ").append(f(uv.get(0))).append(" ").append(f(uv.get(1))).append(" ) ");
            sb.append(vertex).append(" ").append(1).append("\n");
        }
        sb.append("\n");
        sb.append("\tnumtris ").append(polys.size()).append("\n");
        for (int i = 0; i < polys.size(); i++) {
            BObject poly = polys.get(i);
            int id = poly.resolve("loopstart").as(Integer.class);

            int v1 = id;
            int v2 = id + 2;
            int v3 = id + 1;

            sb.append("\ttri ").append(i).append(" ").append(v1).append(" ").append(v2).append(" ").append(v3).append("\n");
        }
        sb.append("\n");
        sb.append("\tnumweights ").append(verts.size()).append("\n");
        for (int i = 0; i < verts.size(); i++) {
            List<Float> vertex = verts.get(i).resolve("co").asList(Float.class);
            int bone = dverts.get(i).resolve("dw").resolve("def_nr").as(Integer.class) + 1;
            sb.append("\tweight ").append(i).append(" ").append(bone).append(" ");
            sb.append(1).append(" ( ");
            sb.append(f(vertex.get(0))).append(" ").append(f(vertex.get(1))).append(" ").append(f(vertex.get(2))).append(" )\n");
        }
        sb.append("}\n");
        System.out.println(sb.toString());
        FileWriter writer = new FileWriter("test.md5mesh");
        writer.write(sb.toString());
        writer.close();
    }

    private static String f(float number) {
        return String.format(Locale.ENGLISH,"%.6f", number);
    }
}
