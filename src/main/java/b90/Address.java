package b90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: b90.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJd\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u001aR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u001aR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u001aR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0017\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u001aR$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0017\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u001aR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u001aR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0017\u001a\u0004\b&\u0010\u000f\"\u0004\b'\u0010\u001a¨\u0006("}, d2 = {"Lb90/a;", "", "", PlaceTypes.LOCALITY, PlaceTypes.COUNTRY, "addressLine1", "addressLine2", "administrativeArea", "dependentLocality", "postalCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lb90/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "h", "o", "(Ljava/lang/String;)V", "b", "f", "m", "c", "j", DateTokenConverter.CONVERTER_KEY, "k", "e", "l", "g", "n", IntegerTokenConverter.CONVERTER_KEY, "p", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Address {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private String locality;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String country;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String addressLine1;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private String addressLine2;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private String administrativeArea;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private String dependentLocality;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private String postalCode;

    public Address(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.locality = str;
        this.country = str2;
        this.addressLine1 = str3;
        this.addressLine2 = str4;
        this.administrativeArea = str5;
        this.dependentLocality = str6;
        this.postalCode = str7;
    }

    public static /* synthetic */ Address b(Address address, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = address.locality;
        }
        if ((i11 & 2) != 0) {
            str2 = address.country;
        }
        if ((i11 & 4) != 0) {
            str3 = address.addressLine1;
        }
        if ((i11 & 8) != 0) {
            str4 = address.addressLine2;
        }
        if ((i11 & 16) != 0) {
            str5 = address.administrativeArea;
        }
        if ((i11 & 32) != 0) {
            str6 = address.dependentLocality;
        }
        if ((i11 & 64) != 0) {
            str7 = address.postalCode;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return address.a(str, str2, str11, str4, str10, str8, str9);
    }

    public final Address a(String locality, String country, String addressLine1, String addressLine2, String administrativeArea, String dependentLocality, String postalCode) {
        return new Address(locality, country, addressLine1, addressLine2, administrativeArea, dependentLocality, postalCode);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAddressLine1() {
        return this.addressLine1;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAddressLine2() {
        return this.addressLine2;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getAdministrativeArea() {
        return this.administrativeArea;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Address)) {
            return false;
        }
        Address address = (Address) other;
        return s.f(this.locality, address.locality) && s.f(this.country, address.country) && s.f(this.addressLine1, address.addressLine1) && s.f(this.addressLine2, address.addressLine2) && s.f(this.administrativeArea, address.administrativeArea) && s.f(this.dependentLocality, address.dependentLocality) && s.f(this.postalCode, address.postalCode);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDependentLocality() {
        return this.dependentLocality;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getLocality() {
        return this.locality;
    }

    public int hashCode() {
        String str = this.locality;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.country;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.addressLine1;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.addressLine2;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.administrativeArea;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.dependentLocality;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.postalCode;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    public final void j(String str) {
        this.addressLine1 = str;
    }

    public final void k(String str) {
        this.addressLine2 = str;
    }

    public final void l(String str) {
        this.administrativeArea = str;
    }

    public final void m(String str) {
        this.country = str;
    }

    public final void n(String str) {
        this.dependentLocality = str;
    }

    public final void o(String str) {
        this.locality = str;
    }

    public final void p(String str) {
        this.postalCode = str;
    }

    public String toString() {
        return "Address(locality=" + this.locality + ", country=" + this.country + ", addressLine1=" + this.addressLine1 + ", addressLine2=" + this.addressLine2 + ", administrativeArea=" + this.administrativeArea + ", dependentLocality=" + this.dependentLocality + ", postalCode=" + this.postalCode + ")";
    }

    public /* synthetic */ Address(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7);
    }
}
