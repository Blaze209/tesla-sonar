package com.facebook.yoga;

/* JADX INFO: loaded from: classes4.dex */
public enum p {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    private final int mIntValue;

    p(int i11) {
        this.mIntValue = i11;
    }

    public static p fromInt(int i11) {
        if (i11 == 0) {
            return UNDEFINED;
        }
        if (i11 == 1) {
            return EXACTLY;
        }
        if (i11 == 2) {
            return AT_MOST;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i11);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
