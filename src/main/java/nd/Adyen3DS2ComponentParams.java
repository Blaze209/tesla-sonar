package nd;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.Amount;
import com.adyen.threeds2.customization.UiCustomization;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Locale;
import java.util.Set;
import ke.AnalyticsParams;
import ke.CommonComponentParams;
import ke.i;
import me.Environment;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: nd.a, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010%\u001a\u0004\u0018\u00010#8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010$R\u0014\u0010(\u001a\u00020&8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010'R\u0014\u0010)\u001a\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\rR\u0014\u0010-\u001a\u00020*8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00138\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00103\u001a\u0002018\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u00102¨\u00064"}, d2 = {"Lnd/a;", "Lke/i;", "Lke/f;", "commonComponentParams", "Lcom/adyen/threeds2/customization/UiCustomization;", "uiCustomization", "", "threeDSRequestorAppURL", "", "deviceParameterBlockList", "<init>", "(Lke/f;Lcom/adyen/threeds2/customization/UiCustomization;Ljava/lang/String;Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lke/f;", "b", "Lcom/adyen/threeds2/customization/UiCustomization;", "h", "()Lcom/adyen/threeds2/customization/UiCustomization;", "c", "Ljava/lang/String;", "g", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Set;", "f", "()Ljava/util/Set;", "Lcom/adyen/checkout/components/core/Amount;", "()Lcom/adyen/checkout/components/core/Amount;", "amount", "Lke/a;", "()Lke/a;", "analyticsParams", "clientKey", "Lme/c;", "J", "()Lme/c;", AnalyticsAttribute.Environment, "e", "()Z", "isCreatedByDropIn", "Ljava/util/Locale;", "()Ljava/util/Locale;", "shopperLocale", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Adyen3DS2ComponentParams implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final CommonComponentParams commonComponentParams;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final UiCustomization uiCustomization;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String threeDSRequestorAppURL;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<String> deviceParameterBlockList;

    public Adyen3DS2ComponentParams(CommonComponentParams commonComponentParams, UiCustomization uiCustomization, String str, Set<String> set) {
        s.k(commonComponentParams, "commonComponentParams");
        this.commonComponentParams = commonComponentParams;
        this.uiCustomization = uiCustomization;
        this.threeDSRequestorAppURL = str;
        this.deviceParameterBlockList = set;
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
        if (!(other instanceof Adyen3DS2ComponentParams)) {
            return false;
        }
        Adyen3DS2ComponentParams adyen3DS2ComponentParams = (Adyen3DS2ComponentParams) other;
        return s.f(this.commonComponentParams, adyen3DS2ComponentParams.commonComponentParams) && s.f(this.uiCustomization, adyen3DS2ComponentParams.uiCustomization) && s.f(this.threeDSRequestorAppURL, adyen3DS2ComponentParams.threeDSRequestorAppURL) && s.f(this.deviceParameterBlockList, adyen3DS2ComponentParams.deviceParameterBlockList);
    }

    public final Set<String> f() {
        return this.deviceParameterBlockList;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getThreeDSRequestorAppURL() {
        return this.threeDSRequestorAppURL;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final UiCustomization getUiCustomization() {
        return this.uiCustomization;
    }

    public int hashCode() {
        int iHashCode = this.commonComponentParams.hashCode() * 31;
        UiCustomization uiCustomization = this.uiCustomization;
        int iHashCode2 = (iHashCode + (uiCustomization == null ? 0 : uiCustomization.hashCode())) * 31;
        String str = this.threeDSRequestorAppURL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Set<String> set = this.deviceParameterBlockList;
        return iHashCode3 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "Adyen3DS2ComponentParams(commonComponentParams=" + this.commonComponentParams + ", uiCustomization=" + this.uiCustomization + ", threeDSRequestorAppURL=" + this.threeDSRequestorAppURL + ", deviceParameterBlockList=" + this.deviceParameterBlockList + ")";
    }
}
