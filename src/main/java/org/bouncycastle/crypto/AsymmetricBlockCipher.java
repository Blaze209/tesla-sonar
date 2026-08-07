package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes9.dex */
public interface AsymmetricBlockCipher {
    int getInputBlockSize();

    int getOutputBlockSize();

    void init(boolean z11, CipherParameters cipherParameters);

    byte[] processBlock(byte[] bArr, int i11, int i12);
}
