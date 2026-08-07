package da;

import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f60041a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f60044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f60045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f60046f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s7.i0 f60042b = new s7.i0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f60047g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f60048h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f60049i = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s7.c0 f60043c = new s7.c0();

    i0(int i11) {
        this.f60041a = i11;
    }

    private int a(w8.q qVar) {
        this.f60043c.Y(q0.f110459f);
        this.f60044d = true;
        qVar.g();
        return 0;
    }

    private int f(w8.q qVar, w8.i0 i0Var, int i11) {
        int iMin = (int) Math.min(this.f60041a, qVar.getLength());
        long j11 = 0;
        if (qVar.getPosition() != j11) {
            i0Var.f121323a = j11;
            return 1;
        }
        this.f60043c.X(iMin);
        qVar.g();
        qVar.e(this.f60043c.f(), 0, iMin);
        this.f60047g = g(this.f60043c, i11);
        this.f60045e = true;
        return 0;
    }

    private long g(s7.c0 c0Var, int i11) {
        int iJ = c0Var.j();
        for (int iG = c0Var.g(); iG < iJ; iG++) {
            if (c0Var.f()[iG] == 71) {
                long jC = m0.c(c0Var, iG, i11);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int h(w8.q qVar, w8.i0 i0Var, int i11) {
        long length = qVar.getLength();
        int iMin = (int) Math.min(this.f60041a, length);
        long j11 = length - ((long) iMin);
        if (qVar.getPosition() != j11) {
            i0Var.f121323a = j11;
            return 1;
        }
        this.f60043c.X(iMin);
        qVar.g();
        qVar.e(this.f60043c.f(), 0, iMin);
        this.f60048h = i(this.f60043c, i11);
        this.f60046f = true;
        return 0;
    }

    private long i(s7.c0 c0Var, int i11) {
        int iG = c0Var.g();
        int iJ = c0Var.j();
        for (int i12 = iJ - 188; i12 >= iG; i12--) {
            if (m0.b(c0Var.f(), iG, iJ, i12)) {
                long jC = m0.c(c0Var, i12, i11);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long b() {
        return this.f60049i;
    }

    public s7.i0 c() {
        return this.f60042b;
    }

    public boolean d() {
        return this.f60044d;
    }

    public int e(w8.q qVar, w8.i0 i0Var, int i11) {
        if (i11 <= 0) {
            return a(qVar);
        }
        if (!this.f60046f) {
            return h(qVar, i0Var, i11);
        }
        if (this.f60048h == -9223372036854775807L) {
            return a(qVar);
        }
        if (!this.f60045e) {
            return f(qVar, i0Var, i11);
        }
        long j11 = this.f60047g;
        if (j11 == -9223372036854775807L) {
            return a(qVar);
        }
        this.f60049i = this.f60042b.c(this.f60048h) - this.f60042b.b(j11);
        return a(qVar);
    }
}
