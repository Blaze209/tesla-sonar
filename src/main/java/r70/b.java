package r70;

import c80.CvcRecollectionData;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.y;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import w70.j;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0015\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\fJ;\u0010\u001a\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lr70/b;", "Lr70/a;", "<init>", "()V", "Lcom/stripe/android/paymentsheet/y$m;", "initializationMode", "", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/paymentsheet/y$m;)Z", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "e", "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/y$m;)Z", "Lw70/j;", "paymentSelection", "f", "(Lw70/j;)Z", "Lkotlin/Function1;", "Lc80/d;", "Ljn0/h0;", "launch", "a", "(Lw70/j;Lwn0/l;)V", "b", "Lkotlin/Function0;", "extraRequirements", "c", "(Lcom/stripe/android/model/StripeIntent;Lw70/j;Lcom/stripe/android/paymentsheet/y$m;Lwn0/a;)Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements a {
    private final boolean d(y.m initializationMode) {
        y.n intentConfiguration;
        y.m.DeferredIntent deferredIntent = initializationMode instanceof y.m.DeferredIntent ? (y.m.DeferredIntent) initializationMode : null;
        return deferredIntent != null && (intentConfiguration = deferredIntent.getIntentConfiguration()) != null && intentConfiguration.getRequireCvcRecollection() && (((y.m.DeferredIntent) initializationMode).getIntentConfiguration().getMode() instanceof y.n.d.a);
    }

    private final boolean e(StripeIntent stripeIntent, y.m initializationMode) {
        PaymentIntent paymentIntent = stripeIntent instanceof PaymentIntent ? (PaymentIntent) stripeIntent : null;
        return paymentIntent != null && paymentIntent.k() && (initializationMode instanceof y.m.PaymentIntent);
    }

    private final boolean f(j paymentSelection) {
        return (paymentSelection instanceof j.Saved) && ((j.Saved) paymentSelection).getPaymentMethod().type == PaymentMethod.p.Card;
    }

    @Override // r70.a
    public void a(j paymentSelection, l<? super CvcRecollectionData, h0> launch) {
        PaymentMethod paymentMethod;
        s.k(launch, "launch");
        h0 h0Var = null;
        j.Saved saved = paymentSelection instanceof j.Saved ? (j.Saved) paymentSelection : null;
        CvcRecollectionData cvcRecollectionDataA = CvcRecollectionData.INSTANCE.a((saved == null || (paymentMethod = saved.getPaymentMethod()) == null) ? null : paymentMethod.card);
        if (cvcRecollectionDataA != null) {
            launch.invoke(cvcRecollectionDataA);
            h0Var = h0.f84049a;
        }
        if (h0Var == null) {
            throw new IllegalStateException("unable to create CvcRecollectionData");
        }
    }

    @Override // r70.a
    public boolean b(StripeIntent stripeIntent, y.m initializationMode) {
        return d(initializationMode) || e(stripeIntent, initializationMode);
    }

    @Override // r70.a
    public boolean c(StripeIntent stripeIntent, j paymentSelection, y.m initializationMode, wn0.a<Boolean> extraRequirements) {
        s.k(extraRequirements, "extraRequirements");
        return f(paymentSelection) && b(stripeIntent, initializationMode) && extraRequirements.invoke().booleanValue();
    }
}
