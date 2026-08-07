package i70;

import a70.DefaultReturnUrl;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Map;
import jn0.h0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u007f\b\u0007\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u000e\b\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJt\u0010(\u001a\u00020'2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u00102\u0006\u0010&\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b(\u0010)J\u001b\u0010-\u001a\u00020,*\u00020*2\u0006\u0010+\u001a\u00020\u0002H\u0002¢\u0006\u0004\b-\u0010.J\u001c\u00100\u001a\u00020,*\u00020/2\u0006\u0010+\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b0\u00101J\u0013\u00103\u001a\u00020,*\u000202H\u0002¢\u0006\u0004\b3\u00104J\u001b\u00106\u001a\u00020,*\u0002052\u0006\u0010+\u001a\u00020\u0002H\u0002¢\u0006\u0004\b6\u00107J\u0013\u00109\u001a\u00020,*\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u0013\u0010<\u001a\u00020,*\u00020;H\u0002¢\u0006\u0004\b<\u0010=J(\u0010@\u001a\u00020'2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00022\u0006\u0010?\u001a\u00020>H\u0094@¢\u0006\u0004\b@\u0010AR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010IR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006U"}, d2 = {"Li70/s;", "Li70/f;", "Lcom/stripe/android/model/StripeIntent;", "Lkotlin/Function1;", "Lcom/stripe/android/view/n;", "Lf30/n;", "paymentBrowserAuthStarterFactory", "Lw30/c;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "", "enableLogging", "Lkotlin/coroutines/CoroutineContext;", "uiContext", "", "", "threeDs1IntentReturnUrlMap", "Lkotlin/Function0;", "publishableKeyProvider", "isInstantApp", "La70/a;", "defaultReturnUrl", "Li70/k;", "redirectResolver", "<init>", "(Lwn0/l;Lw30/c;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;ZLkotlin/coroutines/CoroutineContext;Ljava/util/Map;Lwn0/a;ZLa70/a;Li70/k;)V", "host", "stripeIntent", "", "requestCode", "clientSecret", "authUrl", "stripeAccount", "returnUrl", "shouldCancelSource", "shouldCancelIntentOnUserNavigation", "referrer", "forceInAppWebView", "Ljn0/h0;", "k", "(Lcom/stripe/android/view/n;Lcom/stripe/android/model/StripeIntent;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/StripeIntent$a$j$a;", "actionable", "Li70/r;", "p", "(Lcom/stripe/android/model/StripeIntent$a$j$a;Lcom/stripe/android/model/StripeIntent;)Li70/r;", "Lcom/stripe/android/model/StripeIntent$a$i;", "r", "(Lcom/stripe/android/model/StripeIntent$a$i;Lcom/stripe/android/model/StripeIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/StripeIntent$a$a;", "m", "(Lcom/stripe/android/model/StripeIntent$a$a;)Li70/r;", "Lcom/stripe/android/model/StripeIntent$a$h;", "o", "(Lcom/stripe/android/model/StripeIntent$a$h;Lcom/stripe/android/model/StripeIntent;)Li70/r;", "Lcom/stripe/android/model/StripeIntent$a$c;", "n", "(Lcom/stripe/android/model/StripeIntent$a$c;)Li70/r;", "Lcom/stripe/android/model/StripeIntent$a$k;", "q", "(Lcom/stripe/android/model/StripeIntent$a$k;)Li70/r;", "Lw30/l$c;", "requestOptions", "l", "(Lcom/stripe/android/view/n;Lcom/stripe/android/model/StripeIntent;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lwn0/l;", "b", "Lw30/c;", "c", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", DateTokenConverter.CONVERTER_KEY, "Z", "e", "Lkotlin/coroutines/CoroutineContext;", "f", "Ljava/util/Map;", "g", "Lwn0/a;", "h", IntegerTokenConverter.CONVERTER_KEY, "La70/a;", "j", "Li70/k;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class s extends f<StripeIntent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<com.stripe.android.view.n, f30.n> paymentBrowserAuthStarterFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w30.c analyticsRequestExecutor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean enableLogging;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext uiContext;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> threeDs1IntentReturnUrlMap;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<String> publishableKeyProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean isInstantApp;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final DefaultReturnUrl defaultReturnUrl;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k redirectResolver;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.payments.core.authentication.WebIntentNextActionHandler$beginWebAuth$2", f = "WebIntentNextActionHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f76161n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.view.n f76163p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ StripeIntent f76164q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f76165r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f76166s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f76167t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ String f76168u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ String f76169v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ boolean f76170w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ boolean f76171x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ String f76172y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ boolean f76173z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.stripe.android.view.n nVar, StripeIntent stripeIntent, int i11, String str, String str2, String str3, String str4, boolean z11, boolean z12, String str5, boolean z13, Continuation<a> continuation) {
            super(2, continuation);
            this.f76163p = nVar;
            this.f76164q = stripeIntent;
            this.f76165r = i11;
            this.f76166s = str;
            this.f76167t = str2;
            this.f76168u = str3;
            this.f76169v = str4;
            this.f76170w = z11;
            this.f76171x = z12;
            this.f76172y = str5;
            this.f76173z = z13;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return s.this.new a(this.f76163p, this.f76164q, this.f76165r, this.f76166s, this.f76167t, this.f76168u, this.f76169v, this.f76170w, this.f76171x, this.f76172y, this.f76173z, continuation);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return invoke2(coroutineScope, (Continuation<h0>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f76161n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            f30.n nVar = (f30.n) s.this.paymentBrowserAuthStarterFactory.invoke(this.f76163p);
            String id2 = this.f76164q.getId();
            if (id2 == null) {
                id2 = "";
            }
            nVar.a(new PaymentBrowserAuthContract.Args(id2, this.f76165r, this.f76166s, this.f76167t, this.f76168u, s.this.enableLogging, null, this.f76169v, this.f76170w, this.f76171x, this.f76163p.getStatusBarColor(), (String) s.this.publishableKeyProvider.invoke(), s.this.isInstantApp, this.f76172y, this.f76173z, 64, null));
            return h0.f84049a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.core.authentication.WebIntentNextActionHandler", f = "WebIntentNextActionHandler.kt", i = {0, 0, 0, 0}, l = {54, 73}, m = "performNextActionOnResumed", n = {"this", "host", "actionable", "requestOptions"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f76174n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f76175o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f76176p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f76177q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f76178r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f76180t;

        b(Continuation<b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f76178r = obj;
            this.f76180t |= Integer.MIN_VALUE;
            return s.this.e(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.core.authentication.WebIntentNextActionHandler", f = "WebIntentNextActionHandler.kt", i = {0}, l = {146}, m = "webAuthParams", n = {"$this$webAuthParams"}, s = {"L$0"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f76181n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f76182o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f76184q;

        c(Continuation<c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f76182o = obj;
            this.f76184q |= Integer.MIN_VALUE;
            return s.this.r(null, null, this);
        }
    }

    public s(wn0.l<com.stripe.android.view.n, f30.n> paymentBrowserAuthStarterFactory, w30.c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z11, CoroutineContext uiContext, Map<String, String> threeDs1IntentReturnUrlMap, wn0.a<String> publishableKeyProvider, boolean z12, DefaultReturnUrl defaultReturnUrl, k redirectResolver) {
        p013kotlin.jvm.internal.s.k(paymentBrowserAuthStarterFactory, "paymentBrowserAuthStarterFactory");
        p013kotlin.jvm.internal.s.k(analyticsRequestExecutor, "analyticsRequestExecutor");
        p013kotlin.jvm.internal.s.k(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        p013kotlin.jvm.internal.s.k(uiContext, "uiContext");
        p013kotlin.jvm.internal.s.k(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
        p013kotlin.jvm.internal.s.k(publishableKeyProvider, "publishableKeyProvider");
        p013kotlin.jvm.internal.s.k(defaultReturnUrl, "defaultReturnUrl");
        p013kotlin.jvm.internal.s.k(redirectResolver, "redirectResolver");
        this.paymentBrowserAuthStarterFactory = paymentBrowserAuthStarterFactory;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.enableLogging = z11;
        this.uiContext = uiContext;
        this.threeDs1IntentReturnUrlMap = threeDs1IntentReturnUrlMap;
        this.publishableKeyProvider = publishableKeyProvider;
        this.isInstantApp = z12;
        this.defaultReturnUrl = defaultReturnUrl;
        this.redirectResolver = redirectResolver;
    }

    private final Object k(com.stripe.android.view.n nVar, StripeIntent stripeIntent, int i11, String str, String str2, String str3, String str4, boolean z11, boolean z12, String str5, boolean z13, Continuation<h0> continuation) {
        Object objWithContext = BuildersKt.withContext(this.uiContext, new a(nVar, stripeIntent, i11, str, str2, str4, str3, z11, z12, str5, z13, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }

    private final WebAuthParams m(StripeIntent.a.AlipayRedirect alipayRedirect) {
        this.analyticsRequestExecutor.a(PaymentAnalyticsRequestFactory.w(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.AuthRedirect, null, null, null, null, null, 62, null));
        String string = alipayRedirect.getWebViewUrl().toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        return new WebAuthParams(string, alipayRedirect.getReturnUrl(), false, false, null, false, 60, null);
    }

    private final WebAuthParams n(StripeIntent.a.CashAppRedirect cashAppRedirect) {
        return new WebAuthParams(cashAppRedirect.getMobileAuthUrl(), this.defaultReturnUrl.a(), false, false, null, false, 52, null);
    }

    private final WebAuthParams o(StripeIntent.a.h hVar, StripeIntent stripeIntent) {
        String hostedVoucherUrl = hVar.getHostedVoucherUrl();
        p013kotlin.jvm.internal.s.h(hostedVoucherUrl);
        String str = hostedVoucherUrl.length() > 0 ? hostedVoucherUrl : null;
        if (str != null) {
            return new WebAuthParams(str, null, false, false, null, false, 52, null);
        }
        StripeIntent.NextActionType nextActionTypeP0 = stripeIntent.P0();
        throw new IllegalArgumentException("null hostedVoucherUrl for " + (nextActionTypeP0 != null ? nextActionTypeP0.getCode() : null));
    }

    private final WebAuthParams p(StripeIntent.a.j.Use3DS1 use3DS1, StripeIntent stripeIntent) {
        this.analyticsRequestExecutor.a(PaymentAnalyticsRequestFactory.w(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds1Sdk, null, null, null, null, null, 62, null));
        String url = use3DS1.getUrl();
        String id2 = stripeIntent.getId();
        return new WebAuthParams(url, id2 != null ? this.threeDs1IntentReturnUrlMap.remove(id2) : null, true, false, null, false, 56, null);
    }

    private final WebAuthParams q(StripeIntent.a.SwishRedirect swishRedirect) {
        return new WebAuthParams(swishRedirect.getMobileAuthUrl(), this.defaultReturnUrl.a(), false, false, null, false, 52, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object r(StripeIntent.a.RedirectToUrl redirectToUrl, StripeIntent stripeIntent, Continuation<WebAuthParams> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f76184q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f76184q = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objA = cVar.f76182o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f76184q;
        if (i12 == 0) {
            jn0.t.b(objA);
            this.analyticsRequestExecutor.a(PaymentAnalyticsRequestFactory.w(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.AuthRedirect, null, null, null, null, null, 62, null));
            PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
            if (!p013kotlin.jvm.internal.s.f(paymentMethod != null ? paymentMethod.code : null, PaymentMethod.p.WeChatPay.code)) {
                String string = redirectToUrl.getUrl().toString();
                p013kotlin.jvm.internal.s.j(string, "toString(...)");
                return new WebAuthParams(string, redirectToUrl.getReturnUrl(), false, false, null, false, 60, null);
            }
            k kVar = this.redirectResolver;
            String string2 = redirectToUrl.getUrl().toString();
            p013kotlin.jvm.internal.s.j(string2, "toString(...)");
            cVar.f76181n = redirectToUrl;
            cVar.f76184q = 1;
            objA = kVar.a(string2, cVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            redirectToUrl = (StripeIntent.a.RedirectToUrl) cVar.f76181n;
            jn0.t.b(objA);
        }
        return new WebAuthParams((String) objA, redirectToUrl.getReturnUrl(), false, false, redirectToUrl.getUrl().toString(), true, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // i70.f
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Object e(com.stripe.android.view.n nVar, StripeIntent stripeIntent, w30.l.Options options, Continuation<h0> continuation) {
        b bVar;
        com.stripe.android.view.n nVar2;
        w30.l.Options options2;
        WebAuthParams webAuthParamsQ;
        s sVar;
        int iC;
        String clientSecret;
        String authUrl;
        String stripeAccount;
        String returnUrl;
        boolean shouldCancelSource;
        boolean shouldCancelIntentOnUserNavigation;
        String referrer;
        boolean forceInAppWebView;
        StripeIntent stripeIntent2 = stripeIntent;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f76180t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f76180t = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objR = bVar.f76178r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f76180t;
        if (i12 != 0) {
            if (i12 == 1) {
                w30.l.Options options3 = (w30.l.Options) bVar.f76177q;
                StripeIntent stripeIntent3 = (StripeIntent) bVar.f76176p;
                com.stripe.android.view.n nVar3 = (com.stripe.android.view.n) bVar.f76175o;
                s sVar2 = (s) bVar.f76174n;
                jn0.t.b(objR);
                options2 = options3;
                stripeIntent2 = stripeIntent3;
                nVar2 = nVar3;
                sVar = sVar2;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(objR);
            }
            return h0.f84049a;
        }
        jn0.t.b(objR);
        Object nextActionData = stripeIntent2.getNextActionData();
        if (nextActionData instanceof StripeIntent.a.j.Use3DS1) {
            webAuthParamsQ = p((StripeIntent.a.j.Use3DS1) nextActionData, stripeIntent2);
            nVar2 = nVar;
            options2 = options;
        } else if (nextActionData instanceof StripeIntent.a.RedirectToUrl) {
            bVar.f76174n = this;
            nVar2 = nVar;
            bVar.f76175o = nVar2;
            bVar.f76176p = stripeIntent2;
            options2 = options;
            bVar.f76177q = options2;
            bVar.f76180t = 1;
            objR = r((StripeIntent.a.RedirectToUrl) nextActionData, stripeIntent2, bVar);
            if (objR == coroutine_suspended) {
                return coroutine_suspended;
            }
            sVar = this;
        } else {
            nVar2 = nVar;
            options2 = options;
            if (nextActionData instanceof StripeIntent.a.AlipayRedirect) {
                webAuthParamsQ = m((StripeIntent.a.AlipayRedirect) nextActionData);
            } else if (nextActionData instanceof StripeIntent.a.h) {
                webAuthParamsQ = o((StripeIntent.a.h) nextActionData, stripeIntent2);
            } else if (nextActionData instanceof StripeIntent.a.CashAppRedirect) {
                webAuthParamsQ = n((StripeIntent.a.CashAppRedirect) nextActionData);
            } else {
                if (!(nextActionData instanceof StripeIntent.a.SwishRedirect)) {
                    throw new IllegalArgumentException("WebAuthenticator can't process nextActionData: " + nextActionData);
                }
                webAuthParamsQ = q((StripeIntent.a.SwishRedirect) nextActionData);
            }
        }
        sVar = this;
        iC = com.stripe.android.b.INSTANCE.c(stripeIntent2);
        clientSecret = stripeIntent2.getClientSecret();
        if (clientSecret == null) {
            clientSecret = "";
        }
        authUrl = webAuthParamsQ.getAuthUrl();
        stripeAccount = options2.getStripeAccount();
        returnUrl = webAuthParamsQ.getReturnUrl();
        shouldCancelSource = webAuthParamsQ.getShouldCancelSource();
        shouldCancelIntentOnUserNavigation = webAuthParamsQ.getShouldCancelIntentOnUserNavigation();
        referrer = webAuthParamsQ.getReferrer();
        forceInAppWebView = webAuthParamsQ.getForceInAppWebView();
        bVar.f76174n = null;
        bVar.f76175o = null;
        bVar.f76176p = null;
        bVar.f76177q = null;
        bVar.f76180t = 2;
        if (sVar.k(nVar2, stripeIntent2, iC, clientSecret, authUrl, stripeAccount, returnUrl, shouldCancelSource, shouldCancelIntentOnUserNavigation, referrer, forceInAppWebView, bVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return h0.f84049a;
        webAuthParamsQ = (WebAuthParams) objR;
        iC = com.stripe.android.b.INSTANCE.c(stripeIntent2);
        clientSecret = stripeIntent2.getClientSecret();
        if (clientSecret == null) {
            clientSecret = "";
        }
        authUrl = webAuthParamsQ.getAuthUrl();
        stripeAccount = options2.getStripeAccount();
        returnUrl = webAuthParamsQ.getReturnUrl();
        shouldCancelSource = webAuthParamsQ.getShouldCancelSource();
        shouldCancelIntentOnUserNavigation = webAuthParamsQ.getShouldCancelIntentOnUserNavigation();
        referrer = webAuthParamsQ.getReferrer();
        forceInAppWebView = webAuthParamsQ.getForceInAppWebView();
        bVar.f76174n = null;
        bVar.f76175o = null;
        bVar.f76176p = null;
        bVar.f76177q = null;
        bVar.f76180t = 2;
        if (sVar.k(nVar2, stripeIntent2, iC, clientSecret, authUrl, stripeAccount, returnUrl, shouldCancelSource, shouldCancelIntentOnUserNavigation, referrer, forceInAppWebView, bVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return h0.f84049a;
    }
}
