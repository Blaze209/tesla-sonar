package org.bouncycastle.math.ec.rfc8032;

/* JADX INFO: loaded from: classes10.dex */
abstract class Codec {
    Codec() {
    }

    static int decode16(byte[] bArr, int i11) {
        return ((bArr[i11 + 1] & 255) << 8) | (bArr[i11] & 255);
    }

    static int decode24(byte[] bArr, int i11) {
        return ((bArr[i11 + 2] & 255) << 16) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8);
    }

    static int decode32(byte[] bArr, int i11) {
        return (bArr[i11 + 3] << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    static void encode24(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) i11;
        bArr[i12 + 1] = (byte) (i11 >>> 8);
        bArr[i12 + 2] = (byte) (i11 >>> 16);
    }

    static void encode32(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) i11;
        bArr[i12 + 1] = (byte) (i11 >>> 8);
        bArr[i12 + 2] = (byte) (i11 >>> 16);
        bArr[i12 + 3] = (byte) (i11 >>> 24);
    }

    static void encode56(long j11, byte[] bArr, int i11) {
        encode32((int) j11, bArr, i11);
        encode24((int) (j11 >>> 32), bArr, i11 + 4);
    }

    static void decode32(byte[] bArr, int i11, int[] iArr, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            iArr[i12 + i14] = decode32(bArr, (i14 * 4) + i11);
        }
    }

    static void encode32(int[] iArr, int i11, int i12, byte[] bArr, int i13) {
        for (int i14 = 0; i14 < i12; i14++) {
            encode32(iArr[i11 + i14], bArr, (i14 * 4) + i13);
        }
    }
}
