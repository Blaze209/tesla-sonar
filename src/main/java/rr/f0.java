package rr;

import ts.m0;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f108770a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f108773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f108774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f108775f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m0 f108771b = new m0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f108776g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f108777h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f108778i = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ts.d0 f108772c = new ts.d0();

    f0(int i11) {
        this.f108770a = i11;
    }

    private int a(hr.l lVar) {
        this.f108772c.R(p0.f115045f);
        this.f108773d = true;
        lVar.g();
        return 0;
    }

    private int f(hr.l lVar, hr.y yVar, int i11) {
        int iMin = (int) Math.min(this.f108770a, lVar.getLength());
        long j11 = 0;
        if (lVar.getPosition() != j11) {
            yVar.f73403a = j11;
            return 1;
        }
        this.f108772c.Q(iMin);
        lVar.g();
        lVar.e(this.f108772c.e(), 0, iMin);
        this.f108776g = g(this.f108772c, i11);
        this.f108774e = true;
        return 0;
    }

    private long g(ts.d0 d0Var, int i11) {
        int iG = d0Var.g();
        for (int iF = d0Var.f(); iF < iG; iF++) {
            if (d0Var.e()[iF] == 71) {
                long jC = j0.c(d0Var, iF, i11);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int h(hr.l lVar, hr.y yVar, int i11) {
        long length = lVar.getLength();
        int iMin = (int) Math.min(this.f108770a, length);
        long j11 = length - ((long) iMin);
        if (lVar.getPosition() != j11) {
            yVar.f73403a = j11;
            return 1;
        }
        this.f108772c.Q(iMin);
        lVar.g();
        lVar.e(this.f108772c.e(), 0, iMin);
        this.f108777h = i(this.f108772c, i11);
        this.f108775f = true;
        return 0;
    }

    private long i(ts.d0 d0Var, int i11) {
        int iF = d0Var.f();
        int iG = d0Var.g();
        for (int i12 = iG - 188; i12 >= iF; i12--) {
            if (j0.b(d0Var.e(), iF, iG, i12)) {
                long jC = j0.c(d0Var, i12, i11);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long b() {
        return this.f108778i;
    }

    public m0 c() {
        return this.f108771b;
    }

    public boolean d() {
        return this.f108773d;
    }

    public int e(hr.l lVar, hr.y yVar, int i11) {
        if (i11 <= 0) {
            return a(lVar);
        }
        if (!this.f108775f) {
            return h(lVar, yVar, i11);
        }
        if (this.f108777h == -9223372036854775807L) {
            return a(lVar);
        }
        if (!this.f108774e) {
            return f(lVar, yVar, i11);
        }
        long j11 = this.f108776g;
        if (j11 == -9223372036854775807L) {
            return a(lVar);
        }
        long jB = this.f108771b.b(this.f108777h) - this.f108771b.b(j11);
        this.f108778i = jB;
        if (jB < 0) {
            ts.u.i("TsDurationReader", "Invalid duration: " + this.f108778i + ". Using TIME_UNSET instead.");
            this.f108778i = -9223372036854775807L;
        }
        return a(lVar);
    }
}
