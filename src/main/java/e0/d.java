package e0;

/* JADX INFO: loaded from: classes.dex */
final class d extends b0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0.b0<androidx.camera.core.n> f61287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f61288b;

    d(p0.b0<androidx.camera.core.n> b0Var, int i11) {
        if (b0Var == null) {
            throw new NullPointerException("Null packet");
        }
        this.f61287a = b0Var;
        this.f61288b = i11;
    }

    @Override // e0.b0.a
    int a() {
        return this.f61288b;
    }

    @Override // e0.b0.a
    p0.b0<androidx.camera.core.n> b() {
        return this.f61287a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.a) {
            b0.a aVar = (b0.a) obj;
            if (this.f61287a.equals(aVar.b()) && this.f61288b == aVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f61287a.hashCode() ^ 1000003) * 1000003) ^ this.f61288b;
    }

    public String toString() {
        return "In{packet=" + this.f61287a + ", jpegQuality=" + this.f61288b + "}";
    }
}
