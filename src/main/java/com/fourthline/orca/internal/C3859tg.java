package com.fourthline.orca.internal;

import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.fourthline.orca.internal.tg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3859tg implements X509TrustManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35666a;

    public C3859tg(String baseUrl) {
        p013kotlin.jvm.internal.s.k(baseUrl, "baseUrl");
        String host = new URL(baseUrl).getHost();
        p013kotlin.jvm.internal.s.j(host, "getHost(...)");
        this.f35666a = host;
    }

    private final void a(X509Certificate x509Certificate) throws CertificateException {
        Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        p013kotlin.jvm.internal.s.j(subjectAlternativeNames, "getSubjectAlternativeNames(...)");
        List listA = p013kotlin.collections.v.A(subjectAlternativeNames);
        if (!(listA instanceof Collection) || !listA.isEmpty()) {
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                if (p013kotlin.jvm.internal.s.f(it.next(), this.f35666a)) {
                    return;
                }
            }
        }
        throw new CertificateException("FLCP - No Leaflet Certificate CN match found.");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateNotYetValidException, CertificateExpiredException {
        if (x509CertificateArr != null) {
            for (X509Certificate x509Certificate : x509CertificateArr) {
                x509Certificate.checkValidity();
            }
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        X509Certificate x509Certificate;
        if (x509CertificateArr == null || (x509Certificate = (X509Certificate) p013kotlin.collections.n.l0(x509CertificateArr)) == null) {
            throw new CertificateException("Leaf certificate must exist");
        }
        a(x509Certificate);
        for (X509Certificate x509Certificate2 : x509CertificateArr) {
            x509Certificate2.checkValidity();
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
