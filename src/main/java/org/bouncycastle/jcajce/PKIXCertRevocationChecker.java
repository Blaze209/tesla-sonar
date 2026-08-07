package org.bouncycastle.jcajce;

import java.security.cert.Certificate;

/* JADX INFO: loaded from: classes9.dex */
public interface PKIXCertRevocationChecker {
    void check(Certificate certificate);

    void initialize(PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters);

    void setParameter(String str, Object obj);
}
