package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3282g1 implements InterfaceC3154d1, V1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3924v1 f31909a;

    public C3282g1(InterfaceC3924v1 flowAction) {
        p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
        this.f31909a = flowAction;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3282g1) && p013kotlin.jvm.internal.s.f(this.f31909a, ((C3282g1) obj).f31909a);
    }

    public int hashCode() {
        return this.f31909a.hashCode();
    }

    public String toString() {
        return "Forward(flowAction=" + this.f31909a + ")";
    }
}
