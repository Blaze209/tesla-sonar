package androidx.media3.exoplayer.video;

import p7.e1;
import s7.h0;
import s7.v;

/* JADX INFO: loaded from: classes3.dex */
final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f11315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f11316b;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f11325k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l.a f11317c = new l.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h0<e1> f11318d = new h0<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h0<Long> f11319e = new h0<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final v f11320f = new v();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f11321g = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private e1 f11324j = e1.f101328e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f11322h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f11323i = -9223372036854775807L;

    interface a {
        void a(long j11, long j12, boolean z11);

        void b(e1 e1Var);

        void c();
    }

    public n(a aVar, l lVar) {
        this.f11315a = aVar;
        this.f11316b = lVar;
    }

    private void a() {
        this.f11320f.f();
        this.f11315a.c();
    }

    private static <T> T c(h0<T> h0Var) {
        s7.a.a(h0Var.l() > 0);
        while (h0Var.l() > 1) {
            h0Var.i();
        }
        return (T) s7.a.f(h0Var.i());
    }

    private boolean e(long j11) {
        Long lJ = this.f11319e.j(j11);
        if (lJ == null || lJ.longValue() == this.f11325k) {
            return false;
        }
        this.f11325k = lJ.longValue();
        return true;
    }

    private boolean f(long j11) {
        e1 e1VarJ = this.f11318d.j(j11);
        if (e1VarJ == null || e1VarJ.equals(e1.f101328e) || e1VarJ.equals(this.f11324j)) {
            return false;
        }
        this.f11324j = e1VarJ;
        return true;
    }

    private void k(boolean z11) {
        long jF = this.f11320f.f();
        if (f(jF)) {
            this.f11315a.b(this.f11324j);
        }
        this.f11315a.a(z11 ? s7.j.f110429a.nanoTime() : this.f11317c.g(), jF, this.f11316b.g());
    }

    public void b() {
        this.f11320f.b();
        this.f11321g = -9223372036854775807L;
        this.f11322h = -9223372036854775807L;
        this.f11323i = -9223372036854775807L;
        if (this.f11319e.l() > 0) {
            this.f11325k = ((Long) c(this.f11319e)).longValue();
        }
        if (this.f11318d.l() > 0) {
            this.f11318d.a(0L, (e1) c(this.f11318d));
        }
    }

    public boolean d() {
        long j11 = this.f11323i;
        return j11 != -9223372036854775807L && this.f11322h == j11;
    }

    public void g(long j11) {
        this.f11320f.a(j11);
        this.f11321g = j11;
        this.f11323i = -9223372036854775807L;
    }

    public void h(int i11, long j11) {
        if (this.f11320f.e()) {
            this.f11316b.j(i11);
            this.f11325k = j11;
        } else {
            h0<Long> h0Var = this.f11319e;
            long j12 = this.f11321g;
            h0Var.a(j12 == -9223372036854775807L ? -4611686018427387904L : j12 + 1, Long.valueOf(j11));
        }
    }

    public void i(int i11, int i12) {
        h0<e1> h0Var = this.f11318d;
        long j11 = this.f11321g;
        h0Var.a(j11 == -9223372036854775807L ? 0L : j11 + 1, new e1(i11, i12));
    }

    public void j(long j11, long j12) {
        while (!this.f11320f.e()) {
            long jD = this.f11320f.d();
            if (e(jD)) {
                this.f11316b.j(2);
            }
            int iC = this.f11316b.c(jD, j11, j12, this.f11325k, false, false, this.f11317c);
            if (iC == 0 || iC == 1) {
                this.f11322h = jD;
                k(iC == 0);
            } else if (iC == 2 || iC == 3) {
                this.f11322h = jD;
                a();
            } else {
                if (iC != 4) {
                    if (iC != 5) {
                        throw new IllegalStateException(String.valueOf(iC));
                    }
                    return;
                }
                this.f11322h = jD;
            }
        }
    }

    public void l() {
        if (this.f11321g == -9223372036854775807L) {
            this.f11321g = Long.MIN_VALUE;
            this.f11322h = Long.MIN_VALUE;
        }
        this.f11323i = this.f11321g;
    }
}
