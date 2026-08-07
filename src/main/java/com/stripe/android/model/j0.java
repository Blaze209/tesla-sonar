package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e\u0082\u0001\u0003\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/j0;", "Landroid/os/Parcelable;", "", "getType", "()Ljava/lang/String;", "type", "p", "clientSecret", "t2", "customerSessionClientSecret", "getLocale", "locale", "", "g3", "()Ljava/util/List;", "expandFields", "E3", "defaultPaymentMethodId", "Y1", "externalPaymentMethods", "a", "b", "c", "Lcom/stripe/android/model/j0$a;", "Lcom/stripe/android/model/j0$b;", "Lcom/stripe/android/model/j0$c;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface j0 extends Parcelable {
    /* JADX INFO: renamed from: E3 */
    String getDefaultPaymentMethodId();

    List<String> Y1();

    List<String> g3();

    String getLocale();

    String getType();

    /* JADX INFO: renamed from: p */
    String getClientSecret();

    /* JADX INFO: renamed from: t2 */
    String getCustomerSessionClientSecret();

    /* JADX INFO: renamed from: com.stripe.android.model.j0$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\"R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b(\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010\rR\u0016\u0010,\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\rR\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\rR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010&¨\u00061"}, d2 = {"Lcom/stripe/android/model/j0$a;", "Lcom/stripe/android/model/j0;", "", "locale", "Lcom/stripe/android/model/g0;", "deferredIntentParams", "", "externalPaymentMethods", "defaultPaymentMethodId", "customerSessionClientSecret", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/g0;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getLocale", "b", "Lcom/stripe/android/model/g0;", "()Lcom/stripe/android/model/g0;", "c", "Ljava/util/List;", "Y1", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "E3", "e", "t2", "p", "clientSecret", "getType", "type", "g3", "expandFields", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeferredIntentType implements j0 {
        public static final Parcelable.Creator<DeferredIntentType> CREATOR = new C0901a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String locale;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final DeferredIntentParams deferredIntentParams;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> externalPaymentMethods;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String defaultPaymentMethodId;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String customerSessionClientSecret;

        /* JADX INFO: renamed from: com.stripe.android.model.j0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C0901a implements Parcelable.Creator<DeferredIntentType> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeferredIntentType createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new DeferredIntentType(parcel.readString(), DeferredIntentParams.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final DeferredIntentType[] newArray(int i11) {
                return new DeferredIntentType[i11];
            }
        }

        public DeferredIntentType(String str, DeferredIntentParams deferredIntentParams, List<String> externalPaymentMethods, String str2, String str3) {
            p013kotlin.jvm.internal.s.k(deferredIntentParams, "deferredIntentParams");
            p013kotlin.jvm.internal.s.k(externalPaymentMethods, "externalPaymentMethods");
            this.locale = str;
            this.deferredIntentParams = deferredIntentParams;
            this.externalPaymentMethods = externalPaymentMethods;
            this.defaultPaymentMethodId = str2;
            this.customerSessionClientSecret = str3;
        }

        @Override // com.stripe.android.model.j0
        /* JADX INFO: renamed from: E3, reason: from getter */
        public String getDefaultPaymentMethodId() {
            return this.defaultPaymentMethodId;
        }

        @Override // com.stripe.android.model.j0
        public List<String> Y1() {
            return this.externalPaymentMethods;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DeferredIntentParams getDeferredIntentParams() {
            return this.deferredIntentParams;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeferredIntentType)) {
                return false;
            }
            DeferredIntentType deferredIntentType = (DeferredIntentType) other;
            return p013kotlin.jvm.internal.s.f(this.locale, deferredIntentType.locale) && p013kotlin.jvm.internal.s.f(this.deferredIntentParams, deferredIntentType.deferredIntentParams) && p013kotlin.jvm.internal.s.f(this.externalPaymentMethods, deferredIntentType.externalPaymentMethods) && p013kotlin.jvm.internal.s.f(this.defaultPaymentMethodId, deferredIntentType.defaultPaymentMethodId) && p013kotlin.jvm.internal.s.f(this.customerSessionClientSecret, deferredIntentType.customerSessionClientSecret);
        }

        @Override // com.stripe.android.model.j0
        public List<String> g3() {
            return p013kotlin.collections.v.m();
        }

        @Override // com.stripe.android.model.j0
        public String getLocale() {
            return this.locale;
        }

        @Override // com.stripe.android.model.j0
        public String getType() {
            return "deferred_intent";
        }

        public int hashCode() {
            String str = this.locale;
            int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.deferredIntentParams.hashCode()) * 31) + this.externalPaymentMethods.hashCode()) * 31;
            String str2 = this.defaultPaymentMethodId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.customerSessionClientSecret;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // com.stripe.android.model.j0
        /* JADX INFO: renamed from: p */
        public String getClientSecret() {
            return null;
        }

        @Override // com.stripe.android.model.j0
        /* JADX INFO: renamed from: t2, reason: from getter */
        public String getCustomerSessionClientSecret() {
            return this.customerSessionClientSecret;
        }

        public String toString() {
            return "DeferredIntentType(locale=" + this.locale + ", deferredIntentParams=" + this.deferredIntentParams + ", externalPaymentMethods=" + this.externalPaymentMethods + ", defaultPaymentMethodId=" + this.defaultPaymentMethodId + ", customerSessionClientSecret=" + this.customerSessionClientSecret + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.locale);
            this.deferredIntentParams.writeToParcel(parcel, flags);
            parcel.writeStringList(this.externalPaymentMethods);
            parcel.writeString(this.defaultPaymentMethodId);
            parcel.writeString(this.customerSessionClientSecret);
        }

        public /* synthetic */ DeferredIntentType(String str, DeferredIntentParams deferredIntentParams, List list, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Locale.getDefault().toLanguageTag() : str, deferredIntentParams, list, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.j0$b, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\fR\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010(¨\u0006-"}, d2 = {"Lcom/stripe/android/model/j0$b;", "Lcom/stripe/android/model/j0;", "", "clientSecret", "locale", "customerSessionClientSecret", "defaultPaymentMethodId", "", "externalPaymentMethods", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "p", "b", "getLocale", "c", "t2", DateTokenConverter.CONVERTER_KEY, "E3", "e", "Ljava/util/List;", "Y1", "()Ljava/util/List;", "getType", "type", "g3", "expandFields", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PaymentIntentType implements j0 {
        public static final Parcelable.Creator<PaymentIntentType> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String clientSecret;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String locale;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String customerSessionClientSecret;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String defaultPaymentMethodId;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> externalPaymentMethods;

        /* JADX INFO: renamed from: com.stripe.android.model.j0$b$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PaymentIntentType> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaymentIntentType createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new PaymentIntentType(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final PaymentIntentType[] newArray(int i11) {
                return new PaymentIntentType[i11];
            }
        }

        public PaymentIntentType(String clientSecret, String str, String str2, String str3, List<String> externalPaymentMethods) {
            p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
            p013kotlin.jvm.internal.s.k(externalPaymentMethods, "externalPaymentMethods");
            this.clientSecret = clientSecret;
            this.locale = str;
            this.customerSessionClientSecret = str2;
            this.defaultPaymentMethodId = str3;
            this.externalPaymentMethods = externalPaymentMethods;
        }

        @Override // com.stripe.android.model.j0
        /* JADX INFO: renamed from: E3, reason: from getter */
        public String getDefaultPaymentMethodId() {
            return this.defaultPaymentMethodId;
        }

        @Override // com.stripe.android.model.j0
        public List<String> Y1() {
            return this.externalPaymentMethods;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentIntentType)) {
                return false;
            }
            PaymentIntentType paymentIntentType = (PaymentIntentType) other;
            return p013kotlin.jvm.internal.s.f(this.clientSecret, paymentIntentType.clientSecret) && p013kotlin.jvm.internal.s.f(this.locale, paymentIntentType.locale) && p013kotlin.jvm.internal.s.f(this.customerSessionClientSecret, paymentIntentType.customerSessionClientSecret) && p013kotlin.jvm.internal.s.f(this.defaultPaymentMethodId, paymentIntentType.defaultPaymentMethodId) && p013kotlin.jvm.internal.s.f(this.externalPaymentMethods, paymentIntentType.externalPaymentMethods);
        }

        @Override // com.stripe.android.model.j0
        public List<String> g3() {
            return p013kotlin.collections.v.e("payment_method_preference." + getType() + ".payment_method");
        }

        @Override // com.stripe.android.model.j0
        public String getLocale() {
            return this.locale;
        }

        @Override // com.stripe.android.model.j0
        public String getType() {
            return "payment_intent";
        }

        public int hashCode() {
            int iHashCode = this.clientSecret.hashCode() * 31;
            String str = this.locale;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.customerSessionClientSecret;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.defaultPaymentMethodId;
            return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.externalPaymentMethods.hashCode();
        }

        @Override // com.stripe.android.model.j0
        /* JADX INFO: renamed from: p, reason: from getter */
        public String getClientSecret() {
            return this.clientSecret;
        }

        @Override // com.stripe.android.model.j0
        /* JADX INFO: renamed from: t2, reason: from getter */
        public String getCustomerSessionClientSecret() {
            return this.customerSessionClientSecret;
        }

        public String toString() {
            return "PaymentIntentType(clientSecret=" + this.clientSecret + ", locale=" + this.locale + ", customerSessionClientSecret=" + this.customerSessionClientSecret + ", defaultPaymentMethodId=" + this.defaultPaymentMethodId + ", externalPaymentMethods=" + this.externalPaymentMethods + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.clientSecret);
            parcel.writeString(this.locale);
            parcel.writeString(this.customerSessionClientSecret);
            parcel.writeString(this.defaultPaymentMethodId);
            parcel.writeStringList(this.externalPaymentMethods);
        }

        public /* synthetic */ PaymentIntentType(String str, String str2, String str3, String str4, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? Locale.getDefault().toLanguageTag() : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, list);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.j0$c, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\fR\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010(¨\u0006-"}, d2 = {"Lcom/stripe/android/model/j0$c;", "Lcom/stripe/android/model/j0;", "", "clientSecret", "locale", "customerSessionClientSecret", "defaultPaymentMethodId", "", "externalPaymentMethods", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "p", "b", "getLocale", "c", "t2", DateTokenConverter.CONVERTER_KEY, "E3", "e", "Ljava/util/List;", "Y1", "()Ljava/util/List;", "getType", "type", "g3", "expandFields", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetupIntentType implements j0 {
        public static final Parcelable.Creator<SetupIntentType> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String clientSecret;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String locale;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String customerSessionClientSecret;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String defaultPaymentMethodId;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> externalPaymentMethods;

        /* JADX INFO: renamed from: com.stripe.android.model.j0$c$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SetupIntentType> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SetupIntentType createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new SetupIntentType(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SetupIntentType[] newArray(int i11) {
                return new SetupIntentType[i11];
            }
        }

        public SetupIntentType(String clientSecret, String str, String str2, String str3, List<String> externalPaymentMethods) {
            p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
            p013kotlin.jvm.internal.s.k(externalPaymentMethods, "externalPaymentMethods");
            this.clientSecret = clientSecret;
            this.locale = str;
            this.customerSessionClientSecret = str2;
            this.defaultPaymentMethodId = str3;
            this.externalPaymentMethods = externalPaymentMethods;
        }

        @Override // com.stripe.android.model.j0
        /* JADX INFO: renamed from: E3, reason: from getter */
        public String getDefaultPaymentMethodId() {
            return this.defaultPaymentMethodId;
        }

        @Override // com.stripe.android.model.j0
        public List<String> Y1() {
            return this.externalPaymentMethods;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetupIntentType)) {
                return false;
            }
            SetupIntentType setupIntentType = (SetupIntentType) other;
            return p013kotlin.jvm.internal.s.f(this.clientSecret, setupIntentType.clientSecret) && p013kotlin.jvm.internal.s.f(this.locale, setupIntentType.locale) && p013kotlin.jvm.internal.s.f(this.customerSessionClientSecret, setupIntentType.customerSessionClientSecret) && p013kotlin.jvm.internal.s.f(this.defaultPaymentMethodId, setupIntentType.defaultPaymentMethodId) && p013kotlin.jvm.internal.s.f(this.externalPaymentMethods, setupIntentType.externalPaymentMethods);
        }

        @Override // com.stripe.android.model.j0
        public List<String> g3() {
            return p013kotlin.collections.v.e("payment_method_preference." + getType() + ".payment_method");
        }

        @Override // com.stripe.android.model.j0
        public String getLocale() {
            return this.locale;
        }

        @Override // com.stripe.android.model.j0
        public String getType() {
            return "setup_intent";
        }

        public int hashCode() {
            int iHashCode = this.clientSecret.hashCode() * 31;
            String str = this.locale;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.customerSessionClientSecret;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.defaultPaymentMethodId;
            return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.externalPaymentMethods.hashCode();
        }

        @Override // com.stripe.android.model.j0
        /* JADX INFO: renamed from: p, reason: from getter */
        public String getClientSecret() {
            return this.clientSecret;
        }

        @Override // com.stripe.android.model.j0
        /* JADX INFO: renamed from: t2, reason: from getter */
        public String getCustomerSessionClientSecret() {
            return this.customerSessionClientSecret;
        }

        public String toString() {
            return "SetupIntentType(clientSecret=" + this.clientSecret + ", locale=" + this.locale + ", customerSessionClientSecret=" + this.customerSessionClientSecret + ", defaultPaymentMethodId=" + this.defaultPaymentMethodId + ", externalPaymentMethods=" + this.externalPaymentMethods + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.clientSecret);
            parcel.writeString(this.locale);
            parcel.writeString(this.customerSessionClientSecret);
            parcel.writeString(this.defaultPaymentMethodId);
            parcel.writeStringList(this.externalPaymentMethods);
        }

        public /* synthetic */ SetupIntentType(String str, String str2, String str3, String str4, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? Locale.getDefault().toLanguageTag() : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, list);
        }
    }
}
