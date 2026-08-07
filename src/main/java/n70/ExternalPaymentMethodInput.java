package n70;

import com.stripe.android.model.PaymentMethod;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: n70.i, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\f\u0010\u0012¨\u0006\u0014"}, d2 = {"Ln70/i;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "type", "Lcom/stripe/android/model/v0$e;", "Lcom/stripe/android/model/v0$e;", "()Lcom/stripe/android/model/v0$e;", "billingDetails", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ExternalPaymentMethodInput {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f93415c = PaymentMethod.BillingDetails.f51568f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentMethod.BillingDetails billingDetails;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final PaymentMethod.BillingDetails getBillingDetails() {
        return this.billingDetails;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalPaymentMethodInput)) {
            return false;
        }
        ExternalPaymentMethodInput externalPaymentMethodInput = (ExternalPaymentMethodInput) other;
        return p013kotlin.jvm.internal.s.f(this.type, externalPaymentMethodInput.type) && p013kotlin.jvm.internal.s.f(this.billingDetails, externalPaymentMethodInput.billingDetails);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        PaymentMethod.BillingDetails billingDetails = this.billingDetails;
        return iHashCode + (billingDetails == null ? 0 : billingDetails.hashCode());
    }

    public String toString() {
        return "ExternalPaymentMethodInput(type=" + this.type + ", billingDetails=" + this.billingDetails + ")";
    }
}
