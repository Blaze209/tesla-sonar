package com.fourthline.orca.internal;

import androidx.p003lifecycle.ViewModelProvider;
import com.fourthline.vision.document.DocumentScannerConfig;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Kg {

    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.l {
        a(Object obj) {
            super(1, obj, C4060y7.class, "handleEvents", "handleEvents(Lcom/fourthline/orca/core/internal/capabilities/documentrecognition/screens/document_analysis/DocumentAnalysisContract$Event;)V", 0);
        }

        public final void a(U6 p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((C4060y7) this.receiver).a(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U6) obj);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(InterfaceC2917Pa interfaceC2917Pa, p011ja.k kVar, int i11, p020r2.l lVar, int i12) {
        a(interfaceC2917Pa, kVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(InterfaceC2917Pa interfaceC2917Pa, p011ja.k kVar, int i11, p020r2.l lVar, int i12) {
        b(interfaceC2917Pa, kVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    public static final void a(final InterfaceC2917Pa subcomponent, final p011ja.k backStackEntry, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(-225669016);
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
                p020r2.o.S(-225669016, i12, -1, "com.fourthline.orca.core.internal.capabilities.documentrecognition.navigation.DocumentAnalysisDestination (graph.kt:39)");
            }
            lVarV.o(933825733);
            lVarV.o(-359109556);
            boolean zK = lVarV.K(subcomponent);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.hh0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Kg.a(subcomponent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            C4060y7 c4060y7 = (C4060y7) ((Ip) new ViewModelProvider(backStackEntry).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("" + C4060y7.class.getName(), (wn0.a) objI);
            lVarV.l();
            V6 v11 = (V6) Js.a(c4060y7.c(), lVarV, 0);
            lVarV.o(933831938);
            boolean zK2 = lVarV.K(c4060y7);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new a(c4060y7);
                lVarV.B(objI2);
            }
            lVarV.l();
            AbstractC3716q7.a(v11, (wn0.l) ((co0.h) objI2), lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.ih0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Kg.a(subcomponent, backStackEntry, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void b(final InterfaceC2917Pa subcomponent, final p011ja.k backStackEntry, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(-2118607720);
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
                p020r2.o.S(-2118607720, i12, -1, "com.fourthline.orca.core.internal.capabilities.documentrecognition.navigation.DocumentScannerDestination (graph.kt:21)");
            }
            lVarV.o(1427292944);
            lVarV.o(1333285015);
            boolean zK = lVarV.K(subcomponent);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.jh0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Kg.b(subcomponent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            C3640ob c3640ob = (C3640ob) ((Ip) new ViewModelProvider(backStackEntry).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("" + C3640ob.class.getName(), (wn0.a) objI);
            lVarV.l();
            InterfaceC3004Wa interfaceC3004Wa = (InterfaceC3004Wa) Js.a(c3640ob.i(), lVarV, 0);
            Flow flowB = c3640ob.h().b();
            DocumentScannerConfig documentScannerConfigE = c3640ob.e();
            Flow flowJ = c3640ob.j();
            wn0.l lVarL = c3640ob.l();
            lVarV.o(1427304718);
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
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.kh0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Kg.b(subcomponent, backStackEntry, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4060y7 a(InterfaceC2917Pa interfaceC2917Pa) {
        return interfaceC2917Pa.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3640ob b(InterfaceC2917Pa interfaceC2917Pa) {
        return interfaceC2917Pa.a();
    }
}
