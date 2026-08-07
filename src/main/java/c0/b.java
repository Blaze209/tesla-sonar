package c0;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class b extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q.b f18252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q.a f18253b;

    b(q.b bVar, q.a aVar) {
        if (bVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f18252a = bVar;
        this.f18253b = aVar;
    }

    @Override // c0.q
    public q.a c() {
        return this.f18253b;
    }

    @Override // c0.q
    @NonNull
    public q.b d() {
        return this.f18252a;
    }

    public boolean equals(Object obj) {
        q.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f18252a.equals(qVar.d()) && ((aVar = this.f18253b) != null ? aVar.equals(qVar.c()) : qVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f18252a.hashCode() ^ 1000003) * 1000003;
        q.a aVar = this.f18253b;
        return iHashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "CameraState{type=" + this.f18252a + ", error=" + this.f18253b + "}";
    }
}
