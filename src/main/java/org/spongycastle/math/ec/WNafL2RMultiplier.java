package org.spongycastle.math.ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public class WNafL2RMultiplier extends AbstractECMultiplier {
    protected int getWindowSize(int i11) {
        return WNafUtil.getWindowSize(i11);
    }

    @Override // org.spongycastle.math.ec.AbstractECMultiplier
    protected ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        ECPoint eCPointAdd;
        int iMax = Math.max(2, Math.min(16, getWindowSize(bigInteger.bitLength())));
        WNafPreCompInfo wNafPreCompInfoPrecompute = WNafUtil.precompute(eCPoint, iMax, true);
        ECPoint[] preComp = wNafPreCompInfoPrecompute.getPreComp();
        ECPoint[] preCompNeg = wNafPreCompInfoPrecompute.getPreCompNeg();
        int[] iArrGenerateCompactWindowNaf = WNafUtil.generateCompactWindowNaf(iMax, bigInteger);
        ECPoint infinity = eCPoint.getCurve().getInfinity();
        int length = iArrGenerateCompactWindowNaf.length;
        if (length > 1) {
            length--;
            int i11 = iArrGenerateCompactWindowNaf[length];
            int i12 = i11 >> 16;
            int i13 = i11 & 65535;
            int iAbs = Math.abs(i12);
            ECPoint[] eCPointArr = i12 < 0 ? preCompNeg : preComp;
            if ((iAbs << 2) < (1 << iMax)) {
                byte b11 = LongArray.bitLengths[iAbs];
                int i14 = iMax - b11;
                eCPointAdd = eCPointArr[((1 << (iMax - 1)) - 1) >>> 1].add(eCPointArr[(((iAbs ^ (1 << (b11 - 1))) << i14) + 1) >>> 1]);
                i13 -= i14;
            } else {
                eCPointAdd = eCPointArr[iAbs >>> 1];
            }
            infinity = eCPointAdd.timesPow2(i13);
        }
        while (length > 0) {
            length--;
            int i15 = iArrGenerateCompactWindowNaf[length];
            int i16 = i15 >> 16;
            infinity = infinity.twicePlus((i16 < 0 ? preCompNeg : preComp)[Math.abs(i16) >>> 1]).timesPow2(i15 & 65535);
        }
        return infinity;
    }
}
