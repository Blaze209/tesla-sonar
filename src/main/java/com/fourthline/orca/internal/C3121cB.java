package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.cB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3121cB implements InterfaceC3036aB, InterfaceC3978wB {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3805sB f30820a;

    public C3121cB(InterfaceC3805sB flowAction) {
        p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
        this.f30820a = flowAction;
    }

    public final InterfaceC3805sB c() {
        return this.f30820a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3121cB) && p013kotlin.jvm.internal.s.f(this.f30820a, ((C3121cB) obj).f30820a);
    }

    public int hashCode() {
        return this.f30820a.hashCode();
    }

    public String toString() {
        return "Forward(flowAction=" + this.f30820a + ")";
    }
}
