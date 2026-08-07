package dr0;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import net.sf.scuba.smartcards.CardServiceException;
import org.jmrtd.CardServiceProtocolException;

/* JADX INFO: loaded from: classes10.dex */
public class e implements yq0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Provider f60930d = yq0.o.n();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final IvParameterSpec f60931e = new IvParameterSpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private zo0.e f60932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Cipher f60933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Mac f60934c;

    public e(zo0.e eVar) {
        this.f60932a = eVar;
        try {
            this.f60934c = Mac.getInstance("ISO9797Alg3Mac", f60930d);
            this.f60933b = yq0.o.p("DESede/CBC/NoPadding");
        } catch (GeneralSecurityException e11) {
            throw new IllegalStateException("Unexpected security exception during initialization", e11);
        }
    }

    @Override // yq0.b
    public synchronized byte[] a() {
        return c(null);
    }

    @Override // yq0.b
    public synchronized byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3, SecretKey secretKey, SecretKey secretKey2) {
        byte[] bArrDoFinal;
        byte[] bArr4 = bArr2;
        synchronized (this) {
            try {
                if (bArr != null) {
                    try {
                        if (bArr.length == 8) {
                            if (bArr4 == null || bArr4.length != 8) {
                                bArr4 = new byte[8];
                            }
                            if (bArr3 == null || bArr3.length != 16) {
                                throw new IllegalArgumentException("kIFD wrong length");
                            }
                            if (secretKey == null) {
                                throw new IllegalArgumentException("kEnc == null");
                            }
                            if (secretKey2 == null) {
                                throw new IllegalArgumentException("kMac == null");
                            }
                            Cipher cipher = this.f60933b;
                            IvParameterSpec ivParameterSpec = f60931e;
                            cipher.init(1, secretKey, ivParameterSpec);
                            byte[] bArr5 = new byte[32];
                            System.arraycopy(bArr, 0, bArr5, 0, 8);
                            System.arraycopy(bArr4, 0, bArr5, 8, 8);
                            System.arraycopy(bArr3, 0, bArr5, 16, 16);
                            byte[] bArrDoFinal2 = this.f60933b.doFinal(bArr5);
                            if (bArrDoFinal2.length != 32) {
                                throw new IllegalStateException("Cryptogram wrong length " + bArrDoFinal2.length);
                            }
                            this.f60934c.init(secretKey2);
                            byte[] bArrDoFinal3 = this.f60934c.doFinal(yq0.o.J(bArrDoFinal2, 8));
                            if (bArrDoFinal3.length != 8) {
                                throw new IllegalStateException("MAC wrong length");
                            }
                            byte[] bArr6 = new byte[40];
                            System.arraycopy(bArrDoFinal2, 0, bArr6, 0, 32);
                            System.arraycopy(bArrDoFinal3, 0, bArr6, 32, 8);
                            zo0.j jVarF = this.f60932a.f(new zo0.f(0, -126, 0, 0, bArr6, 40));
                            if (jVarF == null) {
                                throw new CardServiceException("Mutual authentication failed, received null response APDU");
                            }
                            byte[] bArrB = jVarF.b();
                            short sD = (short) jVarF.d();
                            if (bArrB == null) {
                                throw new CardServiceException("Mutual authentication failed, received empty data in response APDU", sD);
                            }
                            if (sD != -28672) {
                                zo0.j jVarF2 = this.f60932a.f(new zo0.f(0, -126, 0, 0, bArr6, 0));
                                bArrB = jVarF2.b();
                                sD = (short) jVarF2.d();
                            }
                            if (bArrB.length != 42) {
                                throw new CardServiceProtocolException("Mutual authentication failed: expected length: 40 + 2, actual length: " + bArrB.length, 0, sD);
                            }
                            this.f60933b.init(2, secretKey, ivParameterSpec);
                            bArrDoFinal = this.f60933b.doFinal(bArrB, 0, bArrB.length - 10);
                            if (bArrDoFinal.length != 32) {
                                throw new CardServiceException("Cryptogram wrong length, was expecting 32, found " + bArrDoFinal.length, sD);
                            }
                        }
                    } catch (GeneralSecurityException e11) {
                        throw new CardServiceException("Security exception during mutual auth", e11);
                    }
                }
                throw new IllegalArgumentException("rndIFD wrong length");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArrDoFinal;
    }

    public synchronized byte[] c(zo0.c cVar) {
        byte[] bArrC;
        zo0.j jVarF = this.f60932a.f(new zo0.f(0, -124, 0, 0, 8));
        bArrC = jVarF.c();
        if (bArrC == null || bArrC.length != 8) {
            throw new CardServiceException("Get challenge failed", jVarF.d());
        }
        return bArrC;
    }
}
