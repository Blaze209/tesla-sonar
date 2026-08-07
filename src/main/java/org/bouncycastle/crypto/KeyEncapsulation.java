package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes9.dex */
public interface KeyEncapsulation {
    CipherParameters decrypt(byte[] bArr, int i11, int i12, int i13);

    CipherParameters encrypt(byte[] bArr, int i11, int i12);

    void init(CipherParameters cipherParameters);
}
