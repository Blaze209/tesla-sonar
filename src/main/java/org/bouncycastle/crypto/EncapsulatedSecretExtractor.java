package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes9.dex */
public interface EncapsulatedSecretExtractor {
    byte[] extractSecret(byte[] bArr);

    int getEncapsulationLength();
}
