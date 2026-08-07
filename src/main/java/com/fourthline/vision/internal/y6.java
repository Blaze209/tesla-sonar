package com.fourthline.vision.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.NewAnalyticsEvent;
import com.fourthline.vision.selfie.SelfieScannerError;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class y6 implements NewAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SelfieScannerError f39137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f39138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f39139c;

    public y6(SelfieScannerError error, Throwable th2, String stepType) {
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(stepType, "stepType");
        this.f39137a = error;
        this.f39138b = th2;
        this.f39139c = stepType;
    }

    private final SelfieScannerError component1() {
        return this.f39137a;
    }

    private final Throwable component2() {
        return this.f39138b;
    }

    private final String component3() {
        return this.f39139c;
    }

    public static /* synthetic */ y6 copy$default(y6 y6Var, SelfieScannerError selfieScannerError, Throwable th2, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            selfieScannerError = y6Var.f39137a;
        }
        if ((i11 & 2) != 0) {
            th2 = y6Var.f39138b;
        }
        if ((i11 & 4) != 0) {
            str = y6Var.f39139c;
        }
        return y6Var.copy(selfieScannerError, th2, str);
    }

    public final y6 copy(SelfieScannerError error, Throwable th2, String stepType) {
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(stepType, "stepType");
        return new y6(error, th2, stepType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6)) {
            return false;
        }
        y6 y6Var = (y6) obj;
        return this.f39137a == y6Var.f39137a && p013kotlin.jvm.internal.s.f(this.f39138b, y6Var.f39138b) && p013kotlin.jvm.internal.s.f(this.f39139c, y6Var.f39139c);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map<String, Object> getAttributes() {
        String throwableDescription;
        Map mapC = p013kotlin.collections.v0.c();
        String strName = this.f39137a.name();
        Locale ROOT = Locale.ROOT;
        p013kotlin.jvm.internal.s.j(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        mapC.put(AnalyticsAttribute.Error, lowerCase);
        Throwable th2 = this.f39138b;
        if (th2 == null || (throwableDescription = AbstractC4167c6.getThrowableDescription(th2)) == null) {
            throwableDescription = AnalyticsAttribute.NotAvailable;
        }
        mapC.put(AnalyticsAttribute.Reason, throwableDescription);
        mapC.put("step_type", this.f39139c);
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
        int iHashCode = this.f39137a.hashCode() * 31;
        Throwable th2 = this.f39138b;
        return ((iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31) + this.f39139c.hashCode();
    }

    public String toString() {
        return "ScanFailed(error=" + this.f39137a + ", reason=" + this.f39138b + ", stepType=" + this.f39139c + ")";
    }
}
