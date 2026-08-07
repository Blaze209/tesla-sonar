package org.bouncycastle.math.raw;

import java.util.Random;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Mod {
    private static final int M30 = 1073741823;
    private static final long M32L = 4294967295L;

    private static int add30(int i11, int[] iArr, int[] iArr2) {
        int i12 = i11 - 1;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = i13 + iArr[i14] + iArr2[i14];
            iArr[i14] = 1073741823 & i15;
            i13 = i15 >> 30;
        }
        int i16 = i13 + iArr[i12] + iArr2[i12];
        iArr[i12] = i16;
        return i16 >> 30;
    }

    public static void checkedModOddInverse(int[] iArr, int[] iArr2, int[] iArr3) {
        if (modOddInverse(iArr, iArr2, iArr3) == 0) {
            throw new ArithmeticException("Inverse does not exist.");
        }
    }

    public static void checkedModOddInverseVar(int[] iArr, int[] iArr2, int[] iArr3) {
        if (!modOddInverseVar(iArr, iArr2, iArr3)) {
            throw new ArithmeticException("Inverse does not exist.");
        }
    }

    private static void cnegate30(int i11, int i12, int[] iArr) {
        int i13 = i11 - 1;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            int i16 = i14 + ((iArr[i15] ^ i12) - i12);
            iArr[i15] = 1073741823 & i16;
            i14 = i16 >> 30;
        }
        iArr[i13] = i14 + ((iArr[i13] ^ i12) - i12);
    }

    private static void cnormalize30(int i11, int i12, int[] iArr, int[] iArr2) {
        int i13 = i11 - 1;
        int i14 = iArr[i13] >> 31;
        int i15 = 0;
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = i15 + (((iArr[i16] + (iArr2[i16] & i14)) ^ i12) - i12);
            iArr[i16] = 1073741823 & i17;
            i15 = i17 >> 30;
        }
        int i18 = i15 + (((iArr[i13] + (i14 & iArr2[i13])) ^ i12) - i12);
        iArr[i13] = i18;
        int i19 = i18 >> 31;
        int i21 = 0;
        for (int i22 = 0; i22 < i13; i22++) {
            int i23 = i21 + iArr[i22] + (iArr2[i22] & i19);
            iArr[i22] = i23 & 1073741823;
            i21 = i23 >> 30;
        }
        iArr[i13] = i21 + iArr[i13] + (i19 & iArr2[i13]);
    }

    private static void decode30(int i11, int[] iArr, int[] iArr2) {
        int i12 = 0;
        long j11 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 > 0) {
            while (i12 < Math.min(32, i11)) {
                j11 |= ((long) iArr[i13]) << i12;
                i12 += 30;
                i13++;
            }
            iArr2[i14] = (int) j11;
            j11 >>>= 32;
            i12 -= 32;
            i11 -= 32;
            i14++;
        }
    }

    private static int divsteps30Var(int i11, int i12, int i13, int[] iArr) {
        int i14;
        int i15 = 30;
        int i16 = 1;
        int i17 = 1;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            int iNumberOfTrailingZeros = Integers.numberOfTrailingZeros(((-1) << i15) | i13);
            int i21 = i13 >> iNumberOfTrailingZeros;
            i16 <<= iNumberOfTrailingZeros;
            i18 <<= iNumberOfTrailingZeros;
            i11 -= iNumberOfTrailingZeros;
            i15 -= iNumberOfTrailingZeros;
            if (i15 <= 0) {
                iArr[0] = i16;
                iArr[1] = i18;
                iArr[2] = i19;
                iArr[3] = i17;
                return i11;
            }
            if (i11 <= 0) {
                i11 = 2 - i11;
                int i22 = -i12;
                int i23 = -i16;
                int i24 = -i18;
                i14 = ((-1) >>> (32 - (i11 > i15 ? i15 : i11))) & 63 & (i21 * i22 * ((i21 * i21) - 2));
                i21 = i22;
                i12 = i21;
                int i25 = i19;
                i19 = i23;
                i16 = i25;
                int i26 = i17;
                i17 = i24;
                i18 = i26;
            } else {
                i14 = ((-1) >>> (32 - (i11 > i15 ? i15 : i11))) & 15 & (((((i12 + 1) & 4) << 1) + i12) * (-i21));
            }
            i13 = i21 + (i12 * i14);
            i19 += i16 * i14;
            i17 += i14 * i18;
        }
    }

    private static void encode30(int i11, int[] iArr, int[] iArr2) {
        int i12 = 0;
        long j11 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 > 0) {
            if (i12 < Math.min(30, i11)) {
                j11 |= (((long) iArr[i13]) & M32L) << i12;
                i12 += 32;
                i13++;
            }
            iArr2[i14] = ((int) j11) & 1073741823;
            j11 >>>= 30;
            i12 -= 30;
            i11 -= 30;
            i14++;
        }
    }

    private static int equalTo(int i11, int[] iArr, int i12) {
        int i13 = i12 ^ iArr[0];
        for (int i14 = 1; i14 < i11; i14++) {
            i13 |= iArr[i14];
        }
        return (((i13 >>> 1) | (i13 & 1)) - 1) >> 31;
    }

    private static boolean equalToVar(int i11, int[] iArr, int i12) {
        int i13 = i12 ^ iArr[0];
        if (i13 != 0) {
            return false;
        }
        for (int i14 = 1; i14 < i11; i14++) {
            i13 |= iArr[i14];
        }
        return i13 == 0;
    }

    private static int getMaximumDivsteps(int i11) {
        return (int) (((((long) i11) * 188898) + ((long) (i11 < 46 ? 308405 : 181188))) >>> 16);
    }

    private static int getMaximumHDDivsteps(int i11) {
        return (int) (((((long) i11) * 150964) + 99243) >>> 16);
    }

    private static int hddivsteps30(int i11, int i12, int i13, int[] iArr) {
        int i14 = 1073741824;
        int i15 = 1073741824;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < 30; i18++) {
            int i19 = i11 >> 31;
            int i21 = -(i13 & 1);
            int i22 = i13 - ((i12 ^ i19) & i21);
            int i23 = i17 - ((i14 ^ i19) & i21);
            int i24 = i15 - ((i16 ^ i19) & i21);
            int i25 = (~i19) & i21;
            i11 = (i11 ^ i25) + 1;
            i12 += i22 & i25;
            i14 += i23 & i25;
            i16 += i25 & i24;
            i13 = i22 >> 1;
            i17 = i23 >> 1;
            i15 = i24 >> 1;
        }
        iArr[0] = i14;
        iArr[1] = i16;
        iArr[2] = i17;
        iArr[3] = i15;
        return i11;
    }

    public static int inverse32(int i11) {
        int i12 = (2 - (i11 * i11)) * i11;
        int i13 = i12 * (2 - (i11 * i12));
        int i14 = i13 * (2 - (i11 * i13));
        return i14 * (2 - (i11 * i14));
    }

    public static int modOddInverse(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        int iNumberOfLeadingZeros = (length << 5) - Integers.numberOfLeadingZeros(iArr[length - 1]);
        int i11 = (iNumberOfLeadingZeros + 29) / 30;
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i11];
        int[] iArr6 = new int[i11];
        int[] iArr7 = new int[i11];
        int[] iArr8 = new int[i11];
        int[] iArr9 = new int[i11];
        iArr6[0] = 1;
        encode30(iNumberOfLeadingZeros, iArr2, iArr8);
        encode30(iNumberOfLeadingZeros, iArr, iArr9);
        System.arraycopy(iArr9, 0, iArr7, 0, i11);
        int iInverse32 = inverse32(iArr9[0]);
        int maximumHDDivsteps = getMaximumHDDivsteps(iNumberOfLeadingZeros);
        int iHddivsteps30 = 0;
        for (int i12 = 0; i12 < maximumHDDivsteps; i12 += 30) {
            iHddivsteps30 = hddivsteps30(iHddivsteps30, iArr7[0], iArr8[0], iArr4);
            updateDE30(i11, iArr5, iArr6, iArr4, iInverse32, iArr9);
            updateFG30(i11, iArr7, iArr8, iArr4);
        }
        int i13 = iArr7[i11 - 1] >> 31;
        cnegate30(i11, i13, iArr7);
        cnormalize30(i11, i13, iArr5, iArr9);
        decode30(iNumberOfLeadingZeros, iArr5, iArr3);
        return equalTo(i11, iArr7, 1) & equalTo(i11, iArr8, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r16v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    public static boolean modOddInverseVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        int iNumberOfLeadingZeros = (length << 5) - Integers.numberOfLeadingZeros(iArr[length - 1]);
        int i11 = (iNumberOfLeadingZeros + 29) / 30;
        int bitLength = iNumberOfLeadingZeros - Nat.getBitLength(length, iArr2);
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i11];
        int[] iArr6 = new int[i11];
        int[] iArr7 = new int[i11];
        int[] iArr8 = new int[i11];
        int[] iArr9 = new int[i11];
        ?? r12 = 0;
        iArr6[0] = 1;
        encode30(iNumberOfLeadingZeros, iArr2, iArr8);
        encode30(iNumberOfLeadingZeros, iArr, iArr9);
        System.arraycopy(iArr9, 0, iArr7, 0, i11);
        int iDivsteps30Var = -bitLength;
        int iInverse32 = inverse32(iArr9[0]);
        int maximumDivsteps = getMaximumDivsteps(iNumberOfLeadingZeros);
        int iTrimFG30 = i11;
        while (!equalToVar(iTrimFG30, iArr8, r12)) {
            if (bitLength >= maximumDivsteps) {
                return r12;
            }
            bitLength += 30;
            ?? r16 = r12;
            iDivsteps30Var = divsteps30Var(iDivsteps30Var, iArr7[r12], iArr8[r16 == true ? 1 : 0], iArr4);
            updateDE30(i11, iArr5, iArr6, iArr4, iInverse32, iArr9);
            updateFG30(iTrimFG30, iArr7, iArr8, iArr4);
            iTrimFG30 = trimFG30(iTrimFG30, iArr7, iArr8);
            r12 = r16 == true ? 1 : 0;
        }
        ?? r17 = r12;
        int i12 = iArr7[iTrimFG30 - 1] >> 31;
        int iNegate30 = iArr5[i11 - 1] >> 31;
        if (iNegate30 < 0) {
            iNegate30 = add30(i11, iArr5, iArr9);
        }
        if (i12 < 0) {
            iNegate30 = negate30(i11, iArr5);
            negate30(iTrimFG30, iArr7);
        }
        if (!equalToVar(iTrimFG30, iArr7, 1)) {
            return r17;
        }
        if (iNegate30 < 0) {
            add30(i11, iArr5, iArr9);
        }
        decode30(iNumberOfLeadingZeros, iArr5, iArr3);
        return true;
    }

    public static int modOddIsCoprime(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int iNumberOfLeadingZeros = (length << 5) - Integers.numberOfLeadingZeros(iArr[length - 1]);
        int i11 = (iNumberOfLeadingZeros + 29) / 30;
        int[] iArr3 = new int[4];
        int[] iArr4 = new int[i11];
        int[] iArr5 = new int[i11];
        int[] iArr6 = new int[i11];
        encode30(iNumberOfLeadingZeros, iArr2, iArr5);
        encode30(iNumberOfLeadingZeros, iArr, iArr6);
        System.arraycopy(iArr6, 0, iArr4, 0, i11);
        int maximumHDDivsteps = getMaximumHDDivsteps(iNumberOfLeadingZeros);
        int iHddivsteps30 = 0;
        for (int i12 = 0; i12 < maximumHDDivsteps; i12 += 30) {
            iHddivsteps30 = hddivsteps30(iHddivsteps30, iArr4[0], iArr5[0], iArr3);
            updateFG30(i11, iArr4, iArr5, iArr3);
        }
        cnegate30(i11, iArr4[i11 - 1] >> 31, iArr4);
        return equalTo(i11, iArr5, 0) & equalTo(i11, iArr4, 1);
    }

    public static boolean modOddIsCoprimeVar(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int iNumberOfLeadingZeros = (length << 5) - Integers.numberOfLeadingZeros(iArr[length - 1]);
        int iTrimFG30 = (iNumberOfLeadingZeros + 29) / 30;
        int bitLength = iNumberOfLeadingZeros - Nat.getBitLength(length, iArr2);
        int[] iArr3 = new int[4];
        int[] iArr4 = new int[iTrimFG30];
        int[] iArr5 = new int[iTrimFG30];
        int[] iArr6 = new int[iTrimFG30];
        encode30(iNumberOfLeadingZeros, iArr2, iArr5);
        encode30(iNumberOfLeadingZeros, iArr, iArr6);
        System.arraycopy(iArr6, 0, iArr4, 0, iTrimFG30);
        int iDivsteps30Var = -bitLength;
        int maximumDivsteps = getMaximumDivsteps(iNumberOfLeadingZeros);
        while (!equalToVar(iTrimFG30, iArr5, 0)) {
            if (bitLength >= maximumDivsteps) {
                return false;
            }
            bitLength += 30;
            iDivsteps30Var = divsteps30Var(iDivsteps30Var, iArr4[0], iArr5[0], iArr3);
            updateFG30(iTrimFG30, iArr4, iArr5, iArr3);
            iTrimFG30 = trimFG30(iTrimFG30, iArr4, iArr5);
        }
        if ((iArr4[iTrimFG30 - 1] >> 31) < 0) {
            negate30(iTrimFG30, iArr4);
        }
        return equalToVar(iTrimFG30, iArr4, 1);
    }

    private static int negate30(int i11, int[] iArr) {
        int i12 = i11 - 1;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = i13 - iArr[i14];
            iArr[i14] = 1073741823 & i15;
            i13 = i15 >> 30;
        }
        int i16 = i13 - iArr[i12];
        iArr[i12] = i16;
        return i16 >> 30;
    }

    public static int[] random(int[] iArr) {
        int length = iArr.length;
        Random random = new Random();
        int[] iArrCreate = Nat.create(length);
        int i11 = length - 1;
        int i12 = iArr[i11];
        int i13 = i12 | (i12 >>> 1);
        int i14 = i13 | (i13 >>> 2);
        int i15 = i14 | (i14 >>> 4);
        int i16 = i15 | (i15 >>> 8);
        int i17 = i16 | (i16 >>> 16);
        do {
            for (int i18 = 0; i18 != length; i18++) {
                iArrCreate[i18] = random.nextInt();
            }
            iArrCreate[i11] = iArrCreate[i11] & i17;
        } while (Nat.gte(length, iArrCreate, iArr));
        return iArrCreate;
    }

    private static int trimFG30(int i11, int[] iArr, int[] iArr2) {
        int i12 = i11 - 1;
        int i13 = iArr[i12];
        int i14 = iArr2[i12];
        int i15 = i11 - 2;
        if (((i15 >> 31) | ((i13 >> 31) ^ i13) | ((i14 >> 31) ^ i14)) != 0) {
            return i11;
        }
        iArr[i15] = (i13 << 30) | iArr[i15];
        iArr2[i15] = iArr2[i15] | (i14 << 30);
        return i11 - 1;
    }

    private static void updateDE30(int i11, int[] iArr, int[] iArr2, int[] iArr3, int i12, int[] iArr4) {
        int i13 = i11;
        int i14 = iArr3[0];
        int i15 = iArr3[1];
        int i16 = iArr3[2];
        int i17 = iArr3[3];
        int i18 = i13 - 1;
        int i19 = iArr[i18] >> 31;
        int i21 = iArr2[i18] >> 31;
        int i22 = (i14 & i19) + (i15 & i21);
        int i23 = (i19 & i16) + (i21 & i17);
        int i24 = iArr4[0];
        long j11 = i14;
        long j12 = iArr[0];
        long j13 = i15;
        long j14 = iArr2[0];
        long j15 = (j11 * j12) + (j13 * j14);
        long j16 = i16;
        long j17 = i17;
        long j18 = (j12 * j16) + (j17 * j14);
        int i25 = i22 - (((((int) j15) * i12) + i22) & 1073741823);
        long j19 = i24;
        long j21 = i25;
        long j22 = j15 + (j19 * j21);
        long j23 = i23 - (((((int) j18) * i12) + i23) & 1073741823);
        long j24 = (j18 + (j19 * j23)) >> 30;
        int i26 = 1;
        long j25 = j22 >> 30;
        while (i26 < i13) {
            int i27 = iArr4[i26];
            long j26 = j23;
            long j27 = j16;
            long j28 = iArr[i26];
            long j29 = iArr2[i26];
            long j31 = (j11 * j28) + (j13 * j29);
            long j32 = i27;
            long j33 = j25 + j31 + (j32 * j21);
            long j34 = j24 + (j27 * j28) + (j17 * j29) + (j32 * j26);
            int i28 = i26 - 1;
            iArr[i28] = ((int) j33) & 1073741823;
            j25 = j33 >> 30;
            iArr2[i28] = ((int) j34) & 1073741823;
            j24 = j34 >> 30;
            i26++;
            i13 = i11;
            j23 = j26;
            j16 = j27;
        }
        iArr[i18] = (int) j25;
        iArr2[i18] = (int) j24;
    }

    private static void updateFG30(int i11, int[] iArr, int[] iArr2, int[] iArr3) {
        int i12 = iArr3[0];
        boolean z11 = true;
        int i13 = iArr3[1];
        int i14 = iArr3[2];
        int i15 = iArr3[3];
        long j11 = i12;
        long j12 = iArr[0];
        long j13 = i13;
        long j14 = iArr2[0];
        long j15 = (j11 * j12) + (j13 * j14);
        long j16 = i14;
        long j17 = i15;
        long j18 = (j12 * j16) + (j14 * j17);
        char c11 = 30;
        long j19 = j15 >> 30;
        long j21 = j18 >> 30;
        int i16 = 1;
        while (i16 < i11) {
            char c12 = c11;
            long j22 = iArr[i16];
            long j23 = j11 * j22;
            long j24 = iArr2[i16];
            long j25 = j19 + j23 + (j13 * j24);
            long j26 = j21 + (j16 * j22) + (j24 * j17);
            int i17 = i16 - 1;
            iArr[i17] = ((int) j25) & 1073741823;
            j19 = j25 >> c12;
            iArr2[i17] = ((int) j26) & 1073741823;
            j21 = j26 >> c12;
            i16++;
            c11 = c12;
            z11 = z11;
        }
        int i18 = i11 - 1;
        iArr[i18] = (int) j19;
        iArr2[i18] = (int) j21;
    }
}
