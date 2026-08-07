package com.fourthline.vision.internal;

import com.fourthline.analytics.internal.NewAnalyticsEvent;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class j6 implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f38468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f38469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f38470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f38471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f38472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f38473h;

    public j6(String documentSide, int i11, boolean z11, boolean z12, boolean z13, List<String> autoDetectValidationErrors) {
        p013kotlin.jvm.internal.s.k(documentSide, "documentSide");
        p013kotlin.jvm.internal.s.k(autoDetectValidationErrors, "autoDetectValidationErrors");
        this.f38466a = documentSide;
        this.f38467b = i11;
        this.f38468c = z11;
        this.f38469d = z12;
        this.f38470e = z13;
        this.f38471f = autoDetectValidationErrors;
        this.f38472g = "document_scan_step_completed";
        this.f38473h = "iglu:com.fourthline.sdk/document_scan_step_completed/jsonschema/1-0-0";
    }

    private final String component1() {
        return this.f38466a;
    }

    private final int component2() {
        return this.f38467b;
    }

    private final boolean component3() {
        return this.f38468c;
    }

    private final boolean component4() {
        return this.f38469d;
    }

    private final boolean component5() {
        return this.f38470e;
    }

    private final List<String> component6() {
        return this.f38471f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ j6 copy$default(j6 j6Var, String str, int i11, boolean z11, boolean z12, boolean z13, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = j6Var.f38466a;
        }
        if ((i12 & 2) != 0) {
            i11 = j6Var.f38467b;
        }
        if ((i12 & 4) != 0) {
            z11 = j6Var.f38468c;
        }
        if ((i12 & 8) != 0) {
            z12 = j6Var.f38469d;
        }
        if ((i12 & 16) != 0) {
            z13 = j6Var.f38470e;
        }
        if ((i12 & 32) != 0) {
            list = j6Var.f38471f;
        }
        boolean z14 = z13;
        List list2 = list;
        return j6Var.copy(str, i11, z11, z12, z14, list2);
    }

    public final j6 copy(String documentSide, int i11, boolean z11, boolean z12, boolean z13, List<String> autoDetectValidationErrors) {
        p013kotlin.jvm.internal.s.k(documentSide, "documentSide");
        p013kotlin.jvm.internal.s.k(autoDetectValidationErrors, "autoDetectValidationErrors");
        return new j6(documentSide, i11, z11, z12, z13, autoDetectValidationErrors);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6)) {
            return false;
        }
        j6 j6Var = (j6) obj;
        return p013kotlin.jvm.internal.s.f(this.f38466a, j6Var.f38466a) && this.f38467b == j6Var.f38467b && this.f38468c == j6Var.f38468c && this.f38469d == j6Var.f38469d && this.f38470e == j6Var.f38470e && p013kotlin.jvm.internal.s.f(this.f38471f, j6Var.f38471f);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map<String, Object> getAttributes() {
        return p013kotlin.collections.v0.m(jn0.x.a("step_index", Integer.valueOf(this.f38467b)), jn0.x.a("document_side", this.f38466a), jn0.x.a("tilted", Boolean.valueOf(this.f38468c)), jn0.x.a("autodetect_available", Boolean.valueOf(this.f38469d)), jn0.x.a("captured_mrz", Boolean.valueOf(this.f38470e)), jn0.x.a("validation_errors", this.f38471f));
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return this.f38472g;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return this.f38473h;
    }

    public int hashCode() {
        return (((((((((this.f38466a.hashCode() * 31) + Integer.hashCode(this.f38467b)) * 31) + Boolean.hashCode(this.f38468c)) * 31) + Boolean.hashCode(this.f38469d)) * 31) + Boolean.hashCode(this.f38470e)) * 31) + this.f38471f.hashCode();
    }

    public String toString() {
        return "ScanStepCompleted(documentSide=" + this.f38466a + ", stepIndex=" + this.f38467b + ", tilted=" + this.f38468c + ", autoDetectAvailable=" + this.f38469d + ", autoDetectCapturedMrz=" + this.f38470e + ", autoDetectValidationErrors=" + this.f38471f + ")";
    }
}
