package j40;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.exception.FinancialConnectionsError;
import com.stripe.android.financialconnections.exception.WebAuthFlowFailedException;
import java.util.Map;
import jn0.x;
import o30.StripeError;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\u001a+\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "", "extraMessage", "", "a", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/Map;", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a {
    public static final Map<String, String> a(Throwable th2, String str) {
        String simpleName;
        String simpleName2;
        String message;
        String strValueOf;
        String message2;
        String strValueOf2;
        s.k(th2, "<this>");
        if (th2 instanceof WebAuthFlowFailedException) {
            WebAuthFlowFailedException webAuthFlowFailedException = (WebAuthFlowFailedException) th2;
            return v0.m(x.a(AnalyticsAttribute.Error, webAuthFlowFailedException.getCom.fourthline.analytics.internal.AnalyticsAttribute.Reason java.lang.String()), x.a("error_type", webAuthFlowFailedException.getCom.fourthline.analytics.internal.AnalyticsAttribute.Reason java.lang.String()), x.a("error_stacktrace", jn0.g.b(th2)), x.a("error_message", v.y0(v.r(th2.getMessage(), str), " ", null, null, 0, null, null, 62, null)), x.a("code", null));
        }
        if (th2 instanceof FinancialConnectionsError) {
            FinancialConnectionsError financialConnectionsError = (FinancialConnectionsError) th2;
            Pair pairA = x.a(AnalyticsAttribute.Error, financialConnectionsError.getName());
            Pair pairA2 = x.a("error_type", financialConnectionsError.getName());
            Pair pairA3 = x.a("error_stacktrace", jn0.g.b(th2));
            StripeError stripeError = financialConnectionsError.getStripeError();
            if (stripeError == null || (message2 = stripeError.getMessage()) == null) {
                message2 = th2.getMessage();
            }
            Pair pairA4 = x.a("error_message", v.y0(v.r(message2, str), " ", null, null, 0, null, null, 62, null));
            StripeError stripeError2 = financialConnectionsError.getStripeError();
            if (stripeError2 == null || (strValueOf2 = stripeError2.getCode()) == null) {
                strValueOf2 = String.valueOf(financialConnectionsError.getStatusCode());
            }
            return v0.m(pairA, pairA2, pairA3, pairA4, x.a("code", strValueOf2));
        }
        if (!(th2 instanceof StripeException)) {
            Pair pairA5 = x.a(AnalyticsAttribute.Error, th2.getClass().getSimpleName());
            Pair pairA6 = x.a("error_type", th2.getClass().getSimpleName());
            Pair pairA7 = x.a("error_stacktrace", jn0.g.b(th2));
            String message3 = th2.getMessage();
            return v0.m(pairA5, pairA6, pairA7, x.a("error_message", v.y0(v.r(message3 != null ? t.T1(message3, 100) : null, str), " ", null, null, 0, null, null, 62, null)), x.a("code", null));
        }
        StripeException stripeException = (StripeException) th2;
        StripeError stripeError3 = stripeException.getStripeError();
        if (stripeError3 == null || (simpleName = stripeError3.getType()) == null) {
            simpleName = th2.getClass().getSimpleName();
        }
        Pair pairA8 = x.a(AnalyticsAttribute.Error, simpleName);
        StripeError stripeError4 = stripeException.getStripeError();
        if (stripeError4 == null || (simpleName2 = stripeError4.getType()) == null) {
            simpleName2 = th2.getClass().getSimpleName();
        }
        Pair pairA9 = x.a("error_type", simpleName2);
        Pair pairA10 = x.a("error_stacktrace", jn0.g.b(th2));
        StripeError stripeError5 = stripeException.getStripeError();
        if (stripeError5 == null || (message = stripeError5.getMessage()) == null) {
            message = th2.getMessage();
        }
        Pair pairA11 = x.a("error_message", v.y0(v.r(message != null ? t.T1(message, 100) : null, str), " ", null, null, 0, null, null, 62, null));
        StripeError stripeError6 = stripeException.getStripeError();
        if (stripeError6 == null || (strValueOf = stripeError6.getCode()) == null) {
            strValueOf = String.valueOf(stripeException.getStatusCode());
        }
        return v0.m(pairA8, pairA9, pairA10, pairA11, x.a("code", strValueOf));
    }
}
