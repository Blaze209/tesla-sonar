package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.orca.core.ProductConfig;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3340ha implements ProductConfig, Rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentType f32255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DocumentFlowConfig f32257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WorkflowConfigurationResponse f32258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f32259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f32260f;

    public C3340ha(DocumentType type, String str, DocumentFlowConfig flowConfig, WorkflowConfigurationResponse tenantConfig) {
        p013kotlin.jvm.internal.s.k(type, "type");
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        p013kotlin.jvm.internal.s.k(tenantConfig, "tenantConfig");
        this.f32255a = type;
        this.f32256b = str;
        this.f32257c = flowConfig;
        this.f32258d = tenantConfig;
        this.f32259e = true;
        this.f32260f = flowConfig.getImageCapture().a();
    }

    @Override // com.fourthline.orca.internal.Rf
    public Do a() {
        return new B7(this);
    }

    public final DocumentFlowConfig b() {
        return this.f32257c;
    }

    public final double c() {
        return this.f32260f;
    }

    public final String d() {
        return this.f32256b;
    }

    public final WorkflowConfigurationResponse e() {
        return this.f32258d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3340ha)) {
            return false;
        }
        C3340ha c3340ha = (C3340ha) obj;
        return this.f32255a == c3340ha.f32255a && p013kotlin.jvm.internal.s.f(this.f32256b, c3340ha.f32256b) && p013kotlin.jvm.internal.s.f(this.f32257c, c3340ha.f32257c) && p013kotlin.jvm.internal.s.f(this.f32258d, c3340ha.f32258d);
    }

    public final DocumentType f() {
        return this.f32255a;
    }

    public final boolean g() {
        DocumentSettings c2969UbB;
        if (!i()) {
            return false;
        }
        IdvSettings c3218ehB = this.f32258d.getWorkflow().getIdv();
        DocumentAnalysisSettings c3758r7B = (c3218ehB == null || (c2969UbB = c3218ehB.getDocument()) == null) ? null : c2969UbB.getAnalysis();
        if (c3758r7B != null) {
            return c3758r7B.getEnabled();
        }
        return false;
    }

    public final boolean h() {
        return this.f32259e;
    }

    public int hashCode() {
        int iHashCode = this.f32255a.hashCode() * 31;
        String str = this.f32256b;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f32257c.hashCode()) * 31) + this.f32258d.hashCode();
    }

    public final boolean i() {
        DocumentType documentType = this.f32255a;
        return (documentType == DocumentType.TIN_REFERENCE_DOCUMENT || documentType == DocumentType.PROOF_OF_ADDRESS) ? false : true;
    }

    public final boolean j() {
        DocumentType documentType = this.f32255a;
        return (documentType == DocumentType.TIN_REFERENCE_DOCUMENT || documentType == DocumentType.PROOF_OF_ADDRESS) ? false : true;
    }

    public String toString() {
        return "DocumentProductConfig(type=" + this.f32255a + ", issuingCountry=" + this.f32256b + ", flowConfig=" + this.f32257c + ", tenantConfig=" + this.f32258d + ")";
    }
}
