package com.adyen.checkout.components.core;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 12\u00020\u0001:\u00012BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010&R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010#\u001a\u0004\b'\u0010\f\"\u0004\b(\u0010&R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010#\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010&R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010#\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010&R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010#\u001a\u0004\b-\u0010\f\"\u0004\b.\u0010&R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010#\u001a\u0004\b/\u0010\f\"\u0004\b0\u0010&¨\u00063"}, d2 = {"Lcom/adyen/checkout/components/core/Address;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", Address.CITY, "country", Address.HOUSE_NUMBER_OR_NAME, Address.POSTAL_CODE, Address.STATE_OR_PROVINCE, Address.STREET, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/adyen/checkout/components/core/Address;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCity", "setCity", "(Ljava/lang/String;)V", "getCountry", "setCountry", "getHouseNumberOrName", "setHouseNumberOrName", "getPostalCode", "setPostalCode", "getStateOrProvince", "setStateOrProvince", "getStreet", "setStreet", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Address extends b {
    public static final String ADDRESS_COUNTRY_NULL_PLACEHOLDER = "ZZ";
    public static final String ADDRESS_NULL_PLACEHOLDER = "null";
    private static final String CITY = "city";
    private static final String COUNTRY = "country";
    private static final String HOUSE_NUMBER_OR_NAME = "houseNumberOrName";
    private static final String POSTAL_CODE = "postalCode";
    private static final String STATE_OR_PROVINCE = "stateOrProvince";
    private static final String STREET = "street";
    private String city;
    private String country;
    private String houseNumberOrName;
    private String postalCode;
    private String stateOrProvince;
    private String street;
    public static final Parcelable.Creator<Address> CREATOR = new c();
    public static final b.a<Address> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/components/core/Address$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/Address;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/Address;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/Address;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<Address> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Address b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            return new Address(com.adyen.checkout.core.internal.data.model.a.e(jsonObject, Address.CITY), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "country"), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, Address.HOUSE_NUMBER_OR_NAME), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, Address.POSTAL_CODE), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, Address.STATE_OR_PROVINCE), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, Address.STREET));
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(Address modelObject) {
            s.k(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt(Address.CITY, modelObject.getCity());
                jSONObject.putOpt("country", modelObject.getCountry());
                jSONObject.putOpt(Address.HOUSE_NUMBER_OR_NAME, modelObject.getHouseNumberOrName());
                jSONObject.putOpt(Address.POSTAL_CODE, modelObject.getPostalCode());
                jSONObject.putOpt(Address.STATE_OR_PROVINCE, modelObject.getStateOrProvince());
                jSONObject.putOpt(Address.STREET, modelObject.getStreet());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(Address.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<Address> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Address createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
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

    public static /* synthetic */ Address copy$default(Address address, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = address.city;
        }
        if ((i11 & 2) != 0) {
            str2 = address.country;
        }
        if ((i11 & 4) != 0) {
            str3 = address.houseNumberOrName;
        }
        if ((i11 & 8) != 0) {
            str4 = address.postalCode;
        }
        if ((i11 & 16) != 0) {
            str5 = address.stateOrProvince;
        }
        if ((i11 & 32) != 0) {
            str6 = address.street;
        }
        String str7 = str5;
        String str8 = str6;
        return address.copy(str, str2, str3, str4, str7, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHouseNumberOrName() {
        return this.houseNumberOrName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStateOrProvince() {
        return this.stateOrProvince;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    public final Address copy(String city, String country, String houseNumberOrName, String postalCode, String stateOrProvince, String street) {
        return new Address(city, country, houseNumberOrName, postalCode, stateOrProvince, street);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Address)) {
            return false;
        }
        Address address = (Address) other;
        return s.f(this.city, address.city) && s.f(this.country, address.country) && s.f(this.houseNumberOrName, address.houseNumberOrName) && s.f(this.postalCode, address.postalCode) && s.f(this.stateOrProvince, address.stateOrProvince) && s.f(this.street, address.street);
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getHouseNumberOrName() {
        return this.houseNumberOrName;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getStateOrProvince() {
        return this.stateOrProvince;
    }

    public final String getStreet() {
        return this.street;
    }

    public int hashCode() {
        String str = this.city;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.country;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.houseNumberOrName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.postalCode;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.stateOrProvince;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.street;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setCity(String str) {
        this.city = str;
    }

    public final void setCountry(String str) {
        this.country = str;
    }

    public final void setHouseNumberOrName(String str) {
        this.houseNumberOrName = str;
    }

    public final void setPostalCode(String str) {
        this.postalCode = str;
    }

    public final void setStateOrProvince(String str) {
        this.stateOrProvince = str;
    }

    public final void setStreet(String str) {
        this.street = str;
    }

    public String toString() {
        return "Address(city=" + this.city + ", country=" + this.country + ", houseNumberOrName=" + this.houseNumberOrName + ", postalCode=" + this.postalCode + ", stateOrProvince=" + this.stateOrProvince + ", street=" + this.street + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.city);
        parcel.writeString(this.country);
        parcel.writeString(this.houseNumberOrName);
        parcel.writeString(this.postalCode);
        parcel.writeString(this.stateOrProvince);
        parcel.writeString(this.street);
    }

    public /* synthetic */ Address(String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6);
    }

    public Address(String str, String str2, String str3, String str4, String str5, String str6) {
        this.city = str;
        this.country = str2;
        this.houseNumberOrName = str3;
        this.postalCode = str4;
        this.stateOrProvince = str5;
        this.street = str6;
    }
}
