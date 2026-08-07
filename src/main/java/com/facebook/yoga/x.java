package com.facebook.yoga;

/* JADX INFO: loaded from: classes4.dex */
public enum x {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);

    private final int mIntValue;

    x(int i11) {
        this.mIntValue = i11;
    }

    public static x fromInt(int i11) {
        if (i11 == 0) {
            return NO_WRAP;
        }
        if (i11 == 1) {
            return WRAP;
        }
        if (i11 == 2) {
            return WRAP_REVERSE;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i11);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
