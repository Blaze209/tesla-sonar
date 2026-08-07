package com.fourthline.orca.internal;

import androidx.p003lifecycle.ViewModelProvider;
import com.fourthline.nfc.ExtraNfcScannerConfig;
import com.fourthline.nfc.NfcScannerConfig;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Rg {

    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.l {
        a(Object obj) {
            super(1, obj, C4082yn.class, "handleEvents", "handleEvents(Lcom/fourthline/orca/kyc/internal/flow/nfc/screens/nfc_intro/NfcIntroContract$Event;)V", 0);
        }

        public final void a(InterfaceC3609nn p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((C4082yn) this.receiver).a(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC3609nn) obj);
            return jn0.h0.f84049a;
        }
    }

    /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.l {
        b(Object obj) {
            super(1, obj, Pn.class, "handleEvents", "handleEvents(Lcom/fourthline/orca/core/internal/capabilities/nfc/scanner/NfcScannerContract$Event;)V", 0);
        }

        public final void a(Bn p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((Pn) this.receiver).a(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Bn) obj);
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
    public static final jn0.h0 a(InterfaceC3353hn interfaceC3353hn, int i11, p020r2.l lVar, int i12) {
        a(interfaceC3353hn, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(InterfaceC3353hn interfaceC3353hn, p011ja.k kVar, int i11, p020r2.l lVar, int i12) {
        a(interfaceC3353hn, kVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(InterfaceC3353hn interfaceC3353hn, int i11, p020r2.l lVar, int i12) {
        b(interfaceC3353hn, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    public static final void a(final InterfaceC3353hn subcomponent, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p020r2.l lVarV = lVar.v(-94005548);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? lVarV.n(subcomponent) : lVarV.K(subcomponent) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-94005548, i12, -1, "com.fourthline.orca.kyc.internal.flow.nfc.navigation.NfcIntroDestination (graph.kt:23)");
            }
            lVarV.o(1885223151);
            androidx.p003lifecycle.f1 f1VarA = subcomponent.a();
            lVarV.o(-461013615);
            boolean zK = lVarV.K(subcomponent);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.hn0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Rg.a(subcomponent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            C4082yn c4082yn = (C4082yn) ((Ip) new ViewModelProvider(f1VarA).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("" + C4082yn.class.getName(), (wn0.a) objI);
            lVarV.l();
            C3780rn c3780rn = (C3780rn) Js.a(c4082yn.e(), lVarV, 0);
            Flow flowB = c4082yn.c().b();
            lVarV.o(1885230703);
            boolean zK2 = lVarV.K(c4082yn);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new a(c4082yn);
                lVarV.B(objI2);
            }
            lVarV.l();
            AbstractC3996wn.a(c3780rn, flowB, (wn0.l) ((co0.h) objI2), lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.in0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Rg.a(subcomponent, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void b(final InterfaceC3353hn subcomponent, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p020r2.l lVarV = lVar.v(1392061634);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? lVarV.n(subcomponent) : lVarV.K(subcomponent) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(1392061634, i12, -1, "com.fourthline.orca.kyc.internal.flow.nfc.navigation.NfcScannerDestination (graph.kt:38)");
            }
            lVarV.o(962362687);
            androidx.p003lifecycle.f1 f1VarA = subcomponent.a();
            lVarV.o(745991393);
            boolean zK = lVarV.K(subcomponent);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.ln0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Rg.b(subcomponent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            Pn pn2 = (Pn) ((Ip) new ViewModelProvider(f1VarA).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("" + Pn.class.getName(), (wn0.a) objI);
            lVarV.l();
            NfcScannerConfig config = pn2.getConfig();
            ExtraNfcScannerConfig extraNfcScannerConfigD = pn2.d();
            En en2 = (En) Js.a(pn2.e(), lVarV, 0);
            Flow flowB = pn2.c().b();
            lVarV.o(962376061);
            boolean zK2 = lVarV.K(pn2);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new b(pn2);
                lVarV.B(objI2);
            }
            lVarV.l();
            In.a(en2, config, extraNfcScannerConfigD, pn2, flowB, (wn0.l) ((co0.h) objI2), lVarV, (NfcScannerConfig.$stable << 3) | (ExtraNfcScannerConfig.$stable << 6));
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.mn0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Rg.b(subcomponent, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4082yn a(InterfaceC3353hn interfaceC3353hn) {
        return interfaceC3353hn.d();
    }

    public static final void a(final InterfaceC3353hn subcomponent, final p011ja.k backStackEntry, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(354039762);
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
                p020r2.o.S(354039762, i12, -1, "com.fourthline.orca.kyc.internal.flow.nfc.navigation.UploadDataDestination (graph.kt:59)");
            }
            final QC qcBuild = subcomponent.b().build();
            lVarV.o(-1891602376);
            lVarV.o(-1001663681);
            boolean zK = lVarV.K(qcBuild);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.jn0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Rg.a(qcBuild);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            UC uc2 = (UC) ((Ip) new ViewModelProvider(backStackEntry).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("" + UC.class.getName(), (wn0.a) objI);
            lVarV.l();
            IC ic2 = (IC) Js.a(uc2.b(), lVarV, 0);
            lVarV.o(-1891596859);
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
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.kn0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Rg.a(subcomponent, backStackEntry, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pn b(InterfaceC3353hn interfaceC3353hn) {
        return interfaceC3353hn.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UC a(QC qc2) {
        return qc2.a();
    }
}
