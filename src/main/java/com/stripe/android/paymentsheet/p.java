package com.stripe.android.paymentsheet;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.y0;
import p013kotlin.Metadata;
import p017o70.AddressDetails;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/p;", "Landroid/os/Parcelable;", "a", "b", "c", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/paymentsheet/p$a;", "Lcom/stripe/android/paymentsheet/p$b;", "Lcom/stripe/android/paymentsheet/p$c;", "Lcom/stripe/android/paymentsheet/p$d;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface p extends Parcelable {

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.p$a, reason: from toString */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b$\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b \u00101¨\u00062"}, d2 = {"Lcom/stripe/android/paymentsheet/p$a;", "Lcom/stripe/android/paymentsheet/p;", "Lcom/stripe/android/paymentsheet/y$m;", "initializationMode", "Lo70/a;", "shippingDetails", "Lcom/stripe/android/model/w0;", "createParams", "Lcom/stripe/android/model/y0;", "optionsParams", "Lcom/stripe/android/paymentsheet/y$b;", "appearance", "<init>", "(Lcom/stripe/android/paymentsheet/y$m;Lo70/a;Lcom/stripe/android/model/w0;Lcom/stripe/android/model/y0;Lcom/stripe/android/paymentsheet/y$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/paymentsheet/y$m;", "i3", "()Lcom/stripe/android/paymentsheet/y$m;", "b", "Lo70/a;", "e0", "()Lo70/a;", "c", "Lcom/stripe/android/model/w0;", "()Lcom/stripe/android/model/w0;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/model/y0;", "getOptionsParams", "()Lcom/stripe/android/model/y0;", "e", "Lcom/stripe/android/paymentsheet/y$b;", "()Lcom/stripe/android/paymentsheet/y$b;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BacsPaymentMethod implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final y.m initializationMode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AddressDetails shippingDetails;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final PaymentMethodCreateParams createParams;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final y0 optionsParams;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final y.Appearance appearance;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f53217f = y0.f51735b | PaymentMethodCreateParams.f51643v;
        public static final Parcelable.Creator<BacsPaymentMethod> CREATOR = new C1013a();

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C1013a implements Parcelable.Creator<BacsPaymentMethod> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BacsPaymentMethod createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new BacsPaymentMethod((y.m) parcel.readParcelable(BacsPaymentMethod.class.getClassLoader()), parcel.readInt() == 0 ? null : AddressDetails.CREATOR.createFromParcel(parcel), (PaymentMethodCreateParams) parcel.readParcelable(BacsPaymentMethod.class.getClassLoader()), (y0) parcel.readParcelable(BacsPaymentMethod.class.getClassLoader()), y.Appearance.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final BacsPaymentMethod[] newArray(int i11) {
                return new BacsPaymentMethod[i11];
            }
        }

        public BacsPaymentMethod(y.m initializationMode, AddressDetails addressDetails, PaymentMethodCreateParams createParams, y0 y0Var, y.Appearance appearance) {
            p013kotlin.jvm.internal.s.k(initializationMode, "initializationMode");
            p013kotlin.jvm.internal.s.k(createParams, "createParams");
            p013kotlin.jvm.internal.s.k(appearance, "appearance");
            this.initializationMode = initializationMode;
            this.shippingDetails = addressDetails;
            this.createParams = createParams;
            this.optionsParams = y0Var;
            this.appearance = appearance;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final y.Appearance getAppearance() {
            return this.appearance;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final PaymentMethodCreateParams getCreateParams() {
            return this.createParams;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e0, reason: from getter */
        public final AddressDetails getShippingDetails() {
            return this.shippingDetails;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BacsPaymentMethod)) {
                return false;
            }
            BacsPaymentMethod bacsPaymentMethod = (BacsPaymentMethod) other;
            return p013kotlin.jvm.internal.s.f(this.initializationMode, bacsPaymentMethod.initializationMode) && p013kotlin.jvm.internal.s.f(this.shippingDetails, bacsPaymentMethod.shippingDetails) && p013kotlin.jvm.internal.s.f(this.createParams, bacsPaymentMethod.createParams) && p013kotlin.jvm.internal.s.f(this.optionsParams, bacsPaymentMethod.optionsParams) && p013kotlin.jvm.internal.s.f(this.appearance, bacsPaymentMethod.appearance);
        }

        public int hashCode() {
            int iHashCode = this.initializationMode.hashCode() * 31;
            AddressDetails addressDetails = this.shippingDetails;
            int iHashCode2 = (((iHashCode + (addressDetails == null ? 0 : addressDetails.hashCode())) * 31) + this.createParams.hashCode()) * 31;
            y0 y0Var = this.optionsParams;
            return ((iHashCode2 + (y0Var != null ? y0Var.hashCode() : 0)) * 31) + this.appearance.hashCode();
        }

        /* JADX INFO: renamed from: i3, reason: from getter */
        public final y.m getInitializationMode() {
            return this.initializationMode;
        }

        public String toString() {
            return "BacsPaymentMethod(initializationMode=" + this.initializationMode + ", shippingDetails=" + this.shippingDetails + ", createParams=" + this.createParams + ", optionsParams=" + this.optionsParams + ", appearance=" + this.appearance + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeParcelable(this.initializationMode, flags);
            AddressDetails addressDetails = this.shippingDetails;
            if (addressDetails == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                addressDetails.writeToParcel(parcel, flags);
            }
            parcel.writeParcelable(this.createParams, flags);
            parcel.writeParcelable(this.optionsParams, flags);
            this.appearance.writeToParcel(parcel, flags);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.p$b, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/paymentsheet/p$b;", "Lcom/stripe/android/paymentsheet/p;", "", "type", "Lcom/stripe/android/model/v0$e;", "billingDetails", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/v0$e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getType", "b", "Lcom/stripe/android/model/v0$e;", "()Lcom/stripe/android/model/v0$e;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ExternalPaymentMethod implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final PaymentMethod.BillingDetails billingDetails;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f53223c = PaymentMethod.BillingDetails.f51568f;
        public static final Parcelable.Creator<ExternalPaymentMethod> CREATOR = new a();

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.p$b$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ExternalPaymentMethod> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ExternalPaymentMethod createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new ExternalPaymentMethod(parcel.readString(), (PaymentMethod.BillingDetails) parcel.readParcelable(ExternalPaymentMethod.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ExternalPaymentMethod[] newArray(int i11) {
                return new ExternalPaymentMethod[i11];
            }
        }

        public ExternalPaymentMethod(String type, PaymentMethod.BillingDetails billingDetails) {
            p013kotlin.jvm.internal.s.k(type, "type");
            this.type = type;
            this.billingDetails = billingDetails;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PaymentMethod.BillingDetails getBillingDetails() {
            return this.billingDetails;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExternalPaymentMethod)) {
                return false;
            }
            ExternalPaymentMethod externalPaymentMethod = (ExternalPaymentMethod) other;
            return p013kotlin.jvm.internal.s.f(this.type, externalPaymentMethod.type) && p013kotlin.jvm.internal.s.f(this.billingDetails, externalPaymentMethod.billingDetails);
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            PaymentMethod.BillingDetails billingDetails = this.billingDetails;
            return iHashCode + (billingDetails == null ? 0 : billingDetails.hashCode());
        }

        public String toString() {
            return "ExternalPaymentMethod(type=" + this.type + ", billingDetails=" + this.billingDetails + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.type);
            parcel.writeParcelable(this.billingDetails, flags);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.p$c, reason: from toString */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001c\u0010&¨\u0006'"}, d2 = {"Lcom/stripe/android/paymentsheet/p$c;", "Lcom/stripe/android/paymentsheet/p;", "Lcom/stripe/android/paymentsheet/y$m;", "initializationMode", "Lo70/a;", "shippingDetails", "Lcom/stripe/android/paymentsheet/p$c$a;", "config", "<init>", "(Lcom/stripe/android/paymentsheet/y$m;Lo70/a;Lcom/stripe/android/paymentsheet/p$c$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/paymentsheet/y$m;", "i3", "()Lcom/stripe/android/paymentsheet/y$m;", "b", "Lo70/a;", "e0", "()Lo70/a;", "c", "Lcom/stripe/android/paymentsheet/p$c$a;", "()Lcom/stripe/android/paymentsheet/p$c$a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GooglePay implements p {
        public static final Parcelable.Creator<GooglePay> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final y.m initializationMode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AddressDetails shippingDetails;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Config config;

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.p$c$a, reason: from toString */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b)\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b$\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b'\u0010\u0010R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010,\u001a\u0004\b \u0010-¨\u0006."}, d2 = {"Lcom/stripe/android/paymentsheet/p$c$a;", "Landroid/os/Parcelable;", "Lcom/stripe/android/paymentsheet/y$l$c;", AnalyticsAttribute.Environment, "", "merchantName", "merchantCountryCode", "merchantCurrencyCode", "", "customAmount", "customLabel", "Lcom/stripe/android/paymentsheet/y$d;", "billingDetailsCollectionConfiguration", "<init>", "(Lcom/stripe/android/paymentsheet/y$l$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/paymentsheet/y$d;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/paymentsheet/y$l$c;", DateTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/paymentsheet/y$l$c;", "b", "Ljava/lang/String;", "g", "c", "e", "f", "Ljava/lang/Long;", "()Ljava/lang/Long;", "Lcom/stripe/android/paymentsheet/y$d;", "()Lcom/stripe/android/paymentsheet/y$d;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Config implements Parcelable {
            public static final Parcelable.Creator<Config> CREATOR = new C1014a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final y.GooglePayConfiguration.c environment;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String merchantName;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String merchantCountryCode;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String merchantCurrencyCode;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Long customAmount;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final String customLabel;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final y.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration;

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.p$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C1014a implements Parcelable.Creator<Config> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Config createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new Config(parcel.readInt() == 0 ? null : y.GooglePayConfiguration.c.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), y.BillingDetailsCollectionConfiguration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Config[] newArray(int i11) {
                    return new Config[i11];
                }
            }

            public Config(y.GooglePayConfiguration.c cVar, String merchantName, String merchantCountryCode, String str, Long l11, String str2, y.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration) {
                p013kotlin.jvm.internal.s.k(merchantName, "merchantName");
                p013kotlin.jvm.internal.s.k(merchantCountryCode, "merchantCountryCode");
                p013kotlin.jvm.internal.s.k(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
                this.environment = cVar;
                this.merchantName = merchantName;
                this.merchantCountryCode = merchantCountryCode;
                this.merchantCurrencyCode = str;
                this.customAmount = l11;
                this.customLabel = str2;
                this.billingDetailsCollectionConfiguration = billingDetailsCollectionConfiguration;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final y.BillingDetailsCollectionConfiguration getBillingDetailsCollectionConfiguration() {
                return this.billingDetailsCollectionConfiguration;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Long getCustomAmount() {
                return this.customAmount;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getCustomLabel() {
                return this.customLabel;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final y.GooglePayConfiguration.c getEnvironment() {
                return this.environment;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getMerchantCountryCode() {
                return this.merchantCountryCode;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Config)) {
                    return false;
                }
                Config config = (Config) other;
                return this.environment == config.environment && p013kotlin.jvm.internal.s.f(this.merchantName, config.merchantName) && p013kotlin.jvm.internal.s.f(this.merchantCountryCode, config.merchantCountryCode) && p013kotlin.jvm.internal.s.f(this.merchantCurrencyCode, config.merchantCurrencyCode) && p013kotlin.jvm.internal.s.f(this.customAmount, config.customAmount) && p013kotlin.jvm.internal.s.f(this.customLabel, config.customLabel) && p013kotlin.jvm.internal.s.f(this.billingDetailsCollectionConfiguration, config.billingDetailsCollectionConfiguration);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getMerchantCurrencyCode() {
                return this.merchantCurrencyCode;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getMerchantName() {
                return this.merchantName;
            }

            public int hashCode() {
                y.GooglePayConfiguration.c cVar = this.environment;
                int iHashCode = (((((cVar == null ? 0 : cVar.hashCode()) * 31) + this.merchantName.hashCode()) * 31) + this.merchantCountryCode.hashCode()) * 31;
                String str = this.merchantCurrencyCode;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                Long l11 = this.customAmount;
                int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
                String str2 = this.customLabel;
                return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.billingDetailsCollectionConfiguration.hashCode();
            }

            public String toString() {
                return "Config(environment=" + this.environment + ", merchantName=" + this.merchantName + ", merchantCountryCode=" + this.merchantCountryCode + ", merchantCurrencyCode=" + this.merchantCurrencyCode + ", customAmount=" + this.customAmount + ", customLabel=" + this.customLabel + ", billingDetailsCollectionConfiguration=" + this.billingDetailsCollectionConfiguration + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                y.GooglePayConfiguration.c cVar = this.environment;
                if (cVar == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(cVar.name());
                }
                parcel.writeString(this.merchantName);
                parcel.writeString(this.merchantCountryCode);
                parcel.writeString(this.merchantCurrencyCode);
                Long l11 = this.customAmount;
                if (l11 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeLong(l11.longValue());
                }
                parcel.writeString(this.customLabel);
                this.billingDetailsCollectionConfiguration.writeToParcel(parcel, flags);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.p$c$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<GooglePay> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GooglePay createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new GooglePay((y.m) parcel.readParcelable(GooglePay.class.getClassLoader()), parcel.readInt() == 0 ? null : AddressDetails.CREATOR.createFromParcel(parcel), Config.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GooglePay[] newArray(int i11) {
                return new GooglePay[i11];
            }
        }

        public GooglePay(y.m initializationMode, AddressDetails addressDetails, Config config) {
            p013kotlin.jvm.internal.s.k(initializationMode, "initializationMode");
            p013kotlin.jvm.internal.s.k(config, "config");
            this.initializationMode = initializationMode;
            this.shippingDetails = addressDetails;
            this.config = config;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Config getConfig() {
            return this.config;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e0, reason: from getter */
        public final AddressDetails getShippingDetails() {
            return this.shippingDetails;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GooglePay)) {
                return false;
            }
            GooglePay googlePay = (GooglePay) other;
            return p013kotlin.jvm.internal.s.f(this.initializationMode, googlePay.initializationMode) && p013kotlin.jvm.internal.s.f(this.shippingDetails, googlePay.shippingDetails) && p013kotlin.jvm.internal.s.f(this.config, googlePay.config);
        }

        public int hashCode() {
            int iHashCode = this.initializationMode.hashCode() * 31;
            AddressDetails addressDetails = this.shippingDetails;
            return ((iHashCode + (addressDetails == null ? 0 : addressDetails.hashCode())) * 31) + this.config.hashCode();
        }

        /* JADX INFO: renamed from: i3, reason: from getter */
        public final y.m getInitializationMode() {
            return this.initializationMode;
        }

        public String toString() {
            return "GooglePay(initializationMode=" + this.initializationMode + ", shippingDetails=" + this.shippingDetails + ", config=" + this.config + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeParcelable(this.initializationMode, flags);
            AddressDetails addressDetails = this.shippingDetails;
            if (addressDetails == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                addressDetails.writeToParcel(parcel, flags);
            }
            this.config.writeToParcel(parcel, flags);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\n\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/p$d;", "Lcom/stripe/android/paymentsheet/p;", "Lcom/stripe/android/paymentsheet/y$m;", "i3", "()Lcom/stripe/android/paymentsheet/y$m;", "initializationMode", "Lo70/a;", "e0", "()Lo70/a;", "shippingDetails", "a", "b", "Lcom/stripe/android/paymentsheet/p$d$a;", "Lcom/stripe/android/paymentsheet/p$d$b;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d extends p {

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.p$d$a, reason: from toString */
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001f\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b#\u0010,R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b'\u0010/¨\u00060"}, d2 = {"Lcom/stripe/android/paymentsheet/p$d$a;", "Lcom/stripe/android/paymentsheet/p$d;", "Lcom/stripe/android/paymentsheet/y$m;", "initializationMode", "Lo70/a;", "shippingDetails", "Lcom/stripe/android/model/w0;", "createParams", "Lcom/stripe/android/model/y0;", "optionsParams", "", "shouldSave", "<init>", "(Lcom/stripe/android/paymentsheet/y$m;Lo70/a;Lcom/stripe/android/model/w0;Lcom/stripe/android/model/y0;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/paymentsheet/y$m;", "i3", "()Lcom/stripe/android/paymentsheet/y$m;", "b", "Lo70/a;", "e0", "()Lo70/a;", "c", "Lcom/stripe/android/model/w0;", "()Lcom/stripe/android/model/w0;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/model/y0;", "()Lcom/stripe/android/model/y0;", "e", "Z", "()Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class New implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final y.m initializationMode;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final AddressDetails shippingDetails;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final PaymentMethodCreateParams createParams;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final y0 optionsParams;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean shouldSave;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f53236f = y0.f51735b | PaymentMethodCreateParams.f51643v;
            public static final Parcelable.Creator<New> CREATOR = new C1015a();

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.p$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C1015a implements Parcelable.Creator<New> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final New createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new New((y.m) parcel.readParcelable(New.class.getClassLoader()), parcel.readInt() == 0 ? null : AddressDetails.CREATOR.createFromParcel(parcel), (PaymentMethodCreateParams) parcel.readParcelable(New.class.getClassLoader()), (y0) parcel.readParcelable(New.class.getClassLoader()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final New[] newArray(int i11) {
                    return new New[i11];
                }
            }

            public New(y.m initializationMode, AddressDetails addressDetails, PaymentMethodCreateParams createParams, y0 y0Var, boolean z11) {
                p013kotlin.jvm.internal.s.k(initializationMode, "initializationMode");
                p013kotlin.jvm.internal.s.k(createParams, "createParams");
                this.initializationMode = initializationMode;
                this.shippingDetails = addressDetails;
                this.createParams = createParams;
                this.optionsParams = y0Var;
                this.shouldSave = z11;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final PaymentMethodCreateParams getCreateParams() {
                return this.createParams;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final y0 getOptionsParams() {
                return this.optionsParams;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getShouldSave() {
                return this.shouldSave;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.paymentsheet.p.d
            /* JADX INFO: renamed from: e0, reason: from getter */
            public AddressDetails getShippingDetails() {
                return this.shippingDetails;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof New)) {
                    return false;
                }
                New r11 = (New) other;
                return p013kotlin.jvm.internal.s.f(this.initializationMode, r11.initializationMode) && p013kotlin.jvm.internal.s.f(this.shippingDetails, r11.shippingDetails) && p013kotlin.jvm.internal.s.f(this.createParams, r11.createParams) && p013kotlin.jvm.internal.s.f(this.optionsParams, r11.optionsParams) && this.shouldSave == r11.shouldSave;
            }

            public int hashCode() {
                int iHashCode = this.initializationMode.hashCode() * 31;
                AddressDetails addressDetails = this.shippingDetails;
                int iHashCode2 = (((iHashCode + (addressDetails == null ? 0 : addressDetails.hashCode())) * 31) + this.createParams.hashCode()) * 31;
                y0 y0Var = this.optionsParams;
                return ((iHashCode2 + (y0Var != null ? y0Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.shouldSave);
            }

            @Override // com.stripe.android.paymentsheet.p.d
            /* JADX INFO: renamed from: i3, reason: from getter */
            public y.m getInitializationMode() {
                return this.initializationMode;
            }

            public String toString() {
                return "New(initializationMode=" + this.initializationMode + ", shippingDetails=" + this.shippingDetails + ", createParams=" + this.createParams + ", optionsParams=" + this.optionsParams + ", shouldSave=" + this.shouldSave + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeParcelable(this.initializationMode, flags);
                AddressDetails addressDetails = this.shippingDetails;
                if (addressDetails == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    addressDetails.writeToParcel(parcel, flags);
                }
                parcel.writeParcelable(this.createParams, flags);
                parcel.writeParcelable(this.optionsParams, flags);
                parcel.writeInt(this.shouldSave ? 1 : 0);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.p$d$b, reason: from toString */
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u001e\u0010,¨\u0006-"}, d2 = {"Lcom/stripe/android/paymentsheet/p$d$b;", "Lcom/stripe/android/paymentsheet/p$d;", "Lcom/stripe/android/paymentsheet/y$m;", "initializationMode", "Lo70/a;", "shippingDetails", "Lcom/stripe/android/model/v0;", "paymentMethod", "Lcom/stripe/android/model/y0;", "optionsParams", "<init>", "(Lcom/stripe/android/paymentsheet/y$m;Lo70/a;Lcom/stripe/android/model/v0;Lcom/stripe/android/model/y0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/paymentsheet/y$m;", "i3", "()Lcom/stripe/android/paymentsheet/y$m;", "b", "Lo70/a;", "e0", "()Lo70/a;", "c", "Lcom/stripe/android/model/v0;", "Z2", "()Lcom/stripe/android/model/v0;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/model/y0;", "()Lcom/stripe/android/model/y0;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Saved implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final y.m initializationMode;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final AddressDetails shippingDetails;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final PaymentMethod paymentMethod;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final y0 optionsParams;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f53242e = y0.f51735b | PaymentMethod.f51534u;
            public static final Parcelable.Creator<Saved> CREATOR = new a();

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.p$d$b$a */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Saved> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Saved createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new Saved((y.m) parcel.readParcelable(Saved.class.getClassLoader()), parcel.readInt() == 0 ? null : AddressDetails.CREATOR.createFromParcel(parcel), (PaymentMethod) parcel.readParcelable(Saved.class.getClassLoader()), (y0) parcel.readParcelable(Saved.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Saved[] newArray(int i11) {
                    return new Saved[i11];
                }
            }

            public Saved(y.m initializationMode, AddressDetails addressDetails, PaymentMethod paymentMethod, y0 y0Var) {
                p013kotlin.jvm.internal.s.k(initializationMode, "initializationMode");
                p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
                this.initializationMode = initializationMode;
                this.shippingDetails = addressDetails;
                this.paymentMethod = paymentMethod;
                this.optionsParams = y0Var;
            }

            /* JADX INFO: renamed from: Z2, reason: from getter */
            public final PaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final y0 getOptionsParams() {
                return this.optionsParams;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.paymentsheet.p.d
            /* JADX INFO: renamed from: e0, reason: from getter */
            public AddressDetails getShippingDetails() {
                return this.shippingDetails;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Saved)) {
                    return false;
                }
                Saved saved = (Saved) other;
                return p013kotlin.jvm.internal.s.f(this.initializationMode, saved.initializationMode) && p013kotlin.jvm.internal.s.f(this.shippingDetails, saved.shippingDetails) && p013kotlin.jvm.internal.s.f(this.paymentMethod, saved.paymentMethod) && p013kotlin.jvm.internal.s.f(this.optionsParams, saved.optionsParams);
            }

            public int hashCode() {
                int iHashCode = this.initializationMode.hashCode() * 31;
                AddressDetails addressDetails = this.shippingDetails;
                int iHashCode2 = (((iHashCode + (addressDetails == null ? 0 : addressDetails.hashCode())) * 31) + this.paymentMethod.hashCode()) * 31;
                y0 y0Var = this.optionsParams;
                return iHashCode2 + (y0Var != null ? y0Var.hashCode() : 0);
            }

            @Override // com.stripe.android.paymentsheet.p.d
            /* JADX INFO: renamed from: i3, reason: from getter */
            public y.m getInitializationMode() {
                return this.initializationMode;
            }

            public String toString() {
                return "Saved(initializationMode=" + this.initializationMode + ", shippingDetails=" + this.shippingDetails + ", paymentMethod=" + this.paymentMethod + ", optionsParams=" + this.optionsParams + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeParcelable(this.initializationMode, flags);
                AddressDetails addressDetails = this.shippingDetails;
                if (addressDetails == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    addressDetails.writeToParcel(parcel, flags);
                }
                parcel.writeParcelable(this.paymentMethod, flags);
                parcel.writeParcelable(this.optionsParams, flags);
            }
        }

        /* JADX INFO: renamed from: e0 */
        AddressDetails getShippingDetails();

        /* JADX INFO: renamed from: i3 */
        y.m getInitializationMode();
    }
}
