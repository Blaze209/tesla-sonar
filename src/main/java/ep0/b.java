package ep0;

/* JADX INFO: loaded from: classes9.dex */
public enum b {
    PROLEPTIC_JULIAN,
    PROLEPTIC_GREGORIAN,
    SWEDEN,
    INTRODUCTION_ON_1582_10_15,
    SINGLE_CUTOVER_DATE,
    PROLEPTIC_BYZANTINE;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63121a;

        static {
            int[] iArr = new int[b.values().length];
            f63121a = iArr;
            try {
                iArr[b.PROLEPTIC_JULIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63121a[b.PROLEPTIC_GREGORIAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63121a[b.SWEDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63121a[b.INTRODUCTION_ON_1582_10_15.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f63121a[b.PROLEPTIC_BYZANTINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public int getSerialValue() {
        int i11 = a.f63121a[ordinal()];
        if (i11 == 1) {
            return 2;
        }
        if (i11 == 2) {
            return 1;
        }
        if (i11 == 3) {
            return 4;
        }
        if (i11 != 4) {
            return i11 != 5 ? 0 : 3;
        }
        return 7;
    }
}
