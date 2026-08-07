package e5;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b.a f61822a = new b.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f61823b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f61824c = 0;

    private static boolean a(int i11, d5.e eVar) {
        d5.e.b bVar;
        d5.e.b bVar2;
        d5.e.b bVarC = eVar.C();
        d5.e.b bVarV = eVar.V();
        d5.f fVar = eVar.M() != null ? (d5.f) eVar.M() : null;
        if (fVar != null) {
            fVar.C();
            d5.e.b bVar3 = d5.e.b.FIXED;
        }
        if (fVar != null) {
            fVar.V();
            d5.e.b bVar4 = d5.e.b.FIXED;
        }
        d5.e.b bVar5 = d5.e.b.FIXED;
        boolean z11 = bVarC == bVar5 || eVar.p0() || bVarC == d5.e.b.WRAP_CONTENT || (bVarC == (bVar2 = d5.e.b.MATCH_CONSTRAINT) && eVar.f59472w == 0 && eVar.f59439f0 == BitmapDescriptorFactory.HUE_RED && eVar.c0(0)) || (bVarC == bVar2 && eVar.f59472w == 1 && eVar.f0(0, eVar.Y()));
        boolean z12 = bVarV == bVar5 || eVar.q0() || bVarV == d5.e.b.WRAP_CONTENT || (bVarV == (bVar = d5.e.b.MATCH_CONSTRAINT) && eVar.f59474x == 0 && eVar.f59439f0 == BitmapDescriptorFactory.HUE_RED && eVar.c0(1)) || (bVarV == bVar && eVar.f59474x == 1 && eVar.f0(1, eVar.z()));
        if (eVar.f59439f0 <= BitmapDescriptorFactory.HUE_RED || !(z11 || z12)) {
            return z11 && z12;
        }
        return true;
    }

    private static void b(int i11, d5.e eVar, b.InterfaceC1268b interfaceC1268b, boolean z11) {
        d5.d dVar;
        d5.d dVar2;
        d5.d dVar3;
        d5.d dVar4;
        if (eVar.i0()) {
            return;
        }
        boolean z12 = true;
        f61823b++;
        if (!(eVar instanceof d5.f) && eVar.o0()) {
            int i12 = i11 + 1;
            if (a(i12, eVar)) {
                d5.f.Y1(i12, eVar, interfaceC1268b, new b.a(), b.a.f61785k);
            }
        }
        d5.d dVarQ = eVar.q(d5.d.a.LEFT);
        d5.d dVarQ2 = eVar.q(d5.d.a.RIGHT);
        int iE = dVarQ.e();
        int iE2 = dVarQ2.e();
        if (dVarQ.d() != null && dVarQ.n()) {
            Iterator<d5.d> it = dVarQ.d().iterator();
            while (it.hasNext()) {
                d5.d next = it.next();
                d5.e eVar2 = next.f59422d;
                int i13 = i11 + 1;
                boolean zA = a(i13, eVar2);
                if (eVar2.o0() && zA) {
                    d5.f.Y1(i13, eVar2, interfaceC1268b, new b.a(), b.a.f61785k);
                }
                boolean z13 = ((next == eVar2.Q && (dVar4 = eVar2.S.f59424f) != null && dVar4.n()) || (next == eVar2.S && (dVar3 = eVar2.Q.f59424f) != null && dVar3.n())) ? z12 : false;
                d5.e.b bVarC = eVar2.C();
                d5.e.b bVar = d5.e.b.MATCH_CONSTRAINT;
                if (bVarC != bVar || zA) {
                    if (!eVar2.o0()) {
                        d5.d dVar5 = eVar2.Q;
                        if (next == dVar5 && eVar2.S.f59424f == null) {
                            int iF = dVar5.f() + iE;
                            eVar2.K0(iF, eVar2.Y() + iF);
                            b(i13, eVar2, interfaceC1268b, z11);
                        } else {
                            d5.d dVar6 = eVar2.S;
                            if (next == dVar6 && dVar5.f59424f == null) {
                                int iF2 = iE - dVar6.f();
                                eVar2.K0(iF2 - eVar2.Y(), iF2);
                                b(i13, eVar2, interfaceC1268b, z11);
                            } else if (z13 && !eVar2.k0()) {
                                d(i13, interfaceC1268b, eVar2, z11);
                            }
                        }
                    }
                } else if (eVar2.C() == bVar && eVar2.A >= 0 && eVar2.f59478z >= 0 && ((eVar2.X() == 8 || (eVar2.f59472w == 0 && eVar2.x() == BitmapDescriptorFactory.HUE_RED)) && !eVar2.k0() && !eVar2.n0() && z13 && !eVar2.k0())) {
                    e(i13, eVar, interfaceC1268b, eVar2, z11);
                }
                z12 = z12;
            }
        }
        boolean z14 = z12;
        if (eVar instanceof d5.h) {
            return;
        }
        if (dVarQ2.d() != null && dVarQ2.n()) {
            Iterator<d5.d> it2 = dVarQ2.d().iterator();
            while (it2.hasNext()) {
                d5.d next2 = it2.next();
                d5.e eVar3 = next2.f59422d;
                int i14 = i11 + 1;
                boolean zA2 = a(i14, eVar3);
                if (eVar3.o0() && zA2) {
                    d5.f.Y1(i14, eVar3, interfaceC1268b, new b.a(), b.a.f61785k);
                }
                boolean z15 = ((next2 == eVar3.Q && (dVar2 = eVar3.S.f59424f) != null && dVar2.n()) || (next2 == eVar3.S && (dVar = eVar3.Q.f59424f) != null && dVar.n())) ? z14 : false;
                d5.e.b bVarC2 = eVar3.C();
                d5.e.b bVar2 = d5.e.b.MATCH_CONSTRAINT;
                if (bVarC2 != bVar2 || zA2) {
                    if (!eVar3.o0()) {
                        d5.d dVar7 = eVar3.Q;
                        if (next2 == dVar7 && eVar3.S.f59424f == null) {
                            int iF3 = dVar7.f() + iE2;
                            eVar3.K0(iF3, eVar3.Y() + iF3);
                            b(i14, eVar3, interfaceC1268b, z11);
                        } else {
                            d5.d dVar8 = eVar3.S;
                            if (next2 == dVar8 && dVar7.f59424f == null) {
                                int iF4 = iE2 - dVar8.f();
                                eVar3.K0(iF4 - eVar3.Y(), iF4);
                                b(i14, eVar3, interfaceC1268b, z11);
                            } else if (z15 && !eVar3.k0()) {
                                d(i14, interfaceC1268b, eVar3, z11);
                            }
                        }
                    }
                } else if (eVar3.C() == bVar2 && eVar3.A >= 0 && eVar3.f59478z >= 0 && (eVar3.X() == 8 || (eVar3.f59472w == 0 && eVar3.x() == BitmapDescriptorFactory.HUE_RED))) {
                    if (!eVar3.k0() && !eVar3.n0() && z15 && !eVar3.k0()) {
                        e(i14, eVar, interfaceC1268b, eVar3, z11);
                    }
                }
            }
        }
        eVar.s0();
    }

    private static void c(int i11, d5.a aVar, b.InterfaceC1268b interfaceC1268b, int i12, boolean z11) {
        if (aVar.y1()) {
            if (i12 == 0) {
                b(i11 + 1, aVar, interfaceC1268b, z11);
            } else {
                i(i11 + 1, aVar, interfaceC1268b);
            }
        }
    }

    private static void d(int i11, b.InterfaceC1268b interfaceC1268b, d5.e eVar, boolean z11) {
        float fA = eVar.A();
        int iE = eVar.Q.f59424f.e();
        int iE2 = eVar.S.f59424f.e();
        int iF = eVar.Q.f() + iE;
        int iF2 = iE2 - eVar.S.f();
        if (iE == iE2) {
            fA = 0.5f;
        } else {
            iE = iF;
            iE2 = iF2;
        }
        int iY = eVar.Y();
        int i12 = (iE2 - iE) - iY;
        if (iE > iE2) {
            i12 = (iE - iE2) - iY;
        }
        int i13 = ((int) (i12 > 0 ? (fA * i12) + 0.5f : fA * i12)) + iE;
        int i14 = i13 + iY;
        if (iE > iE2) {
            i14 = i13 - iY;
        }
        eVar.K0(i13, i14);
        b(i11 + 1, eVar, interfaceC1268b, z11);
    }

    private static void e(int i11, d5.e eVar, b.InterfaceC1268b interfaceC1268b, d5.e eVar2, boolean z11) {
        float fA = eVar2.A();
        int iE = eVar2.Q.f59424f.e() + eVar2.Q.f();
        int iE2 = eVar2.S.f59424f.e() - eVar2.S.f();
        if (iE2 >= iE) {
            int iY = eVar2.Y();
            if (eVar2.X() != 8) {
                int i12 = eVar2.f59472w;
                if (i12 == 2) {
                    iY = (int) (eVar2.A() * 0.5f * (eVar instanceof d5.f ? eVar.Y() : eVar.M().Y()));
                } else if (i12 == 0) {
                    iY = iE2 - iE;
                }
                iY = Math.max(eVar2.f59478z, iY);
                int i13 = eVar2.A;
                if (i13 > 0) {
                    iY = Math.min(i13, iY);
                }
            }
            int i14 = iE + ((int) ((fA * ((iE2 - iE) - iY)) + 0.5f));
            eVar2.K0(i14, iY + i14);
            b(i11 + 1, eVar2, interfaceC1268b, z11);
        }
    }

    private static void f(int i11, b.InterfaceC1268b interfaceC1268b, d5.e eVar) {
        float fT = eVar.T();
        int iE = eVar.R.f59424f.e();
        int iE2 = eVar.T.f59424f.e();
        int iF = eVar.R.f() + iE;
        int iF2 = iE2 - eVar.T.f();
        if (iE == iE2) {
            fT = 0.5f;
        } else {
            iE = iF;
            iE2 = iF2;
        }
        int iZ = eVar.z();
        int i12 = (iE2 - iE) - iZ;
        if (iE > iE2) {
            i12 = (iE - iE2) - iZ;
        }
        int i13 = (int) (i12 > 0 ? (fT * i12) + 0.5f : fT * i12);
        int i14 = iE + i13;
        int i15 = i14 + iZ;
        if (iE > iE2) {
            i14 = iE - i13;
            i15 = i14 - iZ;
        }
        eVar.N0(i14, i15);
        i(i11 + 1, eVar, interfaceC1268b);
    }

    private static void g(int i11, d5.e eVar, b.InterfaceC1268b interfaceC1268b, d5.e eVar2) {
        float fT = eVar2.T();
        int iE = eVar2.R.f59424f.e() + eVar2.R.f();
        int iE2 = eVar2.T.f59424f.e() - eVar2.T.f();
        if (iE2 >= iE) {
            int iZ = eVar2.z();
            if (eVar2.X() != 8) {
                int i12 = eVar2.f59474x;
                if (i12 == 2) {
                    iZ = (int) (fT * 0.5f * (eVar instanceof d5.f ? eVar.z() : eVar.M().z()));
                } else if (i12 == 0) {
                    iZ = iE2 - iE;
                }
                iZ = Math.max(eVar2.C, iZ);
                int i13 = eVar2.D;
                if (i13 > 0) {
                    iZ = Math.min(i13, iZ);
                }
            }
            int i14 = iE + ((int) ((fT * ((iE2 - iE) - iZ)) + 0.5f));
            eVar2.N0(i14, iZ + i14);
            i(i11 + 1, eVar2, interfaceC1268b);
        }
    }

    public static void h(d5.f fVar, b.InterfaceC1268b interfaceC1268b) {
        d5.e.b bVarC = fVar.C();
        d5.e.b bVarV = fVar.V();
        f61823b = 0;
        f61824c = 0;
        fVar.y0();
        ArrayList<d5.e> arrayListW1 = fVar.w1();
        int size = arrayListW1.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayListW1.get(i11).y0();
        }
        boolean zV1 = fVar.V1();
        if (bVarC == d5.e.b.FIXED) {
            fVar.K0(0, fVar.Y());
        } else {
            fVar.L0(0);
        }
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            d5.e eVar = arrayListW1.get(i12);
            if (eVar instanceof d5.h) {
                d5.h hVar = (d5.h) eVar;
                if (hVar.x1() == 1) {
                    if (hVar.y1() != -1) {
                        hVar.B1(hVar.y1());
                    } else if (hVar.z1() != -1 && fVar.p0()) {
                        hVar.B1(fVar.Y() - hVar.z1());
                    } else if (fVar.p0()) {
                        hVar.B1((int) ((hVar.A1() * fVar.Y()) + 0.5f));
                    }
                    z11 = true;
                }
            } else if ((eVar instanceof d5.a) && ((d5.a) eVar).C1() == 0) {
                z12 = true;
            }
        }
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                d5.e eVar2 = arrayListW1.get(i13);
                if (eVar2 instanceof d5.h) {
                    d5.h hVar2 = (d5.h) eVar2;
                    if (hVar2.x1() == 1) {
                        b(0, hVar2, interfaceC1268b, zV1);
                    }
                }
            }
        }
        b(0, fVar, interfaceC1268b, zV1);
        if (z12) {
            for (int i14 = 0; i14 < size; i14++) {
                d5.e eVar3 = arrayListW1.get(i14);
                if (eVar3 instanceof d5.a) {
                    d5.a aVar = (d5.a) eVar3;
                    if (aVar.C1() == 0) {
                        c(0, aVar, interfaceC1268b, 0, zV1);
                    }
                }
            }
        }
        if (bVarV == d5.e.b.FIXED) {
            fVar.N0(0, fVar.z());
        } else {
            fVar.M0(0);
        }
        boolean z13 = false;
        boolean z14 = false;
        for (int i15 = 0; i15 < size; i15++) {
            d5.e eVar4 = arrayListW1.get(i15);
            if (eVar4 instanceof d5.h) {
                d5.h hVar3 = (d5.h) eVar4;
                if (hVar3.x1() == 0) {
                    if (hVar3.y1() != -1) {
                        hVar3.B1(hVar3.y1());
                    } else if (hVar3.z1() != -1 && fVar.q0()) {
                        hVar3.B1(fVar.z() - hVar3.z1());
                    } else if (fVar.q0()) {
                        hVar3.B1((int) ((hVar3.A1() * fVar.z()) + 0.5f));
                    }
                    z13 = true;
                }
            } else if ((eVar4 instanceof d5.a) && ((d5.a) eVar4).C1() == 1) {
                z14 = true;
            }
        }
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                d5.e eVar5 = arrayListW1.get(i16);
                if (eVar5 instanceof d5.h) {
                    d5.h hVar4 = (d5.h) eVar5;
                    if (hVar4.x1() == 0) {
                        i(1, hVar4, interfaceC1268b);
                    }
                }
            }
        }
        i(0, fVar, interfaceC1268b);
        if (z14) {
            for (int i17 = 0; i17 < size; i17++) {
                d5.e eVar6 = arrayListW1.get(i17);
                if (eVar6 instanceof d5.a) {
                    d5.a aVar2 = (d5.a) eVar6;
                    if (aVar2.C1() == 1) {
                        c(0, aVar2, interfaceC1268b, 1, zV1);
                    }
                }
            }
        }
        for (int i18 = 0; i18 < size; i18++) {
            d5.e eVar7 = arrayListW1.get(i18);
            if (eVar7.o0() && a(0, eVar7)) {
                d5.f.Y1(0, eVar7, interfaceC1268b, f61822a, b.a.f61785k);
                if (!(eVar7 instanceof d5.h)) {
                    b(0, eVar7, interfaceC1268b, zV1);
                    i(0, eVar7, interfaceC1268b);
                } else if (((d5.h) eVar7).x1() == 0) {
                    i(0, eVar7, interfaceC1268b);
                } else {
                    b(0, eVar7, interfaceC1268b, zV1);
                }
            }
        }
    }

    private static void i(int i11, d5.e eVar, b.InterfaceC1268b interfaceC1268b) {
        d5.d dVar;
        d5.d dVar2;
        d5.d dVar3;
        d5.d dVar4;
        if (eVar.r0()) {
            return;
        }
        boolean z11 = true;
        f61824c++;
        if (!(eVar instanceof d5.f) && eVar.o0()) {
            int i12 = i11 + 1;
            if (a(i12, eVar)) {
                d5.f.Y1(i12, eVar, interfaceC1268b, new b.a(), b.a.f61785k);
            }
        }
        d5.d dVarQ = eVar.q(d5.d.a.TOP);
        d5.d dVarQ2 = eVar.q(d5.d.a.BOTTOM);
        int iE = dVarQ.e();
        int iE2 = dVarQ2.e();
        if (dVarQ.d() != null && dVarQ.n()) {
            Iterator<d5.d> it = dVarQ.d().iterator();
            while (it.hasNext()) {
                d5.d next = it.next();
                d5.e eVar2 = next.f59422d;
                int i13 = i11 + 1;
                boolean zA = a(i13, eVar2);
                if (eVar2.o0() && zA) {
                    d5.f.Y1(i13, eVar2, interfaceC1268b, new b.a(), b.a.f61785k);
                }
                boolean z12 = ((next == eVar2.R && (dVar4 = eVar2.T.f59424f) != null && dVar4.n()) || (next == eVar2.T && (dVar3 = eVar2.R.f59424f) != null && dVar3.n())) ? z11 : false;
                d5.e.b bVarV = eVar2.V();
                boolean z13 = z11;
                d5.e.b bVar = d5.e.b.MATCH_CONSTRAINT;
                if (bVarV != bVar || zA) {
                    if (!eVar2.o0()) {
                        d5.d dVar5 = eVar2.R;
                        if (next == dVar5 && eVar2.T.f59424f == null) {
                            int iF = dVar5.f() + iE;
                            eVar2.N0(iF, eVar2.z() + iF);
                            i(i13, eVar2, interfaceC1268b);
                        } else {
                            d5.d dVar6 = eVar2.T;
                            if (next == dVar6 && dVar5.f59424f == null) {
                                int iF2 = iE - dVar6.f();
                                eVar2.N0(iF2 - eVar2.z(), iF2);
                                i(i13, eVar2, interfaceC1268b);
                            } else if (z12 && !eVar2.m0()) {
                                f(i13, interfaceC1268b, eVar2);
                            }
                        }
                    }
                } else if (eVar2.V() == bVar && eVar2.D >= 0 && eVar2.C >= 0 && ((eVar2.X() == 8 || (eVar2.f59474x == 0 && eVar2.x() == BitmapDescriptorFactory.HUE_RED)) && !eVar2.m0() && !eVar2.n0() && z12 && !eVar2.m0())) {
                    g(i13, eVar, interfaceC1268b, eVar2);
                }
                z11 = z13;
            }
        }
        boolean z14 = z11;
        if (eVar instanceof d5.h) {
            return;
        }
        if (dVarQ2.d() != null && dVarQ2.n()) {
            Iterator<d5.d> it2 = dVarQ2.d().iterator();
            while (it2.hasNext()) {
                d5.d next2 = it2.next();
                d5.e eVar3 = next2.f59422d;
                int i14 = i11 + 1;
                boolean zA2 = a(i14, eVar3);
                if (eVar3.o0() && zA2) {
                    d5.f.Y1(i14, eVar3, interfaceC1268b, new b.a(), b.a.f61785k);
                }
                boolean z15 = ((next2 == eVar3.R && (dVar2 = eVar3.T.f59424f) != null && dVar2.n()) || (next2 == eVar3.T && (dVar = eVar3.R.f59424f) != null && dVar.n())) ? z14 : false;
                d5.e.b bVarV2 = eVar3.V();
                d5.e.b bVar2 = d5.e.b.MATCH_CONSTRAINT;
                if (bVarV2 != bVar2 || zA2) {
                    if (!eVar3.o0()) {
                        d5.d dVar7 = eVar3.R;
                        if (next2 == dVar7 && eVar3.T.f59424f == null) {
                            int iF3 = dVar7.f() + iE2;
                            eVar3.N0(iF3, eVar3.z() + iF3);
                            i(i14, eVar3, interfaceC1268b);
                        } else {
                            d5.d dVar8 = eVar3.T;
                            if (next2 == dVar8 && dVar7.f59424f == null) {
                                int iF4 = iE2 - dVar8.f();
                                eVar3.N0(iF4 - eVar3.z(), iF4);
                                i(i14, eVar3, interfaceC1268b);
                            } else if (z15 && !eVar3.m0()) {
                                f(i14, interfaceC1268b, eVar3);
                            }
                        }
                    }
                } else if (eVar3.V() == bVar2 && eVar3.D >= 0 && eVar3.C >= 0 && (eVar3.X() == 8 || (eVar3.f59474x == 0 && eVar3.x() == BitmapDescriptorFactory.HUE_RED))) {
                    if (!eVar3.m0() && !eVar3.n0() && z15 && !eVar3.m0()) {
                        g(i14, eVar, interfaceC1268b, eVar3);
                    }
                }
            }
        }
        d5.d dVarQ3 = eVar.q(d5.d.a.BASELINE);
        if (dVarQ3.d() != null && dVarQ3.n()) {
            int iE3 = dVarQ3.e();
            for (d5.d dVar9 : dVarQ3.d()) {
                d5.e eVar4 = dVar9.f59422d;
                int i15 = i11 + 1;
                boolean zA3 = a(i15, eVar4);
                if (eVar4.o0() && zA3) {
                    d5.f.Y1(i15, eVar4, interfaceC1268b, new b.a(), b.a.f61785k);
                }
                if (eVar4.V() != d5.e.b.MATCH_CONSTRAINT || zA3) {
                    if (!eVar4.o0() && dVar9 == eVar4.U) {
                        eVar4.J0(dVar9.f() + iE3);
                        i(i15, eVar4, interfaceC1268b);
                    }
                }
            }
        }
        eVar.t0();
    }
}
