package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public class CramerShoupPrivateKeyParameters extends CramerShoupKeyParameters {

    /* JADX INFO: renamed from: pk, reason: collision with root package name */
    private CramerShoupPublicKeyParameters f99553pk;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private BigInteger f99554x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private BigInteger f99555x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private BigInteger f99556y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private BigInteger f99557y2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private BigInteger f99558z;

    public CramerShoupPrivateKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        super(true, cramerShoupParameters);
        this.f99554x1 = bigInteger;
        this.f99555x2 = bigInteger2;
        this.f99556y1 = bigInteger3;
        this.f99557y2 = bigInteger4;
        this.f99558z = bigInteger5;
    }

    @Override // org.spongycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPrivateKeyParameters)) {
            return false;
        }
        CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParameters = (CramerShoupPrivateKeyParameters) obj;
        return cramerShoupPrivateKeyParameters.getX1().equals(this.f99554x1) && cramerShoupPrivateKeyParameters.getX2().equals(this.f99555x2) && cramerShoupPrivateKeyParameters.getY1().equals(this.f99556y1) && cramerShoupPrivateKeyParameters.getY2().equals(this.f99557y2) && cramerShoupPrivateKeyParameters.getZ().equals(this.f99558z) && super.equals(obj);
    }

    public CramerShoupPublicKeyParameters getPk() {
        return this.f99553pk;
    }

    public BigInteger getX1() {
        return this.f99554x1;
    }

    public BigInteger getX2() {
        return this.f99555x2;
    }

    public BigInteger getY1() {
        return this.f99556y1;
    }

    public BigInteger getY2() {
        return this.f99557y2;
    }

    public BigInteger getZ() {
        return this.f99558z;
    }

    @Override // org.spongycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((((this.f99554x1.hashCode() ^ this.f99555x2.hashCode()) ^ this.f99556y1.hashCode()) ^ this.f99557y2.hashCode()) ^ this.f99558z.hashCode()) ^ super.hashCode();
    }

    public void setPk(CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters) {
        this.f99553pk = cramerShoupPublicKeyParameters;
    }
}
