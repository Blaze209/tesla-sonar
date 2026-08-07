package i70;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.model.Source;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import jn0.h0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bo\b\u0007\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\u000e\b\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\b\u0001\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ*\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012H\u0082@¢\u0006\u0004\b\u001f\u0010 J(\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0094@¢\u0006\u0004\b\"\u0010\u001dR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010+¨\u00061"}, d2 = {"Li70/l;", "Li70/f;", "Lcom/stripe/android/model/Source;", "Lkotlin/Function1;", "Lcom/stripe/android/view/n;", "Lf30/n;", "paymentBrowserAuthStarterFactory", "Lcom/stripe/android/a;", "paymentRelayStarterFactory", "Lw30/c;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "", "enableLogging", "Lkotlin/coroutines/CoroutineContext;", "uiContext", "Lkotlin/Function0;", "", "publishableKeyProvider", "isInstantApp", "<init>", "(Lwn0/l;Lwn0/l;Lw30/c;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;ZLkotlin/coroutines/CoroutineContext;Lwn0/a;Z)V", "host", "source", "Lw30/l$c;", "requestOptions", "Ljn0/h0;", "o", "(Lcom/stripe/android/view/n;Lcom/stripe/android/model/Source;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stripeAccountId", "m", "(Lcom/stripe/android/view/n;Lcom/stripe/android/model/Source;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "actionable", "n", "a", "Lwn0/l;", "b", "c", "Lw30/c;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "e", "Z", "f", "Lkotlin/coroutines/CoroutineContext;", "g", "Lwn0/a;", "h", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l extends f<Source> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<com.stripe.android.view.n, f30.n> paymentBrowserAuthStarterFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<com.stripe.android.view.n, com.stripe.android.a> paymentRelayStarterFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w30.c analyticsRequestExecutor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean enableLogging;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext uiContext;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<String> publishableKeyProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean isInstantApp;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.payments.core.authentication.SourceNextActionHandler$bypassAuth$2", f = "SourceNextActionHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f76117n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.view.n f76119p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Source f76120q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f76121r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.stripe.android.view.n nVar, Source source, String str, Continuation<a> continuation) {
            super(2, continuation);
            this.f76119p = nVar;
            this.f76120q = source;
            this.f76121r = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return l.this.new a(this.f76119p, this.f76120q, this.f76121r, continuation);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return invoke2(coroutineScope, (Continuation<h0>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f76117n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            ((com.stripe.android.a) l.this.paymentRelayStarterFactory.invoke(this.f76119p)).a(new com.stripe.android.a.AbstractC0787a.SourceArgs(this.f76120q, this.f76121r));
            return h0.f84049a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.payments.core.authentication.SourceNextActionHandler$startSourceAuth$2", f = "SourceNextActionHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f76122n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.view.n f76124p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Source f76125q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ w30.l.Options f76126r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.stripe.android.view.n nVar, Source source, w30.l.Options options, Continuation<b> continuation) {
            super(2, continuation);
            this.f76124p = nVar;
            this.f76125q = source;
            this.f76126r = options;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return l.this.new b(this.f76124p, this.f76125q, this.f76126r, continuation);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return invoke2(coroutineScope, (Continuation<h0>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f76122n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            l.this.analyticsRequestExecutor.a(PaymentAnalyticsRequestFactory.w(l.this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.AuthSourceRedirect, null, null, null, null, null, 62, null));
            f30.n nVar = (f30.n) l.this.paymentBrowserAuthStarterFactory.invoke(this.f76124p);
            String id2 = this.f76125q.getId();
            if (id2 == null) {
                id2 = "";
            }
            String clientSecret = this.f76125q.getClientSecret();
            if (clientSecret == null) {
                clientSecret = "";
            }
            Source.Redirect redirect = this.f76125q.getRedirect();
            String url = redirect != null ? redirect.getUrl() : null;
            if (url == null) {
                url = "";
            }
            Source.Redirect redirect2 = this.f76125q.getRedirect();
            nVar.a(new PaymentBrowserAuthContract.Args(id2, 50002, clientSecret, url, redirect2 != null ? redirect2.getReturnUrl() : null, l.this.enableLogging, null, this.f76126r.getStripeAccount(), false, false, this.f76124p.getStatusBarColor(), (String) l.this.publishableKeyProvider.invoke(), l.this.isInstantApp, null, false, 25408, null));
            return h0.f84049a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public l(wn0.l<com.stripe.android.view.n, f30.n> paymentBrowserAuthStarterFactory, wn0.l<com.stripe.android.view.n, com.stripe.android.a> paymentRelayStarterFactory, w30.c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z11, CoroutineContext uiContext, wn0.a<String> publishableKeyProvider, boolean z12) {
        p013kotlin.jvm.internal.s.k(paymentBrowserAuthStarterFactory, "paymentBrowserAuthStarterFactory");
        p013kotlin.jvm.internal.s.k(paymentRelayStarterFactory, "paymentRelayStarterFactory");
        p013kotlin.jvm.internal.s.k(analyticsRequestExecutor, "analyticsRequestExecutor");
        p013kotlin.jvm.internal.s.k(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        p013kotlin.jvm.internal.s.k(uiContext, "uiContext");
        p013kotlin.jvm.internal.s.k(publishableKeyProvider, "publishableKeyProvider");
        this.paymentBrowserAuthStarterFactory = paymentBrowserAuthStarterFactory;
        this.paymentRelayStarterFactory = paymentRelayStarterFactory;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.enableLogging = z11;
        this.uiContext = uiContext;
        this.publishableKeyProvider = publishableKeyProvider;
        this.isInstantApp = z12;
    }

    private final Object m(com.stripe.android.view.n nVar, Source source, String str, Continuation<h0> continuation) {
        Object objWithContext = BuildersKt.withContext(this.uiContext, new a(nVar, source, str, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }

    private final Object o(com.stripe.android.view.n nVar, Source source, w30.l.Options options, Continuation<h0> continuation) {
        Object objWithContext = BuildersKt.withContext(this.uiContext, new b(nVar, source, options, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i70.f
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Object e(com.stripe.android.view.n nVar, Source source, w30.l.Options options, Continuation<h0> continuation) {
        if (source.getFlow() == Source.Flow.Redirect) {
            Object objO = o(nVar, source, options, continuation);
            return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : h0.f84049a;
        }
        Object objM = m(nVar, source, options.getStripeAccount(), continuation);
        return objM == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM : h0.f84049a;
    }
}
