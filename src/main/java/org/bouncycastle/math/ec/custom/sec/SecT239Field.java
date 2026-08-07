package org.bouncycastle.math.ec.custom.sec;

import com.plaid.internal.EnumC4419g;
import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* JADX INFO: loaded from: classes10.dex */
public class SecT239Field {
    private static final long M47 = 140737488355327L;
    private static final long M60 = 1152921504606846975L;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        Nat256.copy64(jArr, jArr2);
        for (int i11 = 1; i11 < 239; i11 += 2) {
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
        long j17 = jArr[6];
        long j18 = jArr[7];
        jArr[0] = j11 ^ (j12 << 60);
        jArr[1] = (j12 >>> 4) ^ (j13 << 56);
        jArr[2] = (j13 >>> 8) ^ (j14 << 52);
        jArr[3] = (j14 >>> 12) ^ (j15 << 48);
        jArr[4] = (j15 >>> 16) ^ (j16 << 44);
        jArr[5] = (j16 >>> 20) ^ (j17 << 40);
        jArr[6] = (j17 >>> 24) ^ (j18 << 36);
        jArr[7] = j18 >>> 28;
    }

    protected static void implExpand(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        jArr2[0] = j11 & M60;
        jArr2[1] = ((j11 >>> 60) ^ (j12 << 4)) & M60;
        jArr2[2] = ((j12 >>> 56) ^ (j13 << 8)) & M60;
        jArr2[3] = (j13 >>> 52) ^ (j14 << 12);
    }

