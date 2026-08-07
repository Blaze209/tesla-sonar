package le;

import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.core.exception.CheckoutException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0007\u001a\u00020\u0004*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\t\u001a\u00020\u0004*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/components/core/Amount;", "Ljn0/h0;", "c", "(Lcom/adyen/checkout/components/core/Amount;)V", "", "a", "(Lcom/adyen/checkout/components/core/Amount;)Z", "isEmpty", "b", "isZero", "components-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a {
    public static final boolean a(Amount amount) {
        s.k(amount, "<this>");
        return s.f(amount.getCurrency(), "NONE") || amount.getValue() == -1;
    }

    public static final boolean b(Amount amount) {
        s.k(amount, "<this>");
        return be.e.INSTANCE.b(amount.getCurrency()) && amount.getValue() == 0;
    }

    public static final void c(Amount amount) {
        s.k(amount, "<this>");
        if (!be.e.INSTANCE.b(amount.getCurrency())) {
            throw new CheckoutException("Currency code is not valid.", null, 2, null);
        }
        if (amount.getValue() < 0) {
            throw new CheckoutException("Value cannot be less than 0.", null, 2, null);
        }
    }
}
