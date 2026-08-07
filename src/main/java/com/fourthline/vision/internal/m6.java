package com.fourthline.vision.internal;

import com.fourthline.analytics.internal.NewAnalyticsEvent;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class m6 implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f38618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f38619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f38620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f38621f;

    public m6(String documentSide, int i11, boolean z11, boolean z12) {
        p013kotlin.jvm.internal.s.k(documentSide, "documentSide");
        this.f38616a = documentSide;
        this.f38617b = i11;
        this.f38618c = z11;
        this.f38619d = z12;
        this.f38620e = "document_scan_step_started";
        this.f38621f = "iglu:com.fourthline.sdk/document_scan_step_started/jsonschema/1-0-0";
    }

    private final String component1() {
        return this.f38616a;
    }

    private final int component2() {
        return this.f38617b;
    }

    private final boolean component3() {
        return this.f38618c;
    }

    private final boolean component4() {
        return this.f38619d;
    }

    public static /* synthetic */ m6 copy$default(m6 m6Var, String str, int i11, boolean z11, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = m6Var.f38616a;
        }
        if ((i12 & 2) != 0) {
            i11 = m6Var.f38617b;
        }
        if ((i12 & 4) != 0) {
            z11 = m6Var.f38618c;
        }
        if ((i12 & 8) != 0) {
            z12 = m6Var.f38619d;
        }
        return m6Var.copy(str, i11, z11, z12);
    }

    public final m6 copy(String documentSide, int i11, boolean z11, boolean z12) {
        p013kotlin.jvm.internal.s.k(documentSide, "documentSide");
        return new m6(documentSide, i11, z11, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6)) {
            return false;
        }
        m6 m6Var = (m6) obj;
        return p013kotlin.jvm.internal.s.f(this.f38616a, m6Var.f38616a) && this.f38617b == m6Var.f38617b && this.f38618c == m6Var.f38618c && this.f38619d == m6Var.f38619d;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map<String, Object> getAttributes() {
        return p013kotlin.collections.v0.m(jn0.x.a("step_index", Integer.valueOf(this.f38617b)), jn0.x.a("document_side", this.f38616a), jn0.x.a("tilted", Boolean.valueOf(this.f38618c)), jn0.x.a("autodetect_available", Boolean.valueOf(this.f38619d)));
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return this.f38620e;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return this.f38621f;
    }

    public int hashCode() {
        return (((((this.f38616a.hashCode() * 31) + Integer.hashCode(this.f38617b)) * 31) + Boolean.hashCode(this.f38618c)) * 31) + Boolean.hashCode(this.f38619d);
    }

    public String toString() {
        return "ScanStepStarted(documentSide=" + this.f38616a + ", stepIndex=" + this.f38617b + ", tilted=" + this.f38618c + ", autodetectAvailable=" + this.f38619d + ")";
    }
}
