package org.spongycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes10.dex */
public class PolynomialGF2mSmallM {
    public static final char RANDOM_IRREDUCIBLE_POLYNOMIAL = 'I';
    private int[] coefficients;
    private int degree;
    private GF2mField field;

    public PolynomialGF2mSmallM(GF2mField gF2mField) {
        this.field = gF2mField;
        this.degree = -1;
        this.coefficients = new int[1];
    }

    private void computeDegree() {
        this.degree = this.coefficients.length - 1;
        while (true) {
            int i11 = this.degree;
            if (i11 < 0 || this.coefficients[i11] != 0) {
                return;
            } else {
                this.degree = i11 - 1;
            }
        }
    }

    private int[] createRandomIrreduciblePolynomial(int i11, SecureRandom secureRandom) {
        int[] iArr = new int[i11 + 1];
        iArr[i11] = 1;
        iArr[0] = this.field.getRandomNonZeroElement(secureRandom);
        for (int i12 = 1; i12 < i11; i12++) {
            iArr[i12] = this.field.getRandomElement(secureRandom);
        }
        while (!isIrreducible(iArr)) {
            int iNextInt = RandUtils.nextInt(secureRandom, i11);
            if (iNextInt == 0) {
                iArr[0] = this.field.getRandomNonZeroElement(secureRandom);
            } else {
                iArr[iNextInt] = this.field.getRandomElement(secureRandom);
            }
        }
        return iArr;
    }

    private static int headCoefficient(int[] iArr) {
        int iComputeDegree = computeDegree(iArr);
        if (iComputeDegree == -1) {
            return 0;
        }
        return iArr[iComputeDegree];
    }

    private static boolean isEqual(int[] iArr, int[] iArr2) {
        int iComputeDegree = computeDegree(iArr);
        if (iComputeDegree != computeDegree(iArr2)) {
            return false;
        }
        for (int i11 = 0; i11 <= iComputeDegree; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private boolean isIrreducible(int[] iArr) {
        if (iArr[0] == 0) {
            return false;
        }
        int iComputeDegree = computeDegree(iArr) >> 1;
        int[] iArrNormalForm = {0, 1};
        int[] iArr2 = {0, 1};
        int degree = this.field.getDegree();
        for (int i11 = 0; i11 < iComputeDegree; i11++) {
            for (int i12 = degree - 1; i12 >= 0; i12--) {
                iArrNormalForm = modMultiply(iArrNormalForm, iArrNormalForm, iArr);
            }
            iArrNormalForm = normalForm(iArrNormalForm);
            if (computeDegree(gcd(add(iArrNormalForm, iArr2), iArr)) != 0) {
                return false;
            }
        }
        return true;
    }

    private static int[] normalForm(int[] iArr) {
        int iComputeDegree = computeDegree(iArr);
        if (iComputeDegree == -1) {
            return new int[1];
        }
        int i11 = iComputeDegree + 1;
        if (iArr.length == i11) {
            return IntUtils.clone(iArr);
        }
        int[] iArr2 = new int[i11];
        System.arraycopy(iArr, 0, iArr2, 0, i11);
        return iArr2;
    }

    public PolynomialGF2mSmallM add(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        return new PolynomialGF2mSmallM(this.field, add(this.coefficients, polynomialGF2mSmallM.coefficients));
    }

    public PolynomialGF2mSmallM addMonomial(int i11) {
        int[] iArr = new int[i11 + 1];
        iArr[i11] = 1;
        return new PolynomialGF2mSmallM(this.field, add(this.coefficients, iArr));
    }

    public void addToThis(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        this.coefficients = add(this.coefficients, polynomialGF2mSmallM.coefficients);
        computeDegree();
    }

    public PolynomialGF2mSmallM[] div(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        int[][] iArrDiv = div(this.coefficients, polynomialGF2mSmallM.coefficients);
        return new PolynomialGF2mSmallM[]{new PolynomialGF2mSmallM(this.field, iArrDiv[0]), new PolynomialGF2mSmallM(this.field, iArrDiv[1])};
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof PolynomialGF2mSmallM)) {
            PolynomialGF2mSmallM polynomialGF2mSmallM = (PolynomialGF2mSmallM) obj;
            if (this.field.equals(polynomialGF2mSmallM.field) && this.degree == polynomialGF2mSmallM.degree && isEqual(this.coefficients, polynomialGF2mSmallM.coefficients)) {
                return true;
            }
        }
        return false;
    }

