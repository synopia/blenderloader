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

        @Override
        String toString() {
            "$locX $locY $locZ ($quatX $quatY $quatZ $quatW)"
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

            Matrix4f armMat =  new Matrix4f(b.bone.arm_mat.get().toArray(new float[16]));

            Matrix4f finalMat = new Matrix4f(armMat)
            finalMat.mul(mat)

            Quat4f quat = new Quat4f()

            quat.set(finalMat)
            quat.normalize()

            println( name)
            println( b.quat.get())
            println( quat)

            def bone = new Bone()
            bone.group = boneToGroup[name]
            bone.id = i
            bone.name = name
            bone.locX = finalMat.getElement(3,0)
            bone.locY = finalMat.getElement(3,1)
            bone.locZ = finalMat.getElement(3,2)
            bone.quatX = quat.x
            bone.quatY = quat.y
            bone.quatZ = quat.z
            bone.quatW = quat.w

            bone.matrix = finalMat;

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

    private Quat4f extractQuat(Matrix4f m) {
        float s = Math.sqrt(Math.abs(m.m00 + m.m11 + m.m22 + m.m33))
        if( s<0.00001f ) {
            def x = Math.abs(m.m21-m.m12)
            def y = Math.abs(m.m02-m.m20)
            def z = Math.abs(m.m10-m.m01)
            if( x>=y && x>=z ) {
                return new Quat4f(1,0,0,0)
            } else if( y>=x && y>=z ) {
                return new Quat4f(0,1,0,0)
            } else {
                return new Quat4f(0,0,1,0)
            }
        } else {
            def q = new Quat4f(
                    (float) -(m.m21-m.m12)/(2*s),
                    (float) -(m.m02-m.m20)/(2*s),
                    (float) -(m.m10-m.m01)/(2*s),
                    (float) 0.5*s
            )
            q.normalize()
            return q
        }
    }
}
