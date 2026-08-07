package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes9.dex */
public interface BlockCipher {
    String getAlgorithmName();

    int getBlockSize();

    void init(boolean z11, CipherParameters cipherParameters);

    int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12);

    void reset();
}
