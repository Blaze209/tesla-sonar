package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p014n4.FontWeight;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ax, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3064ax {
    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(androidx.compose.ui.d dVar, String str, String str2, int i11, int i12, p020r2.l lVar, int i13) {
        a(dVar, str, str2, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    public static final void a(androidx.compose.ui.d dVar, final String title, final String accessibilityDescription, p020r2.l lVar, final int i11, final int i12) {
        androidx.compose.ui.d dVar2;
        int i13;
        p020r2.l lVar2;
        final androidx.compose.ui.d dVar3;
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(accessibilityDescription, "accessibilityDescription");
        p020r2.l lVarV = lVar.v(295340538);
        int i14 = i12 & 1;
        if (i14 != 0) {
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
            i13 |= lVarV.n(title) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= lVarV.n(accessibilityDescription) ? 256 : 128;
        }
        if ((i13 & 147) == 146 && lVarV.b()) {
            lVarV.j();
            lVar2 = lVarV;
            dVar3 = dVar2;
        } else {
            androidx.compose.ui.d dVar4 = i14 != 0 ? androidx.compose.ui.d.INSTANCE : dVar2;
            if (p020r2.o.J()) {
                p020r2.o.S(295340538, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.ScannerTitle (ScannerTitle.kt:19)");
            }
            lVar2 = lVarV;
            androidx.compose.ui.d dVar5 = dVar4;
            E0.a(title, androidx.compose.foundation.layout.x.h(AbstractC3307gk.a(AbstractC3307gk.a(dVar4, "headerView", (String) null, 2, (Object) null), accessibilityDescription, false, 2, (Object) null), BitmapDescriptorFactory.HUE_RED, 1, null), 0L, (p014n4.b0) null, (FontWeight) null, (p014n4.q) null, 0L, (t4.k) null, t4.j.h(t4.j.INSTANCE.a()), 0L, 0, false, 0, 2, (wn0.l) null, C3825sp.f35377a.b(lVarV, 6).getScanner().getHeader().a(null, lVarV, 0, 1), lVar2, (i13 >> 3) & 14, 3072, 24316);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar3 = dVar5;
        }
        p020r2.w2 w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.ly0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3064ax.a(dVar3, title, accessibilityDescription, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
