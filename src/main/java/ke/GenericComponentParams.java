package ke;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.Amount;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Locale;
import me.Environment;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: ke.k, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\bR\u0014\u0010 \u001a\u00020\u001d8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010%¨\u0006'"}, d2 = {"Lke/k;", "Lke/i;", "Lke/f;", "commonComponentParams", "<init>", "(Lke/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lke/f;", "Lcom/adyen/checkout/components/core/Amount;", DateTokenConverter.CONVERTER_KEY, "()Lcom/adyen/checkout/components/core/Amount;", "amount", "Lke/a;", "b", "()Lke/a;", "analyticsParams", "c", "clientKey", "Lme/c;", "J", "()Lme/c;", AnalyticsAttribute.Environment, "e", "()Z", "isCreatedByDropIn", "Ljava/util/Locale;", "()Ljava/util/Locale;", "shopperLocale", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GenericComponentParams implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final CommonComponentParams commonComponentParams;

    public GenericComponentParams(CommonComponentParams commonComponentParams) {
        s.k(commonComponentParams, "commonComponentParams");
        this.commonComponentParams = commonComponentParams;
    }

    @Override // ke.i
    /* JADX INFO: renamed from: J */
    public Environment getEnvironment() {
        return this.commonComponentParams.getEnvironment();
    }

    @Override // ke.i
    /* JADX INFO: renamed from: a */
    public Locale getShopperLocale() {
        return this.commonComponentParams.getShopperLocale();
    }

    @Override // ke.i
    /* JADX INFO: renamed from: b */
    public AnalyticsParams getAnalyticsParams() {
        return this.commonComponentParams.getAnalyticsParams();
    }

    @Override // ke.i
    /* JADX INFO: renamed from: c */
    public String getClientKey() {
        return this.commonComponentParams.getClientKey();
    }

    @Override // ke.i
    /* JADX INFO: renamed from: d */
    public Amount getAmount() {
        return this.commonComponentParams.getAmount();
    }

    @Override // ke.i
    /* JADX INFO: renamed from: e */
    public boolean getIsCreatedByDropIn() {
        return this.commonComponentParams.getIsCreatedByDropIn();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GenericComponentParams) && s.f(this.commonComponentParams, ((GenericComponentParams) other).commonComponentParams);
    }

    public int hashCode() {
        return this.commonComponentParams.hashCode();
    }

    public String toString() {
        return "GenericComponentParams(commonComponentParams=" + this.commonComponentParams + ")";
    }
}
