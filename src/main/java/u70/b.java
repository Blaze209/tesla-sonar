package u70;

import com.fourthline.adapters.serialization.OrcaKeys;
import com.stripe.android.paymentsheet.y;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p017o70.AddressDetails;
import u60.PaymentMethodMetadata;
import w80.Amount;
import y70.FormArguments;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lu70/b;", "", "<init>", "()V", "", "Lcom/stripe/android/model/PaymentMethodCode;", "paymentMethodCode", "Lu60/e;", OrcaKeys.METADATA, "Ly70/a;", "a", "(Ljava/lang/String;Lu60/e;)Ly70/a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f115807a = new b();

    private b() {
    }

    public final FormArguments a(String paymentMethodCode, PaymentMethodMetadata metadata) {
        s.k(paymentMethodCode, "paymentMethodCode");
        s.k(metadata, "metadata");
        String merchantName = metadata.getMerchantName();
        Amount amountB = metadata.b();
        y.BillingDetails defaultBillingDetails = metadata.getDefaultBillingDetails();
        AddressDetails shippingDetails = metadata.getShippingDetails();
        y.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration = metadata.getBillingDetailsCollectionConfiguration();
        return new FormArguments(paymentMethodCode, metadata.getCbcEligibility(), merchantName, amountB, defaultBillingDetails, shippingDetails, metadata.getPaymentMethodSaveConsentBehavior(), metadata.w(), billingDetailsCollectionConfiguration);
    }
}
