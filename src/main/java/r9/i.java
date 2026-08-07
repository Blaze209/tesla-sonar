package r9;

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p7.u;
import s7.c0;
import s7.q0;
import w8.i0;
import w8.j0;
import w8.o0;
import w8.q;
import w8.r;

/* JADX INFO: loaded from: classes3.dex */
abstract class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o0 f107352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r f107353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f107354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f107355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f107356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f107357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f107358h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f107359i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f107361k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f107362l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f107363m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f107351a = new e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f107360j = new b();

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        u f107364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g f107365b;

        b() {
        }
    }

    @EnsuresNonNull({"trackOutput", "extractorOutput"})
    private void a() {
        s7.a.j(this.f107352b);
        q0.l(this.f107353c);
    }

    @EnsuresNonNullIf(expression = {"setupData.format"}, result = true)
    private boolean i(q qVar) {
        while (this.f107351a.d(qVar)) {
            this.f107361k = qVar.getPosition() - this.f107356f;
            if (!h(this.f107351a.c(), this.f107356f, this.f107360j)) {
                return true;
            }
            this.f107356f = qVar.getPosition();
        }
        this.f107358h = 3;
        return false;
    }

    @RequiresNonNull({"trackOutput"})
    private int j(q qVar) {
        if (!i(qVar)) {
            return -1;
        }
        u uVar = this.f107360j.f107364a;
        this.f107359i = uVar.H;
        if (!this.f107363m) {
            this.f107352b.g(uVar);
            this.f107363m = true;
        }
        g gVar = this.f107360j.f107365b;
        if (gVar != null) {
            this.f107354d = gVar;
        } else if (qVar.getLength() == -1) {
            this.f107354d = new c();
        } else {
            f fVarB = this.f107351a.b();
            this.f107354d = new r9.a(this, this.f107356f, qVar.getLength(), fVarB.f107344h + fVarB.f107345i, fVarB.f107339c, (fVarB.f107338b & 4) != 0);
        }
        this.f107358h = 2;
        this.f107351a.f();
        return 0;
    }

    @RequiresNonNull({"trackOutput", "oggSeeker", "extractorOutput"})
    private int k(q qVar, i0 i0Var) {
        long jA = this.f107354d.a(qVar);
        if (jA >= 0) {
            i0Var.f121323a = jA;
            return 1;
        }
        if (jA < -1) {
            e(-(jA + 2));
        }
        if (!this.f107362l) {
            j0 j0Var = (j0) s7.a.j(this.f107354d.b());
            this.f107353c.t(j0Var);
            this.f107352b.d(j0Var.g());
            this.f107362l = true;
        }
        if (this.f107361k <= 0 && !this.f107351a.d(qVar)) {
            this.f107358h = 3;
            return -1;
        }
        this.f107361k = 0L;
        c0 c0VarC = this.f107351a.c();
        long jF = f(c0VarC);
        if (jF >= 0) {
            long j11 = this.f107357g;
            if (j11 + jF >= this.f107355e) {
                long jB = b(j11);
                this.f107352b.f(c0VarC, c0VarC.j());
                this.f107352b.b(jB, 1, c0VarC.j(), 0, null);
                this.f107355e = -1L;
            }
        }
        this.f107357g += jF;
        return 0;
    }

    protected long b(long j11) {
        return (j11 * 1000000) / ((long) this.f107359i);
    }

    protected long c(long j11) {
        return (((long) this.f107359i) * j11) / 1000000;
    }

    void d(r rVar, o0 o0Var) {
        this.f107353c = rVar;
        this.f107352b = o0Var;
        l(true);
    }

    protected void e(long j11) {
        this.f107357g = j11;
    }

    protected abstract long f(c0 c0Var);

    final int g(q qVar, i0 i0Var) {
        a();
        int i11 = this.f107358h;
        if (i11 == 0) {
            return j(qVar);
        }
        if (i11 == 1) {
            qVar.k((int) this.f107356f);
            this.f107358h = 2;
            return 0;
        }
        if (i11 == 2) {
            q0.l(this.f107354d);
            return k(qVar, i0Var);
        }
        if (i11 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected abstract boolean h(c0 c0Var, long j11, b bVar);

    protected void l(boolean z11) {
        if (z11) {
            this.f107360j = new b();
            this.f107356f = 0L;
            this.f107358h = 0;
        } else {
            this.f107358h = 1;
        }
        this.f107355e = -1L;
        this.f107357g = 0L;
    }

    final void m(long j11, long j12) {
        this.f107351a.e();
        if (j11 == 0) {
            l(!this.f107362l);
        } else if (this.f107358h != 0) {
            this.f107355e = c(j12);
            ((g) q0.l(this.f107354d)).c(this.f107355e);
            this.f107358h = 2;
        }
    }

    private static final class c implements g {
        private c() {
        }

        @Override // r9.g
        public long a(q qVar) {
            return -1L;
        }

        @Override // r9.g
        public j0 b() {
            return new j0.b(-9223372036854775807L);
        }

        @Override // r9.g
        public void c(long j11) {
        }
    }
}
