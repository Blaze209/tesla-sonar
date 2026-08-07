package org.bouncycastle.x509;

import java.security.cert.CertificateEncodingException;

/* JADX INFO: loaded from: classes10.dex */
class ExtCertificateEncodingException extends CertificateEncodingException {
    Throwable cause;

    ExtCertificateEncodingException(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
