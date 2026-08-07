package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.dE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3167dE implements Dt {
    @Override // com.fourthline.orca.internal.Dt
    public C2911Ne a(String id2) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        return new C2911Ne("/v1/onboarding/signatures/" + id2 + "/details");
    }

    @Override // com.fourthline.orca.internal.Dt
    public C2911Ne b(String id2) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        return new C2911Ne("/v1/onboarding/signatures/" + id2 + "/authorize");
    }

    @Override // com.fourthline.orca.internal.Dt
    public C2911Ne c(String id2) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        return new C2911Ne("/v1/onboarding/signatures/" + id2 + "/confirm");
    }

    @Override // com.fourthline.orca.internal.Dt
    public C2911Ne d(String id2) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        return new C2911Ne("/v1/onboarding/signatures/" + id2 + "/selfie");
    }

    @Override // com.fourthline.orca.internal.Dt
    public C2911Ne e(String id2) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        return new C2911Ne("/v1/onboarding/signatures/" + id2 + "/resendOtp");
    }

    @Override // com.fourthline.orca.internal.Dt
    public C2911Ne f(String id2) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        return new C2911Ne("/v1/onboarding/signatures/" + id2);
    }

    @Override // com.fourthline.orca.internal.Dt
    public C2911Ne a(String id2, String documentId) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        p013kotlin.jvm.internal.s.k(documentId, "documentId");
        return new C2911Ne("/v1/onboarding/signatures/" + id2 + "/documentsToSign/" + documentId);
    }
}
