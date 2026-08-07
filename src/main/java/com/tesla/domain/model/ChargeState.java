package com.tesla.domain.model;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0005HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001a\u0010\u0016R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0011¨\u0006-"}, d2 = {"Lcom/tesla/domain/model/ChargeState;", "", "chargingState", "", "batteryLevel", "", "timeToFullCharge", "", "usableBatteryLevel", "idealBatteryRange", "batteryRange", "chargePortDoorOpen", "", "chargePortLatch", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;)V", "getChargingState", "()Ljava/lang/String;", "getBatteryLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTimeToFullCharge", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getUsableBatteryLevel", "getIdealBatteryRange", "getBatteryRange", "getChargePortDoorOpen", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getChargePortLatch", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/tesla/domain/model/ChargeState;", "equals", "other", "hashCode", "toString", "domain_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChargeState {

    @g(name = "battery_level")
    private final Integer batteryLevel;

    @g(name = "battery_range")
    private final Double batteryRange;

    @g(name = "charge_port_door_open")
    private final Boolean chargePortDoorOpen;

    @g(name = "charge_port_latch")
    private final String chargePortLatch;

    @g(name = "charging_state")
    private final String chargingState;

    @g(name = "ideal_battery_range")
    private final Double idealBatteryRange;

    @g(name = "time_to_full_charge")
    private final Double timeToFullCharge;

    @g(name = "usable_battery_level")
    private final Double usableBatteryLevel;

    public ChargeState(String str, Integer num, Double d11, Double d12, Double d13, Double d14, Boolean bool, String str2) {
        this.chargingState = str;
        this.batteryLevel = num;
        this.timeToFullCharge = d11;
        this.usableBatteryLevel = d12;
        this.idealBatteryRange = d13;
        this.batteryRange = d14;
        this.chargePortDoorOpen = bool;
        this.chargePortLatch = str2;
    }

    public static /* synthetic */ ChargeState copy$default(ChargeState chargeState, String str, Integer num, Double d11, Double d12, Double d13, Double d14, Boolean bool, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = chargeState.chargingState;
        }
        if ((i11 & 2) != 0) {
            num = chargeState.batteryLevel;
        }
        if ((i11 & 4) != 0) {
            d11 = chargeState.timeToFullCharge;
        }
        if ((i11 & 8) != 0) {
            d12 = chargeState.usableBatteryLevel;
        }
        if ((i11 & 16) != 0) {
            d13 = chargeState.idealBatteryRange;
        }
        if ((i11 & 32) != 0) {
            d14 = chargeState.batteryRange;
        }
        if ((i11 & 64) != 0) {
            bool = chargeState.chargePortDoorOpen;
        }
        if ((i11 & 128) != 0) {
            str2 = chargeState.chargePortLatch;
        }
        Boolean bool2 = bool;
        String str3 = str2;
        Double d15 = d13;
        Double d16 = d14;
        return chargeState.copy(str, num, d11, d12, d15, d16, bool2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChargingState() {
        return this.chargingState;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getBatteryLevel() {
        return this.batteryLevel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getTimeToFullCharge() {
        return this.timeToFullCharge;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getUsableBatteryLevel() {
        return this.usableBatteryLevel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getIdealBatteryRange() {
        return this.idealBatteryRange;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getBatteryRange() {
        return this.batteryRange;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getChargePortDoorOpen() {
        return this.chargePortDoorOpen;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getChargePortLatch() {
        return this.chargePortLatch;
    }

    public final ChargeState copy(String chargingState, Integer batteryLevel, Double timeToFullCharge, Double usableBatteryLevel, Double idealBatteryRange, Double batteryRange, Boolean chargePortDoorOpen, String chargePortLatch) {
        return new ChargeState(chargingState, batteryLevel, timeToFullCharge, usableBatteryLevel, idealBatteryRange, batteryRange, chargePortDoorOpen, chargePortLatch);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChargeState)) {
            return false;
        }
        ChargeState chargeState = (ChargeState) other;
        return s.f(this.chargingState, chargeState.chargingState) && s.f(this.batteryLevel, chargeState.batteryLevel) && s.f(this.timeToFullCharge, chargeState.timeToFullCharge) && s.f(this.usableBatteryLevel, chargeState.usableBatteryLevel) && s.f(this.idealBatteryRange, chargeState.idealBatteryRange) && s.f(this.batteryRange, chargeState.batteryRange) && s.f(this.chargePortDoorOpen, chargeState.chargePortDoorOpen) && s.f(this.chargePortLatch, chargeState.chargePortLatch);
    }

    public final Integer getBatteryLevel() {
        return this.batteryLevel;
    }

    public final Double getBatteryRange() {
        return this.batteryRange;
    }

    public final Boolean getChargePortDoorOpen() {
        return this.chargePortDoorOpen;
    }

    public final String getChargePortLatch() {
        return this.chargePortLatch;
    }

    public final String getChargingState() {
        return this.chargingState;
    }

    public final Double getIdealBatteryRange() {
        return this.idealBatteryRange;
    }

    public final Double getTimeToFullCharge() {
        return this.timeToFullCharge;
    }

    public final Double getUsableBatteryLevel() {
        return this.usableBatteryLevel;
    }

    public int hashCode() {
        String str = this.chargingState;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.batteryLevel;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d11 = this.timeToFullCharge;
        int iHashCode3 = (iHashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.usableBatteryLevel;
        int iHashCode4 = (iHashCode3 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.idealBatteryRange;
        int iHashCode5 = (iHashCode4 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.batteryRange;
        int iHashCode6 = (iHashCode5 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Boolean bool = this.chargePortDoorOpen;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.chargePortLatch;
        return iHashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ChargeState(chargingState=" + this.chargingState + ", batteryLevel=" + this.batteryLevel + ", timeToFullCharge=" + this.timeToFullCharge + ", usableBatteryLevel=" + this.usableBatteryLevel + ", idealBatteryRange=" + this.idealBatteryRange + ", batteryRange=" + this.batteryRange + ", chargePortDoorOpen=" + this.chargePortDoorOpen + ", chargePortLatch=" + this.chargePortLatch + ")";
    }
}
