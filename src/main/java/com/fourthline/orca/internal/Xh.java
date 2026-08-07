package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Xh {
    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(androidx.compose.ui.d dVar, String str, InterfaceC3903uh interfaceC3903uh, wn0.a aVar, int i11, int i12, p020r2.l lVar, int i13) {
        a(dVar, str, interfaceC3903uh, aVar, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    public static final void a(androidx.compose.ui.d dVar, final String text, InterfaceC3903uh interfaceC3903uh, final wn0.a onClick, p020r2.l lVar, final int i11, final int i12) {
        androidx.compose.ui.d dVar2;
        int i13;
        int i14;
        w4.v vVar;
        int i15;
        final androidx.compose.ui.d dVar3;
        final InterfaceC3903uh interfaceC3903uh2;
        InterfaceC3903uh interfaceC3903uh3 = interfaceC3903uh;
        p013kotlin.jvm.internal.s.k(text, "text");
        p013kotlin.jvm.internal.s.k(onClick, "onClick");
        p020r2.l lVarV = lVar.v(1728544529);
        int i16 = i12 & 1;
        if (i16 != 0) {
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
            i13 |= lVarV.n(text) ? 32 : 16;
        }
        int i17 = i12 & 4;
        if (i17 != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= (i11 & 512) == 0 ? lVarV.n(interfaceC3903uh3) : lVarV.K(interfaceC3903uh3) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= lVarV.K(onClick) ? 2048 : 1024;
        }
        int i18 = i13;
        if ((i18 & 1171) == 1170 && lVarV.b()) {
            lVarV.j();
            interfaceC3903uh2 = interfaceC3903uh3;
            dVar3 = dVar2;
        } else {
            androidx.compose.ui.d dVar4 = i16 != 0 ? androidx.compose.ui.d.INSTANCE : dVar2;
            if (i17 != 0) {
                interfaceC3903uh3 = null;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1728544529, i18, -1, "com.fourthline.orca.kyc.internal.flow.nfc.screens.nfc_intro.composable.InstructionalLink (InstructionalLink.kt:38)");
            }
            C3825sp c3825sp = C3825sp.f35377a;
            float fG = w4.h.g(c3825sp.b(lVarV, 6).getHint().getDefault().getRadius());
            androidx.compose.ui.d dVarC = androidx.compose.foundation.b.c(h3.e.a(androidx.compose.foundation.layout.x.b(androidx.compose.foundation.layout.x.z(AbstractC3307gk.a(AbstractC3307gk.a(dVar4, "instructionView", (String) null, 2, (Object) null)), null, false, 3, null), BitmapDescriptorFactory.HUE_RED, Ko.f26627a.a(), 1, null), a2.g.c(fG)), c3825sp.b(lVarV, 6).getHint().getDefault().getBackground().a(lVarV, 0), a2.g.c(fG));
            lVarV.o(-412030399);
            boolean z11 = (i18 & 7168) == 2048;
            Object objI = lVarV.I();
            if (z11 || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.xv0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Xh.a(onClick);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            androidx.compose.ui.d dVarD = androidx.compose.foundation.d.d(dVarC, false, null, null, VA.a(0L, (wn0.a) objI, lVarV, 0, 1), 7, null);
            z3.i0 i0VarB = v1.e0.b(v1.b.f117444a.f(), d3.c.INSTANCE.i(), lVarV, 48);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVarD);
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA, i0VarB, companion.c());
            p020r2.d4.b(lVarA, xVarC, companion.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB = companion.b();
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE, companion.d());
            v1.h0 h0Var = v1.h0.f117504a;
            androidx.compose.ui.d.Companion companion2 = androidx.compose.ui.d.INSTANCE;
            v1.i0.a(androidx.compose.foundation.layout.x.v(companion2, w4.h.g(20)), lVarV, 6);
            lVarV.o(857035932);
            if (interfaceC3903uh3 == null) {
                i15 = 6;
                i14 = 0;
                vVar = null;
            } else {
                i14 = 0;
                vVar = null;
                p009i2.e1.a(AbstractC3946vh.a(interfaceC3903uh3, lVarV, 0), null, androidx.compose.foundation.layout.x.q(companion2, w4.h.g(16)), AbstractC3611np.b(c3825sp.a(lVarV, 6)).a(lVarV, 0), lVarV, 432, 0);
                i15 = 6;
                v1.i0.a(androidx.compose.foundation.layout.x.v(companion2, w4.h.g(8)), lVarV, 6);
            }
            lVarV.l();
            androidx.compose.ui.d dVar5 = dVar4;
            InterfaceC3903uh interfaceC3903uh4 = interfaceC3903uh3;
            p009i2.v2.b(text, null, 0L, 0L, null, null, null, 0L, null, t4.j.h(t4.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, c3825sp.b(lVarV, i15).getLinkButton().getDefault().getLink().a(vVar, lVarV, i14, 1), lVarV, (i18 >> 3) & 14, 0, 65022);
            lVarV = lVarV;
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar3 = dVar5;
            interfaceC3903uh2 = interfaceC3903uh4;
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.yv0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Xh.a(dVar3, text, interfaceC3903uh2, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.a aVar) {
        aVar.invoke();
        return jn0.h0.f84049a;
    }
}
