package org.bouncycastle.crypto.encodings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Properties;

/* JADX INFO: loaded from: classes9.dex */
public class PKCS1Encoding implements AsymmetricBlockCipher {
    private static final int HEADER_LENGTH = 10;
    public static final String NOT_STRICT_LENGTH_ENABLED_PROPERTY = "org.bouncycastle.pkcs1.not_strict";
    public static final String STRICT_LENGTH_ENABLED_PROPERTY = "org.bouncycastle.pkcs1.strict";
    private byte[] blockBuffer;
    private AsymmetricBlockCipher engine;
    private byte[] fallback;
    private boolean forEncryption;
    private boolean forPrivateKey;
    private int pLen;
    private SecureRandom random;
    private boolean useStrictLength;

    public PKCS1Encoding(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.pLen = -1;
        this.fallback = null;
        this.engine = asymmetricBlockCipher;
        this.useStrictLength = useStrict();
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
        if (this.forPrivateKey && this.pLen != -1) {
            return decodeBlockOrRandom(bArr, i11, i12);
        }
        int outputBlockSize = this.engine.getOutputBlockSize();
        byte[] bArrProcessBlock = this.engine.processBlock(bArr, i11, i12);
        boolean z11 = this.useStrictLength & (bArrProcessBlock.length != outputBlockSize);
        byte[] bArr2 = bArrProcessBlock.length < outputBlockSize ? this.blockBuffer : bArrProcessBlock;
        int iCheckPkcs1Encoding2 = this.forPrivateKey ? checkPkcs1Encoding2(bArr2) : checkPkcs1Encoding1(bArr2);
        try {
            if (iCheckPkcs1Encoding2 < 0) {
                throw new InvalidCipherTextException("block incorrect");
            }
            if (z11) {
                throw new InvalidCipherTextException("block incorrect size");
            }
            byte[] bArr3 = new byte[iCheckPkcs1Encoding2];
            System.arraycopy(bArr2, bArr2.length - iCheckPkcs1Encoding2, bArr3, 0, iCheckPkcs1Encoding2);
            Arrays.fill(bArrProcessBlock, (byte) 0);
            byte[] bArr4 = this.blockBuffer;
            Arrays.fill(bArr4, 0, Math.max(0, bArr4.length - bArrProcessBlock.length), (byte) 0);
            return bArr3;
        } catch (Throwable th2) {
            Arrays.fill(bArrProcessBlock, (byte) 0);
            byte[] bArr5 = this.blockBuffer;
            Arrays.fill(bArr5, 0, Math.max(0, bArr5.length - bArrProcessBlock.length), (byte) 0);
            throw th2;
        }
    }

    private byte[] decodeBlockOrRandom(byte[] bArr, int i11, int i12) throws InvalidCipherTextException {
        if (!this.forPrivateKey) {
            throw new InvalidCipherTextException("sorry, this method is only for decryption, not for signing");
        }
        int i13 = this.pLen;
        byte[] bArr2 = this.fallback;
        if (bArr2 == null) {
            bArr2 = new byte[i13];
            this.random.nextBytes(bArr2);
        }
        int outputBlockSize = this.engine.getOutputBlockSize();
        byte[] bArrProcessBlock = this.engine.processBlock(bArr, i11, i12);
        byte[] bArr3 = (bArrProcessBlock.length == outputBlockSize || (!this.useStrictLength && bArrProcessBlock.length >= outputBlockSize)) ? bArrProcessBlock : this.blockBuffer;
        int iCheckPkcs1Encoding2 = checkPkcs1Encoding2(bArr3, i13);
        int length = bArr3.length - i13;
        byte[] bArr4 = new byte[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            bArr4[i14] = (byte) ((bArr3[length + i14] & (~iCheckPkcs1Encoding2)) | (bArr2[i14] & iCheckPkcs1Encoding2));
        }
        Arrays.fill(bArrProcessBlock, (byte) 0);
        byte[] bArr5 = this.blockBuffer;
        Arrays.fill(bArr5, 0, Math.max(0, bArr5.length - bArrProcessBlock.length), (byte) 0);
        return bArr4;
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
        if (Properties.isOverrideSetTo(NOT_STRICT_LENGTH_ENABLED_PROPERTY, true)) {
            return false;
        }
        return !Properties.isOverrideSetTo(STRICT_LENGTH_ENABLED_PROPERTY, false);
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
        if (this.pLen > 0 && this.fallback == null && this.random == null) {
            throw new IllegalArgumentException("encoder requires random");
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i11, int i12) {
        return this.forEncryption ? encodeBlock(bArr, i11, i12) : decodeBlock(bArr, i11, i12);
    }

    public PKCS1Encoding(AsymmetricBlockCipher asymmetricBlockCipher, int i11) {
        this.pLen = -1;
        this.fallback = null;
        this.engine = asymmetricBlockCipher;
        this.useStrictLength = useStrict();
        this.pLen = i11;
    }

    private static int checkPkcs1Encoding2(byte[] bArr, int i11) {
        int i12 = -((bArr[0] & 255) ^ 2);
        int length = (bArr.length - 1) - i11;
        int i13 = (length - 9) | i12;
        for (int i14 = 1; i14 < length; i14++) {
            i13 |= (bArr[i14] & 255) - 1;
        }
        return ((-(bArr[length] & 255)) | i13) >> 31;
    }

    public PKCS1Encoding(AsymmetricBlockCipher asymmetricBlockCipher, byte[] bArr) {
        this.pLen = -1;
        this.fallback = null;
        this.engine = asymmetricBlockCipher;
        this.useStrictLength = useStrict();
        this.fallback = bArr;
        this.pLen = bArr.length;
    }
}
