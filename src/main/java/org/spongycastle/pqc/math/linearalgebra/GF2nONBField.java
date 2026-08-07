package org.spongycastle.pqc.math.linearalgebra;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Random;

/* JADX INFO: loaded from: classes10.dex */
public class GF2nONBField extends GF2nField {
    private static final int MAXLONG = 64;
    private int mBit;
    private int mLength;
    int[][] mMult;
    private int mType;

    public GF2nONBField(int i11, SecureRandom secureRandom) {
        super(secureRandom);
        if (i11 < 3) {
            throw new IllegalArgumentException("k must be at least 3");
        }
        this.mDegree = i11;
        int i12 = i11 / 64;
        this.mLength = i12;
        int i13 = i11 & 63;
        this.mBit = i13;
        if (i13 == 0) {
            this.mBit = 64;
        } else {
            this.mLength = i12 + 1;
        }
        computeType();
        if (this.mType >= 3) {
            throw new RuntimeException("\nThe type of this field is " + this.mType);
        }
        this.mMult = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.mDegree, 2);
        for (int i14 = 0; i14 < this.mDegree; i14++) {
            int[] iArr = this.mMult[i14];
            iArr[0] = -1;
            iArr[1] = -1;
        }
        computeMultMatrix();
        computeFieldPolynomial();
        this.fields = new java.util.Vector();
        this.matrices = new java.util.Vector();
    }

    private void computeMultMatrix() {
        int i11;
        int i12 = this.mType;
        if ((i12 & 7) == 0) {
            throw new RuntimeException("bisher nur fuer Gausssche Normalbasen implementiert");
        }
        int i13 = this.mDegree * i12;
        int i14 = i13 + 1;
        int[] iArr = new int[i14];
        int iElementOfOrder = i12 == 1 ? 1 : i12 == 2 ? i13 : elementOfOrder(i12, i14);
        int i15 = 1;
        int i16 = 0;
        while (true) {
            i11 = this.mType;
            if (i16 >= i11) {
                break;
            }
            int i17 = i15;
            for (int i18 = 0; i18 < this.mDegree; i18++) {
                iArr[i17] = i18;
                i17 = (i17 << 1) % i14;
                if (i17 < 0) {
                    i17 += i14;
                }
            }
            i15 = (i15 * iElementOfOrder) % i14;
            if (i15 < 0) {
                i15 += i14;
            }
            i16++;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new RuntimeException("only type 1 or type 2 implemented");
            }
            int i19 = 1;
            while (i19 < i13) {
                int i21 = i19 + 1;
                int[] iArr2 = this.mMult[iArr[i21]];
                if (iArr2[0] == -1) {
                    iArr2[0] = iArr[i14 - i19];
                } else {
                    iArr2[1] = iArr[i14 - i19];
                }
                i19 = i21;
            }
            return;
        }
        int i22 = 1;
        while (i22 < i13) {
            int i23 = i22 + 1;
            int[] iArr3 = this.mMult[iArr[i23]];
            if (iArr3[0] == -1) {
                iArr3[0] = iArr[i14 - i22];
            } else {
                iArr3[1] = iArr[i14 - i22];
            }
            i22 = i23;
        }
        int i24 = this.mDegree >> 1;
        for (int i25 = 1; i25 <= i24; i25++) {
            int[][] iArr4 = this.mMult;
            int i26 = i25 - 1;
            int[] iArr5 = iArr4[i26];
            if (iArr5[0] == -1) {
                iArr5[0] = (i24 + i25) - 1;
            } else {
                iArr5[1] = (i24 + i25) - 1;
            }
            int[] iArr6 = iArr4[(i24 + i25) - 1];
            if (iArr6[0] == -1) {
                iArr6[0] = i26;
            } else {
                iArr6[1] = i26;
            }
        }
    }

    private void computeType() {
        if ((this.mDegree & 7) == 0) {
            throw new RuntimeException("The extension degree is divisible by 8!");
        }
        this.mType = 1;
        int iGcd = 0;
        while (iGcd != 1) {
            int i11 = (this.mType * this.mDegree) + 1;
            if (IntegerFunctions.isPrime(i11)) {
                int iOrder = IntegerFunctions.order(2, i11);
                int i12 = this.mType;
                int i13 = this.mDegree;
                iGcd = IntegerFunctions.gcd((i12 * i13) / iOrder, i13);
            }
            this.mType++;
        }
        int i14 = this.mType - 1;
        this.mType = i14;
        if (i14 == 1) {
            int i15 = (this.mDegree << 1) + 1;
            if (IntegerFunctions.isPrime(i15)) {
                int iOrder2 = IntegerFunctions.order(2, i15);
                int i16 = this.mDegree;
                if (IntegerFunctions.gcd((i16 << 1) / iOrder2, i16) == 1) {
                    this.mType++;
                }
            }
        }
    }

    private int elementOfOrder(int i11, int i12) {
        Random random = new Random();
        int iNextInt = 0;
        while (iNextInt == 0) {
            int i13 = i12 - 1;
            iNextInt = random.nextInt() % i13;
            if (iNextInt < 0) {
                iNextInt += i13;
            }
        }
        int iOrder = IntegerFunctions.order(iNextInt, i12);
        while (true) {
            if (iOrder % i11 == 0 && iOrder != 0) {
                break;
            }
            while (iNextInt == 0) {
                int i14 = i12 - 1;
                iNextInt = random.nextInt() % i14;
                if (iNextInt < 0) {
                    iNextInt += i14;
                }
            }
            iOrder = IntegerFunctions.order(iNextInt, i12);
        }
        int i15 = iNextInt;
        for (int i16 = 2; i16 <= i11 / iOrder; i16++) {
            i15 *= iNextInt;
        }
        return i15;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nField
    protected void computeCOBMatrix(GF2nField gF2nField) {
        GF2nElement randomRoot;
        int i11 = this.mDegree;
        if (i11 != gF2nField.mDegree) {
            throw new IllegalArgumentException("GF2nField.computeCOBMatrix: B1 has a different degree and thus cannot be coverted to!");
        }
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[i11];
        for (int i12 = 0; i12 < this.mDegree; i12++) {
            gF2PolynomialArr[i12] = new GF2Polynomial(this.mDegree);
        }
        do {
            randomRoot = gF2nField.getRandomRoot(this.fieldPolynomial);
        } while (randomRoot.isZero());
        GF2nElement[] gF2nElementArr = new GF2nPolynomialElement[this.mDegree];
        gF2nElementArr[0] = (GF2nElement) randomRoot.clone();
        for (int i13 = 1; i13 < this.mDegree; i13++) {
            gF2nElementArr[i13] = gF2nElementArr[i13 - 1].square();
        }
        for (int i14 = 0; i14 < this.mDegree; i14++) {
            for (int i15 = 0; i15 < this.mDegree; i15++) {
                if (gF2nElementArr[i14].testBit(i15)) {
                    int i16 = this.mDegree;
                    gF2PolynomialArr[(i16 - i15) - 1].setBit((i16 - i14) - 1);
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
        int i11 = this.mType;
        if (i11 == 1) {
            this.fieldPolynomial = new GF2Polynomial(this.mDegree + 1, "ALL");
            return;
        }
        if (i11 == 2) {
            GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree + 1, "ONE");
            GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.mDegree + 1, "X");
            gF2Polynomial2.addToThis(gF2Polynomial);
            GF2Polynomial gF2Polynomial3 = gF2Polynomial;
            GF2Polynomial gF2Polynomial4 = gF2Polynomial2;
            int i12 = 1;
            while (i12 < this.mDegree) {
                GF2Polynomial gF2PolynomialShiftLeft = gF2Polynomial4.shiftLeft();
                gF2PolynomialShiftLeft.addToThis(gF2Polynomial3);
                i12++;
                gF2Polynomial3 = gF2Polynomial4;
                gF2Polynomial4 = gF2PolynomialShiftLeft;
            }
            this.fieldPolynomial = gF2Polynomial4;
        }
    }

    int getONBBit() {
        return this.mBit;
    }

    int getONBLength() {
        return this.mLength;
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
                GF2nONBElement gF2nONBElement = new GF2nONBElement(this, this.random);
                GF2nPolynomial gF2nPolynomial2 = new GF2nPolynomial(2, GF2nONBElement.ZERO(this));
                gF2nPolynomial2.set(1, gF2nONBElement);
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

    int[][] invMatrix(int[][] iArr) {
        int i11 = this.mDegree;
        int[] iArr2 = {i11, i11};
        Class cls = Integer.TYPE;
        int i12 = this.mDegree;
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) cls, i12, i12);
        for (int i13 = 0; i13 < this.mDegree; i13++) {
            iArr3[i13][i13] = 1;
        }
        for (int i14 = 0; i14 < this.mDegree; i14++) {
            int i15 = i14;
            while (true) {
                int i16 = this.mDegree;
                if (i15 < i16) {
                    iArr[(i16 - 1) - i14][i15] = iArr[i14][i14];
                    i15++;
                }
            }
        }
        return null;
    }
}
