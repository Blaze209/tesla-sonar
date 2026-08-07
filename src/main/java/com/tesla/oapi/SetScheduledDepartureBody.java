package com.tesla.oapi;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0016\u0010\u0019\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0016\u0010\u001e\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011Jd\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR \u0010\u000b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u0011¨\u0006&"}, d2 = {"Lcom/tesla/oapi/SetScheduledDepartureBody;", "", "enable", "", "departureTime", "", "Lcom/tesla/oapi/MinutesFromMidnight;", "preconditioningEnabled", "preconditioningWeekdaysOnly", "offPeakChargingEnabled", "offPeakChargingWeekdaysOnly", "endOffPeakTime", "<init>", "(ZLjava/lang/Integer;ZZZZLjava/lang/Integer;)V", "getEnable", "()Z", "getDepartureTime", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPreconditioningEnabled", "getPreconditioningWeekdaysOnly", "getOffPeakChargingEnabled", "getOffPeakChargingWeekdaysOnly", "getEndOffPeakTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ZLjava/lang/Integer;ZZZZLjava/lang/Integer;)Lcom/tesla/oapi/SetScheduledDepartureBody;", "equals", "other", "hashCode", "toString", "", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SetScheduledDepartureBody {

    @g(name = "departure_time")
    private final Integer departureTime;

    @g(name = "enable")
    private final boolean enable;

    @g(name = "end_off_peak_time")
    private final Integer endOffPeakTime;

    @g(name = "off_peak_charging_enabled")
    private final boolean offPeakChargingEnabled;

    @g(name = "off_peak_charging_weekdays_only")
    private final boolean offPeakChargingWeekdaysOnly;

    @g(name = "preconditioning_enabled")
    private final boolean preconditioningEnabled;

    @g(name = "preconditioning_weekdays_only")
    private final boolean preconditioningWeekdaysOnly;

    public SetScheduledDepartureBody(boolean z11, Integer num, boolean z12, boolean z13, boolean z14, boolean z15, Integer num2) {
        this.enable = z11;
        this.departureTime = num;
        this.preconditioningEnabled = z12;
        this.preconditioningWeekdaysOnly = z13;
        this.offPeakChargingEnabled = z14;
        this.offPeakChargingWeekdaysOnly = z15;
        this.endOffPeakTime = num2;
    }

    public static /* synthetic */ SetScheduledDepartureBody copy$default(SetScheduledDepartureBody setScheduledDepartureBody, boolean z11, Integer num, boolean z12, boolean z13, boolean z14, boolean z15, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = setScheduledDepartureBody.enable;
        }
        if ((i11 & 2) != 0) {
            num = setScheduledDepartureBody.departureTime;
        }
        if ((i11 & 4) != 0) {
            z12 = setScheduledDepartureBody.preconditioningEnabled;
        }
        if ((i11 & 8) != 0) {
            z13 = setScheduledDepartureBody.preconditioningWeekdaysOnly;
        }
        if ((i11 & 16) != 0) {
            z14 = setScheduledDepartureBody.offPeakChargingEnabled;
        }
        if ((i11 & 32) != 0) {
            z15 = setScheduledDepartureBody.offPeakChargingWeekdaysOnly;
        }
        if ((i11 & 64) != 0) {
            num2 = setScheduledDepartureBody.endOffPeakTime;
        }
        boolean z16 = z15;
        Integer num3 = num2;
        boolean z17 = z14;
        boolean z18 = z12;
        return setScheduledDepartureBody.copy(z11, num, z18, z13, z17, z16, num3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getDepartureTime() {
        return this.departureTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getPreconditioningEnabled() {
        return this.preconditioningEnabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getPreconditioningWeekdaysOnly() {
        return this.preconditioningWeekdaysOnly;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getOffPeakChargingEnabled() {
        return this.offPeakChargingEnabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getOffPeakChargingWeekdaysOnly() {
        return this.offPeakChargingWeekdaysOnly;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getEndOffPeakTime() {
        return this.endOffPeakTime;
    }

    public final SetScheduledDepartureBody copy(boolean enable, Integer departureTime, boolean preconditioningEnabled, boolean preconditioningWeekdaysOnly, boolean offPeakChargingEnabled, boolean offPeakChargingWeekdaysOnly, Integer endOffPeakTime) {
        return new SetScheduledDepartureBody(enable, departureTime, preconditioningEnabled, preconditioningWeekdaysOnly, offPeakChargingEnabled, offPeakChargingWeekdaysOnly, endOffPeakTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetScheduledDepartureBody)) {
            return false;
        }
        SetScheduledDepartureBody setScheduledDepartureBody = (SetScheduledDepartureBody) other;
        return this.enable == setScheduledDepartureBody.enable && s.f(this.departureTime, setScheduledDepartureBody.departureTime) && this.preconditioningEnabled == setScheduledDepartureBody.preconditioningEnabled && this.preconditioningWeekdaysOnly == setScheduledDepartureBody.preconditioningWeekdaysOnly && this.offPeakChargingEnabled == setScheduledDepartureBody.offPeakChargingEnabled && this.offPeakChargingWeekdaysOnly == setScheduledDepartureBody.offPeakChargingWeekdaysOnly && s.f(this.endOffPeakTime, setScheduledDepartureBody.endOffPeakTime);
    }

    public final Integer getDepartureTime() {
        return this.departureTime;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final Integer getEndOffPeakTime() {
        return this.endOffPeakTime;
    }

    public final boolean getOffPeakChargingEnabled() {
        return this.offPeakChargingEnabled;
    }

    public final boolean getOffPeakChargingWeekdaysOnly() {
        return this.offPeakChargingWeekdaysOnly;
    }

    public final boolean getPreconditioningEnabled() {
        return this.preconditioningEnabled;
    }

    public final boolean getPreconditioningWeekdaysOnly() {
        return this.preconditioningWeekdaysOnly;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.enable) * 31;
        Integer num = this.departureTime;
        int iHashCode2 = (((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.preconditioningEnabled)) * 31) + Boolean.hashCode(this.preconditioningWeekdaysOnly)) * 31) + Boolean.hashCode(this.offPeakChargingEnabled)) * 31) + Boolean.hashCode(this.offPeakChargingWeekdaysOnly)) * 31;
        Integer num2 = this.endOffPeakTime;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "SetScheduledDepartureBody(enable=" + this.enable + ", departureTime=" + this.departureTime + ", preconditioningEnabled=" + this.preconditioningEnabled + ", preconditioningWeekdaysOnly=" + this.preconditioningWeekdaysOnly + ", offPeakChargingEnabled=" + this.offPeakChargingEnabled + ", offPeakChargingWeekdaysOnly=" + this.offPeakChargingWeekdaysOnly + ", endOffPeakTime=" + this.endOffPeakTime + ")";
    }
}
