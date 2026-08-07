package ke;

import com.adyen.checkout.components.core.internal.ui.model.DropInOverrideParams;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lke/g;", "", "<init>", "()V", "Lbe/d;", "checkoutConfiguration", "Ljava/util/Locale;", "deviceLocale", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "dropInOverrideParams", "Lke/n;", "componentSessionParams", "Lke/h;", "a", "(Lbe/d;Ljava/util/Locale;Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;Lke/n;)Lke/h;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g {
    public final CommonComponentParamsMapperData a(be.d checkoutConfiguration, Locale deviceLocale, DropInOverrideParams dropInOverrideParams, n componentSessionParams) {
        s.k(checkoutConfiguration, "checkoutConfiguration");
        s.k(deviceLocale, "deviceLocale");
        Locale shopperLocale = checkoutConfiguration.getShopperLocale();
        return new CommonComponentParamsMapperData(new CommonComponentParams(shopperLocale == null ? deviceLocale : shopperLocale, checkoutConfiguration.getCom.fourthline.analytics.internal.AnalyticsAttribute.Environment java.lang.String(), checkoutConfiguration.getClientKey(), new AnalyticsParams(checkoutConfiguration.getAnalyticsConfiguration(), checkoutConfiguration.getClientKey()), false, checkoutConfiguration.getAmount()), componentSessionParams);
    }
}
