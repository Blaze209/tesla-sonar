package a40;

import com.stripe.android.model.PaymentMethod;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/v0;", "paymentMethod", "Lx80/a;", "cbcEligibility", "", "a", "(Lcom/stripe/android/model/v0;Lx80/a;)Z", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class e {
    public static final boolean a(PaymentMethod paymentMethod, x80.a cbcEligibility) {
        PaymentMethod.Card.Networks networks;
        Set<String> setA;
        s.k(paymentMethod, "paymentMethod");
        s.k(cbcEligibility, "cbcEligibility");
        PaymentMethod.Card card = paymentMethod.card;
        return (cbcEligibility instanceof x80.a.Eligible) && (card != null && (networks = card.networks) != null && (setA = networks.a()) != null && setA.size() > 1);
    }
}
