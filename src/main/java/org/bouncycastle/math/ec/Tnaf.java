package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes10.dex */
class Tnaf {
    private static final BigInteger MINUS_ONE;
    private static final BigInteger MINUS_THREE;
    private static final BigInteger MINUS_TWO;
    public static final byte WIDTH = 4;
    public static final ZTauElement[] alpha0;
    public static final byte[][] alpha0Tnaf;
    public static final ZTauElement[] alpha1;
    public static final byte[][] alpha1Tnaf;

    static {
        BigInteger bigInteger = ECConstants.ONE;
        BigInteger bigIntegerNegate = bigInteger.negate();
        MINUS_ONE = bigIntegerNegate;
        MINUS_TWO = ECConstants.TWO.negate();
        BigInteger bigInteger2 = ECConstants.THREE;
        BigInteger bigIntegerNegate2 = bigInteger2.negate();
        MINUS_THREE = bigIntegerNegate2;
        BigInteger bigInteger3 = ECConstants.ZERO;
        alpha0 = new ZTauElement[]{null, new ZTauElement(bigInteger, bigInteger3), null, new ZTauElement(bigIntegerNegate2, bigIntegerNegate), null, new ZTauElement(bigIntegerNegate, bigIntegerNegate), null, new ZTauElement(bigInteger, bigIntegerNegate), null, new ZTauElement(bigIntegerNegate, bigInteger), null, new ZTauElement(bigInteger, bigInteger), null, new ZTauElement(bigInteger2, bigInteger), null, new ZTauElement(bigIntegerNegate, bigInteger3)};
        alpha0Tnaf = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};
        alpha1 = new ZTauElement[]{null, new ZTauElement(bigInteger, bigInteger3), null, new ZTauElement(bigIntegerNegate2, bigInteger), null, new ZTauElement(bigIntegerNegate, bigInteger), null, new ZTauElement(bigInteger, bigInteger), null, new ZTauElement(bigIntegerNegate, bigIntegerNegate), null, new ZTauElement(bigInteger, bigIntegerNegate), null, new ZTauElement(bigInteger2, bigIntegerNegate), null, new ZTauElement(bigIntegerNegate, bigInteger3)};
        alpha1Tnaf = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};
    }

    Tnaf() {
    }

    public static SimpleBigDecimal approximateDivisionByN(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b11, int i11, int i12) {
        int i13 = ((i11 + 5) / 2) + i12;
        BigInteger bigIntegerMultiply = bigInteger2.multiply(bigInteger.shiftRight(((i11 - i13) - 2) + b11));
        BigInteger bigIntegerAdd = bigIntegerMultiply.add(bigInteger3.multiply(bigIntegerMultiply.shiftRight(i11)));
        int i14 = i13 - i12;
        BigInteger bigIntegerShiftRight = bigIntegerAdd.shiftRight(i14);
        if (bigIntegerAdd.testBit(i14 - 1)) {
            bigIntegerShiftRight = bigIntegerShiftRight.add(ECConstants.ONE);
        }
        return new SimpleBigDecimal(bigIntegerShiftRight, i12);
    }

    public static BigInteger[] getLucas(byte b11, int i11, boolean z11) {
        BigInteger bigInteger;
        BigInteger bigIntegerSubtract;
        if (b11 != 1 && b11 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        if (z11) {
            bigInteger = ECConstants.TWO;
            bigIntegerSubtract = BigInteger.valueOf(b11);
        } else {
            bigInteger = ECConstants.ZERO;
            bigIntegerSubtract = ECConstants.ONE;
        }
        int i12 = 1;
        while (i12 < i11) {
            i12++;
            BigInteger bigInteger2 = bigIntegerSubtract;
            bigIntegerSubtract = (b11 < 0 ? bigIntegerSubtract.negate() : bigIntegerSubtract).subtract(bigInteger.shiftLeft(1));
            bigInteger = bigInteger2;
        }
        return new BigInteger[]{bigInteger, bigIntegerSubtract};
    }

    public static byte getMu(int i11) {
        return (byte) (i11 == 0 ? -1 : 1);
    }

    public static ECPoint.AbstractF2m[] getPreComp(ECPoint.AbstractF2m abstractF2m, byte b11) {
        ECPoint.AbstractF2m abstractF2m2 = (ECPoint.AbstractF2m) abstractF2m.negate();
        byte[][] bArr = b11 == 0 ? alpha0Tnaf : alpha1Tnaf;
        ECPoint.AbstractF2m[] abstractF2mArr = new ECPoint.AbstractF2m[(bArr.length + 1) >>> 1];
        abstractF2mArr[0] = abstractF2m;
        int length = bArr.length;
        for (int i11 = 3; i11 < length; i11 += 2) {
            abstractF2mArr[i11 >>> 1] = multiplyFromTnaf(abstractF2m, abstractF2m2, bArr[i11]);
        }
        abstractF2m.getCurve().normalizeAll(abstractF2mArr);
        return abstractF2mArr;
    }

    protected static int getShiftsForCofactor(BigInteger bigInteger) {
        if (bigInteger != null) {
            if (bigInteger.equals(ECConstants.TWO)) {
                return 1;
            }
            if (bigInteger.equals(ECConstants.FOUR)) {
                return 2;
            }
        }
        throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
    }

    public static BigInteger[] getSi(int i11, int i12, BigInteger bigInteger) {
        byte mu2 = getMu(i12);
        int shiftsForCofactor = getShiftsForCofactor(bigInteger);
        BigInteger[] lucas = getLucas(mu2, (i11 + 3) - i12, false);
        if (mu2 == 1) {
            lucas[0] = lucas[0].negate();
            lucas[1] = lucas[1].negate();
        }
        BigInteger bigInteger2 = ECConstants.ONE;
        return new BigInteger[]{bigInteger2.add(lucas[1]).shiftRight(shiftsForCofactor), bigInteger2.add(lucas[0]).shiftRight(shiftsForCofactor).negate()};
    }

    public static BigInteger getTw(byte b11, int i11) {
        if (i11 == 4) {
            return b11 == 1 ? BigInteger.valueOf(6L) : BigInteger.valueOf(10L);
        }
        BigInteger[] lucas = getLucas(b11, i11, false);
        BigInteger bit = ECConstants.ZERO.setBit(i11);
        return lucas[0].shiftLeft(1).multiply(lucas[1].modInverse(bit)).mod(bit);
    }

    public static ECPoint.AbstractF2m multiplyFromTnaf(ECPoint.AbstractF2m abstractF2m, ECPoint.AbstractF2m abstractF2m2, byte[] bArr) {
        ECPoint.AbstractF2m abstractF2m3 = (ECPoint.AbstractF2m) abstractF2m.getCurve().getInfinity();
        int i11 = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i11++;
            byte b11 = bArr[length];
            if (b11 != 0) {
                abstractF2m3 = (ECPoint.AbstractF2m) abstractF2m3.tauPow(i11).add(b11 > 0 ? abstractF2m : abstractF2m2);
                i11 = 0;
            }
        }
        return i11 > 0 ? abstractF2m3.tauPow(i11) : abstractF2m3;
    }

    public static ECPoint.AbstractF2m multiplyRTnaf(ECPoint.AbstractF2m abstractF2m, BigInteger bigInteger) {
        ECCurve.AbstractF2m abstractF2m2 = (ECCurve.AbstractF2m) abstractF2m.getCurve();
        int iIntValue = abstractF2m2.getA().toBigInteger().intValue();
        return multiplyTnaf(abstractF2m, partModReduction(abstractF2m2, bigInteger, (byte) iIntValue, getMu(iIntValue), (byte) 10));
    }

    public static ECPoint.AbstractF2m multiplyTnaf(ECPoint.AbstractF2m abstractF2m, ZTauElement zTauElement) {
        return multiplyFromTnaf(abstractF2m, (ECPoint.AbstractF2m) abstractF2m.negate(), tauAdicNaf(getMu(((ECCurve.AbstractF2m) abstractF2m.getCurve()).getA()), zTauElement));
    }

    public static BigInteger norm(byte b11, ZTauElement zTauElement) {
        BigInteger bigIntegerSubtract;
        BigInteger bigInteger = zTauElement.f98928u;
        BigInteger bigIntegerMultiply = bigInteger.multiply(bigInteger);
        if (b11 == 1) {
            bigIntegerSubtract = zTauElement.f98929v.shiftLeft(1).add(zTauElement.f98928u);
        } else {
            if (b11 != -1) {
                throw new IllegalArgumentException("mu must be 1 or -1");
            }
            bigIntegerSubtract = zTauElement.f98929v.shiftLeft(1).subtract(zTauElement.f98928u);
        }
        return bigIntegerSubtract.multiply(zTauElement.f98929v).add(bigIntegerMultiply);
    }

    public static ZTauElement partModReduction(ECCurve.AbstractF2m abstractF2m, BigInteger bigInteger, byte b11, byte b12, byte b13) {
        BigInteger bigIntegerSubtract;
        int fieldSize = abstractF2m.getFieldSize();
        BigInteger[] si2 = abstractF2m.getSi();
        BigInteger bigIntegerAdd = b12 == 1 ? si2[0].add(si2[1]) : si2[0].subtract(si2[1]);
        if (abstractF2m.isKoblitz()) {
            BigInteger bigInteger2 = ECConstants.ONE;
            bigIntegerSubtract = bigInteger2.shiftLeft(fieldSize).add(bigInteger2).subtract(abstractF2m.getOrder().multiply(abstractF2m.getCofactor()));
        } else {
            bigIntegerSubtract = getLucas(b12, fieldSize, true)[1];
        }
        BigInteger bigInteger3 = bigIntegerSubtract;
        ZTauElement zTauElementRound = round(approximateDivisionByN(bigInteger, si2[0], bigInteger3, b11, fieldSize, b13), approximateDivisionByN(bigInteger, si2[1], bigInteger3, b11, fieldSize, b13), b12);
        return new ZTauElement(bigInteger.subtract(bigIntegerAdd.multiply(zTauElementRound.f98928u)).subtract(si2[1].multiply(zTauElementRound.f98929v).shiftLeft(1)), si2[1].multiply(zTauElementRound.f98928u).subtract(si2[0].multiply(zTauElementRound.f98929v)));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        if (r5.compareTo(r9) >= 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.bouncycastle.math.ec.ZTauElement round(org.bouncycastle.math.ec.SimpleBigDecimal r8, org.bouncycastle.math.ec.SimpleBigDecimal r9, byte r10) {
        /*
            int r0 = r8.getScale()
            int r1 = r9.getScale()
            if (r1 != r0) goto La8
            r0 = -1
            r1 = 1
            if (r10 == r1) goto L19
            if (r10 != r0) goto L11
            goto L19
        L11:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "mu must be 1 or -1"
            r8.<init>(r9)
            throw r8
        L19:
            java.math.BigInteger r2 = r8.round()
            java.math.BigInteger r3 = r9.round()
            org.bouncycastle.math.ec.SimpleBigDecimal r8 = r8.subtract(r2)
            org.bouncycastle.math.ec.SimpleBigDecimal r9 = r9.subtract(r3)
            org.bouncycastle.math.ec.SimpleBigDecimal r4 = r8.add(r8)
            if (r10 != r1) goto L34
            org.bouncycastle.math.ec.SimpleBigDecimal r4 = r4.add(r9)
            goto L38
        L34:
            org.bouncycastle.math.ec.SimpleBigDecimal r4 = r4.subtract(r9)
        L38:
            org.bouncycastle.math.ec.SimpleBigDecimal r5 = r9.add(r9)
            org.bouncycastle.math.ec.SimpleBigDecimal r5 = r5.add(r9)
            org.bouncycastle.math.ec.SimpleBigDecimal r9 = r5.add(r9)
            if (r10 != r1) goto L4f
            org.bouncycastle.math.ec.SimpleBigDecimal r5 = r8.subtract(r5)
            org.bouncycastle.math.ec.SimpleBigDecimal r8 = r8.add(r9)
            goto L57
        L4f:
            org.bouncycastle.math.ec.SimpleBigDecimal r5 = r8.add(r5)
            org.bouncycastle.math.ec.SimpleBigDecimal r8 = r8.subtract(r9)
        L57:
            java.math.BigInteger r9 = org.bouncycastle.math.ec.ECConstants.ONE
            int r6 = r4.compareTo(r9)
            r7 = 0
            if (r6 < 0) goto L69
            java.math.BigInteger r6 = org.bouncycastle.math.ec.Tnaf.MINUS_ONE
            int r6 = r5.compareTo(r6)
            if (r6 >= 0) goto L75
            goto L71
        L69:
            java.math.BigInteger r1 = org.bouncycastle.math.ec.ECConstants.TWO
            int r1 = r8.compareTo(r1)
            if (r1 < 0) goto L74
        L71:
            r1 = r7
            r7 = r10
            goto L75
        L74:
            r1 = r7
        L75:
            java.math.BigInteger r6 = org.bouncycastle.math.ec.Tnaf.MINUS_ONE
            int r4 = r4.compareTo(r6)
            if (r4 >= 0) goto L87
            int r8 = r5.compareTo(r9)
            if (r8 < 0) goto L90
        L83:
            int r8 = -r10
            byte r7 = (byte) r8
        L85:
            r0 = r1
            goto L90
        L87:
            java.math.BigInteger r9 = org.bouncycastle.math.ec.Tnaf.MINUS_TWO
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto L85
            goto L83
        L90:
            long r8 = (long) r0
            java.math.BigInteger r8 = java.math.BigInteger.valueOf(r8)
            java.math.BigInteger r8 = r2.add(r8)
            long r9 = (long) r7
            java.math.BigInteger r9 = java.math.BigInteger.valueOf(r9)
            java.math.BigInteger r9 = r3.add(r9)
            org.bouncycastle.math.ec.ZTauElement r10 = new org.bouncycastle.math.ec.ZTauElement
            r10.<init>(r8, r9)
            return r10
        La8:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "lambda0 and lambda1 do not have same scale"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.math.ec.Tnaf.round(org.bouncycastle.math.ec.SimpleBigDecimal, org.bouncycastle.math.ec.SimpleBigDecimal, byte):org.bouncycastle.math.ec.ZTauElement");
    }

    public static ECPoint.AbstractF2m tau(ECPoint.AbstractF2m abstractF2m) {
        return abstractF2m.tau();
    }

    public static byte[] tauAdicNaf(byte b11, ZTauElement zTauElement) {
        if (b11 != 1 && b11 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        int iBitLength = norm(b11, zTauElement).bitLength();
        byte[] bArr = new byte[iBitLength > 30 ? iBitLength + 4 : 34];
        BigInteger bigIntegerClearBit = zTauElement.f98928u;
        BigInteger bigInteger = zTauElement.f98929v;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            BigInteger bigInteger2 = ECConstants.ZERO;
            if (bigIntegerClearBit.equals(bigInteger2) && bigInteger.equals(bigInteger2)) {
                int i13 = i11 + 1;
                byte[] bArr2 = new byte[i13];
                System.arraycopy(bArr, 0, bArr2, 0, i13);
                return bArr2;
            }
            if (bigIntegerClearBit.testBit(0)) {
                byte bIntValue = (byte) ECConstants.TWO.subtract(bigIntegerClearBit.subtract(bigInteger.shiftLeft(1)).mod(ECConstants.FOUR)).intValue();
                bArr[i12] = bIntValue;
                bigIntegerClearBit = bIntValue == 1 ? bigIntegerClearBit.clearBit(0) : bigIntegerClearBit.add(ECConstants.ONE);
                i11 = i12;
            } else {
                bArr[i12] = 0;
            }
            BigInteger bigIntegerShiftRight = bigIntegerClearBit.shiftRight(1);
            BigInteger bigIntegerAdd = b11 == 1 ? bigInteger.add(bigIntegerShiftRight) : bigInteger.subtract(bigIntegerShiftRight);
            BigInteger bigIntegerNegate = bigIntegerClearBit.shiftRight(1).negate();
            i12++;
            bigIntegerClearBit = bigIntegerAdd;
            bigInteger = bigIntegerNegate;
        }
    }

    public static byte[] tauAdicWNaf(byte b11, ZTauElement zTauElement, int i11, int i12, ZTauElement[] zTauElementArr) {
        if (b11 != 1 && b11 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        int iBitLength = norm(b11, zTauElement).bitLength();
        byte[] bArr = new byte[iBitLength > 30 ? iBitLength + 4 + i11 : i11 + 34];
        int i13 = (1 << i11) - 1;
        int i14 = 32 - i11;
        BigInteger bigIntegerSubtract = zTauElement.f98928u;
        BigInteger bigIntegerSubtract2 = zTauElement.f98929v;
        int i15 = 0;
        while (true) {
            if (bigIntegerSubtract.bitLength() <= 62 && bigIntegerSubtract2.bitLength() <= 62) {
                break;
            }
            if (bigIntegerSubtract.testBit(0)) {
                int iIntValue = bigIntegerSubtract.intValue() + (bigIntegerSubtract2.intValue() * i12);
                int i16 = iIntValue & i13;
                bArr[i15] = (byte) ((iIntValue << i14) >> i14);
                bigIntegerSubtract = bigIntegerSubtract.subtract(zTauElementArr[i16].f98928u);
                bigIntegerSubtract2 = bigIntegerSubtract2.subtract(zTauElementArr[i16].f98929v);
            }
            i15++;
            BigInteger bigIntegerShiftRight = bigIntegerSubtract.shiftRight(1);
            BigInteger bigIntegerAdd = b11 == 1 ? bigIntegerSubtract2.add(bigIntegerShiftRight) : bigIntegerSubtract2.subtract(bigIntegerShiftRight);
            BigInteger bigIntegerNegate = bigIntegerShiftRight.negate();
            bigIntegerSubtract = bigIntegerAdd;
            bigIntegerSubtract2 = bigIntegerNegate;
        }
        long jLongValueExact = BigIntegers.longValueExact(bigIntegerSubtract);
        long jLongValueExact2 = BigIntegers.longValueExact(bigIntegerSubtract2);
        while ((jLongValueExact | jLongValueExact2) != 0) {
            if ((1 & jLongValueExact) != 0) {
                int i17 = ((int) jLongValueExact) + (((int) jLongValueExact2) * i12);
                int i18 = i17 & i13;
                bArr[i15] = (byte) ((i17 << i14) >> i14);
                jLongValueExact -= (long) zTauElementArr[i18].f98928u.intValue();
                jLongValueExact2 -= (long) zTauElementArr[i18].f98929v.intValue();
            }
            i15++;
            long j11 = jLongValueExact >> 1;
            long j12 = b11 == 1 ? jLongValueExact2 + j11 : jLongValueExact2 - j11;
            jLongValueExact2 = -j11;
            jLongValueExact = j12;
        }
        return bArr;
    }

    public static byte getMu(ECCurve.AbstractF2m abstractF2m) {
        if (abstractF2m.isKoblitz()) {
            return abstractF2m.getA().isZero() ? (byte) -1 : (byte) 1;
        }
        throw new IllegalArgumentException("No Koblitz curve (ABC), TNAF multiplication not possible");
    }

    public static BigInteger[] getSi(ECCurve.AbstractF2m abstractF2m) {
        if (abstractF2m.isKoblitz()) {
            return getSi(abstractF2m.getFieldSize(), abstractF2m.getA().toBigInteger().intValue(), abstractF2m.getCofactor());
        }
        throw new IllegalArgumentException("si is defined for Koblitz curves only");
    }

    public static SimpleBigDecimal norm(byte b11, SimpleBigDecimal simpleBigDecimal, SimpleBigDecimal simpleBigDecimal2) {
        SimpleBigDecimal simpleBigDecimalSubtract;
        SimpleBigDecimal simpleBigDecimalMultiply = simpleBigDecimal.multiply(simpleBigDecimal);
        SimpleBigDecimal simpleBigDecimalMultiply2 = simpleBigDecimal.multiply(simpleBigDecimal2);
        SimpleBigDecimal simpleBigDecimalShiftLeft = simpleBigDecimal2.multiply(simpleBigDecimal2).shiftLeft(1);
        if (b11 == 1) {
            simpleBigDecimalSubtract = simpleBigDecimalMultiply.add(simpleBigDecimalMultiply2);
        } else {
            if (b11 != -1) {
                throw new IllegalArgumentException("mu must be 1 or -1");
            }
            simpleBigDecimalSubtract = simpleBigDecimalMultiply.subtract(simpleBigDecimalMultiply2);
        }
        return simpleBigDecimalSubtract.add(simpleBigDecimalShiftLeft);
    }

    public static byte getMu(ECFieldElement eCFieldElement) {
        return (byte) (eCFieldElement.isZero() ? -1 : 1);
    }
}
