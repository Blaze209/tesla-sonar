package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsContext;

/* JADX INFO: loaded from: classes4.dex */
public final class Q6 extends AnalyticsContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27422b;

    public Q6(boolean z11) {
        super(AnalyticsContext.Analysis);
        this.f27421a = AnalyticsContext.Analysis;
        this.f27422b = "iglu:com.fourthline.sdk/analysis/jsonschema/1-0-0";
        set("enabled", Boolean.valueOf(z11));
    }

    @Override // com.fourthline.analytics.internal.AnalyticsContext
    public String getIdentifier() {
        return this.f27421a;
    }

    @Override // com.fourthline.analytics.internal.AnalyticsContext
    public String getSchema() {
        return this.f27422b;
    }
}
