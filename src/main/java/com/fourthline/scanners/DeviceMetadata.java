package com.fourthline.scanners;

import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003Js\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010/\u001a\u00020\r2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00064"}, d2 = {"Lcom/fourthline/scanners/DeviceMetadata;", "", "ipAddress", "", "language", "region", "model", "location", "Lkotlin/Pair;", "", "osVersion", "sdkVersion", "osCompromised", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;Ljava/lang/String;Ljava/lang/String;Z)V", "getIpAddress", "()Ljava/lang/String;", "setIpAddress", "(Ljava/lang/String;)V", "getLanguage", "setLanguage", "getRegion", "setRegion", "getModel", "setModel", "getLocation", "()Lkotlin/Pair;", "setLocation", "(Lkotlin/Pair;)V", "getOsVersion", "setOsVersion", "getSdkVersion", "setSdkVersion", "getOsCompromised", "()Z", "setOsCompromised", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceMetadata {
    private String ipAddress;
    private String language;
    private Pair<Double, Double> location;
    private String model;
    private boolean osCompromised;
    private String osVersion;
    private String region;
    private String sdkVersion;

    public DeviceMetadata() {
        this(null, null, null, null, null, null, null, false, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceMetadata copy$default(DeviceMetadata deviceMetadata, String str, String str2, String str3, String str4, Pair pair, String str5, String str6, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = deviceMetadata.ipAddress;
        }
        if ((i11 & 2) != 0) {
            str2 = deviceMetadata.language;
        }
        if ((i11 & 4) != 0) {
            str3 = deviceMetadata.region;
        }
        if ((i11 & 8) != 0) {
            str4 = deviceMetadata.model;
        }
        if ((i11 & 16) != 0) {
            pair = deviceMetadata.location;
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
        Pair pair2 = pair;
        String str8 = str5;
        return deviceMetadata.copy(str, str2, str3, str4, pair2, str8, str7, z12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIpAddress() {
        return this.ipAddress;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    public final Pair<Double, Double> component5() {
        return this.location;
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

    public final DeviceMetadata copy(String ipAddress, String language, String region, String model, Pair<Double, Double> location, String osVersion, String sdkVersion, boolean osCompromised) {
        return new DeviceMetadata(ipAddress, language, region, model, location, osVersion, sdkVersion, osCompromised);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceMetadata)) {
            return false;
        }
        DeviceMetadata deviceMetadata = (DeviceMetadata) other;
        return s.f(this.ipAddress, deviceMetadata.ipAddress) && s.f(this.language, deviceMetadata.language) && s.f(this.region, deviceMetadata.region) && s.f(this.model, deviceMetadata.model) && s.f(this.location, deviceMetadata.location) && s.f(this.osVersion, deviceMetadata.osVersion) && s.f(this.sdkVersion, deviceMetadata.sdkVersion) && this.osCompromised == deviceMetadata.osCompromised;
    }

    public final String getIpAddress() {
        return this.ipAddress;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Pair<Double, Double> getLocation() {
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
        String str2 = this.language;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.region;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.model;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Pair<Double, Double> pair = this.location;
        int iHashCode5 = (iHashCode4 + (pair == null ? 0 : pair.hashCode())) * 31;
        String str5 = this.osVersion;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sdkVersion;
        return ((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + Boolean.hashCode(this.osCompromised);
    }

    public final void setIpAddress(String str) {
        this.ipAddress = str;
    }

    public final void setLanguage(String str) {
        this.language = str;
    }

    public final void setLocation(Pair<Double, Double> pair) {
        this.location = pair;
    }

    public final void setModel(String str) {
        this.model = str;
    }

    public final void setOsCompromised(boolean z11) {
        this.osCompromised = z11;
    }

    public final void setOsVersion(String str) {
        this.osVersion = str;
    }

    public final void setRegion(String str) {
        this.region = str;
    }

    public final void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public String toString() {
        return "DeviceMetadata(ipAddress=" + this.ipAddress + ", language=" + this.language + ", region=" + this.region + ", model=" + this.model + ", location=" + this.location + ", osVersion=" + this.osVersion + ", sdkVersion=" + this.sdkVersion + ", osCompromised=" + this.osCompromised + ")";
    }

    public DeviceMetadata(String str, String str2, String str3, String str4, Pair<Double, Double> pair, String str5, String str6, boolean z11) {
        this.ipAddress = str;
        this.language = str2;
        this.region = str3;
        this.model = str4;
        this.location = pair;
        this.osVersion = str5;
        this.sdkVersion = str6;
        this.osCompromised = z11;
    }

    public /* synthetic */ DeviceMetadata(String str, String str2, String str3, String str4, Pair pair, String str5, String str6, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : pair, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? false : z11);
    }
}
