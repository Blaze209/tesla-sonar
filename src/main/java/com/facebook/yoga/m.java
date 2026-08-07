package com.facebook.yoga;

/* JADX INFO: loaded from: classes4.dex */
public enum m {
    COLUMN(0),
    ROW(1),
    ALL(2);

    private final int mIntValue;

    m(int i11) {
        this.mIntValue = i11;
    }

    public static m fromInt(int i11) {
        if (i11 == 0) {
            return COLUMN;
        }
        if (i11 == 1) {
            return ROW;
        }
        if (i11 == 2) {
            return ALL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i11);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
