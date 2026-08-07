package e5;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class i {
    public static o a(d5.e eVar, int i11, ArrayList<o> arrayList, o oVar) {
        int iX1;
        int i12 = i11 == 0 ? eVar.S0 : eVar.T0;
        if (i12 != -1 && (oVar == null || i12 != oVar.c())) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                o oVar2 = arrayList.get(i13);
                if (oVar2.c() == i12) {
                    if (oVar != null) {
                        oVar.g(i11, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                    break;
                }
            }
        } else if (i12 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof d5.j) && (iX1 = ((d5.j) eVar).x1(i11)) != -1) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    o oVar3 = arrayList.get(i14);
                    if (oVar3.c() == iX1) {
                        oVar = oVar3;
                        break;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o(i11);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof d5.h) {
                d5.h hVar = (d5.h) eVar;
                hVar.w1().c(hVar.x1() == 0 ? 1 : 0, arrayList, oVar);
            }
            if (i11 == 0) {
                eVar.S0 = oVar.c();
                eVar.Q.c(i11, arrayList, oVar);
                eVar.S.c(i11, arrayList, oVar);
            } else {
                eVar.T0 = oVar.c();
                eVar.R.c(i11, arrayList, oVar);
                eVar.U.c(i11, arrayList, oVar);
                eVar.T.c(i11, arrayList, oVar);
            }
            eVar.X.c(i11, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList<o> arrayList, int i11) {
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            o oVar = arrayList.get(i12);
            if (i11 == oVar.c()) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:176:0x0349  */
    public static boolean c(d5.f fVar, b.InterfaceC1268b interfaceC1268b) {
        o oVar;
        boolean z11;
        o oVar2;
        ArrayList<d5.e> arrayListW1 = fVar.w1();
        int size = arrayListW1.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            d5.e eVar = arrayListW1.get(i12);
            if (!d(fVar.C(), fVar.V(), eVar.C(), eVar.V()) || (eVar instanceof d5.g)) {
                return false;
            }
        }
        int i13 = 0;
        ArrayList arrayList = null;
        ArrayList<d5.j> arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList<d5.j> arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        while (i13 < size) {
            d5.e eVar2 = arrayListW1.get(i13);
            if (!d(fVar.C(), fVar.V(), eVar2.C(), eVar2.V())) {
                d5.f.Y1(i11, eVar2, interfaceC1268b, fVar.f59506z1, b.a.f61785k);
            }
            boolean z12 = eVar2 instanceof d5.h;
            if (z12) {
                d5.h hVar = (d5.h) eVar2;
                if (hVar.x1() == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(hVar);
                }
                if (hVar.x1() == 1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(hVar);
                }
            }
            if (eVar2 instanceof d5.j) {
                if (eVar2 instanceof d5.a) {
                    d5.a aVar = (d5.a) eVar2;
                    if (aVar.C1() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(aVar);
                    }
                    if (aVar.C1() == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(aVar);
                    }
                } else {
                    d5.j jVar = (d5.j) eVar2;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(jVar);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(jVar);
                }
            }
            if (eVar2.Q.f59424f == null && eVar2.S.f59424f == null && !z12 && !(eVar2 instanceof d5.a)) {
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(eVar2);
            }
            if (eVar2.R.f59424f == null && eVar2.T.f59424f == null && eVar2.U.f59424f == null && !z12 && !(eVar2 instanceof d5.a)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(eVar2);
            }
            i13++;
            i11 = 0;
        }
        ArrayList<o> arrayList7 = new ArrayList<>();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a((d5.h) it.next(), 0, arrayList7, null);
            }
        }
        o oVar3 = null;
        int i14 = 0;
        if (arrayList2 != null) {
            for (d5.j jVar2 : arrayList2) {
                o oVarA = a(jVar2, i14, arrayList7, oVar3);
                jVar2.w1(arrayList7, i14, oVarA);
                oVarA.b(arrayList7);
                oVar3 = null;
                i14 = 0;
            }
        }
        d5.d dVarQ = fVar.q(d5.d.a.LEFT);
        if (dVarQ.d() != null) {
            Iterator<d5.d> it2 = dVarQ.d().iterator();
            while (it2.hasNext()) {
                a(it2.next().f59422d, 0, arrayList7, null);
            }
        }
        d5.d dVarQ2 = fVar.q(d5.d.a.RIGHT);
        if (dVarQ2.d() != null) {
            Iterator<d5.d> it3 = dVarQ2.d().iterator();
            while (it3.hasNext()) {
                a(it3.next().f59422d, 0, arrayList7, null);
            }
        }
        d5.d dVarQ3 = fVar.q(d5.d.a.CENTER);
        if (dVarQ3.d() != null) {
            Iterator<d5.d> it4 = dVarQ3.d().iterator();
            while (it4.hasNext()) {
                a(it4.next().f59422d, 0, arrayList7, null);
            }
        }
        o oVar4 = null;
        if (arrayList5 != null) {
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                a((d5.e) it5.next(), 0, arrayList7, null);
            }
        }
        if (arrayList3 != null) {
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                a((d5.h) it6.next(), 1, arrayList7, null);
            }
        }
        int i15 = 1;
        if (arrayList4 != null) {
            for (d5.j jVar3 : arrayList4) {
                o oVarA2 = a(jVar3, i15, arrayList7, oVar4);
                jVar3.w1(arrayList7, i15, oVarA2);
                oVarA2.b(arrayList7);
                oVar4 = null;
                i15 = 1;
            }
        }
        d5.d dVarQ4 = fVar.q(d5.d.a.TOP);
        if (dVarQ4.d() != null) {
            Iterator<d5.d> it7 = dVarQ4.d().iterator();
            while (it7.hasNext()) {
                a(it7.next().f59422d, 1, arrayList7, null);
            }
        }
        d5.d dVarQ5 = fVar.q(d5.d.a.BASELINE);
        if (dVarQ5.d() != null) {
            Iterator<d5.d> it8 = dVarQ5.d().iterator();
            while (it8.hasNext()) {
                a(it8.next().f59422d, 1, arrayList7, null);
            }
        }
        d5.d dVarQ6 = fVar.q(d5.d.a.BOTTOM);
        if (dVarQ6.d() != null) {
            Iterator<d5.d> it9 = dVarQ6.d().iterator();
            while (it9.hasNext()) {
                a(it9.next().f59422d, 1, arrayList7, null);
            }
        }
        d5.d dVarQ7 = fVar.q(d5.d.a.CENTER);
        if (dVarQ7.d() != null) {
            Iterator<d5.d> it10 = dVarQ7.d().iterator();
            while (it10.hasNext()) {
                a(it10.next().f59422d, 1, arrayList7, null);
            }
        }
        if (arrayList6 != null) {
            Iterator it11 = arrayList6.iterator();
            while (it11.hasNext()) {
                a((d5.e) it11.next(), 1, arrayList7, null);
            }
        }
        for (int i16 = 0; i16 < size; i16++) {
            d5.e eVar3 = arrayListW1.get(i16);
            if (eVar3.u0()) {
                o oVarB = b(arrayList7, eVar3.S0);
                o oVarB2 = b(arrayList7, eVar3.T0);
                if (oVarB != null && oVarB2 != null) {
                    oVarB.g(0, oVarB2);
                    oVarB2.i(2);
                    arrayList7.remove(oVarB);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (fVar.C() == d5.e.b.WRAP_CONTENT) {
            oVar = null;
            int i17 = 0;
            for (o oVar5 : arrayList7) {
                if (oVar5.d() != 1) {
                    oVar5.h(false);
                    int iF = oVar5.f(fVar.Q1(), 0);
                    if (iF > i17) {
                        oVar = oVar5;
                        i17 = iF;
                    }
                }
            }
            if (oVar != null) {
                fVar.U0(d5.e.b.FIXED);
                fVar.p1(i17);
                oVar.h(true);
            } else {
                oVar = null;
            }
        } else {
            oVar = null;
        }
        if (fVar.V() == d5.e.b.WRAP_CONTENT) {
            o oVar6 = null;
            int i18 = 0;
            for (o oVar7 : arrayList7) {
                if (oVar7.d() != 0) {
                    oVar7.h(false);
                    int iF2 = oVar7.f(fVar.Q1(), 1);
                    if (iF2 > i18) {
                        oVar6 = oVar7;
                        i18 = iF2;
                    }
                }
            }
            z11 = true;
            if (oVar6 != null) {
                fVar.l1(d5.e.b.FIXED);
                fVar.Q0(i18);
                oVar6.h(true);
                oVar2 = oVar6;
            }
            if (oVar == null || oVar2 != null) {
                return z11;
            }
            return false;
        }
        z11 = true;
        oVar2 = null;
        if (oVar == null) {
        }
        return z11;
    }

    public static boolean d(d5.e.b bVar, d5.e.b bVar2, d5.e.b bVar3, d5.e.b bVar4) {
        d5.e.b bVar5;
        d5.e.b bVar6;
        d5.e.b bVar7 = d5.e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = d5.e.b.WRAP_CONTENT) || (bVar3 == d5.e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = d5.e.b.WRAP_CONTENT) || (bVar4 == d5.e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
