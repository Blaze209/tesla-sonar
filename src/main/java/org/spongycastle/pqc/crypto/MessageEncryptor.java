package org.spongycastle.pqc.crypto;

import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes10.dex */
public interface MessageEncryptor {
    void init(boolean z11, CipherParameters cipherParameters);

    byte[] messageDecrypt(byte[] bArr);

    byte[] messageEncrypt(byte[] bArr);
}
