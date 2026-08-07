package l30;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.LocalStripeException;
import com.stripe.android.core.exception.StripeException;
import n70.x;
import o30.StripeError;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import x30.c;
import x30.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "a", "(Ljava/lang/Throwable;Landroid/content/Context;)Ljava/lang/String;", "Lx30/c;", "b", "(Ljava/lang/Throwable;)Lx30/c;", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a {
    public static final String a(Throwable th2, Context context) {
        StripeError stripeError;
        String message;
        String displayMessage;
        s.k(context, "context");
        if ((th2 instanceof APIConnectionException ? (APIConnectionException) th2 : null) != null) {
            String string = context.getString(x.f93518i);
            s.j(string, "getString(...)");
            return string;
        }
        LocalStripeException localStripeException = th2 instanceof LocalStripeException ? (LocalStripeException) th2 : null;
        if (localStripeException != null && (displayMessage = localStripeException.getDisplayMessage()) != null) {
            return displayMessage;
        }
        StripeException stripeException = th2 instanceof StripeException ? (StripeException) th2 : null;
        if (stripeException != null && (stripeError = stripeException.getStripeError()) != null && (message = stripeError.getMessage()) != null) {
            return message;
        }
        String string2 = context.getString(x.f93523k0);
        s.j(string2, "getString(...)");
        return string2;
    }

    public static final c b(Throwable th2) {
        StripeError stripeError;
        String message;
        String displayMessage;
        s.k(th2, "<this>");
        if ((th2 instanceof APIConnectionException ? (APIConnectionException) th2 : null) != null) {
            return d.a(x.f93518i);
        }
        LocalStripeException localStripeException = th2 instanceof LocalStripeException ? (LocalStripeException) th2 : null;
        if (localStripeException != null && (displayMessage = localStripeException.getDisplayMessage()) != null) {
            return d.b(displayMessage);
        }
        StripeException stripeException = th2 instanceof StripeException ? (StripeException) th2 : null;
        return (stripeException == null || (stripeError = stripeException.getStripeError()) == null || (message = stripeError.getMessage()) == null) ? d.a(x.f93523k0) : d.b(message);
    }
}
