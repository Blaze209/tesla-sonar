package org.spongycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public class GF2nPolynomialField extends GF2nField {
    private boolean isPentanomial;
    private boolean isTrinomial;

    /* JADX INFO: renamed from: pc, reason: collision with root package name */
    private int[] f99857pc;
    GF2Polynomial[] squaringMatrix;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private int f99858tc;

    public GF2nPolynomialField(int i11, SecureRandom secureRandom) {
        super(secureRandom);
        this.isTrinomial = false;
        this.isPentanomial = false;
        this.f99857pc = new int[3];
        if (i11 < 3) {
            throw new IllegalArgumentException("k must be at least 3");
        }
        this.mDegree = i11;
        computeFieldPolynomial();
        computeSquaringMatrix();
        this.fields = new java.util.Vector();
        this.matrices = new java.util.Vector();
    }

    private void computeSquaringMatrix() {
        int i11 = this.mDegree;
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[i11 - 1];
        this.squaringMatrix = new GF2Polynomial[i11];
        int i12 = 0;
        while (true) {
            GF2Polynomial[] gF2PolynomialArr2 = this.squaringMatrix;
            if (i12 >= gF2PolynomialArr2.length) {
                break;
            }
            gF2PolynomialArr2[i12] = new GF2Polynomial(this.mDegree, "ZERO");
            i12++;
        }
        for (int i13 = 0; i13 < this.mDegree - 1; i13++) {
            gF2PolynomialArr[i13] = new GF2Polynomial(1, "ONE").shiftLeft(this.mDegree + i13).remainder(this.fieldPolynomial);
        }
        for (int i14 = 1; i14 <= Math.abs(this.mDegree >> 1); i14++) {
            int i15 = 1;
            while (true) {
                int i16 = this.mDegree;
                if (i15 <= i16) {
                    if (gF2PolynomialArr[i16 - (i14 << 1)].testBit(i16 - i15)) {
                        this.squaringMatrix[i15 - 1].setBit(this.mDegree - i14);
                    }
                    i15++;
                }
            }
        }
        int iAbs = Math.abs(this.mDegree >> 1) + 1;
        while (true) {
            int i17 = this.mDegree;
            if (iAbs > i17) {
                return;
            }
            this.squaringMatrix[((iAbs << 1) - i17) - 1].setBit(i17 - iAbs);
            iAbs++;
        }
    }

    private boolean testPentanomials() {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree + 1);
        this.fieldPolynomial = gF2Polynomial;
        gF2Polynomial.setBit(0);
        this.fieldPolynomial.setBit(this.mDegree);
        boolean zIsIrreducible = false;
        int i11 = 1;
        while (i11 <= this.mDegree - 3 && !zIsIrreducible) {
            this.fieldPolynomial.setBit(i11);
            int i12 = i11 + 1;
            int i13 = i12;
            while (i13 <= this.mDegree - 2 && !zIsIrreducible) {
                this.fieldPolynomial.setBit(i13);
                int i14 = i13 + 1;
                for (int i15 = i14; i15 <= this.mDegree - 1 && !zIsIrreducible; i15++) {
                    this.fieldPolynomial.setBit(i15);
                    if (((((this.mDegree & 1) != 0) | ((i11 & 1) != 0) | ((i13 & 1) != 0)) || ((i15 & 1) != 0)) && (zIsIrreducible = this.fieldPolynomial.isIrreducible())) {
                        this.isPentanomial = true;
                        int[] iArr = this.f99857pc;
                        iArr[0] = i11;
                        iArr[1] = i13;
                        iArr[2] = i15;
                        return zIsIrreducible;
                    }
                    this.fieldPolynomial.resetBit(i15);
                }
                this.fieldPolynomial.resetBit(i13);
                i13 = i14;
            }
            this.fieldPolynomial.resetBit(i11);
            i11 = i12;
        }
        return zIsIrreducible;
    }

    private boolean testRandom() {
        this.fieldPolynomial = new GF2Polynomial(this.mDegree + 1);
        do {
            this.fieldPolynomial.randomize();
            this.fieldPolynomial.setBit(this.mDegree);
            this.fieldPolynomial.setBit(0);
        } while (!this.fieldPolynomial.isIrreducible());
        return true;
    }

    private boolean testTrinomials() {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree + 1);
        this.fieldPolynomial = gF2Polynomial;
        boolean zIsIrreducible = false;
        gF2Polynomial.setBit(0);
        this.fieldPolynomial.setBit(this.mDegree);
        for (int i11 = 1; i11 < this.mDegree && !zIsIrreducible; i11++) {
            this.fieldPolynomial.setBit(i11);
            boolean zIsIrreducible2 = this.fieldPolynomial.isIrreducible();
            if (zIsIrreducible2) {
                this.isTrinomial = true;
                this.f99858tc = i11;
                return zIsIrreducible2;
            }
            this.fieldPolynomial.resetBit(i11);
            zIsIrreducible = this.fieldPolynomial.isIrreducible();
        }
        return zIsIrreducible;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nField
    protected void computeCOBMatrix(GF2nField gF2nField) {
        GF2nElement randomRoot;
        GF2nElement[] gF2nElementArr;
        int i11 = this.mDegree;
        if (i11 != gF2nField.mDegree) {
            throw new IllegalArgumentException("GF2nPolynomialField.computeCOBMatrix: B1 has a different degree and thus cannot be coverted to!");
        }
        boolean z11 = gF2nField instanceof GF2nONBField;
        if (z11) {
            gF2nField.computeCOBMatrix(this);
            return;
        }
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[i11];
        for (int i12 = 0; i12 < this.mDegree; i12++) {
            gF2PolynomialArr[i12] = new GF2Polynomial(this.mDegree);
        }
        do {
            randomRoot = gF2nField.getRandomRoot(this.fieldPolynomial);
        } while (randomRoot.isZero());
        if (randomRoot instanceof GF2nONBElement) {
            int i13 = this.mDegree;
            gF2nElementArr = new GF2nONBElement[i13];
            gF2nElementArr[i13 - 1] = GF2nONBElement.ONE((GF2nONBField) gF2nField);
        } else {
            int i14 = this.mDegree;
            gF2nElementArr = new GF2nPolynomialElement[i14];
            gF2nElementArr[i14 - 1] = GF2nPolynomialElement.ONE((GF2nPolynomialField) gF2nField);
        }
        int i15 = this.mDegree;
        gF2nElementArr[i15 - 2] = randomRoot;
        for (int i16 = i15 - 3; i16 >= 0; i16--) {
            gF2nElementArr[i16] = (GF2nElement) gF2nElementArr[i16 + 1].multiply(randomRoot);
        }
        if (z11) {
            for (int i17 = 0; i17 < this.mDegree; i17++) {
                int i18 = 0;
                while (true) {
                    int i19 = this.mDegree;
                    if (i18 < i19) {
                        if (gF2nElementArr[i17].testBit((i19 - i18) - 1)) {
                            int i21 = this.mDegree;
                            gF2PolynomialArr[(i21 - i18) - 1].setBit((i21 - i17) - 1);
                        }
                        i18++;
                    }
                }
            }
        } else {
            for (int i22 = 0; i22 < this.mDegree; i22++) {
                for (int i23 = 0; i23 < this.mDegree; i23++) {
                    if (gF2nElementArr[i22].testBit(i23)) {
                        int i24 = this.mDegree;
                        gF2PolynomialArr[(i24 - i23) - 1].setBit((i24 - i22) - 1);
                    }
                }
            }
        }
        this.fields.addElement(gF2nField);
        this.matrices.addElement(gF2PolynomialArr);
        gF2nField.fields.addElement(this);
        gF2nField.matrices.addElement(invertMatrix(gF2PolynomialArr));
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nField
    protected void computeFieldPolynomial() {
        if (testTrinomials() || testPentanomials()) {
            return;
        }
        testRandom();
    }

    protected void computeFieldPolynomial2() {
        if (testTrinomials() || testPentanomials()) {
            return;
        }
        testRandom();
    }

    public int[] getPc() {
        if (!this.isPentanomial) {
            throw new RuntimeException();
        }
        int[] iArr = new int[3];
        System.arraycopy(this.f99857pc, 0, iArr, 0, 3);
        return iArr;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nField
    protected GF2nElement getRandomRoot(GF2Polynomial gF2Polynomial) {
        GF2nPolynomial gF2nPolynomialGcd;
        int degree;
        int degree2;
        GF2nPolynomial gF2nPolynomial = new GF2nPolynomial(gF2Polynomial, this);
        int degree3 = gF2nPolynomial.getDegree();
        while (degree3 > 1) {
            while (true) {
                GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this, this.random);
                GF2nPolynomial gF2nPolynomial2 = new GF2nPolynomial(2, GF2nPolynomialElement.ZERO(this));
                gF2nPolynomial2.set(1, gF2nPolynomialElement);
                GF2nPolynomial gF2nPolynomial3 = new GF2nPolynomial(gF2nPolynomial2);
                for (int i11 = 1; i11 <= this.mDegree - 1; i11++) {
                    gF2nPolynomial3 = gF2nPolynomial3.multiplyAndReduce(gF2nPolynomial3, gF2nPolynomial).add(gF2nPolynomial2);
                }
                gF2nPolynomialGcd = gF2nPolynomial3.gcd(gF2nPolynomial);
                degree = gF2nPolynomialGcd.getDegree();
                degree2 = gF2nPolynomial.getDegree();
                if (degree != 0 && degree != degree2) {
                    break;
                }
            }
            gF2nPolynomial = (degree << 1) > degree2 ? gF2nPolynomial.quotient(gF2nPolynomialGcd) : new GF2nPolynomial(gF2nPolynomialGcd);
            degree3 = gF2nPolynomial.getDegree();
        }
        return gF2nPolynomial.at(0);
    }

    public GF2Polynomial getSquaringVector(int i11) {
        return new GF2Polynomial(this.squaringMatrix[i11]);
    }

    public int getTc() {
        if (this.isTrinomial) {
            return this.f99858tc;
        }
        throw new RuntimeException();
    }

    public boolean isPentanomial() {
        return this.isPentanomial;
    }

    public boolean isTrinomial() {
        return this.isTrinomial;
    }

    public GF2nPolynomialField(int i11, SecureRandom secureRandom, boolean z11) {
        super(secureRandom);
        this.isTrinomial = false;
        this.isPentanomial = false;
        this.f99857pc = new int[3];
        if (i11 >= 3) {
            this.mDegree = i11;
            if (z11) {
                computeFieldPolynomial();
            } else {
                computeFieldPolynomial2();
            }
            computeSquaringMatrix();
            this.fields = new java.util.Vector();
            this.matrices = new java.util.Vector();
            return;
        }
        throw new IllegalArgumentException("k must be at least 3");
    }

    public GF2nPolynomialField(int i11, SecureRandom secureRandom, GF2Polynomial gF2Polynomial) {
        super(secureRandom);
        this.isTrinomial = false;
        this.isPentanomial = false;
        this.f99857pc = new int[3];
        if (i11 >= 3) {
            if (gF2Polynomial.getLength() == i11 + 1) {
                if (gF2Polynomial.isIrreducible()) {
                    this.mDegree = i11;
                    this.fieldPolynomial = gF2Polynomial;
                    computeSquaringMatrix();
                    int i12 = 2;
                    for (int i13 = 1; i13 < this.fieldPolynomial.getLength() - 1; i13++) {
                        if (this.fieldPolynomial.testBit(i13)) {
                            int i14 = i12 + 1;
                            if (i14 == 3) {
                                this.f99858tc = i13;
                            }
                            if (i14 <= 5) {
                                this.f99857pc[i12 - 2] = i13;
                            }
                            i12 = i14;
                        }
                    }
                    if (i12 == 3) {
                        this.isTrinomial = true;
                    }
                    if (i12 == 5) {
                        this.isPentanomial = true;
                    }
                    this.fields = new java.util.Vector();
                    this.matrices = new java.util.Vector();
                    return;
                }
                throw new RuntimeException();
            }
            throw new RuntimeException();
        }
        throw new IllegalArgumentException("degree must be at least 3");
    }
}
