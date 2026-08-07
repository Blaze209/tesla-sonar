package org.bouncycastle.pqc.crypto.picnic;

import org.bouncycastle.util.Integers;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes10.dex */
class Utils {
    Utils() {
    }

    protected static int ceil_log2(int i11) {
        if (i11 == 0) {
            return 0;
        }
        return 32 - nlz(i11 - 1);
    }

    protected static byte getBit(byte[] bArr, int i11) {
        return (byte) ((bArr[i11 >>> 3] >>> ((i11 & 7) ^ 7)) & 1);
    }

    protected static int getBitFromWordArray(int[] iArr, int i11) {
        return getBit(iArr, i11);
    }

    protected static byte getCrumbAligned(byte[] bArr, int i11) {
        int i12 = bArr[i11 >>> 2] >>> (((i11 << 1) & 6) ^ 6);
        return (byte) (((i12 & 2) >> 1) | ((i12 & 1) << 1));
    }

    protected static int getTrailingBitsMask(int i11) {
        int i12 = i11 & (-8);
        int i13 = ~((-1) << i12);
        int i14 = i11 & 7;
        return i14 != 0 ? (((CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB >>> i14) & 255) << i12) ^ i13 : i13;
    }

    private static int nlz(int i11) {
        int i12;
        if (i11 == 0) {
            return 32;
        }
        if ((i11 >>> 16) == 0) {
            i11 <<= 16;
            i12 = 17;
        } else {
            i12 = 1;
        }
        if ((i11 >>> 24) == 0) {
            i12 += 8;
            i11 <<= 8;
        }
        if ((i11 >>> 28) == 0) {
            i12 += 4;
            i11 <<= 4;
        }
        if ((i11 >>> 30) == 0) {
            i12 += 2;
            i11 <<= 2;
        }
        return i12 - (i11 >>> 31);
    }

    protected static int numBytes(int i11) {
        if (i11 == 0) {
            return 0;
        }
        return ((i11 - 1) / 8) + 1;
    }

    protected static int parity(byte[] bArr, int i11) {
        byte b11 = bArr[0];
        for (int i12 = 1; i12 < i11; i12++) {
            b11 = (byte) (b11 ^ bArr[i12]);
        }
        return Integers.bitCount(b11 & 255) & 1;
    }

    protected static int parity16(int i11) {
        return Integers.bitCount(i11 & 65535) & 1;
    }

    protected static int parity32(int i11) {
        return Integers.bitCount(i11) & 1;
    }

    protected static int setBit(int i11, int i12, int i13) {
        int i14 = i12 ^ 7;
        return (i11 & (~(1 << i14))) | (i13 << i14);
    }

    protected static void setBitInWordArray(int[] iArr, int i11, int i12) {
        setBit(iArr, i11, i12);
    }

    protected static void zeroTrailingBits(int[] iArr, int i11) {
        if ((i11 & 31) != 0) {
            int i12 = i11 >>> 5;
            iArr[i12] = getTrailingBitsMask(i11) & iArr[i12];
        }
    }

    protected static int getBit(int i11, int i12) {
        return (i11 >>> (i12 ^ 7)) & 1;
    }

    protected static void setBit(byte[] bArr, int i11, byte b11) {
        int i12 = i11 >>> 3;
        int i13 = (i11 & 7) ^ 7;
        bArr[i12] = (byte) ((b11 << i13) | (bArr[i12] & (~(1 << i13))));
    }

    protected static int getBit(int[] iArr, int i11) {
        return (iArr[i11 >>> 5] >>> ((i11 & 31) ^ 7)) & 1;
    }

    protected static void setBit(int[] iArr, int i11, int i12) {
        int i13 = i11 >>> 5;
        int i14 = (i11 & 31) ^ 7;
        iArr[i13] = (i12 << i14) | (iArr[i13] & (~(1 << i14)));
    }
}
