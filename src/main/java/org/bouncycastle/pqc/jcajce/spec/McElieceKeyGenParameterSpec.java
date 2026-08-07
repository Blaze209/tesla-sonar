package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.pqc.legacy.math.linearalgebra.PolynomialRingGF2;

/* JADX INFO: loaded from: classes10.dex */
public class McElieceKeyGenParameterSpec implements AlgorithmParameterSpec {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    private int fieldPoly;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f99200m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f99201n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f99202t;

    public McElieceKeyGenParameterSpec() {
        this(11, 50);
    }

    public int getFieldPoly() {
        return this.fieldPoly;
    }

    public int getM() {
        return this.f99200m;
    }

    public int getN() {
        return this.f99201n;
    }

    public int getT() {
        return this.f99202t;
    }

    public McElieceKeyGenParameterSpec(int i11) {
        if (i11 < 1) {
            throw new IllegalArgumentException("key size must be positive");
        }
        this.f99200m = 0;
        this.f99201n = 1;
        while (true) {
            int i12 = this.f99201n;
            if (i12 >= i11) {
                int i13 = i12 >>> 1;
                this.f99202t = i13;
                int i14 = this.f99200m;
                this.f99202t = i13 / i14;
                this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i14);
                return;
            }
            this.f99201n = i12 << 1;
            this.f99200m++;
        }
    }

    public McElieceKeyGenParameterSpec(int i11, int i12) {
        if (i11 < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i11 > 32) {
            throw new IllegalArgumentException("m is too large");
        }
        this.f99200m = i11;
        int i13 = 1 << i11;
        this.f99201n = i13;
        if (i12 < 0) {
            throw new IllegalArgumentException("t must be positive");
        }
        if (i12 > i13) {
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        this.f99202t = i12;
        this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i11);
    }

    public McElieceKeyGenParameterSpec(int i11, int i12, int i13) {
        this.f99200m = i11;
        if (i11 < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i11 > 32) {
            throw new IllegalArgumentException(" m is too large");
        }
        int i14 = 1 << i11;
        this.f99201n = i14;
        this.f99202t = i12;
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
    }
}
