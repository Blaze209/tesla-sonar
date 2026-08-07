package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes10.dex */
public class TEAEngine implements BlockCipher {
    private static final int block_size = 8;
    private static final int d_sum = -957401312;
    private static final int delta = -1640531527;
    private static final int rounds = 32;
    private int _a;
    private int _b;
    private int _c;
    private int _d;
    private boolean _forEncryption;
    private boolean _initialised = false;

    private int bytesToInt(byte[] bArr, int i11) {
        int i12 = ((bArr[i11 + 1] & 255) << 16) | (bArr[i11] << 24);
        return (bArr[i11 + 3] & 255) | i12 | ((bArr[i11 + 2] & 255) << 8);
    }

    private int decryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int iBytesToInt = bytesToInt(bArr, i11);
        int iBytesToInt2 = bytesToInt(bArr, i11 + 4);
        int i13 = d_sum;
        for (int i14 = 0; i14 != 32; i14++) {
            iBytesToInt2 -= (((iBytesToInt << 4) + this._c) ^ (iBytesToInt + i13)) ^ ((iBytesToInt >>> 5) + this._d);
            iBytesToInt -= (((iBytesToInt2 << 4) + this._a) ^ (iBytesToInt2 + i13)) ^ ((iBytesToInt2 >>> 5) + this._b);
            i13 += 1640531527;
        }
        unpackInt(iBytesToInt, bArr2, i12);
        unpackInt(iBytesToInt2, bArr2, i12 + 4);
        return 8;
    }

    private int encryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int iBytesToInt = bytesToInt(bArr, i11);
        int iBytesToInt2 = bytesToInt(bArr, i11 + 4);
        int i13 = iBytesToInt;
        int i14 = 0;
        for (int i15 = 0; i15 != 32; i15++) {
            i14 -= 1640531527;
            i13 += (((iBytesToInt2 << 4) + this._a) ^ (iBytesToInt2 + i14)) ^ ((iBytesToInt2 >>> 5) + this._b);
            iBytesToInt2 += (((i13 << 4) + this._c) ^ (i13 + i14)) ^ ((i13 >>> 5) + this._d);
        }
        unpackInt(i13, bArr2, i12);
        unpackInt(iBytesToInt2, bArr2, i12 + 4);
        return 8;
    }

    private void setKey(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("Key size must be 128 bits.");
        }
        this._a = bytesToInt(bArr, 0);
        this._b = bytesToInt(bArr, 4);
        this._c = bytesToInt(bArr, 8);
        this._d = bytesToInt(bArr, 12);
    }

    private void unpackInt(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) (i11 >>> 24);
        bArr[i12 + 1] = (byte) (i11 >>> 16);
        bArr[i12 + 2] = (byte) (i11 >>> 8);
        bArr[i12 + 3] = (byte) i11;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "TEA";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this._forEncryption = z11;
            this._initialised = true;
            setKey(((KeyParameter) cipherParameters).getKey());
        } else {
            throw new IllegalArgumentException("invalid parameter passed to TEA init - " + cipherParameters.getClass().getName());
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (!this._initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i11 + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 + 8 <= bArr2.length) {
            return this._forEncryption ? encryptBlock(bArr, i11, bArr2, i12) : decryptBlock(bArr, i11, bArr2, i12);
        }
        throw new OutputLengthException("output buffer too short");
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}
