package androidx.media3.exoplayer;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.q f10609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n8.s[] f10611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q1 f10616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean[] f10618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final m2[] f10619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final r8.a0 f10620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final h2 f10621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private p1 f10622n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private n8.y f10623o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private r8.b0 f10624p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f10625q;

    interface a {
        p1 a(q1 q1Var, long j11);
    }

    public p1(m2[] m2VarArr, long j11, r8.a0 a0Var, s8.b bVar, h2 h2Var, q1 q1Var, r8.b0 b0Var, long j12) {
        this.f10619k = m2VarArr;
        this.f10625q = j11;
        this.f10620l = a0Var;
        this.f10621m = h2Var;
        androidx.media3.exoplayer.source.r.b bVar2 = q1Var.f10628a;
        this.f10610b = bVar2.f11103a;
        this.f10616h = q1Var;
        this.f10612d = j12;
        this.f10623o = n8.y.f93613d;
        this.f10624p = b0Var;
        this.f10611c = new n8.s[m2VarArr.length];
        this.f10618j = new boolean[m2VarArr.length];
        this.f10609a = f(bVar2, h2Var, bVar, q1Var.f10629b, q1Var.f10631d, q1Var.f10633f);
    }

    private void c(n8.s[] sVarArr) {
        int i11 = 0;
        while (true) {
            m2[] m2VarArr = this.f10619k;
            if (i11 >= m2VarArr.length) {
                return;
            }
            if (m2VarArr[i11].c() == -2 && this.f10624p.c(i11)) {
                sVarArr[i11] = new n8.h();
            }
            i11++;
        }
    }

    private static androidx.media3.exoplayer.source.q f(androidx.media3.exoplayer.source.r.b bVar, h2 h2Var, s8.b bVar2, long j11, long j12, boolean z11) {
        androidx.media3.exoplayer.source.q qVarH = h2Var.h(bVar, bVar2, j11);
        return j12 != -9223372036854775807L ? new androidx.media3.exoplayer.source.b(qVarH, !z11, 0L, j12) : qVarH;
    }

    private void g() {
        if (!u()) {
            return;
        }
        int i11 = 0;
        while (true) {
            r8.b0 b0Var = this.f10624p;
            if (i11 >= b0Var.f107154a) {
                return;
            }
            boolean zC = b0Var.c(i11);
            r8.t tVar = this.f10624p.f107156c[i11];
            if (zC && tVar != null) {
                tVar.disable();
            }
            i11++;
        }
    }

    private void h(n8.s[] sVarArr) {
        int i11 = 0;
        while (true) {
            m2[] m2VarArr = this.f10619k;
            if (i11 >= m2VarArr.length) {
                return;
            }
            if (m2VarArr[i11].c() == -2) {
                sVarArr[i11] = null;
            }
            i11++;
        }
    }

    private void i() {
        if (!u()) {
            return;
        }
        int i11 = 0;
        while (true) {
            r8.b0 b0Var = this.f10624p;
            if (i11 >= b0Var.f107154a) {
                return;
            }
            boolean zC = b0Var.c(i11);
            r8.t tVar = this.f10624p.f107156c[i11];
            if (zC && tVar != null) {
                tVar.enable();
            }
            i11++;
        }
    }

    private boolean u() {
        return this.f10622n == null;
    }

    private static void y(h2 h2Var, androidx.media3.exoplayer.source.q qVar) {
        try {
            if (qVar instanceof androidx.media3.exoplayer.source.b) {
                h2Var.z(((androidx.media3.exoplayer.source.b) qVar).f10843a);
            } else {
                h2Var.z(qVar);
            }
        } catch (RuntimeException e11) {
            s7.t.e("MediaPeriodHolder", "Period release failed.", e11);
        }
    }

    public void A(p1 p1Var) {
        if (p1Var == this.f10622n) {
            return;
        }
        g();
        this.f10622n = p1Var;
        i();
    }

    public void B(long j11) {
        this.f10625q = j11;
    }

    public long C(long j11) {
        return j11 - m();
    }

    public long D(long j11) {
        return j11 + m();
    }

    public void E() {
        androidx.media3.exoplayer.source.q qVar = this.f10609a;
        if (qVar instanceof androidx.media3.exoplayer.source.b) {
            long j11 = this.f10616h.f10631d;
            if (j11 == -9223372036854775807L) {
                j11 = Long.MIN_VALUE;
            }
            ((androidx.media3.exoplayer.source.b) qVar).x(0L, j11);
        }
    }

    public long a(r8.b0 b0Var, long j11, boolean z11) {
        return b(b0Var, j11, z11, new boolean[this.f10619k.length]);
    }

    public long b(r8.b0 b0Var, long j11, boolean z11, boolean[] zArr) {
        int i11 = 0;
        while (true) {
            boolean z12 = true;
            if (i11 >= b0Var.f107154a) {
                break;
            }
            boolean[] zArr2 = this.f10618j;
            if (z11 || !b0Var.b(this.f10624p, i11)) {
                z12 = false;
            }
            zArr2[i11] = z12;
            i11++;
        }
        h(this.f10611c);
        g();
        this.f10624p = b0Var;
        i();
        long jR = this.f10609a.r(b0Var.f107156c, this.f10618j, this.f10611c, zArr, j11);
        c(this.f10611c);
        this.f10615g = false;
        int i12 = 0;
        while (true) {
            n8.s[] sVarArr = this.f10611c;
            if (i12 >= sVarArr.length) {
                return jR;
            }
            if (sVarArr[i12] != null) {
                s7.a.h(b0Var.c(i12));
                if (this.f10619k[i12].c() != -2) {
                    this.f10615g = true;
                }
            } else {
                s7.a.h(b0Var.f107156c[i12] == null);
            }
            i12++;
        }
    }

    public boolean d(q1 q1Var) {
        if (!s1.e(this.f10616h.f10632e, q1Var.f10632e)) {
            return false;
        }
        q1 q1Var2 = this.f10616h;
        return q1Var2.f10629b == q1Var.f10629b && q1Var2.f10628a.equals(q1Var.f10628a);
    }

    public void e(o1 o1Var) {
        s7.a.h(u());
        this.f10609a.l(o1Var);
    }

    public long j() {
        if (!this.f10614f) {
            return this.f10616h.f10629b;
        }
        long jD = this.f10615g ? this.f10609a.d() : Long.MIN_VALUE;
        return jD == Long.MIN_VALUE ? this.f10616h.f10632e : jD;
    }

    public p1 k() {
        return this.f10622n;
    }

    public long l() {
        if (this.f10614f) {
            return this.f10609a.f();
        }
        return 0L;
    }

    public long m() {
        return this.f10625q;
    }

    public long n() {
        return this.f10616h.f10629b + this.f10625q;
    }

    public n8.y o() {
        return this.f10623o;
    }

    public r8.b0 p() {
        return this.f10624p;
    }

    public void q(float f11, p7.r0 r0Var, boolean z11) {
        this.f10614f = true;
        this.f10623o = this.f10609a.k();
        r8.b0 b0VarZ = z(f11, r0Var, z11);
        q1 q1Var = this.f10616h;
        long jMax = q1Var.f10629b;
        long j11 = q1Var.f10632e;
        if (j11 != -9223372036854775807L && jMax >= j11) {
            jMax = Math.max(0L, j11 - 1);
        }
        long jA = a(b0VarZ, jMax, false);
        long j12 = this.f10625q;
        q1 q1Var2 = this.f10616h;
        this.f10625q = j12 + (q1Var2.f10629b - jA);
        this.f10616h = q1Var2.b(jA);
    }

    public boolean r() {
        try {
            if (this.f10614f) {
                for (n8.s sVar : this.f10611c) {
                    if (sVar != null) {
                        sVar.a();
                    }
                }
            } else {
                this.f10609a.n();
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    public boolean s() {
        if (this.f10614f) {
            return !this.f10615g || this.f10609a.d() == Long.MIN_VALUE;
        }
        return false;
    }

    public boolean t() {
        if (this.f10614f) {
            return s() || j() - this.f10616h.f10629b >= this.f10612d;
        }
        return false;
    }

    public void v(androidx.media3.exoplayer.source.q.a aVar, long j11) {
        this.f10613e = true;
        this.f10609a.u(aVar, j11);
    }

    public void w(long j11) {
        s7.a.h(u());
        if (this.f10614f) {
            this.f10609a.e(C(j11));
        }
    }

    public void x() {
        g();
        y(this.f10621m, this.f10609a);
    }

    public r8.b0 z(float f11, p7.r0 r0Var, boolean z11) {
        r8.b0 b0VarK = this.f10620l.k(this.f10619k, o(), this.f10616h.f10628a, r0Var);
        for (int i11 = 0; i11 < b0VarK.f107154a; i11++) {
            boolean z12 = true;
            if (b0VarK.c(i11)) {
                if (b0VarK.f107156c[i11] == null && this.f10619k[i11].c() != -2) {
                    z12 = false;
                }
                s7.a.h(z12);
            } else {
                s7.a.h(b0VarK.f107156c[i11] == null);
            }
        }
        for (r8.t tVar : b0VarK.f107156c) {
            if (tVar != null) {
                tVar.i(f11);
                tVar.j(z11);
            }
        }
        return b0VarK;
    }
}
