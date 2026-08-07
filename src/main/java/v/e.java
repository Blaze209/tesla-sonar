package v;

/* JADX INFO: loaded from: classes.dex */
final class e extends u4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f116941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f116942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f116943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f116944d;

    e(int i11, int i12, boolean z11, boolean z12) {
        this.f116941a = i11;
        this.f116942b = i12;
        this.f116943c = z11;
        this.f116944d = z12;
    }

    @Override // v.u4.b
    int a() {
        return this.f116941a;
    }

    @Override // v.u4.b
    int b() {
        return this.f116942b;
    }

    @Override // v.u4.b
    boolean c() {
        return this.f116943c;
    }

    @Override // v.u4.b
    boolean d() {
        return this.f116944d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u4.b) {
            u4.b bVar = (u4.b) obj;
            if (this.f116941a == bVar.a() && this.f116942b == bVar.b() && this.f116943c == bVar.c() && this.f116944d == bVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f116941a ^ 1000003) * 1000003) ^ this.f116942b) * 1000003) ^ (this.f116943c ? 1231 : 1237)) * 1000003) ^ (this.f116944d ? 1231 : 1237);
    }

    public String toString() {
        return "FeatureSettings{cameraMode=" + this.f116941a + ", requiredMaxBitDepth=" + this.f116942b + ", previewStabilizationOn=" + this.f116943c + ", ultraHdrOn=" + this.f116944d + "}";
    }
}
