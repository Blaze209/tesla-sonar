package com.tesla.domain.model;

import androidx.annotation.Keep;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003Jz\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\nHÖ\u0001J\t\u0010-\u001a\u00020\fHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u0011R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u0011R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001c¨\u0006."}, d2 = {"Lcom/tesla/domain/model/DriveState;", "", "correctedLatitude", "", "correctedLongitude", OrcaKeys.LATITUDE, OrcaKeys.LONGITUDE, "nativeLatitude", "nativeLongitude", "nativeLocationSupported", "", "nativeType", "", "shiftState", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getCorrectedLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCorrectedLongitude", "getLatitude", "getLongitude", "getNativeLatitude", "getNativeLongitude", "getNativeLocationSupported", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNativeType", "()Ljava/lang/String;", "getShiftState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/tesla/domain/model/DriveState;", "equals", "", "other", "hashCode", "toString", "domain_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DriveState {

    @g(name = "corrected_latitude")
    private final Double correctedLatitude;

    @g(name = "corrected_longitude")
    private final Double correctedLongitude;

    @g(name = OrcaKeys.LATITUDE)
    private final Double latitude;

    @g(name = OrcaKeys.LONGITUDE)
    private final Double longitude;

    @g(name = "native_latitude")
    private final Double nativeLatitude;

    @g(name = "native_location_supported")
    private final Integer nativeLocationSupported;

    @g(name = "native_longitude")
    private final Double nativeLongitude;

    @g(name = "native_type")
    private final String nativeType;

    @g(name = "shift_state")
    private final String shiftState;

    public DriveState(Double d11, Double d12, Double d13, Double d14, Double d15, Double d16, Integer num, String str, String str2) {
        this.correctedLatitude = d11;
        this.correctedLongitude = d12;
        this.latitude = d13;
        this.longitude = d14;
        this.nativeLatitude = d15;
        this.nativeLongitude = d16;
        this.nativeLocationSupported = num;
        this.nativeType = str;
        this.shiftState = str2;
    }

    public static /* synthetic */ DriveState copy$default(DriveState driveState, Double d11, Double d12, Double d13, Double d14, Double d15, Double d16, Integer num, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = driveState.correctedLatitude;
        }
        if ((i11 & 2) != 0) {
            d12 = driveState.correctedLongitude;
        }
        if ((i11 & 4) != 0) {
            d13 = driveState.latitude;
        }
        if ((i11 & 8) != 0) {
            d14 = driveState.longitude;
        }
        if ((i11 & 16) != 0) {
            d15 = driveState.nativeLatitude;
        }
        if ((i11 & 32) != 0) {
            d16 = driveState.nativeLongitude;
        }
        if ((i11 & 64) != 0) {
            num = driveState.nativeLocationSupported;
        }
        if ((i11 & 128) != 0) {
            str = driveState.nativeType;
        }
        if ((i11 & 256) != 0) {
            str2 = driveState.shiftState;
        }
        String str3 = str;
        String str4 = str2;
        Double d17 = d16;
        Integer num2 = num;
        Double d18 = d15;
        Double d19 = d13;
        return driveState.copy(d11, d12, d19, d14, d18, d17, num2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getCorrectedLatitude() {
        return this.correctedLatitude;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getCorrectedLongitude() {
        return this.correctedLongitude;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getNativeLatitude() {
        return this.nativeLatitude;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getNativeLongitude() {
        return this.nativeLongitude;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getNativeLocationSupported() {
        return this.nativeLocationSupported;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getNativeType() {
        return this.nativeType;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getShiftState() {
        return this.shiftState;
    }

    public final DriveState copy(Double correctedLatitude, Double correctedLongitude, Double latitude, Double longitude, Double nativeLatitude, Double nativeLongitude, Integer nativeLocationSupported, String nativeType, String shiftState) {
        return new DriveState(correctedLatitude, correctedLongitude, latitude, longitude, nativeLatitude, nativeLongitude, nativeLocationSupported, nativeType, shiftState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DriveState)) {
            return false;
        }
        DriveState driveState = (DriveState) other;
        return s.f(this.correctedLatitude, driveState.correctedLatitude) && s.f(this.correctedLongitude, driveState.correctedLongitude) && s.f(this.latitude, driveState.latitude) && s.f(this.longitude, driveState.longitude) && s.f(this.nativeLatitude, driveState.nativeLatitude) && s.f(this.nativeLongitude, driveState.nativeLongitude) && s.f(this.nativeLocationSupported, driveState.nativeLocationSupported) && s.f(this.nativeType, driveState.nativeType) && s.f(this.shiftState, driveState.shiftState);
    }

    public final Double getCorrectedLatitude() {
        return this.correctedLatitude;
    }

    public final Double getCorrectedLongitude() {
        return this.correctedLongitude;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final Double getNativeLatitude() {
        return this.nativeLatitude;
    }

    public final Integer getNativeLocationSupported() {
        return this.nativeLocationSupported;
    }

    public final Double getNativeLongitude() {
        return this.nativeLongitude;
    }

    public final String getNativeType() {
        return this.nativeType;
    }

    public final String getShiftState() {
        return this.shiftState;
    }

    public int hashCode() {
        Double d11 = this.correctedLatitude;
        int iHashCode = (d11 == null ? 0 : d11.hashCode()) * 31;
        Double d12 = this.correctedLongitude;
        int iHashCode2 = (iHashCode + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.latitude;
        int iHashCode3 = (iHashCode2 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.longitude;
        int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.nativeLatitude;
        int iHashCode5 = (iHashCode4 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.nativeLongitude;
        int iHashCode6 = (iHashCode5 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Integer num = this.nativeLocationSupported;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.nativeType;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.shiftState;
        return iHashCode8 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DriveState(correctedLatitude=" + this.correctedLatitude + ", correctedLongitude=" + this.correctedLongitude + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", nativeLatitude=" + this.nativeLatitude + ", nativeLongitude=" + this.nativeLongitude + ", nativeLocationSupported=" + this.nativeLocationSupported + ", nativeType=" + this.nativeType + ", shiftState=" + this.shiftState + ")";
    }
}