    public int evaluateAt(int i11) {
        int[] iArr = this.coefficients;
        int i12 = this.degree;
        int iMult = iArr[i12];
        for (int i13 = i12 - 1; i13 >= 0; i13--) {
            iMult = this.field.mult(iMult, i11) ^ this.coefficients[i13];
        }
        return iMult;
    }

    public PolynomialGF2mSmallM gcd(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        return new PolynomialGF2mSmallM(this.field, gcd(this.coefficients, polynomialGF2mSmallM.coefficients));
    }

    public int getCoefficient(int i11) {
        if (i11 < 0 || i11 > this.degree) {
            return 0;
        }
        return this.coefficients[i11];
    }

    public int getDegree() {
        int[] iArr = this.coefficients;
        int length = iArr.length - 1;
        if (iArr[length] == 0) {
            return -1;
        }
        return length;
    }

    public byte[] getEncoded() {
        int i11 = 8;
        int i12 = 1;
        while (this.field.getDegree() > i11) {
            i12++;
            i11 += 8;
        }
        byte[] bArr = new byte[this.coefficients.length * i12];
        int i13 = 0;
        for (int i14 = 0; i14 < this.coefficients.length; i14++) {
            int i15 = 0;
            while (i15 < i11) {
                bArr[i13] = (byte) (this.coefficients[i14] >>> i15);
                i15 += 8;
                i13++;
            }
        }
        return bArr;
    }

    public int getHeadCoefficient() {
        int i11 = this.degree;
        if (i11 == -1) {
            return 0;
        }
        return this.coefficients[i11];
    }

