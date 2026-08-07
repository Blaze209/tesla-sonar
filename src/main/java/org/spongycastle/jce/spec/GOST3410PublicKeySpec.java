package org.spongycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes10.dex */
public class GOST3410PublicKeySpec implements KeySpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f99672a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f99673p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f99674q;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private BigInteger f99675y;

    public GOST3410PublicKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f99675y = bigInteger;
        this.f99673p = bigInteger2;
        this.f99674q = bigInteger3;
        this.f99672a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f99672a;
    }

    public BigInteger getP() {
        return this.f99673p;
    }

    public BigInteger getQ() {
        return this.f99674q;
    }

    public BigInteger getY() {
        return this.f99675y;
    }
}
