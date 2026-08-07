package c8;

import d8.i;

/* JADX INFO: loaded from: classes.dex */
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w8.g f18920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f18921b;

    public g(w8.g gVar, long j11) {
        this.f18920a = gVar;
        this.f18921b = j11;
    }

    @Override // c8.e
    public long b(long j11) {
        return this.f18920a.f121313e[(int) j11] - this.f18921b;
    }

    @Override // c8.e
    public long c(long j11, long j12) {
        return this.f18920a.f121312d[(int) j11];
    }

    @Override // c8.e
    public long d(long j11, long j12) {
        return 0L;
    }

    @Override // c8.e
    public long e(long j11, long j12) {
        return -9223372036854775807L;
    }

    @Override // c8.e
    public long f(long j11, long j12) {
        return this.f18920a.a(j11 + this.f18921b);
    }

    @Override // c8.e
    public long g(long j11) {
        return this.f18920a.f121309a;
    }

    @Override // c8.e
    public long h() {
        return 0L;
    }

    @Override // c8.e
    public i i(long j11) {
        w8.g gVar = this.f18920a;
        int i11 = (int) j11;
        return new i(null, gVar.f121311c[i11], gVar.f121310b[i11]);
    }

    @Override // c8.e
    public boolean j() {
        return true;
    }

    @Override // c8.e
    public long k(long j11, long j12) {
        return this.f18920a.f121309a;
    }
}
