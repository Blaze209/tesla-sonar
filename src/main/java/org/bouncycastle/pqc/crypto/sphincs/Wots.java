package org.bouncycastle.pqc.crypto.sphincs;

/* JADX INFO: loaded from: classes10.dex */
class Wots {
    static final int WOTS_L = 67;
    static final int WOTS_L1 = 64;
    static final int WOTS_LOGW = 4;
    static final int WOTS_LOG_L = 7;
    static final int WOTS_SIGBYTES = 2144;
    static final int WOTS_W = 16;

    Wots() {
    }

    private static void clear(byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 != i12; i13++) {
            bArr[i13 + i11] = 0;
        }
    }

    static void expand_seed(byte[] bArr, int i11, byte[] bArr2, int i12) {
        clear(bArr, i11, WOTS_SIGBYTES);
        Seed.prg(bArr, i11, 2144L, bArr2, i12);
    }

    static void gen_chain(HashFunctions hashFunctions, byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13, int i14) {
        for (int i15 = 0; i15 < 32; i15++) {
            bArr[i15 + i11] = bArr2[i15 + i12];
        }
        for (int i16 = 0; i16 < i14 && i16 < 16; i16++) {
            hashFunctions.hash_n_n_mask(bArr, i11, bArr, i11, bArr3, i13 + (i16 * 32));
        }
    }

    void wots_pkgen(HashFunctions hashFunctions, byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13) {
        expand_seed(bArr, i11, bArr2, i12);
        for (int i14 = 0; i14 < 67; i14++) {
            int i15 = i11 + (i14 * 32);
            gen_chain(hashFunctions, bArr, i15, bArr, i15, bArr3, i13, 15);
        }
    }

    void wots_sign(HashFunctions hashFunctions, byte[] bArr, int i11, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int[] iArr = new int[67];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < 64) {
            byte b11 = bArr2[i13 / 2];
            iArr[i13] = b11 & 15;
            int i15 = (b11 & 255) >>> 4;
            iArr[i13 + 1] = i15;
            i14 = i14 + (15 - iArr[i13]) + (15 - i15);
            i13 += 2;
        }
        while (i13 < 67) {
            iArr[i13] = i14 & 15;
            i14 >>>= 4;
            i13++;
        }
        byte[] bArr5 = bArr;
        expand_seed(bArr5, i11, bArr3, 0);
        while (i12 < 67) {
            int i16 = i11 + (i12 * 32);
            gen_chain(hashFunctions, bArr5, i16, bArr, i16, bArr4, 0, iArr[i12]);
            i12++;
            bArr5 = bArr;
        }
    }

    void wots_verify(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4) {
        int[] iArr = new int[67];
        int i12 = 0;
        int i13 = 0;
        while (i12 < 64) {
            byte b11 = bArr3[i12 / 2];
            iArr[i12] = b11 & 15;
            int i14 = (b11 & 255) >>> 4;
            iArr[i12 + 1] = i14;
            i13 = i13 + (15 - iArr[i12]) + (15 - i14);
            i12 += 2;
        }
        while (i12 < 67) {
            iArr[i12] = i13 & 15;
            i13 >>>= 4;
            i12++;
        }
        for (int i15 = 0; i15 < 67; i15++) {
            int i16 = i15 * 32;
            int i17 = iArr[i15];
            gen_chain(hashFunctions, bArr, i16, bArr2, i11 + i16, bArr4, i17 * 32, 15 - i17);
        }
    }
}
