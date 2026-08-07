package com.facebook.yoga;

/* JADX INFO: loaded from: classes4.dex */
public enum k {
    NONE(0),
    STRETCH_FLEX_BASIS(1),
    ABSOLUTE_POSITION_WITHOUT_INSETS_EXCLUDES_PADDING(2),
    ABSOLUTE_PERCENT_AGAINST_INNER_SIZE(4),
    ALL(Integer.MAX_VALUE),
    CLASSIC(2147483646);

    private final int mIntValue;

    k(int i11) {
        this.mIntValue = i11;
    }

    public static k fromInt(int i11) {
        if (i11 == 0) {
            return NONE;
        }
        if (i11 == 1) {
            return STRETCH_FLEX_BASIS;
        }
        if (i11 == 2) {
            return ABSOLUTE_POSITION_WITHOUT_INSETS_EXCLUDES_PADDING;
        }
        if (i11 == 4) {
            return ABSOLUTE_PERCENT_AGAINST_INNER_SIZE;
        }
        switch (i11) {
            case 2147483646:
                return CLASSIC;
            case Integer.MAX_VALUE:
                return ALL;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i11);
        }
    }

    public int intValue() {
        return this.mIntValue;
    }
}
