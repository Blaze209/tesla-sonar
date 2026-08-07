package com.stripe.android.view;

import android.app.Application;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import ezvcard.property.Kind;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.SafeContinuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u0000 <2\u00020\u0001:\u0002=>B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0080@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J,\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0013H\u0080@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0000¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u001dH\u0000¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\"\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R$\u00108\u001a\u0002022\u0006\u00103\u001a\u0002028B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010;\u001a\u0002022\u0006\u00103\u001a\u0002028B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b9\u00105\"\u0004\b:\u00107\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006?"}, d2 = {"Lcom/stripe/android/view/j;", "Landroidx/lifecycle/b;", "Landroid/app/Application;", Kind.APPLICATION, "Landroidx/lifecycle/s0;", "savedStateHandle", "Lf30/h0;", "stripe", "Lcom/stripe/android/view/b;", "args", "Lt90/a;", "errorMessageTranslator", "Lg30/c;", "eventReporter", "<init>", "(Landroid/app/Application;Landroidx/lifecycle/s0;Lf30/h0;Lcom/stripe/android/view/b;Lt90/a;Lg30/c;)V", "Lcom/stripe/android/model/w0;", "params", "Ljn0/s;", "Lcom/stripe/android/model/v0;", "h", "(Lcom/stripe/android/model/w0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "q", "(Lcom/stripe/android/model/w0;)Lcom/stripe/android/model/w0;", "Lf30/f;", "customerSession", "paymentMethod", "g", "(Lf30/f;Lcom/stripe/android/model/v0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljn0/h0;", "m", "()V", "l", "k", "n", "t", "Landroidx/lifecycle/s0;", "u", "Lf30/h0;", "v", "Lcom/stripe/android/view/b;", "w", "Lt90/a;", "x", "Lg30/c;", "", "", "y", "Ljava/util/Set;", "productUsage", "", "value", "j", "()Z", "p", "(Z)V", "formShownEventReported", IntegerTokenConverter.CONVERTER_KEY, "o", "formInteractedEventReported", "z", "a", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class j extends androidx.p003lifecycle.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final androidx.p003lifecycle.s0 savedStateHandle;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final f30.h0 stripe;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Args args;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final t90.a errorMessageTranslator;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final g30.c eventReporter;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final Set<String> productUsage;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final a f54923z = new a(null);
    public static final int A = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/stripe/android/view/j$a;", "", "<init>", "()V", "", "FORM_INTERACTED_EVENT_REPORTED_KEY", "Ljava/lang/String;", "FORM_SHOWN_EVENT_REPORTED_KEY", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\t*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/view/j$b;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lf30/h0;", "stripe", "Lcom/stripe/android/view/b;", "args", "<init>", "(Lf30/h0;Lcom/stripe/android/view/b;)V", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/c1;", "a", "Lf30/h0;", "b", "Lcom/stripe/android/view/b;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final f30.h0 stripe;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Args args;

        public b(f30.h0 stripe, Args args) {
            p013kotlin.jvm.internal.s.k(stripe, "stripe");
            p013kotlin.jvm.internal.s.k(args, "args");
            this.stripe = stripe;
            this.args = args;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends androidx.p003lifecycle.c1> T create(Class<T> modelClass, CreationExtras extras) {
            p013kotlin.jvm.internal.s.k(modelClass, "modelClass");
            p013kotlin.jvm.internal.s.k(extras, "extras");
            return new j(z30.b.a(extras), androidx.p003lifecycle.v0.a(extras), this.stripe, this.args, null, null, 48, null);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.view.AddPaymentMethodViewModel", f = "AddPaymentMethodViewModel.kt", i = {0, 0, 0}, l = {90}, m = "attachPaymentMethod-0E7RQCE$payments_core_release", n = {"this", "customerSession", "paymentMethod"}, s = {"L$0", "L$1", "L$2"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f54932n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f54933o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f54934p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f54935q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f54937s;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f54935q = obj;
            this.f54937s |= Integer.MIN_VALUE;
            Object objG = j.this.g(null, null, this);
            return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : jn0.s.a(objG);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/stripe/android/view/j$d", "Lf30/f$c;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements f30.f.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation<jn0.s<PaymentMethod>> f54938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f54939b;

        /* JADX WARN: Multi-variable type inference failed */
        d(Continuation<? super jn0.s<PaymentMethod>> continuation, j jVar) {
            this.f54938a = continuation;
            this.f54939b = jVar;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.view.AddPaymentMethodViewModel", f = "AddPaymentMethodViewModel.kt", i = {0, 0}, l = {66}, m = "createPaymentMethod-gIAlu-s$payments_core_release", n = {"this", "params"}, s = {"L$0", "L$1"})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f54940n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f54941o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f54942p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f54944r;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f54942p = obj;
            this.f54944r |= Integer.MIN_VALUE;
            Object objH = j.this.h(null, this);
            return objH == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objH : jn0.s.a(objH);
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u00042\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/stripe/android/view/j$f", "Lf30/a;", "Lcom/stripe/android/model/v0;", "result", "Ljn0/h0;", "b", "(Lcom/stripe/android/model/v0;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "onError", "(Ljava/lang/Exception;)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements f30.a<PaymentMethod> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation<jn0.s<PaymentMethod>> f54945a;

        /* JADX WARN: Multi-variable type inference failed */
        f(Continuation<? super jn0.s<PaymentMethod>> continuation) {
            this.f54945a = continuation;
        }

        @Override // f30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(PaymentMethod result) {
            p013kotlin.jvm.internal.s.k(result, "result");
            this.f54945a.resumeWith(jn0.s.b(jn0.s.a(jn0.s.b(result))));
        }

        @Override // f30.a
        public void onError(Exception e11) {
            p013kotlin.jvm.internal.s.k(e11, "e");
            Continuation<jn0.s<PaymentMethod>> continuation = this.f54945a;
            jn0.s.Companion companion = jn0.s.INSTANCE;
            continuation.resumeWith(jn0.s.b(jn0.s.a(jn0.s.b(jn0.t.a(e11)))));
        }
    }

    public /* synthetic */ j(Application application, androidx.p003lifecycle.s0 s0Var, f30.h0 h0Var, Args args, t90.a aVar, g30.c cVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, s0Var, h0Var, args, (i11 & 16) != 0 ? t90.b.f113003a.a() : aVar, (i11 & 32) != 0 ? g30.d.f67183a.a(application) : cVar);
    }

    private final boolean i() {
        Boolean bool = (Boolean) this.savedStateHandle.f("FROM_INTERACTED_EVENT_REPORTED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final boolean j() {
        Boolean bool = (Boolean) this.savedStateHandle.f("FROM_SHOWN_EVENT_REPORTED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final void o(boolean z11) {
        this.savedStateHandle.n("FROM_INTERACTED_EVENT_REPORTED", Boolean.valueOf(z11));
    }

    private final void p(boolean z11) {
        this.savedStateHandle.n("FROM_SHOWN_EVENT_REPORTED", Boolean.valueOf(z11));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final /* synthetic */ Object g(f30.f fVar, PaymentMethod paymentMethod, Continuation continuation) throws Throwable {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f54937s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f54937s = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object orThrow = cVar.f54935q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f54937s;
        if (i12 == 0) {
            jn0.t.b(orThrow);
            cVar.f54932n = this;
            cVar.f54933o = fVar;
            cVar.f54934p = paymentMethod;
            cVar.f54937s = 1;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(cVar));
            String str = paymentMethod.id;
            if (str == null) {
                str = "";
            }
            fVar.b(str, this.productUsage, new d(safeContinuation, this));
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(PaymentMethodCreateParams paymentMethodCreateParams, Continuation<? super jn0.s<PaymentMethod>> continuation) throws Throwable {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f54944r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f54944r = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object orThrow = eVar.f54942p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar.f54944r;
        if (i12 == 0) {
            jn0.t.b(orThrow);
            eVar.f54940n = this;
            eVar.f54941o = paymentMethodCreateParams;
            eVar.f54944r = 1;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(eVar));
            f30.h0.h(this.stripe, q(paymentMethodCreateParams), null, null, new f(safeContinuation), 6, null);
            orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(eVar);
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

    public final void k() {
        this.eventReporter.a();
    }

    public final void l() {
        if (i()) {
            return;
        }
        this.eventReporter.c(this.args.getPaymentMethodType().code);
        o(true);
    }

    public final void m() {
        if (j()) {
            return;
        }
        this.eventReporter.d(this.args.getPaymentMethodType().code);
        p(true);
    }

    public final void n() {
        this.eventReporter.b(this.args.getPaymentMethodType().code);
    }

    public final PaymentMethodCreateParams q(PaymentMethodCreateParams params) {
        p013kotlin.jvm.internal.s.k(params, "params");
        return PaymentMethodCreateParams.d(params, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.productUsage, null, 786431, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Application application, androidx.p003lifecycle.s0 savedStateHandle, f30.h0 stripe, Args args, t90.a errorMessageTranslator, g30.c eventReporter) {
        super(application);
        p013kotlin.jvm.internal.s.k(application, "application");
        p013kotlin.jvm.internal.s.k(savedStateHandle, "savedStateHandle");
        p013kotlin.jvm.internal.s.k(stripe, "stripe");
        p013kotlin.jvm.internal.s.k(args, "args");
        p013kotlin.jvm.internal.s.k(errorMessageTranslator, "errorMessageTranslator");
        p013kotlin.jvm.internal.s.k(eventReporter, "eventReporter");
        this.savedStateHandle = savedStateHandle;
        this.stripe = stripe;
        this.args = args;
        this.errorMessageTranslator = errorMessageTranslator;
        this.eventReporter = eventReporter;
        this.productUsage = p013kotlin.collections.v.r1(p013kotlin.collections.v.r("AddPaymentMethodActivity", args.getIsPaymentSessionActive() ? "PaymentSession" : null));
        g30.g.f67187a.c(this, savedStateHandle);
        if (j()) {
            return;
        }
        eventReporter.d(args.getPaymentMethodType().code);
        p(true);
    }
}
