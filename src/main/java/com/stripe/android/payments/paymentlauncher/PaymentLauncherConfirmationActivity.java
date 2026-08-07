package com.stripe.android.payments.paymentlauncher;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.p002activity.ComponentActivity;
import androidx.p002activity.OnBackPressedDispatcher;
import androidx.p002activity.b0;
import androidx.p002activity.d0;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.e1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import androidx.p003lifecycle.x;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.view.n;
import jn0.h0;
import jn0.m;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import p013kotlin.KotlinNothingValueException;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R(\u0010\u001c\u001a\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR!\u0010\"\u001a\u00020\u001d8@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0010\u0012\u0004\b!\u0010\u0003\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "Lcom/stripe/android/payments/paymentlauncher/a;", "result", "Ljn0/h0;", "p", "(Lcom/stripe/android/payments/paymentlauncher/a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "finish", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a;", "f", "Lkotlin/Lazy;", "q", "()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a;", "starterArgs", "Landroidx/lifecycle/ViewModelProvider$Factory;", "g", "Landroidx/lifecycle/ViewModelProvider$Factory;", "s", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory$payments_core_release", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "getViewModelFactory$payments_core_release$annotations", "viewModelFactory", "Lcom/stripe/android/payments/paymentlauncher/e;", "h", "r", "()Lcom/stripe/android/payments/paymentlauncher/e;", "getViewModel$payments_core_release$annotations", "viewModel", IntegerTokenConverter.CONVERTER_KEY, "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PaymentLauncherConfirmationActivity extends androidx.appcompat.app.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f52152j = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy starterArgs = m.b(new f());

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private ViewModelProvider.Factory viewModelFactory = new com.stripe.android.payments.paymentlauncher.e.b(new h());

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e1(o0.b(com.stripe.android.payments.paymentlauncher.e.class), new d(this), new g(), new e(null, this));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/b0;", "Ljn0/h0;", "a", "(Landroidx/activity/b0;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements l<b0, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f52156c = new b();

        b() {
            super(1);
        }

        public final void a(b0 addCallback) {
            s.k(addCallback, "$this$addCallback");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(b0 b0Var) {
            a(b0Var);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity$onCreate$2", f = "PaymentLauncherConfirmationActivity.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52157n;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/a;", "it", "Ljn0/h0;", "a", "(Lcom/stripe/android/payments/paymentlauncher/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentLauncherConfirmationActivity f52159a;

            a(PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity) {
                this.f52159a = paymentLauncherConfirmationActivity;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.stripe.android.payments.paymentlauncher.a aVar, Continuation<? super h0> continuation) {
                if (aVar != null) {
                    this.f52159a.p(aVar);
                }
                return h0.f84049a;
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PaymentLauncherConfirmationActivity.this.new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f52157n;
            if (i11 == 0) {
                t.b(obj);
                MutableStateFlow<com.stripe.android.payments.paymentlauncher.a> mutableStateFlowX = PaymentLauncherConfirmationActivity.this.r().x();
                a aVar = new a(PaymentLauncherConfirmationActivity.this);
                this.f52157n = 1;
                if (mutableStateFlowX.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/ViewModelStore;", "b", "()Landroidx/lifecycle/ViewModelStore;"}, k = 3, mv = {1, 9, 0})
    public static final class d extends u implements wn0.a<ViewModelStore> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f52160c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f52160c = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return this.f52160c.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "b", "()Landroidx/lifecycle/viewmodel/CreationExtras;"}, k = 3, mv = {1, 9, 0})
    public static final class e extends u implements wn0.a<CreationExtras> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a f52161c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f52162d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(wn0.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f52161c = aVar;
            this.f52162d = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            wn0.a aVar = this.f52161c;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f52162d.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a;", "b", "()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a;"}, k = 3, mv = {1, 9, 0})
    static final class f extends u implements wn0.a<PaymentLauncherContract.a> {
        f() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PaymentLauncherContract.a invoke() {
            PaymentLauncherContract.a.Companion companion = PaymentLauncherContract.a.INSTANCE;
            Intent intent = PaymentLauncherConfirmationActivity.this.getIntent();
            s.j(intent, "getIntent(...)");
            return companion.a(intent);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "b", "()Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 3, mv = {1, 9, 0})
    static final class g extends u implements wn0.a<ViewModelProvider.Factory> {
        g() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            return PaymentLauncherConfirmationActivity.this.getViewModelFactory();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a;", "b", "()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a;"}, k = 3, mv = {1, 9, 0})
    static final class h extends u implements wn0.a<PaymentLauncherContract.a> {
        h() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PaymentLauncherContract.a invoke() {
            PaymentLauncherContract.a aVarQ = PaymentLauncherConfirmationActivity.this.q();
            if (aVarQ != null) {
                return aVarQ;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(a result) {
        setResult(-1, new Intent().putExtras(result.a()));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentLauncherContract.a q() {
        return (PaymentLauncherContract.a) this.starterArgs.getValue();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        r90.c.a(this);
    }

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object objB;
        super.onCreate(savedInstanceState);
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            PaymentLauncherContract.a aVarQ = q();
            if (aVarQ == null) {
                throw new IllegalArgumentException("PaymentLauncherConfirmationActivity was started without arguments");
            }
            objB = jn0.s.b(aVarQ);
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                p(new a.d(thE));
                h70.h.Companion companion2 = h70.h.INSTANCE;
                Context applicationContext = getApplicationContext();
                s.j(applicationContext, "getApplicationContext(...)");
                h70.h.b.a(h70.h.Companion.b(companion2, applicationContext, null, 2, null), h70.h.d.PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS, StripeException.INSTANCE.b(thE), null, 4, null);
                return;
            }
            PaymentLauncherContract.a aVar = (PaymentLauncherContract.a) objB;
            OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
            s.j(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
            d0.b(onBackPressedDispatcher, null, false, b.f52156c, 3, null);
            BuildersKt__Builders_commonKt.launch$default(x.a(this), null, null, new c(null), 3, null);
            r().G(this, this);
            n nVarA = n.INSTANCE.a(this, aVar.getStatusBarColor());
            if (aVar instanceof PaymentLauncherContract.a.IntentConfirmationArgs) {
                r().u(((PaymentLauncherContract.a.IntentConfirmationArgs) aVar).getConfirmStripeIntentParams(), nVarA);
            } else if (aVar instanceof PaymentLauncherContract.a.PaymentIntentNextActionArgs) {
                r().y(((PaymentLauncherContract.a.PaymentIntentNextActionArgs) aVar).getPaymentIntentClientSecret(), nVarA);
            } else if (aVar instanceof PaymentLauncherContract.a.SetupIntentNextActionArgs) {
                r().y(((PaymentLauncherContract.a.SetupIntentNextActionArgs) aVar).getSetupIntentClientSecret(), nVarA);
            }
        } catch (Throwable th2) {
            jn0.s.Companion companion3 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
    }

    public final com.stripe.android.payments.paymentlauncher.e r() {
        return (com.stripe.android.payments.paymentlauncher.e) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final ViewModelProvider.Factory getViewModelFactory() {
        return this.viewModelFactory;
    }
}
