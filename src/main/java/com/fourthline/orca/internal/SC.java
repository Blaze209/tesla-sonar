package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SC {
    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(IC ic2, wn0.l lVar, int i11, p020r2.l lVar2, int i12) {
        a(ic2, lVar, lVar2, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(wn0.l lVar) {
        lVar.invoke(GC.c.f25929a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c(wn0.l lVar) {
        lVar.invoke(GC.a.f25927a);
        return jn0.h0.f84049a;
    }

    public static final void a(final IC state, final wn0.l onEventSent, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(onEventSent, "onEventSent");
        p020r2.l lVarV = lVar.v(1081510759);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? lVarV.n(state) : lVarV.K(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(onEventSent) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(1081510759, i12, -1, "com.fourthline.orca.core.internal.capabilities.upload.screens.upload.UploadDataScreen (UploadDataScreen.kt:15)");
            }
            QA qaA = state.a();
            QA qaB = state.b();
            QA qaP = state.p();
            Yj yjQ = state.q();
            int iR = state.r();
            boolean zS = state.s();
            lVarV.o(-2131154417);
            int i13 = i12 & 112;
            boolean z11 = i13 == 32;
            Object objI = lVarV.I();
            if (z11 || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.ho0
                    @Override // wn0.a
                    public final Object invoke() {
                        return SC.a(onEventSent);
                    }
                };
                lVarV.B(objI);
            }
            wn0.a aVar = (wn0.a) objI;
            lVarV.l();
            lVarV.o(-2131152041);
            boolean z12 = i13 == 32;
            Object objI2 = lVarV.I();
            if (z12 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new wn0.a() { // from class: com.fourthline.orca.internal.io0
                    @Override // wn0.a
                    public final Object invoke() {
                        return SC.b(onEventSent);
                    }
                };
                lVarV.B(objI2);
            }
            wn0.a aVar2 = (wn0.a) objI2;
            lVarV.l();
            lVarV.o(-2131149551);
            boolean z13 = i13 == 32;
            Object objI3 = lVarV.I();
            if (z13 || objI3 == p020r2.l.INSTANCE.a()) {
                objI3 = new wn0.a() { // from class: com.fourthline.orca.internal.jo0
                    @Override // wn0.a
                    public final Object invoke() {
                        return SC.c(onEventSent);
                    }
                };
                lVarV.B(objI3);
            }
            lVarV.l();
            Ws.a("upload", qaA, iR, zS, qaB, qaP, yjQ, aVar, aVar2, (wn0.a) objI3, lVarV, 6, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.ko0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return SC.a(state, onEventSent, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar) {
        lVar.invoke(GC.b.f25928a);
        return jn0.h0.f84049a;
    }
}
