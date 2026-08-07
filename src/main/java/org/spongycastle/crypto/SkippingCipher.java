package org.spongycastle.crypto;

/* JADX INFO: loaded from: classes10.dex */
public interface SkippingCipher {
    long getPosition();

    long seekTo(long j11);

    long skip(long j11);
}
