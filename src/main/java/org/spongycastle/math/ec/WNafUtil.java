package org.spongycastle.math.ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class WNafUtil {
    private static final int[] DEFAULT_WINDOW_SIZE_CUTOFFS = {13, 41, 121, 337, 897, 2305};
    private static final byte[] EMPTY_BYTES = new byte[0];
    private static final int[] EMPTY_INTS = new int[0];
    private static final ECPoint[] EMPTY_POINTS = new ECPoint[0];
    public static final String PRECOMP_NAME = "bc_wnaf";

    public static int[] generateCompactNaf(BigInteger bigInteger) {
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        if (bigInteger.signum() == 0) {
            return EMPTY_INTS;
        }
        BigInteger bigIntegerAdd = bigInteger.shiftLeft(1).add(bigInteger);
        int iBitLength = bigIntegerAdd.bitLength();
        int i11 = iBitLength >> 1;
        int[] iArr = new int[i11];
        BigInteger bigIntegerXor = bigIntegerAdd.xor(bigInteger);
        int i12 = iBitLength - 1;
        int i13 = 0;
        int i14 = 1;
        int i15 = 0;
        while (i14 < i12) {
            if (bigIntegerXor.testBit(i14)) {
                iArr[i13] = i15 | ((bigInteger.testBit(i14) ? -1 : 1) << 16);
                i14++;
                i15 = 1;
                i13++;
            } else {
                i15++;
            }
            i14++;
        }
        int i16 = i13 + 1;
        iArr[i13] = 65536 | i15;
        return i11 > i16 ? trim(iArr, i16) : iArr;
    }

    public static int[] generateCompactWindowNaf(int i11, BigInteger bigInteger) {
        if (i11 == 2) {
            return generateCompactNaf(bigInteger);
        }
        if (i11 < 2 || i11 > 16) {
            throw new IllegalArgumentException("'width' must be in the range [2, 16]");
        }
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        if (bigInteger.signum() == 0) {
            return EMPTY_INTS;
        }
        int iBitLength = (bigInteger.bitLength() / i11) + 1;
        int[] iArr = new int[iBitLength];
        int i12 = 1 << i11;
        int i13 = i12 - 1;
        int i14 = i12 >>> 1;
        int i15 = 0;
        int i16 = 0;
        boolean z11 = false;
        while (i15 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i15) == z11) {
                i15++;
            } else {
                bigInteger = bigInteger.shiftRight(i15);
                int iIntValue = bigInteger.intValue() & i13;
                if (z11) {
                    iIntValue++;
                }
                z11 = (iIntValue & i14) != 0;
                if (z11) {
                    iIntValue -= i12;
                }
                if (i16 > 0) {
                    i15--;
                }
                iArr[i16] = i15 | (iIntValue << 16);
                i15 = i11;
                i16++;
            }
        }
        return iBitLength > i16 ? trim(iArr, i16) : iArr;
    }

    public static byte[] generateJSF(BigInteger bigInteger, BigInteger bigInteger2) {
        int iMax = Math.max(bigInteger.bitLength(), bigInteger2.bitLength()) + 1;
        byte[] bArr = new byte[iMax];
        BigInteger bigIntegerShiftRight = bigInteger;
        BigInteger bigIntegerShiftRight2 = bigInteger2;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if ((i11 | i12) == 0 && bigIntegerShiftRight.bitLength() <= i13 && bigIntegerShiftRight2.bitLength() <= i13) {
                break;
            }
            int iIntValue = (bigIntegerShiftRight.intValue() >>> i13) + i11;
            int i15 = iIntValue & 7;
            int iIntValue2 = (bigIntegerShiftRight2.intValue() >>> i13) + i12;
            int i16 = iIntValue2 & 7;
            int i17 = iIntValue & 1;
            if (i17 != 0) {
                i17 -= iIntValue & 2;
                if (i15 + i17 == 4 && (iIntValue2 & 3) == 2) {
                    i17 = -i17;
                }
            }
            int i18 = iIntValue2 & 1;
            if (i18 != 0) {
                i18 -= iIntValue2 & 2;
                if (i16 + i18 == 4 && (iIntValue & 3) == 2) {
                    i18 = -i18;
                }
            }
            if ((i11 << 1) == i17 + 1) {
                i11 ^= 1;
            }
            if ((i12 << 1) == i18 + 1) {
                i12 ^= 1;
            }
            i13++;
            if (i13 == 30) {
                bigIntegerShiftRight = bigIntegerShiftRight.shiftRight(30);
                bigIntegerShiftRight2 = bigIntegerShiftRight2.shiftRight(30);
                i13 = 0;
            }
            bArr[i14] = (byte) ((i18 & 15) | (i17 << 4));
            i14++;
        }
        return iMax > i14 ? trim(bArr, i14) : bArr;
    }

    public static byte[] generateNaf(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return EMPTY_BYTES;
        }
        BigInteger bigIntegerAdd = bigInteger.shiftLeft(1).add(bigInteger);
        int iBitLength = bigIntegerAdd.bitLength();
        int i11 = iBitLength - 1;
        byte[] bArr = new byte[i11];
        BigInteger bigIntegerXor = bigIntegerAdd.xor(bigInteger);
        int i12 = 1;
        while (i12 < i11) {
            if (bigIntegerXor.testBit(i12)) {
                bArr[i12 - 1] = (byte) (bigInteger.testBit(i12) ? -1 : 1);
                i12++;
            }
            i12++;
        }
        bArr[iBitLength - 2] = 1;
        return bArr;
    }

    public static byte[] generateWindowNaf(int i11, BigInteger bigInteger) {
        if (i11 == 2) {
            return generateNaf(bigInteger);
        }
        if (i11 < 2 || i11 > 8) {
            throw new IllegalArgumentException("'width' must be in the range [2, 8]");
        }
        if (bigInteger.signum() == 0) {
            return EMPTY_BYTES;
        }
        int iBitLength = bigInteger.bitLength() + 1;
        byte[] bArr = new byte[iBitLength];
        int i12 = 1 << i11;
        int i13 = i12 - 1;
        int i14 = i12 >>> 1;
        int i15 = 0;
        int i16 = 0;
        boolean z11 = false;
        while (i15 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i15) == z11) {
                i15++;
            } else {
                bigInteger = bigInteger.shiftRight(i15);
                int iIntValue = bigInteger.intValue() & i13;
                if (z11) {
                    iIntValue++;
                }
                z11 = (iIntValue & i14) != 0;
                if (z11) {
                    iIntValue -= i12;
                }
                if (i16 > 0) {
                    i15--;
                }
                int i17 = i16 + i15;
                bArr[i17] = (byte) iIntValue;
                i16 = i17 + 1;
                i15 = i11;
            }
        }
        return iBitLength > i16 ? trim(bArr, i16) : bArr;
    }

    public static int getNafWeight(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return 0;
        }
        return bigInteger.shiftLeft(1).add(bigInteger).xor(bigInteger).bitCount();
    }

    public static WNafPreCompInfo getWNafPreCompInfo(ECPoint eCPoint) {
        return getWNafPreCompInfo(eCPoint.getCurve().getPreCompInfo(eCPoint, "bc_wnaf"));
    }

    public static int getWindowSize(int i11) {
        return getWindowSize(i11, DEFAULT_WINDOW_SIZE_CUTOFFS);
    }

    public static ECPoint mapPointWithPrecomp(ECPoint eCPoint, int i11, boolean z11, ECPointMap eCPointMap) {
        ECCurve curve = eCPoint.getCurve();
        WNafPreCompInfo wNafPreCompInfoPrecompute = precompute(eCPoint, i11, z11);
        ECPoint map = eCPointMap.map(eCPoint);
        WNafPreCompInfo wNafPreCompInfo = getWNafPreCompInfo(curve.getPreCompInfo(map, "bc_wnaf"));
        ECPoint twice = wNafPreCompInfoPrecompute.getTwice();
        if (twice != null) {
            wNafPreCompInfo.setTwice(eCPointMap.map(twice));
        }
        ECPoint[] preComp = wNafPreCompInfoPrecompute.getPreComp();
        int length = preComp.length;
        ECPoint[] eCPointArr = new ECPoint[length];
        for (int i12 = 0; i12 < preComp.length; i12++) {
            eCPointArr[i12] = eCPointMap.map(preComp[i12]);
        }
        wNafPreCompInfo.setPreComp(eCPointArr);
        if (z11) {
            ECPoint[] eCPointArr2 = new ECPoint[length];
            for (int i13 = 0; i13 < length; i13++) {
                eCPointArr2[i13] = eCPointArr[i13].negate();
            }
            wNafPreCompInfo.setPreCompNeg(eCPointArr2);
        }
        curve.setPreCompInfo(map, "bc_wnaf", wNafPreCompInfo);
        return map;
    }

    public static WNafPreCompInfo precompute(ECPoint eCPoint, int i11, boolean z11) {
        int length;
        int i12;
        int coordinateSystem;
        ECCurve curve = eCPoint.getCurve();
        WNafPreCompInfo wNafPreCompInfo = getWNafPreCompInfo(curve.getPreCompInfo(eCPoint, "bc_wnaf"));
        int length2 = 0;
        int iMax = 1 << Math.max(0, i11 - 2);
        ECPoint[] preComp = wNafPreCompInfo.getPreComp();
        if (preComp == null) {
            preComp = EMPTY_POINTS;
            length = 0;
        } else {
            length = preComp.length;
        }
        if (length < iMax) {
            preComp = resizeTable(preComp, iMax);
            if (iMax == 1) {
                preComp[0] = eCPoint.normalize();
            } else {
                if (length == 0) {
                    preComp[0] = eCPoint;
                    i12 = 1;
                } else {
                    i12 = length;
                }
                ECFieldElement zCoord = null;
                if (iMax == 2) {
                    preComp[1] = eCPoint.threeTimes();
                } else {
                    ECPoint twice = wNafPreCompInfo.getTwice();
                    ECPoint eCPointAdd = preComp[i12 - 1];
                    if (twice == null) {
                        twice = preComp[0].twice();
                        wNafPreCompInfo.setTwice(twice);
                        if (!twice.isInfinity() && ECAlgorithms.isFpCurve(curve) && curve.getFieldSize() >= 64 && ((coordinateSystem = curve.getCoordinateSystem()) == 2 || coordinateSystem == 3 || coordinateSystem == 4)) {
                            zCoord = twice.getZCoord(0);
                            twice = curve.createPoint(twice.getXCoord().toBigInteger(), twice.getYCoord().toBigInteger());
                            ECFieldElement eCFieldElementSquare = zCoord.square();
                            eCPointAdd = eCPointAdd.scaleX(eCFieldElementSquare).scaleY(eCFieldElementSquare.multiply(zCoord));
                            if (length == 0) {
                                preComp[0] = eCPointAdd;
                            }
                        }
                    }
                    while (i12 < iMax) {
                        eCPointAdd = eCPointAdd.add(twice);
                        preComp[i12] = eCPointAdd;
                        i12++;
                    }
                }
                curve.normalizeAll(preComp, length, iMax - length, zCoord);
            }
        }
        wNafPreCompInfo.setPreComp(preComp);
        if (z11) {
            ECPoint[] preCompNeg = wNafPreCompInfo.getPreCompNeg();
            if (preCompNeg == null) {
                preCompNeg = new ECPoint[iMax];
            } else {
                length2 = preCompNeg.length;
                if (length2 < iMax) {
                    preCompNeg = resizeTable(preCompNeg, iMax);
                }
            }
            while (length2 < iMax) {
                preCompNeg[length2] = preComp[length2].negate();
                length2++;
            }
            wNafPreCompInfo.setPreCompNeg(preCompNeg);
        }
        curve.setPreCompInfo(eCPoint, "bc_wnaf", wNafPreCompInfo);
        return wNafPreCompInfo;
    }

    private static ECPoint[] resizeTable(ECPoint[] eCPointArr, int i11) {
        ECPoint[] eCPointArr2 = new ECPoint[i11];
        System.arraycopy(eCPointArr, 0, eCPointArr2, 0, eCPointArr.length);
        return eCPointArr2;
    }

    private static byte[] trim(byte[] bArr, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        return bArr2;
    }

    public static WNafPreCompInfo getWNafPreCompInfo(PreCompInfo preCompInfo) {
        return (preCompInfo == null || !(preCompInfo instanceof WNafPreCompInfo)) ? new WNafPreCompInfo() : (WNafPreCompInfo) preCompInfo;
    }

    public static int getWindowSize(int i11, int[] iArr) {
        int i12 = 0;
        while (i12 < iArr.length && i11 >= iArr[i12]) {
            i12++;
        }
        return i12 + 2;
    }

    private static int[] trim(int[] iArr, int i11) {
        int[] iArr2 = new int[i11];
        System.arraycopy(iArr, 0, iArr2, 0, i11);
        return iArr2;
    }
}
