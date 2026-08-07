package org.bouncycastle.pqc.legacy.crypto.mceliece;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.legacy.math.linearalgebra.PolynomialRingGF2;

/* JADX INFO: loaded from: classes10.dex */
public class McElieceParameters implements CipherParameters {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    private Digest digest;
    private int fieldPoly;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f99236m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f99237n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f99238t;

    public McElieceParameters() {
        this(11, 50);
    }

    public int getFieldPoly() {
        return this.fieldPoly;
    }

    public int getM() {
        return this.f99236m;
    }

    public int getN() {
        return this.f99237n;
    }

    public int getT() {
        return this.f99238t;
    }

    public McElieceParameters(int i11) {
        this(i11, (Digest) null);
    }

    public McElieceParameters(int i11, int i12) {
        this(i11, i12, (Digest) null);
    }

    public McElieceParameters(int i11, int i12, int i13) {
        this(i11, i12, i13, null);
    }

    public McElieceParameters(int i11, int i12, int i13, Digest digest) {
        this.f99236m = i11;
        if (i11 < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i11 > 32) {
            throw new IllegalArgumentException(" m is too large");
        }
        int i14 = 1 << i11;
        this.f99237n = i14;
        this.f99238t = i12;
        if (i12 < 0) {
            throw new IllegalArgumentException("t must be positive");
        }
        if (i12 > i14) {
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        if (PolynomialRingGF2.degree(i13) != i11 || !PolynomialRingGF2.isIrreducible(i13)) {
            throw new IllegalArgumentException("polynomial is not a field polynomial for GF(2^m)");
        }
        this.fieldPoly = i13;
        this.digest = digest;
    }

    public McElieceParameters(int i11, int i12, Digest digest) {
        if (i11 < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i11 > 32) {
            throw new IllegalArgumentException("m is too large");
        }
        this.f99236m = i11;
        int i13 = 1 << i11;
        this.f99237n = i13;
        if (i12 < 0) {
            throw new IllegalArgumentException("t must be positive");
        }
        if (i12 > i13) {
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        this.f99238t = i12;
        this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i11);
        this.digest = digest;
    }

    public McElieceParameters(int i11, Digest digest) {
        if (i11 < 1) {
            throw new IllegalArgumentException("key size must be positive");
        }
        this.f99236m = 0;
        this.f99237n = 1;
        while (true) {
            int i12 = this.f99237n;
            if (i12 >= i11) {
                int i13 = i12 >>> 1;
                this.f99238t = i13;
                int i14 = this.f99236m;
                this.f99238t = i13 / i14;
                this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i14);
                this.digest = digest;
                return;
            }
            this.f99237n = i12 << 1;
            this.f99236m++;
        }
    }

    public McElieceParameters(Digest digest) {
        this(11, 50, digest);
    }
}
