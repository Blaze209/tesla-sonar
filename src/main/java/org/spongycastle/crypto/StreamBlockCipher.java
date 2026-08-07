package org.spongycastle.crypto;

/* JADX INFO: loaded from: classes10.dex */
public abstract class StreamBlockCipher implements BlockCipher, StreamCipher {
    private final BlockCipher cipher;

    protected StreamBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
    }

    protected abstract byte calculateByte(byte b11);

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (i13 + i12 > bArr2.length) {
            throw new DataLengthException("output buffer too short");
        }
        int i14 = i11 + i12;
        if (i14 > bArr.length) {
            throw new DataLengthException("input buffer too small");
        }
        while (i11 < i14) {
            bArr2[i13] = calculateByte(bArr[i11]);
            i13++;
            i11++;
        }
        return i12;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public final byte returnByte(byte b11) {
        return calculateByte(b11);
    }
}
