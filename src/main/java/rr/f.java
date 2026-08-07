package rr;

import com.google.android.exoplayer2.u0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ts.c0 f108757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ts.d0 f108758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f108759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f108760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private hr.b0 f108761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f108762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f108763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f108764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f108765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f108766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private u0 f108767k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f108768l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f108769m;

    public f() {
        this(null);
    }

    private boolean f(ts.d0 d0Var, byte[] bArr, int i11) {
        int iMin = Math.min(d0Var.a(), i11 - this.f108763g);
        d0Var.l(bArr, this.f108763g, iMin);
        int i12 = this.f108763g + iMin;
        this.f108763g = i12;
        return i12 == i11;
    }

    @RequiresNonNull({"output"})
    private void g() {
        this.f108757a.p(0);
        dr.c.b bVarD = dr.c.d(this.f108757a);
        u0 u0Var = this.f108767k;
        if (u0Var == null || bVarD.f60864c != u0Var.f40725y || bVarD.f60863b != u0Var.f40726z || !"audio/ac4".equals(u0Var.f40712l)) {
            u0 u0VarG = new u0.b().U(this.f108760d).g0("audio/ac4").J(bVarD.f60864c).h0(bVarD.f60863b).X(this.f108759c).G();
            this.f108767k = u0VarG;
            this.f108761e.b(u0VarG);
        }
        this.f108768l = bVarD.f60865d;
        this.f108766j = (((long) bVarD.f60866e) * 1000000) / ((long) this.f108767k.f40726z);
    }

    private boolean h(ts.d0 d0Var) {
        while (true) {
            if (d0Var.a() <= 0) {
                return false;
            }
            if (this.f108764h) {
                int iH = d0Var.H();
                this.f108764h = iH == 172;
                if (iH == 64 || iH == 65) {
                    this.f108765i = iH == 65;
                    return true;
                }
            } else {
                this.f108764h = d0Var.H() == 172;
            }
        }
    }

    @Override // rr.m
    public void a() {
        this.f108762f = 0;
        this.f108763g = 0;
        this.f108764h = false;
        this.f108765i = false;
        this.f108769m = -9223372036854775807L;
    }

    @Override // rr.m
    public void b(ts.d0 d0Var) {
        ts.a.i(this.f108761e);
        while (d0Var.a() > 0) {
            int i11 = this.f108762f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        int iMin = Math.min(d0Var.a(), this.f108768l - this.f108763g);
                        this.f108761e.d(d0Var, iMin);
                        int i12 = this.f108763g + iMin;
                        this.f108763g = i12;
                        int i13 = this.f108768l;
                        if (i12 == i13) {
                            long j11 = this.f108769m;
                            if (j11 != -9223372036854775807L) {
                                this.f108761e.e(j11, 1, i13, 0, null);
                                this.f108769m += this.f108766j;
                            }
                            this.f108762f = 0;
                        }
                    }
                } else if (f(d0Var, this.f108758b.e(), 16)) {
                    g();
                    this.f108758b.U(0);
                    this.f108761e.d(this.f108758b, 16);
                    this.f108762f = 2;
                }
            } else if (h(d0Var)) {
                this.f108762f = 1;
                this.f108758b.e()[0] = -84;
                this.f108758b.e()[1] = (byte) (this.f108765i ? 65 : 64);
                this.f108763g = 2;
            }
        }
    }

    @Override // rr.m
    public void c(long j11, int i11) {
        if (j11 != -9223372036854775807L) {
            this.f108769m = j11;
        }
    }

    @Override // rr.m
    public void d(hr.m mVar, i0.d dVar) {
        dVar.a();
        this.f108760d = dVar.b();
        this.f108761e = mVar.b(dVar.c(), 1);
    }

    public f(String str) {
        ts.c0 c0Var = new ts.c0(new byte[16]);
        this.f108757a = c0Var;
        this.f108758b = new ts.d0(c0Var.f114975a);
        this.f108762f = 0;
        this.f108763g = 0;
        this.f108764h = false;
        this.f108765i = false;
        this.f108769m = -9223372036854775807L;
        this.f108759c = str;
    }

    @Override // rr.m
    public void e() {
    }
}
