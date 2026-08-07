package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class D2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(A2 a11, wn0.l lVar, int i11, p020r2.l lVar2, int i12) {
        a(a11, lVar, lVar2, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(wn0.l lVar) {
        lVar.invoke(InterfaceC4055y2.b.f36883a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c(wn0.l lVar) {
        lVar.invoke(InterfaceC4055y2.c.f36884a);
        return jn0.h0.f84049a;
    }

    public static final void a(final A2 state, final wn0.l onEventSent, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(onEventSent, "onEventSent");
        p020r2.l lVarV = lVar.v(1516293885);
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
                p020r2.o.S(1516293885, i12, -1, "com.fourthline.orca.bav.internal.screens.status.BavStatusScreen (BavStatusScreen.kt:21)");
            }
            QA qaA = state.a();
            E3 e3P = state.p();
            Yj yjQ = state.q();
            lVarV.o(1255353955);
            int i13 = i12 & 112;
            boolean z11 = i13 == 32;
            Object objI = lVarV.I();
            if (z11 || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.p10
                    @Override // wn0.a
                    public final Object invoke() {
                        return D2.a(onEventSent);
                    }
                };
                lVarV.B(objI);
            }
            wn0.a aVar = (wn0.a) objI;
            lVarV.l();
            lVarV.o(1255358702);
            boolean z12 = i13 == 32;
            Object objI2 = lVarV.I();
            if (z12 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new wn0.a() { // from class: com.fourthline.orca.internal.q10
                    @Override // wn0.a
                    public final Object invoke() {
                        return D2.b(onEventSent);
                    }
                };
                lVarV.B(objI2);
            }
            wn0.a aVar2 = (wn0.a) objI2;
            lVarV.l();
            lVarV.o(1255356267);
            boolean z13 = i13 == 32;
            Object objI3 = lVarV.I();
            if (z13 || objI3 == p020r2.l.INSTANCE.a()) {
                objI3 = new wn0.a() { // from class: com.fourthline.orca.internal.r10
                    @Override // wn0.a
                    public final Object invoke() {
                        return D2.c(onEventSent);
                    }
                };
                lVarV.B(objI3);
            }
            lVarV.l();
            Ly.a(qaA, yjQ, e3P, aVar, aVar2, (wn0.a) objI3, lVarV, 0, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.s10
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return D2.a(state, onEventSent, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar) {
        lVar.invoke(InterfaceC4055y2.a.f36882a);
        return jn0.h0.f84049a;
    }
}
