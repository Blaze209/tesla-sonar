package com.fourthline.kyc;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.core.Validatable;
import java.util.ArrayList;
import java.util.List;
import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.q;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B]\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\u000e*\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJd\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b$\u0010\u001aJ\u0010\u0010%\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010+\u001a\u0004\b,\u0010\u001a\"\u0004\b-\u0010.R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010/\u001a\u0004\b0\u0010\u001c\"\u0004\b1\u00102R$\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010+\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010.R$\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010+\u001a\u0004\b5\u0010\u001a\"\u0004\b6\u0010.R$\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010+\u001a\u0004\b7\u0010\u001a\"\u0004\b8\u0010.R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010+\u001a\u0004\b:\u0010\u001a\"\u0004\b;\u0010.R$\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010+\u001a\u0004\b=\u0010\u001a\"\u0004\b>\u0010.¨\u0006?"}, d2 = {"Lcom/fourthline/kyc/Address;", "Lcom/fourthline/core/Validatable;", "Lcom/fourthline/kyc/AddressValidationError;", "", "street", "", "streetNumber", "streetNumberSuffix", "postalCode", "city", "countryCode", "region", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "e", "()Z", DateTokenConverter.CONVERTER_KEY, "c", "a", "b", "(Ljava/lang/String;)Z", "", "validate", "()Ljava/util/List;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/fourthline/kyc/Address;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStreet", "setStreet", "(Ljava/lang/String;)V", "Ljava/lang/Integer;", "getStreetNumber", "setStreetNumber", "(Ljava/lang/Integer;)V", "getStreetNumberSuffix", "setStreetNumberSuffix", "getPostalCode", "setPostalCode", "getCity", "setCity", "f", "getCountryCode", "setCountryCode", "g", "getRegion", "setRegion", "fourthline-kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Address implements Validatable<AddressValidationError> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private String street;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private Integer streetNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String streetNumberSuffix;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private String postalCode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private String city;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private String countryCode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private String region;

    public Address() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    private final boolean a() {
        String str = this.city;
        if (str != null) {
            return !t.y0(str);
        }
        return false;
    }

    private final boolean b() {
        String str = this.countryCode;
        if (str != null) {
            return CountryCodes.INSTANCE.isSupportedCountry(str);
        }
        return false;
    }

    private final boolean c() {
        String str = this.postalCode;
        if (str != null) {
            return a(str);
        }
        return false;
    }

    public static /* synthetic */ Address copy$default(Address address, String str, Integer num, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = address.street;
        }
        if ((i11 & 2) != 0) {
            num = address.streetNumber;
        }
        if ((i11 & 4) != 0) {
            str2 = address.streetNumberSuffix;
        }
        if ((i11 & 8) != 0) {
            str3 = address.postalCode;
        }
        if ((i11 & 16) != 0) {
            str4 = address.city;
        }
        if ((i11 & 32) != 0) {
            str5 = address.countryCode;
        }
        if ((i11 & 64) != 0) {
            str6 = address.region;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str2;
        return address.copy(str, num, str10, str3, str9, str7, str8);
    }

    private final boolean d() {
        Integer num = this.streetNumber;
        return num != null && num.intValue() >= 0;
    }

    private final boolean e() {
        String str = this.street;
        if (str != null) {
            return !t.y0(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getStreetNumber() {
        return this.streetNumber;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStreetNumberSuffix() {
        return this.streetNumberSuffix;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    public final Address copy(String street, Integer streetNumber, String streetNumberSuffix, String postalCode, String city, String countryCode, String region) {
        return new Address(street, streetNumber, streetNumberSuffix, postalCode, city, countryCode, region);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Address)) {
            return false;
        }
        Address address = (Address) other;
        return s.f(this.street, address.street) && s.f(this.streetNumber, address.streetNumber) && s.f(this.streetNumberSuffix, address.streetNumberSuffix) && s.f(this.postalCode, address.postalCode) && s.f(this.city, address.city) && s.f(this.countryCode, address.countryCode) && s.f(this.region, address.region);
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getStreet() {
        return this.street;
    }

    public final Integer getStreetNumber() {
        return this.streetNumber;
    }

    public final String getStreetNumberSuffix() {
        return this.streetNumberSuffix;
    }

    public int hashCode() {
        String str = this.street;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.streetNumber;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.streetNumberSuffix;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.postalCode;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.city;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.countryCode;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.region;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setCity(String str) {
        this.city = str;
    }

    public final void setCountryCode(String str) {
        this.countryCode = str;
    }

    public final void setPostalCode(String str) {
        this.postalCode = str;
    }

    public final void setRegion(String str) {
        this.region = str;
    }

    public final void setStreet(String str) {
        this.street = str;
    }

    public final void setStreetNumber(Integer num) {
        this.streetNumber = num;
    }

    public final void setStreetNumberSuffix(String str) {
        this.streetNumberSuffix = str;
    }

    public String toString() {
        return "Address(street=" + this.street + ", streetNumber=" + this.streetNumber + ", streetNumberSuffix=" + this.streetNumberSuffix + ", postalCode=" + this.postalCode + ", city=" + this.city + ", countryCode=" + this.countryCode + ", region=" + this.region + ")";
    }

    @Override // com.fourthline.core.Validatable
    public List<AddressValidationError> validate() {
        ArrayList arrayList = new ArrayList();
        if (!e()) {
            arrayList.add(AddressValidationError.INVALID_STREET);
        }
        if (!d()) {
            arrayList.add(AddressValidationError.INVALID_STREET_NUMBER);
        }
        if (!c()) {
            arrayList.add(AddressValidationError.INVALID_POSTAL_CODE);
        }
        if (!a()) {
            arrayList.add(AddressValidationError.INVALID_CITY);
        }
        if (!b()) {
            arrayList.add(AddressValidationError.INVALID_COUNTRY_CODE);
        }
        return arrayList;
    }

    public Address(String str) {
        this(str, null, null, null, null, null, null, 126, null);
    }

    private final boolean a(String str) {
        return new q("^[a-zA-Z0-9-\\s]{3,}+$").i(str) && !t.y0(str);
    }

    public Address(String str, Integer num) {
        this(str, num, null, null, null, null, null, 124, null);
    }

    public Address(String str, Integer num, String str2) {
        this(str, num, str2, null, null, null, null, 120, null);
    }

    public Address(String str, Integer num, String str2, String str3) {
        this(str, num, str2, str3, null, null, null, 112, null);
    }

    public Address(String str, Integer num, String str2, String str3, String str4) {
        this(str, num, str2, str3, str4, null, null, 96, null);
    }

    public Address(String str, Integer num, String str2, String str3, String str4, String str5) {
        this(str, num, str2, str3, str4, str5, null, 64, null);
    }

    public Address(String str, Integer num, String str2, String str3, String str4, String str5, String str6) {
        this.street = str;
        this.streetNumber = num;
        this.streetNumberSuffix = str2;
        this.postalCode = str3;
        this.city = str4;
        this.countryCode = str5;
        this.region = str6;
    }

    public /* synthetic */ Address(String str, Integer num, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6);
    }
}
