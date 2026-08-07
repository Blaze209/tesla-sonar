package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DefaultBufferedBlockCipher;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
public class KXTSBlockCipher extends DefaultBufferedBlockCipher {
    private static final long RED_POLY_128 = 135;
    private static final long RED_POLY_256 = 1061;
    private static final long RED_POLY_512 = 293;
    private final int blockSize;
    private int counter;
    private final long reductionPolynomial;
    private final long[] tw_current;
    private final long[] tw_init;

    public KXTSBlockCipher(BlockCipher blockCipher) {
        ((DefaultBufferedBlockCipher) this).cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.reductionPolynomial = getReductionPolynomial(blockSize);
        this.tw_init = new long[blockSize >>> 3];
        this.tw_current = new long[blockSize >>> 3];
        this.counter = -1;
    }

    private static void GF_double(long j11, long[] jArr) {
        long j12 = 0;
        int i11 = 0;
        while (i11 < jArr.length) {
            long j13 = jArr[i11];
            jArr[i11] = j12 ^ (j13 << 1);
            i11++;
            j12 = j13 >>> 63;
        }
        jArr[0] = (j11 & (-j12)) ^ jArr[0];
    }

    protected static long getReductionPolynomial(int i11) {
        if (i11 == 16) {
            return RED_POLY_128;
        }
        if (i11 == 32) {
            return RED_POLY_256;
        }
        if (i11 == 64) {
            return RED_POLY_512;
        }
        throw new IllegalArgumentException("Only 128, 256, and 512 -bit block sizes supported");
    }

    private void processBlocks(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = this.counter;
        if (i13 == -1) {
            throw new IllegalStateException("Attempt to process too many blocks");
        }
        this.counter = i13 + 1;
        GF_double(this.reductionPolynomial, this.tw_current);
        byte[] bArr3 = new byte[this.blockSize];
        Pack.longToLittleEndian(this.tw_current, bArr3, 0);
        int i14 = this.blockSize;
        byte[] bArr4 = new byte[i14];
        System.arraycopy(bArr3, 0, bArr4, 0, i14);
        for (int i15 = 0; i15 < this.blockSize; i15++) {
            bArr4[i15] = (byte) (bArr4[i15] ^ bArr[i11 + i15]);
        }
        ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr4, 0, bArr4, 0);
        for (int i16 = 0; i16 < this.blockSize; i16++) {
            bArr2[i12 + i16] = (byte) (bArr4[i16] ^ bArr3[i16]);
        }
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i11) {
        reset();
        return 0;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i11) {
        return i11;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i11) {
        return i11;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("Invalid parameters passed");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        CipherParameters parameters = parametersWithIV.getParameters();
        byte[] iv2 = parametersWithIV.getIV();
        int length = iv2.length;
        int i11 = this.blockSize;
        if (length != i11) {
            throw new IllegalArgumentException("Currently only support IVs of exactly one block");
        }
        byte[] bArr = new byte[i11];
        System.arraycopy(iv2, 0, bArr, 0, i11);
        ((DefaultBufferedBlockCipher) this).cipher.init(true, parameters);
        ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr, 0, bArr, 0);
        ((DefaultBufferedBlockCipher) this).cipher.init(z11, parameters);
        Pack.littleEndianToLong(bArr, 0, this.tw_init);
        long[] jArr = this.tw_init;
        System.arraycopy(jArr, 0, this.tw_current, 0, jArr.length);
        this.counter = 0;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b11, byte[] bArr, int i11) {
        throw new IllegalStateException("unsupported operation");
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (bArr.length - i11 < i12) {
            throw new DataLengthException("Input buffer too short");
        }
        if (bArr2.length - i11 < i12) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (i12 % this.blockSize != 0) {
            throw new IllegalArgumentException("Partial blocks not supported");
        }
        int i14 = 0;
        while (i14 < i12) {
            processBlocks(bArr, i11 + i14, bArr2, i13 + i14);
            i14 += this.blockSize;
        }
        return i12;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public void reset() {
        ((DefaultBufferedBlockCipher) this).cipher.reset();
        long[] jArr = this.tw_init;
        System.arraycopy(jArr, 0, this.tw_current, 0, jArr.length);
        this.counter = 0;
    }
}
