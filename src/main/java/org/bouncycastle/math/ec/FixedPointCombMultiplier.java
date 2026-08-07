package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;

/* JADX INFO: loaded from: classes10.dex */
public class FixedPointCombMultiplier extends AbstractECMultiplier {
    @Override // org.bouncycastle.math.ec.AbstractECMultiplier
    protected ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        ECCurve curve = eCPoint.getCurve();
        int combSize = FixedPointUtil.getCombSize(curve);
        if (bigInteger.bitLength() > combSize) {
            throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
        }
        FixedPointPreCompInfo fixedPointPreCompInfoPrecompute = FixedPointUtil.precompute(eCPoint);
        ECLookupTable lookupTable = fixedPointPreCompInfoPrecompute.getLookupTable();
        int width = fixedPointPreCompInfoPrecompute.getWidth();
        int i11 = ((combSize + width) - 1) / width;
        ECPoint infinity = curve.getInfinity();
        int i12 = width * i11;
        int[] iArrFromBigInteger = Nat.fromBigInteger(i12, bigInteger);
        int i13 = i12 - 1;
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = 0;
            for (int i16 = i13 - i14; i16 >= 0; i16 -= i11) {
                int i17 = iArrFromBigInteger[i16 >>> 5] >>> (i16 & 31);
                i15 = ((i15 ^ (i17 >>> 1)) << 1) ^ i17;
            }
            infinity = infinity.twicePlus(lookupTable.lookup(i15));
        }
        return infinity.add(fixedPointPreCompInfoPrecompute.getOffset());
    }
}
