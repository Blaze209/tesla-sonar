package kr;

import com.google.android.exoplayer2.ParserException;
import hr.b0;
import hr.k;
import hr.l;
import hr.m;
import hr.p;
import hr.q;
import hr.r;
import hr.s;
import hr.t;
import hr.y;
import hr.z;
import ts.d0;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class d implements k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p f89336o = new p() { // from class: kr.c
        @Override // hr.p
        public final k[] d() {
            return d.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f89337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f89338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f89339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q.a f89340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private m f89341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b0 f89342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f89343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ur.a f89344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private t f89345i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f89346j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f89347k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f89348l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f89349m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f89350n;

    public d() {
        this(0);
    }

    public static /* synthetic */ k[] b() {
        return new k[]{new d()};
    }

    private long c(d0 d0Var, boolean z11) {
        boolean zD;
        ts.a.e(this.f89345i);
        int iF = d0Var.f();
        while (iF <= d0Var.g() - 16) {
            d0Var.U(iF);
            if (q.d(d0Var, this.f89345i, this.f89347k, this.f89340d)) {
                d0Var.U(iF);
                return this.f89340d.f73376a;
            }
            iF++;
        }
        if (!z11) {
            d0Var.U(iF);
            return -1L;
        }
        while (iF <= d0Var.g() - this.f89346j) {
            d0Var.U(iF);
            try {
                zD = q.d(d0Var, this.f89345i, this.f89347k, this.f89340d);
            } catch (IndexOutOfBoundsException unused) {
                zD = false;
            }
            if (d0Var.f() <= d0Var.g() ? zD : false) {
                d0Var.U(iF);
                return this.f89340d.f73376a;
            }
            iF++;
        }
        d0Var.U(d0Var.g());
        return -1L;
    }

    private void d(l lVar) {
        this.f89347k = r.b(lVar);
        ((m) p0.j(this.f89341e)).p(f(lVar.getPosition(), lVar.getLength()));
        this.f89343g = 5;
    }

    private z f(long j11, long j12) {
        ts.a.e(this.f89345i);
        t tVar = this.f89345i;
        if (tVar.f73390k != null) {
            return new s(tVar, j11);
        }
        if (j12 == -1 || tVar.f73389j <= 0) {
            return new z.b(tVar.f());
        }
        b bVar = new b(tVar, this.f89347k, j11, j12);
        this.f89348l = bVar;
        return bVar.b();
    }

    private void g(l lVar) {
        byte[] bArr = this.f89337a;
        lVar.e(bArr, 0, bArr.length);
        lVar.g();
        this.f89343g = 2;
    }

    private void j() {
        ((b0) p0.j(this.f89342f)).e((this.f89350n * 1000000) / ((long) ((t) p0.j(this.f89345i)).f73384e), 1, this.f89349m, 0, null);
    }

    private int k(l lVar, y yVar) {
        boolean z11;
        ts.a.e(this.f89342f);
        ts.a.e(this.f89345i);
        b bVar = this.f89348l;
        if (bVar != null && bVar.d()) {
            return this.f89348l.c(lVar, yVar);
        }
        if (this.f89350n == -1) {
            this.f89350n = q.i(lVar, this.f89345i);
            return 0;
        }
        int iG = this.f89338b.g();
        if (iG < 32768) {
            int i11 = lVar.read(this.f89338b.e(), iG, 32768 - iG);
            z11 = i11 == -1;
            if (!z11) {
                this.f89338b.T(iG + i11);
            } else if (this.f89338b.a() == 0) {
                j();
                return -1;
            }
        } else {
            z11 = false;
        }
        int iF = this.f89338b.f();
        int i12 = this.f89349m;
        int i13 = this.f89346j;
        if (i12 < i13) {
            d0 d0Var = this.f89338b;
            d0Var.V(Math.min(i13 - i12, d0Var.a()));
        }
        long jC = c(this.f89338b, z11);
        int iF2 = this.f89338b.f() - iF;
        this.f89338b.U(iF);
        this.f89342f.d(this.f89338b, iF2);
        this.f89349m += iF2;
        if (jC != -1) {
            j();
            this.f89349m = 0;
            this.f89350n = jC;
        }
        if (this.f89338b.a() < 16) {
            int iA = this.f89338b.a();
            System.arraycopy(this.f89338b.e(), this.f89338b.f(), this.f89338b.e(), 0, iA);
            this.f89338b.U(0);
            this.f89338b.T(iA);
        }
        return 0;
    }

    private void l(l lVar) {
        this.f89344h = r.d(lVar, !this.f89339c);
        this.f89343g = 1;
    }

    private void m(l lVar) {
        r.a aVar = new r.a(this.f89345i);
        boolean zE = false;
        while (!zE) {
            zE = r.e(lVar, aVar);
            this.f89345i = (t) p0.j(aVar.f73377a);
        }
        ts.a.e(this.f89345i);
        this.f89346j = Math.max(this.f89345i.f73382c, 6);
        ((b0) p0.j(this.f89342f)).b(this.f89345i.g(this.f89337a, this.f89344h));
        this.f89343g = 4;
    }

    private void n(l lVar) throws ParserException {
        r.i(lVar);
        this.f89343g = 3;
    }

    @Override // hr.k
    public void a(long j11, long j12) {
        if (j11 == 0) {
            this.f89343g = 0;
        } else {
            b bVar = this.f89348l;
            if (bVar != null) {
                bVar.h(j12);
            }
        }
        this.f89350n = j12 != 0 ? -1L : 0L;
        this.f89349m = 0;
        this.f89338b.Q(0);
    }

    @Override // hr.k
    public void e(m mVar) {
        this.f89341e = mVar;
        this.f89342f = mVar.b(0, 1);
        mVar.j();
    }

    @Override // hr.k
    public boolean h(l lVar) throws Throwable {
        r.c(lVar, false);
        return r.a(lVar);
    }

    @Override // hr.k
    public int i(l lVar, y yVar) throws ParserException {
        int i11 = this.f89343g;
        if (i11 == 0) {
            l(lVar);
            return 0;
        }
        if (i11 == 1) {
            g(lVar);
            return 0;
        }
        if (i11 == 2) {
            n(lVar);
            return 0;
        }
        if (i11 == 3) {
            m(lVar);
            return 0;
        }
        if (i11 == 4) {
            d(lVar);
            return 0;
        }
        if (i11 == 5) {
            return k(lVar, yVar);
        }
        throw new IllegalStateException();
    }

    public d(int i11) {
        this.f89337a = new byte[42];
        this.f89338b = new d0(new byte[32768], 0);
        this.f89339c = (i11 & 1) != 0;
        this.f89340d = new q.a();
        this.f89343g = 0;
    }

    @Override // hr.k
    public void release() {
    }
}
