package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.qi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3733qi implements InterfaceC2923Qb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3726qb f34842a;

    public C3733qi(InterfaceC3726qb flowAction) {
        p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
        this.f34842a = flowAction;
    }

    public final InterfaceC3726qb c() {
        return this.f34842a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3733qi) && p013kotlin.jvm.internal.s.f(this.f34842a, ((C3733qi) obj).f34842a);
    }

    public int hashCode() {
        return this.f34842a.hashCode();
    }

    public String toString() {
        return "IntroForward(flowAction=" + this.f34842a + ")";
    }
}
