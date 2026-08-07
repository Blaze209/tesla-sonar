package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes9.dex */
public abstract class StreamBlockCipher extends DefaultMultiBlockCipher implements StreamCipher {
    private final BlockCipher cipher;

    protected StreamBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
    }

    protected abstract byte calculateByte(byte b11);

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        int i14 = i11 + i12;
        if (i14 > bArr.length) {
            throw new DataLengthException("input buffer too small");
        }
        if (i13 + i12 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        while (i11 < i14) {
            bArr2[i13] = calculateByte(bArr[i11]);
            i13++;
            i11++;
        }
        return i12;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public final byte returnByte(byte b11) {
        return calculateByte(b11);
    }
}
