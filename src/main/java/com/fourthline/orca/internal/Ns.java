package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.NewAnalyticsEvent;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class Ns implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ns f27089a = new Ns();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f27090b = "iglu:com.fourthline.sdk/not_supported_device_state/jsonschema/1-0-0";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f27091c = "not_supported_device_state";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f27092d = p013kotlin.collections.v0.f(jn0.x.a("device_compromised", Boolean.TRUE));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27093e = 8;

    private Ns() {
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof Ns);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map getAttributes() {
        return f27092d;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return f27091c;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return f27090b;
    }

    public int hashCode() {
        return -910370345;
    }

    public String toString() {
        return "NotSupportedDeviceState";
    }
}
