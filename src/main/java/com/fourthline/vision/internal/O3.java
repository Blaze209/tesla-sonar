package com.fourthline.vision.internal;

import com.fourthline.analytics.internal.NewAnalyticsEvent;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class O3 implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O3 f37864a = new O3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f37865b = "iglu:com.fourthline.sdk/not_supported_device_state/jsonschema/1-0-0";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f37866c = "not_supported_device_state";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f37867d = p013kotlin.collections.v0.f(jn0.x.a("device_compromised", Boolean.TRUE));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f37868e = 8;

    private O3() {
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map<String, Object> getAttributes() {
        return f37867d;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return f37866c;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return f37865b;
    }
}
