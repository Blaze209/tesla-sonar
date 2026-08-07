package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public class NaccacheSternKeyParameters extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f99600g;
    int lowerSigmaBound;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private BigInteger f99601n;

    public NaccacheSternKeyParameters(boolean z11, BigInteger bigInteger, BigInteger bigInteger2, int i11) {
        super(z11);
        this.f99600g = bigInteger;
        this.f99601n = bigInteger2;
        this.lowerSigmaBound = i11;
    }

    public BigInteger getG() {
        return this.f99600g;
    }

    public int getLowerSigmaBound() {
        return this.lowerSigmaBound;
    }

    public BigInteger getModulus() {
        return this.f99601n;
    }
}
