package org.spongycastle.crypto;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public interface DSA {
    BigInteger[] generateSignature(byte[] bArr);

    void init(boolean z11, CipherParameters cipherParameters);

    boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2);
}
