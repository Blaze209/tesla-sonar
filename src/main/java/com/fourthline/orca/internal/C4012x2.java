package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4012x2 implements PD, V1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3924v1 f36654a;

    public C4012x2(InterfaceC3924v1 flowAction) {
        p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
        this.f36654a = flowAction;
    }

    public final InterfaceC3924v1 c() {
        return this.f36654a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4012x2) && p013kotlin.jvm.internal.s.f(this.f36654a, ((C4012x2) obj).f36654a);
    }

    public int hashCode() {
        return this.f36654a.hashCode();
    }

    public String toString() {
        return "Forward(flowAction=" + this.f36654a + ")";
    }
}
