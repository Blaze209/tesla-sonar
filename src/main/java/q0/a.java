package q0;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0.f f104124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r0.f f104125b;

    a(r0.f fVar, r0.f fVar2) {
        if (fVar == null) {
            throw new NullPointerException("Null primaryOutConfig");
        }
        this.f104124a = fVar;
        if (fVar2 == null) {
            throw new NullPointerException("Null secondaryOutConfig");
        }
        this.f104125b = fVar2;
    }

    @Override // q0.d
    @NonNull
    public r0.f a() {
        return this.f104124a;
    }

    @Override // q0.d
    @NonNull
    public r0.f b() {
        return this.f104125b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f104124a.equals(dVar.a()) && this.f104125b.equals(dVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f104124a.hashCode() ^ 1000003) * 1000003) ^ this.f104125b.hashCode();
    }

    public String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f104124a + ", secondaryOutConfig=" + this.f104125b + "}";
    }
}
