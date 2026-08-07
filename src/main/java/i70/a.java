package i70;

import a70.Unvalidated;
import android.content.Context;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.PaymentRelayContract;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.model.Source;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 )2\u00020\u0001:\u0001\u0016BW\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012*\b\u0001\u0010\r\u001a$\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\b0\u0007j\u0002`\t\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f0\u0006\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010#R6\u0010\r\u001a$\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\b0\u0007j\u0002`\t\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R=\u0010+\u001a$\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\b0\u0007j\u0002`\t\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f0\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R*\u00104\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u00107\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010/\u001a\u0004\b.\u00101\"\u0004\b6\u00103R(\u0010<\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002090\n088@X\u0081\u0004¢\u0006\f\u0012\u0004\b;\u0010!\u001a\u0004\b'\u0010:¨\u0006="}, d2 = {"Li70/a;", "Li70/h;", "Li70/d;", "noOpIntentNextActionHandler", "Li70/l;", "sourceNextActionHandler", "", "Ljava/lang/Class;", "Lcom/stripe/android/model/StripeIntent$a;", "Lcom/stripe/android/payments/core/authentication/NextActionHandlerKey;", "Li70/f;", "Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/payments/core/authentication/NextActionHandler;", "paymentNextActionHandlers", "", "includePaymentSheetNextActionHandlers", "Landroid/content/Context;", "applicationContext", "<init>", "(Li70/d;Li70/l;Ljava/util/Map;ZLandroid/content/Context;)V", "Actionable", "actionable", "a", "(Ljava/lang/Object;)Li70/f;", "Lh/b;", "activityResultCaller", "Landroidx/activity/result/ActivityResultCallback;", "La70/c;", "activityResultCallback", "Ljn0/h0;", "b", "(Lh/b;Landroidx/activity/result/ActivityResultCallback;)V", "c", "()V", "Li70/d;", "Li70/l;", "Ljava/util/Map;", DateTokenConverter.CONVERTER_KEY, "Z", "e", "Lkotlin/Lazy;", "h", "()Ljava/util/Map;", "paymentSheetNextActionHandlers", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/a$a;", "f", "Landroidx/activity/result/ActivityResultLauncher;", "g", "()Landroidx/activity/result/ActivityResultLauncher;", "setPaymentRelayLauncher$payments_core_release", "(Landroidx/activity/result/ActivityResultLauncher;)V", "paymentRelayLauncher", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;", "setPaymentBrowserAuthLauncher$payments_core_release", "paymentBrowserAuthLauncher", "", "Lt30/f;", "()Ljava/util/Set;", "getAllNextActionHandlers$payments_core_release$annotations", "allNextActionHandlers", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements h {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f76078i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d noOpIntentNextActionHandler;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l sourceNextActionHandler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<Class<? extends StripeIntent.a>, f<StripeIntent>> paymentNextActionHandlers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean includePaymentSheetNextActionHandlers;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy paymentSheetNextActionHandlers;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private ActivityResultLauncher<com.stripe.android.a.AbstractC0787a> paymentRelayLauncher;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private ActivityResultLauncher<PaymentBrowserAuthContract.Args> paymentBrowserAuthLauncher;

    /* JADX INFO: renamed from: i70.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ju\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Li70/a$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "", "enableLogging", "Lkotlin/coroutines/CoroutineContext;", "workContext", "uiContext", "", "", "threeDs1IntentReturnUrlMap", "Lkotlin/Function0;", "publishableKeyProvider", "", "productUsage", "isInstantApp", "includePaymentSheetNextActionHandlers", "Li70/h;", "a", "(Landroid/content/Context;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;ZLkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/util/Map;Lwn0/a;Ljava/util/Set;ZZ)Li70/h;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(Context context, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean enableLogging, CoroutineContext workContext, CoroutineContext uiContext, Map<String, String> threeDs1IntentReturnUrlMap, wn0.a<String> publishableKeyProvider, Set<String> productUsage, boolean isInstantApp, boolean includePaymentSheetNextActionHandlers) {
            p013kotlin.jvm.internal.s.k(context, "context");
            p013kotlin.jvm.internal.s.k(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
            p013kotlin.jvm.internal.s.k(workContext, "workContext");
            p013kotlin.jvm.internal.s.k(uiContext, "uiContext");
            p013kotlin.jvm.internal.s.k(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
            p013kotlin.jvm.internal.s.k(publishableKeyProvider, "publishableKeyProvider");
            p013kotlin.jvm.internal.s.k(productUsage, "productUsage");
            return k70.a.a().a(context).g(paymentAnalyticsRequestFactory).c(enableLogging).j(workContext).h(uiContext).f(threeDs1IntentReturnUrlMap).d(publishableKeyProvider).b(productUsage).e(isInstantApp).i(includePaymentSheetNextActionHandlers).build().a();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a$\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001j\u0002`\u0003\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Ljava/lang/Class;", "Lcom/stripe/android/model/StripeIntent$a;", "Lcom/stripe/android/payments/core/authentication/NextActionHandlerKey;", "Li70/f;", "Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/payments/core/authentication/NextActionHandler;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.a<Map<Class<? extends StripeIntent.a>, f<StripeIntent>>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f76087d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(0);
            this.f76087d = context;
        }

        @Override // wn0.a
        public final Map<Class<? extends StripeIntent.a>, f<StripeIntent>> invoke() {
            return i70.b.b(a.this.includePaymentSheetNextActionHandlers, this.f76087d);
        }
    }

    public a(d noOpIntentNextActionHandler, l sourceNextActionHandler, Map<Class<? extends StripeIntent.a>, f<StripeIntent>> paymentNextActionHandlers, boolean z11, Context applicationContext) {
        p013kotlin.jvm.internal.s.k(noOpIntentNextActionHandler, "noOpIntentNextActionHandler");
        p013kotlin.jvm.internal.s.k(sourceNextActionHandler, "sourceNextActionHandler");
        p013kotlin.jvm.internal.s.k(paymentNextActionHandlers, "paymentNextActionHandlers");
        p013kotlin.jvm.internal.s.k(applicationContext, "applicationContext");
        this.noOpIntentNextActionHandler = noOpIntentNextActionHandler;
        this.sourceNextActionHandler = sourceNextActionHandler;
        this.paymentNextActionHandlers = paymentNextActionHandlers;
        this.includePaymentSheetNextActionHandlers = z11;
        this.paymentSheetNextActionHandlers = jn0.m.b(new b(applicationContext));
    }

    private final Map<Class<? extends StripeIntent.a>, f<StripeIntent>> h() {
        return (Map) this.paymentSheetNextActionHandlers.getValue();
    }

    @Override // i70.h
    public <Actionable> f<Actionable> a(Actionable actionable) {
        f<Actionable> fVar;
        if (!(actionable instanceof StripeIntent)) {
            if (actionable instanceof Source) {
                l lVar = this.sourceNextActionHandler;
                p013kotlin.jvm.internal.s.i(lVar, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<Actionable of com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry.getNextActionHandler>");
                return lVar;
            }
            throw new IllegalStateException(("No suitable PaymentNextActionHandler for " + actionable).toString());
        }
        StripeIntent stripeIntent = (StripeIntent) actionable;
        if (!stripeIntent.f2()) {
            d dVar = this.noOpIntentNextActionHandler;
            p013kotlin.jvm.internal.s.i(dVar, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<Actionable of com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry.getNextActionHandler>");
            return dVar;
        }
        Map mapR = v0.r(this.paymentNextActionHandlers, h());
        StripeIntent.a nextActionData = stripeIntent.getNextActionData();
        if (nextActionData == null || (fVar = (f) mapR.get(nextActionData.getClass())) == null) {
            fVar = this.noOpIntentNextActionHandler;
        }
        p013kotlin.jvm.internal.s.i(fVar, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<Actionable of com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry.getNextActionHandler>");
        return fVar;
    }

    @Override // g70.a
    public void b(h.b activityResultCaller, ActivityResultCallback<Unvalidated> activityResultCallback) {
        p013kotlin.jvm.internal.s.k(activityResultCaller, "activityResultCaller");
        p013kotlin.jvm.internal.s.k(activityResultCallback, "activityResultCallback");
        Iterator<T> it = e().iterator();
        while (it.hasNext()) {
            ((f) it.next()).b(activityResultCaller, activityResultCallback);
        }
        this.paymentRelayLauncher = activityResultCaller.registerForActivityResult(new PaymentRelayContract(), activityResultCallback);
        this.paymentBrowserAuthLauncher = activityResultCaller.registerForActivityResult(new PaymentBrowserAuthContract(), activityResultCallback);
    }

    @Override // g70.a
    public void c() {
        Iterator<T> it = e().iterator();
        while (it.hasNext()) {
            ((f) it.next()).c();
        }
        ActivityResultLauncher<com.stripe.android.a.AbstractC0787a> activityResultLauncher = this.paymentRelayLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.d();
        }
        ActivityResultLauncher<PaymentBrowserAuthContract.Args> activityResultLauncher2 = this.paymentBrowserAuthLauncher;
        if (activityResultLauncher2 != null) {
            activityResultLauncher2.d();
        }
        this.paymentRelayLauncher = null;
        this.paymentBrowserAuthLauncher = null;
    }

    public final Set<f<? extends t30.f>> e() {
        Set setB = d1.b();
        setB.add(this.noOpIntentNextActionHandler);
        setB.add(this.sourceNextActionHandler);
        setB.addAll(this.paymentNextActionHandlers.values());
        setB.addAll(h().values());
        return d1.a(setB);
    }

    public final ActivityResultLauncher<PaymentBrowserAuthContract.Args> f() {
        return this.paymentBrowserAuthLauncher;
    }

    public final ActivityResultLauncher<com.stripe.android.a.AbstractC0787a> g() {
        return this.paymentRelayLauncher;
    }
}
