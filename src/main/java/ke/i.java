package ke;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.Amount;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Locale;
import me.Environment;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lke/i;", "", "Ljava/util/Locale;", "a", "()Ljava/util/Locale;", "shopperLocale", "Lme/c;", "J", "()Lme/c;", AnalyticsAttribute.Environment, "", "c", "()Ljava/lang/String;", "clientKey", "Lke/a;", "b", "()Lke/a;", "analyticsParams", "", "e", "()Z", "isCreatedByDropIn", "Lcom/adyen/checkout/components/core/Amount;", DateTokenConverter.CONVERTER_KEY, "()Lcom/adyen/checkout/components/core/Amount;", "amount", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface i {
    /* JADX INFO: renamed from: J */
    Environment getEnvironment();

    /* JADX INFO: renamed from: a */
    Locale getShopperLocale();

    /* JADX INFO: renamed from: b */
    AnalyticsParams getAnalyticsParams();

    /* JADX INFO: renamed from: c */
    String getClientKey();

    /* JADX INFO: renamed from: d */
    Amount getAmount();

    /* JADX INFO: renamed from: e */
    boolean getIsCreatedByDropIn();
}
