package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KeyboardOptions;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p020r2.Function0;
import p4.LocaleList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class H0 {

    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f26053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.r2 f26054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i3.f f26055d;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.H0$a$a, reason: collision with other inner class name */
        static final class C0492a extends SuspendLambda implements wn0.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f26056a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f26057b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.r2 f26058c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ i3.f f26059d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0492a(androidx.compose.ui.platform.r2 r2Var, i3.f fVar, Continuation continuation) {
                super(2, continuation);
                this.f26058c = r2Var;
                this.f26059d = fVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(I0 i11, Continuation continuation) {
                return ((C0492a) create(i11, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0492a c0492a = new C0492a(this.f26058c, this.f26059d, continuation);
                c0492a.f26057b = obj;
                return c0492a;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f26056a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                I0 i11 = (I0) this.f26057b;
                if (i11 instanceof I0.b) {
                    androidx.compose.ui.platform.r2 r2Var = this.f26058c;
                    if (r2Var != null) {
                        r2Var.hide();
                    }
                } else if (i11 instanceof I0.c) {
                    androidx.compose.ui.platform.r2 r2Var2 = this.f26058c;
                    if (r2Var2 != null) {
                        r2Var2.show();
                    }
                } else if (i11 instanceof I0.a) {
                    Vh.a(this.f26059d);
                }
                return jn0.h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Flow flow, androidx.compose.ui.platform.r2 r2Var, i3.f fVar, Continuation continuation) {
            super(2, continuation);
            this.f26053b = flow;
            this.f26054c = r2Var;
            this.f26055d = fVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f26053b, this.f26054c, this.f26055d, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f26052a;
            if (i11 == 0) {
                jn0.t.b(obj);
                Flow flow = this.f26053b;
                if (flow != null) {
                    C0492a c0492a = new C0492a(this.f26054c, this.f26055d, null);
                    this.f26052a = 1;
                    if (AbstractC3989wg.a(flow, c0492a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }
    }

    static final class c extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.l f26064b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(wn0.l lVar, Continuation continuation) {
            super(2, continuation);
            this.f26064b = lVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f26064b, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f26063a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            this.f26064b.invoke(J0.h.f26413a);
            return jn0.h0.f84049a;
        }
    }

    static final class e implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f26070b;

        e(String str, String str2) {
            this.f26069a = str;
            this.f26070b = str2;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(2133626358, i11, -1, "com.fourthline.orca.core.internal.composable.base_selector.SuggestionItem.<anonymous>.<anonymous> (BaseSelectorComposables.kt:232)");
            }
            p009i2.v2.b(this.f26070b, androidx.compose.foundation.layout.t.m(AbstractC3307gk.a((androidx.compose.ui.d) androidx.compose.ui.d.INSTANCE, this.f26069a, true), w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), 0L, 0L, null, null, null, 0L, null, null, 0L, t4.t.INSTANCE.b(), false, 1, 0, null, C3825sp.f35377a.b(lVar, 6).getInput().getDefault().getValue().a(false, w4.v.b(C3825sp.a.f35378a.a()), lVar, 48, 1), lVar, 0, 3120, 55292);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((p020r2.l) obj, ((Number) obj2).intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(L0 l11, Flow flow, wn0.l lVar, int i11, p020r2.l lVar2, int i12) {
        a(l11, flow, lVar, lVar2, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(wn0.l lVar, InterfaceC3807sD it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        lVar.invoke(J0.a.f26406a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(K0 k11, String str, wn0.l lVar, wn0.l lVar2, wn0.l lVar3, wn0.a aVar, int i11, int i12, p020r2.l lVar4, int i13) {
        a(k11, str, lVar, lVar2, lVar3, aVar, lVar4, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(androidx.compose.ui.d dVar, String str, String str2, wn0.a aVar, int i11, int i12, p020r2.l lVar, int i13) {
        a(dVar, str, str2, aVar, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.a aVar, int i11, p020r2.l lVar, int i12) {
        a(aVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    public static final void a(final L0 state, final Flow flow, final wn0.l onEventSent, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(onEventSent, "onEventSent");
        p020r2.l lVarV = lVar.v(-256992418);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(flow) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= lVarV.K(onEventSent) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-256992418, i12, -1, "com.fourthline.orca.core.internal.composable.base_selector.ItemPickScreen (BaseSelectorComposables.kt:56)");
            }
            androidx.compose.ui.platform.r2 r2Var = (androidx.compose.ui.platform.r2) lVarV.U(androidx.compose.ui.platform.z0.q());
            i3.f fVar = (i3.f) lVarV.U(androidx.compose.ui.platform.z0.h());
            lVarV.o(-1292702980);
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objI = lVarV.I();
            if (z11 || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.ic0
                    @Override // wn0.a
                    public final Object invoke() {
                        return H0.a(onEventSent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            f.d.a(false, (wn0.a) objI, lVarV, 0, 1);
            jn0.h0 h0Var = jn0.h0.f84049a;
            lVarV.o(-1292700129);
            boolean zK = lVarV.K(flow) | lVarV.n(r2Var) | lVarV.K(fVar);
            Object objI2 = lVarV.I();
            if (zK || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new a(flow, r2Var, fVar, null);
                lVarV.B(objI2);
            }
            lVarV.l();
            Function0.g(h0Var, (wn0.p) objI2, lVarV, 6);
            String strQ = state.q();
            String strC = RA.c(state.a(), lVarV, 0);
            z2.a aVarE = z2.c.e(311354187, true, new b(state, onEventSent, fVar), lVarV, 54);
            lVarV.o(-1292660601);
            InterfaceC3777rk.b bVarR = state.r();
            lVarV.o(-946876561);
            boolean z12 = i13 == 256;
            Object objI3 = lVarV.I();
            if (z12 || objI3 == p020r2.l.INSTANCE.a()) {
                objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.jc0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H0.a(onEventSent, (InterfaceC3807sD) obj);
                    }
                };
                lVarV.B(objI3);
            }
            lVarV.l();
            C3735qk c3735qk = new C3735qk(bVarR, (wn0.l) objI3);
            InterfaceC3777rk.a aVarS = state.s();
            lVarV.o(-946869969);
            boolean z13 = i13 == 256;
            Object objI4 = lVarV.I();
            if (z13 || objI4 == p020r2.l.INSTANCE.a()) {
                objI4 = new wn0.l() { // from class: com.fourthline.orca.internal.kc0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H0.b(onEventSent, (InterfaceC3807sD) obj);
                    }
                };
                lVarV.B(objI4);
            }
            lVarV.l();
            C3820sk c3820sk = new C3820sk(c3735qk, new C3735qk(aVarS, (wn0.l) objI4), false, 4, null);
            lVarV.l();
            AbstractC3269fp.a(strQ, strC, null, aVarE, null, c3820sk, null, false, null, lVarV, 3072, 468);
            lVarV.o(-1292644554);
            boolean z14 = i13 == 256;
            Object objI5 = lVarV.I();
            if (z14 || objI5 == p020r2.l.INSTANCE.a()) {
                objI5 = new c(onEventSent, null);
                lVarV.B(objI5);
            }
            lVarV.l();
            Function0.g(h0Var, (wn0.p) objI5, lVarV, 6);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.lc0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return H0.a(state, flow, onEventSent, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final class d implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ K0 f26065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.l f26066b;

        d(K0 k11, wn0.l lVar) {
            this.f26065a = k11;
            this.f26066b = lVar;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1002550500, i11, -1, "com.fourthline.orca.core.internal.composable.base_selector.ItemPicker.<anonymous>.<anonymous>.<anonymous> (BaseSelectorComposables.kt:145)");
            }
            lVar.o(-1784028201);
            boolean zK = lVar.K(this.f26065a) | lVar.n(this.f26066b);
            final K0 k11 = this.f26065a;
            final wn0.l lVar2 = this.f26066b;
            Object objI = lVar.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.uc0
                    @Override // wn0.a
                    public final Object invoke() {
                        return H0.d.a(k11, lVar2);
                    }
                };
                lVar.B(objI);
            }
            lVar.l();
            H0.a((wn0.a) objI, lVar, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((p020r2.l) obj, ((Number) obj2).intValue());
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List a(K0 k11, wn0.l lVar) {
            List listI = k11.i();
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listI, 10));
            Iterator it = listI.iterator();
            while (it.hasNext()) {
                arrayList.add(z2.c.c(1103587411, true, new a((InterfaceC3447jx) it.next(), lVar)));
            }
            return arrayList;
        }

        static final class a implements wn0.q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3447jx f26067a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ wn0.l f26068b;

            a(InterfaceC3447jx interfaceC3447jx, wn0.l lVar) {
                this.f26067a = interfaceC3447jx;
                this.f26068b = lVar;
            }

            public final void a(int i11, p020r2.l lVar, int i12) {
                if ((i12 & 6) == 0) {
                    i12 |= lVar.r(i11) ? 4 : 2;
                }
                if ((i12 & 19) == 18 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1103587411, i12, -1, "com.fourthline.orca.core.internal.composable.base_selector.ItemPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BaseSelectorComposables.kt:149)");
                }
                androidx.compose.ui.d dVarA = AbstractC3307gk.a(androidx.compose.ui.d.INSTANCE, "listItem" + i11, (String) null, 2, (Object) null);
                String str = (String) this.f26067a.a().invoke();
                String strC = RA.c(this.f26067a.getName(), lVar, 0);
                lVar.o(176173584);
                boolean zN = lVar.n(this.f26068b) | lVar.K(this.f26067a);
                final wn0.l lVar2 = this.f26068b;
                final InterfaceC3447jx interfaceC3447jx = this.f26067a;
                Object objI = lVar.I();
                if (zN || objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.a() { // from class: com.fourthline.orca.internal.vc0
                        @Override // wn0.a
                        public final Object invoke() {
                            return H0.d.a.a(lVar2, interfaceC3447jx);
                        }
                    };
                    lVar.B(objI);
                }
                lVar.l();
                H0.a(dVarA, str, strC, (wn0.a) objI, lVar, 0, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }

            @Override // wn0.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a(((Number) obj).intValue(), (p020r2.l) obj2, ((Number) obj3).intValue());
                return jn0.h0.f84049a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final jn0.h0 a(wn0.l lVar, InterfaceC3447jx interfaceC3447jx) {
                lVar.invoke(interfaceC3447jx);
                return jn0.h0.f84049a;
            }
        }
    }

    static final class b implements wn0.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ L0 f26060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.l f26061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i3.f f26062c;

        b(L0 l11, wn0.l lVar, i3.f fVar) {
            this.f26060a = l11;
            this.f26061b = lVar;
            this.f26062c = fVar;
        }

        public final void a(v1.i OrcaScreen, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(OrcaScreen, "$this$OrcaScreen");
            if ((i11 & 17) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(311354187, i11, -1, "com.fourthline.orca.core.internal.composable.base_selector.ItemPickScreen.<anonymous> (BaseSelectorComposables.kt:78)");
            }
            K0 k0P = this.f26060a.p();
            lVar.o(-946905133);
            boolean zN = lVar.n(this.f26061b);
            final wn0.l lVar2 = this.f26061b;
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.qc0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H0.b.a(lVar2, ((Boolean) obj).booleanValue());
                    }
                };
                lVar.B(objI);
            }
            wn0.l lVar3 = (wn0.l) objI;
            lVar.l();
            lVar.o(-946896546);
            boolean zN2 = lVar.n(this.f26061b);
            final wn0.l lVar4 = this.f26061b;
            Object objI2 = lVar.I();
            if (zN2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new wn0.l() { // from class: com.fourthline.orca.internal.rc0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H0.b.a(lVar4, (String) obj);
                    }
                };
                lVar.B(objI2);
            }
            wn0.l lVar5 = (wn0.l) objI2;
            lVar.l();
            lVar.o(-946892644);
            boolean zN3 = lVar.n(this.f26061b);
            final wn0.l lVar6 = this.f26061b;
            Object objI3 = lVar.I();
            if (zN3 || objI3 == p020r2.l.INSTANCE.a()) {
                objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.sc0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H0.b.a(lVar6, (InterfaceC3447jx) obj);
                    }
                };
                lVar.B(objI3);
            }
            wn0.l lVar7 = (wn0.l) objI3;
            lVar.l();
            lVar.o(-946888539);
            boolean zN4 = lVar.n(this.f26061b) | lVar.K(this.f26062c);
            final wn0.l lVar8 = this.f26061b;
            final i3.f fVar = this.f26062c;
            Object objI4 = lVar.I();
            if (zN4 || objI4 == p020r2.l.INSTANCE.a()) {
                objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.tc0
                    @Override // wn0.a
                    public final Object invoke() {
                        return H0.b.a(lVar8, fVar);
                    }
                };
                lVar.B(objI4);
            }
            lVar.l();
            H0.a(k0P, null, lVar3, lVar5, lVar7, (wn0.a) objI4, lVar, 0, 2);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((v1.i) obj, (p020r2.l) obj2, ((Number) obj3).intValue());
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(wn0.l lVar, boolean z11) {
            if (z11) {
                lVar.invoke(J0.d.f26409a);
            } else {
                lVar.invoke(J0.e.f26410a);
            }
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(wn0.l lVar, String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            lVar.invoke(new J0.c(value));
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(wn0.l lVar, InterfaceC3447jx item) {
            p013kotlin.jvm.internal.s.k(item, "item");
            lVar.invoke(new J0.f(item));
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(wn0.l lVar, i3.f fVar) {
            lVar.invoke(J0.b.f26407a);
            fVar.r(true);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar) {
        lVar.invoke(J0.a.f26406a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar, InterfaceC3807sD it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        lVar.invoke(J0.g.f26412a);
        return jn0.h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0228  */
    /* JADX WARN: Code duplicated, block: B:103:0x0237  */
    /* JADX WARN: Code duplicated, block: B:106:0x0274  */
    /* JADX WARN: Code duplicated, block: B:107:0x0276  */
    /* JADX WARN: Code duplicated, block: B:110:0x027d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0285  */
    /* JADX WARN: Code duplicated, block: B:115:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:116:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:119:0x02be  */
    /* JADX WARN: Code duplicated, block: B:121:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:125:0x030c  */
    /* JADX WARN: Code duplicated, block: B:129:0x031d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0329  */
    /* JADX WARN: Code duplicated, block: B:135:0x0348  */
    /* JADX WARN: Code duplicated, block: B:139:0x0352  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:36:0x007b  */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:41:0x0088  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:51:0x009f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00df  */
    /* JADX WARN: Code duplicated, block: B:78:0x010a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0116  */
    /* JADX WARN: Code duplicated, block: B:82:0x011a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0139  */
    /* JADX WARN: Code duplicated, block: B:87:0x0147  */
    /* JADX WARN: Code duplicated, block: B:90:0x0183  */
    /* JADX WARN: Code duplicated, block: B:93:0x018f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0193  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c0  */
    public static final void a(final K0 state, String str, final wn0.l onFocusChanged, final wn0.l onValueChanged, final wn0.l onItemPicked, final wn0.a onDoneButtonClicked, p020r2.l lVar, final int i11, final int i12) {
        int i13;
        String str2;
        int i14;
        int i15;
        int i16;
        int i17;
        String str3;
        int iA;
        wn0.a<b4.g> aVarA;
        p020r2.l lVarA;
        wn0.p<b4.g, Integer, jn0.h0> pVarB;
        int iA2;
        wn0.a<b4.g> aVarA2;
        p020r2.l lVarA2;
        wn0.p<b4.g, Integer, jn0.h0> pVarB2;
        z2.a aVarE;
        boolean z11;
        Object objI;
        boolean z12;
        Object objI2;
        String strC;
        final String str4;
        p020r2.w2 w2VarX;
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(onFocusChanged, "onFocusChanged");
        p013kotlin.jvm.internal.s.k(onValueChanged, "onValueChanged");
        p013kotlin.jvm.internal.s.k(onItemPicked, "onItemPicked");
        p013kotlin.jvm.internal.s.k(onDoneButtonClicked, "onDoneButtonClicked");
        p020r2.l lVarV = lVar.v(-1963867052);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.K(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i18 = i12 & 2;
        if (i18 == 0) {
            if ((i11 & 48) == 0) {
                str2 = str;
                i13 |= lVarV.n(str2) ? 32 : 16;
            }
            if ((i12 & 4) != 0) {
                i13 |= KyberEngine.KyberPolyBytes;
            } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                if (lVarV.K(onFocusChanged)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i13 |= i14;
            }
            if ((i12 & 8) != 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                if (lVarV.K(onValueChanged)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                if (lVarV.K(onItemPicked)) {
                    i16 = 16384;
                } else {
                    i16 = PKIFailureInfo.certRevoked;
                }
                i13 |= i16;
            }
            if ((i12 & 32) != 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (lVarV.K(onDoneButtonClicked)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
            if ((74899 & i13) != 74898 && lVarV.b()) {
                lVarV.j();
                str4 = str2;
            } else {
                if (i18 != 0) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1963867052, i13, -1, "com.fourthline.orca.core.internal.composable.base_selector.ItemPicker (BaseSelectorComposables.kt:126)");
                }
                androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
                d3.c.Companion companion2 = d3.c.INSTANCE;
                z3.i0 i0VarH = androidx.compose.foundation.layout.g.h(companion2.o(), false);
                iA = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC = lVarV.c();
                androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, companion);
                b4.g.Companion companion3 = b4.g.INSTANCE;
                aVarA = companion3.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.u()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA, i0VarH, companion3.c());
                p020r2.d4.b(lVarA, xVarC, companion3.e());
                pVarB = companion3.b();
                if (!lVarA.u() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                p020r2.d4.b(lVarA, dVarE, companion3.d());
                androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
                z3.i0 i0VarA = v1.g.a(v1.b.f117444a.g(), companion2.k(), lVarV, 0);
                iA2 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC2 = lVarV.c();
                androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(lVarV, companion);
                aVarA2 = companion3.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.u()) {
                    lVarV.z(aVarA2);
                } else {
                    lVarV.d();
                }
                lVarA2 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA2, i0VarA, companion3.c());
                p020r2.d4.b(lVarA2, xVarC2, companion3.e());
                pVarB2 = companion3.b();
                if (!lVarA2.u() || !p013kotlin.jvm.internal.s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                }
                p020r2.d4.b(lVarA2, dVarE2, companion3.d());
                v1.j jVar = v1.j.f117505a;
                Mh mhE = state.e();
                Gh state2 = state.getState();
                int i19 = i13 & 14;
                String strA = Oh.a(state, lVarV, i19);
                String strB = Oh.b(state, lVarV, i19);
                String strC2 = state.c();
                String strC3 = RA.c(state.d(), lVarV, 0);
                InterfaceC3903uh interfaceC3903uhH = state.h();
                String strC4 = RA.c(state.a(), lVarV, 0);
                String strC5 = RA.c(state.f(), lVarV, 0);
                InterfaceC3903uh interfaceC3903uhG = state.g();
                lVarV.o(91734264);
                if (state.i().isEmpty()) {
                    aVarE = null;
                } else {
                    aVarE = z2.c.e(-1002550500, true, new d(state, onItemPicked), lVarV, 54);
                }
                lVarV.l();
                boolean zY0 = p013kotlin.text.t.y0(state.c());
                KeyboardOptions keyboardOptions = new KeyboardOptions(o4.x.INSTANCE.e(), false, o4.y.INSTANCE.h(), o4.r.INSTANCE.b(), (o4.i0) null, (Boolean) null, (LocaleList) null, 112, (DefaultConstructorMarker) null);
                lVarV.o(91785474);
                if ((458752 & i13) == 131072) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI = lVarV.I();
                if (!z11 || objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.mc0
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return H0.a(onDoneButtonClicked, (kotlin.y) obj);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                kotlin.z zVar = new kotlin.z((wn0.l) objI, null, null, null, null, null, 62, null);
                lVarV.o(91772703);
                if ((i13 & 7168) == 2048) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI2 = lVarV.I();
                if (!z12 || objI2 == p020r2.l.INSTANCE.a()) {
                    objI2 = new wn0.l() { // from class: com.fourthline.orca.internal.nc0
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return H0.a(onValueChanged, (String) obj);
                        }
                    };
                    lVarV.B(objI2);
                }
                lVarV.l();
                String str5 = str3;
                Vh.a(companion, str5, mhE, state2, strC2, strC4, strC5, onFocusChanged, strC3, interfaceC3903uhH, interfaceC3903uhG, (wn0.l) objI2, aVarE, zY0, keyboardOptions, zVar, strA, strB, lVarV, (i13 & 112) | 6 | ((i13 << 15) & 29360128), 0, 0);
                lVarV = lVarV;
                QA qaJ = state.j();
                lVarV.o(91789583);
                strC = qaJ != null ? RA.c(qaJ, lVarV, 0) : null;
                lVarV.l();
                lVarV.o(91790584);
                if (strC != null) {
                    lVarV.o(91791372);
                    if (strC.length() > 0) {
                        AbstractC3091bh.a((androidx.compose.ui.d) null, strC, 0, 0L, (InterfaceC3903uh) null, lVarV, 0, 29);
                    }
                    lVarV.l();
                    jn0.h0 h0Var = jn0.h0.f84049a;
                }
                lVarV.l();
                lVarV.g();
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                str4 = str5;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.oc0
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return H0.a(state, str4, onFocusChanged, onValueChanged, onItemPicked, onDoneButtonClicked, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        str2 = str;
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            if (lVarV.K(onFocusChanged)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i13 |= i14;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            if (lVarV.K(onValueChanged)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i13 |= i15;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            if (lVarV.K(onItemPicked)) {
                i16 = 16384;
            } else {
                i16 = PKIFailureInfo.certRevoked;
            }
            i13 |= i16;
        }
        if ((i12 & 32) != 0) {
            i13 |= 196608;
        } else if ((i11 & 196608) == 0) {
            if (lVarV.K(onDoneButtonClicked)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i13 |= i17;
        }
        if ((74899 & i13) != 74898) {
            if (i18 != 0) {
                str3 = "";
            } else {
                str3 = str2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1963867052, i13, -1, "com.fourthline.orca.core.internal.composable.base_selector.ItemPicker (BaseSelectorComposables.kt:126)");
            }
            androidx.compose.ui.d.Companion companion4 = androidx.compose.ui.d.INSTANCE;
            d3.c.Companion companion5 = d3.c.INSTANCE;
            z3.i0 i0VarH2 = androidx.compose.foundation.layout.g.h(companion5.o(), false);
            iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC3 = lVarV.c();
            androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(lVarV, companion4);
            b4.g.Companion companion6 = b4.g.INSTANCE;
            aVarA = companion6.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA, i0VarH2, companion6.c());
            p020r2.d4.b(lVarA, xVarC3, companion6.e());
            pVarB = companion6.b();
            if (!lVarA.u()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE3, companion6.d());
            androidx.compose.foundation.layout.i iVar2 = androidx.compose.foundation.layout.i.f4585a;
            z3.i0 i0VarA2 = v1.g.a(v1.b.f117444a.g(), companion5.k(), lVarV, 0);
            iA2 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC4 = lVarV.c();
            androidx.compose.ui.d dVarE4 = androidx.compose.ui.c.e(lVarV, companion4);
            aVarA2 = companion6.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA2);
            } else {
                lVarV.d();
            }
            lVarA2 = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA2, i0VarA2, companion6.c());
            p020r2.d4.b(lVarA2, xVarC4, companion6.e());
            pVarB2 = companion6.b();
            if (!lVarA2.u()) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            } else {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            p020r2.d4.b(lVarA2, dVarE4, companion6.d());
            v1.j jVar2 = v1.j.f117505a;
            Mh mhE2 = state.e();
            Gh state3 = state.getState();
            int i110 = i13 & 14;
            String strA2 = Oh.a(state, lVarV, i110);
            String strB2 = Oh.b(state, lVarV, i110);
            String strC6 = state.c();
            String strC7 = RA.c(state.d(), lVarV, 0);
            InterfaceC3903uh interfaceC3903uhH2 = state.h();
            String strC8 = RA.c(state.a(), lVarV, 0);
            String strC9 = RA.c(state.f(), lVarV, 0);
            InterfaceC3903uh interfaceC3903uhG2 = state.g();
            lVarV.o(91734264);
            if (state.i().isEmpty()) {
                aVarE = z2.c.e(-1002550500, true, new d(state, onItemPicked), lVarV, 54);
            } else {
                aVarE = null;
            }
            lVarV.l();
            boolean zY1 = p013kotlin.text.t.y0(state.c());
            KeyboardOptions keyboardOptions2 = new KeyboardOptions(o4.x.INSTANCE.e(), false, o4.y.INSTANCE.h(), o4.r.INSTANCE.b(), (o4.i0) null, (Boolean) null, (LocaleList) null, 112, (DefaultConstructorMarker) null);
            lVarV.o(91785474);
            if ((458752 & i13) == 131072) {
                z11 = true;
            } else {
                z11 = false;
            }
            objI = lVarV.I();
            if (!z11) {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.mc0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H0.a(onDoneButtonClicked, (kotlin.y) obj);
                    }
                };
                lVarV.B(objI);
            } else {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.mc0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H0.a(onDoneButtonClicked, (kotlin.y) obj);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            kotlin.z zVar2 = new kotlin.z((wn0.l) objI, null, null, null, null, null, 62, null);
            lVarV.o(91772703);
            if ((i13 & 7168) == 2048) {
                z12 = true;
            } else {
                z12 = false;
            }
            objI2 = lVarV.I();
            if (!z12) {
                objI2 = new wn0.l() { // from class: com.fourthline.orca.internal.nc0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H0.a(onValueChanged, (String) obj);
                    }
                };
                lVarV.B(objI2);
            } else {
                objI2 = new wn0.l() { // from class: com.fourthline.orca.internal.nc0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H0.a(onValueChanged, (String) obj);
                    }
                };
                lVarV.B(objI2);
            }
            lVarV.l();
            String str6 = str3;
            Vh.a(companion4, str6, mhE2, state3, strC6, strC8, strC9, onFocusChanged, strC7, interfaceC3903uhH2, interfaceC3903uhG2, (wn0.l) objI2, aVarE, zY1, keyboardOptions2, zVar2, strA2, strB2, lVarV, (i13 & 112) | 6 | ((i13 << 15) & 29360128), 0, 0);
            lVarV = lVarV;
            QA qaJ2 = state.j();
            lVarV.o(91789583);
            strC = qaJ2 != null ? RA.c(qaJ2, lVarV, 0) : null;
            lVarV.l();
            lVarV.o(91790584);
            if (strC != null) {
                lVarV.o(91791372);
                if (strC.length() > 0) {
                    AbstractC3091bh.a((androidx.compose.ui.d) null, strC, 0, 0L, (InterfaceC3903uh) null, lVarV, 0, 29);
                }
                lVarV.l();
                jn0.h0 h0Var2 = jn0.h0.f84049a;
            }
            lVarV.l();
            lVarV.g();
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            str4 = str6;
        } else {
            if (i18 != 0) {
                str3 = "";
            } else {
                str3 = str2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1963867052, i13, -1, "com.fourthline.orca.core.internal.composable.base_selector.ItemPicker (BaseSelectorComposables.kt:126)");
            }
            androidx.compose.ui.d.Companion companion7 = androidx.compose.ui.d.INSTANCE;
            d3.c.Companion companion8 = d3.c.INSTANCE;
            z3.i0 i0VarH3 = androidx.compose.foundation.layout.g.h(companion8.o(), false);
            iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC5 = lVarV.c();
            androidx.compose.ui.d dVarE5 = androidx.compose.ui.c.e(lVarV, companion7);
            b4.g.Companion companion9 = b4.g.INSTANCE;
            aVarA = companion9.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA, i0VarH3, companion9.c());
            p020r2.d4.b(lVarA, xVarC5, companion9.e());
            pVarB = companion9.b();
            if (!lVarA.u()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE5, companion9.d());
            androidx.compose.foundation.layout.i iVar3 = androidx.compose.foundation.layout.i.f4585a;
            z3.i0 i0VarA3 = v1.g.a(v1.b.f117444a.g(), companion8.k(), lVarV, 0);
            iA2 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC6 = lVarV.c();
            androidx.compose.ui.d dVarE6 = androidx.compose.ui.c.e(lVarV, companion7);
            aVarA2 = companion9.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA2);
            } else {
                lVarV.d();
            }
            lVarA2 = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA2, i0VarA3, companion9.c());
            p020r2.d4.b(lVarA2, xVarC6, companion9.e());
            pVarB2 = companion9.b();
            if (!lVarA2.u()) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            } else {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            p020r2.d4.b(lVarA2, dVarE6, companion9.d());
            v1.j jVar3 = v1.j.f117505a;
            Mh mhE3 = state.e();
            Gh state4 = state.getState();
            int i111 = i13 & 14;
            String strA3 = Oh.a(state, lVarV, i111);
            String strB3 = Oh.b(state, lVarV, i111);
            String strC10 = state.c();
            String strC11 = RA.c(state.d(), lVarV, 0);
            InterfaceC3903uh interfaceC3903uhH3 = state.h();
            String strC12 = RA.c(state.a(), lVarV, 0);
            String strC13 = RA.c(state.f(), lVarV, 0);
            InterfaceC3903uh interfaceC3903uhG3 = state.g();
            lVarV.o(91734264);
            if (state.i().isEmpty()) {
                aVarE = z2.c.e(-1002550500, true, new d(state, onItemPicked), lVarV, 54);
            } else {
                aVarE = null;
            }
            lVarV.l();
            boolean zY2 = p013kotlin.text.t.y0(state.c());
            KeyboardOptions keyboardOptions3 = new KeyboardOptions(o4.x.INSTANCE.e(), false, o4.y.INSTANCE.h(), o4.r.INSTANCE.b(), (o4.i0) null, (Boolean) null, (LocaleList) null, 112, (DefaultConstructorMarker) null);
            lVarV.o(91785474);
            if ((458752 & i13) == 131072) {
                z11 = true;
            } else {
                z11 = false;
            }
            objI = lVarV.I();
            if (!z11) {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.mc0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H0.a(onDoneButtonClicked, (kotlin.y) obj);
                    }
                };
                lVarV.B(objI);
            } else {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.mc0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H0.a(onDoneButtonClicked, (kotlin.y) obj);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            kotlin.z zVar3 = new kotlin.z((wn0.l) objI, null, null, null, null, null, 62, null);
            lVarV.o(91772703);
            if ((i13 & 7168) == 2048) {
                z12 = true;
            } else {
                z12 = false;
            }
            objI2 = lVarV.I();
            if (!z12) {
                objI2 = new wn0.l() { // from class: com.fourthline.orca.internal.nc0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H0.a(onValueChanged, (String) obj);
                    }
                };
                lVarV.B(objI2);
            } else {
                objI2 = new wn0.l() { // from class: com.fourthline.orca.internal.nc0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H0.a(onValueChanged, (String) obj);
                    }
                };
                lVarV.B(objI2);
            }
            lVarV.l();
            String str7 = str3;
            Vh.a(companion7, str7, mhE3, state4, strC10, strC12, strC13, onFocusChanged, strC11, interfaceC3903uhH3, interfaceC3903uhG3, (wn0.l) objI2, aVarE, zY2, keyboardOptions3, zVar3, strA3, strB3, lVarV, (i13 & 112) | 6 | ((i13 << 15) & 29360128), 0, 0);
            lVarV = lVarV;
            QA qaJ3 = state.j();
            lVarV.o(91789583);
            strC = qaJ3 != null ? RA.c(qaJ3, lVarV, 0) : null;
            lVarV.l();
            lVarV.o(91790584);
            if (strC != null) {
                lVarV.o(91791372);
                if (strC.length() > 0) {
                    AbstractC3091bh.a((androidx.compose.ui.d) null, strC, 0, 0L, (InterfaceC3903uh) null, lVarV, 0, 29);
                }
                lVarV.l();
                jn0.h0 h0Var3 = jn0.h0.f84049a;
            }
            lVarV.l();
            lVarV.g();
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            str4 = str7;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.oc0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return H0.a(state, str4, onFocusChanged, onValueChanged, onItemPicked, onDoneButtonClicked, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar, String it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        lVar.invoke(it);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.a aVar, kotlin.y KeyboardActions) {
        p013kotlin.jvm.internal.s.k(KeyboardActions, "$this$KeyboardActions");
        aVar.invoke();
        return jn0.h0.f84049a;
    }

    public static final void a(final wn0.a suggestions, p020r2.l lVar, final int i11) {
        p013kotlin.jvm.internal.s.k(suggestions, "suggestions");
        p020r2.l lVarV = lVar.v(298248927);
        int i12 = (i11 & 6) == 0 ? (lVarV.K(suggestions) ? 4 : 2) | i11 : i11;
        if ((i12 & 3) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(298248927, i12, -1, "com.fourthline.orca.core.internal.composable.base_selector.Suggestions (BaseSelectorComposables.kt:195)");
            }
            float fO1 = ((w4.d) lVarV.U(androidx.compose.ui.platform.z0.g())).O1(w4.h.g(2));
            lVarV.o(1735082774);
            w4.d dVar = (w4.d) lVarV.U(androidx.compose.ui.platform.z0.g());
            C3825sp c3825sp = C3825sp.f35377a;
            float fO2 = dVar.O1(c3825sp.c(lVarV, 6).b());
            lVarV.l();
            androidx.compose.ui.d dVarA = AbstractC3307gk.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, w4.h.g(0), BitmapDescriptorFactory.HUE_RED, w4.h.g(4), 5, null), BitmapDescriptorFactory.HUE_RED, 1, null), AbstractC3611np.b(c3825sp.a(lVarV, 6)).a(lVarV, 0), AbstractC3611np.b(c3825sp.a(lVarV, 6)).a(lVarV, 0), c3825sp.b(lVarV, 6).getInput().getDefault().getBackground().a(lVarV, 0), fO1, fO2, w4.h.g(10), (64 & 64) != 0 ? w4.h.g(5.0f) : BitmapDescriptorFactory.HUE_RED);
            z3.i0 i0VarA = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVarA);
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA, i0VarA, companion.c());
            p020r2.d4.b(lVarA, xVarC, companion.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB = companion.b();
            if (lVarA.u() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE, companion.d());
            v1.j jVar = v1.j.f117505a;
            lVarV.o(-43060351);
            int i13 = 0;
            for (Object obj : (Iterable) suggestions.invoke()) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    p013kotlin.collections.v.x();
                }
                ((wn0.q) obj).invoke(Integer.valueOf(i13), lVarV, 0);
                i13 = i14;
            }
            lVarV.l();
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.pc0
                @Override // wn0.p
                public final Object invoke(Object obj2, Object obj3) {
                    return H0.a(suggestions, i11, (p020r2.l) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x0105  */
    /* JADX WARN: Code duplicated, block: B:73:0x0111  */
    /* JADX WARN: Code duplicated, block: B:74:0x0115  */
    /* JADX WARN: Code duplicated, block: B:79:0x0142  */
    /* JADX WARN: Code duplicated, block: B:82:0x0173  */
    public static final void a(androidx.compose.ui.d dVar, final String text, String str, final wn0.a onClick, p020r2.l lVar, final int i11, final int i12) {
        int i13;
        String str2;
        String str3;
        int iA;
        wn0.a<b4.g> aVarA;
        p020r2.l lVarA;
        wn0.p<b4.g, Integer, jn0.h0> pVarB;
        final String str4;
        p013kotlin.jvm.internal.s.k(text, "text");
        p013kotlin.jvm.internal.s.k(onClick, "onClick");
        p020r2.l lVarV = lVar.v(803043668);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.n(dVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= lVarV.n(text) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            if ((i12 & 4) == 0) {
                str2 = str;
                int i15 = lVarV.n(str2) ? 256 : 128;
                i13 |= i15;
            } else {
                str2 = str;
            }
            i13 |= i15;
        } else {
            str2 = str;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= lVarV.K(onClick) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && lVarV.b()) {
            lVarV.j();
            str4 = str2;
        } else {
            lVarV.L();
            if ((i11 & 1) != 0 && !lVarV.k()) {
                lVarV.j();
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                }
            } else {
                if (i14 != 0) {
                    dVar = androidx.compose.ui.d.INSTANCE;
                }
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                    str3 = text;
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(803043668, i13, -1, "com.fourthline.orca.core.internal.composable.base_selector.SuggestionItem (BaseSelectorComposables.kt:223)");
                }
                androidx.compose.ui.d dVarB = androidx.compose.foundation.layout.x.b(AbstractC3307gk.a(androidx.compose.foundation.layout.x.h(dVar, BitmapDescriptorFactory.HUE_RED, 1, null), false, (String) null, (g4.i) null, onClick, 7, (Object) null), BitmapDescriptorFactory.HUE_RED, Ko.f26627a.a(), 1, null);
                z3.i0 i0VarB = v1.e0.b(v1.b.f117444a.f(), d3.c.INSTANCE.i(), lVarV, 48);
                iA = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC = lVarV.c();
                androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVarB);
                b4.g.Companion companion = b4.g.INSTANCE;
                aVarA = companion.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.u()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA, i0VarB, companion.c());
                p020r2.d4.b(lVarA, xVarC, companion.e());
                pVarB = companion.b();
                if (!lVarA.u() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                p020r2.d4.b(lVarA, dVarE, companion.d());
                v1.h0 h0Var = v1.h0.f117504a;
                Ls.a(false, z2.c.e(2133626358, true, new e(str3, text), lVarV, 54), lVarV, 48, 1);
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                str4 = str3;
            }
            str3 = str2;
            lVarV.C();
            if (p020r2.o.J()) {
                p020r2.o.S(803043668, i13, -1, "com.fourthline.orca.core.internal.composable.base_selector.SuggestionItem (BaseSelectorComposables.kt:223)");
            }
            androidx.compose.ui.d dVarB2 = androidx.compose.foundation.layout.x.b(AbstractC3307gk.a(androidx.compose.foundation.layout.x.h(dVar, BitmapDescriptorFactory.HUE_RED, 1, null), false, (String) null, (g4.i) null, onClick, 7, (Object) null), BitmapDescriptorFactory.HUE_RED, Ko.f26627a.a(), 1, null);
            z3.i0 i0VarB2 = v1.e0.b(v1.b.f117444a.f(), d3.c.INSTANCE.i(), lVarV, 48);
            iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC2 = lVarV.c();
            androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(lVarV, dVarB2);
            b4.g.Companion companion2 = b4.g.INSTANCE;
            aVarA = companion2.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA, i0VarB2, companion2.c());
            p020r2.d4.b(lVarA, xVarC2, companion2.e());
            pVarB = companion2.b();
            if (!lVarA.u()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE2, companion2.d());
            v1.h0 h0Var2 = v1.h0.f117504a;
            Ls.a(false, z2.c.e(2133626358, true, new e(str3, text), lVarV, 54), lVarV, 48, 1);
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            str4 = str3;
        }
        final androidx.compose.ui.d dVar2 = dVar;
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.hc0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return H0.a(dVar2, text, str4, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
