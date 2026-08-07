package com.tesla.oapi;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/tesla/oapi/JsCalendarSyncParameters;", "", "enabled", "", AnalyticsAttribute.Reason, "", "<init>", "(ZLjava/lang/String;)V", "getEnabled", "()Z", "getReason", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class JsCalendarSyncParameters {

    @g(name = "enabled")
    private final boolean enabled;

    @g(name = AnalyticsAttribute.Reason)
    private final String reason;

    public JsCalendarSyncParameters(boolean z11, String reason) {
        s.k(reason, "reason");
        this.enabled = z11;
        this.reason = reason;
    }

    public static /* synthetic */ JsCalendarSyncParameters copy$default(JsCalendarSyncParameters jsCalendarSyncParameters, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = jsCalendarSyncParameters.enabled;
        }
        if ((i11 & 2) != 0) {
            str = jsCalendarSyncParameters.reason;
        }
        return jsCalendarSyncParameters.copy(z11, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final JsCalendarSyncParameters copy(boolean enabled, String reason) {
        s.k(reason, "reason");
        return new JsCalendarSyncParameters(enabled, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JsCalendarSyncParameters)) {
            return false;
        }
        JsCalendarSyncParameters jsCalendarSyncParameters = (JsCalendarSyncParameters) other;
        return this.enabled == jsCalendarSyncParameters.enabled && s.f(this.reason, jsCalendarSyncParameters.reason);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.enabled) * 31) + this.reason.hashCode();
    }

    public String toString() {
        return "JsCalendarSyncParameters(enabled=" + this.enabled + ", reason=" + this.reason + ")";
    }
}
