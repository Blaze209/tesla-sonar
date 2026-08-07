package da;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f60333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s7.b0 f60334b = new s7.b0(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f60335c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f60336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private s7.i0 f60337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f60338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f60339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f60340h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f60341i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f60342j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f60343k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f60344l;

    public y(m mVar) {
        this.f60333a = mVar;
    }

    private boolean e(s7.c0 c0Var, byte[] bArr, int i11) {
        int iMin = Math.min(c0Var.a(), i11 - this.f60336d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c0Var.c0(iMin);
        } else {
            c0Var.q(bArr, this.f60336d, iMin);
        }
        int i12 = this.f60336d + iMin;
        this.f60336d = i12;
        return i12 == i11;
    }

    private boolean f() {
        this.f60334b.p(0);
        int iH = this.f60334b.h(24);
        if (iH != 1) {
            s7.t.i("PesReader", "Unexpected start code prefix: " + iH);
            this.f60342j = -1;
            return false;
        }
        this.f60334b.r(8);
        int iH2 = this.f60334b.h(16);
        this.f60334b.r(5);
        this.f60343k = this.f60334b.g();
        this.f60334b.r(2);
        this.f60338f = this.f60334b.g();
        this.f60339g = this.f60334b.g();
        this.f60334b.r(6);
        int iH3 = this.f60334b.h(8);
        this.f60341i = iH3;
        if (iH2 == 0) {
            this.f60342j = -1;
        } else {
            int i11 = (iH2 - 3) - iH3;
            this.f60342j = i11;
            if (i11 < 0) {
                s7.t.i("PesReader", "Found negative packet payload size: " + this.f60342j);
                this.f60342j = -1;
            }
        }
        return true;
    }

    @RequiresNonNull({"timestampAdjuster"})
    private void g() {
        this.f60334b.p(0);
        this.f60344l = -9223372036854775807L;
        if (this.f60338f) {
            this.f60334b.r(4);
            long jH = ((long) this.f60334b.h(3)) << 30;
            this.f60334b.r(1);
            long jH2 = jH | ((long) (this.f60334b.h(15) << 15));
            this.f60334b.r(1);
            long jH3 = jH2 | ((long) this.f60334b.h(15));
            this.f60334b.r(1);
            if (!this.f60340h && this.f60339g) {
                this.f60334b.r(4);
                long jH4 = ((long) this.f60334b.h(3)) << 30;
                this.f60334b.r(1);
                long jH5 = jH4 | ((long) (this.f60334b.h(15) << 15));
                this.f60334b.r(1);
                long jH6 = jH5 | ((long) this.f60334b.h(15));
                this.f60334b.r(1);
                this.f60337e.b(jH6);
                this.f60340h = true;
            }
            this.f60344l = this.f60337e.b(jH3);
        }
    }

    private void h(int i11) {
        this.f60335c = i11;
        this.f60336d = 0;
    }

    @Override // da.l0
    public void a() {
        this.f60335c = 0;
        this.f60336d = 0;
        this.f60340h = false;
        this.f60333a.a();
    }

    @Override // da.l0
    public void b(s7.c0 c0Var, int i11) {
        s7.a.j(this.f60337e);
        if ((i11 & 1) != 0) {
            int i12 = this.f60335c;
            if (i12 != 0 && i12 != 1) {
                if (i12 == 2) {
                    s7.t.i("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i12 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f60342j != -1) {
                        s7.t.i("PesReader", "Unexpected start indicator: expected " + this.f60342j + " more bytes");
                    }
                    this.f60333a.e(c0Var.j() == 0);
                }
            }
            h(1);
        }
        while (c0Var.a() > 0) {
            int i13 = this.f60335c;
            if (i13 == 0) {
                c0Var.c0(c0Var.a());
            } else if (i13 != 1) {
                if (i13 == 2) {
                    if (e(c0Var, this.f60334b.f110390a, Math.min(10, this.f60341i)) && e(c0Var, null, this.f60341i)) {
                        g();
                        i11 |= this.f60343k ? 4 : 0;
                        this.f60333a.c(this.f60344l, i11);
                        h(3);
                    }
                } else {
                    if (i13 != 3) {
                        throw new IllegalStateException();
                    }
                    int iA = c0Var.a();
                    int i14 = this.f60342j;
                    int i15 = i14 == -1 ? 0 : iA - i14;
                    if (i15 > 0) {
                        iA -= i15;
                        c0Var.a0(c0Var.g() + iA);
                    }
                    this.f60333a.b(c0Var);
                    int i16 = this.f60342j;
                    if (i16 != -1) {
                        int i17 = i16 - iA;
                        this.f60342j = i17;
                        if (i17 == 0) {
                            this.f60333a.e(false);
                            h(1);
                        }
                    }
                }
            } else if (e(c0Var, this.f60334b.f110390a, 9)) {
                h(f() ? 2 : 0);
            }
        }
    }

    @Override // da.l0
    public void c(s7.i0 i0Var, w8.r rVar, l0.d dVar) {
        this.f60337e = i0Var;
        this.f60333a.d(rVar, dVar);
    }

    public boolean d(boolean z11) {
        return this.f60335c == 3 && this.f60342j == -1 && !(z11 && (this.f60333a instanceof n)) && (!z11 || f());
    }
}
