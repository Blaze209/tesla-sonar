package org.bouncycastle.crypto.modes.kgcm;

import org.bouncycastle.math.raw.Interleave;

/* JADX INFO: loaded from: classes9.dex */
public class KGCMUtil_256 {
    public static final int SIZE = 4;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void copy(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static boolean equal(long[] jArr, long[] jArr2) {
        return ((jArr2[3] ^ jArr[3]) | (((jArr[0] ^ jArr2[0]) | (jArr[1] ^ jArr2[1])) | (jArr[2] ^ jArr2[2]))) == 0;
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        char c11;
        char c12;
        long j11;
        int i11 = 0;
        long j12 = jArr[0];
        char c13 = 1;
        long j13 = jArr[1];
        char c14 = 2;
        long j14 = jArr[2];
        char c15 = 3;
        long j15 = jArr[3];
        long j16 = jArr2[0];
        long j17 = jArr2[1];
        long j18 = jArr2[2];
        long j19 = jArr2[3];
        long j21 = 0;
        long j22 = 0;
        long j23 = 0;
        long j24 = 0;
        long j25 = 0;
        while (true) {
            c11 = c13;
            c12 = c14;
            j11 = j14;
            if (i11 >= 64) {
                break;
            }
            long j26 = -(j12 & 1);
            j12 >>>= c11;
            j21 ^= j16 & j26;
            char c16 = c15;
            long j27 = -(j13 & 1);
            j13 >>>= c11;
            j22 = (j22 ^ (j17 & j26)) ^ (j16 & j27);
            j23 = (j23 ^ (j18 & j26)) ^ (j17 & j27);
            j24 = (j24 ^ (j19 & j26)) ^ (j18 & j27);
            j25 ^= j19 & j27;
            long j28 = j19 >> 63;
            j19 = (j19 << c11) | (j18 >>> 63);
            j18 = (j18 << c11) | (j17 >>> 63);
            j17 = (j16 >>> 63) | (j17 << c11);
            j16 = (j16 << c11) ^ (j28 & 1061);
            i11++;
            c15 = c16;
            c13 = c11;
            c14 = c12;
            j14 = j11;
            j15 = j15;
        }
        char c17 = c15;
        long j29 = j15;
        char c18 = '>';
        long j31 = (((j19 >>> 62) ^ j16) ^ (j19 >>> 59)) ^ (j19 >>> 54);
        long j32 = ((j19 ^ (j19 << c12)) ^ (j19 << 5)) ^ (j19 << 10);
        int i12 = 0;
        while (i12 < 64) {
            long j33 = -(j11 & 1);
            j11 >>>= c11;
            j21 ^= j32 & j33;
            char c19 = c18;
            long j34 = j31;
            long j35 = -(j29 & 1);
            j29 >>>= c11;
            long j36 = (j22 ^ (j31 & j33)) ^ (j32 & j35);
            j23 = (j23 ^ (j17 & j33)) ^ (j34 & j35);
            j24 = (j24 ^ (j18 & j33)) ^ (j17 & j35);
            j25 ^= j18 & j35;
            long j37 = j18 >> 63;
            j18 = (j18 << c11) | (j17 >>> 63);
            j17 = (j34 >>> 63) | (j17 << c11);
            long j38 = (j34 << c11) | (j32 >>> 63);
            j32 = (j32 << c11) ^ (j37 & 1061);
            i12++;
            c18 = c19;
            j31 = j38;
            j22 = j36;
        }
        jArr3[0] = j21 ^ (((j25 ^ (j25 << c12)) ^ (j25 << 5)) ^ (j25 << 10));
        jArr3[c11] = j22 ^ (((j25 >>> c18) ^ (j25 >>> 59)) ^ (j25 >>> 54));
        jArr3[c12] = j23;
        jArr3[c17] = j24;
    }

    public static void multiplyX(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        jArr2[0] = ((j14 >> 63) & 1061) ^ (j11 << 1);
        jArr2[1] = (j11 >>> 63) | (j12 << 1);
        jArr2[2] = (j13 << 1) | (j12 >>> 63);
        jArr2[3] = (j14 << 1) | (j13 >>> 63);
    }

    public static void multiplyX8(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = j14 >>> 56;
        jArr2[0] = ((((j11 << 8) ^ j15) ^ (j15 << 2)) ^ (j15 << 5)) ^ (j15 << 10);
        jArr2[1] = (j11 >>> 56) | (j12 << 8);
        jArr2[2] = (j13 << 8) | (j12 >>> 56);
        jArr2[3] = (j14 << 8) | (j13 >>> 56);
    }

    public static void one(long[] jArr) {
        jArr[0] = 1;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
    }

    public static void square(long[] jArr, long[] jArr2) {
        int i11 = 8;
        long[] jArr3 = new long[8];
        for (int i12 = 0; i12 < 4; i12++) {
            Interleave.expand64To128(jArr[i12], jArr3, i12 << 1);
        }
        while (true) {
            int i13 = i11 - 1;
            if (i13 < 4) {
                copy(jArr3, jArr2);
                return;
            }
            long j11 = jArr3[i13];
            int i14 = i11 - 5;
            jArr3[i14] = jArr3[i14] ^ ((((j11 << 2) ^ j11) ^ (j11 << 5)) ^ (j11 << 10));
            int i15 = i11 - 4;
            jArr3[i15] = ((j11 >>> 54) ^ ((j11 >>> 62) ^ (j11 >>> 59))) ^ jArr3[i15];
            i11 = i13;
        }
    }

    public static void x(long[] jArr) {
        jArr[0] = 2;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
    }

    public static void zero(long[] jArr) {
        jArr[0] = 0;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
    }
}
