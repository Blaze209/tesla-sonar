package com.fourthline.orca.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class Nk implements InterfaceC3354ho.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27058b;

    public Nk(String name, int i11) {
        p013kotlin.jvm.internal.s.k(name, "name");
        this.f27057a = name;
        this.f27058b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nk)) {
            return false;
        }
        Nk nk2 = (Nk) obj;
        return p013kotlin.jvm.internal.s.f(this.f27057a, nk2.f27057a) && this.f27058b == nk2.f27058b;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map getAttributes() {
        return p013kotlin.collections.v0.m(jn0.x.a("name", this.f27057a), jn0.x.a("request_size", Integer.valueOf(this.f27058b)));
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return "network_request_started";
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return "iglu:com.fourthline.sdk/network_request_started/jsonschema/1-0-0";
    }

    public int hashCode() {
        return (this.f27057a.hashCode() * 31) + Integer.hashCode(this.f27058b);
    }

    public String toString() {
        return "RequestStarted(name=" + this.f27057a + ", requestSize=" + this.f27058b + ")";
    }
}
