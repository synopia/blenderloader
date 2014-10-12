package org.terasology.blender.mesh

import org.terasology.blender.api.BObject

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
        println objectMatrix
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

    private void loadWeights() {
        int max = mesh.totvert.get()
        mesh.mvert.get().eachWithIndex { vert, i ->
            if (i < max) {
                def weight = new Weight()
                weight.bias = 1
                weight.x = vert.co[0].get() - objectMatrix.get(12)
                weight.y = vert.co[1].get() - objectMatrix.get(13)
                weight.z = vert.co[2].get() - objectMatrix.get(14)
                weight.bone = skeleton.getBone(mesh.dvert[i].dw.def_nr.get())

                weights << weight
            }
        }
    }
}
