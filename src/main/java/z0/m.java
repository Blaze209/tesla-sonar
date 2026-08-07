package z0;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class m extends i1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f126177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i1.a f126178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c0.z1.h f126179f;

    m(int i11, i1.a aVar, c0.z1.h hVar) {
        this.f126177d = i11;
        if (aVar == null) {
            throw new NullPointerException("Null streamState");
        }
        this.f126178e = aVar;
        this.f126179f = hVar;
    }

    @Override // z0.i1
    public int a() {
        return this.f126177d;
    }

    @Override // z0.i1
    public c0.z1.h b() {
        return this.f126179f;
    }

    @Override // z0.i1
    @NonNull
    public i1.a c() {
        return this.f126178e;
    }

    public boolean equals(Object obj) {
        c0.z1.h hVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            if (this.f126177d == i1Var.a() && this.f126178e.equals(i1Var.c()) && ((hVar = this.f126179f) != null ? hVar.equals(i1Var.b()) : i1Var.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f126177d ^ 1000003) * 1000003) ^ this.f126178e.hashCode()) * 1000003;
        c0.z1.h hVar = this.f126179f;
        return iHashCode ^ (hVar == null ? 0 : hVar.hashCode());
    }

    public String toString() {
        return "StreamInfo{id=" + this.f126177d + ", streamState=" + this.f126178e + ", inProgressTransformationInfo=" + this.f126179f + "}";
    }
}
