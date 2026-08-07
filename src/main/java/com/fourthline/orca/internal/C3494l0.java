package com.fourthline.orca.internal;

import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.fourthline.analytics.internal.AnalyticsInterface;

/* JADX INFO: renamed from: com.fourthline.orca.internal.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3494l0 {
    public final C3687pf a() {
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        AnalyticsContext context = analytics != null ? analytics.getContext(AnalyticsContext.Features) : null;
        C3687pf c3687pf = context instanceof C3687pf ? (C3687pf) context : null;
        return c3687pf == null ? new C3687pf() : c3687pf;
    }

    public final C3438jo a(C3687pf featuresAnalyticsContext) {
        p013kotlin.jvm.internal.s.k(featuresAnalyticsContext, "featuresAnalyticsContext");
        C3438jo c3438jo = new C3438jo();
        c3438jo.a(featuresAnalyticsContext);
        return c3438jo;
    }

    public final InterfaceC3692pk a(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new Oo(tracker, null, null, 6, null);
    }
}
