package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.analytics.TrackingConsent;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ko, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3481ko {
    public static final void a(Context context) throws Throwable {
        p013kotlin.jvm.internal.s.k(context, "context");
        FourthlineAnalytics.initialize(FourthlineAnalytics.FOURTHLINE_TENANT_ID, context);
        FourthlineAnalytics.setTrackingConsent(TrackingConsent.PENDING);
    }
}
