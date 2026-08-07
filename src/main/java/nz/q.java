package nz;

import com.nimbusds.jose.JOSEException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECKey;

/* JADX INFO: loaded from: classes6.dex */
public class q {
    public static int a(jz.o oVar) throws JOSEException {
        if (oVar.equals(jz.o.f84541j) || oVar.equals(jz.o.f84542k)) {
            return 64;
        }
        if (oVar.equals(jz.o.f84543l)) {
            return 96;
        }
        if (oVar.equals(jz.o.f84544m)) {
            return 132;
        }
        throw new JOSEException(e.d(oVar, r.f95511c));
    }

    public static Signature b(jz.o oVar, Provider provider) throws JOSEException {
        String str = "SHA256withECDSA";
        if (!oVar.equals(jz.o.f84541j) && !oVar.equals(jz.o.f84542k)) {
            if (oVar.equals(jz.o.f84543l)) {
                str = "SHA384withECDSA";
            } else {
                if (!oVar.equals(jz.o.f84544m)) {
                    throw new JOSEException(e.d(oVar, r.f95511c));
                }
                str = "SHA512withECDSA";
            }
        }
        try {
            return provider != null ? Signature.getInstance(str, provider) : Signature.getInstance(str);
        } catch (NoSuchAlgorithmException e11) {
            throw new JOSEException("Unsupported ECDSA algorithm: " + e11.getMessage(), e11);
        }
    }

    public static jz.o c(ECKey eCKey) {
        return d(qz.a.a(eCKey.getParams()));
    }

    public static jz.o d(qz.a aVar) throws JOSEException {
        if (aVar == null) {
            throw new JOSEException("The EC key curve is not supported, must be P-256, P-384 or P-521");
        }
        if (qz.a.f106204d.equals(aVar)) {
            return jz.o.f84541j;
        }
        if (qz.a.f106205e.equals(aVar)) {
            return jz.o.f84542k;
        }
        if (qz.a.f106207g.equals(aVar)) {
            return jz.o.f84543l;
        }
        if (qz.a.f106208h.equals(aVar)) {
            return jz.o.f84544m;
        }
        throw new JOSEException("Unexpected curve: " + aVar);
    }

    public static byte[] e(byte[] bArr) throws JOSEException {
        byte[] bArr2;
        int length = bArr.length / 2;
        int i11 = length;
        while (i11 > 0 && bArr[length - i11] == 0) {
            i11--;
        }
        int i12 = length - i11;
        int i13 = bArr[i12] < 0 ? i11 + 1 : i11;
        int i14 = length;
        while (i14 > 0 && bArr[(length * 2) - i14] == 0) {
            i14--;
        }
        int i15 = (length * 2) - i14;
        int i16 = bArr[i15] < 0 ? i14 + 1 : i14;
        int i17 = i13 + 4 + i16;
        if (i17 > 255) {
            throw new JOSEException("Invalid ECDSA signature format");
        }
        int i18 = 1;
        if (i17 < 128) {
            bArr2 = new byte[i13 + 6 + i16];
        } else {
            bArr2 = new byte[i13 + 7 + i16];
            bArr2[1] = -127;
            i18 = 2;
        }
        bArr2[0] = 48;
        bArr2[i18] = (byte) i17;
        bArr2[i18 + 1] = 2;
        bArr2[i18 + 2] = (byte) i13;
        int i19 = i18 + 3 + i13;
        System.arraycopy(bArr, i12, bArr2, i19 - i11, i11);
        bArr2[i19] = 2;
        bArr2[i19 + 1] = (byte) i16;
        System.arraycopy(bArr, i15, bArr2, ((i19 + 2) + i16) - i14, i14);
        return bArr2;
    }
}
