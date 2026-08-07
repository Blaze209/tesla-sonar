package f30;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.action.Action;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.MandateDataParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.y0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lf30/d;", "Lf30/e;", "Lcom/stripe/android/model/m;", "", "clientSecret", "<init>", "(Ljava/lang/String;)V", "paymentMethodId", "Lcom/stripe/android/model/v0$p;", Action.PAYMENT_METHOD_TYPE, "Lcom/stripe/android/model/y0;", "optionsParams", "e", "(Ljava/lang/String;Lcom/stripe/android/model/v0$p;Lcom/stripe/android/model/y0;)Lcom/stripe/android/model/m;", "Lcom/stripe/android/model/w0;", "createParams", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/model/w0;Lcom/stripe/android/model/y0;)Lcom/stripe/android/model/m;", "b", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d extends e<ConfirmSetupIntentParams> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String clientSecret;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String clientSecret) {
        super(null);
        p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
    }

    @Override // f30.e
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ConfirmSetupIntentParams b(PaymentMethodCreateParams createParams, y0 optionsParams) {
        p013kotlin.jvm.internal.s.k(createParams, "createParams");
        return ConfirmSetupIntentParams.Companion.d(ConfirmSetupIntentParams.INSTANCE, createParams, this.clientSecret, null, null, 12, null);
    }

    @Override // f30.e
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ConfirmSetupIntentParams c(String paymentMethodId, PaymentMethod.p paymentMethodType, y0 optionsParams) {
        p013kotlin.jvm.internal.s.k(paymentMethodId, "paymentMethodId");
        return ConfirmSetupIntentParams.Companion.e(ConfirmSetupIntentParams.INSTANCE, paymentMethodId, this.clientSecret, paymentMethodType != null ? new MandateDataParams(MandateDataParams.c.Online.INSTANCE.a()) : null, null, 8, null);
    }
}
