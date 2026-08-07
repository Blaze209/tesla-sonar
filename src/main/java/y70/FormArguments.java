package y70;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.paymentsheet.y;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p017o70.AddressDetails;
import u60.h;
import w80.Amount;

/* JADX INFO: renamed from: y70.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001f\b\u0080\b\u0018\u00002\u00020\u0001Ba\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001e\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b&\u0010*\u001a\u0004\b!\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b \u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u00101R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b-\u00102\u001a\u0004\b'\u00103R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b%\u00106¨\u00067"}, d2 = {"Ly70/a;", "", "", "Lcom/stripe/android/model/PaymentMethodCode;", "paymentMethodCode", "Lx80/a;", "cbcEligibility", "merchantName", "Lw80/b;", "amount", "Lcom/stripe/android/paymentsheet/y$c;", "billingDetails", "Lo70/a;", "shippingDetails", "Lu60/h;", "paymentMethodSaveConsentBehavior", "", "hasIntentToSetup", "Lcom/stripe/android/paymentsheet/y$d;", "billingDetailsCollectionConfiguration", "<init>", "(Ljava/lang/String;Lx80/a;Ljava/lang/String;Lw80/b;Lcom/stripe/android/paymentsheet/y$c;Lo70/a;Lu60/h;ZLcom/stripe/android/paymentsheet/y$d;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "Lx80/a;", "getCbcEligibility", "()Lx80/a;", "c", "e", DateTokenConverter.CONVERTER_KEY, "Lw80/b;", "()Lw80/b;", "Lcom/stripe/android/paymentsheet/y$c;", "()Lcom/stripe/android/paymentsheet/y$c;", "Lo70/a;", "h", "()Lo70/a;", "g", "Lu60/h;", "()Lu60/h;", "Z", "()Z", IntegerTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/paymentsheet/y$d;", "()Lcom/stripe/android/paymentsheet/y$d;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FormArguments {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentMethodCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final x80.a cbcEligibility;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String merchantName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Amount amount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final y.BillingDetails billingDetails;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressDetails shippingDetails;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final h paymentMethodSaveConsentBehavior;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasIntentToSetup;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final y.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration;

    public FormArguments(String paymentMethodCode, x80.a cbcEligibility, String merchantName, Amount amount, y.BillingDetails billingDetails, AddressDetails addressDetails, h paymentMethodSaveConsentBehavior, boolean z11, y.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration) {
        s.k(paymentMethodCode, "paymentMethodCode");
        s.k(cbcEligibility, "cbcEligibility");
        s.k(merchantName, "merchantName");
        s.k(paymentMethodSaveConsentBehavior, "paymentMethodSaveConsentBehavior");
        s.k(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        this.paymentMethodCode = paymentMethodCode;
        this.cbcEligibility = cbcEligibility;
        this.merchantName = merchantName;
        this.amount = amount;
        this.billingDetails = billingDetails;
        this.shippingDetails = addressDetails;
        this.paymentMethodSaveConsentBehavior = paymentMethodSaveConsentBehavior;
        this.hasIntentToSetup = z11;
        this.billingDetailsCollectionConfiguration = billingDetailsCollectionConfiguration;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Amount getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final y.BillingDetails getBillingDetails() {
        return this.billingDetails;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final y.BillingDetailsCollectionConfiguration getBillingDetailsCollectionConfiguration() {
        return this.billingDetailsCollectionConfiguration;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getHasIntentToSetup() {
        return this.hasIntentToSetup;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormArguments)) {
            return false;
        }
        FormArguments formArguments = (FormArguments) other;
        return s.f(this.paymentMethodCode, formArguments.paymentMethodCode) && s.f(this.cbcEligibility, formArguments.cbcEligibility) && s.f(this.merchantName, formArguments.merchantName) && s.f(this.amount, formArguments.amount) && s.f(this.billingDetails, formArguments.billingDetails) && s.f(this.shippingDetails, formArguments.shippingDetails) && s.f(this.paymentMethodSaveConsentBehavior, formArguments.paymentMethodSaveConsentBehavior) && this.hasIntentToSetup == formArguments.hasIntentToSetup && s.f(this.billingDetailsCollectionConfiguration, formArguments.billingDetailsCollectionConfiguration);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final h getPaymentMethodSaveConsentBehavior() {
        return this.paymentMethodSaveConsentBehavior;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final AddressDetails getShippingDetails() {
        return this.shippingDetails;
    }

    public int hashCode() {
        int iHashCode = ((((this.paymentMethodCode.hashCode() * 31) + this.cbcEligibility.hashCode()) * 31) + this.merchantName.hashCode()) * 31;
        Amount amount = this.amount;
        int iHashCode2 = (iHashCode + (amount == null ? 0 : amount.hashCode())) * 31;
        y.BillingDetails billingDetails = this.billingDetails;
        int iHashCode3 = (iHashCode2 + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31;
        AddressDetails addressDetails = this.shippingDetails;
        return ((((((iHashCode3 + (addressDetails != null ? addressDetails.hashCode() : 0)) * 31) + this.paymentMethodSaveConsentBehavior.hashCode()) * 31) + Boolean.hashCode(this.hasIntentToSetup)) * 31) + this.billingDetailsCollectionConfiguration.hashCode();
    }

    public String toString() {
        return "FormArguments(paymentMethodCode=" + this.paymentMethodCode + ", cbcEligibility=" + this.cbcEligibility + ", merchantName=" + this.merchantName + ", amount=" + this.amount + ", billingDetails=" + this.billingDetails + ", shippingDetails=" + this.shippingDetails + ", paymentMethodSaveConsentBehavior=" + this.paymentMethodSaveConsentBehavior + ", hasIntentToSetup=" + this.hasIntentToSetup + ", billingDetailsCollectionConfiguration=" + this.billingDetailsCollectionConfiguration + ")";
    }
}
