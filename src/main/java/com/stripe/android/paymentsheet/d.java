package com.stripe.android.paymentsheet;

import com.stripe.android.model.DeferredIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import java.util.Locale;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/d;", "", "<init>", "()V", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "Lcom/stripe/android/paymentsheet/y$n;", "intentConfiguration", "", "isFlowController", "a", "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/y$n;Z)Lcom/stripe/android/model/StripeIntent;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f52798a = new d();

    private d() {
    }

    public final StripeIntent a(StripeIntent stripeIntent, y.n intentConfiguration, boolean isFlowController) {
        String lowerCase;
        p013kotlin.jvm.internal.s.k(stripeIntent, "stripeIntent");
        p013kotlin.jvm.internal.s.k(intentConfiguration, "intentConfiguration");
        DeferredIntentParams deferredIntentParamsB = f.b(intentConfiguration);
        String lowerCase2 = null;
        if (!(stripeIntent instanceof PaymentIntent)) {
            if (!(stripeIntent instanceof SetupIntent)) {
                return stripeIntent;
            }
            DeferredIntentParams.b mode = deferredIntentParamsB.getMode();
            DeferredIntentParams.b.Setup setup = mode instanceof DeferredIntentParams.b.Setup ? (DeferredIntentParams.b.Setup) mode : null;
            if (setup == null) {
                throw new IllegalArgumentException("You returned a SetupIntent client secret but used a PaymentSheet.IntentConfiguration in payment mode.");
            }
            SetupIntent setupIntent = (SetupIntent) stripeIntent;
            if (setup.getSetupFutureUsage() == setupIntent.getUsage()) {
                return stripeIntent;
            }
            throw new IllegalArgumentException(("Your SetupIntent usage (" + setupIntent.getUsage() + ") does not match the PaymentSheet.IntentConfiguration usage (" + setupIntent.getUsage() + ").").toString());
        }
        DeferredIntentParams.b mode2 = deferredIntentParamsB.getMode();
        DeferredIntentParams.b.Payment payment = mode2 instanceof DeferredIntentParams.b.Payment ? (DeferredIntentParams.b.Payment) mode2 : null;
        if (payment == null) {
            throw new IllegalArgumentException("You returned a PaymentIntent client secret but used a PaymentSheet.IntentConfiguration in setup mode.");
        }
        String currency = payment.getCurrency();
        Locale locale = Locale.ROOT;
        String lowerCase3 = currency.toLowerCase(locale);
        p013kotlin.jvm.internal.s.j(lowerCase3, "toLowerCase(...)");
        PaymentIntent paymentIntent = (PaymentIntent) stripeIntent;
        String currency2 = paymentIntent.getCurrency();
        if (currency2 != null) {
            lowerCase = currency2.toLowerCase(locale);
            p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        if (!p013kotlin.jvm.internal.s.f(lowerCase3, lowerCase)) {
            String currency3 = paymentIntent.getCurrency();
            if (currency3 != null) {
                lowerCase2 = currency3.toLowerCase(locale);
                p013kotlin.jvm.internal.s.j(lowerCase2, "toLowerCase(...)");
            }
            String lowerCase4 = payment.getCurrency().toLowerCase(locale);
            p013kotlin.jvm.internal.s.j(lowerCase4, "toLowerCase(...)");
            throw new IllegalArgumentException(("Your PaymentIntent currency (" + lowerCase2 + ") does not match the PaymentSheet.IntentConfiguration currency (" + lowerCase4 + ").").toString());
        }
        if (payment.getSetupFutureUsage() != paymentIntent.getSetupFutureUsage()) {
            throw new IllegalArgumentException(("Your PaymentIntent setupFutureUsage (" + paymentIntent.getSetupFutureUsage() + ") does not match the PaymentSheet.IntentConfiguration setupFutureUsage (" + payment.getSetupFutureUsage() + ").").toString());
        }
        if (payment.getCaptureMethod() == paymentIntent.getCaptureMethod()) {
            if (paymentIntent.getConfirmationMethod() != PaymentIntent.e.Manual || isFlowController) {
                return stripeIntent;
            }
            throw new IllegalArgumentException(("Your PaymentIntent confirmationMethod (" + paymentIntent.getConfirmationMethod() + ") can only be used with PaymentSheet.FlowController.").toString());
        }
        throw new IllegalArgumentException(("Your PaymentIntent captureMethod (" + paymentIntent.getCaptureMethod() + ") does not match the PaymentSheet.IntentConfiguration captureMethod (" + payment.getCaptureMethod() + ").").toString());
    }
}
