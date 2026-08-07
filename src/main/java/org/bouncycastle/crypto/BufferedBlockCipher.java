package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes9.dex */
public class BufferedBlockCipher {
    protected byte[] buf;
    protected int bufOff;
    protected BlockCipher cipher;
    protected boolean forEncryption;
    protected MultiBlockCipher mbCipher;
    protected boolean partialBlockOkay;
    protected boolean pgpCFB;

    BufferedBlockCipher() {
    }

    public int doFinal(byte[] bArr, int i11) {
        try {
            int i12 = this.bufOff;
            if (i11 + i12 > bArr.length) {
                throw new OutputLengthException("output buffer too short for doFinal()");
            }
            int i13 = 0;
            if (i12 != 0) {
                if (!this.partialBlockOkay) {
                    throw new DataLengthException("data not block size aligned");
                }
                BlockCipher blockCipher = this.cipher;
                byte[] bArr2 = this.buf;
                blockCipher.processBlock(bArr2, 0, bArr2, 0);
                int i14 = this.bufOff;
                this.bufOff = 0;
                System.arraycopy(this.buf, 0, bArr, i11, i14);
                i13 = i14;
            }
            reset();
            return i13;
        } catch (Throwable th2) {
            reset();
            throw th2;
        }
    }

    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    public int getOutputSize(int i11) {
        int blockSize;
        if (this.pgpCFB && this.forEncryption) {
            i11 += this.bufOff;
            blockSize = this.cipher.getBlockSize() + 2;
        } else {
            blockSize = this.bufOff;
        }
        return i11 + blockSize;
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    public int getUpdateOutputSize(int i11) {
        int length;
        int i12 = i11 + this.bufOff;
        if (this.pgpCFB && this.forEncryption) {
            length = (i12 % this.buf.length) - (this.cipher.getBlockSize() + 2);
        } else {
            int length2 = this.buf.length;
            length = i12 % length2;
        }
        return i12 - length;
    }

    public void init(boolean z11, CipherParameters cipherParameters) {
        this.forEncryption = z11;
        reset();
        this.cipher.init(z11, cipherParameters);
    }

    public int processByte(byte b11, byte[] bArr, int i11) {
        byte[] bArr2 = this.buf;
        int i12 = this.bufOff;
        int i13 = i12 + 1;
        this.bufOff = i13;
        bArr2[i12] = b11;
        if (i13 != bArr2.length) {
            return 0;
        }
        int iProcessBlock = this.cipher.processBlock(bArr2, 0, bArr, i11);
        this.bufOff = 0;
        return iProcessBlock;
    }

    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        int i14;
        int i15;
        int iProcessBlock;
        if (i12 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = getBlockSize();
        int updateOutputSize = getUpdateOutputSize(i12);
        if (updateOutputSize > 0 && updateOutputSize + i13 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        byte[] bArr3 = this.buf;
        int length = bArr3.length;
        int i16 = this.bufOff;
        int i17 = length - i16;
        if (i12 > i17) {
            System.arraycopy(bArr, i11, bArr3, i16, i17);
            iProcessBlock = this.cipher.processBlock(this.buf, 0, bArr2, i13);
            this.bufOff = 0;
            i15 = i12 - i17;
            i14 = i11 + i17;
            MultiBlockCipher multiBlockCipher = this.mbCipher;
            if (multiBlockCipher != null) {
                int multiBlockSize = i15 / multiBlockCipher.getMultiBlockSize();
                if (multiBlockSize > 0) {
                    iProcessBlock += this.mbCipher.processBlocks(bArr, i14, multiBlockSize, bArr2, i13 + iProcessBlock);
                    int multiBlockSize2 = multiBlockSize * this.mbCipher.getMultiBlockSize();
                    i15 -= multiBlockSize2;
                    i14 += multiBlockSize2;
                }
            } else {
                while (i15 > this.buf.length) {
                    iProcessBlock += this.cipher.processBlock(bArr, i14, bArr2, i13 + iProcessBlock);
                    i15 -= blockSize;
                    i14 += blockSize;
                }
            }
        } else {
            i14 = i11;
            i15 = i12;
            iProcessBlock = 0;
        }
        System.arraycopy(bArr, i14, this.buf, this.bufOff, i15);
        int i18 = this.bufOff + i15;
        this.bufOff = i18;
        byte[] bArr4 = this.buf;
        if (i18 != bArr4.length) {
            return iProcessBlock;
        }
        int iProcessBlock2 = iProcessBlock + this.cipher.processBlock(bArr4, 0, bArr2, i13 + iProcessBlock);
        this.bufOff = 0;
        return iProcessBlock2;
    }

    public void reset() {
        int i11 = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i11 >= bArr.length) {
                this.bufOff = 0;
                this.cipher.reset();
                return;
            } else {
                bArr[i11] = 0;
                i11++;
            }
        }
    }

    public BufferedBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        if (blockCipher instanceof MultiBlockCipher) {
            MultiBlockCipher multiBlockCipher = (MultiBlockCipher) blockCipher;
            this.mbCipher = multiBlockCipher;
            this.buf = new byte[multiBlockCipher.getMultiBlockSize()];
        } else {
            this.mbCipher = null;
            this.buf = new byte[blockCipher.getBlockSize()];
        }
        boolean z11 = false;
        this.bufOff = 0;
        String algorithmName = blockCipher.getAlgorithmName();
        int iIndexOf = algorithmName.indexOf(47) + 1;
        boolean z12 = iIndexOf > 0 && algorithmName.startsWith("PGP", iIndexOf);
        this.pgpCFB = z12;
        if (z12 || (blockCipher instanceof StreamCipher)) {
            this.partialBlockOkay = true;
            return;
        }
        if (iIndexOf > 0 && algorithmName.startsWith("OpenPGP", iIndexOf)) {
            z11 = true;
        }
        this.partialBlockOkay = z11;
    }
}
