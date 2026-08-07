package com.stripe.android.view;

import androidx.p003lifecycle.ViewModelProvider;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.model.Customer;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import f30.PaymentSessionConfig;
import f30.PaymentSessionData;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.SafeContinuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u0000 G2\u00020\u0001:\u0002HIB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0080@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\f2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0080@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R(\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00107\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010>\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006J"}, d2 = {"Lcom/stripe/android/view/b2;", "Landroidx/lifecycle/c1;", "Lf30/f;", "customerSession", "Lf30/s;", "paymentSessionData", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lf30/f;Lf30/s;Lkotlin/coroutines/CoroutineContext;)V", "Lcom/stripe/android/model/f1;", "shippingInformation", "Ljn0/s;", "Lcom/stripe/android/model/a0;", "l", "(Lcom/stripe/android/model/f1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lf30/r$d;", "shippingInfoValidator", "Lf30/r$e;", "shippingMethodsFactory", "", "Lcom/stripe/android/model/g1;", "q", "(Lf30/r$d;Lf30/r$e;Lcom/stripe/android/model/f1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "s", "Lf30/f;", "t", "Lf30/s;", "g", "()Lf30/s;", "n", "(Lf30/s;)V", "u", "Lkotlin/coroutines/CoroutineContext;", "v", "Ljava/util/List;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "setShippingMethods$payments_core_release", "(Ljava/util/List;)V", "shippingMethods", "", "w", "Z", "k", "()Z", "p", "(Z)V", "isShippingInfoSubmitted", "x", "Lcom/stripe/android/model/g1;", "h", "()Lcom/stripe/android/model/g1;", "o", "(Lcom/stripe/android/model/g1;)V", "selectedShippingMethod", "y", "Lcom/stripe/android/model/f1;", "j", "()Lcom/stripe/android/model/f1;", "setSubmittedShippingInfo$payments_core_release", "(Lcom/stripe/android/model/f1;)V", "submittedShippingInfo", "", "z", "I", "f", "()I", "m", "(I)V", "currentPage", "A", "a", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b2 extends androidx.p003lifecycle.c1 {
    public static final int B = 8;
    private static final Set<String> C = p013kotlin.collections.d1.i("PaymentSession", "PaymentFlowActivity", "ShippingInfoScreen");

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final f30.f customerSession;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private PaymentSessionData paymentSessionData;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private List<ShippingMethod> shippingMethods;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean isShippingInfoSubmitted;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private ShippingMethod selectedShippingMethod;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private ShippingInformation submittedShippingInfo;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private int currentPage;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\t*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/view/b2$b;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lf30/f;", "customerSession", "Lf30/s;", "paymentSessionData", "<init>", "(Lf30/f;Lf30/s;)V", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/c1;", "a", "Lf30/f;", "b", "Lf30/s;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final f30.f customerSession;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final PaymentSessionData paymentSessionData;

        public b(f30.f customerSession, PaymentSessionData paymentSessionData) {
            p013kotlin.jvm.internal.s.k(customerSession, "customerSession");
            p013kotlin.jvm.internal.s.k(paymentSessionData, "paymentSessionData");
            this.customerSession = customerSession;
            this.paymentSessionData = paymentSessionData;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends androidx.p003lifecycle.c1> T create(Class<T> modelClass) {
            p013kotlin.jvm.internal.s.k(modelClass, "modelClass");
            return new b2(this.customerSession, this.paymentSessionData, Dispatchers.getIO());
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.view.PaymentFlowViewModel", f = "PaymentFlowViewModel.kt", i = {0, 0}, l = {35}, m = "saveCustomerShippingInformation-gIAlu-s$payments_core_release", n = {"this", "shippingInformation"}, s = {"L$0", "L$1"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f54793n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f54794o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f54795p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f54797r;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f54795p = obj;
            this.f54797r |= Integer.MIN_VALUE;
            Object objL = b2.this.l(null, this);
            return objL == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objL : jn0.s.a(objL);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/stripe/android/view/b2$d", "Lf30/f$b;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements f30.f.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Continuation<jn0.s<Customer>> f54799b;

        /* JADX WARN: Multi-variable type inference failed */
        d(Continuation<? super jn0.s<Customer>> continuation) {
            this.f54799b = continuation;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.view.PaymentFlowViewModel", f = "PaymentFlowViewModel.kt", i = {0}, l = {70}, m = "validateShippingInformation-BWLJW6A$payments_core_release", n = {"this"}, s = {"L$0"})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f54800n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f54801o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f54803q;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f54801o = obj;
            this.f54803q |= Integer.MIN_VALUE;
            Object objQ = b2.this.q(null, null, null, this);
            return objQ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objQ : jn0.s.a(objQ);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "", "Lcom/stripe/android/model/g1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.view.PaymentFlowViewModel$validateShippingInformation$result$1", f = "PaymentFlowViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.s<? extends List<? extends ShippingMethod>>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f54804n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f54805o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ PaymentSessionConfig.d f54806p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ ShippingInformation f54807q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ PaymentSessionConfig.e f54808r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(PaymentSessionConfig.d dVar, ShippingInformation shippingInformation, PaymentSessionConfig.e eVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f54806p = dVar;
            this.f54807q = shippingInformation;
            this.f54808r = eVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            f fVar = new f(this.f54806p, this.f54807q, this.f54808r, continuation);
            fVar.f54805o = obj;
            return fVar;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.s<? extends List<? extends ShippingMethod>>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super jn0.s<? extends List<ShippingMethod>>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objB2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f54804n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            if (this.f54806p.C3(this.f54807q)) {
                PaymentSessionConfig.e eVar = this.f54808r;
                ShippingInformation shippingInformation = this.f54807q;
                try {
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    List<ShippingMethod> listT0 = eVar != null ? eVar.T0(shippingInformation) : null;
                    if (listT0 == null) {
                        listT0 = p013kotlin.collections.v.m();
                    }
                    objB2 = jn0.s.b(listT0);
                } catch (Throwable th2) {
                    jn0.s.Companion companion2 = jn0.s.INSTANCE;
                    objB2 = jn0.s.b(jn0.t.a(th2));
                }
            } else {
                PaymentSessionConfig.d dVar = this.f54806p;
                ShippingInformation shippingInformation2 = this.f54807q;
                try {
                    jn0.s.Companion companion3 = jn0.s.INSTANCE;
                    objB = jn0.s.b(dVar.K1(shippingInformation2));
                } catch (Throwable th3) {
                    jn0.s.Companion companion4 = jn0.s.INSTANCE;
                    objB = jn0.s.b(jn0.t.a(th3));
                }
                Throwable thE = jn0.s.e(objB);
                if (thE == null) {
                    thE = new RuntimeException((String) objB);
                }
                objB2 = jn0.s.b(jn0.t.a(thE));
            }
            return jn0.s.a(objB2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super jn0.s<? extends List<ShippingMethod>>> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public b2(f30.f customerSession, PaymentSessionData paymentSessionData, CoroutineContext workContext) {
        p013kotlin.jvm.internal.s.k(customerSession, "customerSession");
        p013kotlin.jvm.internal.s.k(paymentSessionData, "paymentSessionData");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        this.customerSession = customerSession;
        this.paymentSessionData = paymentSessionData;
        this.workContext = workContext;
        this.shippingMethods = p013kotlin.collections.v.m();
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final PaymentSessionData getPaymentSessionData() {
        return this.paymentSessionData;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final ShippingMethod getSelectedShippingMethod() {
        return this.selectedShippingMethod;
    }

    public final List<ShippingMethod> i() {
        return this.shippingMethods;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final ShippingInformation getSubmittedShippingInfo() {
        return this.submittedShippingInfo;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsShippingInfoSubmitted() {
        return this.isShippingInfoSubmitted;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final /* synthetic */ Object l(ShippingInformation shippingInformation, Continuation continuation) throws Throwable {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f54797r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f54797r = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object orThrow = cVar.f54795p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f54797r;
        if (i12 == 0) {
            jn0.t.b(orThrow);
            cVar.f54793n = this;
            cVar.f54794o = shippingInformation;
            cVar.f54797r = 1;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(cVar));
            this.submittedShippingInfo = shippingInformation;
            this.customerSession.f(shippingInformation, C, new d(safeContinuation));
            orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(cVar);
            }
            if (orThrow == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(orThrow);
        }
        return ((jn0.s) orThrow).getValue();
    }

    public final void m(int i11) {
        this.currentPage = i11;
    }

    public final void n(PaymentSessionData paymentSessionData) {
        p013kotlin.jvm.internal.s.k(paymentSessionData, "<set-?>");
        this.paymentSessionData = paymentSessionData;
    }

    public final void o(ShippingMethod shippingMethod) {
        this.selectedShippingMethod = shippingMethod;
    }

    public final void p(boolean z11) {
        this.isShippingInfoSubmitted = z11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final /* synthetic */ Object q(PaymentSessionConfig.d dVar, PaymentSessionConfig.e eVar, ShippingInformation shippingInformation, Continuation continuation) {
        e eVar2;
        b2 b2Var;
        if (continuation instanceof e) {
            eVar2 = (e) continuation;
            int i11 = eVar2.f54803q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar2.f54803q = i11 - Integer.MIN_VALUE;
            } else {
                eVar2 = new e(continuation);
            }
        } else {
            eVar2 = new e(continuation);
        }
        Object objWithContext = eVar2.f54801o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar2.f54803q;
        if (i12 == 0) {
            jn0.t.b(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            f fVar = new f(dVar, shippingInformation, eVar, null);
            eVar2.f54800n = this;
            eVar2.f54803q = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, fVar, eVar2);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            b2Var = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b2Var = (b2) eVar2.f54800n;
            jn0.t.b(objWithContext);
        }
        Object value = ((jn0.s) objWithContext).getValue();
        Object objM = p013kotlin.collections.v.m();
        if (!jn0.s.g(value)) {
            objM = value;
        }
        b2Var.shippingMethods = (List) objM;
        return value;
    }
}
