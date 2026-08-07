package com.fourthline.vision.internal;

import com.fourthline.analytics.internal.NewAnalyticsEvent;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class A6 implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A6 f37626a = new A6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f37627b = p013kotlin.collections.v0.i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f37628c = 8;

    private A6() {
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof A6);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map<String, Object> getAttributes() {
        return f37627b;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return "selfie_scan_started";
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return "iglu:com.fourthline.sdk/selfie_scan_started/jsonschema/1-0-0";
    }

    public int hashCode() {
        return -794352128;
    }

    public String toString() {
        return "ScanStarted";
    }
}
