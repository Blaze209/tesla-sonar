package nz;

import com.nimbusds.jose.JOSEException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* JADX INFO: loaded from: classes6.dex */
public class y {
    private static Signature a(String str, Provider provider) {
        return b(str, provider, null);
    }

    private static Signature b(String str, Provider provider, PSSParameterSpec pSSParameterSpec) throws JOSEException {
        try {
            Signature signature = provider != null ? Signature.getInstance(str, provider) : Signature.getInstance(str);
            if (pSSParameterSpec == null) {
                return signature;
            }
            try {
                signature.setParameter(pSSParameterSpec);
                return signature;
            } catch (InvalidAlgorithmParameterException e11) {
                throw new JOSEException("Invalid RSASSA-PSS salt length parameter: " + e11.getMessage(), e11);
            }
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static Signature c(jz.o oVar, Provider provider) throws JOSEException {
        Signature signatureA;
        Signature signatureB;
        Signature signatureA2;
        Signature signatureB2;
        Signature signatureA3;
        Signature signatureB3;
        Signature signatureA4;
        Signature signatureA5;
        Signature signatureA6;
        if (oVar.equals(jz.o.f84538g) && (signatureA6 = a("SHA256withRSA", provider)) != null) {
            return signatureA6;
        }
        if (oVar.equals(jz.o.f84539h) && (signatureA5 = a("SHA384withRSA", provider)) != null) {
            return signatureA5;
        }
        if (oVar.equals(jz.o.f84540i) && (signatureA4 = a("SHA512withRSA", provider)) != null) {
            return signatureA4;
        }
        jz.o oVar2 = jz.o.f84545n;
        if (oVar.equals(oVar2) && (signatureB3 = b("RSASSA-PSS", provider, new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1))) != null) {
            return signatureB3;
        }
        if (oVar.equals(oVar2) && (signatureA3 = a("SHA256withRSAandMGF1", provider)) != null) {
            return signatureA3;
        }
        jz.o oVar3 = jz.o.f84546o;
        if (oVar.equals(oVar3) && (signatureB2 = b("RSASSA-PSS", provider, new PSSParameterSpec("SHA-384", "MGF1", MGF1ParameterSpec.SHA384, 48, 1))) != null) {
            return signatureB2;
        }
        if (oVar.equals(oVar3) && (signatureA2 = a("SHA384withRSAandMGF1", provider)) != null) {
            return signatureA2;
        }
        jz.o oVar4 = jz.o.f84547p;
        if (oVar.equals(oVar4) && (signatureB = b("RSASSA-PSS", provider, new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1))) != null) {
            return signatureB;
        }
        if (!oVar.equals(oVar4) || (signatureA = a("SHA512withRSAandMGF1", provider)) == null) {
            throw new JOSEException(e.d(oVar, z.f95520c));
        }
        return signatureA;
    }
}
