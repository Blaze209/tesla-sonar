package org.spongycastle.crypto.encodings;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class PKCS1Encoding implements AsymmetricBlockCipher {
    private static final int HEADER_LENGTH = 10;
    public static final String NOT_STRICT_LENGTH_ENABLED_PROPERTY = "org.spongycastle.pkcs1.not_strict";
    public static final String STRICT_LENGTH_ENABLED_PROPERTY = "org.spongycastle.pkcs1.strict";
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

    private static int checkPkcs1Encoding(byte[] bArr, int i11) {
        int i12 = bArr[0] ^ 2;
        int i13 = i11 + 1;
        int length = bArr.length - i13;
        for (int i14 = 1; i14 < length; i14++) {
            byte b11 = bArr[i14];
            int i15 = b11 | (b11 >> 1);
            int i16 = i15 | (i15 >> 2);
            i12 |= ((i16 | (i16 >> 4)) & 1) - 1;
        }
        int i17 = bArr[bArr.length - i13] | i12;
        int i18 = i17 | (i17 >> 1);
        int i19 = i18 | (i18 >> 2);
        return ~(((i19 | (i19 >> 4)) & 1) - 1);
    }

    private byte[] decodeBlock(byte[] bArr, int i11, int i12) throws InvalidCipherTextException {
        if (this.pLen != -1) {
            return decodeBlockOrRandom(bArr, i11, i12);
        }
        byte[] bArrProcessBlock = this.engine.processBlock(bArr, i11, i12);
        boolean z11 = this.useStrictLength & (bArrProcessBlock.length != this.engine.getOutputBlockSize());
        if (bArrProcessBlock.length < getOutputBlockSize()) {
            bArrProcessBlock = this.blockBuffer;
        }
        byte b11 = bArrProcessBlock[0];
        boolean z12 = !this.forPrivateKey ? b11 == 1 : b11 == 2;
        int iFindStart = findStart(b11, bArrProcessBlock) + 1;
        if (z12 || (iFindStart < 10)) {
            Arrays.fill(bArrProcessBlock, (byte) 0);
            throw new InvalidCipherTextException("block incorrect");
        }
        if (z11) {
            Arrays.fill(bArrProcessBlock, (byte) 0);
            throw new InvalidCipherTextException("block incorrect size");
        }
        int length = bArrProcessBlock.length - iFindStart;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArrProcessBlock, iFindStart, bArr2, 0, length);
        return bArr2;
    }

    private byte[] decodeBlockOrRandom(byte[] bArr, int i11, int i12) throws InvalidCipherTextException {
        if (!this.forPrivateKey) {
            throw new InvalidCipherTextException("sorry, this method is only for decryption, not for signing");
        }
        byte[] bArrProcessBlock = this.engine.processBlock(bArr, i11, i12);
        byte[] bArr2 = this.fallback;
        if (bArr2 == null) {
            bArr2 = new byte[this.pLen];
            this.random.nextBytes(bArr2);
        }
        if (this.useStrictLength & (bArrProcessBlock.length != this.engine.getOutputBlockSize())) {
            bArrProcessBlock = this.blockBuffer;
        }
        int iCheckPkcs1Encoding = checkPkcs1Encoding(bArrProcessBlock, this.pLen);
        byte[] bArr3 = new byte[this.pLen];
        int i13 = 0;
        while (true) {
            int i14 = this.pLen;
            if (i13 >= i14) {
                Arrays.fill(bArrProcessBlock, (byte) 0);
                return bArr3;
            }
            bArr3[i13] = (byte) ((bArrProcessBlock[(bArrProcessBlock.length - i14) + i13] & (~iCheckPkcs1Encoding)) | (bArr2[i13] & iCheckPkcs1Encoding));
            i13++;
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

    private int findStart(byte b11, byte[] bArr) {
        int i11 = -1;
        boolean z11 = false;
        for (int i12 = 1; i12 != bArr.length; i12++) {
            byte b12 = bArr[i12];
            if ((b12 == 0) & (i11 < 0)) {
                i11 = i12;
            }
            z11 |= (b12 != -1) & (b11 == 1) & (i11 < 0);
        }
        if (z11) {
            return -1;
        }
        return i11;
    }

    private boolean useStrict() {
        String str = (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.spongycastle.crypto.encodings.PKCS1Encoding.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                return System.getProperty(PKCS1Encoding.STRICT_LENGTH_ENABLED_PROPERTY);
            }
        });
        String str2 = (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.spongycastle.crypto.encodings.PKCS1Encoding.2
            @Override // java.security.PrivilegedAction
            public Object run() {
                return System.getProperty(PKCS1Encoding.NOT_STRICT_LENGTH_ENABLED_PROPERTY);
            }
        });
        if (str2 != null) {
            return !str2.equals("true");
        }
        return str == null || str.equals("true");
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.engine.getInputBlockSize();
        return this.forEncryption ? inputBlockSize - 10 : inputBlockSize;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.engine.getOutputBlockSize();
        return this.forEncryption ? outputBlockSize : outputBlockSize - 10;
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        AsymmetricKeyParameter asymmetricKeyParameter;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.random = parametersWithRandom.getRandom();
            asymmetricKeyParameter = (AsymmetricKeyParameter) parametersWithRandom.getParameters();
        } else {
            asymmetricKeyParameter = (AsymmetricKeyParameter) cipherParameters;
            if (!asymmetricKeyParameter.isPrivate() && z11) {
                this.random = new SecureRandom();
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

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
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

    public PKCS1Encoding(AsymmetricBlockCipher asymmetricBlockCipher, byte[] bArr) {
        this.pLen = -1;
        this.fallback = null;
        this.engine = asymmetricBlockCipher;
        this.useStrictLength = useStrict();
        this.fallback = bArr;
        this.pLen = bArr.length;
    }
}
