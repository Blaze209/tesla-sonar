package org.bouncycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
class RainbowUtil {
    RainbowUtil() {
    }

    public static short[][] cloneArray(short[][] sArr) {
        short[][] sArr2 = new short[sArr.length][];
        for (int i11 = 0; i11 < sArr.length; i11++) {
            sArr2[i11] = Arrays.clone(sArr[i11]);
        }
        return sArr2;
    }

    public static byte[] convertArray(short[] sArr) {
        byte[] bArr = new byte[sArr.length];
        for (int i11 = 0; i11 < sArr.length; i11++) {
            bArr[i11] = (byte) sArr[i11];
        }
        return bArr;
    }

    public static boolean equals(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z11 = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z11 &= sArr[length] == sArr2[length];
        }
        return z11;
    }

    public static short[][][] generate_random(SecureRandom secureRandom, int i11, int i12, int i13, boolean z11) {
        byte[] bArr = new byte[z11 ? (((i12 + 1) * i12) / 2) * i11 : i11 * i12 * i13];
        secureRandom.nextBytes(bArr);
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i11, i12, i13);
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            for (int i16 = 0; i16 < i13; i16++) {
                for (int i17 = 0; i17 < i11; i17++) {
                    if (!z11 || i15 <= i16) {
                        sArr[i17][i15][i16] = (short) (bArr[i14] & 255);
                        i14++;
                    }
                }
            }
        }
        return sArr;
    }

    public static short[][] generate_random_2d(SecureRandom secureRandom, int i11, int i12) {
        byte[] bArr = new byte[i11 * i12];
        secureRandom.nextBytes(bArr);
        short[][] sArr = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i11, i12);
        for (int i13 = 0; i13 < i12; i13++) {
            for (int i14 = 0; i14 < i11; i14++) {
                sArr[i14][i13] = (short) (bArr[(i13 * i11) + i14] & 255);
            }
        }
        return sArr;
    }

    public static byte[] getEncoded(short[][] sArr) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        byte[] bArr = new byte[length * length2];
        for (int i11 = 0; i11 < length2; i11++) {
            for (int i12 = 0; i12 < length; i12++) {
                bArr[(i11 * length) + i12] = (byte) sArr[i12][i11];
            }
        }
        return bArr;
    }

    public static byte[] hash(Digest digest, byte[] bArr, int i11) {
        int digestSize = digest.getDigestSize();
        digest.update(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[digestSize];
        digest.doFinal(bArr2, 0);
        if (i11 == digestSize) {
            return bArr2;
        }
        if (i11 < digestSize) {
            return Arrays.copyOf(bArr2, i11);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr2, digestSize);
        while (true) {
            i11 -= digestSize;
            if (i11 < digestSize) {
                break;
            }
            digest.update(bArr2, 0, digestSize);
            bArr2 = new byte[digestSize];
            digest.doFinal(bArr2, 0);
            bArrCopyOf = Arrays.concatenate(bArrCopyOf, bArr2);
        }
        if (i11 <= 0) {
            return bArrCopyOf;
        }
        digest.update(bArr2, 0, digestSize);
        byte[] bArr3 = new byte[digestSize];
        digest.doFinal(bArr3, 0);
        int length = bArrCopyOf.length;
        byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, length + i11);
        System.arraycopy(bArr3, 0, bArrCopyOf2, length, i11);
        return bArrCopyOf2;
    }

    public static int loadEncoded(short[][] sArr, byte[] bArr, int i11) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        for (int i12 = 0; i12 < length2; i12++) {
            for (int i13 = 0; i13 < length; i13++) {
                sArr[i13][i12] = (short) (bArr[(i12 * length) + i11 + i13] & 255);
            }
        }
        return length * length2;
    }

    public static short[][][] cloneArray(short[][][] sArr) {
        short[][][] sArr2 = (short[][][]) Array.newInstance((Class<?>) short[].class, sArr.length, sArr[0].length);
        for (int i11 = 0; i11 < sArr.length; i11++) {
            for (int i12 = 0; i12 < sArr[0].length; i12++) {
                sArr2[i11][i12] = Arrays.clone(sArr[i11][i12]);
            }
        }
        return sArr2;
    }

    public static short[] convertArray(byte[] bArr) {
        short[] sArr = new short[bArr.length];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            sArr[i11] = (short) (bArr[i11] & 255);
        }
        return sArr;
    }

    public static boolean equals(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean zEquals = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            zEquals &= equals(sArr[length], sArr2[length]);
        }
        return zEquals;
    }

    public static byte[] getEncoded(short[][][] sArr, boolean z11) {
        int length = sArr.length;
        short[][] sArr2 = sArr[0];
        int length2 = sArr2.length;
        int length3 = sArr2[0].length;
        byte[] bArr = new byte[z11 ? (((length2 + 1) * length2) / 2) * length : length * length2 * length3];
        int i11 = 0;
        for (int i12 = 0; i12 < length2; i12++) {
            for (int i13 = 0; i13 < length3; i13++) {
                for (short[][] sArr3 : sArr) {
                    if (!z11 || i12 <= i13) {
                        bArr[i11] = (byte) sArr3[i12][i13];
                        i11++;
                    }
                }
            }
        }
        return bArr;
    }

    public static byte[] hash(Digest digest, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int digestSize = digest.getDigestSize();
        digest.update(bArr, 0, bArr.length);
        digest.update(bArr2, 0, bArr2.length);
        if (bArr3.length == digestSize) {
            digest.doFinal(bArr3, 0);
            return bArr3;
        }
        byte[] bArr4 = new byte[digestSize];
        digest.doFinal(bArr4, 0);
        if (bArr3.length < digestSize) {
            System.arraycopy(bArr4, 0, bArr3, 0, bArr3.length);
            return bArr3;
        }
        System.arraycopy(bArr4, 0, bArr3, 0, digestSize);
        int length = bArr3.length - digestSize;
        int i11 = digestSize;
        while (length >= digestSize) {
            digest.update(bArr4, 0, digestSize);
            digest.doFinal(bArr4, 0);
            System.arraycopy(bArr4, 0, bArr3, i11, digestSize);
            length -= digestSize;
            i11 += digestSize;
        }
        if (length > 0) {
            digest.update(bArr4, 0, digestSize);
            digest.doFinal(bArr4, 0);
            System.arraycopy(bArr4, 0, bArr3, i11, length);
        }
        return bArr3;
    }

    public static int loadEncoded(short[][][] sArr, byte[] bArr, int i11, boolean z11) {
        short[][] sArr2 = sArr[0];
        int length = sArr2.length;
        int length2 = sArr2[0].length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            for (int i14 = 0; i14 < length2; i14++) {
                for (short[][] sArr3 : sArr) {
                    if (!z11 || i13 <= i14) {
                        sArr3[i13][i14] = (short) (bArr[i12 + i11] & 255);
                        i12++;
                    }
                }
            }
        }
        return i12;
    }

    public static boolean equals(short[][][] sArr, short[][][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean zEquals = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            zEquals &= equals(sArr[length], sArr2[length]);
        }
        return zEquals;
    }
}
