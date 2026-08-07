package org.bouncycastle.crypto.ec;

import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes9.dex */
public class ECPair {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ECPoint f98635x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ECPoint f98636y;

    public ECPair(ECPoint eCPoint, ECPoint eCPoint2) {
        this.f98635x = eCPoint;
        this.f98636y = eCPoint2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ECPair) {
            return equals((ECPair) obj);
        }
        return false;
    }

    public ECPoint getX() {
        return this.f98635x;
    }

    public ECPoint getY() {
        return this.f98636y;
    }

    public int hashCode() {
        return this.f98635x.hashCode() + (this.f98636y.hashCode() * 37);
    }

    public boolean equals(ECPair eCPair) {
        return eCPair.getX().equals(getX()) && eCPair.getY().equals(getY());
    }
}
