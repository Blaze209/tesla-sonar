package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.w9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3976w9 implements InterfaceC3543m6, InterfaceC3180dl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f36369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f36370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f36371e;

    public C3976w9(String workflowId, String documentId, String imageId, List bodyParts) {
        p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
        p013kotlin.jvm.internal.s.k(documentId, "documentId");
        p013kotlin.jvm.internal.s.k(imageId, "imageId");
        p013kotlin.jvm.internal.s.k(bodyParts, "bodyParts");
        this.f36367a = workflowId;
        this.f36368b = documentId;
        this.f36369c = imageId;
        this.f36370d = bodyParts;
        this.f36371e = "documentImageUpload_" + imageId;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3180dl
    public Cl a() {
        return new Cl.c("workflow_upload_document", "/v1/workflows/" + this.f36367a + "/documents/" + this.f36368b + "/file", AbstractC3345hf.f(), null, this.f36370d, 8, null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3543m6
    public String b() {
        return this.f36371e;
    }
}
