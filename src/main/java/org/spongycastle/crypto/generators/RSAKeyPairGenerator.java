package org.spongycastle.crypto.generators;

import com.google.android.gms.nearby.uwb.RangingPosition;
import java.math.BigInteger;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.RSAKeyGenerationParameters;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.spongycastle.math.Primes;
import org.spongycastle.math.ec.WNafUtil;

/* JADX INFO: loaded from: classes10.dex */
public class RSAKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private int iterations;
    private RSAKeyGenerationParameters param;

    private static int getNumberOfIterations(int i11, int i12) {
        if (i11 >= 1536) {
            if (i12 <= 100) {
                return 3;
            }
            if (i12 <= 128) {
                return 4;
            }
            return ((i12 + RangingPosition.RSSI_MIN) / 2) + 4;
        }
        if (i11 >= 1024) {
            if (i12 <= 100) {
                return 4;
            }
            if (i12 <= 112) {
                return 5;
            }
            return ((i12 - 111) / 2) + 5;
        }
        if (i11 < 512) {
            if (i12 <= 80) {
                return 40;
            }
            return ((i12 - 79) / 2) + 40;
        }
        if (i12 <= 80) {
            return 5;
        }
        if (i12 <= 100) {
            return 7;
        }
        return ((i12 - 99) / 2) + 7;
    }

    protected BigInteger chooseRandomPrime(int i11, BigInteger bigInteger, BigInteger bigInteger2) {
        for (int i12 = 0; i12 != i11 * 5; i12++) {
            BigInteger bigInteger3 = new BigInteger(i11, 1, this.param.getRandom());
            BigInteger bigIntegerMod = bigInteger3.mod(bigInteger);
            BigInteger bigInteger4 = ONE;
            if (!bigIntegerMod.equals(bigInteger4) && bigInteger3.multiply(bigInteger3).compareTo(bigInteger2) >= 0 && isProbablePrime(bigInteger3) && bigInteger.gcd(bigInteger3.subtract(bigInteger4)).equals(bigInteger4)) {
                return bigInteger3;
            }
        }
        throw new IllegalStateException("unable to generate prime number for RSA key");
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        BigInteger bigIntegerChooseRandomPrime;
        BigInteger bigIntegerMultiply;
        RSAKeyPairGenerator rSAKeyPairGenerator = this;
        int strength = rSAKeyPairGenerator.param.getStrength();
        int i11 = (strength + 1) / 2;
        int i12 = strength - i11;
        int i13 = strength / 2;
        int i14 = i13 - 100;
        int i15 = strength / 3;
        if (i14 < i15) {
            i14 = i15;
        }
        int i16 = strength >> 2;
        BigInteger bigIntegerPow = BigInteger.valueOf(2L).pow(i13);
        BigInteger bigInteger = ONE;
        BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(strength - 1);
        BigInteger bigIntegerShiftLeft2 = bigInteger.shiftLeft(i14);
        AsymmetricCipherKeyPair asymmetricCipherKeyPair = null;
        boolean z11 = false;
        while (!z11) {
            BigInteger publicExponent = rSAKeyPairGenerator.param.getPublicExponent();
            BigInteger bigIntegerChooseRandomPrime2 = rSAKeyPairGenerator.chooseRandomPrime(i11, publicExponent, bigIntegerShiftLeft);
            while (true) {
                bigIntegerChooseRandomPrime = rSAKeyPairGenerator.chooseRandomPrime(i12, publicExponent, bigIntegerShiftLeft);
                BigInteger bigIntegerAbs = bigIntegerChooseRandomPrime.subtract(bigIntegerChooseRandomPrime2).abs();
                if (bigIntegerAbs.bitLength() >= i14 && bigIntegerAbs.compareTo(bigIntegerShiftLeft2) > 0) {
                    bigIntegerMultiply = bigIntegerChooseRandomPrime2.multiply(bigIntegerChooseRandomPrime);
                    if (bigIntegerMultiply.bitLength() == strength) {
                        if (WNafUtil.getNafWeight(bigIntegerMultiply) >= i16) {
                            break;
                        }
                        bigIntegerChooseRandomPrime2 = rSAKeyPairGenerator.chooseRandomPrime(i11, publicExponent, bigIntegerShiftLeft);
                    } else {
                        bigIntegerChooseRandomPrime2 = bigIntegerChooseRandomPrime2.max(bigIntegerChooseRandomPrime);
                    }
                } else {
                    rSAKeyPairGenerator = this;
                    strength = strength;
                }
            }
            if (bigIntegerChooseRandomPrime2.compareTo(bigIntegerChooseRandomPrime) < 0) {
                bigIntegerChooseRandomPrime = bigIntegerChooseRandomPrime2;
                bigIntegerChooseRandomPrime2 = bigIntegerChooseRandomPrime;
            }
            BigInteger bigInteger2 = ONE;
            BigInteger bigIntegerSubtract = bigIntegerChooseRandomPrime2.subtract(bigInteger2);
            BigInteger bigIntegerSubtract2 = bigIntegerChooseRandomPrime.subtract(bigInteger2);
            int i17 = strength;
            BigInteger bigIntegerModInverse = publicExponent.modInverse(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2));
            if (bigIntegerModInverse.compareTo(bigIntegerPow) > 0) {
                asymmetricCipherKeyPair = new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new RSAKeyParameters(false, bigIntegerMultiply, publicExponent), (AsymmetricKeyParameter) new RSAPrivateCrtKeyParameters(bigIntegerMultiply, publicExponent, bigIntegerModInverse, bigIntegerChooseRandomPrime2, bigIntegerChooseRandomPrime, bigIntegerModInverse.remainder(bigIntegerSubtract), bigIntegerModInverse.remainder(bigIntegerSubtract2), bigIntegerChooseRandomPrime.modInverse(bigIntegerChooseRandomPrime2)));
                z11 = true;
            }
            rSAKeyPairGenerator = this;
            strength = i17;
        }
        return asymmetricCipherKeyPair;
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        RSAKeyGenerationParameters rSAKeyGenerationParameters = (RSAKeyGenerationParameters) keyGenerationParameters;
        this.param = rSAKeyGenerationParameters;
        this.iterations = getNumberOfIterations(rSAKeyGenerationParameters.getStrength(), this.param.getCertainty());
    }

    protected boolean isProbablePrime(BigInteger bigInteger) {
        return !Primes.hasAnySmallFactors(bigInteger) && Primes.isMRProbablePrime(bigInteger, this.param.getRandom(), this.iterations);
    }
}
