package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes9.dex */
public class ElGamalParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f98895g;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f98896p;

    public ElGamalParameterSpec(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f98896p = bigInteger;
        this.f98895g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f98895g;
    }

    public BigInteger getP() {
        return this.f98896p;
    }
}
