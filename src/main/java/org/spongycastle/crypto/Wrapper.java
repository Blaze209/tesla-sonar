package org.spongycastle.crypto;

/* JADX INFO: loaded from: classes10.dex */
public interface Wrapper {
    String getAlgorithmName();

    void init(boolean z11, CipherParameters cipherParameters);

    byte[] unwrap(byte[] bArr, int i11, int i12);

    byte[] wrap(byte[] bArr, int i11, int i12);
}
