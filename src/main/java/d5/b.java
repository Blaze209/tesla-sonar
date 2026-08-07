package d5;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {
    /* JADX WARN: Code duplicated, block: B:100:0x016d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0173  */
    /* JADX WARN: Code duplicated, block: B:104:0x0194  */
    /* JADX WARN: Code duplicated, block: B:16:0x0033 A[PHI: r15 r16
      0x0033: PHI (r15v26 boolean) = (r15v1 boolean), (r15v28 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r16v5 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[PHI: r15 r16
      0x0035: PHI (r15v3 boolean) = (r15v1 boolean), (r15v28 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r16v3 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:218:0x038a  */
    /* JADX WARN: Code duplicated, block: B:289:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:292:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:293:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:296:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:297:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:299:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:301:0x04da  */
    /* JADX WARN: Code duplicated, block: B:304:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:317:0x038b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x016a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [a5.d] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [a5.d] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [d5.e] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r5v17, types: [a5.i] */
    static void a(f fVar, a5.d dVar, int i11, int i12, c cVar) {
        boolean z11;
        boolean z12;
        boolean z13;
        float f11;
        ?? r11;
        a5.d dVar2;
        d dVar3;
        a5.i iVar;
        a5.i iVar2;
        int i13;
        d dVar4;
        a5.i iVar3;
        int i14;
        d[] dVarArr;
        int i15;
        d dVar5;
        d dVar6;
        a5.i iVar4;
        d dVar7;
        Object obj;
        int size;
        d dVar8;
        int i16;
        int i17 = i11;
        e eVar = cVar.f59397a;
        e eVar2 = cVar.f59399c;
        e eVar3 = cVar.f59398b;
        e eVar4 = cVar.f59400d;
        e eVar5 = cVar.f59401e;
        float f12 = cVar.f59407k;
        boolean z14 = fVar.f59431b0[i17] == e.b.WRAP_CONTENT;
        if (i17 == 0) {
            int i18 = eVar5.J0;
            z11 = i18 == 0;
            z12 = i18 == 1;
            if (i18 == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
        } else {
            int i19 = eVar5.K0;
            z11 = i19 == 0;
            z12 = i19 == 1;
            if (i19 == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
        }
        ?? r14 = eVar;
        boolean z15 = false;
        while (true) {
            f11 = f12;
            Object obj2 = null;
            if (z15) {
                break;
            }
            d dVar9 = r14.Y[i12];
            int i21 = z13 ? 1 : 4;
            int iF = dVar9.f();
            e.b bVar = r14.f59431b0[i17];
            boolean z16 = z14;
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            boolean z17 = bVar == bVar2 && r14.f59476y[i17] == 0;
            boolean z18 = z13;
            d dVar10 = dVar9.f59424f;
            if (dVar10 != null && r14 != eVar) {
                iF += dVar10.f();
            }
            int i22 = iF;
            if (z18 && r14 != eVar && r14 != eVar3) {
                i21 = 8;
            }
            boolean z19 = z17;
            d dVar11 = dVar9.f59424f;
            if (dVar11 != null) {
                if (r14 == eVar3) {
                    dVar.h(dVar9.f59427i, dVar11.f59427i, i22, 6);
                } else {
                    dVar.h(dVar9.f59427i, dVar11.f59427i, i22, 8);
                }
                if (z19 && !z18) {
                    i21 = 5;
                }
                dVar.e(dVar9.f59427i, dVar9.f59424f.f59427i, i22, (r14 == eVar3 && z18 && r14.j0(i17)) ? 5 : i21);
            } else {
                z15 = z15;
                z11 = z11;
            }
            if (z16) {
                if (r14.X() == 8 || r14.f59431b0[i17] != bVar2) {
                    i16 = 0;
                } else {
                    d[] dVarArr2 = r14.Y;
                    i16 = 0;
                    dVar.h(dVarArr2[i12 + 1].f59427i, dVarArr2[i12].f59427i, 0, 5);
                }
                dVar.h(r14.Y[i12].f59427i, fVar.Y[i12].f59427i, i16, 8);
            }
            d dVar12 = r14.Y[i12 + 1].f59424f;
            if (dVar12 != null) {
                e eVar6 = dVar12.f59422d;
                d dVar13 = eVar6.Y[i12].f59424f;
                if (dVar13 != null && dVar13.f59422d == r14) {
                    obj2 = eVar6;
                }
            }
            if (obj2 != null) {
                r14 = obj2;
                z15 = z15;
            } else {
                z15 = true;
            }
            f12 = f11;
            z14 = z16;
            z13 = z18;
            z11 = z11;
            r14 = r14;
        }
        boolean z21 = z14;
        boolean z22 = z13;
        boolean z23 = z11;
        if (eVar4 != null) {
            int i23 = i12 + 1;
            if (eVar2.Y[i23].f59424f != null) {
                d dVar14 = eVar4.Y[i23];
                if (eVar4.f59431b0[i17] == e.b.MATCH_CONSTRAINT && eVar4.f59476y[i17] == 0 && !z22) {
                    d dVar15 = dVar14.f59424f;
                    if (dVar15.f59422d == fVar) {
                        dVar.e(dVar14.f59427i, dVar15.f59427i, -dVar14.f(), 5);
                    } else if (z22) {
                        dVar8 = dVar14.f59424f;
                        if (dVar8.f59422d == fVar) {
                            dVar.e(dVar14.f59427i, dVar8.f59427i, -dVar14.f(), 4);
                        }
                    }
                } else if (z22) {
                    dVar8 = dVar14.f59424f;
                    if (dVar8.f59422d == fVar) {
                        dVar.e(dVar14.f59427i, dVar8.f59427i, -dVar14.f(), 4);
                    }
                }
                dVar.j(dVar14.f59427i, eVar2.Y[i23].f59424f.f59427i, -dVar14.f(), 6);
            }
        }
        if (z21) {
            int i24 = i12 + 1;
            a5.i iVar5 = fVar.Y[i24].f59427i;
            d dVar16 = eVar2.Y[i24];
            dVar.h(iVar5, dVar16.f59427i, dVar16.f(), 8);
        }
        ArrayList<e> arrayList = cVar.f59404h;
        if (arrayList != null && (size = arrayList.size()) > 1) {
            float f13 = (!cVar.f59414r || cVar.f59416t) ? f11 : cVar.f59406j;
            float f14 = BitmapDescriptorFactory.HUE_RED;
            float f15 = 0.0f;
            e eVar7 = null;
            int i25 = 0;
            while (i25 < size) {
                e eVar8 = arrayList.get(i25);
                float f16 = eVar8.N0[i17];
                if (f16 < f14) {
                    if (cVar.f59416t) {
                        d[] dVarArr3 = eVar8.Y;
                        f14 = f14;
                        dVar.e(dVarArr3[i12 + 1].f59427i, dVarArr3[i12].f59427i, 0, 4);
                    } else {
                        f16 = 1.0f;
                    }
                    arrayList = arrayList;
                    i25++;
                    f14 = f14;
                    arrayList = arrayList;
                }
                float f17 = f16;
                if (f17 == f14) {
                    d[] dVarArr4 = eVar8.Y;
                    dVar.e(dVarArr4[i12 + 1].f59427i, dVarArr4[i12].f59427i, 0, 8);
                    arrayList = arrayList;
                } else {
                    if (eVar7 != null) {
                        d[] dVarArr5 = eVar7.Y;
                        a5.i iVar6 = dVarArr5[i12].f59427i;
                        int i26 = i12 + 1;
                        a5.i iVar7 = dVarArr5[i26].f59427i;
                        d[] dVarArr6 = eVar8.Y;
                        a5.i iVar8 = dVarArr6[i12].f59427i;
                        a5.i iVar9 = dVarArr6[i26].f59427i;
                        a5.b bVarR = dVar.r();
                        bVarR.l(f15, f13, f17, iVar6, iVar7, iVar8, iVar9);
                        dVar.d(bVarR);
                    }
                    eVar7 = eVar8;
                    f15 = f17;
                }
                i25++;
                f14 = f14;
                arrayList = arrayList;
            }
        }
        if (eVar3 != null && (eVar3 == eVar4 || z22)) {
            d dVar17 = eVar.Y[i12];
            int i27 = i12 + 1;
            d dVar18 = eVar2.Y[i27];
            d dVar19 = dVar17.f59424f;
            a5.i iVar10 = dVar19 != null ? dVar19.f59427i : null;
            d dVar20 = dVar18.f59424f;
            a5.i iVar11 = dVar20 != null ? dVar20.f59427i : null;
            d dVar21 = eVar3.Y[i12];
            if (eVar4 != null) {
                dVar18 = eVar4.Y[i27];
            }
            if (iVar10 != null && iVar11 != null) {
                dVar.c(dVar21.f59427i, iVar10, dVar21.f(), i17 == 0 ? eVar5.f59461q0 : eVar5.f59463r0, iVar11, dVar18.f59427i, dVar18.f(), 7);
            }
        } else {
            if (!z23 || eVar3 == null) {
                if (z12 && eVar3 != null) {
                    int i28 = cVar.f59406j;
                    boolean z24 = i28 > 0 && cVar.f59405i == i28;
                    e eVar9 = eVar3;
                    e eVar10 = eVar9;
                    while (eVar9 != null) {
                        e eVar11 = eVar9.P0[i11];
                        while (eVar11 != null && eVar11.X() == 8) {
                            eVar11 = eVar11.P0[i11];
                        }
                        if (eVar9 != eVar3 && eVar9 != eVar4 && eVar11 != null) {
                            if (eVar11 == eVar4) {
                                eVar11 = null;
                            }
                            d dVar22 = eVar9.Y[i12];
                            a5.i iVar12 = dVar22.f59427i;
                            d dVar23 = dVar22.f59424f;
                            if (dVar23 != null) {
                                a5.i iVar13 = dVar23.f59427i;
                            }
                            int i29 = i12 + 1;
                            a5.i iVar14 = eVar10.Y[i29].f59427i;
                            int iF2 = dVar22.f();
                            int iF3 = eVar9.Y[i29].f();
                            if (eVar11 != null) {
                                dVar3 = eVar11.Y[i12];
                                iVar = dVar3.f59427i;
                                d dVar24 = dVar3.f59424f;
                                iVar2 = dVar24 != null ? dVar24.f59427i : null;
                            } else {
                                dVar3 = eVar4.Y[i12];
                                iVar = dVar3 != null ? dVar3.f59427i : null;
                                iVar2 = eVar9.Y[i29].f59427i;
                            }
                            if (dVar3 != null) {
                                iF3 += dVar3.f();
                            }
                            int iF4 = iF2 + eVar10.Y[i29].f();
                            int i31 = z24 ? 8 : 4;
                            if (iVar12 != null && iVar14 != null && iVar != null && iVar2 != null) {
                                dVar.c(iVar12, iVar14, iF4, 0.5f, iVar, iVar2, iF3, i31);
                            }
                            eVar11 = eVar11;
                        }
                        if (eVar9.X() != 8) {
                            eVar10 = eVar9;
                        }
                        eVar9 = eVar11;
                    }
                    d dVar25 = eVar3.Y[i12];
                    d dVar26 = eVar.Y[i12].f59424f;
                    int i32 = i12 + 1;
                    d dVar27 = eVar4.Y[i32];
                    d dVar28 = eVar2.Y[i32].f59424f;
                    if (dVar26 == null) {
                        r11 = dVar;
                    } else {
                        if (eVar3 != eVar4) {
                            dVar.e(dVar25.f59427i, dVar26.f59427i, dVar25.f(), 5);
                        } else if (dVar28 != null) {
                            dVar2 = dVar;
                            dVar2.c(dVar25.f59427i, dVar26.f59427i, dVar25.f(), 0.5f, dVar27.f59427i, dVar28.f59427i, dVar27.f(), 5);
                        }
                        r11 = dVar;
                    }
                    if (dVar28 != null && eVar3 != eVar4) {
                        r11.e(dVar27.f59427i, dVar28.f59427i, -dVar27.f(), 5);
                    }
                }
                if ((z23 && !z12) || eVar3 == null || eVar3 == eVar4) {
                    return;
                }
                dVarArr = eVar3.Y;
                d dVar29 = dVarArr[i12];
                if (eVar4 == null) {
                    eVar4 = eVar3;
                }
                i15 = i12 + 1;
                dVar5 = eVar4.Y[i15];
                dVar6 = dVar29.f59424f;
                if (dVar6 != null) {
                    iVar4 = dVar6.f59427i;
                } else {
                    iVar4 = null;
                }
                dVar7 = dVar5.f59424f;
                if (dVar7 != null) {
                    obj = dVar7.f59427i;
                } else {
                    obj = null;
                }
                if (eVar2 != eVar4) {
                    d dVar30 = eVar2.Y[i15].f59424f;
                    obj = dVar30 != null ? dVar30.f59427i : null;
                }
                if (eVar3 == eVar4) {
                    dVar5 = dVarArr[i15];
                }
                if (iVar4 != null || obj == null) {
                }
                r11.c(dVar29.f59427i, iVar4, dVar29.f(), 0.5f, obj, dVar5.f59427i, eVar4.Y[i15].f(), 5);
                return;
            }
            int i33 = cVar.f59406j;
            boolean z25 = i33 > 0 && cVar.f59405i == i33;
            e eVar12 = eVar3;
            e eVar13 = eVar12;
            while (eVar12 != null) {
                e eVar14 = eVar12.P0[i17];
                while (true) {
                    if (eVar14 == null) {
                        i13 = 8;
                        break;
                    }
                    i13 = 8;
                    if (eVar14.X() != 8) {
                        break;
                    } else {
                        eVar14 = eVar14.P0[i17];
                    }
                }
                if (eVar14 != null || eVar12 == eVar4) {
                    d dVar31 = eVar12.Y[i12];
                    a5.i iVar15 = dVar31.f59427i;
                    d dVar32 = dVar31.f59424f;
                    a5.i iVar16 = dVar32 != null ? dVar32.f59427i : null;
                    if (eVar13 != eVar12) {
                        iVar16 = eVar13.Y[i12 + 1].f59427i;
                    } else if (eVar12 == eVar3) {
                        d dVar33 = eVar.Y[i12].f59424f;
                        iVar16 = dVar33 != null ? dVar33.f59427i : null;
                    }
                    int iF5 = dVar31.f();
                    int i34 = i12 + 1;
                    int iF6 = eVar12.Y[i34].f();
                    if (eVar14 != null) {
                        dVar4 = eVar14.Y[i12];
                        iVar3 = dVar4.f59427i;
                    } else {
                        dVar4 = eVar2.Y[i34].f59424f;
                        iVar3 = dVar4 != null ? dVar4.f59427i : null;
                    }
                    a5.i iVar17 = eVar12.Y[i34].f59427i;
                    if (dVar4 != null) {
                        iF6 += dVar4.f();
                    }
                    int iF7 = iF5 + eVar13.Y[i34].f();
                    if (iVar15 == null || iVar16 == null || iVar3 == null || iVar17 == null) {
                        i14 = 8;
                    } else {
                        if (eVar12 == eVar3) {
                            iF7 = eVar3.Y[i12].f();
                        }
                        if (eVar12 == eVar4) {
                            iF6 = eVar4.Y[i34].f();
                        }
                        eVar14 = eVar14;
                        i14 = 8;
                        dVar.c(iVar15, iVar16, iF7, 0.5f, iVar3, iVar17, iF6, z25 ? 8 : 5);
                    }
                    if (eVar12.X() != i14) {
                        eVar13 = eVar12;
                    }
                    i17 = i11;
                    eVar12 = eVar14;
                } else {
                    i14 = i13;
                }
                if (eVar12.X() != i14) {
                    eVar13 = eVar12;
                }
                i17 = i11;
                eVar12 = eVar14;
            }
        }
        r11 = dVar;
        if (z23) {
        }
        dVarArr = eVar3.Y;
        d dVar210 = dVarArr[i12];
        if (eVar4 == null) {
            eVar4 = eVar3;
        }
        i15 = i12 + 1;
        dVar5 = eVar4.Y[i15];
        dVar6 = dVar210.f59424f;
        if (dVar6 != null) {
            iVar4 = dVar6.f59427i;
        } else {
            iVar4 = null;
        }
        dVar7 = dVar5.f59424f;
        if (dVar7 != null) {
            obj = dVar7.f59427i;
        } else {
            obj = null;
        }
        if (eVar2 != eVar4) {
            d dVar34 = eVar2.Y[i15].f59424f;
            obj = dVar34 != null ? dVar34.f59427i : null;
        }
        if (eVar3 == eVar4) {
            dVar5 = dVarArr[i15];
        }
        if (iVar4 != null) {
        }
    }

    public static void b(f fVar, a5.d dVar, ArrayList<e> arrayList, int i11) {
        int i12;
        c[] cVarArr;
        int i13;
        if (i11 == 0) {
            i12 = fVar.f59487g1;
            cVarArr = fVar.f59490j1;
            i13 = 0;
        } else {
            i12 = fVar.f59488h1;
            cVarArr = fVar.f59489i1;
            i13 = 2;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            c cVar = cVarArr[i14];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f59397a)) {
                a(fVar, dVar, i11, i13, cVar);
            }
        }
    }
}
