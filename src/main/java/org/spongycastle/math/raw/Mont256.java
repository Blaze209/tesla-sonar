package org.spongycastle.math.raw;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Mont256 {
    private static final long M = 4294967295L;

    public static int inverse32(int i11) {
        int i12 = (2 - (i11 * i11)) * i11;
        int i13 = i12 * (2 - (i11 * i12));
        int i14 = i13 * (2 - (i11 * i13));
        return i14 * (2 - (i11 * i14));
    }

    public static void multAdd(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i11) {
        char c11 = 0;
        long j11 = iArr2[0];
        long j12 = M;
        long j13 = j11 & M;
        int i12 = 0;
        int i13 = 0;
        while (i12 < 8) {
            long j14 = ((long) iArr3[c11]) & j12;
            long j15 = ((long) iArr[i12]) & j12;
            long j16 = j15 * j13;
            long j17 = (j16 & j12) + j14;
            char c12 = c11;
            long j18 = j12;
            long j19 = ((long) (((int) j17) * i11)) & j18;
            long j21 = (((long) iArr4[c12]) & j18) * j19;
            char c13 = ' ';
            long j22 = ((j17 + (j21 & j18)) >>> 32) + (j16 >>> 32) + (j21 >>> 32);
            int i14 = 1;
            while (i14 < 8) {
                long j23 = (((long) iArr2[i14]) & j18) * j15;
                char c14 = c13;
                long j24 = (((long) iArr4[i14]) & j18) * j19;
                long j25 = j22 + (j23 & j18) + (j24 & j18) + (((long) iArr3[i14]) & j18);
                iArr3[i14 - 1] = (int) j25;
                j22 = (j25 >>> c14) + (j23 >>> c14) + (j24 >>> c14);
                i14++;
                c13 = c14;
                j13 = j13;
                j19 = j19;
            }
            char c15 = c13;
            long j26 = j22 + (((long) i13) & j18);
            iArr3[7] = (int) j26;
            i13 = (int) (j26 >>> c15);
            i12++;
            c11 = c12;
            j12 = j18;
            j13 = j13;
        }
        if (i13 != 0 || Nat256.gte(iArr3, iArr4)) {
            Nat256.sub(iArr3, iArr4, iArr3);
        }
    }

    public static void multAddXF(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        char c11 = 0;
        long j11 = iArr2[0];
        long j12 = M;
        long j13 = j11 & M;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= 8) {
                break;
            }
            long j14 = ((long) iArr[i11]) & j12;
            long j15 = (j14 * j13) + (((long) iArr3[c11]) & j12);
            long j16 = j15 & j12;
            long j17 = (j15 >>> 32) + j16;
            int i13 = 1;
            for (int i14 = 8; i13 < i14; i14 = 8) {
                long j18 = j12;
                long j19 = (((long) iArr2[i13]) & j18) * j14;
                int i15 = i13;
                long j21 = (((long) iArr4[i13]) & j18) * j16;
                long j22 = j17 + (j19 & j18) + (j21 & j18) + (((long) iArr3[i15]) & j18);
                iArr3[i15 - 1] = (int) j22;
                j17 = (j22 >>> 32) + (j19 >>> 32) + (j21 >>> 32);
                i13 = i15 + 1;
                j12 = j18;
                j13 = j13;
            }
            long j23 = j17 + (((long) i12) & j12);
            iArr3[7] = (int) j23;
            i12 = (int) (j23 >>> 32);
            i11++;
            j13 = j13;
            c11 = 0;
        }
        if (i12 != 0 || Nat256.gte(iArr3, iArr4)) {
            Nat256.sub(iArr3, iArr4, iArr3);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2, int i11) {
        char c11 = 0;
        int i12 = 0;
        while (i12 < 8) {
            int i13 = iArr[c11];
            long j11 = ((long) (i13 * i11)) & M;
            long j12 = (((((long) iArr2[c11]) & M) * j11) + (((long) i13) & M)) >>> 32;
            int i14 = 1;
            while (i14 < 8) {
                long j13 = j12 + ((((long) iArr2[i14]) & M) * j11) + (((long) iArr[i14]) & M);
                iArr[i14 - 1] = (int) j13;
                j12 = j13 >>> 32;
                i14++;
                i12 = i12;
            }
            iArr[7] = (int) j12;
            i12++;
            c11 = 0;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr, iArr2, iArr);
        }
    }

    public static void reduceXF(int[] iArr, int[] iArr2) {
        for (int i11 = 0; i11 < 8; i11++) {
            long j11 = ((long) iArr[0]) & M;
            long j12 = j11;
            for (int i12 = 1; i12 < 8; i12++) {
                long j13 = j12 + ((((long) iArr2[i12]) & M) * j11) + (((long) iArr[i12]) & M);
                iArr[i12 - 1] = (int) j13;
                j12 = j13 >>> 32;
            }
            iArr[7] = (int) j12;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr, iArr2, iArr);
        }
    }
}
