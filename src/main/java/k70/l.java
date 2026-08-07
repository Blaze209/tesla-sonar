package k70;

import a70.DefaultReturnUrl;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0085\u0001\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u000e\b\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\u000e\b\u0001\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00172\b\b\u0001\u0010\u0019\u001a\u00020\r2\b\b\u0001\u0010\u001a\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lk70/l;", "", "<init>", "()V", "", "", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/Map;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "La70/a;", "a", "(Landroid/content/Context;)La70/a;", "", "enableLogging", "Lkotlin/coroutines/CoroutineContext;", "workContext", "uiContext", "threeDs1IntentReturnUrlMap", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lkotlin/Function0;", "publishableKeyProvider", "", "productUsage", "isInstantApp", "includePaymentSheetNextHandlers", "Li70/h;", "c", "(Landroid/content/Context;ZLkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/util/Map;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lwn0/a;Ljava/util/Set;ZZ)Li70/h;", "b", "(Landroid/content/Context;)Z", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l {
    public final DefaultReturnUrl a(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        return DefaultReturnUrl.INSTANCE.a(context);
    }

    public final boolean b(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        return xs.a.c(context);
    }

    public final i70.h c(Context context, boolean enableLogging, CoroutineContext workContext, CoroutineContext uiContext, Map<String, String> threeDs1IntentReturnUrlMap, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, wn0.a<String> publishableKeyProvider, Set<String> productUsage, boolean isInstantApp, boolean includePaymentSheetNextHandlers) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        p013kotlin.jvm.internal.s.k(uiContext, "uiContext");
        p013kotlin.jvm.internal.s.k(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
        p013kotlin.jvm.internal.s.k(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        p013kotlin.jvm.internal.s.k(publishableKeyProvider, "publishableKeyProvider");
        p013kotlin.jvm.internal.s.k(productUsage, "productUsage");
        return i70.a.INSTANCE.a(context, paymentAnalyticsRequestFactory, enableLogging, workContext, uiContext, threeDs1IntentReturnUrlMap, publishableKeyProvider, productUsage, isInstantApp, includePaymentSheetNextHandlers);
    }

    public final Map<String, String> d() {
        return new LinkedHashMap();
    }
}
