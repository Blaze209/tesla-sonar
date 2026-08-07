package com.fourthline.orca.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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

/* JADX INFO: loaded from: classes4.dex */
public abstract class Mj {

    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.l f26933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Flow f26934c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f.h f26935d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f.h f26936e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Lazy f26937f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Lazy f26938g;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Mj$a$a, reason: collision with other inner class name */
        static final class C0503a extends SuspendLambda implements wn0.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f26939a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f26940b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ f.h f26941c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ f.h f26942d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Lazy f26943e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Lazy f26944f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0503a(f.h hVar, f.h hVar2, Lazy lazy, Lazy lazy2, Continuation continuation) {
                super(2, continuation);
                this.f26941c = hVar;
                this.f26942d = hVar2;
                this.f26943e = lazy;
                this.f26944f = lazy2;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Hj hj2, Continuation continuation) {
                return ((C0503a) create(hj2, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0503a c0503a = new C0503a(this.f26941c, this.f26942d, this.f26943e, this.f26944f, continuation);
                c0503a.f26940b = obj;
                return c0503a;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f26939a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                Hj hj2 = (Hj) this.f26940b;
                if (!(hj2 instanceof Hj.a)) {
                    if (hj2 instanceof Hj.c) {
                        this.f26941c.b(Mj.b(this.f26943e));
                    } else {
                        if (!(hj2 instanceof Hj.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f26942d.b(Mj.a(this.f26944f));
                    }
                }
                return jn0.h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(wn0.l lVar, Flow flow, f.h hVar, f.h hVar2, Lazy lazy, Lazy lazy2, Continuation continuation) {
            super(2, continuation);
            this.f26933b = lVar;
            this.f26934c = flow;
            this.f26935d = hVar;
            this.f26936e = hVar2;
            this.f26937f = lazy;
            this.f26938g = lazy2;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f26933b, this.f26934c, this.f26935d, this.f26936e, this.f26937f, this.f26938g, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f26932a;
            if (i11 == 0) {
                jn0.t.b(obj);
                this.f26933b.invoke(Ij.f.f26324a);
                Flow flow = this.f26934c;
                if (flow != null) {
                    C0503a c0503a = new C0503a(this.f26935d, this.f26936e, this.f26937f, this.f26938g, null);
                    this.f26932a = 1;
                    if (AbstractC3989wg.a(flow, c0503a, this) == coroutine_suspended) {
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

    public static final class b implements p020r2.k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ wn0.l f26945a;

        public b(wn0.l lVar) {
            this.f26945a = lVar;
        }

        @Override // p020r2.k0
        public void dispose() {
            this.f26945a.invoke(Ij.e.f26323a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(Kj kj2, Flow flow, wn0.l lVar, int i11, p020r2.l lVar2, int i12) {
        a(kj2, flow, lVar, lVar2, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    public static final void a(final Kj state, final Flow flow, final wn0.l onEventSent, p020r2.l lVar, final int i11) {
        int i12;
        Object aVar;
        jn0.h0 h0Var;
        p020r2.l lVar2;
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(onEventSent, "onEventSent");
        p020r2.l lVarV = lVar.v(-1127200955);
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
        if ((i12 & 147) == 146 && lVarV.b()) {
            lVarV.j();
            lVar2 = lVarV;
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-1127200955, i12, -1, "com.fourthline.orca.kyc.internal.flow.location.scanner.LocationScannerScreen (LocationScannerScreen.kt:39)");
            }
            final Context context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
            lVarV.o(-715810783);
            boolean zK = lVarV.K(context);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.bj0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Mj.a(context);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            Lazy lazyB = jn0.m.b((wn0.a) objI);
            lVarV.o(-715804604);
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objI2 = lVarV.I();
            if (z11 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new wn0.a() { // from class: com.fourthline.orca.internal.cj0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Mj.a(onEventSent);
                    }
                };
                lVarV.B(objI2);
            }
            lVarV.l();
            f.d.a(false, (wn0.a) objI2, lVarV, 0, 1);
            ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult = new ActivityResultContracts$StartActivityForResult();
            lVarV.o(-715798451);
            boolean z12 = i13 == 256;
            Object objI3 = lVarV.I();
            if (z12 || objI3 == p020r2.l.INSTANCE.a()) {
                objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.dj0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return Mj.b(onEventSent, (h.a) obj);
                    }
                };
                lVarV.B(objI3);
            }
            lVarV.l();
            f.h hVarA = f.c.a(activityResultContracts$StartActivityForResult, (wn0.l) objI3, lVarV, 0);
            lVarV.o(-715795082);
            Object objI4 = lVarV.I();
            p020r2.l.Companion companion = p020r2.l.INSTANCE;
            if (objI4 == companion.a()) {
                objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.ej0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Mj.a();
                    }
                };
                lVarV.B(objI4);
            }
            lVarV.l();
            Lazy lazyB2 = jn0.m.b((wn0.a) objI4);
            ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult2 = new ActivityResultContracts$StartActivityForResult();
            lVarV.o(-715787181);
            boolean z13 = i13 == 256;
            Object objI5 = lVarV.I();
            if (z13 || objI5 == companion.a()) {
                objI5 = new wn0.l() { // from class: com.fourthline.orca.internal.fj0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return Mj.a(onEventSent, (h.a) obj);
                    }
                };
                lVarV.B(objI5);
            }
            lVarV.l();
            f.h hVarA2 = f.c.a(activityResultContracts$StartActivityForResult2, (wn0.l) objI5, lVarV, 0);
            jn0.h0 h0Var2 = jn0.h0.f84049a;
            lVarV.o(-715783744);
            boolean zK2 = (i13 == 256) | lVarV.K(flow) | lVarV.K(hVarA) | lVarV.K(lazyB) | lVarV.K(hVarA2) | lVarV.K(lazyB2);
            Object objI6 = lVarV.I();
            if (zK2 || objI6 == companion.a()) {
                h0Var = h0Var2;
                aVar = new a(onEventSent, flow, hVarA, hVarA2, lazyB, lazyB2, null);
                lVarV.B(aVar);
            } else {
                h0Var = h0Var2;
                aVar = objI6;
            }
            lVarV.l();
            Function0.g(h0Var, (wn0.p) aVar, lVarV, 6);
            lVarV.o(-715769276);
            boolean z14 = i13 == 256;
            Object objI7 = lVarV.I();
            if (z14 || objI7 == companion.a()) {
                objI7 = new wn0.l() { // from class: com.fourthline.orca.internal.gj0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return Mj.a(onEventSent, (p020r2.l0) obj);
                    }
                };
                lVarV.B(objI7);
            }
            lVarV.l();
            Function0.c(h0Var, (wn0.l) objI7, lVarV, 6);
            String strC = RA.c(state.a(), lVarV, 0);
            String strC2 = RA.c(state.b(), lVarV, 0);
            Yj yjP = state.p();
            InterfaceC3777rk.b bVarQ = state.q();
            lVarV.o(1024894967);
            boolean z15 = i13 == 256;
            Object objI8 = lVarV.I();
            if (z15 || objI8 == companion.a()) {
                objI8 = new wn0.l() { // from class: com.fourthline.orca.internal.hj0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return Mj.a(onEventSent, (InterfaceC3807sD) obj);
                    }
                };
                lVarV.B(objI8);
            }
            lVarV.l();
            C3735qk c3735qk = new C3735qk(bVarQ, (wn0.l) objI8);
            InterfaceC3777rk.a aVarR = state.r();
            lVarV.o(1024901399);
            boolean z16 = i13 == 256;
            Object objI9 = lVarV.I();
            if (z16 || objI9 == companion.a()) {
                objI9 = new wn0.l() { // from class: com.fourthline.orca.internal.ij0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return Mj.b(onEventSent, (InterfaceC3807sD) obj);
                    }
                };
                lVarV.B(objI9);
            }
            lVarV.l();
            lVar2 = lVarV;
            AbstractC3818si.a("location_scan", strC, strC2, null, null, new C3820sk(c3735qk, new C3735qk(aVarR, (wn0.l) objI9), false, 4, null), yjP, 0, false, lVar2, 6, 408);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.jj0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Mj.a(state, flow, onEventSent, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent b(Lazy lazy) {
        return (Intent) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(wn0.l lVar, h.a it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        lVar.invoke(Ij.c.f26321a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(wn0.l lVar, InterfaceC3807sD it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        lVar.invoke(Ij.a.f26319a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent a(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar) {
        lVar.invoke(Ij.a.f26319a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent a(Lazy lazy) {
        return (Intent) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent a() {
        Intent intent = new Intent();
        intent.setAction("android.settings.LOCATION_SOURCE_SETTINGS");
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar, h.a it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        lVar.invoke(Ij.b.f26320a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar, InterfaceC3807sD it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        lVar.invoke(Ij.d.f26322a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p020r2.k0 a(wn0.l lVar, p020r2.l0 DisposableEffect) {
        p013kotlin.jvm.internal.s.k(DisposableEffect, "$this$DisposableEffect");
        return new b(lVar);
    }
}
