package e0;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class c extends y.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.camera.core.n f61282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f61283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0.r0.g f61284c;

    c(androidx.camera.core.n nVar, int i11, c0.r0.g gVar) {
        if (nVar == null) {
            throw new NullPointerException("Null imageProxy");
        }
        this.f61282a = nVar;
        this.f61283b = i11;
        if (gVar == null) {
            throw new NullPointerException("Null outputFileOptions");
        }
        this.f61284c = gVar;
    }

    @Override // e0.y.a
    @NonNull
    androidx.camera.core.n a() {
        return this.f61282a;
    }

    @Override // e0.y.a
    @NonNull
    c0.r0.g b() {
        return this.f61284c;
    }

    @Override // e0.y.a
    int c() {
        return this.f61283b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y.a) {
            y.a aVar = (y.a) obj;
            if (this.f61282a.equals(aVar.a()) && this.f61283b == aVar.c() && this.f61284c.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f61282a.hashCode() ^ 1000003) * 1000003) ^ this.f61283b) * 1000003) ^ this.f61284c.hashCode();
    }

    public String toString() {
        return "In{imageProxy=" + this.f61282a + ", rotationDegrees=" + this.f61283b + ", outputFileOptions=" + this.f61284c + "}";
    }
}
