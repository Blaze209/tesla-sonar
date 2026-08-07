package qr;

import com.google.android.exoplayer2.u0;
import hr.b0;
import hr.l;
import hr.m;
import hr.y;
import hr.z;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import ts.d0;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
abstract class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b0 f105899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m f105900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f105901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f105902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f105903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f105904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f105905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f105906i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f105908k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f105909l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f105910m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f105898a = new e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f105907j = new b();

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        u0 f105911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g f105912b;

        b() {
        }
    }

    @EnsuresNonNull({"trackOutput", "extractorOutput"})
    private void a() {
        ts.a.i(this.f105899b);
        p0.j(this.f105900c);
    }

    @EnsuresNonNullIf(expression = {"setupData.format"}, result = true)
    private boolean h(l lVar) {
        while (this.f105898a.d(lVar)) {
            this.f105908k = lVar.getPosition() - this.f105903f;
            if (!i(this.f105898a.c(), this.f105903f, this.f105907j)) {
                return true;
            }
            this.f105903f = lVar.getPosition();
        }
        this.f105905h = 3;
        return false;
    }

    @RequiresNonNull({"trackOutput"})
    private int j(l lVar) {
        if (!h(lVar)) {
            return -1;
        }
        u0 u0Var = this.f105907j.f105911a;
        this.f105906i = u0Var.f40726z;
        if (!this.f105910m) {
            this.f105899b.b(u0Var);
            this.f105910m = true;
        }
        g gVar = this.f105907j.f105912b;
        if (gVar != null) {
            this.f105901d = gVar;
        } else if (lVar.getLength() == -1) {
            this.f105901d = new c();
        } else {
            f fVarB = this.f105898a.b();
            this.f105901d = new qr.a(this, this.f105903f, lVar.getLength(), fVarB.f105891h + fVarB.f105892i, fVarB.f105886c, (fVarB.f105885b & 4) != 0);
        }
        this.f105905h = 2;
        this.f105898a.f();
        return 0;
    }

    @RequiresNonNull({"trackOutput", "oggSeeker", "extractorOutput"})
    private int k(l lVar, y yVar) {
        long jA = this.f105901d.a(lVar);
        if (jA >= 0) {
            yVar.f73403a = jA;
            return 1;
        }
        if (jA < -1) {
            e(-(jA + 2));
        }
        if (!this.f105909l) {
            this.f105900c.p((z) ts.a.i(this.f105901d.b()));
            this.f105909l = true;
        }
        if (this.f105908k <= 0 && !this.f105898a.d(lVar)) {
            this.f105905h = 3;
            return -1;
        }
        this.f105908k = 0L;
        d0 d0VarC = this.f105898a.c();
        long jF = f(d0VarC);
        if (jF >= 0) {
            long j11 = this.f105904g;
            if (j11 + jF >= this.f105902e) {
                long jB = b(j11);
                this.f105899b.d(d0VarC, d0VarC.g());
                this.f105899b.e(jB, 1, d0VarC.g(), 0, null);
                this.f105902e = -1L;
            }
        }
        this.f105904g += jF;
        return 0;
    }

    protected long b(long j11) {
        return (j11 * 1000000) / ((long) this.f105906i);
    }

    protected long c(long j11) {
        return (((long) this.f105906i) * j11) / 1000000;
    }

    void d(m mVar, b0 b0Var) {
        this.f105900c = mVar;
        this.f105899b = b0Var;
        l(true);
    }

    protected void e(long j11) {
        this.f105904g = j11;
    }

    protected abstract long f(d0 d0Var);

    final int g(l lVar, y yVar) {
        a();
        int i11 = this.f105905h;
        if (i11 == 0) {
            return j(lVar);
        }
        if (i11 == 1) {
            lVar.k((int) this.f105903f);
            this.f105905h = 2;
            return 0;
        }
        if (i11 == 2) {
            p0.j(this.f105901d);
            return k(lVar, yVar);
        }
        if (i11 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected abstract boolean i(d0 d0Var, long j11, b bVar);

    protected void l(boolean z11) {
        if (z11) {
            this.f105907j = new b();
            this.f105903f = 0L;
            this.f105905h = 0;
        } else {
            this.f105905h = 1;
        }
        this.f105902e = -1L;
        this.f105904g = 0L;
    }

    final void m(long j11, long j12) {
        this.f105898a.e();
        if (j11 == 0) {
            l(!this.f105909l);
        } else if (this.f105905h != 0) {
            this.f105902e = c(j12);
            ((g) p0.j(this.f105901d)).c(this.f105902e);
            this.f105905h = 2;
        }
    }

    private static final class c implements g {
        private c() {
        }

        @Override // qr.g
        public long a(l lVar) {
            return -1L;
        }

        @Override // qr.g
        public z b() {
            return new z.b(-9223372036854775807L);
        }

        @Override // qr.g
        public void c(long j11) {
        }
    }
}
