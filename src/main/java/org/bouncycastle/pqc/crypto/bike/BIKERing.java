package org.bouncycastle.pqc.crypto.bike;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes10.dex */
class BIKERing {
    private static final int PERMUTATION_CUTOFF = 64;
    private final int bits;
    private final Map<Integer, Integer> halfPowers;
    private final int size;
    private final int sizeExt;

    BIKERing(int i11) {
        HashMap map = new HashMap();
        this.halfPowers = map;
        if (((-65535) & i11) != 1) {
            throw new IllegalArgumentException();
        }
        this.bits = i11;
        int i12 = (i11 + 63) >>> 6;
        this.size = i12;
        this.sizeExt = i12 * 2;
        generateHalfPowersInv(map, i11);
    }

    private static int generateHalfPower(int i11, int i12, int i13) {
        int i14 = 1;
        while (i13 >= 32) {
            i14 = (int) ((((4294967295L & ((long) (i12 * i14))) * ((long) i11)) + ((long) i14)) >>> 32);
            i13 -= 32;
        }
        if (i13 <= 0) {
            return i14;
        }
        return (int) ((((4294967295L & ((long) ((i12 * i14) & ((-1) >>> (-i13))))) * ((long) i11)) + ((long) i14)) >>> i13);
    }

    private static void generateHalfPowersInv(Map<Integer, Integer> map, int i11) {
        int i12;
        int i13 = i11 - 2;
        int iNumberOfLeadingZeros = 32 - Integers.numberOfLeadingZeros(i13);
        int iInverse32 = Mod.inverse32(-i11);
        for (int i14 = 1; i14 < iNumberOfLeadingZeros; i14++) {
            int i15 = 1 << (i14 - 1);
            if (i15 >= 64 && !map.containsKey(Integers.valueOf(i15))) {
                map.put(Integers.valueOf(i15), Integers.valueOf(generateHalfPower(i11, iInverse32, i15)));
            }
            int i16 = 1 << i14;
            if ((i13 & i16) != 0 && (i12 = (i16 - 1) & i13) >= 64 && !map.containsKey(Integers.valueOf(i12))) {
                map.put(Integers.valueOf(i12), Integers.valueOf(generateHalfPower(i11, iInverse32, i12)));
            }
        }
    }

    private static int implModAdd(int i11, int i12, int i13) {
        int i14 = (i12 + i13) - i11;
        return i14 + (i11 & (i14 >> 31));
    }

    private static void implMulwAcc(long[] jArr, long j11, long j12, long[] jArr2, int i11) {
        long j13 = j11;
        jArr[1] = j12;
        for (int i12 = 2; i12 < 16; i12 += 2) {
            long j14 = jArr[i12 >>> 1] << 1;
            jArr[i12] = j14;
            jArr[i12 + 1] = j14 ^ j12;
        }
        int i13 = (int) j13;
        long j15 = jArr[i13 & 15] ^ (jArr[(i13 >>> 4) & 15] << 4);
        long j16 = 0;
        int i14 = 56;
        do {
            int i15 = (int) (j13 >>> i14);
            long j17 = jArr[i15 & 15] ^ (jArr[(i15 >>> 4) & 15] << 4);
            j15 ^= j17 << i14;
            j16 ^= j17 >>> (-i14);
            i14 -= 8;
        } while (i14 > 0);
        for (int i16 = 0; i16 < 7; i16++) {
            j13 = (j13 & (-72340172838076674L)) >>> 1;
            j16 ^= ((j12 << i16) >> 63) & j13;
        }
        jArr2[i11] = jArr2[i11] ^ j15;
        int i17 = i11 + 1;
        jArr2[i17] = jArr2[i17] ^ j16;
    }

