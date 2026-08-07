package org.spongycastle.crypto;

/* JADX INFO: loaded from: classes10.dex */
public class BufferedBlockCipher {
    protected byte[] buf;
    protected int bufOff;
    protected BlockCipher cipher;
    protected boolean forEncryption;
    protected boolean partialBlockOkay;
    protected boolean pgpCFB;

    protected BufferedBlockCipher() {
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
        return i11 + this.bufOff;
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    public int getUpdateOutputSize(int i11) {
        int i12 = i11 + this.bufOff;
        int length = (this.pgpCFB && this.forEncryption) ? (i12 % this.buf.length) - (this.cipher.getBlockSize() + 2) : i12 % this.buf.length;
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
        int i14 = this.bufOff;
        int i15 = length - i14;
        if (i12 > i15) {
            System.arraycopy(bArr, i11, bArr3, i14, i15);
            iProcessBlock = this.cipher.processBlock(this.buf, 0, bArr2, i13);
            this.bufOff = 0;
            i12 -= i15;
            i11 += i15;
            while (i12 > this.buf.length) {
                iProcessBlock += this.cipher.processBlock(bArr, i11, bArr2, i13 + iProcessBlock);
                i12 -= blockSize;
                i11 += blockSize;
            }
        } else {
            iProcessBlock = 0;
        }
        System.arraycopy(bArr, i11, this.buf, this.bufOff, i12);
        int i16 = this.bufOff + i12;
        this.bufOff = i16;
        byte[] bArr4 = this.buf;
        if (i16 != bArr4.length) {
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
        this.buf = new byte[blockCipher.getBlockSize()];
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
