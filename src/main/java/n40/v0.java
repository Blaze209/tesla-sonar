package n40;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.exception.AccountLoadError;
import com.stripe.android.financialconnections.exception.AccountNoneEligibleForPaymentMethodError;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import java.util.Map;
import o30.StripeError;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\f\u001a\u00020\u000b*\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/core/exception/StripeException;", "Lcom/stripe/android/financialconnections/model/q;", "institution", "", "businessName", "", "canRetry", "showManualEntry", "c", "(Lcom/stripe/android/core/exception/StripeException;Lcom/stripe/android/financialconnections/model/q;Ljava/lang/String;ZZ)Lcom/stripe/android/core/exception/StripeException;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;", "", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;)J", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class v0 {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f93303a;

        static {
            int[] iArr = new int[FinancialConnectionsAuthorizationSession.Flow.values().length];
            try {
                iArr[FinancialConnectionsAuthorizationSession.Flow.TESTMODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FinancialConnectionsAuthorizationSession.Flow.TESTMODE_OAUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FinancialConnectionsAuthorizationSession.Flow.TESTMODE_OAUTH_WEBVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FinancialConnectionsAuthorizationSession.Flow.FINICITY_CONNECT_V2_LITE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FinancialConnectionsAuthorizationSession.Flow.MX_CONNECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f93303a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StripeException c(StripeException stripeException, FinancialConnectionsInstitution financialConnectionsInstitution, String str, boolean z11, boolean z12) {
        Map<String, String> mapE;
        String str2;
        Map<String, String> mapE2;
        if (financialConnectionsInstitution == null) {
            return stripeException;
        }
        StripeError stripeError = stripeException.getStripeError();
        if (!p013kotlin.jvm.internal.s.f((stripeError == null || (mapE2 = stripeError.e()) == null) ? null : mapE2.get(AnalyticsAttribute.Reason), "no_supported_payment_method_type_accounts_found")) {
            return new AccountLoadError(z12, z11, financialConnectionsInstitution, stripeException);
        }
        StripeError stripeError2 = stripeException.getStripeError();
        int i11 = (stripeError2 == null || (mapE = stripeError2.e()) == null || (str2 = mapE.get("total_accounts_count")) == null) ? 0 : Integer.parseInt(str2);
        if (str == null) {
            str = "";
        }
        return new AccountNoneEligibleForPaymentMethodError(i11, financialConnectionsInstitution, str, stripeException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long d(FinancialConnectionsAuthorizationSession.Flow flow) {
        io0.b.Companion companion = io0.b.INSTANCE;
        io0.e eVar = io0.e.SECONDS;
        long jP = io0.b.p(io0.d.r(1.75d, eVar));
        int i11 = flow == null ? -1 : a.f93303a[flow.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
            return 0L;
        }
        return i11 != 5 ? jP : io0.b.p(io0.d.r(0.5d, eVar));
    }
}
