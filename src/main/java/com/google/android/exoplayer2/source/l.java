package com.google.android.exoplayer2.source;

import br.l0;
import java.io.IOException;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class l implements n, n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o.b f40482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f40483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ss.b f40484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o f40485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private n f40486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private n.a f40487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f40488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f40489h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f40490i = -9223372036854775807L;

    public interface a {
        void a(o.b bVar, IOException iOException);

        void b(o.b bVar);
    }

    public l(o.b bVar, ss.b bVar2, long j11) {
        this.f40482a = bVar;
        this.f40484c = bVar2;
        this.f40483b = j11;
    }

    private long q(long j11) {
        long j12 = this.f40490i;
        return j12 != -9223372036854775807L ? j12 : j11;
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean a(long j11) {
        n nVar = this.f40486e;
        return nVar != null && nVar.a(j11);
    }

    public void b(o.b bVar) {
        long jQ = q(this.f40483b);
        n nVarG = ((o) ts.a.e(this.f40485d)).g(bVar, this.f40484c, jQ);
        this.f40486e = nVarG;
        if (this.f40487f != null) {
            nVarG.s(this, jQ);
        }
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean c() {
        n nVar = this.f40486e;
        return nVar != null && nVar.c();
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long d() {
        return ((n) p0.j(this.f40486e)).d();
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public void e(long j11) {
        ((n) p0.j(this.f40486e)).e(j11);
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long f() {
        return ((n) p0.j(this.f40486e)).f();
    }

    @Override // com.google.android.exoplayer2.source.n
    public long g(long j11) {
        return ((n) p0.j(this.f40486e)).g(j11);
    }

    @Override // com.google.android.exoplayer2.source.n
    public long h() {
        return ((n) p0.j(this.f40486e)).h();
    }

    @Override // com.google.android.exoplayer2.source.n.a
    public void j(n nVar) {
        ((n.a) p0.j(this.f40487f)).j(this);
        a aVar = this.f40488g;
        if (aVar != null) {
            aVar.b(this.f40482a);
        }
    }

    @Override // com.google.android.exoplayer2.source.n
    public es.w k() {
        return ((n) p0.j(this.f40486e)).k();
    }

    @Override // com.google.android.exoplayer2.source.n
    public long l(long j11, l0 l0Var) {
        return ((n) p0.j(this.f40486e)).l(j11, l0Var);
    }

    public long m() {
        return this.f40490i;
    }

    @Override // com.google.android.exoplayer2.source.n
    public void n() throws IOException {
        try {
            n nVar = this.f40486e;
            if (nVar != null) {
                nVar.n();
                return;
            }
            o oVar = this.f40485d;
            if (oVar != null) {
                oVar.b();
            }
        } catch (IOException e11) {
            a aVar = this.f40488g;
            if (aVar == null) {
                throw e11;
            }
            if (this.f40489h) {
                return;
            }
            this.f40489h = true;
            aVar.a(this.f40482a, e11);
        }
    }

    @Override // com.google.android.exoplayer2.source.n
    public void o(long j11, boolean z11) {
        ((n) p0.j(this.f40486e)).o(j11, z11);
    }

    public long p() {
        return this.f40483b;
    }

    @Override // com.google.android.exoplayer2.source.c0.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void i(n nVar) {
        ((n.a) p0.j(this.f40487f)).i(this);
    }

    @Override // com.google.android.exoplayer2.source.n
    public void s(n.a aVar, long j11) {
        this.f40487f = aVar;
        n nVar = this.f40486e;
        if (nVar != null) {
            nVar.s(this, q(this.f40483b));
        }
    }

    public void t(long j11) {
        this.f40490i = j11;
    }

    @Override // com.google.android.exoplayer2.source.n
    public long u(qs.r[] rVarArr, boolean[] zArr, es.q[] qVarArr, boolean[] zArr2, long j11) {
        long j12;
        long j13 = this.f40490i;
        if (j13 == -9223372036854775807L || j11 != this.f40483b) {
            j12 = j11;
        } else {
            this.f40490i = -9223372036854775807L;
            j12 = j13;
        }
        return ((n) p0.j(this.f40486e)).u(rVarArr, zArr, qVarArr, zArr2, j12);
    }

    public void v() {
        if (this.f40486e != null) {
            ((o) ts.a.e(this.f40485d)).i(this.f40486e);
        }
    }

    public void w(o oVar) {
        ts.a.g(this.f40485d == null);
        this.f40485d = oVar;
    }
}
