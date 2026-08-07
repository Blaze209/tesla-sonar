package org.spongycastle.crypto.prng.drbg;

import java.util.Hashtable;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSKeyParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.Mac;
import org.spongycastle.util.Integers;

/* JADX INFO: loaded from: classes10.dex */
class Utils {
    static final Hashtable maxSecurityStrengths;

    static {
        Hashtable hashtable = new Hashtable();
        maxSecurityStrengths = hashtable;
        hashtable.put("SHA-1", Integers.valueOf(128));
        hashtable.put("SHA-224", Integers.valueOf(192));
        hashtable.put("SHA-256", Integers.valueOf(256));
        hashtable.put("SHA-384", Integers.valueOf(256));
        hashtable.put("SHA-512", Integers.valueOf(256));
        hashtable.put("SHA-512/224", Integers.valueOf(192));
        hashtable.put(SPHINCSKeyParameters.SHA512_256, Integers.valueOf(256));
    }

    Utils() {
    }

    static int getMaxSecurityStrength(Digest digest) {
        return ((Integer) maxSecurityStrengths.get(digest.getAlgorithmName())).intValue();
    }

    static byte[] hash_df(Digest digest, byte[] bArr, int i11) {
        int i12 = (i11 + 7) / 8;
        byte[] bArr2 = new byte[i12];
        int digestSize = i12 / digest.getDigestSize();
        int digestSize2 = digest.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        int i13 = 1;
        int i14 = 0;
        for (int i15 = 0; i15 <= digestSize; i15++) {
            digest.update((byte) i13);
            digest.update((byte) (i11 >> 24));
            digest.update((byte) (i11 >> 16));
            digest.update((byte) (i11 >> 8));
            digest.update((byte) i11);
            digest.update(bArr, 0, bArr.length);
            digest.doFinal(bArr3, 0);
            int i16 = i15 * digestSize2;
            int i17 = i12 - i16;
            if (i17 > digestSize2) {
                i17 = digestSize2;
            }
            System.arraycopy(bArr3, 0, bArr2, i16, i17);
            i13++;
        }
        int i18 = i11 % 8;
        if (i18 != 0) {
            int i19 = 8 - i18;
            int i21 = 0;
            while (i14 != i12) {
                int i22 = bArr2[i14] & 255;
                bArr2[i14] = (byte) ((i21 << (8 - i19)) | (i22 >>> i19));
                i14++;
                i21 = i22;
            }
        }
        return bArr2;
    }

    static boolean isTooLarge(byte[] bArr, int i11) {
        return bArr != null && bArr.length > i11;
    }

    static int getMaxSecurityStrength(Mac mac) {
        String algorithmName = mac.getAlgorithmName();
        return ((Integer) maxSecurityStrengths.get(algorithmName.substring(0, algorithmName.indexOf("/")))).intValue();
    }
}
