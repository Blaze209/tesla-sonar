package a70;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import f30.d0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"La70/b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Lcom/stripe/android/model/u0;", "paymentIntent", "", "b", "(Lcom/stripe/android/model/u0;)Ljava/lang/String;", "Lcom/stripe/android/model/d1;", "setupIntent", "c", "(Lcom/stripe/android/model/d1;)Ljava/lang/String;", "Lcom/stripe/android/model/StripeIntent;", "", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/model/StripeIntent;)Z", AnalyticsAttribute.Intent, "", "outcome", "a", "(Lcom/stripe/android/model/StripeIntent;I)Ljava/lang/String;", "Landroid/content/Context;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public b(Context context) {
        s.k(context, "context");
        this.context = context;
    }

    private final String b(PaymentIntent paymentIntent) {
        PaymentMethod paymentMethod;
        PaymentMethod.p pVar;
        if (paymentIntent.getStatus() != StripeIntent.Status.RequiresAction || ((paymentMethod = paymentIntent.getPaymentMethod()) != null && (pVar = paymentMethod.type) != null && pVar.isVoucher)) {
            PaymentIntent.Error lastPaymentError = paymentIntent.getLastPaymentError();
            if (!s.f(lastPaymentError != null ? lastPaymentError.getCode() : null, "payment_intent_authentication_failure")) {
                PaymentIntent.Error lastPaymentError2 = paymentIntent.getLastPaymentError();
                if ((lastPaymentError2 != null ? lastPaymentError2.getType() : null) == PaymentIntent.Error.c.CardError) {
                    return z60.f.c(paymentIntent.getLastPaymentError(), this.context).getMessage();
                }
                return null;
            }
        }
        return this.context.getResources().getString(d0.f63965p0);
    }

    private final String c(SetupIntent setupIntent) {
        SetupIntent.Error lastSetupError = setupIntent.getLastSetupError();
        if (s.f(lastSetupError != null ? lastSetupError.getCode() : null, "setup_intent_authentication_failure")) {
            return this.context.getResources().getString(d0.f63965p0);
        }
        SetupIntent.Error lastSetupError2 = setupIntent.getLastSetupError();
        if ((lastSetupError2 != null ? lastSetupError2.getType() : null) == SetupIntent.Error.c.CardError) {
            return z60.f.d(setupIntent.getLastSetupError(), this.context).getMessage();
        }
        return null;
    }

    private final boolean d(StripeIntent stripeIntent) {
        PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
        return (paymentMethod != null ? paymentMethod.type : null) == PaymentMethod.p.Card && (stripeIntent.getNextActionData() instanceof StripeIntent.a.j.Use3DS2);
    }

    public final String a(StripeIntent intent, int outcome) {
        s.k(intent, "intent");
        if (outcome == 4) {
            return this.context.getResources().getString(d0.f63967q0);
        }
        if (d(intent)) {
            return null;
        }
        if (intent.getStatus() != StripeIntent.Status.RequiresPaymentMethod && intent.getStatus() != StripeIntent.Status.RequiresAction) {
            return null;
        }
        if (intent instanceof PaymentIntent) {
            return b((PaymentIntent) intent);
        }
        if (intent instanceof SetupIntent) {
            return c((SetupIntent) intent);
        }
        throw new NoWhenBranchMatchedException();
    }
}
