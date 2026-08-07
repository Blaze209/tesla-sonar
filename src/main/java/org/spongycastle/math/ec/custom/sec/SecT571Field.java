package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.raw.Interleave;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat576;

/* JADX INFO: loaded from: classes10.dex */
public class SecT571Field {
    private static final long M59 = 576460752303423487L;
    private static final long RM = -1190112520884487202L;
    private static final long[] ROOT_Z = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i11 = 0; i11 < 9; i11++) {
            jArr3[i11] = jArr[i11] ^ jArr2[i11];
        }
    }

    private static void addBothTo(long[] jArr, int i11, long[] jArr2, int i12, long[] jArr3, int i13) {
        for (int i14 = 0; i14 < 9; i14++) {
            int i15 = i13 + i14;
            jArr3[i15] = jArr3[i15] ^ (jArr[i11 + i14] ^ jArr2[i12 + i14]);
        }
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i11 = 0; i11 < 18; i11++) {
            jArr3[i11] = jArr[i11] ^ jArr2[i11];
        }
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        for (int i11 = 1; i11 < 9; i11++) {
            jArr2[i11] = jArr[i11];
        }
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        long[] jArrFromBigInteger64 = Nat576.fromBigInteger64(bigInteger);
        reduce5(jArrFromBigInteger64, 0);
        return jArrFromBigInteger64;
    }

    protected static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[144];
        System.arraycopy(jArr2, 0, jArr4, 9, 9);
        int i11 = 7;
        int i12 = 0;
        while (i11 > 0) {
            int i13 = i12 + 18;
            long[] jArr5 = jArr4;
            Nat.shiftUpBit64(9, jArr5, i13 >>> 1, 0L, jArr5, i13);
            jArr4 = jArr5;
            reduce5(jArr4, i13);
            add(jArr4, 9, jArr4, i13, jArr4, i12 + 27);
            i11--;
            i12 = i13;
        }
        long[] jArr6 = new long[144];
        Nat.shiftUpBits64(144, jArr4, 0, 4, 0L, jArr6, 0);
        for (int i14 = 56; i14 >= 0; i14 -= 8) {
            for (int i15 = 1; i15 < 9; i15 += 2) {
                int i16 = (int) (jArr[i15] >>> i14);
                addBothTo(jArr4, (i16 & 15) * 9, jArr6, ((i16 >>> 4) & 15) * 9, jArr3, i15 - 1);
            }
            Nat.shiftUpBits64(16, jArr3, 0, 8, 0L);
        }
        for (int i17 = 56; i17 >= 0; i17 -= 8) {
            for (int i18 = 0; i18 < 9; i18 += 2) {
                int i19 = (int) (jArr[i18] >>> i17);
                addBothTo(jArr4, (i19 & 15) * 9, jArr6, ((i19 >>> 4) & 15) * 9, jArr3, i18);
            }
            if (i17 > 0) {
                Nat.shiftUpBits64(18, jArr3, 0, 8, 0L);
            }
        }
    }

    protected static void implMulwAcc(long[] jArr, long j11, long[] jArr2, int i11) {
        long[] jArr3 = new long[32];
        jArr3[1] = j11;
        for (int i12 = 2; i12 < 32; i12 += 2) {
            long j12 = jArr3[i12 >>> 1] << 1;
            jArr3[i12] = j12;
            jArr3[i12 + 1] = j12 ^ j11;
        }
        int i13 = 0;
        long j13 = 0;
        while (i13 < 9) {
            long j14 = jArr[i13];
            long j15 = j13 ^ jArr3[((int) j14) & 31];
            int i14 = 60;
            long j16 = 0;
            do {
                long j17 = jArr3[((int) (j14 >>> i14)) & 31];
                j15 ^= j17 << i14;
                j16 ^= j17 >>> (-i14);
                i14 -= 5;
            } while (i14 > 0);
            for (int i15 = 0; i15 < 4; i15++) {
                j14 = (j14 & RM) >>> 1;
                j16 ^= ((j11 << i15) >> 63) & j14;
            }
            int i16 = i11 + i13;
            jArr2[i16] = j15 ^ jArr2[i16];
            i13++;
            j13 = j16;
        }
        int i17 = i11 + 9;
        jArr2[i17] = jArr2[i17] ^ j13;
    }

    protected static void implSquare(long[] jArr, long[] jArr2) {
        for (int i11 = 0; i11 < 9; i11++) {
            Interleave.expand64To128(jArr[i11], jArr2, i11 << 1);
        }
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat576.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat576.create64();
        long[] jArrCreate65 = Nat576.create64();
        long[] jArrCreate66 = Nat576.create64();
        square(jArr, jArrCreate66);
        square(jArrCreate66, jArrCreate64);
        square(jArrCreate64, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 2, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        multiply(jArrCreate64, jArrCreate66, jArrCreate64);
        squareN(jArrCreate64, 5, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate65, 5, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 15, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate66);
        squareN(jArrCreate66, 30, jArrCreate64);
        squareN(jArrCreate64, 30, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 60, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate65, 60, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 180, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate65, 180, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        multiply(jArrCreate64, jArrCreate66, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        addExt(jArr3, jArrCreateExt64, jArr3);
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j11 = jArr[9];
        long j12 = jArr[17];
        long j13 = (((j11 ^ (j12 >>> 59)) ^ (j12 >>> 57)) ^ (j12 >>> 54)) ^ (j12 >>> 49);
        long j14 = (j12 << 15) ^ (((jArr[8] ^ (j12 << 5)) ^ (j12 << 7)) ^ (j12 << 10));
        for (int i11 = 16; i11 >= 10; i11--) {
            long j15 = jArr[i11];
            jArr2[i11 - 8] = (((j14 ^ (j15 >>> 59)) ^ (j15 >>> 57)) ^ (j15 >>> 54)) ^ (j15 >>> 49);
            j14 = (((jArr[i11 - 9] ^ (j15 << 5)) ^ (j15 << 7)) ^ (j15 << 10)) ^ (j15 << 15);
        }
        jArr2[1] = (((j14 ^ (j13 >>> 59)) ^ (j13 >>> 57)) ^ (j13 >>> 54)) ^ (j13 >>> 49);
        long j16 = (j13 << 15) ^ (((jArr[0] ^ (j13 << 5)) ^ (j13 << 7)) ^ (j13 << 10));
        long j17 = jArr2[8];
        long j18 = j17 >>> 59;
        jArr2[0] = (((j16 ^ j18) ^ (j18 << 2)) ^ (j18 << 5)) ^ (j18 << 10);
        jArr2[8] = M59 & j17;
    }

    public static void reduce5(long[] jArr, int i11) {
        int i12 = i11 + 8;
        long j11 = jArr[i12];
        long j12 = j11 >>> 59;
        jArr[i11] = ((j12 << 10) ^ (((j12 << 2) ^ j12) ^ (j12 << 5))) ^ jArr[i11];
        jArr[i12] = j11 & M59;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat576.create64();
        long[] jArrCreate65 = Nat576.create64();
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            int i13 = i11 + 1;
            long jUnshuffle = Interleave.unshuffle(jArr[i11]);
            i11 += 2;
            long jUnshuffle2 = Interleave.unshuffle(jArr[i13]);
            jArrCreate64[i12] = (4294967295L & jUnshuffle) | (jUnshuffle2 << 32);
            jArrCreate65[i12] = (jUnshuffle >>> 32) | ((-4294967296L) & jUnshuffle2);
        }
        long jUnshuffle3 = Interleave.unshuffle(jArr[i11]);
        jArrCreate64[4] = 4294967295L & jUnshuffle3;
        jArrCreate65[4] = jUnshuffle3 >>> 32;
        multiply(jArrCreate65, ROOT_Z, jArr2);
        add(jArr2, jArrCreate64, jArr2);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implSquare(jArr, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implSquare(jArr, jArrCreateExt64);
        addExt(jArr2, jArrCreateExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i11, long[] jArr2) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implSquare(jArr, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr2);
        while (true) {
            i11--;
            if (i11 <= 0) {
                return;
            }
            implSquare(jArr2, jArrCreateExt64);
            reduce(jArrCreateExt64, jArr2);
        }
    }

    public static int trace(long[] jArr) {
        long j11 = jArr[0];
        long j12 = jArr[8];
        return ((int) ((j11 ^ (j12 >>> 49)) ^ (j12 >>> 57))) & 1;
    }

    private static void add(long[] jArr, int i11, long[] jArr2, int i12, long[] jArr3, int i13) {
        for (int i14 = 0; i14 < 9; i14++) {
            jArr3[i13 + i14] = jArr[i11 + i14] ^ jArr2[i12 + i14];
        }
    }
}
