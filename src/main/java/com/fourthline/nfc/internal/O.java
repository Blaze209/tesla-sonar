package com.fourthline.nfc.internal;

import com.fourthline.analytics.internal.NewAnalyticsEvent;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class O implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O f24612a = new O();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f24613b = p013kotlin.collections.v0.i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f24614c = 8;

    private O() {
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof O);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map getAttributes() {
        return f24613b;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return "nfc_scan_started";
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return "iglu:com.fourthline.sdk/nfc_scan_started/jsonschema/1-0-0";
    }

    public int hashCode() {
        return -1646262126;
    }

    public String toString() {
        return "ScanStarted";
    }
}
