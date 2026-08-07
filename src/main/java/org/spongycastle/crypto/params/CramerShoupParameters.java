package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;

/* JADX INFO: loaded from: classes10.dex */
public class CramerShoupParameters implements CipherParameters {
    private Digest H;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private BigInteger f99550g1;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    private BigInteger f99551g2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f99552p;

    public CramerShoupParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest) {
        this.f99552p = bigInteger;
        this.f99550g1 = bigInteger2;
        this.f99551g2 = bigInteger3;
        this.H = digest;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAParameters)) {
            return false;
        }
        CramerShoupParameters cramerShoupParameters = (CramerShoupParameters) obj;
        return cramerShoupParameters.getP().equals(this.f99552p) && cramerShoupParameters.getG1().equals(this.f99550g1) && cramerShoupParameters.getG2().equals(this.f99551g2);
    }

    public BigInteger getG1() {
        return this.f99550g1;
    }

    public BigInteger getG2() {
        return this.f99551g2;
    }

    public Digest getH() {
        this.H.reset();
        return this.H;
    }

    public BigInteger getP() {
        return this.f99552p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG1().hashCode()) ^ getG2().hashCode();
    }
}
