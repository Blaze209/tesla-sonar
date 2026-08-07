package org.bouncycastle.jce.spec;

import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes9.dex */
public class ECPublicKeySpec extends ECKeySpec {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ECPoint f98894q;

    public ECPublicKeySpec(ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        super(eCParameterSpec);
        if (eCPoint.getCurve() != null) {
            this.f98894q = eCPoint.normalize();
        } else {
            this.f98894q = eCPoint;
        }
    }

    public ECPoint getQ() {
        return this.f98894q;
    }
}
