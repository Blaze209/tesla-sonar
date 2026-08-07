package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
enum s {
    UNKNOWN("unknown"),
    DUPLICATE("duplicate"),
    WRAP("wrap"),
    NONE("none");

    private static final Map<String, s> edgeModeToEnum = new HashMap();
    private final String edgeMode;

    static {
        for (s sVar : values()) {
            edgeModeToEnum.put(sVar.edgeMode, sVar);
        }
    }

    s(String str) {
        this.edgeMode = str;
    }

    static s getEnum(String str) {
        Map<String, s> map = edgeModeToEnum;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Unknown 'edgeMode' Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.edgeMode;
    }
}