    private void implPermute(long[] jArr, int i11, long[] jArr2) {
        int i12 = this.bits;
        int iIntValue = this.halfPowers.get(Integers.valueOf(i11)).intValue();
        int iImplModAdd = implModAdd(i12, iIntValue, iIntValue);
        int iImplModAdd2 = implModAdd(i12, iImplModAdd, iImplModAdd);
        int iImplModAdd3 = implModAdd(i12, iImplModAdd2, iImplModAdd2);
        int iImplModAdd4 = i12 - iImplModAdd3;
        int iImplModAdd5 = implModAdd(i12, iImplModAdd4, iIntValue);
        int iImplModAdd6 = implModAdd(i12, iImplModAdd4, iImplModAdd);
        int iImplModAdd7 = implModAdd(i12, iImplModAdd5, iImplModAdd);
        int iImplModAdd8 = implModAdd(i12, iImplModAdd4, iImplModAdd2);
        int iImplModAdd9 = implModAdd(i12, iImplModAdd5, iImplModAdd2);
        int iImplModAdd10 = implModAdd(i12, iImplModAdd6, iImplModAdd2);
        int iImplModAdd11 = implModAdd(i12, iImplModAdd7, iImplModAdd2);
        int i13 = 0;
        while (true) {
            int i14 = this.size;
            if (i13 >= i14) {
                int i15 = i14 - 1;
                jArr2[i15] = jArr2[i15] & ((-1) >>> (-i12));
                return;
            }
            long j11 = 0;
            for (int i16 = 0; i16 < 64; i16 += 8) {
                iImplModAdd4 = implModAdd(i12, iImplModAdd4, iImplModAdd3);
                iImplModAdd5 = implModAdd(i12, iImplModAdd5, iImplModAdd3);
                iImplModAdd6 = implModAdd(i12, iImplModAdd6, iImplModAdd3);
                iImplModAdd7 = implModAdd(i12, iImplModAdd7, iImplModAdd3);
                iImplModAdd8 = implModAdd(i12, iImplModAdd8, iImplModAdd3);
                iImplModAdd9 = implModAdd(i12, iImplModAdd9, iImplModAdd3);
                iImplModAdd10 = implModAdd(i12, iImplModAdd10, iImplModAdd3);
                iImplModAdd11 = implModAdd(i12, iImplModAdd11, iImplModAdd3);
                j11 = j11 | (((jArr[iImplModAdd4 >>> 6] >>> iImplModAdd4) & 1) << i16) | (((jArr[iImplModAdd5 >>> 6] >>> iImplModAdd5) & 1) << (i16 + 1)) | (((jArr[iImplModAdd6 >>> 6] >>> iImplModAdd6) & 1) << (i16 + 2)) | (((jArr[iImplModAdd7 >>> 6] >>> iImplModAdd7) & 1) << (i16 + 3)) | (((jArr[iImplModAdd8 >>> 6] >>> iImplModAdd8) & 1) << (i16 + 4)) | (((jArr[iImplModAdd9 >>> 6] >>> iImplModAdd9) & 1) << (i16 + 5)) | (((jArr[iImplModAdd10 >>> 6] >>> iImplModAdd10) & 1) << (i16 + 6)) | (((jArr[iImplModAdd11 >>> 6] >>> iImplModAdd11) & 1) << (i16 + 7));
            }
            jArr2[i13] = j11;
            i13++;
        }
    }

