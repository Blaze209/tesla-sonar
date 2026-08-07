package com.fourthline.orca.internal;

import androidx.p003lifecycle.ViewModelProvider;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Ng {

    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.l {
        a(Object obj) {
            super(1, obj, W9.class, "handleEvents", "handleEvents(Lcom/fourthline/orca/kyc/internal/flow/person/screens/nationality/DocumentNationalityContract$Event;)V", 0);
        }

        public final void a(P9 p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((W9) this.receiver).a(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((P9) obj);
            return jn0.h0.f84049a;
        }
    }

    /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.l {
        b(Object obj) {
            super(1, obj, Kq.class, "handleEvents", "handleEvents(Lcom/fourthline/orca/kyc/internal/flow/person/screens/personal_details/PersonalDetailsContract$Event;)V", 0);
        }

        public final void a(Dq p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((Kq) this.receiver).a(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Dq) obj);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(InterfaceC3655oq interfaceC3655oq, int i11, p020r2.l lVar, int i12) {
        a(interfaceC3655oq, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Kq b(InterfaceC3655oq interfaceC3655oq) {
        return interfaceC3655oq.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(InterfaceC3655oq interfaceC3655oq, p011ja.k kVar, int i11, p020r2.l lVar, int i12) {
        a(interfaceC3655oq, kVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    public static final void a(final InterfaceC3655oq subcomponent, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p020r2.l lVarV = lVar.v(1247439398);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? lVarV.n(subcomponent) : lVarV.K(subcomponent) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(1247439398, i12, -1, "com.fourthline.orca.kyc.internal.flow.person.navigation.DocumentNationalityDestination (graph.kt:21)");
            }
            lVarV.o(-1409105870);
            androidx.p003lifecycle.f1 f1VarA = subcomponent.a();
            lVarV.o(564846804);
            boolean zK = lVarV.K(subcomponent);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.qj0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Ng.a(subcomponent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            W9 w11 = (W9) ((Ip) new ViewModelProvider(f1VarA).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("" + W9.class.getName(), (wn0.a) objI);
            lVarV.l();
            S9 s11 = (S9) Js.a(w11.c(), lVarV, 0);
            Flow flowB = w11.b().b();
            lVarV.o(-1409097625);
            boolean zK2 = lVarV.K(w11);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new a(w11);
                lVarV.B(objI2);
            }
            lVarV.l();
            U9.a(s11, flowB, (wn0.l) ((co0.h) objI2), lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.rj0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Ng.a(subcomponent, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W9 a(InterfaceC3655oq interfaceC3655oq) {
        return interfaceC3655oq.b();
    }

    public static final void a(final InterfaceC3655oq subcomponent, final p011ja.k backStackEntry, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(-166863043);
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
                p020r2.o.S(-166863043, i12, -1, "com.fourthline.orca.kyc.internal.flow.person.navigation.PersonalDetailsDestination (graph.kt:37)");
            }
            lVarV.o(737079912);
            lVarV.o(-1083458577);
            boolean zK = lVarV.K(subcomponent);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.oj0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Ng.b(subcomponent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            Kq kq2 = (Kq) ((Ip) new ViewModelProvider(backStackEntry).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("" + Kq.class.getName(), (wn0.a) objI);
            lVarV.l();
            Fq fq2 = (Fq) Js.a(kq2.c(), lVarV, 0);
            Flow flowB = kq2.b().b();
            lVarV.o(737087750);
            boolean zK2 = lVarV.K(kq2);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new b(kq2);
                lVarV.B(objI2);
            }
            lVarV.l();
            Iq.a(fq2, flowB, (wn0.l) ((co0.h) objI2), lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.pj0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Ng.a(subcomponent, backStackEntry, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
