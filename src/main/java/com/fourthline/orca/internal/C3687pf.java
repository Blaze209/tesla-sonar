package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsContext;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.pf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3687pf extends AnalyticsContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f34517c;

    public C3687pf() {
        super(AnalyticsContext.Features);
        this.f34515a = AnalyticsContext.Features;
        this.f34516b = "iglu:com.fourthline.sdk/features/jsonschema/1-0-0";
        this.f34517c = new ArrayList();
        a();
    }

    public final void a(List variants) {
        p013kotlin.jvm.internal.s.k(variants, "variants");
        this.f34517c.addAll(variants);
    }

    @Override // com.fourthline.analytics.internal.AnalyticsContext
    public String getIdentifier() {
        return this.f34515a;
    }

    @Override // com.fourthline.analytics.internal.AnalyticsContext
    public String getSchema() {
        return this.f34516b;
    }

    public final void a() {
        set("variants", p013kotlin.collections.v.m1(this.f34517c));
    }
}
