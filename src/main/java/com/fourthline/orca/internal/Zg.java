package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i4.TextStyle;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Zg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(androidx.compose.ui.d dVar, String str, d3.c.b bVar, long j11, TextStyle textStyle, C3820sk c3820sk, int i11, int i12, p020r2.l lVar, int i13) {
        a(dVar, str, bVar, j11, textStyle, c3820sk, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0152  */
    /* JADX WARN: Code duplicated, block: B:102:0x0157  */
    /* JADX WARN: Code duplicated, block: B:105:0x0164  */
    /* JADX WARN: Code duplicated, block: B:108:0x019b  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:121:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:125:0x0202  */
    /* JADX WARN: Code duplicated, block: B:127:0x0246  */
    /* JADX WARN: Code duplicated, block: B:128:0x0263  */
    /* JADX WARN: Code duplicated, block: B:130:0x0267  */
    /* JADX WARN: Code duplicated, block: B:134:0x0290  */
    /* JADX WARN: Code duplicated, block: B:137:0x031b  */
    /* JADX WARN: Code duplicated, block: B:141:0x032e  */
    /* JADX WARN: Code duplicated, block: B:143:0x033d  */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0 A[PHI: r16
      0x00a0: PHI (r16v12 int) = (r16v0 int), (r16v6 int), (r16v7 int) binds: [B:57:0x009e, B:67:0x00bb, B:66:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00db  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x0107 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0109  */
    /* JADX WARN: Code duplicated, block: B:88:0x010c  */
    /* JADX WARN: Code duplicated, block: B:90:0x010f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0116  */
    /* JADX WARN: Code duplicated, block: B:94:0x011b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0134  */
    /* JADX WARN: Code duplicated, block: B:98:0x0139  */
    /* JADX WARN: Code duplicated, block: B:99:0x014f  */
    public static final void a(androidx.compose.ui.d dVar, final String titleText, d3.c.b bVar, long j11, TextStyle textStyle, C3820sk c3820sk, p020r2.l lVar, final int i11, final int i12) {
        androidx.compose.ui.d dVar2;
        int i13;
        d3.c.b bVar2;
        long j12;
        TextStyle textStyle2;
        int i14;
        int i15;
        boolean zK;
        androidx.compose.ui.d dVar3;
        d3.c.b bVarK;
        long jA;
        TextStyle textStyleA;
        C3820sk c3820sk2;
        androidx.compose.ui.d dVar4;
        d3.c.b bVar3;
        int iA;
        wn0.a<b4.g> aVarA;
        p020r2.l lVarA;
        wn0.p<b4.g, Integer, jn0.h0> pVarB;
        C3735qk c3735qkC;
        C3506lC c3506lC;
        InterfaceC3777rk.a aVar;
        jn0.h0 h0Var;
        p020r2.l lVar2;
        final TextStyle textStyle3;
        final C3820sk c3820sk3;
        final androidx.compose.ui.d dVar5;
        final long j13;
        final d3.c.b bVar4;
        p020r2.w2 w2VarX;
        int i16;
        p013kotlin.jvm.internal.s.k(titleText, "titleText");
        p020r2.l lVarV = lVar.v(-139689166);
        int i17 = i12 & 1;
        if (i17 != 0) {
            i13 = i11 | 6;
            dVar2 = dVar;
        } else if ((i11 & 6) == 0) {
            dVar2 = dVar;
            i13 = (lVarV.n(dVar2) ? 4 : 2) | i11;
        } else {
            dVar2 = dVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= lVarV.n(titleText) ? 32 : 16;
        }
        int i18 = i12 & 4;
        if (i18 == 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                bVar2 = bVar;
                i13 |= lVarV.n(bVar2) ? 256 : 128;
            }
            if ((i11 & 3072) == 0) {
                if ((i12 & 8) == 0) {
                    j12 = j11;
                    int i19 = lVarV.s(j12) ? 2048 : 1024;
                    i13 |= i19;
                } else {
                    j12 = j11;
                }
                i13 |= i19;
            } else {
                j12 = j11;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    textStyle2 = textStyle;
                    if (lVarV.n(textStyle2)) {
                        i16 = 16384;
                    }
                    i13 |= i16;
                } else {
                    textStyle2 = textStyle;
                }
                i16 = PKIFailureInfo.certRevoked;
                i13 |= i16;
            } else {
                textStyle2 = textStyle;
            }
            i14 = i12 & 32;
            i15 = 196608;
            if (i14 == 0) {
                i13 |= i15;
            } else if ((i11 & 196608) == 0) {
                if ((i11 & 262144) == 0) {
                    zK = lVarV.n(c3820sk);
                } else {
                    zK = lVarV.K(c3820sk);
                }
                if (zK) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i13 |= i15;
            }
            if ((i13 & 74899) == 74898 || !lVarV.b()) {
                lVarV.L();
                if ((i11 & 1) != 0 || lVarV.k()) {
                    if (i17 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i18 != 0) {
                        bVarK = d3.c.INSTANCE.k();
                    } else {
                        bVarK = bVar2;
                    }
                    if ((i12 & 8) != 0) {
                        jA = C3825sp.f35377a.b(lVarV, 6).getScreen().getHeader().getColor().a(lVarV, 0);
                        i13 &= -7169;
                    } else {
                        jA = j12;
                    }
                    if ((i12 & 16) != 0) {
                        textStyleA = C3825sp.f35377a.b(lVarV, 6).getScreen().getHeader().a(null, lVarV, 0, 1);
                        i13 &= -57345;
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i14 != 0) {
                        dVar4 = dVar3;
                        bVar3 = bVarK;
                        c3820sk2 = null;
                    } else {
                        c3820sk2 = c3820sk;
                        dVar4 = dVar3;
                        bVar3 = bVarK;
                    }
                } else {
                    lVarV.j();
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                    }
                    c3820sk2 = c3820sk;
                    dVar4 = dVar2;
                    bVar3 = bVar2;
                    jA = j12;
                    textStyleA = textStyle2;
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(-139689166, i13, -1, "com.fourthline.orca.core.internal.composable.Header (Header.kt:30)");
                }
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.x.h(dVar4, BitmapDescriptorFactory.HUE_RED, 1, null);
                z3.i0 i0VarA = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                iA = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC = lVarV.c();
                androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVarH);
                b4.g.Companion companion = b4.g.INSTANCE;
                aVarA = companion.a();
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
                p020r2.d4.b(lVarA, i0VarA, companion.c());
                p020r2.d4.b(lVarA, xVarC, companion.e());
                pVarB = companion.b();
                if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                p020r2.d4.b(lVarA, dVarE, companion.d());
                v1.j jVar = v1.j.f117505a;
                if (c3820sk2 != null) {
                    c3735qkC = c3820sk2.c();
                } else {
                    c3735qkC = null;
                }
                lVarV.o(-203617318);
                if (c3735qkC == null) {
                    h0Var = null;
                } else {
                    c3506lC = new C3506lC(((InterfaceC3777rk.a) c3735qkC.a()).a().a(), C3825sp.f35377a.b(lVarV, 6).getScreen().getHeader().getColor().a(lVarV, 0), c3735qkC.b(), null);
                    aVar = (InterfaceC3777rk.a) c3735qkC.a();
                    if (aVar instanceof InterfaceC3777rk.a.C0608a) {
                        lVarV.o(-2040390346);
                        AbstractC3549mC.a((androidx.compose.ui.d) null, c3506lC, (C3506lC) null, lVarV, 0, 5);
                        lVarV.l();
                    } else {
                        if (!(aVar instanceof InterfaceC3777rk.a.c)) {
                            lVarV.o(-2040392294);
                            lVarV.l();
                            throw new NoWhenBranchMatchedException();
                        }
                        lVarV.o(-2040387658);
                        AbstractC3549mC.a((androidx.compose.ui.d) null, (C3506lC) null, c3506lC, lVarV, 0, 3);
                        lVarV.l();
                    }
                    h0Var = jn0.h0.f84049a;
                }
                lVarV.l();
                lVarV.o(-203618699);
                if (h0Var == null) {
                    v1.i0.a(androidx.compose.foundation.layout.x.i(androidx.compose.ui.d.INSTANCE, w4.h.g(24)), lVarV, 6);
                }
                lVarV.l();
                androidx.compose.ui.d.Companion companion2 = androidx.compose.ui.d.INSTANCE;
                d3.c.b bVar5 = bVar3;
                TextStyle textStyle4 = textStyleA;
                long j14 = jA;
                androidx.compose.ui.d dVar6 = dVar4;
                p009i2.v2.b(titleText, AbstractC3307gk.a(jVar.c(AbstractC3307gk.a((androidx.compose.ui.d) companion2, false), bVar3), "headerView", (String) null, 2, (Object) null), j14, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle4, lVarV, (i13 >> 3) & 910, (i13 << 6) & 3670016, 65528);
                v1.i0.a(androidx.compose.foundation.layout.x.i(companion2, w4.h.g(16)), lVarV, 6);
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVar2 = lVarV;
                textStyle3 = textStyle4;
                c3820sk3 = c3820sk2;
                dVar5 = dVar6;
                j13 = j14;
                bVar4 = bVar5;
            } else {
                lVarV.j();
                androidx.compose.ui.d dVar7 = dVar2;
                c3820sk3 = c3820sk;
                dVar5 = dVar7;
                lVar2 = lVarV;
                bVar4 = bVar2;
                j13 = j12;
                textStyle3 = textStyle2;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.px0
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return Zg.a(dVar5, titleText, bVar4, j13, textStyle3, c3820sk3, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        bVar2 = bVar;
        if ((i11 & 3072) == 0) {
            if ((i12 & 8) == 0) {
                j12 = j11;
                if (lVarV.s(j12)) {
                }
                i13 |= i19;
            } else {
                j12 = j11;
            }
            i13 |= i19;
        } else {
            j12 = j11;
        }
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                textStyle2 = textStyle;
                if (lVarV.n(textStyle2)) {
                    i16 = 16384;
                }
                i13 |= i16;
            } else {
                textStyle2 = textStyle;
            }
            i16 = PKIFailureInfo.certRevoked;
            i13 |= i16;
        } else {
            textStyle2 = textStyle;
        }
        i14 = i12 & 32;
        i15 = 196608;
        if (i14 == 0) {
            i13 |= i15;
        } else if ((i11 & 196608) == 0) {
            if ((i11 & 262144) == 0) {
                zK = lVarV.n(c3820sk);
            } else {
                zK = lVarV.K(c3820sk);
            }
            if (zK) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i13 |= i15;
        }
        if ((i13 & 74899) == 74898) {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i17 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i18 != 0) {
                    bVarK = d3.c.INSTANCE.k();
                } else {
                    bVarK = bVar2;
                }
                if ((i12 & 8) != 0) {
                    jA = C3825sp.f35377a.b(lVarV, 6).getScreen().getHeader().getColor().a(lVarV, 0);
                    i13 &= -7169;
                } else {
                    jA = j12;
                }
                if ((i12 & 16) != 0) {
                    textStyleA = C3825sp.f35377a.b(lVarV, 6).getScreen().getHeader().a(null, lVarV, 0, 1);
                    i13 &= -57345;
                } else {
                    textStyleA = textStyle2;
                }
                if (i14 != 0) {
                    dVar4 = dVar3;
                    bVar3 = bVarK;
                    c3820sk2 = null;
                } else {
                    c3820sk2 = c3820sk;
                    dVar4 = dVar3;
                    bVar3 = bVarK;
                }
            } else {
                if (i17 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i18 != 0) {
                    bVarK = d3.c.INSTANCE.k();
                } else {
                    bVarK = bVar2;
                }
                if ((i12 & 8) != 0) {
                    jA = C3825sp.f35377a.b(lVarV, 6).getScreen().getHeader().getColor().a(lVarV, 0);
                    i13 &= -7169;
                } else {
                    jA = j12;
                }
                if ((i12 & 16) != 0) {
                    textStyleA = C3825sp.f35377a.b(lVarV, 6).getScreen().getHeader().a(null, lVarV, 0, 1);
                    i13 &= -57345;
                } else {
                    textStyleA = textStyle2;
                }
                if (i14 != 0) {
                    dVar4 = dVar3;
                    bVar3 = bVarK;
                    c3820sk2 = null;
                } else {
                    c3820sk2 = c3820sk;
                    dVar4 = dVar3;
                    bVar3 = bVarK;
                }
            }
            lVarV.C();
            if (p020r2.o.J()) {
                p020r2.o.S(-139689166, i13, -1, "com.fourthline.orca.core.internal.composable.Header (Header.kt:30)");
            }
            androidx.compose.ui.d dVarH2 = androidx.compose.foundation.layout.x.h(dVar4, BitmapDescriptorFactory.HUE_RED, 1, null);
            z3.i0 i0VarA2 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
            iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC2 = lVarV.c();
            androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(lVarV, dVarH2);
            b4.g.Companion companion3 = b4.g.INSTANCE;
            aVarA = companion3.a();
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
            p020r2.d4.b(lVarA, i0VarA2, companion3.c());
            p020r2.d4.b(lVarA, xVarC2, companion3.e());
            pVarB = companion3.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE2, companion3.d());
            v1.j jVar2 = v1.j.f117505a;
            if (c3820sk2 != null) {
                c3735qkC = c3820sk2.c();
            } else {
                c3735qkC = null;
            }
            lVarV.o(-203617318);
            if (c3735qkC == null) {
                h0Var = null;
            } else {
                c3506lC = new C3506lC(((InterfaceC3777rk.a) c3735qkC.a()).a().a(), C3825sp.f35377a.b(lVarV, 6).getScreen().getHeader().getColor().a(lVarV, 0), c3735qkC.b(), null);
                aVar = (InterfaceC3777rk.a) c3735qkC.a();
                if (aVar instanceof InterfaceC3777rk.a.C0608a) {
                    lVarV.o(-2040390346);
                    AbstractC3549mC.a((androidx.compose.ui.d) null, c3506lC, (C3506lC) null, lVarV, 0, 5);
                    lVarV.l();
                } else {
                    if (!(aVar instanceof InterfaceC3777rk.a.c)) {
                        lVarV.o(-2040392294);
                        lVarV.l();
                        throw new NoWhenBranchMatchedException();
                    }
                    lVarV.o(-2040387658);
                    AbstractC3549mC.a((androidx.compose.ui.d) null, (C3506lC) null, c3506lC, lVarV, 0, 3);
                    lVarV.l();
                }
                h0Var = jn0.h0.f84049a;
            }
            lVarV.l();
            lVarV.o(-203618699);
            if (h0Var == null) {
                v1.i0.a(androidx.compose.foundation.layout.x.i(androidx.compose.ui.d.INSTANCE, w4.h.g(24)), lVarV, 6);
            }
            lVarV.l();
            androidx.compose.ui.d.Companion companion4 = androidx.compose.ui.d.INSTANCE;
            d3.c.b bVar6 = bVar3;
            TextStyle textStyle5 = textStyleA;
            long j15 = jA;
            androidx.compose.ui.d dVar8 = dVar4;
            p009i2.v2.b(titleText, AbstractC3307gk.a(jVar2.c(AbstractC3307gk.a((androidx.compose.ui.d) companion4, false), bVar3), "headerView", (String) null, 2, (Object) null), j15, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle5, lVarV, (i13 >> 3) & 910, (i13 << 6) & 3670016, 65528);
            v1.i0.a(androidx.compose.foundation.layout.x.i(companion4, w4.h.g(16)), lVarV, 6);
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVar2 = lVarV;
            textStyle3 = textStyle5;
            c3820sk3 = c3820sk2;
            dVar5 = dVar8;
            j13 = j15;
            bVar4 = bVar6;
        } else {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i17 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i18 != 0) {
                    bVarK = d3.c.INSTANCE.k();
                } else {
                    bVarK = bVar2;
                }
                if ((i12 & 8) != 0) {
                    jA = C3825sp.f35377a.b(lVarV, 6).getScreen().getHeader().getColor().a(lVarV, 0);
                    i13 &= -7169;
                } else {
                    jA = j12;
                }
                if ((i12 & 16) != 0) {
                    textStyleA = C3825sp.f35377a.b(lVarV, 6).getScreen().getHeader().a(null, lVarV, 0, 1);
                    i13 &= -57345;
                } else {
                    textStyleA = textStyle2;
                }
                if (i14 != 0) {
                    dVar4 = dVar3;
                    bVar3 = bVarK;
                    c3820sk2 = null;
                } else {
                    c3820sk2 = c3820sk;
                    dVar4 = dVar3;
                    bVar3 = bVarK;
                }
            } else {
                if (i17 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i18 != 0) {
                    bVarK = d3.c.INSTANCE.k();
                } else {
                    bVarK = bVar2;
                }
                if ((i12 & 8) != 0) {
                    jA = C3825sp.f35377a.b(lVarV, 6).getScreen().getHeader().getColor().a(lVarV, 0);
                    i13 &= -7169;
                } else {
                    jA = j12;
                }
                if ((i12 & 16) != 0) {
                    textStyleA = C3825sp.f35377a.b(lVarV, 6).getScreen().getHeader().a(null, lVarV, 0, 1);
                    i13 &= -57345;
                } else {
                    textStyleA = textStyle2;
                }
                if (i14 != 0) {
                    dVar4 = dVar3;
                    bVar3 = bVarK;
                    c3820sk2 = null;
                } else {
                    c3820sk2 = c3820sk;
                    dVar4 = dVar3;
                    bVar3 = bVarK;
                }
            }
            lVarV.C();
            if (p020r2.o.J()) {
                p020r2.o.S(-139689166, i13, -1, "com.fourthline.orca.core.internal.composable.Header (Header.kt:30)");
            }
            androidx.compose.ui.d dVarH3 = androidx.compose.foundation.layout.x.h(dVar4, BitmapDescriptorFactory.HUE_RED, 1, null);
            z3.i0 i0VarA3 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
            iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC3 = lVarV.c();
            androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(lVarV, dVarH3);
            b4.g.Companion companion5 = b4.g.INSTANCE;
            aVarA = companion5.a();
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
            p020r2.d4.b(lVarA, i0VarA3, companion5.c());
            p020r2.d4.b(lVarA, xVarC3, companion5.e());
            pVarB = companion5.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE3, companion5.d());
            v1.j jVar3 = v1.j.f117505a;
            if (c3820sk2 != null) {
                c3735qkC = c3820sk2.c();
            } else {
                c3735qkC = null;
            }
            lVarV.o(-203617318);
            if (c3735qkC == null) {
                h0Var = null;
            } else {
                c3506lC = new C3506lC(((InterfaceC3777rk.a) c3735qkC.a()).a().a(), C3825sp.f35377a.b(lVarV, 6).getScreen().getHeader().getColor().a(lVarV, 0), c3735qkC.b(), null);
                aVar = (InterfaceC3777rk.a) c3735qkC.a();
                if (aVar instanceof InterfaceC3777rk.a.C0608a) {
                    lVarV.o(-2040390346);
                    AbstractC3549mC.a((androidx.compose.ui.d) null, c3506lC, (C3506lC) null, lVarV, 0, 5);
                    lVarV.l();
                } else {
                    if (!(aVar instanceof InterfaceC3777rk.a.c)) {
                        lVarV.o(-2040392294);
                        lVarV.l();
                        throw new NoWhenBranchMatchedException();
                    }
                    lVarV.o(-2040387658);
                    AbstractC3549mC.a((androidx.compose.ui.d) null, (C3506lC) null, c3506lC, lVarV, 0, 3);
                    lVarV.l();
                }
                h0Var = jn0.h0.f84049a;
            }
            lVarV.l();
            lVarV.o(-203618699);
            if (h0Var == null) {
                v1.i0.a(androidx.compose.foundation.layout.x.i(androidx.compose.ui.d.INSTANCE, w4.h.g(24)), lVarV, 6);
            }
            lVarV.l();
            androidx.compose.ui.d.Companion companion6 = androidx.compose.ui.d.INSTANCE;
            d3.c.b bVar7 = bVar3;
            TextStyle textStyle6 = textStyleA;
            long j16 = jA;
            androidx.compose.ui.d dVar9 = dVar4;
            p009i2.v2.b(titleText, AbstractC3307gk.a(jVar3.c(AbstractC3307gk.a((androidx.compose.ui.d) companion6, false), bVar3), "headerView", (String) null, 2, (Object) null), j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle6, lVarV, (i13 >> 3) & 910, (i13 << 6) & 3670016, 65528);
            v1.i0.a(androidx.compose.foundation.layout.x.i(companion6, w4.h.g(16)), lVarV, 6);
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVar2 = lVarV;
            textStyle3 = textStyle6;
            c3820sk3 = c3820sk2;
            dVar5 = dVar9;
            j13 = j16;
            bVar4 = bVar7;
        }
        w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.px0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Zg.a(dVar5, titleText, bVar4, j13, textStyle3, c3820sk3, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
