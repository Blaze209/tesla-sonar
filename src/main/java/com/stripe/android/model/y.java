package com.stripe.android.model;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0004\u0006J\u001b\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/y;", "", "", "", "a", "()Ljava/util/Map;", "b", "Lcom/stripe/android/model/y$a;", "Lcom/stripe/android/model/y$b;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface y {

    /* JADX INFO: renamed from: com.stripe.android.model.y$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/model/y$a;", "Lcom/stripe/android/model/y;", "", "clientSecret", "customerEmailAddress", "hostedSurface", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "", "a", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getClientSecret", "b", "getCustomerEmailAddress", "c", "getHostedSurface", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InstantDebits implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String clientSecret;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String customerEmailAddress;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String hostedSurface;

        public InstantDebits(String clientSecret, String str, String str2) {
            p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            this.customerEmailAddress = str;
            this.hostedSurface = str2;
        }

        @Override // com.stripe.android.model.y
        public Map<String, Object> a() {
            return s90.b.a(p013kotlin.collections.v0.m(jn0.x.a("client_secret", this.clientSecret), jn0.x.a("hosted_surface", this.hostedSurface), jn0.x.a("product", "instant_debits"), jn0.x.a("attach_required", Boolean.TRUE), jn0.x.a("payment_method_data", new PaymentMethodCreateParams(PaymentMethod.p.Link, null, null, null, null, null, null, null, null, null, null, null, null, null, new PaymentMethod.BillingDetails(null, this.customerEmailAddress, null, null, 13, null), null, null, null, null, 507902, null).c3())));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InstantDebits)) {
                return false;
            }
            InstantDebits instantDebits = (InstantDebits) other;
            return p013kotlin.jvm.internal.s.f(this.clientSecret, instantDebits.clientSecret) && p013kotlin.jvm.internal.s.f(this.customerEmailAddress, instantDebits.customerEmailAddress) && p013kotlin.jvm.internal.s.f(this.hostedSurface, instantDebits.hostedSurface);
        }

        public int hashCode() {
            int iHashCode = this.clientSecret.hashCode() * 31;
            String str = this.customerEmailAddress;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.hostedSurface;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "InstantDebits(clientSecret=" + this.clientSecret + ", customerEmailAddress=" + this.customerEmailAddress + ", hostedSurface=" + this.hostedSurface + ")";
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.y$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/model/y$b;", "Lcom/stripe/android/model/y;", "", "clientSecret", "customerName", "customerEmailAddress", "hostedSurface", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "", "a", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getClientSecret", "b", "getCustomerName", "c", "getCustomerEmailAddress", DateTokenConverter.CONVERTER_KEY, "getHostedSurface", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class USBankAccount implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String clientSecret;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String customerName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String customerEmailAddress;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String hostedSurface;

        public USBankAccount(String clientSecret, String customerName, String str, String str2) {
            p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
            p013kotlin.jvm.internal.s.k(customerName, "customerName");
            this.clientSecret = clientSecret;
            this.customerName = customerName;
            this.customerEmailAddress = str;
            this.hostedSurface = str2;
        }

        @Override // com.stripe.android.model.y
        public Map<String, Object> a() {
            return s90.b.a(p013kotlin.collections.v0.m(jn0.x.a("client_secret", this.clientSecret), jn0.x.a("hosted_surface", this.hostedSurface), jn0.x.a("payment_method_data", PaymentMethodCreateParams.Companion.V(PaymentMethodCreateParams.INSTANCE, new PaymentMethod.BillingDetails(null, this.customerEmailAddress, this.customerName, null, 9, null), null, null, 6, null).c3())));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof USBankAccount)) {
                return false;
            }
            USBankAccount uSBankAccount = (USBankAccount) other;
            return p013kotlin.jvm.internal.s.f(this.clientSecret, uSBankAccount.clientSecret) && p013kotlin.jvm.internal.s.f(this.customerName, uSBankAccount.customerName) && p013kotlin.jvm.internal.s.f(this.customerEmailAddress, uSBankAccount.customerEmailAddress) && p013kotlin.jvm.internal.s.f(this.hostedSurface, uSBankAccount.hostedSurface);
        }

        public int hashCode() {
            int iHashCode = ((this.clientSecret.hashCode() * 31) + this.customerName.hashCode()) * 31;
            String str = this.customerEmailAddress;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.hostedSurface;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "USBankAccount(clientSecret=" + this.clientSecret + ", customerName=" + this.customerName + ", customerEmailAddress=" + this.customerEmailAddress + ", hostedSurface=" + this.hostedSurface + ")";
        }
    }

    Map<String, Object> a();
}
