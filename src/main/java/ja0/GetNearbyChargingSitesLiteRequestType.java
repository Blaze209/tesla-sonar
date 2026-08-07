package ja0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ii.x;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: ja0.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001b\u0010\"¨\u0006#"}, d2 = {"Lja0/e;", "", "Lja0/d;", "northwestCorner", "southeastCorner", "userLocation", "", "languageCode", "countryCode", "vin", "Lii/x;", "", "getQueueData", "<init>", "(Lja0/d;Lja0/d;Lja0/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lii/x;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lja0/d;", DateTokenConverter.CONVERTER_KEY, "()Lja0/d;", "b", "e", "c", "f", "Ljava/lang/String;", "g", "Lii/x;", "()Lii/x;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetNearbyChargingSitesLiteRequestType {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnergySvcCoordinateInputType northwestCorner;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnergySvcCoordinateInputType southeastCorner;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnergySvcCoordinateInputType userLocation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String languageCode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryCode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String vin;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final x<Boolean> getQueueData;

    public GetNearbyChargingSitesLiteRequestType(EnergySvcCoordinateInputType northwestCorner, EnergySvcCoordinateInputType southeastCorner, EnergySvcCoordinateInputType userLocation, String languageCode, String countryCode, String vin, x<Boolean> getQueueData) {
        s.k(northwestCorner, "northwestCorner");
        s.k(southeastCorner, "southeastCorner");
        s.k(userLocation, "userLocation");
        s.k(languageCode, "languageCode");
        s.k(countryCode, "countryCode");
        s.k(vin, "vin");
        s.k(getQueueData, "getQueueData");
        this.northwestCorner = northwestCorner;
        this.southeastCorner = southeastCorner;
        this.userLocation = userLocation;
        this.languageCode = languageCode;
        this.countryCode = countryCode;
        this.vin = vin;
        this.getQueueData = getQueueData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final x<Boolean> b() {
        return this.getQueueData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLanguageCode() {
        return this.languageCode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnergySvcCoordinateInputType getNorthwestCorner() {
        return this.northwestCorner;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnergySvcCoordinateInputType getSoutheastCorner() {
        return this.southeastCorner;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetNearbyChargingSitesLiteRequestType)) {
            return false;
        }
        GetNearbyChargingSitesLiteRequestType getNearbyChargingSitesLiteRequestType = (GetNearbyChargingSitesLiteRequestType) other;
        return s.f(this.northwestCorner, getNearbyChargingSitesLiteRequestType.northwestCorner) && s.f(this.southeastCorner, getNearbyChargingSitesLiteRequestType.southeastCorner) && s.f(this.userLocation, getNearbyChargingSitesLiteRequestType.userLocation) && s.f(this.languageCode, getNearbyChargingSitesLiteRequestType.languageCode) && s.f(this.countryCode, getNearbyChargingSitesLiteRequestType.countryCode) && s.f(this.vin, getNearbyChargingSitesLiteRequestType.vin) && s.f(this.getQueueData, getNearbyChargingSitesLiteRequestType.getQueueData);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnergySvcCoordinateInputType getUserLocation() {
        return this.userLocation;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getVin() {
        return this.vin;
    }

    public int hashCode() {
        return (((((((((((this.northwestCorner.hashCode() * 31) + this.southeastCorner.hashCode()) * 31) + this.userLocation.hashCode()) * 31) + this.languageCode.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.vin.hashCode()) * 31) + this.getQueueData.hashCode();
    }

    public String toString() {
        return "GetNearbyChargingSitesLiteRequestType(northwestCorner=" + this.northwestCorner + ", southeastCorner=" + this.southeastCorner + ", userLocation=" + this.userLocation + ", languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ", vin=" + this.vin + ", getQueueData=" + this.getQueueData + ")";
    }

    public /* synthetic */ GetNearbyChargingSitesLiteRequestType(EnergySvcCoordinateInputType energySvcCoordinateInputType, EnergySvcCoordinateInputType energySvcCoordinateInputType2, EnergySvcCoordinateInputType energySvcCoordinateInputType3, String str, String str2, String str3, x xVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(energySvcCoordinateInputType, energySvcCoordinateInputType2, energySvcCoordinateInputType3, str, str2, str3, (i11 & 64) != 0 ? x.a.f78171b : xVar);
    }
}
