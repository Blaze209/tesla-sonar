package org.spongycastle.math.raw;

import java.util.Random;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Mod {
    public static void add(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int length = iArr.length;
        if (Nat.add(length, iArr2, iArr3, iArr4) != 0) {
            Nat.subFrom(length, iArr, iArr4);
        }
    }

    private static int getTrailingZeroes(int i11) {
        int i12 = 0;
        while ((i11 & 1) == 0) {
            i11 >>>= 1;
            i12++;
        }
        return i12;
    }

    public static int inverse32(int i11) {
        int i12 = (2 - (i11 * i11)) * i11;
        int i13 = i12 * (2 - (i11 * i12));
        int i14 = i13 * (2 - (i11 * i13));
        return i14 * (2 - (i11 * i14));
    }

    private static void inversionResult(int[] iArr, int i11, int[] iArr2, int[] iArr3) {
        if (i11 < 0) {
            Nat.add(iArr.length, iArr2, iArr, iArr3);
        } else {
            System.arraycopy(iArr2, 0, iArr3, 0, iArr.length);
        }
    }

    private static int inversionStep(int[] iArr, int[] iArr2, int i11, int[] iArr3, int i12) {
        int i13;
        int length = iArr.length;
        int i14 = 0;
        while (true) {
            i13 = iArr2[0];
            if (i13 != 0) {
                break;
            }
            Nat.shiftDownWord(i11, iArr2, 0);
            i14 += 32;
        }
        int trailingZeroes = getTrailingZeroes(i13);
        if (trailingZeroes > 0) {
            Nat.shiftDownBits(i11, iArr2, trailingZeroes, 0);
            i14 += trailingZeroes;
        }
        for (int i15 = 0; i15 < i14; i15++) {
            if ((iArr3[0] & 1) != 0) {
                i12 += i12 < 0 ? Nat.addTo(length, iArr, iArr3) : Nat.subFrom(length, iArr, iArr3);
            }
            Nat.shiftDownBit(length, iArr3, i12);
        }
        return i12;
    }

    public static void invert(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        if (Nat.isZero(length, iArr2)) {
            throw new IllegalArgumentException("'x' cannot be 0");
        }
        int iInversionStep = 0;
        if (Nat.isOne(length, iArr2)) {
            System.arraycopy(iArr2, 0, iArr3, 0, length);
            return;
        }
        int[] iArrCopy = Nat.copy(length, iArr2);
        int[] iArrCreate = Nat.create(length);
        iArrCreate[0] = 1;
        int iInversionStep2 = (1 & iArrCopy[0]) == 0 ? inversionStep(iArr, iArrCopy, length, iArrCreate, 0) : 0;
        if (Nat.isOne(length, iArrCopy)) {
            inversionResult(iArr, iInversionStep2, iArrCreate, iArr3);
            return;
        }
        int[] iArrCopy2 = Nat.copy(length, iArr);
        int[] iArrCreate2 = Nat.create(length);
        int i11 = length;
        while (true) {
            int i12 = i11 - 1;
            if (iArrCopy[i12] == 0 && iArrCopy2[i12] == 0) {
                i11--;
            } else if (Nat.gte(i11, iArrCopy, iArrCopy2)) {
                Nat.subFrom(i11, iArrCopy2, iArrCopy);
                iInversionStep2 = inversionStep(iArr, iArrCopy, i11, iArrCreate, iInversionStep2 + (Nat.subFrom(length, iArrCreate2, iArrCreate) - iInversionStep));
                if (Nat.isOne(i11, iArrCopy)) {
                    inversionResult(iArr, iInversionStep2, iArrCreate, iArr3);
                    return;
                }
            } else {
                Nat.subFrom(i11, iArrCopy, iArrCopy2);
                iInversionStep = inversionStep(iArr, iArrCopy2, i11, iArrCreate2, iInversionStep + (Nat.subFrom(length, iArrCreate, iArrCreate2) - iInversionStep2));
                if (Nat.isOne(i11, iArrCopy2)) {
                    inversionResult(iArr, iInversionStep, iArrCreate2, iArr3);
                    return;
                }
            }
        }
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

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int length = iArr.length;
        if (Nat.sub(length, iArr2, iArr3, iArr4) != 0) {
            Nat.addTo(length, iArr, iArr4);
        }
    }
}
