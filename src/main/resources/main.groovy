import groovy.text.GStringTemplateEngine
import org.terasology.blender.BlenderParser

//def file = "killerbunny103_export.blend"
def file = "Skeleton.blend"
def parser = new BlenderParser(new FileInputStream(file))

parser.load()

def meshes = parser.findByType("Mesh")
println "Meshes ${meshes.collect { it.id.name.get() }}"
def mesh = meshes.first()
def groups = parser.findByType("bDeformGroup")
def bones = parser.findByType("bPoseChannel")

Map<String, Integer> boneToGroup = [:]
Map<Integer, Integer> groupToBone = [:]
Map<String, Integer> boneMap = [:]
groups.eachWithIndex { g, i ->
    String name = g.name.get()
    boneToGroup[name] = i
}
bones.eachWithIndex { b, i ->
    String name = b.name.get()
    groupToBone[boneToGroup[name]] = i
    boneMap[name] = i
}

GStringTemplateEngine engine = new GStringTemplateEngine()
def template = engine.createTemplate("""
MD5Version 10
commandline "Exported from blenderloader"

numJoints ${bones.size()}
numMeshes 1

joints {
<% bones.each { bone ->
    def parent = bone.parent
    def parentId = parent.isNull() ? -1 : boneMap[parent.name.get()]
%>    "<%= bone.name %>" <%= parentId %> ( <%= bone.loc[0].getf() %> <%= bone.loc[1].getf() %> <%= bone.loc[2].getf() %> ) ( <%= bone.quat[3].getf() %> <%= bone.quat[2].getf() %> <%= bone.quat[1].getf() %> )
<% } %>}

mesh {
    shader "texture.png"
    numverts <%= mesh.mloop.size %>
<% mesh.mloop.get().eachWithIndex { loop,i ->
%>    vert <%= i %> ( <%= mesh.mloopuv[i].uv[0].getf() %> <%= mesh.mloopuv[i].uv[1].getf() %> ) <%= loop.v %> 1
<% } %>

    numtris <%= mesh.mpoly.size %>
<% mesh.mpoly.get().eachWithIndex { poly,i ->
%>    tri <%= i %> <%= poly.loopstart %> <%= poly.loopstart.get()+2 %> <%= poly.loopstart.get()+1 %>
<% } %>

    numweights <%= mesh.mvert.size %>
<% mesh.mvert.get().eachWithIndex { vert, i ->
%>    weight <%= i %> <%= groupToBone[mesh.dvert[i].dw.def_nr.get()] %> 1 ( <%= vert.co[0].getf() %> <%= vert.co[1].getf() %> <%= vert.co[2].getf() %> )
<% } %>
}
""")
def md5mesh = template.make(["bones": bones, "boneMap": boneMap, "groupToBone": groupToBone, "mesh": mesh])
def writer = new FileWriter("../../../test.md5mesh")
writer.write(md5mesh)
writer.close()

