package com.fourthline.orca.internal;

import androidx.p003lifecycle.ViewModelProvider;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Pg {

    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.l {
        a(Object obj) {
            super(1, obj, Oj.class, "handleEvents", "handleEvents(Lcom/fourthline/orca/kyc/internal/flow/location/scanner/LocationScannerContract$Event;)V", 0);
        }

        public final void a(Ij p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((Oj) this.receiver).a(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Ij) obj);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(Bj bj2, int i11, p020r2.l lVar, int i12) {
        a(bj2, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    public static final void a(final Bj subcomponent, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(subcomponent, "subcomponent");
        p020r2.l lVarV = lVar.v(-1152363970);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? lVarV.n(subcomponent) : lVarV.K(subcomponent) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-1152363970, i12, -1, "com.fourthline.orca.kyc.internal.flow.location.navigation.LocationScannerDestination (graph.kt:19)");
            }
            lVarV.o(-1966276218);
            androidx.p003lifecycle.f1 f1VarA = subcomponent.a();
            lVarV.o(-1704743384);
            boolean zK = lVarV.K(subcomponent);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.cl0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Pg.a(subcomponent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            Oj oj2 = (Oj) ((Ip) new ViewModelProvider(f1VarA).a(p013kotlin.jvm.internal.o0.b(Ip.class))).a("" + Oj.class.getName(), (wn0.a) objI);
            lVarV.l();
            Kj kj2 = (Kj) Js.a(oj2.e(), lVarV, 0);
            Flow flowB = oj2.d().b();
            lVarV.o(-1966268225);
            boolean zK2 = lVarV.K(oj2);
            Object objI2 = lVarV.I();
            if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new a(oj2);
                lVarV.B(objI2);
            }
            lVarV.l();
            Mj.a(kj2, flowB, (wn0.l) ((co0.h) objI2), lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.dl0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Pg.a(subcomponent, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Oj a(Bj bj2) {
        return bj2.b();
    }
}
