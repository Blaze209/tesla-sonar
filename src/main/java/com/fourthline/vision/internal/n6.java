package com.fourthline.vision.internal;

import com.fourthline.analytics.internal.NewAnalyticsEvent;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class n6 implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n6 f38666a = new n6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f38667b = "document_scan_take_snapshot";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f38668c = "iglu:com.fourthline.sdk/document_scan_take_snapshot/jsonschema/1-0-0";

    private n6() {
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof n6);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map<String, Object> getAttributes() {
        return p013kotlin.collections.v0.i();
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return f38667b;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return f38668c;
    }

    public int hashCode() {
        return -821162487;
    }

    public String toString() {
        return "TakeSnapshot";
    }
}
