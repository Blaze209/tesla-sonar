package qq;

/* JADX INFO: loaded from: classes4.dex */
final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g.a f105836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f105837b;

    b(g.a aVar, long j11) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f105836a = aVar;
        this.f105837b = j11;
    }

    @Override // qq.g
    public long b() {
        return this.f105837b;
    }

    @Override // qq.g
    public g.a c() {
        return this.f105836a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f105836a.equals(gVar.c()) && this.f105837b == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f105836a.hashCode() ^ 1000003) * 1000003;
        long j11 = this.f105837b;
        return iHashCode ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f105836a + ", nextRequestWaitMillis=" + this.f105837b + "}";
    }
}
