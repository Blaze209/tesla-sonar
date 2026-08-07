package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes10.dex */
public class WNafL2RMultiplier extends AbstractECMultiplier {
    @Override // org.bouncycastle.math.ec.AbstractECMultiplier
    protected ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        ECPoint eCPointAdd;
        WNafPreCompInfo wNafPreCompInfoPrecompute = WNafUtil.precompute(eCPoint, WNafUtil.getWindowSize(bigInteger.bitLength()), true);
        ECPoint[] preComp = wNafPreCompInfoPrecompute.getPreComp();
        ECPoint[] preCompNeg = wNafPreCompInfoPrecompute.getPreCompNeg();
        int width = wNafPreCompInfoPrecompute.getWidth();
        int[] iArrGenerateCompactWindowNaf = WNafUtil.generateCompactWindowNaf(width, bigInteger);
        ECPoint infinity = eCPoint.getCurve().getInfinity();
        int length = iArrGenerateCompactWindowNaf.length;
        if (length > 1) {
            length--;
            int i11 = iArrGenerateCompactWindowNaf[length];
            int i12 = i11 >> 16;
            int i13 = i11 & 65535;
            int iAbs = Math.abs(i12);
            ECPoint[] eCPointArr = i12 < 0 ? preCompNeg : preComp;
            if ((iAbs << 2) < (1 << width)) {
                int iNumberOfLeadingZeros = Integers.numberOfLeadingZeros(iAbs);
                int i14 = width - (32 - iNumberOfLeadingZeros);
                eCPointAdd = eCPointArr[((1 << (width - 1)) - 1) >>> 1].add(eCPointArr[(((iAbs ^ (1 << (31 - iNumberOfLeadingZeros))) << i14) + 1) >>> 1]);
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
