package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat192;

/* JADX INFO: loaded from: classes10.dex */
public class SecT163Field {
    private static final long M35 = 34359738367L;
    private static final long M55 = 36028797018963967L;
    private static final long[] ROOT_Z = {-5270498306774157648L, 5270498306774195053L, 19634136210L};

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr2[2] ^ jArr[2];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr2[5] ^ jArr[5];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(163, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat192.createExt64();
        Nat192.copy64(jArr, jArr2);
        for (int i11 = 1; i11 < 163; i11 += 2) {
            implSquare(jArr2, jArrCreateExt64);
            reduce(jArrCreateExt64, jArr2);
            implSquare(jArr2, jArrCreateExt64);
            reduce(jArrCreateExt64, jArr2);
            addTo(jArr, jArr2);
        }
    }

    protected static void implCompactExt(long[] jArr) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        jArr[0] = j11 ^ (j12 << 55);
        jArr[1] = (j12 >>> 9) ^ (j13 << 46);
        jArr[2] = (j13 >>> 18) ^ (j14 << 37);
        jArr[3] = (j14 >>> 27) ^ (j15 << 28);
        jArr[4] = (j15 >>> 36) ^ (j16 << 19);
        jArr[5] = j16 >>> 45;
    }

    protected static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = (j12 >>> 46) ^ (jArr[2] << 18);
        long j14 = ((j12 << 9) ^ (j11 >>> 55)) & M55;
        long j15 = j11 & M55;
        long j16 = jArr2[0];
        long j17 = jArr2[1];
        long j18 = (j17 >>> 46) ^ (jArr2[2] << 18);
        long j19 = ((j16 >>> 55) ^ (j17 << 9)) & M55;
        long j21 = j16 & M55;
        long[] jArr4 = new long[10];
        implMulw(jArr3, j15, j21, jArr4, 0);
        implMulw(jArr3, j13, j18, jArr4, 2);
        long j22 = (j15 ^ j14) ^ j13;
        long j23 = (j21 ^ j19) ^ j18;
        implMulw(jArr3, j22, j23, jArr4, 4);
        long j24 = (j14 << 1) ^ (j13 << 2);
        long j25 = (j19 << 1) ^ (j18 << 2);
        implMulw(jArr3, j15 ^ j24, j21 ^ j25, jArr4, 6);
        implMulw(jArr3, j22 ^ j24, j23 ^ j25, jArr4, 8);
        long j26 = jArr4[6];
        long j27 = jArr4[8] ^ j26;
        long j28 = jArr4[7];
        long j29 = jArr4[9] ^ j28;
        long j31 = (j27 << 1) ^ j26;
        long j32 = (j27 ^ (j29 << 1)) ^ j28;
        long j33 = jArr4[0];
        long j34 = jArr4[1];
        long j35 = (j34 ^ j33) ^ jArr4[4];
        long j36 = j34 ^ jArr4[5];
        long j37 = jArr4[2];
        long j38 = ((j31 ^ j33) ^ (j37 << 4)) ^ (j37 << 1);
        long j39 = jArr4[3];
        long j41 = (((j35 ^ j32) ^ (j39 << 4)) ^ (j39 << 1)) ^ (j38 >>> 55);
        long j42 = j38 & M55;
        long j43 = (j36 ^ j29) ^ (j41 >>> 55);
        long j44 = (j42 >>> 1) ^ ((j41 & 1) << 54);
        long j45 = ((j41 & M55) >>> 1) ^ ((j43 & 1) << 54);
        long j46 = j44 ^ (j44 << 1);
        long j47 = j46 ^ (j46 << 2);
        long j48 = j47 ^ (j47 << 4);
        long j49 = j48 ^ (j48 << 8);
        long j51 = j49 ^ (j49 << 16);
        long j52 = (j51 ^ (j51 << 32)) & M55;
        long j53 = j45 ^ (j52 >>> 54);
        long j54 = j53 ^ (j53 << 1);
        long j55 = j54 ^ (j54 << 2);
        long j56 = j55 ^ (j55 << 4);
        long j57 = j56 ^ (j56 << 8);
        long j58 = j57 ^ (j57 << 16);
        long j59 = M55 & (j58 ^ (j58 << 32));
        long j61 = (j43 >>> 1) ^ (j59 >>> 54);
        long j62 = j61 ^ (j61 << 1);
        long j63 = j62 ^ (j62 << 2);
        long j64 = j63 ^ (j63 << 4);
        long j65 = j64 ^ (j64 << 8);
        long j66 = j65 ^ (j65 << 16);
        long j67 = j66 ^ (j66 << 32);
        jArr3[0] = j33;
        jArr3[1] = (j35 ^ j52) ^ j37;
        jArr3[2] = ((j36 ^ j59) ^ j52) ^ j39;
        jArr3[3] = j67 ^ j59;
        jArr3[4] = jArr4[2] ^ j67;
        jArr3[5] = jArr4[3];
        implCompactExt(jArr3);
    }

    protected static void implMulw(long[] jArr, long j11, long j12, long[] jArr2, int i11) {
        jArr[1] = j12;
        long j13 = j12 << 1;
        jArr[2] = j13;
        long j14 = j13 ^ j12;
        jArr[3] = j14;
        long j15 = j12 << 2;
        jArr[4] = j15;
        jArr[5] = j15 ^ j12;
        long j16 = j14 << 1;
        jArr[6] = j16;
        jArr[7] = j16 ^ j12;
        long j17 = jArr[((int) j11) & 3];
        long j18 = 0;
        int i12 = 47;
        do {
            int i13 = (int) (j11 >>> i12);
            long j19 = (jArr[i13 & 7] ^ (jArr[(i13 >>> 3) & 7] << 3)) ^ (jArr[(i13 >>> 6) & 7] << 6);
            j17 ^= j19 << i12;
            j18 ^= j19 >>> (-i12);
            i12 -= 9;
        } while (i12 > 0);
        jArr2[i11] = M55 & j17;
        jArr2[i11 + 1] = (j17 >>> 55) ^ (j18 << 9);
    }

    protected static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, 3, jArr2, 0);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat192.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat192.create64();
        long[] jArrCreate65 = Nat192.create64();
        square(jArr, jArrCreate64);
        squareN(jArrCreate64, 1, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate65, 1, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 3, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate65, 3, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 9, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate65, 9, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 27, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate65, 27, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 81, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        implMultiply(jArr, jArr2, jArr4);
        reduce(jArr4, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        implMultiply(jArr, jArr2, jArr4);
        addExt(jArr3, jArr4, jArr3);
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        long j17 = j14 ^ ((((j16 >>> 35) ^ (j16 >>> 32)) ^ (j16 >>> 29)) ^ (j16 >>> 28));
        long j18 = (j13 ^ ((((j16 << 29) ^ (j16 << 32)) ^ (j16 << 35)) ^ (j16 << 36))) ^ ((j15 >>> 28) ^ (((j15 >>> 35) ^ (j15 >>> 32)) ^ (j15 >>> 29)));
        long j19 = j11 ^ ((((j17 << 29) ^ (j17 << 32)) ^ (j17 << 35)) ^ (j17 << 36));
        long j21 = (j12 ^ ((((j15 << 29) ^ (j15 << 32)) ^ (j15 << 35)) ^ (j15 << 36))) ^ ((j17 >>> 28) ^ (((j17 >>> 35) ^ (j17 >>> 32)) ^ (j17 >>> 29)));
        long j22 = j18 >>> 35;
        jArr2[0] = (((j19 ^ j22) ^ (j22 << 3)) ^ (j22 << 6)) ^ (j22 << 7);
        jArr2[1] = j21;
        jArr2[2] = M35 & j18;
    }

    public static void reduce29(long[] jArr, int i11) {
        int i12 = i11 + 2;
        long j11 = jArr[i12];
        long j12 = j11 >>> 35;
        jArr[i11] = ((j12 << 7) ^ (((j12 << 3) ^ j12) ^ (j12 << 6))) ^ jArr[i11];
        jArr[i12] = j11 & M35;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat192.create64();
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j11 = (jUnshuffle & 4294967295L) | (jUnshuffle2 << 32);
        jArrCreate64[0] = (jUnshuffle >>> 32) | (jUnshuffle2 & (-4294967296L));
        long jUnshuffle3 = Interleave.unshuffle(jArr[2]);
        jArrCreate64[1] = jUnshuffle3 >>> 32;
        multiply(jArrCreate64, ROOT_Z, jArr2);
        jArr2[0] = jArr2[0] ^ j11;
        jArr2[1] = jArr2[1] ^ (jUnshuffle3 & 4294967295L);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat192.createExt64();
        implSquare(jArr, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat192.createExt64();
        implSquare(jArr, jArrCreateExt64);
        addExt(jArr2, jArrCreateExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i11, long[] jArr2) {
        long[] jArrCreateExt64 = Nat192.createExt64();
        implSquare(jArr, jArrCreateExt64);
        while (true) {
            reduce(jArrCreateExt64, jArr2);
            i11--;
            if (i11 <= 0) {
                return;
            } else {
                implSquare(jArr2, jArrCreateExt64);
            }
        }
    }

    public static int trace(long[] jArr) {
        return ((int) (jArr[0] ^ (jArr[2] >>> 29))) & 1;
    }
}
