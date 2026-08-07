package com.fourthline.orca.internal;

import com.fourthline.orca.core.flavor.OrcaLayouts;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Mo {
    public static final Lo a(OrcaLayouts orcaLayouts, p020r2.l lVar, int i11) {
        p013kotlin.jvm.internal.s.k(orcaLayouts, "<this>");
        lVar.o(993131494);
        if (p020r2.o.J()) {
            p020r2.o.S(993131494, i11, -1, "com.fourthline.orca.core.internal.styling.layout.toComposeLayouts (OrcaLayouts.kt:22)");
        }
        Lo lo2 = new Lo(w4.h.g(32), w4.h.g(4), w4.h.g(20), w4.h.g(orcaLayouts.getPrimaryButtonCornerRadius()), w4.h.g(2), null);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return lo2;
    }
}
