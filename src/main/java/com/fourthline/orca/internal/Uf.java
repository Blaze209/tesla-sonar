package com.fourthline.orca.internal;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Uf implements InterfaceC3543m6, InterfaceC3180dl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f28794c;

    public Uf(String identifier, String workflowId, JSONObject data) {
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
        p013kotlin.jvm.internal.s.k(data, "data");
        this.f28792a = identifier;
        this.f28793b = workflowId;
        this.f28794c = data;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3180dl
    public Cl a() {
        return new Cl.a("workflow_upload_data", Cl.b.PUT, "/v1/workflows/" + this.f28793b + "/data", AbstractC3345hf.a(), null, AbstractC3885u5.a(this.f28794c), 16, null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3543m6
    public String b() {
        return this.f28792a;
    }
}
