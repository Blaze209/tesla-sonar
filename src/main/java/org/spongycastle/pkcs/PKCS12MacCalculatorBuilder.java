package org.spongycastle.pkcs;

import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.operator.MacCalculator;

/* JADX INFO: loaded from: classes10.dex */
public interface PKCS12MacCalculatorBuilder {
    MacCalculator build(char[] cArr);

    AlgorithmIdentifier getDigestAlgorithmIdentifier();
}
