blenderloader - simple api for .blend files
=======

This is an implementation of a API to Blender files using in Groovy.

Blender files are basically a memory dump of Blenders internal state. Besides the memory, they also store the structure
of their data (similar to c header files). This is called Structure DNA (SDNA).

Read more: http://www.atmind.nl/blender/mystery_ot_blend.html

With the given structure dna, its possible to access every single bit inside a blend file:

    def parser = new BlenderParser(new FileInputStream(file))
    parser.load()
    def mesh = parser.findByType("Mesh").first()
    println mesh.type.inspect()

Outputs:

    Mesh (id=48, len=1212) {
    	ID id
    	AnimData *adt
    	BoundBox *bb
    	Ipo *ipo
    	Key *key
    	Material **mat
    	MSelect *mselect
    	MPoly *mpoly
    	MTexPoly *mtpoly
    	MLoop *mloop
    	MLoopUV *mloopuv
    	MLoopCol *mloopcol
    	MFace *mface
    	MTFace *mtface
    	TFace *tface
    	MVert *mvert
    	MEdge *medge
    	MDeformVert *dvert
    	MCol *mcol
    	Mesh *texcomesh
    	BMEditMesh *edit_btmesh
    	CustomData vdata
    	CustomData edata
    	CustomData fdata
    	CustomData pdata
    	CustomData ldata
    	int totvert
    	int totedge
    	int totface
    	int totselect
    	int totpoly
    	int totloop
    	int act_face
    	float loc[3]
    	float size[3]
    	float rot[3]
    	int drawflag
    	short texflag
    	short flag
    	float smoothresh
    	int pad2
    	char cd_flag
    	char pad
    	char subdiv
    	char subdivr
    	char subsurftype
    	char editflag
    	short totcol
    	Multires *mr
    }

Now you can access each field straight forward:

    println mesh.totvert   // total number of vertices
    println mesh.loc       // location as an array of float
    println mesh.id.name   // name of the mesh, that is part of ID structure
    println mvert[0].co[0] // x coordinate of first vertex

