package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.jB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3419jB {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MA f32693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32694b;

    public C3419jB(MA taxationCountry, String taxNumber) {
        p013kotlin.jvm.internal.s.k(taxationCountry, "taxationCountry");
        p013kotlin.jvm.internal.s.k(taxNumber, "taxNumber");
        this.f32693a = taxationCountry;
        this.f32694b = taxNumber;
    }

    public final String a() {
        return this.f32694b;
    }

    public final MA b() {
        return this.f32693a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3419jB)) {
            return false;
        }
        C3419jB c3419jB = (C3419jB) obj;
        return this.f32693a == c3419jB.f32693a && p013kotlin.jvm.internal.s.f(this.f32694b, c3419jB.f32694b);
    }

    public int hashCode() {
        return (this.f32693a.hashCode() * 31) + this.f32694b.hashCode();
    }

    public String toString() {
        return "TinDetailsResult(taxationCountry=" + this.f32693a + ", taxNumber=" + this.f32694b + ")";
    }
}
