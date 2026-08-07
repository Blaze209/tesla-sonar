package nz;

import com.nimbusds.jose.JOSEException;

/* JADX INFO: loaded from: classes6.dex */
public class n {
    public static byte[] a(jz.l lVar, byte[] bArr) throws JOSEException {
        jz.c cVarS = lVar.s();
        if (cVarS == null) {
            return bArr;
        }
        if (!cVarS.equals(jz.c.f84442b)) {
            throw new JOSEException("Unsupported compression algorithm: " + cVarS);
        }
        try {
            return yz.g.a(bArr);
        } catch (Exception e11) {
            throw new JOSEException("Couldn't compress plain text: " + e11.getMessage(), e11);
        }
    }

    public static byte[] b(jz.l lVar, byte[] bArr) throws JOSEException {
        jz.c cVarS = lVar.s();
        if (cVarS == null) {
            return bArr;
        }
        if (!cVarS.equals(jz.c.f84442b)) {
            throw new JOSEException("Unsupported compression algorithm: " + cVarS);
        }
        try {
            return yz.g.b(bArr);
        } catch (Exception e11) {
            throw new JOSEException("Couldn't decompress plain text: " + e11.getMessage(), e11);
        }
    }
}
