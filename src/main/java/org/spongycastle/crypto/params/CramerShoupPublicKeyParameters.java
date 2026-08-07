package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public class CramerShoupPublicKeyParameters extends CramerShoupKeyParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BigInteger f99559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BigInteger f99560d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BigInteger f99561h;

    public CramerShoupPublicKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(false, cramerShoupParameters);
        this.f99559c = bigInteger;
        this.f99560d = bigInteger2;
        this.f99561h = bigInteger3;
    }

    @Override // org.spongycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPublicKeyParameters)) {
            return false;
        }
        CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (CramerShoupPublicKeyParameters) obj;
        return cramerShoupPublicKeyParameters.getC().equals(this.f99559c) && cramerShoupPublicKeyParameters.getD().equals(this.f99560d) && cramerShoupPublicKeyParameters.getH().equals(this.f99561h) && super.equals(obj);
    }

    public BigInteger getC() {
        return this.f99559c;
    }

    public BigInteger getD() {
        return this.f99560d;
    }

    public BigInteger getH() {
        return this.f99561h;
    }

    @Override // org.spongycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((this.f99559c.hashCode() ^ this.f99560d.hashCode()) ^ this.f99561h.hashCode()) ^ super.hashCode();
    }
}
