package org.bouncycastle.crypto.fpe;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.FPEParameters;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
public abstract class FPEEngine {
    protected final BlockCipher baseCipher;
    protected boolean forEncryption;
    protected FPEParameters fpeParameters;

    protected FPEEngine(BlockCipher blockCipher) {
        this.baseCipher = blockCipher;
    }

    protected static byte[] toByteArray(short[] sArr) {
        byte[] bArr = new byte[sArr.length * 2];
        for (int i11 = 0; i11 != sArr.length; i11++) {
            Pack.shortToBigEndian(sArr[i11], bArr, i11 * 2);
        }
        return bArr;
    }

    protected static short[] toShortArray(byte[] bArr) {
        if ((bArr.length & 1) != 0) {
            throw new IllegalArgumentException("data must be an even number of bytes for a wide radix");
        }
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i11 = 0; i11 != length; i11++) {
            sArr[i11] = Pack.bigEndianToShort(bArr, i11 * 2);
        }
        return sArr;
    }

    protected abstract int decryptBlock(byte[] bArr, int i11, int i12, byte[] bArr2, int i13);

    protected abstract int encryptBlock(byte[] bArr, int i11, int i12, byte[] bArr2, int i13);

    public abstract String getAlgorithmName();

    public abstract void init(boolean z11, CipherParameters cipherParameters);

    public int processBlock(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (this.fpeParameters == null) {
            throw new IllegalStateException("FPE engine not initialized");
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("input length cannot be negative");
        }
        if (bArr == null || bArr2 == null) {
            throw new NullPointerException("buffer value is null");
        }
        if (bArr.length < i11 + i12) {
            throw new DataLengthException("input buffer too short");
        }
        if (bArr2.length >= i13 + i12) {
            return this.forEncryption ? encryptBlock(bArr, i11, i12, bArr2, i13) : decryptBlock(bArr, i11, i12, bArr2, i13);
        }
        throw new OutputLengthException("output buffer too short");
    }
}
