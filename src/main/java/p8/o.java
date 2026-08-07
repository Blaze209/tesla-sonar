package p8;

import p7.u;
import w8.o0;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f101926o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final u f101927p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f101928q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f101929r;

    public o(androidx.media3.datasource.a aVar, v7.j jVar, u uVar, int i11, Object obj, long j11, long j12, long j13, int i12, u uVar2) {
        super(aVar, jVar, uVar, i11, obj, j11, j12, -9223372036854775807L, -9223372036854775807L, j13);
        this.f101926o = i12;
        this.f101927p = uVar2;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public void a() {
        c cVarJ = j();
        cVarJ.c(0L);
        o0 o0VarB = cVarJ.b(0, this.f101926o);
        o0VarB.g(this.f101927p);
        try {
            long j11 = this.f101878i.j(this.f101871b.e(this.f101928q));
            if (j11 != -1) {
                j11 += this.f101928q;
            }
            w8.j jVar = new w8.j(this.f101878i, this.f101928q, j11);
            for (int iE = 0; iE != -1; iE = o0VarB.e(jVar, Integer.MAX_VALUE, true)) {
                this.f101928q += (long) iE;
            }
            o0VarB.b(this.f101876g, 1, (int) this.f101928q, 0, null);
            v7.i.a(this.f101878i);
            this.f101929r = true;
        } catch (Throwable th2) {
            v7.i.a(this.f101878i);
            throw th2;
        }
    }

    @Override // p8.m
    public boolean h() {
        return this.f101929r;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public void b() {
    }
}
