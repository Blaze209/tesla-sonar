package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes10.dex */
public class GOST3410Parameters implements CipherParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f99585a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f99586p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f99587q;
    private GOST3410ValidationParameters validation;

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f99586p = bigInteger;
        this.f99587q = bigInteger2;
        this.f99585a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410Parameters)) {
            return false;
        }
        GOST3410Parameters gOST3410Parameters = (GOST3410Parameters) obj;
        return gOST3410Parameters.getP().equals(this.f99586p) && gOST3410Parameters.getQ().equals(this.f99587q) && gOST3410Parameters.getA().equals(this.f99585a);
    }

    public BigInteger getA() {
        return this.f99585a;
    }

    public BigInteger getP() {
        return this.f99586p;
    }

    public BigInteger getQ() {
        return this.f99587q;
    }

    public GOST3410ValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (this.f99586p.hashCode() ^ this.f99587q.hashCode()) ^ this.f99585a.hashCode();
    }

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, GOST3410ValidationParameters gOST3410ValidationParameters) {
        this.f99585a = bigInteger3;
        this.f99586p = bigInteger;
        this.f99587q = bigInteger2;
        this.validation = gOST3410ValidationParameters;
    }
}
