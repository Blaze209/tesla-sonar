package be;

import com.adyen.checkout.components.core.PaymentComponentData;
import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lbe/h;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "PaymentMethodDetailsT", "", "Lcom/adyen/checkout/components/core/PaymentComponentData;", "getData", "()Lcom/adyen/checkout/components/core/PaymentComponentData;", "data", "", "a", "()Z", "isInputValid", "isReady", "isValid", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface h<PaymentMethodDetailsT extends PaymentMethodDetails> {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static <PaymentMethodDetailsT extends PaymentMethodDetails> boolean a(h<PaymentMethodDetailsT> hVar) {
            return hVar.a() && hVar.isReady();
        }
    }

    boolean a();

    PaymentComponentData<PaymentMethodDetailsT> getData();

    boolean isReady();

    boolean isValid();
}
