package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
enum w {
    OBJECT_BOUNDING_BOX("objectBoundingBox"),
    USER_SPACE_ON_USE("userSpaceOnUse");

    private static final Map<String, w> unitsToEnum = new HashMap();
    private final String units;

    static {
        for (w wVar : values()) {
            unitsToEnum.put(wVar.units, wVar);
        }
    }

    w(String str) {
        this.units = str;
    }

    static w getEnum(String str) {
        Map<String, w> map = unitsToEnum;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Unknown 'Unit' Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.units;
    }
}
