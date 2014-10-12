package org.terasology.blender.mesh

import org.terasology.blender.api.BObject
import org.terasology.blender.api.BlenderParser

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
    }
    List<Bone> bones = []
    BlenderParser parser

    Skeleton(BObject armature, BlenderParser parser) {
        List<Float> worldMatrix = armature.obmat.get()
        println worldMatrix
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

            def bone = new Bone()
            bone.group = boneToGroup[name]
            bone.id = i
            bone.name = name
            bone.locX = b.pose_mat[12].get() - worldMatrix.get(12)
            bone.locY = b.pose_mat[13].get() - worldMatrix.get(13)
            bone.locZ = b.pose_mat[14].get() - worldMatrix.get(14)
            bone.quatW = b.quat[0].get()
            bone.quatX = b.quat[1].get()
            bone.quatY = b.quat[2].get()
            bone.quatZ = b.quat[3].get()

//            println b.pose_tail.get()
//            println b.pose_head.get()
//            println b.pose_mat.get()
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
