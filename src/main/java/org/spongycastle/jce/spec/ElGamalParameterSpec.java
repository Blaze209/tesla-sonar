package org.spongycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes10.dex */
public class ElGamalParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f99661g;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f99662p;

    public ElGamalParameterSpec(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f99662p = bigInteger;
        this.f99661g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f99661g;
    }

    public BigInteger getP() {
        return this.f99662p;
    }
}
