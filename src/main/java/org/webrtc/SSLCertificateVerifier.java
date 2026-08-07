package org.webrtc;

/* JADX INFO: loaded from: classes10.dex */
public interface SSLCertificateVerifier {
    @CalledByNative
    boolean verify(byte[] bArr);
}
