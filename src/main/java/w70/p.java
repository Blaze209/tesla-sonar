package w70;

import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lw70/p;", "", "<init>", "()V", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "a", "(Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/model/StripeIntent;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f121203a = new p();

    private p() {
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    public final StripeIntent a(StripeIntent stripeIntent) throws Throwable {
        Throwable setupIntentInTerminalState;
        PaymentIntent paymentIntent;
        s.k(stripeIntent, "stripeIntent");
        boolean z11 = stripeIntent instanceof PaymentIntent;
        if (z11) {
            PaymentIntent paymentIntent2 = (PaymentIntent) stripeIntent;
            if (paymentIntent2.getConfirmationMethod() != PaymentIntent.e.Automatic) {
                setupIntentInTerminalState = new g80.j.InvalidConfirmationMethod(paymentIntent2.getConfirmationMethod());
            } else if (!z11 && q.c((PaymentIntent) stripeIntent)) {
                setupIntentInTerminalState = new g80.j.PaymentIntentInTerminalState(stripeIntent.getStatus());
            } else if (z11) {
                paymentIntent = (PaymentIntent) stripeIntent;
                if (paymentIntent.getAmount() != null || paymentIntent.getCurrency() == null) {
                    setupIntentInTerminalState = g80.j.b.f67615a;
                } else if ((stripeIntent instanceof SetupIntent) || !q.d((SetupIntent) stripeIntent)) {
                    setupIntentInTerminalState = null;
                } else {
                    setupIntentInTerminalState = new g80.j.SetupIntentInTerminalState(stripeIntent.getStatus());
                }
            } else if (stripeIntent instanceof SetupIntent) {
                setupIntentInTerminalState = null;
            } else {
                setupIntentInTerminalState = null;
            }
        } else if (!z11) {
            if (z11) {
                paymentIntent = (PaymentIntent) stripeIntent;
                if (paymentIntent.getAmount() != null) {
                }
                setupIntentInTerminalState = g80.j.b.f67615a;
            } else if (stripeIntent instanceof SetupIntent) {
                setupIntentInTerminalState = null;
            } else {
                setupIntentInTerminalState = null;
            }
        } else if (z11) {
            paymentIntent = (PaymentIntent) stripeIntent;
            if (paymentIntent.getAmount() != null) {
            }
            setupIntentInTerminalState = g80.j.b.f67615a;
        } else if (stripeIntent instanceof SetupIntent) {
            setupIntentInTerminalState = null;
        } else {
            setupIntentInTerminalState = null;
        }
        if (setupIntentInTerminalState == null) {
            return stripeIntent;
        }
        throw setupIntentInTerminalState;
    }
}
