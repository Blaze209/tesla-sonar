package e5;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d5.f f61800a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d5.f f61803d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f61801b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f61802c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<p> f61804e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<m> f61805f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b.InterfaceC1268b f61806g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b.a f61807h = new b.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ArrayList<m> f61808i = new ArrayList<>();

    public e(d5.f fVar) {
        this.f61800a = fVar;
        this.f61803d = fVar;
    }

    private void a(f fVar, int i11, int i12, f fVar2, ArrayList<m> arrayList, m mVar) {
        int i13;
        f fVar3;
        ArrayList<m> arrayList2;
        p pVar = fVar.f61812d;
        if (pVar.f61854c == null) {
            d5.f fVar4 = this.f61800a;
            if (pVar == fVar4.f59436e || pVar == fVar4.f59438f) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i12);
                arrayList.add(mVar);
            }
            m mVar2 = mVar;
            pVar.f61854c = mVar2;
            mVar2.a(pVar);
            for (d dVar : pVar.f61859h.f61819k) {
                if (dVar instanceof f) {
                    i13 = i11;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                    a((f) dVar, i13, 0, fVar3, arrayList2, mVar2);
                } else {
                    i13 = i11;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                }
                i11 = i13;
                fVar2 = fVar3;
                arrayList = arrayList2;
            }
            int i14 = i11;
            f fVar5 = fVar2;
            ArrayList<m> arrayList3 = arrayList;
            for (d dVar2 : pVar.f61860i.f61819k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i14, 1, fVar5, arrayList3, mVar2);
                }
            }
            if (i14 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f61835k.f61819k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i14, 2, fVar5, arrayList3, mVar2);
                    }
                }
            }
            for (f fVar6 : pVar.f61859h.f61820l) {
                if (fVar6 == fVar5) {
                    mVar2.f61829b = true;
                }
                a(fVar6, i14, 0, fVar5, arrayList3, mVar2);
            }
            for (f fVar7 : pVar.f61860i.f61820l) {
                if (fVar7 == fVar5) {
                    mVar2.f61829b = true;
                }
                a(fVar7, i14, 1, fVar5, arrayList3, mVar2);
            }
            if (i14 == 1 && (pVar instanceof n)) {
                Iterator<f> it = ((n) pVar).f61835k.f61820l.iterator();
                while (it.hasNext()) {
                    a(it.next(), i14, 2, fVar5, arrayList3, mVar2);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:169:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private boolean b(d5.f fVar) {
        d5.e.b bVar;
        int i11;
        char c11;
        d5.e.b bVar2;
        d5.e.b bVar3;
        d5.e.b bVar4;
        d5.e.b bVar5;
        for (d5.e eVar : fVar.V0) {
            d5.e.b[] bVarArr = eVar.f59431b0;
            d5.e.b bVar6 = bVarArr[0];
            d5.e.b bVar7 = bVarArr[1];
            if (eVar.X() == 8) {
                eVar.f59428a = true;
            } else {
                if (eVar.B < 1.0f && bVar6 == d5.e.b.MATCH_CONSTRAINT) {
                    eVar.f59472w = 2;
                }
                if (eVar.E < 1.0f && bVar7 == d5.e.b.MATCH_CONSTRAINT) {
                    eVar.f59474x = 2;
                }
                if (eVar.x() > BitmapDescriptorFactory.HUE_RED) {
                    d5.e.b bVar8 = d5.e.b.MATCH_CONSTRAINT;
                    if (bVar6 == bVar8 && (bVar7 == d5.e.b.WRAP_CONTENT || bVar7 == d5.e.b.FIXED)) {
                        eVar.f59472w = 3;
                    } else if (bVar7 == bVar8 && (bVar6 == d5.e.b.WRAP_CONTENT || bVar6 == d5.e.b.FIXED)) {
                        eVar.f59474x = 3;
                    } else if (bVar6 == bVar8 && bVar7 == bVar8) {
                        if (eVar.f59472w == 0) {
                            eVar.f59472w = 3;
                        }
                        if (eVar.f59474x == 0) {
                            eVar.f59474x = 3;
                        }
                    }
                }
                d5.e.b bVar9 = d5.e.b.MATCH_CONSTRAINT;
                if (bVar6 == bVar9 && eVar.f59472w == 1 && (eVar.Q.f59424f == null || eVar.S.f59424f == null)) {
                    bVar6 = d5.e.b.WRAP_CONTENT;
                }
                if (bVar7 == bVar9 && eVar.f59474x == 1 && (eVar.R.f59424f == null || eVar.T.f59424f == null)) {
                    bVar7 = d5.e.b.WRAP_CONTENT;
                }
                l lVar = eVar.f59436e;
                lVar.f61855d = bVar6;
                int i12 = eVar.f59472w;
                lVar.f61852a = i12;
                n nVar = eVar.f59438f;
                nVar.f61855d = bVar7;
                int i13 = eVar.f59474x;
                nVar.f61852a = i13;
                d5.e.b bVar10 = d5.e.b.MATCH_PARENT;
                if ((bVar6 == bVar10 || bVar6 == d5.e.b.FIXED || bVar6 == d5.e.b.WRAP_CONTENT) && (bVar7 == bVar10 || bVar7 == d5.e.b.FIXED || bVar7 == d5.e.b.WRAP_CONTENT)) {
                    d5.e.b bVar11 = bVar7;
                    d5.e.b bVar12 = bVar6;
                    int iY = eVar.Y();
                    if (bVar12 == bVar10) {
                        iY = (fVar.Y() - eVar.Q.f59425g) - eVar.S.f59425g;
                        bVar12 = d5.e.b.FIXED;
                    }
                    int i14 = iY;
                    int iZ = eVar.z();
                    if (bVar11 == bVar10) {
                        iZ = (fVar.z() - eVar.R.f59425g) - eVar.T.f59425g;
                        bVar11 = d5.e.b.FIXED;
                    }
                    l(eVar, bVar12, i14, bVar11, iZ);
                    eVar.f59436e.f61856e.d(eVar.Y());
                    eVar.f59438f.f61856e.d(eVar.z());
                    eVar.f59428a = true;
                } else {
                    if (bVar6 == bVar9) {
                        bVar2 = bVar9;
                        d5.e.b bVar13 = d5.e.b.WRAP_CONTENT;
                        c11 = 0;
                        if (bVar7 != bVar13 && bVar7 != d5.e.b.FIXED) {
                            bVar = bVar7;
                            i11 = 3;
                        } else if (i12 == 3) {
                            if (bVar7 == bVar13) {
                                l(eVar, bVar13, 0, bVar13, 0);
                            }
                            int iZ2 = eVar.z();
                            int i15 = (int) ((iZ2 * eVar.f59439f0) + 0.5f);
                            d5.e.b bVar14 = d5.e.b.FIXED;
                            l(eVar, bVar14, i15, bVar14, iZ2);
                            eVar.f59436e.f61856e.d(eVar.Y());
                            eVar.f59438f.f61856e.d(eVar.z());
                            eVar.f59428a = true;
                        } else if (i12 == 1) {
                            l(eVar, bVar13, 0, bVar7, 0);
                            eVar.f59436e.f61856e.f61821m = eVar.Y();
                        } else {
                            bVar = bVar7;
                            i11 = 3;
                            if (i12 == 2) {
                                d5.e.b bVar15 = fVar.f59431b0[0];
                                d5.e.b bVar16 = d5.e.b.FIXED;
                                if (bVar15 == bVar16 || bVar15 == bVar10) {
                                    l(eVar, bVar16, (int) ((eVar.B * fVar.Y()) + 0.5f), bVar, eVar.z());
                                    eVar.f59436e.f61856e.d(eVar.Y());
                                    eVar.f59438f.f61856e.d(eVar.z());
                                    eVar.f59428a = true;
                                }
                            } else {
                                d5.d[] dVarArr = eVar.Y;
                                if (dVarArr[0].f59424f == null || dVarArr[1].f59424f == null) {
                                    l(eVar, bVar13, 0, bVar, 0);
                                    eVar.f59436e.f61856e.d(eVar.Y());
                                    eVar.f59438f.f61856e.d(eVar.z());
                                    eVar.f59428a = true;
                                } else if (bVar == bVar2 || !(bVar6 == (bVar4 = d5.e.b.WRAP_CONTENT) || bVar6 == d5.e.b.FIXED)) {
                                    bVar3 = bVar6;
                                    if (bVar3 != bVar2 && bVar == bVar2) {
                                        if (i12 == 1 || i13 == 1) {
                                            d5.e.b bVar17 = d5.e.b.WRAP_CONTENT;
                                            l(eVar, bVar17, 0, bVar17, 0);
                                            eVar.f59436e.f61856e.f61821m = eVar.Y();
                                            eVar.f59438f.f61856e.f61821m = eVar.z();
                                        } else if (i13 == 2 && i12 == 2) {
                                            d5.e.b[] bVarArr2 = fVar.f59431b0;
                                            d5.e.b bVar18 = bVarArr2[c11];
                                            d5.e.b bVar19 = d5.e.b.FIXED;
                                            if (bVar18 == bVar19 && bVarArr2[1] == bVar19) {
                                                l(eVar, bVar19, (int) ((eVar.B * fVar.Y()) + 0.5f), bVar19, (int) ((eVar.E * fVar.z()) + 0.5f));
                                                eVar.f59436e.f61856e.d(eVar.Y());
                                                eVar.f59438f.f61856e.d(eVar.z());
                                                eVar.f59428a = true;
                                            }
                                        }
                                    }
                                } else if (i13 == i11) {
                                    if (bVar6 == bVar4) {
                                        l(eVar, bVar4, 0, bVar4, 0);
                                    }
                                    int iY2 = eVar.Y();
                                    float f11 = eVar.f59439f0;
                                    if (eVar.y() == -1) {
                                        f11 = 1.0f / f11;
                                    }
                                    d5.e.b bVar20 = d5.e.b.FIXED;
                                    l(eVar, bVar20, iY2, bVar20, (int) ((iY2 * f11) + 0.5f));
                                    eVar.f59436e.f61856e.d(eVar.Y());
                                    eVar.f59438f.f61856e.d(eVar.z());
                                    eVar.f59428a = true;
                                } else if (i13 == 1) {
                                    l(eVar, bVar6, 0, bVar4, 0);
                                    eVar.f59438f.f61856e.f61821m = eVar.z();
                                } else {
                                    bVar3 = bVar6;
                                    if (i13 == 2) {
                                        d5.e.b bVar21 = fVar.f59431b0[1];
                                        bVar5 = bVar;
                                        d5.e.b bVar22 = d5.e.b.FIXED;
                                        if (bVar21 == bVar22 || bVar21 == bVar10) {
                                            l(eVar, bVar3, eVar.Y(), bVar22, (int) ((eVar.E * fVar.z()) + 0.5f));
                                            eVar.f59436e.f61856e.d(eVar.Y());
                                            eVar.f59438f.f61856e.d(eVar.z());
                                            eVar.f59428a = true;
                                        } else {
                                            bVar = bVar5;
                                            if (bVar3 != bVar2) {
                                            }
                                        }
                                    } else {
                                        bVar5 = bVar;
                                        d5.d[] dVarArr2 = eVar.Y;
                                        if (dVarArr2[2].f59424f == null || dVarArr2[i11].f59424f == null) {
                                            l(eVar, bVar4, 0, bVar5, 0);
                                            eVar.f59436e.f61856e.d(eVar.Y());
                                            eVar.f59438f.f61856e.d(eVar.z());
                                            eVar.f59428a = true;
                                        } else {
                                            bVar = bVar5;
                                            if (bVar3 != bVar2) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        bVar = bVar7;
                        i11 = 3;
                        c11 = 0;
                        bVar2 = bVar9;
                    }
                    if (bVar == bVar2) {
                    }
                    bVar3 = bVar6;
                    if (bVar3 != bVar2) {
                    }
                }
            }
        }
        return false;
    }

    private int e(d5.f fVar, int i11) {
        int size = this.f61808i.size();
        long jMax = 0;
        for (int i12 = 0; i12 < size; i12++) {
            jMax = Math.max(jMax, this.f61808i.get(i12).b(fVar, i11));
        }
        return (int) jMax;
    }

    private void i(p pVar, int i11, ArrayList<m> arrayList) {
        for (d dVar : pVar.f61859h.f61819k) {
            if (dVar instanceof f) {
                a((f) dVar, i11, 0, pVar.f61860i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f61859h, i11, 0, pVar.f61860i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f61860i.f61819k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i11, 1, pVar.f61859h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f61860i, i11, 1, pVar.f61859h, arrayList, null);
            }
        }
        int i12 = i11;
        if (i12 == 1) {
            for (d dVar3 : ((n) pVar).f61835k.f61819k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i12, 2, null, arrayList, null);
                }
                i12 = i11;
            }
        }
    }

    private void l(d5.e eVar, d5.e.b bVar, int i11, d5.e.b bVar2, int i12) {
        b.a aVar = this.f61807h;
        aVar.f61788a = bVar;
        aVar.f61789b = bVar2;
        aVar.f61790c = i11;
        aVar.f61791d = i12;
        this.f61806g.b(eVar, aVar);
        eVar.p1(this.f61807h.f61792e);
        eVar.Q0(this.f61807h.f61793f);
        eVar.P0(this.f61807h.f61795h);
        eVar.F0(this.f61807h.f61794g);
    }

    public void c() {
        d(this.f61804e);
        this.f61808i.clear();
        m.f61827h = 0;
        i(this.f61800a.f59436e, 0, this.f61808i);
        i(this.f61800a.f59438f, 1, this.f61808i);
        this.f61801b = false;
    }

    public void d(ArrayList<p> arrayList) {
        arrayList.clear();
        this.f61803d.f59436e.f();
        this.f61803d.f59438f.f();
        arrayList.add(this.f61803d.f59436e);
        arrayList.add(this.f61803d.f59438f);
        HashSet hashSet = null;
        for (d5.e eVar : this.f61803d.V0) {
            if (eVar instanceof d5.h) {
                arrayList.add(new j(eVar));
            } else {
                if (eVar.k0()) {
                    if (eVar.f59432c == null) {
                        eVar.f59432c = new c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f59432c);
                } else {
                    arrayList.add(eVar.f59436e);
                }
                if (eVar.m0()) {
                    if (eVar.f59434d == null) {
                        eVar.f59434d = new c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f59434d);
                } else {
                    arrayList.add(eVar.f59438f);
                }
                if (eVar instanceof d5.j) {
                    arrayList.add(new k(eVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
        for (p pVar : arrayList) {
            if (pVar.f61853b != this.f61803d) {
                pVar.d();
            }
        }
    }

    public boolean f(boolean z11) {
        boolean z12;
        boolean z13 = false;
        if (this.f61801b || this.f61802c) {
            for (d5.e eVar : this.f61800a.V0) {
                eVar.p();
                eVar.f59428a = false;
                eVar.f59436e.r();
                eVar.f59438f.q();
            }
            this.f61800a.p();
            d5.f fVar = this.f61800a;
            fVar.f59428a = false;
            fVar.f59436e.r();
            this.f61800a.f59438f.q();
            this.f61802c = false;
        }
        if (b(this.f61803d)) {
            return false;
        }
        this.f61800a.r1(0);
        this.f61800a.s1(0);
        d5.e.b bVarW = this.f61800a.w(0);
        d5.e.b bVarW2 = this.f61800a.w(1);
        if (this.f61801b) {
            c();
        }
        int iZ = this.f61800a.Z();
        int iA0 = this.f61800a.a0();
        this.f61800a.f59436e.f61859h.d(iZ);
        this.f61800a.f59438f.f61859h.d(iA0);
        m();
        d5.e.b bVar = d5.e.b.WRAP_CONTENT;
        if (bVarW == bVar || bVarW2 == bVar) {
            if (z11) {
                Iterator<p> it = this.f61804e.iterator();
                while (it.hasNext()) {
                    if (!it.next().m()) {
                        z11 = false;
                        break;
                    }
                }
            }
            if (z11 && bVarW == d5.e.b.WRAP_CONTENT) {
                this.f61800a.U0(d5.e.b.FIXED);
                d5.f fVar2 = this.f61800a;
                fVar2.p1(e(fVar2, 0));
                d5.f fVar3 = this.f61800a;
                fVar3.f59436e.f61856e.d(fVar3.Y());
            }
            if (z11 && bVarW2 == d5.e.b.WRAP_CONTENT) {
                this.f61800a.l1(d5.e.b.FIXED);
                d5.f fVar4 = this.f61800a;
                fVar4.Q0(e(fVar4, 1));
                d5.f fVar5 = this.f61800a;
                fVar5.f59438f.f61856e.d(fVar5.z());
            }
        }
        d5.f fVar6 = this.f61800a;
        d5.e.b bVar2 = fVar6.f59431b0[0];
        d5.e.b bVar3 = d5.e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == d5.e.b.MATCH_PARENT) {
            int iY = fVar6.Y() + iZ;
            this.f61800a.f59436e.f61860i.d(iY);
            this.f61800a.f59436e.f61856e.d(iY - iZ);
            m();
            d5.f fVar7 = this.f61800a;
            d5.e.b bVar4 = fVar7.f59431b0[1];
            if (bVar4 == bVar3 || bVar4 == d5.e.b.MATCH_PARENT) {
                int iZ2 = fVar7.z() + iA0;
                this.f61800a.f59438f.f61860i.d(iZ2);
                this.f61800a.f59438f.f61856e.d(iZ2 - iA0);
            }
            m();
            z12 = true;
        } else {
            z12 = false;
        }
        for (p pVar : this.f61804e) {
            if (pVar.f61853b != this.f61800a || pVar.f61858g) {
                pVar.e();
            }
        }
        for (p pVar2 : this.f61804e) {
            if (z12 || pVar2.f61853b != this.f61800a) {
                if (!pVar2.f61859h.f61818j || ((!pVar2.f61860i.f61818j && !(pVar2 instanceof j)) || (!pVar2.f61856e.f61818j && !(pVar2 instanceof c) && !(pVar2 instanceof j)))) {
                    this.f61800a.U0(bVarW);
                    this.f61800a.l1(bVarW2);
                    return z13;
                }
            }
        }
        z13 = true;
        this.f61800a.U0(bVarW);
        this.f61800a.l1(bVarW2);
        return z13;
    }

    public boolean g(boolean z11) {
        if (this.f61801b) {
            for (d5.e eVar : this.f61800a.V0) {
                eVar.p();
                eVar.f59428a = false;
                l lVar = eVar.f59436e;
                lVar.f61856e.f61818j = false;
                lVar.f61858g = false;
                lVar.r();
                n nVar = eVar.f59438f;
                nVar.f61856e.f61818j = false;
                nVar.f61858g = false;
                nVar.q();
            }
            this.f61800a.p();
            d5.f fVar = this.f61800a;
            fVar.f59428a = false;
            l lVar2 = fVar.f59436e;
            lVar2.f61856e.f61818j = false;
            lVar2.f61858g = false;
            lVar2.r();
            n nVar2 = this.f61800a.f59438f;
            nVar2.f61856e.f61818j = false;
            nVar2.f61858g = false;
            nVar2.q();
            c();
        }
        if (b(this.f61803d)) {
            return false;
        }
        this.f61800a.r1(0);
        this.f61800a.s1(0);
        this.f61800a.f59436e.f61859h.d(0);
        this.f61800a.f59438f.f61859h.d(0);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c1  */
    public boolean h(boolean z11, int i11) {
        boolean z12;
        d5.e.b bVar;
        boolean z13 = false;
        d5.e.b bVarW = this.f61800a.w(0);
        d5.e.b bVarW2 = this.f61800a.w(1);
        int iZ = this.f61800a.Z();
        int iA0 = this.f61800a.a0();
        if (z11 && (bVarW == (bVar = d5.e.b.WRAP_CONTENT) || bVarW2 == bVar)) {
            for (p pVar : this.f61804e) {
                if (pVar.f61857f == i11 && !pVar.m()) {
                    z11 = false;
                    break;
                }
            }
            if (i11 == 0) {
                if (z11 && bVarW == d5.e.b.WRAP_CONTENT) {
                    this.f61800a.U0(d5.e.b.FIXED);
                    d5.f fVar = this.f61800a;
                    fVar.p1(e(fVar, 0));
                    d5.f fVar2 = this.f61800a;
                    fVar2.f59436e.f61856e.d(fVar2.Y());
                }
            } else if (z11 && bVarW2 == d5.e.b.WRAP_CONTENT) {
                this.f61800a.l1(d5.e.b.FIXED);
                d5.f fVar3 = this.f61800a;
                fVar3.Q0(e(fVar3, 1));
                d5.f fVar4 = this.f61800a;
                fVar4.f59438f.f61856e.d(fVar4.z());
            }
        }
        if (i11 == 0) {
            d5.f fVar5 = this.f61800a;
            d5.e.b bVar2 = fVar5.f59431b0[0];
            if (bVar2 == d5.e.b.FIXED || bVar2 == d5.e.b.MATCH_PARENT) {
                int iY = fVar5.Y() + iZ;
                this.f61800a.f59436e.f61860i.d(iY);
                this.f61800a.f59436e.f61856e.d(iY - iZ);
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            d5.f fVar6 = this.f61800a;
            d5.e.b bVar3 = fVar6.f59431b0[1];
            if (bVar3 == d5.e.b.FIXED || bVar3 == d5.e.b.MATCH_PARENT) {
                int iZ2 = fVar6.z() + iA0;
                this.f61800a.f59438f.f61860i.d(iZ2);
                this.f61800a.f59438f.f61856e.d(iZ2 - iA0);
                z12 = true;
            } else {
                z12 = false;
            }
        }
        m();
        for (p pVar2 : this.f61804e) {
            if (pVar2.f61857f == i11 && (pVar2.f61853b != this.f61800a || pVar2.f61858g)) {
                pVar2.e();
            }
        }
        for (p pVar3 : this.f61804e) {
            if (pVar3.f61857f == i11 && (z12 || pVar3.f61853b != this.f61800a)) {
                if (!pVar3.f61859h.f61818j || !pVar3.f61860i.f61818j || (!(pVar3 instanceof c) && !pVar3.f61856e.f61818j)) {
                    this.f61800a.U0(bVarW);
                    this.f61800a.l1(bVarW2);
                    return z13;
                }
            }
        }
        z13 = true;
        this.f61800a.U0(bVarW);
        this.f61800a.l1(bVarW2);
        return z13;
    }

    public void j() {
        this.f61801b = true;
    }

    public void k() {
        this.f61802c = true;
    }

    public void m() {
        g gVar;
        for (d5.e eVar : this.f61800a.V0) {
            if (!eVar.f59428a) {
                d5.e.b[] bVarArr = eVar.f59431b0;
                boolean z11 = false;
                d5.e.b bVar = bVarArr[0];
                d5.e.b bVar2 = bVarArr[1];
                int i11 = eVar.f59472w;
                int i12 = eVar.f59474x;
                d5.e.b bVar3 = d5.e.b.WRAP_CONTENT;
                boolean z12 = bVar == bVar3 || (bVar == d5.e.b.MATCH_CONSTRAINT && i11 == 1);
                if (bVar2 == bVar3 || (bVar2 == d5.e.b.MATCH_CONSTRAINT && i12 == 1)) {
                    z11 = true;
                }
                g gVar2 = eVar.f59436e.f61856e;
                boolean z13 = gVar2.f61818j;
                g gVar3 = eVar.f59438f.f61856e;
                boolean z14 = gVar3.f61818j;
                if (z13 && z14) {
                    d5.e.b bVar4 = d5.e.b.FIXED;
                    l(eVar, bVar4, gVar2.f61815g, bVar4, gVar3.f61815g);
                    eVar.f59428a = true;
                } else if (z13 && z11) {
                    l(eVar, d5.e.b.FIXED, gVar2.f61815g, bVar3, gVar3.f61815g);
                    if (bVar2 == d5.e.b.MATCH_CONSTRAINT) {
                        eVar.f59438f.f61856e.f61821m = eVar.z();
                    } else {
                        eVar.f59438f.f61856e.d(eVar.z());
                        eVar.f59428a = true;
                    }
                } else if (z14 && z12) {
                    l(eVar, bVar3, gVar2.f61815g, d5.e.b.FIXED, gVar3.f61815g);
                    if (bVar == d5.e.b.MATCH_CONSTRAINT) {
                        eVar.f59436e.f61856e.f61821m = eVar.Y();
                    } else {
                        eVar.f59436e.f61856e.d(eVar.Y());
                        eVar.f59428a = true;
                    }
                }
                if (eVar.f59428a && (gVar = eVar.f59438f.f61836l) != null) {
                    gVar.d(eVar.r());
                }
            }
        }
    }

    public void n(b.InterfaceC1268b interfaceC1268b) {
        this.f61806g = interfaceC1268b;
    }
}
