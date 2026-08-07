package oq;

/* JADX INFO: loaded from: classes4.dex */
final class l extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f98457a;

    l(long j11) {
        this.f98457a = j11;
    }

    @Override // oq.v
    public long c() {
        return this.f98457a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof v) && this.f98457a == ((v) obj).c();
    }

    public int hashCode() {
        long j11 = this.f98457a;
        return ((int) (j11 ^ (j11 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f98457a + "}";
    }
}
