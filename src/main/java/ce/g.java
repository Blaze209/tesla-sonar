package ce;

import android.content.Context;
import be.AnalyticsConfiguration;
import ce.g;
import ce.k;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.core.exception.CheckoutException;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Locale;
import me.Environment;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u00020\u0004B!\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\rB!\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u0010J\u0015\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00028\u0000H$¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u0018R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\b\u001a\u00020\u00078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\n\u001a\u00020\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u00100\u001a\u0004\u0018\u00010*8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-\"\u0004\b.\u0010/R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b&\u00101\u001a\u0004\b$\u00102\"\u0004\b3\u00104¨\u00065"}, d2 = {"Lce/g;", "Lce/k;", "ConfigurationT", "BuilderT", "", "Ljava/util/Locale;", "shopperLocale", "Lme/c;", AnalyticsAttribute.Environment, "", "clientKey", "<init>", "(Ljava/util/Locale;Lme/c;Ljava/lang/String;)V", "(Lme/c;Ljava/lang/String;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;Lme/c;Ljava/lang/String;)V", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/util/Locale;)Lce/g;", "Lcom/adyen/checkout/components/core/Amount;", "amount", "h", "(Lcom/adyen/checkout/components/core/Amount;)Lce/g;", "b", "()Lce/k;", "a", "Ljava/util/Locale;", "g", "()Ljava/util/Locale;", "setShopperLocale", "(Ljava/util/Locale;)V", "Lme/c;", "f", "()Lme/c;", "setEnvironment", "(Lme/c;)V", "c", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "setClientKey", "(Ljava/lang/String;)V", "Lbe/b;", DateTokenConverter.CONVERTER_KEY, "Lbe/b;", "()Lbe/b;", "setAnalyticsConfiguration", "(Lbe/b;)V", "analyticsConfiguration", "Lcom/adyen/checkout/components/core/Amount;", "()Lcom/adyen/checkout/components/core/Amount;", "setAmount", "(Lcom/adyen/checkout/components/core/Amount;)V", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class g<ConfigurationT extends k, BuilderT extends g<ConfigurationT, BuilderT>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Locale shopperLocale;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Environment environment;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String clientKey;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private AnalyticsConfiguration analyticsConfiguration;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Amount amount;

    public g(Locale locale, Environment environment, String clientKey) {
        p013kotlin.jvm.internal.s.k(environment, "environment");
        p013kotlin.jvm.internal.s.k(clientKey, "clientKey");
        this.shopperLocale = locale;
        this.environment = environment;
        this.clientKey = clientKey;
        if (!le.i.f89954a.a(clientKey, environment)) {
            throw new CheckoutException("Client key is not valid.", null, 2, null);
        }
    }

    public final ConfigurationT a() {
        Locale locale = this.shopperLocale;
        if (locale == null || re.b.a(locale)) {
            return (ConfigurationT) b();
        }
        throw new CheckoutException("Invalid shopper locale: " + this.shopperLocale + ".", null, 2, null);
    }

    protected abstract ConfigurationT b();

    /* JADX INFO: renamed from: c, reason: from getter */
    protected final Amount getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    protected final AnalyticsConfiguration getAnalyticsConfiguration() {
        return this.analyticsConfiguration;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    protected final String getClientKey() {
        return this.clientKey;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    protected final Environment getEnvironment() {
        return this.environment;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    protected final Locale getShopperLocale() {
        return this.shopperLocale;
    }

    public BuilderT h(Amount amount) {
        p013kotlin.jvm.internal.s.k(amount, "amount");
        le.a.c(amount);
        this.amount = amount;
        p013kotlin.jvm.internal.s.i(this, "null cannot be cast to non-null type BuilderT of com.adyen.checkout.components.core.internal.BaseConfigurationBuilder");
        return this;
    }

    public final BuilderT i(Locale shopperLocale) {
        p013kotlin.jvm.internal.s.k(shopperLocale, "shopperLocale");
        this.shopperLocale = shopperLocale;
        p013kotlin.jvm.internal.s.i(this, "null cannot be cast to non-null type BuilderT of com.adyen.checkout.components.core.internal.BaseConfigurationBuilder");
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(Environment environment, String clientKey) {
        this((Locale) null, environment, clientKey);
        p013kotlin.jvm.internal.s.k(environment, "environment");
        p013kotlin.jvm.internal.s.k(clientKey, "clientKey");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @jn0.e
    public g(Context context, Environment environment, String clientKey) {
        this((Locale) null, environment, clientKey);
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(environment, "environment");
        p013kotlin.jvm.internal.s.k(clientKey, "clientKey");
    }
}
