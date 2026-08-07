package com.stripe.android.googlepaylauncher;

import android.app.Application;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.s0;
import androidx.p003lifecycle.v0;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import f30.PaymentConfiguration;
import jn0.t;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 D2\u00020\u0001:\u0002EFBA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u0087@¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0086@¢\u0006\u0004\b\"\u0010\u0019J\u0018\u0010$\u001a\u00020\u00122\u0006\u0010#\u001a\u00020!H\u0086@¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0012048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\"\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0012088\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R$\u0010C\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u00178@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006G"}, d2 = {"Lcom/stripe/android/googlepaylauncher/j;", "Landroidx/lifecycle/c1;", "Lcom/google/android/gms/wallet/PaymentsClient;", "paymentsClient", "Lw30/l$c;", "requestOptions", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$a;", "args", "Lz60/g;", "stripeRepository", "Lf30/i;", "googlePayJsonFactory", "Lcom/stripe/android/googlepaylauncher/l;", "googlePayRepository", "Landroidx/lifecycle/s0;", "savedStateHandle", "<init>", "(Lcom/google/android/gms/wallet/PaymentsClient;Lw30/l$c;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$a;Lz60/g;Lf30/i;Lcom/stripe/android/googlepaylauncher/l;Landroidx/lifecycle/s0;)V", "Lcom/stripe/android/googlepaylauncher/h$g;", "result", "Ljn0/h0;", "n", "(Lcom/stripe/android/googlepaylauncher/h$g;)V", "", "k", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lorg/json/JSONObject;", "f", "()Lorg/json/JSONObject;", "Lf30/i$e;", "h", "(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$a;)Lf30/i$e;", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/wallet/PaymentData;", "l", "paymentData", "g", "(Lcom/google/android/gms/wallet/PaymentData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "s", "Lcom/google/android/gms/wallet/PaymentsClient;", "t", "Lw30/l$c;", "u", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$a;", "v", "Lz60/g;", "w", "Lf30/i;", "x", "Lcom/stripe/android/googlepaylauncher/l;", "y", "Landroidx/lifecycle/s0;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "z", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_googleResult", "Lkotlinx/coroutines/flow/StateFlow;", "A", "Lkotlinx/coroutines/flow/StateFlow;", IntegerTokenConverter.CONVERTER_KEY, "()Lkotlinx/coroutines/flow/StateFlow;", "googlePayResult", "value", "j", "()Z", "m", "(Z)V", "hasLaunched", "B", "a", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class j extends c1 {
    private static final a B = new a(null);
    public static final int C = 8;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final StateFlow<h.g> googlePayResult;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final PaymentsClient paymentsClient;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final w30.l.Options requestOptions;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final GooglePayPaymentMethodLauncherContractV2.Args args;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final z60.g stripeRepository;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final f30.i googlePayJsonFactory;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final l googlePayRepository;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final s0 savedStateHandle;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<h.g> _googleResult;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/googlepaylauncher/j$a;", "", "<init>", "()V", "", "HAS_LAUNCHED_KEY", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/googlepaylauncher/j$b;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$a;", "args", "<init>", "(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$a;)V", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/c1;", "a", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$a;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final GooglePayPaymentMethodLauncherContractV2.Args args;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "T", "", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.a<String> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Application f50872c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Application application) {
                super(0);
                this.f50872c = application;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return PaymentConfiguration.INSTANCE.a(this.f50872c).getPublishableKey();
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.j$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "T", "", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        static final class C0856b extends u implements wn0.a<String> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Application f50873c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0856b(Application application) {
                super(0);
                this.f50873c = application;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return PaymentConfiguration.INSTANCE.a(this.f50873c).getStripeAccountId();
            }
        }

        public b(GooglePayPaymentMethodLauncherContractV2.Args args) {
            s.k(args, "args");
            this.args = args;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends c1> T create(Class<T> modelClass, CreationExtras extras) {
            s.k(modelClass, "modelClass");
            s.k(extras, "extras");
            Application applicationA = z30.b.a(extras);
            j jVarA = b60.a.a().a(applicationA).c(false).d(new a(applicationA)).e(new C0856b(applicationA)).b(d1.c("GooglePayPaymentMethodLauncher")).f(this.args.getConfig()).build().a().a(this.args).b(v0.a(extras)).build().a();
            s.i(jVarA, "null cannot be cast to non-null type T of com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel.Factory.create");
            return jVarA;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel", f = "GooglePayPaymentMethodLauncherViewModel.kt", i = {}, l = {103}, m = "createPaymentMethod", n = {}, s = {})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f50874n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f50876p;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f50874n = obj;
            this.f50876p |= Integer.MIN_VALUE;
            return j.this.g(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel", f = "GooglePayPaymentMethodLauncherViewModel.kt", i = {0}, l = {88, 93}, m = "loadPaymentData", n = {"this"}, s = {"L$0"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f50877n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f50878o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f50880q;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f50878o = obj;
            this.f50880q |= Integer.MIN_VALUE;
            return j.this.l(this);
        }
    }

    public j(PaymentsClient paymentsClient, w30.l.Options requestOptions, GooglePayPaymentMethodLauncherContractV2.Args args, z60.g stripeRepository, f30.i googlePayJsonFactory, l googlePayRepository, s0 savedStateHandle) {
        s.k(paymentsClient, "paymentsClient");
        s.k(requestOptions, "requestOptions");
        s.k(args, "args");
        s.k(stripeRepository, "stripeRepository");
        s.k(googlePayJsonFactory, "googlePayJsonFactory");
        s.k(googlePayRepository, "googlePayRepository");
        s.k(savedStateHandle, "savedStateHandle");
        this.paymentsClient = paymentsClient;
        this.requestOptions = requestOptions;
        this.args = args;
        this.stripeRepository = stripeRepository;
        this.googlePayJsonFactory = googlePayJsonFactory;
        this.googlePayRepository = googlePayRepository;
        this.savedStateHandle = savedStateHandle;
        MutableStateFlow<h.g> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._googleResult = MutableStateFlow;
        this.googlePayResult = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final JSONObject f() {
        return f30.i.e(this.googlePayJsonFactory, h(this.args), com.stripe.android.googlepaylauncher.a.b(this.args.getConfig().getBillingAddressConfig()), null, this.args.getConfig().getIsEmailRequired(), new f30.i.MerchantInfo(this.args.getConfig().getMerchantName()), Boolean.valueOf(this.args.getConfig().getAllowCreditCards()), 4, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(PaymentData paymentData, Continuation<? super h.g> continuation) {
        c cVar;
        Object objJ;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f50876p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f50876p = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f50874n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f50876p;
        int i13 = 1;
        if (i12 == 0) {
            t.b(obj);
            PaymentMethodCreateParams paymentMethodCreateParamsD = PaymentMethodCreateParams.INSTANCE.D(new JSONObject(paymentData.toJson()));
            z60.g gVar = this.stripeRepository;
            w30.l.Options options = this.requestOptions;
            cVar.f50876p = 1;
            objJ = gVar.j(paymentMethodCreateParamsD, options, cVar);
            if (objJ == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            objJ = ((jn0.s) obj).getValue();
        }
        Throwable thE = jn0.s.e(objJ);
        if (thE == null) {
            return new h.g.Completed((PaymentMethod) objJ);
        }
        if (thE instanceof APIConnectionException) {
            i13 = 3;
        } else if (thE instanceof InvalidRequestException) {
            i13 = 2;
        }
        return new h.g.Failed(thE, i13);
    }

    public final f30.i.TransactionInfo h(GooglePayPaymentMethodLauncherContractV2.Args args) {
        s.k(args, "args");
        return new f30.i.TransactionInfo(args.getCurrencyCode(), f30.i.TransactionInfo.c.Estimated, args.getConfig().getMerchantCountryCode(), args.getTransactionId(), Long.valueOf(args.getAmount()), args.getLabel(), f30.i.TransactionInfo.a.Default);
    }

    public final StateFlow<h.g> i() {
        return this.googlePayResult;
    }

    public final boolean j() {
        return s.f(this.savedStateHandle.f("has_launched"), Boolean.TRUE);
    }

    public final Object k(Continuation<? super Boolean> continuation) {
        return FlowKt.first(this.googlePayRepository.isReady(), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(Continuation<? super Task<PaymentData>> continuation) {
        d dVar;
        j jVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f50880q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f50880q = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objK = dVar.f50878o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f50880q;
        if (i12 == 0) {
            t.b(objK);
            dVar.f50877n = this;
            dVar.f50880q = 1;
            objK = k(dVar);
            if (objK != coroutine_suspended) {
                jVar = this;
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objK);
            return objK;
        }
        jVar = (j) dVar.f50877n;
        t.b(objK);
        if (!((Boolean) objK).booleanValue()) {
            throw new IllegalStateException("Google Pay is unavailable.");
        }
        Task<PaymentData> taskLoadPaymentData = jVar.paymentsClient.loadPaymentData(PaymentDataRequest.fromJson(jVar.f().toString()));
        s.j(taskLoadPaymentData, "loadPaymentData(...)");
        dVar.f50877n = null;
        dVar.f50880q = 2;
        Object objB = a60.i.b(taskLoadPaymentData, null, dVar, 1, null);
        return objB == coroutine_suspended ? coroutine_suspended : objB;
    }

    public final void m(boolean z11) {
        this.savedStateHandle.n("has_launched", Boolean.valueOf(z11));
    }

    public final void n(h.g result) {
        s.k(result, "result");
        this._googleResult.setValue(result);
    }
}
