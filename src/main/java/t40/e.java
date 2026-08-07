package t40;

import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "", "b", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z", "showAnimatedDots", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(FinancialConnectionsSessionManifest financialConnectionsSessionManifest) {
        Boolean isLinkWithStripe = financialConnectionsSessionManifest.getIsLinkWithStripe();
        return !(isLinkWithStripe != null ? isLinkWithStripe.booleanValue() : false);
    }
}
