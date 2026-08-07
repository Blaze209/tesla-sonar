package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.params.CramerShoupParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes9.dex */
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
            BigInteger bigIntegerCreateRandomPrime;
            BigInteger bigIntegerAdd;
            int i13 = i11 - 1;
            while (true) {
                bigIntegerCreateRandomPrime = BigIntegers.createRandomPrime(i13, 2, secureRandom);
                bigIntegerAdd = bigIntegerCreateRandomPrime.shiftLeft(1).add(CramerShoupParametersGenerator.ONE);
                if (bigIntegerAdd.isProbablePrime(i12) && (i12 <= 2 || bigIntegerCreateRandomPrime.isProbablePrime(i12))) {
                    break;
                }
            }
            return new BigInteger[]{bigIntegerAdd, bigIntegerCreateRandomPrime};
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
        BigInteger bigIntegerSelectGenerator;
        BigInteger bigInteger = ParametersHelper.generateSafePrimes(this.size, this.certainty, this.random)[1];
        BigInteger bigIntegerSelectGenerator2 = ParametersHelper.selectGenerator(bigInteger, this.random);
        do {
            bigIntegerSelectGenerator = ParametersHelper.selectGenerator(bigInteger, this.random);
        } while (bigIntegerSelectGenerator2.equals(bigIntegerSelectGenerator));
        return new CramerShoupParameters(bigInteger, bigIntegerSelectGenerator2, bigIntegerSelectGenerator, SHA256Digest.newInstance());
    }

    public void init(int i11, int i12, SecureRandom secureRandom) {
        this.size = i11;
        this.certainty = i12;
        this.random = secureRandom;
    }

    public CramerShoupParameters generateParameters(DHParameters dHParameters) {
        BigInteger bigIntegerSelectGenerator;
        BigInteger p11 = dHParameters.getP();
        BigInteger g11 = dHParameters.getG();
        do {
            bigIntegerSelectGenerator = ParametersHelper.selectGenerator(p11, this.random);
        } while (g11.equals(bigIntegerSelectGenerator));
        return new CramerShoupParameters(p11, g11, bigIntegerSelectGenerator, SHA256Digest.newInstance());
    }
}
