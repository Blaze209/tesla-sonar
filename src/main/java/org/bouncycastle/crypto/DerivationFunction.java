package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes9.dex */
public interface DerivationFunction {
    int generateBytes(byte[] bArr, int i11, int i12);

    void init(DerivationParameters derivationParameters);
}
