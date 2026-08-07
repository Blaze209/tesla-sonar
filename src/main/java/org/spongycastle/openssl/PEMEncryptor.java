package org.spongycastle.openssl;

/* JADX INFO: loaded from: classes10.dex */
public interface PEMEncryptor {
    byte[] encrypt(byte[] bArr);

    String getAlgorithm();

    byte[] getIV();
}
