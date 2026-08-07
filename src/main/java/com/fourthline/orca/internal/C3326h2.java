package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3326h2 implements V1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3924v1 f32176a;

    public C3326h2(InterfaceC3924v1 flowAction) {
        p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
        this.f32176a = flowAction;
    }

    public final InterfaceC3924v1 c() {
        return this.f32176a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3326h2) && p013kotlin.jvm.internal.s.f(this.f32176a, ((C3326h2) obj).f32176a);
    }

    public int hashCode() {
        return this.f32176a.hashCode();
    }

    public String toString() {
        return "BavIntroForward(flowAction=" + this.f32176a + ")";
    }
}
