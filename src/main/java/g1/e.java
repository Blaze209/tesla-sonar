package g1;

/* JADX INFO: loaded from: classes.dex */
final class e extends n1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f66877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f66878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f66879g;

    e(int i11, int i12, int i13) {
        this.f66877e = i11;
        this.f66878f = i12;
        this.f66879g = i13;
    }

    @Override // g1.n1
    public int b() {
        return this.f66879g;
    }

    @Override // g1.n1
    public int c() {
        return this.f66877e;
    }

    @Override // g1.n1
    public int d() {
        return this.f66878f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n1) {
            n1 n1Var = (n1) obj;
            if (this.f66877e == n1Var.c() && this.f66878f == n1Var.d() && this.f66879g == n1Var.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f66877e ^ 1000003) * 1000003) ^ this.f66878f) * 1000003) ^ this.f66879g;
    }

    public String toString() {
        return "VideoEncoderDataSpace{standard=" + this.f66877e + ", transfer=" + this.f66878f + ", range=" + this.f66879g + "}";
    }
}
