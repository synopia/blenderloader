package org.terasology.blender.mesh

import org.terasology.blender.api.BObject

import javax.vecmath.Matrix4f
import javax.vecmath.Quat4f
import javax.vecmath.Vector3f

/**
 * Created by synopia on 12/10/14.
 */
class Mesh {
    static class Weight {
        Skeleton.Bone bone
        float bias
        float x
        float y
        float z
    }

    static class Tri {
        int v1
        int v2
        int v3
    }

    static class Vertex {
        float u
        float v
        int start // weight start
        int size
    }
    List<Weight> weights = []
    List<Vertex> vertices = []
    List<Tri> tris = []
    Skeleton skeleton
    BObject mesh
    List<Float> objectMatrix

    Mesh(BObject object, Skeleton skeleton) {
        this.skeleton = skeleton
        mesh = object.data.get()[0]
        objectMatrix = object.obmat.get()
//        Matrix4f mat = new Matrix4f(objectMatrix.toArray(new float[16]))
        loadWeights()
        loadTris()
        loadVertices()
    }


    private void loadVertices() {
        int max = mesh.totloop.get()
        mesh.mloop.get().eachWithIndex { loop, i ->
            if (i < max) {
                def vert = new Vertex()
                vert.u = mesh.mloopuv[i].uv[0].get()
                vert.v = mesh.mloopuv[i].uv[1].get()
                vert.start = loop.v.get()
                vert.size = 1

                vertices.add(vert)
            }
        }
    }

    private void loadTris() {
        int max = mesh.totpoly.get()
        mesh.mpoly.get().eachWithIndex { poly, i ->
            if (i < max && poly.totloop.get() == 3) {
                def tri = new Tri()
                tri.v1 = poly.loopstart.get()
                tri.v2 = tri.v1 + 1
                tri.v3 = tri.v1 + 2
                tris.add(tri)
            }
        }
    }

    public static void mul(Quat4f q, Vector3f w) {
        float rx = q.w * w.x + q.y * w.z - q.z * w.y;
        float ry = q.w * w.y + q.z * w.x - q.x * w.z;
        float rz = q.w * w.z + q.x * w.y - q.y * w.x;
        float rw = -q.x * w.x - q.y * w.y - q.z * w.z;
        q.set(rx, ry, rz, rw);
    }

    private void loadWeights() {
        int max = mesh.totvert.get()
        mesh.mvert.get().eachWithIndex { vert, i ->
            if (i < max) {
                def weight = new Weight()
                weight.bias = 1
                weight.bone = skeleton.getBone(mesh.dvert[i].dw.def_nr.get())
                Vector3f v = new Vector3f(vert.co[0].get(), vert.co[1].get(), vert.co[2].get());

                Vector3f bonePos = new Vector3f(weight.bone.locX, weight.bone.locY, weight.bone.locZ )
                Quat4f rot = new Quat4f(weight.bone.quatX, weight.bone.quatY, weight.bone.quatZ, weight.bone.quatW);
                rot.inverse()

                v.sub(bonePos);
                Quat4f q = new Quat4f(rot)
                mul(q, v);
                rot.inverse();
                q.mul(rot)

                weight.x = q.x
                weight.y = q.y
                weight.z = q.z

                weights << weight
            }
        }
    }
}
