package androidx.profileinstaller;

/* JADX INFO: loaded from: classes3.dex */
enum f {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    f(long j11) {
        this.mValue = j11;
    }

    static f fromValue(long j11) {
        f[] fVarArrValues = values();
        for (int i11 = 0; i11 < fVarArrValues.length; i11++) {
            if (fVarArrValues[i11].getValue() == j11) {
                return fVarArrValues[i11];
            }
        }
        throw new IllegalArgumentException("Unsupported FileSection Type " + j11);
    }

    public long getValue() {
        return this.mValue;
    }
}
