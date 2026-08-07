package g30;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B+\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\u000e2\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u000e2\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0012J\u001b\u0010\u001a\u001a\u00020\u000e2\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lg30/a;", "Lg30/c;", "Lw30/c;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lz30/d;", "durationProvider", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lw30/c;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lz30/d;Lkotlin/coroutines/CoroutineContext;)V", "Lg30/b;", "event", "Ljn0/h0;", "h", "(Lg30/b;)V", "e", "()V", "", "Lcom/stripe/android/model/PaymentMethodCode;", "code", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)V", "c", "a", "b", "Lw30/c;", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "Lz30/d;", "Lkotlin/coroutines/CoroutineContext;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w30.c analyticsRequestExecutor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final z30.d durationProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: g30.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.analytics.DefaultPaymentSessionEventReporter$fireEvent$1", f = "DefaultPaymentSessionEventReporter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C1376a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f67169n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ b f67171p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1376a(b bVar, Continuation<? super C1376a> continuation) {
            super(2, continuation);
            this.f67171p = bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new C1376a(this.f67171p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f67169n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            w30.c cVar = a.this.analyticsRequestExecutor;
            PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = a.this.paymentAnalyticsRequestFactory;
            b bVar = this.f67171p;
            cVar.a(paymentAnalyticsRequestFactory.g(bVar, bVar.a()));
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C1376a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public a(w30.c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, z30.d durationProvider, CoroutineContext workContext) {
        s.k(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.k(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        s.k(durationProvider, "durationProvider");
        s.k(workContext, "workContext");
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.durationProvider = durationProvider;
        this.workContext = workContext;
    }

    private final void h(b event) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new C1376a(event, null), 3, null);
    }

    @Override // g30.c
    public void a() {
        h(new b.a());
    }

    @Override // g30.c
    public void b(String code) {
        s.k(code, "code");
        h(new b.f(code, this.durationProvider.b(z30.d.b.ConfirmButtonClicked), null));
    }

    @Override // g30.c
    public void c(String code) {
        s.k(code, "code");
        h(new b.d(code));
    }

    @Override // g30.c
    public void d(String code) {
        s.k(code, "code");
        z30.d.a.a(this.durationProvider, z30.d.b.ConfirmButtonClicked, false, 2, null);
        h(new b.e(code));
    }

    @Override // g30.c
    public void e() {
        z30.d.a.a(this.durationProvider, z30.d.b.Loading, false, 2, null);
        h(new b.c());
    }
}
