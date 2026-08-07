package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class J6 implements InterfaceC3354ho.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3807sD f26435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f26437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f26438e;

    public J6(String name, InterfaceC3807sD intent) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(intent, "intent");
        this.f26434a = name;
        this.f26435b = intent;
        this.f26436c = "iglu:com.fourthline.sdk/dialog_action/jsonschema/1-0-0";
        this.f26437d = "dialog_action";
        this.f26438e = p013kotlin.collections.v0.m(jn0.x.a("name", a()), jn0.x.a(AnalyticsAttribute.Intent, AbstractC3850tD.a(intent)));
    }

    public String a() {
        return this.f26434a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J6)) {
            return false;
        }
        J6 j11 = (J6) obj;
        return p013kotlin.jvm.internal.s.f(this.f26434a, j11.f26434a) && p013kotlin.jvm.internal.s.f(this.f26435b, j11.f26435b);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map getAttributes() {
        return this.f26438e;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return this.f26437d;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return this.f26436c;
    }

    public int hashCode() {
        return (this.f26434a.hashCode() * 31) + this.f26435b.hashCode();
    }

    public String toString() {
        return "DialogAction(name=" + this.f26434a + ", intent=" + this.f26435b + ")";
    }
}
