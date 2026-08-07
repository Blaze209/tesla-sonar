package com.facebook.yoga;

/* JADX INFO: loaded from: classes4.dex */
public enum n {
    FLEX_START(0),
    CENTER(1),
    FLEX_END(2),
    SPACE_BETWEEN(3),
    SPACE_AROUND(4),
    SPACE_EVENLY(5);

    private final int mIntValue;

    n(int i11) {
        this.mIntValue = i11;
    }

    public static n fromInt(int i11) {
        if (i11 == 0) {
            return FLEX_START;
        }
        if (i11 == 1) {
            return CENTER;
        }
        if (i11 == 2) {
            return FLEX_END;
        }
        if (i11 == 3) {
            return SPACE_BETWEEN;
        }
        if (i11 == 4) {
            return SPACE_AROUND;
        }
        if (i11 == 5) {
            return SPACE_EVENLY;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i11);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
