package com.facebook.yoga;

/* JADX INFO: loaded from: classes4.dex */
public enum l {
    COLUMN(0),
    COLUMN_REVERSE(1),
    ROW(2),
    ROW_REVERSE(3);

    private final int mIntValue;

    l(int i11) {
        this.mIntValue = i11;
    }

    public static l fromInt(int i11) {
        if (i11 == 0) {
            return COLUMN;
        }
        if (i11 == 1) {
            return COLUMN_REVERSE;
        }
        if (i11 == 2) {
            return ROW;
        }
        if (i11 == 3) {
            return ROW_REVERSE;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i11);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
