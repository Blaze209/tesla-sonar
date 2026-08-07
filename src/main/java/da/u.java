package da;

import androidx.media3.common.ParserException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f60296a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f60301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private w8.o0 f60302g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f60305j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f60307l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f60308m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f60310o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f60311p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f60315t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f60317v;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f60300e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s7.c0 f60297b = new s7.c0(new byte[15], 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s7.b0 f60298c = new s7.b0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s7.c0 f60299d = new s7.c0();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private v.b f60312q = new v.b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f60313r = -2147483647;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f60314s = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f60316u = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f60306k = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f60309n = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f60303h = -9.223372036854776E18d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f60304i = -9.223372036854776E18d;

    public u(String str) {
        this.f60296a = str;
    }

    private void f(s7.c0 c0Var, s7.c0 c0Var2, boolean z11) {
        int iG = c0Var.g();
        int iMin = Math.min(c0Var.a(), c0Var2.a());
        c0Var.q(c0Var2.f(), c0Var2.g(), iMin);
        c0Var2.c0(iMin);
        if (z11) {
            c0Var.b0(iG);
        }
    }

    @RequiresNonNull({"output"})
    private void g() {
        int i11;
        if (this.f60317v) {
            this.f60306k = false;
            i11 = 1;
        } else {
            i11 = 0;
        }
        double d11 = (((double) (this.f60314s - this.f60315t)) * 1000000.0d) / ((double) this.f60313r);
        long jRound = Math.round(this.f60303h);
        if (this.f60305j) {
            this.f60305j = false;
            this.f60303h = this.f60304i;
        } else {
            this.f60303h += d11;
        }
        this.f60302g.b(jRound, i11, this.f60311p, 0, null);
        this.f60317v = false;
        this.f60315t = 0;
        this.f60311p = 0;
    }

    @RequiresNonNull({"output"})
    private void h(s7.b0 b0Var) throws ParserException {
        v.c cVarH = v.h(b0Var);
        this.f60313r = cVarH.f60322b;
        this.f60314s = cVarH.f60323c;
        long j11 = this.f60316u;
        long j12 = this.f60312q.f60319b;
        if (j11 != j12) {
            this.f60316u = j12;
            String str = "mhm1";
            if (cVarH.f60321a != -1) {
                str = "mhm1" + String.format(".%02X", Integer.valueOf(cVarH.f60321a));
            }
            byte[] bArr = cVarH.f60324d;
            this.f60302g.g(new p7.u.b().j0(this.f60301f).W(this.f60296a).y0("audio/mhm1").z0(this.f60313r).U(str).k0((bArr == null || bArr.length <= 0) ? null : com.google.common.collect.x.t(q0.f110459f, bArr)).P());
        }
        this.f60317v = true;
    }

    private boolean i() throws ParserException {
        int iJ = this.f60297b.j();
        this.f60298c.o(this.f60297b.f(), iJ);
        boolean zG = v.g(this.f60298c, this.f60312q);
        if (zG) {
            this.f60310o = 0;
            this.f60311p += this.f60312q.f60320c + iJ;
        }
        return zG;
    }

    private boolean j(int i11) {
        return i11 == 1 || i11 == 17;
    }

    private boolean k(s7.c0 c0Var) {
        int i11 = this.f60307l;
        if ((i11 & 2) == 0) {
            c0Var.b0(c0Var.j());
            return false;
        }
        if ((i11 & 4) != 0) {
            return true;
        }
        while (c0Var.a() > 0) {
            int i12 = this.f60308m << 8;
            this.f60308m = i12;
            int iM = i12 | c0Var.M();
            this.f60308m = iM;
            if (v.e(iM)) {
                c0Var.b0(c0Var.g() - 3);
                this.f60308m = 0;
                return true;
            }
        }
        return false;
    }

    @RequiresNonNull({"output"})
    private void l(s7.c0 c0Var) {
        int iMin = Math.min(c0Var.a(), this.f60312q.f60320c - this.f60310o);
        this.f60302g.f(c0Var, iMin);
        this.f60310o += iMin;
    }

    @Override // da.m
    public void a() {
        this.f60300e = 0;
        this.f60308m = 0;
        this.f60297b.X(2);
        this.f60310o = 0;
        this.f60311p = 0;
        this.f60313r = -2147483647;
        this.f60314s = -1;
        this.f60315t = 0;
        this.f60316u = -1L;
        this.f60317v = false;
        this.f60305j = false;
        this.f60309n = true;
        this.f60306k = true;
        this.f60303h = -9.223372036854776E18d;
        this.f60304i = -9.223372036854776E18d;
    }

    @Override // da.m
    public void b(s7.c0 c0Var) throws ParserException {
        s7.a.j(this.f60302g);
        while (c0Var.a() > 0) {
            int i11 = this.f60300e;
            if (i11 != 0) {
                if (i11 == 1) {
                    f(c0Var, this.f60297b, false);
                    if (this.f60297b.a() != 0) {
                        this.f60309n = false;
                    } else if (i()) {
                        this.f60297b.b0(0);
                        w8.o0 o0Var = this.f60302g;
                        s7.c0 c0Var2 = this.f60297b;
                        o0Var.f(c0Var2, c0Var2.j());
                        this.f60297b.X(2);
                        this.f60299d.X(this.f60312q.f60320c);
                        this.f60309n = true;
                        this.f60300e = 2;
                    } else if (this.f60297b.j() < 15) {
                        s7.c0 c0Var3 = this.f60297b;
                        c0Var3.a0(c0Var3.j() + 1);
                        this.f60309n = false;
                    }
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException();
                    }
                    if (j(this.f60312q.f60318a)) {
                        f(c0Var, this.f60299d, true);
                    }
                    l(c0Var);
                    int i12 = this.f60310o;
                    v.b bVar = this.f60312q;
                    if (i12 == bVar.f60320c) {
                        int i13 = bVar.f60318a;
                        if (i13 == 1) {
                            h(new s7.b0(this.f60299d.f()));
                        } else if (i13 == 17) {
                            this.f60315t = v.f(new s7.b0(this.f60299d.f()));
                        } else if (i13 == 2) {
                            g();
                        }
                        this.f60300e = 1;
                    }
                }
            } else if (k(c0Var)) {
                this.f60300e = 1;
            }
        }
    }

    @Override // da.m
    public void c(long j11, int i11) {
        this.f60307l = i11;
        if (!this.f60306k && (this.f60311p != 0 || !this.f60309n)) {
            this.f60305j = true;
        }
        if (j11 != -9223372036854775807L) {
            if (this.f60305j) {
                this.f60304i = j11;
            } else {
                this.f60303h = j11;
            }
        }
    }

    @Override // da.m
    public void d(w8.r rVar, l0.d dVar) {
        dVar.a();
        this.f60301f = dVar.b();
        this.f60302g = rVar.b(dVar.c(), 1);
    }

    @Override // da.m
    public void e(boolean z11) {
    }
}
