package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Properties;

/* JADX INFO: loaded from: classes9.dex */
class CustomPKCS1Encoding implements AsymmetricBlockCipher {
    private static final int HEADER_LENGTH = 10;
    private byte[] blockBuffer;
    private AsymmetricBlockCipher engine;
    private boolean forEncryption;
    private boolean forPrivateKey;
    private SecureRandom random;
    private boolean useStrictLength = useStrict();

    CustomPKCS1Encoding(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.engine = asymmetricBlockCipher;
    }

    private static int checkPkcs1Encoding1(byte[] bArr) {
        int i11 = 0;
        int i12 = -((bArr[0] & 255) ^ 1);
        int i13 = 0;
        for (int i14 = 1; i14 < bArr.length; i14++) {
            int i15 = bArr[i14] & 255;
            int i16 = (i15 - 1) >> 31;
            i11 ^= ((~i13) & i14) & i16;
            i13 |= i16;
            i12 |= ~((((i15 ^ 255) - 1) >> 31) | i13);
        }
        return ((bArr.length - 1) - i11) | (((i11 - 9) | i12) >> 31);
    }

    private static int checkPkcs1Encoding2(byte[] bArr) {
        int i11 = 0;
        int i12 = -((bArr[0] & 255) ^ 2);
        int i13 = 0;
        for (int i14 = 1; i14 < bArr.length; i14++) {
            int i15 = ((bArr[i14] & 255) - 1) >> 31;
            i11 ^= ((~i13) & i14) & i15;
            i13 |= i15;
        }
        return ((bArr.length - 1) - i11) | ((i12 | (i11 - 9)) >> 31);
    }

    private byte[] decodeBlock(byte[] bArr, int i11, int i12) {
        int outputBlockSize = this.engine.getOutputBlockSize();
        byte[] bArrProcessBlock = this.engine.processBlock(bArr, i11, i12);
        boolean z11 = this.useStrictLength & (bArrProcessBlock.length != outputBlockSize);
        byte[] bArr2 = bArrProcessBlock.length < outputBlockSize ? this.blockBuffer : bArrProcessBlock;
        int iCheckPkcs1Encoding2 = this.forPrivateKey ? checkPkcs1Encoding2(bArr2) : checkPkcs1Encoding1(bArr2);
        if (z11 || (iCheckPkcs1Encoding2 < 0)) {
            Arrays.fill(bArrProcessBlock, (byte) 0);
            byte[] bArr3 = this.blockBuffer;
            Arrays.fill(bArr3, 0, Math.max(0, bArr3.length - bArrProcessBlock.length), (byte) 0);
            return null;
        }
        try {
            byte[] bArr4 = new byte[iCheckPkcs1Encoding2];
            System.arraycopy(bArr2, bArr2.length - iCheckPkcs1Encoding2, bArr4, 0, iCheckPkcs1Encoding2);
            return bArr4;
        } finally {
            Arrays.fill(bArrProcessBlock, (byte) 0);
            byte[] bArr5 = this.blockBuffer;
            Arrays.fill(bArr5, 0, Math.max(0, bArr5.length - bArrProcessBlock.length), (byte) 0);
        }
    }

    private byte[] encodeBlock(byte[] bArr, int i11, int i12) {
        if (i12 > getInputBlockSize()) {
            throw new IllegalArgumentException("input data too large");
        }
        int inputBlockSize = this.engine.getInputBlockSize();
        byte[] bArr2 = new byte[inputBlockSize];
        if (this.forPrivateKey) {
            bArr2[0] = 1;
            for (int i13 = 1; i13 != (inputBlockSize - i12) - 1; i13++) {
                bArr2[i13] = -1;
            }
        } else {
            this.random.nextBytes(bArr2);
            bArr2[0] = 2;
            for (int i14 = 1; i14 != (inputBlockSize - i12) - 1; i14++) {
                while (bArr2[i14] == 0) {
                    bArr2[i14] = (byte) this.random.nextInt();
                }
            }
        }
        int i15 = inputBlockSize - i12;
        bArr2[i15 - 1] = 0;
        System.arraycopy(bArr, i11, bArr2, i15, i12);
        return this.engine.processBlock(bArr2, 0, inputBlockSize);
    }

    private boolean useStrict() {
        if (Properties.isOverrideSetTo(PKCS1Encoding.NOT_STRICT_LENGTH_ENABLED_PROPERTY, true)) {
            return false;
        }
        return !Properties.isOverrideSetTo(PKCS1Encoding.STRICT_LENGTH_ENABLED_PROPERTY, false);
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.engine.getInputBlockSize();
        return this.forEncryption ? inputBlockSize - 10 : inputBlockSize;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.engine.getOutputBlockSize();
        return this.forEncryption ? outputBlockSize : outputBlockSize - 10;
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        AsymmetricKeyParameter asymmetricKeyParameter;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.random = parametersWithRandom.getRandom();
            asymmetricKeyParameter = (AsymmetricKeyParameter) parametersWithRandom.getParameters();
        } else {
            asymmetricKeyParameter = (AsymmetricKeyParameter) cipherParameters;
            if (!asymmetricKeyParameter.isPrivate() && z11) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
        }
        this.engine.init(z11, cipherParameters);
        this.forPrivateKey = asymmetricKeyParameter.isPrivate();
        this.forEncryption = z11;
        this.blockBuffer = new byte[this.engine.getOutputBlockSize()];
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i11, int i12) {
        return this.forEncryption ? encodeBlock(bArr, i11, i12) : decodeBlock(bArr, i11, i12);
    }
}
