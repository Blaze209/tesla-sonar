package org.spongycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes10.dex */
public class GOST3410PrivateKeySpec implements KeySpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f99665a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f99666p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f99667q;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private BigInteger f99668x;

    public GOST3410PrivateKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f99668x = bigInteger;
        this.f99666p = bigInteger2;
        this.f99667q = bigInteger3;
        this.f99665a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f99665a;
    }

    public BigInteger getP() {
        return this.f99666p;
    }

    public BigInteger getQ() {
        return this.f99667q;
    }

    public BigInteger getX() {
        return this.f99668x;
    }
}
