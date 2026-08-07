package org.spongycastle.pqc.math.ntru.polynomial;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class LongPolynomial2 {
    private long[] coeffs;
    private int numCoeffs;

    public LongPolynomial2(IntegerPolynomial integerPolynomial) {
        long j11;
        int length = integerPolynomial.coeffs.length;
        this.numCoeffs = length;
        this.coeffs = new long[(length + 1) / 2];
        int i11 = 0;
        int i12 = 0;
        while (i11 < this.numCoeffs) {
            int i13 = i11 + 1;
            int i14 = integerPolynomial.coeffs[i11];
            while (i14 < 0) {
                i14 += 2048;
            }
            if (i13 < this.numCoeffs) {
                i11 += 2;
                j11 = integerPolynomial.coeffs[i13];
            } else {
                i11 = i13;
                j11 = 0;
            }
            while (j11 < 0) {
                j11 += ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
            }
            this.coeffs[i12] = ((long) i14) + (j11 << 24);
            i12++;
        }
    }

    private void add(LongPolynomial2 longPolynomial2) {
        long[] jArr = longPolynomial2.coeffs;
        int length = jArr.length;
        long[] jArr2 = this.coeffs;
        if (length > jArr2.length) {
            this.coeffs = Arrays.copyOf(jArr2, jArr.length);
        }
        int i11 = 0;
        while (true) {
            long[] jArr3 = longPolynomial2.coeffs;
            if (i11 >= jArr3.length) {
                return;
            }
            long[] jArr4 = this.coeffs;
            jArr4[i11] = (jArr4[i11] + jArr3[i11]) & 34342963199L;
            i11++;
        }
    }

    private LongPolynomial2 multRecursive(LongPolynomial2 longPolynomial2) {
        long[] jArr = this.coeffs;
        long[] jArr2 = longPolynomial2.coeffs;
        int length = jArr2.length;
        int i11 = 0;
        if (length <= 32) {
            int i12 = length * 2;
            LongPolynomial2 longPolynomial3 = new LongPolynomial2(new long[i12]);
            for (int i13 = 0; i13 < i12; i13++) {
                for (int iMax = Math.max(0, (i13 - length) + 1); iMax <= Math.min(i13, length - 1); iMax++) {
                    long j11 = jArr[i13 - iMax] * jArr2[iMax];
                    long[] jArr3 = longPolynomial3.coeffs;
                    jArr3[i13] = (jArr3[i13] + (j11 & ((j11 & 2047) + 34342961152L))) & 34342963199L;
                    int i14 = i13 + 1;
                    jArr3[i14] = (jArr3[i14] + ((j11 >>> 48) & 2047)) & 34342963199L;
                }
            }
            return longPolynomial3;
        }
        int i15 = length / 2;
        LongPolynomial2 longPolynomial4 = new LongPolynomial2(Arrays.copyOf(jArr, i15));
        LongPolynomial2 longPolynomial5 = new LongPolynomial2(Arrays.copyOfRange(jArr, i15, length));
        LongPolynomial2 longPolynomial6 = new LongPolynomial2(Arrays.copyOf(jArr2, i15));
        LongPolynomial2 longPolynomial7 = new LongPolynomial2(Arrays.copyOfRange(jArr2, i15, length));
        LongPolynomial2 longPolynomial8 = (LongPolynomial2) longPolynomial4.clone();
        longPolynomial8.add(longPolynomial5);
        LongPolynomial2 longPolynomial9 = (LongPolynomial2) longPolynomial6.clone();
        longPolynomial9.add(longPolynomial7);
        LongPolynomial2 longPolynomial2MultRecursive = longPolynomial4.multRecursive(longPolynomial6);
        LongPolynomial2 longPolynomial2MultRecursive2 = longPolynomial5.multRecursive(longPolynomial7);
        LongPolynomial2 longPolynomial2MultRecursive3 = longPolynomial8.multRecursive(longPolynomial9);
        longPolynomial2MultRecursive3.sub(longPolynomial2MultRecursive);
        longPolynomial2MultRecursive3.sub(longPolynomial2MultRecursive2);
        LongPolynomial2 longPolynomial10 = new LongPolynomial2(length * 2);
        int i16 = 0;
        while (true) {
            long[] jArr4 = longPolynomial2MultRecursive.coeffs;
            if (i16 >= jArr4.length) {
                break;
            }
            longPolynomial10.coeffs[i16] = jArr4[i16] & 34342963199L;
            i16++;
        }
        int i17 = 0;
        while (true) {
            long[] jArr5 = longPolynomial2MultRecursive3.coeffs;
            if (i17 >= jArr5.length) {
                break;
            }
            long[] jArr6 = longPolynomial10.coeffs;
            int i18 = i15 + i17;
            jArr6[i18] = (jArr6[i18] + jArr5[i17]) & 34342963199L;
            i17++;
        }
        while (true) {
            long[] jArr7 = longPolynomial2MultRecursive2.coeffs;
            if (i11 >= jArr7.length) {
                return longPolynomial10;
            }
            long[] jArr8 = longPolynomial10.coeffs;
            int i19 = (i15 * 2) + i11;
            jArr8[i19] = (jArr8[i19] + jArr7[i11]) & 34342963199L;
            i11++;
        }
    }

    private void sub(LongPolynomial2 longPolynomial2) {
        long[] jArr = longPolynomial2.coeffs;
        int length = jArr.length;
        long[] jArr2 = this.coeffs;
        if (length > jArr2.length) {
            this.coeffs = Arrays.copyOf(jArr2, jArr.length);
        }
        int i11 = 0;
        while (true) {
            long[] jArr3 = longPolynomial2.coeffs;
            if (i11 >= jArr3.length) {
                return;
            }
            long[] jArr4 = this.coeffs;
            jArr4[i11] = 34342963199L & ((jArr4[i11] + 140737496743936L) - jArr3[i11]);
            i11++;
        }
    }

    public Object clone() {
        LongPolynomial2 longPolynomial2 = new LongPolynomial2((long[]) this.coeffs.clone());
        longPolynomial2.numCoeffs = this.numCoeffs;
        return longPolynomial2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LongPolynomial2) {
            return Arrays.areEqual(this.coeffs, ((LongPolynomial2) obj).coeffs);
        }
        return false;
    }

    public LongPolynomial2 mult(LongPolynomial2 longPolynomial2) {
        long[] jArr;
        long[] jArr2;
        int length = this.coeffs.length;
        if (longPolynomial2.coeffs.length != length || this.numCoeffs != longPolynomial2.numCoeffs) {
            throw new IllegalArgumentException("Number of coefficients must be the same");
        }
        LongPolynomial2 longPolynomial2MultRecursive = multRecursive(longPolynomial2);
        if (longPolynomial2MultRecursive.coeffs.length > length) {
            if (this.numCoeffs % 2 == 0) {
                int i11 = length;
                while (true) {
                    jArr2 = longPolynomial2MultRecursive.coeffs;
                    if (i11 >= jArr2.length) {
                        break;
                    }
                    int i12 = i11 - length;
                    jArr2[i12] = (jArr2[i12] + jArr2[i11]) & 34342963199L;
                    i11++;
                }
                longPolynomial2MultRecursive.coeffs = Arrays.copyOf(jArr2, length);
            } else {
                int i13 = length;
                while (true) {
                    jArr = longPolynomial2MultRecursive.coeffs;
                    if (i13 >= jArr.length) {
                        break;
                    }
                    int i14 = i13 - length;
                    long j11 = jArr[i14] + (jArr[i13 - 1] >> 24);
                    jArr[i14] = j11;
                    long j12 = j11 + ((2047 & jArr[i13]) << 24);
                    jArr[i14] = j12;
                    jArr[i14] = j12 & 34342963199L;
                    i13++;
                }
                long[] jArrCopyOf = Arrays.copyOf(jArr, length);
                longPolynomial2MultRecursive.coeffs = jArrCopyOf;
                int length2 = jArrCopyOf.length - 1;
                jArrCopyOf[length2] = jArrCopyOf[length2] & 2047;
            }
        }
        LongPolynomial2 longPolynomial3 = new LongPolynomial2(longPolynomial2MultRecursive.coeffs);
        longPolynomial3.numCoeffs = this.numCoeffs;
        return longPolynomial3;
    }

    public void mult2And(int i11) {
        long j11 = i11;
        long j12 = (j11 << 24) + j11;
        int i12 = 0;
        while (true) {
            long[] jArr = this.coeffs;
            if (i12 >= jArr.length) {
                return;
            }
            jArr[i12] = (jArr[i12] << 1) & j12;
            i12++;
        }
    }

    public void subAnd(LongPolynomial2 longPolynomial2, int i11) {
        long j11 = i11;
        long j12 = (j11 << 24) + j11;
        int i12 = 0;
        while (true) {
            long[] jArr = longPolynomial2.coeffs;
            if (i12 >= jArr.length) {
                return;
            }
            long[] jArr2 = this.coeffs;
            jArr2[i12] = ((jArr2[i12] + 140737496743936L) - jArr[i12]) & j12;
            i12++;
        }
    }

    public IntegerPolynomial toIntegerPolynomial() {
        int[] iArr = new int[this.numCoeffs];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            long[] jArr = this.coeffs;
            if (i11 >= jArr.length) {
                return new IntegerPolynomial(iArr);
            }
            int i13 = i12 + 1;
            long j11 = jArr[i11];
            iArr[i12] = (int) (j11 & 2047);
            if (i13 < this.numCoeffs) {
                i12 += 2;
                iArr[i13] = (int) ((j11 >> 24) & 2047);
            } else {
                i12 = i13;
            }
            i11++;
        }
    }

    private LongPolynomial2(long[] jArr) {
        this.coeffs = jArr;
    }

    private LongPolynomial2(int i11) {
        this.coeffs = new long[i11];
    }
}
