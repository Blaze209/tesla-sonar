package com.fourthline.orca.internal;

import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* JADX INFO: loaded from: classes4.dex */
public abstract class U7 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(L0 l11, Flow flow, wn0.l lVar, int i11, p020r2.l lVar2, int i12) {
        a(l11, flow, lVar, lVar2, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    public static final void a(final L0 state, final Flow flow, final wn0.l onEventSent, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(onEventSent, "onEventSent");
        p020r2.l lVarV = lVar.v(1649251909);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(flow) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= lVarV.K(onEventSent) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(1649251909, i12, -1, "com.fourthline.orca.kyc.internal.flow.document_selection.screens.country.DocumentCountryScreen (DocumentCountryScreen.kt:23)");
            }
            H0.a(state, flow, onEventSent, lVarV, i12 & 1022);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.kq0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return U7.a(state, flow, onEventSent, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
