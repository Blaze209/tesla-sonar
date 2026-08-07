package com.fourthline.vision.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.NewAnalyticsEvent;
import com.fourthline.vision.document.DocumentScannerStepError;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class k6 implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f38513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f38514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final DocumentScannerStepError f38515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Throwable f38516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f38517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f38518h;

    public k6(String documentSide, int i11, boolean z11, boolean z12, DocumentScannerStepError error, Throwable th2) {
        p013kotlin.jvm.internal.s.k(documentSide, "documentSide");
        p013kotlin.jvm.internal.s.k(error, "error");
        this.f38511a = documentSide;
        this.f38512b = i11;
        this.f38513c = z11;
        this.f38514d = z12;
        this.f38515e = error;
        this.f38516f = th2;
        this.f38517g = "document_scan_step_failed";
        this.f38518h = "iglu:com.fourthline.sdk/document_scan_step_failed/jsonschema/1-0-0";
    }

    private final String component1() {
        return this.f38511a;
    }

    private final int component2() {
        return this.f38512b;
    }

    private final boolean component3() {
        return this.f38513c;
    }

    private final boolean component4() {
        return this.f38514d;
    }

    private final DocumentScannerStepError component5() {
        return this.f38515e;
    }

    private final Throwable component6() {
        return this.f38516f;
    }

    public static /* synthetic */ k6 copy$default(k6 k6Var, String str, int i11, boolean z11, boolean z12, DocumentScannerStepError documentScannerStepError, Throwable th2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = k6Var.f38511a;
        }
        if ((i12 & 2) != 0) {
            i11 = k6Var.f38512b;
        }
        if ((i12 & 4) != 0) {
            z11 = k6Var.f38513c;
        }
        if ((i12 & 8) != 0) {
            z12 = k6Var.f38514d;
        }
        if ((i12 & 16) != 0) {
            documentScannerStepError = k6Var.f38515e;
        }
        if ((i12 & 32) != 0) {
            th2 = k6Var.f38516f;
        }
        DocumentScannerStepError documentScannerStepError2 = documentScannerStepError;
        Throwable th3 = th2;
        return k6Var.copy(str, i11, z11, z12, documentScannerStepError2, th3);
    }

    public final k6 copy(String documentSide, int i11, boolean z11, boolean z12, DocumentScannerStepError error, Throwable th2) {
        p013kotlin.jvm.internal.s.k(documentSide, "documentSide");
        p013kotlin.jvm.internal.s.k(error, "error");
        return new k6(documentSide, i11, z11, z12, error, th2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6)) {
            return false;
        }
        k6 k6Var = (k6) obj;
        return p013kotlin.jvm.internal.s.f(this.f38511a, k6Var.f38511a) && this.f38512b == k6Var.f38512b && this.f38513c == k6Var.f38513c && this.f38514d == k6Var.f38514d && this.f38515e == k6Var.f38515e && p013kotlin.jvm.internal.s.f(this.f38516f, k6Var.f38516f);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map<String, Object> getAttributes() {
        String throwableDescription;
        Map mapC = p013kotlin.collections.v0.c();
        String strName = this.f38515e.name();
        Locale ROOT = Locale.ROOT;
        p013kotlin.jvm.internal.s.j(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        mapC.put(AnalyticsAttribute.Error, lowerCase);
        Throwable th2 = this.f38516f;
        if (th2 == null || (throwableDescription = AbstractC4167c6.getThrowableDescription(th2)) == null) {
            throwableDescription = AnalyticsAttribute.NotAvailable;
        }
        mapC.put(AnalyticsAttribute.Reason, throwableDescription);
        mapC.put("step_index", Integer.valueOf(this.f38512b));
        mapC.put("document_side", this.f38511a);
        mapC.put("tilted", Boolean.valueOf(this.f38513c));
        mapC.put("autodetect_available", Boolean.valueOf(this.f38514d));
        return p013kotlin.collections.v0.b(mapC);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return this.f38517g;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return this.f38518h;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f38511a.hashCode() * 31) + Integer.hashCode(this.f38512b)) * 31) + Boolean.hashCode(this.f38513c)) * 31) + Boolean.hashCode(this.f38514d)) * 31) + this.f38515e.hashCode()) * 31;
        Throwable th2 = this.f38516f;
        return iHashCode + (th2 == null ? 0 : th2.hashCode());
    }

    public String toString() {
        return "ScanStepFailed(documentSide=" + this.f38511a + ", stepIndex=" + this.f38512b + ", tilted=" + this.f38513c + ", autoDetectAvailable=" + this.f38514d + ", error=" + this.f38515e + ", reason=" + this.f38516f + ")";
    }
}
