package nz;

import com.nimbusds.jose.JOSEException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes6.dex */
public class a0 {
    public static byte[] a(RSAPublicKey rSAPublicKey, SecretKey secretKey, Provider provider) throws JOSEException {
        try {
            Cipher cipherA = i.a("RSA/ECB/OAEPWithSHA-1AndMGF1Padding", provider);
            cipherA.init(1, rSAPublicKey, new SecureRandom());
            return cipherA.doFinal(secretKey.getEncoded());
        } catch (IllegalBlockSizeException e11) {
            throw new JOSEException("RSA block size exception: The RSA key is too short, try a longer one", e11);
        } catch (Exception e12) {
            throw new JOSEException(e12.getMessage(), e12);
        }
    }
}
