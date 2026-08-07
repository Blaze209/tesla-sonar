package com.fourthline.orca.internal;

import androidx.p003lifecycle.ViewModelProvider;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Ug {

    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.l {
        a(Object obj) {
            super(1, obj, Tx.class, "handleEvents", "handleEvents(Lcom/fourthline/orca/kyc/internal/flow/selfie/intro/SelfieIntroContract$Event;)V", 0);
        }

        public final void a(Ox p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((Tx) this.receiver).a(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Ox) obj);
            return jn0.h0.f84049a;
        }
    }

    /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.l {
        b(Object obj) {
            super(1, obj, C3834sy.class, "handleEvents", "handleEvents(Lcom/fourthline/orca/core/internal/capabilities/biometrics/screens/scanner/SelfieScannerContract$Event;)V", 0);
        }

        public final void a(InterfaceC3405iy p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((C3834sy) this.receiver).a(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC3405iy) obj);
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
    public static final jn0.h0 a(Jx jx2, p011ja.k kVar, int i11, p020r2.l lVar, int i12) {
        a(jx2, kVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(InterfaceC3370i3 interfaceC3370i3, p011ja.k kVar, int i11, p020r2.l lVar, int i12) {
        a(interfaceC3370i3, kVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(Jx jx2, p011ja.k kVar, int i11, p020r2.l lVar, int i12) {
        b(jx2, kVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    public static final void a(final Jx subcomponent, final p011ja.k backStackEntry, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(-98482027);
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
                p020r2.o.S(-98482027, i12, -1, "com.fourthline.orca.kyc.internal.flow.selfie.navigation.SelfieIntroDestination (graph.kt:26)");
            }
            lVarV.o(-382652075);
            lVarV.o(-1267562148);
            boolean zK = lVarV.K(subcomponent);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.jr0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Ug.a(subcomponent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            Tx tx2 = (Tx) ((Ip) new ViewModelProvider(backStackEntry).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("" + Tx.class.getName(), (wn0.a) objI);
            lVarV.l();
            Px px2 = (Px) Js.a(tx2.a(), lVarV, 0);
            lVarV.o(-382646185);
            boolean zK2 = lVarV.K(tx2);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new a(tx2);
                lVarV.B(objI2);
            }
            lVarV.l();
            Rx.a(px2, (wn0.l) ((co0.h) objI2), lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.kr0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Ug.a(subcomponent, backStackEntry, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void b(final Jx subcomponent, final p011ja.k backStackEntry, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(618825138);
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
                p020r2.o.S(618825138, i12, -1, "com.fourthline.orca.kyc.internal.flow.selfie.navigation.UploadDataDestination (graph.kt:58)");
            }
            final QC qcBuild = subcomponent.b().build();
            lVarV.o(-2029117289);
            lVarV.o(-572797666);
            boolean zK = lVarV.K(qcBuild);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.fr0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Ug.a(qcBuild);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            UC uc2 = (UC) ((Ip) new ViewModelProvider(backStackEntry).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("" + UC.class.getName(), (wn0.a) objI);
            lVarV.l();
            IC ic2 = (IC) Js.a(uc2.b(), lVarV, 0);
            lVarV.o(-2029111772);
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
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.gr0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Ug.b(subcomponent, backStackEntry, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tx a(Jx jx2) {
        return jx2.c();
    }

    public static final void a(final InterfaceC3370i3 subcomponent, final p011ja.k backStackEntry, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(1628429918);
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
                p020r2.o.S(1628429918, i12, -1, "com.fourthline.orca.kyc.internal.flow.selfie.navigation.SelfieScannerDestination (graph.kt:41)");
            }
            lVarV.o(-922623195);
            lVarV.o(-1258199508);
            boolean zK = lVarV.K(subcomponent);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.hr0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Ug.a(subcomponent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            C3834sy c3834sy = (C3834sy) ((Ip) new ViewModelProvider(backStackEntry).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("" + C3834sy.class.getName(), (wn0.a) objI);
            lVarV.l();
            InterfaceC3491ky interfaceC3491ky = (InterfaceC3491ky) Js.a(c3834sy.h(), lVarV, 0);
            Flow flowB = c3834sy.g().b();
            lVarV.o(-922614491);
            boolean zK2 = lVarV.K(c3834sy);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new b(c3834sy);
                lVarV.B(objI2);
            }
            lVarV.l();
            AbstractC3749qy.a(c3834sy, interfaceC3491ky, flowB, (wn0.l) ((co0.h) objI2), lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.ir0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Ug.a(subcomponent, backStackEntry, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3834sy a(InterfaceC3370i3 interfaceC3370i3) {
        return interfaceC3370i3.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UC a(QC qc2) {
        return qc2.a();
    }
}
