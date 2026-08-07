package com.fourthline.nfc.internal;

import java.math.BigInteger;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes4.dex */
public final class C implements InterfaceC2824n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yq0.n f24517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2825o f24518b;

    public C(yq0.n passportService, InterfaceC2825o connectionLostDetector) {
        p013kotlin.jvm.internal.s.k(passportService, "passportService");
        p013kotlin.jvm.internal.s.k(connectionLostDetector, "connectionLostDetector");
        this.f24517a = passportService;
        this.f24518b = connectionLostDetector;
    }

    @Override // com.fourthline.nfc.internal.InterfaceC2824n
    public void a(final BigInteger bigInteger, final String oid, final String publicKeyOID, final PublicKey publicKey) throws NfcException {
        p013kotlin.jvm.internal.s.k(oid, "oid");
        p013kotlin.jvm.internal.s.k(publicKeyOID, "publicKeyOID");
        p013kotlin.jvm.internal.s.k(publicKey, "publicKey");
        a(new NfcException.c("Failed to perform CA on this chip!"), new wn0.a() { // from class: com.fourthline.nfc.internal.c1
            @Override // wn0.a
            public final Object invoke() {
                return C.a(this.f24632a, bigInteger, oid, publicKeyOID, publicKey);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dr0.k a(C c11, BigInteger bigInteger, String str, String str2, PublicKey publicKey) {
        return c11.f24517a.i(bigInteger, str, str2, publicKey);
    }

    @Override // com.fourthline.nfc.internal.InterfaceC2824n
    public byte[] a(final PublicKey publicKey, final String digestAlgorithm, final String signatureAlgorithm, final byte[] challenge) throws NfcException {
        p013kotlin.jvm.internal.s.k(publicKey, "publicKey");
        p013kotlin.jvm.internal.s.k(digestAlgorithm, "digestAlgorithm");
        p013kotlin.jvm.internal.s.k(signatureAlgorithm, "signatureAlgorithm");
        p013kotlin.jvm.internal.s.k(challenge, "challenge");
        Object objA = a(new NfcException.a("Failed to perform AA on this chip!"), new wn0.a() { // from class: com.fourthline.nfc.internal.d1
            @Override // wn0.a
            public final Object invoke() {
                return C.a(this.f24637a, publicKey, digestAlgorithm, signatureAlgorithm, challenge);
            }
        });
        p013kotlin.jvm.internal.s.j(objA, "withConnectionLostHandling(...)");
        return (byte[]) objA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] a(C c11, PublicKey publicKey, String str, String str2, byte[] bArr) {
        return c11.f24517a.g(publicKey, str, str2, bArr).a();
    }

    private final Object a(NfcException nfcException, wn0.a aVar) throws NfcException {
        try {
            return aVar.invoke();
        } catch (Throwable th2) {
            if (this.f24518b.a(th2)) {
                throw new NfcException.d(V.a(th2));
            }
            throw nfcException;
        }
    }
}
