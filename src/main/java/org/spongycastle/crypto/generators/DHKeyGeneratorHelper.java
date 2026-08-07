package org.spongycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.params.DHParameters;
import org.spongycastle.math.ec.WNafUtil;
import org.spongycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes10.dex */
class DHKeyGeneratorHelper {
    static final DHKeyGeneratorHelper INSTANCE = new DHKeyGeneratorHelper();
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    private DHKeyGeneratorHelper() {
    }

    BigInteger calculatePrivate(DHParameters dHParameters, SecureRandom secureRandom) {
        BigInteger bigIntegerCreateRandomInRange;
        BigInteger bit;
        int l11 = dHParameters.getL();
        if (l11 != 0) {
            int i11 = l11 >>> 2;
            do {
                bit = new BigInteger(l11, secureRandom).setBit(l11 - 1);
            } while (WNafUtil.getNafWeight(bit) < i11);
            return bit;
        }
        BigInteger bigInteger = TWO;
        int m11 = dHParameters.getM();
        BigInteger bigIntegerShiftLeft = m11 != 0 ? ONE.shiftLeft(m11 - 1) : bigInteger;
        BigInteger q11 = dHParameters.getQ();
        if (q11 == null) {
            q11 = dHParameters.getP();
        }
        BigInteger bigIntegerSubtract = q11.subtract(bigInteger);
        int iBitLength = bigIntegerSubtract.bitLength() >>> 2;
        do {
            bigIntegerCreateRandomInRange = BigIntegers.createRandomInRange(bigIntegerShiftLeft, bigIntegerSubtract, secureRandom);
        } while (WNafUtil.getNafWeight(bigIntegerCreateRandomInRange) < iBitLength);
        return bigIntegerCreateRandomInRange;
    }

    BigInteger calculatePublic(DHParameters dHParameters, BigInteger bigInteger) {
        return dHParameters.getG().modPow(bigInteger, dHParameters.getP());
    }
}
