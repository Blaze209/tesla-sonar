package com.fourthline.orca.internal;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.fourthline.orca.internal.j8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3416j8 implements InterfaceC3543m6, InterfaceC3180dl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f32683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f32684d;

    public C3416j8(String workflowId, String documentId, JSONObject data) {
        p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
        p013kotlin.jvm.internal.s.k(documentId, "documentId");
        p013kotlin.jvm.internal.s.k(data, "data");
        this.f32681a = workflowId;
        this.f32682b = documentId;
        this.f32683c = data;
        this.f32684d = "documentDataUpload";
    }

    @Override // com.fourthline.orca.internal.InterfaceC3180dl
    public Cl a() {
        return new Cl.a("workflow_upload_document", Cl.b.POST, "/v1/workflows/" + this.f32681a + "/documents/" + this.f32682b + "/confirm", AbstractC3345hf.a(), null, AbstractC3885u5.a(this.f32683c), 16, null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3543m6
    public String b() {
        return this.f32684d;
    }
}
