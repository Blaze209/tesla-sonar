package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.n f41389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f41390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final es.q[] f41391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f41392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f41393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a1 f41394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f41395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean[] f41396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a2[] f41397i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final qs.a0 f41398j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final q1 f41399k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private z0 f41400l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private es.w f41401m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private qs.b0 f41402n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f41403o;

    public z0(a2[] a2VarArr, long j11, qs.a0 a0Var, ss.b bVar, q1 q1Var, a1 a1Var, qs.b0 b0Var) {
        this.f41397i = a2VarArr;
        this.f41403o = j11;
        this.f41398j = a0Var;
        this.f41399k = q1Var;
        com.google.android.exoplayer2.source.o.b bVar2 = a1Var.f39406a;
        this.f41390b = bVar2.f63157a;
        this.f41394f = a1Var;
        this.f41401m = es.w.f63210d;
        this.f41402n = b0Var;
        this.f41391c = new es.q[a2VarArr.length];
        this.f41396h = new boolean[a2VarArr.length];
        this.f41389a = e(bVar2, q1Var, bVar, a1Var.f39407b, a1Var.f39409d);
    }

    private void c(es.q[] qVarArr) {
        int i11 = 0;
        while (true) {
            a2[] a2VarArr = this.f41397i;
            if (i11 >= a2VarArr.length) {
                return;
            }
            if (a2VarArr[i11].c() == -2 && this.f41402n.c(i11)) {
                qVarArr[i11] = new es.g();
            }
            i11++;
        }
    }

    private static com.google.android.exoplayer2.source.n e(com.google.android.exoplayer2.source.o.b bVar, q1 q1Var, ss.b bVar2, long j11, long j12) {
        com.google.android.exoplayer2.source.n nVarH = q1Var.h(bVar, bVar2, j11);
        return j12 != -9223372036854775807L ? new com.google.android.exoplayer2.source.b(nVarH, true, 0L, j12) : nVarH;
    }

    private void f() {
        if (!r()) {
            return;
        }
        int i11 = 0;
        while (true) {
            qs.b0 b0Var = this.f41402n;
            if (i11 >= b0Var.f105958a) {
                return;
            }
            boolean zC = b0Var.c(i11);
            qs.r rVar = this.f41402n.f105960c[i11];
            if (zC && rVar != null) {
                rVar.disable();
            }
            i11++;
        }
    }

    private void g(es.q[] qVarArr) {
        int i11 = 0;
        while (true) {
            a2[] a2VarArr = this.f41397i;
            if (i11 >= a2VarArr.length) {
                return;
            }
            if (a2VarArr[i11].c() == -2) {
                qVarArr[i11] = null;
            }
            i11++;
        }
    }

    private void h() {
        if (!r()) {
            return;
        }
        int i11 = 0;
        while (true) {
            qs.b0 b0Var = this.f41402n;
            if (i11 >= b0Var.f105958a) {
                return;
            }
            boolean zC = b0Var.c(i11);
            qs.r rVar = this.f41402n.f105960c[i11];
            if (zC && rVar != null) {
                rVar.enable();
            }
            i11++;
        }
    }

    private boolean r() {
        return this.f41400l == null;
    }

    private static void u(q1 q1Var, com.google.android.exoplayer2.source.n nVar) {
        try {
            if (nVar instanceof com.google.android.exoplayer2.source.b) {
                q1Var.z(((com.google.android.exoplayer2.source.b) nVar).f40357a);
            } else {
                q1Var.z(nVar);
            }
        } catch (RuntimeException e11) {
            ts.u.d("MediaPeriodHolder", "Period release failed.", e11);
        }
    }

    public void A() {
        com.google.android.exoplayer2.source.n nVar = this.f41389a;
        if (nVar instanceof com.google.android.exoplayer2.source.b) {
            long j11 = this.f41394f.f39409d;
            if (j11 == -9223372036854775807L) {
                j11 = Long.MIN_VALUE;
            }
            ((com.google.android.exoplayer2.source.b) nVar).t(0L, j11);
        }
    }

    public long a(qs.b0 b0Var, long j11, boolean z11) {
        return b(b0Var, j11, z11, new boolean[this.f41397i.length]);
    }

    public long b(qs.b0 b0Var, long j11, boolean z11, boolean[] zArr) {
        int i11 = 0;
        while (true) {
            boolean z12 = true;
            if (i11 >= b0Var.f105958a) {
                break;
            }
            boolean[] zArr2 = this.f41396h;
            if (z11 || !b0Var.b(this.f41402n, i11)) {
                z12 = false;
            }
            zArr2[i11] = z12;
            i11++;
        }
        g(this.f41391c);
        f();
        this.f41402n = b0Var;
        h();
        long jU = this.f41389a.u(b0Var.f105960c, this.f41396h, this.f41391c, zArr, j11);
        c(this.f41391c);
        this.f41393e = false;
        int i12 = 0;
        while (true) {
            es.q[] qVarArr = this.f41391c;
            if (i12 >= qVarArr.length) {
                return jU;
            }
            if (qVarArr[i12] != null) {
                ts.a.g(b0Var.c(i12));
                if (this.f41397i[i12].c() != -2) {
                    this.f41393e = true;
                }
            } else {
                ts.a.g(b0Var.f105960c[i12] == null);
            }
            i12++;
        }
    }

    public void d(long j11) {
        ts.a.g(r());
        this.f41389a.a(y(j11));
    }

    public long i() {
        if (!this.f41392d) {
            return this.f41394f.f39407b;
        }
        long jD = this.f41393e ? this.f41389a.d() : Long.MIN_VALUE;
        return jD == Long.MIN_VALUE ? this.f41394f.f39410e : jD;
    }

    public z0 j() {
        return this.f41400l;
    }

    public long k() {
        if (this.f41392d) {
            return this.f41389a.f();
        }
        return 0L;
    }

    public long l() {
        return this.f41403o;
    }

    public long m() {
        return this.f41394f.f39407b + this.f41403o;
    }

    public es.w n() {
        return this.f41401m;
    }

    public qs.b0 o() {
        return this.f41402n;
    }

    public void p(float f11, f2 f2Var) {
        this.f41392d = true;
        this.f41401m = this.f41389a.k();
        qs.b0 b0VarV = v(f11, f2Var);
        a1 a1Var = this.f41394f;
        long jMax = a1Var.f39407b;
        long j11 = a1Var.f39410e;
        if (j11 != -9223372036854775807L && jMax >= j11) {
            jMax = Math.max(0L, j11 - 1);
        }
        long jA = a(b0VarV, jMax, false);
        long j12 = this.f41403o;
        a1 a1Var2 = this.f41394f;
        this.f41403o = j12 + (a1Var2.f39407b - jA);
        this.f41394f = a1Var2.b(jA);
    }

    public boolean q() {
        if (this.f41392d) {
            return !this.f41393e || this.f41389a.d() == Long.MIN_VALUE;
        }
        return false;
    }

    public void s(long j11) {
        ts.a.g(r());
        if (this.f41392d) {
            this.f41389a.e(y(j11));
        }
    }

    public void t() {
        f();
        u(this.f41399k, this.f41389a);
    }

    public qs.b0 v(float f11, f2 f2Var) {
        qs.b0 b0VarK = this.f41398j.k(this.f41397i, n(), this.f41394f.f39406a, f2Var);
        for (qs.r rVar : b0VarK.f105960c) {
            if (rVar != null) {
                rVar.i(f11);
            }
        }
        return b0VarK;
    }

    public void w(z0 z0Var) {
        if (z0Var == this.f41400l) {
            return;
        }
        f();
        this.f41400l = z0Var;
        h();
    }

    public void x(long j11) {
        this.f41403o = j11;
    }

    public long y(long j11) {
        return j11 - l();
    }

    public long z(long j11) {
        return j11 + l();
    }
}
