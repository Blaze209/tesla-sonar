package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ME {
    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar, int i11, p020r2.l lVar2, int i12) {
        a(lVar, lVar2, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(wn0.l lVar) {
        lVar.invoke(HE.b.f26100a);
        return jn0.h0.f84049a;
    }

    public static final void a(final wn0.l onEventSent, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(onEventSent, "onEventSent");
        p020r2.l lVarV = lVar.v(1508328442);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(onEventSent) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(1508328442, i12, -1, "com.fourthline.orca.workflow.internal.screens.loading.WorkflowLoadingScreen (WorkflowLoadingScreen.kt:14)");
            }
            lVarV.o(890040824);
            int i13 = i12 & 14;
            boolean z11 = i13 == 4;
            Object objI = lVarV.I();
            if (z11 || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.si0
                    @Override // wn0.a
                    public final Object invoke() {
                        return ME.a(onEventSent);
                    }
                };
                lVarV.B(objI);
            }
            wn0.a aVar = (wn0.a) objI;
            lVarV.l();
            lVarV.o(890043008);
            boolean z12 = i13 == 4;
            Object objI2 = lVarV.I();
            if (z12 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new wn0.a() { // from class: com.fourthline.orca.internal.ti0
                    @Override // wn0.a
                    public final Object invoke() {
                        return ME.b(onEventSent);
                    }
                };
                lVarV.B(objI2);
            }
            lVarV.l();
            AbstractC3904ui.a(null, aVar, (wn0.a) objI2, lVarV, 0, 1);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.ui0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return ME.a(onEventSent, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar) {
        lVar.invoke(HE.a.f26099a);
        return jn0.h0.f84049a;
    }
}
