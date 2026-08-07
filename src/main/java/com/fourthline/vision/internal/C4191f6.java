package com.fourthline.vision.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.NewAnalyticsEvent;
import com.fourthline.vision.document.DocumentScannerError;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: com.fourthline.vision.internal.f6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4191f6 implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentScannerError f38313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f38315c;

    public C4191f6(DocumentScannerError error) {
        p013kotlin.jvm.internal.s.k(error, "error");
        this.f38313a = error;
        this.f38314b = "document_scan_failed";
        this.f38315c = "iglu:com.fourthline.sdk/document_scan_failed/jsonschema/1-0-0";
    }

    private final DocumentScannerError component1() {
        return this.f38313a;
    }

    public static /* synthetic */ C4191f6 copy$default(C4191f6 c4191f6, DocumentScannerError documentScannerError, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            documentScannerError = c4191f6.f38313a;
        }
        return c4191f6.copy(documentScannerError);
    }

    public final C4191f6 copy(DocumentScannerError error) {
        p013kotlin.jvm.internal.s.k(error, "error");
        return new C4191f6(error);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4191f6) && this.f38313a == ((C4191f6) obj).f38313a;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map<String, Object> getAttributes() {
        Map mapC = p013kotlin.collections.v0.c();
        String strName = this.f38313a.name();
        Locale ROOT = Locale.ROOT;
        p013kotlin.jvm.internal.s.j(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        mapC.put(AnalyticsAttribute.Error, lowerCase);
        return p013kotlin.collections.v0.b(mapC);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return this.f38314b;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return this.f38315c;
    }

    public int hashCode() {
        return this.f38313a.hashCode();
    }

    public String toString() {
        return "PermissionMissing(error=" + this.f38313a + ")";
    }
}
