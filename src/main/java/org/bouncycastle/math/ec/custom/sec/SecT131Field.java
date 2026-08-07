package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat192;

/* JADX INFO: loaded from: classes10.dex */
public class SecT131Field {
    private static final long M03 = 7;
    private static final long M44 = 17592186044415L;
    private static final long[] ROOT_Z = {2791191049453778211L, 2791191049453778402L, 6};

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
        jArr3[4] = jArr2[4] ^ jArr[4];
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
        return Nat.fromBigInteger64(131, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(5);
        Nat192.copy64(jArr, jArr2);
        for (int i11 = 1; i11 < 131; i11 += 2) {
            implSquare(jArr2, jArrCreate64);
            reduce(jArrCreate64, jArr2);
            implSquare(jArr2, jArrCreate64);
            reduce(jArrCreate64, jArr2);
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
        jArr[0] = j11 ^ (j12 << 44);
        jArr[1] = (j12 >>> 20) ^ (j13 << 24);
        jArr[2] = ((j13 >>> 40) ^ (j14 << 4)) ^ (j15 << 48);
        jArr[3] = ((j14 >>> 60) ^ (j16 << 28)) ^ (j15 >>> 16);
        jArr[4] = j16 >>> 36;
        jArr[5] = 0;
    }

    protected static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = ((jArr[2] << 40) ^ (j12 >>> 24)) & M44;
        long j14 = ((j11 >>> 44) ^ (j12 << 20)) & M44;
        long j15 = j11 & M44;
        long j16 = jArr2[0];
        long j17 = jArr2[1];
        long j18 = ((j17 >>> 24) ^ (jArr2[2] << 40)) & M44;
        long j19 = ((j16 >>> 44) ^ (j17 << 20)) & M44;
        long j21 = j16 & M44;
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
        long j41 = (((j35 ^ j32) ^ (j39 << 4)) ^ (j39 << 1)) ^ (j38 >>> 44);
        long j42 = (j36 ^ j29) ^ (j41 >>> 44);
        long j43 = ((j38 & M44) >>> 1) ^ ((j41 & 1) << 43);
        long j44 = ((j41 & M44) >>> 1) ^ ((j42 & 1) << 43);
        long j45 = j43 ^ (j43 << 1);
        long j46 = j45 ^ (j45 << 2);
        long j47 = j46 ^ (j46 << 4);
        long j48 = j47 ^ (j47 << 8);
        long j49 = j48 ^ (j48 << 16);
        long j51 = (j49 ^ (j49 << 32)) & M44;
        long j52 = j44 ^ (j51 >>> 43);
        long j53 = j52 ^ (j52 << 1);
        long j54 = j53 ^ (j53 << 2);
        long j55 = j54 ^ (j54 << 4);
        long j56 = j55 ^ (j55 << 8);
        long j57 = j56 ^ (j56 << 16);
        long j58 = (j57 ^ (j57 << 32)) & M44;
        long j59 = (j58 >>> 43) ^ (j42 >>> 1);
        long j61 = j59 ^ (j59 << 1);
        long j62 = j61 ^ (j61 << 2);
        long j63 = j62 ^ (j62 << 4);
        long j64 = j63 ^ (j63 << 8);
        long j65 = j64 ^ (j64 << 16);
        long j66 = j65 ^ (j65 << 32);
        jArr3[0] = j33;
        jArr3[1] = (j35 ^ j51) ^ j37;
        jArr3[2] = ((j36 ^ j58) ^ j51) ^ j39;
        jArr3[3] = j66 ^ j58;
        jArr3[4] = jArr4[2] ^ j66;
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
        int i12 = (int) j11;
        long j17 = (((jArr[i12 & 7] ^ (jArr[(i12 >>> 3) & 7] << 3)) ^ (jArr[(i12 >>> 6) & 7] << 6)) ^ (jArr[(i12 >>> 9) & 7] << 9)) ^ (jArr[(i12 >>> 12) & 7] << 12);
        long j18 = 0;
        int i13 = 30;
        do {
            int i14 = (int) (j11 >>> i13);
            long j19 = (((jArr[i14 & 7] ^ (jArr[(i14 >>> 3) & 7] << 3)) ^ (jArr[(i14 >>> 6) & 7] << 6)) ^ (jArr[(i14 >>> 9) & 7] << 9)) ^ (jArr[(i14 >>> 12) & 7] << 12);
            j17 ^= j19 << i13;
            j18 ^= j19 >>> (-i13);
            i13 -= 15;
        } while (i13 > 0);
        jArr2[i11] = M44 & j17;
        jArr2[i11 + 1] = (j17 >>> 44) ^ (j18 << 20);
    }

    protected static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, 2, jArr2, 0);
        jArr2[4] = ((long) Interleave.expand8to16((int) jArr[2])) & 4294967295L;
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat192.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat192.create64();
        long[] jArrCreate65 = Nat192.create64();
        square(jArr, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, 2, jArrCreate65);
        multiply(jArrCreate65, jArrCreate64, jArrCreate65);
        squareN(jArrCreate65, 4, jArrCreate64);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 8, jArrCreate65);
        multiply(jArrCreate65, jArrCreate64, jArrCreate65);
        squareN(jArrCreate65, 16, jArrCreate64);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 32, jArrCreate65);
        multiply(jArrCreate65, jArrCreate64, jArrCreate65);
        square(jArrCreate65, jArrCreate65);
        multiply(jArrCreate65, jArr, jArrCreate65);
        squareN(jArrCreate65, 65, jArrCreate64);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        square(jArrCreate64, jArr2);
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
        long j16 = j14 ^ (j15 >>> 59);
        long j17 = j11 ^ ((j16 << 61) ^ (j16 << 63));
        long j18 = (j12 ^ ((j15 << 61) ^ (j15 << 63))) ^ ((((j16 >>> 3) ^ (j16 >>> 1)) ^ j16) ^ (j16 << 5));
        long j19 = (j13 ^ ((((j15 >>> 3) ^ (j15 >>> 1)) ^ j15) ^ (j15 << 5))) ^ (j16 >>> 59);
        long j21 = j19 >>> 3;
        jArr2[0] = (((j17 ^ j21) ^ (j21 << 2)) ^ (j21 << 3)) ^ (j21 << 8);
        jArr2[1] = (j19 >>> 59) ^ j18;
        jArr2[2] = M03 & j19;
    }

    public static void reduce61(long[] jArr, int i11) {
        int i12 = i11 + 2;
        long j11 = jArr[i12];
        long j12 = j11 >>> 3;
        jArr[i11] = ((j12 << 8) ^ (((j12 << 2) ^ j12) ^ (j12 << 3))) ^ jArr[i11];
        int i13 = i11 + 1;
        jArr[i13] = jArr[i13] ^ (j11 >>> 59);
        jArr[i12] = j11 & M03;
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
        long[] jArrCreate64 = Nat.create64(5);
        implSquare(jArr, jArrCreate64);
        reduce(jArrCreate64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(5);
        implSquare(jArr, jArrCreate64);
        addExt(jArr2, jArrCreate64, jArr2);
    }

    public static void squareN(long[] jArr, int i11, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(5);
        implSquare(jArr, jArrCreate64);
        while (true) {
            reduce(jArrCreate64, jArr2);
            i11--;
            if (i11 <= 0) {
                return;
            } else {
                implSquare(jArr2, jArrCreate64);
            }
        }
    }

    public static int trace(long[] jArr) {
        return ((int) ((jArr[0] ^ (jArr[1] >>> 59)) ^ (jArr[2] >>> 1))) & 1;
    }
}
