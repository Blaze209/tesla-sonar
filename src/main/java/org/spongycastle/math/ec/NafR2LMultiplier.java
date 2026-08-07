package org.spongycastle.math.ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public class NafR2LMultiplier extends AbstractECMultiplier {
    @Override // org.spongycastle.math.ec.AbstractECMultiplier
    protected ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        int[] iArrGenerateCompactNaf = WNafUtil.generateCompactNaf(bigInteger);
        ECPoint infinity = eCPoint.getCurve().getInfinity();
        int i11 = 0;
        int i12 = 0;
        while (i11 < iArrGenerateCompactNaf.length) {
            int i13 = iArrGenerateCompactNaf[i11];
            int i14 = i13 >> 16;
            eCPoint = eCPoint.timesPow2(i12 + (i13 & 65535));
            infinity = infinity.add(i14 < 0 ? eCPoint.negate() : eCPoint);
            i11++;
            i12 = 1;
        }
        return infinity;
    }
}
