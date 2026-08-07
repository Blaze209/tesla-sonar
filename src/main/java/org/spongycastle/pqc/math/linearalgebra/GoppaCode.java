package org.spongycastle.pqc.math.linearalgebra;

import java.lang.reflect.Array;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class GoppaCode {

    public static class MaMaPe {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private GF2Matrix f99859h;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private Permutation f99860p;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private GF2Matrix f99861s;

        public MaMaPe(GF2Matrix gF2Matrix, GF2Matrix gF2Matrix2, Permutation permutation) {
            this.f99861s = gF2Matrix;
            this.f99859h = gF2Matrix2;
            this.f99860p = permutation;
        }

        public GF2Matrix getFirstMatrix() {
            return this.f99861s;
        }

        public Permutation getPermutation() {
            return this.f99860p;
        }

        public GF2Matrix getSecondMatrix() {
            return this.f99859h;
        }
    }

    public static class MatrixSet {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private GF2Matrix f99862g;
        private int[] setJ;

        public MatrixSet(GF2Matrix gF2Matrix, int[] iArr) {
            this.f99862g = gF2Matrix;
            this.setJ = iArr;
        }

        public GF2Matrix getG() {
            return this.f99862g;
        }

        public int[] getSetJ() {
            return this.setJ;
        }
    }

    private GoppaCode() {
    }

    public static MaMaPe computeSystematicForm(GF2Matrix gF2Matrix, SecureRandom secureRandom) {
        GF2Matrix gF2Matrix2;
        boolean z11;
        int numColumns = gF2Matrix.getNumColumns();
        GF2Matrix gF2Matrix3 = null;
        while (true) {
            Permutation permutation = new Permutation(numColumns, secureRandom);
            GF2Matrix gF2Matrix4 = (GF2Matrix) gF2Matrix.rightMultiply(permutation);
            GF2Matrix leftSubMatrix = gF2Matrix4.getLeftSubMatrix();
            try {
                gF2Matrix2 = (GF2Matrix) leftSubMatrix.computeInverse();
                z11 = true;
            } catch (ArithmeticException unused) {
                gF2Matrix2 = gF2Matrix3;
                z11 = false;
            }
            if (z11) {
                return new MaMaPe(leftSubMatrix, ((GF2Matrix) gF2Matrix2.rightMultiply(gF2Matrix4)).getRightSubMatrix(), permutation);
            }
            gF2Matrix3 = gF2Matrix2;
        }
    }

    public static GF2Matrix createCanonicalCheckMatrix(GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM) {
        int degree = gF2mField.getDegree();
        int i11 = 1;
        int i12 = 1 << degree;
        int degree2 = polynomialGF2mSmallM.getDegree();
        int i13 = 0;
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, degree2, i12);
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) cls, degree2, i12);
        for (int i14 = 0; i14 < i12; i14++) {
            iArr2[0][i14] = gF2mField.inverse(polynomialGF2mSmallM.evaluateAt(i14));
        }
        for (int i15 = 1; i15 < degree2; i15++) {
            for (int i16 = 0; i16 < i12; i16++) {
                iArr2[i15][i16] = gF2mField.mult(iArr2[i15 - 1][i16], i16);
            }
        }
        for (int i17 = 0; i17 < degree2; i17++) {
            for (int i18 = i13; i18 < i12; i18++) {
                int i19 = i13;
                while (i19 <= i17) {
                    int[] iArr3 = iArr[i17];
                    iArr3[i18] = gF2mField.add(iArr3[i18], gF2mField.mult(iArr2[i19][i18], polynomialGF2mSmallM.getCoefficient((degree2 + i19) - i17)));
                    i19++;
                    i11 = i11;
                    i13 = i13;
                }
            }
        }
        int i21 = i11;
        int i22 = i13;
        int[] iArr4 = new int[2];
        iArr4[i21] = (i12 + 31) >>> 5;
        iArr4[i22] = degree2 * degree;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, iArr4);
        for (int i23 = i22; i23 < i12; i23++) {
            int i24 = i23 >>> 5;
            int i25 = i21 << (i23 & 31);
            for (int i26 = i22; i26 < degree2; i26++) {
                int i27 = iArr[i26][i23];
                for (int i28 = i22; i28 < degree; i28++) {
                    if (((i27 >>> i28) & 1) != 0) {
                        int[] iArr6 = iArr5[(((i26 + 1) * degree) - i28) - 1];
                        iArr6[i24] = iArr6[i24] ^ i25;
                    }
                }
            }
        }
        return new GF2Matrix(i12, iArr5);
    }

    public static GF2Vector syndromeDecode(GF2Vector gF2Vector, GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM, PolynomialGF2mSmallM[] polynomialGF2mSmallMArr) {
        int degree = 1 << gF2mField.getDegree();
        GF2Vector gF2Vector2 = new GF2Vector(degree);
        if (!gF2Vector.isZero()) {
            PolynomialGF2mSmallM[] polynomialGF2mSmallMArrModPolynomialToFracton = new PolynomialGF2mSmallM(gF2Vector.toExtensionFieldVector(gF2mField)).modInverse(polynomialGF2mSmallM).addMonomial(1).modSquareRootMatrix(polynomialGF2mSmallMArr).modPolynomialToFracton(polynomialGF2mSmallM);
            PolynomialGF2mSmallM polynomialGF2mSmallM2 = polynomialGF2mSmallMArrModPolynomialToFracton[0];
            PolynomialGF2mSmallM polynomialGF2mSmallMMultiply = polynomialGF2mSmallM2.multiply(polynomialGF2mSmallM2);
            PolynomialGF2mSmallM polynomialGF2mSmallM3 = polynomialGF2mSmallMArrModPolynomialToFracton[1];
            PolynomialGF2mSmallM polynomialGF2mSmallMAdd = polynomialGF2mSmallMMultiply.add(polynomialGF2mSmallM3.multiply(polynomialGF2mSmallM3).multWithMonomial(1));
            PolynomialGF2mSmallM polynomialGF2mSmallMMultWithElement = polynomialGF2mSmallMAdd.multWithElement(gF2mField.inverse(polynomialGF2mSmallMAdd.getHeadCoefficient()));
            for (int i11 = 0; i11 < degree; i11++) {
                if (polynomialGF2mSmallMMultWithElement.evaluateAt(i11) == 0) {
                    gF2Vector2.setBit(i11);
                }
            }
        }
        return gF2Vector2;
    }
}
