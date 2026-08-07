package rr;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.u0;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class s implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f109004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ts.d0 f109005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ts.c0 f109006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private hr.b0 f109007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f109008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private u0 f109009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f109010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f109011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f109012i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f109013j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f109014k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f109015l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f109016m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f109017n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f109018o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f109019p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f109020q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f109021r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f109022s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f109023t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f109024u;

    public s(String str) {
        this.f109004a = str;
        ts.d0 d0Var = new ts.d0(1024);
        this.f109005b = d0Var;
        this.f109006c = new ts.c0(d0Var.e());
        this.f109014k = -9223372036854775807L;
    }

    private static long f(ts.c0 c0Var) {
        return c0Var.h((c0Var.h(2) + 1) * 8);
    }

    @RequiresNonNull({"output"})
    private void g(ts.c0 c0Var) throws ParserException {
        if (!c0Var.g()) {
            this.f109015l = true;
            l(c0Var);
        } else if (!this.f109015l) {
            return;
        }
        if (this.f109016m != 0) {
            throw ParserException.a(null, null);
        }
        if (this.f109017n != 0) {
            throw ParserException.a(null, null);
        }
        k(c0Var, j(c0Var));
        if (this.f109019p) {
            c0Var.r((int) this.f109020q);
        }
    }

    private int h(ts.c0 c0Var) throws ParserException {
        int iB = c0Var.b();
        dr.a.b bVarD = dr.a.d(c0Var, true);
        this.f109024u = bVarD.f60847c;
        this.f109021r = bVarD.f60845a;
        this.f109023t = bVarD.f60846b;
        return iB - c0Var.b();
    }

    private void i(ts.c0 c0Var) {
        int iH = c0Var.h(3);
        this.f109018o = iH;
        if (iH == 0) {
            c0Var.r(8);
            return;
        }
        if (iH == 1) {
            c0Var.r(9);
            return;
        }
        if (iH == 3 || iH == 4 || iH == 5) {
            c0Var.r(6);
        } else {
            if (iH != 6 && iH != 7) {
                throw new IllegalStateException();
            }
            c0Var.r(1);
        }
    }

    private int j(ts.c0 c0Var) throws ParserException {
        int iH;
        if (this.f109018o != 0) {
            throw ParserException.a(null, null);
        }
        int i11 = 0;
        do {
            iH = c0Var.h(8);
            i11 += iH;
        } while (iH == 255);
        return i11;
    }

    @RequiresNonNull({"output"})
    private void k(ts.c0 c0Var, int i11) {
        int iE = c0Var.e();
        if ((iE & 7) == 0) {
            this.f109005b.U(iE >> 3);
        } else {
            c0Var.i(this.f109005b.e(), 0, i11 * 8);
            this.f109005b.U(0);
        }
        this.f109007d.d(this.f109005b, i11);
        long j11 = this.f109014k;
        if (j11 != -9223372036854775807L) {
            this.f109007d.e(j11, 1, i11, 0, null);
            this.f109014k += this.f109022s;
        }
    }

    @RequiresNonNull({"output"})
    private void l(ts.c0 c0Var) throws ParserException {
        boolean zG;
        int iH = c0Var.h(1);
        int iH2 = iH == 1 ? c0Var.h(1) : 0;
        this.f109016m = iH2;
        if (iH2 != 0) {
            throw ParserException.a(null, null);
        }
        if (iH == 1) {
            f(c0Var);
        }
        if (!c0Var.g()) {
            throw ParserException.a(null, null);
        }
        this.f109017n = c0Var.h(6);
        int iH3 = c0Var.h(4);
        int iH4 = c0Var.h(3);
        if (iH3 != 0 || iH4 != 0) {
            throw ParserException.a(null, null);
        }
        if (iH == 0) {
            int iE = c0Var.e();
            int iH5 = h(c0Var);
            c0Var.p(iE);
            byte[] bArr = new byte[(iH5 + 7) / 8];
            c0Var.i(bArr, 0, iH5);
            u0 u0VarG = new u0.b().U(this.f109008e).g0("audio/mp4a-latm").K(this.f109024u).J(this.f109023t).h0(this.f109021r).V(Collections.singletonList(bArr)).X(this.f109004a).G();
            if (!u0VarG.equals(this.f109009f)) {
                this.f109009f = u0VarG;
                this.f109022s = 1024000000 / ((long) u0VarG.f40726z);
                this.f109007d.b(u0VarG);
            }
        } else {
            c0Var.r(((int) f(c0Var)) - h(c0Var));
        }
        i(c0Var);
        boolean zG2 = c0Var.g();
        this.f109019p = zG2;
        this.f109020q = 0L;
        if (zG2) {
            if (iH == 1) {
                this.f109020q = f(c0Var);
            } else {
                do {
                    zG = c0Var.g();
                    this.f109020q = (this.f109020q << 8) + ((long) c0Var.h(8));
                } while (zG);
            }
        }
        if (c0Var.g()) {
            c0Var.r(8);
        }
    }

    private void m(int i11) {
        this.f109005b.Q(i11);
        this.f109006c.n(this.f109005b.e());
    }

    @Override // rr.m
    public void a() {
        this.f109010g = 0;
        this.f109014k = -9223372036854775807L;
        this.f109015l = false;
    }

    @Override // rr.m
    public void b(ts.d0 d0Var) throws ParserException {
        ts.a.i(this.f109007d);
        while (d0Var.a() > 0) {
            int i11 = this.f109010g;
            if (i11 != 0) {
                if (i11 == 1) {
                    int iH = d0Var.H();
                    if ((iH & 224) == 224) {
                        this.f109013j = iH;
                        this.f109010g = 2;
                    } else if (iH != 86) {
                        this.f109010g = 0;
                    }
                } else if (i11 == 2) {
                    int iH2 = ((this.f109013j & (-225)) << 8) | d0Var.H();
                    this.f109012i = iH2;
                    if (iH2 > this.f109005b.e().length) {
                        m(this.f109012i);
                    }
                    this.f109011h = 0;
                    this.f109010g = 3;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(d0Var.a(), this.f109012i - this.f109011h);
                    d0Var.l(this.f109006c.f114975a, this.f109011h, iMin);
                    int i12 = this.f109011h + iMin;
                    this.f109011h = i12;
                    if (i12 == this.f109012i) {
                        this.f109006c.p(0);
                        g(this.f109006c);
                        this.f109010g = 0;
                    }
                }
            } else if (d0Var.H() == 86) {
                this.f109010g = 1;
            }
        }
    }

    @Override // rr.m
    public void c(long j11, int i11) {
        if (j11 != -9223372036854775807L) {
            this.f109014k = j11;
        }
    }

    @Override // rr.m
    public void d(hr.m mVar, i0.d dVar) {
        dVar.a();
        this.f109007d = mVar.b(dVar.c(), 1);
        this.f109008e = dVar.b();
    }

    @Override // rr.m
    public void e() {
    }
}
