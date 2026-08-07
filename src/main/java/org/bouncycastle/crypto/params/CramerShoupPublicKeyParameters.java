package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class CramerShoupPublicKeyParameters extends CramerShoupKeyParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BigInteger f98775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BigInteger f98776d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BigInteger f98777h;

    public CramerShoupPublicKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(false, cramerShoupParameters);
        this.f98775c = bigInteger;
        this.f98776d = bigInteger2;
        this.f98777h = bigInteger3;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPublicKeyParameters)) {
            return false;
        }
        CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (CramerShoupPublicKeyParameters) obj;
        return cramerShoupPublicKeyParameters.getC().equals(this.f98775c) && cramerShoupPublicKeyParameters.getD().equals(this.f98776d) && cramerShoupPublicKeyParameters.getH().equals(this.f98777h) && super.equals(obj);
    }

    public BigInteger getC() {
        return this.f98775c;
    }

    public BigInteger getD() {
        return this.f98776d;
    }

    public BigInteger getH() {
        return this.f98777h;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((this.f98775c.hashCode() ^ this.f98776d.hashCode()) ^ this.f98777h.hashCode()) ^ super.hashCode();
    }
}
