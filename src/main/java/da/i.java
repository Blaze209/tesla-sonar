package da;

import java.util.Arrays;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements m {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final byte[] f60017x = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f60018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s7.b0 f60019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s7.c0 f60020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f60021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f60022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f60023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f60024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private w8.o0 f60025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private w8.o0 f60026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f60027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f60028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f60029l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f60030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f60031n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f60032o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f60033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f60034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f60035r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f60036s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f60037t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f60038u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private w8.o0 f60039v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f60040w;

    public i(boolean z11, String str) {
        this(z11, null, 0, str);
    }

    @EnsuresNonNull({"output", "currentOutput", "id3Output"})
    private void f() {
        s7.a.f(this.f60025h);
        q0.l(this.f60039v);
        q0.l(this.f60026i);
    }

    private void g(s7.c0 c0Var) {
        if (c0Var.a() == 0) {
            return;
        }
        this.f60019b.f110390a[0] = c0Var.f()[c0Var.g()];
        this.f60019b.p(2);
        int iH = this.f60019b.h(4);
        int i11 = this.f60033p;
        if (i11 != -1 && iH != i11) {
            q();
            return;
        }
        if (!this.f60031n) {
            this.f60031n = true;
            this.f60032o = this.f60034q;
            this.f60033p = iH;
        }
        t();
    }

    private boolean h(s7.c0 c0Var, int i11) {
        c0Var.b0(i11 + 1);
        if (!w(c0Var, this.f60019b.f110390a, 1)) {
            return false;
        }
        this.f60019b.p(4);
        int iH = this.f60019b.h(1);
        int i12 = this.f60032o;
        if (i12 != -1 && iH != i12) {
            return false;
        }
        if (this.f60033p != -1) {
            if (!w(c0Var, this.f60019b.f110390a, 1)) {
                return true;
            }
            this.f60019b.p(2);
            if (this.f60019b.h(4) != this.f60033p) {
                return false;
            }
            c0Var.b0(i11 + 2);
        }
        if (!w(c0Var, this.f60019b.f110390a, 4)) {
            return true;
        }
        this.f60019b.p(14);
        int iH2 = this.f60019b.h(13);
        if (iH2 < 7) {
            return false;
        }
        byte[] bArrF = c0Var.f();
        int iJ = c0Var.j();
        int i13 = i11 + iH2;
        if (i13 >= iJ) {
            return true;
        }
        byte b11 = bArrF[i13];
        if (b11 == -1) {
            int i14 = i13 + 1;
            if (i14 == iJ) {
                return true;
            }
            return l((byte) -1, bArrF[i14]) && ((bArrF[i14] & 8) >> 3) == iH;
        }
        if (b11 != 73) {
            return false;
        }
        int i15 = i13 + 1;
        if (i15 == iJ) {
            return true;
        }
        if (bArrF[i15] != 68) {
            return false;
        }
        int i16 = i13 + 2;
        return i16 == iJ || bArrF[i16] == 51;
    }

    private boolean i(s7.c0 c0Var, byte[] bArr, int i11) {
        int iMin = Math.min(c0Var.a(), i11 - this.f60028k);
        c0Var.q(bArr, this.f60028k, iMin);
        int i12 = this.f60028k + iMin;
        this.f60028k = i12;
        return i12 == i11;
    }

    private void j(s7.c0 c0Var) {
        byte[] bArrF = c0Var.f();
        int iG = c0Var.g();
        int iJ = c0Var.j();
        while (iG < iJ) {
            int i11 = iG + 1;
            byte b11 = bArrF[iG];
            int i12 = b11 & 255;
            if (this.f60029l == 512 && l((byte) -1, (byte) i12) && (this.f60031n || h(c0Var, iG - 1))) {
                this.f60034q = (b11 & 8) >> 3;
                this.f60030m = (b11 & 1) == 0;
                if (this.f60031n) {
                    t();
                } else {
                    r();
                }
                c0Var.b0(i11);
                return;
            }
            int i13 = this.f60029l;
            int i14 = i12 | i13;
            if (i14 == 329) {
                this.f60029l = 768;
            } else if (i14 == 511) {
                this.f60029l = 512;
            } else if (i14 == 836) {
                this.f60029l = 1024;
            } else if (i14 == 1075) {
                u();
                c0Var.b0(i11);
                return;
            } else if (i13 != 256) {
                this.f60029l = 256;
            }
            iG = i11;
        }
        c0Var.b0(iG);
    }

    private boolean l(byte b11, byte b12) {
        return m(((b11 & 255) << 8) | (b12 & 255));
    }

    public static boolean m(int i11) {
        return (i11 & 65526) == 65520;
    }

    @RequiresNonNull({"output"})
    private void n() {
        this.f60019b.p(0);
        if (this.f60035r) {
            this.f60019b.r(10);
        } else {
            int i11 = 2;
            int iH = this.f60019b.h(2) + 1;
            if (iH != 2) {
                s7.t.i("AdtsReader", "Detected audio object type: " + iH + ", but assuming AAC LC.");
            } else {
                i11 = iH;
            }
            this.f60019b.r(5);
            byte[] bArrB = w8.a.b(i11, this.f60033p, this.f60019b.h(3));
            w8.a.b bVarF = w8.a.f(bArrB);
            p7.u uVarP = new p7.u.b().j0(this.f60024g).W(this.f60023f).y0("audio/mp4a-latm").U(bVarF.f121208c).T(bVarF.f121207b).z0(bVarF.f121206a).k0(Collections.singletonList(bArrB)).n0(this.f60021d).w0(this.f60022e).P();
            this.f60036s = 1024000000 / ((long) uVarP.H);
            this.f60025h.g(uVarP);
            this.f60035r = true;
        }
        this.f60019b.r(4);
        int iH2 = this.f60019b.h(13);
        int i12 = iH2 - 7;
        if (this.f60030m) {
            i12 = iH2 - 9;
        }
        v(this.f60025h, this.f60036s, 0, i12);
    }

    @RequiresNonNull({"id3Output"})
    private void o() {
        this.f60026i.f(this.f60020c, 10);
        this.f60020c.b0(6);
        v(this.f60026i, 0L, 10, this.f60020c.L() + 10);
    }

    @RequiresNonNull({"currentOutput"})
    private void p(s7.c0 c0Var) {
        int iMin = Math.min(c0Var.a(), this.f60037t - this.f60028k);
        this.f60039v.f(c0Var, iMin);
        int i11 = this.f60028k + iMin;
        this.f60028k = i11;
        if (i11 == this.f60037t) {
            s7.a.h(this.f60038u != -9223372036854775807L);
            this.f60039v.b(this.f60038u, 1, this.f60037t, 0, null);
            this.f60038u += this.f60040w;
            s();
        }
    }

    private void q() {
        this.f60031n = false;
        s();
    }

    private void r() {
        this.f60027j = 1;
        this.f60028k = 0;
    }

    private void s() {
        this.f60027j = 0;
        this.f60028k = 0;
        this.f60029l = 256;
    }

    private void t() {
        this.f60027j = 3;
        this.f60028k = 0;
    }

    private void u() {
        this.f60027j = 2;
        this.f60028k = f60017x.length;
        this.f60037t = 0;
        this.f60020c.b0(0);
    }

    private void v(w8.o0 o0Var, long j11, int i11, int i12) {
        this.f60027j = 4;
        this.f60028k = i11;
        this.f60039v = o0Var;
        this.f60040w = j11;
        this.f60037t = i12;
    }

    private boolean w(s7.c0 c0Var, byte[] bArr, int i11) {
        if (c0Var.a() < i11) {
            return false;
        }
        c0Var.q(bArr, 0, i11);
        return true;
    }

    @Override // da.m
    public void a() {
        this.f60038u = -9223372036854775807L;
        q();
    }

    @Override // da.m
    public void b(s7.c0 c0Var) {
        f();
        while (c0Var.a() > 0) {
            int i11 = this.f60027j;
            if (i11 == 0) {
                j(c0Var);
            } else if (i11 == 1) {
                g(c0Var);
            } else if (i11 != 2) {
                if (i11 == 3) {
                    if (i(c0Var, this.f60019b.f110390a, this.f60030m ? 7 : 5)) {
                        n();
                    }
                } else {
                    if (i11 != 4) {
                        throw new IllegalStateException();
                    }
                    p(c0Var);
                }
            } else if (i(c0Var, this.f60020c.f(), 10)) {
                o();
            }
        }
    }

    @Override // da.m
    public void c(long j11, int i11) {
        this.f60038u = j11;
    }

    @Override // da.m
    public void d(w8.r rVar, l0.d dVar) {
        dVar.a();
        this.f60024g = dVar.b();
        w8.o0 o0VarB = rVar.b(dVar.c(), 1);
        this.f60025h = o0VarB;
        this.f60039v = o0VarB;
        if (!this.f60018a) {
            this.f60026i = new w8.n();
            return;
        }
        dVar.a();
        w8.o0 o0VarB2 = rVar.b(dVar.c(), 5);
        this.f60026i = o0VarB2;
        o0VarB2.g(new p7.u.b().j0(dVar.b()).W(this.f60023f).y0("application/id3").P());
    }

    public long k() {
        return this.f60036s;
    }

    public i(boolean z11, String str, int i11, String str2) {
        this.f60019b = new s7.b0(new byte[7]);
        this.f60020c = new s7.c0(Arrays.copyOf(f60017x, 10));
        this.f60032o = -1;
        this.f60033p = -1;
        this.f60036s = -9223372036854775807L;
        this.f60038u = -9223372036854775807L;
        this.f60018a = z11;
        this.f60021d = str;
        this.f60022e = i11;
        this.f60023f = str2;
        s();
    }

    @Override // da.m
    public void e(boolean z11) {
    }
}
