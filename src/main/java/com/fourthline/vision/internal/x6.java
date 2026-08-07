package com.fourthline.vision.internal;

import com.fourthline.analytics.internal.NewAnalyticsEvent;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class x6 implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x6 f39096a = new x6();

    private x6() {
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof x6);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map<String, Object> getAttributes() {
        return p013kotlin.collections.v0.i();
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return "selfie_scan_completed";
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return "iglu:com.fourthline.sdk/selfie_scan_completed/jsonschema/1-0-0";
    }

    public int hashCode() {
        return 1857648650;
    }

    public String toString() {
        return "ScanCompleted";
    }
}
