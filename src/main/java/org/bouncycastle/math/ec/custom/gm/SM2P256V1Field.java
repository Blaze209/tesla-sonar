package org.bouncycastle.math.ec.custom.gm;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes10.dex */
public class SM2P256V1Field {
    private static final long M = 4294967295L;
    private static final int P7s1 = Integer.MAX_VALUE;
    private static final int PExt15s1 = Integer.MAX_VALUE;
    static final int[] P = {-1, -1, 0, -1, -1, -1, -1, -2};
    private static final int[] PExt = {1, 0, -2, 1, 1, -2, 0, 2, -2, -3, 3, -2, -1, -1, 0, -2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.add(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= Integer.MAX_VALUE && Nat256.gte(iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(16, iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && Nat.gte(16, iArr3, PExt))) {
            Nat.subFrom(16, PExt, iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(8, iArr, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && Nat256.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j11 = (((long) iArr[0]) & M) + 1;
        iArr[0] = (int) j11;
        long j12 = j11 >> 32;
        if (j12 != 0) {
            long j13 = j12 + (((long) iArr[1]) & M);
            iArr[1] = (int) j13;
            j12 = j13 >> 32;
        }
        long j14 = j12 + ((((long) iArr[2]) & M) - 1);
        iArr[2] = (int) j14;
        long j15 = (j14 >> 32) + (((long) iArr[3]) & M) + 1;
        iArr[3] = (int) j15;
        long j16 = j15 >> 32;
        if (j16 != 0) {
            long j17 = j16 + (((long) iArr[4]) & M);
            iArr[4] = (int) j17;
            long j18 = (j17 >> 32) + (((long) iArr[5]) & M);
            iArr[5] = (int) j18;
            long j19 = (j18 >> 32) + (((long) iArr[6]) & M);
            iArr[6] = (int) j19;
            j16 = j19 >> 32;
        }
        iArr[7] = (int) (j16 + (M & ((long) iArr[7])) + 1);
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat256.fromBigInteger(bigInteger);
        if ((iArrFromBigInteger[7] >>> 1) >= Integer.MAX_VALUE) {
            int[] iArr = P;
            if (Nat256.gte(iArrFromBigInteger, iArr)) {
                Nat256.subFrom(iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(8, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(8, iArr2, Nat256.add(iArr, P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 8; i12++) {
            i11 |= iArr[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.mulAddTo(iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && Nat.gte(16, iArr3, PExt))) {
            Nat.subFrom(16, PExt, iArr3);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat256.sub(P, iArr, iArr2);
        } else {
            int[] iArr3 = P;
            Nat256.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[32];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 8);
        } while (Nat.lessThan(8, iArr, P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j11 = ((long) iArr[8]) & M;
        long j12 = ((long) iArr[9]) & M;
        long j13 = ((long) iArr[10]) & M;
        long j14 = ((long) iArr[11]) & M;
        long j15 = ((long) iArr[12]) & M;
        long j16 = ((long) iArr[13]) & M;
        long j17 = ((long) iArr[14]) & M;
        long j18 = ((long) iArr[15]) & M;
        long j19 = j13 + j14;
        long j21 = j16 + j17;
        long j22 = j21 + (j18 << 1);
        long j23 = j11 + j12 + j21;
        long j24 = j19 + j15 + j18 + j23;
        long j25 = (((long) iArr[0]) & M) + j24 + j16 + j17 + j18;
        iArr2[0] = (int) j25;
        long j26 = (j25 >> 32) + (((((long) iArr[1]) & M) + j24) - j11) + j17 + j18;
        iArr2[1] = (int) j26;
        long j27 = (j26 >> 32) + ((((long) iArr[2]) & M) - j23);
        iArr2[2] = (int) j27;
        long j28 = (j27 >> 32) + ((((((long) iArr[3]) & M) + j24) - j12) - j13) + j16;
        iArr2[3] = (int) j28;
        long j29 = (j28 >> 32) + ((((((long) iArr[4]) & M) + j24) - j19) - j11) + j17;
        iArr2[4] = (int) j29;
        long j31 = (j29 >> 32) + (((long) iArr[5]) & M) + j22 + j13;
        iArr2[5] = (int) j31;
        long j32 = (j31 >> 32) + (((long) iArr[6]) & M) + j14 + j17 + j18;
        iArr2[6] = (int) j32;
        long j33 = (j32 >> 32) + (((long) iArr[7]) & M) + j24 + j22 + j15;
        iArr2[7] = (int) j33;
        reduce32((int) (j33 >> 32), iArr2);
    }

    public static void reduce32(int i11, int[] iArr) {
        long j11;
        if (i11 != 0) {
            long j12 = ((long) i11) & M;
            long j13 = (((long) iArr[0]) & M) + j12;
            iArr[0] = (int) j13;
            long j14 = j13 >> 32;
            if (j14 != 0) {
                long j15 = j14 + (((long) iArr[1]) & M);
                iArr[1] = (int) j15;
                j14 = j15 >> 32;
            }
            long j16 = j14 + ((((long) iArr[2]) & M) - j12);
            iArr[2] = (int) j16;
            long j17 = (j16 >> 32) + (((long) iArr[3]) & M) + j12;
            iArr[3] = (int) j17;
            long j18 = j17 >> 32;
            if (j18 != 0) {
                long j19 = j18 + (((long) iArr[4]) & M);
                iArr[4] = (int) j19;
                long j21 = (j19 >> 32) + (((long) iArr[5]) & M);
                iArr[5] = (int) j21;
                long j22 = (j21 >> 32) + (((long) iArr[6]) & M);
                iArr[6] = (int) j22;
                j18 = j22 >> 32;
            }
            long j23 = j18 + (M & ((long) iArr[7])) + j12;
            iArr[7] = (int) j23;
            j11 = j23 >> 32;
        } else {
            j11 = 0;
        }
        if (j11 != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && Nat256.gte(iArr, P))) {
            addPInvTo(iArr);
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
    }

    public static void squareN(int[] iArr, int i11, int[] iArr2) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.square(iArr, iArrCreateExt);
        while (true) {
            reduce(iArrCreateExt, iArr2);
            i11--;
            if (i11 <= 0) {
                return;
            } else {
                Nat256.square(iArr2, iArrCreateExt);
            }
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j11 = (((long) iArr[0]) & M) - 1;
        iArr[0] = (int) j11;
        long j12 = j11 >> 32;
        if (j12 != 0) {
            long j13 = j12 + (((long) iArr[1]) & M);
            iArr[1] = (int) j13;
            j12 = j13 >> 32;
        }
        long j14 = j12 + (((long) iArr[2]) & M) + 1;
        iArr[2] = (int) j14;
        long j15 = (j14 >> 32) + ((((long) iArr[3]) & M) - 1);
        iArr[3] = (int) j15;
        long j16 = j15 >> 32;
        if (j16 != 0) {
            long j17 = j16 + (((long) iArr[4]) & M);
            iArr[4] = (int) j17;
            long j18 = (j17 >> 32) + (((long) iArr[5]) & M);
            iArr[5] = (int) j18;
            long j19 = (j18 >> 32) + (((long) iArr[6]) & M);
            iArr[6] = (int) j19;
            j16 = j19 >> 32;
        }
        iArr[7] = (int) (j16 + ((M & ((long) iArr[7])) - 1));
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(16, iArr, iArr2, iArr3) != 0) {
            Nat.addTo(16, PExt, iArr3);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(8, iArr, 0, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && Nat256.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }
}
