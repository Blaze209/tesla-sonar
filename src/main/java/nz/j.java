package nz;

import com.nimbusds.jose.KeyLengthException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SecretKey f95499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SecretKey f95500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SecretKey f95501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f95502d;

    public j(SecretKey secretKey) throws KeyLengthException {
        this.f95499a = secretKey;
        byte[] encoded = secretKey.getEncoded();
        if (encoded.length == 32) {
            this.f95500b = new SecretKeySpec(encoded, 0, 16, "HMACSHA256");
            this.f95501c = new SecretKeySpec(encoded, 16, 16, "AES");
            this.f95502d = 16;
        } else if (encoded.length == 48) {
            this.f95500b = new SecretKeySpec(encoded, 0, 24, "HMACSHA384");
            this.f95501c = new SecretKeySpec(encoded, 24, 24, "AES");
            this.f95502d = 24;
        } else {
            if (encoded.length != 64) {
                throw new KeyLengthException("Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits");
            }
            this.f95500b = new SecretKeySpec(encoded, 0, 32, "HMACSHA512");
            this.f95501c = new SecretKeySpec(encoded, 32, 32, "AES");
            this.f95502d = 32;
        }
    }

    public SecretKey a() {
        return this.f95501c;
    }

    public SecretKey b() {
        return this.f95500b;
    }

    public int c() {
        return this.f95502d;
    }
}
