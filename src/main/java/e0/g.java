package e0;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class g extends t0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u0 f61313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.camera.core.n f61314b;

    g(u0 u0Var, androidx.camera.core.n nVar) {
        if (u0Var == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.f61313a = u0Var;
        if (nVar == null) {
            throw new NullPointerException("Null imageProxy");
        }
        this.f61314b = nVar;
    }

    @Override // e0.t0.b
    @NonNull
    androidx.camera.core.n a() {
        return this.f61314b;
    }

    @Override // e0.t0.b
    @NonNull
    u0 b() {
        return this.f61313a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t0.b) {
            t0.b bVar = (t0.b) obj;
            if (this.f61313a.equals(bVar.b()) && this.f61314b.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f61313a.hashCode() ^ 1000003) * 1000003) ^ this.f61314b.hashCode();
    }

    public String toString() {
        return "InputPacket{processingRequest=" + this.f61313a + ", imageProxy=" + this.f61314b + "}";
    }
}
