package nd;

import be.d;
import com.adyen.checkout.components.core.internal.ui.model.DropInOverrideParams;
import hd.c;
import java.util.Locale;
import java.util.Set;
import ke.CommonComponentParamsMapperData;
import ke.g;
import ke.n;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lnd/b;", "", "Lke/g;", "commonComponentParamsMapper", "<init>", "(Lke/g;)V", "Lbe/d;", "checkoutConfiguration", "Ljava/util/Locale;", "deviceLocale", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "dropInOverrideParams", "Lke/n;", "componentSessionParams", "Lnd/a;", "a", "(Lbe/d;Ljava/util/Locale;Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;Lke/n;)Lnd/a;", "Lke/g;", "b", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<String> f93820c = d1.c("A005");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g commonComponentParamsMapper;

    public b(g commonComponentParamsMapper) {
        s.k(commonComponentParamsMapper, "commonComponentParamsMapper");
        this.commonComponentParamsMapper = commonComponentParamsMapper;
    }

    public final Adyen3DS2ComponentParams a(d checkoutConfiguration, Locale deviceLocale, DropInOverrideParams dropInOverrideParams, n componentSessionParams) {
        s.k(checkoutConfiguration, "checkoutConfiguration");
        s.k(deviceLocale, "deviceLocale");
        CommonComponentParamsMapperData commonComponentParamsMapperDataA = this.commonComponentParamsMapper.a(checkoutConfiguration, deviceLocale, dropInOverrideParams, componentSessionParams);
        hd.b bVarA = c.a(checkoutConfiguration);
        return new Adyen3DS2ComponentParams(commonComponentParamsMapperDataA.getCommonComponentParams(), bVarA != null ? bVarA.getUiCustomization() : null, bVarA != null ? bVarA.getThreeDSRequestorAppURL() : null, f93820c);
    }
}
