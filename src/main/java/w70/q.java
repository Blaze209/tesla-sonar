package w70;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\b\u001a\u00020\u0005*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0018\u0010\b\u001a\u00020\u0005*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/StripeIntent;", "Lg80/j;", "e", "(Lcom/stripe/android/model/StripeIntent;)Lg80/j;", "Lcom/stripe/android/model/u0;", "", "c", "(Lcom/stripe/android/model/u0;)Z", "isInTerminalState", "Lcom/stripe/android/model/d1;", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/model/d1;)Z", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class q {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(PaymentIntent paymentIntent) {
        return v.g0(d1.i(StripeIntent.Status.Canceled, StripeIntent.Status.Succeeded, StripeIntent.Status.RequiresCapture), paymentIntent.getStatus());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(SetupIntent setupIntent) {
        return v.g0(d1.i(StripeIntent.Status.Canceled, StripeIntent.Status.Succeeded), setupIntent.getStatus());
    }

    public static final g80.j e(StripeIntent stripeIntent) {
        Object objB;
        s.k(stripeIntent, "<this>");
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(p.f121203a.a(stripeIntent));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            return g80.k.a(thE);
        }
        return null;
    }
}
