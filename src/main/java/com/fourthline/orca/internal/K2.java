package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class K2 implements V1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3924v1 f26536a;

    public K2(InterfaceC3924v1 flowAction) {
        p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
        this.f26536a = flowAction;
    }

    public final InterfaceC3924v1 c() {
        return this.f26536a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof K2) && p013kotlin.jvm.internal.s.f(this.f26536a, ((K2) obj).f26536a);
    }

    public int hashCode() {
        return this.f26536a.hashCode();
    }

    public String toString() {
        return "BavTypeSelectForward(flowAction=" + this.f26536a + ")";
    }
}
