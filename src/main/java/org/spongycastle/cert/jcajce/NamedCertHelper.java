package org.spongycastle.cert.jcajce;

import java.security.cert.CertificateFactory;

/* JADX INFO: loaded from: classes10.dex */
class NamedCertHelper extends CertHelper {
    private final String providerName;

    NamedCertHelper(String str) {
        this.providerName = str;
    }

    @Override // org.spongycastle.cert.jcajce.CertHelper
    protected CertificateFactory createCertificateFactory(String str) {
        return CertificateFactory.getInstance(str, this.providerName);
    }
}
