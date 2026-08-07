package ke;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.Amount;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Locale;
import me.Environment;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: ke.f, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001c\u0010$R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\"\u0010*¨\u0006+"}, d2 = {"Lke/f;", "Lke/i;", "Ljava/util/Locale;", "shopperLocale", "Lme/c;", AnalyticsAttribute.Environment, "", "clientKey", "Lke/a;", "analyticsParams", "", "isCreatedByDropIn", "Lcom/adyen/checkout/components/core/Amount;", "amount", "<init>", "(Ljava/util/Locale;Lme/c;Ljava/lang/String;Lke/a;ZLcom/adyen/checkout/components/core/Amount;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Locale;", "()Ljava/util/Locale;", "b", "Lme/c;", "J", "()Lme/c;", "c", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "Lke/a;", "()Lke/a;", "e", "Z", "()Z", "f", "Lcom/adyen/checkout/components/core/Amount;", "()Lcom/adyen/checkout/components/core/Amount;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CommonComponentParams implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Locale shopperLocale;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Environment environment;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clientKey;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AnalyticsParams analyticsParams;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCreatedByDropIn;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Amount amount;

    public CommonComponentParams(Locale shopperLocale, Environment environment, String clientKey, AnalyticsParams analyticsParams, boolean z11, Amount amount) {
        s.k(shopperLocale, "shopperLocale");
        s.k(environment, "environment");
        s.k(clientKey, "clientKey");
        s.k(analyticsParams, "analyticsParams");
        this.shopperLocale = shopperLocale;
        this.environment = environment;
        this.clientKey = clientKey;
        this.analyticsParams = analyticsParams;
        this.isCreatedByDropIn = z11;
        this.amount = amount;
    }

    @Override // ke.i
    /* JADX INFO: renamed from: J, reason: from getter */
    public Environment getEnvironment() {
        return this.environment;
    }

    @Override // ke.i
    /* JADX INFO: renamed from: a, reason: from getter */
    public Locale getShopperLocale() {
        return this.shopperLocale;
    }

    @Override // ke.i
    /* JADX INFO: renamed from: b, reason: from getter */
    public AnalyticsParams getAnalyticsParams() {
        return this.analyticsParams;
    }

    @Override // ke.i
    /* JADX INFO: renamed from: c, reason: from getter */
    public String getClientKey() {
        return this.clientKey;
    }

    @Override // ke.i
    /* JADX INFO: renamed from: d, reason: from getter */
    public Amount getAmount() {
        return this.amount;
    }

    @Override // ke.i
    /* JADX INFO: renamed from: e, reason: from getter */
    public boolean getIsCreatedByDropIn() {
        return this.isCreatedByDropIn;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonComponentParams)) {
            return false;
        }
        CommonComponentParams commonComponentParams = (CommonComponentParams) other;
        return s.f(this.shopperLocale, commonComponentParams.shopperLocale) && s.f(this.environment, commonComponentParams.environment) && s.f(this.clientKey, commonComponentParams.clientKey) && s.f(this.analyticsParams, commonComponentParams.analyticsParams) && this.isCreatedByDropIn == commonComponentParams.isCreatedByDropIn && s.f(this.amount, commonComponentParams.amount);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.shopperLocale.hashCode() * 31) + this.environment.hashCode()) * 31) + this.clientKey.hashCode()) * 31) + this.analyticsParams.hashCode()) * 31) + Boolean.hashCode(this.isCreatedByDropIn)) * 31;
        Amount amount = this.amount;
        return iHashCode + (amount == null ? 0 : amount.hashCode());
    }

    public String toString() {
        return "CommonComponentParams(shopperLocale=" + this.shopperLocale + ", environment=" + this.environment + ", clientKey=" + this.clientKey + ", analyticsParams=" + this.analyticsParams + ", isCreatedByDropIn=" + this.isCreatedByDropIn + ", amount=" + this.amount + ")";
    }
}
