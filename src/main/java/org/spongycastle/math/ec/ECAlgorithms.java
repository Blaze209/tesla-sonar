package org.spongycastle.math.ec;

import java.math.BigInteger;
import org.spongycastle.math.ec.endo.ECEndomorphism;
import org.spongycastle.math.ec.endo.GLVEndomorphism;
import org.spongycastle.math.field.FiniteField;
import org.spongycastle.math.field.PolynomialExtensionField;

/* JADX INFO: loaded from: classes10.dex */
public class ECAlgorithms {
    static ECPoint implShamirsTrickJsf(ECPoint eCPoint, BigInteger bigInteger, ECPoint eCPoint2, BigInteger bigInteger2) {
        ECCurve curve = eCPoint.getCurve();
        ECPoint infinity = curve.getInfinity();
        ECPoint[] eCPointArr = {eCPoint2, eCPoint.subtract(eCPoint2), eCPoint, eCPoint.add(eCPoint2)};
        curve.normalizeAll(eCPointArr);
        ECPoint[] eCPointArr2 = {eCPointArr[3].negate(), eCPointArr[2].negate(), eCPointArr[1].negate(), eCPointArr[0].negate(), infinity, eCPointArr[0], eCPointArr[1], eCPointArr[2], eCPointArr[3]};
        byte[] bArrGenerateJSF = WNafUtil.generateJSF(bigInteger, bigInteger2);
        int length = bArrGenerateJSF.length;
        while (true) {
            length--;
            if (length < 0) {
                return infinity;
            }
            byte b11 = bArrGenerateJSF[length];
            infinity = infinity.twicePlus(eCPointArr2[(((b11 << 24) >> 28) * 3) + 4 + ((b11 << 28) >> 28)]);
        }
    }

    static ECPoint implShamirsTrickWNaf(ECPoint eCPoint, BigInteger bigInteger, ECPoint eCPoint2, BigInteger bigInteger2) {
        boolean z11 = bigInteger.signum() < 0;
        boolean z12 = bigInteger2.signum() < 0;
        BigInteger bigIntegerAbs = bigInteger.abs();
        BigInteger bigIntegerAbs2 = bigInteger2.abs();
        int iMax = Math.max(2, Math.min(16, WNafUtil.getWindowSize(bigIntegerAbs.bitLength())));
        int iMax2 = Math.max(2, Math.min(16, WNafUtil.getWindowSize(bigIntegerAbs2.bitLength())));
        WNafPreCompInfo wNafPreCompInfoPrecompute = WNafUtil.precompute(eCPoint, iMax, true);
        WNafPreCompInfo wNafPreCompInfoPrecompute2 = WNafUtil.precompute(eCPoint2, iMax2, true);
        return implShamirsTrickWNaf(z11 ? wNafPreCompInfoPrecompute.getPreCompNeg() : wNafPreCompInfoPrecompute.getPreComp(), z11 ? wNafPreCompInfoPrecompute.getPreComp() : wNafPreCompInfoPrecompute.getPreCompNeg(), WNafUtil.generateWindowNaf(iMax, bigIntegerAbs), z12 ? wNafPreCompInfoPrecompute2.getPreCompNeg() : wNafPreCompInfoPrecompute2.getPreComp(), z12 ? wNafPreCompInfoPrecompute2.getPreComp() : wNafPreCompInfoPrecompute2.getPreCompNeg(), WNafUtil.generateWindowNaf(iMax2, bigIntegerAbs2));
    }

    static ECPoint implSumOfMultiplies(ECPoint[] eCPointArr, BigInteger[] bigIntegerArr) {
        int length = eCPointArr.length;
        boolean[] zArr = new boolean[length];
        WNafPreCompInfo[] wNafPreCompInfoArr = new WNafPreCompInfo[length];
        byte[][] bArr = new byte[length][];
        for (int i11 = 0; i11 < length; i11++) {
            BigInteger bigInteger = bigIntegerArr[i11];
            zArr[i11] = bigInteger.signum() < 0;
            BigInteger bigIntegerAbs = bigInteger.abs();
            int iMax = Math.max(2, Math.min(16, WNafUtil.getWindowSize(bigIntegerAbs.bitLength())));
            wNafPreCompInfoArr[i11] = WNafUtil.precompute(eCPointArr[i11], iMax, true);
            bArr[i11] = WNafUtil.generateWindowNaf(iMax, bigIntegerAbs);
        }
        return implSumOfMultiplies(zArr, wNafPreCompInfoArr, bArr);
    }

