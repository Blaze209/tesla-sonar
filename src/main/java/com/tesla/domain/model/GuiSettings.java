package com.tesla.domain.model;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/tesla/domain/model/GuiSettings;", "", "chargeRateUnit", "", "rangeDisplay", "distanceUnit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChargeRateUnit", "()Ljava/lang/String;", "getRangeDisplay", "getDistanceUnit", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GuiSettings {

    @g(name = "gui_charge_rate_units")
    private final String chargeRateUnit;

    @g(name = "gui_distance_units")
    private final String distanceUnit;

    @g(name = "gui_range_display")
    private final String rangeDisplay;

    public GuiSettings(String str, String str2, String str3) {
        this.chargeRateUnit = str;
        this.rangeDisplay = str2;
        this.distanceUnit = str3;
    }

    public static /* synthetic */ GuiSettings copy$default(GuiSettings guiSettings, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = guiSettings.chargeRateUnit;
        }
        if ((i11 & 2) != 0) {
            str2 = guiSettings.rangeDisplay;
        }
        if ((i11 & 4) != 0) {
            str3 = guiSettings.distanceUnit;
        }
        return guiSettings.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChargeRateUnit() {
        return this.chargeRateUnit;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRangeDisplay() {
        return this.rangeDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDistanceUnit() {
        return this.distanceUnit;
    }

    public final GuiSettings copy(String chargeRateUnit, String rangeDisplay, String distanceUnit) {
        return new GuiSettings(chargeRateUnit, rangeDisplay, distanceUnit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuiSettings)) {
            return false;
        }
        GuiSettings guiSettings = (GuiSettings) other;
        return s.f(this.chargeRateUnit, guiSettings.chargeRateUnit) && s.f(this.rangeDisplay, guiSettings.rangeDisplay) && s.f(this.distanceUnit, guiSettings.distanceUnit);
    }

    public final String getChargeRateUnit() {
        return this.chargeRateUnit;
    }

    public final String getDistanceUnit() {
        return this.distanceUnit;
    }

    public final String getRangeDisplay() {
        return this.rangeDisplay;
    }

    public int hashCode() {
        String str = this.chargeRateUnit;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rangeDisplay;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.distanceUnit;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "GuiSettings(chargeRateUnit=" + this.chargeRateUnit + ", rangeDisplay=" + this.rangeDisplay + ", distanceUnit=" + this.distanceUnit + ")";
    }
}
