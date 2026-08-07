package com.fourthline.nfc.internal;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes4.dex */
public final class C0 implements InterfaceC2807d {
    @Override // com.fourthline.nfc.internal.InterfaceC2807d
    public boolean a(PublicKey publicKey, String signatureAlgorithm, String algorithmDigest, byte[] challenge, byte[] response) throws NfcException.b, BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        Signature signature;
        MessageDigest messageDigest;
        p013kotlin.jvm.internal.s.k(publicKey, "publicKey");
        p013kotlin.jvm.internal.s.k(signatureAlgorithm, "signatureAlgorithm");
        p013kotlin.jvm.internal.s.k(algorithmDigest, "algorithmDigest");
        p013kotlin.jvm.internal.s.k(challenge, "challenge");
        p013kotlin.jvm.internal.s.k(response, "response");
        Cipher cipher = Cipher.getInstance("RSA/NONE/NoPadding");
        p013kotlin.jvm.internal.s.j(cipher, "getInstance(...)");
        if (p013kotlin.text.t.M("SHA1", algorithmDigest, true) && p013kotlin.text.t.M("SHA-1", algorithmDigest, true) && p013kotlin.text.t.M("SHA1WithRSA/ISO9796-2", signatureAlgorithm, true)) {
            messageDigest = MessageDigest.getInstance("SHA1");
            signature = Signature.getInstance("SHA1WithRSA/ISO9796-2");
        } else {
            MessageDigest messageDigest2 = MessageDigest.getInstance(algorithmDigest);
            signature = Signature.getInstance(signatureAlgorithm);
            messageDigest = messageDigest2;
        }
        if (messageDigest.getDigestLength() != 20) {
            throw new NfcException.b("SHA1 - digestLength is incorrect ({" + messageDigest.getDigestLength() + ").");
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKey;
        cipher.init(2, rSAPublicKey);
        byte[] bArrDoFinal = cipher.doFinal(response);
        byte[] bArrA = a(messageDigest.getDigestLength(), bArrDoFinal);
        signature.initVerify(rSAPublicKey);
        signature.update(bArrA);
        p013kotlin.jvm.internal.s.h(bArrDoFinal);
        if (a(bArrDoFinal)) {
            signature.update(challenge);
        }
        return signature.verify(response);
    }

    private final boolean a(byte[] bArr) {
        return ((byte) (bArr[0] & 32)) != 0;
    }

    private final byte[] a(int i11, byte[] bArr) {
        int i12;
        if (bArr != null && bArr.length != 0) {
            if (((byte) (((byte) (bArr[bArr.length - 1] & 15)) ^ 12)) == 0) {
                if (((byte) (bArr[bArr.length - 1] ^ (-68))) == 0) {
                    i12 = 1;
                } else {
                    if (((byte) (bArr[bArr.length - 1] ^ (-52))) != 0) {
                        throw new NumberFormatException("Not an ISO 9796-2 scheme 2 signature trailer");
                    }
                    i12 = 2;
                }
                if (((byte) (((byte) (bArr[0] & (-64))) ^ 64)) == 0) {
                    int i13 = 0;
                    while (i13 < bArr.length && ((byte) (((byte) (bArr[i13] & 15)) ^ 10)) != 0) {
                        i13++;
                    }
                    int i14 = i13 + 1;
                    int length = ((bArr.length - i12) - i11) - i14;
                    if (length > 0) {
                        byte[] bArr2 = new byte[length];
                        System.arraycopy(bArr, i14, bArr2, 0, length);
                        return bArr2;
                    }
                    throw new NumberFormatException("Could not get M1");
                }
                throw new NumberFormatException("Could not get M1");
            }
            throw new NumberFormatException("Could not get M1, malformed trailer");
        }
        throw new IllegalArgumentException("Plaintext is too short to recover message");
    }
}
