package org.spongycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public class GF2Vector extends Vector {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int[] f99856v;

    public GF2Vector(int i11) {
        if (i11 < 0) {
            throw new ArithmeticException("Negative length.");
        }
        this.length = i11;
        this.f99856v = new int[(i11 + 31) >> 5];
    }

    public static GF2Vector OS2VP(int i11, byte[] bArr) {
        if (i11 < 0) {
            throw new ArithmeticException("negative length");
        }
        if (bArr.length <= ((i11 + 7) >> 3)) {
            return new GF2Vector(i11, LittleEndianConversions.toIntArray(bArr));
        }
        throw new ArithmeticException("length mismatch");
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Vector
    public Vector add(Vector vector) {
        if (!(vector instanceof GF2Vector)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        GF2Vector gF2Vector = (GF2Vector) vector;
        if (this.length != gF2Vector.length) {
            throw new ArithmeticException("length mismatch");
        }
        int[] iArrClone = IntUtils.clone(gF2Vector.f99856v);
        for (int length = iArrClone.length - 1; length >= 0; length--) {
            iArrClone[length] = iArrClone[length] ^ this.f99856v[length];
        }
        return new GF2Vector(this.length, iArrClone);
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Vector
    public boolean equals(Object obj) {
        if (!(obj instanceof GF2Vector)) {
            return false;
        }
        GF2Vector gF2Vector = (GF2Vector) obj;
        return this.length == gF2Vector.length && IntUtils.equals(this.f99856v, gF2Vector.f99856v);
    }

    public GF2Vector extractLeftVector(int i11) {
        int i12 = this.length;
        if (i11 > i12) {
            throw new ArithmeticException("invalid length");
        }
        if (i11 == i12) {
            return new GF2Vector(this);
        }
        GF2Vector gF2Vector = new GF2Vector(i11);
        int i13 = i11 >> 5;
        int i14 = i11 & 31;
        System.arraycopy(this.f99856v, 0, gF2Vector.f99856v, 0, i13);
        if (i14 != 0) {
            gF2Vector.f99856v[i13] = ((1 << i14) - 1) & this.f99856v[i13];
        }
        return gF2Vector;
    }

    public GF2Vector extractRightVector(int i11) {
        int i12;
        int i13 = this.length;
        if (i11 > i13) {
            throw new ArithmeticException("invalid length");
        }
        if (i11 == i13) {
            return new GF2Vector(this);
        }
        GF2Vector gF2Vector = new GF2Vector(i11);
        int i14 = this.length;
        int i15 = (i14 - i11) >> 5;
        int i16 = (i14 - i11) & 31;
        int i17 = (i11 + 31) >> 5;
        int i18 = 0;
        if (i16 == 0) {
            System.arraycopy(this.f99856v, i15, gF2Vector.f99856v, 0, i17);
            return gF2Vector;
        }
        while (true) {
            i12 = i17 - 1;
            if (i18 >= i12) {
                break;
            }
            int[] iArr = gF2Vector.f99856v;
            int[] iArr2 = this.f99856v;
            int i19 = i15 + 1;
            iArr[i18] = (iArr2[i15] >>> i16) | (iArr2[i19] << (32 - i16));
            i18++;
            i15 = i19;
        }
        int[] iArr3 = gF2Vector.f99856v;
        int[] iArr4 = this.f99856v;
        int i21 = i15 + 1;
        int i22 = iArr4[i15] >>> i16;
        iArr3[i12] = i22;
        if (i21 < iArr4.length) {
            iArr3[i12] = (iArr4[i21] << (32 - i16)) | i22;
        }
        return gF2Vector;
    }

    public GF2Vector extractVector(int[] iArr) {
        int length = iArr.length;
        if (iArr[length - 1] > this.length) {
            throw new ArithmeticException("invalid index set");
        }
        GF2Vector gF2Vector = new GF2Vector(length);
        for (int i11 = 0; i11 < length; i11++) {
            int[] iArr2 = this.f99856v;
            int i12 = iArr[i11];
            if ((iArr2[i12 >> 5] & (1 << (i12 & 31))) != 0) {
                int[] iArr3 = gF2Vector.f99856v;
                int i13 = i11 >> 5;
                iArr3[i13] = (1 << (i11 & 31)) | iArr3[i13];
            }
        }
        return gF2Vector;
    }

    public int getBit(int i11) {
        if (i11 >= this.length) {
            throw new IndexOutOfBoundsException();
        }
        int i12 = i11 >> 5;
        int i13 = i11 & 31;
        return (this.f99856v[i12] & (1 << i13)) >>> i13;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Vector
    public byte[] getEncoded() {
        return LittleEndianConversions.toByteArray(this.f99856v, (this.length + 7) >> 3);
    }

    public int getHammingWeight() {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = this.f99856v;
            if (i11 >= iArr.length) {
                return i12;
            }
            int i13 = iArr[i11];
            for (int i14 = 0; i14 < 32; i14++) {
                if ((i13 & 1) != 0) {
                    i12++;
                }
                i13 >>>= 1;
            }
            i11++;
        }
    }

    public int[] getVecArray() {
        return this.f99856v;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Vector
    public int hashCode() {
        return (this.length * 31) + this.f99856v.hashCode();
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Vector
    public boolean isZero() {
        for (int length = this.f99856v.length - 1; length >= 0; length--) {
            if (this.f99856v[length] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Vector
    public Vector multiply(Permutation permutation) {
        int[] vector = permutation.getVector();
        int i11 = this.length;
        if (i11 != vector.length) {
            throw new ArithmeticException("length mismatch");
        }
        GF2Vector gF2Vector = new GF2Vector(i11);
        for (int i12 = 0; i12 < vector.length; i12++) {
            int[] iArr = this.f99856v;
            int i13 = vector[i12];
            if ((iArr[i13 >> 5] & (1 << (i13 & 31))) != 0) {
                int[] iArr2 = gF2Vector.f99856v;
                int i14 = i12 >> 5;
                iArr2[i14] = (1 << (i12 & 31)) | iArr2[i14];
            }
        }
        return gF2Vector;
    }

    public void setBit(int i11) {
        if (i11 >= this.length) {
            throw new IndexOutOfBoundsException();
        }
        int[] iArr = this.f99856v;
        int i12 = i11 >> 5;
        iArr[i12] = (1 << (i11 & 31)) | iArr[i12];
    }

    public GF2mVector toExtensionFieldVector(GF2mField gF2mField) {
        int degree = gF2mField.getDegree();
        int i11 = this.length;
        if (i11 % degree != 0) {
            throw new ArithmeticException("conversion is impossible");
        }
        int i12 = i11 / degree;
        int[] iArr = new int[i12];
        int i13 = 0;
        for (int i14 = i12 - 1; i14 >= 0; i14--) {
            for (int degree2 = gF2mField.getDegree() - 1; degree2 >= 0; degree2--) {
                if (((this.f99856v[i13 >>> 5] >>> (i13 & 31)) & 1) == 1) {
                    iArr[i14] = iArr[i14] ^ (1 << degree2);
                }
                i13++;
            }
        }
        return new GF2mVector(gF2mField, iArr);
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Vector
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < this.length; i11++) {
            if (i11 != 0 && (i11 & 31) == 0) {
                stringBuffer.append(' ');
            }
            if ((this.f99856v[i11 >> 5] & (1 << (i11 & 31))) == 0) {
                stringBuffer.append('0');
            } else {
                stringBuffer.append('1');
            }
        }
        return stringBuffer.toString();
    }

    public GF2Vector(int i11, SecureRandom secureRandom) {
        this.length = i11;
        int i12 = (i11 + 31) >> 5;
        this.f99856v = new int[i12];
        int i13 = i12 - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            this.f99856v[i14] = secureRandom.nextInt();
        }
        int i15 = i11 & 31;
        if (i15 != 0) {
            int[] iArr = this.f99856v;
            iArr[i13] = ((1 << i15) - 1) & iArr[i13];
        }
    }

    public GF2Vector(int i11, int i12, SecureRandom secureRandom) {
        if (i12 <= i11) {
            this.length = i11;
            this.f99856v = new int[(i11 + 31) >> 5];
            int[] iArr = new int[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                iArr[i13] = i13;
            }
            for (int i14 = 0; i14 < i12; i14++) {
                int iNextInt = RandUtils.nextInt(secureRandom, i11);
                setBit(iArr[iNextInt]);
                i11--;
                iArr[iNextInt] = iArr[i11];
            }
            return;
        }
        throw new ArithmeticException("The hamming weight is greater than the length of vector.");
    }

    public GF2Vector(int i11, int[] iArr) {
        if (i11 >= 0) {
            this.length = i11;
            int i12 = (i11 + 31) >> 5;
            if (iArr.length == i12) {
                int[] iArrClone = IntUtils.clone(iArr);
                this.f99856v = iArrClone;
                int i13 = i11 & 31;
                if (i13 != 0) {
                    int i14 = i12 - 1;
                    iArrClone[i14] = ((1 << i13) - 1) & iArrClone[i14];
                    return;
                }
                return;
            }
            throw new ArithmeticException("length mismatch");
        }
        throw new ArithmeticException("negative length");
    }

    public GF2Vector(GF2Vector gF2Vector) {
        this.length = gF2Vector.length;
        this.f99856v = IntUtils.clone(gF2Vector.f99856v);
    }

    protected GF2Vector(int[] iArr, int i11) {
        this.f99856v = iArr;
        this.length = i11;
    }
}
