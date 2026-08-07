package hu;

import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes5.dex */
final class e0 extends f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f73641b;

    public e0(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f73641b = bArr;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.f73641b;
    }
}
