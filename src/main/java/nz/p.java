package nz;

import com.nimbusds.jose.JOSEException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class p {
    public static SecretKey a(ECPublicKey eCPublicKey, PrivateKey privateKey, Provider provider) throws JOSEException {
        try {
            KeyAgreement keyAgreement = provider != null ? KeyAgreement.getInstance("ECDH", provider) : KeyAgreement.getInstance("ECDH");
            try {
                keyAgreement.init(privateKey);
                keyAgreement.doPhase(eCPublicKey, true);
                return new SecretKeySpec(keyAgreement.generateSecret(), "AES");
            } catch (InvalidKeyException e11) {
                throw new JOSEException("Invalid key for ECDH key agreement: " + e11.getMessage(), e11);
            }
        } catch (NoSuchAlgorithmException e12) {
            throw new JOSEException("Couldn't get an ECDH key agreement instance: " + e12.getMessage(), e12);
        }
    }
}
