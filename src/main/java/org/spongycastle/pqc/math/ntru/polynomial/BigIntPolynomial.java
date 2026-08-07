package org.spongycastle.pqc.math.ntru.polynomial;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class BigIntPolynomial {
    private static final double LOG_10_2 = Math.log10(2.0d);
    BigInteger[] coeffs;

    BigIntPolynomial(int i11) {
        this.coeffs = new BigInteger[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.coeffs[i12] = Constants.BIGINT_ZERO;
        }
    }

    static BigIntPolynomial generateRandomSmall(int i11, int i12, int i13) {
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < i12; i14++) {
            arrayList.add(Constants.BIGINT_ONE);
        }
        for (int i15 = 0; i15 < i13; i15++) {
            arrayList.add(BigInteger.valueOf(-1L));
        }
        while (arrayList.size() < i11) {
            arrayList.add(Constants.BIGINT_ZERO);
        }
        Collections.shuffle(arrayList, new SecureRandom());
        BigIntPolynomial bigIntPolynomial = new BigIntPolynomial(i11);
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            bigIntPolynomial.coeffs[i16] = (BigInteger) arrayList.get(i16);
        }
        return bigIntPolynomial;
    }

    private BigInteger maxCoeffAbs() {
        BigInteger bigIntegerAbs = this.coeffs[0].abs();
        int i11 = 1;
        while (true) {
            BigInteger[] bigIntegerArr = this.coeffs;
            if (i11 >= bigIntegerArr.length) {
                return bigIntegerAbs;
            }
            BigInteger bigIntegerAbs2 = bigIntegerArr[i11].abs();
            if (bigIntegerAbs2.compareTo(bigIntegerAbs) > 0) {
                bigIntegerAbs = bigIntegerAbs2;
            }
            i11++;
        }
    }

    private BigIntPolynomial multRecursive(BigIntPolynomial bigIntPolynomial) {
        BigInteger[] bigIntegerArr = this.coeffs;
        BigInteger[] bigIntegerArr2 = bigIntPolynomial.coeffs;
        int length = bigIntegerArr2.length;
        int i11 = 0;
        if (length <= 1) {
            BigInteger[] bigIntegerArrClone = Arrays.clone(bigIntegerArr);
            for (int i12 = 0; i12 < this.coeffs.length; i12++) {
                bigIntegerArrClone[i12] = bigIntegerArrClone[i12].multiply(bigIntPolynomial.coeffs[0]);
            }
            return new BigIntPolynomial(bigIntegerArrClone);
        }
        int i13 = length / 2;
        BigIntPolynomial bigIntPolynomial2 = new BigIntPolynomial(Arrays.copyOf(bigIntegerArr, i13));
        BigIntPolynomial bigIntPolynomial3 = new BigIntPolynomial(Arrays.copyOfRange(bigIntegerArr, i13, length));
        BigIntPolynomial bigIntPolynomial4 = new BigIntPolynomial(Arrays.copyOf(bigIntegerArr2, i13));
        BigIntPolynomial bigIntPolynomial5 = new BigIntPolynomial(Arrays.copyOfRange(bigIntegerArr2, i13, length));
        BigIntPolynomial bigIntPolynomial6 = (BigIntPolynomial) bigIntPolynomial2.clone();
        bigIntPolynomial6.add(bigIntPolynomial3);
        BigIntPolynomial bigIntPolynomial7 = (BigIntPolynomial) bigIntPolynomial4.clone();
        bigIntPolynomial7.add(bigIntPolynomial5);
        BigIntPolynomial bigIntPolynomialMultRecursive = bigIntPolynomial2.multRecursive(bigIntPolynomial4);
        BigIntPolynomial bigIntPolynomialMultRecursive2 = bigIntPolynomial3.multRecursive(bigIntPolynomial5);
        BigIntPolynomial bigIntPolynomialMultRecursive3 = bigIntPolynomial6.multRecursive(bigIntPolynomial7);
        bigIntPolynomialMultRecursive3.sub(bigIntPolynomialMultRecursive);
        bigIntPolynomialMultRecursive3.sub(bigIntPolynomialMultRecursive2);
        BigIntPolynomial bigIntPolynomial8 = new BigIntPolynomial((length * 2) - 1);
        int i14 = 0;
        while (true) {
            BigInteger[] bigIntegerArr3 = bigIntPolynomialMultRecursive.coeffs;
            if (i14 >= bigIntegerArr3.length) {
                break;
            }
            bigIntPolynomial8.coeffs[i14] = bigIntegerArr3[i14];
            i14++;
        }
        int i15 = 0;
        while (true) {
            BigInteger[] bigIntegerArr4 = bigIntPolynomialMultRecursive3.coeffs;
            if (i15 >= bigIntegerArr4.length) {
                break;
            }
            BigInteger[] bigIntegerArr5 = bigIntPolynomial8.coeffs;
            int i16 = i13 + i15;
            bigIntegerArr5[i16] = bigIntegerArr5[i16].add(bigIntegerArr4[i15]);
            i15++;
        }
        while (true) {
            BigInteger[] bigIntegerArr6 = bigIntPolynomialMultRecursive2.coeffs;
            if (i11 >= bigIntegerArr6.length) {
                return bigIntPolynomial8;
            }
            BigInteger[] bigIntegerArr7 = bigIntPolynomial8.coeffs;
            int i17 = (i13 * 2) + i11;
            bigIntegerArr7[i17] = bigIntegerArr7[i17].add(bigIntegerArr6[i11]);
            i11++;
        }
    }

    void add(BigIntPolynomial bigIntPolynomial, BigInteger bigInteger) {
        add(bigIntPolynomial);
        mod(bigInteger);
    }

    public Object clone() {
        return new BigIntPolynomial((BigInteger[]) this.coeffs.clone());
    }

    public void div(BigInteger bigInteger) {
        BigInteger bigIntegerDivide = bigInteger.add(Constants.BIGINT_ONE).divide(BigInteger.valueOf(2L));
        int i11 = 0;
        while (true) {
            BigInteger[] bigIntegerArr = this.coeffs;
            if (i11 >= bigIntegerArr.length) {
                return;
            }
            bigIntegerArr[i11] = bigIntegerArr[i11].compareTo(Constants.BIGINT_ZERO) > 0 ? this.coeffs[i11].add(bigIntegerDivide) : this.coeffs[i11].add(bigIntegerDivide.negate());
            BigInteger[] bigIntegerArr2 = this.coeffs;
            bigIntegerArr2[i11] = bigIntegerArr2[i11].divide(bigInteger);
            i11++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Arrays.areEqual(this.coeffs, ((BigIntPolynomial) obj).coeffs);
    }

    public BigInteger[] getCoeffs() {
        return Arrays.clone(this.coeffs);
    }

    public int getMaxCoeffLength() {
        return ((int) (((double) maxCoeffAbs().bitLength()) * LOG_10_2)) + 1;
    }

    public int hashCode() {
        return 31 + Arrays.hashCode(this.coeffs);
    }

    public void mod(BigInteger bigInteger) {
        int i11 = 0;
        while (true) {
            BigInteger[] bigIntegerArr = this.coeffs;
            if (i11 >= bigIntegerArr.length) {
                return;
            }
            bigIntegerArr[i11] = bigIntegerArr[i11].mod(bigInteger);
            i11++;
        }
    }

    public BigIntPolynomial mult(BigIntPolynomial bigIntPolynomial) {
        BigInteger[] bigIntegerArr;
        int length = this.coeffs.length;
        if (bigIntPolynomial.coeffs.length != length) {
            throw new IllegalArgumentException("Number of coefficients must be the same");
        }
        BigIntPolynomial bigIntPolynomialMultRecursive = multRecursive(bigIntPolynomial);
        if (bigIntPolynomialMultRecursive.coeffs.length > length) {
            int i11 = length;
            while (true) {
                bigIntegerArr = bigIntPolynomialMultRecursive.coeffs;
                if (i11 >= bigIntegerArr.length) {
                    break;
                }
                int i12 = i11 - length;
                bigIntegerArr[i12] = bigIntegerArr[i12].add(bigIntegerArr[i11]);
                i11++;
            }
            bigIntPolynomialMultRecursive.coeffs = Arrays.copyOf(bigIntegerArr, length);
        }
        return bigIntPolynomialMultRecursive;
    }

    public void sub(BigIntPolynomial bigIntPolynomial) {
        BigInteger[] bigIntegerArr = bigIntPolynomial.coeffs;
        int length = bigIntegerArr.length;
        BigInteger[] bigIntegerArr2 = this.coeffs;
        if (length > bigIntegerArr2.length) {
            int length2 = bigIntegerArr2.length;
            this.coeffs = Arrays.copyOf(bigIntegerArr2, bigIntegerArr.length);
            while (true) {
                BigInteger[] bigIntegerArr3 = this.coeffs;
                if (length2 >= bigIntegerArr3.length) {
                    break;
                }
                bigIntegerArr3[length2] = Constants.BIGINT_ZERO;
                length2++;
            }
        }
        int i11 = 0;
        while (true) {
            BigInteger[] bigIntegerArr4 = bigIntPolynomial.coeffs;
            if (i11 >= bigIntegerArr4.length) {
                return;
            }
            BigInteger[] bigIntegerArr5 = this.coeffs;
            bigIntegerArr5[i11] = bigIntegerArr5[i11].subtract(bigIntegerArr4[i11]);
            i11++;
        }
    }

    BigInteger sumCoeffs() {
        BigInteger bigIntegerAdd = Constants.BIGINT_ZERO;
        int i11 = 0;
        while (true) {
            BigInteger[] bigIntegerArr = this.coeffs;
            if (i11 >= bigIntegerArr.length) {
                return bigIntegerAdd;
            }
            bigIntegerAdd = bigIntegerAdd.add(bigIntegerArr[i11]);
            i11++;
        }
    }

    public void add(BigIntPolynomial bigIntPolynomial) {
        BigInteger[] bigIntegerArr = bigIntPolynomial.coeffs;
        int length = bigIntegerArr.length;
        BigInteger[] bigIntegerArr2 = this.coeffs;
        if (length > bigIntegerArr2.length) {
            int length2 = bigIntegerArr2.length;
            this.coeffs = Arrays.copyOf(bigIntegerArr2, bigIntegerArr.length);
            while (true) {
                BigInteger[] bigIntegerArr3 = this.coeffs;
                if (length2 >= bigIntegerArr3.length) {
                    break;
                }
                bigIntegerArr3[length2] = Constants.BIGINT_ZERO;
                length2++;
            }
        }
        int i11 = 0;
        while (true) {
            BigInteger[] bigIntegerArr4 = bigIntPolynomial.coeffs;
            if (i11 >= bigIntegerArr4.length) {
                return;
            }
            BigInteger[] bigIntegerArr5 = this.coeffs;
            bigIntegerArr5[i11] = bigIntegerArr5[i11].add(bigIntegerArr4[i11]);
            i11++;
        }
    }

    BigIntPolynomial(BigInteger[] bigIntegerArr) {
        this.coeffs = bigIntegerArr;
    }

    public BigDecimalPolynomial div(BigDecimal bigDecimal, int i11) {
        BigDecimal bigDecimalDivide = Constants.BIGDEC_ONE.divide(bigDecimal, ((int) (((double) maxCoeffAbs().bitLength()) * LOG_10_2)) + 1 + i11 + 1, 6);
        BigDecimalPolynomial bigDecimalPolynomial = new BigDecimalPolynomial(this.coeffs.length);
        for (int i12 = 0; i12 < this.coeffs.length; i12++) {
            bigDecimalPolynomial.coeffs[i12] = new BigDecimal(this.coeffs[i12]).multiply(bigDecimalDivide).setScale(i11, 6);
        }
        return bigDecimalPolynomial;
    }

    public BigIntPolynomial(IntegerPolynomial integerPolynomial) {
        this.coeffs = new BigInteger[integerPolynomial.coeffs.length];
        int i11 = 0;
        while (true) {
            BigInteger[] bigIntegerArr = this.coeffs;
            if (i11 >= bigIntegerArr.length) {
                return;
            }
            bigIntegerArr[i11] = BigInteger.valueOf(integerPolynomial.coeffs[i11]);
            i11++;
        }
    }

    public void mult(BigInteger bigInteger) {
        int i11 = 0;
        while (true) {
            BigInteger[] bigIntegerArr = this.coeffs;
            if (i11 >= bigIntegerArr.length) {
                return;
            }
            bigIntegerArr[i11] = bigIntegerArr[i11].multiply(bigInteger);
            i11++;
        }
    }

    void mult(int i11) {
        mult(BigInteger.valueOf(i11));
    }
}
