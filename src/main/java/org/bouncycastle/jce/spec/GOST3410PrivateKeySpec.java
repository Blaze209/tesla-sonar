package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes9.dex */
public class GOST3410PrivateKeySpec implements KeySpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f98899a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f98900p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f98901q;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private BigInteger f98902x;

    public GOST3410PrivateKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f98902x = bigInteger;
        this.f98900p = bigInteger2;
        this.f98901q = bigInteger3;
        this.f98899a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f98899a;
    }

    public BigInteger getP() {
        return this.f98900p;
    }

    public BigInteger getQ() {
        return this.f98901q;
    }

    public BigInteger getX() {
        return this.f98902x;
    }
}
