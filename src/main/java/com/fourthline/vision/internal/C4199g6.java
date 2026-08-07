package com.fourthline.vision.internal;

import com.fourthline.analytics.internal.NewAnalyticsEvent;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.fourthline.vision.internal.g6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4199g6 implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f38334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f38335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f38336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f38337d;

    public C4199g6(boolean z11, List<String> autoDetectValidationErrors) {
        p013kotlin.jvm.internal.s.k(autoDetectValidationErrors, "autoDetectValidationErrors");
        this.f38334a = z11;
        this.f38335b = autoDetectValidationErrors;
        this.f38336c = "document_scan_completed";
        this.f38337d = "iglu:com.fourthline.sdk/document_scan_completed/jsonschema/1-0-0";
    }

    private final boolean component1() {
        return this.f38334a;
    }

    private final List<String> component2() {
        return this.f38335b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4199g6 copy$default(C4199g6 c4199g6, boolean z11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = c4199g6.f38334a;
        }
        if ((i11 & 2) != 0) {
            list = c4199g6.f38335b;
        }
        return c4199g6.copy(z11, list);
    }

    public final C4199g6 copy(boolean z11, List<String> autoDetectValidationErrors) {
        p013kotlin.jvm.internal.s.k(autoDetectValidationErrors, "autoDetectValidationErrors");
        return new C4199g6(z11, autoDetectValidationErrors);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4199g6)) {
            return false;
        }
        C4199g6 c4199g6 = (C4199g6) obj;
        return this.f38334a == c4199g6.f38334a && p013kotlin.jvm.internal.s.f(this.f38335b, c4199g6.f38335b);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map<String, Object> getAttributes() {
        return p013kotlin.collections.v0.m(jn0.x.a("captured_mrz", Boolean.valueOf(this.f38334a)), jn0.x.a("validation_errors", this.f38335b));
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return this.f38336c;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return this.f38337d;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f38334a) * 31) + this.f38335b.hashCode();
    }

    public String toString() {
        return "ScanCompleted(autoDetectCapturedMrz=" + this.f38334a + ", autoDetectValidationErrors=" + this.f38335b + ")";
    }
}
