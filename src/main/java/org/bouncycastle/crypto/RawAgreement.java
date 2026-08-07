package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes9.dex */
public interface RawAgreement {
    void calculateAgreement(CipherParameters cipherParameters, byte[] bArr, int i11);

    int getAgreementSize();

    void init(CipherParameters cipherParameters);
}
