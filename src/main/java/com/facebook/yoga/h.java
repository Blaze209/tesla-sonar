package com.facebook.yoga;

/* JADX INFO: loaded from: classes4.dex */
public enum h {
    INHERIT(0),
    LTR(1),
    RTL(2);

    private final int mIntValue;

    h(int i11) {
        this.mIntValue = i11;
    }

    public static h fromInt(int i11) {
        if (i11 == 0) {
            return INHERIT;
        }
        if (i11 == 1) {
            return LTR;
        }
        if (i11 == 2) {
            return RTL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i11);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
