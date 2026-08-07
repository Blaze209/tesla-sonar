package org.spongycastle.cert.jcajce;

import java.security.Provider;
import java.security.cert.CertificateFactory;

/* JADX INFO: loaded from: classes10.dex */
class ProviderCertHelper extends CertHelper {
    private final Provider provider;

    ProviderCertHelper(Provider provider) {
        this.provider = provider;
    }

    @Override // org.spongycastle.cert.jcajce.CertHelper
    protected CertificateFactory createCertificateFactory(String str) {
        return CertificateFactory.getInstance(str, this.provider);
    }
}
