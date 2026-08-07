package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.orca.core.ProductConfig;
import com.fourthline.orca.core.ProductCustomization;
import com.fourthline.orca.core.ProductCustomizationStep;
import com.fourthline.orca.core.flavor.OrcaFlavor;
import com.fourthline.orca.document.DocumentCustomizationConfig;
import com.fourthline.orca.selfie.SelfieCustomizationConfig;
import com.fourthline.orca.workflow.DocumentComponentConfig;
import com.fourthline.orca.workflow.WorkflowSession;

/* JADX INFO: loaded from: classes4.dex */
public final class Fg implements WorkflowSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PE f25821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DocumentFlowConfig f25822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4006wx f25823c;

    public static final class a implements InterfaceC3626o3 {
        a() {
        }

        @Override // com.fourthline.orca.internal.InterfaceC3626o3
        public void onProductFailed(Throwable th2) {
            InterfaceC3626o3.a.a((InterfaceC3626o3) this, th2);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3626o3
        public void onProductStart(ProductConfig productConfig, ProductCustomization productCustomization) {
            InterfaceC3626o3.a.a(this, productConfig, productCustomization);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3626o3
        public void onProductSuccess(Object obj) {
            InterfaceC3626o3.a.a(this, obj);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3354ho
        public void track(InterfaceC3626o3.b bVar) {
            InterfaceC3626o3.a.a((InterfaceC3626o3) this, bVar);
        }
    }

    public Fg(PE sessionConfig, DocumentFlowConfig documentFlowConfig, C4006wx selfieFlowConfig) {
        p013kotlin.jvm.internal.s.k(sessionConfig, "sessionConfig");
        p013kotlin.jvm.internal.s.k(documentFlowConfig, "documentFlowConfig");
        p013kotlin.jvm.internal.s.k(selfieFlowConfig, "selfieFlowConfig");
        this.f25821a = sessionConfig;
        this.f25822b = documentFlowConfig;
        this.f25823c = selfieFlowConfig;
    }

    public final PE a() {
        return this.f25821a;
    }

    @Override // com.fourthline.orca.workflow.WorkflowSession
    public ProductCustomizationStep biometricsComponent(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Os os2 = new Os(context, new C3619nx(this.f25823c), new D6(new Y2()), new SelfieCustomizationConfig(new OrcaFlavor(null, null, null, null, null, 31, null)), this.f25821a.c(), new a());
        os2.a("tenantConfig", this.f25821a.e());
        return os2;
    }

    @Override // com.fourthline.orca.workflow.WorkflowSession
    public ProductCustomizationStep documentComponent(Context context, DocumentComponentConfig config) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(config, "config");
        return new Os(context, new C3340ha(config.getType(), config.getIssuingCountry(), this.f25822b, this.f25821a.e()), new D6(new C7()), new DocumentCustomizationConfig(new OrcaFlavor(null, null, null, null, null, 31, null)), this.f25821a.c(), null, 32, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fg)) {
            return false;
        }
        Fg fg2 = (Fg) obj;
        return p013kotlin.jvm.internal.s.f(this.f25821a, fg2.f25821a) && p013kotlin.jvm.internal.s.f(this.f25822b, fg2.f25822b) && p013kotlin.jvm.internal.s.f(this.f25823c, fg2.f25823c);
    }

    public int hashCode() {
        return (((this.f25821a.hashCode() * 31) + this.f25822b.hashCode()) * 31) + this.f25823c.hashCode();
    }

    public String toString() {
        return "GranularProductWorkflowSession(sessionConfig=" + this.f25821a + ", documentFlowConfig=" + this.f25822b + ", selfieFlowConfig=" + this.f25823c + ")";
    }
}
