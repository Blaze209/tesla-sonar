package org.bouncycastle.crypto.prng.drbg;

/* JADX INFO: loaded from: classes9.dex */
public interface SP80090DRBG {
    int generate(byte[] bArr, byte[] bArr2, boolean z11);

    int getBlockSize();

    void reseed(byte[] bArr);
}
