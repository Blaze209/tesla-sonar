package da;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s7.c0 f60282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w8.f0.a f60283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f60284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f60285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f60286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private w8.o0 f60287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f60288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f60289h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f60290i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f60291j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f60292k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f60293l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f60294m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f60295n;

    public t(String str) {
        this(null, 0, str);
    }

    private void f(s7.c0 c0Var) {
        byte[] bArrF = c0Var.f();
        int iJ = c0Var.j();
        for (int iG = c0Var.g(); iG < iJ; iG++) {
            byte b11 = bArrF[iG];
            boolean z11 = (b11 & 255) == 255;
            boolean z12 = this.f60292k && (b11 & 224) == 224;
            this.f60292k = z11;
            if (z12) {
                c0Var.b0(iG + 1);
                this.f60292k = false;
                this.f60282a.f()[1] = bArrF[iG];
                this.f60290i = 2;
                this.f60289h = 1;
                return;
            }
        }
        c0Var.b0(iJ);
    }

    @RequiresNonNull({"output"})
    private void g(s7.c0 c0Var) {
        int iMin = Math.min(c0Var.a(), this.f60294m - this.f60290i);
        this.f60287f.f(c0Var, iMin);
        int i11 = this.f60290i + iMin;
        this.f60290i = i11;
        if (i11 < this.f60294m) {
            return;
        }
        s7.a.h(this.f60295n != -9223372036854775807L);
        this.f60287f.b(this.f60295n, 1, this.f60294m, 0, null);
        this.f60295n += this.f60293l;
        this.f60290i = 0;
        this.f60289h = 0;
    }

    @RequiresNonNull({"output"})
    private void h(s7.c0 c0Var) {
        int iMin = Math.min(c0Var.a(), 4 - this.f60290i);
        c0Var.q(this.f60282a.f(), this.f60290i, iMin);
        int i11 = this.f60290i + iMin;
        this.f60290i = i11;
        if (i11 < 4) {
            return;
        }
        this.f60282a.b0(0);
        if (!this.f60283b.a(this.f60282a.v())) {
            this.f60290i = 0;
            this.f60289h = 1;
            return;
        }
        w8.f0.a aVar = this.f60283b;
        this.f60294m = aVar.f121304c;
        if (!this.f60291j) {
            this.f60293l = (((long) aVar.f121308g) * 1000000) / ((long) aVar.f121305d);
            this.f60287f.g(new p7.u.b().j0(this.f60288g).W(this.f60286e).y0(this.f60283b.f121303b).o0(4096).T(this.f60283b.f121306e).z0(this.f60283b.f121305d).n0(this.f60284c).w0(this.f60285d).P());
            this.f60291j = true;
        }
        this.f60282a.b0(0);
        this.f60287f.f(this.f60282a, 4);
        this.f60289h = 2;
    }

    @Override // da.m
    public void a() {
        this.f60289h = 0;
        this.f60290i = 0;
        this.f60292k = false;
        this.f60295n = -9223372036854775807L;
    }

    @Override // da.m
    public void b(s7.c0 c0Var) {
        s7.a.j(this.f60287f);
        while (c0Var.a() > 0) {
            int i11 = this.f60289h;
            if (i11 == 0) {
                f(c0Var);
            } else if (i11 == 1) {
                h(c0Var);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException();
                }
                g(c0Var);
            }
        }
    }

    @Override // da.m
    public void c(long j11, int i11) {
        this.f60295n = j11;
    }

    @Override // da.m
    public void d(w8.r rVar, l0.d dVar) {
        dVar.a();
        this.f60288g = dVar.b();
        this.f60287f = rVar.b(dVar.c(), 1);
    }

    public t(String str, int i11, String str2) {
        this.f60289h = 0;
        s7.c0 c0Var = new s7.c0(4);
        this.f60282a = c0Var;
        c0Var.f()[0] = -1;
        this.f60283b = new w8.f0.a();
        this.f60295n = -9223372036854775807L;
        this.f60284c = str;
        this.f60285d = i11;
        this.f60286e = str2;
    }

    @Override // da.m
    public void e(boolean z11) {
    }
}
