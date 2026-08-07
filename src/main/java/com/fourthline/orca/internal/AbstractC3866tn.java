package com.fourthline.orca.internal;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: renamed from: com.fourthline.orca.internal.tn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3866tn {
    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(v1.i iVar, C3135cj c3135cj, int i11, p020r2.l lVar, int i12) {
        a(iVar, c3135cj, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final v1.i iVar, final C3135cj c3135cj, p020r2.l lVar, final int i11) {
        int i12;
        p020r2.l lVarV = lVar.v(2009442652);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.n(iVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? lVarV.n(c3135cj) : lVarV.K(c3135cj) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(2009442652, i12, -1, "com.fourthline.orca.kyc.internal.flow.nfc.screens.nfc_intro.LearnHowToScanPopup (NfcIntroLearnHowToScanPopupProvider.kt:113)");
            }
            int i13 = ((Context) lVarV.U(AndroidCompositionLocals_androidKt.g())).getResources().getConfiguration().screenLayout & 15;
            float fG = w4.h.g(118);
            float f11 = 16;
            float fG2 = w4.h.g(f11);
            float fG3 = w4.h.g(f11);
            if (i13 != 3) {
                fG = w4.h.g(70);
                float f12 = 8;
                fG2 = w4.h.g(f12);
                fG3 = w4.h.g(f12);
            }
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            q1.b0.a(AbstractC3946vh.a(c3135cj.b(), lVarV, 0), null, v1.i.b(iVar, androidx.compose.foundation.layout.x.h(companion, BitmapDescriptorFactory.HUE_RED, 1, null), 1.0f, false, 2, null), null, z3.k.INSTANCE.f(), BitmapDescriptorFactory.HUE_RED, null, lVarV, 24624, 104);
            float f13 = 20;
            androidx.compose.ui.d dVarK = androidx.compose.foundation.layout.t.k(androidx.compose.foundation.layout.x.b(androidx.compose.foundation.layout.x.h(AbstractC3307gk.a(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(46), 1, null), w4.h.g(f13), BitmapDescriptorFactory.HUE_RED, 2, null);
            String strC = RA.c(c3135cj.c(), lVarV, 0);
            t4.j.Companion companion2 = t4.j.INSTANCE;
            int iA = companion2.a();
            C3825sp c3825sp = C3825sp.f35377a;
            p016o2.r0.a(strC, dVarK, 0L, 0L, null, null, null, 0L, null, t4.j.h(iA), 0L, 0, false, 0, 0, null, c3825sp.b(lVarV, 6).getDialog().getDefault().getTitle().a(null, lVarV, 0, 1), lVarV, 0, 0, 65020);
            v1.i0.a(androidx.compose.foundation.layout.x.i(companion, fG2), lVarV, 0);
            p016o2.r0.a(RA.c(c3135cj.a(), lVarV, 0), androidx.compose.foundation.layout.t.k(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.x.b(AbstractC3307gk.a(companion, 2.0f), BitmapDescriptorFactory.HUE_RED, fG, 1, null), BitmapDescriptorFactory.HUE_RED, 1, null), w4.h.g(f13), BitmapDescriptorFactory.HUE_RED, 2, null), 0L, 0L, null, null, null, 0L, null, t4.j.h(companion2.a()), 0L, 0, false, 0, 0, null, c3825sp.b(lVarV, 6).getDialog().getDefault().getMessage().a(null, lVarV, 0, 1), lVarV, 0, 0, 65020);
            lVarV = lVarV;
            v1.i0.a(androidx.compose.foundation.layout.x.i(companion, fG3), lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.rd1
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3866tn.a(iVar, c3135cj, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
