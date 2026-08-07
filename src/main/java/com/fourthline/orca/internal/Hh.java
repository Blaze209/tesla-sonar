package com.fourthline.orca.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class Hh implements InterfaceC3354ho.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f26114d;

    public Hh(String identifier) {
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        this.f26111a = identifier;
        this.f26112b = "iglu:com.fourthline.sdk/input_changed/jsonschema/1-0-0";
        this.f26113c = "input_changed";
        this.f26114d = p013kotlin.collections.v0.f(jn0.x.a("name", identifier));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Hh) && p013kotlin.jvm.internal.s.f(this.f26111a, ((Hh) obj).f26111a);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map getAttributes() {
        return this.f26114d;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return this.f26113c;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return this.f26112b;
    }

    public int hashCode() {
        return this.f26111a.hashCode();
    }

    public String toString() {
        return "InputChanged(identifier=" + this.f26111a + ")";
    }
}
