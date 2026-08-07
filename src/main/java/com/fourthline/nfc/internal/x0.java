package com.fourthline.nfc.internal;

import com.fourthline.analytics.internal.NewAnalyticsEvent;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class x0 implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0 f24730a = new x0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f24731b = "iglu:com.fourthline.sdk/not_supported_device_state/jsonschema/1-0-0";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f24732c = "not_supported_device_state";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f24733d = p013kotlin.collections.v0.f(jn0.x.a("device_compromised", Boolean.TRUE));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f24734e = 8;

    private x0() {
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map getAttributes() {
        return f24733d;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return f24732c;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return f24731b;
    }
}
