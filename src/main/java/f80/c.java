package f80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.DeferredIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.j0;
import com.stripe.android.paymentsheet.f;
import com.stripe.android.paymentsheet.y;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import w30.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a5\u0010\u000b\u001a\u00020\n*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007*\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0012\u001a\u00020\u0000*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/model/StripeIntent;", "f", "(Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/paymentsheet/y$m;", "Lcom/stripe/android/paymentsheet/y$j;", "customer", "", "", "externalPaymentMethods", "defaultPaymentMethodId", "Lcom/stripe/android/model/j0;", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/paymentsheet/y$m;Lcom/stripe/android/paymentsheet/y$j;Ljava/util/List;Ljava/lang/String;)Lcom/stripe/android/model/j0;", "c", "(Lcom/stripe/android/paymentsheet/y$j;)Ljava/lang/String;", "Lcom/stripe/android/model/j0$a;", "Lw30/l$c;", "options", "e", "(Lcom/stripe/android/model/j0$a;Lw30/l$c;)Lcom/stripe/android/model/StripeIntent;", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class c {
    private static final String c(y.CustomerConfiguration customerConfiguration) {
        y.i accessType = customerConfiguration.getAccessType();
        if (accessType instanceof y.i.CustomerSession) {
            return ((y.i.CustomerSession) customerConfiguration.getAccessType()).getCustomerSessionClientSecret();
        }
        if (accessType instanceof y.i.LegacyCustomerEphemeralKey) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final j0 d(y.m mVar, y.CustomerConfiguration customerConfiguration, List<String> externalPaymentMethods, String str) {
        s.k(mVar, "<this>");
        s.k(externalPaymentMethods, "externalPaymentMethods");
        String strC = customerConfiguration != null ? c(customerConfiguration) : null;
        if (mVar instanceof y.m.PaymentIntent) {
            return new j0.PaymentIntentType(((y.m.PaymentIntent) mVar).getClientSecret(), null, strC, str, externalPaymentMethods, 2, null);
        }
        if (mVar instanceof y.m.SetupIntent) {
            return new j0.SetupIntentType(((y.m.SetupIntent) mVar).getClientSecret(), null, strC, str, externalPaymentMethods, 2, null);
        }
        if (mVar instanceof y.m.DeferredIntent) {
            return new j0.DeferredIntentType(null, f.b(((y.m.DeferredIntent) mVar).getIntentConfiguration()), externalPaymentMethods, str, strC, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StripeIntent e(j0.DeferredIntentType deferredIntentType, l.Options options) {
        DeferredIntentParams deferredIntentParams = deferredIntentType.getDeferredIntentParams();
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        DeferredIntentParams.b mode = deferredIntentParams.getMode();
        if (mode instanceof DeferredIntentParams.b.Payment) {
            return new PaymentIntent(deferredIntentParams.getPaymentMethodConfigurationId(), deferredIntentParams.t(), Long.valueOf(((DeferredIntentParams.b.Payment) mode).getAmount()), 0L, null, null, deferredIntentType.getClientSecret(), null, null, timeInMillis, deferredIntentParams.getMode().getCurrency(), null, options.d(), null, null, null, null, null, null, null, v.m(), null, null, null, 15722680, null);
        }
        if (!(mode instanceof DeferredIntentParams.b.Setup)) {
            throw new NoWhenBranchMatchedException();
        }
        return new SetupIntent(deferredIntentParams.getPaymentMethodConfigurationId(), null, timeInMillis, null, deferredIntentType.getClientSecret(), null, options.d(), null, null, deferredIntentParams.t(), null, null, null, v.m(), v.m(), null, null, 69760, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StripeIntent f(StripeIntent stripeIntent) {
        List<String> listT = stripeIntent.t();
        List arrayList = new ArrayList();
        for (Object obj : listT) {
            if (!s.f((String) obj, PaymentMethod.p.WeChatPay.code)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = v.e("card");
        }
        List list = arrayList;
        if (stripeIntent instanceof PaymentIntent) {
            return PaymentIntent.b((PaymentIntent) stripeIntent, null, list, null, 0L, null, null, null, null, null, 0L, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 16777213, null);
        }
        if (stripeIntent instanceof SetupIntent) {
            return SetupIntent.b((SetupIntent) stripeIntent, null, null, 0L, null, null, null, false, null, null, list, null, null, null, null, null, null, null, 130559, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
