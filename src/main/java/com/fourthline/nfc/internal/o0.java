package com.fourthline.nfc.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.NewAnalyticsEvent;
import java.util.Map;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f24669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I0.b f24670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final I0.a f24671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f24672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f24673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f24674f;

    public o0(Throwable th2, I0.b authProtocol, I0.a documentSummary) {
        Throwable cause;
        p013kotlin.jvm.internal.s.k(authProtocol, "authProtocol");
        p013kotlin.jvm.internal.s.k(documentSummary, "documentSummary");
        this.f24669a = th2;
        this.f24670b = authProtocol;
        this.f24671c = documentSummary;
        this.f24672d = "nfc_inspection_failed";
        this.f24673e = "iglu:com.fourthline.sdk/nfc_inspection_failed/jsonschema/1-0-0";
        Map mapB = t0.b(authProtocol);
        String strB = null;
        Pair pairA = jn0.x.a(AnalyticsAttribute.Error, th2 != null ? t0.b(th2) : null);
        if (th2 != null && (cause = th2.getCause()) != null) {
            strB = t0.b(cause);
        }
        this.f24674f = p013kotlin.collections.v0.r(mapB, p013kotlin.collections.v0.m(pairA, jn0.x.a(AnalyticsAttribute.Reason, strB)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return p013kotlin.jvm.internal.s.f(this.f24669a, o0Var.f24669a) && p013kotlin.jvm.internal.s.f(this.f24670b, o0Var.f24670b) && p013kotlin.jvm.internal.s.f(this.f24671c, o0Var.f24671c);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map getAttributes() {
        return this.f24674f;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return this.f24672d;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return this.f24673e;
    }

    public int hashCode() {
        Throwable th2 = this.f24669a;
        return ((((th2 == null ? 0 : th2.hashCode()) * 31) + this.f24670b.hashCode()) * 31) + this.f24671c.hashCode();
    }

    public String toString() {
        return "InspectionFailed(error=" + this.f24669a + ", authProtocol=" + this.f24670b + ", documentSummary=" + this.f24671c + ")";
    }
}