    public int hashCode() {
        int iHashCode = this.field.hashCode();
        int i11 = 0;
        while (true) {
            int[] iArr = this.coefficients;
            if (i11 >= iArr.length) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 31) + iArr[i11];
            i11++;
        }
    }

    public PolynomialGF2mSmallM mod(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        return new PolynomialGF2mSmallM(this.field, mod(this.coefficients, polynomialGF2mSmallM.coefficients));
    }

    public PolynomialGF2mSmallM modDiv(PolynomialGF2mSmallM polynomialGF2mSmallM, PolynomialGF2mSmallM polynomialGF2mSmallM2) {
        return new PolynomialGF2mSmallM(this.field, modDiv(this.coefficients, polynomialGF2mSmallM.coefficients, polynomialGF2mSmallM2.coefficients));
    }

    public PolynomialGF2mSmallM modInverse(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        return new PolynomialGF2mSmallM(this.field, modDiv(new int[]{1}, this.coefficients, polynomialGF2mSmallM.coefficients));
    }

    public PolynomialGF2mSmallM modMultiply(PolynomialGF2mSmallM polynomialGF2mSmallM, PolynomialGF2mSmallM polynomialGF2mSmallM2) {
        return new PolynomialGF2mSmallM(this.field, modMultiply(this.coefficients, polynomialGF2mSmallM.coefficients, polynomialGF2mSmallM2.coefficients));
    }

    public PolynomialGF2mSmallM[] modPolynomialToFracton(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        int i11 = polynomialGF2mSmallM.degree >> 1;
        int[] iArrNormalForm = normalForm(polynomialGF2mSmallM.coefficients);
        int[] iArrMod = mod(this.coefficients, polynomialGF2mSmallM.coefficients);
        int[] iArr = {0};
        int[] iArr2 = {1};
        while (computeDegree(iArrMod) > i11) {
            int[][] iArrDiv = div(iArrNormalForm, iArrMod);
            int[] iArr3 = iArrDiv[1];
            int[] iArrAdd = add(iArr, modMultiply(iArrDiv[0], iArr2, polynomialGF2mSmallM.coefficients));
            iArr = iArr2;
            iArr2 = iArrAdd;
            iArrNormalForm = iArrMod;
            iArrMod = iArr3;
        }
        return new PolynomialGF2mSmallM[]{new PolynomialGF2mSmallM(this.field, iArrMod), new PolynomialGF2mSmallM(this.field, iArr2)};
    }

    public PolynomialGF2mSmallM modSquareMatrix(PolynomialGF2mSmallM[] polynomialGF2mSmallMArr) {
        int length = polynomialGF2mSmallMArr.length;
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        int i11 = 0;
        while (true) {
            int[] iArr3 = this.coefficients;
            if (i11 >= iArr3.length) {
                break;
            }
            GF2mField gF2mField = this.field;
            int i12 = iArr3[i11];
            iArr2[i11] = gF2mField.mult(i12, i12);
            i11++;
        }
        for (int i13 = 0; i13 < length; i13++) {
            for (int i14 = 0; i14 < length; i14++) {
                int[] iArr4 = polynomialGF2mSmallMArr[i14].coefficients;
                if (i13 < iArr4.length) {
                    iArr[i13] = this.field.add(iArr[i13], this.field.mult(iArr4[i13], iArr2[i14]));
                }
            }
        }
        return new PolynomialGF2mSmallM(this.field, iArr);
    }

    public PolynomialGF2mSmallM modSquareRoot(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        int[] iArrClone = IntUtils.clone(this.coefficients);
        int[] iArrModMultiply = modMultiply(iArrClone, iArrClone, polynomialGF2mSmallM.coefficients);
        while (!isEqual(iArrModMultiply, this.coefficients)) {
            iArrClone = normalForm(iArrModMultiply);
            iArrModMultiply = modMultiply(iArrClone, iArrClone, polynomialGF2mSmallM.coefficients);
        }
        return new PolynomialGF2mSmallM(this.field, iArrClone);
    }

    public PolynomialGF2mSmallM modSquareRootMatrix(PolynomialGF2mSmallM[] polynomialGF2mSmallMArr) {
        int length = polynomialGF2mSmallMArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            for (int i12 = 0; i12 < length; i12++) {
                int[] iArr2 = polynomialGF2mSmallMArr[i12].coefficients;
                if (i11 < iArr2.length) {
                    int[] iArr3 = this.coefficients;
                    if (i12 < iArr3.length) {
                        iArr[i11] = this.field.add(iArr[i11], this.field.mult(iArr2[i11], iArr3[i12]));
                    }
                }
            }
        }
        for (int i13 = 0; i13 < length; i13++) {
            iArr[i13] = this.field.sqRoot(iArr[i13]);
        }
        return new PolynomialGF2mSmallM(this.field, iArr);
    }

    public void multThisWithElement(int i11) {
        if (!this.field.isElementOfThisField(i11)) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        this.coefficients = multWithElement(this.coefficients, i11);
        computeDegree();
    }

    public PolynomialGF2mSmallM multWithElement(int i11) {
        if (!this.field.isElementOfThisField(i11)) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        return new PolynomialGF2mSmallM(this.field, multWithElement(this.coefficients, i11));
    }

    public PolynomialGF2mSmallM multWithMonomial(int i11) {
        return new PolynomialGF2mSmallM(this.field, multWithMonomial(this.coefficients, i11));
    }

    public PolynomialGF2mSmallM multiply(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        return new PolynomialGF2mSmallM(this.field, multiply(this.coefficients, polynomialGF2mSmallM.coefficients));
    }

    public String toString() {
        String str = " Polynomial over " + this.field.toString() + ": \n";
        for (int i11 = 0; i11 < this.coefficients.length; i11++) {
            str = str + this.field.elementToStr(this.coefficients[i11]) + "Y^" + i11 + Marker.ANY_NON_NULL_MARKER;
        }
        return str + ";";
    }

    private int[] add(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr3[length] = this.field.add(iArr3[length], iArr[length]);
        }
        return iArr3;
    }

    private static int computeDegree(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        return length;
    }

    private int[][] div(int[] iArr, int[] iArr2) {
        int iComputeDegree = computeDegree(iArr2);
        int iComputeDegree2 = computeDegree(iArr) + 1;
        if (iComputeDegree != -1) {
            int[][] iArr3 = {new int[1], new int[iComputeDegree2]};
            int iInverse = this.field.inverse(headCoefficient(iArr2));
            iArr3[0][0] = 0;
            int[] iArr4 = iArr3[1];
            System.arraycopy(iArr, 0, iArr4, 0, iArr4.length);
            while (iComputeDegree <= computeDegree(iArr3[1])) {
                int[] iArr5 = {this.field.mult(headCoefficient(iArr3[1]), iInverse)};
                int[] iArrMultWithElement = multWithElement(iArr2, iArr5[0]);
                int iComputeDegree3 = computeDegree(iArr3[1]) - iComputeDegree;
                int[] iArrMultWithMonomial = multWithMonomial(iArrMultWithElement, iComputeDegree3);
                iArr3[0] = add(multWithMonomial(iArr5, iComputeDegree3), iArr3[0]);
                iArr3[1] = add(iArrMultWithMonomial, iArr3[1]);
            }
            return iArr3;
        }
        throw new ArithmeticException("Division by zero.");
    }

    private int[] gcd(int[] iArr, int[] iArr2) {
        if (computeDegree(iArr) == -1) {
            return iArr2;
        }
        while (computeDegree(iArr2) != -1) {
            int[] iArrMod = mod(iArr, iArr2);
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            System.arraycopy(iArr2, 0, iArr3, 0, length);
            int length2 = iArrMod.length;
            int[] iArr4 = new int[length2];
            System.arraycopy(iArrMod, 0, iArr4, 0, length2);
            iArr2 = iArr4;
            iArr = iArr3;
        }
        return multWithElement(iArr, this.field.inverse(headCoefficient(iArr)));
    }

    private int[] mod(int[] iArr, int[] iArr2) {
        int iComputeDegree = computeDegree(iArr2);
        if (iComputeDegree != -1) {
            int length = iArr.length;
            int[] iArrAdd = new int[length];
            int iInverse = this.field.inverse(headCoefficient(iArr2));
            System.arraycopy(iArr, 0, iArrAdd, 0, length);
            while (iComputeDegree <= computeDegree(iArrAdd)) {
                iArrAdd = add(multWithElement(multWithMonomial(iArr2, computeDegree(iArrAdd) - iComputeDegree), this.field.mult(headCoefficient(iArrAdd), iInverse)), iArrAdd);
            }
            return iArrAdd;
        }
        throw new ArithmeticException("Division by zero");
    }

    private int[] modDiv(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrNormalForm = normalForm(iArr3);
        int[] iArrMod = mod(iArr2, iArr3);
        int[] iArrNormalForm2 = {0};
        int[] iArrMod2 = mod(iArr, iArr3);
        while (computeDegree(iArrMod) != -1) {
            int[][] iArrDiv = div(iArrNormalForm, iArrMod);
            int[] iArrNormalForm3 = normalForm(iArrMod);
            int[] iArrNormalForm4 = normalForm(iArrDiv[1]);
            int[] iArrAdd = add(iArrNormalForm2, modMultiply(iArrDiv[0], iArrMod2, iArr3));
            iArrNormalForm2 = normalForm(iArrMod2);
            iArrMod2 = normalForm(iArrAdd);
            iArrNormalForm = iArrNormalForm3;
            iArrMod = iArrNormalForm4;
        }
        return multWithElement(iArrNormalForm2, this.field.inverse(headCoefficient(iArrNormalForm)));
    }

    private int[] modMultiply(int[] iArr, int[] iArr2, int[] iArr3) {
        return mod(multiply(iArr, iArr2), iArr3);
    }

    private static int[] multWithMonomial(int[] iArr, int i11) {
        int iComputeDegree = computeDegree(iArr);
        if (iComputeDegree == -1) {
            return new int[1];
        }
        int[] iArr2 = new int[iComputeDegree + i11 + 1];
        System.arraycopy(iArr, 0, iArr2, i11, iComputeDegree + 1);
        return iArr2;
    }

    private int[] multiply(int[] iArr, int[] iArr2) {
        if (computeDegree(iArr) < computeDegree(iArr2)) {
            iArr2 = iArr;
            iArr = iArr2;
        }
        int[] iArrNormalForm = normalForm(iArr);
        int[] iArrNormalForm2 = normalForm(iArr2);
        if (iArrNormalForm2.length == 1) {
            return multWithElement(iArrNormalForm, iArrNormalForm2[0]);
        }
        int length = iArrNormalForm.length;
        int length2 = iArrNormalForm2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        if (length2 != length) {
            int[] iArr4 = new int[length2];
            int i11 = length - length2;
            int[] iArr5 = new int[i11];
            System.arraycopy(iArrNormalForm, 0, iArr4, 0, length2);
            System.arraycopy(iArrNormalForm, length2, iArr5, 0, i11);
            return add(multiply(iArr4, iArrNormalForm2), multWithMonomial(multiply(iArr5, iArrNormalForm2), length2));
        }
        int i12 = (length + 1) >>> 1;
        int i13 = length - i12;
        int[] iArr6 = new int[i12];
        int[] iArr7 = new int[i12];
        int[] iArr8 = new int[i13];
        int[] iArr9 = new int[i13];
        System.arraycopy(iArrNormalForm, 0, iArr6, 0, i12);
        System.arraycopy(iArrNormalForm, i12, iArr8, 0, i13);
        System.arraycopy(iArrNormalForm2, 0, iArr7, 0, i12);
        System.arraycopy(iArrNormalForm2, i12, iArr9, 0, i13);
        int[] iArrAdd = add(iArr6, iArr8);
        int[] iArrAdd2 = add(iArr7, iArr9);
        int[] iArrMultiply = multiply(iArr6, iArr7);
        int[] iArrMultiply2 = multiply(iArrAdd, iArrAdd2);
        int[] iArrMultiply3 = multiply(iArr8, iArr9);
        return add(multWithMonomial(add(add(add(iArrMultiply2, iArrMultiply), iArrMultiply3), multWithMonomial(iArrMultiply3, i12)), i12), iArrMultiply);
    }

    public PolynomialGF2mSmallM(GF2mField gF2mField, int i11, char c11, SecureRandom secureRandom) {
        this.field = gF2mField;
        if (c11 == 'I') {
            this.coefficients = createRandomIrreduciblePolynomial(i11, secureRandom);
            computeDegree();
        } else {
            throw new IllegalArgumentException(" Error: type " + c11 + " is not defined for GF2smallmPolynomial");
        }
    }

    private int[] multWithElement(int[] iArr, int i11) {
        int iComputeDegree = computeDegree(iArr);
        if (iComputeDegree == -1 || i11 == 0) {
            return new int[1];
        }
        if (i11 == 1) {
            return IntUtils.clone(iArr);
        }
        int[] iArr2 = new int[iComputeDegree + 1];
        while (iComputeDegree >= 0) {
            iArr2[iComputeDegree] = this.field.mult(iArr[iComputeDegree], i11);
            iComputeDegree--;
        }
        return iArr2;
    }

    public PolynomialGF2mSmallM(GF2mField gF2mField, int i11) {
        this.field = gF2mField;
        this.degree = i11;
        int[] iArr = new int[i11 + 1];
        this.coefficients = iArr;
        iArr[i11] = 1;
    }

    public PolynomialGF2mSmallM(GF2mField gF2mField, int[] iArr) {
        this.field = gF2mField;
        this.coefficients = normalForm(iArr);
        computeDegree();
    }

    public PolynomialGF2mSmallM(GF2mField gF2mField, byte[] bArr) {
        this.field = gF2mField;
        int i11 = 8;
        int i12 = 1;
        while (gF2mField.getDegree() > i11) {
            i12++;
            i11 += 8;
        }
        if (bArr.length % i12 == 0) {
            this.coefficients = new int[bArr.length / i12];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr = this.coefficients;
                if (i13 < iArr.length) {
                    int i15 = 0;
                    while (i15 < i11) {
                        int[] iArr2 = this.coefficients;
                        iArr2[i13] = ((bArr[i14] & 255) << i15) ^ iArr2[i13];
                        i15 += 8;
                        i14++;
                    }
                    if (!this.field.isElementOfThisField(this.coefficients[i13])) {
                        throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                    }
                    i13++;
                } else {
                    if (iArr.length != 1 && iArr[iArr.length - 1] == 0) {
                        throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                    }
                    computeDegree();
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
    }

    public PolynomialGF2mSmallM(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        this.field = polynomialGF2mSmallM.field;
        this.degree = polynomialGF2mSmallM.degree;
        this.coefficients = IntUtils.clone(polynomialGF2mSmallM.coefficients);
    }

    public PolynomialGF2mSmallM(GF2mVector gF2mVector) {
        this(gF2mVector.getField(), gF2mVector.getIntArrayForm());
    }
}
