package com.fourthline.vision.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.NewAnalyticsEvent;
import com.fourthline.vision.document.DocumentScannerError;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: com.fourthline.vision.internal.h6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4207h6 implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f38373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f38374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final DocumentScannerError f38375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Throwable f38376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f38377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f38378h;

    public C4207h6(String documentSide, int i11, boolean z11, boolean z12, DocumentScannerError error, Throwable th2) {
        p013kotlin.jvm.internal.s.k(documentSide, "documentSide");
        p013kotlin.jvm.internal.s.k(error, "error");
        this.f38371a = documentSide;
        this.f38372b = i11;
        this.f38373c = z11;
        this.f38374d = z12;
        this.f38375e = error;
        this.f38376f = th2;
        this.f38377g = "document_scan_failed";
        this.f38378h = "iglu:com.fourthline.sdk/document_scan_failed/jsonschema/1-0-0";
    }

    private final String component1() {
        return this.f38371a;
    }

    private final int component2() {
        return this.f38372b;
    }

    private final boolean component3() {
        return this.f38373c;
    }

    private final boolean component4() {
        return this.f38374d;
    }

    private final DocumentScannerError component5() {
        return this.f38375e;
    }

    private final Throwable component6() {
        return this.f38376f;
    }

    public static /* synthetic */ C4207h6 copy$default(C4207h6 c4207h6, String str, int i11, boolean z11, boolean z12, DocumentScannerError documentScannerError, Throwable th2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = c4207h6.f38371a;
        }
        if ((i12 & 2) != 0) {
            i11 = c4207h6.f38372b;
        }
        if ((i12 & 4) != 0) {
            z11 = c4207h6.f38373c;
        }
        if ((i12 & 8) != 0) {
            z12 = c4207h6.f38374d;
        }
        if ((i12 & 16) != 0) {
            documentScannerError = c4207h6.f38375e;
        }
        if ((i12 & 32) != 0) {
            th2 = c4207h6.f38376f;
        }
        DocumentScannerError documentScannerError2 = documentScannerError;
        Throwable th3 = th2;
        return c4207h6.copy(str, i11, z11, z12, documentScannerError2, th3);
    }

    public final C4207h6 copy(String documentSide, int i11, boolean z11, boolean z12, DocumentScannerError error, Throwable th2) {
        p013kotlin.jvm.internal.s.k(documentSide, "documentSide");
        p013kotlin.jvm.internal.s.k(error, "error");
        return new C4207h6(documentSide, i11, z11, z12, error, th2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4207h6)) {
            return false;
        }
        C4207h6 c4207h6 = (C4207h6) obj;
        return p013kotlin.jvm.internal.s.f(this.f38371a, c4207h6.f38371a) && this.f38372b == c4207h6.f38372b && this.f38373c == c4207h6.f38373c && this.f38374d == c4207h6.f38374d && this.f38375e == c4207h6.f38375e && p013kotlin.jvm.internal.s.f(this.f38376f, c4207h6.f38376f);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map<String, Object> getAttributes() {
        String throwableDescription;
        Map mapC = p013kotlin.collections.v0.c();
        String strName = this.f38375e.name();
        Locale ROOT = Locale.ROOT;
        p013kotlin.jvm.internal.s.j(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        mapC.put(AnalyticsAttribute.Error, lowerCase);
        Throwable th2 = this.f38376f;
        if (th2 == null || (throwableDescription = AbstractC4167c6.getThrowableDescription(th2)) == null) {
            throwableDescription = AnalyticsAttribute.NotAvailable;
        }
        mapC.put(AnalyticsAttribute.Reason, throwableDescription);
        mapC.put("step_index", Integer.valueOf(this.f38372b));
        mapC.put("document_side", this.f38371a);
        mapC.put("tilted", Boolean.valueOf(this.f38373c));
        mapC.put("autodetect_available", Boolean.valueOf(this.f38374d));
        return p013kotlin.collections.v0.b(mapC);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return this.f38377g;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return this.f38378h;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f38371a.hashCode() * 31) + Integer.hashCode(this.f38372b)) * 31) + Boolean.hashCode(this.f38373c)) * 31) + Boolean.hashCode(this.f38374d)) * 31) + this.f38375e.hashCode()) * 31;
        Throwable th2 = this.f38376f;
        return iHashCode + (th2 == null ? 0 : th2.hashCode());
    }

    public String toString() {
        return "ScanFailed(documentSide=" + this.f38371a + ", stepIndex=" + this.f38372b + ", tilted=" + this.f38373c + ", autoDetectAvailable=" + this.f38374d + ", error=" + this.f38375e + ", reason=" + this.f38376f + ")";
    }
}
