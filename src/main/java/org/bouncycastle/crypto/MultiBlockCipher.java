package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes9.dex */
public interface MultiBlockCipher extends BlockCipher {
    int getMultiBlockSize();

    int processBlocks(byte[] bArr, int i11, int i12, byte[] bArr2, int i13);
}
