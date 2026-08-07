package com.fourthline.orca.internal;

import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.analytics.TrackingConsent;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.fourthline.analytics.internal.AnalyticsInterface;
import com.fourthline.networking.NetworkEnvironment;
import com.fourthline.networking.NetworkEnvironmentKt;
import com.fourthline.orca.Orca;

/* JADX INFO: renamed from: com.fourthline.orca.internal.jo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3438jo {
    public final void a(NetworkEnvironment networkEnvironment, String workflowId, WorkflowConfigurationResponse tenantConfig, Orca.a integration) {
        p013kotlin.jvm.internal.s.k(networkEnvironment, "networkEnvironment");
        p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
        p013kotlin.jvm.internal.s.k(tenantConfig, "tenantConfig");
        p013kotlin.jvm.internal.s.k(integration, "integration");
        if (!tenantConfig.getTenant().getAnalytics().getEnabled()) {
            FourthlineAnalytics.setTrackingConsent(TrackingConsent.NOT_GRANTED);
            return;
        }
        C3082bE c3082bE = new C3082bE(NetworkEnvironmentKt.getAlias(networkEnvironment), workflowId, tenantConfig.getTenant().getName());
        FourthlineAnalytics.setTrackingConsent(TrackingConsent.GRANTED);
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.registerContext(c3082bE);
            analytics.setEventOrigin(integration.b());
            analytics.trackNew(InterfaceC3124cE.c.f30833a);
        }
    }

    public final AnalyticsContext b(String identifier) {
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            return analytics.getContext(identifier);
        }
        return null;
    }

    public final void a(InterfaceC3354ho.a event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(event);
        }
    }

    public final void a(AnalyticsContext context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.registerContext(context);
        }
    }

    public final void a(String identifier) {
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.clearContext(identifier);
        }
    }
}
