package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes9.dex */
public class ElGamalParameters implements CipherParameters {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f98797g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f98798l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f98799p;

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ElGamalParameters)) {
            return false;
        }
        ElGamalParameters elGamalParameters = (ElGamalParameters) obj;
        return elGamalParameters.getP().equals(this.f98799p) && elGamalParameters.getG().equals(this.f98797g) && elGamalParameters.getL() == this.f98798l;
    }

    public BigInteger getG() {
        return this.f98797g;
    }

    public int getL() {
        return this.f98798l;
    }

    public BigInteger getP() {
        return this.f98799p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) + this.f98798l;
    }

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2, int i11) {
        this.f98797g = bigInteger2;
        this.f98799p = bigInteger;
        this.f98798l = i11;
    }
}