    protected static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        implExpand(jArr, jArr4);
        implExpand(jArr2, jArr5);
        long[] jArr6 = new long[8];
        implMulwAcc(jArr6, jArr4[0], jArr5[0], jArr3, 0);
        implMulwAcc(jArr6, jArr4[1], jArr5[1], jArr3, 1);
        implMulwAcc(jArr6, jArr4[2], jArr5[2], jArr3, 2);
        implMulwAcc(jArr6, jArr4[3], jArr5[3], jArr3, 3);
        for (int i11 = 5; i11 > 0; i11--) {
            jArr3[i11] = jArr3[i11] ^ jArr3[i11 - 1];
        }
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        implMulwAcc(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i12 = 7; i12 > 1; i12--) {
            jArr3[i12] = jArr3[i12] ^ jArr3[i12 - 2];
        }
        long j11 = jArr4[0] ^ jArr4[2];
        long j12 = jArr4[1] ^ jArr4[3];
        long j13 = jArr5[0] ^ jArr5[2];
        long j14 = jArr5[3] ^ jArr5[1];
        implMulwAcc(jArr6, j11 ^ j12, j13 ^ j14, jArr3, 3);
        long[] jArr7 = new long[3];
        implMulwAcc(jArr6, j11, j13, jArr7, 0);
        implMulwAcc(jArr6, j12, j14, jArr7, 1);
        long j15 = jArr7[0];
        long j16 = jArr7[1];
        long j17 = jArr7[2];
        jArr3[2] = jArr3[2] ^ j15;
        jArr3[3] = (j15 ^ j16) ^ jArr3[3];
        jArr3[4] = jArr3[4] ^ (j16 ^ j17);
        jArr3[5] = jArr3[5] ^ j17;
        implCompactExt(jArr3);
    }

    protected static void implMulwAcc(long[] jArr, long j11, long j12, long[] jArr2, int i11) {
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
        long j17 = (jArr[(i12 >>> 3) & 7] << 3) ^ jArr[i12 & 7];
        long j18 = 0;
        int i13 = 54;
        do {
            int i14 = (int) (j11 >>> i13);
            long j19 = jArr[i14 & 7] ^ (jArr[(i14 >>> 3) & 7] << 3);
            j17 ^= j19 << i13;
            j18 ^= j19 >>> (-i13);
            i13 -= 6;
        } while (i13 > 0);
        jArr2[i11] = jArr2[i11] ^ (M60 & j17);
        int i15 = i11 + 1;
        jArr2[i15] = ((((((j11 & 585610922974906400L) & ((j12 << 4) >> 63)) >>> 5) ^ j18) << 4) ^ (j17 >>> 60)) ^ jArr2[i15];
    }

    protected static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, 4, jArr2, 0);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat256.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat256.create64();
        long[] jArrCreate65 = Nat256.create64();
        square(jArr, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        square(jArrCreate64, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, 3, jArrCreate65);
        multiply(jArrCreate65, jArrCreate64, jArrCreate65);
        square(jArrCreate65, jArrCreate65);
        multiply(jArrCreate65, jArr, jArrCreate65);
        squareN(jArrCreate65, 7, jArrCreate64);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 14, jArrCreate65);
        multiply(jArrCreate65, jArrCreate64, jArrCreate65);
        square(jArrCreate65, jArrCreate65);
        multiply(jArrCreate65, jArr, jArrCreate65);
        squareN(jArrCreate65, 29, jArrCreate64);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        square(jArrCreate64, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, 59, jArrCreate65);
        multiply(jArrCreate65, jArrCreate64, jArrCreate65);
        square(jArrCreate65, jArrCreate65);
        multiply(jArrCreate65, jArr, jArrCreate65);
        squareN(jArrCreate65, 119, jArrCreate64);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        square(jArrCreate64, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        addExt(jArr3, jArrCreateExt64, jArr3);
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        long j17 = jArr[6];
        long j18 = jArr[7];
        long j19 = j17 ^ (j18 >>> 17);
        long j21 = (j16 ^ (j18 << 47)) ^ (j19 >>> 17);
        long j22 = ((j15 ^ (j18 >>> 47)) ^ (j19 << 47)) ^ (j21 >>> 17);
        long j23 = j11 ^ (j22 << 17);
        long j24 = (j12 ^ (j21 << 17)) ^ (j22 >>> 47);
        long j25 = ((j13 ^ (j19 << 17)) ^ (j21 >>> 47)) ^ (j22 << 47);
        long j26 = (((j14 ^ (j18 << 17)) ^ (j19 >>> 47)) ^ (j21 << 47)) ^ (j22 >>> 17);
        long j27 = j26 >>> 47;
        jArr2[0] = j23 ^ j27;
        jArr2[1] = j24;
        jArr2[2] = (j27 << 30) ^ j25;
        jArr2[3] = M47 & j26;
    }

    public static void reduce17(long[] jArr, int i11) {
        int i12 = i11 + 3;
        long j11 = jArr[i12];
        long j12 = j11 >>> 47;
        jArr[i11] = jArr[i11] ^ j12;
        int i13 = i11 + 2;
        jArr[i13] = (j12 << 30) ^ jArr[i13];
        jArr[i12] = j11 & M47;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j11 = (jUnshuffle & 4294967295L) | (jUnshuffle2 << 32);
        long j12 = (jUnshuffle >>> 32) | (jUnshuffle2 & (-4294967296L));
        int i11 = 2;
        long jUnshuffle3 = Interleave.unshuffle(jArr[2]);
        long jUnshuffle4 = Interleave.unshuffle(jArr[3]);
        long j13 = (jUnshuffle3 & 4294967295L) | (jUnshuffle4 << 32);
        long j14 = (jUnshuffle4 & (-4294967296L)) | (jUnshuffle3 >>> 32);
        long j15 = j14 >>> 49;
        long j16 = (j12 >>> 49) | (j14 << 15);
        long j17 = j14 ^ (j12 << 15);
        long[] jArrCreateExt64 = Nat256.createExt64();
        int[] iArr = {39, 120};
        int i12 = 0;
        while (i12 < i11) {
            int i13 = iArr[i12];
            int i14 = i13 >>> 6;
            int i15 = i13 & 63;
            jArrCreateExt64[i14] = jArrCreateExt64[i14] ^ (j12 << i15);
            int i16 = i14 + 1;
            int[] iArr2 = iArr;
            int i17 = -i15;
            jArrCreateExt64[i16] = jArrCreateExt64[i16] ^ ((j17 << i15) | (j12 >>> i17));
            int i18 = i14 + 2;
            jArrCreateExt64[i18] = jArrCreateExt64[i18] ^ ((j16 << i15) | (j17 >>> i17));
            int i19 = i14 + 3;
            jArrCreateExt64[i19] = jArrCreateExt64[i19] ^ ((j15 << i15) | (j16 >>> i17));
            int i21 = i14 + 4;
            jArrCreateExt64[i21] = jArrCreateExt64[i21] ^ (j15 >>> i17);
            i12++;
            i11 = 2;
            iArr = iArr2;
        }
        reduce(jArrCreateExt64, jArr2);
        jArr2[0] = jArr2[0] ^ j11;
        jArr2[1] = jArr2[1] ^ j13;
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        implSquare(jArr, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        implSquare(jArr, jArrCreateExt64);
        addExt(jArr2, jArrCreateExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i11, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
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
        return ((int) ((jArr[0] ^ (jArr[1] >>> 17)) ^ (jArr[2] >>> 34))) & 1;
    }
}
