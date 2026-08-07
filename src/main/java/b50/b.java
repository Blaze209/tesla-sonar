package b50;

import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "", "a", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)Z", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b {
    public static final boolean a(FinancialConnectionsSession financialConnectionsSession) {
        FinancialConnectionsSession.StatusDetails.Cancelled cancelled;
        s.k(financialConnectionsSession, "<this>");
        FinancialConnectionsSession.StatusDetails statusDetails = financialConnectionsSession.getStatusDetails();
        return ((statusDetails == null || (cancelled = statusDetails.getCancelled()) == null) ? null : cancelled.getReason()) == FinancialConnectionsSession.StatusDetails.Cancelled.Reason.CUSTOM_MANUAL_ENTRY;
    }
}
