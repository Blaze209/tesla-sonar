package com.fourthline.orca.internal;

import androidx.p003lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Mg {

    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.l {
        a(Object obj) {
            super(1, obj, C3459k8.class, "handleEvents", "handleEvents(Lcom/fourthline/orca/kyc/internal/flow/document/screens/details/DocumentDetailsContract$Event;)V", 0);
        }

        public final void a(InterfaceC3118c8 p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((C3459k8) this.receiver).a(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC3118c8) obj);
            return jn0.h0.f84049a;
        }
    }

    /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.l {
        b(Object obj) {
            super(1, obj, C3896ua.class, "handleEvents", "handleEvents(Lcom/fourthline/orca/kyc/internal/flow/document/screens/document_ready/DocumentReadyContract$Event;)V", 0);
        }

        public final void a(InterfaceC3639oa p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((C3896ua) this.receiver).a(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC3639oa) obj);
            return jn0.h0.f84049a;
        }
    }

    /* synthetic */ class c extends p013kotlin.jvm.internal.p implements wn0.l {
        c(Object obj) {
            super(1, obj, UC.class, "handleEvents", "handleEvents(Lcom/fourthline/orca/core/internal/capabilities/upload/screens/upload/UploadDataContract$Event;)V", 0);
        }

        public final void a(GC p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((UC) this.receiver).a(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GC) obj);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(InterfaceC3675p9 interfaceC3675p9, p011ja.k kVar, int i11, p020r2.l lVar, int i12) {
        a(interfaceC3675p9, kVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c(InterfaceC3675p9 interfaceC3675p9, p011ja.k kVar, int i11, p020r2.l lVar, int i12) {
        c(interfaceC3675p9, kVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    public static final void a(final InterfaceC3675p9 subcomponent, final p011ja.k backStackEntry, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(-296881524);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? lVarV.n(subcomponent) : lVarV.K(subcomponent) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(backStackEntry) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-296881524, i12, -1, "com.fourthline.orca.kyc.internal.flow.document.navigation.DocumentDetailsDestination (graph.kt:23)");
            }
            lVarV.o(661922153);
            lVarV.o(-1610153616);
            boolean zK = lVarV.K(subcomponent);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.zi0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Mg.a(subcomponent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            C3459k8 c3459k8 = (C3459k8) ((Ip) new ViewModelProvider(backStackEntry).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("" + C3459k8.class.getName(), (wn0.a) objI);
            lVarV.l();
            C3246f8 c3246f8 = (C3246f8) Js.a(c3459k8.d(), lVarV, 0);
            lVarV.o(661928295);
            boolean zK2 = lVarV.K(c3459k8);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new a(c3459k8);
                lVarV.B(objI2);
            }
            lVarV.l();
            AbstractC3332h8.a(c3246f8, (wn0.l) ((co0.h) objI2), lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.aj0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Mg.a(subcomponent, backStackEntry, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(InterfaceC3675p9 interfaceC3675p9, p011ja.k kVar, int i11, p020r2.l lVar, int i12) {
        b(interfaceC3675p9, kVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    public static final void c(final InterfaceC3675p9 subcomponent, final p011ja.k backStackEntry, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(-1755482036);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? lVarV.n(subcomponent) : lVarV.K(subcomponent) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(backStackEntry) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-1755482036, i12, -1, "com.fourthline.orca.kyc.internal.flow.document.navigation.UploadDataDestination (graph.kt:52)");
            }
            final QC qcBuild = subcomponent.b().build();
            lVarV.o(-1021992924);
            lVarV.o(1399574827);
            boolean zK = lVarV.K(qcBuild);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.xi0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Mg.a(qcBuild);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            UC uc2 = (UC) ((Ip) new ViewModelProvider(backStackEntry).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("" + UC.class.getName(), (wn0.a) objI);
            lVarV.l();
            IC ic2 = (IC) Js.a(uc2.b(), lVarV, 0);
            lVarV.o(-1021987407);
            boolean zK2 = lVarV.K(uc2);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new c(uc2);
                lVarV.B(objI2);
            }
            lVarV.l();
            SC.a(ic2, (wn0.l) ((co0.h) objI2), lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.yi0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Mg.c(subcomponent, backStackEntry, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void b(final InterfaceC3675p9 subcomponent, final p011ja.k backStackEntry, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(1935323723);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? lVarV.n(subcomponent) : lVarV.K(subcomponent) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(backStackEntry) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(1935323723, i12, -1, "com.fourthline.orca.kyc.internal.flow.document.navigation.DocumentReadyDestination (graph.kt:38)");
            }
            lVarV.o(1050346886);
            lVarV.o(1910374157);
            boolean zK = lVarV.K(subcomponent);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.vi0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Mg.b(subcomponent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            C3896ua c3896ua = (C3896ua) ((Ip) new ViewModelProvider(backStackEntry).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("" + C3896ua.class.getName(), (wn0.a) objI);
            lVarV.l();
            C3682pa c3682pa = (C3682pa) Js.a(c3896ua.a(), lVarV, 0);
            lVarV.o(1050352870);
            boolean zK2 = lVarV.K(c3896ua);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new b(c3896ua);
                lVarV.B(objI2);
            }
            lVarV.l();
            AbstractC3810sa.a(c3682pa, (wn0.l) ((co0.h) objI2), lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.wi0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Mg.b(subcomponent, backStackEntry, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3459k8 a(InterfaceC3675p9 interfaceC3675p9) {
        return interfaceC3675p9.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UC a(QC qc2) {
        return qc2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3896ua b(InterfaceC3675p9 interfaceC3675p9) {
        return interfaceC3675p9.d();
    }
}
