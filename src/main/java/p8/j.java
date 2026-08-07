package p8;

import p7.g0;
import p7.u;
import s7.c0;
import w8.o0;

/* JADX INFO: loaded from: classes3.dex */
public class j extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f101911o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f101912p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final f f101913q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f101914r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile boolean f101915s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f101916t;

    public j(androidx.media3.datasource.a aVar, v7.j jVar, u uVar, int i11, Object obj, long j11, long j12, long j13, long j14, long j15, int i12, long j16, f fVar) {
        super(aVar, jVar, uVar, i11, obj, j11, j12, j13, j14, j15);
        this.f101911o = i12;
        this.f101912p = j16;
        this.f101913q = fVar;
    }

    private void m(c cVar) {
        if (g0.q(this.f101873d.f101543n)) {
            u uVar = this.f101873d;
            int i11 = uVar.N;
            if ((i11 <= 1 && uVar.O <= 1) || i11 == -1 || uVar.O == -1) {
                return;
            }
            o0 o0VarB = cVar.b(0, 4);
            u uVar2 = this.f101873d;
            int i12 = uVar2.N * uVar2.O;
            long j11 = (this.f101877h - this.f101876g) / ((long) i12);
            for (int i13 = 1; i13 < i12; i13++) {
                o0VarB.f(new c0(), 0);
                o0VarB.b(((long) i13) * j11, 0, 0, 0, null);
            }
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public final void a() {
        c cVarJ = j();
        if (this.f101914r == 0) {
            cVarJ.c(this.f101912p);
            f fVar = this.f101913q;
            f.b bVarL = l(cVarJ);
            long j11 = this.f101840k;
            long j12 = j11 == -9223372036854775807L ? -9223372036854775807L : j11 - this.f101912p;
            long j13 = this.f101841l;
            fVar.c(bVarL, j12, j13 != -9223372036854775807L ? j13 - this.f101912p : -9223372036854775807L);
        }
        try {
            v7.j jVarE = this.f101871b.e(this.f101914r);
            v7.o oVar = this.f101878i;
            w8.j jVar = new w8.j(oVar, jVarE.f118107g, oVar.j(jVarE));
            do {
                try {
                    if (this.f101915s) {
                        break;
                    }
                } catch (Throwable th2) {
                    this.f101914r = jVar.getPosition() - this.f101871b.f118107g;
                    throw th2;
                }
            } while (this.f101913q.a(jVar));
            m(cVarJ);
            this.f101914r = jVar.getPosition() - this.f101871b.f118107g;
            n();
            v7.i.a(this.f101878i);
            this.f101916t = !this.f101915s;
        } catch (Throwable th3) {
            n();
            v7.i.a(this.f101878i);
            throw th3;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public final void b() {
        this.f101915s = true;
    }

    @Override // p8.m
    public long g() {
        return this.f101924j + ((long) this.f101911o);
    }

    @Override // p8.m
    public boolean h() {
        return this.f101916t;
    }

    protected void n() {
    }

    protected f.b l(c cVar) {
        return cVar;
    }
}
