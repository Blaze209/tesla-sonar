package d5;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class a extends j {
    private int X0 = 0;
    private boolean Y0 = true;
    private int Z0 = 0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    boolean f59396a1 = false;

    public int A1() {
        return this.X0;
    }

    public int B1() {
        return this.Z0;
    }

    public int C1() {
        int i11 = this.X0;
        if (i11 == 0 || i11 == 1) {
            return 0;
        }
        return (i11 == 2 || i11 == 3) ? 1 : -1;
    }

    protected void D1() {
        for (int i11 = 0; i11 < this.W0; i11++) {
            e eVar = this.V0[i11];
            if (this.Y0 || eVar.h()) {
                int i12 = this.X0;
                if (i12 == 0 || i12 == 1) {
                    eVar.X0(0, true);
                } else if (i12 == 2 || i12 == 3) {
                    eVar.X0(1, true);
                }
            }
        }
    }

    public void E1(boolean z11) {
        this.Y0 = z11;
    }

    public void F1(int i11) {
        this.X0 = i11;
    }

    public void G1(int i11) {
        this.Z0 = i11;
    }

    @Override // d5.e
    public void g(a5.d dVar, boolean z11) {
        d[] dVarArr;
        boolean z12;
        int i11;
        int i12;
        int i13;
        d[] dVarArr2 = this.Y;
        dVarArr2[0] = this.Q;
        dVarArr2[2] = this.R;
        dVarArr2[1] = this.S;
        dVarArr2[3] = this.T;
        int i14 = 0;
        while (true) {
            dVarArr = this.Y;
            if (i14 >= dVarArr.length) {
                break;
            }
            d dVar2 = dVarArr[i14];
            dVar2.f59427i = dVar.q(dVar2);
            i14++;
        }
        int i15 = this.X0;
        if (i15 < 0 || i15 >= 4) {
            return;
        }
        d dVar3 = dVarArr[i15];
        if (!this.f59396a1) {
            y1();
        }
        if (this.f59396a1) {
            this.f59396a1 = false;
            int i16 = this.X0;
            if (i16 == 0 || i16 == 1) {
                dVar.f(this.Q.f59427i, this.f59443h0);
                dVar.f(this.S.f59427i, this.f59443h0);
                return;
            } else {
                if (i16 == 2 || i16 == 3) {
                    dVar.f(this.R.f59427i, this.f59445i0);
                    dVar.f(this.T.f59427i, this.f59445i0);
                    return;
                }
                return;
            }
        }
        int i17 = 0;
        while (true) {
            if (i17 >= this.W0) {
                z12 = false;
                break;
            }
            e eVar = this.V0[i17];
            if ((this.Y0 || eVar.h()) && ((((i12 = this.X0) == 0 || i12 == 1) && eVar.C() == e.b.MATCH_CONSTRAINT && eVar.Q.f59424f != null && eVar.S.f59424f != null) || (((i13 = this.X0) == 2 || i13 == 3) && eVar.V() == e.b.MATCH_CONSTRAINT && eVar.R.f59424f != null && eVar.T.f59424f != null))) {
                z12 = true;
                break;
            }
            i17++;
        }
        boolean z13 = this.Q.l() || this.S.l();
        boolean z14 = this.R.l() || this.T.l();
        int i18 = !(!z12 && (((i11 = this.X0) == 0 && z13) || ((i11 == 2 && z14) || ((i11 == 1 && z13) || (i11 == 3 && z14))))) ? 4 : 5;
        for (int i19 = 0; i19 < this.W0; i19++) {
            e eVar2 = this.V0[i19];
            if (this.Y0 || eVar2.h()) {
                a5.i iVarQ = dVar.q(eVar2.Y[this.X0]);
                d[] dVarArr3 = eVar2.Y;
                int i21 = this.X0;
                d dVar4 = dVarArr3[i21];
                dVar4.f59427i = iVarQ;
                d dVar5 = dVar4.f59424f;
                int i22 = (dVar5 == null || dVar5.f59422d != this) ? 0 : dVar4.f59425g;
                if (i21 == 0 || i21 == 2) {
                    dVar.i(dVar3.f59427i, iVarQ, this.Z0 - i22, z12);
                } else {
                    dVar.g(dVar3.f59427i, iVarQ, this.Z0 + i22, z12);
                }
                dVar.e(dVar3.f59427i, iVarQ, this.Z0 + i22, i18);
            }
        }
        int i23 = this.X0;
        if (i23 == 0) {
            dVar.e(this.S.f59427i, this.Q.f59427i, 0, 8);
            dVar.e(this.Q.f59427i, this.f59433c0.S.f59427i, 0, 4);
            dVar.e(this.Q.f59427i, this.f59433c0.Q.f59427i, 0, 0);
            return;
        }
        if (i23 == 1) {
            dVar.e(this.Q.f59427i, this.S.f59427i, 0, 8);
            dVar.e(this.Q.f59427i, this.f59433c0.Q.f59427i, 0, 4);
            dVar.e(this.Q.f59427i, this.f59433c0.S.f59427i, 0, 0);
        } else if (i23 == 2) {
            dVar.e(this.T.f59427i, this.R.f59427i, 0, 8);
            dVar.e(this.R.f59427i, this.f59433c0.T.f59427i, 0, 4);
            dVar.e(this.R.f59427i, this.f59433c0.R.f59427i, 0, 0);
        } else if (i23 == 3) {
            dVar.e(this.R.f59427i, this.T.f59427i, 0, 8);
            dVar.e(this.R.f59427i, this.f59433c0.R.f59427i, 0, 4);
            dVar.e(this.R.f59427i, this.f59433c0.T.f59427i, 0, 0);
        }
    }

    @Override // d5.e
    public boolean h() {
        return true;
    }

    @Override // d5.j, d5.e
    public void n(e eVar, HashMap<e, e> map) {
        super.n(eVar, map);
        a aVar = (a) eVar;
        this.X0 = aVar.X0;
        this.Y0 = aVar.Y0;
        this.Z0 = aVar.Z0;
    }

    @Override // d5.e
    public boolean p0() {
        return this.f59396a1;
    }

    @Override // d5.e
    public boolean q0() {
        return this.f59396a1;
    }

    @Override // d5.e
    public String toString() {
        String str = "[Barrier] " + v() + " {";
        for (int i11 = 0; i11 < this.W0; i11++) {
            e eVar = this.V0[i11];
            if (i11 > 0) {
                str = str + ", ";
            }
            str = str + eVar.v();
        }
        return str + "}";
    }

    public boolean y1() {
        int i11;
        int i12;
        int i13;
        boolean z11 = true;
        int i14 = 0;
        while (true) {
            i11 = this.W0;
            if (i14 >= i11) {
                break;
            }
            e eVar = this.V0[i14];
            if ((this.Y0 || eVar.h()) && ((((i12 = this.X0) == 0 || i12 == 1) && !eVar.p0()) || (((i13 = this.X0) == 2 || i13 == 3) && !eVar.q0()))) {
                z11 = false;
            }
            i14++;
        }
        if (!z11 || i11 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z12 = false;
        for (int i15 = 0; i15 < this.W0; i15++) {
            e eVar2 = this.V0[i15];
            if (this.Y0 || eVar2.h()) {
                if (!z12) {
                    int i16 = this.X0;
                    if (i16 == 0) {
                        iMax = eVar2.q(d.a.LEFT).e();
                    } else if (i16 == 1) {
                        iMax = eVar2.q(d.a.RIGHT).e();
                    } else if (i16 == 2) {
                        iMax = eVar2.q(d.a.TOP).e();
                    } else if (i16 == 3) {
                        iMax = eVar2.q(d.a.BOTTOM).e();
                    }
                    z12 = true;
                }
                int i17 = this.X0;
                if (i17 == 0) {
                    iMax = Math.min(iMax, eVar2.q(d.a.LEFT).e());
                } else if (i17 == 1) {
                    iMax = Math.max(iMax, eVar2.q(d.a.RIGHT).e());
                } else if (i17 == 2) {
                    iMax = Math.min(iMax, eVar2.q(d.a.TOP).e());
                } else if (i17 == 3) {
                    iMax = Math.max(iMax, eVar2.q(d.a.BOTTOM).e());
                }
            }
        }
        int i18 = iMax + this.Z0;
        int i19 = this.X0;
        if (i19 == 0 || i19 == 1) {
            K0(i18, i18);
        } else {
            N0(i18, i18);
        }
        this.f59396a1 = true;
        return true;
    }

    public boolean z1() {
        return this.Y0;
    }
}
