package q70;

import androidx.p003lifecycle.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001\u0016B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00102\n\u0010\u0013\u001a\u00060\fj\u0002`\u0018¢\u0006\u0004\b\u0019\u0010\u0015J\u0015\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010'\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R4\u0010+\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\u00182\u000e\u0010\"\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\u00188B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u0015R4\u0010-\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\u00182\u000e\u0010\"\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\u00188B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010)\"\u0004\b,\u0010\u0015¨\u0006."}, d2 = {"Lq70/a;", "", "Landroidx/lifecycle/s0;", "savedStateHandle", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "Lkotlinx/coroutines/flow/Flow;", "Lx70/c;", "currentScreen", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlin/Function0;", "", "currentPaymentMethodTypeProvider", "<init>", "(Landroidx/lifecycle/s0;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lwn0/a;)V", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Lx70/c;)V", "code", "g", "(Ljava/lang/String;)V", "b", "()V", "Lcom/stripe/android/model/PaymentMethodCode;", "f", "hiddenScreen", "h", "a", "Landroidx/lifecycle/s0;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "c", "Lwn0/a;", "", "value", DateTokenConverter.CONVERTER_KEY, "()Z", "k", "(Z)V", "previouslySentDeepLinkEvent", "e", "()Ljava/lang/String;", "l", "previouslyShownForm", "j", "previouslyInteractedForm", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f104872e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s0 savedStateHandle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final EventReporter eventReporter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<String> currentPaymentMethodTypeProvider;

    /* JADX INFO: renamed from: q70.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.analytics.PaymentSheetAnalyticsListener$1", f = "PaymentSheetAnalyticsListener.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    static final class C2216a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f104876n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Flow<x70.c> f104877o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ a f104878p;

        /* JADX INFO: renamed from: q70.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx70/c;", AnalyticsContext.Screen, "Ljn0/h0;", "<anonymous>", "(Lx70/c;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.paymentsheet.analytics.PaymentSheetAnalyticsListener$1$1", f = "PaymentSheetAnalyticsListener.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C2217a extends SuspendLambda implements p<x70.c, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f104879n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f104880o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ a f104881p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2217a(a aVar, Continuation<? super C2217a> continuation) {
                super(2, continuation);
                this.f104881p = aVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(x70.c cVar, Continuation<? super h0> continuation) {
                return ((C2217a) create(cVar, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                C2217a c2217a = new C2217a(this.f104881p, continuation);
                c2217a.f104880o = obj;
                return c2217a;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f104879n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                this.f104881p.i((x70.c) this.f104880o);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2216a(Flow<? extends x70.c> flow, a aVar, Continuation<? super C2216a> continuation) {
            super(2, continuation);
            this.f104877o = flow;
            this.f104878p = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new C2216a(this.f104877o, this.f104878p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f104876n;
            if (i11 == 0) {
                t.b(obj);
                Flow<x70.c> flow = this.f104877o;
                C2217a c2217a = new C2217a(this.f104878p, null);
                this.f104876n = 1;
                if (FlowKt.collectLatest(flow, c2217a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C2216a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public a(s0 savedStateHandle, EventReporter eventReporter, Flow<? extends x70.c> currentScreen, CoroutineScope coroutineScope, wn0.a<String> currentPaymentMethodTypeProvider) {
        s.k(savedStateHandle, "savedStateHandle");
        s.k(eventReporter, "eventReporter");
        s.k(currentScreen, "currentScreen");
        s.k(coroutineScope, "coroutineScope");
        s.k(currentPaymentMethodTypeProvider, "currentPaymentMethodTypeProvider");
        this.savedStateHandle = savedStateHandle;
        this.eventReporter = eventReporter;
        this.currentPaymentMethodTypeProvider = currentPaymentMethodTypeProvider;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C2216a(currentScreen, this, null), 3, null);
    }

    private final String c() {
        return (String) this.savedStateHandle.f("previously_interacted_payment_form");
    }

    private final boolean d() {
        Boolean bool = (Boolean) this.savedStateHandle.f("previously_sent_deep_link_event");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final String e() {
        return (String) this.savedStateHandle.f("previously_shown_payment_form");
    }

    private final void g(String code) {
        if (s.f(e(), code)) {
            return;
        }
        this.eventReporter.j(code);
        l(code);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(x70.c currentScreen) {
        if (currentScreen instanceof x70.c.g ? true : currentScreen instanceof x70.c.l ? true : currentScreen instanceof x70.c.h ? true : currentScreen instanceof x70.c.i ? true : currentScreen instanceof x70.c.d) {
            return;
        }
        if (currentScreen instanceof x70.c.f) {
            this.eventReporter.p();
            return;
        }
        if (currentScreen instanceof x70.c.j) {
            this.eventReporter.e();
            l(null);
            j(null);
        } else {
            if (currentScreen instanceof x70.c.k) {
                this.eventReporter.w();
                return;
            }
            if (currentScreen instanceof x70.c.b ? true : currentScreen instanceof x70.c.a) {
                g(this.currentPaymentMethodTypeProvider.invoke());
                this.eventReporter.w();
            }
        }
    }

    private final void j(String str) {
        this.savedStateHandle.n("previously_interacted_payment_form", str);
    }

    private final void k(boolean z11) {
        this.savedStateHandle.n("previously_sent_deep_link_event", Boolean.valueOf(z11));
    }

    private final void l(String str) {
        this.savedStateHandle.n("previously_shown_payment_form", str);
    }

    public final void b() {
        if (d()) {
            return;
        }
        this.eventReporter.m();
        k(true);
    }

    public final void f(String code) {
        s.k(code, "code");
        if (s.f(c(), code)) {
            return;
        }
        this.eventReporter.n(code);
        j(code);
    }

    public final void h(x70.c hiddenScreen) {
        s.k(hiddenScreen, "hiddenScreen");
        if (hiddenScreen instanceof x70.c.f) {
            this.eventReporter.x();
        }
    }
}
