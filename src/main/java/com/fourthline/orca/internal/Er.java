package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.sdk.R;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.Function0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Er {

    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.l f25642b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(wn0.l lVar, Continuation continuation) {
            super(2, continuation);
            this.f25642b = lVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f25642b, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f25641a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            this.f25642b.invoke(InterfaceC4129zr.f.f37336a);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(Br br2, wn0.l lVar, int i11, p020r2.l lVar2, int i12) {
        a(br2, lVar, lVar2, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(wn0.l lVar) {
        lVar.invoke(InterfaceC4129zr.c.f37333a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c(wn0.l lVar) {
        lVar.invoke(InterfaceC4129zr.b.f37332a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 d(wn0.l lVar) {
        lVar.invoke(InterfaceC4129zr.d.f37334a);
        return jn0.h0.f84049a;
    }

    public static final void a(final Br state, final wn0.l onEventSent, p020r2.l lVar, final int i11) {
        int i12;
        VD aVar;
        int i13;
        boolean z11;
        boolean z12;
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(onEventSent, "onEventSent");
        p020r2.l lVarV = lVar.v(356577287);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(onEventSent) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(356577287, i12, -1, "com.fourthline.orca.kyc.internal.flow.poa.confirmation.PoaConfirmationScreen (PoaConfirmationScreen.kt:23)");
            }
            lVarV.o(-1714834354);
            int i14 = i12 & 112;
            boolean z13 = i14 == 32;
            Object objI = lVarV.I();
            if (z13 || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.k20
                    @Override // wn0.a
                    public final Object invoke() {
                        return Er.a(onEventSent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            f.d.a(false, (wn0.a) objI, lVarV, 0, 1);
            lVarV.o(-1714830826);
            if (state.t() != null) {
                lVarV.o(-1283861879);
                C2916Oe c2916OeT = state.t();
                lVarV.o(374230730);
                boolean z14 = i14 == 32;
                Object objI2 = lVarV.I();
                if (z14 || objI2 == p020r2.l.INSTANCE.a()) {
                    objI2 = new wn0.a() { // from class: com.fourthline.orca.internal.l20
                        @Override // wn0.a
                        public final Object invoke() {
                            return Er.b(onEventSent);
                        }
                    };
                    lVarV.B(objI2);
                }
                lVarV.l();
                AbstractC2921Pe.a(c2916OeT, false, (wn0.a) objI2, lVarV, 0, 2);
                lVarV.l();
                i13 = 32;
                z12 = true;
                z11 = false;
            } else {
                lVarV.o(-1283625907);
                String strC = RA.c(state.a(), lVarV, 0);
                String strC2 = RA.c(QA.a.a(QA.f27433a, R.string.shared_document_confirmation_header_accessibility, 0, 2, null), lVarV, 0);
                Br.a aVarW = state.w();
                if (aVarW instanceof Br.a.b) {
                    aVar = new VD.b(((Br.a.b) state.w()).a());
                } else {
                    if (!(aVarW instanceof Br.a.C0476a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar = new VD.a(((Br.a.C0476a) state.w()).a());
                }
                String strC3 = RA.c(state.p(), lVarV, 0);
                String strC4 = RA.c(state.r(), lVarV, 0);
                String strC5 = RA.c(state.q(), lVarV, 0);
                String strC6 = RA.c(state.v(), lVarV, 0);
                String strC7 = RA.c(state.u(), lVarV, 0);
                InterfaceC3903uh interfaceC3903uhS = state.s();
                long jD = k3.r1.d(q1.m.a(lVarV, 0) ? 4291022296L : 4283979864L);
                lVarV.o(374265163);
                boolean z15 = i14 == 32;
                Object objI3 = lVarV.I();
                if (z15 || objI3 == p020r2.l.INSTANCE.a()) {
                    objI3 = new wn0.a() { // from class: com.fourthline.orca.internal.m20
                        @Override // wn0.a
                        public final Object invoke() {
                            return Er.c(onEventSent);
                        }
                    };
                    lVarV.B(objI3);
                }
                wn0.a aVar2 = (wn0.a) objI3;
                lVarV.l();
                lVarV.o(374262372);
                boolean z16 = i14 == 32;
                Object objI4 = lVarV.I();
                if (z16 || objI4 == p020r2.l.INSTANCE.a()) {
                    objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.n20
                        @Override // wn0.a
                        public final Object invoke() {
                            return Er.d(onEventSent);
                        }
                    };
                    lVarV.B(objI4);
                }
                wn0.a aVar3 = (wn0.a) objI4;
                lVarV.l();
                lVarV.o(374271853);
                boolean zK = lVarV.K(state) | (i14 == 32);
                Object objI5 = lVarV.I();
                if (zK || objI5 == p020r2.l.INSTANCE.a()) {
                    objI5 = new wn0.l() { // from class: com.fourthline.orca.internal.o20
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return Er.a(state, onEventSent, (Bitmap) obj);
                        }
                    };
                    lVarV.B(objI5);
                }
                lVarV.l();
                i13 = 32;
                z11 = false;
                z12 = true;
                WD.a(strC, strC2, aVar, false, strC3, strC4, strC5, strC7, strC6, interfaceC3903uhS, false, aVar2, aVar3, (wn0.l) objI5, k3.p1.l(jD), lVarV, 0, 0, 1032);
                lVarV = lVarV;
                lVarV.l();
            }
            lVarV.l();
            jn0.h0 h0Var = jn0.h0.f84049a;
            lVarV.o(-1714778392);
            boolean z17 = i14 == i13 ? z12 : z11;
            Object objI6 = lVarV.I();
            if (z17 || objI6 == p020r2.l.INSTANCE.a()) {
                objI6 = new a(onEventSent, null);
                lVarV.B(objI6);
            }
            lVarV.l();
            Function0.g(h0Var, (wn0.p) objI6, lVarV, 6);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.p20
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Er.a(state, onEventSent, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar) {
        lVar.invoke(InterfaceC4129zr.a.f37331a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(Br br2, wn0.l lVar, Bitmap it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (br2.w() instanceof Br.a.b) {
            lVar.invoke(new InterfaceC4129zr.e(((Br.a.b) br2.w()).a()));
        }
        return jn0.h0.f84049a;
    }
}
