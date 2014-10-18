import groovy.text.GStringTemplateEngine
import org.terasology.blender.api.BlenderParser

def file = "killerbunny103_export.blend"
//def file = "Skeleton.blend"
//def file = "blackpawn.blend"
//def file = "redpawn.blend"
def parser = new BlenderParser(new FileInputStream("src/test/resources/$file"))

parser.load()
def mesh = parser.getMesh()
def skeleton = mesh.skeleton

//def meshes = parser.findByType("Mesh")
//println "Meshes ${meshes.collect { it.id.name.get() }}"
//meshes.each { m ->
//    println "$m.id.name $m.totloop $m.totvert $m.totpoly $m.totface $m.totedge"
//}
GStringTemplateEngine engine = new GStringTemplateEngine()
def f = { float v->
    String.format(Locale.ENGLISH, "%.6f", v)
}
def template = engine.createTemplate("""MD5Version 10
commandline "Exported from blenderloader"

numJoints <%= bones.size() %>
numMeshes 1

joints {
<% bones.each { bone ->
    def parentId = bone.parent==null ? -1 : bone.parent.id
    def qx = bone.quatX
    def qy = bone.quatY
    def qz = bone.quatZ
    if( bone.quatW>0 ) {
      qx = -qx
      qy = -qy
      qz = -qz
    }
%>    "<%= bone.name %>" <%= parentId %> ( <%= f.call(bone.locX) %> <%= f.call(bone.locY) %> <%= f.call(bone.locZ) %> ) ( <%= f.call(qx) %> <%= f.call(qy) %> <%= f.call(qz) %> )
<% } %>}

mesh {
    shader "texture.png"
    numverts <%= mesh.vertices.size %>
<% mesh.vertices.eachWithIndex { vert, i ->
%>    vert <%= i %> ( <%= vert.u %> <%= vert.v %> ) <%= vert.start %> <%= vert.size %>
<% } %>

    numtris <%= mesh.tris.size %>
<% mesh.tris.eachWithIndex { tri,i ->
%>    tri <%= i %> <%= tri.v1 %> <%= tri.v2 %> <%= tri.v3 %>
<% } %>

    numweights <%= mesh.weights.size %>
<% mesh.weights.eachWithIndex { weight, i ->
%>    weight <%= i %> <%= weight.bone.id %> <%= weight.bias %> ( <%= weight.x %> <%= weight.y %> <%= weight.z %> )
<% } %>
}
""")
def md5mesh = template.make(["mesh": mesh, "bones": skeleton.bones, "f":f])
def writer = new FileWriter("test.md5mesh")
writer.write(md5mesh)
writer.close()

