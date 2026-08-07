package org.spongycastle.crypto;

/* JADX INFO: loaded from: classes10.dex */
public interface AsymmetricBlockCipher {
    int getInputBlockSize();

    int getOutputBlockSize();

    void init(boolean z11, CipherParameters cipherParameters);

    byte[] processBlock(byte[] bArr, int i11, int i12);
}
