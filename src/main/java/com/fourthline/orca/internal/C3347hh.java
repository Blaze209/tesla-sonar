package com.fourthline.orca.internal;

import com.fourthline.orca.workflow.WorkflowResults;

/* JADX INFO: renamed from: com.fourthline.orca.internal.hh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3347hh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC3038aD f32303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3543m6 f32304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WorkflowResults.IDV f32305c;

    public C3347hh(EnumC3038aD part, InterfaceC3543m6 request, WorkflowResults.IDV result) {
        p013kotlin.jvm.internal.s.k(part, "part");
        p013kotlin.jvm.internal.s.k(request, "request");
        p013kotlin.jvm.internal.s.k(result, "result");
        this.f32303a = part;
        this.f32304b = request;
        this.f32305c = result;
    }

    public final EnumC3038aD a() {
        return this.f32303a;
    }

    public final InterfaceC3543m6 b() {
        return this.f32304b;
    }

    public final WorkflowResults.IDV c() {
        return this.f32305c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3347hh)) {
            return false;
        }
        C3347hh c3347hh = (C3347hh) obj;
        return this.f32303a == c3347hh.f32303a && p013kotlin.jvm.internal.s.f(this.f32304b, c3347hh.f32304b) && p013kotlin.jvm.internal.s.f(this.f32305c, c3347hh.f32305c);
    }

    public int hashCode() {
        return (((this.f32303a.hashCode() * 31) + this.f32304b.hashCode()) * 31) + this.f32305c.hashCode();
    }

    public String toString() {
        return "IdvUploadDataRequestSingleUnit(part=" + this.f32303a + ", request=" + this.f32304b + ", result=" + this.f32305c + ")";
    }
}
