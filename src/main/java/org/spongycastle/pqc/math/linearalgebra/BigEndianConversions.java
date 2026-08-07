package org.spongycastle.pqc.math.linearalgebra;

/* JADX INFO: loaded from: classes10.dex */
public final class BigEndianConversions {
    private BigEndianConversions() {
    }

    public static byte[] I2OSP(int i11) {
        return new byte[]{(byte) (i11 >>> 24), (byte) (i11 >>> 16), (byte) (i11 >>> 8), (byte) i11};
    }

    public static int OS2IP(byte[] bArr) {
        if (bArr.length > 4) {
            throw new ArithmeticException("invalid input length");
        }
        if (bArr.length == 0) {
            return 0;
        }
        int length = 0;
        for (int i11 = 0; i11 < bArr.length; i11++) {
            length |= (bArr[i11] & 255) << (((bArr.length - 1) - i11) * 8);
        }
        return length;
    }

    public static long OS2LIP(byte[] bArr, int i11) {
        long j11 = ((((long) bArr[i11]) & 255) << 56) | ((((long) bArr[i11 + 1]) & 255) << 48) | ((((long) bArr[i11 + 2]) & 255) << 40) | ((((long) bArr[i11 + 3]) & 255) << 32) | ((255 & ((long) bArr[i11 + 4])) << 24) | ((long) ((bArr[i11 + 5] & 255) << 16));
        return ((long) (bArr[i11 + 7] & 255)) | j11 | ((long) ((bArr[i11 + 6] & 255) << 8));
    }

    public static byte[] toByteArray(int[] iArr) {
        byte[] bArr = new byte[iArr.length << 2];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            I2OSP(iArr[i11], bArr, i11 << 2);
        }
        return bArr;
    }

    public static int[] toIntArray(byte[] bArr) {
        int length = (bArr.length + 3) / 4;
        int length2 = bArr.length & 3;
        int[] iArr = new int[length];
        int i11 = 0;
        int i12 = 0;
        while (i11 <= length - 2) {
            iArr[i11] = OS2IP(bArr, i12);
            i11++;
            i12 += 4;
        }
        if (length2 != 0) {
            iArr[length - 1] = OS2IP(bArr, i12, length2);
            return iArr;
        }
        iArr[length - 1] = OS2IP(bArr, i12);
        return iArr;
    }

    public static byte[] I2OSP(int i11, int i12) {
        if (i11 < 0) {
            return null;
        }
        int iCeilLog256 = IntegerFunctions.ceilLog256(i11);
        if (iCeilLog256 > i12) {
            throw new ArithmeticException("Cannot encode given integer into specified number of octets.");
        }
        byte[] bArr = new byte[i12];
        int i13 = i12 - 1;
        for (int i14 = i13; i14 >= i12 - iCeilLog256; i14--) {
            bArr[i14] = (byte) (i11 >>> ((i13 - i14) * 8));
        }
        return bArr;
    }

    public static byte[] toByteArray(int[] iArr, int i11) {
        int length = iArr.length;
        byte[] bArr = new byte[i11];
        int i12 = 0;
        int i13 = 0;
        while (i12 <= length - 2) {
            I2OSP(iArr[i12], bArr, i13);
            i12++;
            i13 += 4;
        }
        I2OSP(iArr[length - 1], bArr, i13, i11 - i13);
        return bArr;
    }

    public static void I2OSP(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) (i11 >>> 24);
        bArr[i12 + 1] = (byte) (i11 >>> 16);
        bArr[i12 + 2] = (byte) (i11 >>> 8);
        bArr[i12 + 3] = (byte) i11;
    }

    public static int OS2IP(byte[] bArr, int i11) {
        int i12 = ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11] & 255) << 24);
        return (bArr[i11 + 3] & 255) | i12 | ((bArr[i11 + 2] & 255) << 8);
    }

    public static byte[] I2OSP(long j11) {
        return new byte[]{(byte) (j11 >>> 56), (byte) (j11 >>> 48), (byte) (j11 >>> 40), (byte) (j11 >>> 32), (byte) (j11 >>> 24), (byte) (j11 >>> 16), (byte) (j11 >>> 8), (byte) j11};
    }

    public static int OS2IP(byte[] bArr, int i11, int i12) {
        if (bArr.length == 0 || bArr.length < (i11 + i12) - 1) {
            return 0;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            i13 |= (bArr[i11 + i14] & 255) << (((i12 - i14) - 1) * 8);
        }
        return i13;
    }

    public static void I2OSP(long j11, byte[] bArr, int i11) {
        bArr[i11] = (byte) (j11 >>> 56);
        bArr[i11 + 1] = (byte) (j11 >>> 48);
        bArr[i11 + 2] = (byte) (j11 >>> 40);
        bArr[i11 + 3] = (byte) (j11 >>> 32);
        bArr[i11 + 4] = (byte) (j11 >>> 24);
        bArr[i11 + 5] = (byte) (j11 >>> 16);
        bArr[i11 + 6] = (byte) (j11 >>> 8);
        bArr[i11 + 7] = (byte) j11;
    }

    public static void I2OSP(int i11, byte[] bArr, int i12, int i13) {
        int i14 = i13 - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            bArr[i12 + i15] = (byte) (i11 >>> ((i14 - i15) * 8));
        }
    }
}
