package org.spongycastle.crypto.signers;

import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.SignerWithRecovery;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class ISO9796d2Signer implements SignerWithRecovery {
    public static final int TRAILER_IMPLICIT = 188;
    public static final int TRAILER_RIPEMD128 = 13004;
    public static final int TRAILER_RIPEMD160 = 12748;
    public static final int TRAILER_SHA1 = 13260;
    public static final int TRAILER_SHA256 = 13516;
    public static final int TRAILER_SHA384 = 14028;
    public static final int TRAILER_SHA512 = 13772;
    public static final int TRAILER_WHIRLPOOL = 14284;
    private byte[] block;
    private AsymmetricBlockCipher cipher;
    private Digest digest;
    private boolean fullMessage;
    private int keyBits;
    private byte[] mBuf;
    private int messageLength;
    private byte[] preBlock;
    private byte[] preSig;
    private byte[] recoveredMessage;
    private int trailer;

    public ISO9796d2Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, boolean z11) {
        this.cipher = asymmetricBlockCipher;
        this.digest = digest;
        if (z11) {
            this.trailer = 188;
            return;
        }
        Integer trailer = ISOTrailers.getTrailer(digest);
        if (trailer != null) {
            this.trailer = trailer.intValue();
            return;
        }
        throw new IllegalArgumentException("no valid trailer for digest: " + digest.getAlgorithmName());
    }

    private void clearBlock(byte[] bArr) {
        for (int i11 = 0; i11 != bArr.length; i11++) {
            bArr[i11] = 0;
        }
    }

    private boolean isSameAs(byte[] bArr, byte[] bArr2) {
        boolean z11;
        int i11 = this.messageLength;
        byte[] bArr3 = this.mBuf;
        if (i11 > bArr3.length) {
            z11 = bArr3.length <= bArr2.length;
            for (int i12 = 0; i12 != this.mBuf.length; i12++) {
                if (bArr[i12] != bArr2[i12]) {
                    z11 = false;
                }
            }
            return z11;
        }
        z11 = i11 == bArr2.length;
        for (int i13 = 0; i13 != bArr2.length; i13++) {
            if (bArr[i13] != bArr2[i13]) {
                z11 = false;
            }
        }
        return z11;
    }

    private boolean returnFalse(byte[] bArr) {
        clearBlock(this.mBuf);
        clearBlock(bArr);
        return false;
    }

    @Override // org.spongycastle.crypto.Signer
    public byte[] generateSignature() {
        int length;
        int i11;
        int i12;
        int i13;
        int digestSize = this.digest.getDigestSize();
        if (this.trailer == 188) {
            byte[] bArr = this.block;
            length = (bArr.length - digestSize) - 1;
            this.digest.doFinal(bArr, length);
            byte[] bArr2 = this.block;
            bArr2[bArr2.length - 1] = -68;
            i11 = 8;
        } else {
            byte[] bArr3 = this.block;
            length = (bArr3.length - digestSize) - 2;
            this.digest.doFinal(bArr3, length);
            byte[] bArr4 = this.block;
            int length2 = bArr4.length - 2;
            int i14 = this.trailer;
            bArr4[length2] = (byte) (i14 >>> 8);
            bArr4[bArr4.length - 1] = (byte) i14;
            i11 = 16;
        }
        int i15 = this.messageLength;
        int i16 = ((((digestSize + i15) * 8) + i11) + 4) - this.keyBits;
        if (i16 > 0) {
            int i17 = i15 - ((i16 + 7) / 8);
            i12 = length - i17;
            System.arraycopy(this.mBuf, 0, this.block, i12, i17);
            this.recoveredMessage = new byte[i17];
            i13 = 96;
        } else {
            i12 = length - i15;
            System.arraycopy(this.mBuf, 0, this.block, i12, i15);
            this.recoveredMessage = new byte[this.messageLength];
            i13 = 64;
        }
        int i18 = i12 - 1;
        if (i18 > 0) {
            for (int i19 = i18; i19 != 0; i19--) {
                this.block[i19] = -69;
            }
            byte[] bArr5 = this.block;
            bArr5[i18] = (byte) (bArr5[i18] ^ 1);
            bArr5[0] = 11;
            bArr5[0] = (byte) (11 | i13);
        } else {
            byte[] bArr6 = this.block;
            bArr6[0] = 10;
            bArr6[0] = (byte) (10 | i13);
        }
        AsymmetricBlockCipher asymmetricBlockCipher = this.cipher;
        byte[] bArr7 = this.block;
        byte[] bArrProcessBlock = asymmetricBlockCipher.processBlock(bArr7, 0, bArr7.length);
        this.fullMessage = (i13 & 32) == 0;
        byte[] bArr8 = this.mBuf;
        byte[] bArr9 = this.recoveredMessage;
        System.arraycopy(bArr8, 0, bArr9, 0, bArr9.length);
        clearBlock(this.mBuf);
        clearBlock(this.block);
        return bArrProcessBlock;
    }

    @Override // org.spongycastle.crypto.SignerWithRecovery
    public byte[] getRecoveredMessage() {
        return this.recoveredMessage;
    }

    @Override // org.spongycastle.crypto.SignerWithRecovery
    public boolean hasFullMessage() {
        return this.fullMessage;
    }

    @Override // org.spongycastle.crypto.Signer
    public void init(boolean z11, CipherParameters cipherParameters) {
        RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) cipherParameters;
        this.cipher.init(z11, rSAKeyParameters);
        int iBitLength = rSAKeyParameters.getModulus().bitLength();
        this.keyBits = iBitLength;
        byte[] bArr = new byte[(iBitLength + 7) / 8];
        this.block = bArr;
        if (this.trailer == 188) {
            this.mBuf = new byte[(bArr.length - this.digest.getDigestSize()) - 2];
        } else {
            this.mBuf = new byte[(bArr.length - this.digest.getDigestSize()) - 3];
        }
        reset();
    }

    @Override // org.spongycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
        this.messageLength = 0;
        clearBlock(this.mBuf);
        byte[] bArr = this.recoveredMessage;
        if (bArr != null) {
            clearBlock(bArr);
        }
        this.recoveredMessage = null;
        this.fullMessage = false;
        if (this.preSig != null) {
            this.preSig = null;
            clearBlock(this.preBlock);
            this.preBlock = null;
        }
    }

    @Override // org.spongycastle.crypto.Signer
    public void update(byte b11) {
        this.digest.update(b11);
        int i11 = this.messageLength;
        byte[] bArr = this.mBuf;
        if (i11 < bArr.length) {
            bArr[i11] = b11;
        }
        this.messageLength = i11 + 1;
    }

    @Override // org.spongycastle.crypto.SignerWithRecovery
    public void updateWithRecoveredMessage(byte[] bArr) throws InvalidCipherTextException {
        int i11;
        byte[] bArrProcessBlock = this.cipher.processBlock(bArr, 0, bArr.length);
        if (((bArrProcessBlock[0] & 192) ^ 64) != 0) {
            throw new InvalidCipherTextException("malformed signature");
        }
        if (((bArrProcessBlock[bArrProcessBlock.length - 1] & 15) ^ 12) != 0) {
            throw new InvalidCipherTextException("malformed signature");
        }
        if (((bArrProcessBlock[bArrProcessBlock.length - 1] & 255) ^ 188) == 0) {
            i11 = 1;
        } else {
            i11 = 2;
            int i12 = ((bArrProcessBlock[bArrProcessBlock.length - 2] & 255) << 8) | (bArrProcessBlock[bArrProcessBlock.length - 1] & 255);
            Integer trailer = ISOTrailers.getTrailer(this.digest);
            if (trailer == null) {
                throw new IllegalArgumentException("unrecognised hash in signature");
            }
            if (i12 != trailer.intValue()) {
                throw new IllegalStateException("signer initialised with wrong digest for trailer " + i12);
            }
        }
        int i13 = 0;
        while (i13 != bArrProcessBlock.length && ((bArrProcessBlock[i13] & 15) ^ 10) != 0) {
            i13++;
        }
        int i14 = i13 + 1;
        int length = ((bArrProcessBlock.length - i11) - this.digest.getDigestSize()) - i14;
        if (length <= 0) {
            throw new InvalidCipherTextException("malformed block");
        }
        if ((bArrProcessBlock[0] & 32) == 0) {
            this.fullMessage = true;
            byte[] bArr2 = new byte[length];
            this.recoveredMessage = bArr2;
            System.arraycopy(bArrProcessBlock, i14, bArr2, 0, bArr2.length);
        } else {
            this.fullMessage = false;
            byte[] bArr3 = new byte[length];
            this.recoveredMessage = bArr3;
            System.arraycopy(bArrProcessBlock, i14, bArr3, 0, bArr3.length);
        }
        this.preSig = bArr;
        this.preBlock = bArrProcessBlock;
        Digest digest = this.digest;
        byte[] bArr4 = this.recoveredMessage;
        digest.update(bArr4, 0, bArr4.length);
        byte[] bArr5 = this.recoveredMessage;
        this.messageLength = bArr5.length;
        System.arraycopy(bArr5, 0, this.mBuf, 0, bArr5.length);
    }

    @Override // org.spongycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        byte[] bArrProcessBlock;
        int i11;
        byte[] bArr2 = this.preSig;
        if (bArr2 == null) {
            try {
                bArrProcessBlock = this.cipher.processBlock(bArr, 0, bArr.length);
            } catch (Exception unused) {
                return false;
            }
        } else {
            if (!Arrays.areEqual(bArr2, bArr)) {
                throw new IllegalStateException("updateWithRecoveredMessage called on different signature");
            }
            bArrProcessBlock = this.preBlock;
            this.preSig = null;
            this.preBlock = null;
        }
        if (((bArrProcessBlock[0] & 192) ^ 64) != 0) {
            return returnFalse(bArrProcessBlock);
        }
        if (((bArrProcessBlock[bArrProcessBlock.length - 1] & 15) ^ 12) != 0) {
            return returnFalse(bArrProcessBlock);
        }
        if (((bArrProcessBlock[bArrProcessBlock.length - 1] & 255) ^ 188) == 0) {
            i11 = 1;
        } else {
            i11 = 2;
            int i12 = ((bArrProcessBlock[bArrProcessBlock.length - 2] & 255) << 8) | (bArrProcessBlock[bArrProcessBlock.length - 1] & 255);
            Integer trailer = ISOTrailers.getTrailer(this.digest);
            if (trailer == null) {
                throw new IllegalArgumentException("unrecognised hash in signature");
            }
            if (i12 != trailer.intValue()) {
                throw new IllegalStateException("signer initialised with wrong digest for trailer " + i12);
            }
        }
        int i13 = 0;
        while (i13 != bArrProcessBlock.length && ((bArrProcessBlock[i13] & 15) ^ 10) != 0) {
            i13++;
        }
        int i14 = i13 + 1;
        int digestSize = this.digest.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        int length = (bArrProcessBlock.length - i11) - digestSize;
        int i15 = length - i14;
        if (i15 <= 0) {
            return returnFalse(bArrProcessBlock);
        }
        if ((bArrProcessBlock[0] & 32) == 0) {
            this.fullMessage = true;
            if (this.messageLength > i15) {
                return returnFalse(bArrProcessBlock);
            }
            this.digest.reset();
            this.digest.update(bArrProcessBlock, i14, i15);
            this.digest.doFinal(bArr3, 0);
            boolean z11 = true;
            for (int i16 = 0; i16 != digestSize; i16++) {
                int i17 = length + i16;
                byte b11 = (byte) (bArrProcessBlock[i17] ^ bArr3[i16]);
                bArrProcessBlock[i17] = b11;
                if (b11 != 0) {
                    z11 = false;
                }
            }
            if (!z11) {
                return returnFalse(bArrProcessBlock);
            }
            byte[] bArr4 = new byte[i15];
            this.recoveredMessage = bArr4;
            System.arraycopy(bArrProcessBlock, i14, bArr4, 0, bArr4.length);
        } else {
            this.fullMessage = false;
            this.digest.doFinal(bArr3, 0);
            boolean z12 = true;
            for (int i18 = 0; i18 != digestSize; i18++) {
                int i19 = length + i18;
                byte b12 = (byte) (bArrProcessBlock[i19] ^ bArr3[i18]);
                bArrProcessBlock[i19] = b12;
                if (b12 != 0) {
                    z12 = false;
                }
            }
            if (!z12) {
                return returnFalse(bArrProcessBlock);
            }
            byte[] bArr5 = new byte[i15];
            this.recoveredMessage = bArr5;
            System.arraycopy(bArrProcessBlock, i14, bArr5, 0, bArr5.length);
        }
        if (this.messageLength != 0 && !isSameAs(this.mBuf, this.recoveredMessage)) {
            return returnFalse(bArrProcessBlock);
        }
        clearBlock(this.mBuf);
        clearBlock(bArrProcessBlock);
        return true;
    }

    @Override // org.spongycastle.crypto.Signer
    public void update(byte[] bArr, int i11, int i12) {
        while (i12 > 0 && this.messageLength < this.mBuf.length) {
            update(bArr[i11]);
            i11++;
            i12--;
        }
        this.digest.update(bArr, i11, i12);
        this.messageLength += i12;
    }

    public ISO9796d2Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
        this(asymmetricBlockCipher, digest, false);
    }
}
