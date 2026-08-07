package org.bouncycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes10.dex */
class ComputeInField {
    private void gaussElim(short[][] sArr) {
        int i11 = 0;
        while (i11 < sArr.length) {
            int i12 = i11 + 1;
            for (int i13 = i12; i13 < sArr.length; i13++) {
                if (sArr[i11][i11] == 0) {
                    for (int i14 = i11; i14 < sArr[0].length; i14++) {
                        short[] sArr2 = sArr[i11];
                        sArr2[i14] = GF2Field.addElem(sArr2[i14], sArr[i13][i14]);
                    }
                }
            }
            short sInvElem = GF2Field.invElem(sArr[i11][i11]);
            if (sInvElem == 0) {
                throw new RuntimeException("The matrix is not invertible");
            }
            sArr[i11] = multVect(sInvElem, sArr[i11]);
            for (int i15 = 0; i15 < sArr.length; i15++) {
                if (i11 != i15) {
                    short s11 = sArr[i15][i11];
                    for (int i16 = i11; i16 < sArr[0].length; i16++) {
                        short sMultElem = GF2Field.multElem(sArr[i11][i16], s11);
                        short[] sArr3 = sArr[i15];
                        sArr3[i16] = GF2Field.addElem(sArr3[i16], sMultElem);
                    }
                }
            }
            i11 = i12;
        }
    }

    public short[][] addMatrix(short[][] sArr, short[][] sArr2) {
        if (sArr.length == sArr2.length) {
            short[] sArr3 = sArr[0];
            if (sArr3.length == sArr2[0].length) {
                short[][] sArr4 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr3.length);
                for (int i11 = 0; i11 < sArr.length; i11++) {
                    for (int i12 = 0; i12 < sArr[0].length; i12++) {
                        sArr4[i11][i12] = GF2Field.addElem(sArr[i11][i12], sArr2[i11][i12]);
                    }
                }
                return sArr4;
            }
        }
        throw new RuntimeException("Addition is not possible!");
    }

    public short[][] addMatrixTranspose(short[][] sArr) {
        if (sArr.length == sArr[0].length) {
            return addMatrix(sArr, transpose(sArr));
        }
        throw new RuntimeException("Addition is not possible!");
    }

    public short[] addVect(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            throw new RuntimeException("Addition is not possible! vector1.length: " + sArr.length + " vector2.length: " + sArr2.length);
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
        if (sArr.length != sArr[0].length) {
            throw new RuntimeException("The matrix is not invertible. Please choose another one!");
        }
        try {
            short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) cls, sArr.length, sArr.length * 2);
            for (int i11 = 0; i11 < sArr.length; i11++) {
                System.arraycopy(sArr[i11], 0, sArr2[i11], 0, sArr.length);
                for (int length = sArr.length; length < sArr.length * 2; length++) {
                    sArr2[i11][length] = 0;
                }
                sArr2[i11][sArr2.length + i11] = 1;
            }
            gaussElim(sArr2);
            short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) cls, sArr2.length, sArr2.length);
            for (int i12 = 0; i12 < sArr2.length; i12++) {
                for (int length2 = sArr2.length; length2 < sArr2.length * 2; length2++) {
                    sArr3[i12][length2 - sArr2.length] = sArr2[i12][length2];
                }
            }
            return sArr3;
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

    public short multiplyMatrix_quad(short[][] sArr, short[] sArr2) {
        int length = sArr.length;
        short[] sArr3 = sArr[0];
        if (length != sArr3.length || sArr3.length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        short[] sArr4 = new short[sArr.length];
        short sAddElem = 0;
        for (int i11 = 0; i11 < sArr.length; i11++) {
            for (int i12 = 0; i12 < sArr2.length; i12++) {
                sArr4[i11] = GF2Field.addElem(sArr4[i11], GF2Field.multElem(sArr[i11][i12], sArr2[i12]));
            }
            sAddElem = GF2Field.addElem(sAddElem, GF2Field.multElem(sArr4[i11], sArr2[i11]));
        }
        return sAddElem;
    }

    public short[][][] obfuscate_l1_polys(short[][] sArr, short[][][] sArr2, short[][][] sArr3) {
        short[][] sArr4 = sArr2[0];
        int length = sArr4.length;
        short[][] sArr5 = sArr3[0];
        if (length == sArr5.length) {
            int length2 = sArr4[0].length;
            short[] sArr6 = sArr5[0];
            if (length2 == sArr6.length && sArr2.length == sArr[0].length && sArr3.length == sArr.length) {
                short[][][] sArr7 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, sArr3.length, sArr5.length, sArr6.length);
                for (int i11 = 0; i11 < sArr2[0].length; i11++) {
                    for (int i12 = 0; i12 < sArr2[0][0].length; i12++) {
                        for (int i13 = 0; i13 < sArr.length; i13++) {
                            for (int i14 = 0; i14 < sArr[0].length; i14++) {
                                short sMultElem = GF2Field.multElem(sArr[i13][i14], sArr2[i14][i11][i12]);
                                short[] sArr8 = sArr7[i13][i11];
                                sArr8[i12] = GF2Field.addElem(sArr8[i12], sMultElem);
                            }
                            short[] sArr9 = sArr7[i13][i11];
                            sArr9[i12] = GF2Field.addElem(sArr3[i13][i11][i12], sArr9[i12]);
                        }
                    }
                }
                return sArr7;
            }
        }
        throw new RuntimeException("Multiplication not possible!");
    }

    public short[] solveEquation(short[][] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return null;
        }
        try {
            short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length + 1);
            short[] sArr4 = new short[sArr.length];
            for (int i11 = 0; i11 < sArr.length; i11++) {
                System.arraycopy(sArr[i11], 0, sArr3[i11], 0, sArr[0].length);
                short[] sArr5 = sArr3[i11];
                sArr5[sArr2.length] = GF2Field.addElem(sArr2[i11], sArr5[sArr2.length]);
            }
            gaussElim(sArr3);
            for (int i12 = 0; i12 < sArr3.length; i12++) {
                sArr4[i12] = sArr3[i12][sArr2.length];
            }
            return sArr4;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[][] to_UT(short[][] sArr) {
        if (sArr.length != sArr[0].length) {
            throw new RuntimeException("Computation to upper triangular matrix is not possible!");
        }
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length);
        int i11 = 0;
        while (i11 < sArr.length) {
            sArr2[i11][i11] = sArr[i11][i11];
            int i12 = i11 + 1;
            for (int i13 = i12; i13 < sArr[0].length; i13++) {
                sArr2[i11][i13] = GF2Field.addElem(sArr[i11][i13], sArr[i13][i11]);
            }
            i11 = i12;
        }
        return sArr2;
    }

    public short[][] transpose(short[][] sArr) {
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr[0].length, sArr.length);
        for (int i11 = 0; i11 < sArr.length; i11++) {
            for (int i12 = 0; i12 < sArr[0].length; i12++) {
                sArr2[i12][i11] = sArr[i11][i12];
            }
        }
        return sArr2;
    }

    public short[][] multiplyMatrix(short[][] sArr, short[][] sArr2) {
        if (sArr[0].length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2[0].length);
        for (int i11 = 0; i11 < sArr.length; i11++) {
            for (int i12 = 0; i12 < sArr2.length; i12++) {
                for (int i13 = 0; i13 < sArr2[0].length; i13++) {
                    short sMultElem = GF2Field.multElem(sArr[i11][i12], sArr2[i12][i13]);
                    short[] sArr4 = sArr3[i11];
                    sArr4[i13] = GF2Field.addElem(sArr4[i13], sMultElem);
                }
            }
        }
        return sArr3;
    }
}
