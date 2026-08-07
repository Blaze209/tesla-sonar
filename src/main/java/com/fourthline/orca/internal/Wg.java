package com.fourthline.orca.internal;

import androidx.p003lifecycle.ViewModelProvider;
import com.fourthline.vision.document.DocumentScannerConfig;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Wg {

    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.l {
        a(Object obj) {
            super(1, obj, C3634oB.class, "handleEvents", "handleEvents(Lcom/fourthline/orca/kyc/internal/flow/tin/details/TinDetailsContract$Event;)V", 0);
        }

        public final void a(InterfaceC3164dB p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((C3634oB) this.receiver).a(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC3164dB) obj);
            return jn0.h0.f84049a;
        }
    }

    /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.l {
        b(Object obj) {
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

    /* synthetic */ class c extends p013kotlin.jvm.internal.p implements wn0.l {
        c(Object obj) {
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

    /* synthetic */ class d extends p013kotlin.jvm.internal.p implements wn0.l {
        d(Object obj) {
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
    public static final jn0.h0 a(InterfaceC4021xB interfaceC4021xB, p011ja.k kVar, int i11, p020r2.l lVar, int i12) {
        a(interfaceC4021xB, kVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(InterfaceC4021xB interfaceC4021xB, int i11, p020r2.l lVar, int i12) {
        a(interfaceC4021xB, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(InterfaceC4021xB interfaceC4021xB, p011ja.k kVar, int i11, p020r2.l lVar, int i12) {
        b(interfaceC4021xB, kVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c(InterfaceC4021xB interfaceC4021xB, p011ja.k kVar, int i11, p020r2.l lVar, int i12) {
        c(interfaceC4021xB, kVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    public static final void a(final InterfaceC4021xB subcomponent, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p020r2.l lVarV = lVar.v(-520916862);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? lVarV.n(subcomponent) : lVarV.K(subcomponent) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-520916862, i12, -1, "com.fourthline.orca.kyc.internal.flow.tin.navigation.TinIntroDestination (graph.kt:24)");
            }
            lVarV.o(-678510177);
            androidx.p003lifecycle.f1 f1VarA = subcomponent.a();
            lVarV.o(158771249);
            boolean zK = lVarV.K(subcomponent);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.tu0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Wg.b(subcomponent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            C3991wi c3991wi = (C3991wi) ((Ip) new ViewModelProvider(f1VarA).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("Tin" + C3991wi.class.getName(), (wn0.a) objI);
            lVarV.l();
            C3475ki c3475ki = (C3475ki) Js.a(c3991wi.b(), lVarV, 0);
            lVarV.o(-678503921);
            boolean zK2 = lVarV.K(c3991wi);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new b(c3991wi);
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
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.uu0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Wg.a(subcomponent, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3991wi b(InterfaceC4021xB interfaceC4021xB) {
        return interfaceC4021xB.d();
    }

    public static final void c(final InterfaceC4021xB subcomponent, final p011ja.k backStackEntry, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(-1120346350);
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
                p020r2.o.S(-1120346350, i12, -1, "com.fourthline.orca.kyc.internal.flow.tin.navigation.UploadDataDestination (graph.kt:74)");
            }
            final QC qcBuild = subcomponent.b().build();
            lVarV.o(283070474);
            lVarV.o(-392706031);
            boolean zK = lVarV.K(qcBuild);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.zu0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Wg.a(qcBuild);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            UC uc2 = (UC) ((Ip) new ViewModelProvider(backStackEntry).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("" + UC.class.getName(), (wn0.a) objI);
            lVarV.l();
            IC ic2 = (IC) Js.a(uc2.b(), lVarV, 0);
            lVarV.o(283075991);
            boolean zK2 = lVarV.K(uc2);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new d(uc2);
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
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.av0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Wg.c(subcomponent, backStackEntry, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void b(final InterfaceC4021xB subcomponent, final p011ja.k backStackEntry, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(269993848);
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
                p020r2.o.S(269993848, i12, -1, "com.fourthline.orca.kyc.internal.flow.tin.navigation.TinScannerDestination (graph.kt:39)");
            }
            lVarV.o(-1773634481);
            final InterfaceC2917Pa interfaceC2917PaBuild = subcomponent.c().build();
            lVarV.o(-646214330);
            boolean zK = lVarV.K(interfaceC2917PaBuild);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.vu0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Wg.a(interfaceC2917PaBuild);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            C3640ob c3640ob = (C3640ob) ((Ip) new ViewModelProvider(backStackEntry).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("Tin" + C3640ob.class.getName(), (wn0.a) objI);
            lVarV.l();
            InterfaceC3004Wa interfaceC3004Wa = (InterfaceC3004Wa) Js.a(c3640ob.i(), lVarV, 0);
            Flow flowB = c3640ob.h().b();
            DocumentScannerConfig documentScannerConfigE = c3640ob.e();
            Flow flowJ = c3640ob.j();
            wn0.l lVarL = c3640ob.l();
            lVarV.o(-1773622179);
            boolean zK2 = lVarV.K(c3640ob);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new c(c3640ob);
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
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.wu0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Wg.b(subcomponent, backStackEntry, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3640ob a(InterfaceC2917Pa interfaceC2917Pa) {
        return interfaceC2917Pa.a();
    }

    public static final void a(final InterfaceC4021xB subcomponent, final p011ja.k backStackEntry, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(1271730612);
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
                p020r2.o.S(1271730612, i12, -1, "com.fourthline.orca.kyc.internal.flow.tin.navigation.TinDetailsDestination (graph.kt:58)");
            }
            lVarV.o(207215126);
            lVarV.o(-617124067);
            boolean zK = lVarV.K(subcomponent);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.xu0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Wg.a(subcomponent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            C3634oB c3634oB = (C3634oB) ((Ip) new ViewModelProvider(backStackEntry).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("" + C3634oB.class.getName(), (wn0.a) objI);
            lVarV.l();
            C3249fB c3249fB = (C3249fB) Js.a(c3634oB.c(), lVarV, 0);
            Flow flowB = c3634oB.b().b();
            lVarV.o(207222649);
            boolean zK2 = lVarV.K(c3634oB);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new a(c3634oB);
                lVarV.B(objI2);
            }
            lVarV.l();
            AbstractC3548mB.a(c3249fB, flowB, (wn0.l) ((co0.h) objI2), lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.yu0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Wg.a(subcomponent, backStackEntry, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3634oB a(InterfaceC4021xB interfaceC4021xB) {
        return interfaceC4021xB.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UC a(QC qc2) {
        return qc2.a();
    }
}
