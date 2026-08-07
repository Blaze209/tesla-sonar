package ke;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.Amount;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Locale;
import me.Environment;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: ke.d, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001dR\u0014\u0010 \u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000bR\u0014\u0010$\u001a\u00020!8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010\u0017R\u0014\u0010)\u001a\u00020'8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010(¨\u0006*"}, d2 = {"Lke/d;", "Lke/i;", "", "Lke/f;", "commonComponentParams", "", "isSubmitButtonVisible", "<init>", "(Lke/f;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lke/f;", "b", "Z", "f", "()Z", "Lcom/adyen/checkout/components/core/Amount;", DateTokenConverter.CONVERTER_KEY, "()Lcom/adyen/checkout/components/core/Amount;", "amount", "Lke/a;", "()Lke/a;", "analyticsParams", "c", "clientKey", "Lme/c;", "J", "()Lme/c;", AnalyticsAttribute.Environment, "e", "isCreatedByDropIn", "Ljava/util/Locale;", "()Ljava/util/Locale;", "shopperLocale", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ButtonComponentParams implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final CommonComponentParams commonComponentParams;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSubmitButtonVisible;

    public ButtonComponentParams(CommonComponentParams commonComponentParams, boolean z11) {
        s.k(commonComponentParams, "commonComponentParams");
        this.commonComponentParams = commonComponentParams;
        this.isSubmitButtonVisible = z11;
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
        if (!(other instanceof ButtonComponentParams)) {
            return false;
        }
        ButtonComponentParams buttonComponentParams = (ButtonComponentParams) other;
        return s.f(this.commonComponentParams, buttonComponentParams.commonComponentParams) && this.isSubmitButtonVisible == buttonComponentParams.isSubmitButtonVisible;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public boolean getIsSubmitButtonVisible() {
        return this.isSubmitButtonVisible;
    }

    public int hashCode() {
        return (this.commonComponentParams.hashCode() * 31) + Boolean.hashCode(this.isSubmitButtonVisible);
    }

    public String toString() {
        return "ButtonComponentParams(commonComponentParams=" + this.commonComponentParams + ", isSubmitButtonVisible=" + this.isSubmitButtonVisible + ")";
    }
}
