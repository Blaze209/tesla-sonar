package rr;

import ts.m0;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class c0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f108741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ts.d0 f108742b = new ts.d0(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f108743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f108744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f108745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f108746f;

    public c0(b0 b0Var) {
        this.f108741a = b0Var;
    }

    @Override // rr.i0
    public void a() {
        this.f108746f = true;
    }

    @Override // rr.i0
    public void b(ts.d0 d0Var, int i11) {
        int iF;
        boolean z11 = (i11 & 1) != 0;
        if (z11) {
            iF = d0Var.f() + d0Var.H();
        } else {
            iF = -1;
        }
        if (this.f108746f) {
            if (!z11) {
                return;
            }
            this.f108746f = false;
            d0Var.U(iF);
            this.f108744d = 0;
        }
        while (d0Var.a() > 0) {
            int i12 = this.f108744d;
            if (i12 < 3) {
                if (i12 == 0) {
                    int iH = d0Var.H();
                    d0Var.U(d0Var.f() - 1);
                    if (iH == 255) {
                        this.f108746f = true;
                        return;
                    }
                }
                int iMin = Math.min(d0Var.a(), 3 - this.f108744d);
                d0Var.l(this.f108742b.e(), this.f108744d, iMin);
                int i13 = this.f108744d + iMin;
                this.f108744d = i13;
                if (i13 == 3) {
                    this.f108742b.U(0);
                    this.f108742b.T(3);
                    this.f108742b.V(1);
                    int iH2 = this.f108742b.H();
                    int iH3 = this.f108742b.H();
                    this.f108745e = (iH2 & 128) != 0;
                    this.f108743c = (((iH2 & 15) << 8) | iH3) + 3;
                    int iB = this.f108742b.b();
                    int i14 = this.f108743c;
                    if (iB < i14) {
                        this.f108742b.c(Math.min(4098, Math.max(i14, this.f108742b.b() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(d0Var.a(), this.f108743c - this.f108744d);
                d0Var.l(this.f108742b.e(), this.f108744d, iMin2);
                int i15 = this.f108744d + iMin2;
                this.f108744d = i15;
                int i16 = this.f108743c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (!this.f108745e) {
                        this.f108742b.T(i16);
                    } else {
                        if (p0.s(this.f108742b.e(), 0, this.f108743c, -1) != 0) {
                            this.f108746f = true;
                            return;
                        }
                        this.f108742b.T(this.f108743c - 4);
                    }
                    this.f108742b.U(0);
                    this.f108741a.b(this.f108742b);
                    this.f108744d = 0;
                }
            }
        }
    }

    @Override // rr.i0
    public void c(m0 m0Var, hr.m mVar, i0.d dVar) {
        this.f108741a.c(m0Var, mVar, dVar);
        this.f108746f = true;
    }
}
