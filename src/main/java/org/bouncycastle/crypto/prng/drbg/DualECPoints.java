package org.bouncycastle.crypto.prng.drbg;

import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes9.dex */
public class DualECPoints {
    private final int cofactor;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ECPoint f98827p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ECPoint f98828q;
    private final int securityStrength;

    public DualECPoints(int i11, ECPoint eCPoint, ECPoint eCPoint2, int i12) {
        if (!eCPoint.getCurve().equals(eCPoint2.getCurve())) {
            throw new IllegalArgumentException("points need to be on the same curve");
        }
        this.securityStrength = i11;
        this.f98827p = eCPoint;
        this.f98828q = eCPoint2;
        this.cofactor = i12;
    }

    private static int log2(int i11) {
        int i12 = 0;
        while (true) {
            i11 >>= 1;
            if (i11 == 0) {
                return i12;
            }
            i12++;
        }
    }

    public int getCofactor() {
        return this.cofactor;
    }

    public int getMaxOutlen() {
        return ((this.f98827p.getCurve().getFieldSize() - (log2(this.cofactor) + 13)) / 8) * 8;
    }

    public ECPoint getP() {
        return this.f98827p;
    }

    public ECPoint getQ() {
        return this.f98828q;
    }

    public int getSecurityStrength() {
        return this.securityStrength;
    }

    public int getSeedLen() {
        return this.f98827p.getCurve().getFieldSize();
    }
}
