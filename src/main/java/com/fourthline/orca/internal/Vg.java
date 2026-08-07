package com.fourthline.orca.internal;

import androidx.p003lifecycle.ViewModelProvider;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Vg {

    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.l {
        a(Object obj) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(InterfaceC3370i3 interfaceC3370i3, int i11, p020r2.l lVar, int i12) {
        a(interfaceC3370i3, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    public static final void a(final InterfaceC3370i3 subcomponent, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p020r2.l lVarV = lVar.v(-868987469);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? lVarV.n(subcomponent) : lVarV.K(subcomponent) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-868987469, i12, -1, "com.fourthline.orca.core.internal.capabilities.biometrics.navigation.SelfieScannerDestination (graph.kt:18)");
            }
            lVarV.o(1809780087);
            androidx.p003lifecycle.f1 f1VarA = subcomponent.a();
            lVarV.o(911619481);
            boolean zK = lVarV.K(subcomponent);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.vr0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Vg.a(subcomponent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            C3834sy c3834sy = (C3834sy) ((Ip) new ViewModelProvider(f1VarA).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("" + C3834sy.class.getName(), (wn0.a) objI);
            lVarV.l();
            InterfaceC3491ky interfaceC3491ky = (InterfaceC3491ky) Js.a(c3834sy.h(), lVarV, 0);
            Flow flowB = c3834sy.g().b();
            lVarV.o(1809788946);
            boolean zK2 = lVarV.K(c3834sy);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new a(c3834sy);
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
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.wr0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Vg.a(subcomponent, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3834sy a(InterfaceC3370i3 interfaceC3370i3) {
        return interfaceC3370i3.d();
    }
}
