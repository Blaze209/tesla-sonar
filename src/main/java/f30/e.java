package f30;

import com.adyen.checkout.components.core.action.Action;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.y0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u0014*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003:\u0001\u0014B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0001\u0002\u0016\u0017¨\u0006\u0018"}, d2 = {"Lf30/e;", "Lcom/stripe/android/model/n;", "T", "", "<init>", "()V", "", "paymentMethodId", "Lcom/stripe/android/model/v0$p;", Action.PAYMENT_METHOD_TYPE, "Lcom/stripe/android/model/y0;", "optionsParams", "c", "(Ljava/lang/String;Lcom/stripe/android/model/v0$p;Lcom/stripe/android/model/y0;)Lcom/stripe/android/model/n;", "Lcom/stripe/android/model/w0;", "createParams", "b", "(Lcom/stripe/android/model/w0;Lcom/stripe/android/model/y0;)Lcom/stripe/android/model/n;", "Lcom/stripe/android/model/v0;", "paymentMethod", "a", "(Lcom/stripe/android/model/v0;Lcom/stripe/android/model/y0;)Lcom/stripe/android/model/n;", "Lf30/c;", "Lf30/d;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class e<T extends com.stripe.android.model.n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f30.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lf30/e$a;", "", "<init>", "()V", "", "clientSecret", "Lcom/stripe/android/model/l$d;", "shipping", "Lf30/e;", "Lcom/stripe/android/model/n;", "a", "(Ljava/lang/String;Lcom/stripe/android/model/l$d;)Lf30/e;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e<com.stripe.android.model.n> a(String clientSecret, ConfirmPaymentIntentParams.Shipping shipping) {
            p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
            if (PaymentIntent.ClientSecret.INSTANCE.a(clientSecret)) {
                return new c(clientSecret, shipping);
            }
            if (SetupIntent.ClientSecret.INSTANCE.a(clientSecret)) {
                return new d(clientSecret);
            }
            throw new IllegalStateException(("Encountered an invalid client secret \"" + clientSecret + "\"").toString());
        }

        private Companion() {
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final T a(PaymentMethod paymentMethod, y0 optionsParams) {
        p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
        String str = paymentMethod.id;
        if (str == null) {
            str = "";
        }
        return (T) c(str, paymentMethod.type, optionsParams);
    }

    public abstract T b(PaymentMethodCreateParams createParams, y0 optionsParams);

    public abstract T c(String paymentMethodId, PaymentMethod.p paymentMethodType, y0 optionsParams);

    private e() {
    }
}
