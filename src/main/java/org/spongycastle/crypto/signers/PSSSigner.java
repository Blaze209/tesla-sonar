package org.spongycastle.crypto.signers;

import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.Signer;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.params.RSABlindingParameters;
import org.spongycastle.crypto.params.RSAKeyParameters;

/* JADX INFO: loaded from: classes10.dex */
public class PSSSigner implements Signer {
    public static final byte TRAILER_IMPLICIT = -68;
    private byte[] block;
    private AsymmetricBlockCipher cipher;
    private Digest contentDigest;
    private int emBits;
    private int hLen;
    private byte[] mDash;
    private Digest mgfDigest;
    private int mgfhLen;
    private SecureRandom random;
    private int sLen;
    private boolean sSet;
    private byte[] salt;
    private byte trailer;

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i11) {
        this(asymmetricBlockCipher, digest, i11, (byte) -68);
    }

    private void ItoOSP(int i11, byte[] bArr) {
        bArr[0] = (byte) (i11 >>> 24);
        bArr[1] = (byte) (i11 >>> 16);
        bArr[2] = (byte) (i11 >>> 8);
        bArr[3] = (byte) i11;
    }

    private void clearBlock(byte[] bArr) {
        for (int i11 = 0; i11 != bArr.length; i11++) {
            bArr[i11] = 0;
        }
    }

    private byte[] maskGeneratorFunction1(byte[] bArr, int i11, int i12, int i13) {
        int i14;
        byte[] bArr2 = new byte[i13];
        byte[] bArr3 = new byte[this.mgfhLen];
        byte[] bArr4 = new byte[4];
        this.mgfDigest.reset();
        int i15 = 0;
        while (true) {
            i14 = this.mgfhLen;
            if (i15 >= i13 / i14) {
                break;
            }
            ItoOSP(i15, bArr4);
            this.mgfDigest.update(bArr, i11, i12);
            this.mgfDigest.update(bArr4, 0, 4);
            this.mgfDigest.doFinal(bArr3, 0);
            int i16 = this.mgfhLen;
            System.arraycopy(bArr3, 0, bArr2, i15 * i16, i16);
            i15++;
        }
        if (i14 * i15 < i13) {
            ItoOSP(i15, bArr4);
            this.mgfDigest.update(bArr, i11, i12);
            this.mgfDigest.update(bArr4, 0, 4);
            this.mgfDigest.doFinal(bArr3, 0);
            int i17 = this.mgfhLen;
            System.arraycopy(bArr3, 0, bArr2, i15 * i17, i13 - (i15 * i17));
        }
        return bArr2;
    }

    @Override // org.spongycastle.crypto.Signer
    public byte[] generateSignature() {
        Digest digest = this.contentDigest;
        byte[] bArr = this.mDash;
        digest.doFinal(bArr, (bArr.length - this.hLen) - this.sLen);
        if (this.sLen != 0) {
            if (!this.sSet) {
                this.random.nextBytes(this.salt);
            }
            byte[] bArr2 = this.salt;
            byte[] bArr3 = this.mDash;
            int length = bArr3.length;
            int i11 = this.sLen;
            System.arraycopy(bArr2, 0, bArr3, length - i11, i11);
        }
        int i12 = this.hLen;
        byte[] bArr4 = new byte[i12];
        Digest digest2 = this.contentDigest;
        byte[] bArr5 = this.mDash;
        digest2.update(bArr5, 0, bArr5.length);
        this.contentDigest.doFinal(bArr4, 0);
        byte[] bArr6 = this.block;
        int length2 = bArr6.length;
        int i13 = this.sLen;
        int i14 = this.hLen;
        bArr6[(((length2 - i13) - 1) - i14) - 1] = 1;
        System.arraycopy(this.salt, 0, bArr6, ((bArr6.length - i13) - i14) - 1, i13);
        byte[] bArrMaskGeneratorFunction1 = maskGeneratorFunction1(bArr4, 0, i12, (this.block.length - this.hLen) - 1);
        for (int i15 = 0; i15 != bArrMaskGeneratorFunction1.length; i15++) {
            byte[] bArr7 = this.block;
            bArr7[i15] = (byte) (bArr7[i15] ^ bArrMaskGeneratorFunction1[i15]);
        }
        byte[] bArr8 = this.block;
        bArr8[0] = (byte) (bArr8[0] & (255 >> ((bArr8.length * 8) - this.emBits)));
        int length3 = bArr8.length;
        int i16 = this.hLen;
        System.arraycopy(bArr4, 0, bArr8, (length3 - i16) - 1, i16);
        byte[] bArr9 = this.block;
        bArr9[bArr9.length - 1] = this.trailer;
        byte[] bArrProcessBlock = this.cipher.processBlock(bArr9, 0, bArr9.length);
        clearBlock(this.block);
        return bArrProcessBlock;
    }

    @Override // org.spongycastle.crypto.Signer
    public void init(boolean z11, CipherParameters cipherParameters) {
        CipherParameters parameters;
        RSAKeyParameters publicKey;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            parameters = parametersWithRandom.getParameters();
            this.random = parametersWithRandom.getRandom();
        } else {
            if (z11) {
                this.random = new SecureRandom();
            }
            parameters = cipherParameters;
        }
        if (parameters instanceof RSABlindingParameters) {
            publicKey = ((RSABlindingParameters) parameters).getPublicKey();
            this.cipher.init(z11, cipherParameters);
        } else {
            publicKey = (RSAKeyParameters) parameters;
            this.cipher.init(z11, parameters);
        }
        int iBitLength = publicKey.getModulus().bitLength();
        int i11 = iBitLength - 1;
        this.emBits = i11;
        if (i11 < (this.hLen * 8) + (this.sLen * 8) + 9) {
            throw new IllegalArgumentException("key too small for specified hash and salt lengths");
        }
        this.block = new byte[(iBitLength + 6) / 8];
        reset();
    }

    @Override // org.spongycastle.crypto.Signer
    public void reset() {
        this.contentDigest.reset();
    }

    @Override // org.spongycastle.crypto.Signer
    public void update(byte b11) {
        this.contentDigest.update(b11);
    }

    @Override // org.spongycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        Digest digest = this.contentDigest;
        byte[] bArr2 = this.mDash;
        digest.doFinal(bArr2, (bArr2.length - this.hLen) - this.sLen);
        try {
            byte[] bArrProcessBlock = this.cipher.processBlock(bArr, 0, bArr.length);
            byte[] bArr3 = this.block;
            System.arraycopy(bArrProcessBlock, 0, bArr3, bArr3.length - bArrProcessBlock.length, bArrProcessBlock.length);
            byte[] bArr4 = this.block;
            if (bArr4[bArr4.length - 1] != this.trailer) {
                clearBlock(bArr4);
                return false;
            }
            int length = bArr4.length;
            int i11 = this.hLen;
            byte[] bArrMaskGeneratorFunction1 = maskGeneratorFunction1(bArr4, (length - i11) - 1, i11, (bArr4.length - i11) - 1);
            for (int i12 = 0; i12 != bArrMaskGeneratorFunction1.length; i12++) {
                byte[] bArr5 = this.block;
                bArr5[i12] = (byte) (bArr5[i12] ^ bArrMaskGeneratorFunction1[i12]);
            }
            byte[] bArr6 = this.block;
            bArr6[0] = (byte) (bArr6[0] & (255 >> ((bArr6.length * 8) - this.emBits)));
            int i13 = 0;
            while (true) {
                byte[] bArr7 = this.block;
                int length2 = bArr7.length;
                int i14 = this.hLen;
                int i15 = this.sLen;
                if (i13 != ((length2 - i14) - i15) - 2) {
                    if (bArr7[i13] != 0) {
                        clearBlock(bArr7);
                        return false;
                    }
                    i13++;
                } else {
                    if (bArr7[((bArr7.length - i14) - i15) - 2] != 1) {
                        clearBlock(bArr7);
                        return false;
                    }
                    if (this.sSet) {
                        byte[] bArr8 = this.salt;
                        byte[] bArr9 = this.mDash;
                        System.arraycopy(bArr8, 0, bArr9, bArr9.length - i15, i15);
                    } else {
                        int length3 = ((bArr7.length - i15) - i14) - 1;
                        byte[] bArr10 = this.mDash;
                        System.arraycopy(bArr7, length3, bArr10, bArr10.length - i15, i15);
                    }
                    Digest digest2 = this.contentDigest;
                    byte[] bArr11 = this.mDash;
                    digest2.update(bArr11, 0, bArr11.length);
                    Digest digest3 = this.contentDigest;
                    byte[] bArr12 = this.mDash;
                    digest3.doFinal(bArr12, bArr12.length - this.hLen);
                    int length4 = this.block.length;
                    int i16 = this.hLen;
                    int i17 = (length4 - i16) - 1;
                    int length5 = this.mDash.length - i16;
                    while (true) {
                        byte[] bArr13 = this.mDash;
                        if (length5 == bArr13.length) {
                            clearBlock(bArr13);
                            clearBlock(this.block);
                            return true;
                        }
                        if ((this.block[i17] ^ bArr13[length5]) != 0) {
                            clearBlock(bArr13);
                            clearBlock(this.block);
                            return false;
                        }
                        i17++;
                        length5++;
                    }
                }
            }
        } catch (Exception unused) {
            return false;
        }
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, int i11) {
        this(asymmetricBlockCipher, digest, digest2, i11, (byte) -68);
    }

    @Override // org.spongycastle.crypto.Signer
    public void update(byte[] bArr, int i11, int i12) {
        this.contentDigest.update(bArr, i11, i12);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i11, byte b11) {
        this(asymmetricBlockCipher, digest, digest, i11, b11);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, int i11, byte b11) {
        this.cipher = asymmetricBlockCipher;
        this.contentDigest = digest;
        this.mgfDigest = digest2;
        this.hLen = digest.getDigestSize();
        this.mgfhLen = digest2.getDigestSize();
        this.sSet = false;
        this.sLen = i11;
        this.salt = new byte[i11];
        this.mDash = new byte[i11 + 8 + this.hLen];
        this.trailer = b11;
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, byte[] bArr) {
        this(asymmetricBlockCipher, digest, digest, bArr, (byte) -68);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr) {
        this(asymmetricBlockCipher, digest, digest2, bArr, (byte) -68);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr, byte b11) {
        this.cipher = asymmetricBlockCipher;
        this.contentDigest = digest;
        this.mgfDigest = digest2;
        this.hLen = digest.getDigestSize();
        this.mgfhLen = digest2.getDigestSize();
        this.sSet = true;
        int length = bArr.length;
        this.sLen = length;
        this.salt = bArr;
        this.mDash = new byte[length + 8 + this.hLen];
        this.trailer = b11;
    }
}
