package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.TimedAnalyticsEvent;
import java.util.Map;

/* JADX INFO: renamed from: com.fourthline.orca.internal.bp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3099bp implements InterfaceC3354ho.a, TimedAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f30691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f30693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f30694e;

    public C3099bp(String name, long j11) {
        p013kotlin.jvm.internal.s.k(name, "name");
        this.f30690a = name;
        this.f30691b = j11;
        this.f30692c = "iglu:com.fourthline.sdk/screen_failed/jsonschema/1-0-0";
        this.f30693d = "screen_failed";
        this.f30694e = p013kotlin.collections.v0.m(jn0.x.a("name", a()), jn0.x.a(AnalyticsAttribute.ElapsedTime, Long.valueOf(getElapsedTime())));
    }

    public String a() {
        return this.f30690a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3099bp)) {
            return false;
        }
        C3099bp c3099bp = (C3099bp) obj;
        return p013kotlin.jvm.internal.s.f(this.f30690a, c3099bp.f30690a) && this.f30691b == c3099bp.f30691b;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map getAttributes() {
        return this.f30694e;
    }

    @Override // com.fourthline.analytics.internal.TimedAnalyticsEvent
    public long getElapsedTime() {
        return this.f30691b;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return this.f30693d;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return this.f30692c;
    }

    public int hashCode() {
        return (this.f30690a.hashCode() * 31) + Long.hashCode(this.f30691b);
    }

    public String toString() {
        return "ScreenFailed(name=" + this.f30690a + ", elapsedTime=" + this.f30691b + ")";
    }
}
