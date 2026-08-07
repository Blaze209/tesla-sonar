package n40;

import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "", "closeAuthFlowError", "", "b", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Ljava/lang/Throwable;)Ljava/lang/String;", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class j {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(FinancialConnectionsSession financialConnectionsSession, Throwable th2) {
        if (financialConnectionsSession.a().b().isEmpty() && financialConnectionsSession.getPaymentAccount() == null && financialConnectionsSession.getBankAccountToken() == null) {
            return th2 != null ? "failed" : "canceled";
        }
        return "completed";
    }
}
