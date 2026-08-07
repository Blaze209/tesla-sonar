package f30;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.action.Action;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.MandateDataParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.y0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lf30/c;", "Lf30/e;", "Lcom/stripe/android/model/l;", "", "clientSecret", "Lcom/stripe/android/model/l$d;", "shipping", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/l$d;)V", "paymentMethodId", "Lcom/stripe/android/model/v0$p;", Action.PAYMENT_METHOD_TYPE, "Lcom/stripe/android/model/y0;", "optionsParams", "e", "(Ljava/lang/String;Lcom/stripe/android/model/v0$p;Lcom/stripe/android/model/y0;)Lcom/stripe/android/model/l;", "Lcom/stripe/android/model/w0;", "createParams", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/model/w0;Lcom/stripe/android/model/y0;)Lcom/stripe/android/model/l;", "b", "Ljava/lang/String;", "c", "Lcom/stripe/android/model/l$d;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c extends e<ConfirmPaymentIntentParams> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String clientSecret;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ConfirmPaymentIntentParams.Shipping shipping;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String clientSecret, ConfirmPaymentIntentParams.Shipping shipping) {
        super(null);
        p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        this.shipping = shipping;
    }

    @Override // f30.e
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ConfirmPaymentIntentParams b(PaymentMethodCreateParams createParams, y0 optionsParams) {
        p013kotlin.jvm.internal.s.k(createParams, "createParams");
        return ConfirmPaymentIntentParams.Companion.f(ConfirmPaymentIntentParams.INSTANCE, createParams, this.clientSecret, null, null, null, null, this.shipping, optionsParams, 60, null);
    }

    @Override // f30.e
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ConfirmPaymentIntentParams c(String paymentMethodId, PaymentMethod.p paymentMethodType, y0 optionsParams) {
        p013kotlin.jvm.internal.s.k(paymentMethodId, "paymentMethodId");
        ConfirmPaymentIntentParams.Companion companion = ConfirmPaymentIntentParams.INSTANCE;
        String str = this.clientSecret;
        MandateDataParams mandateDataParams = new MandateDataParams(MandateDataParams.c.Online.INSTANCE.a());
        if (paymentMethodType == null || !paymentMethodType.requiresMandate) {
            mandateDataParams = null;
        }
        return ConfirmPaymentIntentParams.Companion.h(companion, paymentMethodId, str, null, optionsParams, null, mandateDataParams, null, this.shipping, 84, null);
    }
}
