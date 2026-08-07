package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.Function0;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ri, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3775ri {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ri$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.l f35078b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(wn0.l lVar, Continuation continuation) {
            super(2, continuation);
            this.f35078b = lVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f35078b, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f35077a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            this.f35078b.invoke(InterfaceC3432ji.c.f32783a);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C3475ki c3475ki, wn0.l lVar, int i11, p020r2.l lVar2, int i12) {
        a(c3475ki, lVar, lVar2, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    public static final void a(final C3475ki state, final wn0.l onEventSent, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(onEventSent, "onEventSent");
        p020r2.l lVarV = lVar.v(-54393874);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? lVarV.n(state) : lVarV.K(state) ? 4 : 2) | i11;
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
                p020r2.o.S(-54393874, i12, -1, "com.fourthline.orca.core.internal.intro.IntroScreen (IntroScreen.kt:17)");
            }
            lVarV.o(-568545102);
            int i13 = i12 & 112;
            boolean z11 = i13 == 32;
            Object objI = lVarV.I();
            if (z11 || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.ib1
                    @Override // wn0.a
                    public final Object invoke() {
                        return AbstractC3775ri.a(onEventSent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            f.d.a(false, (wn0.a) objI, lVarV, 0, 1);
            jn0.h0 h0Var = jn0.h0.f84049a;
            lVarV.o(-568542440);
            boolean z12 = i13 == 32;
            Object objI2 = lVarV.I();
            if (z12 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new a(onEventSent, null);
                lVarV.B(objI2);
            }
            lVarV.l();
            Function0.g(h0Var, (wn0.p) objI2, lVarV, 6);
            String strQ = state.q();
            String strC = RA.c(state.a(), lVarV, 0);
            String strC2 = RA.c(state.b(), lVarV, 0);
            Yj yjP = state.p();
            InterfaceC3777rk.b bVarR = state.r();
            lVarV.o(136815025);
            boolean z13 = i13 == 32;
            Object objI3 = lVarV.I();
            if (z13 || objI3 == p020r2.l.INSTANCE.a()) {
                objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.jb1
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3775ri.a(onEventSent, (InterfaceC3807sD) obj);
                    }
                };
                lVarV.B(objI3);
            }
            lVarV.l();
            C3735qk c3735qk = new C3735qk(bVarR, (wn0.l) objI3);
            InterfaceC3777rk.a aVarS = state.s();
            lVarV.o(136821905);
            boolean z14 = i13 == 32;
            Object objI4 = lVarV.I();
            if (z14 || objI4 == p020r2.l.INSTANCE.a()) {
                objI4 = new wn0.l() { // from class: com.fourthline.orca.internal.kb1
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3775ri.b(onEventSent, (InterfaceC3807sD) obj);
                    }
                };
                lVarV.B(objI4);
            }
            lVarV.l();
            AbstractC3818si.a(strQ, strC, strC2, null, null, new C3820sk(c3735qk, new C3735qk(aVarS, (wn0.l) objI4), false, 4, null), yjP, 0, false, lVarV, 0, 408);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.lb1
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3775ri.a(state, onEventSent, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(wn0.l lVar, InterfaceC3807sD it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        lVar.invoke(InterfaceC3432ji.a.f32781a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar) {
        lVar.invoke(InterfaceC3432ji.a.f32781a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar, InterfaceC3807sD it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        lVar.invoke(InterfaceC3432ji.b.f32782a);
        return jn0.h0.f84049a;
    }
}
