package org.spongycastle.jce.spec;

import org.spongycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes10.dex */
public class ECPublicKeySpec extends ECKeySpec {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ECPoint f99660q;

    public ECPublicKeySpec(ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        super(eCParameterSpec);
        if (eCPoint.getCurve() != null) {
            this.f99660q = eCPoint.normalize();
        } else {
            this.f99660q = eCPoint;
        }
    }

    public ECPoint getQ() {
        return this.f99660q;
    }
}
