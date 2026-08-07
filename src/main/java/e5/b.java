package e5;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<d5.e> f61782a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f61783b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d5.f f61784c;

    public static class a {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static int f61785k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static int f61786l = 1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static int f61787m = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d5.e.b f61788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d5.e.b f61789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f61790c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f61791d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f61792e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f61793f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f61794g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f61795h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f61796i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f61797j;
    }

    /* JADX INFO: renamed from: e5.b$b, reason: collision with other inner class name */
    public interface InterfaceC1268b {
        void a();

        void b(d5.e eVar, a aVar);
    }

    public b(d5.f fVar) {
        this.f61784c = fVar;
    }

    private boolean a(InterfaceC1268b interfaceC1268b, d5.e eVar, int i11) {
        this.f61783b.f61788a = eVar.C();
        this.f61783b.f61789b = eVar.V();
        this.f61783b.f61790c = eVar.Y();
        this.f61783b.f61791d = eVar.z();
        a aVar = this.f61783b;
        aVar.f61796i = false;
        aVar.f61797j = i11;
        d5.e.b bVar = aVar.f61788a;
        d5.e.b bVar2 = d5.e.b.MATCH_CONSTRAINT;
        boolean z11 = bVar == bVar2;
        boolean z12 = aVar.f61789b == bVar2;
        boolean z13 = z11 && eVar.f59439f0 > BitmapDescriptorFactory.HUE_RED;
        boolean z14 = z12 && eVar.f59439f0 > BitmapDescriptorFactory.HUE_RED;
        if (z13 && eVar.f59476y[0] == 4) {
            aVar.f61788a = d5.e.b.FIXED;
        }
        if (z14 && eVar.f59476y[1] == 4) {
            aVar.f61789b = d5.e.b.FIXED;
        }
        interfaceC1268b.b(eVar, aVar);
        eVar.p1(this.f61783b.f61792e);
        eVar.Q0(this.f61783b.f61793f);
        eVar.P0(this.f61783b.f61795h);
        eVar.F0(this.f61783b.f61794g);
        a aVar2 = this.f61783b;
        aVar2.f61797j = a.f61785k;
        return aVar2.f61796i;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0097 A[PHI: r10
      0x0097: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0061, B:34:0x0067, B:36:0x006b, B:54:0x0094, B:52:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    private void b(d5.f fVar) {
        boolean z11;
        l lVar;
        n nVar;
        int size = fVar.V0.size();
        boolean zZ1 = fVar.Z1(64);
        InterfaceC1268b interfaceC1268bO1 = fVar.O1();
        for (int i11 = 0; i11 < size; i11++) {
            d5.e eVar = fVar.V0.get(i11);
            if (!(eVar instanceof d5.h) && !(eVar instanceof d5.a) && !eVar.n0() && (!zZ1 || (lVar = eVar.f59436e) == null || (nVar = eVar.f59438f) == null || !lVar.f61856e.f61818j || !nVar.f61856e.f61818j)) {
                d5.e.b bVarW = eVar.w(0);
                d5.e.b bVarW2 = eVar.w(1);
                d5.e.b bVar = d5.e.b.MATCH_CONSTRAINT;
                boolean z12 = bVarW == bVar && eVar.f59472w != 1 && bVarW2 == bVar && eVar.f59474x != 1;
                if (!z12 && fVar.Z1(1) && !(eVar instanceof d5.m)) {
                    if (bVarW == bVar && eVar.f59472w == 0 && bVarW2 != bVar && !eVar.k0()) {
                        z12 = true;
                    }
                    if (bVarW2 == bVar && eVar.f59474x == 0 && bVarW != bVar && !eVar.k0()) {
                        z12 = true;
                    }
                    z11 = (!(bVarW == bVar || bVarW2 == bVar) || eVar.f59439f0 <= BitmapDescriptorFactory.HUE_RED) ? z12 : true;
                }
                if (!z11) {
                    a(interfaceC1268bO1, eVar, a.f61785k);
                }
            }
        }
        interfaceC1268bO1.a();
    }

    private void c(d5.f fVar, String str, int i11, int i12, int i13) {
        fVar.getClass();
        int iK = fVar.K();
        int iJ = fVar.J();
        fVar.f1(0);
        fVar.e1(0);
        fVar.p1(i12);
        fVar.Q0(i13);
        fVar.f1(iK);
        fVar.e1(iJ);
        this.f61784c.d2(i11);
        this.f61784c.x1();
    }

    public long d(d5.f fVar, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        boolean zM1;
        int i21;
        int i22;
        int i23;
        boolean z11;
        int i24;
        boolean z12;
        b bVar = this;
        InterfaceC1268b interfaceC1268bO1 = fVar.O1();
        int size = fVar.V0.size();
        int iY = fVar.Y();
        int iZ = fVar.z();
        boolean zB = d5.k.b(i11, 128);
        boolean z13 = zB || d5.k.b(i11, 64);
        if (z13) {
            for (int i25 = 0; i25 < size; i25++) {
                d5.e eVar = fVar.V0.get(i25);
                d5.e.b bVarC = eVar.C();
                d5.e.b bVar2 = d5.e.b.MATCH_CONSTRAINT;
                boolean z14 = (bVarC == bVar2) && (eVar.V() == bVar2) && eVar.x() > BitmapDescriptorFactory.HUE_RED;
                if ((eVar.k0() && z14) || ((eVar.m0() && z14) || (eVar instanceof d5.m) || eVar.k0() || eVar.m0())) {
                    z13 = false;
                    break;
                }
            }
        }
        if (z13) {
            boolean z15 = a5.d.f293s;
        }
        boolean z16 = z13 & ((i14 == 1073741824 && i16 == 1073741824) || zB);
        int i26 = 2;
        if (z16) {
            int iMin = Math.min(fVar.I(), i15);
            int iMin2 = Math.min(fVar.H(), i17);
            if (i14 == 1073741824 && fVar.Y() != iMin) {
                fVar.p1(iMin);
                fVar.S1();
            }
            if (i16 == 1073741824 && fVar.z() != iMin2) {
                fVar.Q0(iMin2);
                fVar.S1();
            }
            if (i14 == 1073741824 && i16 == 1073741824) {
                zM1 = fVar.K1(zB);
                i21 = 2;
            } else {
                boolean zL1 = fVar.L1(zB);
                if (i14 == 1073741824) {
                    zL1 &= fVar.M1(zB, 0);
                    i21 = 1;
                } else {
                    i21 = 0;
                }
                if (i16 == 1073741824) {
                    zM1 = fVar.M1(zB, 1) & zL1;
                    i21++;
                } else {
                    zM1 = zL1;
                }
            }
            if (zM1) {
                fVar.u1(i14 == 1073741824, i16 == 1073741824);
            }
        } else {
            zM1 = false;
            i21 = 0;
        }
        if (zM1 && i21 == 2) {
            return 0L;
        }
        int iP1 = fVar.P1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = bVar.f61782a.size();
        if (size > 0) {
            bVar.c(fVar, "First pass", 0, iY, iZ);
            i22 = iY;
            i23 = iZ;
        } else {
            i22 = iY;
            i23 = iZ;
        }
        if (size2 > 0) {
            d5.e.b bVarC2 = fVar.C();
            d5.e.b bVar3 = d5.e.b.WRAP_CONTENT;
            boolean z17 = bVarC2 == bVar3;
            boolean z18 = fVar.V() == bVar3;
            int iMax = Math.max(fVar.Y(), bVar.f61784c.K());
            int iMax2 = Math.max(fVar.z(), bVar.f61784c.J());
            int i27 = 0;
            boolean zK1 = false;
            while (i27 < size2) {
                d5.e eVar2 = bVar.f61782a.get(i27);
                if (eVar2 instanceof d5.m) {
                    int iY2 = eVar2.Y();
                    int iZ2 = eVar2.z();
                    boolean zA = bVar.a(interfaceC1268bO1, eVar2, a.f61786l) | zK1;
                    int iY3 = eVar2.Y();
                    int iZ3 = eVar2.z();
                    if (iY3 != iY2) {
                        eVar2.p1(iY3);
                        if (z17 && eVar2.O() > iMax) {
                            iMax = Math.max(iMax, eVar2.O() + eVar2.q(d5.d.a.RIGHT).f());
                        }
                        z12 = true;
                    } else {
                        z12 = zA;
                    }
                    if (iZ3 != iZ2) {
                        eVar2.Q0(iZ3);
                        if (z18 && eVar2.t() > iMax2) {
                            iMax2 = Math.max(iMax2, eVar2.t() + eVar2.q(d5.d.a.BOTTOM).f());
                        }
                        z12 = true;
                    }
                    zK1 = z12 | ((d5.m) eVar2).K1();
                }
                i27++;
                i22 = i22;
                i26 = 2;
            }
            int i28 = i22;
            int i29 = i26;
            int i31 = 0;
            while (i31 < i29) {
                int i32 = 0;
                while (i32 < size2) {
                    d5.e eVar3 = bVar.f61782a.get(i32);
                    if (((eVar3 instanceof d5.i) && !(eVar3 instanceof d5.m)) || (eVar3 instanceof d5.h) || eVar3.X() == 8 || ((z16 && eVar3.f59436e.f61856e.f61818j && eVar3.f59438f.f61856e.f61818j) || (eVar3 instanceof d5.m))) {
                        z11 = z16;
                        i24 = size2;
                    } else {
                        int iY4 = eVar3.Y();
                        int iZ4 = eVar3.z();
                        z11 = z16;
                        int iR = eVar3.r();
                        int i33 = a.f61786l;
                        i24 = size2;
                        if (i31 == 1) {
                            i33 = a.f61787m;
                        }
                        boolean zA2 = bVar.a(interfaceC1268bO1, eVar3, i33) | zK1;
                        int iY5 = eVar3.Y();
                        int iZ5 = eVar3.z();
                        if (iY5 != iY4) {
                            eVar3.p1(iY5);
                            if (z17 && eVar3.O() > iMax) {
                                iMax = Math.max(iMax, eVar3.O() + eVar3.q(d5.d.a.RIGHT).f());
                            }
                            zA2 = true;
                        }
                        if (iZ5 != iZ4) {
                            eVar3.Q0(iZ5);
                            if (z18 && eVar3.t() > iMax2) {
                                iMax2 = Math.max(iMax2, eVar3.t() + eVar3.q(d5.d.a.BOTTOM).f());
                            }
                            zA2 = true;
                        }
                        zK1 = (!eVar3.b0() || iR == eVar3.r()) ? zA2 : true;
                    }
                    i32++;
                    bVar = this;
                    size2 = i24;
                    z16 = z11;
                }
                boolean z19 = z16;
                int i34 = size2;
                if (!zK1) {
                    break;
                }
                i31++;
                c(fVar, "intermediate pass", i31, i28, i23);
                bVar = this;
                size2 = i34;
                z16 = z19;
                i29 = 2;
                zK1 = false;
            }
        }
        fVar.c2(iP1);
        return 0L;
    }

    public void e(d5.f fVar) {
        this.f61782a.clear();
        int size = fVar.V0.size();
        for (int i11 = 0; i11 < size; i11++) {
            d5.e eVar = fVar.V0.get(i11);
            d5.e.b bVarC = eVar.C();
            d5.e.b bVar = d5.e.b.MATCH_CONSTRAINT;
            if (bVarC == bVar || eVar.V() == bVar) {
                this.f61782a.add(eVar);
            }
        }
        fVar.S1();
    }
}
