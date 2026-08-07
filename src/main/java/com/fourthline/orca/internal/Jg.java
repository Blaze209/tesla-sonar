package com.fourthline.orca.internal;

import androidx.p003lifecycle.ViewModelProvider;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Jg {

    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.l {
        a(Object obj) {
            super(1, obj, C3030a5.class, "handleEvents", "handleEvents(Lcom/fourthline/orca/kyc/internal/flow/contacts/details/ContactsDetailsContract$Event;)V", 0);
        }

        public final void a(T4 p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((C3030a5) this.receiver).a(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((T4) obj);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(InterfaceC3756r5 interfaceC3756r5, p011ja.k kVar, int i11, p020r2.l lVar, int i12) {
        a(interfaceC3756r5, kVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    public static final void a(final InterfaceC3756r5 subcomponent, final p011ja.k backStackEntry, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(852432212);
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
                p020r2.o.S(852432212, i12, -1, "com.fourthline.orca.kyc.internal.flow.contacts.navigation.ContactsDetailsDestination (graph.kt:20)");
            }
            lVarV.o(1388031577);
            lVarV.o(-1529190816);
            boolean zK = lVarV.K(subcomponent);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.bg0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Jg.a(subcomponent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            C3030a5 c3030a5 = (C3030a5) ((Ip) new ViewModelProvider(backStackEntry).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("" + C3030a5.class.getName(), (wn0.a) objI);
            lVarV.l();
            Y4 y11 = (Y4) Js.a(c3030a5.c(), lVarV, 0);
            Flow flowB = c3030a5.b().b();
            lVarV.o(1388039415);
            boolean zK2 = lVarV.K(c3030a5);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new a(c3030a5);
                lVarV.B(objI2);
            }
            lVarV.l();
            Z4.a(y11, flowB, (wn0.l) ((co0.h) objI2), lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.cg0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Jg.a(subcomponent, backStackEntry, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3030a5 a(InterfaceC3756r5 interfaceC3756r5) {
        return interfaceC3756r5.a();
    }
}
