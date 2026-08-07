package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.AnalyticsContext;

/* JADX INFO: renamed from: com.fourthline.orca.internal.bE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3082bE extends AnalyticsContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30595b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3082bE(String environment, String workflowId, String businessPartner) {
        super(AnalyticsContext.Workflow);
        p013kotlin.jvm.internal.s.k(environment, "environment");
        p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
        p013kotlin.jvm.internal.s.k(businessPartner, "businessPartner");
        this.f30594a = AnalyticsContext.Workflow;
        this.f30595b = "iglu:com.fourthline.sdk/workflow/jsonschema/1-0-0";
        set(AnalyticsAttribute.Environment, environment);
        set(AnalyticsAttribute.WorkflowId, workflowId);
        set(AnalyticsAttribute.BusinessPartner, businessPartner);
    }

    @Override // com.fourthline.analytics.internal.AnalyticsContext
    public String getIdentifier() {
        return this.f30594a;
    }

    @Override // com.fourthline.analytics.internal.AnalyticsContext
    public String getSchema() {
        return this.f30595b;
    }
}
