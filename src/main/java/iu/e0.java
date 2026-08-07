package iu;

/* JADX INFO: loaded from: classes5.dex */
final class e0 extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f81877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f81878b;

    e0(int i11, long j11) {
        this.f81877a = i11;
        this.f81878b = j11;
    }

    @Override // iu.f0
    public final int a() {
        return this.f81877a;
    }

    @Override // iu.f0
    public final long b() {
        return this.f81878b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            if (this.f81877a == f0Var.a() && this.f81878b == f0Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j11 = this.f81878b;
        return ((int) (j11 ^ (j11 >>> 32))) ^ ((this.f81877a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f81877a + ", eventTimestamp=" + this.f81878b + "}";
    }
}
