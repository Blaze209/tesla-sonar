package p9;

import w8.f0;

/* JADX INFO: loaded from: classes3.dex */
final class a extends w8.i implements g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f101973h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f101974i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f101975j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f101976k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f101977l;

    public a(long j11, long j12, f0.a aVar, boolean z11) {
        this(j11, j12, aVar.f121307f, aVar.f121304c, z11);
    }

    @Override // p9.g
    public long b(long j11) {
        return e(j11);
    }

    @Override // p9.g
    public long f() {
        return this.f101977l;
    }

    public a i(long j11) {
        return new a(j11, this.f101973h, this.f101974i, this.f101975j, this.f101976k);
    }

    @Override // p9.g
    public long k() {
        return this.f101973h;
    }

    @Override // p9.g
    public int m() {
        return this.f101974i;
    }

    public a(long j11, long j12, int i11, int i12, boolean z11) {
        super(j11, j12, i11, i12, z11);
        long j13 = j11;
        this.f101973h = j12;
        this.f101974i = i11;
        this.f101975j = i12;
        this.f101976k = z11;
        this.f101977l = j13 == -1 ? -1L : j13;
    }
}
