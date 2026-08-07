package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.n7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3587n7 implements InterfaceC3544m7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W6 f33828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Kp f33829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f33830c;

    public C3587n7(W6 documentAnalysisBundle, Kp personBundle, long j11) {
        p013kotlin.jvm.internal.s.k(documentAnalysisBundle, "documentAnalysisBundle");
        p013kotlin.jvm.internal.s.k(personBundle, "personBundle");
        this.f33828a = documentAnalysisBundle;
        this.f33829b = personBundle;
        this.f33830c = j11;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3544m7
    public boolean a() {
        return this.f33828a.a();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3544m7
    public String b() {
        return X6.a(this.f33828a);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3544m7
    public long c() {
        return this.f33830c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3587n7)) {
            return false;
        }
        C3587n7 c3587n7 = (C3587n7) obj;
        return p013kotlin.jvm.internal.s.f(this.f33828a, c3587n7.f33828a) && p013kotlin.jvm.internal.s.f(this.f33829b, c3587n7.f33829b) && this.f33830c == c3587n7.f33830c;
    }

    public int hashCode() {
        return (((this.f33828a.hashCode() * 31) + this.f33829b.hashCode()) * 31) + Long.hashCode(this.f33830c);
    }

    public String toString() {
        return "DocumentAnalysisRepositoryFromBundle(documentAnalysisBundle=" + this.f33828a + ", personBundle=" + this.f33829b + ", backendProcessingTimeoutMs=" + this.f33830c + ")";
    }

    @Override // com.fourthline.orca.internal.InterfaceC3544m7
    public void a(InterfaceC3630o7.a document) {
        p013kotlin.jvm.internal.s.k(document, "document");
        this.f33828a.a(document);
        a(this.f33829b.p(), document.b());
    }

    private final void a(Lp lp2, OcrData ocrData) {
        String birthPlace;
        String dateOfBirth;
        String strV = null;
        lp2.b(ocrData != null ? ocrData.getFirstName() : null);
        lp2.c(ocrData != null ? ocrData.getLastName() : null);
        lp2.a(ocrData != null ? A8.a(ocrData) : null);
        lp2.d(ocrData != null ? ocrData.getNationality() : null);
        lp2.a((ocrData == null || (dateOfBirth = ocrData.getDateOfBirth()) == null) ? null : A8.a(dateOfBirth));
        if (ocrData != null && (birthPlace = ocrData.getBirthPlace()) != null) {
            strV = p013kotlin.text.t.V(birthPlace, "\n", ", ", false, 4, null);
        }
        lp2.a(strV);
    }
}
