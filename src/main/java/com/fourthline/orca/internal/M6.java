package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class M6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(int i11, p020r2.l lVar, int i12) {
        a(lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    public static final void a(p020r2.l lVar, final int i11) {
        p020r2.l lVarV = lVar.v(-518519140);
        if (i11 == 0 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-518519140, i11, -1, "com.fourthline.orca.core.internal.composable.DisableSystemBack (DisabledBackButton.kt:9)");
            }
            lVarV.o(-559130021);
            Object objI = lVarV.I();
            if (objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.pi0
                    @Override // wn0.a
                    public final Object invoke() {
                        return M6.a();
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            f.d.a(false, (wn0.a) objI, lVarV, 48, 1);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.qi0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return M6.a(i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a() {
        return jn0.h0.f84049a;
    }
}
