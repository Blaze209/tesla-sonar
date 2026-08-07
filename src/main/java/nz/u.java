package nz;

import com.nimbusds.jose.JOSEException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f95512a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f95513b = {0, 0, 0, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f95514c = {69, 110, 99, 114, 121, 112, 116, 105, 111, 110};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f95515d = {73, 110, 116, 101, 103, 114, 105, 116, 121};

    public static SecretKey a(SecretKey secretKey, jz.d dVar, byte[] bArr, byte[] bArr2) throws JOSEException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(f95512a);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length * 8;
            byteArrayOutputStream.write(yz.h.a(length / 2));
            byteArrayOutputStream.write(dVar.toString().getBytes(yz.l.f126026a));
            if (bArr != null) {
                byteArrayOutputStream.write(yz.h.a(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(f95513b);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(yz.h.a(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(f95513b);
            }
            byteArrayOutputStream.write(f95514c);
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA-" + length).digest(byteArrayOutputStream.toByteArray());
                int length2 = bArrDigest.length / 2;
                byte[] bArr3 = new byte[length2];
                System.arraycopy(bArrDigest, 0, bArr3, 0, length2);
                return new SecretKeySpec(bArr3, "AES");
            } catch (NoSuchAlgorithmException e11) {
                throw new JOSEException(e11.getMessage(), e11);
            }
        } catch (IOException e12) {
            throw new JOSEException(e12.getMessage(), e12);
        }
    }

    public static SecretKey b(SecretKey secretKey, jz.d dVar, byte[] bArr, byte[] bArr2) throws JOSEException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(f95512a);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length * 8;
            byteArrayOutputStream.write(yz.h.a(length));
            byteArrayOutputStream.write(dVar.toString().getBytes(yz.l.f126026a));
            if (bArr != null) {
                byteArrayOutputStream.write(yz.h.a(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(f95513b);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(yz.h.a(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(f95513b);
            }
            byteArrayOutputStream.write(f95515d);
            try {
                return new SecretKeySpec(MessageDigest.getInstance("SHA-" + length).digest(byteArrayOutputStream.toByteArray()), "HMACSHA" + length);
            } catch (NoSuchAlgorithmException e11) {
                throw new JOSEException(e11.getMessage(), e11);
            }
        } catch (IOException e12) {
            throw new JOSEException(e12.getMessage(), e12);
        }
    }
}
