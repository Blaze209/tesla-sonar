package com.fourthline.nfc.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.NewAnalyticsEvent;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f24711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I0.a f24712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f24713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f24714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f24715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f24716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f24717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f24718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f24719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f24720j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map f24721k;

    public r0(Throwable th2, I0.a documentSummary, Set availableDataGroups, List extractedDocumentDetails, List extractedPersonDetails, Map extractedDocumentAttributes, long j11, int i11) {
        Throwable cause;
        p013kotlin.jvm.internal.s.k(documentSummary, "documentSummary");
        p013kotlin.jvm.internal.s.k(availableDataGroups, "availableDataGroups");
        p013kotlin.jvm.internal.s.k(extractedDocumentDetails, "extractedDocumentDetails");
        p013kotlin.jvm.internal.s.k(extractedPersonDetails, "extractedPersonDetails");
        p013kotlin.jvm.internal.s.k(extractedDocumentAttributes, "extractedDocumentAttributes");
        this.f24711a = th2;
        this.f24712b = documentSummary;
        this.f24713c = availableDataGroups;
        this.f24714d = extractedDocumentDetails;
        this.f24715e = extractedPersonDetails;
        this.f24716f = extractedDocumentAttributes;
        this.f24717g = j11;
        this.f24718h = i11;
        this.f24719i = "nfc_read_data_failed";
        this.f24720j = "iglu:com.fourthline.sdk/nfc_read_data_failed/jsonschema/1-0-0";
        Map mapB = t0.b(documentSummary);
        Pair pairA = jn0.x.a("data_groups", availableDataGroups);
        Pair pairA2 = jn0.x.a("personal_details", extractedPersonDetails);
        Pair pairA3 = jn0.x.a("document_details", extractedDocumentDetails);
        Pair pairA4 = jn0.x.a("document_attributes", extractedDocumentAttributes);
        Pair pairA5 = jn0.x.a("command_count", Long.valueOf(j11));
        Pair pairA6 = jn0.x.a("data_group", Integer.valueOf(i11));
        String strA = null;
        Pair pairA7 = jn0.x.a(AnalyticsAttribute.Error, th2 != null ? a(th2) : null);
        if (th2 != null && (cause = th2.getCause()) != null) {
            strA = a(cause);
        }
        this.f24721k = p013kotlin.collections.v0.r(mapB, p013kotlin.collections.v0.m(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, jn0.x.a(AnalyticsAttribute.Reason, strA)));
    }

    private final String a(Throwable th2) {
        String simpleName = th2.getClass().getSimpleName();
        p013kotlin.jvm.internal.s.j(simpleName, "getSimpleName(...)");
        String message = th2.getMessage();
        if (message != null) {
            String str = simpleName + ": " + message;
            if (str != null) {
                return str;
            }
        }
        return simpleName;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return p013kotlin.jvm.internal.s.f(this.f24711a, r0Var.f24711a) && p013kotlin.jvm.internal.s.f(this.f24712b, r0Var.f24712b) && p013kotlin.jvm.internal.s.f(this.f24713c, r0Var.f24713c) && p013kotlin.jvm.internal.s.f(this.f24714d, r0Var.f24714d) && p013kotlin.jvm.internal.s.f(this.f24715e, r0Var.f24715e) && p013kotlin.jvm.internal.s.f(this.f24716f, r0Var.f24716f) && this.f24717g == r0Var.f24717g && this.f24718h == r0Var.f24718h;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map getAttributes() {
        return this.f24721k;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return this.f24719i;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return this.f24720j;
    }

    public int hashCode() {
        Throwable th2 = this.f24711a;
        return ((((((((((((((th2 == null ? 0 : th2.hashCode()) * 31) + this.f24712b.hashCode()) * 31) + this.f24713c.hashCode()) * 31) + this.f24714d.hashCode()) * 31) + this.f24715e.hashCode()) * 31) + this.f24716f.hashCode()) * 31) + Long.hashCode(this.f24717g)) * 31) + Integer.hashCode(this.f24718h);
    }

    public String toString() {
        return "ReadFailed(error=" + this.f24711a + ", documentSummary=" + this.f24712b + ", availableDataGroups=" + this.f24713c + ", extractedDocumentDetails=" + this.f24714d + ", extractedPersonDetails=" + this.f24715e + ", extractedDocumentAttributes=" + this.f24716f + ", commandCount=" + this.f24717g + ", currentDataGroup=" + this.f24718h + ")";
    }
}
