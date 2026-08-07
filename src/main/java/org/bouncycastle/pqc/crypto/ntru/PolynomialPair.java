package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.pqc.math.ntru.Polynomial;

/* JADX INFO: loaded from: classes10.dex */
class PolynomialPair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Polynomial f99129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Polynomial f99130b;

    public PolynomialPair(Polynomial polynomial, Polynomial polynomial2) {
        this.f99129a = polynomial;
        this.f99130b = polynomial2;
    }

    public Polynomial f() {
        return this.f99129a;
    }

    public Polynomial g() {
        return this.f99130b;
    }

    public Polynomial m() {
        return this.f99130b;
    }

    public Polynomial r() {
        return this.f99129a;
    }
}
