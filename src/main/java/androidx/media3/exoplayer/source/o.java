package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.o1;
import java.io.IOException;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements q, q.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r.b f11081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f11082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s8.b f11083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private r f11084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private q f11085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private q.a f11086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f11087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f11088h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f11089i = -9223372036854775807L;

    public interface a {
        void a(r.b bVar);

        void b(r.b bVar, IOException iOException);
    }

    public o(r.b bVar, s8.b bVar2, long j11) {
        this.f11081a = bVar;
        this.f11083c = bVar2;
        this.f11082b = j11;
    }

    private long t(long j11) {
        long j12 = this.f11089i;
        return j12 != -9223372036854775807L ? j12 : j11;
    }

    public void b(r.b bVar) {
        long jT = t(this.f11082b);
        q qVarR = ((r) s7.a.f(this.f11084d)).r(bVar, this.f11083c, jT);
        this.f11085e = qVarR;
        if (this.f11086f != null) {
            qVarR.u(this, jT);
        }
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean c() {
        q qVar = this.f11085e;
        return qVar != null && qVar.c();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long d() {
        return ((q) q0.l(this.f11085e)).d();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public void e(long j11) {
        ((q) q0.l(this.f11085e)).e(j11);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long f() {
        return ((q) q0.l(this.f11085e)).f();
    }

    @Override // androidx.media3.exoplayer.source.q
    public long g(long j11) {
        return ((q) q0.l(this.f11085e)).g(j11);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long h() {
        return ((q) q0.l(this.f11085e)).h();
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public void i(q qVar) {
        ((q.a) q0.l(this.f11086f)).i(this);
        a aVar = this.f11087g;
        if (aVar != null) {
            aVar.a(this.f11081a);
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public n8.y k() {
        return ((q) q0.l(this.f11085e)).k();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean l(o1 o1Var) {
        q qVar = this.f11085e;
        return qVar != null && qVar.l(o1Var);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long m(long j11, z7.b0 b0Var) {
        return ((q) q0.l(this.f11085e)).m(j11, b0Var);
    }

    @Override // androidx.media3.exoplayer.source.q
    public void n() throws IOException {
        try {
            q qVar = this.f11085e;
            if (qVar != null) {
                qVar.n();
                return;
            }
            r rVar = this.f11084d;
            if (rVar != null) {
                rVar.b();
            }
        } catch (IOException e11) {
            a aVar = this.f11087g;
            if (aVar == null) {
                throw e11;
            }
            if (this.f11088h) {
                return;
            }
            this.f11088h = true;
            aVar.b(this.f11081a, e11);
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public void o(long j11, boolean z11) {
        ((q) q0.l(this.f11085e)).o(j11, z11);
    }

    public long q() {
        return this.f11089i;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long r(r8.t[] tVarArr, boolean[] zArr, n8.s[] sVarArr, boolean[] zArr2, long j11) {
        long j12 = this.f11089i;
        long j13 = (j12 == -9223372036854775807L || j11 != this.f11082b) ? j11 : j12;
        this.f11089i = -9223372036854775807L;
        return ((q) q0.l(this.f11085e)).r(tVarArr, zArr, sVarArr, zArr2, j13);
    }

    public long s() {
        return this.f11082b;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(q.a aVar, long j11) {
        this.f11086f = aVar;
        q qVar = this.f11085e;
        if (qVar != null) {
            qVar.u(this, t(this.f11082b));
        }
    }

    @Override // androidx.media3.exoplayer.source.g0.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void j(q qVar) {
        ((q.a) q0.l(this.f11086f)).j(this);
    }

    public void w(long j11) {
        this.f11089i = j11;
    }

    public void x() {
        if (this.f11085e != null) {
            ((r) s7.a.f(this.f11084d)).h(this.f11085e);
        }
    }

    public void y(r rVar) {
        s7.a.h(this.f11084d == null);
        this.f11084d = rVar;
    }
}
