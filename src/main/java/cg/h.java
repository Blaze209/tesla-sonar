package cg;

/* JADX INFO: loaded from: classes3.dex */
public enum h {
    NORMAL,
    MULTIPLY,
    SCREEN,
    OVERLAY,
    DARKEN,
    LIGHTEN,
    COLOR_DODGE,
    COLOR_BURN,
    HARD_LIGHT,
    SOFT_LIGHT,
    DIFFERENCE,
    EXCLUSION,
    HUE,
    SATURATION,
    COLOR,
    LUMINOSITY,
    ADD,
    HARD_MIX;

    public k5.b toNativeBlendMode() {
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return k5.b.MODULATE;
        }
        if (iOrdinal == 2) {
            return k5.b.SCREEN;
        }
        if (iOrdinal == 3) {
            return k5.b.OVERLAY;
        }
        if (iOrdinal == 4) {
            return k5.b.DARKEN;
        }
        if (iOrdinal == 5) {
            return k5.b.LIGHTEN;
        }
        if (iOrdinal != 16) {
            return null;
        }
        return k5.b.PLUS;
    }
}
