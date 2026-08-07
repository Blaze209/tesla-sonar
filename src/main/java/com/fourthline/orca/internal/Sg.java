package com.fourthline.orca.internal;

import androidx.p003lifecycle.ViewModelProvider;
import com.fourthline.vision.document.DocumentScannerConfig;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Sg {

    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.l {
        a(Object obj) {
            super(1, obj, Gr.class, "handleEvents", "handleEvents(Lcom/fourthline/orca/kyc/internal/flow/poa/confirmation/PoaConfirmationContract$Event;)V", 0);
        }

        public final void a(InterfaceC4129zr p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((Gr) this.receiver).a(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC4129zr) obj);
            return jn0.h0.f84049a;
        }
    }

    /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.l {
        b(Object obj) {
            super(1, obj, C3640ob.class, "handleEvents", "handleEvents(Lcom/fourthline/orca/core/internal/capabilities/documentrecognition/screens/scanner/DocumentScannerContract$Event;)V", 0);
        }

        public final void a(InterfaceC2968Ua p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((C3640ob) this.receiver).a(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC2968Ua) obj);
            return jn0.h0.f84049a;
        }
    }

    /* synthetic */ class c extends p013kotlin.jvm.internal.p implements wn0.l {
        c(Object obj) {
            super(1, obj, C3229es.class, "handleEvents", "handleEvents(Lcom/fourthline/orca/kyc/internal/flow/poa/documenttype/PoADocumentTypeContract$Event;)V", 0);
        }

        public final void a(Qq p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((C3229es) this.receiver).a(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Qq) obj);
            return jn0.h0.f84049a;
        }
    }

    /* synthetic */ class d extends p013kotlin.jvm.internal.p implements wn0.l {
        d(Object obj) {
            super(1, obj, C3991wi.class, "handleEvents", "handleEvents(Lcom/fourthline/orca/core/internal/intro/IntroContract$Event;)V", 0);
        }

        public final void a(InterfaceC3432ji p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((C3991wi) this.receiver).a(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC3432ji) obj);
            return jn0.h0.f84049a;
        }
    }

    /* synthetic */ class e extends p013kotlin.jvm.internal.p implements wn0.l {
        e(Object obj) {
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
    public static final jn0.h0 a(InterfaceC3185dr interfaceC3185dr, p011ja.k kVar, int i11, p020r2.l lVar, int i12) {
        a(interfaceC3185dr, kVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(InterfaceC3185dr interfaceC3185dr, p011ja.k kVar, int i11, p020r2.l lVar, int i12) {
        b(interfaceC3185dr, kVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c(InterfaceC3185dr interfaceC3185dr, p011ja.k kVar, int i11, p020r2.l lVar, int i12) {
        c(interfaceC3185dr, kVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 d(InterfaceC3185dr interfaceC3185dr, p011ja.k kVar, int i11, p020r2.l lVar, int i12) {
        d(interfaceC3185dr, kVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 e(InterfaceC3185dr interfaceC3185dr, p011ja.k kVar, int i11, p020r2.l lVar, int i12) {
        e(interfaceC3185dr, kVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3640ob a(InterfaceC2917Pa interfaceC2917Pa) {
        return interfaceC2917Pa.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3229es b(InterfaceC3185dr interfaceC3185dr) {
        return interfaceC3185dr.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3991wi c(InterfaceC3185dr interfaceC3185dr) {
        return interfaceC3185dr.f();
    }

    public static final void d(final InterfaceC3185dr subcomponent, final p011ja.k backStackEntry, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(97175571);
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
                p020r2.o.S(97175571, i12, -1, "com.fourthline.orca.kyc.internal.flow.poa.navigation.PoAIntroDestination (graph.kt:28)");
            }
            lVarV.o(1769834298);
            lVarV.o(82726193);
            boolean zK = lVarV.K(subcomponent);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.so0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Sg.c(subcomponent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            C3991wi c3991wi = (C3991wi) ((Ip) new ViewModelProvider(backStackEntry).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("PoA" + C3991wi.class.getName(), (wn0.a) objI);
            lVarV.l();
            C3475ki c3475ki = (C3475ki) Js.a(c3991wi.b(), lVarV, 0);
            lVarV.o(1769840399);
            boolean zK2 = lVarV.K(c3991wi);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new d(c3991wi);
                lVarV.B(objI2);
            }
            lVarV.l();
            AbstractC3775ri.a(c3475ki, (wn0.l) ((co0.h) objI2), lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.to0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Sg.d(subcomponent, backStackEntry, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void e(final InterfaceC3185dr subcomponent, final p011ja.k backStackEntry, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(1635766098);
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
                p020r2.o.S(1635766098, i12, -1, "com.fourthline.orca.kyc.internal.flow.poa.navigation.UploadDataDestination (graph.kt:93)");
            }
            final QC qcBuild = subcomponent.b().build();
            lVarV.o(441338433);
            lVarV.o(803268552);
            boolean zK = lVarV.K(qcBuild);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.yo0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Sg.a(qcBuild);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            UC uc2 = (UC) ((Ip) new ViewModelProvider(backStackEntry).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("" + UC.class.getName(), (wn0.a) objI);
            lVarV.l();
            IC ic2 = (IC) Js.a(uc2.b(), lVarV, 0);
            lVarV.o(441343950);
            boolean zK2 = lVarV.K(uc2);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new e(uc2);
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
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.zo0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Sg.e(subcomponent, backStackEntry, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void a(final InterfaceC3185dr subcomponent, final p011ja.k backStackEntry, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(-409505598);
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
                p020r2.o.S(-409505598, i12, -1, "com.fourthline.orca.kyc.internal.flow.poa.navigation.PoAConfirmationDestination (graph.kt:78)");
            }
            lVarV.o(1466884028);
            lVarV.o(2120997699);
            boolean zK = lVarV.K(subcomponent);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.wo0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Sg.a(subcomponent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            Gr gr2 = (Gr) ((Ip) new ViewModelProvider(backStackEntry).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("" + Gr.class.getName(), (wn0.a) objI);
            lVarV.l();
            Br br2 = (Br) Js.a(gr2.b(), lVarV, 0);
            lVarV.o(1466890170);
            boolean zK2 = lVarV.K(gr2);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new a(gr2);
                lVarV.B(objI2);
            }
            lVarV.l();
            Er.a(br2, (wn0.l) ((co0.h) objI2), lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.xo0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Sg.a(subcomponent, backStackEntry, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void b(final InterfaceC3185dr subcomponent, final p011ja.k backStackEntry, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(388016252);
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
                p020r2.o.S(388016252, i12, -1, "com.fourthline.orca.kyc.internal.flow.poa.navigation.PoADocumentScannerDestination (graph.kt:59)");
            }
            lVarV.o(-200179350);
            final InterfaceC2917Pa interfaceC2917PaBuild = subcomponent.c().build();
            lVarV.o(1821815265);
            boolean zK = lVarV.K(interfaceC2917PaBuild);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.ap0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Sg.a(interfaceC2917PaBuild);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            C3640ob c3640ob = (C3640ob) ((Ip) new ViewModelProvider(backStackEntry).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("poa" + C3640ob.class.getName(), (wn0.a) objI);
            lVarV.l();
            InterfaceC3004Wa interfaceC3004Wa = (InterfaceC3004Wa) Js.a(c3640ob.i(), lVarV, 0);
            Flow flowB = c3640ob.h().b();
            DocumentScannerConfig documentScannerConfigE = c3640ob.e();
            Flow flowJ = c3640ob.j();
            wn0.l lVarL = c3640ob.l();
            lVarV.o(-200167048);
            boolean zK2 = lVarV.K(c3640ob);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new b(c3640ob);
                lVarV.B(objI2);
            }
            lVarV.l();
            AbstractC3384ib.a(interfaceC3004Wa, flowB, documentScannerConfigE, flowJ, lVarL, (wn0.l) ((co0.h) objI2), lVarV, DocumentScannerConfig.$stable << 6);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.bp0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Sg.b(subcomponent, backStackEntry, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void c(final InterfaceC3185dr subcomponent, final p011ja.k backStackEntry, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(1293297154);
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
                p020r2.o.S(1293297154, i12, -1, "com.fourthline.orca.kyc.internal.flow.poa.navigation.PoADocumentTypeDestination (graph.kt:43)");
            }
            lVarV.o(-840006020);
            lVarV.o(-167403005);
            boolean zK = lVarV.K(subcomponent);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.uo0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Sg.b(subcomponent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            C3229es c3229es = (C3229es) ((Ip) new ViewModelProvider(backStackEntry).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("" + C3229es.class.getName(), (wn0.a) objI);
            lVarV.l();
            Rq rq2 = (Rq) Js.a(c3229es.c(), lVarV, 0);
            Flow flowB = c3229es.b().b();
            lVarV.o(-839998182);
            boolean zK2 = lVarV.K(c3229es);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new c(c3229es);
                lVarV.B(objI2);
            }
            lVarV.l();
            AbstractC3144cs.a(rq2, (wn0.l) ((co0.h) objI2), flowB, lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.vo0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Sg.c(subcomponent, backStackEntry, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gr a(InterfaceC3185dr interfaceC3185dr) {
        return interfaceC3185dr.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UC a(QC qc2) {
        return qc2.a();
    }
}
