package de;

import android.app.Application;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import ezvcard.property.Kind;
import java.util.Locale;
import ke.AnalyticsParams;
import ke.i;
import me.Environment;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJY\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lde/b;", "", "<init>", "()V", "Lke/i;", "componentParams", "Landroid/app/Application;", Kind.APPLICATION, "Lde/e;", "source", "", "sessionId", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "b", "(Lke/i;Landroid/app/Application;Lde/e;Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Ljava/util/Locale;", "shopperLocale", "Lme/c;", AnalyticsAttribute.Environment, "clientKey", "Lke/a;", "analyticsParams", "", "isCreatedByDropIn", "Lcom/adyen/checkout/components/core/Amount;", "amount", "a", "(Ljava/util/Locale;Lme/c;Ljava/lang/String;Lke/a;ZLcom/adyen/checkout/components/core/Amount;Landroid/app/Application;Lde/e;Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {
    public final AnalyticsManager a(Locale shopperLocale, Environment environment, String clientKey, AnalyticsParams analyticsParams, boolean isCreatedByDropIn, Amount amount, Application application, e source, String sessionId) {
        s.k(shopperLocale, "shopperLocale");
        s.k(environment, "environment");
        s.k(clientKey, "clientKey");
        s.k(analyticsParams, "analyticsParams");
        s.k(application, "application");
        s.k(source, "source");
        return new g(new ee.b(new fe.b(), new fe.c(), new ge.d(new he.a(ne.c.f93890a.a(environment), null, 2, null), clientKey, 50, 5), new ge.e(application, shopperLocale, isCreatedByDropIn, amount, source, sessionId), new ge.c()), analyticsParams, null, 4, null);
    }

    public final AnalyticsManager b(i componentParams, Application application, e source, String sessionId) {
        s.k(componentParams, "componentParams");
        s.k(application, "application");
        s.k(source, "source");
        return a(componentParams.getShopperLocale(), componentParams.getEnvironment(), componentParams.getClientKey(), componentParams.getAnalyticsParams(), componentParams.getIsCreatedByDropIn(), componentParams.getAmount(), application, source, sessionId);
    }
}
