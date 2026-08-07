package net.time4j.tz;

/* JADX INFO: loaded from: classes9.dex */
class i implements net.time4j.base.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f94755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f94756b;

    private i(long j11, int i11) {
        this.f94755a = j11;
        this.f94756b = i11;
    }

    static net.time4j.base.f b(long j11, int i11) {
        if (i11 == 0) {
            j11--;
        }
        return new i(j11, i11 == 0 ? 999999999 : i11 - 1);
    }

    @Override // net.time4j.base.f
    public int a() {
        return this.f94756b;
    }

    @Override // net.time4j.base.f
    public long l() {
        return this.f94755a;
    }
}
