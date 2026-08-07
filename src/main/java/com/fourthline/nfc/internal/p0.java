package com.fourthline.nfc.internal;

import com.fourthline.analytics.internal.NewAnalyticsEvent;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I0.b f24688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I0.a f24689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f24691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f24692e;

    public p0(I0.b authProtocol, I0.a documentSummary) {
        p013kotlin.jvm.internal.s.k(authProtocol, "authProtocol");
        p013kotlin.jvm.internal.s.k(documentSummary, "documentSummary");
        this.f24688a = authProtocol;
        this.f24689b = documentSummary;
        this.f24690c = "nfc_inspection_started";
        this.f24691d = "iglu:com.fourthline.sdk/nfc_inspection_started/jsonschema/1-0-0";
        this.f24692e = p013kotlin.collections.v0.r(t0.b(authProtocol), t0.b(documentSummary));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return p013kotlin.jvm.internal.s.f(this.f24688a, p0Var.f24688a) && p013kotlin.jvm.internal.s.f(this.f24689b, p0Var.f24689b);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map getAttributes() {
        return this.f24692e;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return this.f24690c;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return this.f24691d;
    }

    public int hashCode() {
        return (this.f24688a.hashCode() * 31) + this.f24689b.hashCode();
    }

    public String toString() {
        return "InspectionStarted(authProtocol=" + this.f24688a + ", documentSummary=" + this.f24689b + ")";
    }
}
