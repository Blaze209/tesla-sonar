package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Properties;

/* JADX INFO: loaded from: classes9.dex */
public class DHParameters implements CipherParameters {
    private static final int DEFAULT_MINIMUM_LENGTH = 160;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f98778g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private BigInteger f98779j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f98780l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f98781m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f98782p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f98783q;
    private DHValidationParameters validation;

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, null, 0);
    }

    private static int getDefaultMParam(int i11) {
        if (i11 != 0 && i11 < 160) {
            return i11;
        }
        return 160;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHParameters)) {
            return false;
        }
        DHParameters dHParameters = (DHParameters) obj;
        if (getQ() != null) {
            if (!getQ().equals(dHParameters.getQ())) {
                return false;
            }
        } else if (dHParameters.getQ() != null) {
            return false;
        }
        return dHParameters.getP().equals(this.f98782p) && dHParameters.getG().equals(this.f98778g);
    }

    public BigInteger getG() {
        return this.f98778g;
    }

    public BigInteger getJ() {
        return this.f98779j;
    }

    public int getL() {
        return this.f98780l;
    }

    public int getM() {
        return this.f98781m;
    }

    public BigInteger getP() {
        return this.f98782p;
    }

    public BigInteger getQ() {
        return this.f98783q;
    }

    public DHValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) ^ (getQ() != null ? getQ().hashCode() : 0);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, 0);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i11) {
        this(bigInteger, bigInteger2, bigInteger3, getDefaultMParam(i11), i11, null, null);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i11, int i12) {
        this(bigInteger, bigInteger2, bigInteger3, i11, i12, null, null);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i11, int i12, BigInteger bigInteger4, DHValidationParameters dHValidationParameters) {
        if (i12 != 0) {
            if (i12 > bigInteger.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (i12 < i11) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        if (i11 > bigInteger.bitLength() && !Properties.isOverrideSet("org.bouncycastle.dh.allow_unsafe_p_value")) {
            throw new IllegalArgumentException("unsafe p value so small specific l required");
        }
        this.f98778g = bigInteger2;
        this.f98782p = bigInteger;
        this.f98783q = bigInteger3;
        this.f98781m = i11;
        this.f98780l = i12;
        this.f98779j = bigInteger4;
        this.validation = dHValidationParameters;
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, DHValidationParameters dHValidationParameters) {
        this(bigInteger, bigInteger2, bigInteger3, 160, 0, bigInteger4, dHValidationParameters);
    }
}
