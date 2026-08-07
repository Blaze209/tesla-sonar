package com.stripe.android.payments.paymentlauncher;

import a70.DefaultReturnUrl;
import a70.Unvalidated;
import android.app.Application;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p003lifecycle.DefaultLifecycleObserver;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.s0;
import androidx.p003lifecycle.v0;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.core.exception.LocalStripeException;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.o;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import expo.modules.interfaces.permissions.PermissionsResponse;
import ezvcard.property.Gender;
import f30.j0;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import jn0.h0;
import jn0.t;
import jn0.x;
import k70.r;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.m;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import w30.l;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 %2\u00020\u0001:\u0002abB\u0095\u0001\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020$2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020$2\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020$2\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b2\u00103J#\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e042\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b5\u00106J.\u0010:\u001a\b\u0012\u0004\u0012\u000209082\u0006\u0010(\u001a\u00020'2\b\u00107\u001a\u0004\u0018\u00010\u000eH\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;J#\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e042\u0006\u0010-\u001a\u00020\u000eH\u0002¢\u0006\u0004\b<\u0010=J\u001d\u0010@\u001a\u00020$2\f\u0010?\u001a\b\u0012\u0004\u0012\u0002090>H\u0002¢\u0006\u0004\b@\u0010AJ9\u0010F\u001a\u00020$2\u0006\u0010C\u001a\u00020B2\n\b\u0002\u0010D\u001a\u0004\u0018\u0001092\u0014\b\u0002\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e04H\u0002¢\u0006\u0004\bF\u0010GJ\u0019\u0010H\u001a\u00020$2\b\u00107\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010LR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010MR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010TR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010TR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010UR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010VR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010WR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010XR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010KR\"\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0Z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010[\u001a\u0004\bR\u0010\\R\u0014\u0010_\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010^R\u0014\u0010`\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010^\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006c"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/e;", "Landroidx/lifecycle/c1;", "", "isPaymentIntent", "Lz60/g;", "stripeApiRepository", "Li70/h;", "nextActionHandlerRegistry", "La70/a;", "defaultReturnUrl", "Ljavax/inject/Provider;", "Lw30/l$c;", "apiRequestOptionsProvider", "", "", "threeDs1IntentReturnUrlMap", "Lpj0/a;", "La70/g;", "lazyPaymentIntentFlowResultProcessor", "La70/j;", "lazySetupIntentFlowResultProcessor", "Lw30/c;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lkotlin/coroutines/CoroutineContext;", "uiContext", "Landroidx/lifecycle/s0;", "savedStateHandle", "isInstantApp", "<init>", "(ZLz60/g;Li70/h;La70/a;Ljavax/inject/Provider;Ljava/util/Map;Lpj0/a;Lpj0/a;Lw30/c;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lkotlin/coroutines/CoroutineContext;Landroidx/lifecycle/s0;Z)V", "Lh/b;", "activityResultCaller", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Ljn0/h0;", "G", "(Lh/b;Landroidx/lifecycle/LifecycleOwner;)V", "Lcom/stripe/android/model/n;", "confirmStripeIntentParams", "Lcom/stripe/android/view/n;", "host", "u", "(Lcom/stripe/android/model/n;Lcom/stripe/android/view/n;)V", "clientSecret", "y", "(Ljava/lang/String;Lcom/stripe/android/view/n;)V", "La70/c;", "paymentFlowResult", "C", "(La70/c;)V", "", "z", "(Lcom/stripe/android/model/n;)Ljava/util/Map;", "returnUrl", "Ljn0/s;", "Lcom/stripe/android/model/StripeIntent;", "t", "(Lcom/stripe/android/model/n;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "A", "(Ljava/lang/String;)Ljava/util/Map;", "Lf30/j0;", "stripeIntentResult", Gender.FEMALE, "(Lf30/j0;)V", "Lcom/stripe/android/payments/paymentlauncher/a;", "stripeInternalResult", AnalyticsAttribute.Intent, "analyticsParams", "D", "(Lcom/stripe/android/payments/paymentlauncher/a;Lcom/stripe/android/model/StripeIntent;Ljava/util/Map;)V", "B", "(Ljava/lang/String;)V", "s", "Z", "Lz60/g;", "Li70/h;", "v", "La70/a;", "w", "Ljavax/inject/Provider;", "x", "Ljava/util/Map;", "Lpj0/a;", "Lw30/c;", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "Lkotlin/coroutines/CoroutineContext;", "Landroidx/lifecycle/s0;", "E", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "internalPaymentResult", "()Z", "hasStarted", "confirmActionRequested", "a", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e extends c1 {
    public static final int H = 8;
    private static final List<String> I = v.e("payment_method");

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final w30.c analyticsRequestExecutor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final CoroutineContext uiContext;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final s0 savedStateHandle;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final boolean isInstantApp;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final MutableStateFlow<a> internalPaymentResult;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final boolean isPaymentIntent;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final z60.g stripeApiRepository;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final i70.h nextActionHandlerRegistry;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final DefaultReturnUrl defaultReturnUrl;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Provider<l.Options> apiRequestOptionsProvider;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> threeDs1IntentReturnUrlMap;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final pj0.a<a70.g> lazyPaymentIntentFlowResultProcessor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final pj0.a<a70.j> lazySetupIntentFlowResultProcessor;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/e$b;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lkotlin/Function0;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a;", "argsSupplier", "<init>", "(Lwn0/a;)V", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/c1;", "a", "Lwn0/a;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<PaymentLauncherContract.a> argsSupplier;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "T", "", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.a<String> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ PaymentLauncherContract.a f52215c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PaymentLauncherContract.a aVar) {
                super(0);
                this.f52215c = aVar;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return this.f52215c.getPublishableKey();
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.payments.paymentlauncher.e$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "T", "", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        static final class C0954b extends u implements wn0.a<String> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ PaymentLauncherContract.a f52216c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0954b(PaymentLauncherContract.a aVar) {
                super(0);
                this.f52216c = aVar;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return this.f52216c.getStripeAccountId();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(wn0.a<? extends PaymentLauncherContract.a> argsSupplier) {
            s.k(argsSupplier, "argsSupplier");
            this.argsSupplier = argsSupplier;
        }

        /* JADX WARN: Code duplicated, block: B:6:0x0064  */
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends c1> T create(Class<T> modelClass, CreationExtras extras) {
            s.k(modelClass, "modelClass");
            s.k(extras, "extras");
            PaymentLauncherContract.a aVarInvoke = this.argsSupplier.invoke();
            Application applicationA = z30.b.a(extras);
            s0 s0VarA = v0.a(extras);
            r.a aVarA = k70.c.a().a(applicationA).c(aVarInvoke.getEnableLogging()).d(new a(aVarInvoke)).e(new C0954b(aVarInvoke)).b(aVarInvoke.c()).f(aVarInvoke.getIncludePaymentSheetNextHandlers()).build().a();
            boolean z11 = false;
            if (aVarInvoke instanceof PaymentLauncherContract.a.IntentConfirmationArgs) {
                n nVarH = ((PaymentLauncherContract.a.IntentConfirmationArgs) aVarInvoke).getConfirmStripeIntentParams();
                if (nVarH instanceof ConfirmPaymentIntentParams) {
                    z11 = true;
                } else if (!(nVarH instanceof ConfirmSetupIntentParams)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (aVarInvoke instanceof PaymentLauncherContract.a.PaymentIntentNextActionArgs) {
                z11 = true;
            } else if (!(aVarInvoke instanceof PaymentLauncherContract.a.SetupIntentNextActionArgs)) {
                throw new NoWhenBranchMatchedException();
            }
            e eVarA = aVarA.a(z11).b(s0VarA).build().a();
            s.i(eVarA, "null cannot be cast to non-null type T of com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel.Factory.create");
            return eVarA;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel", f = "PaymentLauncherViewModel.kt", i = {}, l = {187, 194}, m = "confirmIntent-0E7RQCE", n = {}, s = {})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f52217n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f52219p;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f52217n = obj;
            this.f52219p |= Integer.MIN_VALUE;
            Object objT = e.this.t(null, null, this);
            return objT == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objT : jn0.s.a(objT);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$confirmStripeIntent$1", f = "PaymentLauncherViewModel.kt", i = {0, 0}, l = {127, 137, 144, 152}, m = "invokeSuspend", n = {"analyticsParams", "returnUrl"}, s = {"L$0", "L$1"})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f52220n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f52221o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f52222p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ n f52224r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.view.n f52225s;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$confirmStripeIntent$1$1$2", f = "PaymentLauncherViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f52226n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ e f52227o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ StripeIntent f52228p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, StripeIntent stripeIntent, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f52227o = eVar;
                this.f52228p = stripeIntent;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f52227o, this.f52228p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f52226n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                e.E(this.f52227o, new com.stripe.android.payments.paymentlauncher.a.Completed(this.f52228p), this.f52228p, null, 4, null);
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$confirmStripeIntent$1$2$1", f = "PaymentLauncherViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f52229n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ e f52230o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ Throwable f52231p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ Map<String, String> f52232q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(e eVar, Throwable th2, Map<String, String> map, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f52230o = eVar;
                this.f52231p = th2;
                this.f52232q = map;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new b(this.f52230o, this.f52231p, this.f52232q, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f52229n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                e.E(this.f52230o, new com.stripe.android.payments.paymentlauncher.a.d(this.f52231p), null, this.f52232q, 2, null);
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(n nVar, com.stripe.android.view.n nVar2, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f52224r = nVar;
            this.f52225s = nVar2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return e.this.new d(this.f52224r, this.f52225s, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x00e9, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r1, r2, r11) == r0) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x010d, code lost:
        
            if (r1.d(r8, r12, (w30.l.c) r2, r11) == r0) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0123, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r12, r1, r11) == r0) goto L49;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 297
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.paymentlauncher.e.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.payments.paymentlauncher.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$handleNextActionForStripeIntent$1", f = "PaymentLauncherViewModel.kt", i = {0}, l = {EnumC4419g.SDK_ASSET_ICON_PIN_VALUE, EnumC4419g.SDK_ASSET_ICON_SUBMIT_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE}, m = "invokeSuspend", n = {"analyticsParams"}, s = {"L$0"})
    static final class C0955e extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f52233n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f52234o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f52236q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.view.n f52237r;

        /* JADX INFO: renamed from: com.stripe.android.payments.paymentlauncher.e$e$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$handleNextActionForStripeIntent$1$2$1", f = "PaymentLauncherViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f52238n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ e f52239o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ Throwable f52240p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ Map<String, String> f52241q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, Throwable th2, Map<String, String> map, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f52239o = eVar;
                this.f52240p = th2;
                this.f52241q = map;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f52239o, this.f52240p, this.f52241q, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f52238n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                e.E(this.f52239o, new com.stripe.android.payments.paymentlauncher.a.d(this.f52240p), null, this.f52241q, 2, null);
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0955e(String str, com.stripe.android.view.n nVar, Continuation<? super C0955e> continuation) {
            super(2, continuation);
            this.f52236q = str;
            this.f52237r = nVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return e.this.new C0955e(this.f52236q, this.f52237r, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00ac, code lost:
        
            if (r1.d(r6, r14, (w30.l.c) r3, r13) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00c0, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r14, r2, r13) == r0) goto L22;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r13.f52234o
                java.lang.String r2 = "get(...)"
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L31
                if (r1 == r5) goto L22
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                goto L1c
            L14:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1c:
                jn0.t.b(r14)
                r10 = r13
                goto Lc3
            L22:
                java.lang.Object r1 = r13.f52233n
                java.util.Map r1 = (java.util.Map) r1
                jn0.t.b(r14)
                jn0.s r14 = (jn0.s) r14
                java.lang.Object r14 = r14.getValue()
                r10 = r13
                goto L82
            L31:
                jn0.t.b(r14)
                com.stripe.android.payments.paymentlauncher.e r14 = com.stripe.android.payments.paymentlauncher.e.this
                androidx.lifecycle.s0 r14 = com.stripe.android.payments.paymentlauncher.e.j(r14)
                java.lang.String r1 = "key_has_started"
                java.lang.Boolean r6 = p013kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                r14.n(r1, r6)
                com.stripe.android.payments.paymentlauncher.e r14 = com.stripe.android.payments.paymentlauncher.e.this
                androidx.lifecycle.s0 r14 = com.stripe.android.payments.paymentlauncher.e.j(r14)
                r1 = 0
                java.lang.Boolean r1 = p013kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
                java.lang.String r6 = "confirm_action_requested"
                r14.n(r6, r1)
                com.stripe.android.payments.paymentlauncher.e r14 = com.stripe.android.payments.paymentlauncher.e.this
                java.lang.String r1 = r13.f52236q
                java.util.Map r1 = com.stripe.android.payments.paymentlauncher.e.q(r14, r1)
                com.stripe.android.payments.paymentlauncher.e r14 = com.stripe.android.payments.paymentlauncher.e.this
                z60.g r6 = com.stripe.android.payments.paymentlauncher.e.k(r14)
                java.lang.String r7 = r13.f52236q
                com.stripe.android.payments.paymentlauncher.e r14 = com.stripe.android.payments.paymentlauncher.e.this
                javax.inject.Provider r14 = com.stripe.android.payments.paymentlauncher.e.c(r14)
                java.lang.Object r14 = r14.get()
                p013kotlin.jvm.internal.s.j(r14, r2)
                r8 = r14
                w30.l$c r8 = (w30.l.Options) r8
                r13.f52233n = r1
                r13.f52234o = r5
                r9 = 0
                r11 = 4
                r12 = 0
                r10 = r13
                java.lang.Object r14 = z60.g.a.d(r6, r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto L82
                goto Lc2
            L82:
                com.stripe.android.payments.paymentlauncher.e r5 = com.stripe.android.payments.paymentlauncher.e.this
                com.stripe.android.view.n r6 = r10.f52237r
                java.lang.Throwable r7 = jn0.s.e(r14)
                r8 = 0
                if (r7 != 0) goto Laf
                com.stripe.android.model.StripeIntent r14 = (com.stripe.android.model.StripeIntent) r14
                i70.h r1 = com.stripe.android.payments.paymentlauncher.e.i(r5)
                i70.f r1 = r1.a(r14)
                javax.inject.Provider r3 = com.stripe.android.payments.paymentlauncher.e.c(r5)
                java.lang.Object r3 = r3.get()
                p013kotlin.jvm.internal.s.j(r3, r2)
                w30.l$c r3 = (w30.l.Options) r3
                r10.f52233n = r8
                r10.f52234o = r4
                java.lang.Object r14 = r1.d(r6, r14, r3, r13)
                if (r14 != r0) goto Lc3
                goto Lc2
            Laf:
                kotlin.coroutines.CoroutineContext r14 = com.stripe.android.payments.paymentlauncher.e.m(r5)
                com.stripe.android.payments.paymentlauncher.e$e$a r2 = new com.stripe.android.payments.paymentlauncher.e$e$a
                r2.<init>(r5, r7, r1, r8)
                r10.f52233n = r8
                r10.f52234o = r3
                java.lang.Object r14 = kotlinx.coroutines.BuildersKt.withContext(r14, r2, r13)
                if (r14 != r0) goto Lc3
            Lc2:
                return r0
            Lc3:
                jn0.h0 r14 = jn0.h0.f84049a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.paymentlauncher.e.C0955e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C0955e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$onPaymentFlowResult$1", f = "PaymentLauncherViewModel.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE, EnumC4419g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE, EnumC4419g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52242n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Unvalidated f52244p;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$onPaymentFlowResult$1$1$1", f = "PaymentLauncherViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f52245n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ e f52246o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ j0<StripeIntent> f52247p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(e eVar, j0<? extends StripeIntent> j0Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f52246o = eVar;
                this.f52247p = j0Var;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f52246o, this.f52247p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f52245n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                this.f52246o.F(this.f52247p);
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$onPaymentFlowResult$1$2$1", f = "PaymentLauncherViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f52248n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ e f52249o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ Throwable f52250p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(e eVar, Throwable th2, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f52249o = eVar;
                this.f52250p = th2;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new b(this.f52249o, this.f52250p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f52248n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                e.E(this.f52249o, new com.stripe.android.payments.paymentlauncher.a.d(this.f52250p), null, null, 6, null);
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Unvalidated cVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f52244p = cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return e.this.new f(this.f52244p, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r2, r4, r6) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r7, r3, r6) == r0) goto L26;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f52242n
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L28
                if (r1 == r4) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                jn0.t.b(r7)
                goto L86
            L1e:
                jn0.t.b(r7)
                jn0.s r7 = (jn0.s) r7
                java.lang.Object r7 = r7.getValue()
                goto L57
            L28:
                jn0.t.b(r7)
                com.stripe.android.payments.paymentlauncher.e r7 = com.stripe.android.payments.paymentlauncher.e.this
                boolean r7 = com.stripe.android.payments.paymentlauncher.e.o(r7)
                if (r7 == 0) goto L40
                com.stripe.android.payments.paymentlauncher.e r7 = com.stripe.android.payments.paymentlauncher.e.this
                pj0.a r7 = com.stripe.android.payments.paymentlauncher.e.g(r7)
                java.lang.Object r7 = r7.get()
                a70.e r7 = (a70.e) r7
                goto L4c
            L40:
                com.stripe.android.payments.paymentlauncher.e r7 = com.stripe.android.payments.paymentlauncher.e.this
                pj0.a r7 = com.stripe.android.payments.paymentlauncher.e.h(r7)
                java.lang.Object r7 = r7.get()
                a70.e r7 = (a70.e) r7
            L4c:
                a70.c r1 = r6.f52244p
                r6.f52242n = r4
                java.lang.Object r7 = r7.p(r1, r6)
                if (r7 != r0) goto L57
                goto L85
            L57:
                com.stripe.android.payments.paymentlauncher.e r1 = com.stripe.android.payments.paymentlauncher.e.this
                java.lang.Throwable r4 = jn0.s.e(r7)
                r5 = 0
                if (r4 != 0) goto L74
                f30.j0 r7 = (f30.j0) r7
                kotlin.coroutines.CoroutineContext r2 = com.stripe.android.payments.paymentlauncher.e.m(r1)
                com.stripe.android.payments.paymentlauncher.e$f$a r4 = new com.stripe.android.payments.paymentlauncher.e$f$a
                r4.<init>(r1, r7, r5)
                r6.f52242n = r3
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r2, r4, r6)
                if (r7 != r0) goto L86
                goto L85
            L74:
                kotlin.coroutines.CoroutineContext r7 = com.stripe.android.payments.paymentlauncher.e.m(r1)
                com.stripe.android.payments.paymentlauncher.e$f$b r3 = new com.stripe.android.payments.paymentlauncher.e$f$b
                r3.<init>(r1, r4, r5)
                r6.f52242n = r2
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r3, r6)
                if (r7 != r0) goto L86
            L85:
                return r0
            L86:
                jn0.h0 r7 = jn0.h0.f84049a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.paymentlauncher.e.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class g implements ActivityResultCallback, m {
        g() {
        }

        @Override // androidx.p002activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(Unvalidated p11) {
            s.k(p11, "p0");
            e.this.C(p11);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof m)) {
                return s.f(getFunctionDelegate(), ((m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p013kotlin.jvm.internal.m
        public final jn0.i<?> getFunctionDelegate() {
            return new p013kotlin.jvm.internal.p(1, e.this, e.class, "onPaymentFlowResult", "onPaymentFlowResult$payments_core_release(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/stripe/android/payments/paymentlauncher/e$h", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Ljn0/h0;", "onDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h implements DefaultLifecycleObserver {
        h() {
        }

        @Override // androidx.p003lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner owner) {
            s.k(owner, "owner");
            e.this.nextActionHandlerRegistry.c();
            super.onDestroy(owner);
        }
    }

    public e(boolean z11, z60.g stripeApiRepository, i70.h nextActionHandlerRegistry, DefaultReturnUrl defaultReturnUrl, Provider<l.Options> apiRequestOptionsProvider, Map<String, String> threeDs1IntentReturnUrlMap, pj0.a<a70.g> lazyPaymentIntentFlowResultProcessor, pj0.a<a70.j> lazySetupIntentFlowResultProcessor, w30.c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, CoroutineContext uiContext, s0 savedStateHandle, boolean z12) {
        s.k(stripeApiRepository, "stripeApiRepository");
        s.k(nextActionHandlerRegistry, "nextActionHandlerRegistry");
        s.k(defaultReturnUrl, "defaultReturnUrl");
        s.k(apiRequestOptionsProvider, "apiRequestOptionsProvider");
        s.k(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
        s.k(lazyPaymentIntentFlowResultProcessor, "lazyPaymentIntentFlowResultProcessor");
        s.k(lazySetupIntentFlowResultProcessor, "lazySetupIntentFlowResultProcessor");
        s.k(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.k(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        s.k(uiContext, "uiContext");
        s.k(savedStateHandle, "savedStateHandle");
        this.isPaymentIntent = z11;
        this.stripeApiRepository = stripeApiRepository;
        this.nextActionHandlerRegistry = nextActionHandlerRegistry;
        this.defaultReturnUrl = defaultReturnUrl;
        this.apiRequestOptionsProvider = apiRequestOptionsProvider;
        this.threeDs1IntentReturnUrlMap = threeDs1IntentReturnUrlMap;
        this.lazyPaymentIntentFlowResultProcessor = lazyPaymentIntentFlowResultProcessor;
        this.lazySetupIntentFlowResultProcessor = lazySetupIntentFlowResultProcessor;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.uiContext = uiContext;
        this.savedStateHandle = savedStateHandle;
        this.isInstantApp = z12;
        this.internalPaymentResult = StateFlowKt.MutableStateFlow(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> A(String clientSecret) {
        Map<String, String> mapF = p013kotlin.collections.v0.f(x.a("intent_id", m70.b.b(clientSecret)));
        this.analyticsRequestExecutor.a(this.paymentAnalyticsRequestFactory.g(PaymentAnalyticsEvent.PaymentLauncherNextActionStarted, mapF));
        return mapF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(String returnUrl) {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        if (s.f(returnUrl, this.defaultReturnUrl.a())) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.ConfirmReturnUrlDefault;
        } else {
            paymentAnalyticsEvent = returnUrl == null ? PaymentAnalyticsEvent.ConfirmReturnUrlNull : PaymentAnalyticsEvent.ConfirmReturnUrlCustom;
        }
        this.analyticsRequestExecutor.a(PaymentAnalyticsRequestFactory.w(this.paymentAnalyticsRequestFactory, paymentAnalyticsEvent, null, null, null, null, null, 62, null));
    }

    private final void D(a stripeInternalResult, StripeIntent intent, Map<String, String> analyticsParams) {
        PaymentMethod v0VarZ2;
        PaymentMethod.p pVar;
        StripeIntent.Status status;
        String strP;
        MutableStateFlow<a> mutableStateFlow = this.internalPaymentResult;
        PaymentAnalyticsEvent paymentAnalyticsEvent = v() ? PaymentAnalyticsEvent.PaymentLauncherConfirmFinished : PaymentAnalyticsEvent.PaymentLauncherNextActionFinished;
        String str = null;
        Pair pairA = x.a("intent_id", (intent == null || (strP = intent.getClientSecret()) == null) ? null : m70.b.b(strP));
        Pair pairA2 = x.a(PermissionsResponse.STATUS_KEY, (intent == null || (status = intent.getStatus()) == null) ? null : status.getCode());
        if (intent != null && (v0VarZ2 = intent.getPaymentMethod()) != null && (pVar = v0VarZ2.type) != null) {
            str = pVar.code;
        }
        this.analyticsRequestExecutor.a(this.paymentAnalyticsRequestFactory.g(paymentAnalyticsEvent, p013kotlin.collections.v0.r(p013kotlin.collections.v0.r(analyticsParams, s90.b.a(p013kotlin.collections.v0.m(pairA, pairA2, x.a("payment_method_type", str)))), stripeInternalResult instanceof a.d ? h70.h.INSTANCE.d(StripeException.INSTANCE.b(((a.d) stripeInternalResult).getThrowable())) : p013kotlin.collections.v0.i())));
        mutableStateFlow.setValue(stripeInternalResult);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void E(e eVar, a aVar, StripeIntent stripeIntent, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            stripeIntent = null;
        }
        if ((i11 & 4) != 0) {
            map = p013kotlin.collections.v0.i();
        }
        eVar.D(aVar, stripeIntent, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(j0<? extends StripeIntent> stripeIntentResult) {
        a cVar;
        int iD = stripeIntentResult.d();
        if (iD == 1) {
            cVar = new a.Completed(stripeIntentResult.getIntent());
        } else if (iD == 2) {
            cVar = new a.d(new LocalStripeException(stripeIntentResult.getFailureMessage(), "failedIntentOutcomeError"));
        } else if (iD == 3) {
            cVar = a.C0948a.f52196b;
        } else if (iD != 4) {
            cVar = new a.d(new LocalStripeException("Payment fails due to unknown error. \n" + stripeIntentResult.getFailureMessage(), "unknownIntentOutcomeError"));
        } else {
            cVar = new a.d(new LocalStripeException("Payment fails due to time out. \n" + stripeIntentResult.getFailureMessage(), "timedOutIntentOutcomeError"));
        }
        E(this, cVar, stripeIntentResult.getIntent(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(n nVar, String str, Continuation<? super jn0.s<? extends StripeIntent>> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f52219p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f52219p = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f52217n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f52219p;
        if (i12 != 0) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        t.b(obj);
        nVar.L3(str);
        n nVarM2 = nVar.m2(true);
        if (nVarM2 instanceof ConfirmPaymentIntentParams) {
            l.Options cVar2 = this.apiRequestOptionsProvider.get();
            s.j(cVar2, "get(...)");
            List<String> list = I;
            cVar.f52219p = 1;
            Object objK = this.stripeApiRepository.k((ConfirmPaymentIntentParams) nVarM2, cVar2, list, cVar);
            if (objK != coroutine_suspended) {
                return objK;
            }
        } else {
            if (!(nVarM2 instanceof ConfirmSetupIntentParams)) {
                throw new NoWhenBranchMatchedException();
            }
            l.Options cVar3 = this.apiRequestOptionsProvider.get();
            s.j(cVar3, "get(...)");
            List<String> list2 = I;
            cVar.f52219p = 2;
            Object objP = this.stripeApiRepository.p((ConfirmSetupIntentParams) nVarM2, cVar3, list2, cVar);
            if (objP != coroutine_suspended) {
                return objP;
            }
        }
        return coroutine_suspended;
    }

    private final boolean v() {
        Boolean bool = (Boolean) this.savedStateHandle.f("confirm_action_requested");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final boolean w() {
        Boolean bool = (Boolean) this.savedStateHandle.f("key_has_started");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> z(n confirmStripeIntentParams) {
        PaymentMethodCreateParams paymentMethodCreateParamsA = o.a(confirmStripeIntentParams);
        Map<String, String> mapA = s90.b.a(p013kotlin.collections.v0.m(x.a("payment_method_type", paymentMethodCreateParamsA != null ? paymentMethodCreateParamsA.getCode() : null), x.a("intent_id", m70.b.b(confirmStripeIntentParams.getClientSecret()))));
        this.analyticsRequestExecutor.a(this.paymentAnalyticsRequestFactory.g(PaymentAnalyticsEvent.PaymentLauncherConfirmStarted, mapA));
        return mapA;
    }

    public final void C(Unvalidated paymentFlowResult) {
        s.k(paymentFlowResult, "paymentFlowResult");
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new f(paymentFlowResult, null), 3, null);
    }

    public final void G(h.b activityResultCaller, LifecycleOwner lifecycleOwner) {
        s.k(activityResultCaller, "activityResultCaller");
        s.k(lifecycleOwner, "lifecycleOwner");
        this.nextActionHandlerRegistry.b(activityResultCaller, new g());
        lifecycleOwner.getLifecycle().a(new h());
    }

    public final void u(n confirmStripeIntentParams, com.stripe.android.view.n host) {
        s.k(confirmStripeIntentParams, "confirmStripeIntentParams");
        s.k(host, "host");
        if (w()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new d(confirmStripeIntentParams, host, null), 3, null);
    }

    public final MutableStateFlow<a> x() {
        return this.internalPaymentResult;
    }

    public final void y(String clientSecret, com.stripe.android.view.n host) {
        s.k(clientSecret, "clientSecret");
        s.k(host, "host");
        if (w()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new C0955e(clientSecret, host, null), 3, null);
    }
}
