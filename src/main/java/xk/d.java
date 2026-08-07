package xk;

/* JADX INFO: loaded from: classes3.dex */
public enum d {
    YES,
    NO,
    UNSET;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f123626a;

        static {
            int[] iArr = new int[d.values().length];
            f123626a = iArr;
            try {
                iArr[d.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f123626a[d.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f123626a[d.UNSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static d fromDbValue(int i11) {
        if (i11 != 1) {
            return i11 != 2 ? UNSET : NO;
        }
        return YES;
    }

    public boolean asBoolean() {
        int i11 = a.f123626a[ordinal()];
        if (i11 == 1) {
            return true;
        }
        if (i11 == 2) {
            return false;
        }
        if (i11 == 3) {
            throw new IllegalStateException("No boolean equivalent for UNSET");
        }
        throw new IllegalStateException("Unrecognized TriState value: " + this);
    }

    public Boolean asBooleanObject() {
        int i11 = a.f123626a[ordinal()];
        if (i11 == 1) {
            return Boolean.TRUE;
        }
        if (i11 == 2) {
            return Boolean.FALSE;
        }
        if (i11 == 3) {
            return null;
        }
        throw new IllegalStateException("Unrecognized TriState value: " + this);
    }

    public int getDbValue() {
        int i11 = a.f123626a[ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                return 3;
            }
        }
        return i12;
    }

    public boolean isSet() {
        return this != UNSET;
    }

    public static d valueOf(boolean z11) {
        return z11 ? YES : NO;
    }

    public static d valueOf(Boolean bool) {
        return bool != null ? valueOf(bool.booleanValue()) : UNSET;
    }

    public boolean asBoolean(boolean z11) {
        int i11 = a.f123626a[ordinal()];
        if (i11 == 1) {
            return true;
        }
        if (i11 == 2) {
            return false;
        }
        if (i11 == 3) {
            return z11;
        }
        throw new IllegalStateException("Unrecognized TriState value: " + this);
    }
}
