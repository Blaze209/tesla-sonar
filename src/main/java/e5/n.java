package e5;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public class n extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f61835k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    g f61836l;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f61837a;

        static {
            int[] iArr = new int[p.b.values().length];
            f61837a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f61837a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f61837a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(d5.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f61835k = fVar;
        this.f61836l = null;
        this.f61859h.f61813e = f.a.TOP;
        this.f61860i.f61813e = f.a.BOTTOM;
        fVar.f61813e = f.a.BASELINE;
        this.f61857f = 1;
    }

    @Override // e5.p, e5.d
    public void a(d dVar) {
        float f11;
        float fX;
        float fX2;
        int i11;
        int i12 = a.f61837a[this.f61861j.ordinal()];
        if (i12 == 1) {
            p(dVar);
        } else if (i12 == 2) {
            o(dVar);
        } else if (i12 == 3) {
            d5.e eVar = this.f61853b;
            n(dVar, eVar.R, eVar.T, 1);
            return;
        }
        g gVar = this.f61856e;
        if (gVar.f61811c && !gVar.f61818j && this.f61855d == d5.e.b.MATCH_CONSTRAINT) {
            d5.e eVar2 = this.f61853b;
            int i13 = eVar2.f59474x;
            if (i13 == 2) {
                d5.e eVarM = eVar2.M();
                if (eVarM != null) {
                    g gVar2 = eVarM.f59438f.f61856e;
                    if (gVar2.f61818j) {
                        this.f61856e.d((int) ((gVar2.f61815g * this.f61853b.E) + 0.5f));
                    }
                }
            } else if (i13 == 3 && eVar2.f59436e.f61856e.f61818j) {
                int iY = eVar2.y();
                if (iY != -1) {
                    if (iY == 0) {
                        d5.e eVar3 = this.f61853b;
                        fX2 = eVar3.f59436e.f61856e.f61815g * eVar3.x();
                        i11 = (int) (fX2 + 0.5f);
                    } else if (iY != 1) {
                        i11 = 0;
                    } else {
                        d5.e eVar4 = this.f61853b;
                        f11 = eVar4.f59436e.f61856e.f61815g;
                        fX = eVar4.x();
                    }
                    this.f61856e.d(i11);
                } else {
                    d5.e eVar5 = this.f61853b;
                    f11 = eVar5.f59436e.f61856e.f61815g;
                    fX = eVar5.x();
                }
                fX2 = f11 / fX;
                i11 = (int) (fX2 + 0.5f);
                this.f61856e.d(i11);
            }
        }
        f fVar = this.f61859h;
        if (fVar.f61811c) {
            f fVar2 = this.f61860i;
            if (fVar2.f61811c) {
                if (fVar.f61818j && fVar2.f61818j && this.f61856e.f61818j) {
                    return;
                }
                if (!this.f61856e.f61818j && this.f61855d == d5.e.b.MATCH_CONSTRAINT) {
                    d5.e eVar6 = this.f61853b;
                    if (eVar6.f59472w == 0 && !eVar6.m0()) {
                        f fVar3 = this.f61859h.f61820l.get(0);
                        f fVar4 = this.f61860i.f61820l.get(0);
                        int i14 = fVar3.f61815g;
                        f fVar5 = this.f61859h;
                        int i15 = i14 + fVar5.f61814f;
                        int i16 = fVar4.f61815g + this.f61860i.f61814f;
                        fVar5.d(i15);
                        this.f61860i.d(i16);
                        this.f61856e.d(i16 - i15);
                        return;
                    }
                }
                if (!this.f61856e.f61818j && this.f61855d == d5.e.b.MATCH_CONSTRAINT && this.f61852a == 1 && this.f61859h.f61820l.size() > 0 && this.f61860i.f61820l.size() > 0) {
                    f fVar6 = this.f61859h.f61820l.get(0);
                    int i17 = (this.f61860i.f61820l.get(0).f61815g + this.f61860i.f61814f) - (fVar6.f61815g + this.f61859h.f61814f);
                    g gVar3 = this.f61856e;
                    int i18 = gVar3.f61821m;
                    if (i17 < i18) {
                        gVar3.d(i17);
                    } else {
                        gVar3.d(i18);
                    }
                }
                if (this.f61856e.f61818j && this.f61859h.f61820l.size() > 0 && this.f61860i.f61820l.size() > 0) {
                    f fVar7 = this.f61859h.f61820l.get(0);
                    f fVar8 = this.f61860i.f61820l.get(0);
                    int i19 = fVar7.f61815g + this.f61859h.f61814f;
                    int i21 = fVar8.f61815g + this.f61860i.f61814f;
                    float fT = this.f61853b.T();
                    if (fVar7 == fVar8) {
                        i19 = fVar7.f61815g;
                        i21 = fVar8.f61815g;
                        fT = 0.5f;
                    }
                    this.f61859h.d((int) (i19 + 0.5f + (((i21 - i19) - this.f61856e.f61815g) * fT)));
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
            this.f61856e.d(eVar.z());
        }
        if (!this.f61856e.f61818j) {
            this.f61855d = this.f61853b.V();
            if (this.f61853b.b0()) {
                this.f61836l = new e5.a(this);
            }
            d5.e.b bVar = this.f61855d;
            if (bVar != d5.e.b.MATCH_CONSTRAINT) {
                if (bVar == d5.e.b.MATCH_PARENT && (eVarM2 = this.f61853b.M()) != null && eVarM2.V() == d5.e.b.FIXED) {
                    int iZ = (eVarM2.z() - this.f61853b.R.f()) - this.f61853b.T.f();
                    b(this.f61859h, eVarM2.f59438f.f61859h, this.f61853b.R.f());
                    b(this.f61860i, eVarM2.f59438f.f61860i, -this.f61853b.T.f());
                    this.f61856e.d(iZ);
                    return;
                }
                if (this.f61855d == d5.e.b.FIXED) {
                    this.f61856e.d(this.f61853b.z());
                }
            }
        } else if (this.f61855d == d5.e.b.MATCH_PARENT && (eVarM = this.f61853b.M()) != null && eVarM.V() == d5.e.b.FIXED) {
            b(this.f61859h, eVarM.f59438f.f61859h, this.f61853b.R.f());
            b(this.f61860i, eVarM.f59438f.f61860i, -this.f61853b.T.f());
            return;
        }
        g gVar = this.f61856e;
        boolean z11 = gVar.f61818j;
        if (z11) {
            d5.e eVar2 = this.f61853b;
            if (eVar2.f59428a) {
                d5.d[] dVarArr = eVar2.Y;
                d5.d dVar = dVarArr[2];
                d5.d dVar2 = dVar.f59424f;
                if (dVar2 != null && dVarArr[3].f59424f != null) {
                    if (eVar2.m0()) {
                        this.f61859h.f61814f = this.f61853b.Y[2].f();
                        this.f61860i.f61814f = -this.f61853b.Y[3].f();
                    } else {
                        f fVarH = h(this.f61853b.Y[2]);
                        if (fVarH != null) {
                            b(this.f61859h, fVarH, this.f61853b.Y[2].f());
                        }
                        f fVarH2 = h(this.f61853b.Y[3]);
                        if (fVarH2 != null) {
                            b(this.f61860i, fVarH2, -this.f61853b.Y[3].f());
                        }
                        this.f61859h.f61810b = true;
                        this.f61860i.f61810b = true;
                    }
                    if (this.f61853b.b0()) {
                        b(this.f61835k, this.f61859h, this.f61853b.r());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f61859h, fVarH3, this.f61853b.Y[2].f());
                        b(this.f61860i, this.f61859h, this.f61856e.f61815g);
                        if (this.f61853b.b0()) {
                            b(this.f61835k, this.f61859h, this.f61853b.r());
                            return;
                        }
                        return;
                    }
                    return;
                }
                d5.d dVar3 = dVarArr[3];
                if (dVar3.f59424f != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f61860i, fVarH4, -this.f61853b.Y[3].f());
                        b(this.f61859h, this.f61860i, -this.f61856e.f61815g);
                    }
                    if (this.f61853b.b0()) {
                        b(this.f61835k, this.f61859h, this.f61853b.r());
                        return;
                    }
                    return;
                }
                d5.d dVar4 = dVarArr[4];
                if (dVar4.f59424f != null) {
                    f fVarH5 = h(dVar4);
                    if (fVarH5 != null) {
                        b(this.f61835k, fVarH5, 0);
                        b(this.f61859h, this.f61835k, -this.f61853b.r());
                        b(this.f61860i, this.f61859h, this.f61856e.f61815g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof d5.i) || eVar2.M() == null || this.f61853b.q(d5.d.a.CENTER).f59424f != null) {
                    return;
                }
                b(this.f61859h, this.f61853b.M().f59438f.f61859h, this.f61853b.a0());
                b(this.f61860i, this.f61859h, this.f61856e.f61815g);
                if (this.f61853b.b0()) {
                    b(this.f61835k, this.f61859h, this.f61853b.r());
                    return;
                }
                return;
            }
        }
        if (z11 || this.f61855d != d5.e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            d5.e eVar3 = this.f61853b;
            int i11 = eVar3.f59474x;
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
            } else if (i11 == 3 && !eVar3.m0()) {
                d5.e eVar4 = this.f61853b;
                if (eVar4.f59472w != 3) {
                    g gVar4 = eVar4.f59436e.f61856e;
                    this.f61856e.f61820l.add(gVar4);
                    gVar4.f61819k.add(this.f61856e);
                    g gVar5 = this.f61856e;
                    gVar5.f61810b = true;
                    gVar5.f61819k.add(this.f61859h);
                    this.f61856e.f61819k.add(this.f61860i);
                }
            }
        }
        d5.e eVar5 = this.f61853b;
        d5.d[] dVarArr2 = eVar5.Y;
        d5.d dVar5 = dVarArr2[2];
        d5.d dVar6 = dVar5.f59424f;
        if (dVar6 != null && dVarArr2[3].f59424f != null) {
            if (eVar5.m0()) {
                this.f61859h.f61814f = this.f61853b.Y[2].f();
                this.f61860i.f61814f = -this.f61853b.Y[3].f();
            } else {
                f fVarH6 = h(this.f61853b.Y[2]);
                f fVarH7 = h(this.f61853b.Y[3]);
                if (fVarH6 != null) {
                    fVarH6.b(this);
                }
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                this.f61861j = p.b.CENTER;
            }
            if (this.f61853b.b0()) {
                c(this.f61835k, this.f61859h, 1, this.f61836l);
            }
        } else if (dVar6 != null) {
            f fVarH8 = h(dVar5);
            if (fVarH8 != null) {
                b(this.f61859h, fVarH8, this.f61853b.Y[2].f());
                c(this.f61860i, this.f61859h, 1, this.f61856e);
                if (this.f61853b.b0()) {
                    c(this.f61835k, this.f61859h, 1, this.f61836l);
                }
                d5.e.b bVar2 = this.f61855d;
                d5.e.b bVar3 = d5.e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f61853b.x() > BitmapDescriptorFactory.HUE_RED) {
                    l lVar = this.f61853b.f59436e;
                    if (lVar.f61855d == bVar3) {
                        lVar.f61856e.f61819k.add(this.f61856e);
                        this.f61856e.f61820l.add(this.f61853b.f59436e.f61856e);
                        this.f61856e.f61809a = this;
                    }
                }
            }
        } else {
            d5.d dVar7 = dVarArr2[3];
            if (dVar7.f59424f != null) {
                f fVarH9 = h(dVar7);
                if (fVarH9 != null) {
                    b(this.f61860i, fVarH9, -this.f61853b.Y[3].f());
                    c(this.f61859h, this.f61860i, -1, this.f61856e);
                    if (this.f61853b.b0()) {
                        c(this.f61835k, this.f61859h, 1, this.f61836l);
                    }
                }
            } else {
                d5.d dVar8 = dVarArr2[4];
                if (dVar8.f59424f != null) {
                    f fVarH10 = h(dVar8);
                    if (fVarH10 != null) {
                        b(this.f61835k, fVarH10, 0);
                        c(this.f61859h, this.f61835k, -1, this.f61836l);
                        c(this.f61860i, this.f61859h, 1, this.f61856e);
                    }
                } else if (!(eVar5 instanceof d5.i) && eVar5.M() != null) {
                    b(this.f61859h, this.f61853b.M().f59438f.f61859h, this.f61853b.a0());
                    c(this.f61860i, this.f61859h, 1, this.f61856e);
                    if (this.f61853b.b0()) {
                        c(this.f61835k, this.f61859h, 1, this.f61836l);
                    }
                    d5.e.b bVar4 = this.f61855d;
                    d5.e.b bVar5 = d5.e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f61853b.x() > BitmapDescriptorFactory.HUE_RED) {
                        l lVar2 = this.f61853b.f59436e;
                        if (lVar2.f61855d == bVar5) {
                            lVar2.f61856e.f61819k.add(this.f61856e);
                            this.f61856e.f61820l.add(this.f61853b.f59436e.f61856e);
                            this.f61856e.f61809a = this;
                        }
                    }
                }
            }
        }
        if (this.f61856e.f61820l.size() == 0) {
            this.f61856e.f61811c = true;
        }
    }

    @Override // e5.p
    public void e() {
        f fVar = this.f61859h;
        if (fVar.f61818j) {
            this.f61853b.s1(fVar.f61815g);
        }
    }

    @Override // e5.p
    void f() {
        this.f61854c = null;
        this.f61859h.c();
        this.f61860i.c();
        this.f61835k.c();
        this.f61856e.c();
        this.f61858g = false;
    }

    @Override // e5.p
    boolean m() {
        return this.f61855d != d5.e.b.MATCH_CONSTRAINT || this.f61853b.f59474x == 0;
    }

    void q() {
        this.f61858g = false;
        this.f61859h.c();
        this.f61859h.f61818j = false;
        this.f61860i.c();
        this.f61860i.f61818j = false;
        this.f61835k.c();
        this.f61835k.f61818j = false;
        this.f61856e.f61818j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f61853b.v();
    }
}
