package e0;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
final class a extends j.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0.b0<Bitmap> f61269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f61270b;

    a(p0.b0<Bitmap> b0Var, int i11) {
        if (b0Var == null) {
            throw new NullPointerException("Null packet");
        }
        this.f61269a = b0Var;
        this.f61270b = i11;
    }

    @Override // e0.j.b
    int a() {
        return this.f61270b;
    }

    @Override // e0.j.b
    p0.b0<Bitmap> b() {
        return this.f61269a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j.b) {
            j.b bVar = (j.b) obj;
            if (this.f61269a.equals(bVar.b()) && this.f61270b == bVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f61269a.hashCode() ^ 1000003) * 1000003) ^ this.f61270b;
    }

    public String toString() {
        return "In{packet=" + this.f61269a + ", jpegQuality=" + this.f61270b + "}";
    }
}
