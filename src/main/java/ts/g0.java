package ts;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f114998c = new g0(-1, -1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g0 f114999d = new g0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f115000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f115001b;

    public g0(int i11, int i12) {
        a.a((i11 == -1 || i11 >= 0) && (i12 == -1 || i12 >= 0));
        this.f115000a = i11;
        this.f115001b = i12;
    }

    public int a() {
        return this.f115001b;
    }

    public int b() {
        return this.f115000a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            if (this.f115000a == g0Var.f115000a && this.f115001b == g0Var.f115001b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.f115001b;
        int i12 = this.f115000a;
        return i11 ^ ((i12 >>> 16) | (i12 << 16));
    }

    public String toString() {
        return this.f115000a + "x" + this.f115001b;
    }
}
