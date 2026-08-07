package org.spongycastle.math;

import com.plaid.internal.EnumC4419g;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.Digest;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Primes {
    public static final int SMALL_FACTOR_LIMIT = 211;
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private static final BigInteger THREE = BigInteger.valueOf(3);

    public static class MROutput {
        private BigInteger factor;
        private boolean provablyComposite;

        private MROutput(boolean z11, BigInteger bigInteger) {
            this.provablyComposite = z11;
            this.factor = bigInteger;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static MROutput probablyPrime() {
            return new MROutput(false, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static MROutput provablyCompositeNotPrimePower() {
            return new MROutput(true, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static MROutput provablyCompositeWithFactor(BigInteger bigInteger) {
            return new MROutput(true, bigInteger);
        }

        public BigInteger getFactor() {
            return this.factor;
        }

        public boolean isNotPrimePower() {
            return this.provablyComposite && this.factor == null;
        }

        public boolean isProvablyComposite() {
            return this.provablyComposite;
        }
    }

    public static class STOutput {
        private BigInteger prime;
        private int primeGenCounter;
        private byte[] primeSeed;

        public BigInteger getPrime() {
            return this.prime;
        }

        public int getPrimeGenCounter() {
            return this.primeGenCounter;
        }

        public byte[] getPrimeSeed() {
            return this.primeSeed;
        }

        private STOutput(BigInteger bigInteger, byte[] bArr, int i11) {
            this.prime = bigInteger;
            this.primeSeed = bArr;
            this.primeGenCounter = i11;
        }
    }

    private static void checkCandidate(BigInteger bigInteger, String str) {
        if (bigInteger == null || bigInteger.signum() < 1 || bigInteger.bitLength() < 2) {
            throw new IllegalArgumentException("'" + str + "' must be non-null and >= 2");
        }
    }

    public static MROutput enhancedMRProbablePrimeTest(BigInteger bigInteger, SecureRandom secureRandom, int i11) {
        boolean z11;
        BigInteger bigIntegerModPow;
        checkCandidate(bigInteger, "candidate");
        if (secureRandom == null) {
            throw new IllegalArgumentException("'random' cannot be null");
        }
        if (i11 < 1) {
            throw new IllegalArgumentException("'iterations' must be > 0");
        }
        if (bigInteger.bitLength() == 2) {
            return MROutput.probablyPrime();
        }
        if (!bigInteger.testBit(0)) {
            return MROutput.provablyCompositeWithFactor(TWO);
        }
        BigInteger bigIntegerSubtract = bigInteger.subtract(ONE);
        BigInteger bigIntegerSubtract2 = bigInteger.subtract(TWO);
        int lowestSetBit = bigIntegerSubtract.getLowestSetBit();
        BigInteger bigIntegerShiftRight = bigIntegerSubtract.shiftRight(lowestSetBit);
        for (int i12 = 0; i12 < i11; i12++) {
            BigInteger bigIntegerCreateRandomInRange = BigIntegers.createRandomInRange(TWO, bigIntegerSubtract2, secureRandom);
            BigInteger bigIntegerGcd = bigIntegerCreateRandomInRange.gcd(bigInteger);
            BigInteger bigInteger2 = ONE;
            if (bigIntegerGcd.compareTo(bigInteger2) > 0) {
                return MROutput.provablyCompositeWithFactor(bigIntegerGcd);
            }
            BigInteger bigIntegerModPow2 = bigIntegerCreateRandomInRange.modPow(bigIntegerShiftRight, bigInteger);
            if (!bigIntegerModPow2.equals(bigInteger2) && !bigIntegerModPow2.equals(bigIntegerSubtract)) {
                int i13 = 1;
                while (true) {
                    if (i13 >= lowestSetBit) {
                        z11 = false;
                        bigIntegerModPow = bigIntegerModPow2;
                        break;
                    }
                    bigIntegerModPow = bigIntegerModPow2.modPow(TWO, bigInteger);
                    if (bigIntegerModPow.equals(bigIntegerSubtract)) {
                        z11 = true;
                        break;
                    }
                    if (bigIntegerModPow.equals(ONE)) {
                        z11 = false;
                        break;
                    }
                    i13++;
                    bigIntegerModPow2 = bigIntegerModPow;
                }
                if (!z11) {
                    BigInteger bigInteger3 = ONE;
                    if (!bigIntegerModPow.equals(bigInteger3)) {
                        bigIntegerModPow2 = bigIntegerModPow.modPow(TWO, bigInteger);
                        if (bigIntegerModPow2.equals(bigInteger3)) {
                            bigIntegerModPow2 = bigIntegerModPow;
                        }
                    }
                    BigInteger bigIntegerGcd2 = bigIntegerModPow2.subtract(bigInteger3).gcd(bigInteger);
                    return bigIntegerGcd2.compareTo(bigInteger3) > 0 ? MROutput.provablyCompositeWithFactor(bigIntegerGcd2) : MROutput.provablyCompositeNotPrimePower();
                }
            }
        }
        return MROutput.probablyPrime();
    }

    private static int extract32(byte[] bArr) {
        int iMin = Math.min(4, bArr.length);
        int i11 = 0;
        int i12 = 0;
        while (i11 < iMin) {
            int i13 = i11 + 1;
            i12 |= (bArr[bArr.length - i13] & 255) << (i11 * 8);
            i11 = i13;
        }
        return i12;
    }

    public static STOutput generateSTRandomPrime(Digest digest, int i11, byte[] bArr) {
        if (digest == null) {
            throw new IllegalArgumentException("'hash' cannot be null");
        }
        if (i11 < 2) {
            throw new IllegalArgumentException("'length' must be >= 2");
        }
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("'inputSeed' cannot be null or empty");
        }
        return implSTRandomPrime(digest, i11, Arrays.clone(bArr));
    }

    public static boolean hasAnySmallFactors(BigInteger bigInteger) {
        checkCandidate(bigInteger, "candidate");
        return implHasAnySmallFactors(bigInteger);
    }

    private static void hash(Digest digest, byte[] bArr, byte[] bArr2, int i11) {
        digest.update(bArr, 0, bArr.length);
        digest.doFinal(bArr2, i11);
    }

    private static BigInteger hashGen(Digest digest, byte[] bArr, int i11) {
        int digestSize = digest.getDigestSize();
        int i12 = i11 * digestSize;
        byte[] bArr2 = new byte[i12];
        for (int i13 = 0; i13 < i11; i13++) {
            i12 -= digestSize;
            hash(digest, bArr, bArr2, i12);
            inc(bArr, 1);
        }
        return new BigInteger(1, bArr2);
    }

    private static boolean implHasAnySmallFactors(BigInteger bigInteger) {
        int iIntValue = bigInteger.mod(BigInteger.valueOf(223092870)).intValue();
        if (iIntValue % 2 != 0 && iIntValue % 3 != 0 && iIntValue % 5 != 0 && iIntValue % 7 != 0 && iIntValue % 11 != 0 && iIntValue % 13 != 0 && iIntValue % 17 != 0 && iIntValue % 19 != 0 && iIntValue % 23 != 0) {
            int iIntValue2 = bigInteger.mod(BigInteger.valueOf(58642669)).intValue();
            if (iIntValue2 % 29 != 0 && iIntValue2 % 31 != 0 && iIntValue2 % 37 != 0 && iIntValue2 % 41 != 0 && iIntValue2 % 43 != 0) {
                int iIntValue3 = bigInteger.mod(BigInteger.valueOf(600662303)).intValue();
                if (iIntValue3 % 47 != 0 && iIntValue3 % 53 != 0 && iIntValue3 % 59 != 0 && iIntValue3 % 61 != 0 && iIntValue3 % 67 != 0) {
                    int iIntValue4 = bigInteger.mod(BigInteger.valueOf(33984931)).intValue();
                    if (iIntValue4 % 71 != 0 && iIntValue4 % 73 != 0 && iIntValue4 % 79 != 0 && iIntValue4 % 83 != 0) {
                        int iIntValue5 = bigInteger.mod(BigInteger.valueOf(89809099)).intValue();
                        if (iIntValue5 % 89 != 0 && iIntValue5 % 97 != 0 && iIntValue5 % 101 != 0 && iIntValue5 % 103 != 0) {
                            int iIntValue6 = bigInteger.mod(BigInteger.valueOf(167375713)).intValue();
                            if (iIntValue6 % 107 != 0 && iIntValue6 % 109 != 0 && iIntValue6 % 113 != 0 && iIntValue6 % 127 != 0) {
                                int iIntValue7 = bigInteger.mod(BigInteger.valueOf(371700317)).intValue();
                                if (iIntValue7 % 131 != 0 && iIntValue7 % 137 != 0 && iIntValue7 % 139 != 0 && iIntValue7 % 149 != 0) {
                                    int iIntValue8 = bigInteger.mod(BigInteger.valueOf(645328247)).intValue();
                                    if (iIntValue8 % 151 != 0 && iIntValue8 % 157 != 0 && iIntValue8 % 163 != 0 && iIntValue8 % 167 != 0) {
                                        int iIntValue9 = bigInteger.mod(BigInteger.valueOf(1070560157)).intValue();
                                        if (iIntValue9 % 173 != 0 && iIntValue9 % 179 != 0 && iIntValue9 % 181 != 0 && iIntValue9 % 191 != 0) {
                                            int iIntValue10 = bigInteger.mod(BigInteger.valueOf(1596463769)).intValue();
                                            if (iIntValue10 % 193 != 0 && iIntValue10 % 197 != 0 && iIntValue10 % EnumC4419g.SDK_ASSET_ICON_CANCEL_VALUE != 0 && iIntValue10 % 211 != 0) {
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    private static boolean implMRProbablePrimeToBase(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i11, BigInteger bigInteger4) {
        BigInteger bigIntegerModPow = bigInteger4.modPow(bigInteger3, bigInteger);
        if (bigIntegerModPow.equals(ONE) || bigIntegerModPow.equals(bigInteger2)) {
            return true;
        }
        for (int i12 = 1; i12 < i11; i12++) {
            bigIntegerModPow = bigIntegerModPow.modPow(TWO, bigInteger);
            if (bigIntegerModPow.equals(bigInteger2)) {
                return true;
            }
            if (bigIntegerModPow.equals(ONE)) {
                return false;
            }
        }
        return false;
    }

    private static STOutput implSTRandomPrime(Digest digest, int i11, byte[] bArr) {
        AnonymousClass1 anonymousClass1;
        int digestSize = digest.getDigestSize();
        AnonymousClass1 anonymousClass2 = null;
        int i12 = 1;
        if (i11 < 33) {
            byte[] bArr2 = new byte[digestSize];
            byte[] bArr3 = new byte[digestSize];
            int i13 = 0;
            do {
                hash(digest, bArr, bArr2, 0);
                inc(bArr, 1);
                hash(digest, bArr, bArr3, 0);
                inc(bArr, 1);
                i13++;
                long jExtract32 = ((long) (((extract32(bArr2) ^ extract32(bArr3)) & ((-1) >>> (32 - i11))) | (1 << (i11 - 1)) | 1)) & 4294967295L;
                if (isPrime32(jExtract32)) {
                    return new STOutput(BigInteger.valueOf(jExtract32), bArr, i13);
                }
            } while (i13 <= i11 * 4);
            throw new IllegalStateException("Too many iterations in Shawe-Taylor Random_Prime Routine");
        }
        STOutput sTOutputImplSTRandomPrime = implSTRandomPrime(digest, (i11 + 3) / 2, bArr);
        BigInteger prime = sTOutputImplSTRandomPrime.getPrime();
        byte[] primeSeed = sTOutputImplSTRandomPrime.getPrimeSeed();
        int primeGenCounter = sTOutputImplSTRandomPrime.getPrimeGenCounter();
        int i14 = i11 - 1;
        int i15 = (i14 / (digestSize * 8)) + 1;
        BigInteger bigIntegerHashGen = hashGen(digest, primeSeed, i15);
        BigInteger bigInteger = ONE;
        BigInteger bit = bigIntegerHashGen.mod(bigInteger.shiftLeft(i14)).setBit(i14);
        BigInteger bigIntegerShiftLeft = prime.shiftLeft(1);
        BigInteger bigIntegerShiftLeft2 = bit.subtract(bigInteger).divide(bigIntegerShiftLeft).add(bigInteger).shiftLeft(1);
        BigInteger bigIntegerAdd = bigIntegerShiftLeft2.multiply(prime).add(bigInteger);
        int i16 = primeGenCounter;
        int i17 = 0;
        while (true) {
            if (bigIntegerAdd.bitLength() > i11) {
                BigInteger bigInteger2 = ONE;
                bigIntegerShiftLeft2 = bigInteger2.shiftLeft(i14).subtract(bigInteger2).divide(bigIntegerShiftLeft).add(bigInteger2).shiftLeft(i12);
                bigIntegerAdd = bigIntegerShiftLeft2.multiply(prime).add(bigInteger2);
            }
            i16 += i12;
            if (implHasAnySmallFactors(bigIntegerAdd)) {
                anonymousClass1 = anonymousClass2;
                inc(primeSeed, i15);
            } else {
                BigInteger bigIntegerAdd2 = hashGen(digest, primeSeed, i15).mod(bigIntegerAdd.subtract(THREE)).add(TWO);
                BigInteger bigIntegerAdd3 = bigIntegerShiftLeft2.add(BigInteger.valueOf(i17));
                BigInteger bigIntegerModPow = bigIntegerAdd2.modPow(bigIntegerAdd3, bigIntegerAdd);
                BigInteger bigInteger3 = ONE;
                if (bigIntegerAdd.gcd(bigIntegerModPow.subtract(bigInteger3)).equals(bigInteger3) && bigIntegerModPow.modPow(prime, bigIntegerAdd).equals(bigInteger3)) {
                    return new STOutput(bigIntegerAdd, primeSeed, i16);
                }
                anonymousClass1 = null;
                bigIntegerShiftLeft2 = bigIntegerAdd3;
                i17 = 0;
            }
            if (i16 >= (i11 * 4) + primeGenCounter) {
                throw new IllegalStateException("Too many iterations in Shawe-Taylor Random_Prime Routine");
            }
            i17 += 2;
            bigIntegerAdd = bigIntegerAdd.add(bigIntegerShiftLeft);
            anonymousClass2 = anonymousClass1;
            i12 = 1;
        }
    }

    private static void inc(byte[] bArr, int i11) {
        int length = bArr.length;
        while (i11 > 0) {
            length--;
            if (length < 0) {
                return;
            }
            int i12 = i11 + (bArr[length] & 255);
            bArr[length] = (byte) i12;
            i11 = i12 >>> 8;
        }
    }

    public static boolean isMRProbablePrime(BigInteger bigInteger, SecureRandom secureRandom, int i11) {
        checkCandidate(bigInteger, "candidate");
        if (secureRandom == null) {
            throw new IllegalArgumentException("'random' cannot be null");
        }
        if (i11 < 1) {
            throw new IllegalArgumentException("'iterations' must be > 0");
        }
        if (bigInteger.bitLength() == 2) {
            return true;
        }
        if (!bigInteger.testBit(0)) {
            return false;
        }
        BigInteger bigIntegerSubtract = bigInteger.subtract(ONE);
        BigInteger bigIntegerSubtract2 = bigInteger.subtract(TWO);
        int lowestSetBit = bigIntegerSubtract.getLowestSetBit();
        BigInteger bigIntegerShiftRight = bigIntegerSubtract.shiftRight(lowestSetBit);
        for (int i12 = 0; i12 < i11; i12++) {
            if (!implMRProbablePrimeToBase(bigInteger, bigIntegerSubtract, bigIntegerShiftRight, lowestSetBit, BigIntegers.createRandomInRange(TWO, bigIntegerSubtract2, secureRandom))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isMRProbablePrimeToBase(BigInteger bigInteger, BigInteger bigInteger2) {
        checkCandidate(bigInteger, "candidate");
        checkCandidate(bigInteger2, "base");
        BigInteger bigInteger3 = ONE;
        if (bigInteger2.compareTo(bigInteger.subtract(bigInteger3)) >= 0) {
            throw new IllegalArgumentException("'base' must be < ('candidate' - 1)");
        }
        if (bigInteger.bitLength() == 2) {
            return true;
        }
        BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger3);
        int lowestSetBit = bigIntegerSubtract.getLowestSetBit();
        return implMRProbablePrimeToBase(bigInteger, bigIntegerSubtract, bigIntegerSubtract.shiftRight(lowestSetBit), lowestSetBit, bigInteger2);
    }

    private static boolean isPrime32(long j11) {
        if ((j11 >>> 32) != 0) {
            throw new IllegalArgumentException("Size limit exceeded");
        }
        if (j11 <= 5) {
            return j11 == 2 || j11 == 3 || j11 == 5;
        }
        if ((1 & j11) == 0 || j11 % 3 == 0 || j11 % 5 == 0) {
            return false;
        }
        long[] jArr = {1, 7, 11, 13, 17, 19, 23, 29};
        long j12 = 0;
        int i11 = 1;
        while (true) {
            if (i11 >= 8) {
                j12 += 30;
                if (j12 * j12 >= j11) {
                    return true;
                }
                i11 = 0;
            } else {
                if (j11 % (jArr[i11] + j12) == 0) {
                    return j11 < 30;
                }
                i11++;
            }
        }
    }
}
