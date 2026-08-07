package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
enum b1 {
    None("none"),
    Underline("underline"),
    Overline("overline"),
    LineThrough("line-through"),
    Blink("blink");

    private static final Map<String, b1> decorationToEnum = new HashMap();
    private final String decoration;

    static {
        for (b1 b1Var : values()) {
            decorationToEnum.put(b1Var.decoration, b1Var);
        }
    }

    b1(String str) {
        this.decoration = str;
    }

    static b1 getEnum(String str) {
        Map<String, b1> map = decorationToEnum;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.decoration;
    }
}
