package org.bouncycastle.pqc.crypto.saber;

import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* JADX INFO: loaded from: classes10.dex */
class Poly {
    private static final int KARATSUBA_N = 64;
    private static int SCHB_N = 16;
    private final int N_RES;
    private final int N_SB;
    private final int N_SB_RES;
    private final int SABER_L;
    private final int SABER_N;
    private final SABEREngine engine;
    private final Utils utils;

    public Poly(SABEREngine sABEREngine) {
        this.engine = sABEREngine;
        this.SABER_L = sABEREngine.getSABER_L();
        int saber_n = sABEREngine.getSABER_N();
        this.SABER_N = saber_n;
        this.N_RES = saber_n << 1;
        int i11 = saber_n >> 2;
        this.N_SB = i11;
        this.N_SB_RES = (i11 * 2) - 1;
        this.utils = sABEREngine.getUtils();
    }

    private short OVERFLOWING_MUL(int i11, int i12) {
        return (short) (i11 * i12);
    }

    private void cbd(short[] sArr, byte[] bArr, int i11) {
        int i12 = 4;
        int[] iArr = new int[4];
        char c11 = 2;
        if (this.engine.getSABER_MU() == 6) {
            for (int i13 = 0; i13 < this.SABER_N / 4; i13++) {
                int iLoad_littleendian = (int) load_littleendian(bArr, i11 + (i13 * 3), 3);
                int i14 = 0;
                for (int i15 = 0; i15 < 3; i15++) {
                    i14 += (iLoad_littleendian >> i15) & 2396745;
                }
                iArr[0] = i14 & 7;
                iArr[1] = (i14 >>> 6) & 7;
                iArr[2] = (i14 >>> 12) & 7;
                iArr[3] = (i14 >>> 18) & 7;
                int i16 = i13 * 4;
                sArr[i16] = (short) (iArr[0] - ((i14 >>> 3) & 7));
                sArr[i16 + 1] = (short) (iArr[1] - ((i14 >>> 9) & 7));
                sArr[i16 + 2] = (short) (iArr[2] - ((i14 >>> 15) & 7));
                sArr[i16 + 3] = (short) (iArr[3] - (i14 >>> 21));
            }
            return;
        }
        if (this.engine.getSABER_MU() == 8) {
            for (int i17 = 0; i17 < this.SABER_N / 4; i17++) {
                int i18 = i17 * 4;
                int iLoad_littleendian2 = (int) load_littleendian(bArr, i11 + i18, 4);
                int i19 = 0;
                for (int i21 = 0; i21 < 4; i21++) {
                    i19 += (iLoad_littleendian2 >>> i21) & 286331153;
                }
                iArr[0] = i19 & 15;
                iArr[1] = (i19 >>> 8) & 15;
                iArr[2] = (i19 >>> 16) & 15;
                iArr[3] = (i19 >>> 24) & 15;
                sArr[i18] = (short) (iArr[0] - ((i19 >>> 4) & 15));
                sArr[i18 + 1] = (short) (iArr[1] - ((i19 >>> 12) & 15));
                sArr[i18 + 2] = (short) (iArr[2] - ((i19 >>> 20) & 15));
                sArr[i18 + 3] = (short) (iArr[3] - (i19 >>> 28));
            }
            return;
        }
        char c12 = '\n';
        if (this.engine.getSABER_MU() == 10) {
            int i22 = 0;
            while (i22 < this.SABER_N / i12) {
                long jLoad_littleendian = load_littleendian(bArr, i11 + (i22 * 5), 5);
                long j11 = 0;
                for (int i23 = 0; i23 < 5; i23++) {
                    j11 += (jLoad_littleendian >>> i23) & 35468117025L;
                }
                int[] iArr2 = iArr;
                iArr2[0] = (int) (j11 & 31);
                char c13 = c11;
                iArr2[1] = (int) ((j11 >>> c12) & 31);
                int i24 = i22;
                iArr2[c13] = (int) ((j11 >>> 20) & 31);
                iArr2[3] = (int) ((j11 >>> 30) & 31);
                int i25 = i24 * 4;
                sArr[i25] = (short) (iArr2[0] - ((int) ((j11 >>> 5) & 31)));
                sArr[i25 + 1] = (short) (iArr2[1] - ((int) ((j11 >>> 15) & 31)));
                sArr[i25 + 2] = (short) (iArr2[c13] - ((int) ((j11 >>> 25) & 31)));
                sArr[i25 + 3] = (short) (iArr2[3] - ((int) (j11 >>> 35)));
                i22 = i24 + 1;
                iArr = iArr2;
                c11 = c13;
                i12 = 4;
                c12 = '\n';
            }
        }
    }

