package nz;

import com.nimbusds.jose.JOSEException;
import java.security.AlgorithmParameters;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* JADX INFO: loaded from: classes6.dex */
public class b0 {
    public static byte[] a(RSAPublicKey rSAPublicKey, SecretKey secretKey, int i11, Provider provider) throws JOSEException {
        MGF1ParameterSpec mGF1ParameterSpec;
        String str;
        String str2;
        if (256 == i11) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
            str = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
            str2 = "SHA-256";
        } else if (384 == i11) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
            str = "RSA/ECB/OAEPWithSHA-384AndMGF1Padding";
            str2 = "SHA-384";
        } else {
            if (512 != i11) {
                throw new JOSEException("Unsupported SHA-2 bit size: " + i11);
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
            str = "RSA/ECB/OAEPWithSHA-512AndMGF1Padding";
            str2 = "SHA-512";
        }
        try {
            AlgorithmParameters algorithmParametersA = d.a("OAEP", provider);
            algorithmParametersA.init(new OAEPParameterSpec(str2, "MGF1", mGF1ParameterSpec, PSource.PSpecified.DEFAULT));
            Cipher cipherA = i.a(str, provider);
            cipherA.init(1, rSAPublicKey, algorithmParametersA);
            return cipherA.doFinal(secretKey.getEncoded());
        } catch (IllegalBlockSizeException e11) {
            throw new JOSEException("RSA block size exception: The RSA key is too short, use a longer one", e11);
        } catch (Exception e12) {
            throw new JOSEException(e12.getMessage(), e12);
        }
    }
}
