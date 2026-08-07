package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class CramerShoupPrivateKeyParameters extends CramerShoupKeyParameters {

    /* JADX INFO: renamed from: pk, reason: collision with root package name */
    private CramerShoupPublicKeyParameters f98769pk;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private BigInteger f98770x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private BigInteger f98771x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private BigInteger f98772y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private BigInteger f98773y2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private BigInteger f98774z;

    public CramerShoupPrivateKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        super(true, cramerShoupParameters);
        this.f98770x1 = bigInteger;
        this.f98771x2 = bigInteger2;
        this.f98772y1 = bigInteger3;
        this.f98773y2 = bigInteger4;
        this.f98774z = bigInteger5;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPrivateKeyParameters)) {
            return false;
        }
        CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParameters = (CramerShoupPrivateKeyParameters) obj;
        return cramerShoupPrivateKeyParameters.getX1().equals(this.f98770x1) && cramerShoupPrivateKeyParameters.getX2().equals(this.f98771x2) && cramerShoupPrivateKeyParameters.getY1().equals(this.f98772y1) && cramerShoupPrivateKeyParameters.getY2().equals(this.f98773y2) && cramerShoupPrivateKeyParameters.getZ().equals(this.f98774z) && super.equals(obj);
    }

    public CramerShoupPublicKeyParameters getPk() {
        return this.f98769pk;
    }

    public BigInteger getX1() {
        return this.f98770x1;
    }

    public BigInteger getX2() {
        return this.f98771x2;
    }

    public BigInteger getY1() {
        return this.f98772y1;
    }

    public BigInteger getY2() {
        return this.f98773y2;
    }

    public BigInteger getZ() {
        return this.f98774z;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((((this.f98770x1.hashCode() ^ this.f98771x2.hashCode()) ^ this.f98772y1.hashCode()) ^ this.f98773y2.hashCode()) ^ this.f98774z.hashCode()) ^ super.hashCode();
    }

    public void setPk(CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters) {
        this.f98769pk = cramerShoupPublicKeyParameters;
    }
}
