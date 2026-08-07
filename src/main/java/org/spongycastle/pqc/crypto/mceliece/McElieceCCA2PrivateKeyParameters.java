package org.spongycastle.pqc.crypto.mceliece;

import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;
import org.spongycastle.pqc.math.linearalgebra.GF2mField;
import org.spongycastle.pqc.math.linearalgebra.GoppaCode;
import org.spongycastle.pqc.math.linearalgebra.Permutation;
import org.spongycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;
import org.spongycastle.pqc.math.linearalgebra.PolynomialRingGF2m;

/* JADX INFO: loaded from: classes10.dex */
public class McElieceCCA2PrivateKeyParameters extends McElieceCCA2KeyParameters {
    private GF2mField field;
    private PolynomialGF2mSmallM goppaPoly;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private GF2Matrix f99762h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f99763k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f99764n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Permutation f99765p;
    private PolynomialGF2mSmallM[] qInv;

    public McElieceCCA2PrivateKeyParameters(int i11, int i12, GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM, Permutation permutation, String str) {
        super(true, str);
        this.f99764n = i11;
        this.f99763k = i12;
        this.field = gF2mField;
        this.goppaPoly = polynomialGF2mSmallM;
        this.f99765p = permutation;
        this.f99762h = GoppaCode.createCanonicalCheckMatrix(gF2mField, polynomialGF2mSmallM);
        this.qInv = new PolynomialRingGF2m(gF2mField, polynomialGF2mSmallM).getSquareRootMatrix();
    }

    public GF2mField getField() {
        return this.field;
    }

    public PolynomialGF2mSmallM getGoppaPoly() {
        return this.goppaPoly;
    }

    public GF2Matrix getH() {
        return this.f99762h;
    }

    public int getK() {
        return this.f99763k;
    }

    public int getN() {
        return this.f99764n;
    }

    public Permutation getP() {
        return this.f99765p;
    }

    public PolynomialGF2mSmallM[] getQInv() {
        return this.qInv;
    }

    public int getT() {
        return this.goppaPoly.getDegree();
    }
}
