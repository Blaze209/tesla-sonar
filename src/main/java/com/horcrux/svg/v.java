package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
enum v {
    OVER("over"),
    IN("in"),
    OUT("out"),
    ATOP("atop"),
    XOR("xor"),
    ARITHMETIC("arithmetic");

    private static final Map<String, v> typeToEnum = new HashMap();
    private final String type;

    static {
        for (v vVar : values()) {
            typeToEnum.put(vVar.type, vVar);
        }
    }

    v(String str) {
        this.type = str;
    }

    static v getEnum(String str) {
        Map<String, v> map = typeToEnum;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.type;
    }
}
