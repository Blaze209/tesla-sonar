package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes10.dex */
public class DSAParameters implements CipherParameters {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f99572g;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f99573p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f99574q;
    private DSAValidationParameters validation;

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f99572g = bigInteger3;
        this.f99573p = bigInteger;
        this.f99574q = bigInteger2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAParameters)) {
            return false;
        }
        DSAParameters dSAParameters = (DSAParameters) obj;
        return dSAParameters.getP().equals(this.f99573p) && dSAParameters.getQ().equals(this.f99574q) && dSAParameters.getG().equals(this.f99572g);
    }

    public BigInteger getG() {
        return this.f99572g;
    }

    public BigInteger getP() {
        return this.f99573p;
    }

    public BigInteger getQ() {
        return this.f99574q;
    }

    public DSAValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getQ().hashCode()) ^ getG().hashCode();
    }

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, DSAValidationParameters dSAValidationParameters) {
        this.f99572g = bigInteger3;
        this.f99573p = bigInteger;
        this.f99574q = bigInteger2;
        this.validation = dSAValidationParameters;
    }
}
