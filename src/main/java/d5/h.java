package d5;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class h extends e {
    protected float V0 = -1.0f;
    protected int W0 = -1;
    protected int X0 = -1;
    protected boolean Y0 = true;
    private d Z0 = this.R;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private int f59541a1 = 0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private int f59542b1 = 0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private boolean f59543c1;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f59544a;

        static {
            int[] iArr = new int[d.a.values().length];
            f59544a = iArr;
            try {
                iArr[d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59544a[d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59544a[d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59544a[d.a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f59544a[d.a.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f59544a[d.a.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f59544a[d.a.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f59544a[d.a.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f59544a[d.a.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public h() {
        this.Z.clear();
        this.Z.add(this.Z0);
        int length = this.Y.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.Y[i11] = this.Z0;
        }
    }

    public float A1() {
        return this.V0;
    }

    public void B1(int i11) {
        this.Z0.t(i11);
        this.f59543c1 = true;
    }

    public void C1(int i11) {
        if (i11 > -1) {
            this.V0 = -1.0f;
            this.W0 = i11;
            this.X0 = -1;
        }
    }

    public void D1(int i11) {
        if (i11 > -1) {
            this.V0 = -1.0f;
            this.W0 = -1;
            this.X0 = i11;
        }
    }

    public void E1(float f11) {
        if (f11 > -1.0f) {
            this.V0 = f11;
            this.W0 = -1;
            this.X0 = -1;
        }
    }

    public void F1(int i11) {
        if (this.f59541a1 == i11) {
            return;
        }
        this.f59541a1 = i11;
        this.Z.clear();
        if (this.f59541a1 == 1) {
            this.Z0 = this.Q;
        } else {
            this.Z0 = this.R;
        }
        this.Z.add(this.Z0);
        int length = this.Y.length;
        for (int i12 = 0; i12 < length; i12++) {
            this.Y[i12] = this.Z0;
        }
    }

    @Override // d5.e
    public void g(a5.d dVar, boolean z11) {
        f fVar = (f) M();
        if (fVar == null) {
            return;
        }
        d dVarQ = fVar.q(d.a.LEFT);
        d dVarQ2 = fVar.q(d.a.RIGHT);
        e eVar = this.f59433c0;
        boolean z12 = eVar != null && eVar.f59431b0[0] == e.b.WRAP_CONTENT;
        if (this.f59541a1 == 0) {
            dVarQ = fVar.q(d.a.TOP);
            dVarQ2 = fVar.q(d.a.BOTTOM);
            e eVar2 = this.f59433c0;
            z12 = eVar2 != null && eVar2.f59431b0[1] == e.b.WRAP_CONTENT;
        }
        if (this.f59543c1 && this.Z0.n()) {
            a5.i iVarQ = dVar.q(this.Z0);
            dVar.f(iVarQ, this.Z0.e());
            if (this.W0 != -1) {
                if (z12) {
                    dVar.h(dVar.q(dVarQ2), iVarQ, 0, 5);
                }
            } else if (this.X0 != -1 && z12) {
                a5.i iVarQ2 = dVar.q(dVarQ2);
                dVar.h(iVarQ, dVar.q(dVarQ), 0, 5);
                dVar.h(iVarQ2, iVarQ, 0, 5);
            }
            this.f59543c1 = false;
            return;
        }
        if (this.W0 != -1) {
            a5.i iVarQ3 = dVar.q(this.Z0);
            dVar.e(iVarQ3, dVar.q(dVarQ), this.W0, 8);
            if (z12) {
                dVar.h(dVar.q(dVarQ2), iVarQ3, 0, 5);
                return;
            }
            return;
        }
        if (this.X0 == -1) {
            if (this.V0 != -1.0f) {
                dVar.d(a5.d.s(dVar, dVar.q(this.Z0), dVar.q(dVarQ2), this.V0));
                return;
            }
            return;
        }
        a5.i iVarQ4 = dVar.q(this.Z0);
        a5.i iVarQ5 = dVar.q(dVarQ2);
        dVar.e(iVarQ4, iVarQ5, -this.X0, 8);
        if (z12) {
            dVar.h(iVarQ4, dVar.q(dVarQ), 0, 5);
            dVar.h(iVarQ5, iVarQ4, 0, 5);
        }
    }

    @Override // d5.e
    public boolean h() {
        return true;
    }

    @Override // d5.e
    public void n(e eVar, HashMap<e, e> map) {
        super.n(eVar, map);
        h hVar = (h) eVar;
        this.V0 = hVar.V0;
        this.W0 = hVar.W0;
        this.X0 = hVar.X0;
        this.Y0 = hVar.Y0;
        F1(hVar.f59541a1);
    }

    @Override // d5.e
    public boolean p0() {
        return this.f59543c1;
    }

    @Override // d5.e
    public d q(d.a aVar) {
        int i11 = a.f59544a[aVar.ordinal()];
        if (i11 == 1 || i11 == 2) {
            if (this.f59541a1 == 1) {
                return this.Z0;
            }
            return null;
        }
        if ((i11 == 3 || i11 == 4) && this.f59541a1 == 0) {
            return this.Z0;
        }
        return null;
    }

    @Override // d5.e
    public boolean q0() {
        return this.f59543c1;
    }

    @Override // d5.e
    public void v1(a5.d dVar, boolean z11) {
        if (M() == null) {
            return;
        }
        int iY = dVar.y(this.Z0);
        if (this.f59541a1 == 1) {
            r1(iY);
            s1(0);
            Q0(M().z());
            p1(0);
            return;
        }
        r1(0);
        s1(iY);
        p1(M().Y());
        Q0(0);
    }

    public d w1() {
        return this.Z0;
    }

    public int x1() {
        return this.f59541a1;
    }

    public int y1() {
        return this.W0;
    }

    public int z1() {
        return this.X0;
    }
}
