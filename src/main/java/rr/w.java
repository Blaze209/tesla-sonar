package rr;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import ts.m0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class w implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f109045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ts.c0 f109046b = new ts.c0(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f109047c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f109048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private m0 f109049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f109050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f109051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f109052h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f109053i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f109054j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f109055k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f109056l;

    public w(m mVar) {
        this.f109045a = mVar;
    }

    private boolean d(ts.d0 d0Var, byte[] bArr, int i11) {
        int iMin = Math.min(d0Var.a(), i11 - this.f109048d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            d0Var.V(iMin);
        } else {
            d0Var.l(bArr, this.f109048d, iMin);
        }
        int i12 = this.f109048d + iMin;
        this.f109048d = i12;
        return i12 == i11;
    }

    private boolean e() {
        this.f109046b.p(0);
        int iH = this.f109046b.h(24);
        if (iH != 1) {
            ts.u.i("PesReader", "Unexpected start code prefix: " + iH);
            this.f109054j = -1;
            return false;
        }
        this.f109046b.r(8);
        int iH2 = this.f109046b.h(16);
        this.f109046b.r(5);
        this.f109055k = this.f109046b.g();
        this.f109046b.r(2);
        this.f109050f = this.f109046b.g();
        this.f109051g = this.f109046b.g();
        this.f109046b.r(6);
        int iH3 = this.f109046b.h(8);
        this.f109053i = iH3;
        if (iH2 == 0) {
            this.f109054j = -1;
        } else {
            int i11 = (iH2 - 3) - iH3;
            this.f109054j = i11;
            if (i11 < 0) {
                ts.u.i("PesReader", "Found negative packet payload size: " + this.f109054j);
                this.f109054j = -1;
            }
        }
        return true;
    }

    @RequiresNonNull({"timestampAdjuster"})
    private void f() {
        this.f109046b.p(0);
        this.f109056l = -9223372036854775807L;
        if (this.f109050f) {
            this.f109046b.r(4);
            long jH = ((long) this.f109046b.h(3)) << 30;
            this.f109046b.r(1);
            long jH2 = jH | ((long) (this.f109046b.h(15) << 15));
            this.f109046b.r(1);
            long jH3 = jH2 | ((long) this.f109046b.h(15));
            this.f109046b.r(1);
            if (!this.f109052h && this.f109051g) {
                this.f109046b.r(4);
                long jH4 = ((long) this.f109046b.h(3)) << 30;
                this.f109046b.r(1);
                long jH5 = jH4 | ((long) (this.f109046b.h(15) << 15));
                this.f109046b.r(1);
                long jH6 = jH5 | ((long) this.f109046b.h(15));
                this.f109046b.r(1);
                this.f109049e.b(jH6);
                this.f109052h = true;
            }
            this.f109056l = this.f109049e.b(jH3);
        }
    }

    private void g(int i11) {
        this.f109047c = i11;
        this.f109048d = 0;
    }

    @Override // rr.i0
    public final void a() {
        this.f109047c = 0;
        this.f109048d = 0;
        this.f109052h = false;
        this.f109045a.a();
    }

    @Override // rr.i0
    public final void b(ts.d0 d0Var, int i11) {
        ts.a.i(this.f109049e);
        if ((i11 & 1) != 0) {
            int i12 = this.f109047c;
            if (i12 != 0 && i12 != 1) {
                if (i12 == 2) {
                    ts.u.i("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i12 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f109054j != -1) {
                        ts.u.i("PesReader", "Unexpected start indicator: expected " + this.f109054j + " more bytes");
                    }
                    this.f109045a.e();
                }
            }
            g(1);
        }
        while (d0Var.a() > 0) {
            int i13 = this.f109047c;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 == 2) {
                        if (d(d0Var, this.f109046b.f114975a, Math.min(10, this.f109053i)) && d(d0Var, null, this.f109053i)) {
                            f();
                            i11 |= this.f109055k ? 4 : 0;
                            this.f109045a.c(this.f109056l, i11);
                            g(3);
                        }
                    } else {
                        if (i13 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = d0Var.a();
                        int i14 = this.f109054j;
                        int i15 = i14 != -1 ? iA - i14 : 0;
                        if (i15 > 0) {
                            iA -= i15;
                            d0Var.T(d0Var.f() + iA);
                        }
                        this.f109045a.b(d0Var);
                        int i16 = this.f109054j;
                        if (i16 != -1) {
                            int i17 = i16 - iA;
                            this.f109054j = i17;
                            if (i17 == 0) {
                                this.f109045a.e();
                                g(1);
                            }
                        }
                    }
                } else if (d(d0Var, this.f109046b.f114975a, 9)) {
                    g(e() ? 2 : 0);
                }
            } else {
                d0Var.V(d0Var.a());
            }
        }
    }

    @Override // rr.i0
    public void c(m0 m0Var, hr.m mVar, i0.d dVar) {
        this.f109049e = m0Var;
        this.f109045a.d(mVar, dVar);
    }
}
