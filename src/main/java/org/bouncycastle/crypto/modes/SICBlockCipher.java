package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
public class SICBlockCipher extends StreamBlockCipher implements CTRModeCipher {
    private byte[] IV;
    private final int blockSize;
    private int byteCount;
    private final BlockCipher cipher;
    private byte[] counter;
    private byte[] counterOut;

    public SICBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.IV = new byte[blockSize];
        this.counter = new byte[blockSize];
        this.counterOut = new byte[blockSize];
        this.byteCount = 0;
    }

    private void adjustCounter(long j11) {
        int i11 = 5;
        if (j11 >= 0) {
            long j12 = (((long) this.byteCount) + j11) / ((long) this.blockSize);
            long j13 = j12;
            if (j12 > 255) {
                while (i11 >= 1) {
                    long j14 = 1 << (i11 * 8);
                    while (j13 >= j14) {
                        incrementCounterAt(i11);
                        j13 -= j14;
                    }
                    i11--;
                }
            }
            incrementCounter((int) j13);
            this.byteCount = (int) ((j11 + ((long) this.byteCount)) - (((long) this.blockSize) * j12));
            return;
        }
        long j15 = ((-j11) - ((long) this.byteCount)) / ((long) this.blockSize);
        long j16 = j15;
        if (j15 > 255) {
            while (i11 >= 1) {
                long j17 = 1 << (i11 * 8);
                while (j16 > j17) {
                    decrementCounterAt(i11);
                    j16 -= j17;
                }
                i11--;
            }
        }
        for (long j18 = 0; j18 != j16; j18++) {
            decrementCounterAt(0);
        }
        int i12 = (int) (((long) this.byteCount) + j11 + (((long) this.blockSize) * j15));
        if (i12 >= 0) {
            this.byteCount = 0;
        } else {
            decrementCounterAt(0);
            this.byteCount = this.blockSize + i12;
        }
    }

    private void checkCounter() {
        byte[] bArr = this.IV;
        if (bArr.length < this.blockSize) {
            for (int length = bArr.length - 1; length >= 0; length--) {
                if (this.counter[length] != this.IV[length]) {
                    throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
                }
            }
        }
    }

    private void checkLastIncrement() {
        byte[] bArr = this.IV;
        if (bArr.length < this.blockSize && this.counter[bArr.length - 1] != bArr[bArr.length - 1]) {
            throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
        }
    }

    private void decrementCounterAt(int i11) {
        byte b11;
        int length = this.counter.length - i11;
        do {
            length--;
            if (length < 0) {
                return;
            }
            byte[] bArr = this.counter;
            b11 = (byte) (bArr[length] - 1);
            bArr[length] = b11;
        } while (b11 == -1);
    }

    private void incrementCounter() {
        byte b11;
        int length = this.counter.length;
        do {
            length--;
            if (length < 0) {
                return;
            }
            byte[] bArr = this.counter;
            b11 = (byte) (bArr[length] + 1);
            bArr[length] = b11;
        } while (b11 == 0);
    }

    private void incrementCounterAt(int i11) {
        byte b11;
        int length = this.counter.length - i11;
        do {
            length--;
            if (length < 0) {
                return;
            }
            byte[] bArr = this.counter;
            b11 = (byte) (bArr[length] + 1);
            bArr[length] = b11;
        } while (b11 == 0);
    }

    public static CTRModeCipher newInstance(BlockCipher blockCipher) {
        return new SICBlockCipher(blockCipher);
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    protected byte calculateByte(byte b11) {
        int i11 = this.byteCount;
        if (i11 == 0) {
            checkLastIncrement();
            this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
            byte[] bArr = this.counterOut;
            int i12 = this.byteCount;
            this.byteCount = i12 + 1;
            return (byte) (b11 ^ bArr[i12]);
        }
        byte[] bArr2 = this.counterOut;
        int i13 = i11 + 1;
        this.byteCount = i13;
        byte b12 = (byte) (b11 ^ bArr2[i11]);
        if (i13 == this.counter.length) {
            this.byteCount = 0;
            incrementCounter();
        }
        return b12;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/SIC";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long getPosition() {
        byte[] bArr = this.counter;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        int i11 = length - 1;
        while (i11 >= 1) {
            byte[] bArr3 = this.IV;
            int i12 = i11 < bArr3.length ? (bArr2[i11] & 255) - (bArr3[i11] & 255) : bArr2[i11] & 255;
            if (i12 < 0) {
                int i13 = i11 - 1;
                bArr2[i13] = (byte) (bArr2[i13] - 1);
                i12 += 256;
            }
            bArr2[i11] = (byte) i12;
            i11--;
        }
        return (Pack.bigEndianToLong(bArr2, length - 8) * ((long) this.blockSize)) + ((long) this.byteCount);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] bArrClone = Arrays.clone(parametersWithIV.getIV());
        this.IV = bArrClone;
        int i11 = this.blockSize;
        if (i11 < bArrClone.length) {
            throw new IllegalArgumentException("CTR/SIC mode requires IV no greater than: " + this.blockSize + " bytes.");
        }
        int i12 = 8 > i11 / 2 ? i11 / 2 : 8;
        if (i11 - bArrClone.length <= i12) {
            if (parametersWithIV.getParameters() != null) {
                this.cipher.init(true, parametersWithIV.getParameters());
            }
            reset();
        } else {
            throw new IllegalArgumentException("CTR/SIC mode requires IV of at least: " + (this.blockSize - i12) + " bytes.");
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        SICBlockCipher sICBlockCipher;
        if (this.byteCount != 0) {
            sICBlockCipher = this;
            sICBlockCipher.processBytes(bArr, i11, this.blockSize, bArr2, i12);
        } else {
            sICBlockCipher = this;
            int i13 = sICBlockCipher.blockSize;
            if (i11 + i13 > bArr.length) {
                throw new DataLengthException("input buffer too small");
            }
            if (i12 + i13 > bArr2.length) {
                throw new OutputLengthException("output buffer too short");
            }
            sICBlockCipher.cipher.processBlock(sICBlockCipher.counter, 0, sICBlockCipher.counterOut, 0);
            for (int i14 = 0; i14 < sICBlockCipher.blockSize; i14++) {
                bArr2[i12 + i14] = (byte) (bArr[i11 + i14] ^ sICBlockCipher.counterOut[i14]);
            }
            incrementCounter();
        }
        return sICBlockCipher.blockSize;
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher, org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        byte b11;
        if (i11 + i12 > bArr.length) {
            throw new DataLengthException("input buffer too small");
        }
        if (i13 + i12 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = this.byteCount;
            if (i15 == 0) {
                checkLastIncrement();
                this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
                byte b12 = bArr[i11 + i14];
                byte[] bArr3 = this.counterOut;
                int i16 = this.byteCount;
                this.byteCount = i16 + 1;
                b11 = (byte) (b12 ^ bArr3[i16]);
            } else {
                byte b13 = bArr[i11 + i14];
                byte[] bArr4 = this.counterOut;
                int i17 = i15 + 1;
                this.byteCount = i17;
                b11 = (byte) (bArr4[i15] ^ b13);
                if (i17 == this.counter.length) {
                    this.byteCount = 0;
                    incrementCounter();
                }
            }
            bArr2[i13 + i14] = b11;
        }
        return i12;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        Arrays.fill(this.counter, (byte) 0);
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.counter, 0, bArr.length);
        this.cipher.reset();
        this.byteCount = 0;
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long seekTo(long j11) {
        reset();
        return skip(j11);
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long skip(long j11) {
        adjustCounter(j11);
        checkCounter();
        this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
        return j11;
    }

    private void incrementCounter(int i11) {
        byte[] bArr = this.counter;
        byte b11 = bArr[bArr.length - 1];
        int length = bArr.length - 1;
        bArr[length] = (byte) (bArr[length] + i11);
        if (b11 == 0 || bArr[bArr.length - 1] >= b11) {
            return;
        }
        incrementCounterAt(1);
    }
}
