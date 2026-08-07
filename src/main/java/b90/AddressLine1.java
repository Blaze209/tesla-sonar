package b90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: b90.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\u0017R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0018\u0010\u0017R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\u0017R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\u0017R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\u0017¨\u0006\u001f"}, d2 = {"Lb90/c;", "", "", "streetNumber", PlaceTypes.ROUTE, "subLocalityLevel2", "subLocalityLevel3", "subLocalityLevel4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "g", "(Ljava/lang/String;)V", "f", "c", "h", DateTokenConverter.CONVERTER_KEY, IntegerTokenConverter.CONVERTER_KEY, "e", "j", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AddressLine1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private String streetNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String route;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String subLocalityLevel2;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private String subLocalityLevel3;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private String subLocalityLevel4;

    public AddressLine1(String str, String str2, String str3, String str4, String str5) {
        this.streetNumber = str;
        this.route = str2;
        this.subLocalityLevel2 = str3;
        this.subLocalityLevel3 = str4;
        this.subLocalityLevel4 = str5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getStreetNumber() {
        return this.streetNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSubLocalityLevel2() {
        return this.subLocalityLevel2;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSubLocalityLevel3() {
        return this.subLocalityLevel3;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSubLocalityLevel4() {
        return this.subLocalityLevel4;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressLine1)) {
            return false;
        }
        AddressLine1 addressLine1 = (AddressLine1) other;
        return s.f(this.streetNumber, addressLine1.streetNumber) && s.f(this.route, addressLine1.route) && s.f(this.subLocalityLevel2, addressLine1.subLocalityLevel2) && s.f(this.subLocalityLevel3, addressLine1.subLocalityLevel3) && s.f(this.subLocalityLevel4, addressLine1.subLocalityLevel4);
    }

    public final void f(String str) {
        this.route = str;
    }

    public final void g(String str) {
        this.streetNumber = str;
    }

    public final void h(String str) {
        this.subLocalityLevel2 = str;
    }

    public int hashCode() {
        String str = this.streetNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.route;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subLocalityLevel2;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subLocalityLevel3;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subLocalityLevel4;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void i(String str) {
        this.subLocalityLevel3 = str;
    }

    public final void j(String str) {
        this.subLocalityLevel4 = str;
    }

    public String toString() {
        return "AddressLine1(streetNumber=" + this.streetNumber + ", route=" + this.route + ", subLocalityLevel2=" + this.subLocalityLevel2 + ", subLocalityLevel3=" + this.subLocalityLevel3 + ", subLocalityLevel4=" + this.subLocalityLevel4 + ")";
    }

    public /* synthetic */ AddressLine1(String str, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5);
    }
}
