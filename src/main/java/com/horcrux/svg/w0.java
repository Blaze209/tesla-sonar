package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
enum w0 {
    baseline("baseline"),
    textBottom("text-bottom"),
    alphabetic("alphabetic"),
    ideographic("ideographic"),
    middle("middle"),
    central("central"),
    mathematical("mathematical"),
    textTop("text-top"),
    bottom("bottom"),
    center("center"),
    top("top"),
    textBeforeEdge("text-before-edge"),
    textAfterEdge("text-after-edge"),
    beforeEdge("before-edge"),
    afterEdge("after-edge"),
    hanging("hanging");

    private static final Map<String, w0> alignmentToEnum = new HashMap();
    private final String alignment;

    static {
        for (w0 w0Var : values()) {
            alignmentToEnum.put(w0Var.alignment, w0Var);
        }
    }

    w0(String str) {
        this.alignment = str;
    }

    static w0 getEnum(String str) {
        Map<String, w0> map = alignmentToEnum;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.alignment;
    }
}
