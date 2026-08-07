package com.tesla.domain.model;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import expo.modules.contacts.Columns;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u00107\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0011\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u00102J¬\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020\u00192\b\u0010D\u001a\u0004\u0018\u00010EHÖ\u0003J\t\u0010F\u001a\u00020\u0006HÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00103\u001a\u0004\b\u0018\u00102¨\u0006H"}, d2 = {"Lcom/tesla/domain/model/Vehicle;", "Lcom/tesla/domain/model/Product;", "vin", "", "id", "apiVersion", "", "config", "Lcom/tesla/domain/model/VehicleConfig;", "snapshotConfigHash", "displayName", "chargeState", "Lcom/tesla/domain/model/ChargeState;", "vehicleState", "Lcom/tesla/domain/model/VehicleState;", "guiSettings", "Lcom/tesla/domain/model/GuiSettings;", "driveState", "Lcom/tesla/domain/model/DriveState;", "climateState", "Lcom/tesla/domain/model/ClimateState;", "reverseGeocodedObject", "", "Lcom/tesla/domain/model/ReverseGeocodedObject;", "isPreDelivery", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/tesla/domain/model/VehicleConfig;Ljava/lang/String;Ljava/lang/String;Lcom/tesla/domain/model/ChargeState;Lcom/tesla/domain/model/VehicleState;Lcom/tesla/domain/model/GuiSettings;Lcom/tesla/domain/model/DriveState;Lcom/tesla/domain/model/ClimateState;Ljava/util/List;Ljava/lang/Boolean;)V", "getVin", "()Ljava/lang/String;", "getId", "getApiVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getConfig", "()Lcom/tesla/domain/model/VehicleConfig;", "getSnapshotConfigHash", "getDisplayName", "getChargeState", "()Lcom/tesla/domain/model/ChargeState;", "getVehicleState", "()Lcom/tesla/domain/model/VehicleState;", "getGuiSettings", "()Lcom/tesla/domain/model/GuiSettings;", "getDriveState", "()Lcom/tesla/domain/model/DriveState;", "getClimateState", "()Lcom/tesla/domain/model/ClimateState;", "getReverseGeocodedObject", "()Ljava/util/List;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/tesla/domain/model/VehicleConfig;Ljava/lang/String;Ljava/lang/String;Lcom/tesla/domain/model/ChargeState;Lcom/tesla/domain/model/VehicleState;Lcom/tesla/domain/model/GuiSettings;Lcom/tesla/domain/model/DriveState;Lcom/tesla/domain/model/ClimateState;Ljava/util/List;Ljava/lang/Boolean;)Lcom/tesla/domain/model/Vehicle;", "equals", "other", "", "hashCode", "toString", "domain_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Vehicle extends Product {

    @g(name = "api_version")
    private final Integer apiVersion;

    @g(name = "charge_state")
    private final ChargeState chargeState;

    @g(name = "climate_state")
    private final ClimateState climateState;

    @g(name = "vehicle_config")
    private final VehicleConfig config;

    @g(name = Columns.DISPLAY_NAME)
    private final String displayName;

    @g(name = "drive_state")
    private final DriveState driveState;

    @g(name = "gui_settings")
    private final GuiSettings guiSettings;

    @g(name = "id")
    private final String id;

    @g(name = "is_predelivery")
    private final Boolean isPreDelivery;

    @g(name = "reverse_geocoded_object")
    private final List<ReverseGeocodedObject> reverseGeocodedObject;

    @g(name = "snapshotConfigHash")
    private final String snapshotConfigHash;

    @g(name = "vehicle_state")
    private final VehicleState vehicleState;

    @g(name = "vin")
    private final String vin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vehicle(String vin, String id2, Integer num, VehicleConfig vehicleConfig, String str, String str2, ChargeState chargeState, VehicleState vehicleState, GuiSettings guiSettings, DriveState driveState, ClimateState climateState, List<ReverseGeocodedObject> list, Boolean bool) {
        super("VEHICLE", null);
        s.k(vin, "vin");
        s.k(id2, "id");
        this.vin = vin;
        this.id = id2;
        this.apiVersion = num;
        this.config = vehicleConfig;
        this.snapshotConfigHash = str;
        this.displayName = str2;
        this.chargeState = chargeState;
        this.vehicleState = vehicleState;
        this.guiSettings = guiSettings;
        this.driveState = driveState;
        this.climateState = climateState;
        this.reverseGeocodedObject = list;
        this.isPreDelivery = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Vehicle copy$default(Vehicle vehicle, String str, String str2, Integer num, VehicleConfig vehicleConfig, String str3, String str4, ChargeState chargeState, VehicleState vehicleState, GuiSettings guiSettings, DriveState driveState, ClimateState climateState, List list, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = vehicle.vin;
        }
        return vehicle.copy(str, (i11 & 2) != 0 ? vehicle.id : str2, (i11 & 4) != 0 ? vehicle.apiVersion : num, (i11 & 8) != 0 ? vehicle.config : vehicleConfig, (i11 & 16) != 0 ? vehicle.snapshotConfigHash : str3, (i11 & 32) != 0 ? vehicle.displayName : str4, (i11 & 64) != 0 ? vehicle.chargeState : chargeState, (i11 & 128) != 0 ? vehicle.vehicleState : vehicleState, (i11 & 256) != 0 ? vehicle.guiSettings : guiSettings, (i11 & 512) != 0 ? vehicle.driveState : driveState, (i11 & 1024) != 0 ? vehicle.climateState : climateState, (i11 & 2048) != 0 ? vehicle.reverseGeocodedObject : list, (i11 & 4096) != 0 ? vehicle.isPreDelivery : bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVin() {
        return this.vin;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final DriveState getDriveState() {
        return this.driveState;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final ClimateState getClimateState() {
        return this.climateState;
    }

    public final List<ReverseGeocodedObject> component12() {
        return this.reverseGeocodedObject;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getIsPreDelivery() {
        return this.isPreDelivery;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getApiVersion() {
        return this.apiVersion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final VehicleConfig getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSnapshotConfigHash() {
        return this.snapshotConfigHash;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ChargeState getChargeState() {
        return this.chargeState;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final VehicleState getVehicleState() {
        return this.vehicleState;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final GuiSettings getGuiSettings() {
        return this.guiSettings;
    }

    public final Vehicle copy(String vin, String id2, Integer apiVersion, VehicleConfig config, String snapshotConfigHash, String displayName, ChargeState chargeState, VehicleState vehicleState, GuiSettings guiSettings, DriveState driveState, ClimateState climateState, List<ReverseGeocodedObject> reverseGeocodedObject, Boolean isPreDelivery) {
        s.k(vin, "vin");
        s.k(id2, "id");
        return new Vehicle(vin, id2, apiVersion, config, snapshotConfigHash, displayName, chargeState, vehicleState, guiSettings, driveState, climateState, reverseGeocodedObject, isPreDelivery);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vehicle)) {
            return false;
        }
        Vehicle vehicle = (Vehicle) other;
        return s.f(this.vin, vehicle.vin) && s.f(this.id, vehicle.id) && s.f(this.apiVersion, vehicle.apiVersion) && s.f(this.config, vehicle.config) && s.f(this.snapshotConfigHash, vehicle.snapshotConfigHash) && s.f(this.displayName, vehicle.displayName) && s.f(this.chargeState, vehicle.chargeState) && s.f(this.vehicleState, vehicle.vehicleState) && s.f(this.guiSettings, vehicle.guiSettings) && s.f(this.driveState, vehicle.driveState) && s.f(this.climateState, vehicle.climateState) && s.f(this.reverseGeocodedObject, vehicle.reverseGeocodedObject) && s.f(this.isPreDelivery, vehicle.isPreDelivery);
    }

    public final Integer getApiVersion() {
        return this.apiVersion;
    }

    public final ChargeState getChargeState() {
        return this.chargeState;
    }

    public final ClimateState getClimateState() {
        return this.climateState;
    }

    public final VehicleConfig getConfig() {
        return this.config;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final DriveState getDriveState() {
        return this.driveState;
    }

    public final GuiSettings getGuiSettings() {
        return this.guiSettings;
    }

    public final String getId() {
        return this.id;
    }

    public final List<ReverseGeocodedObject> getReverseGeocodedObject() {
        return this.reverseGeocodedObject;
    }

    public final String getSnapshotConfigHash() {
        return this.snapshotConfigHash;
    }

    public final VehicleState getVehicleState() {
        return this.vehicleState;
    }

    public final String getVin() {
        return this.vin;
    }

    public int hashCode() {
        int iHashCode = ((this.vin.hashCode() * 31) + this.id.hashCode()) * 31;
        Integer num = this.apiVersion;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        VehicleConfig vehicleConfig = this.config;
        int iHashCode3 = (iHashCode2 + (vehicleConfig == null ? 0 : vehicleConfig.hashCode())) * 31;
        String str = this.snapshotConfigHash;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.displayName;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ChargeState chargeState = this.chargeState;
        int iHashCode6 = (iHashCode5 + (chargeState == null ? 0 : chargeState.hashCode())) * 31;
        VehicleState vehicleState = this.vehicleState;
        int iHashCode7 = (iHashCode6 + (vehicleState == null ? 0 : vehicleState.hashCode())) * 31;
        GuiSettings guiSettings = this.guiSettings;
        int iHashCode8 = (iHashCode7 + (guiSettings == null ? 0 : guiSettings.hashCode())) * 31;
        DriveState driveState = this.driveState;
        int iHashCode9 = (iHashCode8 + (driveState == null ? 0 : driveState.hashCode())) * 31;
        ClimateState climateState = this.climateState;
        int iHashCode10 = (iHashCode9 + (climateState == null ? 0 : climateState.hashCode())) * 31;
        List<ReverseGeocodedObject> list = this.reverseGeocodedObject;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isPreDelivery;
        return iHashCode11 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isPreDelivery() {
        return this.isPreDelivery;
    }

    public String toString() {
        return "Vehicle(vin=" + this.vin + ", id=" + this.id + ", apiVersion=" + this.apiVersion + ", config=" + this.config + ", snapshotConfigHash=" + this.snapshotConfigHash + ", displayName=" + this.displayName + ", chargeState=" + this.chargeState + ", vehicleState=" + this.vehicleState + ", guiSettings=" + this.guiSettings + ", driveState=" + this.driveState + ", climateState=" + this.climateState + ", reverseGeocodedObject=" + this.reverseGeocodedObject + ", isPreDelivery=" + this.isPreDelivery + ")";
    }
}
