package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes9.dex */
public class DSAParameters implements CipherParameters {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f98788g;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f98789p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f98790q;
    private DSAValidationParameters validation;

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f98788g = bigInteger3;
        this.f98789p = bigInteger;
        this.f98790q = bigInteger2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAParameters)) {
            return false;
        }
        DSAParameters dSAParameters = (DSAParameters) obj;
        return dSAParameters.getP().equals(this.f98789p) && dSAParameters.getQ().equals(this.f98790q) && dSAParameters.getG().equals(this.f98788g);
    }

    public BigInteger getG() {
        return this.f98788g;
    }

    public BigInteger getP() {
        return this.f98789p;
    }

    public BigInteger getQ() {
        return this.f98790q;
    }

    public DSAValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getQ().hashCode()) ^ getG().hashCode();
    }

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, DSAValidationParameters dSAValidationParameters) {
        this.f98788g = bigInteger3;
        this.f98789p = bigInteger;
        this.f98790q = bigInteger2;
        this.validation = dSAValidationParameters;
    }
}
