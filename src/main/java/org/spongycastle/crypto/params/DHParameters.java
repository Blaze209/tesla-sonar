package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes10.dex */
public class DHParameters implements CipherParameters {
    private static final int DEFAULT_MINIMUM_LENGTH = 160;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f99562g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private BigInteger f99563j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f99564l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f99565m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f99566p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f99567q;
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
        return dHParameters.getP().equals(this.f99566p) && dHParameters.getG().equals(this.f99562g);
    }

    public BigInteger getG() {
        return this.f99562g;
    }

    public BigInteger getJ() {
        return this.f99563j;
    }

    public int getL() {
        return this.f99564l;
    }

    public int getM() {
        return this.f99565m;
    }

    public BigInteger getP() {
        return this.f99566p;
    }

    public BigInteger getQ() {
        return this.f99567q;
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

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, DHValidationParameters dHValidationParameters) {
        this(bigInteger, bigInteger2, bigInteger3, 160, 0, bigInteger4, dHValidationParameters);
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
        this.f99562g = bigInteger2;
        this.f99566p = bigInteger;
        this.f99567q = bigInteger3;
        this.f99565m = i11;
        this.f99564l = i12;
        this.f99563j = bigInteger4;
        this.validation = dHValidationParameters;
    }
}
