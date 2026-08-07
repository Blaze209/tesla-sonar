package org.bouncycastle.pqc.legacy.math.linearalgebra;

import java.security.SecureRandom;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class Permutation {
    private int[] perm;

    public Permutation(int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("invalid length");
        }
        this.perm = new int[i11];
        for (int i12 = i11 - 1; i12 >= 0; i12--) {
            this.perm[i12] = i12;
        }
    }

    private boolean isPermutation(int[] iArr) {
        int length = iArr.length;
        boolean[] zArr = new boolean[length];
        for (int i11 : iArr) {
            if (i11 < 0 || i11 >= length || zArr[i11]) {
                return false;
            }
            zArr[i11] = true;
        }
        return true;
    }

    public Permutation computeInverse() {
        Permutation permutation = new Permutation(this.perm.length);
        for (int length = this.perm.length - 1; length >= 0; length--) {
            permutation.perm[this.perm[length]] = length;
        }
        return permutation;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Permutation) {
            return IntUtils.equals(this.perm, ((Permutation) obj).perm);
        }
        return false;
    }

    public byte[] getEncoded() {
        int length = this.perm.length;
        int iCeilLog256 = IntegerFunctions.ceilLog256(length - 1);
        byte[] bArr = new byte[(length * iCeilLog256) + 4];
        LittleEndianConversions.I2OSP(length, bArr, 0);
        for (int i11 = 0; i11 < length; i11++) {
            LittleEndianConversions.I2OSP(this.perm[i11], bArr, (i11 * iCeilLog256) + 4, iCeilLog256);
        }
        return bArr;
    }

    public int[] getVector() {
        return IntUtils.clone(this.perm);
    }

    public int hashCode() {
        return Arrays.hashCode(this.perm);
    }

    public Permutation rightMultiply(Permutation permutation) {
        int length = permutation.perm.length;
        int[] iArr = this.perm;
        if (length != iArr.length) {
            throw new IllegalArgumentException("length mismatch");
        }
        Permutation permutation2 = new Permutation(iArr.length);
        for (int length2 = this.perm.length - 1; length2 >= 0; length2--) {
            permutation2.perm[length2] = this.perm[permutation.perm[length2]];
        }
        return permutation2;
    }

    public String toString() {
        String str = "[" + this.perm[0];
        for (int i11 = 1; i11 < this.perm.length; i11++) {
            str = str + ", " + this.perm[i11];
        }
        return str + "]";
    }

    public Permutation(int i11, SecureRandom secureRandom) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("invalid length");
        }
        this.perm = new int[i11];
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i12] = i12;
        }
        int i13 = i11;
        for (int i14 = 0; i14 < i11; i14++) {
            int iNextInt = RandUtils.nextInt(secureRandom, i13);
            i13--;
            this.perm[i14] = iArr[iNextInt];
            iArr[iNextInt] = iArr[i13];
        }
    }

    public Permutation(byte[] bArr) {
        if (bArr.length <= 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        int iOS2IP = LittleEndianConversions.OS2IP(bArr, 0);
        int iCeilLog256 = IntegerFunctions.ceilLog256(iOS2IP - 1);
        if (bArr.length != (iOS2IP * iCeilLog256) + 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        this.perm = new int[iOS2IP];
        for (int i11 = 0; i11 < iOS2IP; i11++) {
            this.perm[i11] = LittleEndianConversions.OS2IP(bArr, (i11 * iCeilLog256) + 4, iCeilLog256);
        }
        if (!isPermutation(this.perm)) {
            throw new IllegalArgumentException("invalid encoding");
        }
    }

    public Permutation(int[] iArr) {
        if (!isPermutation(iArr)) {
            throw new IllegalArgumentException("array is not a permutation vector");
        }
        this.perm = IntUtils.clone(iArr);
    }
}
