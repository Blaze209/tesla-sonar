package org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class SNTRUPrimeKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private SNTRUPrimeKeyGenerationParameters params;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        int p11 = this.params.getSntrupParams().getP();
        int q11 = this.params.getSntrupParams().getQ();
        int w11 = this.params.getSntrupParams().getW();
        byte[] bArr = new byte[p11];
        byte[] bArr2 = new byte[p11];
        do {
            Utils.getRandomSmallPolynomial(this.params.getRandom(), bArr);
        } while (!Utils.isInvertiblePolynomialInR3(bArr, bArr2, p11));
        byte[] bArr3 = new byte[p11];
        Utils.getRandomShortPolynomial(this.params.getRandom(), bArr3, p11, w11);
        short[] sArr = new short[p11];
        Utils.getOneThirdInverseInRQ(sArr, bArr3, p11, q11);
        short[] sArr2 = new short[p11];
        Utils.multiplicationInRQ(sArr2, sArr, bArr, p11, q11);
        byte[] bArr4 = new byte[this.params.getSntrupParams().getPublicKeyBytes()];
        Utils.getEncodedPolynomial(bArr4, sArr2, p11, q11);
        SNTRUPrimePublicKeyParameters sNTRUPrimePublicKeyParameters = new SNTRUPrimePublicKeyParameters(this.params.getSntrupParams(), bArr4);
        int i11 = (p11 + 3) / 4;
        byte[] bArr5 = new byte[i11];
        Utils.getEncodedSmallPolynomial(bArr5, bArr3, p11);
        byte[] bArr6 = new byte[i11];
        Utils.getEncodedSmallPolynomial(bArr6, bArr2, p11);
        byte[] bArr7 = new byte[i11];
        this.params.getRandom().nextBytes(bArr7);
        byte[] hashWithPrefix = Utils.getHashWithPrefix(new byte[]{4}, bArr4);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) sNTRUPrimePublicKeyParameters, (AsymmetricKeyParameter) new SNTRUPrimePrivateKeyParameters(this.params.getSntrupParams(), bArr5, bArr6, bArr4, bArr7, Arrays.copyOfRange(hashWithPrefix, 0, hashWithPrefix.length / 2)));
    }

    public SNTRUPrimeKeyGenerationParameters getParams() {
        return this.params;
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.params = (SNTRUPrimeKeyGenerationParameters) keyGenerationParameters;
    }
}
