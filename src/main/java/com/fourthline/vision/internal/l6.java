package com.fourthline.vision.internal;

import com.fourthline.analytics.internal.NewAnalyticsEvent;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class l6 implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f38536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f38537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f38538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f38539f;

    public l6(String documentSide, int i11, boolean z11, boolean z12) {
        p013kotlin.jvm.internal.s.k(documentSide, "documentSide");
        this.f38534a = documentSide;
        this.f38535b = i11;
        this.f38536c = z11;
        this.f38537d = z12;
        this.f38538e = "document_scan_step_reset";
        this.f38539f = "iglu:com.fourthline.sdk/document_scan_step_reset/jsonschema/1-0-0";
    }

    private final String component1() {
        return this.f38534a;
    }

    private final int component2() {
        return this.f38535b;
    }

    private final boolean component3() {
        return this.f38536c;
    }

    private final boolean component4() {
        return this.f38537d;
    }

    public static /* synthetic */ l6 copy$default(l6 l6Var, String str, int i11, boolean z11, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = l6Var.f38534a;
        }
        if ((i12 & 2) != 0) {
            i11 = l6Var.f38535b;
        }
        if ((i12 & 4) != 0) {
            z11 = l6Var.f38536c;
        }
        if ((i12 & 8) != 0) {
            z12 = l6Var.f38537d;
        }
        return l6Var.copy(str, i11, z11, z12);
    }

    public final l6 copy(String documentSide, int i11, boolean z11, boolean z12) {
        p013kotlin.jvm.internal.s.k(documentSide, "documentSide");
        return new l6(documentSide, i11, z11, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6)) {
            return false;
        }
        l6 l6Var = (l6) obj;
        return p013kotlin.jvm.internal.s.f(this.f38534a, l6Var.f38534a) && this.f38535b == l6Var.f38535b && this.f38536c == l6Var.f38536c && this.f38537d == l6Var.f38537d;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map<String, Object> getAttributes() {
        return p013kotlin.collections.v0.m(jn0.x.a("step_index", Integer.valueOf(this.f38535b)), jn0.x.a("document_side", this.f38534a), jn0.x.a("tilted", Boolean.valueOf(this.f38536c)), jn0.x.a("autodetect_available", Boolean.valueOf(this.f38537d)));
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return this.f38538e;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return this.f38539f;
    }

    public int hashCode() {
        return (((((this.f38534a.hashCode() * 31) + Integer.hashCode(this.f38535b)) * 31) + Boolean.hashCode(this.f38536c)) * 31) + Boolean.hashCode(this.f38537d);
    }

    public String toString() {
        return "ScanStepReset(documentSide=" + this.f38534a + ", stepIndex=" + this.f38535b + ", tilted=" + this.f38536c + ", autodetectAvailable=" + this.f38537d + ")";
    }
}
