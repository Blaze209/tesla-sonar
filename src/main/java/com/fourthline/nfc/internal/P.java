package com.fourthline.nfc.internal;

import com.fourthline.analytics.internal.NewAnalyticsEvent;
import com.fourthline.nfc.NfcScannerStep;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class P implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NfcScannerStep f24615a;

    public P(NfcScannerStep step) {
        p013kotlin.jvm.internal.s.k(step, "step");
        this.f24615a = step;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof P) && this.f24615a == ((P) obj).f24615a;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map getAttributes() {
        String strName = this.f24615a.name();
        Locale ROOT = Locale.ROOT;
        p013kotlin.jvm.internal.s.j(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        return p013kotlin.collections.v0.f(jn0.x.a("step_type", lowerCase));
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return "nfc_scan_step_started";
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return "iglu:com.fourthline.sdk/nfc_scan_step_started/jsonschema/1-0-0";
    }

    public int hashCode() {
        return this.f24615a.hashCode();
    }

    public String toString() {
        return "ScanStepStarted(step=" + this.f24615a + ")";
    }
}
