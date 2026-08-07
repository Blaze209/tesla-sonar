package com.tesla.oapi;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlinx.coroutines.DebugKt;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/tesla/oapi/HVACBioweaponModeBody;", "", DebugKt.DEBUG_PROPERTY_VALUE_ON, "", "manualOverride", "<init>", "(ZZ)V", "getOn", "()Z", "getManualOverride", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HVACBioweaponModeBody {

    @g(name = "manual_override")
    private final boolean manualOverride;

    @g(name = DebugKt.DEBUG_PROPERTY_VALUE_ON)
    private final boolean on;

    public HVACBioweaponModeBody(boolean z11, boolean z12) {
        this.on = z11;
        this.manualOverride = z12;
    }

    public static /* synthetic */ HVACBioweaponModeBody copy$default(HVACBioweaponModeBody hVACBioweaponModeBody, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = hVACBioweaponModeBody.on;
        }
        if ((i11 & 2) != 0) {
            z12 = hVACBioweaponModeBody.manualOverride;
        }
        return hVACBioweaponModeBody.copy(z11, z12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getOn() {
        return this.on;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getManualOverride() {
        return this.manualOverride;
    }

    public final HVACBioweaponModeBody copy(boolean on2, boolean manualOverride) {
        return new HVACBioweaponModeBody(on2, manualOverride);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HVACBioweaponModeBody)) {
            return false;
        }
        HVACBioweaponModeBody hVACBioweaponModeBody = (HVACBioweaponModeBody) other;
        return this.on == hVACBioweaponModeBody.on && this.manualOverride == hVACBioweaponModeBody.manualOverride;
    }

    public final boolean getManualOverride() {
        return this.manualOverride;
    }

    public final boolean getOn() {
        return this.on;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.on) * 31) + Boolean.hashCode(this.manualOverride);
    }

    public String toString() {
        return "HVACBioweaponModeBody(on=" + this.on + ", manualOverride=" + this.manualOverride + ")";
    }
}
