package com.fourthline.orca.internal;

import java.util.Map;

/* JADX INFO: renamed from: com.fourthline.orca.internal.rD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3764rD implements InterfaceC3354ho.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f35012b;

    public C3764rD(String name, Object value) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(value, "value");
        this.f35011a = name;
        this.f35012b = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3764rD)) {
            return false;
        }
        C3764rD c3764rD = (C3764rD) obj;
        return p013kotlin.jvm.internal.s.f(this.f35011a, c3764rD.f35011a) && p013kotlin.jvm.internal.s.f(this.f35012b, c3764rD.f35012b);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map getAttributes() {
        return p013kotlin.collections.v0.m(jn0.x.a("name", this.f35011a), jn0.x.a("value", this.f35012b.toString()));
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return "value_selected";
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return "iglu:com.fourthline.sdk/value_selected/jsonschema/1-0-0";
    }

    public int hashCode() {
        return (this.f35011a.hashCode() * 31) + this.f35012b.hashCode();
    }

    public String toString() {
        return "ValueSelected(name=" + this.f35011a + ", value=" + this.f35012b + ")";
    }
}
