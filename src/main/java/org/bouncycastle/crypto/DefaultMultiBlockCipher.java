package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes9.dex */
public abstract class DefaultMultiBlockCipher implements MultiBlockCipher {
    protected DefaultMultiBlockCipher() {
    }

    @Override // org.bouncycastle.crypto.MultiBlockCipher
    public int getMultiBlockSize() {
        return getBlockSize();
    }

    @Override // org.bouncycastle.crypto.MultiBlockCipher
    public int processBlocks(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        int multiBlockSize = getMultiBlockSize();
        int iProcessBlock = 0;
        for (int i14 = 0; i14 != i12; i14++) {
            iProcessBlock += processBlock(bArr, i11, bArr2, i13 + iProcessBlock);
            i11 += multiBlockSize;
        }
        return iProcessBlock;
    }
}
