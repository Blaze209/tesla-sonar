package com.fourthline.nfc.internal;

import com.fourthline.analytics.internal.NewAnalyticsEvent;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I0.a f24722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f24725d;

    public s0(I0.a documentSummary) {
        p013kotlin.jvm.internal.s.k(documentSummary, "documentSummary");
        this.f24722a = documentSummary;
        this.f24723b = "nfc_read_data_started";
        this.f24724c = "iglu:com.fourthline.sdk/nfc_read_data_started/jsonschema/1-0-0";
        this.f24725d = t0.b(documentSummary);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && p013kotlin.jvm.internal.s.f(this.f24722a, ((s0) obj).f24722a);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map getAttributes() {
        return this.f24725d;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return this.f24723b;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return this.f24724c;
    }

    public int hashCode() {
        return this.f24722a.hashCode();
    }

    public String toString() {
        return "ReadStarted(documentSummary=" + this.f24722a + ")";
    }
}
