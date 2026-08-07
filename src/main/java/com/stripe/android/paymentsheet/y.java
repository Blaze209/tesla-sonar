package com.stripe.android.paymentsheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.Scopes;
import com.google.android.libraries.places.api.model.PlaceTypes;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k3.r1;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p017o70.AddressDetails;
import w70.PaymentIntentClientSecret;
import w70.PaymentOption;
import w70.SetupIntentClientSecret;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0015\u001a\u0014\u0017\u001d\u001e\u001f !\"#$%&'()*+,-.B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\u000eJ#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0017\u0010\u0015J#\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001c¨\u0006/"}, d2 = {"Lcom/stripe/android/paymentsheet/y;", "", "Lcom/stripe/android/paymentsheet/a0;", "paymentSheetLauncher", "<init>", "(Lcom/stripe/android/paymentsheet/a0;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Ln70/q;", "callback", "(Landroidx/fragment/app/Fragment;Ln70/q;)V", "Ln70/a;", "createIntentCallback", "paymentResultCallback", "(Landroidx/fragment/app/Fragment;Ln70/a;Ln70/q;)V", "", "paymentIntentClientSecret", "Lcom/stripe/android/paymentsheet/y$h;", "configuration", "Ljn0/h0;", "b", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/y$h;)V", "setupIntentClientSecret", "c", "Lcom/stripe/android/paymentsheet/y$n;", "intentConfiguration", "a", "(Lcom/stripe/android/paymentsheet/y$n;Lcom/stripe/android/paymentsheet/y$h;)V", "Lcom/stripe/android/paymentsheet/a0;", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f53803c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a0 paymentSheetLauncher;

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b!\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\"\u0010\f¨\u0006#"}, d2 = {"Lcom/stripe/android/paymentsheet/y$a;", "Landroid/os/Parcelable;", "", "city", PlaceTypes.COUNTRY, "line1", "line2", "postalCode", "state", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Address implements Parcelable {
        public static final Parcelable.Creator<Address> CREATOR = new C1061a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String city;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String country;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String line1;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String line2;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String postalCode;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String state;

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C1061a implements Parcelable.Creator<Address> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Address createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Address(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Address[] newArray(int i11) {
                return new Address[i11];
            }
        }

        public Address() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCity() {
            return this.city;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getLine1() {
            return this.line1;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getLine2() {
            return this.line2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPostalCode() {
            return this.postalCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Address)) {
                return false;
            }
            Address address = (Address) other;
            return p013kotlin.jvm.internal.s.f(this.city, address.city) && p013kotlin.jvm.internal.s.f(this.country, address.country) && p013kotlin.jvm.internal.s.f(this.line1, address.line1) && p013kotlin.jvm.internal.s.f(this.line2, address.line2) && p013kotlin.jvm.internal.s.f(this.postalCode, address.postalCode) && p013kotlin.jvm.internal.s.f(this.state, address.state);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getState() {
            return this.state;
        }

        public int hashCode() {
            String str = this.city;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.country;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.line1;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.line2;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.postalCode;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.state;
            return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "Address(city=" + this.city + ", country=" + this.country + ", line1=" + this.line1 + ", line2=" + this.line2 + ", postalCode=" + this.postalCode + ", state=" + this.state + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.city);
            parcel.writeString(this.country);
            parcel.writeString(this.line1);
            parcel.writeString(this.line2);
            parcel.writeString(this.postalCode);
            parcel.writeString(this.state);
        }

        public Address(String str, String str2, String str3, String str4, String str5, String str6) {
            this.city = str;
            this.country = str2;
            this.line1 = str3;
            this.line2 = str4;
            this.postalCode = str5;
            this.state = str6;
        }

        public /* synthetic */ Address(String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$c, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b#\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010\u000e¨\u0006$"}, d2 = {"Lcom/stripe/android/paymentsheet/y$c;", "Landroid/os/Parcelable;", "Lcom/stripe/android/paymentsheet/y$a;", PlaceTypes.ADDRESS, "", Scopes.EMAIL, "name", "phone", "<init>", "(Lcom/stripe/android/paymentsheet/y$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", DateTokenConverter.CONVERTER_KEY, "()Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/paymentsheet/y$a;", "()Lcom/stripe/android/paymentsheet/y$a;", "b", "Ljava/lang/String;", "c", "getName", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BillingDetails implements Parcelable {
        public static final Parcelable.Creator<BillingDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Address address;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String email;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String phone;

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$c$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BillingDetails> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BillingDetails createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new BillingDetails(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final BillingDetails[] newArray(int i11) {
                return new BillingDetails[i11];
            }
        }

        public BillingDetails() {
            this(null, null, null, null, 15, null);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Address getAddress() {
            return this.address;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        public final boolean d() {
            return (this.address == null && this.email == null && this.name == null && this.phone == null) ? false : true;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BillingDetails)) {
                return false;
            }
            BillingDetails billingDetails = (BillingDetails) other;
            return p013kotlin.jvm.internal.s.f(this.address, billingDetails.address) && p013kotlin.jvm.internal.s.f(this.email, billingDetails.email) && p013kotlin.jvm.internal.s.f(this.name, billingDetails.name) && p013kotlin.jvm.internal.s.f(this.phone, billingDetails.phone);
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            Address address = this.address;
            int iHashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.email;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "BillingDetails(address=" + this.address + ", email=" + this.email + ", name=" + this.name + ", phone=" + this.phone + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            Address address = this.address;
            if (address == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                address.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.email);
            parcel.writeString(this.name);
            parcel.writeString(this.phone);
        }

        public BillingDetails(Address address, String str, String str2, String str3) {
            this.address = address;
            this.email = str;
            this.name = str2;
            this.phone = str3;
        }

        public /* synthetic */ BillingDetails(Address address, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : address, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$d, reason: from toString */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0002 $B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b \u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b$\u0010-R\u0014\u0010.\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010-R\u0014\u0010/\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010-R\u0014\u00101\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u0010-R\u0014\u00102\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010-¨\u00063"}, d2 = {"Lcom/stripe/android/paymentsheet/y$d;", "Landroid/os/Parcelable;", "Lcom/stripe/android/paymentsheet/y$d$b;", "name", "phone", Scopes.EMAIL, "Lcom/stripe/android/paymentsheet/y$d$a;", PlaceTypes.ADDRESS, "", "attachDefaultsToPaymentMethod", "<init>", "(Lcom/stripe/android/paymentsheet/y$d$b;Lcom/stripe/android/paymentsheet/y$d$b;Lcom/stripe/android/paymentsheet/y$d$b;Lcom/stripe/android/paymentsheet/y$d$a;Z)V", "Lcom/stripe/android/googlepaylauncher/h$c;", "j", "()Lcom/stripe/android/googlepaylauncher/h$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/paymentsheet/y$d$b;", "h", "()Lcom/stripe/android/paymentsheet/y$d$b;", "b", IntegerTokenConverter.CONVERTER_KEY, "c", "g", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/paymentsheet/y$d$a;", "()Lcom/stripe/android/paymentsheet/y$d$a;", "e", "Z", "()Z", "collectsName", "collectsEmail", "f", "collectsPhone", "collectsAnything", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BillingDetailsCollectionConfiguration implements Parcelable {
        public static final Parcelable.Creator<BillingDetailsCollectionConfiguration> CREATOR = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b phone;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final b email;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final a address;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean attachDefaultsToPaymentMethod;

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$d$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/y$d$a;", "", "<init>", "(Ljava/lang/String;I)V", "Automatic", "Never", "Full", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum a {
            Automatic,
            Never,
            Full;

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

            public static EnumEntries<a> getEntries() {
                return $ENTRIES;
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$d$b */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/y$d$b;", "", "<init>", "(Ljava/lang/String;I)V", "Automatic", "Never", "Always", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum b {
            Automatic,
            Never,
            Always;

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

            public static EnumEntries<b> getEntries() {
                return $ENTRIES;
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$d$c */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<BillingDetailsCollectionConfiguration> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BillingDetailsCollectionConfiguration createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new BillingDetailsCollectionConfiguration(b.valueOf(parcel.readString()), b.valueOf(parcel.readString()), b.valueOf(parcel.readString()), a.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final BillingDetailsCollectionConfiguration[] newArray(int i11) {
                return new BillingDetailsCollectionConfiguration[i11];
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$d$d, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class C1062d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f53825a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.Never.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.Automatic.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.Full.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f53825a = iArr;
            }
        }

        public BillingDetailsCollectionConfiguration() {
            this(null, null, null, null, false, 31, null);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getAddress() {
            return this.address;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getAttachDefaultsToPaymentMethod() {
            return this.attachDefaultsToPaymentMethod;
        }

        public final boolean c() {
            b bVar = this.name;
            b bVar2 = b.Always;
            return bVar == bVar2 || this.phone == bVar2 || this.email == bVar2 || this.address == a.Full;
        }

        public final boolean d() {
            return this.email == b.Always;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean e() {
            return this.name == b.Always;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BillingDetailsCollectionConfiguration)) {
                return false;
            }
            BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration = (BillingDetailsCollectionConfiguration) other;
            return this.name == billingDetailsCollectionConfiguration.name && this.phone == billingDetailsCollectionConfiguration.phone && this.email == billingDetailsCollectionConfiguration.email && this.address == billingDetailsCollectionConfiguration.address && this.attachDefaultsToPaymentMethod == billingDetailsCollectionConfiguration.attachDefaultsToPaymentMethod;
        }

        public final boolean f() {
            return this.phone == b.Always;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final b getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final b getName() {
            return this.name;
        }

        public int hashCode() {
            return (((((((this.name.hashCode() * 31) + this.phone.hashCode()) * 31) + this.email.hashCode()) * 31) + this.address.hashCode()) * 31) + Boolean.hashCode(this.attachDefaultsToPaymentMethod);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final b getPhone() {
            return this.phone;
        }

        public final com.stripe.android.googlepaylauncher.h.BillingAddressConfig j() {
            com.stripe.android.googlepaylauncher.h.BillingAddressConfig.b bVar;
            a aVar = this.address;
            boolean z11 = aVar == a.Full;
            boolean z12 = this.phone == b.Always;
            int i11 = C1062d.f53825a[aVar.ordinal()];
            if (i11 == 1 || i11 == 2) {
                bVar = com.stripe.android.googlepaylauncher.h.BillingAddressConfig.b.Min;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = com.stripe.android.googlepaylauncher.h.BillingAddressConfig.b.Full;
            }
            return new com.stripe.android.googlepaylauncher.h.BillingAddressConfig(z11 || z12, bVar, z12);
        }

        public String toString() {
            return "BillingDetailsCollectionConfiguration(name=" + this.name + ", phone=" + this.phone + ", email=" + this.email + ", address=" + this.address + ", attachDefaultsToPaymentMethod=" + this.attachDefaultsToPaymentMethod + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.name.name());
            parcel.writeString(this.phone.name());
            parcel.writeString(this.email.name());
            parcel.writeString(this.address.name());
            parcel.writeInt(this.attachDefaultsToPaymentMethod ? 1 : 0);
        }

        public BillingDetailsCollectionConfiguration(b name, b phone, b email, a address, boolean z11) {
            p013kotlin.jvm.internal.s.k(name, "name");
            p013kotlin.jvm.internal.s.k(phone, "phone");
            p013kotlin.jvm.internal.s.k(email, "email");
            p013kotlin.jvm.internal.s.k(address, "address");
            this.name = name;
            this.phone = phone;
            this.email = email;
            this.address = address;
            this.attachDefaultsToPaymentMethod = z11;
        }

        public /* synthetic */ BillingDetailsCollectionConfiguration(b bVar, b bVar2, b bVar3, a aVar, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? b.Automatic : bVar, (i11 & 2) != 0 ? b.Automatic : bVar2, (i11 & 4) != 0 ? b.Automatic : bVar3, (i11 & 8) != 0 ? a.Automatic : aVar, (i11 & 16) != 0 ? false : z11);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/y$e;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "Lcom/stripe/android/paymentsheet/y$e$a;", "Lcom/stripe/android/paymentsheet/y$e$b;", "Lcom/stripe/android/paymentsheet/y$e$e;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class e implements Parcelable {

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/paymentsheet/y$e$a;", "Lcom/stripe/android/paymentsheet/y$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f53827b = new a();
            public static final Parcelable.Creator<a> CREATOR = new C1063a();

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C1063a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    parcel.readInt();
                    return a.f53827b;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i11) {
                    return new a[i11];
                }
            }

            private a() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 1733345294;
            }

            public String toString() {
                return "All";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$e$b, reason: from toString */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentsheet/y$e$b;", "Lcom/stripe/android/paymentsheet/y$e;", "", "Lcom/stripe/android/paymentsheet/y$e$c;", "brands", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/util/List;", "a", "()Ljava/util/List;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Allowed extends e {
            public static final Parcelable.Creator<Allowed> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<c> brands;

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$e$b$a */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Allowed> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Allowed createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    int i11 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        arrayList.add(c.CREATOR.createFromParcel(parcel));
                    }
                    return new Allowed(arrayList);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Allowed[] newArray(int i11) {
                    return new Allowed[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Allowed(List<? extends c> brands) {
                super(null);
                p013kotlin.jvm.internal.s.k(brands, "brands");
                this.brands = brands;
            }

            public final List<c> a() {
                return this.brands;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Allowed) && p013kotlin.jvm.internal.s.f(this.brands, ((Allowed) other).brands);
            }

            public int hashCode() {
                return this.brands.hashCode();
            }

            public String toString() {
                return "Allowed(brands=" + this.brands + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                List<c> list = this.brands;
                parcel.writeInt(list.size());
                Iterator<c> it = list.iterator();
                while (it.hasNext()) {
                    it.next().writeToParcel(parcel, flags);
                }
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/y$e$c;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Visa", "Mastercard", "Amex", "Discover", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum c implements Parcelable {
            Visa,
            Mastercard,
            Amex,
            Discover;

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
            public static final Parcelable.Creator<c> CREATOR = new a();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<c> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return c.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i11) {
                    return new c[i11];
                }
            }

            public static EnumEntries<c> getEntries() {
                return $ENTRIES;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeString(name());
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$e$e, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentsheet/y$e$e;", "Lcom/stripe/android/paymentsheet/y$e;", "", "Lcom/stripe/android/paymentsheet/y$e$c;", "brands", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/util/List;", "a", "()Ljava/util/List;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Disallowed extends e {
            public static final Parcelable.Creator<Disallowed> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<c> brands;

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$e$e$a */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Disallowed> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Disallowed createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    int i11 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        arrayList.add(c.CREATOR.createFromParcel(parcel));
                    }
                    return new Disallowed(arrayList);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Disallowed[] newArray(int i11) {
                    return new Disallowed[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Disallowed(List<? extends c> brands) {
                super(null);
                p013kotlin.jvm.internal.s.k(brands, "brands");
                this.brands = brands;
            }

            public final List<c> a() {
                return this.brands;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Disallowed) && p013kotlin.jvm.internal.s.f(this.brands, ((Disallowed) other).brands);
            }

            public int hashCode() {
                return this.brands.hashCode();
            }

            public String toString() {
                return "Disallowed(brands=" + this.brands + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                List<c> list = this.brands;
                parcel.writeInt(list.size());
                Iterator<c> it = list.iterator();
                while (it.hasNext()) {
                    it.next().writeToParcel(parcel, flags);
                }
            }
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private e() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$f, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001%Bu\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\f\u001a\u00020\u0002\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fBa\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0010\u0012\u0006\u0010\b\u001a\u00020\u0010\u0012\u0006\u0010\n\u001a\u00020\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0010\u0012\u0006\u0010\t\u001a\u00020\u0010\u0012\u0006\u0010\f\u001a\u00020\u0010\u0012\u0006\u0010\r\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0011J~\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u00022\b\b\u0003\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b-\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b.\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b/\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b2\u0010\u0018R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b+\u0010\u0018R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b0\u0010\u0018¨\u00063"}, d2 = {"Lcom/stripe/android/paymentsheet/y$f;", "Landroid/os/Parcelable;", "", "primary", "surface", "component", "componentBorder", "componentDivider", "onComponent", "onSurface", "subtitle", "placeholderText", "appBarIcon", AnalyticsAttribute.Error, "<init>", "(IIIIIIIIIII)V", "Lk3/p1;", "(JJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "(IIIIIIIIIII)Lcom/stripe/android/paymentsheet/y$f;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "I", "l", "b", "q", "e", DateTokenConverter.CONVERTER_KEY, "f", "g", IntegerTokenConverter.CONVERTER_KEY, "j", "h", "m", "k", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Colors implements Parcelable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final Colors f53831m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final Colors f53832n;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int primary;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int surface;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int component;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int componentBorder;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int componentDivider;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final int onComponent;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final int onSurface;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final int subtitle;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final int placeholderText;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final int appBarIcon;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final int error;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Colors> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$f$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/y$f$a;", "", "<init>", "()V", "Lcom/stripe/android/paymentsheet/y$f;", "defaultLight", "Lcom/stripe/android/paymentsheet/y$f;", "b", "()Lcom/stripe/android/paymentsheet/y$f;", "defaultDark", "a", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Colors a() {
                return Colors.f53832n;
            }

            public final Colors b() {
                return Colors.f53831m;
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$f$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Colors> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Colors createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Colors(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Colors[] newArray(int i11) {
                return new Colors[i11];
            }
        }

        static {
            f90.m mVar = f90.m.f64661a;
            f53831m = new Colors(mVar.c().getMaterialColors().j(), mVar.c().getMaterialColors().n(), mVar.c().getComponent(), mVar.c().getComponentBorder(), mVar.c().getComponentDivider(), mVar.c().getOnComponent(), mVar.c().getSubtitle(), mVar.c().getPlaceholderText(), mVar.c().getMaterialColors().i(), mVar.c().getAppBarIcon(), mVar.c().getMaterialColors().d(), null);
            f53832n = new Colors(mVar.b().getMaterialColors().j(), mVar.b().getMaterialColors().n(), mVar.b().getComponent(), mVar.b().getComponentBorder(), mVar.b().getComponentDivider(), mVar.b().getOnComponent(), mVar.b().getSubtitle(), mVar.b().getPlaceholderText(), mVar.b().getMaterialColors().i(), mVar.b().getAppBarIcon(), mVar.b().getMaterialColors().d(), null);
        }

        public /* synthetic */ Colors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22);
        }

        public final Colors c(int primary, int surface, int component, int componentBorder, int componentDivider, int onComponent, int onSurface, int subtitle, int placeholderText, int appBarIcon, int error) {
            return new Colors(primary, surface, component, componentBorder, componentDivider, onComponent, onSurface, subtitle, placeholderText, appBarIcon, error);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getAppBarIcon() {
            return this.appBarIcon;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getComponent() {
            return this.component;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Colors)) {
                return false;
            }
            Colors colors = (Colors) other;
            return this.primary == colors.primary && this.surface == colors.surface && this.component == colors.component && this.componentBorder == colors.componentBorder && this.componentDivider == colors.componentDivider && this.onComponent == colors.onComponent && this.onSurface == colors.onSurface && this.subtitle == colors.subtitle && this.placeholderText == colors.placeholderText && this.appBarIcon == colors.appBarIcon && this.error == colors.error;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getComponentBorder() {
            return this.componentBorder;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getComponentDivider() {
            return this.componentDivider;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getError() {
            return this.error;
        }

        public int hashCode() {
            return (((((((((((((((((((Integer.hashCode(this.primary) * 31) + Integer.hashCode(this.surface)) * 31) + Integer.hashCode(this.component)) * 31) + Integer.hashCode(this.componentBorder)) * 31) + Integer.hashCode(this.componentDivider)) * 31) + Integer.hashCode(this.onComponent)) * 31) + Integer.hashCode(this.onSurface)) * 31) + Integer.hashCode(this.subtitle)) * 31) + Integer.hashCode(this.placeholderText)) * 31) + Integer.hashCode(this.appBarIcon)) * 31) + Integer.hashCode(this.error);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final int getOnComponent() {
            return this.onComponent;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final int getOnSurface() {
            return this.onSurface;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final int getPlaceholderText() {
            return this.placeholderText;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final int getPrimary() {
            return this.primary;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final int getSurface() {
            return this.surface;
        }

        public String toString() {
            return "Colors(primary=" + this.primary + ", surface=" + this.surface + ", component=" + this.component + ", componentBorder=" + this.componentBorder + ", componentDivider=" + this.componentDivider + ", onComponent=" + this.onComponent + ", onSurface=" + this.onSurface + ", subtitle=" + this.subtitle + ", placeholderText=" + this.placeholderText + ", appBarIcon=" + this.appBarIcon + ", error=" + this.error + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeInt(this.primary);
            parcel.writeInt(this.surface);
            parcel.writeInt(this.component);
            parcel.writeInt(this.componentBorder);
            parcel.writeInt(this.componentDivider);
            parcel.writeInt(this.onComponent);
            parcel.writeInt(this.onSurface);
            parcel.writeInt(this.subtitle);
            parcel.writeInt(this.placeholderText);
            parcel.writeInt(this.appBarIcon);
            parcel.writeInt(this.error);
        }

        public Colors(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22) {
            this.primary = i11;
            this.surface = i12;
            this.component = i13;
            this.componentBorder = i14;
            this.componentDivider = i15;
            this.onComponent = i16;
            this.onSurface = i17;
            this.subtitle = i18;
            this.placeholderText = i19;
            this.appBarIcon = i21;
            this.error = i22;
        }

        private Colors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22) {
            this(r1.k(j11), r1.k(j12), r1.k(j13), r1.k(j14), r1.k(j15), r1.k(j16), r1.k(j19), r1.k(j17), r1.k(j18), r1.k(j21), r1.k(j22));
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$g, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/y$g;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "a", "(Landroid/content/Context;)V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context) {
            p013kotlin.jvm.internal.s.k(context, "context");
            new d60.d(context).a();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/y$i;", "Landroid/os/Parcelable;", "", "I", "()Ljava/lang/String;", "analyticsValue", "a", "b", "Lcom/stripe/android/paymentsheet/y$i$a;", "Lcom/stripe/android/paymentsheet/y$i$b;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface i extends Parcelable {

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$i$a, reason: from toString */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007R \u0010\u001e\u001a\u00020\u00028\u0016X\u0096D¢\u0006\u0012\n\u0004\b\u001a\u0010\u0018\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/paymentsheet/y$i$a;", "Lcom/stripe/android/paymentsheet/y$i;", "", "customerSessionClientSecret", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "t2", "b", "I", "getAnalyticsValue$annotations", "()V", "analyticsValue", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CustomerSession implements i {
            public static final Parcelable.Creator<CustomerSession> CREATOR = new C1065a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String customerSessionClientSecret;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final String analyticsValue;

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$i$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C1065a implements Parcelable.Creator<CustomerSession> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CustomerSession createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new CustomerSession(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final CustomerSession[] newArray(int i11) {
                    return new CustomerSession[i11];
                }
            }

            public CustomerSession(String customerSessionClientSecret) {
                p013kotlin.jvm.internal.s.k(customerSessionClientSecret, "customerSessionClientSecret");
                this.customerSessionClientSecret = customerSessionClientSecret;
                this.analyticsValue = "customer_session";
            }

            @Override // com.stripe.android.paymentsheet.y.i
            /* JADX INFO: renamed from: I, reason: from getter */
            public String getAnalyticsValue() {
                return this.analyticsValue;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CustomerSession) && p013kotlin.jvm.internal.s.f(this.customerSessionClientSecret, ((CustomerSession) other).customerSessionClientSecret);
            }

            public int hashCode() {
                return this.customerSessionClientSecret.hashCode();
            }

            /* JADX INFO: renamed from: t2, reason: from getter */
            public final String getCustomerSessionClientSecret() {
                return this.customerSessionClientSecret;
            }

            public String toString() {
                return "CustomerSession(customerSessionClientSecret=" + this.customerSessionClientSecret + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeString(this.customerSessionClientSecret);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$i$b, reason: from toString */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0007R \u0010\u001d\u001a\u00020\u00028\u0016X\u0096D¢\u0006\u0012\n\u0004\b\u0019\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/paymentsheet/y$i$b;", "Lcom/stripe/android/paymentsheet/y$i;", "", "ephemeralKeySecret", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "I", "getAnalyticsValue$annotations", "()V", "analyticsValue", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LegacyCustomerEphemeralKey implements i {
            public static final Parcelable.Creator<LegacyCustomerEphemeralKey> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String ephemeralKeySecret;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final String analyticsValue;

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$i$b$a */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<LegacyCustomerEphemeralKey> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final LegacyCustomerEphemeralKey createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new LegacyCustomerEphemeralKey(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final LegacyCustomerEphemeralKey[] newArray(int i11) {
                    return new LegacyCustomerEphemeralKey[i11];
                }
            }

            public LegacyCustomerEphemeralKey(String ephemeralKeySecret) {
                p013kotlin.jvm.internal.s.k(ephemeralKeySecret, "ephemeralKeySecret");
                this.ephemeralKeySecret = ephemeralKeySecret;
                this.analyticsValue = "legacy";
            }

            @Override // com.stripe.android.paymentsheet.y.i
            /* JADX INFO: renamed from: I, reason: from getter */
            public String getAnalyticsValue() {
                return this.analyticsValue;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getEphemeralKeySecret() {
                return this.ephemeralKeySecret;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof LegacyCustomerEphemeralKey) && p013kotlin.jvm.internal.s.f(this.ephemeralKeySecret, ((LegacyCustomerEphemeralKey) other).ephemeralKeySecret);
            }

            public int hashCode() {
                return this.ephemeralKeySecret.hashCode();
            }

            public String toString() {
                return "LegacyCustomerEphemeralKey(ephemeralKeySecret=" + this.ephemeralKeySecret + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeString(this.ephemeralKeySecret);
            }
        }

        /* JADX INFO: renamed from: I */
        String getAnalyticsValue();
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\fJ+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ+\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\nJ+\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH&¢\u0006\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/y$k;", "", "", "paymentIntentClientSecret", "Lcom/stripe/android/paymentsheet/y$h;", "configuration", "Lcom/stripe/android/paymentsheet/y$k$b;", "callback", "Ljn0/h0;", "c", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/y$h;Lcom/stripe/android/paymentsheet/y$k$b;)V", "setupIntentClientSecret", "b", "Lcom/stripe/android/paymentsheet/y$n;", "intentConfiguration", "a", "(Lcom/stripe/android/paymentsheet/y$n;Lcom/stripe/android/paymentsheet/y$h;Lcom/stripe/android/paymentsheet/y$k$b;)V", "Lw70/g;", "e", "()Lw70/g;", DateTokenConverter.CONVERTER_KEY, "()V", "f", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = Companion.f53890a;

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$k$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/y$k$a;", "", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "fragment", "Ln70/o;", "paymentOptionCallback", "Ln70/q;", "paymentResultCallback", "Lcom/stripe/android/paymentsheet/y$k;", "b", "(Landroidx/fragment/app/Fragment;Ln70/o;Ln70/q;)Lcom/stripe/android/paymentsheet/y$k;", "Ln70/a;", "createIntentCallback", "a", "(Landroidx/fragment/app/Fragment;Ln70/o;Ln70/a;Ln70/q;)Lcom/stripe/android/paymentsheet/y$k;", "Lcom/stripe/android/paymentsheet/k;", "Lcom/stripe/android/paymentsheet/k;", "c", "()Lcom/stripe/android/paymentsheet/k;", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/paymentsheet/k;)V", "linkHandler", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ Companion f53890a = new Companion();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static com.stripe.android.paymentsheet.k linkHandler;

            private Companion() {
            }

            public final k a(Fragment fragment, n70.o paymentOptionCallback, n70.a createIntentCallback, n70.q paymentResultCallback) {
                p013kotlin.jvm.internal.s.k(fragment, "fragment");
                p013kotlin.jvm.internal.s.k(paymentOptionCallback, "paymentOptionCallback");
                p013kotlin.jvm.internal.s.k(createIntentCallback, "createIntentCallback");
                p013kotlin.jvm.internal.s.k(paymentResultCallback, "paymentResultCallback");
                com.stripe.android.paymentsheet.i.INSTANCE.b(createIntentCallback);
                return new com.stripe.android.paymentsheet.flowcontroller.d(fragment, paymentOptionCallback, paymentResultCallback).a();
            }

            public final k b(Fragment fragment, n70.o paymentOptionCallback, n70.q paymentResultCallback) {
                p013kotlin.jvm.internal.s.k(fragment, "fragment");
                p013kotlin.jvm.internal.s.k(paymentOptionCallback, "paymentOptionCallback");
                p013kotlin.jvm.internal.s.k(paymentResultCallback, "paymentResultCallback");
                return new com.stripe.android.paymentsheet.flowcontroller.d(fragment, paymentOptionCallback, paymentResultCallback).a();
            }

            public final com.stripe.android.paymentsheet.k c() {
                return linkHandler;
            }

            public final void d(com.stripe.android.paymentsheet.k kVar) {
                linkHandler = kVar;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/y$k$b;", "", "", "success", "", AnalyticsAttribute.Error, "Ljn0/h0;", "a", "(ZLjava/lang/Throwable;)V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface b {
            void a(boolean success, Throwable error);
        }

        void a(n intentConfiguration, Configuration configuration, b callback);

        void b(String setupIntentClientSecret, Configuration configuration, b callback);

        void c(String paymentIntentClientSecret, Configuration configuration, b callback);

        void d();

        PaymentOption e();

        void f();
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$l, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001f&BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b&\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b!\u0010'\u001a\u0004\b\u001f\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b)\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b#\u0010,¨\u0006-"}, d2 = {"Lcom/stripe/android/paymentsheet/y$l;", "Landroid/os/Parcelable;", "Lcom/stripe/android/paymentsheet/y$l$c;", AnalyticsAttribute.Environment, "", "countryCode", "currencyCode", "", "amount", AnnotatedPrivateKey.LABEL, "Lcom/stripe/android/paymentsheet/y$l$a;", "buttonType", "<init>", "(Lcom/stripe/android/paymentsheet/y$l$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/paymentsheet/y$l$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/paymentsheet/y$l$c;", DateTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/paymentsheet/y$l$c;", "b", "Ljava/lang/String;", "getCountryCode", "c", "Ljava/lang/Long;", "()Ljava/lang/Long;", "e", "f", "Lcom/stripe/android/paymentsheet/y$l$a;", "()Lcom/stripe/android/paymentsheet/y$l$a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GooglePayConfiguration implements Parcelable {
        public static final Parcelable.Creator<GooglePayConfiguration> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final c environment;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String countryCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String currencyCode;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long amount;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String label;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final a buttonType;

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$l$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/y$l$a;", "", "<init>", "(Ljava/lang/String;I)V", "Buy", "Book", "Checkout", "Donate", "Order", "Pay", "Subscribe", "Plain", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum a {
            Buy,
            Book,
            Checkout,
            Donate,
            Order,
            Pay,
            Subscribe,
            Plain;

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

            public static EnumEntries<a> getEntries() {
                return $ENTRIES;
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$l$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<GooglePayConfiguration> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GooglePayConfiguration createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new GooglePayConfiguration(c.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GooglePayConfiguration[] newArray(int i11) {
                return new GooglePayConfiguration[i11];
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$l$c */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/y$l$c;", "", "<init>", "(Ljava/lang/String;I)V", "Production", "Test", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum c {
            Production,
            Test;

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

            public static EnumEntries<c> getEntries() {
                return $ENTRIES;
            }
        }

        public GooglePayConfiguration(c environment, String countryCode, String str, Long l11, String str2, a buttonType) {
            p013kotlin.jvm.internal.s.k(environment, "environment");
            p013kotlin.jvm.internal.s.k(countryCode, "countryCode");
            p013kotlin.jvm.internal.s.k(buttonType, "buttonType");
            this.environment = environment;
            this.countryCode = countryCode;
            this.currencyCode = str;
            this.amount = l11;
            this.label = str2;
            this.buttonType = buttonType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Long getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final a getButtonType() {
            return this.buttonType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final c getEnvironment() {
            return this.environment;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GooglePayConfiguration)) {
                return false;
            }
            GooglePayConfiguration googlePayConfiguration = (GooglePayConfiguration) other;
            return this.environment == googlePayConfiguration.environment && p013kotlin.jvm.internal.s.f(this.countryCode, googlePayConfiguration.countryCode) && p013kotlin.jvm.internal.s.f(this.currencyCode, googlePayConfiguration.currencyCode) && p013kotlin.jvm.internal.s.f(this.amount, googlePayConfiguration.amount) && p013kotlin.jvm.internal.s.f(this.label, googlePayConfiguration.label) && this.buttonType == googlePayConfiguration.buttonType;
        }

        public final String getCountryCode() {
            return this.countryCode;
        }

        public int hashCode() {
            int iHashCode = ((this.environment.hashCode() * 31) + this.countryCode.hashCode()) * 31;
            String str = this.currencyCode;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l11 = this.amount;
            int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str2 = this.label;
            return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.buttonType.hashCode();
        }

        public String toString() {
            return "GooglePayConfiguration(environment=" + this.environment + ", countryCode=" + this.countryCode + ", currencyCode=" + this.currencyCode + ", amount=" + this.amount + ", label=" + this.label + ", buttonType=" + this.buttonType + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.environment.name());
            parcel.writeString(this.countryCode);
            parcel.writeString(this.currencyCode);
            Long l11 = this.amount;
            if (l11 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l11.longValue());
            }
            parcel.writeString(this.label);
            parcel.writeString(this.buttonType.name());
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0005\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/y$m;", "Landroid/os/Parcelable;", "<init>", "()V", "Ljn0/h0;", "a", "b", "c", "Lcom/stripe/android/paymentsheet/y$m$a;", "Lcom/stripe/android/paymentsheet/y$m$b;", "Lcom/stripe/android/paymentsheet/y$m$c;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class m implements Parcelable {

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$m$a, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentsheet/y$m$a;", "Lcom/stripe/android/paymentsheet/y$m;", "Lcom/stripe/android/paymentsheet/y$n;", "intentConfiguration", "<init>", "(Lcom/stripe/android/paymentsheet/y$n;)V", "Ljn0/h0;", "a", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/paymentsheet/y$n;", "b", "()Lcom/stripe/android/paymentsheet/y$n;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DeferredIntent extends m {
            public static final Parcelable.Creator<DeferredIntent> CREATOR = new C1066a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final n intentConfiguration;

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$m$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C1066a implements Parcelable.Creator<DeferredIntent> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final DeferredIntent createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new DeferredIntent(n.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final DeferredIntent[] newArray(int i11) {
                    return new DeferredIntent[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeferredIntent(n intentConfiguration) {
                super(null);
                p013kotlin.jvm.internal.s.k(intentConfiguration, "intentConfiguration");
                this.intentConfiguration = intentConfiguration;
            }

            @Override // com.stripe.android.paymentsheet.y.m
            public void a() {
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final n getIntentConfiguration() {
                return this.intentConfiguration;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DeferredIntent) && p013kotlin.jvm.internal.s.f(this.intentConfiguration, ((DeferredIntent) other).intentConfiguration);
            }

            public int hashCode() {
                return this.intentConfiguration.hashCode();
            }

            public String toString() {
                return "DeferredIntent(intentConfiguration=" + this.intentConfiguration + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                this.intentConfiguration.writeToParcel(parcel, flags);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$m$b, reason: from toString */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentsheet/y$m$b;", "Lcom/stripe/android/paymentsheet/y$m;", "", "clientSecret", "<init>", "(Ljava/lang/String;)V", "Ljn0/h0;", "a", "()V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "p", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PaymentIntent extends m {
            public static final Parcelable.Creator<PaymentIntent> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String clientSecret;

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$m$b$a */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<PaymentIntent> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PaymentIntent createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new PaymentIntent(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final PaymentIntent[] newArray(int i11) {
                    return new PaymentIntent[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaymentIntent(String clientSecret) {
                super(null);
                p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
                this.clientSecret = clientSecret;
            }

            @Override // com.stripe.android.paymentsheet.y.m
            public void a() {
                new PaymentIntentClientSecret(this.clientSecret).b();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PaymentIntent) && p013kotlin.jvm.internal.s.f(this.clientSecret, ((PaymentIntent) other).clientSecret);
            }

            public int hashCode() {
                return this.clientSecret.hashCode();
            }

            /* JADX INFO: renamed from: p, reason: from getter */
            public final String getClientSecret() {
                return this.clientSecret;
            }

            public String toString() {
                return "PaymentIntent(clientSecret=" + this.clientSecret + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeString(this.clientSecret);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$m$c, reason: from toString */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentsheet/y$m$c;", "Lcom/stripe/android/paymentsheet/y$m;", "", "clientSecret", "<init>", "(Ljava/lang/String;)V", "Ljn0/h0;", "a", "()V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "p", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SetupIntent extends m {
            public static final Parcelable.Creator<SetupIntent> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String clientSecret;

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$m$c$a */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<SetupIntent> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final SetupIntent createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new SetupIntent(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final SetupIntent[] newArray(int i11) {
                    return new SetupIntent[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupIntent(String clientSecret) {
                super(null);
                p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
                this.clientSecret = clientSecret;
            }

            @Override // com.stripe.android.paymentsheet.y.m
            public void a() {
                new SetupIntentClientSecret(this.clientSecret).b();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetupIntent) && p013kotlin.jvm.internal.s.f(this.clientSecret, ((SetupIntent) other).clientSecret);
            }

            public int hashCode() {
                return this.clientSecret.hashCode();
            }

            /* JADX INFO: renamed from: p, reason: from getter */
            public final String getClientSecret() {
                return this.clientSecret;
            }

            public String toString() {
                return "SetupIntent(clientSecret=" + this.clientSecret + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeString(this.clientSecret);
            }
        }

        public /* synthetic */ m(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract void a();

        private m() {
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.stripe.android.paymentsheet.y$o, still in use, count: 1, list:
      (r0v0 com.stripe.android.paymentsheet.y$o) from 0x0032: SPUT (r0v0 com.stripe.android.paymentsheet.y$o) (LINE:51) com.stripe.android.paymentsheet.y.o.default com.stripe.android.paymentsheet.y$o
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/y$o;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "Horizontal", "Vertical", "Automatic", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class o {
        Horizontal,
        Vertical,
        Automatic;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: default, reason: not valid java name */
        private static final o f1default = new o();

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$o$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/y$o$a;", "", "<init>", "()V", "Lcom/stripe/android/paymentsheet/y$o;", "default", "Lcom/stripe/android/paymentsheet/y$o;", "a", "()Lcom/stripe/android/paymentsheet/y$o;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final o a() {
                return o.f1default;
            }

            private Companion() {
            }
        }

        static {
        }

        private o() {
            super(str, i);
        }

        public static EnumEntries<o> getEntries() {
            return $ENTRIES;
        }

        public static o valueOf(String str) {
            return (o) Enum.valueOf(o.class, str);
        }

        public static o[] values() {
            return (o[]) $VALUES.clone();
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$p, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001d\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006'"}, d2 = {"Lcom/stripe/android/paymentsheet/y$p;", "Landroid/os/Parcelable;", "Lcom/stripe/android/paymentsheet/y$q;", "colorsLight", "colorsDark", "Lcom/stripe/android/paymentsheet/y$r;", "shape", "Lcom/stripe/android/paymentsheet/y$s;", "typography", "<init>", "(Lcom/stripe/android/paymentsheet/y$q;Lcom/stripe/android/paymentsheet/y$q;Lcom/stripe/android/paymentsheet/y$r;Lcom/stripe/android/paymentsheet/y$s;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/paymentsheet/y$q;", "b", "()Lcom/stripe/android/paymentsheet/y$q;", "c", "Lcom/stripe/android/paymentsheet/y$r;", "()Lcom/stripe/android/paymentsheet/y$r;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/paymentsheet/y$s;", "()Lcom/stripe/android/paymentsheet/y$s;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PrimaryButton implements Parcelable {
        public static final Parcelable.Creator<PrimaryButton> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final PrimaryButtonColors colorsLight;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final PrimaryButtonColors colorsDark;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final PrimaryButtonShape shape;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final PrimaryButtonTypography typography;

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$p$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PrimaryButton> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PrimaryButton createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                Parcelable.Creator<PrimaryButtonColors> creator = PrimaryButtonColors.CREATOR;
                return new PrimaryButton(creator.createFromParcel(parcel), creator.createFromParcel(parcel), PrimaryButtonShape.CREATOR.createFromParcel(parcel), PrimaryButtonTypography.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final PrimaryButton[] newArray(int i11) {
                return new PrimaryButton[i11];
            }
        }

        public PrimaryButton() {
            this(null, null, null, null, 15, null);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PrimaryButtonColors getColorsDark() {
            return this.colorsDark;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final PrimaryButtonColors getColorsLight() {
            return this.colorsLight;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final PrimaryButtonShape getShape() {
            return this.shape;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final PrimaryButtonTypography getTypography() {
            return this.typography;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PrimaryButton)) {
                return false;
            }
            PrimaryButton primaryButton = (PrimaryButton) other;
            return p013kotlin.jvm.internal.s.f(this.colorsLight, primaryButton.colorsLight) && p013kotlin.jvm.internal.s.f(this.colorsDark, primaryButton.colorsDark) && p013kotlin.jvm.internal.s.f(this.shape, primaryButton.shape) && p013kotlin.jvm.internal.s.f(this.typography, primaryButton.typography);
        }

        public int hashCode() {
            return (((((this.colorsLight.hashCode() * 31) + this.colorsDark.hashCode()) * 31) + this.shape.hashCode()) * 31) + this.typography.hashCode();
        }

        public String toString() {
            return "PrimaryButton(colorsLight=" + this.colorsLight + ", colorsDark=" + this.colorsDark + ", shape=" + this.shape + ", typography=" + this.typography + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            this.colorsLight.writeToParcel(parcel, flags);
            this.colorsDark.writeToParcel(parcel, flags);
            this.shape.writeToParcel(parcel, flags);
            this.typography.writeToParcel(parcel, flags);
        }

        public PrimaryButton(PrimaryButtonColors colorsLight, PrimaryButtonColors colorsDark, PrimaryButtonShape shape, PrimaryButtonTypography typography) {
            p013kotlin.jvm.internal.s.k(colorsLight, "colorsLight");
            p013kotlin.jvm.internal.s.k(colorsDark, "colorsDark");
            p013kotlin.jvm.internal.s.k(shape, "shape");
            p013kotlin.jvm.internal.s.k(typography, "typography");
            this.colorsLight = colorsLight;
            this.colorsDark = colorsDark;
            this.shape = shape;
            this.typography = typography;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ PrimaryButton(PrimaryButtonColors primaryButtonColors, PrimaryButtonColors primaryButtonColors2, PrimaryButtonShape primaryButtonShape, PrimaryButtonTypography primaryButtonTypography, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            int i12 = 3;
            this((i11 & 1) != 0 ? PrimaryButtonColors.INSTANCE.b() : primaryButtonColors, (i11 & 2) != 0 ? PrimaryButtonColors.INSTANCE.a() : primaryButtonColors2, (i11 & 4) != 0 ? new PrimaryButtonShape(null, 0 == true ? 1 : 0, i12, 0 == true ? 1 : 0) : primaryButtonShape, (i11 & 8) != 0 ? new PrimaryButtonTypography(0 == true ? 1 : 0, 0 == true ? 1 : 0, i12, 0 == true ? 1 : 0) : primaryButtonTypography);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$r, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentsheet/y$r;", "Landroid/os/Parcelable;", "", "cornerRadiusDp", "borderStrokeWidthDp", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/Float;", "b", "()Ljava/lang/Float;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PrimaryButtonShape implements Parcelable {
        public static final Parcelable.Creator<PrimaryButtonShape> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Float cornerRadiusDp;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Float borderStrokeWidthDp;

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$r$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PrimaryButtonShape> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PrimaryButtonShape createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new PrimaryButtonShape(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final PrimaryButtonShape[] newArray(int i11) {
                return new PrimaryButtonShape[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PrimaryButtonShape() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Float getBorderStrokeWidthDp() {
            return this.borderStrokeWidthDp;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Float getCornerRadiusDp() {
            return this.cornerRadiusDp;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PrimaryButtonShape)) {
                return false;
            }
            PrimaryButtonShape primaryButtonShape = (PrimaryButtonShape) other;
            return p013kotlin.jvm.internal.s.f(this.cornerRadiusDp, primaryButtonShape.cornerRadiusDp) && p013kotlin.jvm.internal.s.f(this.borderStrokeWidthDp, primaryButtonShape.borderStrokeWidthDp);
        }

        public int hashCode() {
            Float f11 = this.cornerRadiusDp;
            int iHashCode = (f11 == null ? 0 : f11.hashCode()) * 31;
            Float f12 = this.borderStrokeWidthDp;
            return iHashCode + (f12 != null ? f12.hashCode() : 0);
        }

        public String toString() {
            return "PrimaryButtonShape(cornerRadiusDp=" + this.cornerRadiusDp + ", borderStrokeWidthDp=" + this.borderStrokeWidthDp + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            Float f11 = this.cornerRadiusDp;
            if (f11 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeFloat(f11.floatValue());
            }
            Float f12 = this.borderStrokeWidthDp;
            if (f12 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeFloat(f12.floatValue());
            }
        }

        public PrimaryButtonShape(Float f11, Float f12) {
            this.cornerRadiusDp = f11;
            this.borderStrokeWidthDp = f12;
        }

        public /* synthetic */ PrimaryButtonShape(Float f11, Float f12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : f11, (i11 & 2) != 0 ? null : f12);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$s, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/paymentsheet/y$s;", "Landroid/os/Parcelable;", "", "fontResId", "", "fontSizeSp", "<init>", "(Ljava/lang/Integer;Ljava/lang/Float;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "Ljava/lang/Float;", "()Ljava/lang/Float;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PrimaryButtonTypography implements Parcelable {
        public static final Parcelable.Creator<PrimaryButtonTypography> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer fontResId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Float fontSizeSp;

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$s$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PrimaryButtonTypography> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PrimaryButtonTypography createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new PrimaryButtonTypography(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final PrimaryButtonTypography[] newArray(int i11) {
                return new PrimaryButtonTypography[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PrimaryButtonTypography() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Integer getFontResId() {
            return this.fontResId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Float getFontSizeSp() {
            return this.fontSizeSp;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PrimaryButtonTypography)) {
                return false;
            }
            PrimaryButtonTypography primaryButtonTypography = (PrimaryButtonTypography) other;
            return p013kotlin.jvm.internal.s.f(this.fontResId, primaryButtonTypography.fontResId) && p013kotlin.jvm.internal.s.f(this.fontSizeSp, primaryButtonTypography.fontSizeSp);
        }

        public int hashCode() {
            Integer num = this.fontResId;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Float f11 = this.fontSizeSp;
            return iHashCode + (f11 != null ? f11.hashCode() : 0);
        }

        public String toString() {
            return "PrimaryButtonTypography(fontResId=" + this.fontResId + ", fontSizeSp=" + this.fontSizeSp + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            Integer num = this.fontResId;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            Float f11 = this.fontSizeSp;
            if (f11 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeFloat(f11.floatValue());
            }
        }

        public PrimaryButtonTypography(Integer num, Float f11) {
            this.fontResId = num;
            this.fontSizeSp = f11;
        }

        public /* synthetic */ PrimaryButtonTypography(Integer num, Float f11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : f11);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$t, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\u001e¨\u0006 "}, d2 = {"Lcom/stripe/android/paymentsheet/y$t;", "Landroid/os/Parcelable;", "", "cornerRadiusDp", "borderStrokeWidthDp", "<init>", "(FF)V", "b", "(FF)Lcom/stripe/android/paymentsheet/y$t;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", Gender.FEMALE, DateTokenConverter.CONVERTER_KEY, "()F", "c", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Shapes implements Parcelable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Shapes f53931d;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final float cornerRadiusDp;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final float borderStrokeWidthDp;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Shapes> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$t$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/y$t$a;", "", "<init>", "()V", "Lcom/stripe/android/paymentsheet/y$t;", "default", "Lcom/stripe/android/paymentsheet/y$t;", "a", "()Lcom/stripe/android/paymentsheet/y$t;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Shapes a() {
                return Shapes.f53931d;
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$t$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Shapes> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Shapes createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Shapes(parcel.readFloat(), parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Shapes[] newArray(int i11) {
                return new Shapes[i11];
            }
        }

        static {
            f90.m mVar = f90.m.f64661a;
            f53931d = new Shapes(mVar.e().getCornerRadius(), mVar.e().getBorderStrokeWidth());
        }

        public Shapes(float f11, float f12) {
            this.cornerRadiusDp = f11;
            this.borderStrokeWidthDp = f12;
        }

        public final Shapes b(float cornerRadiusDp, float borderStrokeWidthDp) {
            return new Shapes(cornerRadiusDp, borderStrokeWidthDp);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getBorderStrokeWidthDp() {
            return this.borderStrokeWidthDp;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getCornerRadiusDp() {
            return this.cornerRadiusDp;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Shapes)) {
                return false;
            }
            Shapes shapes = (Shapes) other;
            return Float.compare(this.cornerRadiusDp, shapes.cornerRadiusDp) == 0 && Float.compare(this.borderStrokeWidthDp, shapes.borderStrokeWidthDp) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.cornerRadiusDp) * 31) + Float.hashCode(this.borderStrokeWidthDp);
        }

        public String toString() {
            return "Shapes(cornerRadiusDp=" + this.cornerRadiusDp + ", borderStrokeWidthDp=" + this.borderStrokeWidthDp + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeFloat(this.cornerRadiusDp);
            parcel.writeFloat(this.borderStrokeWidthDp);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$u, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001\u001bB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/stripe/android/paymentsheet/y$u;", "Landroid/os/Parcelable;", "", "sizeScaleFactor", "", "fontResId", "<init>", "(FLjava/lang/Integer;)V", "b", "(FLjava/lang/Integer;)Lcom/stripe/android/paymentsheet/y$u;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", Gender.FEMALE, DateTokenConverter.CONVERTER_KEY, "()F", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Typography implements Parcelable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Typography f53935d;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final float sizeScaleFactor;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer fontResId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Typography> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$u$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/y$u$a;", "", "<init>", "()V", "Lcom/stripe/android/paymentsheet/y$u;", "default", "Lcom/stripe/android/paymentsheet/y$u;", "a", "()Lcom/stripe/android/paymentsheet/y$u;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Typography a() {
                return Typography.f53935d;
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$u$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Typography> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Typography createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Typography(parcel.readFloat(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Typography[] newArray(int i11) {
                return new Typography[i11];
            }
        }

        static {
            f90.m mVar = f90.m.f64661a;
            f53935d = new Typography(mVar.f().getFontSizeMultiplier(), mVar.f().getFontFamily());
        }

        public Typography(float f11, Integer num) {
            this.sizeScaleFactor = f11;
            this.fontResId = num;
        }

        public final Typography b(float sizeScaleFactor, Integer fontResId) {
            return new Typography(sizeScaleFactor, fontResId);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getFontResId() {
            return this.fontResId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getSizeScaleFactor() {
            return this.sizeScaleFactor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Typography)) {
                return false;
            }
            Typography typography = (Typography) other;
            return Float.compare(this.sizeScaleFactor, typography.sizeScaleFactor) == 0 && p013kotlin.jvm.internal.s.f(this.fontResId, typography.fontResId);
        }

        public int hashCode() {
            int iHashCode = Float.hashCode(this.sizeScaleFactor) * 31;
            Integer num = this.fontResId;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "Typography(sizeScaleFactor=" + this.sizeScaleFactor + ", fontResId=" + this.fontResId + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            int iIntValue;
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeFloat(this.sizeScaleFactor);
            Integer num = this.fontResId;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
        }
    }

    public y(a0 paymentSheetLauncher) {
        p013kotlin.jvm.internal.s.k(paymentSheetLauncher, "paymentSheetLauncher");
        this.paymentSheetLauncher = paymentSheetLauncher;
    }

    public final void a(n intentConfiguration, Configuration configuration) {
        p013kotlin.jvm.internal.s.k(intentConfiguration, "intentConfiguration");
        this.paymentSheetLauncher.a(new m.DeferredIntent(intentConfiguration), configuration);
    }

    public final void b(String paymentIntentClientSecret, Configuration configuration) {
        p013kotlin.jvm.internal.s.k(paymentIntentClientSecret, "paymentIntentClientSecret");
        this.paymentSheetLauncher.a(new m.PaymentIntent(paymentIntentClientSecret), configuration);
    }

    public final void c(String setupIntentClientSecret, Configuration configuration) {
        p013kotlin.jvm.internal.s.k(setupIntentClientSecret, "setupIntentClientSecret");
        this.paymentSheetLauncher.a(new m.SetupIntent(setupIntentClientSecret), configuration);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(Fragment fragment, n70.q callback) {
        this(new c(fragment, callback));
        p013kotlin.jvm.internal.s.k(fragment, "fragment");
        p013kotlin.jvm.internal.s.k(callback, "callback");
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$j, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\u001bB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!¨\u0006#"}, d2 = {"Lcom/stripe/android/paymentsheet/y$j;", "Landroid/os/Parcelable;", "", "id", "ephemeralKeySecret", "Lcom/stripe/android/paymentsheet/y$i;", "accessType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/paymentsheet/y$i;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getId", "b", "c", "Lcom/stripe/android/paymentsheet/y$i;", "()Lcom/stripe/android/paymentsheet/y$i;", DateTokenConverter.CONVERTER_KEY, "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CustomerConfiguration implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String ephemeralKeySecret;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final i accessType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f53885e = 8;
        public static final Parcelable.Creator<CustomerConfiguration> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$j$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/y$j$a;", "", "<init>", "()V", "", "id", "clientSecret", "Lcom/stripe/android/paymentsheet/y$j;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/paymentsheet/y$j;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final CustomerConfiguration a(String id2, String clientSecret) {
                p013kotlin.jvm.internal.s.k(id2, "id");
                p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
                return new CustomerConfiguration(id2, "", new i.CustomerSession(clientSecret));
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$j$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<CustomerConfiguration> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CustomerConfiguration createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new CustomerConfiguration(parcel.readString(), parcel.readString(), (i) parcel.readParcelable(CustomerConfiguration.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CustomerConfiguration[] newArray(int i11) {
                return new CustomerConfiguration[i11];
            }
        }

        public CustomerConfiguration(String id2, String ephemeralKeySecret, i accessType) {
            p013kotlin.jvm.internal.s.k(id2, "id");
            p013kotlin.jvm.internal.s.k(ephemeralKeySecret, "ephemeralKeySecret");
            p013kotlin.jvm.internal.s.k(accessType, "accessType");
            this.id = id2;
            this.ephemeralKeySecret = ephemeralKeySecret;
            this.accessType = accessType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final i getAccessType() {
            return this.accessType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEphemeralKeySecret() {
            return this.ephemeralKeySecret;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomerConfiguration)) {
                return false;
            }
            CustomerConfiguration customerConfiguration = (CustomerConfiguration) other;
            return p013kotlin.jvm.internal.s.f(this.id, customerConfiguration.id) && p013kotlin.jvm.internal.s.f(this.ephemeralKeySecret, customerConfiguration.ephemeralKeySecret) && p013kotlin.jvm.internal.s.f(this.accessType, customerConfiguration.accessType);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + this.ephemeralKeySecret.hashCode()) * 31) + this.accessType.hashCode();
        }

        public String toString() {
            return "CustomerConfiguration(id=" + this.id + ", ephemeralKeySecret=" + this.ephemeralKeySecret + ", accessType=" + this.accessType + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.id);
            parcel.writeString(this.ephemeralKeySecret);
            parcel.writeParcelable(this.accessType, flags);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public CustomerConfiguration(String id2, String ephemeralKeySecret) {
            this(id2, ephemeralKeySecret, new i.LegacyCustomerEphemeralKey(ephemeralKeySecret));
            p013kotlin.jvm.internal.s.k(id2, "id");
            p013kotlin.jvm.internal.s.k(ephemeralKeySecret, "ephemeralKeySecret");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(Fragment fragment, n70.a createIntentCallback, n70.q paymentResultCallback) {
        this(new c(fragment, paymentResultCallback));
        p013kotlin.jvm.internal.s.k(fragment, "fragment");
        p013kotlin.jvm.internal.s.k(createIntentCallback, "createIntentCallback");
        p013kotlin.jvm.internal.s.k(paymentResultCallback, "paymentResultCallback");
        com.stripe.android.paymentsheet.i.INSTANCE.b(createIntentCallback);
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$b, reason: from toString */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\t\b\u0016¢\u0006\u0004\b\u000b\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b \u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b$\u0010,¨\u0006-"}, d2 = {"Lcom/stripe/android/paymentsheet/y$b;", "Landroid/os/Parcelable;", "Lcom/stripe/android/paymentsheet/y$f;", "colorsLight", "colorsDark", "Lcom/stripe/android/paymentsheet/y$t;", "shapes", "Lcom/stripe/android/paymentsheet/y$u;", "typography", "Lcom/stripe/android/paymentsheet/y$p;", "primaryButton", "<init>", "(Lcom/stripe/android/paymentsheet/y$f;Lcom/stripe/android/paymentsheet/y$f;Lcom/stripe/android/paymentsheet/y$t;Lcom/stripe/android/paymentsheet/y$u;Lcom/stripe/android/paymentsheet/y$p;)V", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/paymentsheet/y$f;", "b", "()Lcom/stripe/android/paymentsheet/y$f;", "c", "Lcom/stripe/android/paymentsheet/y$t;", DateTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/paymentsheet/y$t;", "Lcom/stripe/android/paymentsheet/y$u;", "e", "()Lcom/stripe/android/paymentsheet/y$u;", "Lcom/stripe/android/paymentsheet/y$p;", "()Lcom/stripe/android/paymentsheet/y$p;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Appearance implements Parcelable {
        public static final Parcelable.Creator<Appearance> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Colors colorsLight;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Colors colorsDark;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Shapes shapes;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Typography typography;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final PrimaryButton primaryButton;

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$b$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Appearance> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Appearance createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                Parcelable.Creator<Colors> creator = Colors.CREATOR;
                return new Appearance(creator.createFromParcel(parcel), creator.createFromParcel(parcel), Shapes.CREATOR.createFromParcel(parcel), Typography.CREATOR.createFromParcel(parcel), PrimaryButton.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Appearance[] newArray(int i11) {
                return new Appearance[i11];
            }
        }

        public Appearance(Colors colorsLight, Colors colorsDark, Shapes shapes, Typography typography, PrimaryButton primaryButton) {
            p013kotlin.jvm.internal.s.k(colorsLight, "colorsLight");
            p013kotlin.jvm.internal.s.k(colorsDark, "colorsDark");
            p013kotlin.jvm.internal.s.k(shapes, "shapes");
            p013kotlin.jvm.internal.s.k(typography, "typography");
            p013kotlin.jvm.internal.s.k(primaryButton, "primaryButton");
            this.colorsLight = colorsLight;
            this.colorsDark = colorsDark;
            this.shapes = shapes;
            this.typography = typography;
            this.primaryButton = primaryButton;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Colors getColorsDark() {
            return this.colorsDark;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Colors getColorsLight() {
            return this.colorsLight;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final PrimaryButton getPrimaryButton() {
            return this.primaryButton;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Shapes getShapes() {
            return this.shapes;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Typography getTypography() {
            return this.typography;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Appearance)) {
                return false;
            }
            Appearance appearance = (Appearance) other;
            return p013kotlin.jvm.internal.s.f(this.colorsLight, appearance.colorsLight) && p013kotlin.jvm.internal.s.f(this.colorsDark, appearance.colorsDark) && p013kotlin.jvm.internal.s.f(this.shapes, appearance.shapes) && p013kotlin.jvm.internal.s.f(this.typography, appearance.typography) && p013kotlin.jvm.internal.s.f(this.primaryButton, appearance.primaryButton);
        }

        public int hashCode() {
            return (((((((this.colorsLight.hashCode() * 31) + this.colorsDark.hashCode()) * 31) + this.shapes.hashCode()) * 31) + this.typography.hashCode()) * 31) + this.primaryButton.hashCode();
        }

        public String toString() {
            return "Appearance(colorsLight=" + this.colorsLight + ", colorsDark=" + this.colorsDark + ", shapes=" + this.shapes + ", typography=" + this.typography + ", primaryButton=" + this.primaryButton + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            this.colorsLight.writeToParcel(parcel, flags);
            this.colorsDark.writeToParcel(parcel, flags);
            this.shapes.writeToParcel(parcel, flags);
            this.typography.writeToParcel(parcel, flags);
            this.primaryButton.writeToParcel(parcel, flags);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Appearance() {
            Colors.Companion companion = Colors.INSTANCE;
            this(companion.b(), companion.a(), Shapes.INSTANCE.a(), Typography.INSTANCE.a(), new PrimaryButton(null, null, null, null, 15, null));
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 $2\u00020\u0001:\u0004\u0016\u0019 !BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b \u0010#¨\u0006%"}, d2 = {"Lcom/stripe/android/paymentsheet/y$n;", "Landroid/os/Parcelable;", "Lcom/stripe/android/paymentsheet/y$n$d;", "mode", "", "", "paymentMethodTypes", "paymentMethodConfigurationId", "onBehalfOf", "", "requireCvcRecollection", "<init>", "(Lcom/stripe/android/paymentsheet/y$n$d;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/paymentsheet/y$n$d;", "()Lcom/stripe/android/paymentsheet/y$n$d;", "b", "Ljava/util/List;", "t", "()Ljava/util/List;", "c", "Ljava/lang/String;", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "e", "Z", "()Z", "f", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class n implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final d mode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<String> paymentMethodTypes;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String paymentMethodConfigurationId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String onBehalfOf;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean requireCvcRecollection;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f53902g = 8;
        public static final Parcelable.Creator<n> CREATOR = new c();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/y$n$a;", "", "<init>", "(Ljava/lang/String;I)V", "Automatic", "AutomaticAsync", "Manual", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum a {
            Automatic,
            AutomaticAsync,
            Manual;

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

            public static EnumEntries<a> getEntries() {
                return $ENTRIES;
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<n> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final n createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new n((d) parcel.readParcelable(n.class.getClassLoader()), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final n[] newArray(int i11) {
                return new n[i11];
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0005\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048 X \u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/y$n$d;", "Landroid/os/Parcelable;", "<init>", "()V", "Lcom/stripe/android/paymentsheet/y$n$e;", "a", "()Lcom/stripe/android/paymentsheet/y$n$e;", "setupFutureUse", "b", "Lcom/stripe/android/paymentsheet/y$n$d$a;", "Lcom/stripe/android/paymentsheet/y$n$d$b;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class d implements Parcelable {

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR\u001a\u0010\t\u001a\u00020\b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010!¨\u0006\""}, d2 = {"Lcom/stripe/android/paymentsheet/y$n$d$a;", "Lcom/stripe/android/paymentsheet/y$n$d;", "", "amount", "", "currency", "Lcom/stripe/android/paymentsheet/y$n$e;", "setupFutureUse", "Lcom/stripe/android/paymentsheet/y$n$a;", "captureMethod", "<init>", "(JLjava/lang/String;Lcom/stripe/android/paymentsheet/y$n$e;Lcom/stripe/android/paymentsheet/y$n$a;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "J", "b", "()J", "Ljava/lang/String;", "getCurrency", "()Ljava/lang/String;", "c", "Lcom/stripe/android/paymentsheet/y$n$e;", "()Lcom/stripe/android/paymentsheet/y$n$e;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/paymentsheet/y$n$a;", "()Lcom/stripe/android/paymentsheet/y$n$a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class a extends d {
                public static final Parcelable.Creator<a> CREATOR = new C1067a();

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final long amount;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                private final String currency;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                private final e setupFutureUse;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                private final a captureMethod;

                /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$n$d$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class C1067a implements Parcelable.Creator<a> {
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final a createFromParcel(Parcel parcel) {
                        p013kotlin.jvm.internal.s.k(parcel, "parcel");
                        return new a(parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : e.valueOf(parcel.readString()), a.valueOf(parcel.readString()));
                    }

                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final a[] newArray(int i11) {
                        return new a[i11];
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(long j11, String currency, e eVar, a captureMethod) {
                    super(null);
                    p013kotlin.jvm.internal.s.k(currency, "currency");
                    p013kotlin.jvm.internal.s.k(captureMethod, "captureMethod");
                    this.amount = j11;
                    this.currency = currency;
                    this.setupFutureUse = eVar;
                    this.captureMethod = captureMethod;
                }

                @Override // com.stripe.android.paymentsheet.y.n.d
                /* JADX INFO: renamed from: a, reason: from getter */
                public e getSetupFutureUse() {
                    return this.setupFutureUse;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final long getAmount() {
                    return this.amount;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public a getCaptureMethod() {
                    return this.captureMethod;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public final String getCurrency() {
                    return this.currency;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    p013kotlin.jvm.internal.s.k(parcel, "out");
                    parcel.writeLong(this.amount);
                    parcel.writeString(this.currency);
                    e eVar = this.setupFutureUse;
                    if (eVar == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeString(eVar.name());
                    }
                    parcel.writeString(this.captureMethod.name());
                }
            }

            public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public abstract e getSetupFutureUse();

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/y$n$d$b;", "Lcom/stripe/android/paymentsheet/y$n$d;", "", "currency", "Lcom/stripe/android/paymentsheet/y$n$e;", "setupFutureUse", "<init>", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/y$n$e;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getCurrency", "()Ljava/lang/String;", "b", "Lcom/stripe/android/paymentsheet/y$n$e;", "()Lcom/stripe/android/paymentsheet/y$n$e;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class b extends d {
                public static final Parcelable.Creator<b> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String currency;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                private final e setupFutureUse;

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<b> {
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final b createFromParcel(Parcel parcel) {
                        p013kotlin.jvm.internal.s.k(parcel, "parcel");
                        return new b(parcel.readString(), e.valueOf(parcel.readString()));
                    }

                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final b[] newArray(int i11) {
                        return new b[i11];
                    }
                }

                public /* synthetic */ b(String str, e eVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? e.OffSession : eVar);
                }

                @Override // com.stripe.android.paymentsheet.y.n.d
                /* JADX INFO: renamed from: a, reason: from getter */
                public e getSetupFutureUse() {
                    return this.setupFutureUse;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public final String getCurrency() {
                    return this.currency;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    p013kotlin.jvm.internal.s.k(parcel, "out");
                    parcel.writeString(this.currency);
                    parcel.writeString(this.setupFutureUse.name());
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(String str, e setupFutureUse) {
                    super(null);
                    p013kotlin.jvm.internal.s.k(setupFutureUse, "setupFutureUse");
                    this.currency = str;
                    this.setupFutureUse = setupFutureUse;
                }
            }

            private d() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/y$n$e;", "", "<init>", "(Ljava/lang/String;I)V", "OnSession", "OffSession", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum e {
            OnSession,
            OffSession;

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

            public static EnumEntries<e> getEntries() {
                return $ENTRIES;
            }
        }

        public n(d mode, List<String> paymentMethodTypes, String str, String str2, boolean z11) {
            p013kotlin.jvm.internal.s.k(mode, "mode");
            p013kotlin.jvm.internal.s.k(paymentMethodTypes, "paymentMethodTypes");
            this.mode = mode;
            this.paymentMethodTypes = paymentMethodTypes;
            this.paymentMethodConfigurationId = str;
            this.onBehalfOf = str2;
            this.requireCvcRecollection = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getMode() {
            return this.mode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getOnBehalfOf() {
            return this.onBehalfOf;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPaymentMethodConfigurationId() {
            return this.paymentMethodConfigurationId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getRequireCvcRecollection() {
            return this.requireCvcRecollection;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final List<String> t() {
            return this.paymentMethodTypes;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeParcelable(this.mode, flags);
            parcel.writeStringList(this.paymentMethodTypes);
            parcel.writeString(this.paymentMethodConfigurationId);
            parcel.writeString(this.onBehalfOf);
            parcel.writeInt(this.requireCvcRecollection ? 1 : 0);
        }

        public /* synthetic */ n(d dVar, List list, String str, String str2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(dVar, (i11 & 2) != 0 ? p013kotlin.collections.v.m() : list, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? false : z11);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$q, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001\u001cB;\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b#\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b%\u0010\u000f¨\u0006&"}, d2 = {"Lcom/stripe/android/paymentsheet/y$q;", "Landroid/os/Parcelable;", "", AppStateModule.APP_STATE_BACKGROUND, "onBackground", "border", "successBackgroundColor", "onSuccessBackgroundColor", "<init>", "(Ljava/lang/Integer;IIII)V", "(Ljava/lang/Integer;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "b", "I", "e", DateTokenConverter.CONVERTER_KEY, "g", "f", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PrimaryButtonColors implements Parcelable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final PrimaryButtonColors f53919g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final PrimaryButtonColors f53920h;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer background;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int onBackground;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int border;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int successBackgroundColor;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int onSuccessBackgroundColor;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<PrimaryButtonColors> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$q$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/y$q$a;", "", "<init>", "()V", "Lcom/stripe/android/paymentsheet/y$q;", "defaultLight", "Lcom/stripe/android/paymentsheet/y$q;", "b", "()Lcom/stripe/android/paymentsheet/y$q;", "defaultDark", "a", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final PrimaryButtonColors a() {
                return PrimaryButtonColors.f53920h;
            }

            public final PrimaryButtonColors b() {
                return PrimaryButtonColors.f53919g;
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$q$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<PrimaryButtonColors> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PrimaryButtonColors createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new PrimaryButtonColors(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final PrimaryButtonColors[] newArray(int i11) {
                return new PrimaryButtonColors[i11];
            }
        }

        static {
            f90.m mVar = f90.m.f64661a;
            f53919g = new PrimaryButtonColors(null, r1.k(mVar.d().getColorsLight().getOnBackground()), r1.k(mVar.d().getColorsLight().getBorder()), r1.k(mVar.d().getColorsLight().getSuccessBackground()), r1.k(mVar.d().getColorsLight().getOnBackground()));
            f53920h = new PrimaryButtonColors(null, r1.k(mVar.d().getColorsDark().getOnBackground()), r1.k(mVar.d().getColorsDark().getBorder()), r1.k(mVar.d().getColorsDark().getSuccessBackground()), r1.k(mVar.d().getColorsDark().getOnBackground()));
        }

        public PrimaryButtonColors(Integer num, int i11, int i12, int i13, int i14) {
            this.background = num;
            this.onBackground = i11;
            this.border = i12;
            this.successBackgroundColor = i13;
            this.onSuccessBackgroundColor = i14;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getBackground() {
            return this.background;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getBorder() {
            return this.border;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getOnBackground() {
            return this.onBackground;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PrimaryButtonColors)) {
                return false;
            }
            PrimaryButtonColors primaryButtonColors = (PrimaryButtonColors) other;
            return p013kotlin.jvm.internal.s.f(this.background, primaryButtonColors.background) && this.onBackground == primaryButtonColors.onBackground && this.border == primaryButtonColors.border && this.successBackgroundColor == primaryButtonColors.successBackgroundColor && this.onSuccessBackgroundColor == primaryButtonColors.onSuccessBackgroundColor;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getOnSuccessBackgroundColor() {
            return this.onSuccessBackgroundColor;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getSuccessBackgroundColor() {
            return this.successBackgroundColor;
        }

        public int hashCode() {
            Integer num = this.background;
            return ((((((((num == null ? 0 : num.hashCode()) * 31) + Integer.hashCode(this.onBackground)) * 31) + Integer.hashCode(this.border)) * 31) + Integer.hashCode(this.successBackgroundColor)) * 31) + Integer.hashCode(this.onSuccessBackgroundColor);
        }

        public String toString() {
            return "PrimaryButtonColors(background=" + this.background + ", onBackground=" + this.onBackground + ", border=" + this.border + ", successBackgroundColor=" + this.successBackgroundColor + ", onSuccessBackgroundColor=" + this.onSuccessBackgroundColor + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            int iIntValue;
            p013kotlin.jvm.internal.s.k(parcel, "out");
            Integer num = this.background;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
            parcel.writeInt(this.onBackground);
            parcel.writeInt(this.border);
            parcel.writeInt(this.successBackgroundColor);
            parcel.writeInt(this.onSuccessBackgroundColor);
        }

        public PrimaryButtonColors(Integer num, int i11, int i12) {
            this(num, i11, i12, r1.k(f90.n.m()), i11);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$h, reason: from toString */
    @Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b0\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u000236BÏ\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!B\u0091\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b \u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020%HÖ\u0001¢\u0006\u0004\b,\u0010'J \u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020%HÖ\u0001¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u0010?\u0012\u0004\bB\u0010C\u001a\u0004\b@\u0010AR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b8\u0010L\u001a\u0004\b3\u0010MR\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010L\u001a\u0004\b6\u0010MR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\b>\u0010PR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u00104\u001a\u0004\bQ\u0010$R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b5\u0010R\u001a\u0004\bD\u0010SR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010\u0019\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010L\u001a\u0004\b:\u0010MR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\bY\u0010U\u001a\u0004\bX\u0010WR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010U\u001a\u0004\bN\u0010WR\u001a\u0010\u001d\u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\bT\u0010]R\u001a\u0010\u001f\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bV\u0010^\u001a\u0004\bH\u0010_¨\u0006`"}, d2 = {"Lcom/stripe/android/paymentsheet/y$h;", "Landroid/os/Parcelable;", "", "merchantDisplayName", "Lcom/stripe/android/paymentsheet/y$j;", "customer", "Lcom/stripe/android/paymentsheet/y$l;", "googlePay", "Landroid/content/res/ColorStateList;", "primaryButtonColor", "Lcom/stripe/android/paymentsheet/y$c;", "defaultBillingDetails", "Lo70/a;", "shippingDetails", "", "allowsDelayedPaymentMethods", "allowsPaymentMethodsRequiringShippingAddress", "Lcom/stripe/android/paymentsheet/y$b;", "appearance", "primaryButtonLabel", "Lcom/stripe/android/paymentsheet/y$d;", "billingDetailsCollectionConfiguration", "", "Lcom/stripe/android/model/h;", "preferredNetworks", "allowsRemovalOfLastSavedPaymentMethod", "paymentMethodOrder", "externalPaymentMethods", "Lcom/stripe/android/paymentsheet/y$o;", "paymentMethodLayout", "Lcom/stripe/android/paymentsheet/y$e;", "cardBrandAcceptance", "<init>", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/y$j;Lcom/stripe/android/paymentsheet/y$l;Landroid/content/res/ColorStateList;Lcom/stripe/android/paymentsheet/y$c;Lo70/a;ZZLcom/stripe/android/paymentsheet/y$b;Ljava/lang/String;Lcom/stripe/android/paymentsheet/y$d;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Lcom/stripe/android/paymentsheet/y$o;Lcom/stripe/android/paymentsheet/y$e;)V", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/y$j;Lcom/stripe/android/paymentsheet/y$l;Landroid/content/res/ColorStateList;Lcom/stripe/android/paymentsheet/y$c;Lo70/a;ZZLcom/stripe/android/paymentsheet/y$b;Ljava/lang/String;Lcom/stripe/android/paymentsheet/y$d;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "k", "b", "Lcom/stripe/android/paymentsheet/y$j;", "g", "()Lcom/stripe/android/paymentsheet/y$j;", "c", "Lcom/stripe/android/paymentsheet/y$l;", "j", "()Lcom/stripe/android/paymentsheet/y$l;", DateTokenConverter.CONVERTER_KEY, "Landroid/content/res/ColorStateList;", "r", "()Landroid/content/res/ColorStateList;", "getPrimaryButtonColor$annotations", "()V", "e", "Lcom/stripe/android/paymentsheet/y$c;", "h", "()Lcom/stripe/android/paymentsheet/y$c;", "f", "Lo70/a;", "e0", "()Lo70/a;", "Z", "()Z", IntegerTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/paymentsheet/y$b;", "()Lcom/stripe/android/paymentsheet/y$b;", "s", "Lcom/stripe/android/paymentsheet/y$d;", "()Lcom/stripe/android/paymentsheet/y$d;", "l", "Ljava/util/List;", "q", "()Ljava/util/List;", "m", "n", "o", "p", "Lcom/stripe/android/paymentsheet/y$o;", "()Lcom/stripe/android/paymentsheet/y$o;", "Lcom/stripe/android/paymentsheet/y$e;", "()Lcom/stripe/android/paymentsheet/y$e;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Configuration implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String merchantDisplayName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final CustomerConfiguration customer;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final GooglePayConfiguration googlePay;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final ColorStateList primaryButtonColor;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final BillingDetails defaultBillingDetails;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final AddressDetails shippingDetails;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean allowsDelayedPaymentMethods;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean allowsPaymentMethodsRequiringShippingAddress;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Appearance appearance;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String primaryButtonLabel;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<com.stripe.android.model.h> preferredNetworks;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean allowsRemovalOfLastSavedPaymentMethod;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> paymentMethodOrder;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> externalPaymentMethods;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final o paymentMethodLayout;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final e cardBrandAcceptance;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f53845s = 8;
        public static final Parcelable.Creator<Configuration> CREATOR = new c();

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$h$a */
        @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001b\u0010(\u001a\u00020\u00002\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0016H\u0007¢\u0006\u0004\b+\u0010\u0019J\u001b\u0010-\u001a\u00020\u00002\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020%¢\u0006\u0004\b-\u0010)J\u0017\u00100\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.H\u0007¢\u0006\u0004\b0\u00101J\r\u00103\u001a\u000202¢\u0006\u0004\b3\u00104R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00105R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00106R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00107R\u0018\u0010:\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u00109R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010;R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010<R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010=R\u0016\u0010>\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010=R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010?R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u00105R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010@R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010AR\u0016\u0010*\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010=R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010AR\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010AR\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lcom/stripe/android/paymentsheet/y$h$a;", "", "", "merchantDisplayName", "<init>", "(Ljava/lang/String;)V", "Lcom/stripe/android/paymentsheet/y$j;", "customer", "f", "(Lcom/stripe/android/paymentsheet/y$j;)Lcom/stripe/android/paymentsheet/y$h$a;", "Lcom/stripe/android/paymentsheet/y$l;", "googlePay", "h", "(Lcom/stripe/android/paymentsheet/y$l;)Lcom/stripe/android/paymentsheet/y$h$a;", "Lcom/stripe/android/paymentsheet/y$c;", "defaultBillingDetails", "g", "(Lcom/stripe/android/paymentsheet/y$c;)Lcom/stripe/android/paymentsheet/y$h$a;", "Lo70/a;", "shippingDetails", "m", "(Lo70/a;)Lcom/stripe/android/paymentsheet/y$h$a;", "", "allowsDelayedPaymentMethods", "a", "(Z)Lcom/stripe/android/paymentsheet/y$h$a;", "Lcom/stripe/android/paymentsheet/y$b;", "appearance", "c", "(Lcom/stripe/android/paymentsheet/y$b;)Lcom/stripe/android/paymentsheet/y$h$a;", "primaryButtonLabel", "l", "(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/y$h$a;", "Lcom/stripe/android/paymentsheet/y$d;", "billingDetailsCollectionConfiguration", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/paymentsheet/y$d;)Lcom/stripe/android/paymentsheet/y$h$a;", "", "Lcom/stripe/android/model/h;", "preferredNetworks", "k", "(Ljava/util/List;)Lcom/stripe/android/paymentsheet/y$h$a;", "allowsRemovalOfLastSavedPaymentMethod", "b", "paymentMethodOrder", "j", "Lcom/stripe/android/paymentsheet/y$o;", "paymentMethodLayout", IntegerTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/paymentsheet/y$o;)Lcom/stripe/android/paymentsheet/y$h$a;", "Lcom/stripe/android/paymentsheet/y$h;", "e", "()Lcom/stripe/android/paymentsheet/y$h;", "Ljava/lang/String;", "Lcom/stripe/android/paymentsheet/y$j;", "Lcom/stripe/android/paymentsheet/y$l;", "Landroid/content/res/ColorStateList;", "Landroid/content/res/ColorStateList;", "primaryButtonColor", "Lcom/stripe/android/paymentsheet/y$c;", "Lo70/a;", "Z", "allowsPaymentMethodsRequiringShippingAddress", "Lcom/stripe/android/paymentsheet/y$b;", "Lcom/stripe/android/paymentsheet/y$d;", "Ljava/util/List;", "n", "o", "externalPaymentMethods", "p", "Lcom/stripe/android/paymentsheet/y$o;", "Lcom/stripe/android/paymentsheet/y$e;", "q", "Lcom/stripe/android/paymentsheet/y$e;", "cardBrandAcceptance", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private String merchantDisplayName;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private CustomerConfiguration customer;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private GooglePayConfiguration googlePay;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private ColorStateList primaryButtonColor;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            private BillingDetails defaultBillingDetails;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            private AddressDetails shippingDetails;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            private boolean allowsDelayedPaymentMethods;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            private boolean allowsPaymentMethodsRequiringShippingAddress;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
            private Appearance appearance;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
            private String primaryButtonLabel;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
            private BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
            private List<? extends com.stripe.android.model.h> preferredNetworks;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
            private boolean allowsRemovalOfLastSavedPaymentMethod;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
            private List<String> paymentMethodOrder;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
            private List<String> externalPaymentMethods;

            /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
            private o paymentMethodLayout;

            /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
            private e cardBrandAcceptance;

            public a(String merchantDisplayName) {
                p013kotlin.jvm.internal.s.k(merchantDisplayName, "merchantDisplayName");
                this.merchantDisplayName = merchantDisplayName;
                j30.a aVar = j30.a.f82462a;
                this.customer = aVar.e();
                this.googlePay = aVar.g();
                this.primaryButtonColor = aVar.k();
                this.defaultBillingDetails = aVar.b();
                this.shippingDetails = aVar.m();
                this.appearance = aVar.a();
                this.primaryButtonLabel = aVar.l();
                this.billingDetailsCollectionConfiguration = aVar.c();
                this.preferredNetworks = aVar.j();
                this.allowsRemovalOfLastSavedPaymentMethod = true;
                this.paymentMethodOrder = aVar.i();
                this.externalPaymentMethods = aVar.f();
                this.paymentMethodLayout = o.INSTANCE.a();
                this.cardBrandAcceptance = aVar.d();
            }

            public final a a(boolean allowsDelayedPaymentMethods) {
                this.allowsDelayedPaymentMethods = allowsDelayedPaymentMethods;
                return this;
            }

            public final a b(boolean allowsRemovalOfLastSavedPaymentMethod) {
                this.allowsRemovalOfLastSavedPaymentMethod = allowsRemovalOfLastSavedPaymentMethod;
                return this;
            }

            public final a c(Appearance appearance) {
                p013kotlin.jvm.internal.s.k(appearance, "appearance");
                this.appearance = appearance;
                return this;
            }

            public final a d(BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration) {
                p013kotlin.jvm.internal.s.k(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
                this.billingDetailsCollectionConfiguration = billingDetailsCollectionConfiguration;
                return this;
            }

            public final Configuration e() {
                return new Configuration(this.merchantDisplayName, this.customer, this.googlePay, this.primaryButtonColor, this.defaultBillingDetails, this.shippingDetails, this.allowsDelayedPaymentMethods, this.allowsPaymentMethodsRequiringShippingAddress, this.appearance, this.primaryButtonLabel, this.billingDetailsCollectionConfiguration, this.preferredNetworks, this.allowsRemovalOfLastSavedPaymentMethod, this.paymentMethodOrder, this.externalPaymentMethods, this.paymentMethodLayout, this.cardBrandAcceptance);
            }

            public final a f(CustomerConfiguration customer) {
                this.customer = customer;
                return this;
            }

            public final a g(BillingDetails defaultBillingDetails) {
                this.defaultBillingDetails = defaultBillingDetails;
                return this;
            }

            public final a h(GooglePayConfiguration googlePay) {
                this.googlePay = googlePay;
                return this;
            }

            public final a i(o paymentMethodLayout) {
                p013kotlin.jvm.internal.s.k(paymentMethodLayout, "paymentMethodLayout");
                this.paymentMethodLayout = paymentMethodLayout;
                return this;
            }

            public final a j(List<String> paymentMethodOrder) {
                p013kotlin.jvm.internal.s.k(paymentMethodOrder, "paymentMethodOrder");
                this.paymentMethodOrder = paymentMethodOrder;
                return this;
            }

            public final a k(List<? extends com.stripe.android.model.h> preferredNetworks) {
                p013kotlin.jvm.internal.s.k(preferredNetworks, "preferredNetworks");
                this.preferredNetworks = preferredNetworks;
                return this;
            }

            public final a l(String primaryButtonLabel) {
                p013kotlin.jvm.internal.s.k(primaryButtonLabel, "primaryButtonLabel");
                this.primaryButtonLabel = primaryButtonLabel;
                return this;
            }

            public final a m(AddressDetails shippingDetails) {
                this.shippingDetails = shippingDetails;
                return this;
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$h$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/y$h$b;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/stripe/android/paymentsheet/y$h;", "a", "(Landroid/content/Context;)Lcom/stripe/android/paymentsheet/y$h;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Configuration a(Context context) {
                p013kotlin.jvm.internal.s.k(context, "context");
                return new Configuration(context.getApplicationInfo().loadLabel(context.getPackageManager()).toString(), null, null, null, null, null, false, false, null, null, null, null, 4094, null);
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.y$h$c */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<Configuration> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Configuration createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                String string = parcel.readString();
                CustomerConfiguration customerConfigurationCreateFromParcel = parcel.readInt() == 0 ? null : CustomerConfiguration.CREATOR.createFromParcel(parcel);
                GooglePayConfiguration googlePayConfigurationCreateFromParcel = parcel.readInt() == 0 ? null : GooglePayConfiguration.CREATOR.createFromParcel(parcel);
                Class<Configuration> cls = Configuration.class;
                ColorStateList colorStateList = (ColorStateList) parcel.readParcelable(cls.getClassLoader());
                BillingDetails billingDetailsCreateFromParcel = parcel.readInt() == 0 ? null : BillingDetails.CREATOR.createFromParcel(parcel);
                AddressDetails addressDetailsCreateFromParcel = parcel.readInt() != 0 ? AddressDetails.CREATOR.createFromParcel(parcel) : null;
                boolean z11 = false;
                int i11 = 0;
                boolean z12 = true;
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                if (parcel.readInt() == 0) {
                    z12 = z11;
                }
                Appearance appearanceCreateFromParcel = Appearance.CREATOR.createFromParcel(parcel);
                String string2 = parcel.readString();
                BillingDetailsCollectionConfiguration billingDetailsCollectionConfigurationCreateFromParcel = BillingDetailsCollectionConfiguration.CREATOR.createFromParcel(parcel);
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                while (i11 != i12) {
                    arrayList.add(com.stripe.android.model.h.valueOf(parcel.readString()));
                    i11++;
                    cls = cls;
                }
                return new Configuration(string, customerConfigurationCreateFromParcel, googlePayConfigurationCreateFromParcel, colorStateList, billingDetailsCreateFromParcel, addressDetailsCreateFromParcel, z11, z12, appearanceCreateFromParcel, string2, billingDetailsCollectionConfigurationCreateFromParcel, arrayList, parcel.readInt() != 0, parcel.createStringArrayList(), parcel.createStringArrayList(), o.valueOf(parcel.readString()), (e) parcel.readParcelable(cls.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Configuration[] newArray(int i11) {
                return new Configuration[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails, AddressDetails addressDetails, boolean z11, boolean z12, Appearance appearance, String str, BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, List<? extends com.stripe.android.model.h> preferredNetworks, boolean z13, List<String> paymentMethodOrder, List<String> externalPaymentMethods, o paymentMethodLayout, e cardBrandAcceptance) {
            p013kotlin.jvm.internal.s.k(merchantDisplayName, "merchantDisplayName");
            p013kotlin.jvm.internal.s.k(appearance, "appearance");
            p013kotlin.jvm.internal.s.k(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
            p013kotlin.jvm.internal.s.k(preferredNetworks, "preferredNetworks");
            p013kotlin.jvm.internal.s.k(paymentMethodOrder, "paymentMethodOrder");
            p013kotlin.jvm.internal.s.k(externalPaymentMethods, "externalPaymentMethods");
            p013kotlin.jvm.internal.s.k(paymentMethodLayout, "paymentMethodLayout");
            p013kotlin.jvm.internal.s.k(cardBrandAcceptance, "cardBrandAcceptance");
            this.merchantDisplayName = merchantDisplayName;
            this.customer = customerConfiguration;
            this.googlePay = googlePayConfiguration;
            this.primaryButtonColor = colorStateList;
            this.defaultBillingDetails = billingDetails;
            this.shippingDetails = addressDetails;
            this.allowsDelayedPaymentMethods = z11;
            this.allowsPaymentMethodsRequiringShippingAddress = z12;
            this.appearance = appearance;
            this.primaryButtonLabel = str;
            this.billingDetailsCollectionConfiguration = billingDetailsCollectionConfiguration;
            this.preferredNetworks = preferredNetworks;
            this.allowsRemovalOfLastSavedPaymentMethod = z13;
            this.paymentMethodOrder = paymentMethodOrder;
            this.externalPaymentMethods = externalPaymentMethods;
            this.paymentMethodLayout = paymentMethodLayout;
            this.cardBrandAcceptance = cardBrandAcceptance;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getAllowsDelayedPaymentMethods() {
            return this.allowsDelayedPaymentMethods;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getAllowsPaymentMethodsRequiringShippingAddress() {
            return this.allowsPaymentMethodsRequiringShippingAddress;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getAllowsRemovalOfLastSavedPaymentMethod() {
            return this.allowsRemovalOfLastSavedPaymentMethod;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Appearance getAppearance() {
            return this.appearance;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final BillingDetailsCollectionConfiguration getBillingDetailsCollectionConfiguration() {
            return this.billingDetailsCollectionConfiguration;
        }

        /* JADX INFO: renamed from: e0, reason: from getter */
        public final AddressDetails getShippingDetails() {
            return this.shippingDetails;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return p013kotlin.jvm.internal.s.f(this.merchantDisplayName, configuration.merchantDisplayName) && p013kotlin.jvm.internal.s.f(this.customer, configuration.customer) && p013kotlin.jvm.internal.s.f(this.googlePay, configuration.googlePay) && p013kotlin.jvm.internal.s.f(this.primaryButtonColor, configuration.primaryButtonColor) && p013kotlin.jvm.internal.s.f(this.defaultBillingDetails, configuration.defaultBillingDetails) && p013kotlin.jvm.internal.s.f(this.shippingDetails, configuration.shippingDetails) && this.allowsDelayedPaymentMethods == configuration.allowsDelayedPaymentMethods && this.allowsPaymentMethodsRequiringShippingAddress == configuration.allowsPaymentMethodsRequiringShippingAddress && p013kotlin.jvm.internal.s.f(this.appearance, configuration.appearance) && p013kotlin.jvm.internal.s.f(this.primaryButtonLabel, configuration.primaryButtonLabel) && p013kotlin.jvm.internal.s.f(this.billingDetailsCollectionConfiguration, configuration.billingDetailsCollectionConfiguration) && p013kotlin.jvm.internal.s.f(this.preferredNetworks, configuration.preferredNetworks) && this.allowsRemovalOfLastSavedPaymentMethod == configuration.allowsRemovalOfLastSavedPaymentMethod && p013kotlin.jvm.internal.s.f(this.paymentMethodOrder, configuration.paymentMethodOrder) && p013kotlin.jvm.internal.s.f(this.externalPaymentMethods, configuration.externalPaymentMethods) && this.paymentMethodLayout == configuration.paymentMethodLayout && p013kotlin.jvm.internal.s.f(this.cardBrandAcceptance, configuration.cardBrandAcceptance);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final e getCardBrandAcceptance() {
            return this.cardBrandAcceptance;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final CustomerConfiguration getCustomer() {
            return this.customer;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final BillingDetails getDefaultBillingDetails() {
            return this.defaultBillingDetails;
        }

        public int hashCode() {
            int iHashCode = this.merchantDisplayName.hashCode() * 31;
            CustomerConfiguration customerConfiguration = this.customer;
            int iHashCode2 = (iHashCode + (customerConfiguration == null ? 0 : customerConfiguration.hashCode())) * 31;
            GooglePayConfiguration googlePayConfiguration = this.googlePay;
            int iHashCode3 = (iHashCode2 + (googlePayConfiguration == null ? 0 : googlePayConfiguration.hashCode())) * 31;
            ColorStateList colorStateList = this.primaryButtonColor;
            int iHashCode4 = (iHashCode3 + (colorStateList == null ? 0 : colorStateList.hashCode())) * 31;
            BillingDetails billingDetails = this.defaultBillingDetails;
            int iHashCode5 = (iHashCode4 + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31;
            AddressDetails addressDetails = this.shippingDetails;
            int iHashCode6 = (((((((iHashCode5 + (addressDetails == null ? 0 : addressDetails.hashCode())) * 31) + Boolean.hashCode(this.allowsDelayedPaymentMethods)) * 31) + Boolean.hashCode(this.allowsPaymentMethodsRequiringShippingAddress)) * 31) + this.appearance.hashCode()) * 31;
            String str = this.primaryButtonLabel;
            return ((((((((((((((iHashCode6 + (str != null ? str.hashCode() : 0)) * 31) + this.billingDetailsCollectionConfiguration.hashCode()) * 31) + this.preferredNetworks.hashCode()) * 31) + Boolean.hashCode(this.allowsRemovalOfLastSavedPaymentMethod)) * 31) + this.paymentMethodOrder.hashCode()) * 31) + this.externalPaymentMethods.hashCode()) * 31) + this.paymentMethodLayout.hashCode()) * 31) + this.cardBrandAcceptance.hashCode();
        }

        public final List<String> i() {
            return this.externalPaymentMethods;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final GooglePayConfiguration getGooglePay() {
            return this.googlePay;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getMerchantDisplayName() {
            return this.merchantDisplayName;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final o getPaymentMethodLayout() {
            return this.paymentMethodLayout;
        }

        public final List<String> m() {
            return this.paymentMethodOrder;
        }

        public final List<com.stripe.android.model.h> q() {
            return this.preferredNetworks;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final ColorStateList getPrimaryButtonColor() {
            return this.primaryButtonColor;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final String getPrimaryButtonLabel() {
            return this.primaryButtonLabel;
        }

        public String toString() {
            return "Configuration(merchantDisplayName=" + this.merchantDisplayName + ", customer=" + this.customer + ", googlePay=" + this.googlePay + ", primaryButtonColor=" + this.primaryButtonColor + ", defaultBillingDetails=" + this.defaultBillingDetails + ", shippingDetails=" + this.shippingDetails + ", allowsDelayedPaymentMethods=" + this.allowsDelayedPaymentMethods + ", allowsPaymentMethodsRequiringShippingAddress=" + this.allowsPaymentMethodsRequiringShippingAddress + ", appearance=" + this.appearance + ", primaryButtonLabel=" + this.primaryButtonLabel + ", billingDetailsCollectionConfiguration=" + this.billingDetailsCollectionConfiguration + ", preferredNetworks=" + this.preferredNetworks + ", allowsRemovalOfLastSavedPaymentMethod=" + this.allowsRemovalOfLastSavedPaymentMethod + ", paymentMethodOrder=" + this.paymentMethodOrder + ", externalPaymentMethods=" + this.externalPaymentMethods + ", paymentMethodLayout=" + this.paymentMethodLayout + ", cardBrandAcceptance=" + this.cardBrandAcceptance + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.merchantDisplayName);
            CustomerConfiguration customerConfiguration = this.customer;
            if (customerConfiguration == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                customerConfiguration.writeToParcel(parcel, flags);
            }
            GooglePayConfiguration googlePayConfiguration = this.googlePay;
            if (googlePayConfiguration == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                googlePayConfiguration.writeToParcel(parcel, flags);
            }
            parcel.writeParcelable(this.primaryButtonColor, flags);
            BillingDetails billingDetails = this.defaultBillingDetails;
            if (billingDetails == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                billingDetails.writeToParcel(parcel, flags);
            }
            AddressDetails addressDetails = this.shippingDetails;
            if (addressDetails == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                addressDetails.writeToParcel(parcel, flags);
            }
            parcel.writeInt(this.allowsDelayedPaymentMethods ? 1 : 0);
            parcel.writeInt(this.allowsPaymentMethodsRequiringShippingAddress ? 1 : 0);
            this.appearance.writeToParcel(parcel, flags);
            parcel.writeString(this.primaryButtonLabel);
            this.billingDetailsCollectionConfiguration.writeToParcel(parcel, flags);
            List<com.stripe.android.model.h> list = this.preferredNetworks;
            parcel.writeInt(list.size());
            Iterator<com.stripe.android.model.h> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next().name());
            }
            parcel.writeInt(this.allowsRemovalOfLastSavedPaymentMethod ? 1 : 0);
            parcel.writeStringList(this.paymentMethodOrder);
            parcel.writeStringList(this.externalPaymentMethods);
            parcel.writeString(this.paymentMethodLayout.name());
            parcel.writeParcelable(this.cardBrandAcceptance, flags);
        }

        public /* synthetic */ Configuration(String str, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails, AddressDetails addressDetails, boolean z11, boolean z12, Appearance appearance, String str2, BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, List list, boolean z13, List list2, List list3, o oVar, e eVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? j30.a.f82462a.e() : customerConfiguration, (i11 & 4) != 0 ? j30.a.f82462a.g() : googlePayConfiguration, (i11 & 8) != 0 ? j30.a.f82462a.k() : colorStateList, (i11 & 16) != 0 ? j30.a.f82462a.b() : billingDetails, (i11 & 32) != 0 ? j30.a.f82462a.m() : addressDetails, (i11 & 64) != 0 ? false : z11, (i11 & 128) == 0 ? z12 : false, (i11 & 256) != 0 ? j30.a.f82462a.a() : appearance, (i11 & 512) != 0 ? j30.a.f82462a.l() : str2, (i11 & 1024) != 0 ? j30.a.f82462a.c() : billingDetailsCollectionConfiguration, (i11 & 2048) != 0 ? j30.a.f82462a.j() : list, (i11 & 4096) != 0 ? true : z13, (i11 & PKIFailureInfo.certRevoked) != 0 ? j30.a.f82462a.i() : list2, (i11 & 16384) != 0 ? j30.a.f82462a.f() : list3, (32768 & i11) != 0 ? o.INSTANCE.a() : oVar, (i11 & 65536) != 0 ? j30.a.f82462a.d() : eVar);
        }

        public /* synthetic */ Configuration(String str, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails, AddressDetails addressDetails, boolean z11, boolean z12, Appearance appearance, String str2, BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? j30.a.f82462a.e() : customerConfiguration, (i11 & 4) != 0 ? j30.a.f82462a.g() : googlePayConfiguration, (i11 & 8) != 0 ? j30.a.f82462a.k() : colorStateList, (i11 & 16) != 0 ? j30.a.f82462a.b() : billingDetails, (i11 & 32) != 0 ? j30.a.f82462a.m() : addressDetails, (i11 & 64) != 0 ? false : z11, (i11 & 128) == 0 ? z12 : false, (i11 & 256) != 0 ? j30.a.f82462a.a() : appearance, (i11 & 512) != 0 ? j30.a.f82462a.l() : str2, (i11 & 1024) != 0 ? j30.a.f82462a.c() : billingDetailsCollectionConfiguration, (i11 & 2048) != 0 ? j30.a.f82462a.j() : list);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails, AddressDetails addressDetails, boolean z11, boolean z12, Appearance appearance, String str, BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, List<? extends com.stripe.android.model.h> preferredNetworks) {
            this(merchantDisplayName, customerConfiguration, googlePayConfiguration, colorStateList, billingDetails, addressDetails, z11, z12, appearance, str, billingDetailsCollectionConfiguration, preferredNetworks, true, null, j30.a.f82462a.f(), null, null, 106496, null);
            p013kotlin.jvm.internal.s.k(merchantDisplayName, "merchantDisplayName");
            p013kotlin.jvm.internal.s.k(appearance, "appearance");
            p013kotlin.jvm.internal.s.k(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
            p013kotlin.jvm.internal.s.k(preferredNetworks, "preferredNetworks");
        }
    }
}
