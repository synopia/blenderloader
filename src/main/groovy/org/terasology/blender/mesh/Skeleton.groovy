package org.terasology.blender.mesh

import org.terasology.blender.api.BObject
import org.terasology.blender.api.BlenderParser

import javax.vecmath.Matrix3f
import javax.vecmath.Matrix4f
import javax.vecmath.Quat4f

/**
 * Created by synopia on 12/10/14.
 */
class Skeleton {
    static class Bone {
        int id
        Integer group
        String name
        Bone parent

        float locX
        float locY
        float locZ
        float quatX
        float quatY
        float quatZ
        float quatW

        Matrix4f matrix;
        Matrix4f getLocalMatrix() {
            Matrix4f mat = new Matrix4f()
            mat.setIdentity();
            if( parent!=null ) {
                mat = parent.getLocalMatrix();
            }
            mat.mul(mat, matrix)

            return mat;
        }
        Matrix4f getInvMatrix() {
            def matrix = getLocalMatrix()
            matrix.invert()
            return matrix
        }
    }
    List<Bone> bones = []
    BlenderParser parser

    Skeleton(BObject armature, BlenderParser parser) {
        List<Float> worldMatrix = armature.obmat.get()
        Matrix4f mat = new Matrix4f(worldMatrix.toArray(new float[16]))
        this.parser = parser

        def groups = parser.findByType("bDeformGroup")
        def bones = parser.findByType("bPoseChannel")
        Map<String, Integer> boneToGroup = [:]
        groups.eachWithIndex { g, i ->
            String name = g.name.get()
            boneToGroup[name] = i
        }
        bones.eachWithIndex { b, i ->
            String name = b.name.get()

            Matrix4f matrix = new Matrix4f(b.bone.arm_mat.get().toArray(new float[16]));
//            matrix.mul(mat, matrix)
            Quat4f quat = new Quat4f();
            quat.set(matrix)
            quat.normalize()
            println quat

            def bone = new Bone()
            bone.group = boneToGroup[name]
            bone.id = i
            bone.name = name
            bone.locX = matrix.getElement(3,0) - worldMatrix.get(12)
            bone.locY = matrix.getElement(3,1) - worldMatrix.get(13)
            bone.locZ = matrix.getElement(3,2) - worldMatrix.get(14)
            bone.quatW = quat.w
            bone.quatX = quat.x
            bone.quatY = quat.y
            bone.quatZ = quat.z
            bone.matrix = matrix;

            this.bones << bone
        }
        bones.eachWithIndex { b, i ->
            def parent = b.parent
            if (!parent.isNull()) {
                this.bones[i].parent = getBone(parent.name.get())
            }
        }
    }

    Bone getBone(int group) {
        bones.find { bone ->
            bone.group == group
        }
    }

    Bone getBone(String name) {
        bones.find { bone ->
            bone.name == name
        }
    }
}
