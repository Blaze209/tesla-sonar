package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.TimedAnalyticsEvent;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class Lk implements InterfaceC3354ho.a, TimedAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f26823d;

    public Lk(String name, int i11, int i12, long j11) {
        p013kotlin.jvm.internal.s.k(name, "name");
        this.f26820a = name;
        this.f26821b = i11;
        this.f26822c = i12;
        this.f26823d = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Lk)) {
            return false;
        }
        Lk lk2 = (Lk) obj;
        return p013kotlin.jvm.internal.s.f(this.f26820a, lk2.f26820a) && this.f26821b == lk2.f26821b && this.f26822c == lk2.f26822c && this.f26823d == lk2.f26823d;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map getAttributes() {
        return p013kotlin.collections.v0.m(jn0.x.a("name", this.f26820a), jn0.x.a(AnalyticsAttribute.ElapsedTime, Long.valueOf(getElapsedTime())), jn0.x.a("status_code", Integer.valueOf(this.f26822c)), jn0.x.a("request_size", Integer.valueOf(this.f26821b)));
    }

    @Override // com.fourthline.analytics.internal.TimedAnalyticsEvent
    public long getElapsedTime() {
        return this.f26823d;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return "network_request_completed";
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return "iglu:com.fourthline.sdk/network_request_completed/jsonschema/1-0-0";
    }

    public int hashCode() {
        return (((((this.f26820a.hashCode() * 31) + Integer.hashCode(this.f26821b)) * 31) + Integer.hashCode(this.f26822c)) * 31) + Long.hashCode(this.f26823d);
    }

    public String toString() {
        return "RequestCompleted(name=" + this.f26820a + ", requestSize=" + this.f26821b + ", statusCode=" + this.f26822c + ", elapsedTime=" + this.f26823d + ")";
    }
}
