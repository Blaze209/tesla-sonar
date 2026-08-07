package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public class RSAPrivateCrtKeyParameters extends RSAKeyParameters {
    private BigInteger dP;
    private BigInteger dQ;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BigInteger f99603e;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f99604p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f99605q;
    private BigInteger qInv;

    public RSAPrivateCrtKeyParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        super(true, bigInteger, bigInteger3);
        this.f99603e = bigInteger2;
        this.f99604p = bigInteger4;
        this.f99605q = bigInteger5;
        this.dP = bigInteger6;
        this.dQ = bigInteger7;
        this.qInv = bigInteger8;
    }

    public BigInteger getDP() {
        return this.dP;
    }

    public BigInteger getDQ() {
        return this.dQ;
    }

    public BigInteger getP() {
        return this.f99604p;
    }

    public BigInteger getPublicExponent() {
        return this.f99603e;
    }

    public BigInteger getQ() {
        return this.f99605q;
    }

    public BigInteger getQInv() {
        return this.qInv;
    }
}
