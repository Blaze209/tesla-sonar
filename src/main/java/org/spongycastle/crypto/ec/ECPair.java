package org.spongycastle.crypto.ec;

import org.spongycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes10.dex */
public class ECPair {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ECPoint f99454x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ECPoint f99455y;

    public ECPair(ECPoint eCPoint, ECPoint eCPoint2) {
        this.f99454x = eCPoint;
        this.f99455y = eCPoint2;
    }

    public boolean equals(ECPair eCPair) {
        return eCPair.getX().equals(getX()) && eCPair.getY().equals(getY());
    }

    public ECPoint getX() {
        return this.f99454x;
    }

    public ECPoint getY() {
        return this.f99455y;
    }

    public int hashCode() {
        return this.f99454x.hashCode() + (this.f99455y.hashCode() * 37);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ECPair) {
            return equals((ECPair) obj);
        }
        return false;
    }
}
