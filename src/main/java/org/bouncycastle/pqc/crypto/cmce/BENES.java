package org.bouncycastle.pqc.crypto.cmce;

/* JADX INFO: loaded from: classes10.dex */
abstract class BENES {
    private static final long[] TRANSPOSE_MASKS = {6148914691236517205L, 3689348814741910323L, 1085102592571150095L, 71777214294589695L, 281470681808895L, 4294967295L};
    protected final int GFBITS;
    protected final int SYS_N;
    protected final int SYS_T;

    public BENES(int i11, int i12, int i13) {
        this.SYS_N = i11;
        this.SYS_T = i12;
        this.GFBITS = i13;
    }

    static void transpose_64x64(long[] jArr, long[] jArr2) {
        transpose_64x64(jArr, jArr2, 0);
    }

    protected abstract void support_gen(short[] sArr, byte[] bArr);

    static void transpose_64x64(long[] jArr, long[] jArr2, int i11) {
        int i12;
        System.arraycopy(jArr2, i11, jArr, i11, 64);
        int i13 = 5;
        do {
            long j11 = TRANSPOSE_MASKS[i13];
            int i14 = 1 << i13;
            int i15 = i11;
            while (true) {
                i12 = i11 + 64;
                if (i15 >= i12) {
                    break;
                }
                for (int i16 = i15; i16 < i15 + i14; i16 += 4) {
                    long j12 = jArr[i16];
                    int i17 = i16 + 1;
                    long j13 = jArr[i17];
                    int i18 = i16 + 2;
                    long j14 = jArr[i18];
                    int i19 = i16 + 3;
                    long j15 = jArr[i19];
                    int i21 = i16 + i14;
                    long j16 = jArr[i21];
                    int i22 = i21 + 1;
                    long j17 = jArr[i22];
                    int i23 = i21 + 2;
                    long j18 = jArr[i23];
                    int i24 = i21 + 3;
                    long j19 = jArr[i24];
                    long j21 = ((j12 >>> i14) ^ j16) & j11;
                    long j22 = ((j13 >>> i14) ^ j17) & j11;
                    long j23 = ((j14 >>> i14) ^ j18) & j11;
                    long j24 = ((j15 >>> i14) ^ j19) & j11;
                    jArr[i16] = j12 ^ (j21 << i14);
                    jArr[i17] = (j22 << i14) ^ j13;
                    jArr[i18] = (j23 << i14) ^ j14;
                    jArr[i19] = j15 ^ (j24 << i14);
                    jArr[i21] = j16 ^ j21;
                    jArr[i22] = j17 ^ j22;
                    jArr[i23] = j18 ^ j23;
                    jArr[i24] = j19 ^ j24;
                }
                i15 += i14 * 2;
            }
            i13--;
        } while (i13 >= 2);
        do {
            long j25 = TRANSPOSE_MASKS[i13];
            int i25 = 1 << i13;
            for (int i26 = i11; i26 < i12; i26 += i25 * 2) {
                for (int i27 = i26; i27 < i26 + i25; i27++) {
                    long j26 = jArr[i27];
                    int i28 = i27 + i25;
                    long j27 = jArr[i28];
                    long j28 = ((j26 >>> i25) ^ j27) & j25;
                    jArr[i27] = j26 ^ (j28 << i25);
                    jArr[i28] = j27 ^ j28;
                }
            }
            i13--;
        } while (i13 >= 0);
    }
}
