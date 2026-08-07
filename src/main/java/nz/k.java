package nz;

import com.nimbusds.jose.JOSEException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class k implements pz.a<pz.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pz.b f95504b = new pz.b();

    public k(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The JCA hash algorithm must not be null");
        }
        this.f95503a = str;
    }

    public static byte[] g(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return yz.e.d(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    public static int h(int i11, int i12) {
        return ((i12 + i11) - 1) / i11;
    }

    public static byte[] k(yz.c cVar) {
        return l(cVar != null ? cVar.a() : null);
    }

    public static byte[] l(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        return yz.e.d(yz.h.a(bArr.length), bArr);
    }

    public static byte[] m(int i11) {
        return yz.h.a(i11);
    }

    public static byte[] n() {
        return new byte[0];
    }

    public static byte[] o(String str) {
        return l(str != null ? str.getBytes(yz.l.f126026a) : null);
    }

    private MessageDigest p() throws JOSEException {
        Provider providerA = e().a();
        try {
            return providerA == null ? MessageDigest.getInstance(this.f95503a) : MessageDigest.getInstance(this.f95503a, providerA);
        } catch (NoSuchAlgorithmException e11) {
            throw new JOSEException("Couldn't get message digest for KDF: " + e11.getMessage(), e11);
        }
    }

    @Override // pz.a
    public pz.b e() {
        return this.f95504b;
    }

    public SecretKey i(SecretKey secretKey, int i11, byte[] bArr) throws JOSEException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        MessageDigest messageDigestP = p();
        for (int i12 = 1; i12 <= h(yz.e.e(messageDigestP.getDigestLength()), i11); i12++) {
            messageDigestP.update(yz.h.a(i12));
            messageDigestP.update(secretKey.getEncoded());
            if (bArr != null) {
                messageDigestP.update(bArr);
            }
            try {
                byteArrayOutputStream.write(messageDigestP.digest());
            } catch (IOException e11) {
                throw new JOSEException("Couldn't write derived key: " + e11.getMessage(), e11);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int iC = yz.e.c(i11);
        return byteArray.length == iC ? new SecretKeySpec(byteArray, "AES") : new SecretKeySpec(yz.e.g(byteArray, 0, iC), "AES");
    }

    public SecretKey j(SecretKey secretKey, int i11, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return i(secretKey, i11, g(bArr, bArr2, bArr3, bArr4, bArr5));
    }
}
