package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class GOST3410PublicKeyParameterSetSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f98903a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f98904p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f98905q;

    public GOST3410PublicKeyParameterSetSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f98904p = bigInteger;
        this.f98905q = bigInteger2;
        this.f98903a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GOST3410PublicKeyParameterSetSpec) {
            GOST3410PublicKeyParameterSetSpec gOST3410PublicKeyParameterSetSpec = (GOST3410PublicKeyParameterSetSpec) obj;
            if (this.f98903a.equals(gOST3410PublicKeyParameterSetSpec.f98903a) && this.f98904p.equals(gOST3410PublicKeyParameterSetSpec.f98904p) && this.f98905q.equals(gOST3410PublicKeyParameterSetSpec.f98905q)) {
                return true;
            }
        }
        return false;
    }

    public BigInteger getA() {
        return this.f98903a;
    }

    public BigInteger getP() {
        return this.f98904p;
    }

    public BigInteger getQ() {
        return this.f98905q;
    }

    public int hashCode() {
        return (this.f98903a.hashCode() ^ this.f98904p.hashCode()) ^ this.f98905q.hashCode();
    }
}
