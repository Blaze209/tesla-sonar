package com.fourthline.orca.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class Ih implements InterfaceC3354ho.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f26310d;

    public Ih(String identifier) {
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        this.f26307a = identifier;
        this.f26308b = "iglu:com.fourthline.sdk/input_prefilled/jsonschema/1-0-0";
        this.f26309c = "input_prefilled";
        this.f26310d = p013kotlin.collections.v0.f(jn0.x.a("name", identifier));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ih) && p013kotlin.jvm.internal.s.f(this.f26307a, ((Ih) obj).f26307a);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map getAttributes() {
        return this.f26310d;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return this.f26309c;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return this.f26308b;
    }

    public int hashCode() {
        return this.f26307a.hashCode();
    }

    public String toString() {
        return "InputPrefilled(identifier=" + this.f26307a + ")";
    }
}
