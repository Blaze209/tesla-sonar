package com.fourthline.analytics.internal;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/fourthline/analytics/internal/AnalyticsFactory;", "", "<init>", "()V", "createAnalyticsInterface", "Lcom/fourthline/analytics/internal/AnalyticsInterface;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "createAnalyticsInterface$fourthline_core_release", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AnalyticsFactory {
    public final AnalyticsInterface createAnalyticsInterface$fourthline_core_release(Context context) {
        s.k(context, "context");
        return new SnowplowAnalytics(context);
    }
}
