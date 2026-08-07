package g40;

import com.stripe.android.model.PaymentMethod;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/model/v0;", "", "a", "(Lcom/stripe/android/model/v0;)Z", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class e {
    public static final boolean a(PaymentMethod paymentMethod) {
        s.k(paymentMethod, "<this>");
        if (paymentMethod.type != PaymentMethod.p.USBankAccount) {
            return false;
        }
        PaymentMethod.USBankAccount uSBankAccount = paymentMethod.usBankAccount;
        return (uSBankAccount != null ? uSBankAccount.financialConnectionsAccount : null) == null;
    }
}
