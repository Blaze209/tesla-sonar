package com.tesla.domain.model;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import com.tesla.domain.model.adapter.ForceToInt;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJV\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u001a\u0010\u000f¨\u0006'"}, d2 = {"Lcom/tesla/domain/model/VehicleConfig;", "", "keyVersion", "", "carType", "", "timestamp", "", "motorizedChargePort", "", "powerLiftGate", "sunRoofInstalled", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getKeyVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCarType", "()Ljava/lang/String;", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMotorizedChargePort", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPowerLiftGate", "getSunRoofInstalled", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/tesla/domain/model/VehicleConfig;", "equals", "other", "hashCode", "toString", "domain_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VehicleConfig {

    @g(name = "car_type")
    private final String carType;

    @g(name = "key_version")
    private final Integer keyVersion;

    @g(name = "motorized_charge_port")
    private final Boolean motorizedChargePort;

    @g(name = "plg")
    private final Boolean powerLiftGate;

    @g(name = "sun_roof_installed")
    private final Integer sunRoofInstalled;

    @g(name = "timestamp")
    private final Long timestamp;

    public VehicleConfig(Integer num, String str, Long l11, Boolean bool, Boolean bool2, @ForceToInt Integer num2) {
        this.keyVersion = num;
        this.carType = str;
        this.timestamp = l11;
        this.motorizedChargePort = bool;
        this.powerLiftGate = bool2;
        this.sunRoofInstalled = num2;
    }

    public static /* synthetic */ VehicleConfig copy$default(VehicleConfig vehicleConfig, Integer num, String str, Long l11, Boolean bool, Boolean bool2, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = vehicleConfig.keyVersion;
        }
        if ((i11 & 2) != 0) {
            str = vehicleConfig.carType;
        }
        if ((i11 & 4) != 0) {
            l11 = vehicleConfig.timestamp;
        }
        if ((i11 & 8) != 0) {
            bool = vehicleConfig.motorizedChargePort;
        }
        if ((i11 & 16) != 0) {
            bool2 = vehicleConfig.powerLiftGate;
        }
        if ((i11 & 32) != 0) {
            num2 = vehicleConfig.sunRoofInstalled;
        }
        Boolean bool3 = bool2;
        Integer num3 = num2;
        return vehicleConfig.copy(num, str, l11, bool, bool3, num3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getKeyVersion() {
        return this.keyVersion;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCarType() {
        return this.carType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getMotorizedChargePort() {
        return this.motorizedChargePort;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getPowerLiftGate() {
        return this.powerLiftGate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getSunRoofInstalled() {
        return this.sunRoofInstalled;
    }

    public final VehicleConfig copy(Integer keyVersion, String carType, Long timestamp, Boolean motorizedChargePort, Boolean powerLiftGate, @ForceToInt Integer sunRoofInstalled) {
        return new VehicleConfig(keyVersion, carType, timestamp, motorizedChargePort, powerLiftGate, sunRoofInstalled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleConfig)) {
            return false;
        }
        VehicleConfig vehicleConfig = (VehicleConfig) other;
        return s.f(this.keyVersion, vehicleConfig.keyVersion) && s.f(this.carType, vehicleConfig.carType) && s.f(this.timestamp, vehicleConfig.timestamp) && s.f(this.motorizedChargePort, vehicleConfig.motorizedChargePort) && s.f(this.powerLiftGate, vehicleConfig.powerLiftGate) && s.f(this.sunRoofInstalled, vehicleConfig.sunRoofInstalled);
    }

    public final String getCarType() {
        return this.carType;
    }

    public final Integer getKeyVersion() {
        return this.keyVersion;
    }

    public final Boolean getMotorizedChargePort() {
        return this.motorizedChargePort;
    }

    public final Boolean getPowerLiftGate() {
        return this.powerLiftGate;
    }

    public final Integer getSunRoofInstalled() {
        return this.sunRoofInstalled;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        Integer num = this.keyVersion;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.carType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.timestamp;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Boolean bool = this.motorizedChargePort;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.powerLiftGate;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.sunRoofInstalled;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "VehicleConfig(keyVersion=" + this.keyVersion + ", carType=" + this.carType + ", timestamp=" + this.timestamp + ", motorizedChargePort=" + this.motorizedChargePort + ", powerLiftGate=" + this.powerLiftGate + ", sunRoofInstalled=" + this.sunRoofInstalled + ")";
    }

    public /* synthetic */ VehicleConfig(Integer num, String str, Long l11, Boolean bool, Boolean bool2, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : num, (i11 & 2) != 0 ? null : str, l11, bool, bool2, num2);
    }
}
