package org.spongycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DSA;
import org.spongycastle.crypto.params.DSAKeyParameters;
import org.spongycastle.crypto.params.DSAParameters;
import org.spongycastle.crypto.params.DSAPrivateKeyParameters;
import org.spongycastle.crypto.params.DSAPublicKeyParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;

/* JADX INFO: loaded from: classes10.dex */
public class DSASigner implements DSA {
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
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
        }
        return new BigInteger(7, secureRandom).add(BigInteger.valueOf(128L)).multiply(bigInteger);
    }

    @Override // org.spongycastle.crypto.DSA
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
        return new BigInteger[]{bigIntegerMod, bigIntegerNextK.modInverse(q11).multiply(bigIntegerCalculateE.add(x11.multiply(bigIntegerMod))).mod(q11)};
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    @Override // org.spongycastle.crypto.DSA
    public void init(boolean z11, CipherParameters cipherParameters) {
        SecureRandom random;
        boolean z12;
        if (z11) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.key = (DSAPrivateKeyParameters) parametersWithRandom.getParameters();
                random = parametersWithRandom.getRandom();
            } else {
                this.key = (DSAPrivateKeyParameters) cipherParameters;
            }
            if (z11 || this.kCalculator.isDeterministic()) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.random = initSecureRandom(z12, random);
        }
        this.key = (DSAPublicKeyParameters) cipherParameters;
        random = null;
        if (z11) {
            z12 = false;
        } else {
            z12 = false;
        }
        this.random = initSecureRandom(z12, random);
    }

    protected SecureRandom initSecureRandom(boolean z11, SecureRandom secureRandom) {
        if (z11) {
            return secureRandom != null ? secureRandom : new SecureRandom();
        }
        return null;
    }

    @Override // org.spongycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        DSAParameters parameters = this.key.getParameters();
        BigInteger q11 = parameters.getQ();
        BigInteger bigIntegerCalculateE = calculateE(q11, bArr);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        if (bigIntegerValueOf.compareTo(bigInteger) >= 0 || q11.compareTo(bigInteger) <= 0 || bigIntegerValueOf.compareTo(bigInteger2) >= 0 || q11.compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger bigIntegerModInverse = bigInteger2.modInverse(q11);
        BigInteger bigIntegerMod = bigIntegerCalculateE.multiply(bigIntegerModInverse).mod(q11);
        BigInteger bigIntegerMod2 = bigInteger.multiply(bigIntegerModInverse).mod(q11);
        BigInteger p11 = parameters.getP();
        return parameters.getG().modPow(bigIntegerMod, p11).multiply(((DSAPublicKeyParameters) this.key).getY().modPow(bigIntegerMod2, p11)).mod(p11).mod(q11).equals(bigInteger);
    }

    public DSASigner(DSAKCalculator dSAKCalculator) {
        this.kCalculator = dSAKCalculator;
    }
}
