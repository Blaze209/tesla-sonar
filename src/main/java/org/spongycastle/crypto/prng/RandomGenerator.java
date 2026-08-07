package org.spongycastle.crypto.prng;

/* JADX INFO: loaded from: classes10.dex */
public interface RandomGenerator {
    void addSeedMaterial(long j11);

    void addSeedMaterial(byte[] bArr);

    void nextBytes(byte[] bArr);

    void nextBytes(byte[] bArr, int i11, int i12);
}
