package com.fourthline.orca.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class K6 implements InterfaceC3354ho.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f26549d;

    public K6(String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        this.f26546a = name;
        this.f26547b = "iglu:com.fourthline.sdk/dialog_started/jsonschema/1-0-0";
        this.f26548c = "dialog_started";
        this.f26549d = p013kotlin.collections.v0.f(jn0.x.a("name", a()));
    }

    public String a() {
        return this.f26546a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof K6) && p013kotlin.jvm.internal.s.f(this.f26546a, ((K6) obj).f26546a);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map getAttributes() {
        return this.f26549d;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return this.f26548c;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return this.f26547b;
    }

    public int hashCode() {
        return this.f26546a.hashCode();
    }

    public String toString() {
        return "DialogStarted(name=" + this.f26546a + ")";
    }
}
