package com.fourthline.analytics.internal;

import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u0007HÆ\u0003J/\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR&\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/fourthline/analytics/internal/CustomEvent;", "Lcom/fourthline/analytics/internal/NewAnalyticsEvent;", "eventName", "", "attributes", "", "", "Lcom/fourthline/analytics/internal/AnalyticsAttributes;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getEventName", "()Ljava/lang/String;", "getAttributes", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CustomEvent implements NewAnalyticsEvent {
    private final Map<String, Object> attributes;
    private final String eventName;

    public CustomEvent(String eventName, Map<String, ? extends Object> attributes) {
        s.k(eventName, "eventName");
        s.k(attributes, "attributes");
        this.eventName = eventName;
        this.attributes = attributes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomEvent copy$default(CustomEvent customEvent, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = customEvent.eventName;
        }
        if ((i11 & 2) != 0) {
            map = customEvent.attributes;
        }
        return customEvent.copy(str, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    public final Map<String, Object> component2() {
        return this.attributes;
    }

    public final CustomEvent copy(String eventName, Map<String, ? extends Object> attributes) {
        s.k(eventName, "eventName");
        s.k(attributes, "attributes");
        return new CustomEvent(eventName, attributes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomEvent)) {
            return false;
        }
        CustomEvent customEvent = (CustomEvent) other;
        return s.f(this.eventName, customEvent.eventName) && s.f(this.attributes, customEvent.attributes);
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
        return NewAnalyticsEvent.DefaultImpls.getSchema(this);
    }

    public int hashCode() {
        return (this.eventName.hashCode() * 31) + this.attributes.hashCode();
    }

    public String toString() {
        return "CustomEvent(eventName=" + this.eventName + ", attributes=" + this.attributes + ")";
    }

    public /* synthetic */ CustomEvent(String str, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? v0.i() : map);
    }
}
