package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.pqc.legacy.math.linearalgebra.PolynomialRingGF2;

/* JADX INFO: loaded from: classes10.dex */
public class McElieceCCA2KeyGenParameterSpec implements AlgorithmParameterSpec {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    public static final String SHA1 = "SHA-1";
    public static final String SHA224 = "SHA-224";
    public static final String SHA256 = "SHA-256";
    public static final String SHA384 = "SHA-384";
    public static final String SHA512 = "SHA-512";
    private final String digest;
    private int fieldPoly;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f99197m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f99198n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f99199t;

    public McElieceCCA2KeyGenParameterSpec() {
        this(11, 50, "SHA-256");
    }

    public String getDigest() {
        return this.digest;
    }

    public int getFieldPoly() {
        return this.fieldPoly;
    }

    public int getM() {
        return this.f99197m;
    }

    public int getN() {
        return this.f99198n;
    }

    public int getT() {
        return this.f99199t;
    }

    public McElieceCCA2KeyGenParameterSpec(int i11) {
        this(i11, "SHA-256");
    }

    public McElieceCCA2KeyGenParameterSpec(int i11, int i12) {
        this(i11, i12, "SHA-256");
    }

    public McElieceCCA2KeyGenParameterSpec(int i11, int i12, int i13) {
        this(i11, i12, i13, "SHA-256");
    }

    public McElieceCCA2KeyGenParameterSpec(int i11, int i12, int i13, String str) {
        this.f99197m = i11;
        if (i11 < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i11 > 32) {
            throw new IllegalArgumentException(" m is too large");
        }
        int i14 = 1 << i11;
        this.f99198n = i14;
        this.f99199t = i12;
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
        this.digest = str;
    }

    public McElieceCCA2KeyGenParameterSpec(int i11, int i12, String str) {
        if (i11 < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i11 > 32) {
            throw new IllegalArgumentException("m is too large");
        }
        this.f99197m = i11;
        int i13 = 1 << i11;
        this.f99198n = i13;
        if (i12 < 0) {
            throw new IllegalArgumentException("t must be positive");
        }
        if (i12 > i13) {
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        this.f99199t = i12;
        this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i11);
        this.digest = str;
    }

    public McElieceCCA2KeyGenParameterSpec(int i11, String str) {
        int i12 = 1;
        if (i11 < 1) {
            throw new IllegalArgumentException("key size must be positive");
        }
        int i13 = 0;
        while (i12 < i11) {
            i12 <<= 1;
            i13++;
        }
        this.f99199t = (i12 >>> 1) / i13;
        this.f99197m = i13;
        this.f99198n = i12;
        this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i13);
        this.digest = str;
    }
}
