package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.Scopes;
import com.google.android.libraries.places.api.model.PlaceTypes;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.stripe.android.model.m0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001\u001fBQ\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b#\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010'\u001a\u0004\b&\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b)\u0010,¨\u0006."}, d2 = {"Lcom/stripe/android/model/m0;", "Landroid/os/Parcelable;", "Lcom/stripe/android/model/p1;", "token", "Lcom/stripe/android/model/b;", PlaceTypes.ADDRESS, "", "name", Scopes.EMAIL, "phoneNumber", "Lcom/stripe/android/model/f1;", "shippingInformation", "<init>", "(Lcom/stripe/android/model/p1;Lcom/stripe/android/model/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/f1;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/model/p1;", "e", "()Lcom/stripe/android/model/p1;", "b", "Lcom/stripe/android/model/b;", "()Lcom/stripe/android/model/b;", "c", "Ljava/lang/String;", "getName", DateTokenConverter.CONVERTER_KEY, "f", "Lcom/stripe/android/model/f1;", "()Lcom/stripe/android/model/f1;", "g", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GooglePayResult implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Token token;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Address address;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneNumber;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final ShippingInformation shippingInformation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f51396h = 8;
    public static final Parcelable.Creator<GooglePayResult> CREATOR = new b();

    /* JADX INFO: renamed from: com.stripe.android.model.m0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/m0$a;", "", "<init>", "()V", "Lorg/json/JSONObject;", "paymentDataJson", "Lcom/stripe/android/model/f1;", "a", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/f1;", "Lcom/stripe/android/model/m0;", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/m0;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final ShippingInformation a(JSONObject paymentDataJson) {
            JSONObject jSONObjectOptJSONObject = paymentDataJson.optJSONObject("shippingAddress");
            if (jSONObjectOptJSONObject == null) {
                return null;
            }
            String strL = t30.e.l(jSONObjectOptJSONObject, "address1");
            String strL2 = t30.e.l(jSONObjectOptJSONObject, "address2");
            String strL3 = t30.e.l(jSONObjectOptJSONObject, "postalCode");
            return new ShippingInformation(new Address(t30.e.l(jSONObjectOptJSONObject, PlaceTypes.LOCALITY), t30.e.l(jSONObjectOptJSONObject, "countryCode"), strL, strL2, strL3, t30.e.l(jSONObjectOptJSONObject, "administrativeArea")), t30.e.l(jSONObjectOptJSONObject, "name"), t30.e.l(jSONObjectOptJSONObject, "phoneNumber"));
        }

        public final GooglePayResult b(JSONObject paymentDataJson) {
            Address address;
            p013kotlin.jvm.internal.s.k(paymentDataJson, "paymentDataJson");
            JSONObject jSONObject = paymentDataJson.getJSONObject("paymentMethodData");
            Token tokenB = new x60.f0().a(new JSONObject(jSONObject.getJSONObject("tokenizationData").getString("token")));
            JSONObject jSONObjectOptJSONObject = jSONObject.getJSONObject("info").optJSONObject("billingAddress");
            if (jSONObjectOptJSONObject != null) {
                String strL = t30.e.l(jSONObjectOptJSONObject, "address1");
                String strL2 = t30.e.l(jSONObjectOptJSONObject, "address2");
                address = new Address(t30.e.l(jSONObjectOptJSONObject, PlaceTypes.LOCALITY), t30.e.l(jSONObjectOptJSONObject, "countryCode"), strL, strL2, t30.e.l(jSONObjectOptJSONObject, "postalCode"), t30.e.l(jSONObjectOptJSONObject, "administrativeArea"));
            } else {
                address = null;
            }
            return new GooglePayResult(tokenB, address, t30.e.l(jSONObjectOptJSONObject, "name"), t30.e.l(paymentDataJson, Scopes.EMAIL), t30.e.l(jSONObjectOptJSONObject, "phoneNumber"), a(paymentDataJson));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.m0$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<GooglePayResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GooglePayResult createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new GooglePayResult((Token) parcel.readParcelable(GooglePayResult.class.getClassLoader()), parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? ShippingInformation.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GooglePayResult[] newArray(int i11) {
            return new GooglePayResult[i11];
        }
    }

    public GooglePayResult() {
        this(null, null, null, null, null, null, 63, null);
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
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ShippingInformation getShippingInformation() {
        return this.shippingInformation;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Token getToken() {
        return this.token;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GooglePayResult)) {
            return false;
        }
        GooglePayResult googlePayResult = (GooglePayResult) other;
        return p013kotlin.jvm.internal.s.f(this.token, googlePayResult.token) && p013kotlin.jvm.internal.s.f(this.address, googlePayResult.address) && p013kotlin.jvm.internal.s.f(this.name, googlePayResult.name) && p013kotlin.jvm.internal.s.f(this.email, googlePayResult.email) && p013kotlin.jvm.internal.s.f(this.phoneNumber, googlePayResult.phoneNumber) && p013kotlin.jvm.internal.s.f(this.shippingInformation, googlePayResult.shippingInformation);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        Token token = this.token;
        int iHashCode = (token == null ? 0 : token.hashCode()) * 31;
        Address address = this.address;
        int iHashCode2 = (iHashCode + (address == null ? 0 : address.hashCode())) * 31;
        String str = this.name;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.email;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phoneNumber;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ShippingInformation shippingInformation = this.shippingInformation;
        return iHashCode5 + (shippingInformation != null ? shippingInformation.hashCode() : 0);
    }

    public String toString() {
        return "GooglePayResult(token=" + this.token + ", address=" + this.address + ", name=" + this.name + ", email=" + this.email + ", phoneNumber=" + this.phoneNumber + ", shippingInformation=" + this.shippingInformation + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeParcelable(this.token, flags);
        Address address = this.address;
        if (address == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            address.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.name);
        parcel.writeString(this.email);
        parcel.writeString(this.phoneNumber);
        ShippingInformation shippingInformation = this.shippingInformation;
        if (shippingInformation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shippingInformation.writeToParcel(parcel, flags);
        }
    }

    public GooglePayResult(Token token, Address address, String str, String str2, String str3, ShippingInformation shippingInformation) {
        this.token = token;
        this.address = address;
        this.name = str;
        this.email = str2;
        this.phoneNumber = str3;
        this.shippingInformation = shippingInformation;
    }

    public /* synthetic */ GooglePayResult(Token token, Address address, String str, String str2, String str3, ShippingInformation shippingInformation, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : token, (i11 & 2) != 0 ? null : address, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : shippingInformation);
    }
}
