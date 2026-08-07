package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class VA {
    public static final wn0.a a(long j11, final wn0.a onClick, p020r2.l lVar, int i11, int i12) {
        p013kotlin.jvm.internal.s.k(onClick, "onClick");
        lVar.o(269863087);
        boolean z11 = true;
        if ((i12 & 1) != 0) {
            j11 = 300;
        }
        long j12 = j11;
        if (p020r2.o.J()) {
            p020r2.o.S(269863087, i11, -1, "com.fourthline.orca.core.internal.helper.handleSingleClicks (ThrottleInteractionHandler.kt:27)");
        }
        lVar.o(2142438000);
        Object objI = lVar.I();
        p020r2.l.Companion companion = p020r2.l.INSTANCE;
        if (objI == companion.a()) {
            Object ua2 = new UA(j12, null, 2, null);
            lVar.B(ua2);
            objI = ua2;
        }
        final UA ua3 = (UA) objI;
        lVar.l();
        lVar.o(2142439981);
        boolean zK = lVar.K(ua3);
        if ((((i11 & 112) ^ 48) <= 32 || !lVar.n(onClick)) && (i11 & 48) != 32) {
            z11 = false;
        }
        boolean z12 = zK | z11;
        Object objI2 = lVar.I();
        if (z12 || objI2 == companion.a()) {
            objI2 = new wn0.a() { // from class: com.fourthline.orca.internal.sr0
                @Override // wn0.a
                public final Object invoke() {
                    return VA.a(ua3, onClick);
                }
            };
            lVar.B(objI2);
        }
        wn0.a aVar = (wn0.a) objI2;
        lVar.l();
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(UA ua2, wn0.a aVar) {
        ua2.a(aVar);
        return jn0.h0.f84049a;
    }
}
