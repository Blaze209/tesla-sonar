package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DSAExt;
import org.bouncycastle.crypto.params.DSAKeyParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes9.dex */
public class DSASigner implements DSAExt {
    private final DSAKCalculator kCalculator;
    private DSAKeyParameters key;
    private SecureRandom random;

    public DSASigner() {
        this.kCalculator = new RandomDSAKCalculator();
    }

    private BigInteger calculateE(BigInteger bigInteger, byte[] bArr) {
        if (bigInteger.bitLength() >= bArr.length * 8) {
            return new BigInteger(1, bArr);
        }
        int iBitLength = bigInteger.bitLength() / 8;
        byte[] bArr2 = new byte[iBitLength];
        System.arraycopy(bArr, 0, bArr2, 0, iBitLength);
        return new BigInteger(1, bArr2);
    }

    private BigInteger getRandomizer(BigInteger bigInteger, SecureRandom secureRandom) {
        return BigIntegers.createRandomBigInteger(7, CryptoServicesRegistrar.getSecureRandom(secureRandom)).add(BigInteger.valueOf(128L)).multiply(bigInteger);
    }

    @Override // org.bouncycastle.crypto.DSA
    public BigInteger[] generateSignature(byte[] bArr) {
        DSAParameters parameters = this.key.getParameters();
        BigInteger q11 = parameters.getQ();
        BigInteger bigIntegerCalculateE = calculateE(q11, bArr);
        BigInteger x11 = ((DSAPrivateKeyParameters) this.key).getX();
        if (this.kCalculator.isDeterministic()) {
            this.kCalculator.init(q11, x11, bArr);
        } else {
            this.kCalculator.init(q11, this.random);
        }
        BigInteger bigIntegerNextK = this.kCalculator.nextK();
        BigInteger bigIntegerMod = parameters.getG().modPow(bigIntegerNextK.add(getRandomizer(q11, this.random)), parameters.getP()).mod(q11);
        return new BigInteger[]{bigIntegerMod, BigIntegers.modOddInverse(q11, bigIntegerNextK).multiply(bigIntegerCalculateE.add(x11.multiply(bigIntegerMod))).mod(q11)};
    }

    @Override // org.bouncycastle.crypto.DSAExt
    public BigInteger getOrder() {
        return this.key.getParameters().getQ();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    @Override // org.bouncycastle.crypto.DSA
    public void init(boolean z11, CipherParameters cipherParameters) {
        DSAKeyParameters dSAKeyParameters;
        SecureRandom random;
        boolean z12;
        if (z11) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.key = (DSAPrivateKeyParameters) parametersWithRandom.getParameters();
                random = parametersWithRandom.getRandom();
            } else {
                dSAKeyParameters = (DSAPrivateKeyParameters) cipherParameters;
            }
            CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties("DSA", this.key, z11));
            if (z11 || this.kCalculator.isDeterministic()) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.random = initSecureRandom(z12, random);
        }
        dSAKeyParameters = (DSAPublicKeyParameters) cipherParameters;
        this.key = dSAKeyParameters;
        random = null;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties("DSA", this.key, z11));
        if (z11) {
            z12 = false;
        } else {
            z12 = false;
        }
        this.random = initSecureRandom(z12, random);
    }

    protected SecureRandom initSecureRandom(boolean z11, SecureRandom secureRandom) {
        if (z11) {
            return CryptoServicesRegistrar.getSecureRandom(secureRandom);
        }
        return null;
    }

    @Override // org.bouncycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        DSAParameters parameters = this.key.getParameters();
        BigInteger q11 = parameters.getQ();
        BigInteger bigIntegerCalculateE = calculateE(q11, bArr);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        if (bigIntegerValueOf.compareTo(bigInteger) >= 0 || q11.compareTo(bigInteger) <= 0 || bigIntegerValueOf.compareTo(bigInteger2) >= 0 || q11.compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger bigIntegerModOddInverseVar = BigIntegers.modOddInverseVar(q11, bigInteger2);
        BigInteger bigIntegerMod = bigIntegerCalculateE.multiply(bigIntegerModOddInverseVar).mod(q11);
        BigInteger bigIntegerMod2 = bigInteger.multiply(bigIntegerModOddInverseVar).mod(q11);
        BigInteger p11 = parameters.getP();
        return parameters.getG().modPow(bigIntegerMod, p11).multiply(((DSAPublicKeyParameters) this.key).getY().modPow(bigIntegerMod2, p11)).mod(p11).mod(q11).equals(bigInteger);
    }

    public DSASigner(DSAKCalculator dSAKCalculator) {
        this.kCalculator = dSAKCalculator;
    }
}
