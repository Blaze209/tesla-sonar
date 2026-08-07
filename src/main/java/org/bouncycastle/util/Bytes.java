package org.bouncycastle.util;

/* JADX INFO: loaded from: classes10.dex */
public class Bytes {
    public static final int BYTES = 1;
    public static final int SIZE = 8;

    public static void xor(int i11, byte[] bArr, int i12, byte[] bArr2, int i13, byte[] bArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            bArr3[i14 + i15] = (byte) (bArr[i12 + i15] ^ bArr2[i13 + i15]);
        }
    }

    public static void xorTo(int i11, byte[] bArr, int i12, byte[] bArr2, int i13) {
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = i13 + i14;
            bArr2[i15] = (byte) (bArr2[i15] ^ bArr[i12 + i14]);
        }
    }

    public static void xor(int i11, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i12 = 0; i12 < i11; i12++) {
            bArr3[i12] = (byte) (bArr[i12] ^ bArr2[i12]);
        }
    }

    public static void xorTo(int i11, byte[] bArr, byte[] bArr2) {
        for (int i12 = 0; i12 < i11; i12++) {
            bArr2[i12] = (byte) (bArr2[i12] ^ bArr[i12]);
        }
    }
}
