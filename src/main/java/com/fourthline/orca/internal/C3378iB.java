package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.iB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3378iB implements InterfaceC3335hB {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MA f32456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32457b;

    public C3378iB(MA taxationCountry, String str) {
        p013kotlin.jvm.internal.s.k(taxationCountry, "taxationCountry");
        this.f32456a = taxationCountry;
        this.f32457b = str;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3335hB
    public MA a() {
        return this.f32456a;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3335hB
    public String b() {
        return this.f32457b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3378iB)) {
            return false;
        }
        C3378iB c3378iB = (C3378iB) obj;
        return this.f32456a == c3378iB.f32456a && p013kotlin.jvm.internal.s.f(this.f32457b, c3378iB.f32457b);
    }

    public int hashCode() {
        int iHashCode = this.f32456a.hashCode() * 31;
        String str = this.f32457b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "TinDetailsRepositoryData(taxationCountry=" + this.f32456a + ", taxationCodeSuggestion=" + this.f32457b + ")";
    }
}
