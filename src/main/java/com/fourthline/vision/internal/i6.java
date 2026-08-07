package com.fourthline.vision.internal;

import com.fourthline.analytics.internal.NewAnalyticsEvent;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class i6 implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i6 f38413a = new i6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f38414b = "document_scan_started";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f38415c = "iglu:com.fourthline.sdk/document_scan_started/jsonschema/1-0-0";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f38416d = p013kotlin.collections.v0.i();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f38417e = 8;

    private i6() {
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof i6);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map<String, Object> getAttributes() {
        return f38416d;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return f38414b;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return f38415c;
    }

    public int hashCode() {
        return 118085862;
    }

    public String toString() {
        return "ScanStarted";
    }
}
