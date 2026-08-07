package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Vs {
    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(Yj yj2, int i11, p020r2.l lVar, int i12) {
        a(yj2, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    public static final void a(final Yj lottieSource, p020r2.l lVar, final int i11) {
        int i12;
        p020r2.l lVar2;
        p013kotlin.jvm.internal.s.k(lottieSource, "lottieSource");
        p020r2.l lVarV = lVar.v(210826447);
        if ((i11 & 6) == 0) {
            i12 = i11 | ((i11 & 8) == 0 ? lVarV.n(lottieSource) : lVarV.K(lottieSource) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && lVarV.b()) {
            lVarV.j();
            lVar2 = lVarV;
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(210826447, i12, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.ProgressIndicator (ProgressIndicator.kt:21)");
            }
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            Ko ko2 = Ko.f26627a;
            lVar2 = lVarV;
            TA.a(androidx.compose.foundation.layout.x.v(androidx.compose.foundation.layout.x.i(companion, ko2.a()), ko2.a()), false, false, C3825sp.f35377a.b(lVarV, 6).getSpinner().getHighlight().a(lVarV, 0), 0L, 0L, 0L, Integer.MAX_VALUE, BitmapDescriptorFactory.HUE_RED, null, lottieSource, null, null, null, lVar2, 12582918, i12 & 14, 15222);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.ot0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Vs.a(lottieSource, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
