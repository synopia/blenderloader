http://www.atmind.nl/blender/mystery_ot_blend.html



        Link {
        	Link *next; // size=4
        	Link *prev; // size=4
        }

        LinkData {
        	LinkData *next; // size=4
        	LinkData *prev; // size=4
        	void *data; // size=4
        }

        ListBase {
        	void *first; // size=4
        	void *last; // size=4
        }

        vec2s {
        	short x; // size=2
        	short y; // size=2
        }

        vec2f {
        	float x; // size=4
        	float y; // size=4
        }

        vec3f {
        	float x; // size=4
        	float y; // size=4
        	float z; // size=4
        }

        rcti {
        	int xmin; // size=4
        	int xmax; // size=4
        	int ymin; // size=4
        	int ymax; // size=4
        }

        rctf {
        	float xmin; // size=4
        	float xmax; // size=4
        	float ymin; // size=4
        	float ymax; // size=4
        }

        IDPropertyData {
        	void *pointer; // size=4
        	ListBase group; // size=0
        	int val; // size=4
        	int val2; // size=4
        }

        IDProperty {
        	IDProperty *next; // size=4
        	IDProperty *prev; // size=4
        	char type; // size=1
        	char subtype; // size=1
        	short flag; // size=2
        	char name[64]; // size=64
        	int saved; // size=4
        	IDPropertyData data; // size=0
        	int len; // size=4
        	int totallen; // size=4
        }

        ID {
        	void *next; // size=4
        	void *prev; // size=4
        	ID *newid; // size=4
        	Library *lib; // size=4
        	char name[66]; // size=66
        	short flag; // size=2
        	int us; // size=4
        	int icon_id; // size=4
        	int pad2; // size=4
        	IDProperty *properties; // size=4
        }

        Library {
        	ID id; // size=0
        	ID *idblock; // size=4
        	FileData *filedata; // size=4
        	char name[1024]; // size=1024
        	char filepath[1024]; // size=1024
        	Library *parent; // size=4
        	PackedFile *packedfile; // size=4
        }

        PreviewImage {
        	int w[2]; // size=8
        	int h[2]; // size=8
        	short changed[2]; // size=4
        	short changed_timestamp[2]; // size=4
        	int *rect[2]; // size=8
        	GPUTexture *gputexture[2]; // size=8
        }

        IpoDriver {
        	Object *ob; // size=4
        	short blocktype; // size=2
        	short adrcode; // size=2
        	short type; // size=2
        	short flag; // size=2
        	char name[128]; // size=128
        }

        IpoCurve {
        	IpoCurve *next; // size=4
        	IpoCurve *prev; // size=4
        	BPoint *bp; // size=4
        	BezTriple *bezt; // size=4
        	rctf maxrct; // size=0
        	rctf totrct; // size=0
        	short blocktype; // size=2
        	short adrcode; // size=2
        	short vartype; // size=2
        	short totvert; // size=2
        	short ipo; // size=2
        	short extrap; // size=2
        	short flag; // size=2
        	short rt; // size=2
        	float ymin; // size=4
        	float ymax; // size=4
        	int bitmask; // size=4
        	float slide_min; // size=4
        	float slide_max; // size=4
        	float curval; // size=4
        	IpoDriver *driver; // size=4
        }

        Ipo {
        	ID id; // size=0
        	ListBase curve; // size=0
        	rctf cur; // size=0
        	short blocktype; // size=2
        	short showkey; // size=2
        	short muteipo; // size=2
        	short pad; // size=2
        }

        KeyBlock {
        	KeyBlock *next; // size=4
        	KeyBlock *prev; // size=4
        	float pos; // size=4
        	float curval; // size=4
        	short type; // size=2
        	short pad1; // size=2
        	short relative; // size=2
        	short flag; // size=2
        	int totelem; // size=4
        	int uid; // size=4
        	void *data; // size=4
        	char name[64]; // size=64
        	char vgroup[64]; // size=64
        	float slidermin; // size=4
        	float slidermax; // size=4
        }

        Key {
        	ID id; // size=0
        	AnimData *adt; // size=4
        	KeyBlock *refkey; // size=4
        	char elemstr[32]; // size=32
        	int elemsize; // size=4
        	int pad; // size=4
        	ListBase block; // size=0
        	Ipo *ipo; // size=4
        	ID *from; // size=4
        	short type; // size=2
        	short totkey; // size=2
        	short slurph; // size=2
        	short flag; // size=2
        	float ctime; // size=4
        	int uidgen; // size=4
        }

        TextLine {
        	TextLine *next; // size=4
        	TextLine *prev; // size=4
        	char *line; // size=4
        	char *format; // size=4
        	int len; // size=4
        	int blen; // size=4
        }

        Text {
        	ID id; // size=0
        	char *name; // size=4
        	int flags; // size=4
        	int nlines; // size=4
        	ListBase lines; // size=0
        	TextLine *curl; // size=4
        	TextLine *sell; // size=4
        	int curc; // size=4
        	int selc; // size=4
        	char *undo_buf; // size=4
        	int undo_pos; // size=4
        	int undo_len; // size=4
        	void *compiled; // size=4
        	double mtime; // size=8
        }

        PackedFile {
        	int size; // size=4
        	int seek; // size=4
        	void *data; // size=4
        }

        Camera {
        	ID id; // size=0
        	AnimData *adt; // size=4
        	char type; // size=1
        	char dtx; // size=1
        	short flag; // size=2
        	float passepartalpha; // size=4
        	float clipsta; // size=4
        	float clipend; // size=4
        	float lens; // size=4
        	float ortho_scale; // size=4
        	float drawsize; // size=4
        	float sensor_x; // size=4
        	float sensor_y; // size=4
        	float shiftx; // size=4
        	float shifty; // size=4
        	float YF_dofdist; // size=4
        	Ipo *ipo; // size=4
        	Object *dof_ob; // size=4
        	char sensor_fit; // size=1
        	char pad[7]; // size=7
        }

        ImageUser {
        	Scene *scene; // size=4
        	int framenr; // size=4
        	int frames; // size=4
        	int offset; // size=4
        	int sfra; // size=4
        	char fie_ima; // size=1
        	char cycl; // size=1
        	char ok; // size=1
        	char pad; // size=1
        	short multi_index; // size=2
        	short layer; // size=2
        	short pass; // size=2
        	short flag; // size=2
        	int pad2; // size=4
        }

        Image {
        	ID id; // size=0
        	char name[1024]; // size=1024
        	MovieCache *cache; // size=4
        	GPUTexture *gputexture; // size=4
        	anim *anim; // size=4
        	RenderResult *rr; // size=4
        	RenderResult *renders[8]; // size=32
        	short render_slot; // size=2
        	short last_render_slot; // size=2
        	short ok; // size=2
        	short flag; // size=2
        	short source; // size=2
        	short type; // size=2
        	int lastframe; // size=4
        	short tpageflag; // size=2
        	short totbind; // size=2
        	short xrep; // size=2
        	short yrep; // size=2
        	short twsta; // size=2
        	short twend; // size=2
        	int bindcode; // size=4
        	int *repbind; // size=4
        	PackedFile *packedfile; // size=4
        	PreviewImage *preview; // size=4
        	float lastupdate; // size=4
        	int lastused; // size=4
        	short animspeed; // size=2
        	short pad2; // size=2
        	int gen_x; // size=4
        	int gen_y; // size=4
        	char gen_type; // size=1
        	char gen_flag; // size=1
        	short gen_depth; // size=2
        	float aspx; // size=4
        	float aspy; // size=4
        	ColorManagedColorspaceSettings colorspace_settings; // size=0
        	char alpha_mode; // size=1
        	char pad[7]; // size=7
        }

        MTex {
        	short texco; // size=2
        	short mapto; // size=2
        	short maptoneg; // size=2
        	short blendtype; // size=2
        	Object *object; // size=4
        	Tex *tex; // size=4
        	char uvname[64]; // size=64
        	char projx; // size=1
        	char projy; // size=1
        	char projz; // size=1
        	char mapping; // size=1
        	float ofs[3]; // size=12
        	float size[3]; // size=12
        	float rot; // size=4
        	short texflag; // size=2
        	short colormodel; // size=2
        	short pmapto; // size=2
        	short pmaptoneg; // size=2
        	short normapspace; // size=2
        	short which_output; // size=2
        	char brush_map_mode; // size=1
        	char pad[7]; // size=7
        	float r; // size=4
        	float g; // size=4
        	float b; // size=4
        	float k; // size=4
        	float def_var; // size=4
        	float rt; // size=4
        	float colfac; // size=4
        	float varfac; // size=4
        	float norfac; // size=4
        	float dispfac; // size=4
        	float warpfac; // size=4
        	float colspecfac; // size=4
        	float mirrfac; // size=4
        	float alphafac; // size=4
        	float difffac; // size=4
        	float specfac; // size=4
        	float emitfac; // size=4
        	float hardfac; // size=4
        	float raymirrfac; // size=4
        	float translfac; // size=4
        	float ambfac; // size=4
        	float colemitfac; // size=4
        	float colreflfac; // size=4
        	float coltransfac; // size=4
        	float densfac; // size=4
        	float scatterfac; // size=4
        	float reflfac; // size=4
        	float timefac; // size=4
        	float lengthfac; // size=4
        	float clumpfac; // size=4
        	float dampfac; // size=4
        	float kinkfac; // size=4
        	float roughfac; // size=4
        	float padensfac; // size=4
        	float gravityfac; // size=4
        	float lifefac; // size=4
        	float sizefac; // size=4
        	float ivelfac; // size=4
        	float fieldfac; // size=4
        	float shadowfac; // size=4
        	float zenupfac; // size=4
        	float zendownfac; // size=4
        	float blendfac; // size=4
        }

        CBData {
        	float r; // size=4
        	float g; // size=4
        	float b; // size=4
        	float a; // size=4
        	float pos; // size=4
        	int cur; // size=4
        }

        ColorBand {
        	short flag; // size=2
        	short tot; // size=2
        	short cur; // size=2
        	short ipotype; // size=2
        	CBData data[32]; // size=0
        }

        EnvMap {
        	Object *object; // size=4
        	Image *ima; // size=4
        	ImBuf *cube[6]; // size=24
        	float imat[4][4]; // size=64
        	float obimat[3][3]; // size=36
        	short type; // size=2
        	short stype; // size=2
        	float clipsta; // size=4
        	float clipend; // size=4
        	float viewscale; // size=4
        	int notlay; // size=4
        	short cuberes; // size=2
        	short depth; // size=2
        	int ok; // size=4
        	int lastframe; // size=4
        	short recalc; // size=2
        	short lastsize; // size=2
        }

        PointDensity {
        	short flag; // size=2
        	short falloff_type; // size=2
        	float falloff_softness; // size=4
        	float radius; // size=4
        	short source; // size=2
        	short color_source; // size=2
        	int totpoints; // size=4
        	int pdpad; // size=4
        	Object *object; // size=4
        	int psys; // size=4
        	short psys_cache_space; // size=2
        	short ob_cache_space; // size=2
        	void *point_tree; // size=4
        	float *point_data; // size=4
        	float noise_size; // size=4
        	short noise_depth; // size=2
        	short noise_influence; // size=2
        	short noise_basis; // size=2
        	short pdpad3[3]; // size=6
        	float noise_fac; // size=4
        	float speed_scale; // size=4
        	float falloff_speed_scale; // size=4
        	float pdpad2; // size=4
        	ColorBand *coba; // size=4
        	CurveMapping *falloff_curve; // size=4
        }

        VoxelData {
        	int resol[3]; // size=12
        	int interp_type; // size=4
        	short file_format; // size=2
        	short flag; // size=2
        	short extend; // size=2
        	short smoked_type; // size=2
        	short data_type; // size=2
        	short pad; // size=2
        	int _pad; // size=4
        	Object *object; // size=4
        	float int_multiplier; // size=4
        	int still_frame; // size=4
        	char source_path[1024]; // size=1024
        	float *dataset; // size=4
        	int cachedframe; // size=4
        	int ok; // size=4
        }

        OceanTex {
        	Object *object; // size=4
        	char oceanmod[64]; // size=64
        	int output; // size=4
        	int pad; // size=4
        }

        Tex {
        	ID id; // size=0
        	AnimData *adt; // size=4
        	float noisesize; // size=4
        	float turbul; // size=4
        	float bright; // size=4
        	float contrast; // size=4
        	float saturation; // size=4
        	float rfac; // size=4
        	float gfac; // size=4
        	float bfac; // size=4
        	float filtersize; // size=4
        	float pad2; // size=4
        	float mg_H; // size=4
        	float mg_lacunarity; // size=4
        	float mg_octaves; // size=4
        	float mg_offset; // size=4
        	float mg_gain; // size=4
        	float dist_amount; // size=4
        	float ns_outscale; // size=4
        	float vn_w1; // size=4
        	float vn_w2; // size=4
        	float vn_w3; // size=4
        	float vn_w4; // size=4
        	float vn_mexp; // size=4
        	short vn_distm; // size=2
        	short vn_coltype; // size=2
        	short noisedepth; // size=2
        	short noisetype; // size=2
        	short noisebasis; // size=2
        	short noisebasis2; // size=2
        	short imaflag; // size=2
        	short flag; // size=2
        	short type; // size=2
        	short stype; // size=2
        	float cropxmin; // size=4
        	float cropymin; // size=4
        	float cropxmax; // size=4
        	float cropymax; // size=4
        	int texfilter; // size=4
        	int afmax; // size=4
        	short xrepeat; // size=2
        	short yrepeat; // size=2
        	short extend; // size=2
        	short fie_ima; // size=2
        	int len; // size=4
        	int frames; // size=4
        	int offset; // size=4
        	int sfra; // size=4
        	float checkerdist; // size=4
        	float nabla; // size=4
        	float pad1; // size=4
        	ImageUser iuser; // size=0
        	bNodeTree *nodetree; // size=4
        	Ipo *ipo; // size=4
        	Image *ima; // size=4
        	ColorBand *coba; // size=4
        	EnvMap *env; // size=4
        	PreviewImage *preview; // size=4
        	PointDensity *pd; // size=4
        	VoxelData *vd; // size=4
        	OceanTex *ot; // size=4
        	char use_nodes; // size=1
        	char pad[7]; // size=7
        }

        TexMapping {
        	float loc[3]; // size=12
        	float rot[3]; // size=12
        	float size[3]; // size=12
        	int flag; // size=4
        	char projx; // size=1
        	char projy; // size=1
        	char projz; // size=1
        	char mapping; // size=1
        	int type; // size=4
        	float mat[4][4]; // size=64
        	float min[3]; // size=12
        	float max[3]; // size=12
        	Object *ob; // size=4
        }

        ColorMapping {
        	ColorBand coba; // size=0
        	float bright; // size=4
        	float contrast; // size=4
        	float saturation; // size=4
        	int flag; // size=4
        	float blend_color[3]; // size=12
        	float blend_factor; // size=4
        	int blend_type; // size=4
        	int pad[3]; // size=12
        }

        Lamp {
        	ID id; // size=0
        	AnimData *adt; // size=4
        	short type; // size=2
        	short flag; // size=2
        	int mode; // size=4
        	short colormodel; // size=2
        	short totex; // size=2
        	float r; // size=4
        	float g; // size=4
        	float b; // size=4
        	float k; // size=4
        	float shdwr; // size=4
        	float shdwg; // size=4
        	float shdwb; // size=4
        	float shdwpad; // size=4
        	float energy; // size=4
        	float dist; // size=4
        	float spotsize; // size=4
        	float spotblend; // size=4
        	float haint; // size=4
        	float att1; // size=4
        	float att2; // size=4
        	CurveMapping *curfalloff; // size=4
        	short falloff_type; // size=2
        	short pad2; // size=2
        	float clipsta; // size=4
        	float clipend; // size=4
        	float bias; // size=4
        	float soft; // size=4
        	float compressthresh; // size=4
        	float bleedbias; // size=4
        	float pad5; // size=4
        	short bufsize; // size=2
        	short samp; // size=2
        	short buffers; // size=2
        	short filtertype; // size=2
        	char bufflag; // size=1
        	char buftype; // size=1
        	short ray_samp; // size=2
        	short ray_sampy; // size=2
        	short ray_sampz; // size=2
        	short ray_samp_type; // size=2
        	short area_shape; // size=2
        	float area_size; // size=4
        	float area_sizey; // size=4
        	float area_sizez; // size=4
        	float adapt_thresh; // size=4
        	short ray_samp_method; // size=2
        	short shadowmap_type; // size=2
        	short texact; // size=2
        	short shadhalostep; // size=2
        	short sun_effect_type; // size=2
        	short skyblendtype; // size=2
        	float horizon_brightness; // size=4
        	float spread; // size=4
        	float sun_brightness; // size=4
        	float sun_size; // size=4
        	float backscattered_light; // size=4
        	float sun_intensity; // size=4
        	float atm_turbidity; // size=4
        	float atm_inscattering_factor; // size=4
        	float atm_extinction_factor; // size=4
        	float atm_distance_factor; // size=4
        	float skyblendfac; // size=4
        	float sky_exposure; // size=4
        	float shadow_frustum_size; // size=4
        	short sky_colorspace; // size=2
        	char pad4[2]; // size=2
        	Ipo *ipo; // size=4
        	MTex *mtex[18]; // size=72
        	short pr_texture; // size=2
        	short use_nodes; // size=2
        	char pad6[4]; // size=4
        	PreviewImage *preview; // size=4
        	bNodeTree *nodetree; // size=4
        }

        VolumeSettings {
        	float density; // size=4
        	float emission; // size=4
        	float scattering; // size=4
        	float reflection; // size=4
        	float emission_col[3]; // size=12
        	float transmission_col[3]; // size=12
        	float reflection_col[3]; // size=12
        	float density_scale; // size=4
        	float depth_cutoff; // size=4
        	float asymmetry; // size=4
        	short stepsize_type; // size=2
        	short shadeflag; // size=2
        	short shade_type; // size=2
        	short precache_resolution; // size=2
        	float stepsize; // size=4
        	float ms_diff; // size=4
        	float ms_intensity; // size=4
        	float ms_spread; // size=4
        }

        GameSettings {
        	int flag; // size=4
        	int alpha_blend; // size=4
        	int face_orientation; // size=4
        	int pad1; // size=4
        }

        Material {
        	ID id; // size=0
        	AnimData *adt; // size=4
        	short material_type; // size=2
        	short flag; // size=2
        	float r; // size=4
        	float g; // size=4
        	float b; // size=4
        	float specr; // size=4
        	float specg; // size=4
        	float specb; // size=4
        	float mirr; // size=4
        	float mirg; // size=4
        	float mirb; // size=4
        	float ambr; // size=4
        	float ambb; // size=4
        	float ambg; // size=4
        	float amb; // size=4
        	float emit; // size=4
        	float ang; // size=4
        	float spectra; // size=4
        	float ray_mirror; // size=4
        	float alpha; // size=4
        	float ref; // size=4
        	float spec; // size=4
        	float zoffs; // size=4
        	float add; // size=4
        	float translucency; // size=4
        	VolumeSettings vol; // size=0
        	GameSettings game; // size=0
        	float fresnel_mir; // size=4
        	float fresnel_mir_i; // size=4
        	float fresnel_tra; // size=4
        	float fresnel_tra_i; // size=4
        	float filter; // size=4
        	float tx_limit; // size=4
        	float tx_falloff; // size=4
        	short ray_depth; // size=2
        	short ray_depth_tra; // size=2
        	short har; // size=2
        	char seed1; // size=1
        	char seed2; // size=1
        	float gloss_mir; // size=4
        	float gloss_tra; // size=4
        	short samp_gloss_mir; // size=2
        	short samp_gloss_tra; // size=2
        	float adapt_thresh_mir; // size=4
        	float adapt_thresh_tra; // size=4
        	float aniso_gloss_mir; // size=4
        	float dist_mir; // size=4
        	short fadeto_mir; // size=2
        	short shade_flag; // size=2
        	int mode; // size=4
        	int mode_l; // size=4
        	int mode2; // size=4
        	int mode2_l; // size=4
        	short flarec; // size=2
        	short starc; // size=2
        	short linec; // size=2
        	short ringc; // size=2
        	float hasize; // size=4
        	float flaresize; // size=4
        	float subsize; // size=4
        	float flareboost; // size=4
        	float strand_sta; // size=4
        	float strand_end; // size=4
        	float strand_ease; // size=4
        	float strand_surfnor; // size=4
        	float strand_min; // size=4
        	float strand_widthfade; // size=4
        	char strand_uvname[64]; // size=64
        	float sbias; // size=4
        	float lbias; // size=4
        	float shad_alpha; // size=4
        	int septex; // size=4
        	char rgbsel; // size=1
        	char texact; // size=1
        	char pr_type; // size=1
        	char use_nodes; // size=1
        	short pr_lamp; // size=2
        	short pr_texture; // size=2
        	short ml_flag; // size=2
        	char mapflag; // size=1
        	char pad; // size=1
        	short diff_shader; // size=2
        	short spec_shader; // size=2
        	float roughness; // size=4
        	float refrac; // size=4
        	float param[4]; // size=16
        	float rms; // size=4
        	float darkness; // size=4
        	short texco; // size=2
        	short mapto; // size=2
        	ColorBand *ramp_col; // size=4
        	ColorBand *ramp_spec; // size=4
        	char rampin_col; // size=1
        	char rampin_spec; // size=1
        	char rampblend_col; // size=1
        	char rampblend_spec; // size=1
        	short ramp_show; // size=2
        	short pad3; // size=2
        	float rampfac_col; // size=4
        	float rampfac_spec; // size=4
        	MTex *mtex[18]; // size=72
        	bNodeTree *nodetree; // size=4
        	Ipo *ipo; // size=4
        	Group *group; // size=4
        	PreviewImage *preview; // size=4
        	float friction; // size=4
        	float fh; // size=4
        	float reflect; // size=4
        	float fhdist; // size=4
        	float xyfrict; // size=4
        	short dynamode; // size=2
        	short pad2; // size=2
        	float sss_radius[3]; // size=12
        	float sss_col[3]; // size=12
        	float sss_error; // size=4
        	float sss_scale; // size=4
        	float sss_ior; // size=4
        	float sss_colfac; // size=4
        	float sss_texfac; // size=4
        	float sss_front; // size=4
        	float sss_back; // size=4
        	short sss_flag; // size=2
        	short sss_preset; // size=2
        	int mapto_textured; // size=4
        	short shadowonly_flag; // size=2
        	short index; // size=2
        	short vcol_alpha; // size=2
        	short pad4[3]; // size=6
        	ListBase gpumaterial; // size=0
        }

        VFont {
        	ID id; // size=0
        	char name[1024]; // size=1024
        	VFontData *data; // size=4
        	PackedFile *packedfile; // size=4
        	PackedFile *temp_pf; // size=4
        }

        MetaElem {
        	MetaElem *next; // size=4
        	MetaElem *prev; // size=4
        	BoundBox *bb; // size=4
        	short type; // size=2
        	short flag; // size=2
        	short selcol1; // size=2
        	short selcol2; // size=2
        	float x; // size=4
        	float y; // size=4
        	float z; // size=4
        	float quat[4]; // size=16
        	float expx; // size=4
        	float expy; // size=4
        	float expz; // size=4
        	float rad; // size=4
        	float rad2; // size=4
        	float s; // size=4
        	float len; // size=4
        	float *mat; // size=4
        	float *imat; // size=4
        }

        MetaBall {
        	ID id; // size=0
        	AnimData *adt; // size=4
        	ListBase elems; // size=0
        	ListBase disp; // size=0
        	ListBase *editelems; // size=4
        	Ipo *ipo; // size=4
        	Material **mat; // size=4
        	char flag; // size=1
        	char flag2; // size=1
        	short totcol; // size=2
        	short texflag; // size=2
        	short pad; // size=2
        	float loc[3]; // size=12
        	float size[3]; // size=12
        	float rot[3]; // size=12
        	float wiresize; // size=4
        	float rendersize; // size=4
        	float thresh; // size=4
        	MetaElem *lastelem; // size=4
        }

        BezTriple {
        	float vec[3][3]; // size=36
        	float alfa; // size=4
        	float weight; // size=4
        	float radius; // size=4
        	char ipo; // size=1
        	char h1; // size=1
        	char h2; // size=1
        	char f1; // size=1
        	char f2; // size=1
        	char f3; // size=1
        	char hide; // size=1
        	char easing; // size=1
        	float back; // size=4
        	float amplitude; // size=4
        	float period; // size=4
        	char pad[4]; // size=4
        }

        BPoint {
        	float vec[4]; // size=16
        	float alfa; // size=4
        	float weight; // size=4
        	short f1; // size=2
        	short hide; // size=2
        	float radius; // size=4
        	float pad; // size=4
        }

        Nurb {
        	Nurb *next; // size=4
        	Nurb *prev; // size=4
        	short type; // size=2
        	short mat_nr; // size=2
        	short hide; // size=2
        	short flag; // size=2
        	int pntsu; // size=4
        	int pntsv; // size=4
        	short pad[2]; // size=4
        	short resolu; // size=2
        	short resolv; // size=2
        	short orderu; // size=2
        	short orderv; // size=2
        	short flagu; // size=2
        	short flagv; // size=2
        	float *knotsu; // size=4
        	float *knotsv; // size=4
        	BPoint *bp; // size=4
        	BezTriple *bezt; // size=4
        	short tilt_interp; // size=2
        	short radius_interp; // size=2
        	int charidx; // size=4
        }

        CharInfo {
        	short kern; // size=2
        	short mat_nr; // size=2
        	char flag; // size=1
        	char pad; // size=1
        	short pad2; // size=2
        }

        TextBox {
        	float x; // size=4
        	float y; // size=4
        	float w; // size=4
        	float h; // size=4
        }

        EditNurb {
        	ListBase nurbs; // size=0
        	GHash *keyindex; // size=4
        	int shapenr; // size=4
        	char pad[4]; // size=4
        }

        Curve {
        	ID id; // size=0
        	AnimData *adt; // size=4
        	BoundBox *bb; // size=4
        	ListBase nurb; // size=0
        	EditNurb *editnurb; // size=4
        	Object *bevobj; // size=4
        	Object *taperobj; // size=4
        	Object *textoncurve; // size=4
        	Ipo *ipo; // size=4
        	Key *key; // size=4
        	Material **mat; // size=4
        	float loc[3]; // size=12
        	float size[3]; // size=12
        	float rot[3]; // size=12
        	short type; // size=2
        	short texflag; // size=2
        	short drawflag; // size=2
        	short twist_mode; // size=2
        	float twist_smooth; // size=4
        	float smallcaps_scale; // size=4
        	int pathlen; // size=4
        	short bevresol; // size=2
        	short totcol; // size=2
        	int flag; // size=4
        	float width; // size=4
        	float ext1; // size=4
        	float ext2; // size=4
        	short resolu; // size=2
        	short resolv; // size=2
        	short resolu_ren; // size=2
        	short resolv_ren; // size=2
        	int actnu; // size=4
        	int actvert; // size=4
        	char pad[4]; // size=4
        	short lines; // size=2
        	char spacemode; // size=1
        	char pad1; // size=1
        	float spacing; // size=4
        	float linedist; // size=4
        	float shear; // size=4
        	float fsize; // size=4
        	float wordspace; // size=4
        	float ulpos; // size=4
        	float ulheight; // size=4
        	float xof; // size=4
        	float yof; // size=4
        	float linewidth; // size=4
        	int pos; // size=4
        	int selstart; // size=4
        	int selend; // size=4
        	int len_wchar; // size=4
        	int len; // size=4
        	char *str; // size=4
        	EditFont *editfont; // size=4
        	char family[64]; // size=64
        	VFont *vfont; // size=4
        	VFont *vfontb; // size=4
        	VFont *vfonti; // size=4
        	VFont *vfontbi; // size=4
        	TextBox *tb; // size=4
        	int totbox; // size=4
        	int actbox; // size=4
        	CharInfo *strinfo; // size=4
        	CharInfo curinfo; // size=0
        	float ctime; // size=4
        	float bevfac1; // size=4
        	float bevfac2; // size=4
        	char bevfac1_mapping; // size=1
        	char bevfac2_mapping; // size=1
        	char pad2[2]; // size=2
        }

        Mesh {
        	ID id; // size=0
        	AnimData *adt; // size=4
        	BoundBox *bb; // size=4
        	Ipo *ipo; // size=4
        	Key *key; // size=4
        	Material **mat; // size=4
        	MSelect *mselect; // size=4
        	MPoly *mpoly; // size=4
        	MTexPoly *mtpoly; // size=4
        	MLoop *mloop; // size=4
        	MLoopUV *mloopuv; // size=4
        	MLoopCol *mloopcol; // size=4
        	MFace *mface; // size=4
        	MTFace *mtface; // size=4
        	TFace *tface; // size=4
        	MVert *mvert; // size=4
        	MEdge *medge; // size=4
        	MDeformVert *dvert; // size=4
        	MCol *mcol; // size=4
        	Mesh *texcomesh; // size=4
        	BMEditMesh *edit_btmesh; // size=4
        	CustomData vdata; // size=0
        	CustomData edata; // size=0
        	CustomData fdata; // size=0
        	CustomData pdata; // size=0
        	CustomData ldata; // size=0
        	int totvert; // size=4
        	int totedge; // size=4
        	int totface; // size=4
        	int totselect; // size=4
        	int totpoly; // size=4
        	int totloop; // size=4
        	int act_face; // size=4
        	float loc[3]; // size=12
        	float size[3]; // size=12
        	float rot[3]; // size=12
        	int drawflag; // size=4
        	short texflag; // size=2
        	short flag; // size=2
        	float smoothresh; // size=4
        	int pad2; // size=4
        	char cd_flag; // size=1
        	char pad; // size=1
        	char subdiv; // size=1
        	char subdivr; // size=1
        	char subsurftype; // size=1
        	char editflag; // size=1
        	short totcol; // size=2
        	Multires *mr; // size=4
        }

        TFace {
        	void *tpage; // size=4
        	float uv[4][2]; // size=32
        	int col[4]; // size=16
        	char flag; // size=1
        	char transp; // size=1
        	short mode; // size=2
        	short tile; // size=2
        	short unwrap; // size=2
        }

        MFace {
        	int v1; // size=4
        	int v2; // size=4
        	int v3; // size=4
        	int v4; // size=4
        	short mat_nr; // size=2
        	char edcode; // size=1
        	char flag; // size=1
        }

        MEdge {
        	int v1; // size=4
        	int v2; // size=4
        	char crease; // size=1
        	char bweight; // size=1
        	short flag; // size=2
        }

        MDeformWeight {
        	int def_nr; // size=4
        	float weight; // size=4
        }

        MDeformVert {
        	MDeformWeight *dw; // size=4
        	int totweight; // size=4
        	int flag; // size=4
        }

        MVert {
        	float co[3]; // size=12
        	short no[3]; // size=6
        	char flag; // size=1
        	char bweight; // size=1
        }

        MCol {
        	char a; // size=1
        	char r; // size=1
        	char g; // size=1
        	char b; // size=1
        }

        MPoly {
        	int loopstart; // size=4
        	int totloop; // size=4
        	short mat_nr; // size=2
        	char flag; // size=1
        	char pad; // size=1
        }

        MLoop {
        	int v; // size=4
        	int e; // size=4
        }

        MTexPoly {
        	Image *tpage; // size=4
        	char flag; // size=1
        	char transp; // size=1
        	short mode; // size=2
        	short tile; // size=2
        	short pad; // size=2
        }

        MLoopUV {
        	float uv[2]; // size=8
        	int flag; // size=4
        }

        MLoopCol {
        	char r; // size=1
        	char g; // size=1
        	char b; // size=1
        	char a; // size=1
        }

        MSelect {
        	int index; // size=4
        	int type; // size=4
        }

        MTFace {
        	float uv[4][2]; // size=32
        	Image *tpage; // size=4
        	char flag; // size=1
        	char transp; // size=1
        	short mode; // size=2
        	short tile; // size=2
        	short unwrap; // size=2
        }

        MFloatProperty {
        	float f; // size=4
        }

        MIntProperty {
        	int i; // size=4
        }

        MStringProperty {
        	char s[255]; // size=255
        	char s_len; // size=1
        }

        OrigSpaceFace {
        	float uv[4][2]; // size=32
        }

        OrigSpaceLoop {
        	float uv[2]; // size=8
        }

        MDisps {
        	int totdisp; // size=4
        	int level; // size=4
        	float (*disps)(); // size=4
        	int *hidden; // size=4
        }

        MultiresCol {
        	float a; // size=4
        	float r; // size=4
        	float g; // size=4
        	float b; // size=4
        }

        MultiresColFace {
        	MultiresCol col[4]; // size=0
        }

        MultiresFace {
        	int v[4]; // size=16
        	int mid; // size=4
        	char flag; // size=1
        	char mat_nr; // size=1
        	char pad[2]; // size=2
        }

        MultiresEdge {
        	int v[2]; // size=8
        	int mid; // size=4
        }

        MultiresLevel {
        	MultiresLevel *next; // size=4
        	MultiresLevel *prev; // size=4
        	MultiresFace *faces; // size=4
        	MultiresColFace *colfaces; // size=4
        	MultiresEdge *edges; // size=4
        	int totvert; // size=4
        	int totface; // size=4
        	int totedge; // size=4
        	int pad; // size=4
        	MVert *verts; // size=4
        }

        Multires {
        	ListBase levels; // size=0
        	MVert *verts; // size=4
        	char level_count; // size=1
        	char current; // size=1
        	char newlvl; // size=1
        	char edgelvl; // size=1
        	char pinlvl; // size=1
        	char renderlvl; // size=1
        	char use_col; // size=1
        	char flag; // size=1
        	CustomData vdata; // size=0
        	CustomData fdata; // size=0
        	short *edge_flags; // size=4
        	char *edge_creases; // size=4
        }

        MRecast {
        	int i; // size=4
        }

        GridPaintMask {
        	float *data; // size=4
        	int level; // size=4
        	int pad; // size=4
        }

        MVertSkin {
        	float radius[3]; // size=12
        	int flag; // size=4
        }

        FreestyleEdge {
        	char flag; // size=1
        	char pad[3]; // size=3
        }

        FreestyleFace {
        	char flag; // size=1
        	char pad[3]; // size=3
        }

        ModifierData {
        	ModifierData *next; // size=4
        	ModifierData *prev; // size=4
        	int type; // size=4
        	int mode; // size=4
        	int stackindex; // size=4
        	int pad; // size=4
        	char name[64]; // size=64
        	Scene *scene; // size=4
        	char *error; // size=4
        }

        MappingInfoModifierData {
        	ModifierData modifier; // size=0
        	Tex *texture; // size=4
        	Object *map_object; // size=4
        	char uvlayer_name[64]; // size=64
        	int uvlayer_tmp; // size=4
        	int texmapping; // size=4
        }

        SubsurfModifierData {
        	ModifierData modifier; // size=0
        	short subdivType; // size=2
        	short levels; // size=2
        	short renderLevels; // size=2
        	short flags; // size=2
        	void *emCache; // size=4
        	void *mCache; // size=4
        }

        LatticeModifierData {
        	ModifierData modifier; // size=0
        	Object *object; // size=4
        	char name[64]; // size=64
        	float strength; // size=4
        	char pad[4]; // size=4
        }

        CurveModifierData {
        	ModifierData modifier; // size=0
        	Object *object; // size=4
        	char name[64]; // size=64
        	short defaxis; // size=2
        	char pad[6]; // size=6
        }

        BuildModifierData {
        	ModifierData modifier; // size=0
        	float start; // size=4
        	float length; // size=4
        	short flag; // size=2
        	short randomize; // size=2
        	int seed; // size=4
        }

        MaskModifierData {
        	ModifierData modifier; // size=0
        	Object *ob_arm; // size=4
        	char vgroup[64]; // size=64
        	int mode; // size=4
        	int flag; // size=4
        }

        ArrayModifierData {
        	ModifierData modifier; // size=0
        	Object *start_cap; // size=4
        	Object *end_cap; // size=4
        	Object *curve_ob; // size=4
        	Object *offset_ob; // size=4
        	float offset[3]; // size=12
        	float scale[3]; // size=12
        	float length; // size=4
        	float merge_dist; // size=4
        	int fit_type; // size=4
        	int offset_type; // size=4
        	int flags; // size=4
        	int count; // size=4
        }

        MirrorModifierData {
        	ModifierData modifier; // size=0
        	short axis; // size=2
        	short flag; // size=2
        	float tolerance; // size=4
        	Object *mirror_ob; // size=4
        }

        EdgeSplitModifierData {
        	ModifierData modifier; // size=0
        	float split_angle; // size=4
        	int flags; // size=4
        }

        BevelModifierData {
        	ModifierData modifier; // size=0
        	float value; // size=4
        	int res; // size=4
        	short flags; // size=2
        	short val_flags; // size=2
        	short lim_flags; // size=2
        	short e_flags; // size=2
        	float profile; // size=4
        	float bevel_angle; // size=4
        	char defgrp_name[64]; // size=64
        }

        SmokeModifierData {
        	ModifierData modifier; // size=0
        	SmokeDomainSettings *domain; // size=4
        	SmokeFlowSettings *flow; // size=4
        	SmokeCollSettings *coll; // size=4
        	float time; // size=4
        	int type; // size=4
        }

        DisplaceModifierData {
        	ModifierData modifier; // size=0
        	Tex *texture; // size=4
        	Object *map_object; // size=4
        	char uvlayer_name[64]; // size=64
        	int uvlayer_tmp; // size=4
        	int texmapping; // size=4
        	float strength; // size=4
        	int direction; // size=4
        	char defgrp_name[64]; // size=64
        	float midlevel; // size=4
        	int pad; // size=4
        }

        UVProjectModifierData {
        	ModifierData modifier; // size=0
        	Object *projectors[10]; // size=40
        	Image *image; // size=4
        	int flags; // size=4
        	int num_projectors; // size=4
        	float aspectx; // size=4
        	float aspecty; // size=4
        	float scalex; // size=4
        	float scaley; // size=4
        	char uvlayer_name[64]; // size=64
        	int uvlayer_tmp; // size=4
        	int pad; // size=4
        }

        DecimateModifierData {
        	ModifierData modifier; // size=0
        	float percent; // size=4
        	short iter; // size=2
        	char delimit; // size=1
        	char pad; // size=1
        	float angle; // size=4
        	char defgrp_name[64]; // size=64
        	short flag; // size=2
        	short mode; // size=2
        	int face_count; // size=4
        	int pad2; // size=4
        }

        SmoothModifierData {
        	ModifierData modifier; // size=0
        	float fac; // size=4
        	char defgrp_name[64]; // size=64
        	short flag; // size=2
        	short repeat; // size=2
        }

        CastModifierData {
        	ModifierData modifier; // size=0
        	Object *object; // size=4
        	float fac; // size=4
        	float radius; // size=4
        	float size; // size=4
        	char defgrp_name[64]; // size=64
        	short flag; // size=2
        	short type; // size=2
        }

        WaveModifierData {
        	ModifierData modifier; // size=0
        	Tex *texture; // size=4
        	Object *map_object; // size=4
        	char uvlayer_name[64]; // size=64
        	int uvlayer_tmp; // size=4
        	int texmapping; // size=4
        	Object *objectcenter; // size=4
        	char defgrp_name[64]; // size=64
        	short flag; // size=2
        	short pad; // size=2
        	float startx; // size=4
        	float starty; // size=4
        	float height; // size=4
        	float width; // size=4
        	float narrow; // size=4
        	float speed; // size=4
        	float damp; // size=4
        	float falloff; // size=4
        	float timeoffs; // size=4
        	float lifetime; // size=4
        	float pad1; // size=4
        }

        ArmatureModifierData {
        	ModifierData modifier; // size=0
        	short deformflag; // size=2
        	short multi; // size=2
        	int pad2; // size=4
        	Object *object; // size=4
        	float *prevCos; // size=4
        	char defgrp_name[64]; // size=64
        }

        HookModifierData {
        	ModifierData modifier; // size=0
        	Object *object; // size=4
        	char subtarget[64]; // size=64
        	float parentinv[4][4]; // size=64
        	float cent[3]; // size=12
        	float falloff; // size=4
        	int *indexar; // size=4
        	int totindex; // size=4
        	float force; // size=4
        	char name[64]; // size=64
        }

        SoftbodyModifierData {
        	ModifierData modifier; // size=0
        }

        ClothModifierData {
        	ModifierData modifier; // size=0
        	Scene *scene; // size=4
        	Cloth *clothObject; // size=4
        	ClothSimSettings *sim_parms; // size=4
        	ClothCollSettings *coll_parms; // size=4
        	PointCache *point_cache; // size=4
        	ListBase ptcaches; // size=0
        }

        CollisionModifierData {
        	ModifierData modifier; // size=0
        	MVert *x; // size=4
        	MVert *xnew; // size=4
        	MVert *xold; // size=4
        	MVert *current_xnew; // size=4
        	MVert *current_x; // size=4
        	MVert *current_v; // size=4
        	MFace *mfaces; // size=4
        	int numverts; // size=4
        	int numfaces; // size=4
        	float time_x; // size=4
        	float time_xnew; // size=4
        	BVHTree *bvhtree; // size=4
        }

        SurfaceModifierData {
        	ModifierData modifier; // size=0
        	MVert *x; // size=4
        	MVert *v; // size=4
        	DerivedMesh *dm; // size=4
        	BVHTreeFromMesh *bvhtree; // size=4
        	int cfra; // size=4
        	int numverts; // size=4
        }

        BooleanModifierData {
        	ModifierData modifier; // size=0
        	Object *object; // size=4
        	int operation; // size=4
        	int pad; // size=4
        }

        MDefInfluence {
        	int vertex; // size=4
        	float weight; // size=4
        }

        MDefCell {
        	int offset; // size=4
        	int totinfluence; // size=4
        }

        MeshDeformModifierData {
        	ModifierData modifier; // size=0
        	Object *object; // size=4
        	char defgrp_name[64]; // size=64
        	short gridsize; // size=2
        	short flag; // size=2
        	short pad[2]; // size=4
        	MDefInfluence *bindinfluences; // size=4
        	int *bindoffsets; // size=4
        	float *bindcagecos; // size=4
        	int totvert; // size=4
        	int totcagevert; // size=4
        	MDefCell *dyngrid; // size=4
        	MDefInfluence *dyninfluences; // size=4
        	int *dynverts; // size=4
        	int dyngridsize; // size=4
        	int totinfluence; // size=4
        	float dyncellmin[3]; // size=12
        	float dyncellwidth; // size=4
        	float bindmat[4][4]; // size=64
        	float *bindweights; // size=4
        	float *bindcos; // size=4
        	void (*bindfunc)(); // size=0
        }

        ParticleSystemModifierData {
        	ModifierData modifier; // size=0
        	ParticleSystem *psys; // size=4
        	DerivedMesh *dm; // size=4
        	int totdmvert; // size=4
        	int totdmedge; // size=4
        	int totdmface; // size=4
        	short flag; // size=2
        	short pad; // size=2
        }

        ParticleInstanceModifierData {
        	ModifierData modifier; // size=0
        	Object *ob; // size=4
        	short psys; // size=2
        	short flag; // size=2
        	short axis; // size=2
        	short pad; // size=2
        	float position; // size=4
        	float random_position; // size=4
        }

        ExplodeModifierData {
        	ModifierData modifier; // size=0
        	int *facepa; // size=4
        	short flag; // size=2
        	short vgroup; // size=2
        	float protect; // size=4
        	char uvname[64]; // size=64
        }

        MultiresModifierData {
        	ModifierData modifier; // size=0
        	char lvl; // size=1
        	char sculptlvl; // size=1
        	char renderlvl; // size=1
        	char totlvl; // size=1
        	char simple; // size=1
        	char flags; // size=1
        	char pad[2]; // size=2
        }

        FluidsimModifierData {
        	ModifierData modifier; // size=0
        	FluidsimSettings *fss; // size=4
        	PointCache *point_cache; // size=4
        }

        ShrinkwrapModifierData {
        	ModifierData modifier; // size=0
        	Object *target; // size=4
        	Object *auxTarget; // size=4
        	char vgroup_name[64]; // size=64
        	float keepDist; // size=4
        	short shrinkType; // size=2
        	char shrinkOpts; // size=1
        	char pad1; // size=1
        	float projLimit; // size=4
        	char projAxis; // size=1
        	char subsurfLevels; // size=1
        	char pad[2]; // size=2
        }

        SimpleDeformModifierData {
        	ModifierData modifier; // size=0
        	Object *origin; // size=4
        	char vgroup_name[64]; // size=64
        	float factor; // size=4
        	float limit[2]; // size=8
        	char mode; // size=1
        	char axis; // size=1
        	char pad[2]; // size=2
        }

        ShapeKeyModifierData {
        	ModifierData modifier; // size=0
        }

        SolidifyModifierData {
        	ModifierData modifier; // size=0
        	char defgrp_name[64]; // size=64
        	float offset; // size=4
        	float offset_fac; // size=4
        	float offset_fac_vg; // size=4
        	float offset_clamp; // size=4
        	float pad; // size=4
        	float crease_inner; // size=4
        	float crease_outer; // size=4
        	float crease_rim; // size=4
        	int flag; // size=4
        	short mat_ofs; // size=2
        	short mat_ofs_rim; // size=2
        }

        ScrewModifierData {
        	ModifierData modifier; // size=0
        	Object *ob_axis; // size=4
        	int steps; // size=4
        	int render_steps; // size=4
        	int iter; // size=4
        	float screw_ofs; // size=4
        	float angle; // size=4
        	char axis; // size=1
        	char pad; // size=1
        	short flag; // size=2
        }

        OceanModifierData {
        	ModifierData modifier; // size=0
        	Ocean *ocean; // size=4
        	OceanCache *oceancache; // size=4
        	int resolution; // size=4
        	int spatial_size; // size=4
        	float wind_velocity; // size=4
        	float damp; // size=4
        	float smallest_wave; // size=4
        	float depth; // size=4
        	float wave_alignment; // size=4
        	float wave_direction; // size=4
        	float wave_scale; // size=4
        	float chop_amount; // size=4
        	float foam_coverage; // size=4
        	float time; // size=4
        	int bakestart; // size=4
        	int bakeend; // size=4
        	char cachepath[1024]; // size=1024
        	char foamlayername[64]; // size=64
        	char cached; // size=1
        	char geometry_mode; // size=1
        	char flag; // size=1
        	char refresh; // size=1
        	short repeat_x; // size=2
        	short repeat_y; // size=2
        	int seed; // size=4
        	float size; // size=4
        	float foam_fade; // size=4
        	int pad; // size=4
        }

        WarpModifierData {
        	ModifierData modifier; // size=0
        	Tex *texture; // size=4
        	Object *map_object; // size=4
        	char uvlayer_name[64]; // size=64
        	int uvlayer_tmp; // size=4
        	int texmapping; // size=4
        	Object *object_from; // size=4
        	Object *object_to; // size=4
        	CurveMapping *curfalloff; // size=4
        	char defgrp_name[64]; // size=64
        	float strength; // size=4
        	float falloff_radius; // size=4
        	char flag; // size=1
        	char falloff_type; // size=1
        	char pad[6]; // size=6
        }

        WeightVGEditModifierData {
        	ModifierData modifier; // size=0
        	char defgrp_name[64]; // size=64
        	short edit_flags; // size=2
        	short falloff_type; // size=2
        	float default_weight; // size=4
        	CurveMapping *cmap_curve; // size=4
        	float add_threshold; // size=4
        	float rem_threshold; // size=4
        	float mask_constant; // size=4
        	char mask_defgrp_name[64]; // size=64
        	int mask_tex_use_channel; // size=4
        	Tex *mask_texture; // size=4
        	Object *mask_tex_map_obj; // size=4
        	int mask_tex_mapping; // size=4
        	char mask_tex_uvlayer_name[64]; // size=64
        	int pad_i1; // size=4
        }

        WeightVGMixModifierData {
        	ModifierData modifier; // size=0
        	char defgrp_name_a[64]; // size=64
        	char defgrp_name_b[64]; // size=64
        	float default_weight_a; // size=4
        	float default_weight_b; // size=4
        	char mix_mode; // size=1
        	char mix_set; // size=1
        	char pad_c1[6]; // size=6
        	float mask_constant; // size=4
        	char mask_defgrp_name[64]; // size=64
        	int mask_tex_use_channel; // size=4
        	Tex *mask_texture; // size=4
        	Object *mask_tex_map_obj; // size=4
        	int mask_tex_mapping; // size=4
        	char mask_tex_uvlayer_name[64]; // size=64
        	int pad_i1; // size=4
        }

        WeightVGProximityModifierData {
        	ModifierData modifier; // size=0
        	char defgrp_name[64]; // size=64
        	int proximity_mode; // size=4
        	int proximity_flags; // size=4
        	Object *proximity_ob_target; // size=4
        	float mask_constant; // size=4
        	char mask_defgrp_name[64]; // size=64
        	int mask_tex_use_channel; // size=4
        	Tex *mask_texture; // size=4
        	Object *mask_tex_map_obj; // size=4
        	int mask_tex_mapping; // size=4
        	char mask_tex_uvlayer_name[64]; // size=64
        	float min_dist; // size=4
        	float max_dist; // size=4
        	short falloff_type; // size=2
        	short pad_s1; // size=2
        }

        DynamicPaintModifierData {
        	ModifierData modifier; // size=0
        	DynamicPaintCanvasSettings *canvas; // size=4
        	DynamicPaintBrushSettings *brush; // size=4
        	int type; // size=4
        	int pad; // size=4
        }

        RemeshModifierData {
        	ModifierData modifier; // size=0
        	float threshold; // size=4
        	float scale; // size=4
        	float hermite_num; // size=4
        	char depth; // size=1
        	char flag; // size=1
        	char mode; // size=1
        	char pad; // size=1
        }

        SkinModifierData {
        	ModifierData modifier; // size=0
        	float branch_smoothing; // size=4
        	char flag; // size=1
        	char symmetry_axes; // size=1
        	char pad[2]; // size=2
        }

        TriangulateModifierData {
        	ModifierData modifier; // size=0
        	int flag; // size=4
        	int quad_method; // size=4
        	int ngon_method; // size=4
        	int pad; // size=4
        }

        LaplacianSmoothModifierData {
        	ModifierData modifier; // size=0
        	float lambda; // size=4
        	float lambda_border; // size=4
        	float pad1; // size=4
        	char defgrp_name[64]; // size=64
        	short flag; // size=2
        	short repeat; // size=2
        }

        UVWarpModifierData {
        	ModifierData modifier; // size=0
        	char axis_u; // size=1
        	char axis_v; // size=1
        	char pad[6]; // size=6
        	float center[2]; // size=8
        	Object *object_src; // size=4
        	char bone_src[64]; // size=64
        	Object *object_dst; // size=4
        	char bone_dst[64]; // size=64
        	char vgroup_name[64]; // size=64
        	char uvlayer_name[64]; // size=64
        }

        MeshCacheModifierData {
        	ModifierData modifier; // size=0
        	char flag; // size=1
        	char type; // size=1
        	char time_mode; // size=1
        	char play_mode; // size=1
        	char forward_axis; // size=1
        	char up_axis; // size=1
        	char flip_axis; // size=1
        	char interp; // size=1
        	float factor; // size=4
        	char deform_mode; // size=1
        	char pad[7]; // size=7
        	float frame_start; // size=4
        	float frame_scale; // size=4
        	float eval_frame; // size=4
        	float eval_time; // size=4
        	float eval_factor; // size=4
        	char filepath[1024]; // size=1024
        }

        LaplacianDeformModifierData {
        	ModifierData modifier; // size=0
        	char anchor_grp_name[64]; // size=64
        	int total_verts; // size=4
        	int repeat; // size=4
        	float *vertexco; // size=4
        	void *cache_system; // size=4
        	short flag; // size=2
        	short pad[3]; // size=6
        }

        WireframeModifierData {
        	ModifierData modifier; // size=0
        	char defgrp_name[64]; // size=64
        	float offset; // size=4
        	float offset_fac; // size=4
        	float offset_fac_vg; // size=4
        	float crease_weight; // size=4
        	short flag; // size=2
        	short mat_ofs; // size=2
        	short pad[2]; // size=4
        }

        EditLatt {
        	Lattice *latt; // size=4
        	int shapenr; // size=4
        	char pad[4]; // size=4
        }

        Lattice {
        	ID id; // size=0
        	AnimData *adt; // size=4
        	short pntsu; // size=2
        	short pntsv; // size=2
        	short pntsw; // size=2
        	short flag; // size=2
        	short opntsu; // size=2
        	short opntsv; // size=2
        	short opntsw; // size=2
        	short pad2; // size=2
        	char typeu; // size=1
        	char typev; // size=1
        	char typew; // size=1
        	char pad3; // size=1
        	int actbp; // size=4
        	float fu; // size=4
        	float fv; // size=4
        	float fw; // size=4
        	float du; // size=4
        	float dv; // size=4
        	float dw; // size=4
        	BPoint *def; // size=4
        	Ipo *ipo; // size=4
        	Key *key; // size=4
        	MDeformVert *dvert; // size=4
        	char vgroup[64]; // size=64
        	EditLatt *editlatt; // size=4
        }

        bDeformGroup {
        	bDeformGroup *next; // size=4
        	bDeformGroup *prev; // size=4
        	char name[64]; // size=64
        	char flag; // size=1
        	char pad[7]; // size=7
        }

        BoundBox {
        	float vec[8][3]; // size=96
        	int flag; // size=4
        	int pad; // size=4
        }

        LodLevel {
        	LodLevel *next; // size=4
        	LodLevel *prev; // size=4
        	Object *source; // size=4
        	int flags; // size=4
        	float distance; // size=4
        }

        Object {
        	ID id; // size=0
        	AnimData *adt; // size=4
        	SculptSession *sculpt; // size=4
        	short type; // size=2
        	short partype; // size=2
        	int par1; // size=4
        	int par2; // size=4
        	int par3; // size=4
        	char parsubstr[64]; // size=64
        	Object *parent; // size=4
        	Object *track; // size=4
        	Object *proxy; // size=4
        	Object *proxy_group; // size=4
        	Object *proxy_from; // size=4
        	Ipo *ipo; // size=4
        	BoundBox *bb; // size=4
        	bAction *action; // size=4
        	bAction *poselib; // size=4
        	bPose *pose; // size=4
        	void *data; // size=4
        	bGPdata *gpd; // size=4
        	bAnimVizSettings avs; // size=0
        	bMotionPath *mpath; // size=4
        	ListBase constraintChannels; // size=0
        	ListBase effect; // size=0
        	ListBase defbase; // size=0
        	ListBase modifiers; // size=0
        	int mode; // size=4
        	int restore_mode; // size=4
        	Material **mat; // size=4
        	char *matbits; // size=4
        	int totcol; // size=4
        	int actcol; // size=4
        	float loc[3]; // size=12
        	float dloc[3]; // size=12
        	float orig[3]; // size=12
        	float size[3]; // size=12
        	float dsize[3]; // size=12
        	float dscale[3]; // size=12
        	float rot[3]; // size=12
        	float drot[3]; // size=12
        	float quat[4]; // size=16
        	float dquat[4]; // size=16
        	float rotAxis[3]; // size=12
        	float drotAxis[3]; // size=12
        	float rotAngle; // size=4
        	float drotAngle; // size=4
        	float obmat[4][4]; // size=64
        	float parentinv[4][4]; // size=64
        	float constinv[4][4]; // size=64
        	float imat[4][4]; // size=64
        	float imat_ren[4][4]; // size=64
        	int lay; // size=4
        	short flag; // size=2
        	short colbits; // size=2
        	short transflag; // size=2
        	short protectflag; // size=2
        	short trackflag; // size=2
        	short upflag; // size=2
        	short nlaflag; // size=2
        	short ipoflag; // size=2
        	short scaflag; // size=2
        	char scavisflag; // size=1
        	char depsflag; // size=1
        	int dupon; // size=4
        	int dupoff; // size=4
        	int dupsta; // size=4
        	int dupend; // size=4
        	int pad; // size=4
        	float mass; // size=4
        	float damping; // size=4
        	float inertia; // size=4
        	float formfactor; // size=4
        	float rdamping; // size=4
        	float margin; // size=4
        	float max_vel; // size=4
        	float min_vel; // size=4
        	float obstacleRad; // size=4
        	float step_height; // size=4
        	float jump_speed; // size=4
        	float fall_speed; // size=4
        	short col_group; // size=2
        	short col_mask; // size=2
        	short rotmode; // size=2
        	char boundtype; // size=1
        	char collision_boundtype; // size=1
        	short dtx; // size=2
        	char dt; // size=1
        	char empty_drawtype; // size=1
        	float empty_drawsize; // size=4
        	float dupfacesca; // size=4
        	ListBase prop; // size=0
        	ListBase sensors; // size=0
        	ListBase controllers; // size=0
        	ListBase actuators; // size=0
        	float sf; // size=4
        	short index; // size=2
        	short actdef; // size=2
        	float col[4]; // size=16
        	int gameflag; // size=4
        	int gameflag2; // size=4
        	BulletSoftBody *bsoft; // size=4
        	char restrictflag; // size=1
        	char recalc; // size=1
        	short softflag; // size=2
        	float anisotropicFriction[3]; // size=12
        	ListBase constraints; // size=0
        	ListBase nlastrips; // size=0
        	ListBase hooks; // size=0
        	ListBase particlesystem; // size=0
        	PartDeflect *pd; // size=4
        	SoftBody *soft; // size=4
        	Group *dup_group; // size=4
        	char body_type; // size=1
        	char shapeflag; // size=1
        	short shapenr; // size=2
        	float smoothresh; // size=4
        	FluidsimSettings *fluidsimSettings; // size=4
        	CurveCache *curve_cache; // size=4
        	DerivedMesh *derivedDeform; // size=4
        	DerivedMesh *derivedFinal; // size=4
        	uint64_t lastDataMask; // size=8
        	uint64_t customdata_mask; // size=8
        	int state; // size=4
        	int init_state; // size=4
        	ListBase gpulamp; // size=0
        	ListBase pc_ids; // size=0
        	ListBase *duplilist; // size=4
        	RigidBodyOb *rigidbody_object; // size=4
        	RigidBodyCon *rigidbody_constraint; // size=4
        	float ima_ofs[2]; // size=8
        	ImageUser *iuser; // size=4
        	ListBase lodlevels; // size=0
        	LodLevel *currentlod; // size=4
        }

        ObHook {
        	ObHook *next; // size=4
        	ObHook *prev; // size=4
        	Object *parent; // size=4
        	float parentinv[4][4]; // size=64
        	float mat[4][4]; // size=64
        	float cent[3]; // size=12
        	float falloff; // size=4
        	char name[64]; // size=64
        	int *indexar; // size=4
        	int totindex; // size=4
        	int curindex; // size=4
        	short type; // size=2
        	short active; // size=2
        	float force; // size=4
        }

        DupliObject {
        	DupliObject *next; // size=4
        	DupliObject *prev; // size=4
        	Object *ob; // size=4
        	int origlay; // size=4
        	int pad; // size=4
        	float mat[4][4]; // size=64
        	float orco[3]; // size=12
        	float uv[2]; // size=8
        	short type; // size=2
        	char no_draw; // size=1
        	char animated; // size=1
        	int persistent_id[8]; // size=32
        	ParticleSystem *particle_system; // size=4
        }

        PartDeflect {
        	int flag; // size=4
        	short deflect; // size=2
        	short forcefield; // size=2
        	short falloff; // size=2
        	short shape; // size=2
        	short tex_mode; // size=2
        	short kink; // size=2
        	short kink_axis; // size=2
        	short zdir; // size=2
        	float f_strength; // size=4
        	float f_damp; // size=4
        	float f_flow; // size=4
        	float f_size; // size=4
        	float f_power; // size=4
        	float maxdist; // size=4
        	float mindist; // size=4
        	float f_power_r; // size=4
        	float maxrad; // size=4
        	float minrad; // size=4
        	float pdef_damp; // size=4
        	float pdef_rdamp; // size=4
        	float pdef_perm; // size=4
        	float pdef_frict; // size=4
        	float pdef_rfrict; // size=4
        	float pdef_stickness; // size=4
        	float absorption; // size=4
        	float pdef_sbdamp; // size=4
        	float pdef_sbift; // size=4
        	float pdef_sboft; // size=4
        	float clump_fac; // size=4
        	float clump_pow; // size=4
        	float kink_freq; // size=4
        	float kink_shape; // size=4
        	float kink_amp; // size=4
        	float free_end; // size=4
        	float tex_nabla; // size=4
        	Tex *tex; // size=4
        	RNG *rng; // size=4
        	float f_noise; // size=4
        	int seed; // size=4
        	Object *f_source; // size=4
        }

        EffectorWeights {
        	Group *group; // size=4
        	float weight[14]; // size=56
        	float global_gravity; // size=4
        	short flag; // size=2
        	short rt[3]; // size=6
        	int pad; // size=4
        }

        PTCacheExtra {
        	PTCacheExtra *next; // size=4
        	PTCacheExtra *prev; // size=4
        	int type; // size=4
        	int totdata; // size=4
        	void *data; // size=4
        }

        PTCacheMem {
        	PTCacheMem *next; // size=4
        	PTCacheMem *prev; // size=4
        	int frame; // size=4
        	int totpoint; // size=4
        	int data_types; // size=4
        	int flag; // size=4
        	void *data[8]; // size=32
        	void *cur[8]; // size=32
        	ListBase extradata; // size=0
        }

        PointCache {
        	PointCache *next; // size=4
        	PointCache *prev; // size=4
        	int flag; // size=4
        	int step; // size=4
        	int simframe; // size=4
        	int startframe; // size=4
        	int endframe; // size=4
        	int editframe; // size=4
        	int last_exact; // size=4
        	int last_valid; // size=4
        	int pad; // size=4
        	int totpoint; // size=4
        	int index; // size=4
        	short compression; // size=2
        	short rt; // size=2
        	char name[64]; // size=64
        	char prev_name[64]; // size=64
        	char info[64]; // size=64
        	char path[1024]; // size=1024
        	char *cached_frames; // size=4
        	ListBase mem_cache; // size=0
        	PTCacheEdit *edit; // size=4
        	void (*free_edit)(); // size=0
        }

        SBVertex {
        	float vec[4]; // size=16
        }

        BulletSoftBody {
        	int flag; // size=4
        	float linStiff; // size=4
        	float angStiff; // size=4
        	float volume; // size=4
        	int viterations; // size=4
        	int piterations; // size=4
        	int diterations; // size=4
        	int citerations; // size=4
        	float kSRHR_CL; // size=4
        	float kSKHR_CL; // size=4
        	float kSSHR_CL; // size=4
        	float kSR_SPLT_CL; // size=4
        	float kSK_SPLT_CL; // size=4
        	float kSS_SPLT_CL; // size=4
        	float kVCF; // size=4
        	float kDP; // size=4
        	float kDG; // size=4
        	float kLF; // size=4
        	float kPR; // size=4
        	float kVC; // size=4
        	float kDF; // size=4
        	float kMT; // size=4
        	float kCHR; // size=4
        	float kKHR; // size=4
        	float kSHR; // size=4
        	float kAHR; // size=4
        	int collisionflags; // size=4
        	int numclusteriterations; // size=4
        	float welding; // size=4
        	float margin; // size=4
        }

        SoftBody {
        	int totpoint; // size=4
        	int totspring; // size=4
        	BodyPoint *bpoint; // size=4
        	BodySpring *bspring; // size=4
        	char pad; // size=1
        	char msg_lock; // size=1
        	short msg_value; // size=2
        	float nodemass; // size=4
        	char namedVG_Mass[64]; // size=64
        	float grav; // size=4
        	float mediafrict; // size=4
        	float rklimit; // size=4
        	float physics_speed; // size=4
        	float goalspring; // size=4
        	float goalfrict; // size=4
        	float mingoal; // size=4
        	float maxgoal; // size=4
        	float defgoal; // size=4
        	short vertgroup; // size=2
        	char namedVG_Softgoal[64]; // size=64
        	short fuzzyness; // size=2
        	float inspring; // size=4
        	float infrict; // size=4
        	char namedVG_Spring_K[64]; // size=64
        	int sfra; // size=4
        	int efra; // size=4
        	int interval; // size=4
        	short local; // size=2
        	short solverflags; // size=2
        	SBVertex **keys; // size=4
        	int totpointkey; // size=4
        	int totkey; // size=4
        	float secondspring; // size=4
        	float colball; // size=4
        	float balldamp; // size=4
        	float ballstiff; // size=4
        	short sbc_mode; // size=2
        	short aeroedge; // size=2
        	short minloops; // size=2
        	short maxloops; // size=2
        	short choke; // size=2
        	short solver_ID; // size=2
        	short plastic; // size=2
        	short springpreload; // size=2
        	SBScratch *scratch; // size=4
        	float shearstiff; // size=4
        	float inpush; // size=4
        	PointCache *pointcache; // size=4
        	ListBase ptcaches; // size=0
        	EffectorWeights *effector_weights; // size=4
        	float lcom[3]; // size=12
        	float lrot[3][3]; // size=36
        	float lscale[3][3]; // size=36
        	int last_frame; // size=4
        }

        FluidVertexVelocity {
        	float vel[3]; // size=12
        }

        FluidsimSettings {
        	FluidsimModifierData *fmd; // size=4
        	int threads; // size=4
        	int pad1; // size=4
        	short type; // size=2
        	short show_advancedoptions; // size=2
        	short resolutionxyz; // size=2
        	short previewresxyz; // size=2
        	float realsize; // size=4
        	short guiDisplayMode; // size=2
        	short renderDisplayMode; // size=2
        	float viscosityValue; // size=4
        	short viscosityMode; // size=2
        	short viscosityExponent; // size=2
        	float grav[3]; // size=12
        	float animStart; // size=4
        	float animEnd; // size=4
        	int bakeStart; // size=4
        	int bakeEnd; // size=4
        	int frameOffset; // size=4
        	int pad2; // size=4
        	float gstar; // size=4
        	int maxRefine; // size=4
        	float iniVelx; // size=4
        	float iniVely; // size=4
        	float iniVelz; // size=4
        	Mesh *orgMesh; // size=4
        	Mesh *meshBB; // size=4
        	char surfdataPath[1024]; // size=1024
        	float bbStart[3]; // size=12
        	float bbSize[3]; // size=12
        	Ipo *ipo; // size=4
        	short typeFlags; // size=2
        	char domainNovecgen; // size=1
        	char volumeInitType; // size=1
        	float partSlipValue; // size=4
        	int generateTracers; // size=4
        	float generateParticles; // size=4
        	float surfaceSmoothing; // size=4
        	int surfaceSubdivs; // size=4
        	int flag; // size=4
        	float particleInfSize; // size=4
        	float particleInfAlpha; // size=4
        	float farFieldSize; // size=4
        	FluidVertexVelocity *meshVelocities; // size=4
        	int totvert; // size=4
        	float cpsTimeStart; // size=4
        	float cpsTimeEnd; // size=4
        	float cpsQuality; // size=4
        	float attractforceStrength; // size=4
        	float attractforceRadius; // size=4
        	float velocityforceStrength; // size=4
        	float velocityforceRadius; // size=4
        	int lastgoodframe; // size=4
        	float animRate; // size=4
        }

        World {
        	ID id; // size=0
        	AnimData *adt; // size=4
        	short colormodel; // size=2
        	short totex; // size=2
        	short texact; // size=2
        	short mistype; // size=2
        	float horr; // size=4
        	float horg; // size=4
        	float horb; // size=4
        	float zenr; // size=4
        	float zeng; // size=4
        	float zenb; // size=4
        	float ambr; // size=4
        	float ambg; // size=4
        	float ambb; // size=4
        	float exposure; // size=4
        	float exp; // size=4
        	float range; // size=4
        	float linfac; // size=4
        	float logfac; // size=4
        	float gravity; // size=4
        	float activityBoxRadius; // size=4
        	short skytype; // size=2
        	short mode; // size=2
        	short occlusionRes; // size=2
        	short physicsEngine; // size=2
        	short ticrate; // size=2
        	short maxlogicstep; // size=2
        	short physubstep; // size=2
        	short maxphystep; // size=2
        	float misi; // size=4
        	float miststa; // size=4
        	float mistdist; // size=4
        	float misthi; // size=4
        	float starr; // size=4
        	float starg; // size=4
        	float starb; // size=4
        	float stark; // size=4
        	float starsize; // size=4
        	float starmindist; // size=4
        	float stardist; // size=4
        	float starcolnoise; // size=4
        	short dofsta; // size=2
        	short dofend; // size=2
        	short dofmin; // size=2
        	short dofmax; // size=2
        	float aodist; // size=4
        	float aodistfac; // size=4
        	float aoenergy; // size=4
        	float aobias; // size=4
        	short aomode; // size=2
        	short aosamp; // size=2
        	short aomix; // size=2
        	short aocolor; // size=2
        	float ao_adapt_thresh; // size=4
        	float ao_adapt_speed_fac; // size=4
        	float ao_approx_error; // size=4
        	float ao_approx_correction; // size=4
        	float ao_indirect_energy; // size=4
        	float ao_env_energy; // size=4
        	float ao_pad2; // size=4
        	short ao_indirect_bounces; // size=2
        	short ao_pad; // size=2
        	short ao_samp_method; // size=2
        	short ao_gather_method; // size=2
        	short ao_approx_passes; // size=2
        	short flag; // size=2
        	float *aosphere; // size=4
        	float *aotables; // size=4
        	Ipo *ipo; // size=4
        	MTex *mtex[18]; // size=72
        	short pr_texture; // size=2
        	short use_nodes; // size=2
        	short pad[2]; // size=4
        	PreviewImage *preview; // size=4
        	bNodeTree *nodetree; // size=4
        }

        Base {
        	Base *next; // size=4
        	Base *prev; // size=4
        	int lay; // size=4
        	int selcol; // size=4
        	int flag; // size=4
        	short sx; // size=2
        	short sy; // size=2
        	Object *object; // size=4
        }

        AviCodecData {
        	void *lpFormat; // size=4
        	void *lpParms; // size=4
        	int cbFormat; // size=4
        	int cbParms; // size=4
        	int fccType; // size=4
        	int fccHandler; // size=4
        	int dwKeyFrameEvery; // size=4
        	int dwQuality; // size=4
        	int dwBytesPerSecond; // size=4
        	int dwFlags; // size=4
        	int dwInterleaveEvery; // size=4
        	int pad; // size=4
        	char avicodecname[128]; // size=128
        }

        QuicktimeCodecData {
        	void *cdParms; // size=4
        	void *pad; // size=4
        	int cdSize; // size=4
        	int pad2; // size=4
        	char qtcodecname[128]; // size=128
        }

        QuicktimeCodecSettings {
        	int codecType; // size=4
        	int codecSpatialQuality; // size=4
        	int codec; // size=4
        	int codecFlags; // size=4
        	int colorDepth; // size=4
        	int codecTemporalQuality; // size=4
        	int minSpatialQuality; // size=4
        	int minTemporalQuality; // size=4
        	int keyFrameRate; // size=4
        	int bitRate; // size=4
        	int audiocodecType; // size=4
        	int audioSampleRate; // size=4
        	short audioBitDepth; // size=2
        	short audioChannels; // size=2
        	int audioCodecFlags; // size=4
        	int audioBitRate; // size=4
        	int pad1; // size=4
        }

        FFMpegCodecData {
        	int type; // size=4
        	int codec; // size=4
        	int audio_codec; // size=4
        	int video_bitrate; // size=4
        	int audio_bitrate; // size=4
        	int audio_mixrate; // size=4
        	int audio_channels; // size=4
        	int audio_pad; // size=4
        	float audio_volume; // size=4
        	int gop_size; // size=4
        	int flags; // size=4
        	int rc_min_rate; // size=4
        	int rc_max_rate; // size=4
        	int rc_buffer_size; // size=4
        	int mux_packet_size; // size=4
        	int mux_rate; // size=4
        	IDProperty *properties; // size=4
        }

        AudioData {
        	int mixrate; // size=4
        	float main; // size=4
        	float speed_of_sound; // size=4
        	float doppler_factor; // size=4
        	int distance_model; // size=4
        	short flag; // size=2
        	short pad; // size=2
        	float volume; // size=4
        	float pad2; // size=4
        }

        SceneRenderLayer {
        	SceneRenderLayer *next; // size=4
        	SceneRenderLayer *prev; // size=4
        	char name[64]; // size=64
        	Material *mat_override; // size=4
        	Group *light_override; // size=4
        	int lay; // size=4
        	int lay_zmask; // size=4
        	int lay_exclude; // size=4
        	int layflag; // size=4
        	int passflag; // size=4
        	int pass_xor; // size=4
        	int samples; // size=4
        	float pass_alpha_threshold; // size=4
        	FreestyleConfig freestyleConfig; // size=0
        }

        ImageFormatData {
        	char imtype; // size=1
        	char depth; // size=1
        	char planes; // size=1
        	char flag; // size=1
        	char quality; // size=1
        	char compress; // size=1
        	char exr_codec; // size=1
        	char cineon_flag; // size=1
        	short cineon_white; // size=2
        	short cineon_black; // size=2
        	float cineon_gamma; // size=4
        	char jp2_flag; // size=1
        	char jp2_codec; // size=1
        	char pad[6]; // size=6
        	ColorManagedViewSettings view_settings; // size=0
        	ColorManagedDisplaySettings display_settings; // size=0
        }

        BakeData {
        	ImageFormatData im_format; // size=0
        	char filepath[1024]; // size=1024
        	short width; // size=2
        	short height; // size=2
        	short margin; // size=2
        	short flag; // size=2
        	float cage_extrusion; // size=4
        	float pad2; // size=4
        	char normal_swizzle[3]; // size=3
        	char normal_space; // size=1
        	char save_mode; // size=1
        	char pad[3]; // size=3
        	char cage[64]; // size=64
        }

        RenderData {
        	ImageFormatData im_format; // size=0
        	AviCodecData *avicodecdata; // size=4
        	QuicktimeCodecData *qtcodecdata; // size=4
        	QuicktimeCodecSettings qtcodecsettings; // size=0
        	FFMpegCodecData ffcodecdata; // size=0
        	int cfra; // size=4
        	int sfra; // size=4
        	int efra; // size=4
        	float subframe; // size=4
        	int psfra; // size=4
        	int pefra; // size=4
        	int images; // size=4
        	int framapto; // size=4
        	short flag; // size=2
        	short threads; // size=2
        	float framelen; // size=4
        	float blurfac; // size=4
        	float edgeR; // size=4
        	float edgeG; // size=4
        	float edgeB; // size=4
        	short fullscreen; // size=2
        	short xplay; // size=2
        	short yplay; // size=2
        	short freqplay; // size=2
        	short depth; // size=2
        	short attrib; // size=2
        	int frame_step; // size=4
        	short stereomode; // size=2
        	short dimensionspreset; // size=2
        	short filtertype; // size=2
        	short size; // size=2
        	short maximsize; // size=2
        	short pad6; // size=2
        	int xsch; // size=4
        	int ysch; // size=4
        	short xparts; // size=2
        	short yparts; // size=2
        	int tilex; // size=4
        	int tiley; // size=4
        	short planes; // size=2
        	short imtype; // size=2
        	short subimtype; // size=2
        	short quality; // size=2
        	short displaymode; // size=2
        	char use_lock_interface; // size=1
        	char pad7; // size=1
        	int scemode; // size=4
        	int mode; // size=4
        	int raytrace_options; // size=4
        	short raytrace_structure; // size=2
        	short pad1; // size=2
        	short ocres; // size=2
        	short pad4; // size=2
        	short alphamode; // size=2
        	short osa; // size=2
        	short frs_sec; // size=2
        	short edgeint; // size=2
        	rctf safety; // size=0
        	rctf border; // size=0
        	rcti disprect; // size=0
        	ListBase layers; // size=0
        	short actlay; // size=2
        	short mblur_samples; // size=2
        	float xasp; // size=4
        	float yasp; // size=4
        	float frs_sec_base; // size=4
        	float gauss; // size=4
        	int color_mgt_flag; // size=4
        	float postgamma; // size=4
        	float posthue; // size=4
        	float postsat; // size=4
        	float dither_intensity; // size=4
        	short bake_osa; // size=2
        	short bake_filter; // size=2
        	short bake_mode; // size=2
        	short bake_flag; // size=2
        	short bake_normal_space; // size=2
        	short bake_quad_split; // size=2
        	float bake_maxdist; // size=4
        	float bake_biasdist; // size=4
        	short bake_samples; // size=2
        	short bake_pad; // size=2
        	float bake_user_scale; // size=4
        	float bake_pad1; // size=4
        	char pic[1024]; // size=1024
        	int stamp; // size=4
        	short stamp_font_id; // size=2
        	short pad3; // size=2
        	char stamp_udata[768]; // size=768
        	float fg_stamp[4]; // size=16
        	float bg_stamp[4]; // size=16
        	char seq_prev_type; // size=1
        	char seq_rend_type; // size=1
        	char seq_flag; // size=1
        	char pad5[5]; // size=5
        	int simplify_flag; // size=4
        	short simplify_subsurf; // size=2
        	short simplify_shadowsamples; // size=2
        	float simplify_particles; // size=4
        	float simplify_aosss; // size=4
        	short cineonwhite; // size=2
        	short cineonblack; // size=2
        	float cineongamma; // size=4
        	short jp2_preset; // size=2
        	short jp2_depth; // size=2
        	int rpad3; // size=4
        	short domeres; // size=2
        	short domemode; // size=2
        	short domeangle; // size=2
        	short dometilt; // size=2
        	float domeresbuf; // size=4
        	float pad2; // size=4
        	Text *dometext; // size=4
        	int line_thickness_mode; // size=4
        	float unit_line_thickness; // size=4
        	char engine[32]; // size=32
        	BakeData bake; // size=0
        }

        RenderProfile {
        	RenderProfile *next; // size=4
        	RenderProfile *prev; // size=4
        	char name[32]; // size=32
        	short particle_perc; // size=2
        	short subsurf_max; // size=2
        	short shadbufsample_max; // size=2
        	short pad1; // size=2
        	float ao_error; // size=4
        	float pad2; // size=4
        }

        GameDome {
        	short res; // size=2
        	short mode; // size=2
        	short angle; // size=2
        	short tilt; // size=2
        	float resbuf; // size=4
        	float pad2; // size=4
        	Text *warptext; // size=4
        }

        GameFraming {
        	float col[3]; // size=12
        	char type; // size=1
        	char pad1; // size=1
        	char pad2; // size=1
        	char pad3; // size=1
        }

        RecastData {
        	float cellsize; // size=4
        	float cellheight; // size=4
        	float agentmaxslope; // size=4
        	float agentmaxclimb; // size=4
        	float agentheight; // size=4
        	float agentradius; // size=4
        	float edgemaxlen; // size=4
        	float edgemaxerror; // size=4
        	float regionminsize; // size=4
        	float regionmergesize; // size=4
        	int vertsperpoly; // size=4
        	float detailsampledist; // size=4
        	float detailsamplemaxerror; // size=4
        	short pad1; // size=2
        	short pad2; // size=2
        }

        GameData {
        	GameFraming framing; // size=0
        	short playerflag; // size=2
        	short xplay; // size=2
        	short yplay; // size=2
        	short freqplay; // size=2
        	short depth; // size=2
        	short attrib; // size=2
        	short rt1; // size=2
        	short rt2; // size=2
        	short aasamples; // size=2
        	short pad4[3]; // size=6
        	GameDome dome; // size=0
        	short stereoflag; // size=2
        	short stereomode; // size=2
        	float eyeseparation; // size=4
        	RecastData recastData; // size=0
        	float gravity; // size=4
        	float activityBoxRadius; // size=4
        	int flag; // size=4
        	short mode; // size=2
        	short matmode; // size=2
        	short occlusionRes; // size=2
        	short physicsEngine; // size=2
        	short exitkey; // size=2
        	short vsync; // size=2
        	short ticrate; // size=2
        	short maxlogicstep; // size=2
        	short physubstep; // size=2
        	short maxphystep; // size=2
        	short obstacleSimulation; // size=2
        	short raster_storage; // size=2
        	float levelHeight; // size=4
        	float deactivationtime; // size=4
        	float lineardeactthreshold; // size=4
        	float angulardeactthreshold; // size=4
        	float pad2; // size=4
        }

        TimeMarker {
        	TimeMarker *next; // size=4
        	TimeMarker *prev; // size=4
        	int frame; // size=4
        	char name[64]; // size=64
        	int flag; // size=4
        	Object *camera; // size=4
        }

        Paint {
        	Brush *brush; // size=4
        	void *paint_cursor; // size=4
        	char paint_cursor_col[4]; // size=4
        	int flags; // size=4
        	int num_input_samples; // size=4
        	int symmetry_flags; // size=4
        }

        ImagePaintSettings {
        	Paint paint; // size=0
        	short flag; // size=2
        	short pad; // size=2
        	short seam_bleed; // size=2
        	short normal_angle; // size=2
        	short screen_grab_size[2]; // size=4
        	int pad1; // size=4
        	void *paintcursor; // size=4
        }

        ParticleBrushData {
        	short size; // size=2
        	short step; // size=2
        	short invert; // size=2
        	short count; // size=2
        	int flag; // size=4
        	float strength; // size=4
        }

        ParticleEditSettings {
        	short flag; // size=2
        	short totrekey; // size=2
        	short totaddkey; // size=2
        	short brushtype; // size=2
        	ParticleBrushData brush[7]; // size=0
        	void *paintcursor; // size=4
        	float emitterdist; // size=4
        	float rt; // size=4
        	int selectmode; // size=4
        	int edittype; // size=4
        	int draw_step; // size=4
        	int fade_frames; // size=4
        	Scene *scene; // size=4
        	Object *object; // size=4
        }

        Sculpt {
        	Paint paint; // size=0
        	int flags; // size=4
        	int radial_symm[3]; // size=12
        	float detail_size; // size=4
        	int symmetrize_direction; // size=4
        	float gravity_factor; // size=4
        	float constant_detail; // size=4
        	Object *gravity_object; // size=4
        	void *pad2; // size=4
        }

        UvSculpt {
        	Paint paint; // size=0
        }

        VPaint {
        	Paint paint; // size=0
        	short flag; // size=2
        	short pad; // size=2
        	int tot; // size=4
        	int *vpaint_prev; // size=4
        	MDeformVert *wpaint_prev; // size=4
        	void *paintcursor; // size=4
        }

        TransformOrientation {
        	TransformOrientation *next; // size=4
        	TransformOrientation *prev; // size=4
        	char name[64]; // size=64
        	float mat[3][3]; // size=36
        	int pad; // size=4
        }

        UnifiedPaintSettings {
        	int size; // size=4
        	float unprojected_radius; // size=4
        	float alpha; // size=4
        	float weight; // size=4
        	int flag; // size=4
        	float last_rake[2]; // size=8
        	int pad; // size=4
        	float brush_rotation; // size=4
        	int draw_anchored; // size=4
        	int anchored_size; // size=4
        	float anchored_initial_mouse[2]; // size=8
        	int stroke_active; // size=4
        	float size_pressure_value; // size=4
        	float tex_mouse[2]; // size=8
        	float mask_tex_mouse[2]; // size=8
        	int do_linear_conversion; // size=4
        	ColorSpace *colorspace; // size=4
        	float pixel_radius; // size=4
        	int pad2; // size=4
        }

        MeshStatVis {
        	char type; // size=1
        	char _pad1[2]; // size=2
        	char overhang_axis; // size=1
        	float overhang_min; // size=4
        	float overhang_max; // size=4
        	float thickness_min; // size=4
        	float thickness_max; // size=4
        	char thickness_samples; // size=1
        	char _pad2[3]; // size=3
        	float distort_min; // size=4
        	float distort_max; // size=4
        	float sharp_min; // size=4
        	float sharp_max; // size=4
        }

        ToolSettings {
        	VPaint *vpaint; // size=4
        	VPaint *wpaint; // size=4
        	Sculpt *sculpt; // size=4
        	UvSculpt *uvsculpt; // size=4
        	float vgroup_weight; // size=4
        	float doublimit; // size=4
        	float normalsize; // size=4
        	short automerge; // size=2
        	short selectmode; // size=2
        	char unwrapper; // size=1
        	char uvcalc_flag; // size=1
        	char uv_flag; // size=1
        	char uv_selectmode; // size=1
        	float uvcalc_margin; // size=4
        	short autoik_chainlen; // size=2
        	char gpencil_flags; // size=1
        	char pad[5]; // size=5
        	ImagePaintSettings imapaint; // size=0
        	ParticleEditSettings particle; // size=0
        	float proportional_size; // size=4
        	float select_thresh; // size=4
        	short autokey_mode; // size=2
        	short autokey_flag; // size=2
        	char multires_subdiv_type; // size=1
        	char pad3[1]; // size=1
        	short skgen_resolution; // size=2
        	float skgen_threshold_internal; // size=4
        	float skgen_threshold_external; // size=4
        	float skgen_length_ratio; // size=4
        	float skgen_length_limit; // size=4
        	float skgen_angle_limit; // size=4
        	float skgen_correlation_limit; // size=4
        	float skgen_symmetry_limit; // size=4
        	float skgen_retarget_angle_weight; // size=4
        	float skgen_retarget_length_weight; // size=4
        	float skgen_retarget_distance_weight; // size=4
        	short skgen_options; // size=2
        	char skgen_postpro; // size=1
        	char skgen_postpro_passes; // size=1
        	char skgen_subdivisions[3]; // size=3
        	char skgen_multi_level; // size=1
        	Object *skgen_template; // size=4
        	char bone_sketching; // size=1
        	char bone_sketching_convert; // size=1
        	char skgen_subdivision_number; // size=1
        	char skgen_retarget_options; // size=1
        	char skgen_retarget_roll; // size=1
        	char skgen_side_string[8]; // size=8
        	char skgen_num_string[8]; // size=8
        	char edge_mode; // size=1
        	char edge_mode_live_unwrap; // size=1
        	char snap_mode; // size=1
        	char snap_node_mode; // size=1
        	char snap_uv_mode; // size=1
        	short snap_flag; // size=2
        	short snap_target; // size=2
        	short proportional; // size=2
        	short prop_mode; // size=2
        	char proportional_objects; // size=1
        	char proportional_mask; // size=1
        	char auto_normalize; // size=1
        	char multipaint; // size=1
        	char weightuser; // size=1
        	char vgroupsubset; // size=1
        	int use_uv_sculpt; // size=4
        	int uv_sculpt_settings; // size=4
        	int uv_sculpt_tool; // size=4
        	int uv_relax_method; // size=4
        	short sculpt_paint_settings; // size=2
        	short pad5; // size=2
        	int sculpt_paint_unified_size; // size=4
        	float sculpt_paint_unified_unprojected_radius; // size=4
        	float sculpt_paint_unified_alpha; // size=4
        	UnifiedPaintSettings unified_paint_settings; // size=0
        	MeshStatVis statvis; // size=0
        }

        bStats {
        	int totobj; // size=4
        	int totlamp; // size=4
        	int totobjsel; // size=4
        	int totcurve; // size=4
        	int totmesh; // size=4
        	int totarmature; // size=4
        	int totvert; // size=4
        	int totface; // size=4
        }

        UnitSettings {
        	float scale_length; // size=4
        	char system; // size=1
        	char system_rotation; // size=1
        	short flag; // size=2
        }

        PhysicsSettings {
        	float gravity[3]; // size=12
        	int flag; // size=4
        	int quick_cache_step; // size=4
        	int rt; // size=4
        }

        Scene {
        	ID id; // size=0
        	AnimData *adt; // size=4
        	Object *camera; // size=4
        	World *world; // size=4
        	Scene *set; // size=4
        	ListBase base; // size=0
        	Base *basact; // size=4
        	Object *obedit; // size=4
        	float cursor[3]; // size=12
        	float twcent[3]; // size=12
        	float twmin[3]; // size=12
        	float twmax[3]; // size=12
        	int lay; // size=4
        	int layact; // size=4
        	int lay_updated; // size=4
        	short flag; // size=2
        	char use_nodes; // size=1
        	char pad[1]; // size=1
        	bNodeTree *nodetree; // size=4
        	Editing *ed; // size=4
        	ToolSettings *toolsettings; // size=4
        	SceneStats *stats; // size=4
        	RenderData r; // size=0
        	AudioData audio; // size=0
        	ListBase markers; // size=0
        	ListBase transform_spaces; // size=0
        	void *sound_scene; // size=4
        	void *sound_scene_handle; // size=4
        	void *sound_scrub_handle; // size=4
        	void *speaker_handles; // size=4
        	void *fps_info; // size=4
        	DagForest *theDag; // size=4
        	short dagflags; // size=2
        	short recalc; // size=2
        	int active_keyingset; // size=4
        	ListBase keyingsets; // size=0
        	GameFraming framing; // size=0
        	GameData gm; // size=0
        	UnitSettings unit; // size=0
        	bGPdata *gpd; // size=4
        	PhysicsSettings physics_settings; // size=0
        	MovieClip *clip; // size=4
        	uint64_t customdata_mask; // size=8
        	uint64_t customdata_mask_modal; // size=8
        	ColorManagedViewSettings view_settings; // size=0
        	ColorManagedDisplaySettings display_settings; // size=0
        	ColorManagedColorspaceSettings sequencer_colorspace_settings; // size=0
        	RigidBodyWorld *rigidbody_world; // size=4
        }

        BGpic {
        	BGpic *next; // size=4
        	BGpic *prev; // size=4
        	Image *ima; // size=4
        	ImageUser iuser; // size=0
        	MovieClip *clip; // size=4
        	MovieClipUser cuser; // size=0
        	float xof; // size=4
        	float yof; // size=4
        	float size; // size=4
        	float blend; // size=4
        	short view; // size=2
        	short flag; // size=2
        	short source; // size=2
        	short pad; // size=2
        }

        RegionView3D {
        	float winmat[4][4]; // size=64
        	float viewmat[4][4]; // size=64
        	float viewinv[4][4]; // size=64
        	float persmat[4][4]; // size=64
        	float persinv[4][4]; // size=64
        	float viewmatob[4][4]; // size=64
        	float persmatob[4][4]; // size=64
        	float clip[6][4]; // size=96
        	float clip_local[6][4]; // size=96
        	BoundBox *clipbb; // size=4
        	RegionView3D *localvd; // size=4
        	RenderInfo *ri; // size=4
        	RenderEngine *render_engine; // size=4
        	ViewDepths *depths; // size=4
        	void *gpuoffscreen; // size=4
        	SmoothView3DStore *sms; // size=4
        	wmTimer *smooth_timer; // size=4
        	float twmat[4][4]; // size=64
        	float viewquat[4]; // size=16
        	float dist; // size=4
        	float camdx; // size=4
        	float camdy; // size=4
        	float pixsize; // size=4
        	float ofs[3]; // size=12
        	float camzoom; // size=4
        	char is_persp; // size=1
        	char persp; // size=1
        	char view; // size=1
        	char viewlock; // size=1
        	char viewlock_quad; // size=1
        	char pad[3]; // size=3
        	float ofs_lock[2]; // size=8
        	short twdrawflag; // size=2
        	short rflag; // size=2
        	float lviewquat[4]; // size=16
        	short lpersp; // size=2
        	short lview; // size=2
        	float gridview; // size=4
        	float tw_idot[3]; // size=12
        	float rot_angle; // size=4
        	float rot_axis[3]; // size=12
        }

        View3D {
        	SpaceLink *next; // size=4
        	SpaceLink *prev; // size=4
        	ListBase regionbase; // size=0
        	int spacetype; // size=4
        	float blockscale; // size=4
        	short blockhandler[8]; // size=16
        	float viewquat[4]; // size=16
        	float dist; // size=4
        	float bundle_size; // size=4
        	char bundle_drawtype; // size=1
        	char pad[3]; // size=3
        	int lay_prev; // size=4
        	int lay_used; // size=4
        	short persp; // size=2
        	short view; // size=2
        	Object *camera; // size=4
        	Object *ob_centre; // size=4
        	rctf render_border; // size=0
        	ListBase bgpicbase; // size=0
        	BGpic *bgpic; // size=4
        	View3D *localvd; // size=4
        	char ob_centre_bone[64]; // size=64
        	int lay; // size=4
        	int layact; // size=4
        	short drawtype; // size=2
        	short ob_centre_cursor; // size=2
        	short scenelock; // size=2
        	short around; // size=2
        	short flag; // size=2
        	short flag2; // size=2
        	float lens; // size=4
        	float grid; // size=4
        	float near; // size=4
        	float far; // size=4
        	float ofs[3]; // size=12
        	float cursor[3]; // size=12
        	short matcap_icon; // size=2
        	short gridlines; // size=2
        	short gridsubdiv; // size=2
        	char gridflag; // size=1
        	char twtype; // size=1
        	char twmode; // size=1
        	char twflag; // size=1
        	char pad2[2]; // size=2
        	ListBase afterdraw_transp; // size=0
        	ListBase afterdraw_xray; // size=0
        	ListBase afterdraw_xraytransp; // size=0
        	char zbuf; // size=1
        	char transp; // size=1
        	char xray; // size=1
        	char pad3[5]; // size=5
        	void *properties_storage; // size=4
        	Material *defmaterial; // size=4
        	bGPdata *gpd; // size=4
        }

        View2D {
        	rctf tot; // size=0
        	rctf cur; // size=0
        	rcti vert; // size=0
        	rcti hor; // size=0
        	rcti mask; // size=0
        	float min[2]; // size=8
        	float max[2]; // size=8
        	float minzoom; // size=4
        	float maxzoom; // size=4
        	short scroll; // size=2
        	short scroll_ui; // size=2
        	short keeptot; // size=2
        	short keepzoom; // size=2
        	short keepofs; // size=2
        	short flag; // size=2
        	short align; // size=2
        	short winx; // size=2
        	short winy; // size=2
        	short oldwinx; // size=2
        	short oldwiny; // size=2
        	short around; // size=2
        	float *tab_offset; // size=4
        	int tab_num; // size=4
        	int tab_cur; // size=4
        	SmoothView2DStore *sms; // size=4
        	wmTimer *smooth_timer; // size=4
        }

        SpaceLink {
        	SpaceLink *next; // size=4
        	SpaceLink *prev; // size=4
        	ListBase regionbase; // size=0
        	int spacetype; // size=4
        	float blockscale; // size=4
        	short blockhandler[8]; // size=16
        }

        SpaceInfo {
        	SpaceLink *next; // size=4
        	SpaceLink *prev; // size=4
        	ListBase regionbase; // size=0
        	int spacetype; // size=4
        	float blockscale; // size=4
        	short blockhandler[8]; // size=16
        	char rpt_mask; // size=1
        	char pad[7]; // size=7
        }

        SpaceButs {
        	SpaceLink *next; // size=4
        	SpaceLink *prev; // size=4
        	ListBase regionbase; // size=0
        	int spacetype; // size=4
        	float blockscale; // size=4
        	short blockhandler[8]; // size=16
        	View2D v2d; // size=0
        	short mainb; // size=2
        	short mainbo; // size=2
        	short mainbuser; // size=2
        	short re_align; // size=2
        	short align; // size=2
        	short preview; // size=2
        	short texture_context; // size=2
        	short texture_context_prev; // size=2
        	char flag; // size=1
        	char pad[7]; // size=7
        	void *path; // size=4
        	int pathflag; // size=4
        	int dataicon; // size=4
        	ID *pinid; // size=4
        	void *texuser; // size=4
        }

        SpaceOops {
        	SpaceLink *next; // size=4
        	SpaceLink *prev; // size=4
        	ListBase regionbase; // size=0
        	int spacetype; // size=4
        	float blockscale; // size=4
        	short blockhandler[8]; // size=16
        	View2D v2d; // size=0
        	ListBase tree; // size=0
        	BLI_mempool *treestore; // size=4
        	char search_string[32]; // size=32
        	TreeStoreElem search_tse; // size=0
        	short flag; // size=2
        	short outlinevis; // size=2
        	short storeflag; // size=2
        	short search_flags; // size=2
        	void *treehash; // size=4
        }

        SpaceIpo {
        	SpaceLink *next; // size=4
        	SpaceLink *prev; // size=4
        	ListBase regionbase; // size=0
        	int spacetype; // size=4
        	float blockscale; // size=4
        	short blockhandler[8]; // size=16
        	View2D v2d; // size=0
        	bDopeSheet *ads; // size=4
        	ListBase ghostCurves; // size=0
        	short mode; // size=2
        	short autosnap; // size=2
        	int flag; // size=4
        	float cursorVal; // size=4
        	int around; // size=4
        }

        SpaceNla {
        	SpaceLink *next; // size=4
        	SpaceLink *prev; // size=4
        	ListBase regionbase; // size=0
        	int spacetype; // size=4
        	float blockscale; // size=4
        	short blockhandler[8]; // size=16
        	short autosnap; // size=2
        	short flag; // size=2
        	int pad; // size=4
        	bDopeSheet *ads; // size=4
        	View2D v2d; // size=0
        }

        SpaceTimeCache {
        	SpaceTimeCache *next; // size=4
        	SpaceTimeCache *prev; // size=4
        	float *array; // size=4
        }

        SpaceTime {
        	SpaceLink *next; // size=4
        	SpaceLink *prev; // size=4
        	ListBase regionbase; // size=0
        	int spacetype; // size=4
        	float blockscale; // size=4
        	View2D v2d; // size=0
        	ListBase caches; // size=0
        	int cache_display; // size=4
        	int flag; // size=4
        }

        SpaceSeq {
        	SpaceLink *next; // size=4
        	SpaceLink *prev; // size=4
        	ListBase regionbase; // size=0
        	int spacetype; // size=4
        	float blockscale; // size=4
        	short blockhandler[8]; // size=16
        	View2D v2d; // size=0
        	float xof; // size=4
        	float yof; // size=4
        	short mainb; // size=2
        	short render_size; // size=2
        	short chanshown; // size=2
        	short zebra; // size=2
        	int flag; // size=4
        	float zoom; // size=4
        	int view; // size=4
        	int overlay_type; // size=4
        	bGPdata *gpd; // size=4
        	SequencerScopes scopes; // size=0
        }

        MaskSpaceInfo {
        	Mask *mask; // size=4
        	char draw_flag; // size=1
        	char draw_type; // size=1
        	char overlay_mode; // size=1
        	char pad3[5]; // size=5
        }

        FileSelectParams {
        	char title[96]; // size=96
        	char dir[1056]; // size=1056
        	char file[256]; // size=256
        	char renamefile[256]; // size=256
        	char renameedit[256]; // size=256
        	char filter_glob[64]; // size=64
        	int active_file; // size=4
        	int sel_first; // size=4
        	int sel_last; // size=4
        	short type; // size=2
        	short flag; // size=2
        	short sort; // size=2
        	short display; // size=2
        	short filter; // size=2
        	short f_fp; // size=2
        	char fp_str[8]; // size=8
        }

        SpaceFile {
        	SpaceLink *next; // size=4
        	SpaceLink *prev; // size=4
        	ListBase regionbase; // size=0
        	int spacetype; // size=4
        	int scroll_offset; // size=4
        	FileSelectParams *params; // size=4
        	FileList *files; // size=4
        	ListBase *folders_prev; // size=4
        	ListBase *folders_next; // size=4
        	wmOperator *op; // size=4
        	wmTimer *smoothscroll_timer; // size=4
        	FileLayout *layout; // size=4
        	short recentnr; // size=2
        	short bookmarknr; // size=2
        	short systemnr; // size=2
        	short pad2; // size=2
        }

        SpaceImage {
        	SpaceLink *next; // size=4
        	SpaceLink *prev; // size=4
        	ListBase regionbase; // size=0
        	int spacetype; // size=4
        	int flag; // size=4
        	Image *image; // size=4
        	ImageUser iuser; // size=0
        	CurveMapping *cumap; // size=4
        	Scopes scopes; // size=0
        	Histogram sample_line_hist; // size=0
        	bGPdata *gpd; // size=4
        	float cursor[2]; // size=8
        	float xof; // size=4
        	float yof; // size=4
        	float zoom; // size=4
        	float centx; // size=4
        	float centy; // size=4
        	char mode; // size=1
        	char pin; // size=1
        	short pad; // size=2
        	short curtile; // size=2
        	short lock; // size=2
        	char dt_uv; // size=1
        	char sticky; // size=1
        	char dt_uvstretch; // size=1
        	char around; // size=1
        	MaskSpaceInfo mask_info; // size=0
        }

        SpaceText {
        	SpaceLink *next; // size=4
        	SpaceLink *prev; // size=4
        	ListBase regionbase; // size=0
        	int spacetype; // size=4
        	float blockscale; // size=4
        	short blockhandler[8]; // size=16
        	Text *text; // size=4
        	int top; // size=4
        	int viewlines; // size=4
        	short flags; // size=2
        	short menunr; // size=2
        	short lheight; // size=2
        	char cwidth; // size=1
        	char linenrs_tot; // size=1
        	int left; // size=4
        	int showlinenrs; // size=4
        	int tabnumber; // size=4
        	short showsyntax; // size=2
        	short line_hlight; // size=2
        	short overwrite; // size=2
        	short live_edit; // size=2
        	float pix_per_line; // size=4
        	rcti txtscroll; // size=0
        	rcti txtbar; // size=0
        	int wordwrap; // size=4
        	int doplugins; // size=4
        	char findstr[256]; // size=256
        	char replacestr[256]; // size=256
        	short margin_column; // size=2
        	short lheight_dpi; // size=2
        	char pad[4]; // size=4
        	void *drawcache; // size=4
        	float scroll_accum[2]; // size=8
        }

        Script {
        	ID id; // size=0
        	void *py_draw; // size=4
        	void *py_event; // size=4
        	void *py_button; // size=4
        	void *py_browsercallback; // size=4
        	void *py_globaldict; // size=4
        	int flags; // size=4
        	int lastspace; // size=4
        	char scriptname[1024]; // size=1024
        	char scriptarg[256]; // size=256
        }

        SpaceScript {
        	SpaceLink *next; // size=4
        	SpaceLink *prev; // size=4
        	ListBase regionbase; // size=0
        	int spacetype; // size=4
        	float blockscale; // size=4
        	Script *script; // size=4
        	short flags; // size=2
        	short menunr; // size=2
        	int pad1; // size=4
        	void *but_refs; // size=4
        }

        bNodeTreePath {
        	bNodeTreePath *next; // size=4
        	bNodeTreePath *prev; // size=4
        	bNodeTree *nodetree; // size=4
        	bNodeInstanceKey parent_key; // size=0
        	int pad; // size=4
        	float view_center[2]; // size=8
        	char node_name[64]; // size=64
        }

        SpaceNode {
        	SpaceLink *next; // size=4
        	SpaceLink *prev; // size=4
        	ListBase regionbase; // size=0
        	int spacetype; // size=4
        	float blockscale; // size=4
        	short blockhandler[8]; // size=16
        	View2D v2d; // size=0
        	ID *id; // size=4
        	ID *from; // size=4
        	short flag; // size=2
        	short pad1; // size=2
        	float aspect; // size=4
        	float pad2; // size=4
        	float xof; // size=4
        	float yof; // size=4
        	float zoom; // size=4
        	float cursor[2]; // size=8
        	ListBase treepath; // size=0
        	bNodeTree *nodetree; // size=4
        	bNodeTree *edittree; // size=4
        	char tree_idname[64]; // size=64
        	int treetype; // size=4
        	int pad3; // size=4
        	short texfrom; // size=2
        	short shaderfrom; // size=2
        	short recalc; // size=2
        	short pad4; // size=2
        	ListBase linkdrag; // size=0
        	bGPdata *gpd; // size=4
        }

        SpaceLogic {
        	SpaceLink *next; // size=4
        	SpaceLink *prev; // size=4
        	ListBase regionbase; // size=0
        	int spacetype; // size=4
        	float blockscale; // size=4
        	short blockhandler[8]; // size=16
        	short flag; // size=2
        	short scaflag; // size=2
        	int pad; // size=4
        	bGPdata *gpd; // size=4
        }

        ConsoleLine {
        	ConsoleLine *next; // size=4
        	ConsoleLine *prev; // size=4
        	int len_alloc; // size=4
        	int len; // size=4
        	char *line; // size=4
        	int cursor; // size=4
        	int type; // size=4
        }

        SpaceConsole {
        	SpaceLink *next; // size=4
        	SpaceLink *prev; // size=4
        	ListBase regionbase; // size=0
        	int spacetype; // size=4
        	float blockscale; // size=4
        	short blockhandler[8]; // size=16
        	int lheight; // size=4
        	int pad; // size=4
        	ListBase scrollback; // size=0
        	ListBase history; // size=0
        	char prompt[256]; // size=256
        	char language[32]; // size=32
        	int sel_start; // size=4
        	int sel_end; // size=4
        }

        SpaceUserPref {
        	SpaceLink *next; // size=4
        	SpaceLink *prev; // size=4
        	ListBase regionbase; // size=0
        	int spacetype; // size=4
        	char pad[3]; // size=3
        	char filter_type; // size=1
        	char filter[64]; // size=64
        }

        SpaceClip {
        	SpaceLink *next; // size=4
        	SpaceLink *prev; // size=4
        	ListBase regionbase; // size=0
        	int spacetype; // size=4
        	float xof; // size=4
        	float yof; // size=4
        	float xlockof; // size=4
        	float ylockof; // size=4
        	float zoom; // size=4
        	MovieClipUser user; // size=0
        	MovieClip *clip; // size=4
        	MovieClipScopes scopes; // size=0
        	int flag; // size=4
        	short mode; // size=2
        	short view; // size=2
        	int path_length; // size=4
        	float loc[2]; // size=8
        	float scale; // size=4
        	float angle; // size=4
        	int pad; // size=4
        	float stabmat[4][4]; // size=64
        	float unistabmat[4][4]; // size=64
        	int postproc_flag; // size=4
        	short gpencil_src; // size=2
        	short pad2; // size=2
        	int around; // size=4
        	int pad4; // size=4
        	float cursor[2]; // size=8
        	MaskSpaceInfo mask_info; // size=0
        }

        uiFont {
        	uiFont *next; // size=4
        	uiFont *prev; // size=4
        	char filename[1024]; // size=1024
        	short blf_id; // size=2
        	short uifont_id; // size=2
        	short r_to_l; // size=2
        	short hinting; // size=2
        }

        uiFontStyle {
        	short uifont_id; // size=2
        	short points; // size=2
        	short kerning; // size=2
        	char pad[6]; // size=6
        	short italic; // size=2
        	short bold; // size=2
        	short shadow; // size=2
        	short shadx; // size=2
        	short shady; // size=2
        	short align; // size=2
        	float shadowalpha; // size=4
        	float shadowcolor; // size=4
        }

        uiStyle {
        	uiStyle *next; // size=4
        	uiStyle *prev; // size=4
        	char name[64]; // size=64
        	uiFontStyle paneltitle; // size=0
        	uiFontStyle grouplabel; // size=0
        	uiFontStyle widgetlabel; // size=0
        	uiFontStyle widget; // size=0
        	float panelzoom; // size=4
        	short minlabelchars; // size=2
        	short minwidgetchars; // size=2
        	short columnspace; // size=2
        	short templatespace; // size=2
        	short boxspace; // size=2
        	short buttonspacex; // size=2
        	short buttonspacey; // size=2
        	short panelspace; // size=2
        	short panelouter; // size=2
        	short pad; // size=2
        }

        uiWidgetColors {
        	char outline[4]; // size=4
        	char inner[4]; // size=4
        	char inner_sel[4]; // size=4
        	char item[4]; // size=4
        	char text[4]; // size=4
        	char text_sel[4]; // size=4
        	short shaded; // size=2
        	short shadetop; // size=2
        	short shadedown; // size=2
        	short alpha_check; // size=2
        }

        uiWidgetStateColors {
        	char inner_anim[4]; // size=4
        	char inner_anim_sel[4]; // size=4
        	char inner_key[4]; // size=4
        	char inner_key_sel[4]; // size=4
        	char inner_driven[4]; // size=4
        	char inner_driven_sel[4]; // size=4
        	float blend; // size=4
        	float pad; // size=4
        }

        uiPanelColors {
        	char header[4]; // size=4
        	char back[4]; // size=4
        	short show_header; // size=2
        	short show_back; // size=2
        	int pad; // size=4
        }

        uiGradientColors {
        	char gradient[4]; // size=4
        	char high_gradient[4]; // size=4
        	int show_grad; // size=4
        	int pad2; // size=4
        }

        ThemeUI {
        	uiWidgetColors wcol_regular; // size=0
        	uiWidgetColors wcol_tool; // size=0
        	uiWidgetColors wcol_text; // size=0
        	uiWidgetColors wcol_radio; // size=0
        	uiWidgetColors wcol_option; // size=0
        	uiWidgetColors wcol_toggle; // size=0
        	uiWidgetColors wcol_num; // size=0
        	uiWidgetColors wcol_numslider; // size=0
        	uiWidgetColors wcol_menu; // size=0
        	uiWidgetColors wcol_pulldown; // size=0
        	uiWidgetColors wcol_menu_back; // size=0
        	uiWidgetColors wcol_menu_item; // size=0
        	uiWidgetColors wcol_tooltip; // size=0
        	uiWidgetColors wcol_box; // size=0
        	uiWidgetColors wcol_scroll; // size=0
        	uiWidgetColors wcol_progress; // size=0
        	uiWidgetColors wcol_list_item; // size=0
        	uiWidgetStateColors wcol_state; // size=0
        	uiPanelColors panel; // size=0
        	float menu_shadow_fac; // size=4
        	short menu_shadow_width; // size=2
        	short pad; // size=2
        	char iconfile[256]; // size=256
        	float icon_alpha; // size=4
        	char xaxis[4]; // size=4
        	char yaxis[4]; // size=4
        	char zaxis[4]; // size=4
        }

        ThemeSpace {
        	char back[4]; // size=4
        	char title[4]; // size=4
        	char text[4]; // size=4
        	char text_hi[4]; // size=4
        	char header[4]; // size=4
        	char header_title[4]; // size=4
        	char header_text[4]; // size=4
        	char header_text_hi[4]; // size=4
        	char tab_active[4]; // size=4
        	char tab_inactive[4]; // size=4
        	char tab_back[4]; // size=4
        	char tab_outline[4]; // size=4
        	char button[4]; // size=4
        	char button_title[4]; // size=4
        	char button_text[4]; // size=4
        	char button_text_hi[4]; // size=4
        	char list[4]; // size=4
        	char list_title[4]; // size=4
        	char list_text[4]; // size=4
        	char list_text_hi[4]; // size=4
        	uiPanelColors panelcolors; // size=0
        	uiGradientColors gradients; // size=0
        	char shade1[4]; // size=4
        	char shade2[4]; // size=4
        	char hilite[4]; // size=4
        	char grid[4]; // size=4
        	char view_overlay[4]; // size=4
        	char wire[4]; // size=4
        	char wire_edit[4]; // size=4
        	char select[4]; // size=4
        	char lamp[4]; // size=4
        	char speaker[4]; // size=4
        	char empty[4]; // size=4
        	char camera[4]; // size=4
        	char active[4]; // size=4
        	char group[4]; // size=4
        	char group_active[4]; // size=4
        	char transform[4]; // size=4
        	char vertex[4]; // size=4
        	char vertex_select[4]; // size=4
        	char vertex_unreferenced[4]; // size=4
        	char edge[4]; // size=4
        	char edge_select[4]; // size=4
        	char edge_seam[4]; // size=4
        	char edge_sharp[4]; // size=4
        	char edge_facesel[4]; // size=4
        	char edge_crease[4]; // size=4
        	char face[4]; // size=4
        	char face_select[4]; // size=4
        	char face_dot[4]; // size=4
        	char extra_edge_len[4]; // size=4
        	char extra_edge_angle[4]; // size=4
        	char extra_face_angle[4]; // size=4
        	char extra_face_area[4]; // size=4
        	char normal[4]; // size=4
        	char vertex_normal[4]; // size=4
        	char bone_solid[4]; // size=4
        	char bone_pose[4]; // size=4
        	char bone_pose_active[4]; // size=4
        	char strip[4]; // size=4
        	char strip_select[4]; // size=4
        	char cframe[4]; // size=4
        	char freestyle_edge_mark[4]; // size=4
        	char freestyle_face_mark[4]; // size=4
        	char nurb_uline[4]; // size=4
        	char nurb_vline[4]; // size=4
        	char act_spline[4]; // size=4
        	char nurb_sel_uline[4]; // size=4
        	char nurb_sel_vline[4]; // size=4
        	char lastsel_point[4]; // size=4
        	char handle_free[4]; // size=4
        	char handle_auto[4]; // size=4
        	char handle_vect[4]; // size=4
        	char handle_align[4]; // size=4
        	char handle_auto_clamped[4]; // size=4
        	char handle_sel_free[4]; // size=4
        	char handle_sel_auto[4]; // size=4
        	char handle_sel_vect[4]; // size=4
        	char handle_sel_align[4]; // size=4
        	char handle_sel_auto_clamped[4]; // size=4
        	char ds_channel[4]; // size=4
        	char ds_subchannel[4]; // size=4
        	char keytype_keyframe[4]; // size=4
        	char keytype_extreme[4]; // size=4
        	char keytype_breakdown[4]; // size=4
        	char keytype_jitter[4]; // size=4
        	char keytype_keyframe_select[4]; // size=4
        	char keytype_extreme_select[4]; // size=4
        	char keytype_breakdown_select[4]; // size=4
        	char keytype_jitter_select[4]; // size=4
        	char keyborder[4]; // size=4
        	char keyborder_select[4]; // size=4
        	char console_output[4]; // size=4
        	char console_input[4]; // size=4
        	char console_info[4]; // size=4
        	char console_error[4]; // size=4
        	char console_cursor[4]; // size=4
        	char console_select[4]; // size=4
        	char pad1[4]; // size=4
        	char vertex_size; // size=1
        	char outline_width; // size=1
        	char facedot_size; // size=1
        	char noodle_curving; // size=1
        	char syntaxl[4]; // size=4
        	char syntaxs[4]; // size=4
        	char syntaxb[4]; // size=4
        	char syntaxn[4]; // size=4
        	char syntaxv[4]; // size=4
        	char syntaxc[4]; // size=4
        	char syntaxd[4]; // size=4
        	char syntaxr[4]; // size=4
        	char nodeclass_output[4]; // size=4
        	char nodeclass_filter[4]; // size=4
        	char nodeclass_vector[4]; // size=4
        	char nodeclass_texture[4]; // size=4
        	char nodeclass_shader[4]; // size=4
        	char nodeclass_script[4]; // size=4
        	char nodeclass_pattern[4]; // size=4
        	char nodeclass_layout[4]; // size=4
        	char movie[4]; // size=4
        	char movieclip[4]; // size=4
        	char mask[4]; // size=4
        	char image[4]; // size=4
        	char scene[4]; // size=4
        	char audio[4]; // size=4
        	char effect[4]; // size=4
        	char transition[4]; // size=4
        	char meta[4]; // size=4
        	char editmesh_active[4]; // size=4
        	char handle_vertex[4]; // size=4
        	char handle_vertex_select[4]; // size=4
        	char pad2[4]; // size=4
        	char handle_vertex_size; // size=1
        	char marker_outline[4]; // size=4
        	char marker[4]; // size=4
        	char act_marker[4]; // size=4
        	char sel_marker[4]; // size=4
        	char dis_marker[4]; // size=4
        	char lock_marker[4]; // size=4
        	char bundle_solid[4]; // size=4
        	char path_before[4]; // size=4
        	char path_after[4]; // size=4
        	char camera_path[4]; // size=4
        	char hpad[3]; // size=3
        	char preview_back[4]; // size=4
        	char preview_stitch_face[4]; // size=4
        	char preview_stitch_edge[4]; // size=4
        	char preview_stitch_vert[4]; // size=4
        	char preview_stitch_stitchable[4]; // size=4
        	char preview_stitch_unstitchable[4]; // size=4
        	char preview_stitch_active[4]; // size=4
        	char uv_shadow[4]; // size=4
        	char uv_others[4]; // size=4
        	char match[4]; // size=4
        	char selected_highlight[4]; // size=4
        	char skin_root[4]; // size=4
        	char anim_active[4]; // size=4
        	char anim_non_active[4]; // size=4
        	char nla_tweaking[4]; // size=4
        	char nla_tweakdupli[4]; // size=4
        	char nla_transition[4]; // size=4
        	char nla_transition_sel[4]; // size=4
        	char nla_meta[4]; // size=4
        	char nla_meta_sel[4]; // size=4
        	char nla_sound[4]; // size=4
        	char nla_sound_sel[4]; // size=4
        	char info_selected[4]; // size=4
        	char info_selected_text[4]; // size=4
        	char info_error[4]; // size=4
        	char info_error_text[4]; // size=4
        	char info_warning[4]; // size=4
        	char info_warning_text[4]; // size=4
        	char info_info[4]; // size=4
        	char info_info_text[4]; // size=4
        	char info_debug[4]; // size=4
        	char info_debug_text[4]; // size=4
        }

        ThemeWireColor {
        	char solid[4]; // size=4
        	char select[4]; // size=4
        	char active[4]; // size=4
        	short flag; // size=2
        	short pad; // size=2
        }

        bTheme {
        	bTheme *next; // size=4
        	bTheme *prev; // size=4
        	char name[32]; // size=32
        	ThemeUI tui; // size=0
        	ThemeSpace tbuts; // size=0
        	ThemeSpace tv3d; // size=0
        	ThemeSpace tfile; // size=0
        	ThemeSpace tipo; // size=0
        	ThemeSpace tinfo; // size=0
        	ThemeSpace tact; // size=0
        	ThemeSpace tnla; // size=0
        	ThemeSpace tseq; // size=0
        	ThemeSpace tima; // size=0
        	ThemeSpace text; // size=0
        	ThemeSpace toops; // size=0
        	ThemeSpace ttime; // size=0
        	ThemeSpace tnode; // size=0
        	ThemeSpace tlogic; // size=0
        	ThemeSpace tuserpref; // size=0
        	ThemeSpace tconsole; // size=0
        	ThemeSpace tclip; // size=0
        	ThemeWireColor tarm[20]; // size=0
        	int active_theme_area; // size=4
        	int pad; // size=4
        }

        bAddon {
        	bAddon *next; // size=4
        	bAddon *prev; // size=4
        	char module[64]; // size=64
        	IDProperty *prop; // size=4
        }

        bPathCompare {
        	bPathCompare *next; // size=4
        	bPathCompare *prev; // size=4
        	char path[768]; // size=768
        	char flag; // size=1
        	char pad[7]; // size=7
        }

        SolidLight {
        	int flag; // size=4
        	int pad; // size=4
        	float col[4]; // size=16
        	float spec[4]; // size=16
        	float vec[4]; // size=16
        }

        WalkNavigation {
        	float mouse_speed; // size=4
        	float walk_speed; // size=4
        	float walk_speed_factor; // size=4
        	float view_height; // size=4
        	float jump_height; // size=4
        	float teleport_time; // size=4
        	short flag; // size=2
        	short pad[3]; // size=6
        }

        UserDef {
        	int versionfile; // size=4
        	int subversionfile; // size=4
        	int flag; // size=4
        	int dupflag; // size=4
        	int savetime; // size=4
        	char tempdir[768]; // size=768
        	char fontdir[768]; // size=768
        	char renderdir[1024]; // size=1024
        	char textudir[768]; // size=768
        	char pythondir[768]; // size=768
        	char sounddir[768]; // size=768
        	char i18ndir[768]; // size=768
        	char image_editor[1024]; // size=1024
        	char anim_player[1024]; // size=1024
        	int anim_player_preset; // size=4
        	short v2d_min_gridsize; // size=2
        	short timecode_style; // size=2
        	short versions; // size=2
        	short dbl_click_time; // size=2
        	short gameflags; // size=2
        	short wheellinescroll; // size=2
        	int uiflag; // size=4
        	int uiflag2; // size=4
        	int language; // size=4
        	short userpref; // size=2
        	short viewzoom; // size=2
        	int mixbufsize; // size=4
        	int audiodevice; // size=4
        	int audiorate; // size=4
        	int audioformat; // size=4
        	int audiochannels; // size=4
        	int scrollback; // size=4
        	int dpi; // size=4
        	short encoding; // size=2
        	short transopts; // size=2
        	short menuthreshold1; // size=2
        	short menuthreshold2; // size=2
        	ListBase themes; // size=0
        	ListBase uifonts; // size=0
        	ListBase uistyles; // size=0
        	ListBase keymaps; // size=0
        	ListBase user_keymaps; // size=0
        	ListBase addons; // size=0
        	ListBase autoexec_paths; // size=0
        	char keyconfigstr[64]; // size=64
        	short undosteps; // size=2
        	short undomemory; // size=2
        	short gp_manhattendist; // size=2
        	short gp_euclideandist; // size=2
        	short gp_eraser; // size=2
        	short gp_settings; // size=2
        	short tb_leftmouse; // size=2
        	short tb_rightmouse; // size=2
        	SolidLight light[3]; // size=0
        	short tw_hotspot; // size=2
        	short tw_flag; // size=2
        	short tw_handlesize; // size=2
        	short tw_size; // size=2
        	short textimeout; // size=2
        	short texcollectrate; // size=2
        	short wmdrawmethod; // size=2
        	short dragthreshold; // size=2
        	int memcachelimit; // size=4
        	int prefetchframes; // size=4
        	short frameserverport; // size=2
        	short pad_rot_angle; // size=2
        	short obcenter_dia; // size=2
        	short rvisize; // size=2
        	short rvibright; // size=2
        	short recent_files; // size=2
        	short smooth_viewtx; // size=2
        	short glreslimit; // size=2
        	short curssize; // size=2
        	short color_picker_type; // size=2
        	char ipo_new; // size=1
        	char keyhandles_new; // size=1
        	char pad1[2]; // size=2
        	short scrcastfps; // size=2
        	short scrcastwait; // size=2
        	short widget_unit; // size=2
        	short anisotropic_filter; // size=2
        	short use_16bit_textures; // size=2
        	short use_gpu_mipmap; // size=2
        	float ndof_sensitivity; // size=4
        	float ndof_orbit_sensitivity; // size=4
        	int ndof_flag; // size=4
        	short ogl_multisamples; // size=2
        	short image_draw_method; // size=2
        	float glalphaclip; // size=4
        	short autokey_mode; // size=2
        	short autokey_flag; // size=2
        	short text_render; // size=2
        	short pad9; // size=2
        	ColorBand coba_weight; // size=0
        	float sculpt_paint_overlay_col[3]; // size=12
        	float gpencil_new_layer_col[4]; // size=16
        	short tweak_threshold; // size=2
        	char navigation_mode; // size=1
        	char pad; // size=1
        	char author[80]; // size=80
        	int compute_device_type; // size=4
        	int compute_device_id; // size=4
        	float fcu_inactive_alpha; // size=4
        	float pixelsize; // size=4
        	WalkNavigation walk_navigation; // size=0
        }

        bScreen {
        	ID id; // size=0
        	ListBase vertbase; // size=0
        	ListBase edgebase; // size=0
        	ListBase areabase; // size=0
        	ListBase regionbase; // size=0
        	Scene *scene; // size=4
        	Scene *newscene; // size=4
        	int redraws_flag; // size=4
        	int pad1; // size=4
        	short full; // size=2
        	short temp; // size=2
        	short winid; // size=2
        	short do_draw; // size=2
        	short do_refresh; // size=2
        	short do_draw_gesture; // size=2
        	short do_draw_paintcursor; // size=2
        	short do_draw_drag; // size=2
        	short swap; // size=2
        	short mainwin; // size=2
        	short subwinactive; // size=2
        	short pad; // size=2
        	wmTimer *animtimer; // size=4
        	void *context; // size=4
        }

        ScrVert {
        	ScrVert *next; // size=4
        	ScrVert *prev; // size=4
        	ScrVert *newv; // size=4
        	vec2s vec; // size=0
        	short flag; // size=2
        	short editflag; // size=2
        }

        ScrEdge {
        	ScrEdge *next; // size=4
        	ScrEdge *prev; // size=4
        	ScrVert *v1; // size=4
        	ScrVert *v2; // size=4
        	short border; // size=2
        	short flag; // size=2
        	int pad; // size=4
        }

        Panel {
        	Panel *next; // size=4
        	Panel *prev; // size=4
        	PanelType *type; // size=4
        	uiLayout *layout; // size=4
        	char panelname[64]; // size=64
        	char tabname[64]; // size=64
        	char drawname[64]; // size=64
        	int ofsx; // size=4
        	int ofsy; // size=4
        	int sizex; // size=4
        	int sizey; // size=4
        	short labelofs; // size=2
        	short pad; // size=2
        	short flag; // size=2
        	short runtime_flag; // size=2
        	short control; // size=2
        	short snap; // size=2
        	int sortorder; // size=4
        	Panel *paneltab; // size=4
        	void *activedata; // size=4
        }

        PanelCategoryStack {
        	PanelCategoryStack *next; // size=4
        	PanelCategoryStack *prev; // size=4
        	char idname[64]; // size=64
        }

        uiList {
        	uiList *next; // size=4
        	uiList *prev; // size=4
        	uiListType *type; // size=4
        	char list_id[64]; // size=64
        	int layout_type; // size=4
        	int flag; // size=4
        	int list_scroll; // size=4
        	int list_grip; // size=4
        	int list_last_len; // size=4
        	int list_last_activei; // size=4
        	char filter_byname[64]; // size=64
        	int filter_flag; // size=4
        	int filter_sort_flag; // size=4
        	IDProperty *properties; // size=4
        	uiListDyn *dyn_data; // size=4
        }

        uiPreview {
        	uiPreview *next; // size=4
        	uiPreview *prev; // size=4
        	char preview_id[64]; // size=64
        	short height; // size=2
        	short pad1[3]; // size=6
        }

        ScrArea {
        	ScrArea *next; // size=4
        	ScrArea *prev; // size=4
        	ScrVert *v1; // size=4
        	ScrVert *v2; // size=4
        	ScrVert *v3; // size=4
        	ScrVert *v4; // size=4
        	bScreen *full; // size=4
        	rcti totrct; // size=0
        	char spacetype; // size=1
        	char butspacetype; // size=1
        	short winx; // size=2
        	short winy; // size=2
        	short headertype; // size=2
        	short do_refresh; // size=2
        	short flag; // size=2
        	short region_active_win; // size=2
        	char temp; // size=1
        	char pad; // size=1
        	SpaceType *type; // size=4
        	ListBase spacedata; // size=0
        	ListBase regionbase; // size=0
        	ListBase handlers; // size=0
        	ListBase actionzones; // size=0
        }

        ARegion {
        	ARegion *next; // size=4
        	ARegion *prev; // size=4
        	View2D v2d; // size=0
        	rcti winrct; // size=0
        	rcti drawrct; // size=0
        	short winx; // size=2
        	short winy; // size=2
        	short swinid; // size=2
        	short regiontype; // size=2
        	short alignment; // size=2
        	short flag; // size=2
        	float fsize; // size=4
        	short sizex; // size=2
        	short sizey; // size=2
        	short do_draw; // size=2
        	short do_draw_overlay; // size=2
        	short swap; // size=2
        	short overlap; // size=2
        	short pad[2]; // size=4
        	ARegionType *type; // size=4
        	ListBase uiblocks; // size=0
        	ListBase panels; // size=0
        	ListBase panels_category_active; // size=0
        	ListBase ui_lists; // size=0
        	ListBase ui_previews; // size=0
        	ListBase handlers; // size=0
        	ListBase panels_category; // size=0
        	wmTimer *regiontimer; // size=4
        	char *headerstr; // size=4
        	void *regiondata; // size=4
        }

        FileGlobal {
        	char subvstr[4]; // size=4
        	short subversion; // size=2
        	short pads; // size=2
        	short minversion; // size=2
        	short minsubversion; // size=2
        	short displaymode; // size=2
        	short winpos; // size=2
        	bScreen *curscreen; // size=4
        	Scene *curscene; // size=4
        	int fileflags; // size=4
        	int globalf; // size=4
        	uint64_t build_commit_timestamp; // size=8
        	char build_hash[16]; // size=16
        	char filename[1024]; // size=1024
        }

        StripElem {
        	char name[256]; // size=256
        	int orig_width; // size=4
        	int orig_height; // size=4
        }

        StripCrop {
        	int top; // size=4
        	int bottom; // size=4
        	int left; // size=4
        	int right; // size=4
        }

        StripTransform {
        	int xofs; // size=4
        	int yofs; // size=4
        }

        StripColorBalance {
        	float lift[3]; // size=12
        	float gamma[3]; // size=12
        	float gain[3]; // size=12
        	int flag; // size=4
        	int pad; // size=4
        }

        StripProxy {
        	char dir[768]; // size=768
        	char file[256]; // size=256
        	anim *anim; // size=4
        	short tc; // size=2
        	short quality; // size=2
        	short build_size_flags; // size=2
        	short build_tc_flags; // size=2
        }

        Strip {
        	Strip *next; // size=4
        	Strip *prev; // size=4
        	int us; // size=4
        	int done; // size=4
        	int startstill; // size=4
        	int endstill; // size=4
        	StripElem *stripdata; // size=4
        	char dir[768]; // size=768
        	StripProxy *proxy; // size=4
        	StripCrop *crop; // size=4
        	StripTransform *transform; // size=4
        	StripColorBalance *color_balance; // size=4
        	ColorManagedColorspaceSettings colorspace_settings; // size=0
        }

        Sequence {
        	Sequence *next; // size=4
        	Sequence *prev; // size=4
        	void *tmp; // size=4
        	void *lib; // size=4
        	char name[64]; // size=64
        	int flag; // size=4
        	int type; // size=4
        	int len; // size=4
        	int start; // size=4
        	int startofs; // size=4
        	int endofs; // size=4
        	int startstill; // size=4
        	int endstill; // size=4
        	int machine; // size=4
        	int depth; // size=4
        	int startdisp; // size=4
        	int enddisp; // size=4
        	float sat; // size=4
        	float mul; // size=4
        	float handsize; // size=4
        	short anim_preseek; // size=2
        	short streamindex; // size=2
        	int multicam_source; // size=4
        	int clip_flag; // size=4
        	Strip *strip; // size=4
        	Ipo *ipo; // size=4
        	Scene *scene; // size=4
        	Object *scene_camera; // size=4
        	MovieClip *clip; // size=4
        	Mask *mask; // size=4
        	anim *anim; // size=4
        	float effect_fader; // size=4
        	float speed_fader; // size=4
        	Sequence *seq1; // size=4
        	Sequence *seq2; // size=4
        	Sequence *seq3; // size=4
        	ListBase seqbase; // size=0
        	bSound *sound; // size=4
        	void *scene_sound; // size=4
        	float volume; // size=4
        	float pitch; // size=4
        	float pan; // size=4
        	float strobe; // size=4
        	void *effectdata; // size=4
        	int anim_startofs; // size=4
        	int anim_endofs; // size=4
        	int blend_mode; // size=4
        	float blend_opacity; // size=4
        	int sfra; // size=4
        	char alpha_mode; // size=1
        	char pad[3]; // size=3
        	ListBase modifiers; // size=0
        }

        MetaStack {
        	MetaStack *next; // size=4
        	MetaStack *prev; // size=4
        	ListBase *oldbasep; // size=4
        	Sequence *parseq; // size=4
        }

        Editing {
        	ListBase *seqbasep; // size=4
        	ListBase seqbase; // size=0
        	ListBase metastack; // size=0
        	Sequence *act_seq; // size=4
        	char act_imagedir[1024]; // size=1024
        	char act_sounddir[1024]; // size=1024
        	int over_ofs; // size=4
        	int over_cfra; // size=4
        	int over_flag; // size=4
        	int pad; // size=4
        	rctf over_border; // size=0
        }

        WipeVars {
        	float edgeWidth; // size=4
        	float angle; // size=4
        	short forward; // size=2
        	short wipetype; // size=2
        }

        GlowVars {
        	float fMini; // size=4
        	float fClamp; // size=4
        	float fBoost; // size=4
        	float dDist; // size=4
        	int dQuality; // size=4
        	int bNoComp; // size=4
        }

        TransformVars {
        	float ScalexIni; // size=4
        	float ScaleyIni; // size=4
        	float xIni; // size=4
        	float yIni; // size=4
        	float rotIni; // size=4
        	int percent; // size=4
        	int interpolation; // size=4
        	int uniform_scale; // size=4
        }

        SolidColorVars {
        	float col[3]; // size=12
        	float pad; // size=4
        }

        SpeedControlVars {
        	float *frameMap; // size=4
        	float globalSpeed; // size=4
        	int flags; // size=4
        	int length; // size=4
        	int lastValidFrame; // size=4
        }

        SequenceModifierData {
        	SequenceModifierData *next; // size=4
        	SequenceModifierData *prev; // size=4
        	int type; // size=4
        	int flag; // size=4
        	char name[64]; // size=64
        	int mask_input_type; // size=4
        	int pad; // size=4
        	Sequence *mask_sequence; // size=4
        	Mask *mask_id; // size=4
        }

        ColorBalanceModifierData {
        	SequenceModifierData modifier; // size=0
        	StripColorBalance color_balance; // size=0
        	float color_multiply; // size=4
        }

        CurvesModifierData {
        	SequenceModifierData modifier; // size=0
        	CurveMapping curve_mapping; // size=0
        }

        HueCorrectModifierData {
        	SequenceModifierData modifier; // size=0
        	CurveMapping curve_mapping; // size=0
        }

        BrightContrastModifierData {
        	SequenceModifierData modifier; // size=0
        	float bright; // size=4
        	float contrast; // size=4
        }

        SequencerMaskModifierData {
        	SequenceModifierData modifier; // size=0
        }

        SequencerScopes {
        	ImBuf *reference_ibuf; // size=4
        	ImBuf *zebra_ibuf; // size=4
        	ImBuf *waveform_ibuf; // size=4
        	ImBuf *sep_waveform_ibuf; // size=4
        	ImBuf *vector_ibuf; // size=4
        	ImBuf *histogram_ibuf; // size=4
        }

        Effect {
        	Effect *next; // size=4
        	Effect *prev; // size=4
        	short type; // size=2
        	short flag; // size=2
        	short buttype; // size=2
        	short rt; // size=2
        }

        BuildEff {
        	BuildEff *next; // size=4
        	BuildEff *prev; // size=4
        	short type; // size=2
        	short flag; // size=2
        	short buttype; // size=2
        	short rt; // size=2
        	float len; // size=4
        	float sfra; // size=4
        }

        PartEff {
        	PartEff *next; // size=4
        	PartEff *prev; // size=4
        	short type; // size=2
        	short flag; // size=2
        	short buttype; // size=2
        	short stype; // size=2
        	short vertgroup; // size=2
        	short userjit; // size=2
        	float sta; // size=4
        	float end; // size=4
        	float lifetime; // size=4
        	int totpart; // size=4
        	int totkey; // size=4
        	int seed; // size=4
        	float normfac; // size=4
        	float obfac; // size=4
        	float randfac; // size=4
        	float texfac; // size=4
        	float randlife; // size=4
        	float force[3]; // size=12
        	float damp; // size=4
        	float nabla; // size=4
        	float vectsize; // size=4
        	float maxlen; // size=4
        	float pad; // size=4
        	float defvec[3]; // size=12
        	float mult[4]; // size=16
        	float life[4]; // size=16
        	short child[4]; // size=8
        	short mat[4]; // size=8
        	short texmap; // size=2
        	short curmult; // size=2
        	short staticstep; // size=2
        	short omat; // size=2
        	short timetex; // size=2
        	short speedtex; // size=2
        	short flag2; // size=2
        	short flag2neg; // size=2
        	short disp; // size=2
        	short vertgroup_v; // size=2
        	char vgroupname[64]; // size=64
        	char vgroupname_v[64]; // size=64
        	float imat[4][4]; // size=64
        	Particle *keys; // size=4
        	Group *group; // size=4
        }

        WaveEff {
        	WaveEff *next; // size=4
        	WaveEff *prev; // size=4
        	short type; // size=2
        	short flag; // size=2
        	short buttype; // size=2
        	short stype; // size=2
        	float startx; // size=4
        	float starty; // size=4
        	float height; // size=4
        	float width; // size=4
        	float narrow; // size=4
        	float speed; // size=4
        	float minfac; // size=4
        	float damp; // size=4
        	float timeoffs; // size=4
        	float lifetime; // size=4
        }

        TreeStoreElem {
        	short type; // size=2
        	short nr; // size=2
        	short flag; // size=2
        	short used; // size=2
        	ID *id; // size=4
        }

        TreeStore {
        	int totelem; // size=4
        	int usedelem; // size=4
        	TreeStoreElem *data; // size=4
        }

        bProperty {
        	bProperty *next; // size=4
        	bProperty *prev; // size=4
        	char name[64]; // size=64
        	short type; // size=2
        	short flag; // size=2
        	int data; // size=4
        	void *poin; // size=4
        }

        bNearSensor {
        	char name[64]; // size=64
        	float dist; // size=4
        	float resetdist; // size=4
        	int lastval; // size=4
        	int pad; // size=4
        }

        bMouseSensor {
        	short type; // size=2
        	short flag; // size=2
        	short pad1; // size=2
        	short pad2; // size=2
        }

        bTouchSensor {
        	char name[64]; // size=64
        	Material *ma; // size=4
        	float dist; // size=4
        	float pad; // size=4
        }

        bKeyboardSensor {
        	short key; // size=2
        	short qual; // size=2
        	short type; // size=2
        	short qual2; // size=2
        	char targetName[64]; // size=64
        	char toggleName[64]; // size=64
        }

        bPropertySensor {
        	int type; // size=4
        	int pad; // size=4
        	char name[64]; // size=64
        	char value[64]; // size=64
        	char maxvalue[64]; // size=64
        }

        bActuatorSensor {
        	int type; // size=4
        	int pad; // size=4
        	char name[64]; // size=64
        }

        bDelaySensor {
        	short delay; // size=2
        	short duration; // size=2
        	short flag; // size=2
        	short pad; // size=2
        }

        bCollisionSensor {
        	char name[64]; // size=64
        	char materialName[64]; // size=64
        	short damptimer; // size=2
        	short damp; // size=2
        	short mode; // size=2
        	short pad2; // size=2
        }

        bRadarSensor {
        	char name[64]; // size=64
        	float angle; // size=4
        	float range; // size=4
        	short flag; // size=2
        	short axis; // size=2
        }

        bRandomSensor {
        	char name[64]; // size=64
        	int seed; // size=4
        	int delay; // size=4
        }

        bRaySensor {
        	char name[64]; // size=64
        	float range; // size=4
        	char propname[64]; // size=64
        	char matname[64]; // size=64
        	short mode; // size=2
        	short pad1; // size=2
        	int axisflag; // size=4
        }

        bArmatureSensor {
        	char posechannel[64]; // size=64
        	char constraint[64]; // size=64
        	int type; // size=4
        	float value; // size=4
        }

        bMessageSensor {
        	Object *fromObject; // size=4
        	char subject[64]; // size=64
        	char body[64]; // size=64
        }

        bSensor {
        	bSensor *next; // size=4
        	bSensor *prev; // size=4
        	short type; // size=2
        	short otype; // size=2
        	short flag; // size=2
        	short pulse; // size=2
        	short freq; // size=2
        	short totlinks; // size=2
        	short pad1; // size=2
        	short pad2; // size=2
        	char name[64]; // size=64
        	void *data; // size=4
        	bController **links; // size=4
        	Object *ob; // size=4
        	short invert; // size=2
        	short level; // size=2
        	short tap; // size=2
        	short pad; // size=2
        }

        bJoystickSensor {
        	char name[64]; // size=64
        	char type; // size=1
        	char joyindex; // size=1
        	short flag; // size=2
        	short axis; // size=2
        	short axis_single; // size=2
        	int axisf; // size=4
        	int button; // size=4
        	int hat; // size=4
        	int hatf; // size=4
        	int precision; // size=4
        }

        bExpressionCont {
        	char str[128]; // size=128
        }

        bPythonCont {
        	Text *text; // size=4
        	char module[64]; // size=64
        	int mode; // size=4
        	int flag; // size=4
        }

        bController {
        	bController *next; // size=4
        	bController *prev; // size=4
        	bController *mynew; // size=4
        	short type; // size=2
        	short flag; // size=2
        	short inputs; // size=2
        	short totlinks; // size=2
        	short otype; // size=2
        	short totslinks; // size=2
        	short pad2; // size=2
        	short pad3; // size=2
        	char name[64]; // size=64
        	void *data; // size=4
        	bActuator **links; // size=4
        	bSensor **slinks; // size=4
        	short val; // size=2
        	short valo; // size=2
        	int state_mask; // size=4
        }

        bAddObjectActuator {
        	int time; // size=4
        	int pad; // size=4
        	Object *ob; // size=4
        }

        bActionActuator {
        	bAction *act; // size=4
        	short type; // size=2
        	short flag; // size=2
        	float sta; // size=4
        	float end; // size=4
        	char name[64]; // size=64
        	char frameProp[64]; // size=64
        	short blendin; // size=2
        	short priority; // size=2
        	short layer; // size=2
        	short end_reset; // size=2
        	short strideaxis; // size=2
        	short blend_mode; // size=2
        	float stridelength; // size=4
        	float layer_weight; // size=4
        }

        Sound3D {
        	float min_gain; // size=4
        	float max_gain; // size=4
        	float reference_distance; // size=4
        	float max_distance; // size=4
        	float rolloff_factor; // size=4
        	float cone_inner_angle; // size=4
        	float cone_outer_angle; // size=4
        	float cone_outer_gain; // size=4
        }

        bSoundActuator {
        	short flag; // size=2
        	short sndnr; // size=2
        	int pad1; // size=4
        	int pad2; // size=4
        	short pad3[2]; // size=4
        	float volume; // size=4
        	float pitch; // size=4
        	bSound *sound; // size=4
        	Sound3D sound3D; // size=0
        	short type; // size=2
        	short pad4; // size=2
        	short pad5; // size=2
        	short pad6[1]; // size=2
        }

        bEditObjectActuator {
        	int time; // size=4
        	short type; // size=2
        	short flag; // size=2
        	Object *ob; // size=4
        	Mesh *me; // size=4
        	char name[64]; // size=64
        	float linVelocity[3]; // size=12
        	float angVelocity[3]; // size=12
        	float mass; // size=4
        	short localflag; // size=2
        	short dyn_operation; // size=2
        }

        bSceneActuator {
        	short type; // size=2
        	short pad1; // size=2
        	int pad; // size=4
        	Scene *scene; // size=4
        	Object *camera; // size=4
        }

        bPropertyActuator {
        	int pad; // size=4
        	int type; // size=4
        	char name[64]; // size=64
        	char value[64]; // size=64
        	Object *ob; // size=4
        }

        bObjectActuator {
        	short flag; // size=2
        	short type; // size=2
        	short otype; // size=2
        	short damping; // size=2
        	float forceloc[3]; // size=12
        	float forcerot[3]; // size=12
        	float pad[3]; // size=12
        	float pad1[3]; // size=12
        	float dloc[3]; // size=12
        	float drot[3]; // size=12
        	float linearvelocity[3]; // size=12
        	float angularvelocity[3]; // size=12
        	Object *reference; // size=4
        }

        bIpoActuator {
        	short flag; // size=2
        	short type; // size=2
        	float sta; // size=4
        	float end; // size=4
        	char name[64]; // size=64
        	char frameProp[64]; // size=64
        	short pad1; // size=2
        	short pad2; // size=2
        	short pad3; // size=2
        	short pad4; // size=2
        }

        bCameraActuator {
        	Object *ob; // size=4
        	float height; // size=4
        	float min; // size=4
        	float max; // size=4
        	float damping; // size=4
        	short pad1; // size=2
        	short axis; // size=2
        	float pad2; // size=4
        }

        bConstraintActuator {
        	short type; // size=2
        	short mode; // size=2
        	short flag; // size=2
        	short damp; // size=2
        	short time; // size=2
        	short rotdamp; // size=2
        	int pad; // size=4
        	float minloc[3]; // size=12
        	float maxloc[3]; // size=12
        	float minrot[3]; // size=12
        	float maxrot[3]; // size=12
        	char matprop[64]; // size=64
        }

        bGroupActuator {
        	short flag; // size=2
        	short type; // size=2
        	int sta; // size=4
        	int end; // size=4
        	char name[64]; // size=64
        	short pad[3]; // size=6
        	short cur; // size=2
        	short butsta; // size=2
        	short butend; // size=2
        }

        bRandomActuator {
        	int seed; // size=4
        	int distribution; // size=4
        	int int_arg_1; // size=4
        	int int_arg_2; // size=4
        	float float_arg_1; // size=4
        	float float_arg_2; // size=4
        	char propname[64]; // size=64
        }

        bMessageActuator {
        	char toPropName[64]; // size=64
        	Object *toObject; // size=4
        	char subject[64]; // size=64
        	short bodyType; // size=2
        	short pad1; // size=2
        	int pad2; // size=4
        	char body[64]; // size=64
        }

        bGameActuator {
        	short flag; // size=2
        	short type; // size=2
        	int sta; // size=4
        	int end; // size=4
        	char filename[64]; // size=64
        	char loadaniname[64]; // size=64
        }

        bVisibilityActuator {
        	int flag; // size=4
        }

        bTwoDFilterActuator {
        	char pad[4]; // size=4
        	short type; // size=2
        	short flag; // size=2
        	int int_arg; // size=4
        	float float_arg; // size=4
        	Text *text; // size=4
        }

        bParentActuator {
        	char pad[2]; // size=2
        	short flag; // size=2
        	int type; // size=4
        	Object *ob; // size=4
        }

        bStateActuator {
        	int type; // size=4
        	int mask; // size=4
        }

        bArmatureActuator {
        	char posechannel[64]; // size=64
        	char constraint[64]; // size=64
        	int type; // size=4
        	float weight; // size=4
        	float influence; // size=4
        	float pad; // size=4
        	Object *target; // size=4
        	Object *subtarget; // size=4
        }

        bSteeringActuator {
        	char pad[5]; // size=5
        	char flag; // size=1
        	short facingaxis; // size=2
        	int type; // size=4
        	float dist; // size=4
        	float velocity; // size=4
        	float acceleration; // size=4
        	float turnspeed; // size=4
        	int updateTime; // size=4
        	Object *target; // size=4
        	Object *navmesh; // size=4
        }

        bActuator {
        	bActuator *next; // size=4
        	bActuator *prev; // size=4
        	bActuator *mynew; // size=4
        	short type; // size=2
        	short flag; // size=2
        	short otype; // size=2
        	short go; // size=2
        	char name[64]; // size=64
        	void *data; // size=4
        	Object *ob; // size=4
        }

        bSound {
        	ID id; // size=0
        	char name[1024]; // size=1024
        	PackedFile *packedfile; // size=4
        	void *handle; // size=4
        	PackedFile *newpackedfile; // size=4
        	Ipo *ipo; // size=4
        	float volume; // size=4
        	float attenuation; // size=4
        	float pitch; // size=4
        	float min_gain; // size=4
        	float max_gain; // size=4
        	float distance; // size=4
        	int flags; // size=4
        	int pad; // size=4
        	void *cache; // size=4
        	void *waveform; // size=4
        	void *playback_handle; // size=4
        }

        GroupObject {
        	GroupObject *next; // size=4
        	GroupObject *prev; // size=4
        	Object *ob; // size=4
        	void *lampren; // size=4
        	short recalc; // size=2
        	char pad[6]; // size=6
        }

        Group {
        	ID id; // size=0
        	ListBase gobject; // size=0
        	int layer; // size=4
        	float dupli_ofs[3]; // size=12
        }

        Bone {
        	Bone *next; // size=4
        	Bone *prev; // size=4
        	IDProperty *prop; // size=4
        	Bone *parent; // size=4
        	ListBase childbase; // size=0
        	char name[64]; // size=64
        	float roll; // size=4
        	float head[3]; // size=12
        	float tail[3]; // size=12
        	float bone_mat[3][3]; // size=36
        	int flag; // size=4
        	float arm_head[3]; // size=12
        	float arm_tail[3]; // size=12
        	float arm_mat[4][4]; // size=64
        	float arm_roll; // size=4
        	float dist; // size=4
        	float weight; // size=4
        	float xwidth; // size=4
        	float length; // size=4
        	float zwidth; // size=4
        	float ease1; // size=4
        	float ease2; // size=4
        	float rad_head; // size=4
        	float rad_tail; // size=4
        	float size[3]; // size=12
        	int layer; // size=4
        	short segments; // size=2
        	short pad[1]; // size=2
        }

        bArmature {
        	ID id; // size=0
        	AnimData *adt; // size=4
        	ListBase bonebase; // size=0
        	ListBase chainbase; // size=0
        	ListBase *edbo; // size=4
        	Bone *act_bone; // size=4
        	EditBone *act_edbone; // size=4
        	void *sketch; // size=4
        	int flag; // size=4
        	int drawtype; // size=4
        	int gevertdeformer; // size=4
        	int pad; // size=4
        	short deformflag; // size=2
        	short pathflag; // size=2
        	int layer_used; // size=4
        	int layer; // size=4
        	int layer_protected; // size=4
        	short ghostep; // size=2
        	short ghostsize; // size=2
        	short ghosttype; // size=2
        	short pathsize; // size=2
        	int ghostsf; // size=4
        	int ghostef; // size=4
        	int pathsf; // size=4
        	int pathef; // size=4
        	int pathbc; // size=4
        	int pathac; // size=4
        }

        bMotionPathVert {
        	float co[3]; // size=12
        	int flag; // size=4
        }

        bMotionPath {
        	bMotionPathVert *points; // size=4
        	int length; // size=4
        	int start_frame; // size=4
        	int end_frame; // size=4
        	int flag; // size=4
        }

        bAnimVizSettings {
        	int ghost_sf; // size=4
        	int ghost_ef; // size=4
        	int ghost_bc; // size=4
        	int ghost_ac; // size=4
        	short ghost_type; // size=2
        	short ghost_step; // size=2
        	short ghost_flag; // size=2
        	short recalc; // size=2
        	short path_type; // size=2
        	short path_step; // size=2
        	short path_viewflag; // size=2
        	short path_bakeflag; // size=2
        	int path_sf; // size=4
        	int path_ef; // size=4
        	int path_bc; // size=4
        	int path_ac; // size=4
        }

        bPoseChannel {
        	bPoseChannel *next; // size=4
        	bPoseChannel *prev; // size=4
        	IDProperty *prop; // size=4
        	ListBase constraints; // size=0
        	char name[64]; // size=64
        	short flag; // size=2
        	short ikflag; // size=2
        	short protectflag; // size=2
        	short agrp_index; // size=2
        	char constflag; // size=1
        	char selectflag; // size=1
        	char pad0[6]; // size=6
        	Bone *bone; // size=4
        	bPoseChannel *parent; // size=4
        	bPoseChannel *child; // size=4
        	ListBase iktree; // size=0
        	ListBase siktree; // size=0
        	bMotionPath *mpath; // size=4
        	Object *custom; // size=4
        	bPoseChannel *custom_tx; // size=4
        	float loc[3]; // size=12
        	float size[3]; // size=12
        	float eul[3]; // size=12
        	float quat[4]; // size=16
        	float rotAxis[3]; // size=12
        	float rotAngle; // size=4
        	short rotmode; // size=2
        	short pad; // size=2
        	float chan_mat[4][4]; // size=64
        	float pose_mat[4][4]; // size=64
        	float constinv[4][4]; // size=64
        	float pose_head[3]; // size=12
        	float pose_tail[3]; // size=12
        	float limitmin[3]; // size=12
        	float limitmax[3]; // size=12
        	float stiffness[3]; // size=12
        	float ikstretch; // size=4
        	float ikrotweight; // size=4
        	float iklinweight; // size=4
        	void *temp; // size=4
        }

        bPose {
        	ListBase chanbase; // size=0
        	GHash *chanhash; // size=4
        	short flag; // size=2
        	short pad; // size=2
        	int proxy_layer; // size=4
        	int pad1; // size=4
        	float ctime; // size=4
        	float stride_offset[3]; // size=12
        	float cyclic_offset[3]; // size=12
        	ListBase agroups; // size=0
        	int active_group; // size=4
        	int iksolver; // size=4
        	void *ikdata; // size=4
        	void *ikparam; // size=4
        	bAnimVizSettings avs; // size=0
        	char proxy_act_bone[64]; // size=64
        }

        bIKParam {
        	int iksolver; // size=4
        }

        bItasc {
        	int iksolver; // size=4
        	float precision; // size=4
        	short numiter; // size=2
        	short numstep; // size=2
        	float minstep; // size=4
        	float maxstep; // size=4
        	short solver; // size=2
        	short flag; // size=2
        	float feedback; // size=4
        	float maxvel; // size=4
        	float dampmax; // size=4
        	float dampeps; // size=4
        }

        bActionGroup {
        	bActionGroup *next; // size=4
        	bActionGroup *prev; // size=4
        	ListBase channels; // size=0
        	int flag; // size=4
        	int customCol; // size=4
        	char name[64]; // size=64
        	ThemeWireColor cs; // size=0
        }

        bAction {
        	ID id; // size=0
        	ListBase curves; // size=0
        	ListBase chanbase; // size=0
        	ListBase groups; // size=0
        	ListBase markers; // size=0
        	int flag; // size=4
        	int active_marker; // size=4
        	int idroot; // size=4
        	int pad; // size=4
        }

        bDopeSheet {
        	ID *source; // size=4
        	ListBase chanbase; // size=0
        	Group *filter_grp; // size=4
        	char searchstr[64]; // size=64
        	int filterflag; // size=4
        	int flag; // size=4
        	int renameIndex; // size=4
        	int pad; // size=4
        }

        SpaceAction {
        	SpaceLink *next; // size=4
        	SpaceLink *prev; // size=4
        	ListBase regionbase; // size=0
        	int spacetype; // size=4
        	float blockscale; // size=4
        	short blockhandler[8]; // size=16
        	View2D v2d; // size=0
        	bAction *action; // size=4
        	bDopeSheet ads; // size=0
        	char mode; // size=1
        	char autosnap; // size=1
        	short flag; // size=2
        	float timeslide; // size=4
        }

        bActionChannel {
        	bActionChannel *next; // size=4
        	bActionChannel *prev; // size=4
        	bActionGroup *grp; // size=4
        	Ipo *ipo; // size=4
        	ListBase constraintChannels; // size=0
        	int flag; // size=4
        	char name[64]; // size=64
        	int temp; // size=4
        }

        bConstraintChannel {
        	bConstraintChannel *next; // size=4
        	bConstraintChannel *prev; // size=4
        	Ipo *ipo; // size=4
        	short flag; // size=2
        	char name[30]; // size=30
        }

        bConstraint {
        	bConstraint *next; // size=4
        	bConstraint *prev; // size=4
        	void *data; // size=4
        	short type; // size=2
        	short flag; // size=2
        	char ownspace; // size=1
        	char tarspace; // size=1
        	char name[64]; // size=64
        	short pad; // size=2
        	float enforce; // size=4
        	float headtail; // size=4
        	Ipo *ipo; // size=4
        	float lin_error; // size=4
        	float rot_error; // size=4
        }

        bConstraintTarget {
        	bConstraintTarget *next; // size=4
        	bConstraintTarget *prev; // size=4
        	Object *tar; // size=4
        	char subtarget[64]; // size=64
        	float matrix[4][4]; // size=64
        	short space; // size=2
        	short flag; // size=2
        	short type; // size=2
        	short rotOrder; // size=2
        }

        bPythonConstraint {
        	Text *text; // size=4
        	IDProperty *prop; // size=4
        	int flag; // size=4
        	int tarnum; // size=4
        	ListBase targets; // size=0
        	Object *tar; // size=4
        	char subtarget[64]; // size=64
        }

        bKinematicConstraint {
        	Object *tar; // size=4
        	short iterations; // size=2
        	short flag; // size=2
        	short rootbone; // size=2
        	short max_rootbone; // size=2
        	char subtarget[64]; // size=64
        	Object *poletar; // size=4
        	char polesubtarget[64]; // size=64
        	float poleangle; // size=4
        	float weight; // size=4
        	float orientweight; // size=4
        	float grabtarget[3]; // size=12
        	short type; // size=2
        	short mode; // size=2
        	float dist; // size=4
        }

        bSplineIKConstraint {
        	Object *tar; // size=4
        	float *points; // size=4
        	short numpoints; // size=2
        	short chainlen; // size=2
        	short flag; // size=2
        	short xzScaleMode; // size=2
        }

        bTrackToConstraint {
        	Object *tar; // size=4
        	int reserved1; // size=4
        	int reserved2; // size=4
        	int flags; // size=4
        	int pad; // size=4
        	char subtarget[64]; // size=64
        }

        bRotateLikeConstraint {
        	Object *tar; // size=4
        	int flag; // size=4
        	int reserved1; // size=4
        	char subtarget[64]; // size=64
        }

        bLocateLikeConstraint {
        	Object *tar; // size=4
        	int flag; // size=4
        	int reserved1; // size=4
        	char subtarget[64]; // size=64
        }

        bSizeLikeConstraint {
        	Object *tar; // size=4
        	int flag; // size=4
        	int reserved1; // size=4
        	char subtarget[64]; // size=64
        }

        bSameVolumeConstraint {
        	int flag; // size=4
        	float volume; // size=4
        }

        bTransLikeConstraint {
        	Object *tar; // size=4
        	char subtarget[64]; // size=64
        }

        bMinMaxConstraint {
        	Object *tar; // size=4
        	int minmaxflag; // size=4
        	float offset; // size=4
        	int flag; // size=4
        	short sticky; // size=2
        	short stuck; // size=2
        	short pad1; // size=2
        	short pad2; // size=2
        	float cache[3]; // size=12
        	char subtarget[64]; // size=64
        }

        bActionConstraint {
        	Object *tar; // size=4
        	short type; // size=2
        	short local; // size=2
        	int start; // size=4
        	int end; // size=4
        	float min; // size=4
        	float max; // size=4
        	int flag; // size=4
        	bAction *act; // size=4
        	char subtarget[64]; // size=64
        }

        bLockTrackConstraint {
        	Object *tar; // size=4
        	int trackflag; // size=4
        	int lockflag; // size=4
        	char subtarget[64]; // size=64
        }

        bDampTrackConstraint {
        	Object *tar; // size=4
        	int trackflag; // size=4
        	int pad; // size=4
        	char subtarget[64]; // size=64
        }

        bFollowPathConstraint {
        	Object *tar; // size=4
        	float offset; // size=4
        	float offset_fac; // size=4
        	int followflag; // size=4
        	short trackflag; // size=2
        	short upflag; // size=2
        }

        bStretchToConstraint {
        	Object *tar; // size=4
        	int volmode; // size=4
        	int plane; // size=4
        	float orglength; // size=4
        	float bulge; // size=4
        	char subtarget[64]; // size=64
        }

        bRigidBodyJointConstraint {
        	Object *tar; // size=4
        	Object *child; // size=4
        	int type; // size=4
        	float pivX; // size=4
        	float pivY; // size=4
        	float pivZ; // size=4
        	float axX; // size=4
        	float axY; // size=4
        	float axZ; // size=4
        	float minLimit[6]; // size=24
        	float maxLimit[6]; // size=24
        	float extraFz; // size=4
        	short flag; // size=2
        	short pad; // size=2
        	short pad1; // size=2
        	short pad2; // size=2
        }

        bClampToConstraint {
        	Object *tar; // size=4
        	int flag; // size=4
        	int flag2; // size=4
        }

        bChildOfConstraint {
        	Object *tar; // size=4
        	int flag; // size=4
        	int pad; // size=4
        	float invmat[4][4]; // size=64
        	char subtarget[64]; // size=64
        }

        bTransformConstraint {
        	Object *tar; // size=4
        	char subtarget[64]; // size=64
        	short from; // size=2
        	short to; // size=2
        	char map[3]; // size=3
        	char expo; // size=1
        	float from_min[3]; // size=12
        	float from_max[3]; // size=12
        	float to_min[3]; // size=12
        	float to_max[3]; // size=12
        	float from_min_rot[3]; // size=12
        	float from_max_rot[3]; // size=12
        	float to_min_rot[3]; // size=12
        	float to_max_rot[3]; // size=12
        	float from_min_scale[3]; // size=12
        	float from_max_scale[3]; // size=12
        	float to_min_scale[3]; // size=12
        	float to_max_scale[3]; // size=12
        }

        bPivotConstraint {
        	Object *tar; // size=4
        	char subtarget[64]; // size=64
        	float offset[3]; // size=12
        	short rotAxis; // size=2
        	short flag; // size=2
        }

        bLocLimitConstraint {
        	float xmin; // size=4
        	float xmax; // size=4
        	float ymin; // size=4
        	float ymax; // size=4
        	float zmin; // size=4
        	float zmax; // size=4
        	short flag; // size=2
        	short flag2; // size=2
        }

        bRotLimitConstraint {
        	float xmin; // size=4
        	float xmax; // size=4
        	float ymin; // size=4
        	float ymax; // size=4
        	float zmin; // size=4
        	float zmax; // size=4
        	short flag; // size=2
        	short flag2; // size=2
        }

        bSizeLimitConstraint {
        	float xmin; // size=4
        	float xmax; // size=4
        	float ymin; // size=4
        	float ymax; // size=4
        	float zmin; // size=4
        	float zmax; // size=4
        	short flag; // size=2
        	short flag2; // size=2
        }

        bDistLimitConstraint {
        	Object *tar; // size=4
        	char subtarget[64]; // size=64
        	float dist; // size=4
        	float soft; // size=4
        	short flag; // size=2
        	short mode; // size=2
        	int pad; // size=4
        }

        bShrinkwrapConstraint {
        	Object *target; // size=4
        	float dist; // size=4
        	short shrinkType; // size=2
        	char projAxis; // size=1
        	char projAxisSpace; // size=1
        	float projLimit; // size=4
        	char pad[4]; // size=4
        }

        bFollowTrackConstraint {
        	MovieClip *clip; // size=4
        	char track[64]; // size=64
        	int flag; // size=4
        	int frame_method; // size=4
        	char object[64]; // size=64
        	Object *camera; // size=4
        	Object *depth_ob; // size=4
        }

        bCameraSolverConstraint {
        	MovieClip *clip; // size=4
        	int flag; // size=4
        	int pad; // size=4
        }

        bObjectSolverConstraint {
        	MovieClip *clip; // size=4
        	int flag; // size=4
        	int pad; // size=4
        	char object[64]; // size=64
        	float invmat[4][4]; // size=64
        	Object *camera; // size=4
        }

        bActionModifier {
        	bActionModifier *next; // size=4
        	bActionModifier *prev; // size=4
        	short type; // size=2
        	short flag; // size=2
        	char channel[32]; // size=32
        	float noisesize; // size=4
        	float turbul; // size=4
        	short channels; // size=2
        	short no_rot_axis; // size=2
        	Object *ob; // size=4
        }

        bActionStrip {
        	bActionStrip *next; // size=4
        	bActionStrip *prev; // size=4
        	short flag; // size=2
        	short mode; // size=2
        	short stride_axis; // size=2
        	short curmod; // size=2
        	Ipo *ipo; // size=4
        	bAction *act; // size=4
        	Object *object; // size=4
        	float start; // size=4
        	float end; // size=4
        	float actstart; // size=4
        	float actend; // size=4
        	float actoffs; // size=4
        	float stridelen; // size=4
        	float repeat; // size=4
        	float scale; // size=4
        	float blendin; // size=4
        	float blendout; // size=4
        	char stridechannel[32]; // size=32
        	char offs_bone[32]; // size=32
        	ListBase modifiers; // size=0
        }

        bNodeStack {
        	float vec[4]; // size=16
        	float min; // size=4
        	float max; // size=4
        	void *data; // size=4
        	short hasinput; // size=2
        	short hasoutput; // size=2
        	short datatype; // size=2
        	short sockettype; // size=2
        	short is_copy; // size=2
        	short external; // size=2
        	short pad[2]; // size=4
        }

        bNodeSocket {
        	bNodeSocket *next; // size=4
        	bNodeSocket *prev; // size=4
        	bNodeSocket *new_sock; // size=4
        	IDProperty *prop; // size=4
        	char identifier[64]; // size=64
        	char name[64]; // size=64
        	void *storage; // size=4
        	short type; // size=2
        	short flag; // size=2
        	short limit; // size=2
        	short in_out; // size=2
        	bNodeSocketType *typeinfo; // size=4
        	char idname[64]; // size=64
        	float locx; // size=4
        	float locy; // size=4
        	void *default_value; // size=4
        	short stack_index; // size=2
        	short stack_type; // size=2
        	int pad; // size=4
        	void *cache; // size=4
        	int own_index; // size=4
        	int to_index; // size=4
        	bNodeSocket *groupsock; // size=4
        	bNodeLink *link; // size=4
        	bNodeStack ns; // size=0
        }

        bNode {
        	bNode *next; // size=4
        	bNode *prev; // size=4
        	bNode *new_node; // size=4
        	IDProperty *prop; // size=4
        	bNodeType *typeinfo; // size=4
        	char idname[64]; // size=64
        	char name[64]; // size=64
        	int flag; // size=4
        	short type; // size=2
        	short pad; // size=2
        	short done; // size=2
        	short level; // size=2
        	short lasty; // size=2
        	short menunr; // size=2
        	short stack_index; // size=2
        	short nr; // size=2
        	float color[3]; // size=12
        	ListBase inputs; // size=0
        	ListBase outputs; // size=0
        	bNode *parent; // size=4
        	ID *id; // size=4
        	void *storage; // size=4
        	bNode *original; // size=4
        	ListBase internal_links; // size=0
        	float locx; // size=4
        	float locy; // size=4
        	float width; // size=4
        	float height; // size=4
        	float miniwidth; // size=4
        	float offsetx; // size=4
        	float offsety; // size=4
        	int update; // size=4
        	char label[64]; // size=64
        	short custom1; // size=2
        	short custom2; // size=2
        	float custom3; // size=4
        	float custom4; // size=4
        	short need_exec; // size=2
        	short exec; // size=2
        	void *threaddata; // size=4
        	rctf totr; // size=0
        	rctf butr; // size=0
        	rctf prvr; // size=0
        	short preview_xsize; // size=2
        	short preview_ysize; // size=2
        	int pad2; // size=4
        	uiBlock *block; // size=4
        }

        bNodeInstanceKey {
        	int value; // size=4
        }

        bNodeInstanceHashEntry {
        	bNodeInstanceKey key; // size=0
        	short tag; // size=2
        	short pad; // size=2
        }

        bNodePreview {
        	bNodeInstanceHashEntry hash_entry; // size=0
        	char *rect; // size=4
        	short xsize; // size=2
        	short ysize; // size=2
        	int pad; // size=4
        }

        bNodeLink {
        	bNodeLink *next; // size=4
        	bNodeLink *prev; // size=4
        	bNode *fromnode; // size=4
        	bNode *tonode; // size=4
        	bNodeSocket *fromsock; // size=4
        	bNodeSocket *tosock; // size=4
        	int flag; // size=4
        	int pad; // size=4
        }

        bNodeTree {
        	ID id; // size=0
        	AnimData *adt; // size=4
        	bNodeTreeType *typeinfo; // size=4
        	char idname[64]; // size=64
        	StructRNA *interface_type; // size=4
        	bGPdata *gpd; // size=4
        	float view_center[2]; // size=8
        	ListBase nodes; // size=0
        	ListBase links; // size=0
        	int type; // size=4
        	int init; // size=4
        	int cur_index; // size=4
        	int flag; // size=4
        	int update; // size=4
        	short is_updating; // size=2
        	short done; // size=2
        	int pad2; // size=4
        	int nodetype; // size=4
        	short edit_quality; // size=2
        	short render_quality; // size=2
        	int chunksize; // size=4
        	rctf viewer_border; // size=0
        	ListBase inputs; // size=0
        	ListBase outputs; // size=0
        	bNodeInstanceHash *previews; // size=4
        	bNodeInstanceKey active_viewer_key; // size=0
        	int pad; // size=4
        	bNodeTreeExec *execdata; // size=4
        	void (*progress)(); // size=0
        	void (*stats_draw)(); // size=0
        	int (*test_break)(); // size=4
        	void (*update_draw)(); // size=0
        	void *tbh; // size=4
        	void *prh; // size=4
        	void *sdh; // size=4
        	void *udh; // size=4
        }

        bNodeSocketValueInt {
        	int subtype; // size=4
        	int value; // size=4
        	int min; // size=4
        	int max; // size=4
        }

        bNodeSocketValueFloat {
        	int subtype; // size=4
        	float value; // size=4
        	float min; // size=4
        	float max; // size=4
        }

        bNodeSocketValueBoolean {
        	char value; // size=1
        	char pad[3]; // size=3
        }

        bNodeSocketValueVector {
        	int subtype; // size=4
        	float value[3]; // size=12
        	float min; // size=4
        	float max; // size=4
        }

        bNodeSocketValueRGBA {
        	float value[4]; // size=16
        }

        bNodeSocketValueString {
        	int subtype; // size=4
        	int pad; // size=4
        	char value[1024]; // size=1024
        }

        NodeFrame {
        	short flag; // size=2
        	short label_size; // size=2
        }

        NodeImageAnim {
        	int frames; // size=4
        	int sfra; // size=4
        	int nr; // size=4
        	char cyclic; // size=1
        	char movie; // size=1
        	short pad; // size=2
        }

        ColorCorrectionData {
        	float saturation; // size=4
        	float contrast; // size=4
        	float gamma; // size=4
        	float gain; // size=4
        	float lift; // size=4
        	int pad; // size=4
        }

        NodeColorCorrection {
        	ColorCorrectionData master; // size=0
        	ColorCorrectionData shadows; // size=0
        	ColorCorrectionData midtones; // size=0
        	ColorCorrectionData highlights; // size=0
        	float startmidtones; // size=4
        	float endmidtones; // size=4
        }

        NodeBokehImage {
        	float angle; // size=4
        	int flaps; // size=4
        	float rounding; // size=4
        	float catadioptric; // size=4
        	float lensshift; // size=4
        }

        NodeBoxMask {
        	float x; // size=4
        	float y; // size=4
        	float rotation; // size=4
        	float height; // size=4
        	float width; // size=4
        	int pad; // size=4
        }

        NodeEllipseMask {
        	float x; // size=4
        	float y; // size=4
        	float rotation; // size=4
        	float height; // size=4
        	float width; // size=4
        	int pad; // size=4
        }

        NodeImageLayer {
        	int pass_index; // size=4
        	int pass_flag; // size=4
        }

        NodeBlurData {
        	short sizex; // size=2
        	short sizey; // size=2
        	short samples; // size=2
        	short maxspeed; // size=2
        	short minspeed; // size=2
        	short relative; // size=2
        	short aspect; // size=2
        	short curved; // size=2
        	float fac; // size=4
        	float percentx; // size=4
        	float percenty; // size=4
        	short filtertype; // size=2
        	char bokeh; // size=1
        	char gamma; // size=1
        	int image_in_width; // size=4
        	int image_in_height; // size=4
        }

        NodeDBlurData {
        	float center_x; // size=4
        	float center_y; // size=4
        	float distance; // size=4
        	float angle; // size=4
        	float spin; // size=4
        	float zoom; // size=4
        	short iter; // size=2
        	char wrap; // size=1
        	char pad; // size=1
        }

        NodeBilateralBlurData {
        	float sigma_color; // size=4
        	float sigma_space; // size=4
        	short iter; // size=2
        	short pad; // size=2
        }

        NodeHueSat {
        	float hue; // size=4
        	float sat; // size=4
        	float val; // size=4
        }

        NodeImageFile {
        	char name[1024]; // size=1024
        	ImageFormatData im_format; // size=0
        	int sfra; // size=4
        	int efra; // size=4
        }

        NodeImageMultiFile {
        	char base_path[1024]; // size=1024
        	ImageFormatData format; // size=0
        	int sfra; // size=4
        	int efra; // size=4
        	int active_input; // size=4
        	int pad; // size=4
        }

        NodeImageMultiFileSocket {
        	short use_render_format; // size=2
        	short use_node_format; // size=2
        	int pad1; // size=4
        	char path[1024]; // size=1024
        	ImageFormatData format; // size=0
        	char layer[30]; // size=30
        	char pad2[2]; // size=2
        }

        NodeChroma {
        	float t1; // size=4
        	float t2; // size=4
        	float t3; // size=4
        	float fsize; // size=4
        	float fstrength; // size=4
        	float falpha; // size=4
        	float key[4]; // size=16
        	short algorithm; // size=2
        	short channel; // size=2
        }

        NodeTwoXYs {
        	short x1; // size=2
        	short x2; // size=2
        	short y1; // size=2
        	short y2; // size=2
        	float fac_x1; // size=4
        	float fac_x2; // size=4
        	float fac_y1; // size=4
        	float fac_y2; // size=4
        }

        NodeTwoFloats {
        	float x; // size=4
        	float y; // size=4
        }

        NodeGeometry {
        	char uvname[64]; // size=64
        	char colname[64]; // size=64
        }

        NodeVertexCol {
        	char name[64]; // size=64
        }

        NodeDefocus {
        	char bktype; // size=1
        	char pad_c1; // size=1
        	char preview; // size=1
        	char gamco; // size=1
        	short samples; // size=2
        	short no_zbuf; // size=2
        	float fstop; // size=4
        	float maxblur; // size=4
        	float bthresh; // size=4
        	float scale; // size=4
        	float rotation; // size=4
        	float pad_f1; // size=4
        }

        NodeScriptDict {
        	void *dict; // size=4
        	void *node; // size=4
        }

        NodeGlare {
        	char quality; // size=1
        	char type; // size=1
        	char iter; // size=1
        	char angle; // size=1
        	char pad_c1; // size=1
        	char size; // size=1
        	char pad[2]; // size=2
        	float colmod; // size=4
        	float mix; // size=4
        	float threshold; // size=4
        	float fade; // size=4
        	float angle_ofs; // size=4
        	float pad_f1; // size=4
        }

        NodeTonemap {
        	float key; // size=4
        	float offset; // size=4
        	float gamma; // size=4
        	float f; // size=4
        	float m; // size=4
        	float a; // size=4
        	float c; // size=4
        	int type; // size=4
        }

        NodeLensDist {
        	short jit; // size=2
        	short proj; // size=2
        	short fit; // size=2
        	short pad; // size=2
        }

        NodeColorBalance {
        	float slope[3]; // size=12
        	float offset[3]; // size=12
        	float power[3]; // size=12
        	float lift[3]; // size=12
        	float gamma[3]; // size=12
        	float gain[3]; // size=12
        }

        NodeColorspill {
        	short limchan; // size=2
        	short unspill; // size=2
        	float limscale; // size=4
        	float uspillr; // size=4
        	float uspillg; // size=4
        	float uspillb; // size=4
        }

        NodeDilateErode {
        	char falloff; // size=1
        	char pad[7]; // size=7
        }

        NodeMask {
        	int size_x; // size=4
        	int size_y; // size=4
        }

        NodeTexBase {
        	TexMapping tex_mapping; // size=0
        	ColorMapping color_mapping; // size=0
        }

        NodeTexSky {
        	NodeTexBase base; // size=0
        	int sky_model; // size=4
        	float sun_direction[3]; // size=12
        	float turbidity; // size=4
        	float ground_albedo; // size=4
        }

        NodeTexImage {
        	NodeTexBase base; // size=0
        	ImageUser iuser; // size=0
        	int color_space; // size=4
        	int projection; // size=4
        	float projection_blend; // size=4
        	int interpolation; // size=4
        }

        NodeTexChecker {
        	NodeTexBase base; // size=0
        }

        NodeTexBrick {
        	NodeTexBase base; // size=0
        	int offset_freq; // size=4
        	int squash_freq; // size=4
        	float offset; // size=4
        	float squash; // size=4
        }

        NodeTexEnvironment {
        	NodeTexBase base; // size=0
        	ImageUser iuser; // size=0
        	int color_space; // size=4
        	int projection; // size=4
        }

        NodeTexGradient {
        	NodeTexBase base; // size=0
        	int gradient_type; // size=4
        	int pad; // size=4
        }

        NodeTexNoise {
        	NodeTexBase base; // size=0
        }

        NodeTexVoronoi {
        	NodeTexBase base; // size=0
        	int coloring; // size=4
        	int pad; // size=4
        }

        NodeTexMusgrave {
        	NodeTexBase base; // size=0
        	int musgrave_type; // size=4
        	int pad; // size=4
        }

        NodeTexWave {
        	NodeTexBase base; // size=0
        	int wave_type; // size=4
        	int pad; // size=4
        }

        NodeTexMagic {
        	NodeTexBase base; // size=0
        	int depth; // size=4
        	int pad; // size=4
        }

        NodeShaderAttribute {
        	char name[64]; // size=64
        }

        NodeShaderVectTransform {
        	int type; // size=4
        	int convert_from; // size=4
        	int convert_to; // size=4
        	int pad; // size=4
        }

        TexNodeOutput {
        	char name[64]; // size=64
        }

        NodeKeyingScreenData {
        	char tracking_object[64]; // size=64
        }

        NodeKeyingData {
        	float screen_balance; // size=4
        	float despill_factor; // size=4
        	float despill_balance; // size=4
        	int edge_kernel_radius; // size=4
        	float edge_kernel_tolerance; // size=4
        	float clip_black; // size=4
        	float clip_white; // size=4
        	int dilate_distance; // size=4
        	int feather_distance; // size=4
        	int feather_falloff; // size=4
        	int blur_pre; // size=4
        	int blur_post; // size=4
        }

        NodeTrackPosData {
        	char tracking_object[64]; // size=64
        	char track_name[64]; // size=64
        }

        NodeTranslateData {
        	char wrap_axis; // size=1
        	char relative; // size=1
        	char pad[6]; // size=6
        }

        NodePlaneTrackDeformData {
        	char tracking_object[64]; // size=64
        	char plane_track_name[64]; // size=64
        }

        NodeShaderScript {
        	int mode; // size=4
        	int flag; // size=4
        	char filepath[1024]; // size=1024
        	char bytecode_hash[64]; // size=64
        	char *bytecode; // size=4
        }

        NodeShaderTangent {
        	int direction_type; // size=4
        	int axis; // size=4
        	char uv_map[64]; // size=64
        }

        NodeShaderNormalMap {
        	int space; // size=4
        	char uv_map[64]; // size=64
        }

        NodeShaderUVMap {
        	char uv_map[64]; // size=64
        }

        CurveMapPoint {
        	float x; // size=4
        	float y; // size=4
        	short flag; // size=2
        	short shorty; // size=2
        }

        CurveMap {
        	short totpoint; // size=2
        	short flag; // size=2
        	float range; // size=4
        	float mintable; // size=4
        	float maxtable; // size=4
        	float ext_in[2]; // size=8
        	float ext_out[2]; // size=8
        	CurveMapPoint *curve; // size=4
        	CurveMapPoint *table; // size=4
        	CurveMapPoint *premultable; // size=4
        	float premul_ext_in[2]; // size=8
        	float premul_ext_out[2]; // size=8
        }

        CurveMapping {
        	int flag; // size=4
        	int cur; // size=4
        	int preset; // size=4
        	int changed_timestamp; // size=4
        	rctf curr; // size=0
        	rctf clipr; // size=0
        	CurveMap cm[4]; // size=0
        	float black[3]; // size=12
        	float white[3]; // size=12
        	float bwmul[3]; // size=12
        	float sample[3]; // size=12
        }

        Histogram {
        	int channels; // size=4
        	int x_resolution; // size=4
        	float data_luma[256]; // size=1024
        	float data_r[256]; // size=1024
        	float data_g[256]; // size=1024
        	float data_b[256]; // size=1024
        	float data_a[256]; // size=1024
        	float xmax; // size=4
        	float ymax; // size=4
        	short mode; // size=2
        	short flag; // size=2
        	int height; // size=4
        	float co[2][2]; // size=16
        }

        Scopes {
        	int ok; // size=4
        	int sample_full; // size=4
        	int sample_lines; // size=4
        	float accuracy; // size=4
        	int wavefrm_mode; // size=4
        	float wavefrm_alpha; // size=4
        	float wavefrm_yfac; // size=4
        	int wavefrm_height; // size=4
        	float vecscope_alpha; // size=4
        	int vecscope_height; // size=4
        	float minmax[3][2]; // size=24
        	Histogram hist; // size=0
        	float *waveform_1; // size=4
        	float *waveform_2; // size=4
        	float *waveform_3; // size=4
        	float *vecscope; // size=4
        	int waveform_tot; // size=4
        	int pad; // size=4
        }

        ColorManagedViewSettings {
        	int flag; // size=4
        	int pad; // size=4
        	char look[64]; // size=64
        	char view_transform[64]; // size=64
        	float exposure; // size=4
        	float gamma; // size=4
        	CurveMapping *curve_mapping; // size=4
        	void *pad2; // size=4
        }

        ColorManagedDisplaySettings {
        	char display_device[64]; // size=64
        }

        ColorManagedColorspaceSettings {
        	char name[64]; // size=64
        }

        BrushClone {
        	Image *image; // size=4
        	float offset[2]; // size=8
        	float alpha; // size=4
        	float pad; // size=4
        }

        Brush {
        	ID id; // size=0
        	BrushClone clone; // size=0
        	CurveMapping *curve; // size=4
        	MTex mtex; // size=0
        	MTex mask_mtex; // size=0
        	Brush *toggle_brush; // size=4
        	ImBuf *icon_imbuf; // size=4
        	PreviewImage *preview; // size=4
        	char icon_filepath[1024]; // size=1024
        	float normal_weight; // size=4
        	short blend; // size=2
        	short ob_mode; // size=2
        	float weight; // size=4
        	int size; // size=4
        	int flag; // size=4
        	float jitter; // size=4
        	int jitter_absolute; // size=4
        	int overlay_flags; // size=4
        	int spacing; // size=4
        	int smooth_stroke_radius; // size=4
        	float smooth_stroke_factor; // size=4
        	float rate; // size=4
        	float rgb[3]; // size=12
        	float alpha; // size=4
        	int sculpt_plane; // size=4
        	float plane_offset; // size=4
        	char sculpt_tool; // size=1
        	char vertexpaint_tool; // size=1
        	char imagepaint_tool; // size=1
        	char mask_tool; // size=1
        	float autosmooth_factor; // size=4
        	float crease_pinch_factor; // size=4
        	float plane_trim; // size=4
        	float height; // size=4
        	float texture_sample_bias; // size=4
        	int texture_overlay_alpha; // size=4
        	int mask_overlay_alpha; // size=4
        	int cursor_overlay_alpha; // size=4
        	float unprojected_radius; // size=4
        	float add_col[3]; // size=12
        	float sub_col[3]; // size=12
        	float stencil_pos[2]; // size=8
        	float stencil_dimension[2]; // size=8
        	float mask_stencil_pos[2]; // size=8
        	float mask_stencil_dimension[2]; // size=8
        }

        CustomDataLayer {
        	int type; // size=4
        	int offset; // size=4
        	int flag; // size=4
        	int active; // size=4
        	int active_rnd; // size=4
        	int active_clone; // size=4
        	int active_mask; // size=4
        	int uid; // size=4
        	char name[64]; // size=64
        	void *data; // size=4
        }

        CustomDataExternal {
        	char filename[1024]; // size=1024
        }

        CustomData {
        	CustomDataLayer *layers; // size=4
        	int typemap[41]; // size=164
        	int totlayer; // size=4
        	int maxlayer; // size=4
        	int totsize; // size=4
        	BLI_mempool *pool; // size=4
        	CustomDataExternal *external; // size=4
        }

        HairKey {
        	float co[3]; // size=12
        	float time; // size=4
        	float weight; // size=4
        	short editflag; // size=2
        	short pad; // size=2
        }

        ParticleKey {
        	float co[3]; // size=12
        	float vel[3]; // size=12
        	float rot[4]; // size=16
        	float ave[3]; // size=12
        	float time; // size=4
        }

        BoidParticle {
        	Object *ground; // size=4
        	BoidData data; // size=0
        	float gravity[3]; // size=12
        	float wander[3]; // size=12
        	float rt; // size=4
        }

        ParticleSpring {
        	float rest_length; // size=4
        	int particle_index[2]; // size=8
        	int delete_flag; // size=4
        }

        ChildParticle {
        	int num; // size=4
        	int parent; // size=4
        	int pa[4]; // size=16
        	float w[4]; // size=16
        	float fuv[4]; // size=16
        	float foffset; // size=4
        	float rt; // size=4
        }

        ParticleTarget {
        	ParticleTarget *next; // size=4
        	ParticleTarget *prev; // size=4
        	Object *ob; // size=4
        	int psys; // size=4
        	short flag; // size=2
        	short mode; // size=2
        	float time; // size=4
        	float duration; // size=4
        }

        ParticleDupliWeight {
        	ParticleDupliWeight *next; // size=4
        	ParticleDupliWeight *prev; // size=4
        	Object *ob; // size=4
        	short count; // size=2
        	short flag; // size=2
        	short index; // size=2
        	short rt; // size=2
        }

        ParticleData {
        	ParticleKey state; // size=0
        	ParticleKey prev_state; // size=0
        	HairKey *hair; // size=4
        	ParticleKey *keys; // size=4
        	BoidParticle *boid; // size=4
        	int totkey; // size=4
        	float time; // size=4
        	float lifetime; // size=4
        	float dietime; // size=4
        	int num; // size=4
        	int num_dmcache; // size=4
        	float fuv[4]; // size=16
        	float foffset; // size=4
        	float size; // size=4
        	float sphdensity; // size=4
        	int pad; // size=4
        	int hair_index; // size=4
        	short flag; // size=2
        	short alive; // size=2
        }

        SPHFluidSettings {
        	float radius; // size=4
        	float spring_k; // size=4
        	float rest_length; // size=4
        	float plasticity_constant; // size=4
        	float yield_ratio; // size=4
        	float plasticity_balance; // size=4
        	float yield_balance; // size=4
        	float viscosity_omega; // size=4
        	float viscosity_beta; // size=4
        	float stiffness_k; // size=4
        	float stiffness_knear; // size=4
        	float rest_density; // size=4
        	float buoyancy; // size=4
        	int flag; // size=4
        	int spring_frames; // size=4
        	short solver; // size=2
        	short pad[3]; // size=6
        }

        ParticleSettings {
        	ID id; // size=0
        	AnimData *adt; // size=4
        	BoidSettings *boids; // size=4
        	SPHFluidSettings *fluid; // size=4
        	EffectorWeights *effector_weights; // size=4
        	int flag; // size=4
        	int rt; // size=4
        	short type; // size=2
        	short from; // size=2
        	short distr; // size=2
        	short texact; // size=2
        	short phystype; // size=2
        	short rotmode; // size=2
        	short avemode; // size=2
        	short reactevent; // size=2
        	int draw; // size=4
        	int pad1; // size=4
        	short draw_as; // size=2
        	short draw_size; // size=2
        	short childtype; // size=2
        	short pad2; // size=2
        	short ren_as; // size=2
        	short subframes; // size=2
        	short draw_col; // size=2
        	short draw_step; // size=2
        	short ren_step; // size=2
        	short hair_step; // size=2
        	short keys_step; // size=2
        	short adapt_angle; // size=2
        	short adapt_pix; // size=2
        	short disp; // size=2
        	short omat; // size=2
        	short interpolation; // size=2
        	short integrator; // size=2
        	short rotfrom; // size=2
        	short kink; // size=2
        	short kink_axis; // size=2
        	short bb_align; // size=2
        	short bb_uv_split; // size=2
        	short bb_anim; // size=2
        	short bb_split_offset; // size=2
        	float bb_tilt; // size=4
        	float bb_rand_tilt; // size=4
        	float bb_offset[2]; // size=8
        	float bb_size[2]; // size=8
        	float bb_vel_head; // size=4
        	float bb_vel_tail; // size=4
        	float color_vec_max; // size=4
        	short simplify_flag; // size=2
        	short simplify_refsize; // size=2
        	float simplify_rate; // size=4
        	float simplify_transition; // size=4
        	float simplify_viewport; // size=4
        	float sta; // size=4
        	float end; // size=4
        	float lifetime; // size=4
        	float randlife; // size=4
        	float timetweak; // size=4
        	float courant_target; // size=4
        	float jitfac; // size=4
        	float eff_hair; // size=4
        	float grid_rand; // size=4
        	float ps_offset[1]; // size=4
        	int totpart; // size=4
        	int userjit; // size=4
        	int grid_res; // size=4
        	int effector_amount; // size=4
        	short time_flag; // size=2
        	short time_pad[3]; // size=6
        	float normfac; // size=4
        	float obfac; // size=4
        	float randfac; // size=4
        	float partfac; // size=4
        	float tanfac; // size=4
        	float tanphase; // size=4
        	float reactfac; // size=4
        	float ob_vel[3]; // size=12
        	float avefac; // size=4
        	float phasefac; // size=4
        	float randrotfac; // size=4
        	float randphasefac; // size=4
        	float mass; // size=4
        	float size; // size=4
        	float randsize; // size=4
        	float acc[3]; // size=12
        	float dragfac; // size=4
        	float brownfac; // size=4
        	float dampfac; // size=4
        	float randlength; // size=4
        	int child_nbr; // size=4
        	int ren_child_nbr; // size=4
        	float parents; // size=4
        	float childsize; // size=4
        	float childrandsize; // size=4
        	float childrad; // size=4
        	float childflat; // size=4
        	float clumpfac; // size=4
        	float clumppow; // size=4
        	float kink_amp; // size=4
        	float kink_freq; // size=4
        	float kink_shape; // size=4
        	float kink_flat; // size=4
        	float kink_amp_clump; // size=4
        	float rough1; // size=4
        	float rough1_size; // size=4
        	float rough2; // size=4
        	float rough2_size; // size=4
        	float rough2_thres; // size=4
        	float rough_end; // size=4
        	float rough_end_shape; // size=4
        	float clength; // size=4
        	float clength_thres; // size=4
        	float parting_fac; // size=4
        	float parting_min; // size=4
        	float parting_max; // size=4
        	float branch_thres; // size=4
        	float draw_line[2]; // size=8
        	float path_start; // size=4
        	float path_end; // size=4
        	int trail_count; // size=4
        	int keyed_loops; // size=4
        	MTex *mtex[18]; // size=72
        	Group *dup_group; // size=4
        	ListBase dupliweights; // size=0
        	Group *eff_group; // size=4
        	Object *dup_ob; // size=4
        	Object *bb_ob; // size=4
        	Ipo *ipo; // size=4
        	PartDeflect *pd; // size=4
        	PartDeflect *pd2; // size=4
        	short use_modifier_stack; // size=2
        	short pad[3]; // size=6
        }

        ParticleSystem {
        	ParticleSystem *next; // size=4
        	ParticleSystem *prev; // size=4
        	ParticleSettings *part; // size=4
        	ParticleData *particles; // size=4
        	ChildParticle *child; // size=4
        	PTCacheEdit *edit; // size=4
        	void (*free_edit)(); // size=0
        	ParticleCacheKey **pathcache; // size=4
        	ParticleCacheKey **childcache; // size=4
        	ListBase pathcachebufs; // size=0
        	ListBase childcachebufs; // size=0
        	ClothModifierData *clmd; // size=4
        	DerivedMesh *hair_in_dm; // size=4
        	DerivedMesh *hair_out_dm; // size=4
        	Object *target_ob; // size=4
        	LatticeDeformData *lattice_deform_data; // size=4
        	Object *parent; // size=4
        	ListBase targets; // size=0
        	char name[64]; // size=64
        	float imat[4][4]; // size=64
        	float cfra; // size=4
        	float tree_frame; // size=4
        	float bvhtree_frame; // size=4
        	int seed; // size=4
        	int child_seed; // size=4
        	int flag; // size=4
        	int totpart; // size=4
        	int totunexist; // size=4
        	int totchild; // size=4
        	int totcached; // size=4
        	int totchildcache; // size=4
        	short recalc; // size=2
        	short target_psys; // size=2
        	short totkeyed; // size=2
        	short bakespace; // size=2
        	char bb_uvname[3][64]; // size=192
        	short vgroup[12]; // size=24
        	short vg_neg; // size=2
        	short rt3; // size=2
        	void *renderdata; // size=4
        	PointCache *pointcache; // size=4
        	ListBase ptcaches; // size=0
        	ListBase *effectors; // size=4
        	ParticleSpring *fluid_springs; // size=4
        	int tot_fluidsprings; // size=4
        	int alloc_fluidsprings; // size=4
        	KDTree *tree; // size=4
        	BVHTree *bvhtree; // size=4
        	ParticleDrawData *pdd; // size=4
        	float dt_frac; // size=4
        	float _pad; // size=4
        }

        ClothSimSettings {
        	LinkNode *cache; // size=4
        	float mingoal; // size=4
        	float Cdis; // size=4
        	float Cvi; // size=4
        	float gravity[3]; // size=12
        	float dt; // size=4
        	float mass; // size=4
        	float structural; // size=4
        	float shear; // size=4
        	float bending; // size=4
        	float max_bend; // size=4
        	float max_struct; // size=4
        	float max_shear; // size=4
        	float max_sewing; // size=4
        	float avg_spring_len; // size=4
        	float timescale; // size=4
        	float maxgoal; // size=4
        	float eff_force_scale; // size=4
        	float eff_wind_scale; // size=4
        	float sim_time_old; // size=4
        	float defgoal; // size=4
        	float goalspring; // size=4
        	float goalfrict; // size=4
        	float velocity_smooth; // size=4
        	float collider_friction; // size=4
        	float vel_damping; // size=4
        	float shrink_min; // size=4
        	float shrink_max; // size=4
        	int stepsPerFrame; // size=4
        	int flags; // size=4
        	int preroll; // size=4
        	int maxspringlen; // size=4
        	short solver_type; // size=2
        	short vgroup_bend; // size=2
        	short vgroup_mass; // size=2
        	short vgroup_struct; // size=2
        	short vgroup_shrink; // size=2
        	short shapekey_rest; // size=2
        	short presets; // size=2
        	short reset; // size=2
        	char pad[4]; // size=4
        	EffectorWeights *effector_weights; // size=4
        }

        ClothCollSettings {
        	LinkNode *collision_list; // size=4
        	float epsilon; // size=4
        	float self_friction; // size=4
        	float friction; // size=4
        	float selfepsilon; // size=4
        	float repel_force; // size=4
        	float distance_repel; // size=4
        	int flags; // size=4
        	short self_loop_count; // size=2
        	short loop_count; // size=2
        	Group *group; // size=4
        	short vgroup_selfcol; // size=2
        	short pad; // size=2
        	int pad2; // size=4
        }

        bGPDspoint {
        	float x; // size=4
        	float y; // size=4
        	float z; // size=4
        	float pressure; // size=4
        	float time; // size=4
        }

        bGPDstroke {
        	bGPDstroke *next; // size=4
        	bGPDstroke *prev; // size=4
        	bGPDspoint *points; // size=4
        	void *pad; // size=4
        	int totpoints; // size=4
        	short thickness; // size=2
        	short flag; // size=2
        	double inittime; // size=8
        }

        bGPDframe {
        	bGPDframe *next; // size=4
        	bGPDframe *prev; // size=4
        	ListBase strokes; // size=0
        	int framenum; // size=4
        	int flag; // size=4
        }

        bGPDlayer {
        	bGPDlayer *next; // size=4
        	bGPDlayer *prev; // size=4
        	ListBase frames; // size=0
        	bGPDframe *actframe; // size=4
        	int flag; // size=4
        	short thickness; // size=2
        	short gstep; // size=2
        	float color[4]; // size=16
        	char info[128]; // size=128
        }

        bGPdata {
        	ID id; // size=0
        	ListBase layers; // size=0
        	int flag; // size=4
        	short sbuffer_size; // size=2
        	short sbuffer_sflag; // size=2
        	void *sbuffer; // size=4
        }

        ReportList {
        	ListBase list; // size=0
        	int printlevel; // size=4
        	int storelevel; // size=4
        	int flag; // size=4
        	int pad; // size=4
        	wmTimer *reporttimer; // size=4
        }

        wmWindowManager {
        	ID id; // size=0
        	wmWindow *windrawable; // size=4
        	wmWindow *winactive; // size=4
        	ListBase windows; // size=0
        	int initialized; // size=4
        	short file_saved; // size=2
        	short op_undo_depth; // size=2
        	ListBase operators; // size=0
        	ListBase queue; // size=0
        	ReportList reports; // size=0
        	ListBase jobs; // size=0
        	ListBase paintcursors; // size=0
        	ListBase drags; // size=0
        	ListBase keyconfigs; // size=0
        	wmKeyConfig *defaultconf; // size=4
        	wmKeyConfig *addonconf; // size=4
        	wmKeyConfig *userconf; // size=4
        	ListBase timers; // size=0
        	wmTimer *autosavetimer; // size=4
        	char is_interface_locked; // size=1
        	char par[7]; // size=7
        }

        wmWindow {
        	wmWindow *next; // size=4
        	wmWindow *prev; // size=4
        	void *ghostwin; // size=4
        	int winid; // size=4
        	short grabcursor; // size=2
        	short pad; // size=2
        	bScreen *screen; // size=4
        	bScreen *newscreen; // size=4
        	char screenname[64]; // size=64
        	short posx; // size=2
        	short posy; // size=2
        	short sizex; // size=2
        	short sizey; // size=2
        	short windowstate; // size=2
        	short monitor; // size=2
        	short active; // size=2
        	short cursor; // size=2
        	short lastcursor; // size=2
        	short modalcursor; // size=2
        	short addmousemove; // size=2
        	short pad2; // size=2
        	wmEvent *eventstate; // size=4
        	wmSubWindow *curswin; // size=4
        	wmGesture *tweak; // size=4
        	int drawmethod; // size=4
        	int drawfail; // size=4
        	void *drawdata; // size=4
        	ListBase queue; // size=0
        	ListBase handlers; // size=0
        	ListBase modalhandlers; // size=0
        	ListBase subwindows; // size=0
        	ListBase gesture; // size=0
        }

        wmKeyMapItem {
        	wmKeyMapItem *next; // size=4
        	wmKeyMapItem *prev; // size=4
        	char idname[64]; // size=64
        	IDProperty *properties; // size=4
        	char propvalue_str[64]; // size=64
        	short propvalue; // size=2
        	short type; // size=2
        	short val; // size=2
        	short shift; // size=2
        	short ctrl; // size=2
        	short alt; // size=2
        	short oskey; // size=2
        	short keymodifier; // size=2
        	short flag; // size=2
        	short maptype; // size=2
        	short id; // size=2
        	short pad; // size=2
        	PointerRNA *ptr; // size=4
        }

        wmKeyMapDiffItem {
        	wmKeyMapDiffItem *next; // size=4
        	wmKeyMapDiffItem *prev; // size=4
        	wmKeyMapItem *remove_item; // size=4
        	wmKeyMapItem *add_item; // size=4
        }

        wmKeyMap {
        	wmKeyMap *next; // size=4
        	wmKeyMap *prev; // size=4
        	ListBase items; // size=0
        	ListBase diff_items; // size=0
        	char idname[64]; // size=64
        	short spaceid; // size=2
        	short regionid; // size=2
        	short flag; // size=2
        	short kmi_id; // size=2
        	int (*poll)(); // size=4
        	void *modal_items; // size=4
        }

        wmKeyConfig {
        	wmKeyConfig *next; // size=4
        	wmKeyConfig *prev; // size=4
        	char idname[64]; // size=64
        	char basename[64]; // size=64
        	ListBase keymaps; // size=0
        	int actkeymap; // size=4
        	int flag; // size=4
        }

        wmOperator {
        	wmOperator *next; // size=4
        	wmOperator *prev; // size=4
        	char idname[64]; // size=64
        	IDProperty *properties; // size=4
        	wmOperatorType *type; // size=4
        	void *customdata; // size=4
        	void *py_instance; // size=4
        	PointerRNA *ptr; // size=4
        	ReportList *reports; // size=4
        	ListBase macro; // size=0
        	wmOperator *opm; // size=4
        	uiLayout *layout; // size=4
        	short flag; // size=2
        	short pad[3]; // size=6
        }

        FModifier {
        	FModifier *next; // size=4
        	FModifier *prev; // size=4
        	void *data; // size=4
        	char name[64]; // size=64
        	short type; // size=2
        	short flag; // size=2
        	float influence; // size=4
        	float sfra; // size=4
        	float efra; // size=4
        	float blendin; // size=4
        	float blendout; // size=4
        }

        FMod_Generator {
        	float *coefficients; // size=4
        	int arraysize; // size=4
        	int poly_order; // size=4
        	int mode; // size=4
        	int flag; // size=4
        }

        FMod_FunctionGenerator {
        	float amplitude; // size=4
        	float phase_multiplier; // size=4
        	float phase_offset; // size=4
        	float value_offset; // size=4
        	int type; // size=4
        	int flag; // size=4
        }

        FCM_EnvelopeData {
        	float min; // size=4
        	float max; // size=4
        	float time; // size=4
        	short f1; // size=2
        	short f2; // size=2
        }

        FMod_Envelope {
        	FCM_EnvelopeData *data; // size=4
        	int totvert; // size=4
        	float midval; // size=4
        	float min; // size=4
        	float max; // size=4
        }

        FMod_Cycles {
        	short before_mode; // size=2
        	short after_mode; // size=2
        	short before_cycles; // size=2
        	short after_cycles; // size=2
        }

        FMod_Python {
        	Text *script; // size=4
        	IDProperty *prop; // size=4
        }

        FMod_Limits {
        	rctf rect; // size=0
        	int flag; // size=4
        	int pad; // size=4
        }

        FMod_Noise {
        	float size; // size=4
        	float strength; // size=4
        	float phase; // size=4
        	float offset; // size=4
        	short depth; // size=2
        	short modification; // size=2
        }

        FMod_Stepped {
        	float step_size; // size=4
        	float offset; // size=4
        	float start_frame; // size=4
        	float end_frame; // size=4
        	int flag; // size=4
        }

        DriverTarget {
        	ID *id; // size=4
        	char *rna_path; // size=4
        	char pchan_name[32]; // size=32
        	short transChan; // size=2
        	short flag; // size=2
        	int idtype; // size=4
        }

        DriverVar {
        	DriverVar *next; // size=4
        	DriverVar *prev; // size=4
        	char name[64]; // size=64
        	DriverTarget targets[8]; // size=0
        	short num_targets; // size=2
        	short type; // size=2
        	float curval; // size=4
        }

        ChannelDriver {
        	ListBase variables; // size=0
        	char expression[256]; // size=256
        	void *expr_comp; // size=4
        	float curval; // size=4
        	float influence; // size=4
        	int type; // size=4
        	int flag; // size=4
        }

        FPoint {
        	float vec[2]; // size=8
        	int flag; // size=4
        	int pad; // size=4
        }

        FCurve {
        	FCurve *next; // size=4
        	FCurve *prev; // size=4
        	bActionGroup *grp; // size=4
        	ChannelDriver *driver; // size=4
        	ListBase modifiers; // size=0
        	BezTriple *bezt; // size=4
        	FPoint *fpt; // size=4
        	int totvert; // size=4
        	float curval; // size=4
        	short flag; // size=2
        	short extend; // size=2
        	int array_index; // size=4
        	char *rna_path; // size=4
        	int color_mode; // size=4
        	float color[3]; // size=12
        	float prev_norm_factor; // size=4
        	float pad; // size=4
        }

        AnimMapPair {
        	char from[128]; // size=128
        	char to[128]; // size=128
        }

        AnimMapper {
        	AnimMapper *next; // size=4
        	AnimMapper *prev; // size=4
        	bAction *target; // size=4
        	ListBase mappings; // size=0
        }

        NlaStrip {
        	NlaStrip *next; // size=4
        	NlaStrip *prev; // size=4
        	ListBase strips; // size=0
        	bAction *act; // size=4
        	AnimMapper *remap; // size=4
        	ListBase fcurves; // size=0
        	ListBase modifiers; // size=0
        	char name[64]; // size=64
        	float influence; // size=4
        	float strip_time; // size=4
        	float start; // size=4
        	float end; // size=4
        	float actstart; // size=4
        	float actend; // size=4
        	float repeat; // size=4
        	float scale; // size=4
        	float blendin; // size=4
        	float blendout; // size=4
        	short blendmode; // size=2
        	short extendmode; // size=2
        	short pad1; // size=2
        	short type; // size=2
        	void *speaker_handle; // size=4
        	int flag; // size=4
        	int pad2; // size=4
        }

        NlaTrack {
        	NlaTrack *next; // size=4
        	NlaTrack *prev; // size=4
        	ListBase strips; // size=0
        	int flag; // size=4
        	int index; // size=4
        	char name[64]; // size=64
        }

        KS_Path {
        	KS_Path *next; // size=4
        	KS_Path *prev; // size=4
        	ID *id; // size=4
        	char group[64]; // size=64
        	int idtype; // size=4
        	short groupmode; // size=2
        	short pad; // size=2
        	char *rna_path; // size=4
        	int array_index; // size=4
        	short flag; // size=2
        	short keyingflag; // size=2
        }

        KeyingSet {
        	KeyingSet *next; // size=4
        	KeyingSet *prev; // size=4
        	ListBase paths; // size=0
        	char idname[64]; // size=64
        	char name[64]; // size=64
        	char description[240]; // size=240
        	char typeinfo[64]; // size=64
        	short flag; // size=2
        	short keyingflag; // size=2
        	int active_path; // size=4
        }

        AnimOverride {
        	AnimOverride *next; // size=4
        	AnimOverride *prev; // size=4
        	char *rna_path; // size=4
        	int array_index; // size=4
        	float value; // size=4
        }

        AnimData {
        	bAction *action; // size=4
        	bAction *tmpact; // size=4
        	AnimMapper *remap; // size=4
        	ListBase nla_tracks; // size=0
        	NlaStrip *actstrip; // size=4
        	ListBase drivers; // size=0
        	ListBase overrides; // size=0
        	int flag; // size=4
        	int recalc; // size=4
        	short act_blendmode; // size=2
        	short act_extendmode; // size=2
        	float act_influence; // size=4
        }

        IdAdtTemplate {
        	ID id; // size=0
        	AnimData *adt; // size=4
        }

        BoidRule {
        	BoidRule *next; // size=4
        	BoidRule *prev; // size=4
        	int type; // size=4
        	int flag; // size=4
        	char name[32]; // size=32
        }

        BoidRuleGoalAvoid {
        	BoidRule rule; // size=0
        	Object *ob; // size=4
        	int options; // size=4
        	float fear_factor; // size=4
        	int signal_id; // size=4
        	int channels; // size=4
        }

        BoidRuleAvoidCollision {
        	BoidRule rule; // size=0
        	int options; // size=4
        	float look_ahead; // size=4
        }

        BoidRuleFollowLeader {
        	BoidRule rule; // size=0
        	Object *ob; // size=4
        	float loc[3]; // size=12
        	float oloc[3]; // size=12
        	float cfra; // size=4
        	float distance; // size=4
        	int options; // size=4
        	int queue_size; // size=4
        }

        BoidRuleAverageSpeed {
        	BoidRule rule; // size=0
        	float wander; // size=4
        	float level; // size=4
        	float speed; // size=4
        	float rt; // size=4
        }

        BoidRuleFight {
        	BoidRule rule; // size=0
        	float distance; // size=4
        	float flee_distance; // size=4
        }

        BoidData {
        	float health; // size=4
        	float acc[3]; // size=12
        	short state_id; // size=2
        	short mode; // size=2
        }

        BoidState {
        	BoidState *next; // size=4
        	BoidState *prev; // size=4
        	ListBase rules; // size=0
        	ListBase conditions; // size=0
        	ListBase actions; // size=0
        	char name[32]; // size=32
        	int id; // size=4
        	int flag; // size=4
        	int ruleset_type; // size=4
        	float rule_fuzziness; // size=4
        	int signal_id; // size=4
        	int channels; // size=4
        	float volume; // size=4
        	float falloff; // size=4
        }

        BoidSettings {
        	int options; // size=4
        	int last_state_id; // size=4
        	float landing_smoothness; // size=4
        	float height; // size=4
        	float banking; // size=4
        	float pitch; // size=4
        	float health; // size=4
        	float aggression; // size=4
        	float strength; // size=4
        	float accuracy; // size=4
        	float range; // size=4
        	float air_min_speed; // size=4
        	float air_max_speed; // size=4
        	float air_max_acc; // size=4
        	float air_max_ave; // size=4
        	float air_personal_space; // size=4
        	float land_jump_speed; // size=4
        	float land_max_speed; // size=4
        	float land_max_acc; // size=4
        	float land_max_ave; // size=4
        	float land_personal_space; // size=4
        	float land_stick_force; // size=4
        	ListBase states; // size=0
        }

        SmokeDomainSettings {
        	SmokeModifierData *smd; // size=4
        	FLUID_3D *fluid; // size=4
        	void *fluid_mutex; // size=4
        	Group *fluid_group; // size=4
        	Group *eff_group; // size=4
        	Group *coll_group; // size=4
        	WTURBULENCE *wt; // size=4
        	GPUTexture *tex; // size=4
        	GPUTexture *tex_wt; // size=4
        	GPUTexture *tex_shadow; // size=4
        	GPUTexture *tex_flame; // size=4
        	float *shadow; // size=4
        	float p0[3]; // size=12
        	float p1[3]; // size=12
        	float dp0[3]; // size=12
        	float cell_size[3]; // size=12
        	float global_size[3]; // size=12
        	float prev_loc[3]; // size=12
        	int shift[3]; // size=12
        	float shift_f[3]; // size=12
        	float obj_shift_f[3]; // size=12
        	float imat[4][4]; // size=64
        	float obmat[4][4]; // size=64
        	int base_res[3]; // size=12
        	int res_min[3]; // size=12
        	int res_max[3]; // size=12
        	int res[3]; // size=12
        	int total_cells; // size=4
        	float dx; // size=4
        	float scale; // size=4
        	int adapt_margin; // size=4
        	int adapt_res; // size=4
        	float adapt_threshold; // size=4
        	float alpha; // size=4
        	float beta; // size=4
        	int amplify; // size=4
        	int maxres; // size=4
        	int flags; // size=4
        	int viewsettings; // size=4
        	short noise; // size=2
        	short diss_percent; // size=2
        	int diss_speed; // size=4
        	float strength; // size=4
        	int res_wt[3]; // size=12
        	float dx_wt; // size=4
        	int cache_comp; // size=4
        	int cache_high_comp; // size=4
        	PointCache *point_cache[2]; // size=8
        	ListBase ptcaches[2]; // size=0
        	EffectorWeights *effector_weights; // size=4
        	int border_collisions; // size=4
        	float time_scale; // size=4
        	float vorticity; // size=4
        	int active_fields; // size=4
        	float active_color[3]; // size=12
        	int highres_sampling; // size=4
        	float burning_rate; // size=4
        	float flame_smoke; // size=4
        	float flame_vorticity; // size=4
        	float flame_ignition; // size=4
        	float flame_max_temp; // size=4
        	float flame_smoke_color[3]; // size=12
        }

        SmokeFlowSettings {
        	SmokeModifierData *smd; // size=4
        	DerivedMesh *dm; // size=4
        	ParticleSystem *psys; // size=4
        	Tex *noise_texture; // size=4
        	float *verts_old; // size=4
        	int numverts; // size=4
        	float vel_multi; // size=4
        	float vel_normal; // size=4
        	float vel_random; // size=4
        	float density; // size=4
        	float color[3]; // size=12
        	float fuel_amount; // size=4
        	float temp; // size=4
        	float volume_density; // size=4
        	float surface_distance; // size=4
        	float particle_size; // size=4
        	int subframes; // size=4
        	float texture_size; // size=4
        	float texture_offset; // size=4
        	int pad; // size=4
        	char uvlayer_name[64]; // size=64
        	short vgroup_density; // size=2
        	short type; // size=2
        	short source; // size=2
        	short texture_type; // size=2
        	int flags; // size=4
        }

        SmokeCollSettings {
        	SmokeModifierData *smd; // size=4
        	DerivedMesh *dm; // size=4
        	float *verts_old; // size=4
        	int numverts; // size=4
        	short type; // size=2
        	short pad; // size=2
        }

        Speaker {
        	ID id; // size=0
        	AnimData *adt; // size=4
        	bSound *sound; // size=4
        	float volume_max; // size=4
        	float volume_min; // size=4
        	float distance_max; // size=4
        	float distance_reference; // size=4
        	float attenuation; // size=4
        	float cone_angle_outer; // size=4
        	float cone_angle_inner; // size=4
        	float cone_volume_outer; // size=4
        	float volume; // size=4
        	float pitch; // size=4
        	short flag; // size=2
        	short pad1[3]; // size=6
        }

        MovieClipUser {
        	int framenr; // size=4
        	short render_size; // size=2
        	short render_flag; // size=2
        }

        MovieClipProxy {
        	char dir[768]; // size=768
        	short tc; // size=2
        	short quality; // size=2
        	short build_size_flag; // size=2
        	short build_tc_flag; // size=2
        }

        MovieClip {
        	ID id; // size=0
        	AnimData *adt; // size=4
        	char name[1024]; // size=1024
        	int source; // size=4
        	int lastframe; // size=4
        	int lastsize[2]; // size=8
        	float aspx; // size=4
        	float aspy; // size=4
        	anim *anim; // size=4
        	MovieClipCache *cache; // size=4
        	bGPdata *gpd; // size=4
        	MovieTracking tracking; // size=0
        	void *tracking_context; // size=4
        	MovieClipProxy proxy; // size=0
        	int flag; // size=4
        	int len; // size=4
        	int start_frame; // size=4
        	int frame_offset; // size=4
        	ColorManagedColorspaceSettings colorspace_settings; // size=0
        }

        MovieClipScopes {
        	short ok; // size=2
        	short use_track_mask; // size=2
        	int track_preview_height; // size=4
        	int frame_width; // size=4
        	int frame_height; // size=4
        	MovieTrackingMarker undist_marker; // size=0
        	ImBuf *track_search; // size=4
        	ImBuf *track_preview; // size=4
        	float track_pos[2]; // size=8
        	short track_disabled; // size=2
        	short track_locked; // size=2
        	int framenr; // size=4
        	MovieTrackingTrack *track; // size=4
        	MovieTrackingMarker *marker; // size=4
        	float slide_scale[2]; // size=8
        }

        MovieReconstructedCamera {
        	int framenr; // size=4
        	float error; // size=4
        	float mat[4][4]; // size=64
        }

        MovieTrackingCamera {
        	void *intrinsics; // size=4
        	short distortion_model; // size=2
        	short pad; // size=2
        	float sensor_width; // size=4
        	float pixel_aspect; // size=4
        	float focal; // size=4
        	short units; // size=2
        	short pad1; // size=2
        	float principal[2]; // size=8
        	float k1; // size=4
        	float k2; // size=4
        	float k3; // size=4
        	float division_k1; // size=4
        	float division_k2; // size=4
        }

        MovieTrackingMarker {
        	float pos[2]; // size=8
        	float pattern_corners[4][2]; // size=32
        	float search_min[2]; // size=8
        	float search_max[2]; // size=8
        	int framenr; // size=4
        	int flag; // size=4
        }

        MovieTrackingTrack {
        	MovieTrackingTrack *next; // size=4
        	MovieTrackingTrack *prev; // size=4
        	char name[64]; // size=64
        	float pat_min[2]; // size=8
        	float pat_max[2]; // size=8
        	float search_min[2]; // size=8
        	float search_max[2]; // size=8
        	float offset[2]; // size=8
        	int markersnr; // size=4
        	int last_marker; // size=4
        	MovieTrackingMarker *markers; // size=4
        	float bundle_pos[3]; // size=12
        	float error; // size=4
        	int flag; // size=4
        	int pat_flag; // size=4
        	int search_flag; // size=4
        	float color[3]; // size=12
        	short frames_limit; // size=2
        	short margin; // size=2
        	short pattern_match; // size=2
        	short motion_model; // size=2
        	int algorithm_flag; // size=4
        	float minimum_correlation; // size=4
        	bGPdata *gpd; // size=4
        	float weight; // size=4
        	float pad; // size=4
        }

        MovieTrackingPlaneMarker {
        	float corners[4][2]; // size=32
        	int framenr; // size=4
        	int flag; // size=4
        }

        MovieTrackingPlaneTrack {
        	MovieTrackingPlaneTrack *next; // size=4
        	MovieTrackingPlaneTrack *prev; // size=4
        	char name[64]; // size=64
        	MovieTrackingTrack **point_tracks; // size=4
        	int point_tracksnr; // size=4
        	int pad; // size=4
        	MovieTrackingPlaneMarker *markers; // size=4
        	int markersnr; // size=4
        	int flag; // size=4
        	Image *image; // size=4
        	float image_opacity; // size=4
        	int last_marker; // size=4
        }

        MovieTrackingSettings {
        	int flag; // size=4
        	short default_motion_model; // size=2
        	short default_algorithm_flag; // size=2
        	float default_minimum_correlation; // size=4
        	short default_pattern_size; // size=2
        	short default_search_size; // size=2
        	short default_frames_limit; // size=2
        	short default_margin; // size=2
        	short default_pattern_match; // size=2
        	short default_flag; // size=2
        	float default_weight; // size=4
        	short motion_flag; // size=2
        	short speed; // size=2
        	int keyframe1; // size=4
        	int keyframe2; // size=4
        	int reconstruction_flag; // size=4
        	short refine_camera_intrinsics; // size=2
        	short pad2; // size=2
        	float dist; // size=4
        	int clean_frames; // size=4
        	int clean_action; // size=4
        	float clean_error; // size=4
        	float object_distance; // size=4
        	int pad3; // size=4
        }

        MovieTrackingStabilization {
        	int flag; // size=4
        	int tot_track; // size=4
        	int act_track; // size=4
        	float maxscale; // size=4
        	MovieTrackingTrack *rot_track; // size=4
        	float locinf; // size=4
        	float scaleinf; // size=4
        	float rotinf; // size=4
        	int filter; // size=4
        	int ok; // size=4
        	float scale; // size=4
        }

        MovieTrackingReconstruction {
        	int flag; // size=4
        	float error; // size=4
        	int last_camera; // size=4
        	int camnr; // size=4
        	MovieReconstructedCamera *cameras; // size=4
        }

        MovieTrackingObject {
        	MovieTrackingObject *next; // size=4
        	MovieTrackingObject *prev; // size=4
        	char name[64]; // size=64
        	int flag; // size=4
        	float scale; // size=4
        	ListBase tracks; // size=0
        	ListBase plane_tracks; // size=0
        	MovieTrackingReconstruction reconstruction; // size=0
        	int keyframe1; // size=4
        	int keyframe2; // size=4
        }

        MovieTrackingStats {
        	char message[256]; // size=256
        }

        MovieTrackingDopesheetChannel {
        	MovieTrackingDopesheetChannel *next; // size=4
        	MovieTrackingDopesheetChannel *prev; // size=4
        	MovieTrackingTrack *track; // size=4
        	int pad; // size=4
        	char name[64]; // size=64
        	int tot_segment; // size=4
        	int *segments; // size=4
        	int max_segment; // size=4
        	int total_frames; // size=4
        }

        MovieTrackingDopesheetCoverageSegment {
        	MovieTrackingDopesheetCoverageSegment *next; // size=4
        	MovieTrackingDopesheetCoverageSegment *prev; // size=4
        	int coverage; // size=4
        	int start_frame; // size=4
        	int end_frame; // size=4
        	int pad; // size=4
        }

        MovieTrackingDopesheet {
        	int ok; // size=4
        	short sort_method; // size=2
        	short flag; // size=2
        	ListBase coverage_segments; // size=0
        	ListBase channels; // size=0
        	int tot_channel; // size=4
        	int pad; // size=4
        }

        MovieTracking {
        	MovieTrackingSettings settings; // size=0
        	MovieTrackingCamera camera; // size=0
        	ListBase tracks; // size=0
        	ListBase plane_tracks; // size=0
        	MovieTrackingReconstruction reconstruction; // size=0
        	MovieTrackingStabilization stabilization; // size=0
        	MovieTrackingTrack *act_track; // size=4
        	MovieTrackingPlaneTrack *act_plane_track; // size=4
        	ListBase objects; // size=0
        	int objectnr; // size=4
        	int tot_object; // size=4
        	MovieTrackingStats *stats; // size=4
        	MovieTrackingDopesheet dopesheet; // size=0
        }

        DynamicPaintSurface {
        	DynamicPaintSurface *next; // size=4
        	DynamicPaintSurface *prev; // size=4
        	DynamicPaintCanvasSettings *canvas; // size=4
        	PaintSurfaceData *data; // size=4
        	Group *brush_group; // size=4
        	EffectorWeights *effector_weights; // size=4
        	PointCache *pointcache; // size=4
        	ListBase ptcaches; // size=0
        	int current_frame; // size=4
        	char name[64]; // size=64
        	short format; // size=2
        	short type; // size=2
        	short disp_type; // size=2
        	short image_fileformat; // size=2
        	short effect_ui; // size=2
        	short preview_id; // size=2
        	short init_color_type; // size=2
        	short pad_s; // size=2
        	int flags; // size=4
        	int effect; // size=4
        	int image_resolution; // size=4
        	int substeps; // size=4
        	int start_frame; // size=4
        	int end_frame; // size=4
        	int pad; // size=4
        	float init_color[4]; // size=16
        	Tex *init_texture; // size=4
        	char init_layername[64]; // size=64
        	int dry_speed; // size=4
        	int diss_speed; // size=4
        	float color_dry_threshold; // size=4
        	float depth_clamp; // size=4
        	float disp_factor; // size=4
        	float spread_speed; // size=4
        	float color_spread_speed; // size=4
        	float shrink_speed; // size=4
        	float drip_vel; // size=4
        	float drip_acc; // size=4
        	float influence_scale; // size=4
        	float radius_scale; // size=4
        	float wave_damping; // size=4
        	float wave_speed; // size=4
        	float wave_timescale; // size=4
        	float wave_spring; // size=4
        	float wave_smoothness; // size=4
        	int pad2; // size=4
        	char uvlayer_name[64]; // size=64
        	char image_output_path[1024]; // size=1024
        	char output_name[64]; // size=64
        	char output_name2[64]; // size=64
        }

        DynamicPaintCanvasSettings {
        	DynamicPaintModifierData *pmd; // size=4
        	DerivedMesh *dm; // size=4
        	ListBase surfaces; // size=0
        	short active_sur; // size=2
        	short flags; // size=2
        	int pad; // size=4
        	char error[64]; // size=64
        }

        DynamicPaintBrushSettings {
        	DynamicPaintModifierData *pmd; // size=4
        	DerivedMesh *dm; // size=4
        	ParticleSystem *psys; // size=4
        	Material *mat; // size=4
        	int flags; // size=4
        	int collision; // size=4
        	float r; // size=4
        	float g; // size=4
        	float b; // size=4
        	float alpha; // size=4
        	float wetness; // size=4
        	float particle_radius; // size=4
        	float particle_smooth; // size=4
        	float paint_distance; // size=4
        	ColorBand *paint_ramp; // size=4
        	ColorBand *vel_ramp; // size=4
        	short proximity_falloff; // size=2
        	short wave_type; // size=2
        	short ray_dir; // size=2
        	short pad; // size=2
        	float wave_factor; // size=4
        	float wave_clamp; // size=4
        	float max_velocity; // size=4
        	float smudge_strength; // size=4
        }

        Mask {
        	ID id; // size=0
        	AnimData *adt; // size=4
        	ListBase masklayers; // size=0
        	int masklay_act; // size=4
        	int masklay_tot; // size=4
        	int sfra; // size=4
        	int efra; // size=4
        	int flag; // size=4
        	int pad; // size=4
        }

        MaskParent {
        	int id_type; // size=4
        	int type; // size=4
        	ID *id; // size=4
        	char parent[64]; // size=64
        	char sub_parent[64]; // size=64
        	float parent_orig[2]; // size=8
        	float parent_corners_orig[4][2]; // size=32
        }

        MaskSplinePointUW {
        	float u; // size=4
        	float w; // size=4
        	int flag; // size=4
        }

        MaskSplinePoint {
        	BezTriple bezt; // size=0
        	int pad; // size=4
        	int tot_uw; // size=4
        	MaskSplinePointUW *uw; // size=4
        	MaskParent parent; // size=0
        }

        MaskSpline {
        	MaskSpline *next; // size=4
        	MaskSpline *prev; // size=4
        	short flag; // size=2
        	char offset_mode; // size=1
        	char weight_interp; // size=1
        	int tot_point; // size=4
        	MaskSplinePoint *points; // size=4
        	MaskParent parent; // size=0
        	MaskSplinePoint *points_deform; // size=4
        }

        MaskLayerShape {
        	MaskLayerShape *next; // size=4
        	MaskLayerShape *prev; // size=4
        	float *data; // size=4
        	int tot_vert; // size=4
        	int frame; // size=4
        	char flag; // size=1
        	char pad[7]; // size=7
        }

        MaskLayer {
        	MaskLayer *next; // size=4
        	MaskLayer *prev; // size=4
        	char name[64]; // size=64
        	ListBase splines; // size=0
        	ListBase splines_shapes; // size=0
        	MaskSpline *act_spline; // size=4
        	MaskSplinePoint *act_point; // size=4
        	float alpha; // size=4
        	char blend; // size=1
        	char blend_flag; // size=1
        	char falloff; // size=1
        	char pad[7]; // size=7
        	char flag; // size=1
        	char restrictflag; // size=1
        }

        RigidBodyWorld {
        	EffectorWeights *effector_weights; // size=4
        	Group *group; // size=4
        	Object **objects; // size=4
        	Group *constraints; // size=4
        	int pad; // size=4
        	float ltime; // size=4
        	PointCache *pointcache; // size=4
        	ListBase ptcaches; // size=0
        	int numbodies; // size=4
        	short steps_per_second; // size=2
        	short num_solver_iterations; // size=2
        	int flag; // size=4
        	float time_scale; // size=4
        	void *physics_world; // size=4
        }

        RigidBodyOb {
        	void *physics_object; // size=4
        	void *physics_shape; // size=4
        	short type; // size=2
        	short shape; // size=2
        	int flag; // size=4
        	int col_groups; // size=4
        	short mesh_source; // size=2
        	short pad; // size=2
        	float mass; // size=4
        	float friction; // size=4
        	float restitution; // size=4
        	float margin; // size=4
        	float lin_damping; // size=4
        	float ang_damping; // size=4
        	float lin_sleep_thresh; // size=4
        	float ang_sleep_thresh; // size=4
        	float orn[4]; // size=16
        	float pos[3]; // size=12
        	float pad1; // size=4
        }

        RigidBodyCon {
        	Object *ob1; // size=4
        	Object *ob2; // size=4
        	short type; // size=2
        	short num_solver_iterations; // size=2
        	int flag; // size=4
        	float breaking_threshold; // size=4
        	float pad; // size=4
        	float limit_lin_x_lower; // size=4
        	float limit_lin_x_upper; // size=4
        	float limit_lin_y_lower; // size=4
        	float limit_lin_y_upper; // size=4
        	float limit_lin_z_lower; // size=4
        	float limit_lin_z_upper; // size=4
        	float limit_ang_x_lower; // size=4
        	float limit_ang_x_upper; // size=4
        	float limit_ang_y_lower; // size=4
        	float limit_ang_y_upper; // size=4
        	float limit_ang_z_lower; // size=4
        	float limit_ang_z_upper; // size=4
        	float spring_stiffness_x; // size=4
        	float spring_stiffness_y; // size=4
        	float spring_stiffness_z; // size=4
        	float spring_damping_x; // size=4
        	float spring_damping_y; // size=4
        	float spring_damping_z; // size=4
        	float motor_lin_target_velocity; // size=4
        	float motor_ang_target_velocity; // size=4
        	float motor_lin_max_impulse; // size=4
        	float motor_ang_max_impulse; // size=4
        	void *physics_constraint; // size=4
        }

        FreestyleLineSet {
        	FreestyleLineSet *next; // size=4
        	FreestyleLineSet *prev; // size=4
        	char name[64]; // size=64
        	int flags; // size=4
        	int selection; // size=4
        	short qi; // size=2
        	short pad1; // size=2
        	int qi_start; // size=4
        	int qi_end; // size=4
        	int edge_types; // size=4
        	int exclude_edge_types; // size=4
        	int pad2; // size=4
        	Group *group; // size=4
        	FreestyleLineStyle *linestyle; // size=4
        }

        FreestyleModuleConfig {
        	FreestyleModuleConfig *next; // size=4
        	FreestyleModuleConfig *prev; // size=4
        	Text *script; // size=4
        	short is_displayed; // size=2
        	short pad[3]; // size=6
        }

        FreestyleConfig {
        	ListBase modules; // size=0
        	int mode; // size=4
        	int raycasting_algorithm; // size=4
        	int flags; // size=4
        	float sphere_radius; // size=4
        	float dkr_epsilon; // size=4
        	float crease_angle; // size=4
        	ListBase linesets; // size=0
        }

        LineStyleModifier {
        	LineStyleModifier *next; // size=4
        	LineStyleModifier *prev; // size=4
        	char name[64]; // size=64
        	int type; // size=4
        	float influence; // size=4
        	int flags; // size=4
        	int blend; // size=4
        }

        LineStyleColorModifier_AlongStroke {
        	LineStyleModifier modifier; // size=0
        	ColorBand *color_ramp; // size=4
        }

        LineStyleAlphaModifier_AlongStroke {
        	LineStyleModifier modifier; // size=0
        	CurveMapping *curve; // size=4
        	int flags; // size=4
        	int pad; // size=4
        }

        LineStyleThicknessModifier_AlongStroke {
        	LineStyleModifier modifier; // size=0
        	CurveMapping *curve; // size=4
        	int flags; // size=4
        	float value_min; // size=4
        	float value_max; // size=4
        	int pad; // size=4
        }

        LineStyleColorModifier_DistanceFromCamera {
        	LineStyleModifier modifier; // size=0
        	ColorBand *color_ramp; // size=4
        	float range_min; // size=4
        	float range_max; // size=4
        }

        LineStyleAlphaModifier_DistanceFromCamera {
        	LineStyleModifier modifier; // size=0
        	CurveMapping *curve; // size=4
        	int flags; // size=4
        	float range_min; // size=4
        	float range_max; // size=4
        	int pad; // size=4
        }

        LineStyleThicknessModifier_DistanceFromCamera {
        	LineStyleModifier modifier; // size=0
        	CurveMapping *curve; // size=4
        	int flags; // size=4
        	float range_min; // size=4
        	float range_max; // size=4
        	float value_min; // size=4
        	float value_max; // size=4
        	int pad; // size=4
        }

        LineStyleColorModifier_DistanceFromObject {
        	LineStyleModifier modifier; // size=0
        	Object *target; // size=4
        	ColorBand *color_ramp; // size=4
        	float range_min; // size=4
        	float range_max; // size=4
        }

        LineStyleAlphaModifier_DistanceFromObject {
        	LineStyleModifier modifier; // size=0
        	Object *target; // size=4
        	CurveMapping *curve; // size=4
        	int flags; // size=4
        	float range_min; // size=4
        	float range_max; // size=4
        	int pad; // size=4
        }

        LineStyleThicknessModifier_DistanceFromObject {
        	LineStyleModifier modifier; // size=0
        	Object *target; // size=4
        	CurveMapping *curve; // size=4
        	int flags; // size=4
        	float range_min; // size=4
        	float range_max; // size=4
        	float value_min; // size=4
        	float value_max; // size=4
        	int pad; // size=4
        }

        LineStyleColorModifier_Material {
        	LineStyleModifier modifier; // size=0
        	ColorBand *color_ramp; // size=4
        	int flags; // size=4
        	int mat_attr; // size=4
        }

        LineStyleAlphaModifier_Material {
        	LineStyleModifier modifier; // size=0
        	CurveMapping *curve; // size=4
        	int flags; // size=4
        	int mat_attr; // size=4
        }

        LineStyleThicknessModifier_Material {
        	LineStyleModifier modifier; // size=0
        	CurveMapping *curve; // size=4
        	int flags; // size=4
        	float value_min; // size=4
        	float value_max; // size=4
        	int mat_attr; // size=4
        }

        LineStyleGeometryModifier_Sampling {
        	LineStyleModifier modifier; // size=0
        	float sampling; // size=4
        	int pad; // size=4
        }

        LineStyleGeometryModifier_BezierCurve {
        	LineStyleModifier modifier; // size=0
        	float error; // size=4
        	int pad; // size=4
        }

        LineStyleGeometryModifier_SinusDisplacement {
        	LineStyleModifier modifier; // size=0
        	float wavelength; // size=4
        	float amplitude; // size=4
        	float phase; // size=4
        	int pad; // size=4
        }

        LineStyleGeometryModifier_SpatialNoise {
        	LineStyleModifier modifier; // size=0
        	float amplitude; // size=4
        	float scale; // size=4
        	int octaves; // size=4
        	int flags; // size=4
        }

        LineStyleGeometryModifier_PerlinNoise1D {
        	LineStyleModifier modifier; // size=0
        	float frequency; // size=4
        	float amplitude; // size=4
        	float angle; // size=4
        	int octaves; // size=4
        	int seed; // size=4
        	int pad1; // size=4
        }

        LineStyleGeometryModifier_PerlinNoise2D {
        	LineStyleModifier modifier; // size=0
        	float frequency; // size=4
        	float amplitude; // size=4
        	float angle; // size=4
        	int octaves; // size=4
        	int seed; // size=4
        	int pad1; // size=4
        }

        LineStyleGeometryModifier_BackboneStretcher {
        	LineStyleModifier modifier; // size=0
        	float backbone_length; // size=4
        	int pad; // size=4
        }

        LineStyleGeometryModifier_TipRemover {
        	LineStyleModifier modifier; // size=0
        	float tip_length; // size=4
        	int pad; // size=4
        }

        LineStyleGeometryModifier_Polygonalization {
        	LineStyleModifier modifier; // size=0
        	float error; // size=4
        	int pad; // size=4
        }

        LineStyleGeometryModifier_GuidingLines {
        	LineStyleModifier modifier; // size=0
        	float offset; // size=4
        	int pad; // size=4
        }

        LineStyleGeometryModifier_Blueprint {
        	LineStyleModifier modifier; // size=0
        	int flags; // size=4
        	int rounds; // size=4
        	float backbone_length; // size=4
        	int random_radius; // size=4
        	int random_center; // size=4
        	int random_backbone; // size=4
        }

        LineStyleGeometryModifier_2DOffset {
        	LineStyleModifier modifier; // size=0
        	float start; // size=4
        	float end; // size=4
        	float x; // size=4
        	float y; // size=4
        }

        LineStyleGeometryModifier_2DTransform {
        	LineStyleModifier modifier; // size=0
        	int pivot; // size=4
        	float scale_x; // size=4
        	float scale_y; // size=4
        	float angle; // size=4
        	float pivot_u; // size=4
        	float pivot_x; // size=4
        	float pivot_y; // size=4
        	int pad; // size=4
        }

        LineStyleThicknessModifier_Calligraphy {
        	LineStyleModifier modifier; // size=0
        	float min_thickness; // size=4
        	float max_thickness; // size=4
        	float orientation; // size=4
        	int pad; // size=4
        }

        FreestyleLineStyle {
        	ID id; // size=0
        	AnimData *adt; // size=4
        	float r; // size=4
        	float g; // size=4
        	float b; // size=4
        	float alpha; // size=4
        	float thickness; // size=4
        	int thickness_position; // size=4
        	float thickness_ratio; // size=4
        	int flag; // size=4
        	int caps; // size=4
        	int chaining; // size=4
        	int rounds; // size=4
        	float split_length; // size=4
        	float min_angle; // size=4
        	float max_angle; // size=4
        	float min_length; // size=4
        	float max_length; // size=4
        	short split_dash1; // size=2
        	short split_gap1; // size=2
        	short split_dash2; // size=2
        	short split_gap2; // size=2
        	short split_dash3; // size=2
        	short split_gap3; // size=2
        	int sort_key; // size=4
        	int integration_type; // size=4
        	float texstep; // size=4
        	short texact; // size=2
        	short pr_texture; // size=2
        	short use_nodes; // size=2
        	short pad; // size=2
        	short dash1; // size=2
        	short gap1; // size=2
        	short dash2; // size=2
        	short gap2; // size=2
        	short dash3; // size=2
        	short gap3; // size=2
        	int panel; // size=4
        	MTex *mtex[18]; // size=72
        	bNodeTree *nodetree; // size=4
        	ListBase color_modifiers; // size=0
        	ListBase alpha_modifiers; // size=0
        	ListBase thickness_modifiers; // size=0
        	ListBase geometry_modifiers; // size=0
        }
