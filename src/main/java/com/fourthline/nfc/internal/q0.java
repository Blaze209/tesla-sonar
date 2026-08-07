package com.fourthline.nfc.internal;

import com.fourthline.analytics.internal.NewAnalyticsEvent;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I0.a f24697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f24698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f24699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f24700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f24701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f24702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f24703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f24704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f24705i;

    public q0(I0.a documentSummary, Set availableDataGroups, List extractedDocumentDetails, List extractedPersonDetails, Map extractedDocumentAttributes, long j11) {
        p013kotlin.jvm.internal.s.k(documentSummary, "documentSummary");
        p013kotlin.jvm.internal.s.k(availableDataGroups, "availableDataGroups");
        p013kotlin.jvm.internal.s.k(extractedDocumentDetails, "extractedDocumentDetails");
        p013kotlin.jvm.internal.s.k(extractedPersonDetails, "extractedPersonDetails");
        p013kotlin.jvm.internal.s.k(extractedDocumentAttributes, "extractedDocumentAttributes");
        this.f24697a = documentSummary;
        this.f24698b = availableDataGroups;
        this.f24699c = extractedDocumentDetails;
        this.f24700d = extractedPersonDetails;
        this.f24701e = extractedDocumentAttributes;
        this.f24702f = j11;
        this.f24703g = "nfc_read_data_completed";
        this.f24704h = "iglu:com.fourthline.sdk/nfc_read_data_completed/jsonschema/1-0-0";
        this.f24705i = p013kotlin.collections.v0.r(t0.b(documentSummary), p013kotlin.collections.v0.m(jn0.x.a("data_groups", availableDataGroups), jn0.x.a("personal_details", extractedPersonDetails), jn0.x.a("document_details", extractedDocumentDetails), jn0.x.a("document_attributes", extractedDocumentAttributes), jn0.x.a("command_count", Long.valueOf(j11))));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return p013kotlin.jvm.internal.s.f(this.f24697a, q0Var.f24697a) && p013kotlin.jvm.internal.s.f(this.f24698b, q0Var.f24698b) && p013kotlin.jvm.internal.s.f(this.f24699c, q0Var.f24699c) && p013kotlin.jvm.internal.s.f(this.f24700d, q0Var.f24700d) && p013kotlin.jvm.internal.s.f(this.f24701e, q0Var.f24701e) && this.f24702f == q0Var.f24702f;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map getAttributes() {
        return this.f24705i;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return this.f24703g;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return this.f24704h;
    }

    public int hashCode() {
        return (((((((((this.f24697a.hashCode() * 31) + this.f24698b.hashCode()) * 31) + this.f24699c.hashCode()) * 31) + this.f24700d.hashCode()) * 31) + this.f24701e.hashCode()) * 31) + Long.hashCode(this.f24702f);
    }

    public String toString() {
        return "ReadCompleted(documentSummary=" + this.f24697a + ", availableDataGroups=" + this.f24698b + ", extractedDocumentDetails=" + this.f24699c + ", extractedPersonDetails=" + this.f24700d + ", extractedDocumentAttributes=" + this.f24701e + ", commandCount=" + this.f24702f + ")";
    }
}
