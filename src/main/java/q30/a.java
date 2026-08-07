package q30;

import com.stripe.android.core.exception.StripeException;
import java.io.IOException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"", "", "a", "(Ljava/lang/Throwable;)Ljava/lang/String;", "safeAnalyticsMessage", "stripe-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a {
    public static final String a(Throwable th2) {
        s.k(th2, "<this>");
        if (th2 instanceof StripeException) {
            return ((StripeException) th2).a();
        }
        return th2 instanceof IOException ? "ioException" : "unknown";
    }
}
