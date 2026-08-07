package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class NaccacheSternKeyParameters extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f98817g;
    int lowerSigmaBound;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private BigInteger f98818n;

    public NaccacheSternKeyParameters(boolean z11, BigInteger bigInteger, BigInteger bigInteger2, int i11) {
        super(z11);
        this.f98817g = bigInteger;
        this.f98818n = bigInteger2;
        this.lowerSigmaBound = i11;
    }

    public BigInteger getG() {
        return this.f98817g;
    }

    public int getLowerSigmaBound() {
        return this.lowerSigmaBound;
    }

    public BigInteger getModulus() {
        return this.f98818n;
    }
}
