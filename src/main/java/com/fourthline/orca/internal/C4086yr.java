package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.yr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4086yr implements PD, InterfaceC3143cr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3442js f37103a;

    public C4086yr(InterfaceC3442js flowAction) {
        p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
        this.f37103a = flowAction;
    }

    public final InterfaceC3442js c() {
        return this.f37103a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4086yr) && p013kotlin.jvm.internal.s.f(this.f37103a, ((C4086yr) obj).f37103a);
    }

    public int hashCode() {
        return this.f37103a.hashCode();
    }

    public String toString() {
        return "Forward(flowAction=" + this.f37103a + ")";
    }
}
