package org.spongycastle.crypto.prng.drbg;

/* JADX INFO: loaded from: classes10.dex */
public interface SP80090DRBG {
    int generate(byte[] bArr, byte[] bArr2, boolean z11);

    int getBlockSize();

    void reseed(byte[] bArr);
}
