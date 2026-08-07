package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class SRP6GroupParameters {
    private BigInteger N;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f98824g;

    public SRP6GroupParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this.N = bigInteger;
        this.f98824g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f98824g;
    }

    public BigInteger getN() {
        return this.N;
    }
}
