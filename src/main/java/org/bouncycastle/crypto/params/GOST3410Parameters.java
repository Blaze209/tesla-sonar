package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes9.dex */
public class GOST3410Parameters implements CipherParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f98802a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f98803p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f98804q;
    private GOST3410ValidationParameters validation;

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f98803p = bigInteger;
        this.f98804q = bigInteger2;
        this.f98802a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410Parameters)) {
            return false;
        }
        GOST3410Parameters gOST3410Parameters = (GOST3410Parameters) obj;
        return gOST3410Parameters.getP().equals(this.f98803p) && gOST3410Parameters.getQ().equals(this.f98804q) && gOST3410Parameters.getA().equals(this.f98802a);
    }

    public BigInteger getA() {
        return this.f98802a;
    }

    public BigInteger getP() {
        return this.f98803p;
    }

    public BigInteger getQ() {
        return this.f98804q;
    }

    public GOST3410ValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (this.f98803p.hashCode() ^ this.f98804q.hashCode()) ^ this.f98802a.hashCode();
    }

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, GOST3410ValidationParameters gOST3410ValidationParameters) {
        this.f98802a = bigInteger3;
        this.f98803p = bigInteger;
        this.f98804q = bigInteger2;
        this.validation = gOST3410ValidationParameters;
    }
}
