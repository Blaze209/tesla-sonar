package com.fourthline.orca.internal;

import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* JADX INFO: renamed from: com.fourthline.orca.internal.rg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3773rg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(androidx.compose.ui.d dVar, C3735qk c3735qk, C3735qk c3735qk2, boolean z11, int i11, int i12, p020r2.l lVar, int i13) {
        a(dVar, c3735qk, c3735qk2, z11, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:61:0x009c  */
    /* JADX WARN: Code duplicated, block: B:63:0x009f  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:80:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0119  */
    /* JADX WARN: Code duplicated, block: B:86:0x0139  */
    /* JADX WARN: Code duplicated, block: B:90:0x0162  */
    /* JADX WARN: Code duplicated, block: B:93:0x018b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x01a9  */
    public static final void a(androidx.compose.ui.d dVar, C3735qk c3735qk, C3735qk c3735qk2, boolean z11, p020r2.l lVar, final int i11, final int i12) {
        int i13;
        boolean z12;
        jn0.h0 h0Var;
        boolean z13;
        int iA;
        wn0.a<b4.g> aVarA;
        p020r2.l lVarA;
        wn0.p<b4.g, Integer, jn0.h0> pVarB;
        final boolean z14;
        final androidx.compose.ui.d dVar2;
        final C3735qk c3735qk3;
        final C3735qk c3735qk4;
        p020r2.w2 w2VarX;
        C3735qk c3735qk5 = c3735qk2;
        p020r2.l lVarV = lVar.v(-1912359204);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.n(dVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= (i11 & 64) == 0 ? lVarV.n(c3735qk) : lVarV.K(c3735qk) ? 32 : 16;
        }
        int i16 = i12 & 4;
        if (i16 != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= (i11 & 512) == 0 ? lVarV.n(c3735qk5) : lVarV.K(c3735qk5) ? 256 : 128;
        }
        int i17 = i12 & 8;
        if (i17 == 0) {
            if ((i11 & 3072) == 0) {
                z12 = z11;
                i13 |= lVarV.p(z12) ? 2048 : 1024;
            }
            if ((i13 & 1171) == 1170 || !lVarV.b()) {
                if (i14 != 0) {
                    dVar = androidx.compose.ui.d.INSTANCE;
                }
                h0Var = null;
                if (i15 != 0) {
                    c3735qk = null;
                }
                if (i16 != 0) {
                    c3735qk5 = null;
                }
                if (i17 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1912359204, i13, -1, "com.fourthline.orca.core.internal.composable.Footer (Footer.kt:29)");
                }
                z3.i0 i0VarA = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.g(), lVarV, 48);
                iA = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC = lVarV.c();
                androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVar);
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
                lVarV.o(-136750150);
                if (c3735qk != null) {
                    AbstractC3610no.a(AbstractC3307gk.a(androidx.compose.ui.d.INSTANCE, 91.0f), ((InterfaceC3777rk.b) c3735qk.a()).a(), true, c3735qk.b(), lVarV, KyberEngine.KyberPolyBytes, 0);
                }
                lVarV.l();
                lVarV.o(-136740116);
                if (c3735qk5 != null) {
                    S3.a(AbstractC3307gk.a(androidx.compose.ui.d.INSTANCE, 93.0f), ((InterfaceC3777rk.a) c3735qk5.a()).a(), null, c3735qk5.b(), lVarV, 0, 4);
                    h0Var = jn0.h0.f84049a;
                }
                lVarV.l();
                lVarV.o(-136740615);
                if (h0Var == null && z13) {
                    v1.i0.a(androidx.compose.foundation.layout.x.i(androidx.compose.ui.d.INSTANCE, Ko.f26627a.a()), lVarV, 6);
                }
                lVarV.l();
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                z14 = z13;
            } else {
                lVarV.j();
                z14 = z12;
            }
            dVar2 = dVar;
            c3735qk3 = c3735qk;
            c3735qk4 = c3735qk5;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.gb1
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC3773rg.a(dVar2, c3735qk3, c3735qk4, z14, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        z12 = z11;
        if ((i13 & 1171) == 1170) {
            if (i14 != 0) {
                dVar = androidx.compose.ui.d.INSTANCE;
            }
            h0Var = null;
            if (i15 != 0) {
                c3735qk = null;
            }
            if (i16 != 0) {
                c3735qk5 = null;
            }
            if (i17 != 0) {
                z13 = false;
            } else {
                z13 = z12;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1912359204, i13, -1, "com.fourthline.orca.core.internal.composable.Footer (Footer.kt:29)");
            }
            z3.i0 i0VarA2 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.g(), lVarV, 48);
            iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC2 = lVarV.c();
            androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(lVarV, dVar);
            b4.g.Companion companion2 = b4.g.INSTANCE;
            aVarA = companion2.a();
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
            p020r2.d4.b(lVarA, i0VarA2, companion2.c());
            p020r2.d4.b(lVarA, xVarC2, companion2.e());
            pVarB = companion2.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE2, companion2.d());
            v1.j jVar2 = v1.j.f117505a;
            lVarV.o(-136750150);
            if (c3735qk != null) {
                AbstractC3610no.a(AbstractC3307gk.a(androidx.compose.ui.d.INSTANCE, 91.0f), ((InterfaceC3777rk.b) c3735qk.a()).a(), true, c3735qk.b(), lVarV, KyberEngine.KyberPolyBytes, 0);
            }
            lVarV.l();
            lVarV.o(-136740116);
            if (c3735qk5 != null) {
                S3.a(AbstractC3307gk.a(androidx.compose.ui.d.INSTANCE, 93.0f), ((InterfaceC3777rk.a) c3735qk5.a()).a(), null, c3735qk5.b(), lVarV, 0, 4);
                h0Var = jn0.h0.f84049a;
            }
            lVarV.l();
            lVarV.o(-136740615);
            if (h0Var == null) {
                v1.i0.a(androidx.compose.foundation.layout.x.i(androidx.compose.ui.d.INSTANCE, Ko.f26627a.a()), lVarV, 6);
            }
            lVarV.l();
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            z14 = z13;
        } else {
            if (i14 != 0) {
                dVar = androidx.compose.ui.d.INSTANCE;
            }
            h0Var = null;
            if (i15 != 0) {
                c3735qk = null;
            }
            if (i16 != 0) {
                c3735qk5 = null;
            }
            if (i17 != 0) {
                z13 = false;
            } else {
                z13 = z12;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1912359204, i13, -1, "com.fourthline.orca.core.internal.composable.Footer (Footer.kt:29)");
            }
            z3.i0 i0VarA3 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.g(), lVarV, 48);
            iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC3 = lVarV.c();
            androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(lVarV, dVar);
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
            p020r2.d4.b(lVarA, i0VarA3, companion3.c());
            p020r2.d4.b(lVarA, xVarC3, companion3.e());
            pVarB = companion3.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE3, companion3.d());
            v1.j jVar3 = v1.j.f117505a;
            lVarV.o(-136750150);
            if (c3735qk != null) {
                AbstractC3610no.a(AbstractC3307gk.a(androidx.compose.ui.d.INSTANCE, 91.0f), ((InterfaceC3777rk.b) c3735qk.a()).a(), true, c3735qk.b(), lVarV, KyberEngine.KyberPolyBytes, 0);
            }
            lVarV.l();
            lVarV.o(-136740116);
            if (c3735qk5 != null) {
                S3.a(AbstractC3307gk.a(androidx.compose.ui.d.INSTANCE, 93.0f), ((InterfaceC3777rk.a) c3735qk5.a()).a(), null, c3735qk5.b(), lVarV, 0, 4);
                h0Var = jn0.h0.f84049a;
            }
            lVarV.l();
            lVarV.o(-136740615);
            if (h0Var == null) {
                v1.i0.a(androidx.compose.foundation.layout.x.i(androidx.compose.ui.d.INSTANCE, Ko.f26627a.a()), lVarV, 6);
            }
            lVarV.l();
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            z14 = z13;
        }
        dVar2 = dVar;
        c3735qk3 = c3735qk;
        c3735qk4 = c3735qk5;
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.gb1
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3773rg.a(dVar2, c3735qk3, c3735qk4, z14, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
