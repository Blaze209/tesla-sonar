package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes10.dex */
public class ElGamalParameters implements CipherParameters {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f99580g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f99581l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f99582p;

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ElGamalParameters)) {
            return false;
        }
        ElGamalParameters elGamalParameters = (ElGamalParameters) obj;
        return elGamalParameters.getP().equals(this.f99582p) && elGamalParameters.getG().equals(this.f99580g) && elGamalParameters.getL() == this.f99581l;
    }

    public BigInteger getG() {
        return this.f99580g;
    }

    public int getL() {
        return this.f99581l;
    }

    public BigInteger getP() {
        return this.f99582p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) + this.f99581l;
    }

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2, int i11) {
        this.f99580g = bigInteger2;
        this.f99582p = bigInteger;
        this.f99581l = i11;
    }
}
