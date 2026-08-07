package org.bouncycastle.crypto.signers;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.Prehash;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSABlindingParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class PSSSigner implements Signer {
    public static final byte TRAILER_IMPLICIT = -68;
    private byte[] block;
    private AsymmetricBlockCipher cipher;
    private Digest contentDigest1;
    private Digest contentDigest2;
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

    public static PSSSigner createRawSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
        return new PSSSigner(asymmetricBlockCipher, Prehash.forDigest(digest), digest, digest, digest.getDigestSize(), (byte) -68);
    }

    private byte[] maskGenerator(byte[] bArr, int i11, int i12, int i13) {
        Digest digest = this.mgfDigest;
        if (!(digest instanceof Xof)) {
            return maskGeneratorFunction1(bArr, i11, i12, i13);
        }
        byte[] bArr2 = new byte[i13];
        digest.update(bArr, i11, i12);
        ((Xof) this.mgfDigest).doFinal(bArr2, 0, i13);
        return bArr2;
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

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        int digestSize = this.contentDigest1.getDigestSize();
        int i11 = this.hLen;
        if (digestSize != i11) {
            throw new IllegalStateException();
        }
        Digest digest = this.contentDigest1;
        byte[] bArr = this.mDash;
        digest.doFinal(bArr, (bArr.length - i11) - this.sLen);
        if (this.sLen != 0) {
            if (!this.sSet) {
                this.random.nextBytes(this.salt);
            }
            byte[] bArr2 = this.salt;
            byte[] bArr3 = this.mDash;
            int length = bArr3.length;
            int i12 = this.sLen;
            System.arraycopy(bArr2, 0, bArr3, length - i12, i12);
        }
        int i13 = this.hLen;
        byte[] bArr4 = new byte[i13];
        Digest digest2 = this.contentDigest2;
        byte[] bArr5 = this.mDash;
        digest2.update(bArr5, 0, bArr5.length);
        this.contentDigest2.doFinal(bArr4, 0);
        byte[] bArr6 = this.block;
        int length2 = bArr6.length;
        int i14 = this.sLen;
        int i15 = this.hLen;
        bArr6[(((length2 - i14) - 1) - i15) - 1] = 1;
        System.arraycopy(this.salt, 0, bArr6, ((bArr6.length - i14) - i15) - 1, i14);
        byte[] bArrMaskGenerator = maskGenerator(bArr4, 0, i13, (this.block.length - this.hLen) - 1);
        for (int i16 = 0; i16 != bArrMaskGenerator.length; i16++) {
            byte[] bArr7 = this.block;
            bArr7[i16] = (byte) (bArr7[i16] ^ bArrMaskGenerator[i16]);
        }
        byte[] bArr8 = this.block;
        int length3 = bArr8.length;
        int i17 = this.hLen;
        System.arraycopy(bArr4, 0, bArr8, (length3 - i17) - 1, i17);
        byte[] bArr9 = this.block;
        bArr9[0] = (byte) ((255 >>> ((bArr9.length * 8) - this.emBits)) & bArr9[0]);
        bArr9[bArr9.length - 1] = this.trailer;
        byte[] bArrProcessBlock = this.cipher.processBlock(bArr9, 0, bArr9.length);
        clearBlock(this.block);
        return bArrProcessBlock;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z11, CipherParameters cipherParameters) {
        CipherParameters parameters;
        RSAKeyParameters publicKey;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            parameters = parametersWithRandom.getParameters();
            this.random = parametersWithRandom.getRandom();
        } else {
            if (z11) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
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

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.contentDigest1.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b11) {
        this.contentDigest1.update(b11);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        int digestSize = this.contentDigest1.getDigestSize();
        int i11 = this.hLen;
        if (digestSize != i11) {
            throw new IllegalStateException();
        }
        Digest digest = this.contentDigest1;
        byte[] bArr2 = this.mDash;
        digest.doFinal(bArr2, (bArr2.length - i11) - this.sLen);
        try {
            byte[] bArrProcessBlock = this.cipher.processBlock(bArr, 0, bArr.length);
            byte[] bArr3 = this.block;
            Arrays.fill(bArr3, 0, bArr3.length - bArrProcessBlock.length, (byte) 0);
            byte[] bArr4 = this.block;
            System.arraycopy(bArrProcessBlock, 0, bArr4, bArr4.length - bArrProcessBlock.length, bArrProcessBlock.length);
            byte[] bArr5 = this.block;
            int length = 255 >>> ((bArr5.length * 8) - this.emBits);
            byte b11 = bArr5[0];
            if ((b11 & 255) != (b11 & length) || bArr5[bArr5.length - 1] != this.trailer) {
                clearBlock(bArr5);
                return false;
            }
            int length2 = bArr5.length;
            int i12 = this.hLen;
            byte[] bArrMaskGenerator = maskGenerator(bArr5, (length2 - i12) - 1, i12, (bArr5.length - i12) - 1);
            for (int i13 = 0; i13 != bArrMaskGenerator.length; i13++) {
                byte[] bArr6 = this.block;
                bArr6[i13] = (byte) (bArr6[i13] ^ bArrMaskGenerator[i13]);
            }
            byte[] bArr7 = this.block;
            bArr7[0] = (byte) (length & bArr7[0]);
            int i14 = 0;
            while (true) {
                byte[] bArr8 = this.block;
                int length3 = bArr8.length;
                int i15 = this.hLen;
                int i16 = this.sLen;
                if (i14 != ((length3 - i15) - i16) - 2) {
                    if (bArr8[i14] != 0) {
                        clearBlock(bArr8);
                        return false;
                    }
                    i14++;
                } else {
                    if (bArr8[((bArr8.length - i15) - i16) - 2] != 1) {
                        clearBlock(bArr8);
                        return false;
                    }
                    if (this.sSet) {
                        byte[] bArr9 = this.salt;
                        byte[] bArr10 = this.mDash;
                        System.arraycopy(bArr9, 0, bArr10, bArr10.length - i16, i16);
                    } else {
                        int length4 = ((bArr8.length - i16) - i15) - 1;
                        byte[] bArr11 = this.mDash;
                        System.arraycopy(bArr8, length4, bArr11, bArr11.length - i16, i16);
                    }
                    Digest digest2 = this.contentDigest2;
                    byte[] bArr12 = this.mDash;
                    digest2.update(bArr12, 0, bArr12.length);
                    Digest digest3 = this.contentDigest2;
                    byte[] bArr13 = this.mDash;
                    digest3.doFinal(bArr13, bArr13.length - this.hLen);
                    int length5 = this.block.length;
                    int i17 = this.hLen;
                    int i18 = (length5 - i17) - 1;
                    int length6 = this.mDash.length - i17;
                    while (true) {
                        byte[] bArr14 = this.mDash;
                        if (length6 == bArr14.length) {
                            clearBlock(bArr14);
                            clearBlock(this.block);
                            return true;
                        }
                        if ((this.block[i18] ^ bArr14[length6]) != 0) {
                            clearBlock(bArr14);
                            clearBlock(this.block);
                            return false;
                        }
                        i18++;
                        length6++;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i11, byte b11) {
        this(asymmetricBlockCipher, digest, digest, i11, b11);
    }

    public static PSSSigner createRawSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, int i11, byte b11) {
        return new PSSSigner(asymmetricBlockCipher, Prehash.forDigest(digest), digest, digest2, i11, b11);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i11, int i12) {
        this.contentDigest1.update(bArr, i11, i12);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, int i11) {
        this(asymmetricBlockCipher, digest, digest2, i11, (byte) -68);
    }

    public static PSSSigner createRawSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr, byte b11) {
        return new PSSSigner(asymmetricBlockCipher, Prehash.forDigest(digest), digest, digest2, bArr, b11);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, int i11, byte b11) {
        this(asymmetricBlockCipher, digest, digest, digest2, i11, b11);
    }

    private PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, Digest digest3, int i11, byte b11) {
        this.cipher = asymmetricBlockCipher;
        this.contentDigest1 = digest;
        this.contentDigest2 = digest2;
        this.mgfDigest = digest3;
        this.hLen = digest2.getDigestSize();
        this.mgfhLen = digest3.getDigestSize();
        this.sSet = false;
        this.sLen = i11;
        this.salt = new byte[i11];
        this.mDash = new byte[i11 + 8 + this.hLen];
        this.trailer = b11;
    }

    private PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, Digest digest3, byte[] bArr, byte b11) {
        this.cipher = asymmetricBlockCipher;
        this.contentDigest1 = digest;
        this.contentDigest2 = digest2;
        this.mgfDigest = digest3;
        this.hLen = digest2.getDigestSize();
        this.mgfhLen = digest3.getDigestSize();
        this.sSet = true;
        int length = bArr.length;
        this.sLen = length;
        this.salt = bArr;
        this.mDash = new byte[length + 8 + this.hLen];
        this.trailer = b11;
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr) {
        this(asymmetricBlockCipher, digest, digest2, bArr, (byte) -68);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr, byte b11) {
        this(asymmetricBlockCipher, digest, digest, digest2, bArr, b11);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, byte[] bArr) {
        this(asymmetricBlockCipher, digest, digest, bArr, (byte) -68);
    }
}
