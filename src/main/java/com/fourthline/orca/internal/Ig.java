package com.fourthline.orca.internal;

import androidx.p003lifecycle.ViewModelProvider;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Ig {

    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.l {
        a(Object obj) {
            super(1, obj, C3581n1.class, "handleEvents", "handleEvents(Lcom/fourthline/orca/bav/internal/screens/capture/BavCaptureSepaContract$Event;)V", 0);
        }

        public final void a(InterfaceC3325h1 p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((C3581n1) this.receiver).a(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC3325h1) obj);
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
            super(1, obj, F2.class, "handleEvents", "handleEvents(Lcom/fourthline/orca/bav/internal/screens/status/BavStatusContract$Event;)V", 0);
        }

        public final void a(InterfaceC4055y2 p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((F2) this.receiver).a(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC4055y2) obj);
            return jn0.h0.f84049a;
        }
    }

    /* synthetic */ class d extends p013kotlin.jvm.internal.p implements wn0.l {
        d(Object obj) {
            super(1, obj, C4065yC.class, "handleEvents", "handleEvents(Lcom/fourthline/orca/core/internal/screen/type/TypeSelectContract$Event;)V", 0);
        }

        public final void a(InterfaceC3678pC p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((C4065yC) this.receiver).a(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC3678pC) obj);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(X1 x11, p011ja.k kVar, int i11, p020r2.l lVar, int i12) {
        a(x11, kVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(X1 x11, p011ja.k kVar, int i11, p020r2.l lVar, int i12) {
        b(x11, kVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c(X1 x11, p011ja.k kVar, int i11, p020r2.l lVar, int i12) {
        c(x11, kVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 d(X1 x11, p011ja.k kVar, int i11, p020r2.l lVar, int i12) {
        d(x11, kVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    public static final void a(final X1 subcomponent, final p011ja.k backStackEntry, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(-1215759703);
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
                p020r2.o.S(-1215759703, i12, -1, "com.fourthline.orca.bav.internal.navigation.BavCaptureDestination (graph.kt:56)");
            }
            lVarV.o(-1523437347);
            lVarV.o(745466212);
            boolean zK = lVarV.K(subcomponent);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.ie0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Ig.a(subcomponent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            C3581n1 c3581n1 = (C3581n1) ((Ip) new ViewModelProvider(backStackEntry).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("" + C3581n1.class.getName(), (wn0.a) objI);
            lVarV.l();
            C3368i1 c3368i1 = (C3368i1) Js.a(c3581n1.d(), lVarV, 0);
            Flow flowB = c3581n1.c().b();
            lVarV.o(-1523429700);
            boolean zK2 = lVarV.K(c3581n1);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new a(c3581n1);
                lVarV.B(objI2);
            }
            lVarV.l();
            AbstractC3495l1.a(c3368i1, flowB, (wn0.l) ((co0.h) objI2), lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.je0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Ig.a(subcomponent, backStackEntry, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void b(final X1 subcomponent, final p011ja.k backStackEntry, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(-1939915633);
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
                p020r2.o.S(-1939915633, i12, -1, "com.fourthline.orca.bav.internal.navigation.BavIntroDestination (graph.kt:26)");
            }
            lVarV.o(749296961);
            lVarV.o(-1545854792);
            boolean zK = lVarV.K(subcomponent);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.me0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Ig.b(subcomponent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            C3991wi c3991wi = (C3991wi) ((Ip) new ViewModelProvider(backStackEntry).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("Bav" + C3991wi.class.getName(), (wn0.a) objI);
            lVarV.l();
            C3475ki c3475ki = (C3475ki) Js.a(c3991wi.b(), lVarV, 0);
            lVarV.o(749303062);
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
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.ne0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Ig.b(subcomponent, backStackEntry, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void c(final X1 subcomponent, final p011ja.k backStackEntry, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(-1382838457);
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
                p020r2.o.S(-1382838457, i12, -1, "com.fourthline.orca.bav.internal.navigation.BavStatusDestination (graph.kt:72)");
            }
            lVarV.o(-1408901966);
            lVarV.o(853167673);
            boolean zK = lVarV.K(subcomponent);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.ge0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Ig.c(subcomponent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            F2 f11 = (F2) ((Ip) new ViewModelProvider(backStackEntry).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("" + F2.class.getName(), (wn0.a) objI);
            lVarV.l();
            A2 a11 = (A2) Js.a(f11.c(), lVarV, 0);
            lVarV.o(-1408896202);
            boolean zK2 = lVarV.K(f11);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new c(f11);
                lVarV.B(objI2);
            }
            lVarV.l();
            D2.a(a11, (wn0.l) ((co0.h) objI2), lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.he0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Ig.c(subcomponent, backStackEntry, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void d(final X1 subcomponent, final p011ja.k backStackEntry, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(-1321318193);
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
                p020r2.o.S(-1321318193, i12, -1, "com.fourthline.orca.bav.internal.navigation.BavTypeDestination (graph.kt:41)");
            }
            lVarV.o(386167038);
            lVarV.o(-355405707);
            boolean zK = lVarV.K(subcomponent);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.ke0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Ig.d(subcomponent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            C4065yC c4065yC = (C4065yC) ((Ip) new ViewModelProvider(backStackEntry).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("Bav" + C4065yC.class.getName(), (wn0.a) objI);
            lVarV.l();
            C3721qC c3721qC = (C3721qC) Js.a(c4065yC.b(), lVarV, 0);
            lVarV.o(386173454);
            boolean zK2 = lVarV.K(c4065yC);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new d(c4065yC);
                lVarV.B(objI2);
            }
            lVarV.l();
            AbstractC3979wC.a(c3721qC, (wn0.l) ((co0.h) objI2), null, null, lVarV, 0, 12);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.le0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Ig.d(subcomponent, backStackEntry, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3991wi b(X1 x11) {
        return x11.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F2 c(X1 x11) {
        return x11.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4065yC d(X1 x11) {
        return x11.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3581n1 a(X1 x11) {
        return x11.c();
    }
}
