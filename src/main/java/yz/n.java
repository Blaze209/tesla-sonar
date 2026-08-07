package yz;

import java.io.ByteArrayInputStream;
import java.security.Provider;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes6.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Provider f126027a;

    public static X509Certificate a(byte[] bArr) {
        try {
            return b(bArr);
        } catch (CertificateException unused) {
            return null;
        }
    }

    public static X509Certificate b(byte[] bArr) throws CertificateException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        Provider provider = f126027a;
        Certificate certificateGenerateCertificate = (provider != null ? CertificateFactory.getInstance("X.509", provider) : CertificateFactory.getInstance("X.509")).generateCertificate(new ByteArrayInputStream(bArr));
        if (certificateGenerateCertificate instanceof X509Certificate) {
            return (X509Certificate) certificateGenerateCertificate;
        }
        throw new CertificateException("Not a X.509 certificate: " + certificateGenerateCertificate.getType());
    }
}
