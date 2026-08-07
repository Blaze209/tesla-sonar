package com.facebook.yoga;

/* JADX INFO: loaded from: classes4.dex */
public enum w {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3),
    MAX_CONTENT(4),
    FIT_CONTENT(5),
    STRETCH(6);

    private final int mIntValue;

    w(int i11) {
        this.mIntValue = i11;
    }

    public static w fromInt(int i11) {
        switch (i11) {
            case 0:
                return UNDEFINED;
            case 1:
                return POINT;
            case 2:
                return PERCENT;
            case 3:
                return AUTO;
            case 4:
                return MAX_CONTENT;
            case 5:
                return FIT_CONTENT;
            case 6:
                return STRETCH;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i11);
        }
    }

    public int intValue() {
        return this.mIntValue;
    }
}
