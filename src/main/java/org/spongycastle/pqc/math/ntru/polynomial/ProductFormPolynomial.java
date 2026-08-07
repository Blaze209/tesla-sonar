package org.spongycastle.pqc.math.ntru.polynomial;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.SecureRandom;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class ProductFormPolynomial implements Polynomial {

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private SparseTernaryPolynomial f99869f1;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    private SparseTernaryPolynomial f99870f2;

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    private SparseTernaryPolynomial f99871f3;

    public ProductFormPolynomial(SparseTernaryPolynomial sparseTernaryPolynomial, SparseTernaryPolynomial sparseTernaryPolynomial2, SparseTernaryPolynomial sparseTernaryPolynomial3) {
        this.f99869f1 = sparseTernaryPolynomial;
        this.f99870f2 = sparseTernaryPolynomial2;
        this.f99871f3 = sparseTernaryPolynomial3;
    }

    public static ProductFormPolynomial fromBinary(byte[] bArr, int i11, int i12, int i13, int i14, int i15) {
        return fromBinary(new ByteArrayInputStream(bArr), i11, i12, i13, i14, i15);
    }

    public static ProductFormPolynomial generateRandom(int i11, int i12, int i13, int i14, int i15, SecureRandom secureRandom) {
        return new ProductFormPolynomial(SparseTernaryPolynomial.generateRandom(i11, i12, i12, secureRandom), SparseTernaryPolynomial.generateRandom(i11, i13, i13, secureRandom), SparseTernaryPolynomial.generateRandom(i11, i14, i15, secureRandom));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductFormPolynomial productFormPolynomial = (ProductFormPolynomial) obj;
        SparseTernaryPolynomial sparseTernaryPolynomial = this.f99869f1;
        if (sparseTernaryPolynomial == null) {
            if (productFormPolynomial.f99869f1 != null) {
                return false;
            }
        } else if (!sparseTernaryPolynomial.equals(productFormPolynomial.f99869f1)) {
            return false;
        }
        SparseTernaryPolynomial sparseTernaryPolynomial2 = this.f99870f2;
        if (sparseTernaryPolynomial2 == null) {
            if (productFormPolynomial.f99870f2 != null) {
                return false;
            }
        } else if (!sparseTernaryPolynomial2.equals(productFormPolynomial.f99870f2)) {
            return false;
        }
        SparseTernaryPolynomial sparseTernaryPolynomial3 = this.f99871f3;
        if (sparseTernaryPolynomial3 == null) {
            if (productFormPolynomial.f99871f3 != null) {
                return false;
            }
        } else if (!sparseTernaryPolynomial3.equals(productFormPolynomial.f99871f3)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        SparseTernaryPolynomial sparseTernaryPolynomial = this.f99869f1;
        int iHashCode = ((sparseTernaryPolynomial == null ? 0 : sparseTernaryPolynomial.hashCode()) + 31) * 31;
        SparseTernaryPolynomial sparseTernaryPolynomial2 = this.f99870f2;
        int iHashCode2 = (iHashCode + (sparseTernaryPolynomial2 == null ? 0 : sparseTernaryPolynomial2.hashCode())) * 31;
        SparseTernaryPolynomial sparseTernaryPolynomial3 = this.f99871f3;
        return iHashCode2 + (sparseTernaryPolynomial3 != null ? sparseTernaryPolynomial3.hashCode() : 0);
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public IntegerPolynomial mult(IntegerPolynomial integerPolynomial) {
        IntegerPolynomial integerPolynomialMult = this.f99870f2.mult(this.f99869f1.mult(integerPolynomial));
        integerPolynomialMult.add(this.f99871f3.mult(integerPolynomial));
        return integerPolynomialMult;
    }

    public byte[] toBinary() {
        byte[] binary = this.f99869f1.toBinary();
        byte[] binary2 = this.f99870f2.toBinary();
        byte[] binary3 = this.f99871f3.toBinary();
        byte[] bArrCopyOf = Arrays.copyOf(binary, binary.length + binary2.length + binary3.length);
        System.arraycopy(binary2, 0, bArrCopyOf, binary.length, binary2.length);
        System.arraycopy(binary3, 0, bArrCopyOf, binary.length + binary2.length, binary3.length);
        return bArrCopyOf;
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public IntegerPolynomial toIntegerPolynomial() {
        IntegerPolynomial integerPolynomialMult = this.f99869f1.mult(this.f99870f2.toIntegerPolynomial());
        integerPolynomialMult.add(this.f99871f3.toIntegerPolynomial());
        return integerPolynomialMult;
    }

    public static ProductFormPolynomial fromBinary(InputStream inputStream, int i11, int i12, int i13, int i14, int i15) {
        return new ProductFormPolynomial(SparseTernaryPolynomial.fromBinary(inputStream, i11, i12, i12), SparseTernaryPolynomial.fromBinary(inputStream, i11, i13, i13), SparseTernaryPolynomial.fromBinary(inputStream, i11, i14, i15));
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public BigIntPolynomial mult(BigIntPolynomial bigIntPolynomial) {
        BigIntPolynomial bigIntPolynomialMult = this.f99870f2.mult(this.f99869f1.mult(bigIntPolynomial));
        bigIntPolynomialMult.add(this.f99871f3.mult(bigIntPolynomial));
        return bigIntPolynomialMult;
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public IntegerPolynomial mult(IntegerPolynomial integerPolynomial, int i11) {
        IntegerPolynomial integerPolynomialMult = mult(integerPolynomial);
        integerPolynomialMult.mod(i11);
        return integerPolynomialMult;
    }
}