    private void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, this.size, jArr2, 0);
    }

    void add(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i11 = 0; i11 < this.size; i11++) {
            jArr3[i11] = jArr[i11] ^ jArr2[i11];
        }
    }

    void addTo(long[] jArr, long[] jArr2) {
        for (int i11 = 0; i11 < this.size; i11++) {
            jArr2[i11] = jArr2[i11] ^ jArr[i11];
        }
    }

    void copy(long[] jArr, long[] jArr2) {
        for (int i11 = 0; i11 < this.size; i11++) {
            jArr2[i11] = jArr[i11];
        }
    }

    long[] create() {
        return new long[this.size];
    }

    long[] createExt() {
        return new long[this.sizeExt];
    }

    void decodeBytes(byte[] bArr, long[] jArr) {
        int i11 = this.bits & 63;
        Pack.littleEndianToLong(bArr, 0, jArr, 0, this.size - 1);
        byte[] bArr2 = new byte[8];
        System.arraycopy(bArr, (this.size - 1) << 3, bArr2, 0, (i11 + 7) >>> 3);
        jArr[this.size - 1] = Pack.littleEndianToLong(bArr2, 0);
    }

    byte[] encodeBitsTransposed(long[] jArr) {
        byte[] bArr = new byte[this.bits];
        bArr[0] = (byte) (jArr[0] & 1);
        int i11 = 1;
        while (true) {
            int i12 = this.bits;
            if (i11 >= i12) {
                return bArr;
            }
            bArr[i12 - i11] = (byte) ((jArr[i11 >>> 6] >>> (i11 & 63)) & 1);
            i11++;
        }
    }

    void encodeBytes(long[] jArr, byte[] bArr) {
        int i11 = this.bits & 63;
        Pack.longToLittleEndian(jArr, 0, this.size - 1, bArr, 0);
        byte[] bArr2 = new byte[8];
        Pack.longToLittleEndian(jArr[this.size - 1], bArr2, 0);
        System.arraycopy(bArr2, 0, bArr, (this.size - 1) << 3, (i11 + 7) >>> 3);
    }

    int getSize() {
        return this.size;
    }

    int getSizeExt() {
        return this.sizeExt;
    }

    protected void implMultiplyAcc(long[] jArr, long[] jArr2, long[] jArr3) {
        int i11;
        long[] jArr4 = new long[16];
        int i12 = 0;
        for (int i13 = 0; i13 < this.size; i13++) {
            implMulwAcc(jArr4, jArr[i13], jArr2[i13], jArr3, i13 << 1);
        }
        long j11 = jArr3[0];
        long j12 = jArr3[1];
        for (int i14 = 1; i14 < this.size; i14++) {
            int i15 = i14 << 1;
            j11 ^= jArr3[i15];
            jArr3[i14] = j11 ^ j12;
            j12 ^= jArr3[i15 + 1];
        }
        long j13 = j11 ^ j12;
        while (true) {
            i11 = this.size;
            if (i12 >= i11) {
                break;
            }
            jArr3[i11 + i12] = jArr3[i12] ^ j13;
            i12++;
        }
        int i16 = i11 - 1;
        for (int i17 = 1; i17 < i16 * 2; i17++) {
            int iMin = Math.min(i16, i17);
            int i18 = i17 - iMin;
            while (i18 < iMin) {
                implMulwAcc(jArr4, jArr[i18] ^ jArr[iMin], jArr2[i18] ^ jArr2[iMin], jArr3, i17);
                i18++;
                iMin--;
            }
        }
    }

    void inv(long[] jArr, long[] jArr2) {
        long[] jArrCreate = create();
        long[] jArrCreate2 = create();
        long[] jArrCreate3 = create();
        copy(jArr, jArrCreate);
        copy(jArr, jArrCreate3);
        int i11 = this.bits - 2;
        int iNumberOfLeadingZeros = 32 - Integers.numberOfLeadingZeros(i11);
        for (int i12 = 1; i12 < iNumberOfLeadingZeros; i12++) {
            squareN(jArrCreate, 1 << (i12 - 1), jArrCreate2);
            multiply(jArrCreate, jArrCreate2, jArrCreate);
            int i13 = 1 << i12;
            if ((i11 & i13) != 0) {
                squareN(jArrCreate, (i13 - 1) & i11, jArrCreate2);
                multiply(jArrCreate3, jArrCreate2, jArrCreate3);
            }
        }
        square(jArrCreate3, jArr2);
    }

    void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt = createExt();
        implMultiplyAcc(jArr, jArr2, jArrCreateExt);
        reduce(jArrCreateExt, jArr3);
    }

    void reduce(long[] jArr, long[] jArr2) {
        int i11 = 64 - (this.bits & 63);
        int i12 = this.size;
        Nat.shiftUpBits64(i12, jArr, i12, i11, jArr[i12 - 1], jArr2, 0);
        addTo(jArr, jArr2);
        int i13 = this.size - 1;
        jArr2[i13] = jArr2[i13] & ((-1) >>> i11);
    }

    void square(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt = createExt();
        implSquare(jArr, jArrCreateExt);
        reduce(jArrCreateExt, jArr2);
    }

    void squareN(long[] jArr, int i11, long[] jArr2) {
        if (i11 >= 64) {
            implPermute(jArr, i11, jArr2);
            return;
        }
        long[] jArrCreateExt = createExt();
        implSquare(jArr, jArrCreateExt);
        while (true) {
            reduce(jArrCreateExt, jArr2);
            i11--;
            if (i11 <= 0) {
                return;
            } else {
                implSquare(jArr2, jArrCreateExt);
            }
        }
    }
}
