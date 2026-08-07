package org.spongycastle.crypto;

/* JADX INFO: loaded from: classes10.dex */
public interface DerivationFunction {
    int generateBytes(byte[] bArr, int i11, int i12);

    void init(DerivationParameters derivationParameters);
}
