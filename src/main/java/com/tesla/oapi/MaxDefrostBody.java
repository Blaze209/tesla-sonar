package com.tesla.oapi;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlinx.coroutines.DebugKt;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tesla/oapi/MaxDefrostBody;", "", DebugKt.DEBUG_PROPERTY_VALUE_ON, "", "manualOverride", "Lcom/tesla/oapi/OverrideMode;", "<init>", "(ZLcom/tesla/oapi/OverrideMode;)V", "getOn", "()Z", "getManualOverride", "()Lcom/tesla/oapi/OverrideMode;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MaxDefrostBody {

    @g(name = "manual_override")
    private final OverrideMode manualOverride;

    @g(name = DebugKt.DEBUG_PROPERTY_VALUE_ON)
    private final boolean on;

    public MaxDefrostBody(boolean z11, OverrideMode manualOverride) {
        s.k(manualOverride, "manualOverride");
        this.on = z11;
        this.manualOverride = manualOverride;
    }

    public static /* synthetic */ MaxDefrostBody copy$default(MaxDefrostBody maxDefrostBody, boolean z11, OverrideMode overrideMode, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = maxDefrostBody.on;
        }
        if ((i11 & 2) != 0) {
            overrideMode = maxDefrostBody.manualOverride;
        }
        return maxDefrostBody.copy(z11, overrideMode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getOn() {
        return this.on;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OverrideMode getManualOverride() {
        return this.manualOverride;
    }

    public final MaxDefrostBody copy(boolean on2, OverrideMode manualOverride) {
        s.k(manualOverride, "manualOverride");
        return new MaxDefrostBody(on2, manualOverride);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MaxDefrostBody)) {
            return false;
        }
        MaxDefrostBody maxDefrostBody = (MaxDefrostBody) other;
        return this.on == maxDefrostBody.on && this.manualOverride == maxDefrostBody.manualOverride;
    }

    public final OverrideMode getManualOverride() {
        return this.manualOverride;
    }

    public final boolean getOn() {
        return this.on;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.on) * 31) + this.manualOverride.hashCode();
    }

    public String toString() {
        return "MaxDefrostBody(on=" + this.on + ", manualOverride=" + this.manualOverride + ")";
    }
}
