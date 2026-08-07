package org.spongycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.params.CramerShoupParameters;
import org.spongycastle.crypto.params.DHParameters;
import org.spongycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes10.dex */
public class CramerShoupParametersGenerator {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private int certainty;
    private SecureRandom random;
    private int size;

    private static class ParametersHelper {
        private static final BigInteger TWO = BigInteger.valueOf(2);

        private ParametersHelper() {
        }

        static BigInteger[] generateSafePrimes(int i11, int i12, SecureRandom secureRandom) {
            BigInteger bigInteger;
            BigInteger bigIntegerAdd;
            int i13 = i11 - 1;
            while (true) {
                bigInteger = new BigInteger(i13, 2, secureRandom);
                bigIntegerAdd = bigInteger.shiftLeft(1).add(CramerShoupParametersGenerator.ONE);
                if (bigIntegerAdd.isProbablePrime(i12) && (i12 <= 2 || bigInteger.isProbablePrime(i12))) {
                    break;
                }
            }
            return new BigInteger[]{bigIntegerAdd, bigInteger};
        }

        static BigInteger selectGenerator(BigInteger bigInteger, SecureRandom secureRandom) {
            BigInteger bigIntegerModPow;
            BigInteger bigIntegerSubtract = bigInteger.subtract(TWO);
            do {
                BigInteger bigInteger2 = TWO;
                bigIntegerModPow = BigIntegers.createRandomInRange(bigInteger2, bigIntegerSubtract, secureRandom).modPow(bigInteger2, bigInteger);
            } while (bigIntegerModPow.equals(CramerShoupParametersGenerator.ONE));
            return bigIntegerModPow;
        }
    }

    public CramerShoupParameters generateParameters() {
        BigInteger bigInteger = ParametersHelper.generateSafePrimes(this.size, this.certainty, this.random)[1];
        BigInteger bigIntegerSelectGenerator = ParametersHelper.selectGenerator(bigInteger, this.random);
        BigInteger bigIntegerSelectGenerator2 = ParametersHelper.selectGenerator(bigInteger, this.random);
        while (bigIntegerSelectGenerator.equals(bigIntegerSelectGenerator2)) {
            bigIntegerSelectGenerator2 = ParametersHelper.selectGenerator(bigInteger, this.random);
        }
        return new CramerShoupParameters(bigInteger, bigIntegerSelectGenerator, bigIntegerSelectGenerator2, new SHA256Digest());
    }

    public void init(int i11, int i12, SecureRandom secureRandom) {
        this.size = i11;
        this.certainty = i12;
        this.random = secureRandom;
    }

    public CramerShoupParameters generateParameters(DHParameters dHParameters) {
        BigInteger p11 = dHParameters.getP();
        BigInteger g11 = dHParameters.getG();
        BigInteger bigIntegerSelectGenerator = ParametersHelper.selectGenerator(p11, this.random);
        while (g11.equals(bigIntegerSelectGenerator)) {
            bigIntegerSelectGenerator = ParametersHelper.selectGenerator(p11, this.random);
        }
        return new CramerShoupParameters(p11, g11, bigIntegerSelectGenerator, new SHA256Digest());
    }
}
