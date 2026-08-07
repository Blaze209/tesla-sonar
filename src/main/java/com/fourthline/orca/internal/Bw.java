package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Bw {
    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(InterfaceC3903uh interfaceC3903uh, Pair pair, int i11, int i12, p020r2.l lVar, int i13) {
        a(interfaceC3903uh, pair, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00df  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:56:0x013f  */
    /* JADX WARN: Code duplicated, block: B:59:0x014b  */
    /* JADX WARN: Code duplicated, block: B:60:0x014f  */
    /* JADX WARN: Code duplicated, block: B:63:0x016e  */
    /* JADX WARN: Code duplicated, block: B:65:0x017c  */
    /* JADX WARN: Code duplicated, block: B:68:0x019b  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:72:0x0201  */
    /* JADX WARN: Code duplicated, block: B:75:0x020d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0211  */
    /* JADX WARN: Code duplicated, block: B:79:0x0230  */
    /* JADX WARN: Code duplicated, block: B:81:0x023e  */
    /* JADX WARN: Code duplicated, block: B:85:0x025c  */
    /* JADX WARN: Code duplicated, block: B:88:0x026e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0279  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static final void a(InterfaceC3903uh interfaceC3903uh, Pair pair, p020r2.l lVar, final int i11, final int i12) {
        int i13;
        Pair pair2;
        final Pair pair3;
        androidx.compose.ui.d.Companion companion;
        int iA;
        wn0.a<b4.g> aVarA;
        p020r2.l lVarA;
        wn0.p<b4.g, Integer, jn0.h0> pVarB;
        int iA2;
        wn0.a<b4.g> aVarA2;
        p020r2.l lVarA2;
        wn0.p<b4.g, Integer, jn0.h0> pVarB2;
        androidx.compose.ui.d.Companion companion2;
        int i14;
        int iA3;
        wn0.a<b4.g> aVarA3;
        p020r2.l lVarA3;
        wn0.p<b4.g, Integer, jn0.h0> pVarB3;
        p020r2.w2 w2VarX;
        final InterfaceC3903uh interfaceC3903uh2 = interfaceC3903uh;
        p020r2.l lVarV = lVar.v(1407233392);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? lVarV.n(interfaceC3903uh2) : lVarV.K(interfaceC3903uh2) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i16 = i12 & 2;
        if (i16 == 0) {
            if ((i11 & 48) == 0) {
                pair2 = pair;
                i13 |= lVarV.n(pair2) ? 32 : 16;
            }
            if ((i13 & 19) == 18 || !lVarV.b()) {
                if (i15 != 0) {
                    interfaceC3903uh2 = null;
                }
                if (i16 != 0) {
                    pair3 = null;
                } else {
                    pair3 = pair2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1407233392, i13, -1, "com.fourthline.orca.core.internal.capabilities.biometrics.screens.scanner.overlay.RandomnessLivenessFooter (RandomnessLivenessFooter.kt:25)");
                }
                companion = androidx.compose.ui.d.INSTANCE;
                androidx.compose.ui.d dVarK = androidx.compose.foundation.layout.t.k(companion, C3825sp.f35377a.c(lVarV, 6).f(), BitmapDescriptorFactory.HUE_RED, 2, null);
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
                Ko ko2 = Ko.f26627a;
                androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.x.i(companion, ko2.a());
                z3.i0 i0VarH = androidx.compose.foundation.layout.g.h(companion3.o(), false);
                iA2 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC2 = lVarV.c();
                androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(lVarV, dVarI);
                aVarA2 = companion4.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA2);
                } else {
                    lVarV.d();
                }
                lVarA2 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA2, i0VarH, companion4.c());
                p020r2.d4.b(lVarA2, xVarC2, companion4.e());
                pVarB2 = companion4.b();
                if (lVarA2.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                }
                p020r2.d4.b(lVarA2, dVarE2, companion4.d());
                androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
                lVarV.o(1894084088);
                if (interfaceC3903uh2 == null) {
                    companion2 = companion;
                    i14 = 6;
                } else {
                    companion2 = companion;
                    i14 = 6;
                    q1.b0.a(AbstractC3946vh.a(interfaceC3903uh2, lVarV, 0), null, androidx.compose.foundation.layout.x.d(companion, BitmapDescriptorFactory.HUE_RED, 1, null), null, z3.k.INSTANCE.c(), BitmapDescriptorFactory.HUE_RED, null, lVarV, 25008, 104);
                }
                lVarV.l();
                lVarV.g();
                v1.i0.a(androidx.compose.foundation.layout.x.i(companion2, w4.h.g(16)), lVarV, i14);
                androidx.compose.ui.d dVarI2 = androidx.compose.foundation.layout.x.i(companion2, ko2.a());
                z3.i0 i0VarH2 = androidx.compose.foundation.layout.g.h(companion3.o(), false);
                iA3 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC3 = lVarV.c();
                androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(lVarV, dVarI2);
                aVarA3 = companion4.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA3);
                } else {
                    lVarV.d();
                }
                lVarA3 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA3, i0VarH2, companion4.c());
                p020r2.d4.b(lVarA3, xVarC3, companion4.e());
                pVarB3 = companion4.b();
                if (lVarA3.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA3.I(), Integer.valueOf(iA3))) {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                }
                p020r2.d4.b(lVarA3, dVarE3, companion4.d());
                lVarV.o(1894098031);
                if (pair3 != null) {
                    Iz.a(pair3, lVarV, 0);
                }
                lVarV.l();
                lVarV.g();
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                interfaceC3903uh2 = interfaceC3903uh2;
            } else {
                lVarV.j();
                pair3 = pair2;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.a10
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return Bw.a(interfaceC3903uh2, pair3, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        pair2 = pair;
        if ((i13 & 19) == 18) {
            if (i15 != 0) {
                interfaceC3903uh2 = null;
            }
            if (i16 != 0) {
                pair3 = null;
            } else {
                pair3 = pair2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1407233392, i13, -1, "com.fourthline.orca.core.internal.capabilities.biometrics.screens.scanner.overlay.RandomnessLivenessFooter (RandomnessLivenessFooter.kt:25)");
            }
            companion = androidx.compose.ui.d.INSTANCE;
            androidx.compose.ui.d dVarK2 = androidx.compose.foundation.layout.t.k(companion, C3825sp.f35377a.c(lVarV, 6).f(), BitmapDescriptorFactory.HUE_RED, 2, null);
            d3.c.Companion companion5 = d3.c.INSTANCE;
            z3.i0 i0VarA2 = v1.g.a(v1.b.f117444a.g(), companion5.g(), lVarV, 48);
            iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC4 = lVarV.c();
            androidx.compose.ui.d dVarE4 = androidx.compose.ui.c.e(lVarV, dVarK2);
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
            p020r2.d4.b(lVarA, xVarC4, companion6.e());
            pVarB = companion6.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE4, companion6.d());
            v1.i0.a(v1.i.b(v1.j.f117505a, companion, 1.0f, false, 2, null), lVarV, 0);
            Ko ko3 = Ko.f26627a;
            androidx.compose.ui.d dVarI3 = androidx.compose.foundation.layout.x.i(companion, ko3.a());
            z3.i0 i0VarH3 = androidx.compose.foundation.layout.g.h(companion5.o(), false);
            iA2 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC5 = lVarV.c();
            androidx.compose.ui.d dVarE5 = androidx.compose.ui.c.e(lVarV, dVarI3);
            aVarA2 = companion6.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA2);
            } else {
                lVarV.d();
            }
            lVarA2 = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA2, i0VarH3, companion6.c());
            p020r2.d4.b(lVarA2, xVarC5, companion6.e());
            pVarB2 = companion6.b();
            if (lVarA2.getInserting()) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            } else {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            p020r2.d4.b(lVarA2, dVarE5, companion6.d());
            androidx.compose.foundation.layout.i iVar2 = androidx.compose.foundation.layout.i.f4585a;
            lVarV.o(1894084088);
            if (interfaceC3903uh2 == null) {
                companion2 = companion;
                i14 = 6;
            } else {
                companion2 = companion;
                i14 = 6;
                q1.b0.a(AbstractC3946vh.a(interfaceC3903uh2, lVarV, 0), null, androidx.compose.foundation.layout.x.d(companion, BitmapDescriptorFactory.HUE_RED, 1, null), null, z3.k.INSTANCE.c(), BitmapDescriptorFactory.HUE_RED, null, lVarV, 25008, 104);
            }
            lVarV.l();
            lVarV.g();
            v1.i0.a(androidx.compose.foundation.layout.x.i(companion2, w4.h.g(16)), lVarV, i14);
            androidx.compose.ui.d dVarI4 = androidx.compose.foundation.layout.x.i(companion2, ko3.a());
            z3.i0 i0VarH4 = androidx.compose.foundation.layout.g.h(companion5.o(), false);
            iA3 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC6 = lVarV.c();
            androidx.compose.ui.d dVarE6 = androidx.compose.ui.c.e(lVarV, dVarI4);
            aVarA3 = companion6.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA3);
            } else {
                lVarV.d();
            }
            lVarA3 = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA3, i0VarH4, companion6.c());
            p020r2.d4.b(lVarA3, xVarC6, companion6.e());
            pVarB3 = companion6.b();
            if (lVarA3.getInserting()) {
                lVarA3.B(Integer.valueOf(iA3));
                lVarA3.f(Integer.valueOf(iA3), pVarB3);
            } else {
                lVarA3.B(Integer.valueOf(iA3));
                lVarA3.f(Integer.valueOf(iA3), pVarB3);
            }
            p020r2.d4.b(lVarA3, dVarE6, companion6.d());
            lVarV.o(1894098031);
            if (pair3 != null) {
                Iz.a(pair3, lVarV, 0);
            }
            lVarV.l();
            lVarV.g();
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            interfaceC3903uh2 = interfaceC3903uh2;
        } else {
            if (i15 != 0) {
                interfaceC3903uh2 = null;
            }
            if (i16 != 0) {
                pair3 = null;
            } else {
                pair3 = pair2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1407233392, i13, -1, "com.fourthline.orca.core.internal.capabilities.biometrics.screens.scanner.overlay.RandomnessLivenessFooter (RandomnessLivenessFooter.kt:25)");
            }
            companion = androidx.compose.ui.d.INSTANCE;
            androidx.compose.ui.d dVarK3 = androidx.compose.foundation.layout.t.k(companion, C3825sp.f35377a.c(lVarV, 6).f(), BitmapDescriptorFactory.HUE_RED, 2, null);
            d3.c.Companion companion7 = d3.c.INSTANCE;
            z3.i0 i0VarA3 = v1.g.a(v1.b.f117444a.g(), companion7.g(), lVarV, 48);
            iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC7 = lVarV.c();
            androidx.compose.ui.d dVarE7 = androidx.compose.ui.c.e(lVarV, dVarK3);
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
            p020r2.d4.b(lVarA, xVarC7, companion8.e());
            pVarB = companion8.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE7, companion8.d());
            v1.i0.a(v1.i.b(v1.j.f117505a, companion, 1.0f, false, 2, null), lVarV, 0);
            Ko ko4 = Ko.f26627a;
            androidx.compose.ui.d dVarI5 = androidx.compose.foundation.layout.x.i(companion, ko4.a());
            z3.i0 i0VarH5 = androidx.compose.foundation.layout.g.h(companion7.o(), false);
            iA2 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC8 = lVarV.c();
            androidx.compose.ui.d dVarE8 = androidx.compose.ui.c.e(lVarV, dVarI5);
            aVarA2 = companion8.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA2);
            } else {
                lVarV.d();
            }
            lVarA2 = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA2, i0VarH5, companion8.c());
            p020r2.d4.b(lVarA2, xVarC8, companion8.e());
            pVarB2 = companion8.b();
            if (lVarA2.getInserting()) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            } else {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            p020r2.d4.b(lVarA2, dVarE8, companion8.d());
            androidx.compose.foundation.layout.i iVar3 = androidx.compose.foundation.layout.i.f4585a;
            lVarV.o(1894084088);
            if (interfaceC3903uh2 == null) {
                companion2 = companion;
                i14 = 6;
            } else {
                companion2 = companion;
                i14 = 6;
                q1.b0.a(AbstractC3946vh.a(interfaceC3903uh2, lVarV, 0), null, androidx.compose.foundation.layout.x.d(companion, BitmapDescriptorFactory.HUE_RED, 1, null), null, z3.k.INSTANCE.c(), BitmapDescriptorFactory.HUE_RED, null, lVarV, 25008, 104);
            }
            lVarV.l();
            lVarV.g();
            v1.i0.a(androidx.compose.foundation.layout.x.i(companion2, w4.h.g(16)), lVarV, i14);
            androidx.compose.ui.d dVarI6 = androidx.compose.foundation.layout.x.i(companion2, ko4.a());
            z3.i0 i0VarH6 = androidx.compose.foundation.layout.g.h(companion7.o(), false);
            iA3 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC9 = lVarV.c();
            androidx.compose.ui.d dVarE9 = androidx.compose.ui.c.e(lVarV, dVarI6);
            aVarA3 = companion8.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA3);
            } else {
                lVarV.d();
            }
            lVarA3 = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA3, i0VarH6, companion8.c());
            p020r2.d4.b(lVarA3, xVarC9, companion8.e());
            pVarB3 = companion8.b();
            if (lVarA3.getInserting()) {
                lVarA3.B(Integer.valueOf(iA3));
                lVarA3.f(Integer.valueOf(iA3), pVarB3);
            } else {
                lVarA3.B(Integer.valueOf(iA3));
                lVarA3.f(Integer.valueOf(iA3), pVarB3);
            }
            p020r2.d4.b(lVarA3, dVarE9, companion8.d());
            lVarV.o(1894098031);
            if (pair3 != null) {
                Iz.a(pair3, lVarV, 0);
            }
            lVarV.l();
            lVarV.g();
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            interfaceC3903uh2 = interfaceC3903uh2;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.a10
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Bw.a(interfaceC3903uh2, pair3, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
