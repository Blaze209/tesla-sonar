package org.spongycastle.jce.spec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public class GOST3410PublicKeyParameterSetSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f99669a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f99670p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f99671q;

    public GOST3410PublicKeyParameterSetSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f99670p = bigInteger;
        this.f99671q = bigInteger2;
        this.f99669a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GOST3410PublicKeyParameterSetSpec) {
            GOST3410PublicKeyParameterSetSpec gOST3410PublicKeyParameterSetSpec = (GOST3410PublicKeyParameterSetSpec) obj;
            if (this.f99669a.equals(gOST3410PublicKeyParameterSetSpec.f99669a) && this.f99670p.equals(gOST3410PublicKeyParameterSetSpec.f99670p) && this.f99671q.equals(gOST3410PublicKeyParameterSetSpec.f99671q)) {
                return true;
            }
        }
        return false;
    }

    public BigInteger getA() {
        return this.f99669a;
    }

    public BigInteger getP() {
        return this.f99670p;
    }

    public BigInteger getQ() {
        return this.f99671q;
    }

    public int hashCode() {
        return (this.f99669a.hashCode() ^ this.f99670p.hashCode()) ^ this.f99671q.hashCode();
    }
}
