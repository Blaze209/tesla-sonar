package or;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.u0;
import dr.t;
import hr.b0;
import hr.j;
import hr.k;
import hr.l;
import hr.m;
import hr.p;
import hr.v;
import hr.w;
import hr.y;
import java.io.EOFException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import ts.d0;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f implements k {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final p f98470u = new p() { // from class: or.d
        @Override // hr.p
        public final k[] d() {
            return f.b();
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final zr.h.a f98471v = new zr.h.a() { // from class: or.e
        @Override // zr.h.a
        public final boolean a(int i11, int i12, int i13, int i14, int i15) {
            return f.c(i11, i12, i13, i14, i15);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f98472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f98473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f98474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t.a f98475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v f98476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f98477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b0 f98478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private m f98479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b0 f98480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b0 f98481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f98482k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ur.a f98483l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f98484m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f98485n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f98486o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f98487p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private g f98488q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f98489r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f98490s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f98491t;

    public f() {
        this(0);
    }

    public static /* synthetic */ k[] b() {
        return new k[]{new f()};
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
        ts.a.i(this.f98480i);
        p0.j(this.f98479h);
    }

    private g f(l lVar) {
        long jL;
        long jF;
        g gVarP = p(lVar);
        c cVarO = o(this.f98483l, lVar.getPosition());
        if (this.f98489r) {
            return new g.a();
        }
        if ((this.f98472a & 4) != 0) {
            if (cVarO != null) {
                jL = cVarO.g();
                jF = cVarO.f();
            } else if (gVarP != null) {
                jL = gVarP.g();
                jF = gVarP.f();
            } else {
                jL = l(this.f98483l);
                jF = -1;
            }
            gVarP = new b(jL, lVar.getPosition(), jF);
        } else if (cVarO != null) {
            gVarP = cVarO;
        } else if (gVarP == null) {
            gVarP = null;
        }
        if (gVarP == null || !(gVarP.d() || (this.f98472a & 1) == 0)) {
            return k(lVar, (this.f98472a & 2) != 0);
        }
        return gVarP;
    }

    private long g(long j11) {
        return this.f98484m + ((j11 * 1000000) / ((long) this.f98475d.f60910d));
    }

    private g k(l lVar, boolean z11) {
        lVar.e(this.f98474c.e(), 0, 4);
        this.f98474c.U(0);
        this.f98475d.a(this.f98474c.q());
        return new a(lVar.getLength(), lVar.getPosition(), this.f98475d, z11);
    }

    private static long l(ur.a aVar) {
        if (aVar == null) {
            return -9223372036854775807L;
        }
        int iE = aVar.e();
        for (int i11 = 0; i11 < iE; i11++) {
            ur.a.b bVarD = aVar.d(i11);
            if (bVarD instanceof zr.m) {
                zr.m mVar = (zr.m) bVarD;
                if (mVar.f128527a.equals("TLEN")) {
                    return p0.D0(Long.parseLong(mVar.f128540d.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    private static int m(d0 d0Var, int i11) {
        if (d0Var.g() >= i11 + 4) {
            d0Var.U(i11);
            int iQ = d0Var.q();
            if (iQ == 1483304551 || iQ == 1231971951) {
                return iQ;
            }
        }
        if (d0Var.g() < 40) {
            return 0;
        }
        d0Var.U(36);
        return d0Var.q() == 1447187017 ? 1447187017 : 0;
    }

    private static boolean n(int i11, long j11) {
        return ((long) (i11 & (-128000))) == (j11 & (-128000));
    }

    private static c o(ur.a aVar, long j11) {
        if (aVar == null) {
            return null;
        }
        int iE = aVar.e();
        for (int i11 = 0; i11 < iE; i11++) {
            ur.a.b bVarD = aVar.d(i11);
            if (bVarD instanceof zr.k) {
                return c.a(j11, (zr.k) bVarD, l(aVar));
            }
        }
        return null;
    }

    private g p(l lVar) {
        d0 d0Var = new d0(this.f98475d.f60909c);
        lVar.e(d0Var.e(), 0, this.f98475d.f60909c);
        t.a aVar = this.f98475d;
        int i11 = 21;
        if ((aVar.f60907a & 1) != 0) {
            if (aVar.f60911e != 1) {
                i11 = 36;
            }
        } else if (aVar.f60911e == 1) {
            i11 = 13;
        }
        int i12 = i11;
        int iM = m(d0Var, i12);
        if (iM != 1483304551 && iM != 1231971951) {
            if (iM != 1447187017) {
                lVar.g();
                return null;
            }
            h hVarA = h.a(lVar.getLength(), lVar.getPosition(), this.f98475d, d0Var);
            lVar.k(this.f98475d.f60909c);
            return hVarA;
        }
        i iVarA = i.a(lVar.getLength(), lVar.getPosition(), this.f98475d, d0Var);
        if (iVarA != null && !this.f98476e.a()) {
            lVar.g();
            lVar.i(i12 + 141);
            lVar.e(this.f98474c.e(), 0, 3);
            this.f98474c.U(0);
            this.f98476e.d(this.f98474c.K());
        }
        lVar.k(this.f98475d.f60909c);
        return (iVarA == null || iVarA.d() || iM != 1231971951) ? iVarA : k(lVar, false);
    }

    private boolean q(l lVar) {
        g gVar = this.f98488q;
        if (gVar != null) {
            long jF = gVar.f();
            if (jF != -1 && lVar.h() > jF - 4) {
                return true;
            }
        }
        try {
            return !lVar.f(this.f98474c.e(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    private int r(l lVar) throws Throwable {
        if (this.f98482k == 0) {
            try {
                t(lVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f98488q == null) {
            g gVarF = f(lVar);
            this.f98488q = gVarF;
            this.f98479h.p(gVarF);
            this.f98481j.b(new u0.b().g0(this.f98475d.f60908b).Y(4096).J(this.f98475d.f60911e).h0(this.f98475d.f60910d).P(this.f98476e.f73396a).Q(this.f98476e.f73397b).Z((this.f98472a & 8) != 0 ? null : this.f98483l).G());
            this.f98486o = lVar.getPosition();
        } else if (this.f98486o != 0) {
            long position = lVar.getPosition();
            long j11 = this.f98486o;
            if (position < j11) {
                lVar.k((int) (j11 - position));
            }
        }
        return s(lVar);
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    private int s(l lVar) {
        if (this.f98487p == 0) {
            lVar.g();
            if (q(lVar)) {
                return -1;
            }
            this.f98474c.U(0);
            int iQ = this.f98474c.q();
            if (!n(iQ, this.f98482k) || t.j(iQ) == -1) {
                lVar.k(1);
                this.f98482k = 0;
                return 0;
            }
            this.f98475d.a(iQ);
            if (this.f98484m == -9223372036854775807L) {
                this.f98484m = this.f98488q.b(lVar.getPosition());
                if (this.f98473b != -9223372036854775807L) {
                    this.f98484m += this.f98473b - this.f98488q.b(0L);
                }
            }
            t.a aVar = this.f98475d;
            this.f98487p = aVar.f60909c;
            g gVar = this.f98488q;
            if (gVar instanceof b) {
                b bVar = (b) gVar;
                bVar.e(g(this.f98485n + ((long) aVar.f60913g)), lVar.getPosition() + ((long) this.f98475d.f60909c));
                if (this.f98490s && bVar.a(this.f98491t)) {
                    this.f98490s = false;
                    this.f98481j = this.f98480i;
                }
            }
        }
        int iA = this.f98481j.a(lVar, this.f98487p, true);
        if (iA == -1) {
            return -1;
        }
        int i11 = this.f98487p - iA;
        this.f98487p = i11;
        if (i11 > 0) {
            return 0;
        }
        this.f98481j.e(g(this.f98485n), 1, this.f98475d.f60909c, 0, null);
        this.f98485n += (long) this.f98475d.f60913g;
        this.f98487p = 0;
        return 0;
    }

    private boolean t(l lVar, boolean z11) throws Throwable {
        int iH;
        int i11;
        int iJ;
        int i12 = z11 ? 32768 : 131072;
        lVar.g();
        if (lVar.getPosition() == 0) {
            ur.a aVarA = this.f98477f.a(lVar, (this.f98472a & 8) == 0 ? null : f98471v);
            this.f98483l = aVarA;
            if (aVarA != null) {
                this.f98476e.c(aVarA);
            }
            iH = (int) lVar.h();
            if (!z11) {
                lVar.k(iH);
            }
            i11 = 0;
        } else {
            iH = 0;
            i11 = 0;
        }
        int i13 = i11;
        int i14 = i13;
        while (true) {
            if (q(lVar)) {
                if (i13 > 0) {
                    break;
                }
                throw new EOFException();
            }
            this.f98474c.U(0);
            int iQ = this.f98474c.q();
            if ((i11 == 0 || n(iQ, i11)) && (iJ = t.j(iQ)) != -1) {
                i13++;
                if (i13 != 1) {
                    if (i13 == 4) {
                        break;
                    }
                } else {
                    this.f98475d.a(iQ);
                    i11 = iQ;
                }
                lVar.i(iJ - 4);
            } else {
                int i15 = i14 + 1;
                if (i14 == i12) {
                    if (z11) {
                        return false;
                    }
                    throw ParserException.a("Searched too many bytes.", null);
                }
                if (z11) {
                    lVar.g();
                    lVar.i(iH + i15);
                } else {
                    lVar.k(1);
                }
                i13 = 0;
                i14 = i15;
                i11 = 0;
            }
        }
        if (z11) {
            lVar.k(iH + i14);
        } else {
            lVar.g();
        }
        this.f98482k = i11;
        return true;
    }

    @Override // hr.k
    public void a(long j11, long j12) {
        this.f98482k = 0;
        this.f98484m = -9223372036854775807L;
        this.f98485n = 0L;
        this.f98487p = 0;
        this.f98491t = j12;
        g gVar = this.f98488q;
        if (!(gVar instanceof b) || ((b) gVar).a(j12)) {
            return;
        }
        this.f98490s = true;
        this.f98481j = this.f98478g;
    }

    @Override // hr.k
    public void e(m mVar) {
        this.f98479h = mVar;
        b0 b0VarB = mVar.b(0, 1);
        this.f98480i = b0VarB;
        this.f98481j = b0VarB;
        this.f98479h.j();
    }

    @Override // hr.k
    public boolean h(l lVar) {
        return t(lVar, true);
    }

    @Override // hr.k
    public int i(l lVar, y yVar) throws Throwable {
        d();
        int iR = r(lVar);
        if (iR == -1 && (this.f98488q instanceof b)) {
            long jG = g(this.f98485n);
            if (this.f98488q.g() != jG) {
                ((b) this.f98488q).h(jG);
                this.f98479h.p(this.f98488q);
            }
        }
        return iR;
    }

    public void j() {
        this.f98489r = true;
    }

    public f(int i11) {
        this(i11, -9223372036854775807L);
    }

    public f(int i11, long j11) {
        this.f98472a = (i11 & 2) != 0 ? i11 | 1 : i11;
        this.f98473b = j11;
        this.f98474c = new d0(10);
        this.f98475d = new t.a();
        this.f98476e = new v();
        this.f98484m = -9223372036854775807L;
        this.f98477f = new w();
        j jVar = new j();
        this.f98478g = jVar;
        this.f98481j = jVar;
    }

    @Override // hr.k
    public void release() {
    }
}
