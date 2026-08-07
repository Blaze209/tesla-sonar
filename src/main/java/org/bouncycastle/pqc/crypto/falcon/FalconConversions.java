package org.bouncycastle.pqc.crypto.falcon;

/* JADX INFO: loaded from: classes10.dex */
class FalconConversions {
    FalconConversions() {
    }

    private int toUnsignedInt(byte b11) {
        return b11 & 255;
    }

    private long toUnsignedLong(byte b11) {
        return ((long) b11) & 255;
    }

    int bytes_to_int(byte[] bArr, int i11) {
        return (toUnsignedInt(bArr[i11 + 3]) << 24) | toUnsignedInt(bArr[i11]) | (toUnsignedInt(bArr[i11 + 1]) << 8) | (toUnsignedInt(bArr[i11 + 2]) << 16);
    }

    int[] bytes_to_int_array(byte[] bArr, int i11, int i12) {
        int[] iArr = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            iArr[i13] = bytes_to_int(bArr, (i13 * 4) + i11);
        }
        return iArr;
    }

    long bytes_to_long(byte[] bArr, int i11) {
        return (toUnsignedLong(bArr[i11 + 7]) << 56) | toUnsignedLong(bArr[i11]) | (toUnsignedLong(bArr[i11 + 1]) << 8) | (toUnsignedLong(bArr[i11 + 2]) << 16) | (toUnsignedLong(bArr[i11 + 3]) << 24) | (toUnsignedLong(bArr[i11 + 4]) << 32) | (toUnsignedLong(bArr[i11 + 5]) << 40) | (toUnsignedLong(bArr[i11 + 6]) << 48);
    }

    byte[] int_to_bytes(int i11) {
        return new byte[]{(byte) i11, (byte) (i11 >>> 8), (byte) (i11 >>> 16), (byte) (i11 >>> 24)};
    }

    byte[] long_to_bytes(long j11) {
        return new byte[]{(byte) j11, (byte) (j11 >>> 8), (byte) (j11 >>> 16), (byte) (j11 >>> 24), (byte) (j11 >>> 32), (byte) (j11 >>> 40), (byte) (j11 >>> 48), (byte) (j11 >>> 56)};
    }
}
