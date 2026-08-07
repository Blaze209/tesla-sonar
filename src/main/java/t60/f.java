package t60;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a3\u0010\t\u001a\u00020\u00072\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "Lcom/stripe/android/model/PaymentMethodCode;", "code", "Lu60/h;", "paymentMethodSaveConsentBehavior", "Lcom/stripe/android/model/StripeIntent;", AnalyticsAttribute.Intent, "", "hasCustomerConfiguration", "a", "(Ljava/lang/String;Lu60/h;Lcom/stripe/android/model/StripeIntent;Z)Z", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class f {
    public static final boolean a(String code, u60.h paymentMethodSaveConsentBehavior, StripeIntent intent, boolean z11) {
        s.k(code, "code");
        s.k(paymentMethodSaveConsentBehavior, "paymentMethodSaveConsentBehavior");
        s.k(intent, "intent");
        if (paymentMethodSaveConsentBehavior instanceof u60.h.Disabled) {
            return false;
        }
        if (paymentMethodSaveConsentBehavior instanceof u60.h.c) {
            return z11;
        }
        if (!(paymentMethodSaveConsentBehavior instanceof u60.h.d)) {
            throw new NoWhenBranchMatchedException();
        }
        if (intent instanceof PaymentIntent) {
            if (((PaymentIntent) intent).q(code)) {
                return false;
            }
            return z11;
        }
        if (intent instanceof SetupIntent) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
