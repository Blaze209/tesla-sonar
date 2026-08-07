package nz;

import com.nimbusds.jose.JOSEException;
import javax.crypto.SecretKey;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes6.dex */
public class t {
    public static AESEngine a(SecretKey secretKey, boolean z11) {
        AESEngine aESEngine = new AESEngine();
        aESEngine.init(z11, new KeyParameter(secretKey.getEncoded()));
        return aESEngine;
    }

    private static GCMBlockCipher b(SecretKey secretKey, boolean z11, byte[] bArr, byte[] bArr2) {
        GCMBlockCipher gCMBlockCipher = new GCMBlockCipher(a(secretKey, z11));
        gCMBlockCipher.init(z11, new AEADParameters(new KeyParameter(secretKey.getEncoded()), 128, bArr, bArr2));
        return gCMBlockCipher;
    }

    public static byte[] c(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws JOSEException {
        GCMBlockCipher gCMBlockCipherB = b(secretKey, false, bArr, bArr3);
        int length = bArr2.length + bArr4.length;
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        System.arraycopy(bArr4, 0, bArr5, bArr2.length, bArr4.length);
        byte[] bArr6 = new byte[gCMBlockCipherB.getOutputSize(length)];
        try {
            gCMBlockCipherB.doFinal(bArr6, gCMBlockCipherB.processBytes(bArr5, 0, length, bArr6, 0));
            return bArr6;
        } catch (InvalidCipherTextException e11) {
            throw new JOSEException("Couldn't validate GCM authentication tag: " + e11.getMessage(), e11);
        }
    }

    public static f d(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3) throws JOSEException {
        GCMBlockCipher gCMBlockCipherB = b(secretKey, true, bArr, bArr3);
        byte[] bArr4 = new byte[gCMBlockCipherB.getOutputSize(bArr2.length)];
        int iProcessBytes = gCMBlockCipherB.processBytes(bArr2, 0, bArr2.length, bArr4, 0);
        try {
            int iDoFinal = (iProcessBytes + gCMBlockCipherB.doFinal(bArr4, iProcessBytes)) - 16;
            byte[] bArr5 = new byte[iDoFinal];
            byte[] bArr6 = new byte[16];
            System.arraycopy(bArr4, 0, bArr5, 0, iDoFinal);
            System.arraycopy(bArr4, iDoFinal, bArr6, 0, 16);
            return new f(bArr5, bArr6);
        } catch (InvalidCipherTextException e11) {
            throw new JOSEException("Couldn't generate GCM authentication tag: " + e11.getMessage(), e11);
        }
    }
}
