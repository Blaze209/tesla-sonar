package org.spongycastle.crypto;

/* JADX INFO: loaded from: classes10.dex */
public interface Digest {
    int doFinal(byte[] bArr, int i11);

    String getAlgorithmName();

    int getDigestSize();

    void reset();

    void update(byte b11);

    void update(byte[] bArr, int i11, int i12);
}
