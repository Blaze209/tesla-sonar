package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
enum u {
    MATRIX("matrix"),
    SATURATE("saturate"),
    HUE_ROTATE("hueRotate"),
    LUMINANCE_TO_ALPHA("luminanceToAlpha");

    private static final Map<String, u> typeToEnum = new HashMap();
    private final String type;

    static {
        for (u uVar : values()) {
            typeToEnum.put(uVar.type, uVar);
        }
    }

    u(String str) {
        this.type = str;
    }

    static u getEnum(String str) {
        Map<String, u> map = typeToEnum;
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
