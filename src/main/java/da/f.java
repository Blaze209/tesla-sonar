package da;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s7.b0 f59980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s7.c0 f59981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f59982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f59983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f59984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f59985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private w8.o0 f59986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f59987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f59988i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f59989j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f59990k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f59991l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private p7.u f59992m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f59993n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f59994o;

    public f(String str) {
        this(null, 0, str);
    }

    private boolean f(s7.c0 c0Var, byte[] bArr, int i11) {
        int iMin = Math.min(c0Var.a(), i11 - this.f59988i);
        c0Var.q(bArr, this.f59988i, iMin);
        int i12 = this.f59988i + iMin;
        this.f59988i = i12;
        return i12 == i11;
    }

    @RequiresNonNull({"output"})
    private void g() {
        this.f59980a.p(0);
        w8.c.C2599c c2599cG = w8.c.g(this.f59980a);
        p7.u uVar = this.f59992m;
        if (uVar == null || c2599cG.f121236c != uVar.G || c2599cG.f121235b != uVar.H || !"audio/ac4".equals(uVar.f101544o)) {
            p7.u uVarP = new p7.u.b().j0(this.f59985f).W(this.f59984e).y0("audio/ac4").T(c2599cG.f121236c).z0(c2599cG.f121235b).n0(this.f59982c).w0(this.f59983d).P();
            this.f59992m = uVarP;
            this.f59986g.g(uVarP);
        }
        this.f59993n = c2599cG.f121237d;
        this.f59991l = (((long) c2599cG.f121238e) * 1000000) / ((long) this.f59992m.H);
    }

    private boolean h(s7.c0 c0Var) {
        while (true) {
            if (c0Var.a() <= 0) {
                return false;
            }
            if (this.f59989j) {
                int iM = c0Var.M();
                this.f59989j = iM == 172;
                if (iM == 64 || iM == 65) {
                    this.f59990k = iM == 65;
                    return true;
                }
            } else {
                this.f59989j = c0Var.M() == 172;
            }
        }
    }

    @Override // da.m
    public void a() {
        this.f59987h = 0;
        this.f59988i = 0;
        this.f59989j = false;
        this.f59990k = false;
        this.f59994o = -9223372036854775807L;
    }

    @Override // da.m
    public void b(s7.c0 c0Var) {
        s7.a.j(this.f59986g);
        while (c0Var.a() > 0) {
            int i11 = this.f59987h;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        int iMin = Math.min(c0Var.a(), this.f59993n - this.f59988i);
                        this.f59986g.f(c0Var, iMin);
                        int i12 = this.f59988i + iMin;
                        this.f59988i = i12;
                        if (i12 == this.f59993n) {
                            s7.a.h(this.f59994o != -9223372036854775807L);
                            this.f59986g.b(this.f59994o, 1, this.f59993n, 0, null);
                            this.f59994o += this.f59991l;
                            this.f59987h = 0;
                        }
                    }
                } else if (f(c0Var, this.f59981b.f(), 16)) {
                    g();
                    this.f59981b.b0(0);
                    this.f59986g.f(this.f59981b, 16);
                    this.f59987h = 2;
                }
            } else if (h(c0Var)) {
                this.f59987h = 1;
                this.f59981b.f()[0] = -84;
                this.f59981b.f()[1] = (byte) (this.f59990k ? 65 : 64);
                this.f59988i = 2;
            }
        }
    }

    @Override // da.m
    public void c(long j11, int i11) {
        this.f59994o = j11;
    }

    @Override // da.m
    public void d(w8.r rVar, l0.d dVar) {
        dVar.a();
        this.f59985f = dVar.b();
        this.f59986g = rVar.b(dVar.c(), 1);
    }

    public f(String str, int i11, String str2) {
        s7.b0 b0Var = new s7.b0(new byte[16]);
        this.f59980a = b0Var;
        this.f59981b = new s7.c0(b0Var.f110390a);
        this.f59987h = 0;
        this.f59988i = 0;
        this.f59989j = false;
        this.f59990k = false;
        this.f59994o = -9223372036854775807L;
        this.f59982c = str;
        this.f59983d = i11;
        this.f59984e = str2;
    }

    @Override // da.m
    public void e(boolean z11) {
    }
}
