package e0;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class e extends f0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0.b0<byte[]> f61297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0.r0.g f61298b;

    e(p0.b0<byte[]> b0Var, c0.r0.g gVar) {
        if (b0Var == null) {
            throw new NullPointerException("Null packet");
        }
        this.f61297a = b0Var;
        if (gVar == null) {
            throw new NullPointerException("Null outputFileOptions");
        }
        this.f61298b = gVar;
    }

    @Override // e0.f0.a
    @NonNull
    c0.r0.g a() {
        return this.f61298b;
    }

    @Override // e0.f0.a
    @NonNull
    p0.b0<byte[]> b() {
        return this.f61297a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.a) {
            f0.a aVar = (f0.a) obj;
            if (this.f61297a.equals(aVar.b()) && this.f61298b.equals(aVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f61297a.hashCode() ^ 1000003) * 1000003) ^ this.f61298b.hashCode();
    }

    public String toString() {
        return "In{packet=" + this.f61297a + ", outputFileOptions=" + this.f61298b + "}";
    }
}
