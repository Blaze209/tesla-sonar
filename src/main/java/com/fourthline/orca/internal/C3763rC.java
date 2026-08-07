package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.rC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3763rC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3635oC f35009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ds f35010b;

    public C3763rC(InterfaceC3635oC navigation, Ds ds2) {
        p013kotlin.jvm.internal.s.k(navigation, "navigation");
        this.f35009a = navigation;
        this.f35010b = ds2;
    }

    public final Ds a() {
        return this.f35010b;
    }

    public final InterfaceC3635oC b() {
        return this.f35009a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3763rC)) {
            return false;
        }
        C3763rC c3763rC = (C3763rC) obj;
        return p013kotlin.jvm.internal.s.f(this.f35009a, c3763rC.f35009a) && p013kotlin.jvm.internal.s.f(this.f35010b, c3763rC.f35010b);
    }

    public int hashCode() {
        int iHashCode = this.f35009a.hashCode() * 31;
        Ds ds2 = this.f35010b;
        return iHashCode + (ds2 == null ? 0 : ds2.hashCode());
    }

    public String toString() {
        return "TypeSelectActions(navigation=" + this.f35009a + ", linkButtonPopup=" + this.f35010b + ")";
    }
}
