package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes9.dex */
public interface SkippingCipher {
    long getPosition();

    long seekTo(long j11);

    long skip(long j11);
}
