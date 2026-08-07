package com.fourthline.analytics.internal;

import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u0002`\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/fourthline/analytics/internal/NewAnalyticsEvent;", "", "schema", "", "getSchema", "()Ljava/lang/String;", "eventName", "getEventName", "attributes", "", "Lcom/fourthline/analytics/internal/AnalyticsAttributes;", "getAttributes", "()Ljava/util/Map;", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface NewAnalyticsEvent {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Map<String, Object> getAttributes(NewAnalyticsEvent newAnalyticsEvent) {
            return v0.i();
        }

        public static String getSchema(NewAnalyticsEvent newAnalyticsEvent) {
            return "";
        }
    }

    Map<String, Object> getAttributes();

    String getEventName();

    String getSchema();
}
