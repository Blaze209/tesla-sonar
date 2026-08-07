package com.fourthline.core;

import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.core.location.Coordinate;
import com.fourthline.core.location.LocationProviderKt;
import com.plaid.internal.EnumC4419g;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B]\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0010\u0010\u001e\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0011Jd\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\u0016J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010)\u001a\u0004\b*\u0010\u0016\"\u0004\b+\u0010,R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u00101R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b3\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b5\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b6\u0010)\u001a\u0004\b7\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b8\u0010)\u001a\u0004\b9\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b:\u0010)\u001a\u0004\b;\u0010\u0016R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\u0011¨\u0006?"}, d2 = {"Lcom/fourthline/core/DeviceMetadata;", "Lcom/fourthline/core/Validatable;", "Lcom/fourthline/core/DeviceMetaDataValidationError;", "", "ipAddress", "Lcom/fourthline/core/location/Coordinate;", "location", "language", "region", "model", "osVersion", "sdkVersion", "", "osCompromised", "<init>", "(Ljava/lang/String;Lcom/fourthline/core/location/Coordinate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "a", "()Z", "", "validate", "()Ljava/util/List;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/fourthline/core/location/Coordinate;", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Lcom/fourthline/core/location/Coordinate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/fourthline/core/DeviceMetadata;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIpAddress", "setIpAddress", "(Ljava/lang/String;)V", "b", "Lcom/fourthline/core/location/Coordinate;", "getLocation", "setLocation", "(Lcom/fourthline/core/location/Coordinate;)V", "c", "getLanguage", DateTokenConverter.CONVERTER_KEY, "getRegion", "e", "getModel", "f", "getOsVersion", "g", "getSdkVersion", "h", "Z", "getOsCompromised", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceMetadata implements Validatable<DeviceMetaDataValidationError> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private String ipAddress;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private Coordinate location;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String language;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String region;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String model;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String osVersion;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sdkVersion;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean osCompromised;

    public DeviceMetadata() {
        this(null, null, null, null, null, null, null, false, 255, null);
    }

    private final boolean a() {
        Coordinate coordinate = this.location;
        if (coordinate == null) {
            return false;
        }
        if (coordinate == LocationProviderKt.getNotProvidedCoordinate()) {
            return true;
        }
        double latitude = coordinate.getLatitude();
        if (-90.0d > latitude || latitude > 90.0d) {
            return false;
        }
        double longitude = coordinate.getLongitude();
        return -180.0d <= longitude && longitude <= 180.0d;
    }

    public static /* synthetic */ DeviceMetadata copy$default(DeviceMetadata deviceMetadata, String str, Coordinate coordinate, String str2, String str3, String str4, String str5, String str6, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = deviceMetadata.ipAddress;
        }
        if ((i11 & 2) != 0) {
            coordinate = deviceMetadata.location;
        }
        if ((i11 & 4) != 0) {
            str2 = deviceMetadata.language;
        }
        if ((i11 & 8) != 0) {
            str3 = deviceMetadata.region;
        }
        if ((i11 & 16) != 0) {
            str4 = deviceMetadata.model;
        }
        if ((i11 & 32) != 0) {
            str5 = deviceMetadata.osVersion;
        }
        if ((i11 & 64) != 0) {
            str6 = deviceMetadata.sdkVersion;
        }
        if ((i11 & 128) != 0) {
            z11 = deviceMetadata.osCompromised;
        }
        String str7 = str6;
        boolean z12 = z11;
        String str8 = str4;
        String str9 = str5;
        return deviceMetadata.copy(str, coordinate, str2, str3, str8, str9, str7, z12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIpAddress() {
        return this.ipAddress;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Coordinate getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getOsCompromised() {
        return this.osCompromised;
    }

    public final DeviceMetadata copy(String ipAddress, Coordinate location, String language, String region, String model, String osVersion, String sdkVersion, boolean osCompromised) {
        s.k(language, "language");
        s.k(region, "region");
        s.k(model, "model");
        s.k(osVersion, "osVersion");
        s.k(sdkVersion, "sdkVersion");
        return new DeviceMetadata(ipAddress, location, language, region, model, osVersion, sdkVersion, osCompromised);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceMetadata)) {
            return false;
        }
        DeviceMetadata deviceMetadata = (DeviceMetadata) other;
        return s.f(this.ipAddress, deviceMetadata.ipAddress) && s.f(this.location, deviceMetadata.location) && s.f(this.language, deviceMetadata.language) && s.f(this.region, deviceMetadata.region) && s.f(this.model, deviceMetadata.model) && s.f(this.osVersion, deviceMetadata.osVersion) && s.f(this.sdkVersion, deviceMetadata.sdkVersion) && this.osCompromised == deviceMetadata.osCompromised;
    }

    public final String getIpAddress() {
        return this.ipAddress;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Coordinate getLocation() {
        return this.location;
    }

    public final String getModel() {
        return this.model;
    }

    public final boolean getOsCompromised() {
        return this.osCompromised;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public int hashCode() {
        String str = this.ipAddress;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Coordinate coordinate = this.location;
        return ((((((((((((iHashCode + (coordinate != null ? coordinate.hashCode() : 0)) * 31) + this.language.hashCode()) * 31) + this.region.hashCode()) * 31) + this.model.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.sdkVersion.hashCode()) * 31) + Boolean.hashCode(this.osCompromised);
    }

    public final void setIpAddress(String str) {
        this.ipAddress = str;
    }

    public final void setLocation(Coordinate coordinate) {
        this.location = coordinate;
    }

    public String toString() {
        return "DeviceMetadata(ipAddress=" + this.ipAddress + ", location=" + this.location + ", language=" + this.language + ", region=" + this.region + ", model=" + this.model + ", osVersion=" + this.osVersion + ", sdkVersion=" + this.sdkVersion + ", osCompromised=" + this.osCompromised + ")";
    }

    @Override // com.fourthline.core.Validatable
    public List<DeviceMetaDataValidationError> validate() {
        return a() ? v.m() : v.e(DeviceMetaDataValidationError.INVALID_LOCATION);
    }

    public DeviceMetadata(String str) {
        this(str, null, null, null, null, null, null, false, EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
    }

    public DeviceMetadata(String str, Coordinate coordinate) {
        this(str, coordinate, null, null, null, null, null, false, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceMetadata(String str, Coordinate coordinate, String language) {
        this(str, coordinate, language, null, null, null, null, false, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        s.k(language, "language");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceMetadata(String str, Coordinate coordinate, String language, String region) {
        this(str, coordinate, language, region, null, null, null, false, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
        s.k(language, "language");
        s.k(region, "region");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceMetadata(String str, Coordinate coordinate, String language, String region, String model) {
        this(str, coordinate, language, region, model, null, null, false, 224, null);
        s.k(language, "language");
        s.k(region, "region");
        s.k(model, "model");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceMetadata(String str, Coordinate coordinate, String language, String region, String model, String osVersion) {
        this(str, coordinate, language, region, model, osVersion, null, false, 192, null);
        s.k(language, "language");
        s.k(region, "region");
        s.k(model, "model");
        s.k(osVersion, "osVersion");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceMetadata(String str, Coordinate coordinate, String language, String region, String model, String osVersion, String sdkVersion) {
        this(str, coordinate, language, region, model, osVersion, sdkVersion, false, 128, null);
        s.k(language, "language");
        s.k(region, "region");
        s.k(model, "model");
        s.k(osVersion, "osVersion");
        s.k(sdkVersion, "sdkVersion");
    }

    public DeviceMetadata(String str, Coordinate coordinate, String language, String region, String model, String osVersion, String sdkVersion, boolean z11) {
        s.k(language, "language");
        s.k(region, "region");
        s.k(model, "model");
        s.k(osVersion, "osVersion");
        s.k(sdkVersion, "sdkVersion");
        this.ipAddress = str;
        this.location = coordinate;
        this.language = language;
        this.region = region;
        this.model = model;
        this.osVersion = osVersion;
        this.sdkVersion = sdkVersion;
        this.osCompromised = z11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DeviceMetadata(String str, Coordinate coordinate, String str2, String str3, String str4, String str5, String str6, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i11 & 1) != 0 ? null : str;
        coordinate = (i11 & 2) != 0 ? null : coordinate;
        str2 = (i11 & 4) != 0 ? DeviceMetadataKt.d() : str2;
        str3 = (i11 & 8) != 0 ? DeviceMetadataKt.a("") : str3;
        if ((i11 & 16) != 0) {
            str4 = Build.MANUFACTURER + " " + Build.MODEL;
        }
        if ((i11 & 32) != 0) {
            str5 = "Android " + Build.VERSION.RELEASE + " (" + Build.VERSION.SDK_INT + ") - Latest patch: " + Build.VERSION.SECURITY_PATCH;
        }
        this(str, coordinate, str2, str3, str4, str5, (i11 & 64) != 0 ? "Android 3.2.22" : str6, (i11 & 128) != 0 ? DeviceMetadataKt.isDeviceRooted() : z11);
    }
}
