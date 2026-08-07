package com.tesla.oapi;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/tesla/oapi/ClimateOnBody;", "", "manualOverride", "Lcom/tesla/oapi/ClimateOverrideMode;", "<init>", "(Lcom/tesla/oapi/ClimateOverrideMode;)V", "getManualOverride", "()Lcom/tesla/oapi/ClimateOverrideMode;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ClimateOnBody {

    @g(name = "manual_override")
    private final ClimateOverrideMode manualOverride;

    public ClimateOnBody(ClimateOverrideMode climateOverrideMode) {
        this.manualOverride = climateOverrideMode;
    }

    public static /* synthetic */ ClimateOnBody copy$default(ClimateOnBody climateOnBody, ClimateOverrideMode climateOverrideMode, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            climateOverrideMode = climateOnBody.manualOverride;
        }
        return climateOnBody.copy(climateOverrideMode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ClimateOverrideMode getManualOverride() {
        return this.manualOverride;
    }

    public final ClimateOnBody copy(ClimateOverrideMode manualOverride) {
        return new ClimateOnBody(manualOverride);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ClimateOnBody) && this.manualOverride == ((ClimateOnBody) other).manualOverride;
    }

    public final ClimateOverrideMode getManualOverride() {
        return this.manualOverride;
    }

    public int hashCode() {
        ClimateOverrideMode climateOverrideMode = this.manualOverride;
        if (climateOverrideMode == null) {
            return 0;
        }
        return climateOverrideMode.hashCode();
    }

    public String toString() {
        return "ClimateOnBody(manualOverride=" + this.manualOverride + ")";
    }
}
