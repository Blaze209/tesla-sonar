package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsContext;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ik, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3392ik extends AnalyticsContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32556b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3392ik(String name) {
        super(name);
        p013kotlin.jvm.internal.s.k(name, "name");
        this.f32555a = AnalyticsContext.Flow;
        this.f32556b = "iglu:com.fourthline.sdk/flow/jsonschema/1-0-0";
        set("name", name);
    }

    @Override // com.fourthline.analytics.internal.AnalyticsContext
    public String getIdentifier() {
        return this.f32555a;
    }

    @Override // com.fourthline.analytics.internal.AnalyticsContext
    public String getSchema() {
        return this.f32556b;
    }
}
