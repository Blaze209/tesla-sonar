package org.bouncycastle.pqc.crypto.hqc;

/* JADX INFO: loaded from: classes10.dex */
class GF2PolynomialCalculator {
    private final int PARAM_N;
    private final long RED_MASK;
    private final int VEC_N_SIZE_64;

    GF2PolynomialCalculator(int i11, int i12, long j11) {
        this.VEC_N_SIZE_64 = i11;
        this.PARAM_N = i12;
        this.RED_MASK = j11;
    }

    static void addLongs(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i11 = 0; i11 < jArr2.length; i11++) {
            jArr[i11] = jArr2[i11] ^ jArr3[i11];
        }
    }

    private void base_mul(long[] jArr, int i11, long j11, long j12) {
        int i12;
        long[] jArr2;
        int i13 = 16;
        int i14 = 0;
        long j13 = j12 & 1152921504606846975L;
        boolean z11 = true;
        long j14 = j13 << 1;
        long j15 = j14 ^ j13;
        long j16 = j13 << 2;
        long j17 = j16 ^ j13;
        long j18 = j15 << 1;
        long j19 = j18 ^ j13;
        long j21 = j13 << 3;
        long j22 = j17 << 1;
        long j23 = j15 << 2;
        long j24 = j19 << 1;
        long[] jArr3 = {0, j13, j14, j15, j16, j17, j18, j19, j21, j21 ^ j13, j22, j22 ^ j13, j23, j23 ^ j13, j24, j13 ^ j24};
        long j25 = 15;
        long j26 = j11 & 15;
        int i15 = 0;
        long j27 = 0;
        while (true) {
            i12 = i14;
            if (i15 >= 16) {
                break;
            }
            long j28 = j26 - ((long) i15);
            j27 ^= jArr3[i15] & (-(1 - ((j28 | (-j28)) >>> 63)));
            i15++;
            i14 = i12;
            j25 = j25;
        }
        long j29 = j25;
        byte b11 = 4;
        long j31 = 0;
        while (b11 < 64) {
            long j32 = (j11 >> b11) & j29;
            int i16 = i12;
            long j33 = 0;
            while (true) {
                jArr2 = jArr3;
                if (i16 < i13) {
                    long j34 = j32 - ((long) i16);
                    j33 ^= jArr2[i16] & (-(1 - ((j34 | (-j34)) >>> 63)));
                    i16++;
                    jArr3 = jArr2;
                    z11 = z11;
                    i13 = 16;
                }
            }
            j27 ^= j33 << b11;
            j31 ^= j33 >>> (64 - b11);
            b11 = (byte) (b11 + 4);
            jArr3 = jArr2;
            i13 = 16;
        }
        boolean z12 = z11;
        long[] jArr4 = new long[4];
        jArr4[i12] = -((j12 >> 60) & 1);
        jArr4[z12 ? 1 : 0] = -((j12 >> 61) & 1);
        jArr4[2] = -((j12 >> 62) & 1);
        jArr4[3] = -((j12 >> 63) & 1);
        long j35 = jArr4[i12];
        long j36 = jArr4[z12 ? 1 : 0];
        long j37 = jArr4[2];
        long j38 = jArr4[3];
        long j39 = (((j31 ^ (j35 & (j11 >>> 4))) ^ ((j11 >>> 3) & j36)) ^ ((j11 >>> 2) & j37)) ^ ((j11 >>> (z12 ? 1L : 0L)) & j38);
        jArr[i11] = (((((j11 << 60) & j35) ^ j27) ^ ((j11 << 61) & j36)) ^ ((j11 << 62) & j37)) ^ ((j11 << 63) & j38);
        jArr[i11 + 1] = j39;
    }

    private void karatsuba(long[] jArr, int i11, long[] jArr2, int i12, long[] jArr3, int i13, int i14, long[] jArr4, int i15) {
        if (i14 == 1) {
            base_mul(jArr, i11, jArr2[i12], jArr3[i13]);
            return;
        }
        int i16 = i14 / 2;
        int i17 = (i14 + 1) / 2;
        int i18 = i15 + i17;
        int i19 = i18 + i17;
        int i21 = i11 + (i17 * 2);
        int i22 = i15 + (i17 * 4);
        karatsuba(jArr, i11, jArr2, i12, jArr3, i13, i17, jArr4, i22);
        karatsuba(jArr, i21, jArr2, i12 + i17, jArr3, i13 + i17, i16, jArr4, i22);
        karatsuba_add1(jArr4, i15, jArr4, i18, jArr2, i12, jArr3, i13, i17, i16);
        karatsuba(jArr4, i19, jArr4, i15, jArr4, i18, i17, jArr4, i22);
        karatsuba_add2(jArr, i11, jArr4, i19, jArr, i21, i17, i16);
    }

    private void karatsuba_add1(long[] jArr, int i11, long[] jArr2, int i12, long[] jArr3, int i13, long[] jArr4, int i14, int i15, int i16) {
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = i17 + i15;
            jArr[i17 + i11] = jArr3[i17 + i13] ^ jArr3[i18 + i13];
            jArr2[i17 + i12] = jArr4[i17 + i14] ^ jArr4[i18 + i14];
        }
        if (i16 < i15) {
            jArr[i11 + i16] = jArr3[i13 + i16];
            jArr2[i16 + i12] = jArr4[i16 + i14];
        }
    }

    private void karatsuba_add2(long[] jArr, int i11, long[] jArr2, int i12, long[] jArr3, int i13, int i14, int i15) {
        int i16;
        int i17 = 0;
        while (true) {
            i16 = i14 * 2;
            if (i17 >= i16) {
                break;
            }
            int i18 = i17 + i12;
            jArr2[i18] = jArr2[i18] ^ jArr[i17 + i11];
            i17++;
        }
        for (int i19 = 0; i19 < i15 * 2; i19++) {
            int i21 = i19 + i12;
            jArr2[i21] = jArr2[i21] ^ jArr3[i19 + i13];
        }
        for (int i22 = 0; i22 < i16; i22++) {
            int i23 = i22 + i14 + i11;
            jArr[i23] = jArr[i23] ^ jArr2[i22 + i12];
        }
    }

    private void reduce(long[] jArr, long[] jArr2) {
        int i11 = 0;
        while (true) {
            int i12 = this.VEC_N_SIZE_64;
            if (i11 >= i12) {
                int i13 = i12 - 1;
                jArr[i13] = jArr[i13] & this.RED_MASK;
                return;
            }
            long j11 = jArr2[(i11 + i12) - 1];
            int i14 = this.PARAM_N;
            jArr[i11] = (jArr2[i11] ^ (j11 >>> (i14 & 63))) ^ (jArr2[i12 + i11] << ((int) (64 - (((long) i14) & 63))));
            i11++;
        }
    }

    protected void multLongs(long[] jArr, long[] jArr2, long[] jArr3) {
        int i11 = this.VEC_N_SIZE_64;
        long[] jArr4 = new long[(i11 << 1) + 1];
        karatsuba(jArr4, 0, jArr2, 0, jArr3, 0, i11, new long[i11 << 3], 0);
        reduce(jArr, jArr4);
    }
}
