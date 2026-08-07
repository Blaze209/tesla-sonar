package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.TimedAnalyticsEvent;
import java.util.Map;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ap, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3056ap implements InterfaceC3354ho.a, TimedAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f30459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f30461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f30462e;

    public C3056ap(String name, long j11) {
        p013kotlin.jvm.internal.s.k(name, "name");
        this.f30458a = name;
        this.f30459b = j11;
        this.f30460c = "iglu:com.fourthline.sdk/screen_backward/jsonschema/1-0-0";
        this.f30461d = "screen_backward";
        this.f30462e = p013kotlin.collections.v0.m(jn0.x.a("name", a()), jn0.x.a(AnalyticsAttribute.ElapsedTime, Long.valueOf(getElapsedTime())));
    }

    public String a() {
        return this.f30458a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3056ap)) {
            return false;
        }
        C3056ap c3056ap = (C3056ap) obj;
        return p013kotlin.jvm.internal.s.f(this.f30458a, c3056ap.f30458a) && this.f30459b == c3056ap.f30459b;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map getAttributes() {
        return this.f30462e;
    }

    @Override // com.fourthline.analytics.internal.TimedAnalyticsEvent
    public long getElapsedTime() {
        return this.f30459b;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return this.f30461d;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return this.f30460c;
    }

    public int hashCode() {
        return (this.f30458a.hashCode() * 31) + Long.hashCode(this.f30459b);
    }

    public String toString() {
        return "ScreenBackward(name=" + this.f30458a + ", elapsedTime=" + this.f30459b + ")";
    }
}
