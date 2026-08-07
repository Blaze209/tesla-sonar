package rr;

import com.google.android.exoplayer2.u0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class c implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ts.c0 f108729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ts.d0 f108730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f108731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f108732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private hr.b0 f108733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f108734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f108735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f108736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f108737i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private u0 f108738j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f108739k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f108740l;

    public c() {
        this(null);
    }

    private boolean f(ts.d0 d0Var, byte[] bArr, int i11) {
        int iMin = Math.min(d0Var.a(), i11 - this.f108735g);
        d0Var.l(bArr, this.f108735g, iMin);
        int i12 = this.f108735g + iMin;
        this.f108735g = i12;
        return i12 == i11;
    }

    @RequiresNonNull({"output"})
    private void g() {
        this.f108729a.p(0);
        dr.b.C1243b c1243bF = dr.b.f(this.f108729a);
        u0 u0Var = this.f108738j;
        if (u0Var == null || c1243bF.f60857d != u0Var.f40725y || c1243bF.f60856c != u0Var.f40726z || !p0.c(c1243bF.f60854a, u0Var.f40712l)) {
            u0.b bVarB0 = new u0.b().U(this.f108732d).g0(c1243bF.f60854a).J(c1243bF.f60857d).h0(c1243bF.f60856c).X(this.f108731c).b0(c1243bF.f60860g);
            if ("audio/ac3".equals(c1243bF.f60854a)) {
                bVarB0.I(c1243bF.f60860g);
            }
            u0 u0VarG = bVarB0.G();
            this.f108738j = u0VarG;
            this.f108733e.b(u0VarG);
        }
        this.f108739k = c1243bF.f60858e;
        this.f108737i = (((long) c1243bF.f60859f) * 1000000) / ((long) this.f108738j.f40726z);
    }

    private boolean h(ts.d0 d0Var) {
        while (true) {
            if (d0Var.a() <= 0) {
                return false;
            }
            if (this.f108736h) {
                int iH = d0Var.H();
                if (iH == 119) {
                    this.f108736h = false;
                    return true;
                }
                this.f108736h = iH == 11;
            } else {
                this.f108736h = d0Var.H() == 11;
            }
        }
    }

    @Override // rr.m
    public void a() {
        this.f108734f = 0;
        this.f108735g = 0;
        this.f108736h = false;
        this.f108740l = -9223372036854775807L;
    }

    @Override // rr.m
    public void b(ts.d0 d0Var) {
        ts.a.i(this.f108733e);
        while (d0Var.a() > 0) {
            int i11 = this.f108734f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        int iMin = Math.min(d0Var.a(), this.f108739k - this.f108735g);
                        this.f108733e.d(d0Var, iMin);
                        int i12 = this.f108735g + iMin;
                        this.f108735g = i12;
                        int i13 = this.f108739k;
                        if (i12 == i13) {
                            long j11 = this.f108740l;
                            if (j11 != -9223372036854775807L) {
                                this.f108733e.e(j11, 1, i13, 0, null);
                                this.f108740l += this.f108737i;
                            }
                            this.f108734f = 0;
                        }
                    }
                } else if (f(d0Var, this.f108730b.e(), 128)) {
                    g();
                    this.f108730b.U(0);
                    this.f108733e.d(this.f108730b, 128);
                    this.f108734f = 2;
                }
            } else if (h(d0Var)) {
                this.f108734f = 1;
                this.f108730b.e()[0] = 11;
                this.f108730b.e()[1] = 119;
                this.f108735g = 2;
            }
        }
    }

    @Override // rr.m
    public void c(long j11, int i11) {
        if (j11 != -9223372036854775807L) {
            this.f108740l = j11;
        }
    }

    @Override // rr.m
    public void d(hr.m mVar, i0.d dVar) {
        dVar.a();
        this.f108732d = dVar.b();
        this.f108733e = mVar.b(dVar.c(), 1);
    }

    public c(String str) {
        ts.c0 c0Var = new ts.c0(new byte[128]);
        this.f108729a = c0Var;
        this.f108730b = new ts.d0(c0Var.f114975a);
        this.f108734f = 0;
        this.f108740l = -9223372036854775807L;
        this.f108731c = str;
    }

    @Override // rr.m
    public void e() {
    }
}
