package org.terasology.blender.api

/**
 * Created by synopia on 11/10/14.
 */
class StructureParser {
    SDNA types = [:]
    List<Structure> structures = []

    def parse(RandomAccessDataInput input) {
        List<String> names = []
        List<String> typeNames = []
        List<Integer> lengths = []

        Map<Integer, List<List<Integer>>> fields = [:]

        expect(input, "SDNA")
        expect(input, "NAME")
        def nameCnt = input.readInt()
        for (int i = 0; i < nameCnt; i++) {
            names << input.readString()
        }

        input.align()
        expect(input, "TYPE")
        def typeCnt = input.readInt()
        for (int i = 0; i < typeCnt; i++) {
            typeNames << input.readString()
        }

        input.align()
        expect(input, "TLEN")
        for (int i = 0; i < typeCnt; i++) {
            lengths << input.readShort()
        }

        input.align()
        expect(input, "STRC")
        def structuresCnt = input.readInt()
        for (int i = 0; i < structuresCnt; i++) {

            int type = input.readShort()
            def fieldCnt = input.readShort()

            fields[type] = []
            types[type] = new Structure(structures.size(), typeNames.get(type), lengths.get(type))
            structures << types[type]
            for (int j = 0; j < fieldCnt; j++) {
                int ftype = input.readShort()
                int name = input.readShort()

                fields[type] << [ftype, name]
            }
        }

        for (int i = 0; i < typeCnt; i++) {
            def struct = fields[i]
            if (struct == null) {
                types[i] = new Type(i, typeNames.get(i), lengths.get(i))
            }
        }
        for (int i = 0; i < typeCnt; i++) {
            def struct = fields[i]
            if (struct != null) {
                types[i].fields = struct.collect { List<Integer> list ->
                    new Field(types[list[0]], names.get(list[1]))
                }
            }
        }
    }

    private def expect(RandomAccessDataInput input, String str) {
        def actual = input.readString(str.size())
        if (actual != str) {
            throw new IllegalStateException("Expected $str, got $actual!");
        }
    }
}
