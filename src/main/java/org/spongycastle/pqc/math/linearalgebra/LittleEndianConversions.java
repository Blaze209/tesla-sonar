package org.spongycastle.pqc.math.linearalgebra;

/* JADX INFO: loaded from: classes10.dex */
public final class LittleEndianConversions {
    private LittleEndianConversions() {
    }

    public static byte[] I2OSP(int i11) {
        return new byte[]{(byte) i11, (byte) (i11 >>> 8), (byte) (i11 >>> 16), (byte) (i11 >>> 24)};
    }

    public static int OS2IP(byte[] bArr) {
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    public static long OS2LIP(byte[] bArr, int i11) {
        long j11 = ((long) (bArr[i11] & 255)) | ((long) ((bArr[i11 + 1] & 255) << 8)) | ((long) ((bArr[i11 + 2] & 255) << 16)) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40);
        return ((((long) bArr[i11 + 7]) & 255) << 56) | j11 | ((((long) bArr[i11 + 6]) & 255) << 48);
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

    public static void I2OSP(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) i11;
        bArr[i12 + 1] = (byte) (i11 >>> 8);
        bArr[i12 + 2] = (byte) (i11 >>> 16);
        bArr[i12 + 3] = (byte) (i11 >>> 24);
    }

    public static int OS2IP(byte[] bArr, int i11) {
        int i12 = ((bArr[i11 + 1] & 255) << 8) | (bArr[i11] & 255);
        return ((bArr[i11 + 3] & 255) << 24) | i12 | ((bArr[i11 + 2] & 255) << 16);
    }

    public static void I2OSP(int i11, byte[] bArr, int i12, int i13) {
        for (int i14 = i13 - 1; i14 >= 0; i14--) {
            bArr[i12 + i14] = (byte) (i11 >>> (i14 * 8));
        }
    }

    public static int OS2IP(byte[] bArr, int i11, int i12) {
        int i13 = 0;
        for (int i14 = i12 - 1; i14 >= 0; i14--) {
            i13 |= (bArr[i11 + i14] & 255) << (i14 * 8);
        }
        return i13;
    }

    public static byte[] I2OSP(long j11) {
        return new byte[]{(byte) j11, (byte) (j11 >>> 8), (byte) (j11 >>> 16), (byte) (j11 >>> 24), (byte) (j11 >>> 32), (byte) (j11 >>> 40), (byte) (j11 >>> 48), (byte) (j11 >>> 56)};
    }

    public static void I2OSP(long j11, byte[] bArr, int i11) {
        bArr[i11] = (byte) j11;
        bArr[i11 + 1] = (byte) (j11 >>> 8);
        bArr[i11 + 2] = (byte) (j11 >>> 16);
        bArr[i11 + 3] = (byte) (j11 >>> 24);
        bArr[i11 + 4] = (byte) (j11 >>> 32);
        bArr[i11 + 5] = (byte) (j11 >>> 40);
        bArr[i11 + 6] = (byte) (j11 >>> 48);
        bArr[i11 + 7] = (byte) (j11 >>> 56);
    }
}
