package com.fourthline.orca.internal;

import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p002activity.result.contract.ActivityResultContracts$StartActivityForResult;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Lazy;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.Function0;

/* JADX INFO: renamed from: com.fourthline.orca.internal.re, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3771re {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.re$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f35054b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f35055c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f.h f35056d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Lazy f35057e;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.re$a$a, reason: collision with other inner class name */
        static final class C0607a extends SuspendLambda implements wn0.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f35058a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f35059b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f35060c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ f.h f35061d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Lazy f35062e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0607a(Context context, f.h hVar, Lazy lazy, Continuation continuation) {
                super(2, continuation);
                this.f35060c = context;
                this.f35061d = hVar;
                this.f35062e = lazy;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(An an2, Continuation continuation) {
                return ((C0607a) create(an2, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0607a c0607a = new C0607a(this.f35060c, this.f35061d, this.f35062e, continuation);
                c0607a.f35059b = obj;
                return c0607a;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f35058a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                An an2 = (An) this.f35059b;
                if (!(an2 instanceof An.a) && !(an2 instanceof An.b) && !(an2 instanceof An.c)) {
                    if (an2 instanceof An.e) {
                        AbstractC3972w5.a(this.f35060c, 0L, 1, null);
                    } else {
                        if (!(an2 instanceof An.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f35061d.b(AbstractC3771re.a(this.f35062e));
                    }
                }
                return jn0.h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Flow flow, Context context, f.h hVar, Lazy lazy, Continuation continuation) {
            super(2, continuation);
            this.f35054b = flow;
            this.f35055c = context;
            this.f35056d = hVar;
            this.f35057e = lazy;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f35054b, this.f35055c, this.f35056d, this.f35057e, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f35053a;
            if (i11 == 0) {
                jn0.t.b(obj);
                Flow flow = this.f35054b;
                if (flow != null) {
                    C0607a c0607a = new C0607a(this.f35055c, this.f35056d, this.f35057e, null);
                    this.f35053a = 1;
                    if (AbstractC3989wg.a(flow, c0607a, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.fourthline.orca.internal.re$b */
    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.l f35064b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(wn0.l lVar, Continuation continuation) {
            super(2, continuation);
            this.f35064b = lVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f35064b, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f35063a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            this.f35064b.invoke(Bn.d.f25104a);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.re$c */
    public static final class c implements p020r2.k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ wn0.l f35065a;

        public c(wn0.l lVar) {
            this.f35065a = lVar;
        }

        @Override // p020r2.k0
        public void dispose() {
            this.f35065a.invoke(Bn.c.f25103a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(En en2, Flow flow, wn0.l lVar, int i11, p020r2.l lVar2, int i12) {
        a(en2, flow, lVar, lVar2, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    public static final void a(final En state, final Flow flow, final wn0.l onEventSent, p020r2.l lVar, final int i11) {
        int i12;
        Object aVar;
        jn0.h0 h0Var;
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(onEventSent, "onEventSent");
        p020r2.l lVarV = lVar.v(1009449830);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? lVarV.n(state) : lVarV.K(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(flow) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= lVarV.K(onEventSent) ? 256 : 128;
        }
        int i13 = i12;
        if ((i13 & 147) == 146 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(1009449830, i13, -1, "com.fourthline.orca.kyc.internal.flow.eid.scanner.EidScannerScreen (EidScannerScreen.kt:29)");
            }
            Context context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
            lVarV.o(1570506546);
            Object objI = lVarV.I();
            p020r2.l.Companion companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.bb1
                    @Override // wn0.a
                    public final Object invoke() {
                        return AbstractC3771re.a();
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            Lazy lazyB = jn0.m.b((wn0.a) objI);
            ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult = new ActivityResultContracts$StartActivityForResult();
            lVarV.o(1570511935);
            int i14 = i13 & 896;
            boolean z11 = i14 == 256;
            Object objI2 = lVarV.I();
            if (z11 || objI2 == companion.a()) {
                objI2 = new wn0.l() { // from class: com.fourthline.orca.internal.cb1
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3771re.a(onEventSent, (h.a) obj);
                    }
                };
                lVarV.B(objI2);
            }
            lVarV.l();
            f.h hVarA = f.c.a(activityResultContracts$StartActivityForResult, (wn0.l) objI2, lVarV, 0);
            jn0.h0 h0Var2 = jn0.h0.f84049a;
            lVarV.o(1570514842);
            boolean zK = lVarV.K(flow) | lVarV.K(context) | lVarV.K(hVarA) | lVarV.K(lazyB);
            Object objI3 = lVarV.I();
            if (zK || objI3 == companion.a()) {
                h0Var = h0Var2;
                aVar = new a(flow, context, hVarA, lazyB, null);
                lVarV.B(aVar);
            } else {
                h0Var = h0Var2;
                aVar = objI3;
            }
            lVarV.l();
            Function0.g(h0Var, (wn0.p) aVar, lVarV, 6);
            lVarV.o(1570528256);
            boolean z12 = i14 == 256;
            Object objI4 = lVarV.I();
            if (z12 || objI4 == companion.a()) {
                objI4 = new wn0.l() { // from class: com.fourthline.orca.internal.db1
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3771re.a(onEventSent, (p020r2.l0) obj);
                    }
                };
                lVarV.B(objI4);
            }
            lVarV.l();
            Function0.c(h0Var, (wn0.l) objI4, lVarV, 6);
            lVarV.o(1570531547);
            boolean z13 = i14 == 256;
            Object objI5 = lVarV.I();
            if (z13 || objI5 == companion.a()) {
                objI5 = new wn0.a() { // from class: com.fourthline.orca.internal.eb1
                    @Override // wn0.a
                    public final Object invoke() {
                        return AbstractC3771re.a(onEventSent);
                    }
                };
                lVarV.B(objI5);
            }
            lVarV.l();
            f.d.a(false, (wn0.a) objI5, lVarV, 0, 1);
            In.b(state, onEventSent, lVarV, (i13 & 14) | ((i13 >> 3) & 112));
            AbstractC3480kn.a(lVarV, 0);
            lVarV.o(1570537274);
            boolean z14 = i14 == 256;
            Object objI6 = lVarV.I();
            if (z14 || objI6 == companion.a()) {
                objI6 = new b(onEventSent, null);
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
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.fb1
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3771re.a(state, flow, onEventSent, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent a() {
        return new Intent("android.settings.NFC_SETTINGS");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent a(Lazy lazy) {
        return (Intent) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar, h.a it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        lVar.invoke(Bn.a.f25101a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar) {
        lVar.invoke(Bn.b.f25102a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p020r2.k0 a(wn0.l lVar, p020r2.l0 DisposableEffect) {
        p013kotlin.jvm.internal.s.k(DisposableEffect, "$this$DisposableEffect");
        return new c(lVar);
    }
}
