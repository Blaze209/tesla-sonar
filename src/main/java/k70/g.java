package k70;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lk70/g;", "", "Li70/a;", "a", "()Li70/a;", "registry", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface g {

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00002\b\b\u0001\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00002\b\b\u0001\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00002\b\b\u0001\u0010\u0012\u001a\u00020\u000eH'¢\u0006\u0004\b\u0013\u0010\u0011J#\u0010\u0017\u001a\u00020\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0014H'¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00002\u000e\b\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u0019H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00002\u000e\b\u0001\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u001dH'¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u00020\u00002\b\b\u0001\u0010!\u001a\u00020\nH'¢\u0006\u0004\b\"\u0010\rJ\u0019\u0010$\u001a\u00020\u00002\b\b\u0001\u0010#\u001a\u00020\nH'¢\u0006\u0004\b$\u0010\rJ\u000f\u0010&\u001a\u00020%H&¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"Lk70/g$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "a", "(Landroid/content/Context;)Lk70/g$a;", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "g", "(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)Lk70/g$a;", "", "enableLogging", "c", "(Z)Lk70/g$a;", "Lkotlin/coroutines/CoroutineContext;", "workContext", "j", "(Lkotlin/coroutines/CoroutineContext;)Lk70/g$a;", "uiContext", "h", "", "", "threeDs1IntentReturnUrlMap", "f", "(Ljava/util/Map;)Lk70/g$a;", "Lkotlin/Function0;", "publishableKeyProvider", DateTokenConverter.CONVERTER_KEY, "(Lwn0/a;)Lk70/g$a;", "", "productUsage", "b", "(Ljava/util/Set;)Lk70/g$a;", "isInstantApp", "e", "includePaymentSheetNextHandlers", IntegerTokenConverter.CONVERTER_KEY, "Lk70/g;", "build", "()Lk70/g;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        a a(Context context);

        a b(Set<String> productUsage);

        g build();

        a c(boolean enableLogging);

        a d(wn0.a<String> publishableKeyProvider);

        a e(boolean isInstantApp);

        a f(Map<String, String> threeDs1IntentReturnUrlMap);

        a g(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory);

        a h(CoroutineContext uiContext);

        a i(boolean includePaymentSheetNextHandlers);

        a j(CoroutineContext workContext);
    }

    i70.a a();
}
