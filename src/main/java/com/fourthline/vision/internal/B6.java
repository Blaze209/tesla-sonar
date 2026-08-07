package com.fourthline.vision.internal;

import com.fourthline.analytics.internal.NewAnalyticsEvent;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class B6 implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f37640b;

    public B6(String stepType, String str) {
        p013kotlin.jvm.internal.s.k(stepType, "stepType");
        this.f37639a = stepType;
        this.f37640b = str;
    }

    private final String component1() {
        return this.f37639a;
    }

    private final String component2() {
        return this.f37640b;
    }

    public static /* synthetic */ B6 copy$default(B6 b11, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = b11.f37639a;
        }
        if ((i11 & 2) != 0) {
            str2 = b11.f37640b;
        }
        return b11.copy(str, str2);
    }

    public final B6 copy(String stepType, String str) {
        p013kotlin.jvm.internal.s.k(stepType, "stepType");
        return new B6(stepType, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B6)) {
            return false;
        }
        B6 b11 = (B6) obj;
        return p013kotlin.jvm.internal.s.f(this.f37639a, b11.f37639a) && p013kotlin.jvm.internal.s.f(this.f37640b, b11.f37640b);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map<String, Object> getAttributes() {
        Map mapC = p013kotlin.collections.v0.c();
        mapC.put("step_type", this.f37639a);
        String str = this.f37640b;
        if (str != null) {
            mapC.put("liveness_direction", str);
        }
        return p013kotlin.collections.v0.b(mapC);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return "selfie_scan_step_started";
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return "iglu:com.fourthline.sdk/selfie_scan_step_started/jsonschema/1-0-0";
    }

    public int hashCode() {
        int iHashCode = this.f37639a.hashCode() * 31;
        String str = this.f37640b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ScanStepStarted(stepType=" + this.f37639a + ", livenessDirection=" + this.f37640b + ")";
    }
}
