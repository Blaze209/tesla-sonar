package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.TimedAnalyticsEvent;
import java.util.Map;

/* JADX INFO: renamed from: com.fourthline.orca.internal.cp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3141cp implements InterfaceC3354ho.a, TimedAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f30960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f30962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f30963e;

    public C3141cp(String name, long j11) {
        p013kotlin.jvm.internal.s.k(name, "name");
        this.f30959a = name;
        this.f30960b = j11;
        this.f30961c = "iglu:com.fourthline.sdk/screen_forward/jsonschema/1-0-0";
        this.f30962d = "screen_forward";
        this.f30963e = p013kotlin.collections.v0.m(jn0.x.a("name", a()), jn0.x.a(AnalyticsAttribute.ElapsedTime, Long.valueOf(getElapsedTime())));
    }

    public String a() {
        return this.f30959a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3141cp)) {
            return false;
        }
        C3141cp c3141cp = (C3141cp) obj;
        return p013kotlin.jvm.internal.s.f(this.f30959a, c3141cp.f30959a) && this.f30960b == c3141cp.f30960b;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map getAttributes() {
        return this.f30963e;
    }

    @Override // com.fourthline.analytics.internal.TimedAnalyticsEvent
    public long getElapsedTime() {
        return this.f30960b;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return this.f30962d;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return this.f30961c;
    }

    public int hashCode() {
        return (this.f30959a.hashCode() * 31) + Long.hashCode(this.f30960b);
    }

    public String toString() {
        return "ScreenForward(name=" + this.f30959a + ", elapsedTime=" + this.f30960b + ")";
    }
}
