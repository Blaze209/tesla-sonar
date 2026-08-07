package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsContext;

/* JADX INFO: renamed from: com.fourthline.orca.internal.cx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3149cx extends AnalyticsContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31029b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3149cx(String name) {
        super(name);
        p013kotlin.jvm.internal.s.k(name, "name");
        this.f31028a = AnalyticsContext.Screen;
        this.f31029b = "iglu:com.fourthline.sdk/screen/jsonschema/1-0-0";
        set("name", name);
    }

    @Override // com.fourthline.analytics.internal.AnalyticsContext
    public String getIdentifier() {
        return this.f31028a;
    }

    @Override // com.fourthline.analytics.internal.AnalyticsContext
    public String getSchema() {
        return this.f31029b;
    }
}
