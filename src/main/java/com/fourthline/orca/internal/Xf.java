package com.fourthline.orca.internal;

import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Xf implements InterfaceC3543m6, InterfaceC3180dl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f29740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f29741d;

    public Xf(String identifier, String workflowId, List bodyParts, String alias) {
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
        p013kotlin.jvm.internal.s.k(bodyParts, "bodyParts");
        p013kotlin.jvm.internal.s.k(alias, "alias");
        this.f29738a = identifier;
        this.f29739b = workflowId;
        this.f29740c = bodyParts;
        this.f29741d = alias;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3180dl
    public Cl a() {
        return new Cl.c(this.f29741d, "/v1/workflows/" + this.f29739b + "/document", AbstractC3345hf.f(), null, this.f29740c, 8, null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3543m6
    public String b() {
        return this.f29738a;
    }

    public /* synthetic */ Xf(String str, String str2, List list, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i11 & 8) != 0 ? "workflow_upload_document" : str3);
    }
}
