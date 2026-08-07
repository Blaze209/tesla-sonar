package com.fourthline.orca.internal;

import android.os.SystemClock;
import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.fourthline.analytics.internal.AnalyticsInterface;
import com.fourthline.networking.NetworkEnvironment;
import com.fourthline.networking.NetworkEnvironmentKt;
import com.fourthline.orca.core.ProductConfig;
import com.fourthline.orca.core.ProductCustomization;
import com.fourthline.orca.core.flavor.OrcaFlavor;
import com.fourthline.orca.core.flavor.OrcaLocalization;
import com.fourthline.orca.workflow.WorkflowConfig;
import java.util.Map;
import p013kotlin.Pair;

/* JADX INFO: renamed from: com.fourthline.orca.internal.eE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3209eE implements InterfaceC3626o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Long f31367a;

    public C3209eE() {
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.setEventOrigin(AnalyticsContext.Workflow);
        }
    }

    private final long a() {
        return SystemClock.uptimeMillis();
    }

    private final long b() {
        Long l11 = this.f31367a;
        if (l11 == null) {
            return -1L;
        }
        return a() - l11.longValue();
    }

    private final void c() {
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.setEventOrigin(null);
        }
    }

    @Override // com.fourthline.orca.internal.InterfaceC3626o3
    public void onProductFailed(Throwable error) {
        p013kotlin.jvm.internal.s.k(error, "error");
        C3103bt.a(C3103bt.f30707a, "workflow_failed", null, p013kotlin.collections.v0.m(jn0.x.a("elapsedTime", Long.valueOf(b())), jn0.x.a("orca_error", error.toString())), 2, null);
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(new InterfaceC3124cE.d(error, b()));
        }
        c();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3626o3
    public void onProductStart(ProductConfig productConfig, ProductCustomization customization) {
        p013kotlin.jvm.internal.s.k(productConfig, "productConfig");
        p013kotlin.jvm.internal.s.k(customization, "customization");
        this.f31367a = Long.valueOf(a());
        OrcaFlavor orcaFlavor = new OrcaFlavor(null, null, null, null, null, 31, null);
        OrcaFlavor flavor = customization.getFlavor();
        Pair pairA = jn0.x.a("uses_custom_fonts", Boolean.valueOf(!p013kotlin.jvm.internal.s.f(flavor.getFonts(), orcaFlavor.getFonts())));
        Pair pairA2 = jn0.x.a("uses_custom_colors", Boolean.valueOf((p013kotlin.jvm.internal.s.f(flavor.getColorsLight(), orcaFlavor.getColorsLight()) && p013kotlin.jvm.internal.s.f(flavor.getColorsDark(), orcaFlavor.getColorsDark())) ? false : true));
        Pair pairA3 = jn0.x.a("uses_custom_localization", Boolean.valueOf(!p013kotlin.jvm.internal.s.f(flavor.getLocalization(), orcaFlavor.getLocalization())));
        Pair pairA4 = jn0.x.a("base_language", flavor.getLocalization().getBaseLanguage().getLanguageCode());
        OrcaLocalization.LanguageType fixedLanguage = flavor.getLocalization().getFixedLanguage();
        Map mapM = p013kotlin.collections.v0.m(pairA, pairA2, pairA3, pairA4, jn0.x.a("fixed_language", fixedLanguage != null ? fixedLanguage.getLanguageCode() : null));
        WorkflowConfig workflowConfig = productConfig instanceof WorkflowConfig ? (WorkflowConfig) productConfig : null;
        NetworkEnvironment networkEnvironment = workflowConfig != null ? workflowConfig.getNetworkEnvironment() : null;
        C3103bt.a(C3103bt.f30707a, "workflow_started", null, p013kotlin.collections.v0.m(jn0.x.a("flavor", mapM), jn0.x.a("network_config", networkEnvironment != null ? NetworkEnvironmentKt.getAlias(networkEnvironment) : null)), 2, null);
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(InterfaceC3124cE.e.f30841a);
        }
    }

    @Override // com.fourthline.orca.internal.InterfaceC3626o3
    public void onProductSuccess(Object result) {
        p013kotlin.jvm.internal.s.k(result, "result");
        C3103bt.a(C3103bt.f30707a, "workflow_completed", null, p013kotlin.collections.v0.f(jn0.x.a("elapsedTime", Long.valueOf(b()))), 2, null);
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(new InterfaceC3124cE.b(b()));
        }
        c();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3354ho
    public void track(InterfaceC3626o3.b bVar) {
        InterfaceC3626o3.a.a((InterfaceC3626o3) this, bVar);
    }
}
