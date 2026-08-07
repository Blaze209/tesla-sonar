package e5;

/* JADX INFO: loaded from: classes.dex */
public class l extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int[] f61825k = new int[2];

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f61826a;

        static {
            int[] iArr = new int[p.b.values().length];
            f61826a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f61826a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f61826a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(d5.e eVar) {
        super(eVar);
        this.f61859h.f61813e = f.a.LEFT;
        this.f61860i.f61813e = f.a.RIGHT;
        this.f61857f = 0;
    }

    private void q(int[] iArr, int i11, int i12, int i13, int i14, float f11, int i15) {
        int i16 = i12 - i11;
        int i17 = i14 - i13;
        if (i15 != -1) {
            if (i15 == 0) {
                iArr[0] = (int) ((i17 * f11) + 0.5f);
                iArr[1] = i17;
                return;
            } else {
                if (i15 != 1) {
                    return;
                }
                iArr[0] = i16;
                iArr[1] = (int) ((i16 * f11) + 0.5f);
                return;
            }
        }
        int i18 = (int) ((i17 * f11) + 0.5f);
        int i19 = (int) ((i16 / f11) + 0.5f);
        if (i18 <= i16) {
            iArr[0] = i18;
            iArr[1] = i17;
        } else if (i19 <= i17) {
            iArr[0] = i16;
            iArr[1] = i19;
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d9  */
    @Override // e5.p, e5.d
    public void a(d dVar) {
        int iG;
        int i11;
        int iG2;
        float f11;
        float fX;
        float fX2;
        int i12;
        int i13 = a.f61826a[this.f61861j.ordinal()];
        if (i13 == 1) {
            p(dVar);
        } else if (i13 == 2) {
            o(dVar);
        } else if (i13 == 3) {
            d5.e eVar = this.f61853b;
            n(dVar, eVar.Q, eVar.S, 0);
            return;
        }
        if (!this.f61856e.f61818j && this.f61855d == d5.e.b.MATCH_CONSTRAINT) {
            d5.e eVar2 = this.f61853b;
            int i14 = eVar2.f59472w;
            if (i14 == 2) {
                d5.e eVarM = eVar2.M();
                if (eVarM != null) {
                    g gVar = eVarM.f59436e.f61856e;
                    if (gVar.f61818j) {
                        this.f61856e.d((int) ((gVar.f61815g * this.f61853b.B) + 0.5f));
                    }
                }
            } else if (i14 == 3) {
                int i15 = eVar2.f59474x;
                if (i15 == 0 || i15 == 3) {
                    n nVar = eVar2.f59438f;
                    f fVar = nVar.f61859h;
                    f fVar2 = nVar.f61860i;
                    boolean z11 = eVar2.Q.f59424f != null;
                    boolean z12 = eVar2.R.f59424f != null;
                    boolean z13 = eVar2.S.f59424f != null;
                    boolean z14 = eVar2.T.f59424f != null;
                    int iY = eVar2.y();
                    if (z11 && z12 && z13 && z14) {
                        float fX3 = this.f61853b.x();
                        if (fVar.f61818j && fVar2.f61818j) {
                            f fVar3 = this.f61859h;
                            if (fVar3.f61811c && this.f61860i.f61811c) {
                                q(f61825k, this.f61859h.f61814f + fVar3.f61820l.get(0).f61815g, this.f61860i.f61820l.get(0).f61815g - this.f61860i.f61814f, fVar.f61814f + fVar.f61815g, fVar2.f61815g - fVar2.f61814f, fX3, iY);
                                this.f61856e.d(f61825k[0]);
                                this.f61853b.f59438f.f61856e.d(f61825k[1]);
                                return;
                            }
                            return;
                        }
                        f fVar4 = this.f61859h;
                        if (fVar4.f61818j) {
                            f fVar5 = this.f61860i;
                            if (fVar5.f61818j) {
                                if (!fVar.f61811c || !fVar2.f61811c) {
                                    return;
                                }
                                q(f61825k, fVar4.f61815g + fVar4.f61814f, fVar5.f61815g - fVar5.f61814f, fVar.f61814f + fVar.f61820l.get(0).f61815g, fVar2.f61820l.get(0).f61815g - fVar2.f61814f, fX3, iY);
                                this.f61856e.d(f61825k[0]);
                                this.f61853b.f59438f.f61856e.d(f61825k[1]);
                            }
                        }
                        f fVar6 = this.f61859h;
                        if (!fVar6.f61811c || !this.f61860i.f61811c || !fVar.f61811c || !fVar2.f61811c) {
                            return;
                        }
                        q(f61825k, this.f61859h.f61814f + fVar6.f61820l.get(0).f61815g, this.f61860i.f61820l.get(0).f61815g - this.f61860i.f61814f, fVar.f61814f + fVar.f61820l.get(0).f61815g, fVar2.f61820l.get(0).f61815g - fVar2.f61814f, fX3, iY);
                        this.f61856e.d(f61825k[0]);
                        this.f61853b.f59438f.f61856e.d(f61825k[1]);
                    } else if (z11 && z13) {
                        if (!this.f61859h.f61811c || !this.f61860i.f61811c) {
                            return;
                        }
                        float fX4 = this.f61853b.x();
                        int i16 = this.f61859h.f61820l.get(0).f61815g + this.f61859h.f61814f;
                        int i17 = this.f61860i.f61820l.get(0).f61815g - this.f61860i.f61814f;
                        if (iY == -1 || iY == 0) {
                            int iG3 = g(i17 - i16, 0);
                            int i18 = (int) ((iG3 * fX4) + 0.5f);
                            int iG4 = g(i18, 1);
                            if (i18 != iG4) {
                                iG3 = (int) ((iG4 / fX4) + 0.5f);
                            }
                            this.f61856e.d(iG3);
                            this.f61853b.f59438f.f61856e.d(iG4);
                        } else if (iY == 1) {
                            int iG5 = g(i17 - i16, 0);
                            int i19 = (int) ((iG5 / fX4) + 0.5f);
                            int iG6 = g(i19, 1);
                            if (i19 != iG6) {
                                iG5 = (int) ((iG6 * fX4) + 0.5f);
                            }
                            this.f61856e.d(iG5);
                            this.f61853b.f59438f.f61856e.d(iG6);
                        }
                    } else if (z12 && z14) {
                        if (!fVar.f61811c || !fVar2.f61811c) {
                            return;
                        }
                        float fX5 = this.f61853b.x();
                        int i21 = fVar.f61820l.get(0).f61815g + fVar.f61814f;
                        int i22 = fVar2.f61820l.get(0).f61815g - fVar2.f61814f;
                        if (iY == -1) {
                            iG = g(i22 - i21, 1);
                            i11 = (int) ((iG / fX5) + 0.5f);
                            iG2 = g(i11, 0);
                            if (i11 != iG2) {
                                iG = (int) ((iG2 * fX5) + 0.5f);
                            }
                            this.f61856e.d(iG2);
                            this.f61853b.f59438f.f61856e.d(iG);
                        } else if (iY == 0) {
                            int iG7 = g(i22 - i21, 1);
                            int i23 = (int) ((iG7 * fX5) + 0.5f);
                            int iG8 = g(i23, 0);
                            if (i23 != iG8) {
                                iG7 = (int) ((iG8 / fX5) + 0.5f);
                            }
                            this.f61856e.d(iG8);
                            this.f61853b.f59438f.f61856e.d(iG7);
                        } else if (iY == 1) {
                            iG = g(i22 - i21, 1);
                            i11 = (int) ((iG / fX5) + 0.5f);
                            iG2 = g(i11, 0);
                            if (i11 != iG2) {
                                iG = (int) ((iG2 * fX5) + 0.5f);
                            }
                            this.f61856e.d(iG2);
                            this.f61853b.f59438f.f61856e.d(iG);
                        }
                    }
                } else {
                    int iY2 = eVar2.y();
                    if (iY2 != -1) {
                        if (iY2 == 0) {
                            d5.e eVar3 = this.f61853b;
                            fX2 = eVar3.f59438f.f61856e.f61815g / eVar3.x();
                            i12 = (int) (fX2 + 0.5f);
                        } else if (iY2 != 1) {
                            i12 = 0;
                        } else {
                            d5.e eVar4 = this.f61853b;
                            f11 = eVar4.f59438f.f61856e.f61815g;
                            fX = eVar4.x();
                        }
                        this.f61856e.d(i12);
                    } else {
                        d5.e eVar5 = this.f61853b;
                        f11 = eVar5.f59438f.f61856e.f61815g;
                        fX = eVar5.x();
                    }
                    fX2 = f11 * fX;
                    i12 = (int) (fX2 + 0.5f);
                    this.f61856e.d(i12);
                }
            }
        }
        f fVar7 = this.f61859h;
        if (fVar7.f61811c) {
            f fVar8 = this.f61860i;
            if (fVar8.f61811c) {
                if (fVar7.f61818j && fVar8.f61818j && this.f61856e.f61818j) {
                    return;
                }
                if (!this.f61856e.f61818j && this.f61855d == d5.e.b.MATCH_CONSTRAINT) {
                    d5.e eVar6 = this.f61853b;
                    if (eVar6.f59472w == 0 && !eVar6.k0()) {
                        f fVar9 = this.f61859h.f61820l.get(0);
                        f fVar10 = this.f61860i.f61820l.get(0);
                        int i24 = fVar9.f61815g;
                        f fVar11 = this.f61859h;
                        int i25 = i24 + fVar11.f61814f;
                        int i26 = fVar10.f61815g + this.f61860i.f61814f;
                        fVar11.d(i25);
                        this.f61860i.d(i26);
                        this.f61856e.d(i26 - i25);
                        return;
                    }
                }
                if (!this.f61856e.f61818j && this.f61855d == d5.e.b.MATCH_CONSTRAINT && this.f61852a == 1 && this.f61859h.f61820l.size() > 0 && this.f61860i.f61820l.size() > 0) {
                    int iMin = Math.min((this.f61860i.f61820l.get(0).f61815g + this.f61860i.f61814f) - (this.f61859h.f61820l.get(0).f61815g + this.f61859h.f61814f), this.f61856e.f61821m);
                    d5.e eVar7 = this.f61853b;
                    int i27 = eVar7.A;
                    int iMax = Math.max(eVar7.f59478z, iMin);
                    if (i27 > 0) {
                        iMax = Math.min(i27, iMax);
                    }
                    this.f61856e.d(iMax);
                }
                if (this.f61856e.f61818j) {
                    f fVar12 = this.f61859h.f61820l.get(0);
                    f fVar13 = this.f61860i.f61820l.get(0);
                    int i28 = fVar12.f61815g + this.f61859h.f61814f;
                    int i29 = fVar13.f61815g + this.f61860i.f61814f;
                    float fA = this.f61853b.A();
                    if (fVar12 == fVar13) {
                        i28 = fVar12.f61815g;
                        i29 = fVar13.f61815g;
                        fA = 0.5f;
                    }
                    this.f61859h.d((int) (i28 + 0.5f + (((i29 - i28) - this.f61856e.f61815g) * fA)));
                    this.f61860i.d(this.f61859h.f61815g + this.f61856e.f61815g);
                }
            }
        }
    }

    @Override // e5.p
    void d() {
        d5.e eVarM;
        d5.e eVarM2;
        d5.e eVar = this.f61853b;
        if (eVar.f59428a) {
            this.f61856e.d(eVar.Y());
        }
        if (this.f61856e.f61818j) {
            d5.e.b bVar = this.f61855d;
            d5.e.b bVar2 = d5.e.b.MATCH_PARENT;
            if (bVar == bVar2 && (eVarM = this.f61853b.M()) != null && (eVarM.C() == d5.e.b.FIXED || eVarM.C() == bVar2)) {
                b(this.f61859h, eVarM.f59436e.f61859h, this.f61853b.Q.f());
                b(this.f61860i, eVarM.f59436e.f61860i, -this.f61853b.S.f());
                return;
            }
        } else {
            d5.e.b bVarC = this.f61853b.C();
            this.f61855d = bVarC;
            if (bVarC != d5.e.b.MATCH_CONSTRAINT) {
                d5.e.b bVar3 = d5.e.b.MATCH_PARENT;
                if (bVarC == bVar3 && (eVarM2 = this.f61853b.M()) != null && (eVarM2.C() == d5.e.b.FIXED || eVarM2.C() == bVar3)) {
                    int iY = (eVarM2.Y() - this.f61853b.Q.f()) - this.f61853b.S.f();
                    b(this.f61859h, eVarM2.f59436e.f61859h, this.f61853b.Q.f());
                    b(this.f61860i, eVarM2.f59436e.f61860i, -this.f61853b.S.f());
                    this.f61856e.d(iY);
                    return;
                }
                if (this.f61855d == d5.e.b.FIXED) {
                    this.f61856e.d(this.f61853b.Y());
                }
            }
        }
        g gVar = this.f61856e;
        if (gVar.f61818j) {
            d5.e eVar2 = this.f61853b;
            if (eVar2.f59428a) {
                d5.d[] dVarArr = eVar2.Y;
                d5.d dVar = dVarArr[0];
                d5.d dVar2 = dVar.f59424f;
                if (dVar2 != null && dVarArr[1].f59424f != null) {
                    if (eVar2.k0()) {
                        this.f61859h.f61814f = this.f61853b.Y[0].f();
                        this.f61860i.f61814f = -this.f61853b.Y[1].f();
                        return;
                    }
                    f fVarH = h(this.f61853b.Y[0]);
                    if (fVarH != null) {
                        b(this.f61859h, fVarH, this.f61853b.Y[0].f());
                    }
                    f fVarH2 = h(this.f61853b.Y[1]);
                    if (fVarH2 != null) {
                        b(this.f61860i, fVarH2, -this.f61853b.Y[1].f());
                    }
                    this.f61859h.f61810b = true;
                    this.f61860i.f61810b = true;
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f61859h, fVarH3, this.f61853b.Y[0].f());
                        b(this.f61860i, this.f61859h, this.f61856e.f61815g);
                        return;
                    }
                    return;
                }
                d5.d dVar3 = dVarArr[1];
                if (dVar3.f59424f != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f61860i, fVarH4, -this.f61853b.Y[1].f());
                        b(this.f61859h, this.f61860i, -this.f61856e.f61815g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof d5.i) || eVar2.M() == null || this.f61853b.q(d5.d.a.CENTER).f59424f != null) {
                    return;
                }
                b(this.f61859h, this.f61853b.M().f59436e.f61859h, this.f61853b.Z());
                b(this.f61860i, this.f61859h, this.f61856e.f61815g);
                return;
            }
        }
        if (this.f61855d == d5.e.b.MATCH_CONSTRAINT) {
            d5.e eVar3 = this.f61853b;
            int i11 = eVar3.f59472w;
            if (i11 == 2) {
                d5.e eVarM3 = eVar3.M();
                if (eVarM3 != null) {
                    g gVar2 = eVarM3.f59438f.f61856e;
                    this.f61856e.f61820l.add(gVar2);
                    gVar2.f61819k.add(this.f61856e);
                    g gVar3 = this.f61856e;
                    gVar3.f61810b = true;
                    gVar3.f61819k.add(this.f61859h);
                    this.f61856e.f61819k.add(this.f61860i);
                }
            } else if (i11 == 3) {
                if (eVar3.f59474x == 3) {
                    this.f61859h.f61809a = this;
                    this.f61860i.f61809a = this;
                    n nVar = eVar3.f59438f;
                    nVar.f61859h.f61809a = this;
                    nVar.f61860i.f61809a = this;
                    gVar.f61809a = this;
                    if (eVar3.m0()) {
                        this.f61856e.f61820l.add(this.f61853b.f59438f.f61856e);
                        this.f61853b.f59438f.f61856e.f61819k.add(this.f61856e);
                        n nVar2 = this.f61853b.f59438f;
                        nVar2.f61856e.f61809a = this;
                        this.f61856e.f61820l.add(nVar2.f61859h);
                        this.f61856e.f61820l.add(this.f61853b.f59438f.f61860i);
                        this.f61853b.f59438f.f61859h.f61819k.add(this.f61856e);
                        this.f61853b.f59438f.f61860i.f61819k.add(this.f61856e);
                    } else if (this.f61853b.k0()) {
                        this.f61853b.f59438f.f61856e.f61820l.add(this.f61856e);
                        this.f61856e.f61819k.add(this.f61853b.f59438f.f61856e);
                    } else {
                        this.f61853b.f59438f.f61856e.f61820l.add(this.f61856e);
                    }
                } else {
                    g gVar4 = eVar3.f59438f.f61856e;
                    gVar.f61820l.add(gVar4);
                    gVar4.f61819k.add(this.f61856e);
                    this.f61853b.f59438f.f61859h.f61819k.add(this.f61856e);
                    this.f61853b.f59438f.f61860i.f61819k.add(this.f61856e);
                    g gVar5 = this.f61856e;
                    gVar5.f61810b = true;
                    gVar5.f61819k.add(this.f61859h);
                    this.f61856e.f61819k.add(this.f61860i);
                    this.f61859h.f61820l.add(this.f61856e);
                    this.f61860i.f61820l.add(this.f61856e);
                }
            }
        }
        d5.e eVar4 = this.f61853b;
        d5.d[] dVarArr2 = eVar4.Y;
        d5.d dVar4 = dVarArr2[0];
        d5.d dVar5 = dVar4.f59424f;
        if (dVar5 != null && dVarArr2[1].f59424f != null) {
            if (eVar4.k0()) {
                this.f61859h.f61814f = this.f61853b.Y[0].f();
                this.f61860i.f61814f = -this.f61853b.Y[1].f();
                return;
            }
            f fVarH5 = h(this.f61853b.Y[0]);
            f fVarH6 = h(this.f61853b.Y[1]);
            if (fVarH5 != null) {
                fVarH5.b(this);
            }
            if (fVarH6 != null) {
                fVarH6.b(this);
            }
            this.f61861j = p.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            f fVarH7 = h(dVar4);
            if (fVarH7 != null) {
                b(this.f61859h, fVarH7, this.f61853b.Y[0].f());
                c(this.f61860i, this.f61859h, 1, this.f61856e);
                return;
            }
            return;
        }
        d5.d dVar6 = dVarArr2[1];
        if (dVar6.f59424f != null) {
            f fVarH8 = h(dVar6);
            if (fVarH8 != null) {
                b(this.f61860i, fVarH8, -this.f61853b.Y[1].f());
                c(this.f61859h, this.f61860i, -1, this.f61856e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof d5.i) || eVar4.M() == null) {
            return;
        }
        b(this.f61859h, this.f61853b.M().f59436e.f61859h, this.f61853b.Z());
        c(this.f61860i, this.f61859h, 1, this.f61856e);
    }

    @Override // e5.p
    public void e() {
        f fVar = this.f61859h;
        if (fVar.f61818j) {
            this.f61853b.r1(fVar.f61815g);
        }
    }

    @Override // e5.p
    void f() {
        this.f61854c = null;
        this.f61859h.c();
        this.f61860i.c();
        this.f61856e.c();
        this.f61858g = false;
    }

    @Override // e5.p
    boolean m() {
        return this.f61855d != d5.e.b.MATCH_CONSTRAINT || this.f61853b.f59472w == 0;
    }

    void r() {
        this.f61858g = false;
        this.f61859h.c();
        this.f61859h.f61818j = false;
        this.f61860i.c();
        this.f61860i.f61818j = false;
        this.f61856e.f61818j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f61853b.v();
    }
}
