package org.spongycastle.cert.path;

/* JADX INFO: loaded from: classes10.dex */
class CertPathValidationResultBuilder {
    CertPathValidationResultBuilder() {
    }

    public void addException(CertPathValidationException certPathValidationException) {
    }

    public CertPathValidationResult build() {
        return new CertPathValidationResult((CertPathValidationContext) null, 0, 0, (CertPathValidationException) null);
    }
}
