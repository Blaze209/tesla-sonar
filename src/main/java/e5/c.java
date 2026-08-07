package e5;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class c extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    ArrayList<p> f61798k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f61799l;

    public c(d5.e eVar, int i11) {
        super(eVar);
        this.f61798k = new ArrayList<>();
        this.f61857f = i11;
        q();
    }

    private void q() {
        d5.e eVar;
        d5.e eVar2 = this.f61853b;
        d5.e eVarN = eVar2.N(this.f61857f);
        while (true) {
            d5.e eVar3 = eVarN;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            } else {
                eVarN = eVar2.N(this.f61857f);
            }
        }
        this.f61853b = eVar;
        this.f61798k.add(eVar.P(this.f61857f));
        d5.e eVarL = eVar.L(this.f61857f);
        while (eVarL != null) {
            this.f61798k.add(eVarL.P(this.f61857f));
            eVarL = eVarL.L(this.f61857f);
        }
        for (p pVar : this.f61798k) {
            int i11 = this.f61857f;
            if (i11 == 0) {
                pVar.f61853b.f59432c = this;
            } else if (i11 == 1) {
                pVar.f61853b.f59434d = this;
            }
        }
        if (this.f61857f == 0 && ((d5.f) this.f61853b.M()).V1() && this.f61798k.size() > 1) {
            ArrayList<p> arrayList = this.f61798k;
            this.f61853b = arrayList.get(arrayList.size() - 1).f61853b;
        }
        this.f61799l = this.f61857f == 0 ? this.f61853b.B() : this.f61853b.U();
    }

    private d5.e r() {
        for (int i11 = 0; i11 < this.f61798k.size(); i11++) {
            p pVar = this.f61798k.get(i11);
            if (pVar.f61853b.X() != 8) {
                return pVar.f61853b;
            }
        }
        return null;
    }

    private d5.e s() {
        for (int size = this.f61798k.size() - 1; size >= 0; size--) {
            p pVar = this.f61798k.get(size);
            if (pVar.f61853b.X() != 8) {
                return pVar.f61853b;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0160  */
    @Override // e5.p, e5.d
    public void a(d dVar) {
        int i11;
        int i12;
        boolean z11;
        float f11;
        float f12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f13;
        int i17;
        int i18;
        int i19;
        int i21;
        boolean z12;
        if (this.f61859h.f61818j && this.f61860i.f61818j) {
            d5.e eVarM = this.f61853b.M();
            boolean zV1 = eVarM instanceof d5.f ? ((d5.f) eVarM).V1() : false;
            int i22 = this.f61860i.f61815g - this.f61859h.f61815g;
            int size = this.f61798k.size();
            int i23 = 0;
            while (true) {
                i11 = -1;
                i12 = 8;
                if (i23 >= size) {
                    i23 = -1;
                    break;
                } else if (this.f61798k.get(i23).f61853b.X() != 8) {
                    break;
                } else {
                    i23++;
                }
            }
            int i24 = size - 1;
            for (int i25 = i24; i25 >= 0; i25--) {
                if (this.f61798k.get(i25).f61853b.X() != 8) {
                    i11 = i25;
                    break;
                }
            }
            int i26 = 0;
            while (true) {
                if (i26 >= 2) {
                    z11 = zV1;
                    f11 = BitmapDescriptorFactory.HUE_RED;
                    f12 = 0.0f;
                    i13 = 0;
                    i14 = 0;
                    i15 = 0;
                    break;
                }
                int i27 = 0;
                i14 = 0;
                i15 = 0;
                int i28 = 0;
                f12 = BitmapDescriptorFactory.HUE_RED;
                while (i27 < size) {
                    p pVar = this.f61798k.get(i27);
                    if (pVar.f61853b.X() == i12) {
                        z12 = zV1;
                    } else {
                        i28++;
                        if (i27 > 0 && i27 >= i23) {
                            i14 += pVar.f61859h.f61814f;
                        }
                        g gVar = pVar.f61856e;
                        int i29 = gVar.f61815g;
                        boolean z13 = pVar.f61855d != d5.e.b.MATCH_CONSTRAINT;
                        if (z13) {
                            int i31 = this.f61857f;
                            if (i31 == 0 && !pVar.f61853b.f59436e.f61856e.f61818j) {
                                return;
                            }
                            if (i31 == 1 && !pVar.f61853b.f59438f.f61856e.f61818j) {
                                return;
                            } else {
                                z12 = zV1;
                            }
                        } else {
                            z12 = zV1;
                            if (pVar.f61852a == 1 && i26 == 0) {
                                i29 = gVar.f61821m;
                                i15++;
                            } else if (gVar.f61818j) {
                            }
                            z13 = true;
                        }
                        if (z13) {
                            i14 += i29;
                        } else {
                            i15++;
                            float f14 = pVar.f61853b.N0[this.f61857f];
                            if (f14 >= BitmapDescriptorFactory.HUE_RED) {
                                f12 += f14;
                            }
                        }
                        if (i27 < i24 && i27 < i11) {
                            i14 += -pVar.f61860i.f61814f;
                        }
                    }
                    i27++;
                    zV1 = z12;
                    i12 = 8;
                }
                z11 = zV1;
                f11 = BitmapDescriptorFactory.HUE_RED;
                if (i14 < i22 || i15 == 0) {
                    i13 = i28;
                    break;
                } else {
                    i26++;
                    zV1 = z11;
                    i12 = 8;
                }
            }
            int i32 = this.f61859h.f61815g;
            if (z11) {
                i32 = this.f61860i.f61815g;
            }
            float f15 = 0.5f;
            if (i14 > i22) {
                i32 = z11 ? i32 + ((int) (((i14 - i22) / 2.0f) + 0.5f)) : i32 - ((int) (((i14 - i22) / 2.0f) + 0.5f));
            }
            if (i15 > 0) {
                float f16 = i22 - i14;
                int i33 = (int) ((f16 / i15) + 0.5f);
                int i34 = 0;
                int i35 = 0;
                while (i34 < size) {
                    p pVar2 = this.f61798k.get(i34);
                    float f17 = f15;
                    int i36 = i32;
                    if (pVar2.f61853b.X() != 8 && pVar2.f61855d == d5.e.b.MATCH_CONSTRAINT) {
                        g gVar2 = pVar2.f61856e;
                        if (gVar2.f61818j) {
                            i33 = i33;
                            i35 = i35;
                        } else {
                            int i37 = f12 > f11 ? (int) (((pVar2.f61853b.N0[this.f61857f] * f16) / f12) + f17) : i33;
                            if (this.f61857f == 0) {
                                d5.e eVar = pVar2.f61853b;
                                i19 = eVar.A;
                                i21 = eVar.f59478z;
                            } else {
                                d5.e eVar2 = pVar2.f61853b;
                                i19 = eVar2.D;
                                i21 = eVar2.C;
                            }
                            int i38 = i35;
                            int iMax = Math.max(i21, pVar2.f61852a == 1 ? Math.min(i37, gVar2.f61821m) : i37);
                            if (i19 > 0) {
                                iMax = Math.min(i19, iMax);
                            }
                            if (iMax != i37) {
                                i35 = i38 + 1;
                                i37 = iMax;
                            } else {
                                i35 = i38;
                            }
                            pVar2.f61856e.d(i37);
                        }
                    } else {
                        i33 = i33;
                        i35 = i35;
                    }
                    i34++;
                    f15 = f17;
                    i32 = i36;
                    f16 = f16;
                    i33 = i33;
                }
                i16 = i32;
                f13 = f15;
                int i39 = i35;
                if (i39 > 0) {
                    i15 -= i39;
                    i14 = 0;
                    for (int i41 = 0; i41 < size; i41++) {
                        p pVar3 = this.f61798k.get(i41);
                        if (pVar3.f61853b.X() != 8) {
                            if (i41 > 0 && i41 >= i23) {
                                i14 += pVar3.f61859h.f61814f;
                            }
                            i14 += pVar3.f61856e.f61815g;
                            if (i41 < i24 && i41 < i11) {
                                i14 += -pVar3.f61860i.f61814f;
                            }
                        }
                    }
                }
                i18 = 2;
                if (this.f61799l == 2 && i39 == 0) {
                    i17 = 0;
                    this.f61799l = 0;
                } else {
                    i17 = 0;
                }
            } else {
                i16 = i32;
                f13 = 0.5f;
                i17 = 0;
                i18 = 2;
            }
            if (i14 > i22) {
                this.f61799l = i18;
            }
            if (i13 > 0 && i15 == 0 && i23 == i11) {
                this.f61799l = i18;
            }
            int i42 = this.f61799l;
            if (i42 == 1) {
                int i43 = i13 > 1 ? (i22 - i14) / (i13 - 1) : i13 == 1 ? (i22 - i14) / 2 : i17;
                if (i15 > 0) {
                    i43 = i17;
                }
                int i44 = i16;
                while (i17 < size) {
                    p pVar4 = this.f61798k.get(z11 ? size - (i17 + 1) : i17);
                    if (pVar4.f61853b.X() == 8) {
                        pVar4.f61859h.d(i44);
                        pVar4.f61860i.d(i44);
                    } else {
                        if (i17 > 0) {
                            i44 = z11 ? i44 - i43 : i44 + i43;
                        }
                        if (i17 > 0 && i17 >= i23) {
                            i44 = z11 ? i44 - pVar4.f61859h.f61814f : i44 + pVar4.f61859h.f61814f;
                        }
                        if (z11) {
                            pVar4.f61860i.d(i44);
                        } else {
                            pVar4.f61859h.d(i44);
                        }
                        g gVar3 = pVar4.f61856e;
                        int i45 = gVar3.f61815g;
                        if (pVar4.f61855d == d5.e.b.MATCH_CONSTRAINT && pVar4.f61852a == 1) {
                            i45 = gVar3.f61821m;
                        }
                        i44 = z11 ? i44 - i45 : i44 + i45;
                        if (z11) {
                            pVar4.f61859h.d(i44);
                        } else {
                            pVar4.f61860i.d(i44);
                        }
                        pVar4.f61858g = true;
                        if (i17 < i24 && i17 < i11) {
                            i44 = z11 ? i44 - (-pVar4.f61860i.f61814f) : i44 + (-pVar4.f61860i.f61814f);
                        }
                    }
                    i17++;
                }
                return;
            }
            if (i42 == 0) {
                int i46 = (i22 - i14) / (i13 + 1);
                if (i15 > 0) {
                    i46 = i17;
                }
                int i47 = i16;
                while (i17 < size) {
                    p pVar5 = this.f61798k.get(z11 ? size - (i17 + 1) : i17);
                    if (pVar5.f61853b.X() == 8) {
                        pVar5.f61859h.d(i47);
                        pVar5.f61860i.d(i47);
                    } else {
                        int i48 = z11 ? i47 - i46 : i47 + i46;
                        if (i17 > 0 && i17 >= i23) {
                            i48 = z11 ? i48 - pVar5.f61859h.f61814f : i48 + pVar5.f61859h.f61814f;
                        }
                        if (z11) {
                            pVar5.f61860i.d(i48);
                        } else {
                            pVar5.f61859h.d(i48);
                        }
                        g gVar4 = pVar5.f61856e;
                        int iMin = gVar4.f61815g;
                        if (pVar5.f61855d == d5.e.b.MATCH_CONSTRAINT && pVar5.f61852a == 1) {
                            iMin = Math.min(iMin, gVar4.f61821m);
                        }
                        i47 = z11 ? i48 - iMin : i48 + iMin;
                        if (z11) {
                            pVar5.f61859h.d(i47);
                        } else {
                            pVar5.f61860i.d(i47);
                        }
                        if (i17 < i24 && i17 < i11) {
                            i47 = z11 ? i47 - (-pVar5.f61860i.f61814f) : i47 + (-pVar5.f61860i.f61814f);
                        }
                    }
                    i17++;
                }
                return;
            }
            if (i42 == 2) {
                float fA = this.f61857f == 0 ? this.f61853b.A() : this.f61853b.T();
                if (z11) {
                    fA = 1.0f - fA;
                }
                int i49 = (int) (((i22 - i14) * fA) + f13);
                if (i49 < 0 || i15 > 0) {
                    i49 = i17;
                }
                int i51 = z11 ? i16 - i49 : i16 + i49;
                while (i17 < size) {
                    p pVar6 = this.f61798k.get(z11 ? size - (i17 + 1) : i17);
                    if (pVar6.f61853b.X() == 8) {
                        pVar6.f61859h.d(i51);
                        pVar6.f61860i.d(i51);
                    } else {
                        if (i17 > 0 && i17 >= i23) {
                            i51 = z11 ? i51 - pVar6.f61859h.f61814f : i51 + pVar6.f61859h.f61814f;
                        }
                        if (z11) {
                            pVar6.f61860i.d(i51);
                        } else {
                            pVar6.f61859h.d(i51);
                        }
                        g gVar5 = pVar6.f61856e;
                        int i52 = gVar5.f61815g;
                        if (pVar6.f61855d == d5.e.b.MATCH_CONSTRAINT && pVar6.f61852a == 1) {
                            i52 = gVar5.f61821m;
                        }
                        i51 = z11 ? i51 - i52 : i51 + i52;
                        if (z11) {
                            pVar6.f61859h.d(i51);
                        } else {
                            pVar6.f61860i.d(i51);
                        }
                        if (i17 < i24 && i17 < i11) {
                            i51 = z11 ? i51 - (-pVar6.f61860i.f61814f) : i51 + (-pVar6.f61860i.f61814f);
                        }
                    }
                    i17++;
                }
            }
        }
    }

    @Override // e5.p
    void d() {
        Iterator<p> it = this.f61798k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f61798k.size();
        if (size < 1) {
            return;
        }
        d5.e eVar = this.f61798k.get(0).f61853b;
        d5.e eVar2 = this.f61798k.get(size - 1).f61853b;
        if (this.f61857f == 0) {
            d5.d dVar = eVar.Q;
            d5.d dVar2 = eVar2.S;
            f fVarI = i(dVar, 0);
            int iF = dVar.f();
            d5.e eVarR = r();
            if (eVarR != null) {
                iF = eVarR.Q.f();
            }
            if (fVarI != null) {
                b(this.f61859h, fVarI, iF);
            }
            f fVarI2 = i(dVar2, 0);
            int iF2 = dVar2.f();
            d5.e eVarS = s();
            if (eVarS != null) {
                iF2 = eVarS.S.f();
            }
            if (fVarI2 != null) {
                b(this.f61860i, fVarI2, -iF2);
            }
        } else {
            d5.d dVar3 = eVar.R;
            d5.d dVar4 = eVar2.T;
            f fVarI3 = i(dVar3, 1);
            int iF3 = dVar3.f();
            d5.e eVarR2 = r();
            if (eVarR2 != null) {
                iF3 = eVarR2.R.f();
            }
            if (fVarI3 != null) {
                b(this.f61859h, fVarI3, iF3);
            }
            f fVarI4 = i(dVar4, 1);
            int iF4 = dVar4.f();
            d5.e eVarS2 = s();
            if (eVarS2 != null) {
                iF4 = eVarS2.T.f();
            }
            if (fVarI4 != null) {
                b(this.f61860i, fVarI4, -iF4);
            }
        }
        this.f61859h.f61809a = this;
        this.f61860i.f61809a = this;
    }

    @Override // e5.p
    public void e() {
        for (int i11 = 0; i11 < this.f61798k.size(); i11++) {
            this.f61798k.get(i11).e();
        }
    }

    @Override // e5.p
    void f() {
        this.f61854c = null;
        Iterator<p> it = this.f61798k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // e5.p
    public long j() {
        int size = this.f61798k.size();
        long j11 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            p pVar = this.f61798k.get(i11);
            j11 = j11 + ((long) pVar.f61859h.f61814f) + pVar.j() + ((long) pVar.f61860i.f61814f);
        }
        return j11;
    }

    @Override // e5.p
    boolean m() {
        int size = this.f61798k.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!this.f61798k.get(i11).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f61857f == 0 ? "horizontal : " : "vertical : ");
        for (p pVar : this.f61798k) {
            sb2.append("<");
            sb2.append(pVar);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
