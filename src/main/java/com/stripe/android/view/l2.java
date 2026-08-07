package com.stripe.android.view;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.model.PaymentMethod;
import ezvcard.property.Kind;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001:\u0001JBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001d\u0010\u001cR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010.\u001a\n +*\u0004\u0018\u00010*0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R \u0010<\u001a\b\u0012\u0004\u0012\u00020\t078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R.\u0010C\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110>\u0018\u00010\u00060=8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\"\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0=8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010@\u001a\u0004\bE\u0010BR \u0010I\u001a\b\u0012\u0004\u0012\u00020\u000b0=8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010@\u001a\u0004\bH\u0010B\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006K"}, d2 = {"Lcom/stripe/android/view/l2;", "Landroidx/lifecycle/b;", "Landroid/app/Application;", Kind.APPLICATION, "Landroidx/lifecycle/s0;", "savedStateHandle", "Ljn0/s;", "Lf30/f;", "customerSession", "", "selectedPaymentMethodId", "", "startedFromPaymentSession", "Lg30/c;", "eventReporter", "<init>", "(Landroid/app/Application;Landroidx/lifecycle/s0;Ljava/lang/Object;Ljava/lang/String;ZLg30/c;)V", "Lcom/stripe/android/model/v0;", "paymentMethod", "", "stringRes", "h", "(Lcom/stripe/android/model/v0;I)Ljava/lang/String;", "isInitialFetch", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Z)V", "o", "(Lcom/stripe/android/model/v0;)V", "p", "t", "Ljava/lang/Object;", "u", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "q", "(Ljava/lang/String;)V", "v", "Z", "w", "Lg30/c;", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "x", "Landroid/content/res/Resources;", "resources", "Lcom/stripe/android/view/y;", "y", "Lcom/stripe/android/view/y;", "cardDisplayTextFactory", "Lkotlinx/coroutines/Job;", "z", "Lkotlinx/coroutines/Job;", "paymentMethodsJob", "", "A", "Ljava/util/Set;", "k", "()Ljava/util/Set;", "productUsage", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "B", "Lkotlinx/coroutines/flow/MutableStateFlow;", "j", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "paymentMethodsData", "C", "n", "snackbarData", "D", "l", "progressData", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l2 extends androidx.p003lifecycle.b {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final Set<String> productUsage;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final MutableStateFlow<jn0.s<List<PaymentMethod>>> paymentMethodsData;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final MutableStateFlow<String> snackbarData;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final MutableStateFlow<Boolean> progressData;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Object customerSession;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private String selectedPaymentMethodId;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final boolean startedFromPaymentSession;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final g30.c eventReporter;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Resources resources;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final y cardDisplayTextFactory;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private volatile Job paymentMethodsJob;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/view/l2$a;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroid/app/Application;", Kind.APPLICATION, "Ljn0/s;", "Lf30/f;", "customerSession", "", "initialPaymentMethodId", "", "startedFromPaymentSession", "<init>", "(Landroid/app/Application;Ljava/lang/Object;Ljava/lang/String;Z)V", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/c1;", "a", "Landroid/app/Application;", "b", "Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "e", "Z", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Application application;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Object customerSession;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String initialPaymentMethodId;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean startedFromPaymentSession;

        public a(Application application, Object obj, String str, boolean z11) {
            p013kotlin.jvm.internal.s.k(application, "application");
            this.application = application;
            this.customerSession = obj;
            this.initialPaymentMethodId = str;
            this.startedFromPaymentSession = z11;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends androidx.p003lifecycle.c1> T create(Class<T> modelClass, CreationExtras extras) {
            p013kotlin.jvm.internal.s.k(modelClass, "modelClass");
            p013kotlin.jvm.internal.s.k(extras, "extras");
            return new l2(this.application, androidx.p003lifecycle.v0.a(extras), this.customerSession, this.initialPaymentMethodId, this.startedFromPaymentSession, null, 32, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.view.PaymentMethodsViewModel$getPaymentMethods$1", f = "PaymentMethodsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f54991n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f54993p;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/stripe/android/view/l2$b$a", "", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements f30.f.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f54994a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l2 f54995b;

            a(boolean z11, l2 l2Var) {
                this.f54994a = z11;
                this.f54995b = l2Var;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z11, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f54993p = z11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return l2.this.new b(this.f54993p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f54991n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            l2.this.l().setValue(Boxing.boxBoolean(true));
            Object obj2 = l2.this.customerSession;
            l2 l2Var = l2.this;
            boolean z11 = this.f54993p;
            Throwable thE = jn0.s.e(obj2);
            if (thE == null) {
                f30.f.e((f30.f) obj2, PaymentMethod.p.Card, null, null, null, l2Var.k(), new a(z11, l2Var), 14, null);
            } else {
                l2Var.j().setValue(jn0.s.a(jn0.s.b(jn0.t.a(thE))));
                l2Var.l().setValue(Boxing.boxBoolean(false));
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l2(Application application, androidx.p003lifecycle.s0 s0Var, Object obj, String str, boolean z11, g30.c cVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        String str2 = (i11 & 8) != 0 ? null : str;
        if ((i11 & 32) != 0) {
            g30.d dVar = g30.d.f67183a;
            Context applicationContext = application.getApplicationContext();
            p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
            cVar = dVar.a(applicationContext);
        }
        this(application, s0Var, obj, str2, z11, cVar);
    }

    private final String h(PaymentMethod paymentMethod, int stringRes) {
        PaymentMethod.Card card = paymentMethod.card;
        if (card != null) {
            return this.resources.getString(stringRes, this.cardDisplayTextFactory.b(card));
        }
        return null;
    }

    private final void i(boolean isInitialFetch) {
        Job job = this.paymentMethodsJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        if (isInitialFetch) {
            this.eventReporter.e();
        }
        this.paymentMethodsJob = BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(this), null, null, new b(isInitialFetch, null), 3, null);
    }

    public final MutableStateFlow<jn0.s<List<PaymentMethod>>> j() {
        return this.paymentMethodsData;
    }

    public final Set<String> k() {
        return this.productUsage;
    }

    public final MutableStateFlow<Boolean> l() {
        return this.progressData;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getSelectedPaymentMethodId() {
        return this.selectedPaymentMethodId;
    }

    public final MutableStateFlow<String> n() {
        return this.snackbarData;
    }

    public final void o(PaymentMethod paymentMethod) {
        p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
        String strH = h(paymentMethod, f30.d0.f63944f);
        if (strH != null) {
            this.snackbarData.setValue(strH);
            this.snackbarData.setValue(null);
        }
        i(false);
    }

    public final void p(PaymentMethod paymentMethod) {
        p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
        String strH = h(paymentMethod, f30.d0.I0);
        if (strH != null) {
            this.snackbarData.setValue(strH);
            this.snackbarData.setValue(null);
        }
    }

    public final void q(String str) {
        this.selectedPaymentMethodId = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(Application application, androidx.p003lifecycle.s0 savedStateHandle, Object obj, String str, boolean z11, g30.c eventReporter) {
        super(application);
        p013kotlin.jvm.internal.s.k(application, "application");
        p013kotlin.jvm.internal.s.k(savedStateHandle, "savedStateHandle");
        p013kotlin.jvm.internal.s.k(eventReporter, "eventReporter");
        this.customerSession = obj;
        this.selectedPaymentMethodId = str;
        this.startedFromPaymentSession = z11;
        this.eventReporter = eventReporter;
        this.resources = application.getResources();
        this.cardDisplayTextFactory = new y(application);
        this.productUsage = p013kotlin.collections.v.r1(p013kotlin.collections.v.r(z11 ? "PaymentSession" : null, "PaymentMethodsActivity"));
        this.paymentMethodsData = StateFlowKt.MutableStateFlow(null);
        this.snackbarData = StateFlowKt.MutableStateFlow(null);
        this.progressData = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        g30.g.f67187a.c(this, savedStateHandle);
        i(true);
    }
}
