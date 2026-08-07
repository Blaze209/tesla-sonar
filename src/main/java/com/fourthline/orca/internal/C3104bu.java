package com.fourthline.orca.internal;

import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.bu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3104bu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC3746qv.a.C0603a.c f30712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f30713d;

    public C3104bu(String workflowId, String str, InterfaceC3746qv.a.C0603a.c cVar, List list) {
        p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
        this.f30710a = workflowId;
        this.f30711b = str;
        this.f30712c = cVar;
        this.f30713d = list;
    }

    public final String a() {
        return this.f30711b;
    }

    public final InterfaceC3746qv.a.C0603a.c b() {
        return this.f30712c;
    }

    public final List c() {
        return this.f30713d;
    }

    public final String d() {
        return this.f30710a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3104bu)) {
            return false;
        }
        C3104bu c3104bu = (C3104bu) obj;
        return p013kotlin.jvm.internal.s.f(this.f30710a, c3104bu.f30710a) && p013kotlin.jvm.internal.s.f(this.f30711b, c3104bu.f30711b) && p013kotlin.jvm.internal.s.f(this.f30712c, c3104bu.f30712c) && p013kotlin.jvm.internal.s.f(this.f30713d, c3104bu.f30713d);
    }

    public int hashCode() {
        int iHashCode = this.f30710a.hashCode() * 31;
        String str = this.f30711b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        InterfaceC3746qv.a.C0603a.c cVar = this.f30712c;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        List list = this.f30713d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "QesFlowDataBundle(workflowId=" + this.f30710a + ", maskedPhoneNumber=" + this.f30711b + ", otpSettings=" + this.f30712c + ", signDocumentNames=" + this.f30713d + ")";
    }

    public final void a(String str) {
        this.f30711b = str;
    }

    public final void a(InterfaceC3746qv.a.C0603a.c cVar) {
        this.f30712c = cVar;
    }

    public final void a(List list) {
        this.f30713d = list;
    }

    public /* synthetic */ C3104bu(String str, String str2, InterfaceC3746qv.a.C0603a.c cVar, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : cVar, (i11 & 8) != 0 ? null : list);
    }
}
