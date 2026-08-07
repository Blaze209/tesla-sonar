package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes9.dex */
public class GOST3410PublicKeySpec implements KeySpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f98906a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f98907p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f98908q;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private BigInteger f98909y;

    public GOST3410PublicKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f98909y = bigInteger;
        this.f98907p = bigInteger2;
        this.f98908q = bigInteger3;
        this.f98906a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f98906a;
    }

    public BigInteger getP() {
        return this.f98907p;
    }

    public BigInteger getQ() {
        return this.f98908q;
    }

    public BigInteger getY() {
        return this.f98909y;
    }
}
