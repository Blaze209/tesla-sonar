package da;

import androidx.media3.common.ParserException;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f60259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f60260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f60261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s7.c0 f60262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s7.b0 f60263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private w8.o0 f60264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f60265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p7.u f60266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f60267i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f60268j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f60269k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f60270l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f60271m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f60272n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f60273o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f60274p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f60275q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f60276r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f60277s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f60278t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f60279u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f60280v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f60281w;

    public s(String str, int i11, String str2) {
        this.f60259a = str;
        this.f60260b = i11;
        this.f60261c = str2;
        s7.c0 c0Var = new s7.c0(1024);
        this.f60262d = c0Var;
        this.f60263e = new s7.b0(c0Var.f());
        this.f60271m = -9223372036854775807L;
    }

    private static long f(s7.b0 b0Var) {
        return b0Var.h((b0Var.h(2) + 1) * 8);
    }

    @RequiresNonNull({"output"})
    private void g(s7.b0 b0Var) throws ParserException {
        if (!b0Var.g()) {
            this.f60272n = true;
            l(b0Var);
        } else if (!this.f60272n) {
            return;
        }
        if (this.f60273o != 0) {
            throw ParserException.a(null, null);
        }
        if (this.f60274p != 0) {
            throw ParserException.a(null, null);
        }
        k(b0Var, j(b0Var));
        if (this.f60276r) {
            b0Var.r((int) this.f60277s);
        }
    }

    private int h(s7.b0 b0Var) throws ParserException {
        int iB = b0Var.b();
        w8.a.b bVarE = w8.a.e(b0Var, true);
        this.f60281w = bVarE.f121208c;
        this.f60278t = bVarE.f121206a;
        this.f60280v = bVarE.f121207b;
        return iB - b0Var.b();
    }

    private void i(s7.b0 b0Var) {
        int iH = b0Var.h(3);
        this.f60275q = iH;
        if (iH == 0) {
            b0Var.r(8);
            return;
        }
        if (iH == 1) {
            b0Var.r(9);
            return;
        }
        if (iH == 3 || iH == 4 || iH == 5) {
            b0Var.r(6);
        } else {
            if (iH != 6 && iH != 7) {
                throw new IllegalStateException();
            }
            b0Var.r(1);
        }
    }

    private int j(s7.b0 b0Var) throws ParserException {
        int iH;
        if (this.f60275q != 0) {
            throw ParserException.a(null, null);
        }
        int i11 = 0;
        do {
            iH = b0Var.h(8);
            i11 += iH;
        } while (iH == 255);
        return i11;
    }

    @RequiresNonNull({"output"})
    private void k(s7.b0 b0Var, int i11) {
        int iE = b0Var.e();
        if ((iE & 7) == 0) {
            this.f60262d.b0(iE >> 3);
        } else {
            b0Var.i(this.f60262d.f(), 0, i11 * 8);
            this.f60262d.b0(0);
        }
        this.f60264f.f(this.f60262d, i11);
        s7.a.h(this.f60271m != -9223372036854775807L);
        this.f60264f.b(this.f60271m, 1, i11, 0, null);
        this.f60271m += this.f60279u;
    }

    @RequiresNonNull({"output"})
    private void l(s7.b0 b0Var) throws ParserException {
        boolean zG;
        int iH = b0Var.h(1);
        int iH2 = iH == 1 ? b0Var.h(1) : 0;
        this.f60273o = iH2;
        if (iH2 != 0) {
            throw ParserException.a(null, null);
        }
        if (iH == 1) {
            f(b0Var);
        }
        if (!b0Var.g()) {
            throw ParserException.a(null, null);
        }
        this.f60274p = b0Var.h(6);
        int iH3 = b0Var.h(4);
        int iH4 = b0Var.h(3);
        if (iH3 != 0 || iH4 != 0) {
            throw ParserException.a(null, null);
        }
        if (iH == 0) {
            int iE = b0Var.e();
            int iH5 = h(b0Var);
            b0Var.p(iE);
            byte[] bArr = new byte[(iH5 + 7) / 8];
            b0Var.i(bArr, 0, iH5);
            p7.u uVarP = new p7.u.b().j0(this.f60265g).W(this.f60261c).y0("audio/mp4a-latm").U(this.f60281w).T(this.f60280v).z0(this.f60278t).k0(Collections.singletonList(bArr)).n0(this.f60259a).w0(this.f60260b).P();
            if (!uVarP.equals(this.f60266h)) {
                this.f60266h = uVarP;
                this.f60279u = 1024000000 / ((long) uVarP.H);
                this.f60264f.g(uVarP);
            }
        } else {
            b0Var.r(((int) f(b0Var)) - h(b0Var));
        }
        i(b0Var);
        boolean zG2 = b0Var.g();
        this.f60276r = zG2;
        this.f60277s = 0L;
        if (zG2) {
            if (iH == 1) {
                this.f60277s = f(b0Var);
            } else {
                do {
                    zG = b0Var.g();
                    this.f60277s = (this.f60277s << 8) + ((long) b0Var.h(8));
                } while (zG);
            }
        }
        if (b0Var.g()) {
            b0Var.r(8);
        }
    }

    private void m(int i11) {
        this.f60262d.X(i11);
        this.f60263e.n(this.f60262d.f());
    }

    @Override // da.m
    public void a() {
        this.f60267i = 0;
        this.f60271m = -9223372036854775807L;
        this.f60272n = false;
    }

    @Override // da.m
    public void b(s7.c0 c0Var) throws ParserException {
        s7.a.j(this.f60264f);
        while (c0Var.a() > 0) {
            int i11 = this.f60267i;
            if (i11 != 0) {
                if (i11 == 1) {
                    int iM = c0Var.M();
                    if ((iM & 224) == 224) {
                        this.f60270l = iM;
                        this.f60267i = 2;
                    } else if (iM != 86) {
                        this.f60267i = 0;
                    }
                } else if (i11 == 2) {
                    int iM2 = ((this.f60270l & (-225)) << 8) | c0Var.M();
                    this.f60269k = iM2;
                    if (iM2 > this.f60262d.f().length) {
                        m(this.f60269k);
                    }
                    this.f60268j = 0;
                    this.f60267i = 3;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(c0Var.a(), this.f60269k - this.f60268j);
                    c0Var.q(this.f60263e.f110390a, this.f60268j, iMin);
                    int i12 = this.f60268j + iMin;
                    this.f60268j = i12;
                    if (i12 == this.f60269k) {
                        this.f60263e.p(0);
                        g(this.f60263e);
                        this.f60267i = 0;
                    }
                }
            } else if (c0Var.M() == 86) {
                this.f60267i = 1;
            }
        }
    }

    @Override // da.m
    public void c(long j11, int i11) {
        this.f60271m = j11;
    }

    @Override // da.m
    public void d(w8.r rVar, l0.d dVar) {
        dVar.a();
        this.f60264f = rVar.b(dVar.c(), 1);
        this.f60265g = dVar.b();
    }

    @Override // da.m
    public void e(boolean z11) {
    }
}
