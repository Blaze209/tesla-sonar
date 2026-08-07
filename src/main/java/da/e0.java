package da;

import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f59974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s7.c0 f59975b = new s7.c0(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f59976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f59977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f59978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f59979f;

    public e0(d0 d0Var) {
        this.f59974a = d0Var;
    }

    @Override // da.l0
    public void a() {
        this.f59979f = true;
    }

    @Override // da.l0
    public void b(s7.c0 c0Var, int i11) {
        int iG;
        boolean z11 = (i11 & 1) != 0;
        if (z11) {
            iG = c0Var.g() + c0Var.M();
        } else {
            iG = -1;
        }
        if (this.f59979f) {
            if (!z11) {
                return;
            }
            this.f59979f = false;
            c0Var.b0(iG);
            this.f59977d = 0;
        }
        while (c0Var.a() > 0) {
            int i12 = this.f59977d;
            if (i12 < 3) {
                if (i12 == 0) {
                    int iM = c0Var.M();
                    c0Var.b0(c0Var.g() - 1);
                    if (iM == 255) {
                        this.f59979f = true;
                        return;
                    }
                }
                int iMin = Math.min(c0Var.a(), 3 - this.f59977d);
                c0Var.q(this.f59975b.f(), this.f59977d, iMin);
                int i13 = this.f59977d + iMin;
                this.f59977d = i13;
                if (i13 == 3) {
                    this.f59975b.b0(0);
                    this.f59975b.a0(3);
                    this.f59975b.c0(1);
                    int iM2 = this.f59975b.M();
                    int iM3 = this.f59975b.M();
                    this.f59978e = (iM2 & 128) != 0;
                    this.f59976c = (((iM2 & 15) << 8) | iM3) + 3;
                    int iB = this.f59975b.b();
                    int i14 = this.f59976c;
                    if (iB < i14) {
                        this.f59975b.d(Math.min(4098, Math.max(i14, this.f59975b.b() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(c0Var.a(), this.f59976c - this.f59977d);
                c0Var.q(this.f59975b.f(), this.f59977d, iMin2);
                int i15 = this.f59977d + iMin2;
                this.f59977d = i15;
                int i16 = this.f59976c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (!this.f59978e) {
                        this.f59975b.a0(i16);
                    } else {
                        if (q0.z(this.f59975b.f(), 0, this.f59976c, -1) != 0) {
                            this.f59979f = true;
                            return;
                        }
                        this.f59975b.a0(this.f59976c - 4);
                    }
                    this.f59975b.b0(0);
                    this.f59974a.b(this.f59975b);
                    this.f59977d = 0;
                }
            }
        }
    }

    @Override // da.l0
    public void c(s7.i0 i0Var, w8.r rVar, l0.d dVar) {
        this.f59974a.c(i0Var, rVar, dVar);
        this.f59979f = true;
    }
}
