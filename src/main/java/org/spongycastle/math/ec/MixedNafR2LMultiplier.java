package org.spongycastle.math.ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public class MixedNafR2LMultiplier extends AbstractECMultiplier {
    protected int additionCoord;
    protected int doublingCoord;

    public MixedNafR2LMultiplier() {
        this(2, 4);
    }

    protected ECCurve configureCurve(ECCurve eCCurve, int i11) {
        if (eCCurve.getCoordinateSystem() == i11) {
            return eCCurve;
        }
        if (eCCurve.supportsCoordinateSystem(i11)) {
            return eCCurve.configure().setCoordinateSystem(i11).create();
        }
        throw new IllegalArgumentException("Coordinate system " + i11 + " not supported by this curve");
    }

    @Override // org.spongycastle.math.ec.AbstractECMultiplier
    protected ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        ECCurve curve = eCPoint.getCurve();
        ECCurve eCCurveConfigureCurve = configureCurve(curve, this.additionCoord);
        ECCurve eCCurveConfigureCurve2 = configureCurve(curve, this.doublingCoord);
        int[] iArrGenerateCompactNaf = WNafUtil.generateCompactNaf(bigInteger);
        ECPoint infinity = eCCurveConfigureCurve.getInfinity();
        ECPoint eCPointImportPoint = eCCurveConfigureCurve2.importPoint(eCPoint);
        int i11 = 0;
        ECPoint eCPointAdd = infinity;
        int i12 = 0;
        while (i11 < iArrGenerateCompactNaf.length) {
            int i13 = iArrGenerateCompactNaf[i11];
            int i14 = i13 >> 16;
            eCPointImportPoint = eCPointImportPoint.timesPow2(i12 + (i13 & 65535));
            ECPoint eCPointImportPoint2 = eCCurveConfigureCurve.importPoint(eCPointImportPoint);
            if (i14 < 0) {
                eCPointImportPoint2 = eCPointImportPoint2.negate();
            }
            eCPointAdd = eCPointAdd.add(eCPointImportPoint2);
            i11++;
            i12 = 1;
        }
        return curve.importPoint(eCPointAdd);
    }

    public MixedNafR2LMultiplier(int i11, int i12) {
        this.additionCoord = i11;
        this.doublingCoord = i12;
    }
}
