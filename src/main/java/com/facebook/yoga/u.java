package com.facebook.yoga;

/* JADX INFO: loaded from: classes4.dex */
public enum u {
    VISIBLE(0),
    HIDDEN(1),
    SCROLL(2);

    private final int mIntValue;

    u(int i11) {
        this.mIntValue = i11;
    }

    public static u fromInt(int i11) {
        if (i11 == 0) {
            return VISIBLE;
        }
        if (i11 == 1) {
            return HIDDEN;
        }
        if (i11 == 2) {
            return SCROLL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i11);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
