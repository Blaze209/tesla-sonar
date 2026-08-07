package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Nat192 {
    private static final long M = 4294967295L;

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j11 = (((long) iArr[0]) & M) + (((long) iArr2[0]) & M);
        iArr3[0] = (int) j11;
        long j12 = (j11 >>> 32) + (((long) iArr[1]) & M) + (((long) iArr2[1]) & M);
        iArr3[1] = (int) j12;
        long j13 = (j12 >>> 32) + (((long) iArr[2]) & M) + (((long) iArr2[2]) & M);
        iArr3[2] = (int) j13;
        long j14 = (j13 >>> 32) + (((long) iArr[3]) & M) + (((long) iArr2[3]) & M);
        iArr3[3] = (int) j14;
        long j15 = (j14 >>> 32) + (((long) iArr[4]) & M) + (((long) iArr2[4]) & M);
        iArr3[4] = (int) j15;
        long j16 = (j15 >>> 32) + (((long) iArr[5]) & M) + (((long) iArr2[5]) & M);
        iArr3[5] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j11 = (((long) iArr[0]) & M) + (((long) iArr2[0]) & M) + (((long) iArr3[0]) & M);
        iArr3[0] = (int) j11;
        long j12 = (j11 >>> 32) + (((long) iArr[1]) & M) + (((long) iArr2[1]) & M) + (((long) iArr3[1]) & M);
        iArr3[1] = (int) j12;
        long j13 = (j12 >>> 32) + (((long) iArr[2]) & M) + (((long) iArr2[2]) & M) + (((long) iArr3[2]) & M);
        iArr3[2] = (int) j13;
        long j14 = (j13 >>> 32) + (((long) iArr[3]) & M) + (((long) iArr2[3]) & M) + (((long) iArr3[3]) & M);
        iArr3[3] = (int) j14;
        long j15 = (j14 >>> 32) + (((long) iArr[4]) & M) + (((long) iArr2[4]) & M) + (((long) iArr3[4]) & M);
        iArr3[4] = (int) j15;
        long j16 = (j15 >>> 32) + (((long) iArr[5]) & M) + (((long) iArr2[5]) & M) + (((long) iArr3[5]) & M);
        iArr3[5] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int addTo(int[] iArr, int i11, int[] iArr2, int i12, int i13) {
        long j11 = (((long) i13) & M) + (((long) iArr[i11]) & M) + (((long) iArr2[i12]) & M);
        iArr2[i12] = (int) j11;
        int i14 = i12 + 1;
        long j12 = (j11 >>> 32) + (((long) iArr[i11 + 1]) & M) + (((long) iArr2[i14]) & M);
        iArr2[i14] = (int) j12;
        int i15 = i12 + 2;
        long j13 = (j12 >>> 32) + (((long) iArr[i11 + 2]) & M) + (((long) iArr2[i15]) & M);
        iArr2[i15] = (int) j13;
        int i16 = i12 + 3;
        long j14 = (j13 >>> 32) + (((long) iArr[i11 + 3]) & M) + (((long) iArr2[i16]) & M);
        iArr2[i16] = (int) j14;
        int i17 = i12 + 4;
        long j15 = (j14 >>> 32) + (((long) iArr[i11 + 4]) & M) + (((long) iArr2[i17]) & M);
        iArr2[i17] = (int) j15;
        int i18 = i12 + 5;
        long j16 = (j15 >>> 32) + (((long) iArr[i11 + 5]) & M) + (M & ((long) iArr2[i18]));
        iArr2[i18] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i11, int[] iArr2, int i12) {
        long j11 = (((long) iArr[i11]) & M) + (((long) iArr2[i12]) & M);
        int i13 = (int) j11;
        iArr[i11] = i13;
        iArr2[i12] = i13;
        int i14 = i11 + 1;
        int i15 = i12 + 1;
        long j12 = (j11 >>> 32) + (((long) iArr[i14]) & M) + (((long) iArr2[i15]) & M);
        int i16 = (int) j12;
        iArr[i14] = i16;
        iArr2[i15] = i16;
        int i17 = i11 + 2;
        int i18 = i12 + 2;
        long j13 = (j12 >>> 32) + (((long) iArr[i17]) & M) + (((long) iArr2[i18]) & M);
        int i19 = (int) j13;
        iArr[i17] = i19;
        iArr2[i18] = i19;
        int i21 = i11 + 3;
        int i22 = i12 + 3;
        long j14 = (j13 >>> 32) + (((long) iArr[i21]) & M) + (((long) iArr2[i22]) & M);
        int i23 = (int) j14;
        iArr[i21] = i23;
        iArr2[i22] = i23;
        int i24 = i11 + 4;
        int i25 = i12 + 4;
        long j15 = (j14 >>> 32) + (((long) iArr[i24]) & M) + (((long) iArr2[i25]) & M);
        int i26 = (int) j15;
        iArr[i24] = i26;
        iArr2[i25] = i26;
        int i27 = i11 + 5;
        int i28 = i12 + 5;
        long j16 = (j15 >>> 32) + (((long) iArr[i27]) & M) + (M & ((long) iArr2[i28]));
        int i29 = (int) j16;
        iArr[i27] = i29;
        iArr2[i28] = i29;
        return (int) (j16 >>> 32);
    }

    public static void copy(int[] iArr, int i11, int[] iArr2, int i12) {
        iArr2[i12] = iArr[i11];
        iArr2[i12 + 1] = iArr[i11 + 1];
        iArr2[i12 + 2] = iArr[i11 + 2];
        iArr2[i12 + 3] = iArr[i11 + 3];
        iArr2[i12 + 4] = iArr[i11 + 4];
        iArr2[i12 + 5] = iArr[i11 + 5];
    }

    public static void copy64(long[] jArr, int i11, long[] jArr2, int i12) {
        jArr2[i12] = jArr[i11];
        jArr2[i12 + 1] = jArr[i11 + 1];
        jArr2[i12 + 2] = jArr[i11 + 2];
    }

    public static int[] create() {
        return new int[6];
    }

    public static long[] create64() {
        return new long[3];
    }

    public static int[] createExt() {
        return new int[12];
    }

    public static long[] createExt64() {
        return new long[6];
    }

    public static boolean diff(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        boolean zGte = gte(iArr, i11, iArr2, i12);
        if (zGte) {
            sub(iArr, i11, iArr2, i12, iArr3, i13);
            return zGte;
        }
        sub(iArr2, i12, iArr, i11, iArr3, i13);
        return zGte;
    }

    public static boolean eq(int[] iArr, int[] iArr2) {
        for (int i11 = 5; i11 >= 0; i11--) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i11 = 2; i11 >= 0; i11--) {
            if (jArr[i11] != jArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        int[] iArrCreate = create();
        for (int i11 = 0; i11 < 6; i11++) {
            iArrCreate[i11] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArrCreate;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        long[] jArrCreate64 = create64();
        for (int i11 = 0; i11 < 3; i11++) {
            jArrCreate64[i11] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return jArrCreate64;
    }

    public static int getBit(int[] iArr, int i11) {
        int i12;
        if (i11 == 0) {
            i12 = iArr[0];
        } else {
            int i13 = i11 >> 5;
            if (i13 < 0 || i13 >= 6) {
                return 0;
            }
            i12 = iArr[i13] >>> (i11 & 31);
        }
        return i12 & 1;
    }

    public static boolean gte(int[] iArr, int i11, int[] iArr2, int i12) {
        for (int i13 = 5; i13 >= 0; i13--) {
            int i14 = iArr[i11 + i13] ^ Integer.MIN_VALUE;
            int i15 = Integer.MIN_VALUE ^ iArr2[i12 + i13];
            if (i14 < i15) {
                return false;
            }
            if (i14 > i15) {
                return true;
            }
        }
        return true;
    }

    public static boolean isOne(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i11 = 1; i11 < 6; i11++) {
            if (iArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne64(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i11 = 1; i11 < 3; i11++) {
            if (jArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i11 = 0; i11 < 6; i11++) {
            if (iArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i11 = 0; i11 < 3; i11++) {
            if (jArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j11 = ((long) iArr2[i12]) & M;
        long j12 = ((long) iArr2[i12 + 1]) & M;
        long j13 = ((long) iArr2[i12 + 2]) & M;
        long j14 = ((long) iArr2[i12 + 3]) & M;
        long j15 = ((long) iArr2[i12 + 4]) & M;
        long j16 = ((long) iArr2[i12 + 5]) & M;
        long j17 = ((long) iArr[i11]) & M;
        long j18 = j17 * j11;
        iArr3[i13] = (int) j18;
        long j19 = (j18 >>> 32) + (j17 * j12);
        iArr3[i13 + 1] = (int) j19;
        long j21 = (j19 >>> 32) + (j17 * j13);
        iArr3[i13 + 2] = (int) j21;
        long j22 = (j21 >>> 32) + (j17 * j14);
        iArr3[i13 + 3] = (int) j22;
        long j23 = (j22 >>> 32) + (j17 * j15);
        iArr3[i13 + 4] = (int) j23;
        long j24 = (j23 >>> 32) + (j17 * j16);
        iArr3[i13 + 5] = (int) j24;
        iArr3[i13 + 6] = (int) (j24 >>> 32);
        int i14 = 1;
        int i15 = i13;
        while (i14 < 6) {
            int i16 = i15 + 1;
            long j25 = ((long) iArr[i11 + i14]) & M;
            int i17 = i15;
            long j26 = (j25 * j11) + (((long) iArr3[i16]) & M);
            iArr3[i16] = (int) j26;
            int i18 = i17 + 2;
            long j27 = (j26 >>> 32) + (j25 * j12) + (((long) iArr3[i18]) & M);
            iArr3[i18] = (int) j27;
            int i19 = i17 + 3;
            long j28 = (j27 >>> 32) + (j25 * j13) + (((long) iArr3[i19]) & M);
            iArr3[i19] = (int) j28;
            int i21 = i17 + 4;
            long j29 = (j28 >>> 32) + (j25 * j14) + (((long) iArr3[i21]) & M);
            iArr3[i21] = (int) j29;
            int i22 = i17 + 5;
            long j31 = (j29 >>> 32) + (j25 * j15) + (((long) iArr3[i22]) & M);
            iArr3[i22] = (int) j31;
            int i23 = i17 + 6;
            long j32 = (j31 >>> 32) + (j25 * j16) + (((long) iArr3[i23]) & M);
            iArr3[i23] = (int) j32;
            iArr3[i17 + 7] = (int) (j32 >>> 32);
            i14++;
            i15 = i16;
        }
    }

    public static long mul33Add(int i11, int[] iArr, int i12, int[] iArr2, int i13, int[] iArr3, int i14) {
        long j11 = ((long) i11) & M;
        long j12 = ((long) iArr[i12]) & M;
        long j13 = (j11 * j12) + (((long) iArr2[i13]) & M);
        iArr3[i14] = (int) j13;
        long j14 = ((long) iArr[i12 + 1]) & M;
        long j15 = (j13 >>> 32) + (j11 * j14) + j12 + (((long) iArr2[i13 + 1]) & M);
        iArr3[i14 + 1] = (int) j15;
        long j16 = j15 >>> 32;
        long j17 = ((long) iArr[i12 + 2]) & M;
        long j18 = j16 + (j11 * j17) + j14 + (((long) iArr2[i13 + 2]) & M);
        iArr3[i14 + 2] = (int) j18;
        long j19 = ((long) iArr[i12 + 3]) & M;
        long j21 = (j18 >>> 32) + (j11 * j19) + j17 + (((long) iArr2[i13 + 3]) & M);
        iArr3[i14 + 3] = (int) j21;
        long j22 = ((long) iArr[i12 + 4]) & M;
        long j23 = (j21 >>> 32) + (j11 * j22) + j19 + (((long) iArr2[i13 + 4]) & M);
        iArr3[i14 + 4] = (int) j23;
        long j24 = ((long) iArr[i12 + 5]) & M;
        long j25 = (j23 >>> 32) + (j11 * j24) + j22 + (M & ((long) iArr2[i13 + 5]));
        iArr3[i14 + 5] = (int) j25;
        return (j25 >>> 32) + j24;
    }

    public static int mul33DWordAdd(int i11, long j11, int[] iArr, int i12) {
        long j12 = ((long) i11) & M;
        long j13 = j11 & M;
        long j14 = (j12 * j13) + (((long) iArr[i12]) & M);
        iArr[i12] = (int) j14;
        long j15 = j11 >>> 32;
        long j16 = (j12 * j15) + j13;
        int i13 = i12 + 1;
        long j17 = (j14 >>> 32) + j16 + (((long) iArr[i13]) & M);
        iArr[i13] = (int) j17;
        int i14 = i12 + 2;
        long j18 = (j17 >>> 32) + j15 + (((long) iArr[i14]) & M);
        iArr[i14] = (int) j18;
        long j19 = j18 >>> 32;
        int i15 = i12 + 3;
        long j21 = j19 + (((long) iArr[i15]) & M);
        iArr[i15] = (int) j21;
        if ((j21 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i12, 4);
    }

    public static int mul33WordAdd(int i11, int i12, int[] iArr, int i13) {
        long j11 = ((long) i11) & M;
        long j12 = ((long) i12) & M;
        long j13 = (j11 * j12) + (((long) iArr[i13]) & M);
        iArr[i13] = (int) j13;
        int i14 = i13 + 1;
        long j14 = (j13 >>> 32) + j12 + (((long) iArr[i14]) & M);
        iArr[i14] = (int) j14;
        long j15 = j14 >>> 32;
        int i15 = i13 + 2;
        long j16 = j15 + (((long) iArr[i15]) & M);
        iArr[i15] = (int) j16;
        if ((j16 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i13, 3);
    }

    public static int mulAddTo(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j11 = ((long) iArr2[i12]) & M;
        long j12 = ((long) iArr2[i12 + 1]) & M;
        long j13 = ((long) iArr2[i12 + 2]) & M;
        long j14 = ((long) iArr2[i12 + 3]) & M;
        long j15 = ((long) iArr2[i12 + 4]) & M;
        long j16 = ((long) iArr2[i12 + 5]) & M;
        long j17 = 0;
        int i14 = 0;
        int i15 = i13;
        while (i14 < 6) {
            long j18 = ((long) iArr[i11 + i14]) & M;
            long j19 = (j18 * j11) + (((long) iArr3[i15]) & M);
            long j21 = j12;
            iArr3[i15] = (int) j19;
            int i16 = i15 + 1;
            long j22 = (j19 >>> 32) + (j18 * j21) + (((long) iArr3[i16]) & M);
            iArr3[i16] = (int) j22;
            int i17 = i15 + 2;
            long j23 = (j22 >>> 32) + (j18 * j13) + (((long) iArr3[i17]) & M);
            iArr3[i17] = (int) j23;
            int i18 = i15 + 3;
            long j24 = (j23 >>> 32) + (j18 * j14) + (((long) iArr3[i18]) & M);
            iArr3[i18] = (int) j24;
            int i19 = i15 + 4;
            long j25 = (j24 >>> 32) + (j18 * j15) + (((long) iArr3[i19]) & M);
            iArr3[i19] = (int) j25;
            int i21 = i15 + 5;
            long j26 = (j25 >>> 32) + (j18 * j16) + (((long) iArr3[i21]) & M);
            iArr3[i21] = (int) j26;
            int i22 = i15 + 6;
            long j27 = j17 + (j26 >>> 32) + (((long) iArr3[i22]) & M);
            iArr3[i22] = (int) j27;
            j17 = j27 >>> 32;
            i14++;
            i15 = i16;
            j12 = j21;
        }
        return (int) j17;
    }

    public static int mulWord(int i11, int[] iArr, int[] iArr2, int i12) {
        long j11 = ((long) i11) & M;
        long j12 = 0;
        int i13 = 0;
        do {
            long j13 = j12 + ((((long) iArr[i13]) & M) * j11);
            iArr2[i12 + i13] = (int) j13;
            j12 = j13 >>> 32;
            i13++;
        } while (i13 < 6);
        return (int) j12;
    }

    public static int mulWordAddExt(int i11, int[] iArr, int i12, int[] iArr2, int i13) {
        long j11 = ((long) i11) & M;
        long j12 = ((((long) iArr[i12]) & M) * j11) + (((long) iArr2[i13]) & M);
        iArr2[i13] = (int) j12;
        int i14 = i13 + 1;
        long j13 = (j12 >>> 32) + ((((long) iArr[i12 + 1]) & M) * j11) + (((long) iArr2[i14]) & M);
        iArr2[i14] = (int) j13;
        int i15 = i13 + 2;
        long j14 = (j13 >>> 32) + ((((long) iArr[i12 + 2]) & M) * j11) + (((long) iArr2[i15]) & M);
        iArr2[i15] = (int) j14;
        int i16 = i13 + 3;
        long j15 = (j14 >>> 32) + ((((long) iArr[i12 + 3]) & M) * j11) + (((long) iArr2[i16]) & M);
        iArr2[i16] = (int) j15;
        int i17 = i13 + 4;
        long j16 = (j15 >>> 32) + ((((long) iArr[i12 + 4]) & M) * j11) + (((long) iArr2[i17]) & M);
        iArr2[i17] = (int) j16;
        int i18 = i13 + 5;
        long j17 = (j16 >>> 32) + (j11 * (((long) iArr[i12 + 5]) & M)) + (((long) iArr2[i18]) & M);
        iArr2[i18] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int mulWordDwordAdd(int i11, long j11, int[] iArr, int i12) {
        long j12 = ((long) i11) & M;
        long j13 = ((j11 & M) * j12) + (((long) iArr[i12]) & M);
        iArr[i12] = (int) j13;
        long j14 = j12 * (j11 >>> 32);
        int i13 = i12 + 1;
        long j15 = (j13 >>> 32) + j14 + (((long) iArr[i13]) & M);
        iArr[i13] = (int) j15;
        int i14 = i12 + 2;
        long j16 = (j15 >>> 32) + (((long) iArr[i14]) & M);
        iArr[i14] = (int) j16;
        if ((j16 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i12, 3);
    }

    public static void square(int[] iArr, int i11, int[] iArr2, int i12) {
        long j11 = ((long) iArr[i11]) & M;
        int i13 = 0;
        int i14 = 12;
        int i15 = 5;
        while (true) {
            int i16 = i15 - 1;
            long j12 = ((long) iArr[i11 + i15]) & M;
            long j13 = j12 * j12;
            iArr2[i12 + (i14 - 1)] = (i13 << 31) | ((int) (j13 >>> 33));
            i14 -= 2;
            iArr2[i12 + i14] = (int) (j13 >>> 1);
            i13 = (int) j13;
            if (i16 <= 0) {
                long j14 = j11 * j11;
                long j15 = (j14 >>> 33) | (((long) (i13 << 31)) & M);
                iArr2[i12] = (int) j14;
                int i17 = ((int) (j14 >>> 32)) & 1;
                long j16 = ((long) iArr[i11 + 1]) & M;
                int i18 = i12 + 2;
                long j17 = ((long) iArr2[i18]) & M;
                long j18 = j15 + (j16 * j11);
                int i19 = (int) j18;
                iArr2[i12 + 1] = (i19 << 1) | i17;
                int i21 = i19 >>> 31;
                long j19 = j17 + (j18 >>> 32);
                long j21 = ((long) iArr[i11 + 2]) & M;
                int i22 = i12 + 3;
                long j22 = ((long) iArr2[i22]) & M;
                int i23 = i12 + 4;
                long j23 = ((long) iArr2[i23]) & M;
                long j24 = j19 + (j21 * j11);
                int i24 = (int) j24;
                iArr2[i18] = (i24 << 1) | i21;
                long j25 = j22 + (j24 >>> 32) + (j21 * j16);
                long j26 = j23 + (j25 >>> 32);
                long j27 = j25 & M;
                long j28 = ((long) iArr[i11 + 3]) & M;
                int i25 = i12 + 5;
                long j29 = (((long) iArr2[i25]) & M) + (j26 >>> 32);
                long j31 = j26 & M;
                int i26 = i12 + 6;
                long j32 = (((long) iArr2[i26]) & M) + (j29 >>> 32);
                long j33 = j29 & M;
                long j34 = j27 + (j28 * j11);
                int i27 = (int) j34;
                iArr2[i22] = (i27 << 1) | (i24 >>> 31);
                int i28 = i27 >>> 31;
                long j35 = j31 + (j34 >>> 32) + (j28 * j16);
                long j36 = j33 + (j35 >>> 32) + (j28 * j21);
                long j37 = j35 & M;
                long j38 = j32 + (j36 >>> 32);
                long j39 = j36 & M;
                long j41 = ((long) iArr[i11 + 4]) & M;
                int i29 = i12 + 7;
                long j42 = (((long) iArr2[i29]) & M) + (j38 >>> 32);
                long j43 = j38 & M;
                int i31 = i12 + 8;
                long j44 = (((long) iArr2[i31]) & M) + (j42 >>> 32);
                long j45 = j42 & M;
                long j46 = j37 + (j41 * j11);
                int i32 = (int) j46;
                iArr2[i23] = (i32 << 1) | i28;
                int i33 = i32 >>> 31;
                long j47 = j39 + (j46 >>> 32) + (j41 * j16);
                long j48 = j43 + (j47 >>> 32) + (j41 * j21);
                long j49 = j47 & M;
                long j51 = j45 + (j48 >>> 32) + (j41 * j28);
                long j52 = j48 & M;
                long j53 = j44 + (j51 >>> 32);
                long j54 = j51 & M;
                long j55 = ((long) iArr[i11 + 5]) & M;
                int i34 = i12 + 9;
                long j56 = (((long) iArr2[i34]) & M) + (j53 >>> 32);
                long j57 = j53 & M;
                int i35 = i12 + 10;
                long j58 = (((long) iArr2[i35]) & M) + (j56 >>> 32);
                long j59 = j56 & M;
                long j61 = j49 + (j11 * j55);
                int i36 = (int) j61;
                iArr2[i25] = (i36 << 1) | i33;
                long j62 = j52 + (j61 >>> 32) + (j16 * j55);
                long j63 = j54 + (j62 >>> 32) + (j55 * j21);
                long j64 = j57 + (j63 >>> 32) + (j55 * j28);
                long j65 = j59 + (j64 >>> 32) + (j55 * j41);
                long j66 = j58 + (j65 >>> 32);
                int i37 = (int) j62;
                iArr2[i26] = (i36 >>> 31) | (i37 << 1);
                int i38 = (int) j63;
                iArr2[i29] = (i38 << 1) | (i37 >>> 31);
                int i39 = (int) j64;
                iArr2[i31] = (i38 >>> 31) | (i39 << 1);
                int i41 = i39 >>> 31;
                int i42 = (int) j65;
                iArr2[i34] = i41 | (i42 << 1);
                int i43 = i42 >>> 31;
                int i44 = (int) j66;
                iArr2[i35] = i43 | (i44 << 1);
                int i45 = i44 >>> 31;
                int i46 = i12 + 11;
                iArr2[i46] = i45 | ((iArr2[i46] + ((int) (j66 >>> 32))) << 1);
                return;
            }
            i15 = i16;
        }
    }

    public static int sub(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j11 = (((long) iArr[i11]) & M) - (((long) iArr2[i12]) & M);
        iArr3[i13] = (int) j11;
        long j12 = (j11 >> 32) + ((((long) iArr[i11 + 1]) & M) - (((long) iArr2[i12 + 1]) & M));
        iArr3[i13 + 1] = (int) j12;
        long j13 = (j12 >> 32) + ((((long) iArr[i11 + 2]) & M) - (((long) iArr2[i12 + 2]) & M));
        iArr3[i13 + 2] = (int) j13;
        long j14 = (j13 >> 32) + ((((long) iArr[i11 + 3]) & M) - (((long) iArr2[i12 + 3]) & M));
        iArr3[i13 + 3] = (int) j14;
        long j15 = (j14 >> 32) + ((((long) iArr[i11 + 4]) & M) - (((long) iArr2[i12 + 4]) & M));
        iArr3[i13 + 4] = (int) j15;
        long j16 = (j15 >> 32) + ((((long) iArr[i11 + 5]) & M) - (((long) iArr2[i12 + 5]) & M));
        iArr3[i13 + 5] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j11 = ((((long) iArr3[0]) & M) - (((long) iArr[0]) & M)) - (((long) iArr2[0]) & M);
        iArr3[0] = (int) j11;
        long j12 = (j11 >> 32) + (((((long) iArr3[1]) & M) - (((long) iArr[1]) & M)) - (((long) iArr2[1]) & M));
        iArr3[1] = (int) j12;
        long j13 = (j12 >> 32) + (((((long) iArr3[2]) & M) - (((long) iArr[2]) & M)) - (((long) iArr2[2]) & M));
        iArr3[2] = (int) j13;
        long j14 = (j13 >> 32) + (((((long) iArr3[3]) & M) - (((long) iArr[3]) & M)) - (((long) iArr2[3]) & M));
        iArr3[3] = (int) j14;
        long j15 = (j14 >> 32) + (((((long) iArr3[4]) & M) - (((long) iArr[4]) & M)) - (((long) iArr2[4]) & M));
        iArr3[4] = (int) j15;
        long j16 = (j15 >> 32) + (((((long) iArr3[5]) & M) - (((long) iArr[5]) & M)) - (((long) iArr2[5]) & M));
        iArr3[5] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static int subFrom(int[] iArr, int i11, int[] iArr2, int i12) {
        long j11 = (((long) iArr2[i12]) & M) - (((long) iArr[i11]) & M);
        iArr2[i12] = (int) j11;
        int i13 = i12 + 1;
        long j12 = (j11 >> 32) + ((((long) iArr2[i13]) & M) - (((long) iArr[i11 + 1]) & M));
        iArr2[i13] = (int) j12;
        int i14 = i12 + 2;
        long j13 = (j12 >> 32) + ((((long) iArr2[i14]) & M) - (((long) iArr[i11 + 2]) & M));
        iArr2[i14] = (int) j13;
        int i15 = i12 + 3;
        long j14 = (j13 >> 32) + ((((long) iArr2[i15]) & M) - (((long) iArr[i11 + 3]) & M));
        iArr2[i15] = (int) j14;
        int i16 = i12 + 4;
        long j15 = (j14 >> 32) + ((((long) iArr2[i16]) & M) - (((long) iArr[i11 + 4]) & M));
        iArr2[i16] = (int) j15;
        int i17 = i12 + 5;
        long j16 = (j15 >> 32) + ((((long) iArr2[i17]) & M) - (((long) iArr[i11 + 5]) & M));
        iArr2[i17] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i11 = 0; i11 < 6; i11++) {
            int i12 = iArr[i11];
            if (i12 != 0) {
                Pack.intToBigEndian(i12, bArr, (5 - i11) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i11 = 0; i11 < 3; i11++) {
            long j11 = jArr[i11];
            if (j11 != 0) {
                Pack.longToBigEndian(j11, bArr, (2 - i11) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j11 = (((long) iArr[0]) & M) + (((long) iArr2[0]) & M);
        iArr2[0] = (int) j11;
        long j12 = (j11 >>> 32) + (((long) iArr[1]) & M) + (((long) iArr2[1]) & M);
        iArr2[1] = (int) j12;
        long j13 = (j12 >>> 32) + (((long) iArr[2]) & M) + (((long) iArr2[2]) & M);
        iArr2[2] = (int) j13;
        long j14 = (j13 >>> 32) + (((long) iArr[3]) & M) + (((long) iArr2[3]) & M);
        iArr2[3] = (int) j14;
        long j15 = (j14 >>> 32) + (((long) iArr[4]) & M) + (((long) iArr2[4]) & M);
        iArr2[4] = (int) j15;
        long j16 = (j15 >>> 32) + (((long) iArr[5]) & M) + (M & ((long) iArr2[5]));
        iArr2[5] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i11 = 5; i11 >= 0; i11--) {
            int i12 = iArr[i11] ^ Integer.MIN_VALUE;
            int i13 = Integer.MIN_VALUE ^ iArr2[i11];
            if (i12 < i13) {
                return false;
            }
            if (i12 > i13) {
                return true;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j11 = ((long) iArr2[0]) & M;
        long j12 = ((long) iArr2[1]) & M;
        long j13 = ((long) iArr2[2]) & M;
        long j14 = ((long) iArr2[3]) & M;
        long j15 = ((long) iArr2[4]) & M;
        long j16 = ((long) iArr2[5]) & M;
        int i11 = 1;
        long j17 = ((long) iArr[0]) & M;
        long j18 = j17 * j11;
        iArr3[0] = (int) j18;
        long j19 = (j18 >>> 32) + (j17 * j12);
        iArr3[1] = (int) j19;
        long j21 = (j19 >>> 32) + (j17 * j13);
        iArr3[2] = (int) j21;
        long j22 = (j21 >>> 32) + (j17 * j14);
        iArr3[3] = (int) j22;
        long j23 = (j22 >>> 32) + (j17 * j15);
        iArr3[4] = (int) j23;
        long j24 = (j23 >>> 32) + (j17 * j16);
        iArr3[5] = (int) j24;
        int i12 = 6;
        iArr3[6] = (int) (j24 >>> 32);
        while (true) {
            int i13 = i11;
            if (i13 >= i12) {
                return;
            }
            long j25 = ((long) iArr[i13]) & M;
            long j26 = (j25 * j11) + (((long) iArr3[i13]) & M);
            iArr3[i13] = (int) j26;
            i11 = i13 + 1;
            long j27 = j15;
            long j28 = (j26 >>> 32) + (j25 * j12) + (((long) iArr3[i11]) & M);
            iArr3[i11] = (int) j28;
            int i14 = i13 + 2;
            long j29 = (j28 >>> 32) + (j25 * j13) + (((long) iArr3[i14]) & M);
            iArr3[i14] = (int) j29;
            int i15 = i13 + 3;
            long j31 = (j29 >>> 32) + (j25 * j14) + (((long) iArr3[i15]) & M);
            iArr3[i15] = (int) j31;
            int i16 = i13 + 4;
            long j32 = (j31 >>> 32) + (j25 * j27) + (((long) iArr3[i16]) & M);
            iArr3[i16] = (int) j32;
            int i17 = i13 + 5;
            long j33 = (j32 >>> 32) + (j25 * j16) + (((long) iArr3[i17]) & M);
            iArr3[i17] = (int) j33;
            iArr3[i13 + 6] = (int) (j33 >>> 32);
            j15 = j27;
            i12 = 6;
        }
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i11 = 0;
        long j11 = ((long) iArr2[0]) & M;
        long j12 = ((long) iArr2[1]) & M;
        long j13 = ((long) iArr2[2]) & M;
        long j14 = ((long) iArr2[3]) & M;
        long j15 = ((long) iArr2[4]) & M;
        long j16 = ((long) iArr2[5]) & M;
        long j17 = 0;
        while (i11 < 6) {
            long j18 = j11;
            int i12 = i11;
            long j19 = ((long) iArr[i11]) & M;
            long j21 = (((long) iArr3[i12]) & M) + (j19 * j18);
            iArr3[i12] = (int) j21;
            int i13 = i12 + 1;
            long j22 = (j21 >>> 32) + (j19 * j12) + (((long) iArr3[i13]) & M);
            iArr3[i13] = (int) j22;
            int i14 = i12 + 2;
            long j23 = (j22 >>> 32) + (j19 * j13) + (((long) iArr3[i14]) & M);
            iArr3[i14] = (int) j23;
            int i15 = i12 + 3;
            long j24 = (j23 >>> 32) + (j19 * j14) + (((long) iArr3[i15]) & M);
            iArr3[i15] = (int) j24;
            int i16 = i12 + 4;
            long j25 = (j24 >>> 32) + (j19 * j15) + (((long) iArr3[i16]) & M);
            iArr3[i16] = (int) j25;
            int i17 = i12 + 5;
            long j26 = (j25 >>> 32) + (j19 * j16) + (((long) iArr3[i17]) & M);
            iArr3[i17] = (int) j26;
            int i18 = i12 + 6;
            long j27 = j17 + (j26 >>> 32) + (((long) iArr3[i18]) & M);
            iArr3[i18] = (int) j27;
            j17 = j27 >>> 32;
            i11 = i13;
            j11 = j18;
        }
        return (int) j17;
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j11 = ((long) iArr[0]) & M;
        int i11 = 12;
        int i12 = 0;
        int i13 = 5;
        while (true) {
            int i14 = i13 - 1;
            long j12 = ((long) iArr[i13]) & M;
            long j13 = j12 * j12;
            iArr2[i11 - 1] = (i12 << 31) | ((int) (j13 >>> 33));
            i11 -= 2;
            iArr2[i11] = (int) (j13 >>> 1);
            i12 = (int) j13;
            if (i14 <= 0) {
                long j14 = j11 * j11;
                long j15 = (j14 >>> 33) | (((long) (i12 << 31)) & M);
                iArr2[0] = (int) j14;
                long j16 = ((long) iArr[1]) & M;
                long j17 = ((long) iArr2[2]) & M;
                long j18 = j15 + (j16 * j11);
                int i15 = (int) j18;
                iArr2[1] = (i15 << 1) | (((int) (j14 >>> 32)) & 1);
                long j19 = j17 + (j18 >>> 32);
                long j21 = ((long) iArr[2]) & M;
                long j22 = ((long) iArr2[3]) & M;
                long j23 = ((long) iArr2[4]) & M;
                long j24 = j19 + (j21 * j11);
                int i16 = (int) j24;
                iArr2[2] = (i16 << 1) | (i15 >>> 31);
                long j25 = j22 + (j24 >>> 32) + (j21 * j16);
                long j26 = j23 + (j25 >>> 32);
                long j27 = j25 & M;
                long j28 = ((long) iArr[3]) & M;
                long j29 = (((long) iArr2[5]) & M) + (j26 >>> 32);
                long j31 = j26 & M;
                long j32 = (((long) iArr2[6]) & M) + (j29 >>> 32);
                long j33 = j29 & M;
                long j34 = j27 + (j28 * j11);
                int i17 = (int) j34;
                iArr2[3] = (i17 << 1) | (i16 >>> 31);
                int i18 = i17 >>> 31;
                long j35 = j31 + (j34 >>> 32) + (j28 * j16);
                long j36 = j33 + (j35 >>> 32) + (j28 * j21);
                long j37 = j35 & M;
                long j38 = j32 + (j36 >>> 32);
                long j39 = j36 & M;
                long j41 = ((long) iArr[4]) & M;
                long j42 = (((long) iArr2[7]) & M) + (j38 >>> 32);
                long j43 = j38 & M;
                long j44 = (((long) iArr2[8]) & M) + (j42 >>> 32);
                long j45 = j42 & M;
                long j46 = j37 + (j41 * j11);
                int i19 = (int) j46;
                iArr2[4] = (i19 << 1) | i18;
                int i21 = i19 >>> 31;
                long j47 = j39 + (j46 >>> 32) + (j41 * j16);
                long j48 = j43 + (j47 >>> 32) + (j41 * j21);
                long j49 = j47 & M;
                long j51 = j45 + (j48 >>> 32) + (j41 * j28);
                long j52 = j48 & M;
                long j53 = j44 + (j51 >>> 32);
                long j54 = j51 & M;
                long j55 = ((long) iArr[5]) & M;
                long j56 = (((long) iArr2[9]) & M) + (j53 >>> 32);
                long j57 = j53 & M;
                long j58 = (((long) iArr2[10]) & M) + (j56 >>> 32);
                long j59 = j56 & M;
                long j61 = j49 + (j11 * j55);
                int i22 = (int) j61;
                iArr2[5] = (i22 << 1) | i21;
                long j62 = j52 + (j61 >>> 32) + (j16 * j55);
                long j63 = j54 + (j62 >>> 32) + (j21 * j55);
                long j64 = j57 + (j63 >>> 32) + (j55 * j28);
                long j65 = j59 + (j64 >>> 32) + (j41 * j55);
                long j66 = j58 + (j65 >>> 32);
                int i23 = (int) j62;
                iArr2[6] = (i22 >>> 31) | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) j63;
                iArr2[7] = i24 | (i25 << 1);
                int i26 = (int) j64;
                iArr2[8] = (i25 >>> 31) | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) j65;
                iArr2[9] = i27 | (i28 << 1);
                int i29 = i28 >>> 31;
                int i31 = (int) j66;
                iArr2[10] = i29 | (i31 << 1);
                iArr2[11] = ((iArr2[11] + ((int) (j66 >>> 32))) << 1) | (i31 >>> 31);
                return;
            }
            i13 = i14;
        }
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j11 = (((long) iArr[0]) & M) - (((long) iArr2[0]) & M);
        iArr3[0] = (int) j11;
        long j12 = (j11 >> 32) + ((((long) iArr[1]) & M) - (((long) iArr2[1]) & M));
        iArr3[1] = (int) j12;
        long j13 = (j12 >> 32) + ((((long) iArr[2]) & M) - (((long) iArr2[2]) & M));
        iArr3[2] = (int) j13;
        long j14 = (j13 >> 32) + ((((long) iArr[3]) & M) - (((long) iArr2[3]) & M));
        iArr3[3] = (int) j14;
        long j15 = (j14 >> 32) + ((((long) iArr[4]) & M) - (((long) iArr2[4]) & M));
        iArr3[4] = (int) j15;
        long j16 = (j15 >> 32) + ((((long) iArr[5]) & M) - (((long) iArr2[5]) & M));
        iArr3[5] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j11 = (((long) iArr2[0]) & M) - (((long) iArr[0]) & M);
        iArr2[0] = (int) j11;
        long j12 = (j11 >> 32) + ((((long) iArr2[1]) & M) - (((long) iArr[1]) & M));
        iArr2[1] = (int) j12;
        long j13 = (j12 >> 32) + ((((long) iArr2[2]) & M) - (((long) iArr[2]) & M));
        iArr2[2] = (int) j13;
        long j14 = (j13 >> 32) + ((((long) iArr2[3]) & M) - (((long) iArr[3]) & M));
        iArr2[3] = (int) j14;
        long j15 = (j14 >> 32) + ((((long) iArr2[4]) & M) - (((long) iArr[4]) & M));
        iArr2[4] = (int) j15;
        long j16 = (j15 >> 32) + ((((long) iArr2[5]) & M) - (M & ((long) iArr[5])));
        iArr2[5] = (int) j16;
        return (int) (j16 >> 32);
    }
}
