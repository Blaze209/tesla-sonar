package dr0;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Random;
import javax.crypto.SecretKey;
import net.sf.scuba.smartcards.CardServiceException;
import org.jmrtd.CardServiceProtocolException;

/* JADX INFO: loaded from: classes10.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private yq0.b f60935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Random f60936b = new SecureRandom();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f60937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f60938d;

    public f(yq0.b bVar, int i11, boolean z11) {
        this.f60935a = bVar;
        this.f60937c = i11;
        this.f60938d = z11;
    }

    public static long a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 8 || bArr2 == null || bArr2.length != 8) {
            throw new IllegalStateException("Wrong length input");
        }
        long j11 = 0;
        for (int i11 = 4; i11 < 8; i11++) {
            j11 = (j11 << 8) + ((long) (bArr[i11] & 255));
        }
        for (int i12 = 4; i12 < 8; i12++) {
            j11 = (j11 << 8) + ((long) (bArr2[i12] & 255));
        }
        return j11;
    }

    private y c(SecretKey secretKey, SecretKey secretKey2) throws CardServiceProtocolException {
        try {
            byte[] bArrA = this.f60935a.a();
            byte[] bArr = new byte[8];
            this.f60936b.nextBytes(bArr);
            byte[] bArr2 = new byte[16];
            this.f60936b.nextBytes(bArr2);
            try {
                byte[] bArr3 = new byte[16];
                System.arraycopy(this.f60935a.b(bArr, bArrA, bArr2, secretKey, secretKey2), 16, bArr3, 0, 16);
                byte[] bArr4 = new byte[16];
                for (int i11 = 0; i11 < 16; i11++) {
                    bArr4[i11] = (byte) ((bArr2[i11] & 255) ^ (bArr3[i11] & 255));
                }
                return new h(yq0.o.e(bArr4, 1), yq0.o.e(bArr4, 2), this.f60937c, this.f60938d, a(bArrA, bArr));
            } catch (Exception e11) {
                throw new CardServiceProtocolException("BAC failed in MUTUAL AUTH", 2, e11);
            }
        } catch (Exception e12) {
            throw new CardServiceProtocolException("BAC failed in GET CHALLENGE", 1, e12);
        }
    }

    public g b(yq0.g gVar) throws CardServiceException {
        try {
            byte[] key = gVar.getKey();
            return new g(gVar, c(yq0.o.e(key, 1), yq0.o.e(key, 2)));
        } catch (GeneralSecurityException e11) {
            throw new CardServiceException("Error during BAC", e11);
        }
    }
}
