package com.fourthline.nfc.internal;

import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: renamed from: com.fourthline.nfc.internal.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2832w implements InterfaceC2807d {
    @Override // com.fourthline.nfc.internal.InterfaceC2807d
    public boolean a(PublicKey publicKey, String signatureAlgorithm, String algorithmDigest, byte[] challenge, byte[] response) throws SignatureException, InvalidKeyException {
        p013kotlin.jvm.internal.s.k(publicKey, "publicKey");
        p013kotlin.jvm.internal.s.k(signatureAlgorithm, "signatureAlgorithm");
        p013kotlin.jvm.internal.s.k(algorithmDigest, "algorithmDigest");
        p013kotlin.jvm.internal.s.k(challenge, "challenge");
        p013kotlin.jvm.internal.s.k(response, "response");
        int length = response.length / 2;
        DERSequence dERSequence = new DERSequence(new ASN1Integer[]{new ASN1Integer(yq0.o.I(response, 0, length)), new ASN1Integer(yq0.o.I(response, length, length))});
        Signature signatureZ = yq0.o.z(signatureAlgorithm);
        signatureZ.initVerify(publicKey);
        signatureZ.update(challenge);
        return signatureZ.verify(dERSequence.getEncoded());
    }
}
