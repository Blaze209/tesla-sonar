package w70;

import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.StripeIntent;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/model/StripeIntent;", "", "a", "(Lcom/stripe/android/model/StripeIntent;)Ljava/lang/String;", "currency", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class d {
    public static final String a(StripeIntent stripeIntent) {
        s.k(stripeIntent, "<this>");
        if (stripeIntent instanceof PaymentIntent) {
            return ((PaymentIntent) stripeIntent).getCurrency();
        }
        return null;
    }
}
