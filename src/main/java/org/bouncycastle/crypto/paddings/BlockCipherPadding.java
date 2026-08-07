package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes9.dex */
public interface BlockCipherPadding {
    int addPadding(byte[] bArr, int i11);

    String getPaddingName();

    void init(SecureRandom secureRandom);

    int padCount(byte[] bArr);
}
