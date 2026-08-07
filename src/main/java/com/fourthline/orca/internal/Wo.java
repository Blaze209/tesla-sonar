package com.fourthline.orca.internal;

import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Wo {

    static final class a implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p016o2.j0 f29586a;

        a(p016o2.j0 j0Var) {
            this.f29586a = j0Var;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(26536350, i11, -1, "com.fourthline.orca.core.internal.composable.OrcaScaffold.<anonymous> (OrcaScaffold.kt:39)");
            }
            p016o2.i0.b(this.f29586a, null, null, lVar, 0, 6);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((p020r2.l) obj, ((Number) obj2).intValue());
            return jn0.h0.f84049a;
        }
    }

    static final class b implements wn0.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f29587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f29588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.q f29589c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.q f29590d;

        b(boolean z11, float f11, wn0.q qVar, wn0.q qVar2) {
            this.f29587a = z11;
            this.f29588b = f11;
            this.f29589c = qVar;
            this.f29590d = qVar2;
        }

        public final void a(v1.y it, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(it, "it");
            if ((i11 & 6) == 0) {
                i11 |= lVar.n(it) ? 4 : 2;
            }
            if ((i11 & 19) == 18 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(200925301, i11, -1, "com.fourthline.orca.core.internal.composable.OrcaScaffold.<anonymous> (OrcaScaffold.kt:42)");
            }
            androidx.compose.ui.d dVarA = AbstractC3307gk.a(AbstractC3307gk.a(androidx.compose.ui.d.INSTANCE, this.f29587a));
            float top = it.getTop();
            float bottom = it.getBottom();
            float f11 = this.f29588b;
            androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.t.l(dVarA, f11, top, f11, bottom);
            wn0.q qVar = this.f29589c;
            wn0.q qVar2 = this.f29590d;
            z3.i0 i0VarA = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVar, 0);
            int iA = p020r2.j.a(lVar, 0);
            p020r2.x xVarC = lVar.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar, dVarL);
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            p020r2.l lVarA = p020r2.d4.a(lVar);
            p020r2.d4.b(lVarA, i0VarA, companion.c());
            p020r2.d4.b(lVarA, xVarC, companion.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB = companion.b();
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE, companion.d());
            v1.j jVar = v1.j.f117505a;
            qVar.invoke(jVar, lVar, 6);
            qVar2.invoke(jVar, lVar, 6);
            lVar.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((v1.y) obj, (p020r2.l) obj2, ((Number) obj3).intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(androidx.compose.ui.d dVar, boolean z11, p016o2.j0 j0Var, wn0.q qVar, wn0.q qVar2, int i11, int i12, p020r2.l lVar, int i13) {
        a(dVar, z11, j0Var, qVar, qVar2, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00de  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x0116  */
    /* JADX WARN: Code duplicated, block: B:86:0x0171  */
    /* JADX WARN: Code duplicated, block: B:90:0x017e  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static final void a(androidx.compose.ui.d dVar, boolean z11, p016o2.j0 j0Var, wn0.q qVar, final wn0.q content, p020r2.l lVar, final int i11, final int i12) {
        androidx.compose.ui.d dVar2;
        int i13;
        boolean z12;
        int i14;
        p016o2.j0 j0Var2;
        int i15;
        int i16;
        wn0.q qVar2;
        int i17;
        int i18;
        androidx.compose.ui.d dVar3;
        boolean z13;
        p016o2.j0 j0Var3;
        wn0.q qVarA;
        Object objI;
        p020r2.l lVar2;
        final androidx.compose.ui.d dVar4;
        final boolean z14;
        final p016o2.j0 j0Var4;
        final wn0.q qVar3;
        Object objI2;
        p020r2.w2 w2VarX;
        p013kotlin.jvm.internal.s.k(content, "content");
        p020r2.l lVarV = lVar.v(-1607092572);
        int i19 = i12 & 1;
        if (i19 != 0) {
            i13 = i11 | 6;
            dVar2 = dVar;
        } else if ((i11 & 6) == 0) {
            dVar2 = dVar;
            i13 = (lVarV.n(dVar2) ? 4 : 2) | i11;
        } else {
            dVar2 = dVar;
            i13 = i11;
        }
        int i21 = i12 & 2;
        if (i21 == 0) {
            if ((i11 & 48) == 0) {
                z12 = z11;
                i13 |= lVarV.p(z12) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                    j0Var2 = j0Var;
                    if (lVarV.n(j0Var2)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 8;
                if (i16 != 0) {
                    if ((i11 & 3072) == 0) {
                        qVar2 = qVar;
                        if (lVarV.K(qVar2)) {
                            i17 = 2048;
                        } else {
                            i17 = 1024;
                        }
                        i13 |= i17;
                    }
                    if ((i12 & 16) != 0) {
                        i13 |= 24576;
                    } else if ((i11 & 24576) == 0) {
                        if (lVarV.K(content)) {
                            i18 = 16384;
                        } else {
                            i18 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i18;
                    }
                    if ((i13 & 9363) == 9362 || !lVarV.b()) {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i21 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i14 != 0) {
                            lVarV.o(1241795260);
                            objI2 = lVarV.I();
                            if (objI2 == p020r2.l.INSTANCE.a()) {
                                objI2 = new p016o2.j0();
                                lVarV.B(objI2);
                            }
                            j0Var3 = (p016o2.j0) objI2;
                            lVarV.l();
                        } else {
                            j0Var3 = j0Var2;
                        }
                        if (i16 != 0) {
                            qVarA = C3971w4.f36328a.a();
                        } else {
                            qVarA = qVar2;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-1607092572, i13, -1, "com.fourthline.orca.core.internal.composable.OrcaScaffold (OrcaScaffold.kt:31)");
                        }
                        C3825sp c3825sp = C3825sp.f35377a;
                        float f11 = c3825sp.c(lVarV, 6).f();
                        androidx.compose.ui.d dVarA = AbstractC3307gk.a(dVar3);
                        lVarV.o(1241804727);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = new wn0.l() { // from class: com.fourthline.orca.internal.cv0
                                @Override // wn0.l
                                public final Object invoke(Object obj) {
                                    return Wo.a((g4.y) obj);
                                }
                            };
                            lVarV.B(objI);
                        }
                        lVarV.l();
                        androidx.compose.ui.d dVarD = g4.o.d(dVarA, false, (wn0.l) objI, 1, null);
                        z2.a aVarE = z2.c.e(26536350, true, new a(j0Var3), lVarV, 54);
                        long jA = c3825sp.b(lVarV, 6).getScreen().getBackground().a(lVarV, 0);
                        z2.a aVarE2 = z2.c.e(200925301, true, new b(z13, f11, qVarA, content), lVarV, 54);
                        p016o2.j0 j0Var5 = j0Var3;
                        wn0.q qVar4 = qVarA;
                        boolean z15 = z13;
                        lVar2 = lVarV;
                        p016o2.b0.a(dVarD, null, null, aVarE, null, 0, jA, 0L, null, aVarE2, lVar2, 805309440, 438);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        dVar4 = dVar3;
                        z14 = z15;
                        j0Var4 = j0Var5;
                        qVar3 = qVar4;
                    } else {
                        lVarV.j();
                        lVar2 = lVarV;
                        dVar4 = dVar2;
                        z14 = z12;
                        j0Var4 = j0Var2;
                        qVar3 = qVar2;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.dv0
                            @Override // wn0.p
                            public final Object invoke(Object obj, Object obj2) {
                                return Wo.a(dVar4, z14, j0Var4, qVar3, content, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 3072;
                qVar2 = qVar;
                if ((i12 & 16) != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    if (lVarV.K(content)) {
                        i18 = 16384;
                    } else {
                        i18 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i18;
                }
                if ((i13 & 9363) == 9362) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i21 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i14 != 0) {
                        lVarV.o(1241795260);
                        objI2 = lVarV.I();
                        if (objI2 == p020r2.l.INSTANCE.a()) {
                            objI2 = new p016o2.j0();
                            lVarV.B(objI2);
                        }
                        j0Var3 = (p016o2.j0) objI2;
                        lVarV.l();
                    } else {
                        j0Var3 = j0Var2;
                    }
                    if (i16 != 0) {
                        qVarA = C3971w4.f36328a.a();
                    } else {
                        qVarA = qVar2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1607092572, i13, -1, "com.fourthline.orca.core.internal.composable.OrcaScaffold (OrcaScaffold.kt:31)");
                    }
                    C3825sp c3825sp2 = C3825sp.f35377a;
                    float f12 = c3825sp2.c(lVarV, 6).f();
                    androidx.compose.ui.d dVarA2 = AbstractC3307gk.a(dVar3);
                    lVarV.o(1241804727);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = new wn0.l() { // from class: com.fourthline.orca.internal.cv0
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return Wo.a((g4.y) obj);
                            }
                        };
                        lVarV.B(objI);
                    }
                    lVarV.l();
                    androidx.compose.ui.d dVarD2 = g4.o.d(dVarA2, false, (wn0.l) objI, 1, null);
                    z2.a aVarE3 = z2.c.e(26536350, true, new a(j0Var3), lVarV, 54);
                    long jA2 = c3825sp2.b(lVarV, 6).getScreen().getBackground().a(lVarV, 0);
                    z2.a aVarE4 = z2.c.e(200925301, true, new b(z13, f12, qVarA, content), lVarV, 54);
                    p016o2.j0 j0Var6 = j0Var3;
                    wn0.q qVar5 = qVarA;
                    boolean z16 = z13;
                    lVar2 = lVarV;
                    p016o2.b0.a(dVarD2, null, null, aVarE3, null, 0, jA2, 0L, null, aVarE4, lVar2, 805309440, 438);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    dVar4 = dVar3;
                    z14 = z16;
                    j0Var4 = j0Var6;
                    qVar3 = qVar5;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i21 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i14 != 0) {
                        lVarV.o(1241795260);
                        objI2 = lVarV.I();
                        if (objI2 == p020r2.l.INSTANCE.a()) {
                            objI2 = new p016o2.j0();
                            lVarV.B(objI2);
                        }
                        j0Var3 = (p016o2.j0) objI2;
                        lVarV.l();
                    } else {
                        j0Var3 = j0Var2;
                    }
                    if (i16 != 0) {
                        qVarA = C3971w4.f36328a.a();
                    } else {
                        qVarA = qVar2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1607092572, i13, -1, "com.fourthline.orca.core.internal.composable.OrcaScaffold (OrcaScaffold.kt:31)");
                    }
                    C3825sp c3825sp3 = C3825sp.f35377a;
                    float f13 = c3825sp3.c(lVarV, 6).f();
                    androidx.compose.ui.d dVarA3 = AbstractC3307gk.a(dVar3);
                    lVarV.o(1241804727);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = new wn0.l() { // from class: com.fourthline.orca.internal.cv0
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return Wo.a((g4.y) obj);
                            }
                        };
                        lVarV.B(objI);
                    }
                    lVarV.l();
                    androidx.compose.ui.d dVarD3 = g4.o.d(dVarA3, false, (wn0.l) objI, 1, null);
                    z2.a aVarE5 = z2.c.e(26536350, true, new a(j0Var3), lVarV, 54);
                    long jA3 = c3825sp3.b(lVarV, 6).getScreen().getBackground().a(lVarV, 0);
                    z2.a aVarE6 = z2.c.e(200925301, true, new b(z13, f13, qVarA, content), lVarV, 54);
                    p016o2.j0 j0Var7 = j0Var3;
                    wn0.q qVar6 = qVarA;
                    boolean z17 = z13;
                    lVar2 = lVarV;
                    p016o2.b0.a(dVarD3, null, null, aVarE5, null, 0, jA3, 0L, null, aVarE6, lVar2, 805309440, 438);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    dVar4 = dVar3;
                    z14 = z17;
                    j0Var4 = j0Var7;
                    qVar3 = qVar6;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.dv0
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return Wo.a(dVar4, z14, j0Var4, qVar3, content, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= KyberEngine.KyberPolyBytes;
            j0Var2 = j0Var;
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    qVar2 = qVar;
                    if (lVarV.K(qVar2)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                if ((i12 & 16) != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    if (lVarV.K(content)) {
                        i18 = 16384;
                    } else {
                        i18 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i18;
                }
                if ((i13 & 9363) == 9362) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i21 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i14 != 0) {
                        lVarV.o(1241795260);
                        objI2 = lVarV.I();
                        if (objI2 == p020r2.l.INSTANCE.a()) {
                            objI2 = new p016o2.j0();
                            lVarV.B(objI2);
                        }
                        j0Var3 = (p016o2.j0) objI2;
                        lVarV.l();
                    } else {
                        j0Var3 = j0Var2;
                    }
                    if (i16 != 0) {
                        qVarA = C3971w4.f36328a.a();
                    } else {
                        qVarA = qVar2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1607092572, i13, -1, "com.fourthline.orca.core.internal.composable.OrcaScaffold (OrcaScaffold.kt:31)");
                    }
                    C3825sp c3825sp4 = C3825sp.f35377a;
                    float f14 = c3825sp4.c(lVarV, 6).f();
                    androidx.compose.ui.d dVarA4 = AbstractC3307gk.a(dVar3);
                    lVarV.o(1241804727);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = new wn0.l() { // from class: com.fourthline.orca.internal.cv0
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return Wo.a((g4.y) obj);
                            }
                        };
                        lVarV.B(objI);
                    }
                    lVarV.l();
                    androidx.compose.ui.d dVarD4 = g4.o.d(dVarA4, false, (wn0.l) objI, 1, null);
                    z2.a aVarE7 = z2.c.e(26536350, true, new a(j0Var3), lVarV, 54);
                    long jA4 = c3825sp4.b(lVarV, 6).getScreen().getBackground().a(lVarV, 0);
                    z2.a aVarE8 = z2.c.e(200925301, true, new b(z13, f14, qVarA, content), lVarV, 54);
                    p016o2.j0 j0Var8 = j0Var3;
                    wn0.q qVar7 = qVarA;
                    boolean z18 = z13;
                    lVar2 = lVarV;
                    p016o2.b0.a(dVarD4, null, null, aVarE7, null, 0, jA4, 0L, null, aVarE8, lVar2, 805309440, 438);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    dVar4 = dVar3;
                    z14 = z18;
                    j0Var4 = j0Var8;
                    qVar3 = qVar7;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i21 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i14 != 0) {
                        lVarV.o(1241795260);
                        objI2 = lVarV.I();
                        if (objI2 == p020r2.l.INSTANCE.a()) {
                            objI2 = new p016o2.j0();
                            lVarV.B(objI2);
                        }
                        j0Var3 = (p016o2.j0) objI2;
                        lVarV.l();
                    } else {
                        j0Var3 = j0Var2;
                    }
                    if (i16 != 0) {
                        qVarA = C3971w4.f36328a.a();
                    } else {
                        qVarA = qVar2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1607092572, i13, -1, "com.fourthline.orca.core.internal.composable.OrcaScaffold (OrcaScaffold.kt:31)");
                    }
                    C3825sp c3825sp5 = C3825sp.f35377a;
                    float f15 = c3825sp5.c(lVarV, 6).f();
                    androidx.compose.ui.d dVarA5 = AbstractC3307gk.a(dVar3);
                    lVarV.o(1241804727);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = new wn0.l() { // from class: com.fourthline.orca.internal.cv0
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return Wo.a((g4.y) obj);
                            }
                        };
                        lVarV.B(objI);
                    }
                    lVarV.l();
                    androidx.compose.ui.d dVarD5 = g4.o.d(dVarA5, false, (wn0.l) objI, 1, null);
                    z2.a aVarE9 = z2.c.e(26536350, true, new a(j0Var3), lVarV, 54);
                    long jA5 = c3825sp5.b(lVarV, 6).getScreen().getBackground().a(lVarV, 0);
                    z2.a aVarE10 = z2.c.e(200925301, true, new b(z13, f15, qVarA, content), lVarV, 54);
                    p016o2.j0 j0Var9 = j0Var3;
                    wn0.q qVar8 = qVarA;
                    boolean z19 = z13;
                    lVar2 = lVarV;
                    p016o2.b0.a(dVarD5, null, null, aVarE9, null, 0, jA5, 0L, null, aVarE10, lVar2, 805309440, 438);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    dVar4 = dVar3;
                    z14 = z19;
                    j0Var4 = j0Var9;
                    qVar3 = qVar8;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.dv0
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return Wo.a(dVar4, z14, j0Var4, qVar3, content, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            qVar2 = qVar;
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                if (lVarV.K(content)) {
                    i18 = 16384;
                } else {
                    i18 = PKIFailureInfo.certRevoked;
                }
                i13 |= i18;
            }
            if ((i13 & 9363) == 9362) {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i21 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i14 != 0) {
                    lVarV.o(1241795260);
                    objI2 = lVarV.I();
                    if (objI2 == p020r2.l.INSTANCE.a()) {
                        objI2 = new p016o2.j0();
                        lVarV.B(objI2);
                    }
                    j0Var3 = (p016o2.j0) objI2;
                    lVarV.l();
                } else {
                    j0Var3 = j0Var2;
                }
                if (i16 != 0) {
                    qVarA = C3971w4.f36328a.a();
                } else {
                    qVarA = qVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1607092572, i13, -1, "com.fourthline.orca.core.internal.composable.OrcaScaffold (OrcaScaffold.kt:31)");
                }
                C3825sp c3825sp6 = C3825sp.f35377a;
                float f16 = c3825sp6.c(lVarV, 6).f();
                androidx.compose.ui.d dVarA6 = AbstractC3307gk.a(dVar3);
                lVarV.o(1241804727);
                objI = lVarV.I();
                if (objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.cv0
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return Wo.a((g4.y) obj);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                androidx.compose.ui.d dVarD6 = g4.o.d(dVarA6, false, (wn0.l) objI, 1, null);
                z2.a aVarE11 = z2.c.e(26536350, true, new a(j0Var3), lVarV, 54);
                long jA6 = c3825sp6.b(lVarV, 6).getScreen().getBackground().a(lVarV, 0);
                z2.a aVarE12 = z2.c.e(200925301, true, new b(z13, f16, qVarA, content), lVarV, 54);
                p016o2.j0 j0Var10 = j0Var3;
                wn0.q qVar9 = qVarA;
                boolean z110 = z13;
                lVar2 = lVarV;
                p016o2.b0.a(dVarD6, null, null, aVarE11, null, 0, jA6, 0L, null, aVarE12, lVar2, 805309440, 438);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar3;
                z14 = z110;
                j0Var4 = j0Var10;
                qVar3 = qVar9;
            } else {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i21 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i14 != 0) {
                    lVarV.o(1241795260);
                    objI2 = lVarV.I();
                    if (objI2 == p020r2.l.INSTANCE.a()) {
                        objI2 = new p016o2.j0();
                        lVarV.B(objI2);
                    }
                    j0Var3 = (p016o2.j0) objI2;
                    lVarV.l();
                } else {
                    j0Var3 = j0Var2;
                }
                if (i16 != 0) {
                    qVarA = C3971w4.f36328a.a();
                } else {
                    qVarA = qVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1607092572, i13, -1, "com.fourthline.orca.core.internal.composable.OrcaScaffold (OrcaScaffold.kt:31)");
                }
                C3825sp c3825sp7 = C3825sp.f35377a;
                float f17 = c3825sp7.c(lVarV, 6).f();
                androidx.compose.ui.d dVarA7 = AbstractC3307gk.a(dVar3);
                lVarV.o(1241804727);
                objI = lVarV.I();
                if (objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.cv0
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return Wo.a((g4.y) obj);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                androidx.compose.ui.d dVarD7 = g4.o.d(dVarA7, false, (wn0.l) objI, 1, null);
                z2.a aVarE13 = z2.c.e(26536350, true, new a(j0Var3), lVarV, 54);
                long jA7 = c3825sp7.b(lVarV, 6).getScreen().getBackground().a(lVarV, 0);
                z2.a aVarE14 = z2.c.e(200925301, true, new b(z13, f17, qVarA, content), lVarV, 54);
                p016o2.j0 j0Var11 = j0Var3;
                wn0.q qVar10 = qVarA;
                boolean z111 = z13;
                lVar2 = lVarV;
                p016o2.b0.a(dVarD7, null, null, aVarE13, null, 0, jA7, 0L, null, aVarE14, lVar2, 805309440, 438);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar3;
                z14 = z111;
                j0Var4 = j0Var11;
                qVar3 = qVar10;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.dv0
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return Wo.a(dVar4, z14, j0Var4, qVar3, content, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        z12 = z11;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                j0Var2 = j0Var;
                if (lVarV.n(j0Var2)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    qVar2 = qVar;
                    if (lVarV.K(qVar2)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                if ((i12 & 16) != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    if (lVarV.K(content)) {
                        i18 = 16384;
                    } else {
                        i18 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i18;
                }
                if ((i13 & 9363) == 9362) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i21 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i14 != 0) {
                        lVarV.o(1241795260);
                        objI2 = lVarV.I();
                        if (objI2 == p020r2.l.INSTANCE.a()) {
                            objI2 = new p016o2.j0();
                            lVarV.B(objI2);
                        }
                        j0Var3 = (p016o2.j0) objI2;
                        lVarV.l();
                    } else {
                        j0Var3 = j0Var2;
                    }
                    if (i16 != 0) {
                        qVarA = C3971w4.f36328a.a();
                    } else {
                        qVarA = qVar2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1607092572, i13, -1, "com.fourthline.orca.core.internal.composable.OrcaScaffold (OrcaScaffold.kt:31)");
                    }
                    C3825sp c3825sp8 = C3825sp.f35377a;
                    float f18 = c3825sp8.c(lVarV, 6).f();
                    androidx.compose.ui.d dVarA8 = AbstractC3307gk.a(dVar3);
                    lVarV.o(1241804727);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = new wn0.l() { // from class: com.fourthline.orca.internal.cv0
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return Wo.a((g4.y) obj);
                            }
                        };
                        lVarV.B(objI);
                    }
                    lVarV.l();
                    androidx.compose.ui.d dVarD8 = g4.o.d(dVarA8, false, (wn0.l) objI, 1, null);
                    z2.a aVarE15 = z2.c.e(26536350, true, new a(j0Var3), lVarV, 54);
                    long jA8 = c3825sp8.b(lVarV, 6).getScreen().getBackground().a(lVarV, 0);
                    z2.a aVarE16 = z2.c.e(200925301, true, new b(z13, f18, qVarA, content), lVarV, 54);
                    p016o2.j0 j0Var12 = j0Var3;
                    wn0.q qVar11 = qVarA;
                    boolean z112 = z13;
                    lVar2 = lVarV;
                    p016o2.b0.a(dVarD8, null, null, aVarE15, null, 0, jA8, 0L, null, aVarE16, lVar2, 805309440, 438);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    dVar4 = dVar3;
                    z14 = z112;
                    j0Var4 = j0Var12;
                    qVar3 = qVar11;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i21 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i14 != 0) {
                        lVarV.o(1241795260);
                        objI2 = lVarV.I();
                        if (objI2 == p020r2.l.INSTANCE.a()) {
                            objI2 = new p016o2.j0();
                            lVarV.B(objI2);
                        }
                        j0Var3 = (p016o2.j0) objI2;
                        lVarV.l();
                    } else {
                        j0Var3 = j0Var2;
                    }
                    if (i16 != 0) {
                        qVarA = C3971w4.f36328a.a();
                    } else {
                        qVarA = qVar2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1607092572, i13, -1, "com.fourthline.orca.core.internal.composable.OrcaScaffold (OrcaScaffold.kt:31)");
                    }
                    C3825sp c3825sp9 = C3825sp.f35377a;
                    float f19 = c3825sp9.c(lVarV, 6).f();
                    androidx.compose.ui.d dVarA9 = AbstractC3307gk.a(dVar3);
                    lVarV.o(1241804727);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = new wn0.l() { // from class: com.fourthline.orca.internal.cv0
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return Wo.a((g4.y) obj);
                            }
                        };
                        lVarV.B(objI);
                    }
                    lVarV.l();
                    androidx.compose.ui.d dVarD9 = g4.o.d(dVarA9, false, (wn0.l) objI, 1, null);
                    z2.a aVarE17 = z2.c.e(26536350, true, new a(j0Var3), lVarV, 54);
                    long jA9 = c3825sp9.b(lVarV, 6).getScreen().getBackground().a(lVarV, 0);
                    z2.a aVarE18 = z2.c.e(200925301, true, new b(z13, f19, qVarA, content), lVarV, 54);
                    p016o2.j0 j0Var13 = j0Var3;
                    wn0.q qVar12 = qVarA;
                    boolean z113 = z13;
                    lVar2 = lVarV;
                    p016o2.b0.a(dVarD9, null, null, aVarE17, null, 0, jA9, 0L, null, aVarE18, lVar2, 805309440, 438);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    dVar4 = dVar3;
                    z14 = z113;
                    j0Var4 = j0Var13;
                    qVar3 = qVar12;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.dv0
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return Wo.a(dVar4, z14, j0Var4, qVar3, content, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            qVar2 = qVar;
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                if (lVarV.K(content)) {
                    i18 = 16384;
                } else {
                    i18 = PKIFailureInfo.certRevoked;
                }
                i13 |= i18;
            }
            if ((i13 & 9363) == 9362) {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i21 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i14 != 0) {
                    lVarV.o(1241795260);
                    objI2 = lVarV.I();
                    if (objI2 == p020r2.l.INSTANCE.a()) {
                        objI2 = new p016o2.j0();
                        lVarV.B(objI2);
                    }
                    j0Var3 = (p016o2.j0) objI2;
                    lVarV.l();
                } else {
                    j0Var3 = j0Var2;
                }
                if (i16 != 0) {
                    qVarA = C3971w4.f36328a.a();
                } else {
                    qVarA = qVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1607092572, i13, -1, "com.fourthline.orca.core.internal.composable.OrcaScaffold (OrcaScaffold.kt:31)");
                }
                C3825sp c3825sp10 = C3825sp.f35377a;
                float f110 = c3825sp10.c(lVarV, 6).f();
                androidx.compose.ui.d dVarA10 = AbstractC3307gk.a(dVar3);
                lVarV.o(1241804727);
                objI = lVarV.I();
                if (objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.cv0
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return Wo.a((g4.y) obj);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                androidx.compose.ui.d dVarD10 = g4.o.d(dVarA10, false, (wn0.l) objI, 1, null);
                z2.a aVarE19 = z2.c.e(26536350, true, new a(j0Var3), lVarV, 54);
                long jA10 = c3825sp10.b(lVarV, 6).getScreen().getBackground().a(lVarV, 0);
                z2.a aVarE110 = z2.c.e(200925301, true, new b(z13, f110, qVarA, content), lVarV, 54);
                p016o2.j0 j0Var14 = j0Var3;
                wn0.q qVar13 = qVarA;
                boolean z114 = z13;
                lVar2 = lVarV;
                p016o2.b0.a(dVarD10, null, null, aVarE19, null, 0, jA10, 0L, null, aVarE110, lVar2, 805309440, 438);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar3;
                z14 = z114;
                j0Var4 = j0Var14;
                qVar3 = qVar13;
            } else {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i21 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i14 != 0) {
                    lVarV.o(1241795260);
                    objI2 = lVarV.I();
                    if (objI2 == p020r2.l.INSTANCE.a()) {
                        objI2 = new p016o2.j0();
                        lVarV.B(objI2);
                    }
                    j0Var3 = (p016o2.j0) objI2;
                    lVarV.l();
                } else {
                    j0Var3 = j0Var2;
                }
                if (i16 != 0) {
                    qVarA = C3971w4.f36328a.a();
                } else {
                    qVarA = qVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1607092572, i13, -1, "com.fourthline.orca.core.internal.composable.OrcaScaffold (OrcaScaffold.kt:31)");
                }
                C3825sp c3825sp11 = C3825sp.f35377a;
                float f111 = c3825sp11.c(lVarV, 6).f();
                androidx.compose.ui.d dVarA11 = AbstractC3307gk.a(dVar3);
                lVarV.o(1241804727);
                objI = lVarV.I();
                if (objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.cv0
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return Wo.a((g4.y) obj);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                androidx.compose.ui.d dVarD11 = g4.o.d(dVarA11, false, (wn0.l) objI, 1, null);
                z2.a aVarE111 = z2.c.e(26536350, true, new a(j0Var3), lVarV, 54);
                long jA11 = c3825sp11.b(lVarV, 6).getScreen().getBackground().a(lVarV, 0);
                z2.a aVarE112 = z2.c.e(200925301, true, new b(z13, f111, qVarA, content), lVarV, 54);
                p016o2.j0 j0Var15 = j0Var3;
                wn0.q qVar14 = qVarA;
                boolean z115 = z13;
                lVar2 = lVarV;
                p016o2.b0.a(dVarD11, null, null, aVarE111, null, 0, jA11, 0L, null, aVarE112, lVar2, 805309440, 438);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar3;
                z14 = z115;
                j0Var4 = j0Var15;
                qVar3 = qVar14;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.dv0
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return Wo.a(dVar4, z14, j0Var4, qVar3, content, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        j0Var2 = j0Var;
        i16 = i12 & 8;
        if (i16 != 0) {
            if ((i11 & 3072) == 0) {
                qVar2 = qVar;
                if (lVarV.K(qVar2)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                if (lVarV.K(content)) {
                    i18 = 16384;
                } else {
                    i18 = PKIFailureInfo.certRevoked;
                }
                i13 |= i18;
            }
            if ((i13 & 9363) == 9362) {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i21 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i14 != 0) {
                    lVarV.o(1241795260);
                    objI2 = lVarV.I();
                    if (objI2 == p020r2.l.INSTANCE.a()) {
                        objI2 = new p016o2.j0();
                        lVarV.B(objI2);
                    }
                    j0Var3 = (p016o2.j0) objI2;
                    lVarV.l();
                } else {
                    j0Var3 = j0Var2;
                }
                if (i16 != 0) {
                    qVarA = C3971w4.f36328a.a();
                } else {
                    qVarA = qVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1607092572, i13, -1, "com.fourthline.orca.core.internal.composable.OrcaScaffold (OrcaScaffold.kt:31)");
                }
                C3825sp c3825sp12 = C3825sp.f35377a;
                float f112 = c3825sp12.c(lVarV, 6).f();
                androidx.compose.ui.d dVarA12 = AbstractC3307gk.a(dVar3);
                lVarV.o(1241804727);
                objI = lVarV.I();
                if (objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.cv0
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return Wo.a((g4.y) obj);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                androidx.compose.ui.d dVarD12 = g4.o.d(dVarA12, false, (wn0.l) objI, 1, null);
                z2.a aVarE113 = z2.c.e(26536350, true, new a(j0Var3), lVarV, 54);
                long jA12 = c3825sp12.b(lVarV, 6).getScreen().getBackground().a(lVarV, 0);
                z2.a aVarE114 = z2.c.e(200925301, true, new b(z13, f112, qVarA, content), lVarV, 54);
                p016o2.j0 j0Var16 = j0Var3;
                wn0.q qVar15 = qVarA;
                boolean z116 = z13;
                lVar2 = lVarV;
                p016o2.b0.a(dVarD12, null, null, aVarE113, null, 0, jA12, 0L, null, aVarE114, lVar2, 805309440, 438);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar3;
                z14 = z116;
                j0Var4 = j0Var16;
                qVar3 = qVar15;
            } else {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i21 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i14 != 0) {
                    lVarV.o(1241795260);
                    objI2 = lVarV.I();
                    if (objI2 == p020r2.l.INSTANCE.a()) {
                        objI2 = new p016o2.j0();
                        lVarV.B(objI2);
                    }
                    j0Var3 = (p016o2.j0) objI2;
                    lVarV.l();
                } else {
                    j0Var3 = j0Var2;
                }
                if (i16 != 0) {
                    qVarA = C3971w4.f36328a.a();
                } else {
                    qVarA = qVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1607092572, i13, -1, "com.fourthline.orca.core.internal.composable.OrcaScaffold (OrcaScaffold.kt:31)");
                }
                C3825sp c3825sp13 = C3825sp.f35377a;
                float f113 = c3825sp13.c(lVarV, 6).f();
                androidx.compose.ui.d dVarA13 = AbstractC3307gk.a(dVar3);
                lVarV.o(1241804727);
                objI = lVarV.I();
                if (objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.cv0
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return Wo.a((g4.y) obj);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                androidx.compose.ui.d dVarD13 = g4.o.d(dVarA13, false, (wn0.l) objI, 1, null);
                z2.a aVarE115 = z2.c.e(26536350, true, new a(j0Var3), lVarV, 54);
                long jA13 = c3825sp13.b(lVarV, 6).getScreen().getBackground().a(lVarV, 0);
                z2.a aVarE116 = z2.c.e(200925301, true, new b(z13, f113, qVarA, content), lVarV, 54);
                p016o2.j0 j0Var17 = j0Var3;
                wn0.q qVar16 = qVarA;
                boolean z117 = z13;
                lVar2 = lVarV;
                p016o2.b0.a(dVarD13, null, null, aVarE115, null, 0, jA13, 0L, null, aVarE116, lVar2, 805309440, 438);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar3;
                z14 = z117;
                j0Var4 = j0Var17;
                qVar3 = qVar16;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.dv0
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return Wo.a(dVar4, z14, j0Var4, qVar3, content, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        qVar2 = qVar;
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            if (lVarV.K(content)) {
                i18 = 16384;
            } else {
                i18 = PKIFailureInfo.certRevoked;
            }
            i13 |= i18;
        }
        if ((i13 & 9363) == 9362) {
            if (i19 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i21 != 0) {
                z13 = true;
            } else {
                z13 = z12;
            }
            if (i14 != 0) {
                lVarV.o(1241795260);
                objI2 = lVarV.I();
                if (objI2 == p020r2.l.INSTANCE.a()) {
                    objI2 = new p016o2.j0();
                    lVarV.B(objI2);
                }
                j0Var3 = (p016o2.j0) objI2;
                lVarV.l();
            } else {
                j0Var3 = j0Var2;
            }
            if (i16 != 0) {
                qVarA = C3971w4.f36328a.a();
            } else {
                qVarA = qVar2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1607092572, i13, -1, "com.fourthline.orca.core.internal.composable.OrcaScaffold (OrcaScaffold.kt:31)");
            }
            C3825sp c3825sp14 = C3825sp.f35377a;
            float f114 = c3825sp14.c(lVarV, 6).f();
            androidx.compose.ui.d dVarA14 = AbstractC3307gk.a(dVar3);
            lVarV.o(1241804727);
            objI = lVarV.I();
            if (objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.cv0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return Wo.a((g4.y) obj);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            androidx.compose.ui.d dVarD14 = g4.o.d(dVarA14, false, (wn0.l) objI, 1, null);
            z2.a aVarE117 = z2.c.e(26536350, true, new a(j0Var3), lVarV, 54);
            long jA14 = c3825sp14.b(lVarV, 6).getScreen().getBackground().a(lVarV, 0);
            z2.a aVarE118 = z2.c.e(200925301, true, new b(z13, f114, qVarA, content), lVarV, 54);
            p016o2.j0 j0Var18 = j0Var3;
            wn0.q qVar17 = qVarA;
            boolean z118 = z13;
            lVar2 = lVarV;
            p016o2.b0.a(dVarD14, null, null, aVarE117, null, 0, jA14, 0L, null, aVarE118, lVar2, 805309440, 438);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar4 = dVar3;
            z14 = z118;
            j0Var4 = j0Var18;
            qVar3 = qVar17;
        } else {
            if (i19 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i21 != 0) {
                z13 = true;
            } else {
                z13 = z12;
            }
            if (i14 != 0) {
                lVarV.o(1241795260);
                objI2 = lVarV.I();
                if (objI2 == p020r2.l.INSTANCE.a()) {
                    objI2 = new p016o2.j0();
                    lVarV.B(objI2);
                }
                j0Var3 = (p016o2.j0) objI2;
                lVarV.l();
            } else {
                j0Var3 = j0Var2;
            }
            if (i16 != 0) {
                qVarA = C3971w4.f36328a.a();
            } else {
                qVarA = qVar2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1607092572, i13, -1, "com.fourthline.orca.core.internal.composable.OrcaScaffold (OrcaScaffold.kt:31)");
            }
            C3825sp c3825sp15 = C3825sp.f35377a;
            float f115 = c3825sp15.c(lVarV, 6).f();
            androidx.compose.ui.d dVarA15 = AbstractC3307gk.a(dVar3);
            lVarV.o(1241804727);
            objI = lVarV.I();
            if (objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.cv0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return Wo.a((g4.y) obj);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            androidx.compose.ui.d dVarD15 = g4.o.d(dVarA15, false, (wn0.l) objI, 1, null);
            z2.a aVarE119 = z2.c.e(26536350, true, new a(j0Var3), lVarV, 54);
            long jA15 = c3825sp15.b(lVarV, 6).getScreen().getBackground().a(lVarV, 0);
            z2.a aVarE1110 = z2.c.e(200925301, true, new b(z13, f115, qVarA, content), lVarV, 54);
            p016o2.j0 j0Var19 = j0Var3;
            wn0.q qVar18 = qVarA;
            boolean z119 = z13;
            lVar2 = lVarV;
            p016o2.b0.a(dVarD15, null, null, aVarE119, null, 0, jA15, 0L, null, aVarE1110, lVar2, 805309440, 438);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar4 = dVar3;
            z14 = z119;
            j0Var4 = j0Var19;
            qVar3 = qVar18;
        }
        w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.dv0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Wo.a(dVar4, z14, j0Var4, qVar3, content, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(g4.y semantics) {
        p013kotlin.jvm.internal.s.k(semantics, "$this$semantics");
        g4.w.a(semantics, true);
        return jn0.h0.f84049a;
    }
}
