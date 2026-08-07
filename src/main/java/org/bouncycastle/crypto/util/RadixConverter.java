package org.bouncycastle.crypto.util;

import java.math.BigInteger;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes9.dex */
public class RadixConverter {
    private static final int DEFAULT_POWERS_TO_CACHE = 10;
    private static final double LOG_LONG_MAX_VALUE = Math.log(9.223372036854776E18d);
    private final int digitsGroupLength;
    private final BigInteger[] digitsGroupSpacePowers;
    private final BigInteger digitsGroupSpaceSize;
    private final int radix;

    public RadixConverter(int i11) {
        this(i11, 10);
    }

    private long fromEncoding(int i11, int i12, short[] sArr) {
        long j11 = 0;
        while (i11 < i12) {
            j11 = (j11 * ((long) this.radix)) + ((long) (sArr[i11] & HPKE.aead_EXPORT_ONLY));
            i11++;
        }
        return j11;
    }

    private BigInteger[] precomputeDigitsGroupPowers(int i11, BigInteger bigInteger) {
        BigInteger[] bigIntegerArr = new BigInteger[i11];
        BigInteger bigIntegerMultiply = bigInteger;
        for (int i12 = 0; i12 < i11; i12++) {
            bigIntegerArr[i12] = bigIntegerMultiply;
            bigIntegerMultiply = bigIntegerMultiply.multiply(bigInteger);
        }
        return bigIntegerArr;
    }

    private int toEncoding(long j11, int i11, short[] sArr) {
        int i12;
        for (int i13 = 0; i13 < this.digitsGroupLength && i11 >= 0; i13++) {
            if (j11 == 0) {
                i12 = i11 - 1;
                sArr[i11] = 0;
            } else {
                i12 = i11 - 1;
                int i14 = this.radix;
                sArr[i11] = (short) (j11 % ((long) i14));
                j11 /= (long) i14;
            }
            i11 = i12;
        }
        if (j11 == 0) {
            return i11;
        }
        throw new IllegalStateException("Failed to convert decimal number");
    }

    public int getDigitsGroupLength() {
        return this.digitsGroupLength;
    }

    public int getRadix() {
        return this.radix;
    }

    public RadixConverter(int i11, int i12) {
        this.radix = i11;
        int iFloor = (int) Math.floor(LOG_LONG_MAX_VALUE / Math.log(i11));
        this.digitsGroupLength = iFloor;
        BigInteger bigIntegerPow = BigInteger.valueOf(i11).pow(iFloor);
        this.digitsGroupSpaceSize = bigIntegerPow;
        this.digitsGroupSpacePowers = precomputeDigitsGroupPowers(i12, bigIntegerPow);
    }

    public BigInteger fromEncoding(short[] sArr) {
        BigInteger bigIntegerMultiply = BigIntegers.ONE;
        int length = sArr.length;
        int i11 = length - this.digitsGroupLength;
        BigInteger bigIntegerAdd = null;
        int i12 = 0;
        while (true) {
            int i13 = this.digitsGroupLength;
            if (i11 <= (-i13)) {
                return bigIntegerAdd;
            }
            if (i11 < 0) {
                i13 += i11;
                i11 = 0;
            }
            BigInteger bigIntegerValueOf = BigInteger.valueOf(fromEncoding(i11, Math.min(i13 + i11, length), sArr));
            if (i12 == 0) {
                bigIntegerAdd = bigIntegerValueOf;
            } else {
                BigInteger[] bigIntegerArr = this.digitsGroupSpacePowers;
                bigIntegerMultiply = i12 <= bigIntegerArr.length ? bigIntegerArr[i12 - 1] : bigIntegerMultiply.multiply(this.digitsGroupSpaceSize);
                bigIntegerAdd = bigIntegerAdd.add(bigIntegerValueOf.multiply(bigIntegerMultiply));
            }
            i12++;
            i11 -= this.digitsGroupLength;
        }
    }

    public void toEncoding(BigInteger bigInteger, int i11, short[] sArr) {
        if (bigInteger.signum() < 0) {
            throw new IllegalArgumentException();
        }
        int encoding = i11 - 1;
        do {
            if (bigInteger.equals(BigInteger.ZERO)) {
                sArr[encoding] = 0;
                encoding--;
            } else {
                BigInteger[] bigIntegerArrDivideAndRemainder = bigInteger.divideAndRemainder(this.digitsGroupSpaceSize);
                BigInteger bigInteger2 = bigIntegerArrDivideAndRemainder[0];
                encoding = toEncoding(bigIntegerArrDivideAndRemainder[1].longValue(), encoding, sArr);
                bigInteger = bigInteger2;
            }
        } while (encoding >= 0);
        if (bigInteger.signum() != 0) {
            throw new IllegalArgumentException();
        }
    }
}
