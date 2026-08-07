package org.spongycastle.cert.jcajce;

import java.security.cert.CertificateFactory;

/* JADX INFO: loaded from: classes10.dex */
class DefaultCertHelper extends CertHelper {
    DefaultCertHelper() {
    }

    @Override // org.spongycastle.cert.jcajce.CertHelper
    protected CertificateFactory createCertificateFactory(String str) {
        return CertificateFactory.getInstance(str);
    }
}
