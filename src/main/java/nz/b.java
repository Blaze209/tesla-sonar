package nz;

import com.nimbusds.jose.JOSEException;
import java.nio.ByteBuffer;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class b {
    private static Cipher a(SecretKey secretKey, boolean z11, byte[] bArr, Provider provider) throws JOSEException {
        try {
            Cipher cipherA = i.a("AES/CBC/PKCS5Padding", provider);
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getEncoded(), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            if (z11) {
                cipherA.init(1, secretKeySpec, ivParameterSpec);
                return cipherA;
            }
            cipherA.init(2, secretKeySpec, ivParameterSpec);
            return cipherA;
        } catch (Exception e11) {
            throw new JOSEException(e11.getMessage(), e11);
        }
    }

    public static byte[] b(SecretKey secretKey, byte[] bArr, byte[] bArr2, Provider provider) throws JOSEException {
        try {
            return a(secretKey, false, bArr, provider).doFinal(bArr2);
        } catch (Exception e11) {
            throw new JOSEException(e11.getMessage(), e11);
        }
    }

    public static byte[] c(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, Provider provider, Provider provider2) throws JOSEException {
        j jVar = new j(secretKey);
        byte[] bArrC = a.c(bArr3);
        if (oz.a.a(Arrays.copyOf(s.b(jVar.b(), ByteBuffer.allocate(bArr3.length + bArr.length + bArr2.length + bArrC.length).put(bArr3).put(bArr).put(bArr2).put(bArrC).array(), provider2), jVar.c()), bArr4)) {
            return b(jVar.a(), bArr, bArr2, provider);
        }
        throw new JOSEException("MAC check failed");
    }

    public static byte[] d(jz.l lVar, SecretKey secretKey, yz.c cVar, yz.c cVar2, yz.c cVar3, yz.c cVar4, Provider provider, Provider provider2) throws JOSEException {
        byte[] bArrA = lVar.d("epu") instanceof String ? new yz.c((String) lVar.d("epu")).a() : null;
        byte[] bArrA2 = lVar.d("epv") instanceof String ? new yz.c((String) lVar.d("epv")).a() : null;
        if (oz.a.a(cVar4.a(), s.b(u.b(secretKey, lVar.t(), bArrA, bArrA2), (lVar.h().toString() + "." + cVar.toString() + "." + cVar2.toString() + "." + cVar3.toString()).getBytes(yz.l.f126026a), provider2))) {
            return b(u.a(secretKey, lVar.t(), bArrA, bArrA2), cVar2.a(), cVar3.a(), provider);
        }
        throw new JOSEException("MAC check failed");
    }

    public static byte[] e(SecretKey secretKey, byte[] bArr, byte[] bArr2, Provider provider) throws JOSEException {
        try {
            return a(secretKey, true, bArr, provider).doFinal(bArr2);
        } catch (Exception e11) {
            throw new JOSEException(e11.getMessage(), e11);
        }
    }

    public static f f(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider, Provider provider2) throws JOSEException {
        j jVar = new j(secretKey);
        byte[] bArrE = e(jVar.a(), bArr, bArr2, provider);
        byte[] bArrC = a.c(bArr3);
        return new f(bArrE, Arrays.copyOf(s.b(jVar.b(), ByteBuffer.allocate(bArr3.length + bArr.length + bArrE.length + bArrC.length).put(bArr3).put(bArr).put(bArrE).put(bArrC).array(), provider2), jVar.c()));
    }

    public static f g(jz.l lVar, SecretKey secretKey, yz.c cVar, byte[] bArr, byte[] bArr2, Provider provider, Provider provider2) throws JOSEException {
        byte[] bArrA = lVar.d("epu") instanceof String ? new yz.c((String) lVar.d("epu")).a() : null;
        byte[] bArrA2 = lVar.d("epv") instanceof String ? new yz.c((String) lVar.d("epv")).a() : null;
        byte[] bArrE = e(u.a(secretKey, lVar.t(), bArrA, bArrA2), bArr, bArr2, provider);
        return new f(bArrE, s.b(u.b(secretKey, lVar.t(), bArrA, bArrA2), (lVar.h() + "." + cVar + "." + yz.c.e(bArr) + "." + yz.c.e(bArrE)).getBytes(yz.l.f126026a), provider2));
    }

    public static byte[] h(SecureRandom secureRandom) {
        byte[] bArr = new byte[yz.e.c(128)];
        secureRandom.nextBytes(bArr);
        return bArr;
    }
}
