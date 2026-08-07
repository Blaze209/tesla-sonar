package com.fourthline.analytics.internal;

import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000ej\u0002`\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/fourthline/analytics/internal/AppGenericEvent;", "Lcom/fourthline/analytics/internal/NewAnalyticsEvent;", "name", "", "throwable", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "eventName", "getEventName", "()Ljava/lang/String;", "schema", "getSchema", "attributes", "", "", "Lcom/fourthline/analytics/internal/AnalyticsAttributes;", "getAttributes", "()Ljava/util/Map;", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppGenericEvent implements NewAnalyticsEvent {
    private final Map<String, Object> attributes;
    private final String eventName;
    private final String schema;

    public AppGenericEvent(String name, Throwable th2) {
        s.k(name, "name");
        this.eventName = "app_event";
        this.schema = "iglu:com.fourthline.sdk/app_event/jsonschema/1-0-0";
        Map mapC = v0.c();
        mapC.put("name", name);
        if (th2 != null) {
            mapC.put(AnalyticsAttribute.Error, th2.getMessage());
            Throwable cause = th2.getCause();
            if (cause != null) {
                mapC.put(AnalyticsAttribute.Reason, cause.getMessage());
            }
        }
        this.attributes = v0.b(mapC);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map<String, Object> getAttributes() {
        return this.attributes;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return this.eventName;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return this.schema;
    }

    public /* synthetic */ AppGenericEvent(String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : th2);
    }
}
