package org.bouncycastle.math.ec.custom.sec;

import com.plaid.internal.EnumC4419g;
import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* JADX INFO: loaded from: classes10.dex */
public class SecT233Field {
    private static final long M41 = 2199023255551L;
    private static final long M59 = 576460752303423487L;

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
        return Nat.fromBigInteger64(EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        Nat256.copy64(jArr, jArr2);
        for (int i11 = 1; i11 < 233; i11 += 2) {
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
        jArr[0] = j11 ^ (j12 << 59);
        jArr[1] = (j12 >>> 5) ^ (j13 << 54);
        jArr[2] = (j13 >>> 10) ^ (j14 << 49);
        jArr[3] = (j14 >>> 15) ^ (j15 << 44);
        jArr[4] = (j15 >>> 20) ^ (j16 << 39);
        jArr[5] = (j16 >>> 25) ^ (j17 << 34);
        jArr[6] = (j17 >>> 30) ^ (j18 << 29);
        jArr[7] = j18 >>> 35;
    }

    protected static void implExpand(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        jArr2[0] = j11 & M59;
        jArr2[1] = ((j11 >>> 59) ^ (j12 << 5)) & M59;
        jArr2[2] = ((j12 >>> 54) ^ (j13 << 10)) & M59;
        jArr2[3] = (j13 >>> 49) ^ (j14 << 15);
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
        jArr2[i11] = jArr2[i11] ^ (M59 & j17);
        int i15 = i11 + 1;
        jArr2[i15] = jArr2[i15] ^ ((j17 >>> 59) ^ (j18 << 5));
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
        squareN(jArrCreate64, 58, jArrCreate65);
        multiply(jArrCreate65, jArrCreate64, jArrCreate65);
        squareN(jArrCreate65, 116, jArrCreate64);
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
        long j19 = j16 ^ (j18 >>> 31);
        long j21 = (j15 ^ ((j18 >>> 41) ^ (j18 << 33))) ^ (j17 >>> 31);
        long j22 = ((j14 ^ (j18 << 23)) ^ ((j17 >>> 41) ^ (j17 << 33))) ^ (j19 >>> 31);
        long j23 = j11 ^ (j21 << 23);
        long j24 = (j12 ^ (j19 << 23)) ^ ((j21 >>> 41) ^ (j21 << 33));
        long j25 = ((j13 ^ (j17 << 23)) ^ ((j19 >>> 41) ^ (j19 << 33))) ^ (j21 >>> 31);
        long j26 = j22 >>> 41;
        jArr2[0] = j23 ^ j26;
        jArr2[1] = (j26 << 10) ^ j24;
        jArr2[2] = j25;
        jArr2[3] = M41 & j22;
    }

    public static void reduce23(long[] jArr, int i11) {
        int i12 = i11 + 3;
        long j11 = jArr[i12];
        long j12 = j11 >>> 41;
        jArr[i11] = jArr[i11] ^ j12;
        int i13 = i11 + 1;
        jArr[i13] = (j12 << 10) ^ jArr[i13];
        jArr[i12] = j11 & M41;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        boolean z11 = true;
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j11 = (jUnshuffle & 4294967295L) | (jUnshuffle2 << 32);
        long j12 = (jUnshuffle >>> 32) | (jUnshuffle2 & (-4294967296L));
        long jUnshuffle3 = Interleave.unshuffle(jArr[2]);
        long jUnshuffle4 = Interleave.unshuffle(jArr[3]);
        long j13 = (4294967295L & jUnshuffle3) | (jUnshuffle4 << 32);
        long j14 = (jUnshuffle3 >>> 32) | ((-4294967296L) & jUnshuffle4);
        long j15 = j14 >>> 27;
        long j16 = j14 ^ ((j12 >>> 27) | (j14 << 37));
        long j17 = j12 ^ (j12 << 37);
        long[] jArrCreateExt64 = Nat256.createExt64();
        int[] iArr = {32, 117, 191};
        int i11 = 0;
        while (i11 < 3) {
            int i12 = iArr[i11];
            int i13 = i12 >>> 6;
            int i14 = i12 & 63;
            jArrCreateExt64[i13] = jArrCreateExt64[i13] ^ (j17 << i14);
            int i15 = i13 + 1;
            boolean z12 = z11;
            int i16 = -i14;
            jArrCreateExt64[i15] = jArrCreateExt64[i15] ^ ((j16 << i14) | (j17 >>> i16));
            int i17 = i13 + 2;
            jArrCreateExt64[i17] = jArrCreateExt64[i17] ^ ((j15 << i14) | (j16 >>> i16));
            int i18 = i13 + 3;
            jArrCreateExt64[i18] = jArrCreateExt64[i18] ^ (j15 >>> i16);
            i11++;
            z11 = z12;
        }
        boolean z13 = z11;
        reduce(jArrCreateExt64, jArr2);
        jArr2[0] = jArr2[0] ^ j11;
        jArr2[z13 ? 1 : 0] = jArr2[z13 ? 1 : 0] ^ j13;
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
        return ((int) (jArr[0] ^ (jArr[2] >>> 31))) & 1;
    }
}