    private void karatsuba_simple(int[] iArr, int[] iArr2, int[] iArr3) {
        int i11 = 31;
        int[] iArr4 = new int[31];
        int[] iArr5 = new int[31];
        int[] iArr6 = new int[31];
        int[] iArr7 = new int[63];
        int i12 = 0;
        while (true) {
            if (i12 >= 16) {
                break;
            }
            int i13 = iArr[i12];
            int i14 = iArr[i12 + 16];
            int i15 = iArr[i12 + 32];
            int i16 = iArr[i12 + 48];
            int i17 = 0;
            for (int i18 = 16; i17 < i18; i18 = 16) {
                int i19 = iArr2[i17];
                int i21 = iArr2[i17 + 16];
                int i22 = i12 + i17;
                iArr3[i22] = iArr3[i22] + OVERFLOWING_MUL(i13, i19);
                int i23 = i22 + 32;
                iArr3[i23] = iArr3[i23] + OVERFLOWING_MUL(i14, i21);
                int[] iArr8 = iArr4;
                iArr8[i22] = (int) (((long) iArr4[i22]) + (((long) (i13 + i14)) * ((long) (i19 + i21))));
                int i24 = iArr2[i17 + 32];
                int i25 = iArr2[i17 + 48];
                int i26 = i22 + 64;
                iArr3[i26] = iArr3[i26] + OVERFLOWING_MUL(i24, i15);
                int i27 = i22 + 96;
                iArr3[i27] = iArr3[i27] + OVERFLOWING_MUL(i25, i16);
                iArr6[i22] = iArr6[i22] + OVERFLOWING_MUL(i15 + i16, i24 + i25);
                int i28 = i19 + i24;
                int i29 = i13 + i15;
                iArr7[i22] = iArr7[i22] + OVERFLOWING_MUL(i28, i29);
                int i31 = i21 + i25;
                int i32 = i14 + i16;
                iArr7[i23] = iArr7[i23] + OVERFLOWING_MUL(i31, i32);
                iArr5[i22] = iArr5[i22] + OVERFLOWING_MUL(i28 + i31, i29 + i32);
                i17++;
                iArr4 = iArr8;
            }
            i12++;
            i11 = 31;
        }
        int[] iArr9 = iArr4;
        int i33 = i11;
        int i34 = 0;
        while (i34 < i33) {
            int i35 = i34 + 32;
            iArr5[i34] = (iArr5[i34] - iArr7[i34]) - iArr7[i35];
            iArr9[i34] = (iArr9[i34] - iArr3[i34]) - iArr3[i35];
            iArr6[i34] = (iArr6[i34] - iArr3[i34 + 64]) - iArr3[i34 + 96];
            i34++;
            i33 = 31;
        }
        for (int i36 = 0; i36 < i33; i36++) {
            int i37 = i36 + 16;
            iArr7[i37] = iArr7[i37] + iArr5[i36];
            iArr3[i37] = iArr3[i37] + iArr9[i36];
            int i38 = i36 + 80;
            iArr3[i38] = iArr3[i38] + iArr6[i36];
        }
        for (int i39 = 0; i39 < 63; i39++) {
            iArr7[i39] = (iArr7[i39] - iArr3[i39]) - iArr3[i39 + 64];
        }
        for (int i41 = 0; i41 < 63; i41++) {
            int i42 = i41 + 32;
            iArr3[i42] = iArr3[i42] + iArr7[i41];
        }
    }

    private long load_littleendian(byte[] bArr, int i11, int i12) {
        long j11 = bArr[i11] & 255;
        for (int i13 = 1; i13 < i12; i13++) {
            j11 |= ((long) (bArr[i11 + i13] & 255)) << (i13 * 8);
        }
        return j11;
    }

    private void poly_mul_acc(short[] sArr, short[] sArr2, short[] sArr3) {
        short[] sArr4 = new short[this.SABER_N * 2];
        toom_cook_4way(sArr, sArr2, sArr4);
        int i11 = this.SABER_N;
        while (true) {
            int i12 = this.SABER_N;
            if (i11 >= i12 * 2) {
                return;
            }
            int i13 = i11 - i12;
            sArr3[i13] = (short) (sArr3[i13] + (sArr4[i11 - i12] - sArr4[i11]));
            i11++;
        }
    }

