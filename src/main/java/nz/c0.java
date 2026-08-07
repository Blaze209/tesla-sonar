package nz;

import com.google.crypto.tink.subtle.XChaCha20Poly1305;
import com.nimbusds.jose.JOSEException;
import java.security.GeneralSecurityException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes6.dex */
public class c0 {
    public static byte[] a(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws JOSEException {
        try {
            try {
                return new XChaCha20Poly1305(secretKey.getEncoded()).decrypt(yz.e.d(bArr, bArr2, bArr4), bArr3);
            } catch (GeneralSecurityException e11) {
                throw new JOSEException("XChaCha20Poly1305 decryption failed: " + e11.getMessage(), e11);
            }
        } catch (GeneralSecurityException e12) {
            throw new JOSEException("Invalid XChaCha20Poly1305 key: " + e12.getMessage(), e12);
        }
    }

    public static f b(SecretKey secretKey, yz.f<byte[]> fVar, byte[] bArr, byte[] bArr2) throws JOSEException {
        try {
            try {
                byte[] bArrEncrypt = new XChaCha20Poly1305(secretKey.getEncoded()).encrypt(bArr, bArr2);
                int length = bArrEncrypt.length - yz.e.c(128);
                int iC = yz.e.c(192);
                byte[] bArrG = yz.e.g(bArrEncrypt, 0, iC);
                byte[] bArrG2 = yz.e.g(bArrEncrypt, iC, length - iC);
                byte[] bArrG3 = yz.e.g(bArrEncrypt, length, yz.e.c(128));
                fVar.b(bArrG);
                return new f(bArrG2, bArrG3);
            } catch (GeneralSecurityException e11) {
                throw new JOSEException("Couldn't encrypt with XChaCha20Poly1305: " + e11.getMessage(), e11);
            }
        } catch (GeneralSecurityException e12) {
            throw new JOSEException("Invalid XChaCha20Poly1305 key: " + e12.getMessage(), e12);
        }
    }
}
