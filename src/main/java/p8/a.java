package p8;

import p7.u;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f101840k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f101841l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f101842m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f101843n;

    public a(androidx.media3.datasource.a aVar, v7.j jVar, u uVar, int i11, Object obj, long j11, long j12, long j13, long j14, long j15) {
        super(aVar, jVar, uVar, i11, obj, j11, j12, j15);
        this.f101840k = j13;
        this.f101841l = j14;
    }

    public final int i(int i11) {
        return ((int[]) s7.a.j(this.f101843n))[i11];
    }

    protected final c j() {
        return (c) s7.a.j(this.f101842m);
    }

    public void k(c cVar) {
        this.f101842m = cVar;
        this.f101843n = cVar.a();
    }
}
