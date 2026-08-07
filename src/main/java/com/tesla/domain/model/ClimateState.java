package com.tesla.domain.model;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017JV\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0007HÖ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0002\u0010\u000eR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0004\u0010\u000eR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/tesla/domain/model/ClimateState;", "", "isClimateOn", "", "isPreconditioning", "bioweaponModeOn", "defrostMode", "", "climateKeeperMode", "", "interiorTemperature", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBioweaponModeOn", "getDefrostMode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getClimateKeeperMode", "()Ljava/lang/String;", "getInteriorTemperature", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;)Lcom/tesla/domain/model/ClimateState;", "equals", "other", "hashCode", "toString", "domain_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ClimateState {

    @g(name = "bioweapon_mode")
    private final Boolean bioweaponModeOn;

    @g(name = "climate_keeper_mode")
    private final String climateKeeperMode;

    @g(name = "defrost_mode")
    private final Integer defrostMode;

    @g(name = "inside_temp")
    private final Double interiorTemperature;

    @g(name = "is_climate_on")
    private final Boolean isClimateOn;

    @g(name = "is_preconditioning")
    private final Boolean isPreconditioning;

    public ClimateState(Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, Double d11) {
        this.isClimateOn = bool;
        this.isPreconditioning = bool2;
        this.bioweaponModeOn = bool3;
        this.defrostMode = num;
        this.climateKeeperMode = str;
        this.interiorTemperature = d11;
    }

    public static /* synthetic */ ClimateState copy$default(ClimateState climateState, Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, Double d11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = climateState.isClimateOn;
        }
        if ((i11 & 2) != 0) {
            bool2 = climateState.isPreconditioning;
        }
        if ((i11 & 4) != 0) {
            bool3 = climateState.bioweaponModeOn;
        }
        if ((i11 & 8) != 0) {
            num = climateState.defrostMode;
        }
        if ((i11 & 16) != 0) {
            str = climateState.climateKeeperMode;
        }
        if ((i11 & 32) != 0) {
            d11 = climateState.interiorTemperature;
        }
        String str2 = str;
        Double d12 = d11;
        return climateState.copy(bool, bool2, bool3, num, str2, d12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsClimateOn() {
        return this.isClimateOn;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsPreconditioning() {
        return this.isPreconditioning;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getBioweaponModeOn() {
        return this.bioweaponModeOn;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getDefrostMode() {
        return this.defrostMode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getClimateKeeperMode() {
        return this.climateKeeperMode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getInteriorTemperature() {
        return this.interiorTemperature;
    }

    public final ClimateState copy(Boolean isClimateOn, Boolean isPreconditioning, Boolean bioweaponModeOn, Integer defrostMode, String climateKeeperMode, Double interiorTemperature) {
        return new ClimateState(isClimateOn, isPreconditioning, bioweaponModeOn, defrostMode, climateKeeperMode, interiorTemperature);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClimateState)) {
            return false;
        }
        ClimateState climateState = (ClimateState) other;
        return s.f(this.isClimateOn, climateState.isClimateOn) && s.f(this.isPreconditioning, climateState.isPreconditioning) && s.f(this.bioweaponModeOn, climateState.bioweaponModeOn) && s.f(this.defrostMode, climateState.defrostMode) && s.f(this.climateKeeperMode, climateState.climateKeeperMode) && s.f(this.interiorTemperature, climateState.interiorTemperature);
    }

    public final Boolean getBioweaponModeOn() {
        return this.bioweaponModeOn;
    }

    public final String getClimateKeeperMode() {
        return this.climateKeeperMode;
    }

    public final Integer getDefrostMode() {
        return this.defrostMode;
    }

    public final Double getInteriorTemperature() {
        return this.interiorTemperature;
    }

    public int hashCode() {
        Boolean bool = this.isClimateOn;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isPreconditioning;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.bioweaponModeOn;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.defrostMode;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.climateKeeperMode;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Double d11 = this.interiorTemperature;
        return iHashCode5 + (d11 != null ? d11.hashCode() : 0);
    }

    public final Boolean isClimateOn() {
        return this.isClimateOn;
    }

    public final Boolean isPreconditioning() {
        return this.isPreconditioning;
    }

    public String toString() {
        return "ClimateState(isClimateOn=" + this.isClimateOn + ", isPreconditioning=" + this.isPreconditioning + ", bioweaponModeOn=" + this.bioweaponModeOn + ", defrostMode=" + this.defrostMode + ", climateKeeperMode=" + this.climateKeeperMode + ", interiorTemperature=" + this.interiorTemperature + ")";
    }
}
