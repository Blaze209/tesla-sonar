package com.fourthline.orca.internal;

import androidx.p003lifecycle.ViewModelProvider;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Lg {

    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.l {
        a(Object obj) {
            super(1, obj, W7.class, "handleEvents", "handleEvents(Lcom/fourthline/orca/core/internal/composable/base_selector/BaseSelectorContract$Event;)V", 0);
        }

        public final void a(J0 p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((W7) this.receiver).a(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J0) obj);
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
            super(1, obj, C3512lc.class, "handleEvents", "handleEvents(Lcom/fourthline/orca/kyc/internal/flow/document_selection/screens/type/DocumentTypeContract$Event;)V", 0);
        }

        public final void a(InterfaceC3043ac p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((C3512lc) this.receiver).a(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC3043ac) obj);
            return jn0.h0.f84049a;
        }
    }

    /* synthetic */ class d extends p013kotlin.jvm.internal.p implements wn0.l {
        d(Object obj) {
            super(1, obj, C2850Cc.class, "handleEvents", "handleEvents(Lcom/fourthline/orca/kyc/internal/flow/document_selection/screens/version/DocumentVersionContract$Event;)V", 0);
        }

        public final void a(InterfaceC3812sc p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((C2850Cc) this.receiver).a(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC3812sc) obj);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(InterfaceC2928Rb interfaceC2928Rb, p011ja.k kVar, int i11, p020r2.l lVar, int i12) {
        a(interfaceC2928Rb, kVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(InterfaceC2928Rb interfaceC2928Rb, p011ja.k kVar, int i11, p020r2.l lVar, int i12) {
        b(interfaceC2928Rb, kVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c(InterfaceC2928Rb interfaceC2928Rb, p011ja.k kVar, int i11, p020r2.l lVar, int i12) {
        c(interfaceC2928Rb, kVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 d(InterfaceC2928Rb interfaceC2928Rb, p011ja.k kVar, int i11, p020r2.l lVar, int i12) {
        d(interfaceC2928Rb, kVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    public static final void a(final InterfaceC2928Rb subcomponent, final p011ja.k backStackEntry, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(1580467043);
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
                p020r2.o.S(1580467043, i12, -1, "com.fourthline.orca.kyc.internal.flow.document_selection.navigation.DocumentCountryDestination (graph.kt:41)");
            }
            lVarV.o(1484726370);
            lVarV.o(45339369);
            boolean zK = lVarV.K(subcomponent);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.qh0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Lg.a(subcomponent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            W7 w11 = (W7) ((Ip) new ViewModelProvider(backStackEntry).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("" + W7.class.getName(), (wn0.a) objI);
            lVarV.l();
            L0 l11 = (L0) Js.a(w11.c(), lVarV, 0);
            Flow flowB = w11.b().b();
            lVarV.o(1484734208);
            boolean zK2 = lVarV.K(w11);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new a(w11);
                lVarV.B(objI2);
            }
            lVarV.l();
            U7.a(l11, flowB, (wn0.l) ((co0.h) objI2), lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.rh0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Lg.a(subcomponent, backStackEntry, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void b(final InterfaceC2928Rb subcomponent, final p011ja.k backStackEntry, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(1853049561);
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
                p020r2.o.S(1853049561, i12, -1, "com.fourthline.orca.kyc.internal.flow.document_selection.navigation.DocumentIntroductionDestination (graph.kt:26)");
            }
            lVarV.o(1009049295);
            lVarV.o(-402232095);
            boolean zK = lVarV.K(subcomponent);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.uh0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Lg.b(subcomponent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            C3991wi c3991wi = (C3991wi) ((Ip) new ViewModelProvider(backStackEntry).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("document" + C3991wi.class.getName(), (wn0.a) objI);
            lVarV.l();
            C3475ki c3475ki = (C3475ki) Js.a(c3991wi.b(), lVarV, 0);
            lVarV.o(1009055706);
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
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.vh0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Lg.b(subcomponent, backStackEntry, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void c(final InterfaceC2928Rb subcomponent, final p011ja.k backStackEntry, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(897127161);
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
                p020r2.o.S(897127161, i12, -1, "com.fourthline.orca.kyc.internal.flow.document_selection.navigation.DocumentTypeDestination (graph.kt:57)");
            }
            lVarV.o(-852267367);
            lVarV.o(-664131040);
            boolean zK = lVarV.K(subcomponent);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.sh0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Lg.c(subcomponent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            C3512lc c3512lc = (C3512lc) ((Ip) new ViewModelProvider(backStackEntry).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("" + C3512lc.class.getName(), (wn0.a) objI);
            lVarV.l();
            C3171dc c3171dc = (C3171dc) Js.a(c3512lc.b(), lVarV, 0);
            lVarV.o(-852261414);
            boolean zK2 = lVarV.K(c3512lc);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new c(c3512lc);
                lVarV.B(objI2);
            }
            lVarV.l();
            AbstractC3426jc.a(c3171dc, (wn0.l) ((co0.h) objI2), lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.th0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Lg.c(subcomponent, backStackEntry, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void d(final InterfaceC2928Rb subcomponent, final p011ja.k backStackEntry, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(-605177307);
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
                p020r2.o.S(-605177307, i12, -1, "com.fourthline.orca.kyc.internal.flow.document_selection.navigation.DocumentVersionDestination (graph.kt:72)");
            }
            lVarV.o(1394075776);
            lVarV.o(7704071);
            boolean zK = lVarV.K(subcomponent);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.wh0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Lg.d(subcomponent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            C2850Cc c2850Cc = (C2850Cc) ((Ip) new ViewModelProvider(backStackEntry).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("" + C2850Cc.class.getName(), (wn0.a) objI);
            lVarV.l();
            C3898uc c3898uc = (C3898uc) Js.a(c2850Cc.b(), lVarV, 0);
            lVarV.o(1394081918);
            boolean zK2 = lVarV.K(c2850Cc);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new d(c2850Cc);
                lVarV.B(objI2);
            }
            lVarV.l();
            AbstractC2838Ac.a(c3898uc, (wn0.l) ((co0.h) objI2), lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.xh0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Lg.d(subcomponent, backStackEntry, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3991wi b(InterfaceC2928Rb interfaceC2928Rb) {
        return interfaceC2928Rb.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3512lc c(InterfaceC2928Rb interfaceC2928Rb) {
        return interfaceC2928Rb.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2850Cc d(InterfaceC2928Rb interfaceC2928Rb) {
        return interfaceC2928Rb.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W7 a(InterfaceC2928Rb interfaceC2928Rb) {
        return interfaceC2928Rb.d();
    }
}
