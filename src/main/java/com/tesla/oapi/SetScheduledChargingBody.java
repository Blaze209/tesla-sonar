package com.tesla.oapi;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\r\u0010\u000e\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00060\u0005j\u0002`\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/tesla/oapi/SetScheduledChargingBody;", "", "enable", "", "time", "", "Lcom/tesla/oapi/MinutesFromMidnight;", "<init>", "(ZI)V", "getEnable", "()Z", "getTime", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SetScheduledChargingBody {

    @g(name = "enable")
    private final boolean enable;

    @g(name = "time")
    private final int time;

    public SetScheduledChargingBody(boolean z11, int i11) {
        this.enable = z11;
        this.time = i11;
    }

    public static /* synthetic */ SetScheduledChargingBody copy$default(SetScheduledChargingBody setScheduledChargingBody, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = setScheduledChargingBody.enable;
        }
        if ((i12 & 2) != 0) {
            i11 = setScheduledChargingBody.time;
        }
        return setScheduledChargingBody.copy(z11, i11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTime() {
        return this.time;
    }

    public final SetScheduledChargingBody copy(boolean enable, int time) {
        return new SetScheduledChargingBody(enable, time);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetScheduledChargingBody)) {
            return false;
        }
        SetScheduledChargingBody setScheduledChargingBody = (SetScheduledChargingBody) other;
        return this.enable == setScheduledChargingBody.enable && this.time == setScheduledChargingBody.time;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getTime() {
        return this.time;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.enable) * 31) + Integer.hashCode(this.time);
    }

    public String toString() {
        return "SetScheduledChargingBody(enable=" + this.enable + ", time=" + this.time + ")";
    }
}
