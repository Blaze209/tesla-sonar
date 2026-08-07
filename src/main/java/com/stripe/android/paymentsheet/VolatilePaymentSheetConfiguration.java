package com.stripe.android.paymentsheet;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.List;
import p013kotlin.Metadata;
import p017o70.AddressDetails;

/* JADX INFO: renamed from: com.stripe.android.paymentsheet.g0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b&\b\u0082\b\u0018\u00002\u00020\u0001:\u0001\u001eB]\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b<\u0010/\u001a\u0004\b=\u00101¨\u0006>"}, d2 = {"Lcom/stripe/android/paymentsheet/g0;", "", "Lcom/stripe/android/paymentsheet/y$j;", "customer", "Lcom/stripe/android/paymentsheet/g0$a;", "googlePay", "Lcom/stripe/android/paymentsheet/y$c;", "defaultBillingDetails", "Lo70/a;", "shippingDetails", "", "allowsDelayedPaymentMethods", "allowsPaymentMethodsRequiringShippingAddress", "Lcom/stripe/android/paymentsheet/y$d;", "billingDetailsCollectionConfiguration", "", "Lcom/stripe/android/model/h;", "preferredNetworks", "allowsRemovalOfLastSavedPaymentMethod", "<init>", "(Lcom/stripe/android/paymentsheet/y$j;Lcom/stripe/android/paymentsheet/g0$a;Lcom/stripe/android/paymentsheet/y$c;Lo70/a;ZZLcom/stripe/android/paymentsheet/y$d;Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/paymentsheet/y$j;", "getCustomer", "()Lcom/stripe/android/paymentsheet/y$j;", "b", "Lcom/stripe/android/paymentsheet/g0$a;", "getGooglePay", "()Lcom/stripe/android/paymentsheet/g0$a;", "c", "Lcom/stripe/android/paymentsheet/y$c;", "getDefaultBillingDetails", "()Lcom/stripe/android/paymentsheet/y$c;", DateTokenConverter.CONVERTER_KEY, "Lo70/a;", "getShippingDetails", "()Lo70/a;", "e", "Z", "getAllowsDelayedPaymentMethods", "()Z", "f", "getAllowsPaymentMethodsRequiringShippingAddress", "g", "Lcom/stripe/android/paymentsheet/y$d;", "getBillingDetailsCollectionConfiguration", "()Lcom/stripe/android/paymentsheet/y$d;", "h", "Ljava/util/List;", "getPreferredNetworks", "()Ljava/util/List;", IntegerTokenConverter.CONVERTER_KEY, "getAllowsRemovalOfLastSavedPaymentMethod", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final /* data */ class VolatilePaymentSheetConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final y.CustomerConfiguration customer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final GooglePayConfiguration googlePay;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final y.BillingDetails defaultBillingDetails;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressDetails shippingDetails;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean allowsDelayedPaymentMethods;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean allowsPaymentMethodsRequiringShippingAddress;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final y.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<com.stripe.android.model.h> preferredNetworks;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean allowsRemovalOfLastSavedPaymentMethod;

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.g0$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentsheet/g0$a;", "", "Lcom/stripe/android/paymentsheet/y$l$c;", AnalyticsAttribute.Environment, "", "countryCode", "currencyCode", "<init>", "(Lcom/stripe/android/paymentsheet/y$l$c;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/paymentsheet/y$l$c;", "getEnvironment", "()Lcom/stripe/android/paymentsheet/y$l$c;", "b", "Ljava/lang/String;", "getCountryCode", "c", "getCurrencyCode", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GooglePayConfiguration {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final y.GooglePayConfiguration.c environment;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String countryCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String currencyCode;

        public GooglePayConfiguration(y.GooglePayConfiguration.c environment, String countryCode, String str) {
            p013kotlin.jvm.internal.s.k(environment, "environment");
            p013kotlin.jvm.internal.s.k(countryCode, "countryCode");
            this.environment = environment;
            this.countryCode = countryCode;
            this.currencyCode = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GooglePayConfiguration)) {
                return false;
            }
            GooglePayConfiguration googlePayConfiguration = (GooglePayConfiguration) other;
            return this.environment == googlePayConfiguration.environment && p013kotlin.jvm.internal.s.f(this.countryCode, googlePayConfiguration.countryCode) && p013kotlin.jvm.internal.s.f(this.currencyCode, googlePayConfiguration.currencyCode);
        }

        public int hashCode() {
            int iHashCode = ((this.environment.hashCode() * 31) + this.countryCode.hashCode()) * 31;
            String str = this.currencyCode;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "GooglePayConfiguration(environment=" + this.environment + ", countryCode=" + this.countryCode + ", currencyCode=" + this.currencyCode + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VolatilePaymentSheetConfiguration(y.CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, y.BillingDetails billingDetails, AddressDetails addressDetails, boolean z11, boolean z12, y.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, List<? extends com.stripe.android.model.h> preferredNetworks, boolean z13) {
        p013kotlin.jvm.internal.s.k(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        p013kotlin.jvm.internal.s.k(preferredNetworks, "preferredNetworks");
        this.customer = customerConfiguration;
        this.googlePay = googlePayConfiguration;
        this.defaultBillingDetails = billingDetails;
        this.shippingDetails = addressDetails;
        this.allowsDelayedPaymentMethods = z11;
        this.allowsPaymentMethodsRequiringShippingAddress = z12;
        this.billingDetailsCollectionConfiguration = billingDetailsCollectionConfiguration;
        this.preferredNetworks = preferredNetworks;
        this.allowsRemovalOfLastSavedPaymentMethod = z13;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VolatilePaymentSheetConfiguration)) {
            return false;
        }
        VolatilePaymentSheetConfiguration volatilePaymentSheetConfiguration = (VolatilePaymentSheetConfiguration) other;
        return p013kotlin.jvm.internal.s.f(this.customer, volatilePaymentSheetConfiguration.customer) && p013kotlin.jvm.internal.s.f(this.googlePay, volatilePaymentSheetConfiguration.googlePay) && p013kotlin.jvm.internal.s.f(this.defaultBillingDetails, volatilePaymentSheetConfiguration.defaultBillingDetails) && p013kotlin.jvm.internal.s.f(this.shippingDetails, volatilePaymentSheetConfiguration.shippingDetails) && this.allowsDelayedPaymentMethods == volatilePaymentSheetConfiguration.allowsDelayedPaymentMethods && this.allowsPaymentMethodsRequiringShippingAddress == volatilePaymentSheetConfiguration.allowsPaymentMethodsRequiringShippingAddress && p013kotlin.jvm.internal.s.f(this.billingDetailsCollectionConfiguration, volatilePaymentSheetConfiguration.billingDetailsCollectionConfiguration) && p013kotlin.jvm.internal.s.f(this.preferredNetworks, volatilePaymentSheetConfiguration.preferredNetworks) && this.allowsRemovalOfLastSavedPaymentMethod == volatilePaymentSheetConfiguration.allowsRemovalOfLastSavedPaymentMethod;
    }

    public int hashCode() {
        y.CustomerConfiguration customerConfiguration = this.customer;
        int iHashCode = (customerConfiguration == null ? 0 : customerConfiguration.hashCode()) * 31;
        GooglePayConfiguration googlePayConfiguration = this.googlePay;
        int iHashCode2 = (iHashCode + (googlePayConfiguration == null ? 0 : googlePayConfiguration.hashCode())) * 31;
        y.BillingDetails billingDetails = this.defaultBillingDetails;
        int iHashCode3 = (iHashCode2 + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31;
        AddressDetails addressDetails = this.shippingDetails;
        return ((((((((((iHashCode3 + (addressDetails != null ? addressDetails.hashCode() : 0)) * 31) + Boolean.hashCode(this.allowsDelayedPaymentMethods)) * 31) + Boolean.hashCode(this.allowsPaymentMethodsRequiringShippingAddress)) * 31) + this.billingDetailsCollectionConfiguration.hashCode()) * 31) + this.preferredNetworks.hashCode()) * 31) + Boolean.hashCode(this.allowsRemovalOfLastSavedPaymentMethod);
    }

    public String toString() {
        return "VolatilePaymentSheetConfiguration(customer=" + this.customer + ", googlePay=" + this.googlePay + ", defaultBillingDetails=" + this.defaultBillingDetails + ", shippingDetails=" + this.shippingDetails + ", allowsDelayedPaymentMethods=" + this.allowsDelayedPaymentMethods + ", allowsPaymentMethodsRequiringShippingAddress=" + this.allowsPaymentMethodsRequiringShippingAddress + ", billingDetailsCollectionConfiguration=" + this.billingDetailsCollectionConfiguration + ", preferredNetworks=" + this.preferredNetworks + ", allowsRemovalOfLastSavedPaymentMethod=" + this.allowsRemovalOfLastSavedPaymentMethod + ")";
    }
}
