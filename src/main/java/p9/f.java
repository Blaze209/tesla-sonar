package p9;

import java.io.EOFException;
import java.math.RoundingMode;
import k9.l;
import k9.n;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import s7.c0;
import s7.q0;
import s7.t;
import w8.b0;
import w8.d0;
import w8.f0;
import w8.i0;
import w8.o0;
import w8.p;
import w8.q;
import w8.r;
import w8.u;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements p {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final u f101985v = new u() { // from class: p9.d
        @Override // w8.u
        public final p[] d() {
            return f.b();
        }
    };

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final k9.h.a f101986w = new k9.h.a() { // from class: p9.e
        @Override // k9.h.a
        public final boolean a(int i11, int i12, int i13, int i14, int i15) {
            return f.c(i11, i12, i13, i14, i15);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f101987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f101988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0 f101989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f0.a f101990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b0 f101991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d0 f101992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o0 f101993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r f101994h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private o0 f101995i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private o0 f101996j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f101997k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private p7.f0 f101998l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f101999m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f102000n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f102001o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f102002p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f102003q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private g f102004r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f102005s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f102006t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f102007u;

    public f() {
        this(0);
    }

    public static /* synthetic */ p[] b() {
        return new p[]{new f()};
    }

    public static /* synthetic */ boolean c(int i11, int i12, int i13, int i14, int i15) {
        if (i12 == 67 && i13 == 79 && i14 == 77 && (i15 == 77 || i11 == 2)) {
            return true;
        }
        if (i12 == 77 && i13 == 76 && i14 == 76) {
            return i15 == 84 || i11 == 2;
        }
        return false;
    }

    @EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    private void d() {
        s7.a.j(this.f101995i);
        q0.l(this.f101994h);
    }

    @RequiresNonNull({"realTrackOutput"})
    private g f(q qVar) {
        long jO;
        long j11;
        long jF;
        g gVarS = s(qVar);
        c cVarR = r(this.f101998l, qVar.getPosition());
        if (this.f102005s) {
            return new g.a();
        }
        if ((this.f101987a & 4) != 0) {
            if (cVarR != null) {
                jO = cVarR.g();
                jF = cVarR.f();
            } else {
                if (gVarS != null) {
                    jO = gVarS.g();
                    jF = gVarS.f();
                } else {
                    jO = o(this.f101998l);
                    j11 = -1;
                }
                gVarS = new b(jO, qVar.getPosition(), j11);
            }
            j11 = jF;
            gVarS = new b(jO, qVar.getPosition(), j11);
        } else if (cVarR != null) {
            gVarS = cVarR;
        } else if (gVarS == null) {
            gVarS = null;
        }
        if (gVarS != null && x(gVarS) && gVarS.g() != -9223372036854775807L && (gVarS.f() != -1 || qVar.getLength() != -1)) {
            long jK = gVarS.k() != -1 ? gVarS.k() : 0L;
            long jF2 = gVarS.f() != -1 ? gVarS.f() : qVar.getLength();
            gVarS = new a(jF2, jK, ru.f.m(q0.v1(jF2 - jK, 8000000L, gVarS.g(), RoundingMode.HALF_UP)), -1, false);
        } else if (gVarS == null || x(gVarS)) {
            gVarS = n(qVar, (this.f101987a & 2) != 0);
        }
        this.f101995i.d(gVarS.g());
        return gVarS;
    }

    private long g(long j11) {
        return this.f101999m + ((j11 * 1000000) / ((long) this.f101990d.f121305d));
    }

    private g m(long j11, i iVar, long j12) {
        long j13;
        long j14;
        long jA = iVar.a();
        if (jA == -9223372036854775807L) {
            return null;
        }
        long j15 = iVar.f102016c;
        if (j15 != -1) {
            long j16 = j11 + j15;
            j13 = j15 - ((long) iVar.f102014a.f121304c);
            j14 = j16;
        } else {
            if (j12 == -1) {
                return null;
            }
            j13 = (j12 - j11) - ((long) iVar.f102014a.f121304c);
            j14 = j12;
        }
        long j17 = j13;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return new a(j14, j11 + ((long) iVar.f102014a.f121304c), ru.f.e(q0.v1(j17, 8000000L, jA, roundingMode)), ru.f.e(qu.e.b(j17, iVar.f102015b, roundingMode)), false);
    }

    private g n(q qVar, boolean z11) {
        qVar.e(this.f101989c.f(), 0, 4);
        this.f101989c.b0(0);
        this.f101990d.a(this.f101989c.v());
        return new a(qVar.getLength(), qVar.getPosition(), this.f101990d, z11);
    }

    private static long o(p7.f0 f0Var) {
        if (f0Var == null) {
            return -9223372036854775807L;
        }
        int iE = f0Var.e();
        for (int i11 = 0; i11 < iE; i11++) {
            p7.f0.a aVarD = f0Var.d(i11);
            if (aVarD instanceof n) {
                n nVar = (n) aVarD;
                if (nVar.f85426a.equals("TLEN")) {
                    return q0.b1(Long.parseLong(nVar.f85440d.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    private static int p(c0 c0Var, int i11) {
        if (c0Var.j() >= i11 + 4) {
            c0Var.b0(i11);
            int iV = c0Var.v();
            if (iV == 1483304551 || iV == 1231971951) {
                return iV;
            }
        }
        if (c0Var.j() < 40) {
            return 0;
        }
        c0Var.b0(36);
        return c0Var.v() == 1447187017 ? 1447187017 : 0;
    }

    private static boolean q(int i11, long j11) {
        return ((long) (i11 & (-128000))) == (j11 & (-128000));
    }

    private static c r(p7.f0 f0Var, long j11) {
        if (f0Var == null) {
            return null;
        }
        int iE = f0Var.e();
        for (int i11 = 0; i11 < iE; i11++) {
            p7.f0.a aVarD = f0Var.d(i11);
            if (aVarD instanceof l) {
                return c.a(j11, (l) aVarD, o(f0Var));
            }
        }
        return null;
    }

    private g s(q qVar) {
        int i11;
        int i12;
        c0 c0Var = new c0(this.f101990d.f121304c);
        qVar.e(c0Var.f(), 0, this.f101990d.f121304c);
        f0.a aVar = this.f101990d;
        int i13 = 21;
        if ((aVar.f121302a & 1) != 0) {
            if (aVar.f121306e != 1) {
                i13 = 36;
            }
        } else if (aVar.f121306e == 1) {
            i13 = 13;
        }
        int iP = p(c0Var, i13);
        if (iP != 1231971951) {
            if (iP == 1447187017) {
                h hVarA = h.a(qVar.getLength(), qVar.getPosition(), this.f101990d, c0Var);
                qVar.k(this.f101990d.f121304c);
                return hVarA;
            }
            if (iP != 1483304551) {
                qVar.g();
                return null;
            }
        }
        i iVarB = i.b(this.f101990d, c0Var);
        if (!this.f101991e.a() && (i11 = iVarB.f102017d) != -1 && (i12 = iVarB.f102018e) != -1) {
            b0 b0Var = this.f101991e;
            b0Var.f121224a = i11;
            b0Var.f121225b = i12;
        }
        long position = qVar.getPosition();
        if (qVar.getLength() != -1 && iVarB.f102016c != -1 && qVar.getLength() != iVarB.f102016c + position) {
            t.g("Mp3Extractor", "Data size mismatch between stream (" + qVar.getLength() + ") and Xing frame (" + (iVarB.f102016c + position) + "), using Xing value.");
        }
        qVar.k(this.f101990d.f121304c);
        return iP == 1483304551 ? j.a(iVarB, position) : m(position, iVarB, qVar.getLength());
    }

    private void t() {
        g gVar = this.f102004r;
        if ((gVar instanceof a) && gVar.d()) {
            long j11 = this.f102002p;
            if (j11 == -1 || j11 == this.f102004r.f()) {
                return;
            }
            this.f102004r = ((a) this.f102004r).i(this.f102002p);
            ((r) s7.a.f(this.f101994h)).t(this.f102004r);
            ((o0) s7.a.f(this.f101995i)).d(this.f102004r.g());
        }
    }

    private boolean u(q qVar) {
        g gVar = this.f102004r;
        if (gVar != null) {
            long jF = gVar.f();
            if (jF != -1 && qVar.h() > jF - 4) {
                return true;
            }
        }
        try {
            return !qVar.f(this.f101989c.f(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    private int v(q qVar) throws Throwable {
        if (this.f101997k == 0) {
            try {
                y(qVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f102004r == null) {
            g gVarF = f(qVar);
            this.f102004r = gVarF;
            this.f101994h.t(gVarF);
            p7.u.b bVarR0 = new p7.u.b().W("audio/mpeg").y0(this.f101990d.f121303b).o0(4096).T(this.f101990d.f121306e).z0(this.f101990d.f121305d).d0(this.f101991e.f121224a).e0(this.f101991e.f121225b).r0((this.f101987a & 8) != 0 ? null : this.f101998l);
            if (this.f102004r.m() != -2147483647) {
                bVarR0.S(this.f102004r.m());
            }
            this.f101996j.g(bVarR0.P());
            this.f102001o = qVar.getPosition();
        } else if (this.f102001o != 0) {
            long position = qVar.getPosition();
            long j11 = this.f102001o;
            if (position < j11) {
                qVar.k((int) (j11 - position));
            }
        }
        return w(qVar);
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    private int w(q qVar) {
        if (this.f102003q == 0) {
            qVar.g();
            if (u(qVar)) {
                return -1;
            }
            this.f101989c.b0(0);
            int iV = this.f101989c.v();
            if (!q(iV, this.f101997k) || f0.j(iV) == -1) {
                qVar.k(1);
                this.f101997k = 0;
                return 0;
            }
            this.f101990d.a(iV);
            if (this.f101999m == -9223372036854775807L) {
                this.f101999m = this.f102004r.b(qVar.getPosition());
                if (this.f101988b != -9223372036854775807L) {
                    this.f101999m += this.f101988b - this.f102004r.b(0L);
                }
            }
            this.f102003q = this.f101990d.f121304c;
            long position = qVar.getPosition();
            f0.a aVar = this.f101990d;
            this.f102002p = position + ((long) aVar.f121304c);
            g gVar = this.f102004r;
            if (gVar instanceof b) {
                b bVar = (b) gVar;
                bVar.e(g(this.f102000n + ((long) aVar.f121308g)), this.f102002p);
                if (this.f102006t && bVar.a(this.f102007u)) {
                    this.f102006t = false;
                    this.f101996j = this.f101995i;
                }
            }
        }
        int iE = this.f101996j.e(qVar, this.f102003q, true);
        if (iE == -1) {
            return -1;
        }
        int i11 = this.f102003q - iE;
        this.f102003q = i11;
        if (i11 > 0) {
            return 0;
        }
        this.f101996j.b(g(this.f102000n), 1, this.f101990d.f121304c, 0, null);
        this.f102000n += (long) this.f101990d.f121308g;
        this.f102003q = 0;
        return 0;
    }

    private boolean x(g gVar) {
        return (gVar.d() || (this.f101987a & 1) == 0) ? false : true;
    }

    private boolean y(q qVar, boolean z11) throws Throwable {
        int iH;
        int i11;
        int iJ;
        int i12 = z11 ? 32768 : 131072;
        qVar.g();
        if (qVar.getPosition() == 0) {
            p7.f0 f0VarA = this.f101992f.a(qVar, (this.f101987a & 8) == 0 ? null : f101986w);
            this.f101998l = f0VarA;
            if (f0VarA != null) {
                this.f101991e.c(f0VarA);
            }
            iH = (int) qVar.h();
            if (!z11) {
                qVar.k(iH);
            }
            i11 = 0;
        } else {
            iH = 0;
            i11 = 0;
        }
        int i13 = i11;
        int i14 = i13;
        while (true) {
            if (u(qVar)) {
                if (i13 > 0) {
                    break;
                }
                t();
                throw new EOFException();
            }
            this.f101989c.b0(0);
            int iV = this.f101989c.v();
            if ((i11 == 0 || q(iV, i11)) && (iJ = f0.j(iV)) != -1) {
                i13++;
                if (i13 != 1) {
                    if (i13 == 4) {
                        break;
                    }
                } else {
                    this.f101990d.a(iV);
                    i11 = iV;
                }
                qVar.i(iJ - 4);
            } else {
                int i15 = i14 + 1;
                if (i14 == i12) {
                    if (z11) {
                        return false;
                    }
                    t();
                    throw new EOFException();
                }
                if (z11) {
                    qVar.g();
                    qVar.i(iH + i15);
                } else {
                    qVar.k(1);
                }
                i13 = 0;
                i14 = i15;
                i11 = 0;
            }
        }
        if (z11) {
            qVar.k(iH + i14);
        } else {
            qVar.g();
        }
        this.f101997k = i11;
        return true;
    }

    @Override // w8.p
    public void a(long j11, long j12) {
        this.f101997k = 0;
        this.f101999m = -9223372036854775807L;
        this.f102000n = 0L;
        this.f102003q = 0;
        this.f102007u = j12;
        g gVar = this.f102004r;
        if (!(gVar instanceof b) || ((b) gVar).a(j12)) {
            return;
        }
        this.f102006t = true;
        this.f101996j = this.f101993g;
    }

    @Override // w8.p
    public void e(r rVar) {
        this.f101994h = rVar;
        o0 o0VarB = rVar.b(0, 1);
        this.f101995i = o0VarB;
        this.f101996j = o0VarB;
        this.f101994h.j();
    }

    @Override // w8.p
    public int h(q qVar, i0 i0Var) throws Throwable {
        d();
        int iV = v(qVar);
        if (iV == -1 && (this.f102004r instanceof b)) {
            long jG = g(this.f102000n);
            if (this.f102004r.g() != jG) {
                ((b) this.f102004r).h(jG);
                this.f101994h.t(this.f102004r);
                this.f101995i.d(this.f102004r.g());
            }
        }
        return iV;
    }

    public void k() {
        this.f102005s = true;
    }

    @Override // w8.p
    public boolean l(q qVar) {
        return y(qVar, true);
    }

    public f(int i11) {
        this(i11, -9223372036854775807L);
    }

    public f(int i11, long j11) {
        this.f101987a = (i11 & 2) != 0 ? i11 | 1 : i11;
        this.f101988b = j11;
        this.f101989c = new c0(10);
        this.f101990d = new f0.a();
        this.f101991e = new b0();
        this.f101999m = -9223372036854775807L;
        this.f101992f = new d0();
        w8.n nVar = new w8.n();
        this.f101993g = nVar;
        this.f101996j = nVar;
        this.f102002p = -1L;
    }

    @Override // w8.p
    public void release() {
    }
}
