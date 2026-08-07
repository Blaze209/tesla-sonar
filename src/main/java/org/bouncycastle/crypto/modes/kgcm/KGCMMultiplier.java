package org.bouncycastle.crypto.modes.kgcm;

/* JADX INFO: loaded from: classes9.dex */
public interface KGCMMultiplier {
    void init(long[] jArr);

    void multiplyH(long[] jArr);
}
