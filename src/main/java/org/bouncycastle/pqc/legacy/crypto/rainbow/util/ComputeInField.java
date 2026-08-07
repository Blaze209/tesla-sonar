package org.bouncycastle.pqc.legacy.crypto.rainbow.util;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes10.dex */
public class ComputeInField {
    private short[][] A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    short[] f99263x;

    private void computeZerosAbove() {
        for (int length = this.A.length - 1; length > 0; length--) {
            for (int i11 = length - 1; i11 >= 0; i11--) {
                short[][] sArr = this.A;
                short s11 = sArr[i11][length];
                short sInvElem = GF2Field.invElem(sArr[length][length]);
                if (sInvElem == 0) {
                    throw new RuntimeException("The matrix is not invertible");
                }
                int i12 = length;
                while (true) {
                    short[][] sArr2 = this.A;
                    if (i12 < sArr2.length * 2) {
                        short sMultElem = GF2Field.multElem(s11, GF2Field.multElem(sArr2[length][i12], sInvElem));
                        short[] sArr3 = this.A[i11];
                        sArr3[i12] = GF2Field.addElem(sArr3[i12], sMultElem);
                        i12++;
                    }
                }
            }
        }
    }

    private void computeZerosUnder(boolean z11) {
        int length = z11 ? this.A.length * 2 : this.A.length + 1;
        int i11 = 0;
        while (i11 < this.A.length - 1) {
            int i12 = i11 + 1;
            int i13 = i12;
            while (true) {
                short[][] sArr = this.A;
                if (i13 < sArr.length) {
                    short s11 = sArr[i13][i11];
                    short sInvElem = GF2Field.invElem(sArr[i11][i11]);
                    if (sInvElem == 0) {
                        throw new IllegalStateException("Matrix not invertible! We have to choose another one!");
                    }
                    for (int i14 = i11; i14 < length; i14++) {
                        short sMultElem = GF2Field.multElem(s11, GF2Field.multElem(this.A[i11][i14], sInvElem));
                        short[] sArr2 = this.A[i13];
                        sArr2[i14] = GF2Field.addElem(sArr2[i14], sMultElem);
                    }
                    i13++;
                }
            }
            i11 = i12;
        }
    }

    private void substitute() {
        short[][] sArr = this.A;
        short sInvElem = GF2Field.invElem(sArr[sArr.length - 1][sArr.length - 1]);
        if (sInvElem == 0) {
            throw new IllegalStateException("The equation system is not solvable");
        }
        short[] sArr2 = this.f99263x;
        short[][] sArr3 = this.A;
        sArr2[sArr3.length - 1] = GF2Field.multElem(sArr3[sArr3.length - 1][sArr3.length], sInvElem);
        for (int length = this.A.length - 2; length >= 0; length--) {
            short[][] sArr4 = this.A;
            short sAddElem = sArr4[length][sArr4.length];
            for (int length2 = sArr4.length - 1; length2 > length; length2--) {
                sAddElem = GF2Field.addElem(sAddElem, GF2Field.multElem(this.A[length][length2], this.f99263x[length2]));
            }
            short sInvElem2 = GF2Field.invElem(this.A[length][length]);
            if (sInvElem2 == 0) {
                throw new IllegalStateException("Not solvable equation system");
            }
            this.f99263x[length] = GF2Field.multElem(sAddElem, sInvElem2);
        }
    }