    private void toom_cook_4way(short[] sArr, short[] sArr2, short[] sArr3) {
        int i11 = this.N_SB;
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        int[] iArr3 = new int[i11];
        int[] iArr4 = new int[i11];
        int[] iArr5 = new int[i11];
        int[] iArr6 = new int[i11];
        int[] iArr7 = new int[i11];
        int[] iArr8 = new int[i11];
        int[] iArr9 = new int[i11];
        int[] iArr10 = new int[i11];
        int[] iArr11 = new int[i11];
        int[] iArr12 = new int[i11];
        int[] iArr13 = new int[i11];
        int[] iArr14 = new int[i11];
        int i12 = this.N_SB_RES;
        int[] iArr15 = new int[i12];
        int[] iArr16 = new int[i12];
        int[] iArr17 = new int[i12];
        int[] iArr18 = new int[i12];
        int[] iArr19 = new int[i12];
        int[] iArr20 = new int[i12];
        int[] iArr21 = new int[i12];
        int i13 = 0;
        while (true) {
            int i14 = this.N_SB;
            if (i13 >= i14) {
                break;
            }
            short s11 = sArr[i13];
            short s12 = sArr[i13 + i14];
            short s13 = sArr[i13 + (i14 * 2)];
            short s14 = sArr[(i14 * 3) + i13];
            short s15 = (short) (s11 + s13);
            short s16 = (short) (s12 + s14);
            iArr3[i13] = (short) (s15 + s16);
            iArr4[i13] = (short) (s15 - s16);
            short s17 = (short) (((s11 << 2) + s13) << 1);
            short s18 = (short) ((s12 << 2) + s14);
            iArr5[i13] = (short) (s17 + s18);
            iArr6[i13] = (short) (s17 - s18);
            iArr2[i13] = (short) ((s14 << 3) + (s13 << 2) + (s12 << 1) + s11);
            iArr7[i13] = s11;
            iArr[i13] = s14;
            i13++;
        }
        int i15 = 0;
        while (true) {
            int i16 = this.N_SB;
            if (i15 >= i16) {
                break;
            }
            short s19 = sArr2[i15];
            short s21 = sArr2[i15 + i16];
            short s22 = sArr2[i15 + (i16 * 2)];
            short s23 = sArr2[(i16 * 3) + i15];
            int i17 = s19 + s22;
            int i18 = s21 + s23;
            iArr10[i15] = i17 + i18;
            iArr11[i15] = i17 - i18;
            int i19 = ((s19 << 2) + s22) << 1;
            int i21 = (s21 << 2) + s23;
            iArr12[i15] = i19 + i21;
            iArr13[i15] = i19 - i21;
            iArr9[i15] = (s23 << 3) + (s22 << 2) + (s21 << 1) + s19;
            iArr14[i15] = s19;
            iArr8[i15] = s23;
            i15++;
        }
        karatsuba_simple(iArr, iArr8, iArr15);
        karatsuba_simple(iArr2, iArr9, iArr16);
        karatsuba_simple(iArr3, iArr10, iArr17);
        karatsuba_simple(iArr4, iArr11, iArr18);
        karatsuba_simple(iArr5, iArr12, iArr19);
        karatsuba_simple(iArr6, iArr13, iArr20);
        karatsuba_simple(iArr7, iArr14, iArr21);
        for (int i22 = 0; i22 < this.N_SB_RES; i22++) {
            int i23 = iArr15[i22];
            int i24 = iArr16[i22];
            int i25 = iArr17[i22];
            int i26 = iArr18[i22];
            int i27 = iArr19[i22];
            int i28 = iArr20[i22];
            int i29 = iArr21[i22];
            int i31 = i28 - i27;
            int i32 = ((i26 & 65535) - (i25 & 65535)) >>> 1;
            int i33 = i25 + i32;
            int i34 = ((i24 + i27) - (i33 << 6)) - i33;
            int i35 = (i33 - i29) - i23;
            int i36 = i34 + (i35 * 45);
            int i37 = (((((((i27 - i23) - (i29 << 6)) << 1) + i31) & 65535) - (i35 << 3)) * 43691) >> 3;
            int i38 = i31 + i36;
            int i39 = (((i36 & 65535) + ((i32 & 65535) << 4)) * 36409) >> 1;
            int i41 = -(i32 + i39);
            int i42 = ((((i39 & 65535) * 30) - (i38 & 65535)) * 61167) >> 2;
            int i43 = i35 - i37;
            int i44 = i39 - i42;
            sArr3[i22] = (short) (sArr3[i22] + (i29 & 65535));
            int i45 = i22 + 64;
            sArr3[i45] = (short) (sArr3[i45] + (i42 & 65535));
            int i46 = i22 + 128;
            sArr3[i46] = (short) (sArr3[i46] + (i37 & 65535));
            int i47 = i22 + 192;
            sArr3[i47] = (short) (sArr3[i47] + (i41 & 65535));
            int i48 = i22 + 256;
            sArr3[i48] = (short) (sArr3[i48] + (i43 & 65535));
            int i49 = i22 + 320;
            sArr3[i49] = (short) (sArr3[i49] + (i44 & 65535));
            int i51 = i22 + KyberEngine.KyberPolyBytes;
            sArr3[i51] = (short) (sArr3[i51] + (i23 & 65535));
        }
    }

