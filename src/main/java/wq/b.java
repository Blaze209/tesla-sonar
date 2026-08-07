package wq;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zq.a f122181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<nq.f, f.b> f122182b;

    b(zq.a aVar, Map<nq.f, f.b> map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f122181a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f122182b = map;
    }

    @Override // wq.f
    zq.a e() {
        return this.f122181a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f122181a.equals(fVar.e()) && this.f122182b.equals(fVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // wq.f
    Map<nq.f, f.b> h() {
        return this.f122182b;
    }

    public int hashCode() {
        return ((this.f122181a.hashCode() ^ 1000003) * 1000003) ^ this.f122182b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f122181a + ", values=" + this.f122182b + "}";
    }
}
