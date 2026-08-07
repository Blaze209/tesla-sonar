package com.stripe.android.payments.core.authentication.threeds2;

import a70.Unvalidated;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import androidx.p002activity.ComponentActivity;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.e1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import androidx.p003lifecycle.x;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity;
import com.stripe.android.stripe3ds2.transaction.ChallengeContract;
import com.stripe.android.stripe3ds2.transaction.h;
import com.stripe.android.stripe3ds2.views.ChallengeViewArgs;
import com.stripe.android.stripe3ds2.views.k;
import jn0.h0;
import jn0.m;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010#\u001a\u00020\u001b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006&²\u0006\f\u0010%\u001a\u00020$8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "La70/c;", "paymentFlowResult", "Ljn0/h0;", "r", "(La70/c;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lh40/a;", "f", "Lkotlin/Lazy;", "t", "()Lh40/a;", "viewBinding", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$a;", "g", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$a;", "s", "()Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$a;", "y", "(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$a;)V", "args", "Landroidx/lifecycle/ViewModelProvider$Factory;", "h", "Landroidx/lifecycle/ViewModelProvider$Factory;", "u", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory$payments_core_release", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "getViewModelFactory$payments_core_release$annotations", "viewModelFactory", "Lcom/stripe/android/payments/core/authentication/threeds2/d;", "viewModel", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Stripe3ds2TransactionActivity extends androidx.appcompat.app.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public Stripe3ds2TransactionContract.Args args;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewBinding = m.b(new f());

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private ViewModelProvider.Factory viewModelFactory = new com.stripe.android.payments.core.authentication.threeds2.e(new g());

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/ViewModelStore;", "b", "()Landroidx/lifecycle/ViewModelStore;"}, k = 3, mv = {1, 9, 0})
    public static final class a extends u implements wn0.a<ViewModelStore> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f52073c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComponentActivity componentActivity) {
            super(0);
            this.f52073c = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return this.f52073c.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "b", "()Landroidx/lifecycle/viewmodel/CreationExtras;"}, k = 3, mv = {1, 9, 0})
    public static final class b extends u implements wn0.a<CreationExtras> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a f52074c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f52075d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wn0.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f52074c = aVar;
            this.f52075d = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            wn0.a aVar = this.f52074c;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f52075d.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$onCreate$3", f = "Stripe3ds2TransactionActivity.kt", i = {}, l = {103, 107}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52076n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ ActivityResultLauncher<ChallengeViewArgs> f52078p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ l<h, Job> f52079q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ ActivityResultLauncher<PaymentBrowserAuthContract.Args> f52080r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Lazy<com.stripe.android.payments.core.authentication.threeds2.d> f52081s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ActivityResultLauncher<ChallengeViewArgs> activityResultLauncher, l<? super h, ? extends Job> lVar, ActivityResultLauncher<PaymentBrowserAuthContract.Args> activityResultLauncher2, Lazy<com.stripe.android.payments.core.authentication.threeds2.d> lazy, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f52078p = activityResultLauncher;
            this.f52079q = lVar;
            this.f52080r = activityResultLauncher2;
            this.f52081s = lazy;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return Stripe3ds2TransactionActivity.this.new c(this.f52078p, this.f52079q, this.f52080r, this.f52081s, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
        
            if (r5 == r0) goto L19;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.f52076n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r5)
                goto L53
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                jn0.t.b(r5)
                goto L38
            L1e:
                jn0.t.b(r5)
                com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity r5 = com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity.this
                boolean r5 = r5.isFinishing()
                if (r5 != 0) goto L94
                kotlin.Lazy<com.stripe.android.payments.core.authentication.threeds2.d> r5 = r4.f52081s
                com.stripe.android.payments.core.authentication.threeds2.d r5 = com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity.q(r5)
                r4.f52076n = r3
                java.lang.Object r5 = r5.p(r4)
                if (r5 != r0) goto L38
                goto L52
            L38:
                com.stripe.android.payments.core.authentication.threeds2.a r5 = (com.stripe.android.payments.core.authentication.threeds2.a) r5
                boolean r1 = r5 instanceof com.stripe.android.payments.core.authentication.threeds2.a.StartChallenge
                if (r1 == 0) goto L75
                kotlin.Lazy<com.stripe.android.payments.core.authentication.threeds2.d> r1 = r4.f52081s
                com.stripe.android.payments.core.authentication.threeds2.d r1 = com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity.q(r1)
                com.stripe.android.payments.core.authentication.threeds2.a$b r5 = (com.stripe.android.payments.core.authentication.threeds2.a.StartChallenge) r5
                t80.m r5 = r5.getArgs()
                r4.f52076n = r2
                java.lang.Object r5 = r1.k(r5, r4)
                if (r5 != r0) goto L53
            L52:
                return r0
            L53:
                com.stripe.android.stripe3ds2.transaction.m r5 = (com.stripe.android.stripe3ds2.transaction.m) r5
                boolean r0 = r5 instanceof com.stripe.android.stripe3ds2.transaction.m.Start
                if (r0 == 0) goto L65
                androidx.activity.result.ActivityResultLauncher<com.stripe.android.stripe3ds2.views.m> r0 = r4.f52078p
                com.stripe.android.stripe3ds2.transaction.m$c r5 = (com.stripe.android.stripe3ds2.transaction.m.Start) r5
                com.stripe.android.stripe3ds2.views.m r5 = r5.getChallengeViewArgs()
                r0.b(r5)
                goto L94
            L65:
                boolean r0 = r5 instanceof com.stripe.android.stripe3ds2.transaction.m.End
                if (r0 == 0) goto L94
                wn0.l<com.stripe.android.stripe3ds2.transaction.h, kotlinx.coroutines.Job> r0 = r4.f52079q
                com.stripe.android.stripe3ds2.transaction.m$b r5 = (com.stripe.android.stripe3ds2.transaction.m.End) r5
                com.stripe.android.stripe3ds2.transaction.h r5 = r5.getChallengeResult()
                r0.invoke(r5)
                goto L94
            L75:
                boolean r0 = r5 instanceof com.stripe.android.payments.core.authentication.threeds2.a.StartFallback
                if (r0 == 0) goto L85
                androidx.activity.result.ActivityResultLauncher<com.stripe.android.auth.PaymentBrowserAuthContract$a> r0 = r4.f52080r
                com.stripe.android.payments.core.authentication.threeds2.a$c r5 = (com.stripe.android.payments.core.authentication.threeds2.a.StartFallback) r5
                com.stripe.android.auth.PaymentBrowserAuthContract$a r5 = r5.getArgs()
                r0.b(r5)
                goto L94
            L85:
                boolean r0 = r5 instanceof com.stripe.android.payments.core.authentication.threeds2.a.Complete
                if (r0 == 0) goto L94
                com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity r0 = com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity.this
                com.stripe.android.payments.core.authentication.threeds2.a$a r5 = (com.stripe.android.payments.core.authentication.threeds2.a.Complete) r5
                a70.c r5 = r5.getResult()
                com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity.p(r0, r5)
            L94:
                jn0.h0 r5 = jn0.h0.f84049a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/h;", "challengeResult", "Lkotlinx/coroutines/Job;", "a", "(Lcom/stripe/android/stripe3ds2/transaction/h;)Lkotlinx/coroutines/Job;"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements l<h, Job> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Lazy<com.stripe.android.payments.core.authentication.threeds2.d> f52083d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$onCreate$onChallengeResult$1$1", f = "Stripe3ds2TransactionActivity.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f52084n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            int f52085o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ Stripe3ds2TransactionActivity f52086p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ h f52087q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Lazy<com.stripe.android.payments.core.authentication.threeds2.d> f52088r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Stripe3ds2TransactionActivity stripe3ds2TransactionActivity, h hVar, Lazy<com.stripe.android.payments.core.authentication.threeds2.d> lazy, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f52086p = stripe3ds2TransactionActivity;
                this.f52087q = hVar;
                this.f52088r = lazy;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f52086p, this.f52087q, this.f52088r, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Stripe3ds2TransactionActivity stripe3ds2TransactionActivity;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f52085o;
                if (i11 == 0) {
                    t.b(obj);
                    Stripe3ds2TransactionActivity stripe3ds2TransactionActivity2 = this.f52086p;
                    com.stripe.android.payments.core.authentication.threeds2.d dVarV = Stripe3ds2TransactionActivity.v(this.f52088r);
                    h hVar = this.f52087q;
                    this.f52084n = stripe3ds2TransactionActivity2;
                    this.f52085o = 1;
                    Object objO = dVarV.o(hVar, this);
                    if (objO == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    stripe3ds2TransactionActivity = stripe3ds2TransactionActivity2;
                    obj = objO;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    stripe3ds2TransactionActivity = (Stripe3ds2TransactionActivity) this.f52084n;
                    t.b(obj);
                }
                stripe3ds2TransactionActivity.r((Unvalidated) obj);
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Lazy<com.stripe.android.payments.core.authentication.threeds2.d> lazy) {
            super(1);
            this.f52083d = lazy;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Job invoke(h challengeResult) {
            s.k(challengeResult, "challengeResult");
            return BuildersKt__Builders_commonKt.launch$default(x.a(Stripe3ds2TransactionActivity.this), null, null, new a(Stripe3ds2TransactionActivity.this, challengeResult, this.f52083d, null), 3, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "b", "()Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements wn0.a<ViewModelProvider.Factory> {
        e() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            return Stripe3ds2TransactionActivity.this.getViewModelFactory();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh40/a;", "b", "()Lh40/a;"}, k = 3, mv = {1, 9, 0})
    static final class f extends u implements wn0.a<h40.a> {
        f() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h40.a invoke() {
            h40.a aVarC = h40.a.c(Stripe3ds2TransactionActivity.this.getLayoutInflater());
            s.j(aVarC, "inflate(...)");
            return aVarC;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$a;", "b", "()Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$a;"}, k = 3, mv = {1, 9, 0})
    static final class g extends u implements wn0.a<Stripe3ds2TransactionContract.Args> {
        g() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Stripe3ds2TransactionContract.Args invoke() {
            return Stripe3ds2TransactionActivity.this.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(Unvalidated paymentFlowResult) {
        setResult(-1, new Intent().putExtras(paymentFlowResult.i()));
        finish();
    }

    private final h40.a t() {
        return (h40.a) this.viewBinding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.stripe.android.payments.core.authentication.threeds2.d v(Lazy<com.stripe.android.payments.core.authentication.threeds2.d> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(l onChallengeResult, h hVar) {
        s.k(onChallengeResult, "$onChallengeResult");
        s.h(hVar);
        onChallengeResult.invoke(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(Stripe3ds2TransactionActivity this$0, Unvalidated unvalidated) {
        s.k(this$0, "this$0");
        s.h(unvalidated);
        this$0.r(unvalidated);
    }

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Object objB;
        Object objB2;
        Integer num;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            Stripe3ds2TransactionContract.Args.Companion companion2 = Stripe3ds2TransactionContract.Args.INSTANCE;
            Intent intent = getIntent();
            s.j(intent, "getIntent(...)");
            Stripe3ds2TransactionContract.Args argsA = companion2.a(intent);
            if (argsA == null) {
                throw new IllegalArgumentException("Error while attempting to initiate 3DS2 transaction.");
            }
            String strA = argsA.getConfig().getUiCustomization().getUiCustomization().a();
            if (strA != null) {
                try {
                    s.h(strA);
                    objB2 = jn0.s.b(Integer.valueOf(Color.parseColor(strA)));
                } catch (Throwable th2) {
                    jn0.s.Companion companion3 = jn0.s.INSTANCE;
                    objB2 = jn0.s.b(t.a(th2));
                }
                if (jn0.s.g(objB2)) {
                    objB2 = null;
                }
                num = (Integer) objB2;
            } else {
                num = null;
            }
            getSupportFragmentManager().v1(new k(argsA.c().getDirectoryServerName(), argsA.getSdkTransactionId(), num));
            objB = jn0.s.b(argsA);
        } catch (Throwable th3) {
            jn0.s.Companion companion4 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th3));
        }
        super.onCreate(savedInstanceState);
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            r(new Unvalidated(null, 2, StripeException.INSTANCE.b(thE), false, null, null, null, 121, null));
            return;
        }
        y((Stripe3ds2TransactionContract.Args) objB);
        setContentView(t().getRoot());
        Integer statusBarColor = s().getStatusBarColor();
        if (statusBarColor != null) {
            getWindow().setStatusBarColor(statusBarColor.intValue());
        }
        e1 e1Var = new e1(o0.b(com.stripe.android.payments.core.authentication.threeds2.d.class), new a(this), new e(), new b(null, this));
        final d dVar = new d(e1Var);
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ChallengeContract(), new ActivityResultCallback() { // from class: j70.e
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                Stripe3ds2TransactionActivity.w(dVar, (h) obj);
            }
        });
        s.j(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new PaymentBrowserAuthContract(), new ActivityResultCallback() { // from class: j70.f
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                Stripe3ds2TransactionActivity.x(this.f82794a, (Unvalidated) obj);
            }
        });
        s.j(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        if (v(e1Var).getHasCompleted()) {
            return;
        }
        x.a(this).d(new c(activityResultLauncherRegisterForActivityResult, dVar, activityResultLauncherRegisterForActivityResult2, e1Var, null));
    }

    public final Stripe3ds2TransactionContract.Args s() {
        Stripe3ds2TransactionContract.Args args = this.args;
        if (args != null) {
            return args;
        }
        s.B("args");
        return null;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final ViewModelProvider.Factory getViewModelFactory() {
        return this.viewModelFactory;
    }

    public final void y(Stripe3ds2TransactionContract.Args args) {
        s.k(args, "<set-?>");
        this.args = args;
    }
}
