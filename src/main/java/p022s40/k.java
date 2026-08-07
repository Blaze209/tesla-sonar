package p022s40;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\u0007\u001a\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u000e\u001a\u00020\u0005*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007\"\u0018\u0010\u0010\u001a\u00020\u0005*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "", "c", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Ljava/lang/String;", "e", "", "a", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z", "h", "b", "Lcom/stripe/android/financialconnections/model/k0;", "g", "(Lcom/stripe/android/financialconnections/model/k0;)Z", "f", "isDataFlow", DateTokenConverter.CONVERTER_KEY, "canSaveAccountsToLink", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class k {
    public static final boolean a(FinancialConnectionsSessionManifest financialConnectionsSessionManifest) {
        s.k(financialConnectionsSessionManifest, "<this>");
        Map<String, Boolean> mapV = financialConnectionsSessionManifest.v();
        return !(mapV != null ? s.f(mapV.get("bank_connections_disable_defensive_auth_session_retrieval_on_complete"), Boolean.TRUE) : false);
    }

    public static final boolean b(FinancialConnectionsSessionManifest financialConnectionsSessionManifest) {
        s.k(financialConnectionsSessionManifest, "<this>");
        Map<String, Boolean> mapV = financialConnectionsSessionManifest.v();
        if (mapV != null) {
            return s.f(mapV.get("bank_connections_android_enable_work_manager"), Boolean.TRUE);
        }
        return false;
    }

    public static final String c(FinancialConnectionsSessionManifest financialConnectionsSessionManifest) {
        s.k(financialConnectionsSessionManifest, "<this>");
        String businessName = financialConnectionsSessionManifest.getBusinessName();
        return businessName == null ? financialConnectionsSessionManifest.getConnectPlatformName() : businessName;
    }

    public static final boolean d(FinancialConnectionsSessionManifest financialConnectionsSessionManifest) {
        s.k(financialConnectionsSessionManifest, "<this>");
        Boolean accountholderIsLinkConsumer = financialConnectionsSessionManifest.getAccountholderIsLinkConsumer();
        Boolean bool = Boolean.TRUE;
        return s.f(accountholderIsLinkConsumer, bool) && s.f(financialConnectionsSessionManifest.getIsNetworkingUserFlow(), bool);
    }

    public static final String e(FinancialConnectionsSessionManifest financialConnectionsSessionManifest) {
        s.k(financialConnectionsSessionManifest, "<this>");
        String accountholderCustomerEmailAddress = financialConnectionsSessionManifest.getAccountholderCustomerEmailAddress();
        if (accountholderCustomerEmailAddress == null) {
            return null;
        }
        String str = (String) t.e1(accountholderCustomerEmailAddress, new char[]{'@'}, false, 0, 6, null).get(0);
        if (str.length() <= 15) {
            return accountholderCustomerEmailAddress;
        }
        String str2 = (String) t.e1(accountholderCustomerEmailAddress, new char[]{'@'}, false, 0, 6, null).get(1);
        String strSubstring = str.substring(0, 15);
        s.j(strSubstring, "substring(...)");
        return strSubstring + "•••@" + str2;
    }

    public static final boolean f(FinancialConnectionsSessionManifest financialConnectionsSessionManifest) {
        s.k(financialConnectionsSessionManifest, "<this>");
        return financialConnectionsSessionManifest.getPaymentMethodType() == null;
    }

    public static final boolean g(SynchronizeSessionResponse synchronizeSessionResponse) {
        s.k(synchronizeSessionResponse, "<this>");
        return synchronizeSessionResponse.getManifest().getAllowManualEntry() && !synchronizeSessionResponse.getVisual().getReducedManualEntryProminenceInErrors();
    }

    public static final boolean h(FinancialConnectionsSessionManifest financialConnectionsSessionManifest) {
        s.k(financialConnectionsSessionManifest, "<this>");
        Map<String, Boolean> mapV = financialConnectionsSessionManifest.v();
        if (mapV != null) {
            return s.f(mapV.get("bank_connections_continue_with_merchant_text"), Boolean.TRUE);
        }
        return false;
    }
}
