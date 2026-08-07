package org.spongycastle.operator;

import org.spongycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes10.dex */
public interface KeyWrapper {
    byte[] generateWrappedKey(GenericKey genericKey);

    AlgorithmIdentifier getAlgorithmIdentifier();
}