    public void GenMatrix(short[][][] sArr, byte[] bArr) {
        int saber_polyvecbytes = this.SABER_L * this.engine.getSABER_POLYVECBYTES();
        byte[] bArr2 = new byte[saber_polyvecbytes];
        SABEREngine sABEREngine = this.engine;
        sABEREngine.symmetric.prf(bArr2, bArr, sABEREngine.getSABER_SEEDBYTES(), saber_polyvecbytes);
        for (int i11 = 0; i11 < this.SABER_L; i11++) {
            this.utils.BS2POLVECq(bArr2, this.engine.getSABER_POLYVECBYTES() * i11, sArr[i11]);
        }
    }

    public void GenSecret(short[][] sArr, byte[] bArr) {
        int saber_polycoinbytes = this.SABER_L * this.engine.getSABER_POLYCOINBYTES();
        byte[] bArr2 = new byte[saber_polycoinbytes];
        SABEREngine sABEREngine = this.engine;
        sABEREngine.symmetric.prf(bArr2, bArr, sABEREngine.getSABER_NOISE_SEEDBYTES(), saber_polycoinbytes);
        for (int i11 = 0; i11 < this.SABER_L; i11++) {
            SABEREngine sABEREngine2 = this.engine;
            if (sABEREngine2.usingEffectiveMasking) {
                for (int i12 = 0; i12 < this.SABER_N / 4; i12++) {
                    int i13 = i12 * 4;
                    sArr[i11][i13] = (short) (((bArr2[(this.engine.getSABER_POLYCOINBYTES() * i11) + i12] & 3) ^ 2) - 2);
                    sArr[i11][i13 + 1] = (short) ((((bArr2[(this.engine.getSABER_POLYCOINBYTES() * i11) + i12] >>> 2) & 3) ^ 2) - 2);
                    sArr[i11][i13 + 2] = (short) ((((bArr2[(this.engine.getSABER_POLYCOINBYTES() * i11) + i12] >>> 4) & 3) ^ 2) - 2);
                    sArr[i11][i13 + 3] = (short) ((((bArr2[(this.engine.getSABER_POLYCOINBYTES() * i11) + i12] >>> 6) & 3) ^ 2) - 2);
                }
            } else {
                cbd(sArr[i11], bArr2, sABEREngine2.getSABER_POLYCOINBYTES() * i11);
            }
        }
    }

    public void InnerProd(short[][] sArr, short[][] sArr2, short[] sArr3) {
        for (int i11 = 0; i11 < this.SABER_L; i11++) {
            poly_mul_acc(sArr[i11], sArr2[i11], sArr3);
        }
    }

    public void MatrixVectorMul(short[][][] sArr, short[][] sArr2, short[][] sArr3, int i11) {
        for (int i12 = 0; i12 < this.SABER_L; i12++) {
            for (int i13 = 0; i13 < this.SABER_L; i13++) {
                if (i11 == 1) {
                    poly_mul_acc(sArr[i13][i12], sArr2[i13], sArr3[i12]);
                } else {
                    poly_mul_acc(sArr[i12][i13], sArr2[i13], sArr3[i12]);
                }
            }
        }
    }
}
