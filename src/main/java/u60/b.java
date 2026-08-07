package u60;

import com.stripe.android.model.PaymentMethod;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lu60/e;", "", "b", "(Lu60/e;)Z", "supportsMobileInstantDebitsFlow", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(PaymentMethodMetadata paymentMethodMetadata) {
        return (paymentMethodMetadata.getStripeIntent().t().contains(PaymentMethod.p.USBankAccount.code) || !paymentMethodMetadata.getStripeIntent().u3().contains("bank_account") || (paymentMethodMetadata.getStripeIntent().getClientSecret() == null)) ? false : true;
    }
}
