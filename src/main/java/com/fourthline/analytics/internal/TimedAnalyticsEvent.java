package com.fourthline.analytics.internal;

import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/fourthline/analytics/internal/TimedAnalyticsEvent;", "Lcom/fourthline/analytics/internal/NewAnalyticsEvent;", "elapsedTime", "", "getElapsedTime", "()J", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TimedAnalyticsEvent extends NewAnalyticsEvent {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Map<String, Object> getAttributes(TimedAnalyticsEvent timedAnalyticsEvent) {
            return NewAnalyticsEvent.DefaultImpls.getAttributes(timedAnalyticsEvent);
        }

        public static String getSchema(TimedAnalyticsEvent timedAnalyticsEvent) {
            return NewAnalyticsEvent.DefaultImpls.getSchema(timedAnalyticsEvent);
        }
    }

    long getElapsedTime();
}
