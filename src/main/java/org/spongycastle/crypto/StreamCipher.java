package org.spongycastle.crypto;

/* JADX INFO: loaded from: classes10.dex */
public interface StreamCipher {
    String getAlgorithmName();

    void init(boolean z11, CipherParameters cipherParameters);

    int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13);

    void reset();

    byte returnByte(byte b11);
}
