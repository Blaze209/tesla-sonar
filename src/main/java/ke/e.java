package ke;

import com.adyen.checkout.components.core.internal.ui.model.DropInOverrideParams;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lke/e;", "", "Lke/g;", "commonComponentParamsMapper", "<init>", "(Lke/g;)V", "Lbe/d;", "checkoutConfiguration", "Ljava/util/Locale;", "deviceLocale", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "dropInOverrideParams", "Lke/n;", "componentSessionParams", "Lce/k;", "componentConfiguration", "Lke/d;", "a", "(Lbe/d;Ljava/util/Locale;Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;Lke/n;Lce/k;)Lke/d;", "Lke/g;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g commonComponentParamsMapper;

    public e(g commonComponentParamsMapper) {
        s.k(commonComponentParamsMapper, "commonComponentParamsMapper");
        this.commonComponentParamsMapper = commonComponentParamsMapper;
    }

    public final ButtonComponentParams a(be.d checkoutConfiguration, Locale deviceLocale, DropInOverrideParams dropInOverrideParams, n componentSessionParams, ce.k componentConfiguration) {
        s.k(checkoutConfiguration, "checkoutConfiguration");
        s.k(deviceLocale, "deviceLocale");
        CommonComponentParams commonComponentParams = this.commonComponentParamsMapper.a(checkoutConfiguration, deviceLocale, dropInOverrideParams, componentSessionParams).getCommonComponentParams();
        ce.h hVar = componentConfiguration instanceof ce.h ? (ce.h) componentConfiguration : null;
        Boolean boolA = hVar != null ? hVar.a() : null;
        return new ButtonComponentParams(commonComponentParams, boolA != null ? boolA.booleanValue() : true);
    }
}