    public short[][] addSquareMatrix(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length || sArr[0].length != sArr2[0].length) {
            throw new RuntimeException("Addition is not possible!");
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length);
        for (int i11 = 0; i11 < sArr.length; i11++) {
            for (int i12 = 0; i12 < sArr2.length; i12++) {
                sArr3[i11][i12] = GF2Field.addElem(sArr[i11][i12], sArr2[i11][i12]);
            }
        }
        return sArr3;
    }

    public short[] addVect(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        int length = sArr.length;
        short[] sArr3 = new short[length];
        for (int i11 = 0; i11 < length; i11++) {
            sArr3[i11] = GF2Field.addElem(sArr[i11], sArr2[i11]);
        }
        return sArr3;
    }

    public short[][] inverse(short[][] sArr) {
        Class cls = Short.TYPE;
        try {
            int i11 = 0;
            this.A = (short[][]) Array.newInstance((Class<?>) cls, sArr.length, sArr.length * 2);
            if (sArr.length != sArr[0].length) {
                throw new RuntimeException("The matrix is not invertible. Please choose another one!");
            }
            for (int i12 = 0; i12 < sArr.length; i12++) {
                for (int i13 = 0; i13 < sArr.length; i13++) {
                    this.A[i12][i13] = sArr[i12][i13];
                }
                for (int length = sArr.length; length < sArr.length * 2; length++) {
                    this.A[i12][length] = 0;
                }
                short[][] sArr2 = this.A;
                sArr2[i12][sArr2.length + i12] = 1;
            }
            computeZerosUnder(true);
            int i14 = 0;
            while (true) {
                short[][] sArr3 = this.A;
                if (i14 >= sArr3.length) {
                    break;
                }
                short sInvElem = GF2Field.invElem(sArr3[i14][i14]);
                int i15 = i14;
                while (true) {
                    short[][] sArr4 = this.A;
                    if (i15 < sArr4.length * 2) {
                        short[] sArr5 = sArr4[i14];
                        sArr5[i15] = GF2Field.multElem(sArr5[i15], sInvElem);
                        i15++;
                    }
                }
                i14++;
            }
            computeZerosAbove();
            short[][] sArr6 = this.A;
            short[][] sArr7 = (short[][]) Array.newInstance((Class<?>) cls, sArr6.length, sArr6.length);
            while (true) {
                short[][] sArr8 = this.A;
                if (i11 >= sArr8.length) {
                    return sArr7;
                }
                int length2 = sArr8.length;
                while (true) {
                    short[][] sArr9 = this.A;
                    if (length2 < sArr9.length * 2) {
                        sArr7[i11][length2 - sArr9.length] = sArr9[i11][length2];
                        length2++;
                    }
                }
                i11++;
            }
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[][] multMatrix(short s11, short[][] sArr) {
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr[0].length);
        for (int i11 = 0; i11 < sArr.length; i11++) {
            for (int i12 = 0; i12 < sArr[0].length; i12++) {
                sArr2[i11][i12] = GF2Field.multElem(s11, sArr[i11][i12]);
            }
        }
        return sArr2;
    }

    public short[] multVect(short s11, short[] sArr) {
        int length = sArr.length;
        short[] sArr2 = new short[length];
        for (int i11 = 0; i11 < length; i11++) {
            sArr2[i11] = GF2Field.multElem(s11, sArr[i11]);
        }
        return sArr2;
    }

    public short[][] multVects(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2.length);
        for (int i11 = 0; i11 < sArr.length; i11++) {
            for (int i12 = 0; i12 < sArr2.length; i12++) {
                sArr3[i11][i12] = GF2Field.multElem(sArr[i11], sArr2[i12]);
            }
        }
        return sArr3;
    }

    public short[] multiplyMatrix(short[][] sArr, short[] sArr2) {
        if (sArr[0].length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        short[] sArr3 = new short[sArr.length];
        for (int i11 = 0; i11 < sArr.length; i11++) {
            for (int i12 = 0; i12 < sArr2.length; i12++) {
                sArr3[i11] = GF2Field.addElem(sArr3[i11], GF2Field.multElem(sArr[i11][i12], sArr2[i12]));
            }
        }
        return sArr3;
    }

    public short[] solveEquation(short[][] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return null;
        }
        try {
            this.A = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length + 1);
            this.f99263x = new short[sArr.length];
            for (int i11 = 0; i11 < sArr.length; i11++) {
                for (int i12 = 0; i12 < sArr[0].length; i12++) {
                    this.A[i11][i12] = sArr[i11][i12];
                }
            }
            for (int i13 = 0; i13 < sArr2.length; i13++) {
                short[] sArr3 = this.A[i13];
                sArr3[sArr2.length] = GF2Field.addElem(sArr2[i13], sArr3[sArr2.length]);
            }
            computeZerosUnder(false);
            substitute();
            return this.f99263x;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[][] multiplyMatrix(short[][] sArr, short[][] sArr2) {
        if (sArr[0].length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        this.A = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2[0].length);
        for (int i11 = 0; i11 < sArr.length; i11++) {
            for (int i12 = 0; i12 < sArr2.length; i12++) {
                for (int i13 = 0; i13 < sArr2[0].length; i13++) {
                    short sMultElem = GF2Field.multElem(sArr[i11][i12], sArr2[i12][i13]);
                    short[] sArr3 = this.A[i11];
                    sArr3[i13] = GF2Field.addElem(sArr3[i13], sMultElem);
                }
            }
        }
        return this.A;
    }
}
