package com.fourthline.orca.internal;

import java.util.Map;

/* JADX INFO: renamed from: com.fourthline.orca.internal.dp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3183dp implements InterfaceC3354ho.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f31223d;

    public C3183dp(String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        this.f31220a = name;
        this.f31221b = "iglu:com.fourthline.sdk/screen_started/jsonschema/1-0-0";
        this.f31222c = "screen_started";
        this.f31223d = p013kotlin.collections.v0.f(jn0.x.a("name", a()));
    }

    public String a() {
        return this.f31220a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3183dp) && p013kotlin.jvm.internal.s.f(this.f31220a, ((C3183dp) obj).f31220a);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map getAttributes() {
        return this.f31223d;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return this.f31222c;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return this.f31221b;
    }

    public int hashCode() {
        return this.f31220a.hashCode();
    }

    public String toString() {
        return "ScreenStarted(name=" + this.f31220a + ")";
    }
}
