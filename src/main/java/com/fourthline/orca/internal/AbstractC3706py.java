package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i4.TextStyle;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* JADX INFO: renamed from: com.fourthline.orca.internal.py, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3706py {
    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(Yj yj2, Yj yj3, String str, int i11, int i12, p020r2.l lVar, int i13) {
        a(yj2, yj3, str, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:66:0x0105  */
    /* JADX WARN: Code duplicated, block: B:68:0x0113  */
    /* JADX WARN: Code duplicated, block: B:71:0x0140  */
    /* JADX WARN: Code duplicated, block: B:73:0x014b  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:80:0x0235  */
    /* JADX WARN: Code duplicated, block: B:83:0x0241  */
    /* JADX WARN: Code duplicated, block: B:84:0x0245  */
    /* JADX WARN: Code duplicated, block: B:87:0x0264  */
    /* JADX WARN: Code duplicated, block: B:89:0x0272  */
    /* JADX WARN: Code duplicated, block: B:93:0x0292  */
    /* JADX WARN: Code duplicated, block: B:96:0x02a4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public static final void a(Yj yj2, final Yj yj3, String str, p020r2.l lVar, final int i11, final int i12) {
        int i13;
        String str2;
        Yj yj4;
        String str3;
        androidx.compose.ui.d.Companion companion;
        C3825sp c3825sp;
        int iA;
        wn0.a<b4.g> aVarA;
        p020r2.l lVarA;
        wn0.p<b4.g, Integer, jn0.h0> pVarB;
        int i14;
        androidx.compose.ui.d.Companion companion2;
        int i15;
        ?? r11;
        p020r2.l lVar2;
        int iA2;
        wn0.a<b4.g> aVarA2;
        p020r2.l lVarA2;
        wn0.p<b4.g, Integer, jn0.h0> pVarB2;
        final Yj yj5;
        final String str4;
        p020r2.w2 w2VarX;
        p020r2.l lVarV = lVar.v(520457457);
        int i16 = i12 & 1;
        if (i16 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? lVarV.n(yj2) : lVarV.K(yj2) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= (i11 & 64) == 0 ? lVarV.n(yj3) : lVarV.K(yj3) ? 32 : 16;
        }
        int i17 = i12 & 4;
        if (i17 == 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                str2 = str;
                i13 |= lVarV.n(str2) ? 256 : 128;
            }
            if ((i13 & 147) == 146 || !lVarV.b()) {
                if (i16 != 0) {
                    yj4 = null;
                } else {
                    yj4 = yj2;
                }
                if (i17 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(520457457, i13, -1, "com.fourthline.orca.core.internal.capabilities.biometrics.screens.scanner.overlay.SelfieScannerScanningFooter (SelfieScannerScanningFooter.kt:29)");
                }
                companion = androidx.compose.ui.d.INSTANCE;
                c3825sp = C3825sp.f35377a;
                androidx.compose.ui.d dVarK = androidx.compose.foundation.layout.t.k(companion, c3825sp.c(lVarV, 6).f(), BitmapDescriptorFactory.HUE_RED, 2, null);
                d3.c.Companion companion3 = d3.c.INSTANCE;
                z3.i0 i0VarA = v1.g.a(v1.b.f117444a.g(), companion3.g(), lVarV, 48);
                iA = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC = lVarV.c();
                androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVarK);
                b4.g.Companion companion4 = b4.g.INSTANCE;
                aVarA = companion4.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA, i0VarA, companion4.c());
                p020r2.d4.b(lVarA, xVarC, companion4.e());
                pVarB = companion4.b();
                if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                p020r2.d4.b(lVarA, dVarE, companion4.d());
                v1.i0.a(v1.i.b(v1.j.f117505a, companion, 1.0f, false, 2, null), lVarV, 0);
                lVarV.o(226128329);
                if (yj4 == null) {
                    i15 = 6;
                    i14 = i13;
                    r11 = 0;
                    lVar2 = lVarV;
                    companion2 = companion;
                } else {
                    i14 = i13;
                    companion2 = companion;
                    i15 = 6;
                    r11 = 0;
                    TA.a(null, false, false, c3825sp.b(lVarV, 6).getSpinner().getHighlight().a(lVarV, 0), 0L, 0L, 0L, Integer.MAX_VALUE, BitmapDescriptorFactory.HUE_RED, null, yj4, null, null, null, lVarV, 12582912, i13 & 14, 15223);
                    lVar2 = lVarV;
                }
                Yj yj6 = yj4;
                lVar2.l();
                lVar2.o(226136913);
                if (str3 == 0) {
                    str2 = str3;
                } else {
                    int iA3 = t4.j.INSTANCE.a();
                    TextStyle textStyleA = c3825sp.b(lVar2, i15).getScanner().getMessage().a(null, lVar2, r11, 1);
                    p020r2.l lVar3 = lVar2;
                    String str5 = str3;
                    p009i2.v2.b(str5, null, 0L, 0L, null, null, null, 0L, null, t4.j.h(iA3), 0L, t4.t.INSTANCE.b(), false, 2, 0, null, textStyleA, lVar3, (i14 >> 6) & 14, 3120, 54782);
                    str2 = str5;
                    lVar2 = lVar3;
                }
                lVar2.l();
                v1.i0.a(androidx.compose.foundation.layout.x.i(companion2, w4.h.g(16)), lVar2, i15);
                androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.x.i(companion2, Ko.f26627a.a());
                z3.i0 i0VarH = androidx.compose.foundation.layout.g.h(companion3.o(), r11);
                iA2 = p020r2.j.a(lVar2, r11);
                p020r2.x xVarC2 = lVar2.c();
                androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(lVar2, dVarI);
                aVarA2 = companion4.a();
                if (lVar2.w() == null) {
                    p020r2.j.c();
                }
                lVar2.h();
                if (lVar2.getInserting()) {
                    lVar2.z(aVarA2);
                } else {
                    lVar2.d();
                }
                lVarA2 = p020r2.d4.a(lVar2);
                p020r2.d4.b(lVarA2, i0VarH, companion4.c());
                p020r2.d4.b(lVarA2, xVarC2, companion4.e());
                pVarB2 = companion4.b();
                if (lVarA2.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                }
                p020r2.d4.b(lVarA2, dVarE2, companion4.d());
                androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
                lVar2.o(1775977713);
                if (yj3 != null) {
                    Vs.a(yj3, lVar2, r11);
                }
                lVar2.l();
                lVar2.g();
                lVar2.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                yj5 = yj6;
            } else {
                lVarV.j();
                yj5 = yj2;
                lVar2 = lVarV;
            }
            str4 = str2;
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.t91
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC3706py.a(yj5, yj3, str4, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        str2 = str;
        if ((i13 & 147) == 146) {
            if (i16 != 0) {
                yj4 = null;
            } else {
                yj4 = yj2;
            }
            if (i17 != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(520457457, i13, -1, "com.fourthline.orca.core.internal.capabilities.biometrics.screens.scanner.overlay.SelfieScannerScanningFooter (SelfieScannerScanningFooter.kt:29)");
            }
            companion = androidx.compose.ui.d.INSTANCE;
            c3825sp = C3825sp.f35377a;
            androidx.compose.ui.d dVarK2 = androidx.compose.foundation.layout.t.k(companion, c3825sp.c(lVarV, 6).f(), BitmapDescriptorFactory.HUE_RED, 2, null);
            d3.c.Companion companion5 = d3.c.INSTANCE;
            z3.i0 i0VarA2 = v1.g.a(v1.b.f117444a.g(), companion5.g(), lVarV, 48);
            iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC3 = lVarV.c();
            androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(lVarV, dVarK2);
            b4.g.Companion companion6 = b4.g.INSTANCE;
            aVarA = companion6.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA, i0VarA2, companion6.c());
            p020r2.d4.b(lVarA, xVarC3, companion6.e());
            pVarB = companion6.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE3, companion6.d());
            v1.i0.a(v1.i.b(v1.j.f117505a, companion, 1.0f, false, 2, null), lVarV, 0);
            lVarV.o(226128329);
            if (yj4 == null) {
                i15 = 6;
                i14 = i13;
                r11 = 0;
                lVar2 = lVarV;
                companion2 = companion;
            } else {
                i14 = i13;
                companion2 = companion;
                i15 = 6;
                r11 = 0;
                TA.a(null, false, false, c3825sp.b(lVarV, 6).getSpinner().getHighlight().a(lVarV, 0), 0L, 0L, 0L, Integer.MAX_VALUE, BitmapDescriptorFactory.HUE_RED, null, yj4, null, null, null, lVarV, 12582912, i13 & 14, 15223);
                lVar2 = lVarV;
            }
            Yj yj7 = yj4;
            lVar2.l();
            lVar2.o(226136913);
            if (str3 == 0) {
                str2 = str3;
            } else {
                int iA4 = t4.j.INSTANCE.a();
                TextStyle textStyleA2 = c3825sp.b(lVar2, i15).getScanner().getMessage().a(null, lVar2, r11, 1);
                p020r2.l lVar4 = lVar2;
                String str6 = str3;
                p009i2.v2.b(str6, null, 0L, 0L, null, null, null, 0L, null, t4.j.h(iA4), 0L, t4.t.INSTANCE.b(), false, 2, 0, null, textStyleA2, lVar4, (i14 >> 6) & 14, 3120, 54782);
                str2 = str6;
                lVar2 = lVar4;
            }
            lVar2.l();
            v1.i0.a(androidx.compose.foundation.layout.x.i(companion2, w4.h.g(16)), lVar2, i15);
            androidx.compose.ui.d dVarI2 = androidx.compose.foundation.layout.x.i(companion2, Ko.f26627a.a());
            z3.i0 i0VarH2 = androidx.compose.foundation.layout.g.h(companion5.o(), r11);
            iA2 = p020r2.j.a(lVar2, r11);
            p020r2.x xVarC4 = lVar2.c();
            androidx.compose.ui.d dVarE4 = androidx.compose.ui.c.e(lVar2, dVarI2);
            aVarA2 = companion6.a();
            if (lVar2.w() == null) {
                p020r2.j.c();
            }
            lVar2.h();
            if (lVar2.getInserting()) {
                lVar2.z(aVarA2);
            } else {
                lVar2.d();
            }
            lVarA2 = p020r2.d4.a(lVar2);
            p020r2.d4.b(lVarA2, i0VarH2, companion6.c());
            p020r2.d4.b(lVarA2, xVarC4, companion6.e());
            pVarB2 = companion6.b();
            if (lVarA2.getInserting()) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            } else {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            p020r2.d4.b(lVarA2, dVarE4, companion6.d());
            androidx.compose.foundation.layout.i iVar2 = androidx.compose.foundation.layout.i.f4585a;
            lVar2.o(1775977713);
            if (yj3 != null) {
                Vs.a(yj3, lVar2, r11);
            }
            lVar2.l();
            lVar2.g();
            lVar2.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            yj5 = yj7;
        } else {
            if (i16 != 0) {
                yj4 = null;
            } else {
                yj4 = yj2;
            }
            if (i17 != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(520457457, i13, -1, "com.fourthline.orca.core.internal.capabilities.biometrics.screens.scanner.overlay.SelfieScannerScanningFooter (SelfieScannerScanningFooter.kt:29)");
            }
            companion = androidx.compose.ui.d.INSTANCE;
            c3825sp = C3825sp.f35377a;
            androidx.compose.ui.d dVarK3 = androidx.compose.foundation.layout.t.k(companion, c3825sp.c(lVarV, 6).f(), BitmapDescriptorFactory.HUE_RED, 2, null);
            d3.c.Companion companion7 = d3.c.INSTANCE;
            z3.i0 i0VarA3 = v1.g.a(v1.b.f117444a.g(), companion7.g(), lVarV, 48);
            iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC5 = lVarV.c();
            androidx.compose.ui.d dVarE5 = androidx.compose.ui.c.e(lVarV, dVarK3);
            b4.g.Companion companion8 = b4.g.INSTANCE;
            aVarA = companion8.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA, i0VarA3, companion8.c());
            p020r2.d4.b(lVarA, xVarC5, companion8.e());
            pVarB = companion8.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE5, companion8.d());
            v1.i0.a(v1.i.b(v1.j.f117505a, companion, 1.0f, false, 2, null), lVarV, 0);
            lVarV.o(226128329);
            if (yj4 == null) {
                i15 = 6;
                i14 = i13;
                r11 = 0;
                lVar2 = lVarV;
                companion2 = companion;
            } else {
                i14 = i13;
                companion2 = companion;
                i15 = 6;
                r11 = 0;
                TA.a(null, false, false, c3825sp.b(lVarV, 6).getSpinner().getHighlight().a(lVarV, 0), 0L, 0L, 0L, Integer.MAX_VALUE, BitmapDescriptorFactory.HUE_RED, null, yj4, null, null, null, lVarV, 12582912, i13 & 14, 15223);
                lVar2 = lVarV;
            }
            Yj yj8 = yj4;
            lVar2.l();
            lVar2.o(226136913);
            if (str3 == 0) {
                str2 = str3;
            } else {
                int iA5 = t4.j.INSTANCE.a();
                TextStyle textStyleA3 = c3825sp.b(lVar2, i15).getScanner().getMessage().a(null, lVar2, r11, 1);
                p020r2.l lVar5 = lVar2;
                String str7 = str3;
                p009i2.v2.b(str7, null, 0L, 0L, null, null, null, 0L, null, t4.j.h(iA5), 0L, t4.t.INSTANCE.b(), false, 2, 0, null, textStyleA3, lVar5, (i14 >> 6) & 14, 3120, 54782);
                str2 = str7;
                lVar2 = lVar5;
            }
            lVar2.l();
            v1.i0.a(androidx.compose.foundation.layout.x.i(companion2, w4.h.g(16)), lVar2, i15);
            androidx.compose.ui.d dVarI3 = androidx.compose.foundation.layout.x.i(companion2, Ko.f26627a.a());
            z3.i0 i0VarH3 = androidx.compose.foundation.layout.g.h(companion7.o(), r11);
            iA2 = p020r2.j.a(lVar2, r11);
            p020r2.x xVarC6 = lVar2.c();
            androidx.compose.ui.d dVarE6 = androidx.compose.ui.c.e(lVar2, dVarI3);
            aVarA2 = companion8.a();
            if (lVar2.w() == null) {
                p020r2.j.c();
            }
            lVar2.h();
            if (lVar2.getInserting()) {
                lVar2.z(aVarA2);
            } else {
                lVar2.d();
            }
            lVarA2 = p020r2.d4.a(lVar2);
            p020r2.d4.b(lVarA2, i0VarH3, companion8.c());
            p020r2.d4.b(lVarA2, xVarC6, companion8.e());
            pVarB2 = companion8.b();
            if (lVarA2.getInserting()) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            } else {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            p020r2.d4.b(lVarA2, dVarE6, companion8.d());
            androidx.compose.foundation.layout.i iVar3 = androidx.compose.foundation.layout.i.f4585a;
            lVar2.o(1775977713);
            if (yj3 != null) {
                Vs.a(yj3, lVar2, r11);
            }
            lVar2.l();
            lVar2.g();
            lVar2.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            yj5 = yj8;
        }
        str4 = str2;
        w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.t91
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3706py.a(yj5, yj3, str4, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
