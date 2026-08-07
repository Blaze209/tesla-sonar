package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class Jh implements InterfaceC3354ho.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Th f26467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f26469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f26470e;

    public Jh(String identifier, Th error) {
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        p013kotlin.jvm.internal.s.k(error, "error");
        this.f26466a = identifier;
        this.f26467b = error;
        this.f26468c = "iglu:com.fourthline.sdk/input_invalid/jsonschema/1-0-0";
        this.f26469d = "input_invalid";
        Map mapC = p013kotlin.collections.v0.c();
        mapC.put("name", identifier);
        mapC.put(AnalyticsAttribute.Reason, error.getAlias());
        this.f26470e = p013kotlin.collections.v0.b(mapC);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jh)) {
            return false;
        }
        Jh jh2 = (Jh) obj;
        return p013kotlin.jvm.internal.s.f(this.f26466a, jh2.f26466a) && p013kotlin.jvm.internal.s.f(this.f26467b, jh2.f26467b);
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map getAttributes() {
        return this.f26470e;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return this.f26469d;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return this.f26468c;
    }

    public int hashCode() {
        return (this.f26466a.hashCode() * 31) + this.f26467b.hashCode();
    }

    public String toString() {
        return "InputValidated(identifier=" + this.f26466a + ", error=" + this.f26467b + ")";
    }
}
