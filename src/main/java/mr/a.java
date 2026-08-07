package mr;

import com.google.android.exoplayer2.u0;
import com.reactnativecommunity.clipboard.ClipboardModule;
import hr.k;
import hr.l;
import hr.m;
import hr.y;
import hr.z;
import ts.d0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m f92479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f92480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f92481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f92482e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private as.b f92484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l f92485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c f92486i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private pr.k f92487j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f92478a = new d0(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f92483f = -1;

    private void b(l lVar) {
        this.f92478a.Q(2);
        lVar.e(this.f92478a.e(), 0, 2);
        lVar.i(this.f92478a.N() - 2);
    }

    private void c() {
        f(new ur.a.b[0]);
        ((m) ts.a.e(this.f92479b)).j();
        this.f92479b.p(new z.b(-9223372036854775807L));
        this.f92480c = 6;
    }

    private static as.b d(String str, long j11) {
        b bVarA;
        if (j11 == -1 || (bVarA = e.a(str)) == null) {
            return null;
        }
        return bVarA.a(j11);
    }

    private void f(ur.a.b... bVarArr) {
        ((m) ts.a.e(this.f92479b)).b(1024, 4).b(new u0.b().M(ClipboardModule.MIMETYPE_JPEG).Z(new ur.a(bVarArr)).G());
    }

    private int g(l lVar) {
        this.f92478a.Q(2);
        lVar.e(this.f92478a.e(), 0, 2);
        return this.f92478a.N();
    }

    private void j(l lVar) {
        this.f92478a.Q(2);
        lVar.readFully(this.f92478a.e(), 0, 2);
        int iN = this.f92478a.N();
        this.f92481d = iN;
        if (iN == 65498) {
            if (this.f92483f != -1) {
                this.f92480c = 4;
                return;
            } else {
                c();
                return;
            }
        }
        if ((iN < 65488 || iN > 65497) && iN != 65281) {
            this.f92480c = 1;
        }
    }

    private void k(l lVar) {
        String strB;
        if (this.f92481d == 65505) {
            d0 d0Var = new d0(this.f92482e);
            lVar.readFully(d0Var.e(), 0, this.f92482e);
            if (this.f92484g == null && "http://ns.adobe.com/xap/1.0/".equals(d0Var.B()) && (strB = d0Var.B()) != null) {
                as.b bVarD = d(strB, lVar.getLength());
                this.f92484g = bVarD;
                if (bVarD != null) {
                    this.f92483f = bVarD.f14963d;
                }
            }
        } else {
            lVar.k(this.f92482e);
        }
        this.f92480c = 0;
    }

    private void l(l lVar) {
        this.f92478a.Q(2);
        lVar.readFully(this.f92478a.e(), 0, 2);
        this.f92482e = this.f92478a.N() - 2;
        this.f92480c = 2;
    }

    private void m(l lVar) {
        if (!lVar.f(this.f92478a.e(), 0, 1, true)) {
            c();
            return;
        }
        lVar.g();
        if (this.f92487j == null) {
            this.f92487j = new pr.k();
        }
        c cVar = new c(lVar, this.f92483f);
        this.f92486i = cVar;
        if (!this.f92487j.h(cVar)) {
            c();
        } else {
            this.f92487j.e(new d(this.f92483f, (m) ts.a.e(this.f92479b)));
            n();
        }
    }

    private void n() {
        f((ur.a.b) ts.a.e(this.f92484g));
        this.f92480c = 5;
    }

    @Override // hr.k
    public void a(long j11, long j12) {
        if (j11 == 0) {
            this.f92480c = 0;
            this.f92487j = null;
        } else if (this.f92480c == 5) {
            ((pr.k) ts.a.e(this.f92487j)).a(j11, j12);
        }
    }

    @Override // hr.k
    public void e(m mVar) {
        this.f92479b = mVar;
    }

    @Override // hr.k
    public boolean h(l lVar) {
        if (g(lVar) != 65496) {
            return false;
        }
        int iG = g(lVar);
        this.f92481d = iG;
        if (iG == 65504) {
            b(lVar);
            this.f92481d = g(lVar);
        }
        if (this.f92481d != 65505) {
            return false;
        }
        lVar.i(2);
        this.f92478a.Q(6);
        lVar.e(this.f92478a.e(), 0, 6);
        return this.f92478a.J() == 1165519206 && this.f92478a.N() == 0;
    }

    @Override // hr.k
    public int i(l lVar, y yVar) {
        int i11 = this.f92480c;
        if (i11 == 0) {
            j(lVar);
            return 0;
        }
        if (i11 == 1) {
            l(lVar);
            return 0;
        }
        if (i11 == 2) {
            k(lVar);
            return 0;
        }
        if (i11 == 4) {
            long position = lVar.getPosition();
            long j11 = this.f92483f;
            if (position != j11) {
                yVar.f73403a = j11;
                return 1;
            }
            m(lVar);
            return 0;
        }
        if (i11 != 5) {
            if (i11 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f92486i == null || lVar != this.f92485h) {
            this.f92485h = lVar;
            this.f92486i = new c(lVar, this.f92483f);
        }
        int i12 = ((pr.k) ts.a.e(this.f92487j)).i(this.f92486i, yVar);
        if (i12 == 1) {
            yVar.f73403a += this.f92483f;
        }
        return i12;
    }

    @Override // hr.k
    public void release() {
        pr.k kVar = this.f92487j;
        if (kVar != null) {
            kVar.release();
        }
    }
}
