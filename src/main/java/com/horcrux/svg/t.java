package com.horcrux.svg;

import com.fourthline.analytics.internal.AnalyticsContext;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
enum t {
    UNKNOWN("unknown"),
    NORMAL("normal"),
    MULTIPLY("multiply"),
    SCREEN(AnalyticsContext.Screen),
    DARKEN("darken"),
    LIGHTEN("lighten");

    private static final Map<String, t> typeToEnum = new HashMap();
    private final String mode;

    static {
        for (t tVar : values()) {
            typeToEnum.put(tVar.mode, tVar);
        }
    }

    t(String str) {
        this.mode = str;
    }

    static t getEnum(String str) {
        Map<String, t> map = typeToEnum;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.mode;
    }
}
