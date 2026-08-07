package org.spongycastle.pqc.math.ntru.polynomial;

import java.security.SecureRandom;
import org.spongycastle.pqc.math.ntru.util.Util;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class DenseTernaryPolynomial extends IntegerPolynomial implements TernaryPolynomial {
    DenseTernaryPolynomial(int i11) {
        super(i11);
        checkTernarity();
    }

    private void checkTernarity() {
        int i11 = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i11 == iArr.length) {
                return;
            }
            int i12 = iArr[i11];
            if (i12 < -1 || i12 > 1) {
                throw new IllegalStateException("Illegal value: " + i12 + ", must be one of {-1, 0, 1}");
            }
            i11++;
        }
    }

    public static DenseTernaryPolynomial generateRandom(int i11, int i12, int i13, SecureRandom secureRandom) {
        return new DenseTernaryPolynomial(Util.generateRandomTernary(i11, i12, i13, secureRandom));
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.TernaryPolynomial
    public int[] getNegOnes() {
        int length = this.coeffs.length;
        int[] iArr = new int[length];
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (this.coeffs[i12] == -1) {
                iArr[i11] = i12;
                i11++;
            }
        }
        return Arrays.copyOf(iArr, i11);
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.TernaryPolynomial
    public int[] getOnes() {
        int length = this.coeffs.length;
        int[] iArr = new int[length];
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (this.coeffs[i12] == 1) {
                iArr[i11] = i12;
                i11++;
            }
        }
        return Arrays.copyOf(iArr, i11);
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.IntegerPolynomial, org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public IntegerPolynomial mult(IntegerPolynomial integerPolynomial, int i11) {
        if (i11 != 2048) {
            return super.mult(integerPolynomial, i11);
        }
        IntegerPolynomial integerPolynomial2 = (IntegerPolynomial) integerPolynomial.clone();
        integerPolynomial2.modPositive(2048);
        return new LongPolynomial5(integerPolynomial2).mult(this).toIntegerPolynomial();
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.TernaryPolynomial
    public int size() {
        return this.coeffs.length;
    }

    public DenseTernaryPolynomial(IntegerPolynomial integerPolynomial) {
        this(integerPolynomial.coeffs);
    }

    public static DenseTernaryPolynomial generateRandom(int i11, SecureRandom secureRandom) {
        DenseTernaryPolynomial denseTernaryPolynomial = new DenseTernaryPolynomial(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            denseTernaryPolynomial.coeffs[i12] = secureRandom.nextInt(3) - 1;
        }
        return denseTernaryPolynomial;
    }

    public DenseTernaryPolynomial(int[] iArr) {
        super(iArr);
        checkTernarity();
    }
}
