package j40;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.exception.AppInitializationError;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import java.util.Map;
import o30.StripeError;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lj40/f;", "", "extraMessage", "", AnalyticsAttribute.Error, "Lo30/d;", "logger", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "Ljn0/h0;", "b", "(Lj40/f;Ljava/lang/String;Ljava/lang/Throwable;Lo30/d;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "a", "(Ljava/lang/Throwable;)V", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class h {
    private static final void a(Throwable th2) {
        StripeError stripeError;
        Map<String, String> mapE;
        String str;
        StripeException stripeException = th2 instanceof StripeException ? (StripeException) th2 : null;
        if (stripeException == null || (stripeError = stripeException.getStripeError()) == null || (mapE = stripeError.e()) == null || (str = mapE.get("events_to_emit")) == null || str.length() <= 0) {
            if (th2 instanceof AppInitializationError) {
                i40.a.f75822a.b(FinancialConnectionsEvent.c.ERROR, new FinancialConnectionsEvent.Metadata(null, null, FinancialConnectionsEvent.a.WEB_BROWSER_UNAVAILABLE, 3, null));
            } else {
                i40.a.f75822a.b(FinancialConnectionsEvent.c.ERROR, new FinancialConnectionsEvent.Metadata(null, null, FinancialConnectionsEvent.a.UNEXPECTED_ERROR, 3, null));
            }
        }
    }

    public static final void b(f fVar, String extraMessage, Throwable error, o30.d logger, FinancialConnectionsSessionManifest.Pane pane) {
        s.k(fVar, "<this>");
        s.k(extraMessage, "extraMessage");
        s.k(error, "error");
        s.k(logger, "logger");
        s.k(pane, "pane");
        fVar.a(new FinancialConnectionsEvent.p(pane, error, extraMessage));
        logger.error(extraMessage, error);
        a(error);
    }
}
