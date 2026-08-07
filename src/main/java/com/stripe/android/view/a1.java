package com.stripe.android.view;

import android.content.Context;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.model.MobileCardElementConfig;
import f30.PaymentConfiguration;
import java.util.Map;
import javax.inject.Provider;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001:\u0001*B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/stripe/android/view/a1;", "Landroidx/lifecycle/c1;", "Ljavax/inject/Provider;", "Lf30/o;", "paymentConfigProvider", "Lz60/g;", "stripeRepository", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Ljavax/inject/Provider;Lz60/g;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Ljn0/h0;", "g", "()V", "", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "onBehalfOf", "j", "(Ljava/lang/String;)V", "s", "Ljavax/inject/Provider;", "t", "Lz60/g;", "u", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "v", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_isCbcEligible", "Lkotlinx/coroutines/flow/StateFlow;", "w", "Lkotlinx/coroutines/flow/StateFlow;", IntegerTokenConverter.CONVERTER_KEY, "()Lkotlinx/coroutines/flow/StateFlow;", "isCbcEligible", "x", "Ljava/lang/String;", "_onBehalfOf", "h", "()Ljava/lang/String;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a1 extends androidx.p003lifecycle.c1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Provider<PaymentConfiguration> paymentConfigProvider;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final z60.g stripeRepository;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final CoroutineDispatcher dispatcher;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<Boolean> _isCbcEligible;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> isCbcEligible;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private String _onBehalfOf;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/view/a1$a;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/c1;", "a", "Landroid/content/Context;", "c", "()Landroid/content/Context;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Context context;

        /* JADX INFO: renamed from: com.stripe.android.view.a1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "T", "", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        static final class C1098a extends p013kotlin.jvm.internal.u implements wn0.a<String> {
            C1098a() {
                super(0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return PaymentConfiguration.INSTANCE.a(a.this.getContext()).getPublishableKey();
            }
        }

        public a(Context context) {
            p013kotlin.jvm.internal.s.k(context, "context");
            this.context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PaymentConfiguration b(a this$0) {
            p013kotlin.jvm.internal.s.k(this$0, "this$0");
            return PaymentConfiguration.INSTANCE.a(this$0.context);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Context getContext() {
            return this.context;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends androidx.p003lifecycle.c1> T create(Class<T> modelClass, CreationExtras extras) {
            p013kotlin.jvm.internal.s.k(modelClass, "modelClass");
            p013kotlin.jvm.internal.s.k(extras, "extras");
            return new a1(new Provider() { // from class: com.stripe.android.view.z0
                @Override // javax.inject.Provider
                public final Object get() {
                    return a1.a.b(this.f55235a);
                }
            }, new com.stripe.android.networking.a(this.context, new C1098a(), null, null, null, null, null, null, null, null, null, null, null, null, null, 32764, null), 0 == true ? 1 : 0, 4, 0 == true ? 1 : 0);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.view.CardWidgetViewModel", f = "CardWidgetViewModel.kt", i = {}, l = {60}, m = "determineCbcEligibility", n = {}, s = {})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f54745n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f54747p;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f54745n = obj;
            this.f54747p |= Integer.MIN_VALUE;
            return a1.this.f(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.view.CardWidgetViewModel$getEligibility$1", f = "CardWidgetViewModel.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f54748n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f54749o;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return a1.this.new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableStateFlow mutableStateFlow;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f54749o;
            if (i11 == 0) {
                jn0.t.b(obj);
                MutableStateFlow mutableStateFlow2 = a1.this._isCbcEligible;
                a1 a1Var = a1.this;
                this.f54748n = mutableStateFlow2;
                this.f54749o = 1;
                Object objF = a1Var.f(this);
                if (objF == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableStateFlow = mutableStateFlow2;
                obj = objF;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableStateFlow = (MutableStateFlow) this.f54748n;
                jn0.t.b(obj);
            }
            mutableStateFlow.setValue(obj);
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public /* synthetic */ a1(Provider provider, z60.g gVar, CoroutineDispatcher coroutineDispatcher, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(provider, gVar, (i11 & 4) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(Continuation<? super Boolean> continuation) {
        b bVar;
        Object objI;
        MobileCardElementConfig.CardBrandChoice cardBrandChoice;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f54747p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f54747p = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f54745n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f54747p;
        if (i12 == 0) {
            jn0.t.b(obj);
            PaymentConfiguration paymentConfiguration = this.paymentConfigProvider.get();
            z60.g gVar = this.stripeRepository;
            w30.l.Options options = new w30.l.Options(paymentConfiguration.getPublishableKey(), paymentConfiguration.getStripeAccountId(), null, 4, null);
            String str = get_onBehalfOf();
            Map<String, String> mapF = str != null ? p013kotlin.collections.v0.f(jn0.x.a("on_behalf_of", str)) : null;
            bVar.f54747p = 1;
            objI = gVar.I(options, mapF, bVar);
            if (objI == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            objI = ((jn0.s) obj).getValue();
        }
        MobileCardElementConfig mobileCardElementConfig = (MobileCardElementConfig) (jn0.s.g(objI) ? null : objI);
        return Boxing.boxBoolean((mobileCardElementConfig == null || (cardBrandChoice = mobileCardElementConfig.getCardBrandChoice()) == null || !cardBrandChoice.getEligible()) ? false : true);
    }

    private final void g() {
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(this), this.dispatcher, null, new c(null), 2, null);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String get_onBehalfOf() {
        return this._onBehalfOf;
    }

    public final StateFlow<Boolean> i() {
        return this.isCbcEligible;
    }

    public final void j(String onBehalfOf) {
        this._onBehalfOf = onBehalfOf;
        g();
    }

    public a1(Provider<PaymentConfiguration> paymentConfigProvider, z60.g stripeRepository, CoroutineDispatcher dispatcher) {
        p013kotlin.jvm.internal.s.k(paymentConfigProvider, "paymentConfigProvider");
        p013kotlin.jvm.internal.s.k(stripeRepository, "stripeRepository");
        p013kotlin.jvm.internal.s.k(dispatcher, "dispatcher");
        this.paymentConfigProvider = paymentConfigProvider;
        this.stripeRepository = stripeRepository;
        this.dispatcher = dispatcher;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this._isCbcEligible = MutableStateFlow;
        this.isCbcEligible = MutableStateFlow;
        g();
    }
}
