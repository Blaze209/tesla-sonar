package nz;

import com.nimbusds.jose.JOSEException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes6.dex */
public class c {
    private static byte[] a(Cipher cipher) throws JOSEException {
        GCMParameterSpec gCMParameterSpecB = b(cipher);
        byte[] iv2 = gCMParameterSpecB.getIV();
        f(iv2, gCMParameterSpecB.getTLen());
        return iv2;
    }

    private static GCMParameterSpec b(Cipher cipher) throws JOSEException {
        AlgorithmParameters parameters = cipher.getParameters();
        if (parameters == null) {
            throw new JOSEException("AES GCM ciphers are expected to make use of algorithm parameters");
        }
        try {
            return (GCMParameterSpec) parameters.getParameterSpec(GCMParameterSpec.class);
        } catch (InvalidParameterSpecException e11) {
            throw new JOSEException(e11.getMessage(), e11);
        }
    }

    public static byte[] c(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, Provider provider) throws JOSEException {
        SecretKey secretKeyA = yz.k.a(secretKey);
        try {
            Cipher cipher = provider != null ? Cipher.getInstance("AES/GCM/NoPadding", provider) : Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKeyA, new GCMParameterSpec(128, bArr));
            cipher.updateAAD(bArr3);
            try {
                return cipher.doFinal(yz.e.d(bArr2, bArr4));
            } catch (BadPaddingException | IllegalBlockSizeException e11) {
                throw new JOSEException("AES/GCM/NoPadding decryption failed: " + e11.getMessage(), e11);
            }
        } catch (NoClassDefFoundError unused) {
            return t.c(secretKeyA, bArr, bArr2, bArr3, bArr4);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e12) {
            throw new JOSEException("Couldn't create AES/GCM/NoPadding cipher: " + e12.getMessage(), e12);
        }
    }

    public static f d(SecretKey secretKey, yz.f<byte[]> fVar, byte[] bArr, byte[] bArr2, Provider provider) throws JOSEException {
        SecretKey secretKeyA = yz.k.a(secretKey);
        byte[] bArrA = fVar.a();
        try {
            Cipher cipher = provider != null ? Cipher.getInstance("AES/GCM/NoPadding", provider) : Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKeyA, new GCMParameterSpec(128, bArrA));
            cipher.updateAAD(bArr2);
            try {
                byte[] bArrDoFinal = cipher.doFinal(bArr);
                int length = bArrDoFinal.length - yz.e.c(128);
                byte[] bArrG = yz.e.g(bArrDoFinal, 0, length);
                byte[] bArrG2 = yz.e.g(bArrDoFinal, length, yz.e.c(128));
                fVar.b(a(cipher));
                return new f(bArrG, bArrG2);
            } catch (BadPaddingException | IllegalBlockSizeException e11) {
                throw new JOSEException("Couldn't encrypt with AES/GCM/NoPadding: " + e11.getMessage(), e11);
            }
        } catch (NoClassDefFoundError unused) {
            return t.d(secretKeyA, bArrA, bArr, bArr2);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e12) {
            throw new JOSEException("Couldn't create AES/GCM/NoPadding cipher: " + e12.getMessage(), e12);
        }
    }

    public static byte[] e(SecureRandom secureRandom) {
        byte[] bArr = new byte[12];
        secureRandom.nextBytes(bArr);
        return bArr;
    }

    private static void f(byte[] bArr, int i11) throws JOSEException {
        if (yz.e.f(bArr) != 96) {
            throw new JOSEException(String.format("IV length of %d bits is required, got %d", 96, Integer.valueOf(yz.e.f(bArr))));
        }
        if (i11 != 128) {
            throw new JOSEException(String.format("Authentication tag length of %d bits is required, got %d", 128, Integer.valueOf(i11)));
        }
    }
}
