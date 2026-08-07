package xq;

/* JADX INFO: loaded from: classes4.dex */
final class b extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f123955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pq.p f123956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pq.i f123957c;

    b(long j11, pq.p pVar, pq.i iVar) {
        this.f123955a = j11;
        if (pVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f123956b = pVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f123957c = iVar;
    }

    @Override // xq.k
    public pq.i b() {
        return this.f123957c;
    }

    @Override // xq.k
    public long c() {
        return this.f123955a;
    }

    @Override // xq.k
    public pq.p d() {
        return this.f123956b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f123955a == kVar.c() && this.f123956b.equals(kVar.d()) && this.f123957c.equals(kVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j11 = this.f123955a;
        return ((((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ this.f123956b.hashCode()) * 1000003) ^ this.f123957c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f123955a + ", transportContext=" + this.f123956b + ", event=" + this.f123957c + "}";
    }
}
