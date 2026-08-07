package com.fourthline.nfc.internal;

import com.fourthline.analytics.internal.NewAnalyticsEvent;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I0.b f24664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I0.a f24665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f24667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f24668e;

    public n0(I0.b authProtocol, I0.a documentSummary) {
        p013kotlin.jvm.internal.s.k(authProtocol, "authProtocol");
        p013kotlin.jvm.internal.s.k(documentSummary, "documentSummary");
        this.f24664a = authProtocol;
        this.f24665b = documentSummary;
        this.f24666c = "nfc_inspection_completed";
        this.f24667d = "iglu:com.fourthline.sdk/nfc_inspection_completed/jsonschema/1-0-0";
        this.f24668e = p013kotlin.collections.v0.r(t0.b(authProtocol), t0.b(documentSummary));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return p013kotlin.jvm.internal.s.f(this.f24664a, n0Var.f24664a) && p013kotlin.jvm.internal.s.f(this.f24665b, n0Var.f24665b);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map getAttributes() {
        return this.f24668e;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return this.f24666c;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return this.f24667d;
    }

    public int hashCode() {
        return (this.f24664a.hashCode() * 31) + this.f24665b.hashCode();
    }

    public String toString() {
        return "InspectionCompleted(authProtocol=" + this.f24664a + ", documentSummary=" + this.f24665b + ")";
    }
}