    static ECPoint implSumOfMultipliesGLV(ECPoint[] eCPointArr, BigInteger[] bigIntegerArr, GLVEndomorphism gLVEndomorphism) {
        BigInteger order = eCPointArr[0].getCurve().getOrder();
        int length = eCPointArr.length;
        int i11 = length << 1;
        BigInteger[] bigIntegerArr2 = new BigInteger[i11];
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            BigInteger[] bigIntegerArrDecomposeScalar = gLVEndomorphism.decomposeScalar(bigIntegerArr[i13].mod(order));
            int i14 = i12 + 1;
            bigIntegerArr2[i12] = bigIntegerArrDecomposeScalar[0];
            i12 += 2;
            bigIntegerArr2[i14] = bigIntegerArrDecomposeScalar[1];
        }
        ECPointMap pointMap = gLVEndomorphism.getPointMap();
        if (gLVEndomorphism.hasEfficientPointMap()) {
            return implSumOfMultiplies(eCPointArr, pointMap, bigIntegerArr2);
        }
        ECPoint[] eCPointArr2 = new ECPoint[i11];
        int i15 = 0;
        for (ECPoint eCPoint : eCPointArr) {
            ECPoint map = pointMap.map(eCPoint);
            int i16 = i15 + 1;
            eCPointArr2[i15] = eCPoint;
            i15 += 2;
            eCPointArr2[i16] = map;
        }
        return implSumOfMultiplies(eCPointArr2, bigIntegerArr2);
    }

    public static ECPoint importPoint(ECCurve eCCurve, ECPoint eCPoint) {
        if (eCCurve.equals(eCPoint.getCurve())) {
            return eCCurve.importPoint(eCPoint);
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    public static boolean isF2mCurve(ECCurve eCCurve) {
        return isF2mField(eCCurve.getField());
    }

    public static boolean isF2mField(FiniteField finiteField) {
        return finiteField.getDimension() > 1 && finiteField.getCharacteristic().equals(ECConstants.TWO) && (finiteField instanceof PolynomialExtensionField);
    }

    public static boolean isFpCurve(ECCurve eCCurve) {
        return isFpField(eCCurve.getField());
    }

    public static boolean isFpField(FiniteField finiteField) {
        return finiteField.getDimension() == 1;
    }

    public static void montgomeryTrick(ECFieldElement[] eCFieldElementArr, int i11, int i12) {
        montgomeryTrick(eCFieldElementArr, i11, i12, null);
    }

    public static ECPoint referenceMultiply(ECPoint eCPoint, BigInteger bigInteger) {
        BigInteger bigIntegerAbs = bigInteger.abs();
        ECPoint infinity = eCPoint.getCurve().getInfinity();
        int iBitLength = bigIntegerAbs.bitLength();
        if (iBitLength > 0) {
            if (bigIntegerAbs.testBit(0)) {
                infinity = eCPoint;
            }
            for (int i11 = 1; i11 < iBitLength; i11++) {
                eCPoint = eCPoint.twice();
                if (bigIntegerAbs.testBit(i11)) {
                    infinity = infinity.add(eCPoint);
                }
            }
        }
        return bigInteger.signum() < 0 ? infinity.negate() : infinity;
    }

    public static ECPoint shamirsTrick(ECPoint eCPoint, BigInteger bigInteger, ECPoint eCPoint2, BigInteger bigInteger2) {
        return validatePoint(implShamirsTrickJsf(eCPoint, bigInteger, importPoint(eCPoint.getCurve(), eCPoint2), bigInteger2));
    }

    public static ECPoint sumOfMultiplies(ECPoint[] eCPointArr, BigInteger[] bigIntegerArr) {
        if (eCPointArr != null && bigIntegerArr != null && eCPointArr.length == bigIntegerArr.length) {
            if (eCPointArr.length >= 1) {
                int length = eCPointArr.length;
                if (length == 1) {
                    return eCPointArr[0].multiply(bigIntegerArr[0]);
                }
                if (length == 2) {
                    return sumOfTwoMultiplies(eCPointArr[0], bigIntegerArr[0], eCPointArr[1], bigIntegerArr[1]);
                }
                ECPoint eCPoint = eCPointArr[0];
                ECCurve curve = eCPoint.getCurve();
                ECPoint[] eCPointArr2 = new ECPoint[length];
                eCPointArr2[0] = eCPoint;
                for (int i11 = 1; i11 < length; i11++) {
                    eCPointArr2[i11] = importPoint(curve, eCPointArr[i11]);
                }
                ECEndomorphism endomorphism = curve.getEndomorphism();
                return endomorphism instanceof GLVEndomorphism ? validatePoint(implSumOfMultipliesGLV(eCPointArr2, bigIntegerArr, (GLVEndomorphism) endomorphism)) : validatePoint(implSumOfMultiplies(eCPointArr2, bigIntegerArr));
            }
        }
        throw new IllegalArgumentException("point and scalar arrays should be non-null, and of equal, non-zero, length");
    }

    public static ECPoint sumOfTwoMultiplies(ECPoint eCPoint, BigInteger bigInteger, ECPoint eCPoint2, BigInteger bigInteger2) {
        ECCurve curve = eCPoint.getCurve();
        ECPoint eCPointImportPoint = importPoint(curve, eCPoint2);
        if ((curve instanceof ECCurve.AbstractF2m) && ((ECCurve.AbstractF2m) curve).isKoblitz()) {
            return validatePoint(eCPoint.multiply(bigInteger).add(eCPointImportPoint.multiply(bigInteger2)));
        }
        ECEndomorphism endomorphism = curve.getEndomorphism();
        return endomorphism instanceof GLVEndomorphism ? validatePoint(implSumOfMultipliesGLV(new ECPoint[]{eCPoint, eCPointImportPoint}, new BigInteger[]{bigInteger, bigInteger2}, (GLVEndomorphism) endomorphism)) : validatePoint(implShamirsTrickWNaf(eCPoint, bigInteger, eCPointImportPoint, bigInteger2));
    }

    public static ECPoint validatePoint(ECPoint eCPoint) {
        if (eCPoint.isValid()) {
            return eCPoint;
        }
        throw new IllegalArgumentException("Invalid point");
    }

    public static void montgomeryTrick(ECFieldElement[] eCFieldElementArr, int i11, int i12, ECFieldElement eCFieldElement) {
        ECFieldElement[] eCFieldElementArr2 = new ECFieldElement[i12];
        int i13 = 0;
        eCFieldElementArr2[0] = eCFieldElementArr[i11];
        while (true) {
            int i14 = i13 + 1;
            if (i14 >= i12) {
                break;
            }
            eCFieldElementArr2[i14] = eCFieldElementArr2[i13].multiply(eCFieldElementArr[i11 + i14]);
            i13 = i14;
        }
        if (eCFieldElement != null) {
            eCFieldElementArr2[i13] = eCFieldElementArr2[i13].multiply(eCFieldElement);
        }
        ECFieldElement eCFieldElementInvert = eCFieldElementArr2[i13].invert();
        while (i13 > 0) {
            int i15 = i13 - 1;
            int i16 = i13 + i11;
            ECFieldElement eCFieldElement2 = eCFieldElementArr[i16];
            eCFieldElementArr[i16] = eCFieldElementArr2[i15].multiply(eCFieldElementInvert);
            eCFieldElementInvert = eCFieldElementInvert.multiply(eCFieldElement2);
            i13 = i15;
        }
        eCFieldElementArr[i11] = eCFieldElementInvert;
    }

    static ECPoint implSumOfMultiplies(ECPoint[] eCPointArr, ECPointMap eCPointMap, BigInteger[] bigIntegerArr) {
        int length = eCPointArr.length;
        int i11 = length << 1;
        boolean[] zArr = new boolean[i11];
        WNafPreCompInfo[] wNafPreCompInfoArr = new WNafPreCompInfo[i11];
        byte[][] bArr = new byte[i11][];
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = i12 << 1;
            int i14 = i13 + 1;
            BigInteger bigInteger = bigIntegerArr[i13];
            zArr[i13] = bigInteger.signum() < 0;
            BigInteger bigIntegerAbs = bigInteger.abs();
            BigInteger bigInteger2 = bigIntegerArr[i14];
            zArr[i14] = bigInteger2.signum() < 0;
            BigInteger bigIntegerAbs2 = bigInteger2.abs();
            int iMax = Math.max(2, Math.min(16, WNafUtil.getWindowSize(Math.max(bigIntegerAbs.bitLength(), bigIntegerAbs2.bitLength()))));
            ECPoint eCPoint = eCPointArr[i12];
            ECPoint eCPointMapPointWithPrecomp = WNafUtil.mapPointWithPrecomp(eCPoint, iMax, true, eCPointMap);
            wNafPreCompInfoArr[i13] = WNafUtil.getWNafPreCompInfo(eCPoint);
            wNafPreCompInfoArr[i14] = WNafUtil.getWNafPreCompInfo(eCPointMapPointWithPrecomp);
            bArr[i13] = WNafUtil.generateWindowNaf(iMax, bigIntegerAbs);
            bArr[i14] = WNafUtil.generateWindowNaf(iMax, bigIntegerAbs2);
        }
        return implSumOfMultiplies(zArr, wNafPreCompInfoArr, bArr);
    }

    static ECPoint implShamirsTrickWNaf(ECPoint eCPoint, BigInteger bigInteger, ECPointMap eCPointMap, BigInteger bigInteger2) {
        boolean z11 = bigInteger.signum() < 0;
        boolean z12 = bigInteger2.signum() < 0;
        BigInteger bigIntegerAbs = bigInteger.abs();
        BigInteger bigIntegerAbs2 = bigInteger2.abs();
        int iMax = Math.max(2, Math.min(16, WNafUtil.getWindowSize(Math.max(bigIntegerAbs.bitLength(), bigIntegerAbs2.bitLength()))));
        ECPoint eCPointMapPointWithPrecomp = WNafUtil.mapPointWithPrecomp(eCPoint, iMax, true, eCPointMap);
        WNafPreCompInfo wNafPreCompInfo = WNafUtil.getWNafPreCompInfo(eCPoint);
        WNafPreCompInfo wNafPreCompInfo2 = WNafUtil.getWNafPreCompInfo(eCPointMapPointWithPrecomp);
        return implShamirsTrickWNaf(z11 ? wNafPreCompInfo.getPreCompNeg() : wNafPreCompInfo.getPreComp(), z11 ? wNafPreCompInfo.getPreComp() : wNafPreCompInfo.getPreCompNeg(), WNafUtil.generateWindowNaf(iMax, bigIntegerAbs), z12 ? wNafPreCompInfo2.getPreCompNeg() : wNafPreCompInfo2.getPreComp(), z12 ? wNafPreCompInfo2.getPreComp() : wNafPreCompInfo2.getPreCompNeg(), WNafUtil.generateWindowNaf(iMax, bigIntegerAbs2));
    }

    private static ECPoint implSumOfMultiplies(boolean[] zArr, WNafPreCompInfo[] wNafPreCompInfoArr, byte[][] bArr) {
        int length = bArr.length;
        int iMax = 0;
        for (byte[] bArr2 : bArr) {
            iMax = Math.max(iMax, bArr2.length);
        }
        ECPoint infinity = wNafPreCompInfoArr[0].getPreComp()[0].getCurve().getInfinity();
        int i11 = iMax - 1;
        int i12 = 0;
        ECPoint eCPointTwicePlus = infinity;
        while (i11 >= 0) {
            ECPoint eCPointAdd = infinity;
            for (int i13 = 0; i13 < length; i13++) {
                byte[] bArr3 = bArr[i13];
                byte b11 = i11 < bArr3.length ? bArr3[i11] : (byte) 0;
                if (b11 != 0) {
                    int iAbs = Math.abs((int) b11);
                    WNafPreCompInfo wNafPreCompInfo = wNafPreCompInfoArr[i13];
                    eCPointAdd = eCPointAdd.add(((b11 < 0) == zArr[i13] ? wNafPreCompInfo.getPreComp() : wNafPreCompInfo.getPreCompNeg())[iAbs >>> 1]);
                }
            }
            if (eCPointAdd == infinity) {
                i12++;
            } else {
                if (i12 > 0) {
                    eCPointTwicePlus = eCPointTwicePlus.timesPow2(i12);
                    i12 = 0;
                }
                eCPointTwicePlus = eCPointTwicePlus.twicePlus(eCPointAdd);
            }
            i11--;
        }
        return i12 > 0 ? eCPointTwicePlus.timesPow2(i12) : eCPointTwicePlus;
    }

    private static ECPoint implShamirsTrickWNaf(ECPoint[] eCPointArr, ECPoint[] eCPointArr2, byte[] bArr, ECPoint[] eCPointArr3, ECPoint[] eCPointArr4, byte[] bArr2) {
        ECPoint eCPointAdd;
        int iMax = Math.max(bArr.length, bArr2.length);
        ECPoint infinity = eCPointArr[0].getCurve().getInfinity();
        int i11 = iMax - 1;
        int i12 = 0;
        ECPoint eCPointTwicePlus = infinity;
        while (i11 >= 0) {
            byte b11 = i11 < bArr.length ? bArr[i11] : (byte) 0;
            byte b12 = i11 < bArr2.length ? bArr2[i11] : (byte) 0;
            if ((b11 | b12) == 0) {
                i12++;
            } else {
                if (b11 != 0) {
                    eCPointAdd = infinity.add((b11 < 0 ? eCPointArr2 : eCPointArr)[Math.abs((int) b11) >>> 1]);
                } else {
                    eCPointAdd = infinity;
                }
                if (b12 != 0) {
                    eCPointAdd = eCPointAdd.add((b12 < 0 ? eCPointArr4 : eCPointArr3)[Math.abs((int) b12) >>> 1]);
                }
                if (i12 > 0) {
                    eCPointTwicePlus = eCPointTwicePlus.timesPow2(i12);
                    i12 = 0;
                }
                eCPointTwicePlus = eCPointTwicePlus.twicePlus(eCPointAdd);
            }
            i11--;
        }
        return i12 > 0 ? eCPointTwicePlus.timesPow2(i12) : eCPointTwicePlus;
    }
}
