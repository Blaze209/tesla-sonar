package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: classes10.dex */
public interface TlsAuthentication {
    TlsCredentials getClientCredentials(CertificateRequest certificateRequest);

    void notifyServerCertificate(Certificate certificate);
}
