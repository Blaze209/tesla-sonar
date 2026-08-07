package d5;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class g extends m {
    private e[] H1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private int f59507k1 = -1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private int f59508l1 = -1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private int f59509m1 = -1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private int f59510n1 = -1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private int f59511o1 = -1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f59512p1 = -1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private float f59513q1 = 0.5f;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private float f59514r1 = 0.5f;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private float f59515s1 = 0.5f;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private float f59516t1 = 0.5f;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private float f59517u1 = 0.5f;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private float f59518v1 = 0.5f;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    private int f59519w1 = 0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private int f59520x1 = 0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private int f59521y1 = 2;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    private int f59522z1 = 2;
    private int A1 = 0;
    private int B1 = -1;
    private int C1 = 0;
    private ArrayList<a> D1 = new ArrayList<>();
    private e[] E1 = null;
    private e[] F1 = null;
    private int[] G1 = null;
    private int I1 = 0;

    private class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f59523a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d f59526d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f59527e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private d f59528f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private d f59529g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f59530h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f59531i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f59532j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f59533k;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f59539q;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e f59524b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f59525c = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f59534l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f59535m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f59536n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f59537o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f59538p = 0;

        a(int i11, d dVar, d dVar2, d dVar3, d dVar4, int i12) {
            this.f59530h = 0;
            this.f59531i = 0;
            this.f59532j = 0;
            this.f59533k = 0;
            this.f59539q = 0;
            this.f59523a = i11;
            this.f59526d = dVar;
            this.f59527e = dVar2;
            this.f59528f = dVar3;
            this.f59529g = dVar4;
            this.f59530h = g.this.E1();
            this.f59531i = g.this.G1();
            this.f59532j = g.this.F1();
            this.f59533k = g.this.D1();
            this.f59539q = i12;
        }

        private void h() {
            this.f59534l = 0;
            this.f59535m = 0;
            this.f59524b = null;
            this.f59525c = 0;
            int i11 = this.f59537o;
            for (int i12 = 0; i12 < i11 && this.f59536n + i12 < g.this.I1; i12++) {
                e eVar = g.this.H1[this.f59536n + i12];
                if (this.f59523a == 0) {
                    int iY = eVar.Y();
                    int i13 = g.this.f59519w1;
                    if (eVar.X() == 8) {
                        i13 = 0;
                    }
                    this.f59534l += iY + i13;
                    int iP2 = g.this.p2(eVar, this.f59539q);
                    if (this.f59524b == null || this.f59525c < iP2) {
                        this.f59524b = eVar;
                        this.f59525c = iP2;
                        this.f59535m = iP2;
                    }
                } else {
                    int iQ2 = g.this.q2(eVar, this.f59539q);
                    int iP3 = g.this.p2(eVar, this.f59539q);
                    int i14 = g.this.f59520x1;
                    if (eVar.X() == 8) {
                        i14 = 0;
                    }
                    this.f59535m += iP3 + i14;
                    if (this.f59524b == null || this.f59525c < iQ2) {
                        this.f59524b = eVar;
                        this.f59525c = iQ2;
                        this.f59534l = iQ2;
                    }
                }
            }
        }

        public void b(e eVar) {
            if (this.f59523a == 0) {
                int iQ2 = g.this.q2(eVar, this.f59539q);
                if (eVar.C() == e.b.MATCH_CONSTRAINT) {
                    this.f59538p++;
                    iQ2 = 0;
                }
                this.f59534l += iQ2 + (eVar.X() != 8 ? g.this.f59519w1 : 0);
                int iP2 = g.this.p2(eVar, this.f59539q);
                if (this.f59524b == null || this.f59525c < iP2) {
                    this.f59524b = eVar;
                    this.f59525c = iP2;
                    this.f59535m = iP2;
                }
            } else {
                int iQ3 = g.this.q2(eVar, this.f59539q);
                int iP3 = g.this.p2(eVar, this.f59539q);
                if (eVar.V() == e.b.MATCH_CONSTRAINT) {
                    this.f59538p++;
                    iP3 = 0;
                }
                this.f59535m += iP3 + (eVar.X() != 8 ? g.this.f59520x1 : 0);
                if (this.f59524b == null || this.f59525c < iQ3) {
                    this.f59524b = eVar;
                    this.f59525c = iQ3;
                    this.f59534l = iQ3;
                }
            }
            this.f59537o++;
        }

        public void c() {
            this.f59525c = 0;
            this.f59524b = null;
            this.f59534l = 0;
            this.f59535m = 0;
            this.f59536n = 0;
            this.f59537o = 0;
            this.f59538p = 0;
        }

        public void d(boolean z11, int i11, boolean z12) {
            e eVar;
            int i12;
            char c11;
            float f11;
            float f12;
            int i13 = this.f59537o;
            for (int i14 = 0; i14 < i13 && this.f59536n + i14 < g.this.I1; i14++) {
                e eVar2 = g.this.H1[this.f59536n + i14];
                if (eVar2 != null) {
                    eVar2.x0();
                }
            }
            if (i13 == 0 || this.f59524b == null) {
                return;
            }
            boolean z13 = z12 && i11 == 0;
            int i15 = -1;
            int i16 = -1;
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = z11 ? (i13 - 1) - i17 : i17;
                if (this.f59536n + i18 >= g.this.I1) {
                    break;
                }
                e eVar3 = g.this.H1[this.f59536n + i18];
                if (eVar3 != null && eVar3.X() == 0) {
                    if (i15 == -1) {
                        i15 = i17;
                    }
                    i16 = i17;
                }
            }
            e eVar4 = null;
            if (this.f59523a != 0) {
                e eVar5 = this.f59524b;
                eVar5.S0(g.this.f59507k1);
                int i19 = this.f59530h;
                if (i11 > 0) {
                    i19 += g.this.f59519w1;
                }
                if (z11) {
                    eVar5.S.a(this.f59528f, i19);
                    if (z12) {
                        eVar5.Q.a(this.f59526d, this.f59532j);
                    }
                    if (i11 > 0) {
                        this.f59528f.f59422d.Q.a(eVar5.S, 0);
                    }
                } else {
                    eVar5.Q.a(this.f59526d, i19);
                    if (z12) {
                        eVar5.S.a(this.f59528f, this.f59532j);
                    }
                    if (i11 > 0) {
                        this.f59526d.f59422d.S.a(eVar5.Q, 0);
                    }
                }
                for (int i21 = 0; i21 < i13 && this.f59536n + i21 < g.this.I1; i21++) {
                    e eVar6 = g.this.H1[this.f59536n + i21];
                    if (eVar6 != null) {
                        if (i21 == 0) {
                            eVar6.l(eVar6.R, this.f59527e, this.f59531i);
                            int i22 = g.this.f59508l1;
                            float f13 = g.this.f59514r1;
                            if (this.f59536n == 0 && g.this.f59510n1 != -1) {
                                i22 = g.this.f59510n1;
                                f13 = g.this.f59516t1;
                            } else if (z12 && g.this.f59512p1 != -1) {
                                i22 = g.this.f59512p1;
                                f13 = g.this.f59518v1;
                            }
                            eVar6.j1(i22);
                            eVar6.i1(f13);
                        }
                        if (i21 == i13 - 1) {
                            eVar6.l(eVar6.T, this.f59529g, this.f59533k);
                        }
                        if (eVar4 != null) {
                            eVar6.R.a(eVar4.T, g.this.f59520x1);
                            if (i21 == i15) {
                                eVar6.R.u(this.f59531i);
                            }
                            eVar4.T.a(eVar6.R, 0);
                            if (i21 == i16 + 1) {
                                eVar4.T.u(this.f59533k);
                            }
                        }
                        if (eVar6 != eVar5) {
                            if (z11) {
                                int i23 = g.this.f59521y1;
                                if (i23 == 0) {
                                    eVar6.S.a(eVar5.S, 0);
                                } else if (i23 == 1) {
                                    eVar6.Q.a(eVar5.Q, 0);
                                } else if (i23 == 2) {
                                    eVar6.Q.a(eVar5.Q, 0);
                                    eVar6.S.a(eVar5.S, 0);
                                }
                            } else {
                                int i24 = g.this.f59521y1;
                                if (i24 == 0) {
                                    eVar6.Q.a(eVar5.Q, 0);
                                } else if (i24 == 1) {
                                    eVar6.S.a(eVar5.S, 0);
                                } else if (i24 == 2) {
                                    if (z13) {
                                        eVar6.Q.a(this.f59526d, this.f59530h);
                                        eVar6.S.a(this.f59528f, this.f59532j);
                                    } else {
                                        eVar6.Q.a(eVar5.Q, 0);
                                        eVar6.S.a(eVar5.S, 0);
                                    }
                                }
                            }
                        }
                        eVar4 = eVar6;
                    }
                }
                return;
            }
            e eVar7 = this.f59524b;
            eVar7.j1(g.this.f59508l1);
            int i25 = this.f59531i;
            if (i11 > 0) {
                i25 += g.this.f59520x1;
            }
            eVar7.R.a(this.f59527e, i25);
            if (z12) {
                eVar7.T.a(this.f59529g, this.f59533k);
            }
            if (i11 > 0) {
                this.f59527e.f59422d.T.a(eVar7.R, 0);
            }
            char c12 = 3;
            if (g.this.f59522z1 != 3 || eVar7.b0()) {
                eVar = eVar7;
                break;
            }
            int i26 = 0;
            while (true) {
                if (i26 < i13) {
                    int i27 = z11 ? (i13 - 1) - i26 : i26;
                    if (this.f59536n + i27 < g.this.I1) {
                        eVar = g.this.H1[this.f59536n + i27];
                        if (eVar.b0()) {
                            break;
                        } else {
                            i26++;
                        }
                    }
                }
                eVar = eVar7;
                break;
            }
            int i28 = 0;
            while (i28 < i13) {
                int i29 = z11 ? (i13 - 1) - i28 : i28;
                if (this.f59536n + i29 >= g.this.I1) {
                    return;
                }
                e eVar8 = g.this.H1[this.f59536n + i29];
                if (eVar8 == null) {
                    eVar8 = eVar4;
                    c11 = c12;
                } else {
                    if (i28 == 0) {
                        i12 = 1;
                        eVar8.l(eVar8.Q, this.f59526d, this.f59530h);
                    } else {
                        i12 = 1;
                    }
                    if (i29 == 0) {
                        int i31 = g.this.f59507k1;
                        float f14 = g.this.f59513q1;
                        if (z11) {
                            f14 = 1.0f - f14;
                        }
                        if (this.f59536n == 0 && g.this.f59509m1 != -1) {
                            i31 = g.this.f59509m1;
                            if (z11) {
                                f12 = g.this.f59515s1;
                                f11 = 1.0f - f12;
                            } else {
                                f11 = g.this.f59515s1;
                            }
                            f14 = f11;
                        } else if (z12 && g.this.f59511o1 != -1) {
                            i31 = g.this.f59511o1;
                            if (z11) {
                                f12 = g.this.f59517u1;
                                f11 = 1.0f - f12;
                            } else {
                                f11 = g.this.f59517u1;
                            }
                            f14 = f11;
                        }
                        eVar8.S0(i31);
                        eVar8.R0(f14);
                    }
                    if (i28 == i13 - 1) {
                        eVar8.l(eVar8.S, this.f59528f, this.f59532j);
                    }
                    if (eVar4 != null) {
                        eVar8.Q.a(eVar4.S, g.this.f59519w1);
                        if (i28 == i15) {
                            eVar8.Q.u(this.f59530h);
                        }
                        eVar4.S.a(eVar8.Q, 0);
                        if (i28 == i16 + 1) {
                            eVar4.S.u(this.f59532j);
                        }
                    }
                    if (eVar8 != eVar7) {
                        c11 = 3;
                        if (g.this.f59522z1 == 3 && eVar.b0() && eVar8 != eVar && eVar8.b0()) {
                            eVar8.U.a(eVar.U, 0);
                        } else {
                            int i32 = g.this.f59522z1;
                            if (i32 == 0) {
                                eVar8.R.a(eVar7.R, 0);
                            } else if (i32 == i12) {
                                eVar8.T.a(eVar7.T, 0);
                            } else if (z13) {
                                eVar8.R.a(this.f59527e, this.f59531i);
                                eVar8.T.a(this.f59529g, this.f59533k);
                            } else {
                                eVar8.R.a(eVar7.R, 0);
                                eVar8.T.a(eVar7.T, 0);
                            }
                        }
                    } else {
                        c11 = 3;
                    }
                }
                i28++;
                c12 = c11;
                eVar4 = eVar8;
            }
        }

        public int e() {
            return this.f59523a == 1 ? this.f59535m - g.this.f59520x1 : this.f59535m;
        }

        public int f() {
            return this.f59523a == 0 ? this.f59534l - g.this.f59519w1 : this.f59534l;
        }

        public void g(int i11) {
            int i12 = this.f59538p;
            if (i12 == 0) {
                return;
            }
            int i13 = this.f59537o;
            int i14 = i11 / i12;
            for (int i15 = 0; i15 < i13 && this.f59536n + i15 < g.this.I1; i15++) {
                e eVar = g.this.H1[this.f59536n + i15];
                if (this.f59523a == 0) {
                    if (eVar != null && eVar.C() == e.b.MATCH_CONSTRAINT && eVar.f59472w == 0) {
                        g.this.I1(eVar, e.b.FIXED, i14, eVar.V(), eVar.z());
                    }
                } else if (eVar != null && eVar.V() == e.b.MATCH_CONSTRAINT && eVar.f59474x == 0) {
                    int i16 = i14;
                    g.this.I1(eVar, eVar.C(), eVar.Y(), e.b.FIXED, i16);
                    i14 = i16;
                }
            }
            h();
        }

        public void i(int i11) {
            this.f59536n = i11;
        }

        public void j(int i11, d dVar, d dVar2, d dVar3, d dVar4, int i12, int i13, int i14, int i15, int i16) {
            this.f59523a = i11;
            this.f59526d = dVar;
            this.f59527e = dVar2;
            this.f59528f = dVar3;
            this.f59529g = dVar4;
            this.f59530h = i12;
            this.f59531i = i13;
            this.f59532j = i14;
            this.f59533k = i15;
            this.f59539q = i16;
        }
    }

    private void o2(boolean z11) {
        e eVar;
        float f11;
        int i11;
        if (this.G1 == null || this.F1 == null || this.E1 == null) {
            return;
        }
        for (int i12 = 0; i12 < this.I1; i12++) {
            this.H1[i12].x0();
        }
        int[] iArr = this.G1;
        int i13 = iArr[0];
        int i14 = iArr[1];
        float f12 = this.f59513q1;
        e eVar2 = null;
        int i15 = 0;
        while (i15 < i13) {
            if (z11) {
                i11 = (i13 - i15) - 1;
                f11 = 1.0f - this.f59513q1;
            } else {
                f11 = f12;
                i11 = i15;
            }
            e eVar3 = this.F1[i11];
            if (eVar3 != null && eVar3.X() != 8) {
                if (i15 == 0) {
                    eVar3.l(eVar3.Q, this.Q, E1());
                    eVar3.S0(this.f59507k1);
                    eVar3.R0(f11);
                }
                if (i15 == i13 - 1) {
                    eVar3.l(eVar3.S, this.S, F1());
                }
                if (i15 > 0 && eVar2 != null) {
                    eVar3.l(eVar3.Q, eVar2.S, this.f59519w1);
                    eVar2.l(eVar2.S, eVar3.Q, 0);
                }
                eVar2 = eVar3;
            }
            i15++;
            f12 = f11;
        }
        for (int i16 = 0; i16 < i14; i16++) {
            e eVar4 = this.E1[i16];
            if (eVar4 != null && eVar4.X() != 8) {
                if (i16 == 0) {
                    eVar4.l(eVar4.R, this.R, G1());
                    eVar4.j1(this.f59508l1);
                    eVar4.i1(this.f59514r1);
                }
                if (i16 == i14 - 1) {
                    eVar4.l(eVar4.T, this.T, D1());
                }
                if (i16 > 0 && eVar2 != null) {
                    eVar4.l(eVar4.R, eVar2.T, this.f59520x1);
                    eVar2.l(eVar2.T, eVar4.R, 0);
                }
                eVar2 = eVar4;
            }
        }
        for (int i17 = 0; i17 < i13; i17++) {
            for (int i18 = 0; i18 < i14; i18++) {
                int i19 = (i18 * i13) + i17;
                if (this.C1 == 1) {
                    i19 = (i17 * i14) + i18;
                }
                e[] eVarArr = this.H1;
                if (i19 < eVarArr.length && (eVar = eVarArr[i19]) != null && eVar.X() != 8) {
                    e eVar5 = this.F1[i17];
                    e eVar6 = this.E1[i18];
                    if (eVar != eVar5) {
                        eVar.l(eVar.Q, eVar5.Q, 0);
                        eVar.l(eVar.S, eVar5.S, 0);
                    }
                    if (eVar != eVar6) {
                        eVar.l(eVar.R, eVar6.R, 0);
                        eVar.l(eVar.T, eVar6.T, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int p2(e eVar, int i11) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.V() == e.b.MATCH_CONSTRAINT) {
            int i12 = eVar.f59474x;
            if (i12 == 0) {
                return 0;
            }
            if (i12 == 2) {
                int i13 = (int) (eVar.E * i11);
                if (i13 != eVar.z()) {
                    eVar.d1(true);
                    I1(eVar, eVar.C(), eVar.Y(), e.b.FIXED, i13);
                }
                return i13;
            }
            eVar2 = eVar;
            if (i12 == 1) {
                return eVar2.z();
            }
            if (i12 == 3) {
                return (int) ((eVar2.Y() * eVar2.f59439f0) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int q2(e eVar, int i11) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.C() == e.b.MATCH_CONSTRAINT) {
            int i12 = eVar.f59472w;
            if (i12 == 0) {
                return 0;
            }
            if (i12 == 2) {
                int i13 = (int) (eVar.B * i11);
                if (i13 != eVar.Y()) {
                    eVar.d1(true);
                    I1(eVar, e.b.FIXED, i13, eVar.V(), eVar.z());
                }
                return i13;
            }
            eVar2 = eVar;
            if (i12 == 1) {
                return eVar2.Y();
            }
            if (i12 == 3) {
                return (int) ((eVar2.z() * eVar2.f59439f0) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.Y();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:106:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0059 A[ADDED_TO_REGION, EDGE_INSN: B:119:0x0059->B:42:0x0059 BREAK  A[LOOP:1: B:44:0x005c->B:124:0x005c], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0059 A[ADDED_TO_REGION, EDGE_INSN: B:122:0x0059->B:42:0x0059 BREAK  A[LOOP:1: B:44:0x005c->B:124:0x005c], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00d3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0060  */
    /* JADX WARN: Code duplicated, block: B:47:0x006a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0078  */
    /* JADX WARN: Code duplicated, block: B:54:0x0080  */
    /* JADX WARN: Code duplicated, block: B:57:0x0088  */
    /* JADX WARN: Code duplicated, block: B:61:0x0090  */
    /* JADX WARN: Code duplicated, block: B:64:0x0097  */
    /* JADX WARN: Code duplicated, block: B:66:0x009a  */
    /* JADX WARN: Code duplicated, block: B:68:0x009f  */
    /* JADX WARN: Code duplicated, block: B:72:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:89:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:97:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:99:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:45:0x005e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private void r2(d5.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.g.r2(d5.e[], int, int, int, int[]):void");
    }

    private void s2(e[] eVarArr, int i11, int i12, int i13, int[] iArr) {
        int i14;
        g gVar;
        int i15;
        d dVar;
        int i16;
        g gVar2 = this;
        if (i11 == 0) {
            return;
        }
        gVar2.D1.clear();
        int i17 = i13;
        a aVar = gVar2.new a(i12, gVar2.Q, gVar2.R, gVar2.S, gVar2.T, i17);
        gVar2.D1.add(aVar);
        if (i12 == 0) {
            i14 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i19 < i11) {
                e eVar = eVarArr[i19];
                int iQ2 = gVar2.q2(eVar, i17);
                if (eVar.C() == e.b.MATCH_CONSTRAINT) {
                    i14++;
                }
                int i21 = i14;
                boolean z11 = (i18 == i17 || (gVar2.f59519w1 + i18) + iQ2 > i17) && aVar.f59524b != null;
                if (!z11 && i19 > 0 && (i16 = gVar2.B1) > 0 && i19 % i16 == 0) {
                    z11 = true;
                }
                if (z11) {
                    aVar = gVar2.new a(i12, gVar2.Q, gVar2.R, gVar2.S, gVar2.T, i17);
                    aVar.i(i19);
                    gVar2.D1.add(aVar);
                } else {
                    if (i19 > 0) {
                        i18 += gVar2.f59519w1 + iQ2;
                    }
                    aVar.b(eVar);
                    i19++;
                    i14 = i21;
                }
                i18 = iQ2;
                aVar.b(eVar);
                i19++;
                i14 = i21;
            }
        } else {
            i14 = 0;
            int i22 = 0;
            int i23 = 0;
            while (i23 < i11) {
                e eVar2 = eVarArr[i23];
                int iP2 = gVar2.p2(eVar2, i17);
                if (eVar2.V() == e.b.MATCH_CONSTRAINT) {
                    i14++;
                }
                int i24 = i14;
                boolean z12 = (i22 == i17 || (gVar2.f59520x1 + i22) + iP2 > i17) && aVar.f59524b != null;
                if (!z12 && i23 > 0 && (i15 = gVar2.B1) > 0 && i23 % i15 == 0) {
                    z12 = true;
                }
                if (z12) {
                    aVar = gVar2.new a(i12, gVar2.Q, gVar2.R, gVar2.S, gVar2.T, i17);
                    gVar = gVar2;
                    aVar.i(i23);
                    gVar.D1.add(aVar);
                } else {
                    gVar = gVar2;
                    if (i23 > 0) {
                        i22 += gVar.f59520x1 + iP2;
                    }
                    aVar.b(eVar2);
                    i23++;
                    i17 = i13;
                    i14 = i24;
                    gVar2 = gVar;
                }
                i22 = iP2;
                aVar.b(eVar2);
                i23++;
                i17 = i13;
                i14 = i24;
                gVar2 = gVar;
            }
        }
        g gVar3 = gVar2;
        int size = gVar3.D1.size();
        d dVar2 = gVar3.Q;
        d dVar3 = gVar3.R;
        d dVar4 = gVar3.S;
        d dVar5 = gVar3.T;
        int iE1 = gVar3.E1();
        int iG1 = gVar3.G1();
        int iF1 = gVar3.F1();
        int iD1 = gVar3.D1();
        e.b bVarC = gVar3.C();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z13 = bVarC == bVar || gVar3.V() == bVar;
        if (i14 > 0 && z13) {
            for (int i25 = 0; i25 < size; i25++) {
                a aVar2 = gVar3.D1.get(i25);
                if (i12 == 0) {
                    aVar2.g(i13 - aVar2.f());
                } else {
                    aVar2.g(i13 - aVar2.e());
                }
            }
        }
        d dVar6 = dVar2;
        int iD2 = iD1;
        int i26 = 0;
        int iF2 = iF1;
        int i27 = iG1;
        int i28 = iE1;
        d dVar7 = dVar5;
        d dVar8 = dVar4;
        d dVar9 = dVar3;
        int i29 = 0;
        for (int i31 = 0; i31 < size; i31++) {
            a aVar3 = gVar3.D1.get(i31);
            if (i12 == 0) {
                if (i31 < size - 1) {
                    dVar7 = gVar3.D1.get(i31 + 1).f59524b.R;
                    iD2 = 0;
                } else {
                    dVar7 = gVar3.T;
                    iD2 = gVar3.D1();
                }
                d dVar10 = aVar3.f59524b.T;
                int i32 = i29;
                aVar3.j(i12, dVar6, dVar9, dVar8, dVar7, i28, i27, iF2, iD2, i13);
                int iMax = Math.max(i26, aVar3.f());
                int iE = aVar3.e() + i32;
                if (i31 > 0) {
                    iE += gVar3.f59520x1;
                }
                i29 = iE;
                i26 = iMax;
                dVar9 = dVar10;
                i27 = 0;
            } else {
                int i33 = i26;
                int i34 = i29;
                if (i31 < size - 1) {
                    dVar = gVar3.D1.get(i31 + 1).f59524b.Q;
                    iF2 = 0;
                } else {
                    dVar = gVar3.S;
                    iF2 = gVar3.F1();
                }
                dVar8 = dVar;
                d dVar11 = aVar3.f59524b.S;
                aVar3.j(i12, dVar6, dVar9, dVar8, dVar7, i28, i27, iF2, iD2, i13);
                int iF = aVar3.f() + i33;
                int iMax2 = Math.max(i34, aVar3.e());
                if (i31 > 0) {
                    iF += gVar3.f59519w1;
                }
                int i35 = iF;
                i29 = iMax2;
                i26 = i35;
                i28 = 0;
                dVar6 = dVar11;
            }
        }
        iArr[0] = i26;
        iArr[1] = i29;
    }

    private void t2(e[] eVarArr, int i11, int i12, int i13, int[] iArr) {
        int i14;
        g gVar;
        int i15;
        d dVar;
        int i16;
        g gVar2 = this;
        if (i11 == 0) {
            return;
        }
        gVar2.D1.clear();
        int i17 = i13;
        a aVar = gVar2.new a(i12, gVar2.Q, gVar2.R, gVar2.S, gVar2.T, i17);
        gVar2.D1.add(aVar);
        boolean z11 = true;
        if (i12 == 0) {
            int i18 = 0;
            i14 = 0;
            int i19 = 0;
            int i21 = 0;
            while (i21 < i11) {
                i18++;
                e eVar = eVarArr[i21];
                int iQ2 = gVar2.q2(eVar, i17);
                if (eVar.C() == e.b.MATCH_CONSTRAINT) {
                    i14++;
                }
                int i22 = i14;
                boolean z12 = (i19 == i17 || (gVar2.f59519w1 + i19) + iQ2 > i17) && aVar.f59524b != null;
                if (!z12 && i21 > 0 && (i16 = gVar2.B1) > 0 && i18 > i16) {
                    z12 = true;
                }
                if (z12) {
                    aVar = gVar2.new a(i12, gVar2.Q, gVar2.R, gVar2.S, gVar2.T, i17);
                    aVar.i(i21);
                    gVar2.D1.add(aVar);
                    i18 = 1;
                } else {
                    if (i21 > 0) {
                        i19 += gVar2.f59519w1 + iQ2;
                    }
                    aVar.b(eVar);
                    i21++;
                    i14 = i22;
                }
                i19 = iQ2;
                aVar.b(eVar);
                i21++;
                i14 = i22;
            }
        } else {
            int i23 = 0;
            i14 = 0;
            int i24 = 0;
            int i25 = 0;
            while (i25 < i11) {
                i23++;
                e eVar2 = eVarArr[i25];
                int iP2 = gVar2.p2(eVar2, i17);
                if (eVar2.V() == e.b.MATCH_CONSTRAINT) {
                    i14++;
                }
                int i26 = i14;
                boolean z13 = (i24 == i17 || (gVar2.f59520x1 + i24) + iP2 > i17) && aVar.f59524b != null;
                if (!z13 && i25 > 0 && (i15 = gVar2.B1) > 0 && i23 > i15) {
                    z13 = true;
                }
                if (z13) {
                    aVar = gVar2.new a(i12, gVar2.Q, gVar2.R, gVar2.S, gVar2.T, i17);
                    gVar = gVar2;
                    aVar.i(i25);
                    gVar.D1.add(aVar);
                    i23 = 1;
                } else {
                    gVar = gVar2;
                    if (i25 > 0) {
                        i24 += gVar.f59520x1 + iP2;
                    }
                    aVar.b(eVar2);
                    i25++;
                    i17 = i13;
                    i14 = i26;
                    gVar2 = gVar;
                }
                i24 = iP2;
                aVar.b(eVar2);
                i25++;
                i17 = i13;
                i14 = i26;
                gVar2 = gVar;
            }
        }
        g gVar3 = gVar2;
        int size = gVar3.D1.size();
        d dVar2 = gVar3.Q;
        d dVar3 = gVar3.R;
        d dVar4 = gVar3.S;
        d dVar5 = gVar3.T;
        int iE1 = gVar3.E1();
        int iG1 = gVar3.G1();
        int iF1 = gVar3.F1();
        int iD1 = gVar3.D1();
        e.b bVarC = gVar3.C();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z14 = bVarC == bVar || gVar3.V() == bVar;
        if (i14 > 0 && z14) {
            for (int i27 = 0; i27 < size; i27++) {
                a aVar2 = gVar3.D1.get(i27);
                if (i12 == 0) {
                    aVar2.g(i13 - aVar2.f());
                } else {
                    aVar2.g(i13 - aVar2.e());
                }
            }
        }
        d dVar6 = dVar3;
        int iD2 = iD1;
        int i28 = 0;
        int i29 = 0;
        int iF2 = iF1;
        int i31 = iG1;
        int i32 = iE1;
        d dVar7 = dVar5;
        d dVar8 = dVar4;
        d dVar9 = dVar2;
        int i33 = 0;
        while (i29 < size) {
            a aVar3 = gVar3.D1.get(i29);
            if (i12 == 0) {
                if (i29 < size - 1) {
                    dVar7 = gVar3.D1.get(i29 + 1).f59524b.R;
                    iD2 = 0;
                } else {
                    dVar7 = gVar3.T;
                    iD2 = gVar3.D1();
                }
                d dVar10 = aVar3.f59524b.T;
                int i34 = i28;
                aVar3.j(i12, dVar9, dVar6, dVar8, dVar7, i32, i31, iF2, iD2, i13);
                int iMax = Math.max(i33, aVar3.f());
                int iE = aVar3.e() + i34;
                if (i29 > 0) {
                    iE += gVar3.f59520x1;
                }
                i28 = iE;
                i33 = iMax;
                dVar6 = dVar10;
                i31 = 0;
            } else {
                int i35 = i28;
                int i36 = i33;
                if (i29 < size - 1) {
                    dVar = gVar3.D1.get(i29 + 1).f59524b.Q;
                    iF2 = 0;
                } else {
                    dVar = gVar3.S;
                    iF2 = gVar3.F1();
                }
                dVar8 = dVar;
                d dVar11 = aVar3.f59524b.S;
                aVar3.j(i12, dVar9, dVar6, dVar8, dVar7, i32, i31, iF2, iD2, i13);
                int iF = aVar3.f() + i36;
                int iMax2 = Math.max(i35, aVar3.e());
                if (i29 > 0) {
                    iF += gVar3.f59519w1;
                }
                int i37 = iF;
                i28 = iMax2;
                i33 = i37;
                i32 = 0;
                dVar9 = dVar11;
            }
            i29++;
            z11 = z11;
        }
        iArr[0] = i33;
        iArr[z11 ? 1 : 0] = i28;
    }

    private void u2(e[] eVarArr, int i11, int i12, int i13, int[] iArr) {
        a aVar;
        if (i11 == 0) {
            return;
        }
        if (this.D1.size() == 0) {
            aVar = new a(i12, this.Q, this.R, this.S, this.T, i13);
            this.D1.add(aVar);
        } else {
            a aVar2 = this.D1.get(0);
            aVar2.c();
            aVar2.j(i12, this.Q, this.R, this.S, this.T, E1(), G1(), F1(), D1(), i13);
            aVar = aVar2;
        }
        for (int i14 = 0; i14 < i11; i14++) {
            aVar.b(eVarArr[i14]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void A2(float f11) {
        this.f59513q1 = f11;
    }

    public void B2(int i11) {
        this.f59519w1 = i11;
    }

    public void C2(int i11) {
        this.f59507k1 = i11;
    }

    public void D2(float f11) {
        this.f59517u1 = f11;
    }

    public void E2(int i11) {
        this.f59511o1 = i11;
    }

    public void F2(float f11) {
        this.f59518v1 = f11;
    }

    public void G2(int i11) {
        this.f59512p1 = i11;
    }

    @Override // d5.m
    public void H1(int i11, int i12, int i13, int i14) {
        int i15;
        e[] eVarArr;
        if (this.W0 > 0 && !J1()) {
            M1(0, 0);
            L1(false);
            return;
        }
        int iE1 = E1();
        int iF1 = F1();
        int iG1 = G1();
        int iD1 = D1();
        int[] iArr = new int[2];
        int i16 = (i12 - iE1) - iF1;
        int i17 = this.C1;
        if (i17 == 1) {
            i16 = (i14 - iG1) - iD1;
        }
        int i18 = i16;
        if (i17 == 0) {
            if (this.f59507k1 == -1) {
                this.f59507k1 = 0;
            }
            if (this.f59508l1 == -1) {
                this.f59508l1 = 0;
            }
        } else {
            if (this.f59507k1 == -1) {
                this.f59507k1 = 0;
            }
            if (this.f59508l1 == -1) {
                this.f59508l1 = 0;
            }
        }
        e[] eVarArr2 = this.V0;
        int i19 = 0;
        int i21 = 0;
        while (true) {
            i15 = this.W0;
            if (i19 >= i15) {
                break;
            }
            if (this.V0[i19].X() == 8) {
                i21++;
            }
            i19++;
        }
        if (i21 > 0) {
            e[] eVarArr3 = new e[i15 - i21];
            int i22 = 0;
            i15 = 0;
            while (i22 < this.W0) {
                e eVar = this.V0[i22];
                e[] eVarArr4 = eVarArr3;
                if (eVar.X() != 8) {
                    eVarArr4[i15] = eVar;
                    i15++;
                }
                i22++;
                eVarArr3 = eVarArr4;
            }
            eVarArr = eVarArr3;
        } else {
            eVarArr = eVarArr2;
        }
        int i23 = i15;
        this.H1 = eVarArr;
        this.I1 = i23;
        int i24 = this.A1;
        if (i24 == 0) {
            u2(eVarArr, i23, this.C1, i18, iArr);
        } else if (i24 == 1) {
            s2(eVarArr, i23, this.C1, i18, iArr);
        } else if (i24 == 2) {
            r2(eVarArr, i23, this.C1, i18, iArr);
        } else if (i24 == 3) {
            t2(eVarArr, i23, this.C1, i18, iArr);
        }
        int iMin = iArr[0] + iE1 + iF1;
        int iMin2 = iArr[1] + iG1 + iD1;
        if (i11 == 1073741824) {
            iMin = i12;
        } else if (i11 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i12);
        } else if (i11 != 0) {
            iMin = 0;
        }
        if (i13 == 1073741824) {
            iMin2 = i14;
        } else if (i13 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i14);
        } else if (i13 != 0) {
            iMin2 = 0;
        }
        M1(iMin, iMin2);
        p1(iMin);
        Q0(iMin2);
        L1(this.W0 > 0);
    }

    public void H2(int i11) {
        this.B1 = i11;
    }

    public void I2(int i11) {
        this.C1 = i11;
    }

    public void J2(int i11) {
        this.f59522z1 = i11;
    }

    public void K2(float f11) {
        this.f59514r1 = f11;
    }

    public void L2(int i11) {
        this.f59520x1 = i11;
    }

    public void M2(int i11) {
        this.f59508l1 = i11;
    }

    public void N2(int i11) {
        this.A1 = i11;
    }

    @Override // d5.e
    public void g(a5.d dVar, boolean z11) {
        super.g(dVar, z11);
        boolean z12 = M() != null && ((f) M()).V1();
        int i11 = this.A1;
        if (i11 != 0) {
            if (i11 == 1) {
                int size = this.D1.size();
                int i12 = 0;
                while (i12 < size) {
                    this.D1.get(i12).d(z12, i12, i12 == size + (-1));
                    i12++;
                }
            } else if (i11 == 2) {
                o2(z12);
            } else if (i11 == 3) {
                int size2 = this.D1.size();
                int i13 = 0;
                while (i13 < size2) {
                    this.D1.get(i13).d(z12, i13, i13 == size2 + (-1));
                    i13++;
                }
            }
        } else if (this.D1.size() > 0) {
            this.D1.get(0).d(z12, 0, true);
        }
        L1(false);
    }

    @Override // d5.j, d5.e
    public void n(e eVar, HashMap<e, e> map) {
        super.n(eVar, map);
        g gVar = (g) eVar;
        this.f59507k1 = gVar.f59507k1;
        this.f59508l1 = gVar.f59508l1;
        this.f59509m1 = gVar.f59509m1;
        this.f59510n1 = gVar.f59510n1;
        this.f59511o1 = gVar.f59511o1;
        this.f59512p1 = gVar.f59512p1;
        this.f59513q1 = gVar.f59513q1;
        this.f59514r1 = gVar.f59514r1;
        this.f59515s1 = gVar.f59515s1;
        this.f59516t1 = gVar.f59516t1;
        this.f59517u1 = gVar.f59517u1;
        this.f59518v1 = gVar.f59518v1;
        this.f59519w1 = gVar.f59519w1;
        this.f59520x1 = gVar.f59520x1;
        this.f59521y1 = gVar.f59521y1;
        this.f59522z1 = gVar.f59522z1;
        this.A1 = gVar.A1;
        this.B1 = gVar.B1;
        this.C1 = gVar.C1;
    }

    public void v2(float f11) {
        this.f59515s1 = f11;
    }

    public void w2(int i11) {
        this.f59509m1 = i11;
    }

    public void x2(float f11) {
        this.f59516t1 = f11;
    }

    public void y2(int i11) {
        this.f59510n1 = i11;
    }

    public void z2(int i11) {
        this.f59521y1 = i11;
    }
}
