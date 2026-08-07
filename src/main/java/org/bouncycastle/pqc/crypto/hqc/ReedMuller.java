package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
class ReedMuller {

    static class Codeword {
        int[] type32 = new int[4];
        int[] type8 = new int[16];
    }

    ReedMuller() {
    }

    private static int Bit0Mask(int i11) {
        return -(i11 & 1);
    }

    public static void decode(byte[] bArr, long[] jArr, int i11, int i12) {
        byte[] bArrClone = Arrays.clone(bArr);
        int length = jArr.length / 2;
        Codeword[] codewordArr = new Codeword[length];
        int[] iArr = new int[jArr.length * 2];
        Utils.fromLongArrayToByte32Array(iArr, jArr);
        for (int i13 = 0; i13 < length; i13++) {
            codewordArr[i13] = new Codeword();
            for (int i14 = 0; i14 < 4; i14++) {
                codewordArr[i13].type32[i14] = iArr[(i13 * 4) + i14];
            }
        }
        int[] iArr2 = new int[128];
        for (int i15 = 0; i15 < i11; i15++) {
            expandThenSum(iArr2, codewordArr, i15 * i12, i12);
            int[] iArr3 = new int[128];
            hadamardTransform(iArr2, iArr3);
            iArr3[0] = iArr3[0] - (i12 * 64);
            bArrClone[i15] = (byte) findPeaks(iArr3);
        }
        int[] iArr4 = new int[length * 4];
        int i16 = 0;
        for (int i17 = 0; i17 < length; i17++) {
            int[] iArr5 = codewordArr[i17].type32;
            System.arraycopy(iArr5, 0, iArr4, i16, iArr5.length);
            i16 += 4;
        }
        Utils.fromByte32ArrayToLongArray(jArr, iArr4);
        System.arraycopy(bArrClone, 0, bArr, 0, bArr.length);
    }

    public static void encode(long[] jArr, byte[] bArr, int i11, int i12) {
        byte[] bArrClone = Arrays.clone(bArr);
        int i13 = i11 * i12;
        Codeword[] codewordArr = new Codeword[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            codewordArr[i14] = new Codeword();
        }
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = i15 * i12;
            encodeSub(codewordArr[i16], bArrClone[i15]);
            for (int i17 = 1; i17 < i12; i17++) {
                codewordArr[i16 + i17] = codewordArr[i16];
            }
        }
        int[] iArr = new int[i13 * 4];
        int i18 = 0;
        for (int i19 = 0; i19 < i13; i19++) {
            int[] iArr2 = codewordArr[i19].type32;
            System.arraycopy(iArr2, 0, iArr, i18, iArr2.length);
            i18 += 4;
        }
        Utils.fromByte32ArrayToLongArray(jArr, iArr);
    }

    static void encodeSub(Codeword codeword, int i11) {
        int iBit0Mask = ((((Bit0Mask(i11 >> 7) ^ (Bit0Mask(i11) & (-1431655766))) ^ (Bit0Mask(i11 >> 1) & (-858993460))) ^ (Bit0Mask(i11 >> 2) & (-252645136))) ^ (Bit0Mask(i11 >> 3) & (-16711936))) ^ (Bit0Mask(i11 >> 4) & (-65536));
        codeword.type32[0] = iBit0Mask;
        int i12 = i11 >> 5;
        int iBit0Mask2 = iBit0Mask ^ Bit0Mask(i12);
        codeword.type32[1] = iBit0Mask2;
        int iBit0Mask3 = Bit0Mask(i11 >> 6) ^ iBit0Mask2;
        codeword.type32[3] = iBit0Mask3;
        codeword.type32[2] = iBit0Mask3 ^ Bit0Mask(i12);
    }

    private static void expandThenSum(int[] iArr, Codeword[] codewordArr, int i11, int i12) {
        for (int i13 = 0; i13 < 4; i13++) {
            for (int i14 = 0; i14 < 32; i14++) {
                iArr[(i13 * 32) + i14] = (codewordArr[i11].type32[i13] >> i14) & 1;
            }
        }
        for (int i15 = 1; i15 < i12; i15++) {
            for (int i16 = 0; i16 < 4; i16++) {
                for (int i17 = 0; i17 < 32; i17++) {
                    int i18 = (i16 * 32) + i17;
                    iArr[i18] = iArr[i18] + ((codewordArr[i15 + i11].type32[i16] >> i17) & 1);
                }
            }
        }
    }

    private static int findPeaks(int[] iArr) {
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < 128; i14++) {
            int i15 = iArr[i14];
            int i16 = i15 > 0 ? -1 : 0;
            int i17 = ((~i16) & (-i15)) | (i16 & i15);
            if (i17 > i13) {
                i11 = i15;
            }
            if (i17 > i13) {
                i12 = i14;
            }
            if (i17 > i13) {
                i13 = i17;
            }
        }
        return i12 | ((i11 > 0 ? 1 : 0) * 128);
    }

    private static void hadamardTransform(int[] iArr, int[] iArr2) {
        int[] iArrClone = Arrays.clone(iArr);
        int[] iArrClone2 = Arrays.clone(iArr2);
        int i11 = 0;
        while (i11 < 7) {
            for (int i12 = 0; i12 < 64; i12++) {
                int i13 = i12 * 2;
                int i14 = i13 + 1;
                iArrClone2[i12] = iArrClone[i13] + iArrClone[i14];
                iArrClone2[i12 + 64] = iArrClone[i13] - iArrClone[i14];
            }
            i11++;
            int[] iArr3 = iArrClone;
            iArrClone = iArrClone2;
            iArrClone2 = iArr3;
        }
        System.arraycopy(iArrClone2, 0, iArr, 0, iArr.length);
        System.arraycopy(iArrClone, 0, iArr2, 0, iArr2.length);
    }
}
