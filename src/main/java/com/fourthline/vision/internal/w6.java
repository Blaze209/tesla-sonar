package com.fourthline.vision.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.NewAnalyticsEvent;
import com.fourthline.vision.selfie.SelfieScannerError;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class w6 implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SelfieScannerError f39061a;

    public w6(SelfieScannerError error) {
        p013kotlin.jvm.internal.s.k(error, "error");
        this.f39061a = error;
    }

    private final SelfieScannerError component1() {
        return this.f39061a;
    }

    public static /* synthetic */ w6 copy$default(w6 w6Var, SelfieScannerError selfieScannerError, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            selfieScannerError = w6Var.f39061a;
        }
        return w6Var.copy(selfieScannerError);
    }

    public final w6 copy(SelfieScannerError error) {
        p013kotlin.jvm.internal.s.k(error, "error");
        return new w6(error);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w6) && this.f39061a == ((w6) obj).f39061a;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map<String, Object> getAttributes() {
        Map mapC = p013kotlin.collections.v0.c();
        String strName = this.f39061a.name();
        Locale ROOT = Locale.ROOT;
        p013kotlin.jvm.internal.s.j(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        mapC.put(AnalyticsAttribute.Error, lowerCase);
        return p013kotlin.collections.v0.b(mapC);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return "selfie_scan_failed";
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return "iglu:com.fourthline.sdk/selfie_scan_failed/jsonschema/1-0-0";
    }

    public int hashCode() {
        return this.f39061a.hashCode();
    }

    public String toString() {
        return "PermissionMissing(error=" + this.f39061a + ")";
    }
}
