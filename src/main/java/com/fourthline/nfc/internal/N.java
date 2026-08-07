package com.fourthline.nfc.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.NewAnalyticsEvent;
import com.fourthline.nfc.NfcScannerError;
import com.fourthline.nfc.NfcScannerStep;
import java.util.Locale;
import java.util.Map;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class N implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NfcScannerError f24609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f24610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NfcScannerStep f24611c;

    public N(NfcScannerError error, Throwable th2, NfcScannerStep step) {
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(step, "step");
        this.f24609a = error;
        this.f24610b = th2;
        this.f24611c = step;
    }

    private final String a(Throwable th2) {
        String simpleName = th2.getClass().getSimpleName();
        p013kotlin.jvm.internal.s.j(simpleName, "getSimpleName(...)");
        String message = th2.getMessage();
        if (message != null) {
            String str = simpleName + ": " + message;
            if (str != null) {
                return str;
            }
        }
        return simpleName;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n11 = (N) obj;
        return this.f24609a == n11.f24609a && p013kotlin.jvm.internal.s.f(this.f24610b, n11.f24610b) && this.f24611c == n11.f24611c;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map getAttributes() {
        String strA;
        String strName = this.f24609a.name();
        Locale ROOT = Locale.ROOT;
        p013kotlin.jvm.internal.s.j(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        Pair pairA = jn0.x.a(AnalyticsAttribute.Error, lowerCase);
        Throwable th2 = this.f24610b;
        if (th2 == null || (strA = a(th2)) == null) {
            strA = AnalyticsAttribute.NotAvailable;
        }
        Pair pairA2 = jn0.x.a(AnalyticsAttribute.Reason, strA);
        String strName2 = this.f24611c.name();
        p013kotlin.jvm.internal.s.j(ROOT, "ROOT");
        String lowerCase2 = strName2.toLowerCase(ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase2, "toLowerCase(...)");
        return p013kotlin.collections.v0.m(pairA, pairA2, jn0.x.a("step_type", lowerCase2));
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return "nfc_scan_failed";
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return "iglu:com.fourthline.sdk/nfc_scan_failed/jsonschema/1-0-0";
    }

    public int hashCode() {
        int iHashCode = this.f24609a.hashCode() * 31;
        Throwable th2 = this.f24610b;
        return ((iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31) + this.f24611c.hashCode();
    }

    public String toString() {
        return "ScanFailed(error=" + this.f24609a + ", reason=" + this.f24610b + ", step=" + this.f24611c + ")";
    }
}
