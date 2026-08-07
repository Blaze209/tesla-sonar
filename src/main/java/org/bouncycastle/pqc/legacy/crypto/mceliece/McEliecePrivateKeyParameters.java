package org.bouncycastle.pqc.legacy.crypto.mceliece;

import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GoppaCode;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.legacy.math.linearalgebra.PolynomialGF2mSmallM;
import org.bouncycastle.pqc.legacy.math.linearalgebra.PolynomialRingGF2m;

/* JADX INFO: loaded from: classes10.dex */
public class McEliecePrivateKeyParameters extends McElieceKeyParameters {
    private GF2mField field;
    private PolynomialGF2mSmallM goppaPoly;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private GF2Matrix f99243h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f99244k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f99245n;
    private String oid;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private Permutation f99246p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private Permutation f99247p2;
    private PolynomialGF2mSmallM[] qInv;
    private GF2Matrix sInv;

    public McEliecePrivateKeyParameters(int i11, int i12, GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM, Permutation permutation, Permutation permutation2, GF2Matrix gF2Matrix) {
        super(true, null);
        this.f99244k = i12;
        this.f99245n = i11;
        this.field = gF2mField;
        this.goppaPoly = polynomialGF2mSmallM;
        this.sInv = gF2Matrix;
        this.f99246p1 = permutation;
        this.f99247p2 = permutation2;
        this.f99243h = GoppaCode.createCanonicalCheckMatrix(gF2mField, polynomialGF2mSmallM);
        this.qInv = new PolynomialRingGF2m(gF2mField, polynomialGF2mSmallM).getSquareRootMatrix();
    }

    public GF2mField getField() {
        return this.field;
    }

    public PolynomialGF2mSmallM getGoppaPoly() {
        return this.goppaPoly;
    }

    public GF2Matrix getH() {
        return this.f99243h;
    }

    public int getK() {
        return this.f99244k;
    }

    public int getN() {
        return this.f99245n;
    }

    public Permutation getP1() {
        return this.f99246p1;
    }

    public Permutation getP2() {
        return this.f99247p2;
    }

    public PolynomialGF2mSmallM[] getQInv() {
        return this.qInv;
    }

    public GF2Matrix getSInv() {
        return this.sInv;
    }

    public McEliecePrivateKeyParameters(int i11, int i12, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[][] bArr7) {
        super(true, null);
        this.f99245n = i11;
        this.f99244k = i12;
        GF2mField gF2mField = new GF2mField(bArr);
        this.field = gF2mField;
        this.goppaPoly = new PolynomialGF2mSmallM(gF2mField, bArr2);
        this.sInv = new GF2Matrix(bArr3);
        this.f99246p1 = new Permutation(bArr4);
        this.f99247p2 = new Permutation(bArr5);
        this.f99243h = new GF2Matrix(bArr6);
        this.qInv = new PolynomialGF2mSmallM[bArr7.length];
        for (int i13 = 0; i13 < bArr7.length; i13++) {
            this.qInv[i13] = new PolynomialGF2mSmallM(this.field, bArr7[i13]);
        }
    }
}
