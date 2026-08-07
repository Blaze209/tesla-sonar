package rr;

import com.google.android.exoplayer2.u0;
import java.util.Arrays;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class i implements m {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final byte[] f108819v = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f108820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ts.c0 f108821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ts.d0 f108822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f108823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f108824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private hr.b0 f108825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private hr.b0 f108826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f108827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f108828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f108829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f108830k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f108831l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f108832m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f108833n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f108834o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f108835p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f108836q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f108837r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f108838s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private hr.b0 f108839t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f108840u;

    public i(boolean z11) {
        this(z11, null);
    }

    @EnsuresNonNull({"output", "currentOutput", "id3Output"})
    private void f() {
        ts.a.e(this.f108825f);
        p0.j(this.f108839t);
        p0.j(this.f108826g);
    }

    private void g(ts.d0 d0Var) {
        if (d0Var.a() == 0) {
            return;
        }
        this.f108821b.f114975a[0] = d0Var.e()[d0Var.f()];
        this.f108821b.p(2);
        int iH = this.f108821b.h(4);
        int i11 = this.f108833n;
        if (i11 != -1 && iH != i11) {
            q();
            return;
        }
        if (!this.f108831l) {
            this.f108831l = true;
            this.f108832m = this.f108834o;
            this.f108833n = iH;
        }
        t();
    }

    private boolean h(ts.d0 d0Var, int i11) {
        d0Var.U(i11 + 1);
        if (!w(d0Var, this.f108821b.f114975a, 1)) {
            return false;
        }
        this.f108821b.p(4);
        int iH = this.f108821b.h(1);
        int i12 = this.f108832m;
        if (i12 != -1 && iH != i12) {
            return false;
        }
        if (this.f108833n != -1) {
            if (!w(d0Var, this.f108821b.f114975a, 1)) {
                return true;
            }
            this.f108821b.p(2);
            if (this.f108821b.h(4) != this.f108833n) {
                return false;
            }
            d0Var.U(i11 + 2);
        }
        if (!w(d0Var, this.f108821b.f114975a, 4)) {
            return true;
        }
        this.f108821b.p(14);
        int iH2 = this.f108821b.h(13);
        if (iH2 < 7) {
            return false;
        }
        byte[] bArrE = d0Var.e();
        int iG = d0Var.g();
        int i13 = i11 + iH2;
        if (i13 >= iG) {
            return true;
        }
        byte b11 = bArrE[i13];
        if (b11 == -1) {
            int i14 = i13 + 1;
            if (i14 == iG) {
                return true;
            }
            return l((byte) -1, bArrE[i14]) && ((bArrE[i14] & 8) >> 3) == iH;
        }
        if (b11 != 73) {
            return false;
        }
        int i15 = i13 + 1;
        if (i15 == iG) {
            return true;
        }
        if (bArrE[i15] != 68) {
            return false;
        }
        int i16 = i13 + 2;
        return i16 == iG || bArrE[i16] == 51;
    }

    private boolean i(ts.d0 d0Var, byte[] bArr, int i11) {
        int iMin = Math.min(d0Var.a(), i11 - this.f108828i);
        d0Var.l(bArr, this.f108828i, iMin);
        int i12 = this.f108828i + iMin;
        this.f108828i = i12;
        return i12 == i11;
    }

    private void j(ts.d0 d0Var) {
        byte[] bArrE = d0Var.e();
        int iF = d0Var.f();
        int iG = d0Var.g();
        while (iF < iG) {
            int i11 = iF + 1;
            byte b11 = bArrE[iF];
            int i12 = b11 & 255;
            if (this.f108829j == 512 && l((byte) -1, (byte) i12) && (this.f108831l || h(d0Var, iF - 1))) {
                this.f108834o = (b11 & 8) >> 3;
                this.f108830k = (b11 & 1) == 0;
                if (this.f108831l) {
                    t();
                } else {
                    r();
                }
                d0Var.U(i11);
                return;
            }
            int i13 = this.f108829j;
            int i14 = i12 | i13;
            if (i14 == 329) {
                this.f108829j = 768;
            } else if (i14 == 511) {
                this.f108829j = 512;
            } else if (i14 == 836) {
                this.f108829j = 1024;
            } else if (i14 == 1075) {
                u();
                d0Var.U(i11);
                return;
            } else if (i13 != 256) {
                this.f108829j = 256;
            }
            iF = i11;
        }
        d0Var.U(iF);
    }

    private boolean l(byte b11, byte b12) {
        return m(((b11 & 255) << 8) | (b12 & 255));
    }

    public static boolean m(int i11) {
        return (i11 & 65526) == 65520;
    }

    @RequiresNonNull({"output"})
    private void n() {
        this.f108821b.p(0);
        if (this.f108835p) {
            this.f108821b.r(10);
        } else {
            int i11 = 2;
            int iH = this.f108821b.h(2) + 1;
            if (iH != 2) {
                ts.u.i("AdtsReader", "Detected audio object type: " + iH + ", but assuming AAC LC.");
            } else {
                i11 = iH;
            }
            this.f108821b.r(5);
            byte[] bArrA = dr.a.a(i11, this.f108833n, this.f108821b.h(3));
            dr.a.b bVarE = dr.a.e(bArrA);
            u0 u0VarG = new u0.b().U(this.f108824e).g0("audio/mp4a-latm").K(bVarE.f60847c).J(bVarE.f60846b).h0(bVarE.f60845a).V(Collections.singletonList(bArrA)).X(this.f108823d).G();
            this.f108836q = 1024000000 / ((long) u0VarG.f40726z);
            this.f108825f.b(u0VarG);
            this.f108835p = true;
        }
        this.f108821b.r(4);
        int iH2 = this.f108821b.h(13);
        int i12 = iH2 - 7;
        if (this.f108830k) {
            i12 = iH2 - 9;
        }
        v(this.f108825f, this.f108836q, 0, i12);
    }

    @RequiresNonNull({"id3Output"})
    private void o() {
        this.f108826g.d(this.f108822c, 10);
        this.f108822c.U(6);
        v(this.f108826g, 0L, 10, this.f108822c.G() + 10);
    }

    @RequiresNonNull({"currentOutput"})
    private void p(ts.d0 d0Var) {
        int iMin = Math.min(d0Var.a(), this.f108837r - this.f108828i);
        this.f108839t.d(d0Var, iMin);
        int i11 = this.f108828i + iMin;
        this.f108828i = i11;
        int i12 = this.f108837r;
        if (i11 == i12) {
            long j11 = this.f108838s;
            if (j11 != -9223372036854775807L) {
                this.f108839t.e(j11, 1, i12, 0, null);
                this.f108838s += this.f108840u;
            }
            s();
        }
    }

    private void q() {
        this.f108831l = false;
        s();
    }

    private void r() {
        this.f108827h = 1;
        this.f108828i = 0;
    }

    private void s() {
        this.f108827h = 0;
        this.f108828i = 0;
        this.f108829j = 256;
    }

    private void t() {
        this.f108827h = 3;
        this.f108828i = 0;
    }

    private void u() {
        this.f108827h = 2;
        this.f108828i = f108819v.length;
        this.f108837r = 0;
        this.f108822c.U(0);
    }

    private void v(hr.b0 b0Var, long j11, int i11, int i12) {
        this.f108827h = 4;
        this.f108828i = i11;
        this.f108839t = b0Var;
        this.f108840u = j11;
        this.f108837r = i12;
    }

    private boolean w(ts.d0 d0Var, byte[] bArr, int i11) {
        if (d0Var.a() < i11) {
            return false;
        }
        d0Var.l(bArr, 0, i11);
        return true;
    }

    @Override // rr.m
    public void a() {
        this.f108838s = -9223372036854775807L;
        q();
    }

    @Override // rr.m
    public void b(ts.d0 d0Var) {
        f();
        while (d0Var.a() > 0) {
            int i11 = this.f108827h;
            if (i11 == 0) {
                j(d0Var);
            } else if (i11 == 1) {
                g(d0Var);
            } else if (i11 != 2) {
                if (i11 == 3) {
                    if (i(d0Var, this.f108821b.f114975a, this.f108830k ? 7 : 5)) {
                        n();
                    }
                } else {
                    if (i11 != 4) {
                        throw new IllegalStateException();
                    }
                    p(d0Var);
                }
            } else if (i(d0Var, this.f108822c.e(), 10)) {
                o();
            }
        }
    }

    @Override // rr.m
    public void c(long j11, int i11) {
        if (j11 != -9223372036854775807L) {
            this.f108838s = j11;
        }
    }

    @Override // rr.m
    public void d(hr.m mVar, i0.d dVar) {
        dVar.a();
        this.f108824e = dVar.b();
        hr.b0 b0VarB = mVar.b(dVar.c(), 1);
        this.f108825f = b0VarB;
        this.f108839t = b0VarB;
        if (!this.f108820a) {
            this.f108826g = new hr.j();
            return;
        }
        dVar.a();
        hr.b0 b0VarB2 = mVar.b(dVar.c(), 5);
        this.f108826g = b0VarB2;
        b0VarB2.b(new u0.b().U(dVar.b()).g0("application/id3").G());
    }

    public long k() {
        return this.f108836q;
    }

    public i(boolean z11, String str) {
        this.f108821b = new ts.c0(new byte[7]);
        this.f108822c = new ts.d0(Arrays.copyOf(f108819v, 10));
        s();
        this.f108832m = -1;
        this.f108833n = -1;
        this.f108836q = -9223372036854775807L;
        this.f108838s = -9223372036854775807L;
        this.f108820a = z11;
        this.f108823d = str;
    }

    @Override // rr.m
    public void e() {
    }
}
