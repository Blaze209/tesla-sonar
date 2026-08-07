package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Nat224 {
    private static final long M = 4294967295L;

    public static int add(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j11 = (((long) iArr[i11]) & M) + (((long) iArr2[i12]) & M);
        iArr3[i13] = (int) j11;
        long j12 = (j11 >>> 32) + (((long) iArr[i11 + 1]) & M) + (((long) iArr2[i12 + 1]) & M);
        iArr3[i13 + 1] = (int) j12;
        long j13 = (j12 >>> 32) + (((long) iArr[i11 + 2]) & M) + (((long) iArr2[i12 + 2]) & M);
        iArr3[i13 + 2] = (int) j13;
        long j14 = (j13 >>> 32) + (((long) iArr[i11 + 3]) & M) + (((long) iArr2[i12 + 3]) & M);
        iArr3[i13 + 3] = (int) j14;
        long j15 = (j14 >>> 32) + (((long) iArr[i11 + 4]) & M) + (((long) iArr2[i12 + 4]) & M);
        iArr3[i13 + 4] = (int) j15;
        long j16 = (j15 >>> 32) + (((long) iArr[i11 + 5]) & M) + (((long) iArr2[i12 + 5]) & M);
        iArr3[i13 + 5] = (int) j16;
        long j17 = (j16 >>> 32) + (((long) iArr[i11 + 6]) & M) + (((long) iArr2[i12 + 6]) & M);
        iArr3[i13 + 6] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int addBothTo(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j11 = (((long) iArr[i11]) & M) + (((long) iArr2[i12]) & M) + (((long) iArr3[i13]) & M);
        iArr3[i13] = (int) j11;
        int i14 = i13 + 1;
        long j12 = (j11 >>> 32) + (((long) iArr[i11 + 1]) & M) + (((long) iArr2[i12 + 1]) & M) + (((long) iArr3[i14]) & M);
        iArr3[i14] = (int) j12;
        int i15 = i13 + 2;
        long j13 = (j12 >>> 32) + (((long) iArr[i11 + 2]) & M) + (((long) iArr2[i12 + 2]) & M) + (((long) iArr3[i15]) & M);
        iArr3[i15] = (int) j13;
        int i16 = i13 + 3;
        long j14 = (j13 >>> 32) + (((long) iArr[i11 + 3]) & M) + (((long) iArr2[i12 + 3]) & M) + (((long) iArr3[i16]) & M);
        iArr3[i16] = (int) j14;
        int i17 = i13 + 4;
        long j15 = (j14 >>> 32) + (((long) iArr[i11 + 4]) & M) + (((long) iArr2[i12 + 4]) & M) + (((long) iArr3[i17]) & M);
        iArr3[i17] = (int) j15;
        int i18 = i13 + 5;
        long j16 = (j15 >>> 32) + (((long) iArr[i11 + 5]) & M) + (((long) iArr2[i12 + 5]) & M) + (((long) iArr3[i18]) & M);
        iArr3[i18] = (int) j16;
        int i19 = i13 + 6;
        long j17 = (j16 >>> 32) + (((long) iArr[i11 + 6]) & M) + (((long) iArr2[i12 + 6]) & M) + (((long) iArr3[i19]) & M);
        iArr3[i19] = (int) j17;
        return (int) (j17 >>> 32);
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
        long j16 = (j15 >>> 32) + (((long) iArr[i11 + 5]) & M) + (((long) iArr2[i18]) & M);
        iArr2[i18] = (int) j16;
        int i19 = i12 + 6;
        long j17 = (j16 >>> 32) + (((long) iArr[i11 + 6]) & M) + (M & ((long) iArr2[i19]));
        iArr2[i19] = (int) j17;
        return (int) (j17 >>> 32);
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
        long j16 = (j15 >>> 32) + (((long) iArr[i27]) & M) + (((long) iArr2[i28]) & M);
        int i29 = (int) j16;
        iArr[i27] = i29;
        iArr2[i28] = i29;
        int i31 = i11 + 6;
        int i32 = i12 + 6;
        long j17 = (j16 >>> 32) + (((long) iArr[i31]) & M) + (M & ((long) iArr2[i32]));
        int i33 = (int) j17;
        iArr[i31] = i33;
        iArr2[i32] = i33;
        return (int) (j17 >>> 32);
    }

    public static void copy(int[] iArr, int i11, int[] iArr2, int i12) {
        iArr2[i12] = iArr[i11];
        iArr2[i12 + 1] = iArr[i11 + 1];
        iArr2[i12 + 2] = iArr[i11 + 2];
        iArr2[i12 + 3] = iArr[i11 + 3];
        iArr2[i12 + 4] = iArr[i11 + 4];
        iArr2[i12 + 5] = iArr[i11 + 5];
        iArr2[i12 + 6] = iArr[i11 + 6];
    }

    public static int[] create() {
        return new int[7];
    }

    public static int[] createExt() {
        return new int[14];
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
        for (int i11 = 6; i11 >= 0; i11--) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            throw new IllegalArgumentException();
        }
        int[] iArrCreate = create();
        for (int i11 = 0; i11 < 7; i11++) {
            iArrCreate[i11] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArrCreate;
    }

    public static int getBit(int[] iArr, int i11) {
        int i12;
        if (i11 == 0) {
            i12 = iArr[0];
        } else {
            int i13 = i11 >> 5;
            if (i13 < 0 || i13 >= 7) {
                return 0;
            }
            i12 = iArr[i13] >>> (i11 & 31);
        }
        return i12 & 1;
    }

    public static boolean gte(int[] iArr, int i11, int[] iArr2, int i12) {
        for (int i13 = 6; i13 >= 0; i13--) {
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
        for (int i11 = 1; i11 < 7; i11++) {
            if (iArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i11 = 0; i11 < 7; i11++) {
            if (iArr[i11] != 0) {
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
        long j17 = ((long) iArr2[i12 + 6]) & M;
        long j18 = ((long) iArr[i11]) & M;
        long j19 = j18 * j11;
        iArr3[i13] = (int) j19;
        long j21 = (j19 >>> 32) + (j18 * j12);
        iArr3[i13 + 1] = (int) j21;
        long j22 = (j21 >>> 32) + (j18 * j13);
        iArr3[i13 + 2] = (int) j22;
        long j23 = (j22 >>> 32) + (j18 * j14);
        iArr3[i13 + 3] = (int) j23;
        long j24 = (j23 >>> 32) + (j18 * j15);
        iArr3[i13 + 4] = (int) j24;
        long j25 = (j24 >>> 32) + (j18 * j16);
        iArr3[i13 + 5] = (int) j25;
        long j26 = (j25 >>> 32) + (j18 * j17);
        iArr3[i13 + 6] = (int) j26;
        iArr3[i13 + 7] = (int) (j26 >>> 32);
        int i14 = 1;
        int i15 = i13;
        while (i14 < 7) {
            int i16 = i15 + 1;
            int i17 = i15;
            long j27 = ((long) iArr[i11 + i14]) & M;
            long j28 = (j27 * j11) + (((long) iArr3[i16]) & M);
            iArr3[i16] = (int) j28;
            int i18 = i17 + 2;
            long j29 = (j28 >>> 32) + (j27 * j12) + (((long) iArr3[i18]) & M);
            iArr3[i18] = (int) j29;
            int i19 = i17 + 3;
            long j31 = (j29 >>> 32) + (j27 * j13) + (((long) iArr3[i19]) & M);
            iArr3[i19] = (int) j31;
            int i21 = i17 + 4;
            long j32 = (j31 >>> 32) + (j27 * j14) + (((long) iArr3[i21]) & M);
            iArr3[i21] = (int) j32;
            int i22 = i17 + 5;
            long j33 = (j32 >>> 32) + (j27 * j15) + (((long) iArr3[i22]) & M);
            iArr3[i22] = (int) j33;
            int i23 = i17 + 6;
            long j34 = (j33 >>> 32) + (j27 * j16) + (((long) iArr3[i23]) & M);
            iArr3[i23] = (int) j34;
            int i24 = i17 + 7;
            long j35 = (j34 >>> 32) + (j27 * j17) + (((long) iArr3[i24]) & M);
            iArr3[i24] = (int) j35;
            iArr3[i17 + 8] = (int) (j35 >>> 32);
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
        long j25 = (j23 >>> 32) + (j11 * j24) + j22 + (((long) iArr2[i13 + 5]) & M);
        iArr3[i14 + 5] = (int) j25;
        long j26 = ((long) iArr[i12 + 6]) & M;
        long j27 = (j25 >>> 32) + (j11 * j26) + j24 + (M & ((long) iArr2[i13 + 6]));
        iArr3[i14 + 6] = (int) j27;
        return (j27 >>> 32) + j26;
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
        return Nat.incAt(7, iArr, i12, 4);
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
        return Nat.incAt(7, iArr, i13, 3);
    }

    public static int mulAddTo(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j11 = ((long) iArr2[i12]) & M;
        long j12 = ((long) iArr2[i12 + 1]) & M;
        long j13 = ((long) iArr2[i12 + 2]) & M;
        long j14 = ((long) iArr2[i12 + 3]) & M;
        long j15 = ((long) iArr2[i12 + 4]) & M;
        long j16 = ((long) iArr2[i12 + 5]) & M;
        long j17 = ((long) iArr2[i12 + 6]) & M;
        int i14 = 0;
        int i15 = i13;
        long j18 = 0;
        while (i14 < 7) {
            int i16 = i14;
            long j19 = ((long) iArr[i11 + i14]) & M;
            long j21 = (j19 * j11) + (((long) iArr3[i15]) & M);
            long j22 = j12;
            iArr3[i15] = (int) j21;
            int i17 = i15 + 1;
            long j23 = (j21 >>> 32) + (j19 * j22) + (((long) iArr3[i17]) & M);
            iArr3[i17] = (int) j23;
            int i18 = i15 + 2;
            long j24 = (j23 >>> 32) + (j19 * j13) + (((long) iArr3[i18]) & M);
            iArr3[i18] = (int) j24;
            int i19 = i15 + 3;
            long j25 = (j24 >>> 32) + (j19 * j14) + (((long) iArr3[i19]) & M);
            iArr3[i19] = (int) j25;
            int i21 = i15 + 4;
            long j26 = (j25 >>> 32) + (j19 * j15) + (((long) iArr3[i21]) & M);
            iArr3[i21] = (int) j26;
            int i22 = i15 + 5;
            long j27 = (j26 >>> 32) + (j19 * j16) + (((long) iArr3[i22]) & M);
            iArr3[i22] = (int) j27;
            int i23 = i15 + 6;
            long j28 = (j27 >>> 32) + (j19 * j17) + (((long) iArr3[i23]) & M);
            iArr3[i23] = (int) j28;
            int i24 = i15 + 7;
            long j29 = j18 + (j28 >>> 32) + (((long) iArr3[i24]) & M);
            iArr3[i24] = (int) j29;
            j18 = j29 >>> 32;
            i14 = i16 + 1;
            i15 = i17;
            j12 = j22;
        }
        return (int) j18;
    }

    public static int mulByWord(int i11, int[] iArr) {
        long j11 = ((long) i11) & M;
        long j12 = (((long) iArr[0]) & M) * j11;
        iArr[0] = (int) j12;
        long j13 = (j12 >>> 32) + ((((long) iArr[1]) & M) * j11);
        iArr[1] = (int) j13;
        long j14 = (j13 >>> 32) + ((((long) iArr[2]) & M) * j11);
        iArr[2] = (int) j14;
        long j15 = (j14 >>> 32) + ((((long) iArr[3]) & M) * j11);
        iArr[3] = (int) j15;
        long j16 = (j15 >>> 32) + ((((long) iArr[4]) & M) * j11);
        iArr[4] = (int) j16;
        long j17 = (j16 >>> 32) + ((((long) iArr[5]) & M) * j11);
        iArr[5] = (int) j17;
        long j18 = (j17 >>> 32) + (j11 * (M & ((long) iArr[6])));
        iArr[6] = (int) j18;
        return (int) (j18 >>> 32);
    }

    public static int mulByWordAddTo(int i11, int[] iArr, int[] iArr2) {
        long j11 = ((long) i11) & M;
        long j12 = ((((long) iArr2[0]) & M) * j11) + (((long) iArr[0]) & M);
        iArr2[0] = (int) j12;
        long j13 = (j12 >>> 32) + ((((long) iArr2[1]) & M) * j11) + (((long) iArr[1]) & M);
        iArr2[1] = (int) j13;
        long j14 = (j13 >>> 32) + ((((long) iArr2[2]) & M) * j11) + (((long) iArr[2]) & M);
        iArr2[2] = (int) j14;
        long j15 = (j14 >>> 32) + ((((long) iArr2[3]) & M) * j11) + (((long) iArr[3]) & M);
        iArr2[3] = (int) j15;
        long j16 = (j15 >>> 32) + ((((long) iArr2[4]) & M) * j11) + (((long) iArr[4]) & M);
        iArr2[4] = (int) j16;
        long j17 = (j16 >>> 32) + ((((long) iArr2[5]) & M) * j11) + (((long) iArr[5]) & M);
        iArr2[5] = (int) j17;
        long j18 = (j17 >>> 32) + (j11 * (((long) iArr2[6]) & M)) + (M & ((long) iArr[6]));
        iArr2[6] = (int) j18;
        return (int) (j18 >>> 32);
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
        } while (i13 < 7);
        return (int) j12;
    }

    public static int mulWordAddTo(int i11, int[] iArr, int i12, int[] iArr2, int i13) {
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
        long j17 = (j16 >>> 32) + ((((long) iArr[i12 + 5]) & M) * j11) + (((long) iArr2[i18]) & M);
        iArr2[i18] = (int) j17;
        int i19 = i13 + 6;
        long j18 = (j17 >>> 32) + (j11 * (((long) iArr[i12 + 6]) & M)) + (((long) iArr2[i19]) & M);
        iArr2[i19] = (int) j18;
        return (int) (j18 >>> 32);
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
        return Nat.incAt(7, iArr, i12, 3);
    }

    public static void square(int[] iArr, int i11, int[] iArr2, int i12) {
        long j11 = ((long) iArr[i11]) & M;
        int i13 = 0;
        int i14 = 14;
        int i15 = 6;
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
                long j61 = j49 + (j55 * j11);
                int i36 = (int) j61;
                iArr2[i25] = (i36 << 1) | i33;
                int i37 = i36 >>> 31;
                long j62 = j52 + (j61 >>> 32) + (j55 * j16);
                long j63 = j54 + (j62 >>> 32) + (j55 * j21);
                long j64 = j62 & M;
                long j65 = j57 + (j63 >>> 32) + (j55 * j28);
                long j66 = j63 & M;
                long j67 = j59 + (j65 >>> 32) + (j55 * j41);
                long j68 = j65 & M;
                long j69 = j58 + (j67 >>> 32);
                long j71 = j67 & M;
                long j72 = ((long) iArr[i11 + 6]) & M;
                int i38 = i12 + 11;
                long j73 = (((long) iArr2[i38]) & M) + (j69 >>> 32);
                long j74 = j69 & M;
                int i39 = i12 + 12;
                long j75 = (((long) iArr2[i39]) & M) + (j73 >>> 32);
                long j76 = j73 & M;
                long j77 = j64 + (j11 * j72);
                int i41 = (int) j77;
                iArr2[i26] = (i41 << 1) | i37;
                long j78 = j66 + (j77 >>> 32) + (j72 * j16);
                long j79 = j68 + (j78 >>> 32) + (j72 * j21);
                long j81 = j71 + (j79 >>> 32) + (j72 * j28);
                long j82 = j74 + (j81 >>> 32) + (j72 * j41);
                long j83 = j76 + (j82 >>> 32) + (j72 * j55);
                long j84 = j75 + (j83 >>> 32);
                int i42 = (int) j78;
                iArr2[i29] = (i41 >>> 31) | (i42 << 1);
                int i43 = i42 >>> 31;
                int i44 = (int) j79;
                iArr2[i31] = i43 | (i44 << 1);
                int i45 = (int) j81;
                iArr2[i34] = (i45 << 1) | (i44 >>> 31);
                int i46 = (int) j82;
                iArr2[i35] = (i45 >>> 31) | (i46 << 1);
                int i47 = i46 >>> 31;
                int i48 = (int) j83;
                iArr2[i38] = i47 | (i48 << 1);
                int i49 = i48 >>> 31;
                int i51 = (int) j84;
                iArr2[i39] = i49 | (i51 << 1);
                int i52 = i51 >>> 31;
                int i53 = i12 + 13;
                iArr2[i53] = i52 | ((iArr2[i53] + ((int) (j84 >>> 32))) << 1);
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
        long j17 = (j16 >> 32) + ((((long) iArr[i11 + 6]) & M) - (((long) iArr2[i12 + 6]) & M));
        iArr3[i13 + 6] = (int) j17;
        return (int) (j17 >> 32);
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
        long j17 = (j16 >> 32) + (((((long) iArr3[6]) & M) - (((long) iArr[6]) & M)) - (((long) iArr2[6]) & M));
        iArr3[6] = (int) j17;
        return (int) (j17 >> 32);
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
        int i18 = i12 + 6;
        long j17 = (j16 >> 32) + ((((long) iArr2[i18]) & M) - (((long) iArr[i11 + 6]) & M));
        iArr2[i18] = (int) j17;
        return (int) (j17 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i11 = 0; i11 < 7; i11++) {
            int i12 = iArr[i11];
            if (i12 != 0) {
                Pack.intToBigEndian(i12, bArr, (6 - i11) << 2);
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
        iArr[6] = 0;
    }

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
        long j17 = (j16 >>> 32) + (((long) iArr[6]) & M) + (((long) iArr2[6]) & M);
        iArr3[6] = (int) j17;
        return (int) (j17 >>> 32);
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
        long j17 = (j16 >>> 32) + (((long) iArr[6]) & M) + (((long) iArr2[6]) & M) + (((long) iArr3[6]) & M);
        iArr3[6] = (int) j17;
        return (int) (j17 >>> 32);
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
        long j16 = (j15 >>> 32) + (((long) iArr[5]) & M) + (((long) iArr2[5]) & M);
        iArr2[5] = (int) j16;
        long j17 = (j16 >>> 32) + (((long) iArr[6]) & M) + (M & ((long) iArr2[6]));
        iArr2[6] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i11 = 6; i11 >= 0; i11--) {
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
        long j17 = ((long) iArr2[6]) & M;
        long j18 = ((long) iArr[0]) & M;
        long j19 = j18 * j11;
        iArr3[0] = (int) j19;
        long j21 = (j19 >>> 32) + (j18 * j12);
        iArr3[1] = (int) j21;
        long j22 = (j21 >>> 32) + (j18 * j13);
        iArr3[2] = (int) j22;
        long j23 = (j22 >>> 32) + (j18 * j14);
        iArr3[3] = (int) j23;
        long j24 = (j23 >>> 32) + (j18 * j15);
        iArr3[4] = (int) j24;
        long j25 = (j24 >>> 32) + (j18 * j16);
        iArr3[5] = (int) j25;
        long j26 = (j25 >>> 32) + (j18 * j17);
        iArr3[6] = (int) j26;
        iArr3[7] = (int) (j26 >>> 32);
        int i11 = 1;
        for (int i12 = 7; i11 < i12; i12 = 7) {
            long j27 = ((long) iArr[i11]) & M;
            long j28 = (j27 * j11) + (((long) iArr3[i11]) & M);
            iArr3[i11] = (int) j28;
            int i13 = i11 + 1;
            long j29 = j15;
            long j31 = (j28 >>> 32) + (j27 * j12) + (((long) iArr3[i13]) & M);
            iArr3[i13] = (int) j31;
            int i14 = i11 + 2;
            long j32 = (j31 >>> 32) + (j27 * j13) + (((long) iArr3[i14]) & M);
            iArr3[i14] = (int) j32;
            int i15 = i11 + 3;
            long j33 = (j32 >>> 32) + (j27 * j14) + (((long) iArr3[i15]) & M);
            iArr3[i15] = (int) j33;
            int i16 = i11 + 4;
            long j34 = (j33 >>> 32) + (j27 * j29) + (((long) iArr3[i16]) & M);
            iArr3[i16] = (int) j34;
            int i17 = i11 + 5;
            long j35 = (j34 >>> 32) + (j27 * j16) + (((long) iArr3[i17]) & M);
            iArr3[i17] = (int) j35;
            int i18 = i11 + 6;
            long j36 = (j35 >>> 32) + (j27 * j17) + (((long) iArr3[i18]) & M);
            iArr3[i18] = (int) j36;
            iArr3[i11 + 7] = (int) (j36 >>> 32);
            i11 = i13;
            j15 = j29;
        }
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j11 = ((long) iArr2[0]) & M;
        long j12 = ((long) iArr2[1]) & M;
        long j13 = ((long) iArr2[2]) & M;
        long j14 = ((long) iArr2[3]) & M;
        long j15 = ((long) iArr2[4]) & M;
        long j16 = ((long) iArr2[5]) & M;
        long j17 = ((long) iArr2[6]) & M;
        long j18 = 0;
        int i11 = 0;
        while (i11 < 7) {
            long j19 = j17;
            long j21 = ((long) iArr[i11]) & M;
            long j22 = (((long) iArr3[i11]) & M) + (j21 * j11);
            iArr3[i11] = (int) j22;
            int i12 = i11 + 1;
            long j23 = (j22 >>> 32) + (j21 * j12) + (((long) iArr3[i12]) & M);
            iArr3[i12] = (int) j23;
            int i13 = i11 + 2;
            long j24 = (j23 >>> 32) + (j21 * j13) + (((long) iArr3[i13]) & M);
            int i14 = i11;
            iArr3[i13] = (int) j24;
            int i15 = i14 + 3;
            long j25 = (j24 >>> 32) + (j21 * j14) + (((long) iArr3[i15]) & M);
            iArr3[i15] = (int) j25;
            int i16 = i14 + 4;
            long j26 = (j25 >>> 32) + (j21 * j15) + (((long) iArr3[i16]) & M);
            iArr3[i16] = (int) j26;
            int i17 = i14 + 5;
            long j27 = (j26 >>> 32) + (j21 * j16) + (((long) iArr3[i17]) & M);
            iArr3[i17] = (int) j27;
            int i18 = i14 + 6;
            long j28 = (j27 >>> 32) + (j21 * j19) + (((long) iArr3[i18]) & M);
            iArr3[i18] = (int) j28;
            int i19 = i14 + 7;
            long j29 = j18 + (j28 >>> 32) + (((long) iArr3[i19]) & M);
            iArr3[i19] = (int) j29;
            j18 = j29 >>> 32;
            i11 = i12;
            j17 = j19;
        }
        return (int) j18;
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j11 = ((long) iArr[0]) & M;
        int i11 = 14;
        int i12 = 0;
        int i13 = 6;
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
                long j61 = j49 + (j55 * j11);
                int i22 = (int) j61;
                iArr2[5] = (i22 << 1) | i21;
                int i23 = i22 >>> 31;
                long j62 = j52 + (j61 >>> 32) + (j55 * j16);
                long j63 = j54 + (j62 >>> 32) + (j55 * j21);
                long j64 = j62 & M;
                long j65 = j57 + (j63 >>> 32) + (j55 * j28);
                long j66 = j63 & M;
                long j67 = j59 + (j65 >>> 32) + (j55 * j41);
                long j68 = j65 & M;
                long j69 = j58 + (j67 >>> 32);
                long j71 = j67 & M;
                long j72 = ((long) iArr[6]) & M;
                long j73 = (((long) iArr2[11]) & M) + (j69 >>> 32);
                long j74 = j69 & M;
                long j75 = (((long) iArr2[12]) & M) + (j73 >>> 32);
                long j76 = j73 & M;
                long j77 = j64 + (j11 * j72);
                int i24 = (int) j77;
                iArr2[6] = (i24 << 1) | i23;
                int i25 = i24 >>> 31;
                long j78 = j66 + (j77 >>> 32) + (j16 * j72);
                long j79 = j68 + (j78 >>> 32) + (j21 * j72);
                long j81 = j71 + (j79 >>> 32) + (j72 * j28);
                long j82 = j74 + (j81 >>> 32) + (j72 * j41);
                long j83 = j76 + (j82 >>> 32) + (j72 * j55);
                long j84 = j75 + (j83 >>> 32);
                int i26 = (int) j78;
                iArr2[7] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) j79;
                iArr2[8] = i27 | (i28 << 1);
                int i29 = i28 >>> 31;
                int i31 = (int) j81;
                iArr2[9] = i29 | (i31 << 1);
                int i32 = (int) j82;
                iArr2[10] = (i31 >>> 31) | (i32 << 1);
                int i33 = i32 >>> 31;
                int i34 = (int) j83;
                iArr2[11] = i33 | (i34 << 1);
                int i35 = i34 >>> 31;
                int i36 = (int) j84;
                iArr2[12] = i35 | (i36 << 1);
                iArr2[13] = ((iArr2[13] + ((int) (j84 >>> 32))) << 1) | (i36 >>> 31);
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
        long j17 = (j16 >> 32) + ((((long) iArr[6]) & M) - (((long) iArr2[6]) & M));
        iArr3[6] = (int) j17;
        return (int) (j17 >> 32);
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
        long j16 = (j15 >> 32) + ((((long) iArr2[5]) & M) - (((long) iArr[5]) & M));
        iArr2[5] = (int) j16;
        long j17 = (j16 >> 32) + ((((long) iArr2[6]) & M) - (M & ((long) iArr[6])));
        iArr2[6] = (int) j17;
        return (int) (j17 >> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2, int i11) {
        long j11 = (((long) i11) & M) + (((long) iArr[0]) & M) + (((long) iArr2[0]) & M);
        iArr2[0] = (int) j11;
        long j12 = (j11 >>> 32) + (((long) iArr[1]) & M) + (((long) iArr2[1]) & M);
        iArr2[1] = (int) j12;
        long j13 = (j12 >>> 32) + (((long) iArr[2]) & M) + (((long) iArr2[2]) & M);
        iArr2[2] = (int) j13;
        long j14 = (j13 >>> 32) + (((long) iArr[3]) & M) + (((long) iArr2[3]) & M);
        iArr2[3] = (int) j14;
        long j15 = (j14 >>> 32) + (((long) iArr[4]) & M) + (((long) iArr2[4]) & M);
        iArr2[4] = (int) j15;
        long j16 = (j15 >>> 32) + (((long) iArr[5]) & M) + (((long) iArr2[5]) & M);
        iArr2[5] = (int) j16;
        long j17 = (j16 >>> 32) + (((long) iArr[6]) & M) + (M & ((long) iArr2[6]));
        iArr2[6] = (int) j17;
        return (int) (j17 >>> 32);
    }
}
