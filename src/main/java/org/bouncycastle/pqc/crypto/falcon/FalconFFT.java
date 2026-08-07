package org.bouncycastle.pqc.crypto.falcon;

/* JADX INFO: loaded from: classes10.dex */
class FalconFFT {
    FPREngine fpr = new FPREngine();

    FalconFFT() {
    }

    void FFT(FalconFPR[] falconFPRArr, int i11, int i12) {
        int i13 = i12;
        int i14 = 1;
        int i15 = (1 << i13) >> 1;
        int i16 = 2;
        int i17 = 1;
        int i18 = i15;
        while (i17 < i13) {
            int i19 = i18 >> 1;
            int i21 = i16 >> 1;
            int i22 = 0;
            int i23 = 0;
            while (i22 < i21) {
                int i24 = i23 + i19;
                FalconFPR[] falconFPRArr2 = this.fpr.fpr_gm_tab;
                int i25 = (i16 + i22) << i14;
                FalconFPR falconFPR = falconFPRArr2[i25];
                FalconFPR falconFPR2 = falconFPRArr2[i25 + i14];
                int i26 = i23;
                while (i26 < i24) {
                    int i27 = i11 + i26;
                    FalconFPR falconFPR3 = falconFPRArr[i27];
                    int i28 = i27 + i15;
                    FalconFPR falconFPR4 = falconFPRArr[i28];
                    int i29 = i27 + i19;
                    int i31 = i15;
                    int i32 = i29 + i31;
                    int i33 = i16;
                    ComplexNumberWrapper complexNumberWrapperFPC_MUL = FPC_MUL(falconFPRArr[i29], falconFPRArr[i32], falconFPR, falconFPR2);
                    FalconFPR falconFPR5 = complexNumberWrapperFPC_MUL.f99055re;
                    FalconFPR falconFPR6 = complexNumberWrapperFPC_MUL.f99054im;
                    int i34 = i17;
                    ComplexNumberWrapper complexNumberWrapperFPC_ADD = FPC_ADD(falconFPR3, falconFPR4, falconFPR5, falconFPR6);
                    falconFPRArr[i27] = complexNumberWrapperFPC_ADD.f99055re;
                    falconFPRArr[i28] = complexNumberWrapperFPC_ADD.f99054im;
                    ComplexNumberWrapper complexNumberWrapperFPC_SUB = FPC_SUB(falconFPR3, falconFPR4, falconFPR5, falconFPR6);
                    falconFPRArr[i29] = complexNumberWrapperFPC_SUB.f99055re;
                    falconFPRArr[i32] = complexNumberWrapperFPC_SUB.f99054im;
                    i26++;
                    i15 = i31;
                    i16 = i33;
                    i17 = i34;
                    i18 = i18;
                }
                i22++;
                i23 += i18;
                i14 = 1;
            }
            i17++;
            i16 <<= 1;
            i13 = i12;
            i18 = i19;
            i14 = 1;
        }
    }

    ComplexNumberWrapper FPC_ADD(FalconFPR falconFPR, FalconFPR falconFPR2, FalconFPR falconFPR3, FalconFPR falconFPR4) {
        return new ComplexNumberWrapper(this.fpr.fpr_add(falconFPR, falconFPR3), this.fpr.fpr_add(falconFPR2, falconFPR4));
    }

    ComplexNumberWrapper FPC_DIV(FalconFPR falconFPR, FalconFPR falconFPR2, FalconFPR falconFPR3, FalconFPR falconFPR4) {
        FPREngine fPREngine = this.fpr;
        FalconFPR falconFPRFpr_inv = this.fpr.fpr_inv(fPREngine.fpr_add(fPREngine.fpr_sqr(falconFPR3), this.fpr.fpr_sqr(falconFPR4)));
        FalconFPR falconFPRFpr_mul = this.fpr.fpr_mul(falconFPR3, falconFPRFpr_inv);
        FPREngine fPREngine2 = this.fpr;
        FalconFPR falconFPRFpr_mul2 = fPREngine2.fpr_mul(fPREngine2.fpr_neg(falconFPR4), falconFPRFpr_inv);
        FPREngine fPREngine3 = this.fpr;
        FalconFPR falconFPRFpr_sub = fPREngine3.fpr_sub(fPREngine3.fpr_mul(falconFPR, falconFPRFpr_mul), this.fpr.fpr_mul(falconFPR2, falconFPRFpr_mul2));
        FPREngine fPREngine4 = this.fpr;
        return new ComplexNumberWrapper(falconFPRFpr_sub, fPREngine4.fpr_add(fPREngine4.fpr_mul(falconFPR, falconFPRFpr_mul2), this.fpr.fpr_mul(falconFPR2, falconFPRFpr_mul)));
    }

    ComplexNumberWrapper FPC_INV(FalconFPR falconFPR, FalconFPR falconFPR2) {
        FPREngine fPREngine = this.fpr;
        FalconFPR falconFPRFpr_inv = this.fpr.fpr_inv(fPREngine.fpr_add(fPREngine.fpr_sqr(falconFPR), this.fpr.fpr_sqr(falconFPR2)));
        FalconFPR falconFPRFpr_mul = this.fpr.fpr_mul(falconFPR, falconFPRFpr_inv);
        FPREngine fPREngine2 = this.fpr;
        return new ComplexNumberWrapper(falconFPRFpr_mul, fPREngine2.fpr_mul(fPREngine2.fpr_neg(falconFPR2), falconFPRFpr_inv));
    }

    ComplexNumberWrapper FPC_MUL(FalconFPR falconFPR, FalconFPR falconFPR2, FalconFPR falconFPR3, FalconFPR falconFPR4) {
        FPREngine fPREngine = this.fpr;
        FalconFPR falconFPRFpr_sub = fPREngine.fpr_sub(fPREngine.fpr_mul(falconFPR, falconFPR3), this.fpr.fpr_mul(falconFPR2, falconFPR4));
        FPREngine fPREngine2 = this.fpr;
        return new ComplexNumberWrapper(falconFPRFpr_sub, fPREngine2.fpr_add(fPREngine2.fpr_mul(falconFPR, falconFPR4), this.fpr.fpr_mul(falconFPR2, falconFPR3)));
    }

    ComplexNumberWrapper FPC_SQR(FalconFPR falconFPR, FalconFPR falconFPR2) {
        FPREngine fPREngine = this.fpr;
        FalconFPR falconFPRFpr_sub = fPREngine.fpr_sub(fPREngine.fpr_sqr(falconFPR), this.fpr.fpr_sqr(falconFPR2));
        FPREngine fPREngine2 = this.fpr;
        return new ComplexNumberWrapper(falconFPRFpr_sub, fPREngine2.fpr_double(fPREngine2.fpr_mul(falconFPR, falconFPR2)));
    }

    ComplexNumberWrapper FPC_SUB(FalconFPR falconFPR, FalconFPR falconFPR2, FalconFPR falconFPR3, FalconFPR falconFPR4) {
        return new ComplexNumberWrapper(this.fpr.fpr_sub(falconFPR, falconFPR3), this.fpr.fpr_sub(falconFPR2, falconFPR4));
    }

    void iFFT(FalconFPR[] falconFPRArr, int i11, int i12) {
        int i13;
        int i14 = 1;
        int i15 = 1 << i12;
        int i16 = i15 >> 1;
        int i17 = i12;
        int i18 = 1;
        int i19 = i15;
        while (true) {
            i13 = 0;
            if (i17 <= i14) {
                break;
            }
            i19 >>= i14;
            int i21 = i18 << 1;
            int i22 = 0;
            while (i13 < i16) {
                int i23 = i13 + i18;
                FPREngine fPREngine = this.fpr;
                FalconFPR[] falconFPRArr2 = fPREngine.fpr_gm_tab;
                int i24 = (i19 + i22) << i14;
                FalconFPR falconFPR = falconFPRArr2[i24];
                FalconFPR falconFPRFpr_neg = fPREngine.fpr_neg(falconFPRArr2[i24 + i14]);
                int i25 = i13;
                while (i25 < i23) {
                    int i26 = i11 + i25;
                    FalconFPR falconFPR2 = falconFPRArr[i26];
                    int i27 = i26 + i16;
                    FalconFPR falconFPR3 = falconFPRArr[i27];
                    int i28 = i26 + i18;
                    int i29 = i16;
                    FalconFPR falconFPR4 = falconFPRArr[i28];
                    int i31 = i28 + i29;
                    int i32 = i17;
                    FalconFPR falconFPR5 = falconFPRArr[i31];
                    int i33 = i19;
                    ComplexNumberWrapper complexNumberWrapperFPC_ADD = FPC_ADD(falconFPR2, falconFPR3, falconFPR4, falconFPR5);
                    falconFPRArr[i26] = complexNumberWrapperFPC_ADD.f99055re;
                    falconFPRArr[i27] = complexNumberWrapperFPC_ADD.f99054im;
                    ComplexNumberWrapper complexNumberWrapperFPC_SUB = FPC_SUB(falconFPR2, falconFPR3, falconFPR4, falconFPR5);
                    ComplexNumberWrapper complexNumberWrapperFPC_MUL = FPC_MUL(complexNumberWrapperFPC_SUB.f99055re, complexNumberWrapperFPC_SUB.f99054im, falconFPR, falconFPRFpr_neg);
                    falconFPRArr[i28] = complexNumberWrapperFPC_MUL.f99055re;
                    falconFPRArr[i31] = complexNumberWrapperFPC_MUL.f99054im;
                    i25++;
                    i16 = i29;
                    i17 = i32;
                    i19 = i33;
                    i18 = i18;
                }
                i22++;
                i13 += i21;
                i14 = 1;
            }
            i17--;
            i18 = i21;
            i14 = 1;
        }
        if (i12 > 0) {
            FalconFPR falconFPR6 = this.fpr.fpr_p2_tab[i12];
            while (i13 < i15) {
                int i34 = i11 + i13;
                falconFPRArr[i34] = this.fpr.fpr_mul(falconFPRArr[i34], falconFPR6);
                i13++;
            }
        }
    }

    void poly_LDL_fft(FalconFPR[] falconFPRArr, int i11, FalconFPR[] falconFPRArr2, int i12, FalconFPR[] falconFPRArr3, int i13, int i14) {
        int i15 = (1 << i14) >> 1;
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = i11 + i16;
            FalconFPR falconFPR = falconFPRArr[i17];
            FalconFPR falconFPR2 = falconFPRArr[i17 + i15];
            int i18 = i12 + i16;
            FalconFPR falconFPR3 = falconFPRArr2[i18];
            int i19 = i18 + i15;
            FalconFPR falconFPR4 = falconFPRArr2[i19];
            int i21 = i13 + i16;
            FalconFPR falconFPR5 = falconFPRArr3[i21];
            int i22 = i21 + i15;
            FalconFPR falconFPR6 = falconFPRArr3[i22];
            ComplexNumberWrapper complexNumberWrapperFPC_DIV = FPC_DIV(falconFPR3, falconFPR4, falconFPR, falconFPR2);
            FalconFPR falconFPR7 = complexNumberWrapperFPC_DIV.f99055re;
            FalconFPR falconFPR8 = complexNumberWrapperFPC_DIV.f99054im;
            ComplexNumberWrapper complexNumberWrapperFPC_MUL = FPC_MUL(falconFPR7, falconFPR8, falconFPR3, this.fpr.fpr_neg(falconFPR4));
            ComplexNumberWrapper complexNumberWrapperFPC_SUB = FPC_SUB(falconFPR5, falconFPR6, complexNumberWrapperFPC_MUL.f99055re, complexNumberWrapperFPC_MUL.f99054im);
            falconFPRArr3[i21] = complexNumberWrapperFPC_SUB.f99055re;
            falconFPRArr3[i22] = complexNumberWrapperFPC_SUB.f99054im;
            falconFPRArr2[i18] = falconFPR7;
            falconFPRArr2[i19] = this.fpr.fpr_neg(falconFPR8);
        }
    }

    void poly_LDLmv_fft(FalconFPR[] falconFPRArr, int i11, FalconFPR[] falconFPRArr2, int i12, FalconFPR[] falconFPRArr3, int i13, FalconFPR[] falconFPRArr4, int i14, FalconFPR[] falconFPRArr5, int i15, int i16) {
        int i17 = (1 << i16) >> 1;
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = i13 + i18;
            FalconFPR falconFPR = falconFPRArr3[i19];
            FalconFPR falconFPR2 = falconFPRArr3[i19 + i17];
            int i21 = i14 + i18;
            FalconFPR falconFPR3 = falconFPRArr4[i21];
            FalconFPR falconFPR4 = falconFPRArr4[i21 + i17];
            int i22 = i15 + i18;
            FalconFPR falconFPR5 = falconFPRArr5[i22];
            FalconFPR falconFPR6 = falconFPRArr5[i22 + i17];
            ComplexNumberWrapper complexNumberWrapperFPC_DIV = FPC_DIV(falconFPR3, falconFPR4, falconFPR, falconFPR2);
            FalconFPR falconFPR7 = complexNumberWrapperFPC_DIV.f99055re;
            FalconFPR falconFPR8 = complexNumberWrapperFPC_DIV.f99054im;
            ComplexNumberWrapper complexNumberWrapperFPC_MUL = FPC_MUL(falconFPR7, falconFPR8, falconFPR3, this.fpr.fpr_neg(falconFPR4));
            ComplexNumberWrapper complexNumberWrapperFPC_SUB = FPC_SUB(falconFPR5, falconFPR6, complexNumberWrapperFPC_MUL.f99055re, complexNumberWrapperFPC_MUL.f99054im);
            int i23 = i11 + i18;
            falconFPRArr[i23] = complexNumberWrapperFPC_SUB.f99055re;
            falconFPRArr[i23 + i17] = complexNumberWrapperFPC_SUB.f99054im;
            int i24 = i12 + i18;
            falconFPRArr2[i24] = falconFPR7;
            falconFPRArr2[i24 + i17] = this.fpr.fpr_neg(falconFPR8);
        }
    }

    void poly_add(FalconFPR[] falconFPRArr, int i11, FalconFPR[] falconFPRArr2, int i12, int i13) {
        int i14 = 1 << i13;
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = i11 + i15;
            falconFPRArr[i16] = this.fpr.fpr_add(falconFPRArr[i16], falconFPRArr2[i12 + i15]);
        }
    }

    void poly_add_muladj_fft(FalconFPR[] falconFPRArr, int i11, FalconFPR[] falconFPRArr2, int i12, FalconFPR[] falconFPRArr3, int i13, FalconFPR[] falconFPRArr4, int i14, FalconFPR[] falconFPRArr5, int i15, int i16) {
        int i17 = (1 << i16) >> 1;
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = i12 + i18;
            FalconFPR falconFPR = falconFPRArr2[i19];
            FalconFPR falconFPR2 = falconFPRArr2[i19 + i17];
            int i21 = i13 + i18;
            FalconFPR falconFPR3 = falconFPRArr3[i21];
            FalconFPR falconFPR4 = falconFPRArr3[i21 + i17];
            int i22 = i14 + i18;
            FalconFPR falconFPR5 = falconFPRArr4[i22];
            FalconFPR falconFPR6 = falconFPRArr4[i22 + i17];
            int i23 = i15 + i18;
            FalconFPR falconFPR7 = falconFPRArr5[i23];
            FalconFPR falconFPR8 = falconFPRArr5[i23 + i17];
            ComplexNumberWrapper complexNumberWrapperFPC_MUL = FPC_MUL(falconFPR, falconFPR2, falconFPR5, this.fpr.fpr_neg(falconFPR6));
            FalconFPR falconFPR9 = complexNumberWrapperFPC_MUL.f99055re;
            FalconFPR falconFPR10 = complexNumberWrapperFPC_MUL.f99054im;
            ComplexNumberWrapper complexNumberWrapperFPC_MUL2 = FPC_MUL(falconFPR3, falconFPR4, falconFPR7, this.fpr.fpr_neg(falconFPR8));
            FalconFPR falconFPR11 = complexNumberWrapperFPC_MUL2.f99055re;
            FalconFPR falconFPR12 = complexNumberWrapperFPC_MUL2.f99054im;
            int i24 = i11 + i18;
            falconFPRArr[i24] = this.fpr.fpr_add(falconFPR9, falconFPR11);
            falconFPRArr[i24 + i17] = this.fpr.fpr_add(falconFPR10, falconFPR12);
        }
    }

    void poly_adj_fft(FalconFPR[] falconFPRArr, int i11, int i12) {
        int i13 = 1 << i12;
        for (int i14 = i13 >> 1; i14 < i13; i14++) {
            int i15 = i11 + i14;
            falconFPRArr[i15] = this.fpr.fpr_neg(falconFPRArr[i15]);
        }
    }

    void poly_div_autoadj_fft(FalconFPR[] falconFPRArr, int i11, FalconFPR[] falconFPRArr2, int i12, int i13) {
        int i14 = (1 << i13) >> 1;
        for (int i15 = 0; i15 < i14; i15++) {
            FalconFPR falconFPRFpr_inv = this.fpr.fpr_inv(falconFPRArr2[i12 + i15]);
            int i16 = i11 + i15;
            falconFPRArr[i16] = this.fpr.fpr_mul(falconFPRArr[i16], falconFPRFpr_inv);
            int i17 = i16 + i14;
            falconFPRArr[i17] = this.fpr.fpr_mul(falconFPRArr[i17], falconFPRFpr_inv);
        }
    }

    void poly_div_fft(FalconFPR[] falconFPRArr, int i11, FalconFPR[] falconFPRArr2, int i12, int i13) {
        int i14 = (1 << i13) >> 1;
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = i11 + i15;
            int i17 = i16 + i14;
            int i18 = i12 + i15;
            ComplexNumberWrapper complexNumberWrapperFPC_DIV = FPC_DIV(falconFPRArr[i16], falconFPRArr[i17], falconFPRArr2[i18], falconFPRArr2[i18 + i14]);
            falconFPRArr[i16] = complexNumberWrapperFPC_DIV.f99055re;
            falconFPRArr[i17] = complexNumberWrapperFPC_DIV.f99054im;
        }
    }

    void poly_invnorm2_fft(FalconFPR[] falconFPRArr, int i11, FalconFPR[] falconFPRArr2, int i12, FalconFPR[] falconFPRArr3, int i13, int i14) {
        int i15 = (1 << i14) >> 1;
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = i12 + i16;
            FalconFPR falconFPR = falconFPRArr2[i17];
            FalconFPR falconFPR2 = falconFPRArr2[i17 + i15];
            int i18 = i13 + i16;
            FalconFPR falconFPR3 = falconFPRArr3[i18];
            FalconFPR falconFPR4 = falconFPRArr3[i18 + i15];
            FPREngine fPREngine = this.fpr;
            FalconFPR falconFPRFpr_add = fPREngine.fpr_add(fPREngine.fpr_sqr(falconFPR), this.fpr.fpr_sqr(falconFPR2));
            FPREngine fPREngine2 = this.fpr;
            falconFPRArr[i11 + i16] = fPREngine.fpr_inv(fPREngine.fpr_add(falconFPRFpr_add, fPREngine2.fpr_add(fPREngine2.fpr_sqr(falconFPR3), this.fpr.fpr_sqr(falconFPR4))));
        }
    }

    void poly_merge_fft(FalconFPR[] falconFPRArr, int i11, FalconFPR[] falconFPRArr2, int i12, FalconFPR[] falconFPRArr3, int i13, int i14) {
        int i15 = 1 << i14;
        int i16 = i15 >> 1;
        int i17 = i15 >> 2;
        falconFPRArr[i11] = falconFPRArr2[i12];
        falconFPRArr[i11 + i16] = falconFPRArr3[i13];
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = i12 + i18;
            FalconFPR falconFPR = falconFPRArr2[i19];
            FalconFPR falconFPR2 = falconFPRArr2[i19 + i17];
            int i21 = i13 + i18;
            FalconFPR falconFPR3 = falconFPRArr3[i21];
            FalconFPR falconFPR4 = falconFPRArr3[i21 + i17];
            FalconFPR[] falconFPRArr4 = this.fpr.fpr_gm_tab;
            int i22 = (i18 + i16) << 1;
            ComplexNumberWrapper complexNumberWrapperFPC_MUL = FPC_MUL(falconFPR3, falconFPR4, falconFPRArr4[i22], falconFPRArr4[i22 + 1]);
            FalconFPR falconFPR5 = complexNumberWrapperFPC_MUL.f99055re;
            FalconFPR falconFPR6 = complexNumberWrapperFPC_MUL.f99054im;
            ComplexNumberWrapper complexNumberWrapperFPC_ADD = FPC_ADD(falconFPR, falconFPR2, falconFPR5, falconFPR6);
            FalconFPR falconFPR7 = complexNumberWrapperFPC_ADD.f99055re;
            FalconFPR falconFPR8 = complexNumberWrapperFPC_ADD.f99054im;
            int i23 = (i18 << 1) + i11;
            falconFPRArr[i23] = falconFPR7;
            falconFPRArr[i23 + i16] = falconFPR8;
            ComplexNumberWrapper complexNumberWrapperFPC_SUB = FPC_SUB(falconFPR, falconFPR2, falconFPR5, falconFPR6);
            FalconFPR falconFPR9 = complexNumberWrapperFPC_SUB.f99055re;
            FalconFPR falconFPR10 = complexNumberWrapperFPC_SUB.f99054im;
            int i24 = i23 + 1;
            falconFPRArr[i24] = falconFPR9;
            falconFPRArr[i24 + i16] = falconFPR10;
        }
    }

    void poly_mul_autoadj_fft(FalconFPR[] falconFPRArr, int i11, FalconFPR[] falconFPRArr2, int i12, int i13) {
        int i14 = (1 << i13) >> 1;
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = i11 + i15;
            int i17 = i12 + i15;
            falconFPRArr[i16] = this.fpr.fpr_mul(falconFPRArr[i16], falconFPRArr2[i17]);
            int i18 = i16 + i14;
            falconFPRArr[i18] = this.fpr.fpr_mul(falconFPRArr[i18], falconFPRArr2[i17]);
        }
    }

    void poly_mul_fft(FalconFPR[] falconFPRArr, int i11, FalconFPR[] falconFPRArr2, int i12, int i13) {
        int i14 = (1 << i13) >> 1;
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = i11 + i15;
            int i17 = i16 + i14;
            int i18 = i12 + i15;
            ComplexNumberWrapper complexNumberWrapperFPC_MUL = FPC_MUL(falconFPRArr[i16], falconFPRArr[i17], falconFPRArr2[i18], falconFPRArr2[i18 + i14]);
            falconFPRArr[i16] = complexNumberWrapperFPC_MUL.f99055re;
            falconFPRArr[i17] = complexNumberWrapperFPC_MUL.f99054im;
        }
    }

    void poly_muladj_fft(FalconFPR[] falconFPRArr, int i11, FalconFPR[] falconFPRArr2, int i12, int i13) {
        int i14 = (1 << i13) >> 1;
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = i11 + i15;
            int i17 = i16 + i14;
            int i18 = i12 + i15;
            ComplexNumberWrapper complexNumberWrapperFPC_MUL = FPC_MUL(falconFPRArr[i16], falconFPRArr[i17], falconFPRArr2[i18], this.fpr.fpr_neg(falconFPRArr2[i18 + i14]));
            falconFPRArr[i16] = complexNumberWrapperFPC_MUL.f99055re;
            falconFPRArr[i17] = complexNumberWrapperFPC_MUL.f99054im;
        }
    }

    void poly_mulconst(FalconFPR[] falconFPRArr, int i11, FalconFPR falconFPR, int i12) {
        int i13 = 1 << i12;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i11 + i14;
            falconFPRArr[i15] = this.fpr.fpr_mul(falconFPRArr[i15], falconFPR);
        }
    }

    void poly_mulselfadj_fft(FalconFPR[] falconFPRArr, int i11, int i12) {
        int i13 = (1 << i12) >> 1;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i11 + i14;
            FalconFPR falconFPR = falconFPRArr[i15];
            int i16 = i15 + i13;
            FalconFPR falconFPR2 = falconFPRArr[i16];
            FPREngine fPREngine = this.fpr;
            falconFPRArr[i15] = fPREngine.fpr_add(fPREngine.fpr_sqr(falconFPR), this.fpr.fpr_sqr(falconFPR2));
            falconFPRArr[i16] = this.fpr.fpr_zero;
        }
    }

    void poly_neg(FalconFPR[] falconFPRArr, int i11, int i12) {
        int i13 = 1 << i12;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i11 + i14;
            falconFPRArr[i15] = this.fpr.fpr_neg(falconFPRArr[i15]);
        }
    }

    void poly_split_fft(FalconFPR[] falconFPRArr, int i11, FalconFPR[] falconFPRArr2, int i12, FalconFPR[] falconFPRArr3, int i13, int i14) {
        int i15 = 1 << i14;
        int i16 = i15 >> 1;
        int i17 = i15 >> 2;
        falconFPRArr[i11] = falconFPRArr3[i13];
        falconFPRArr2[i12] = falconFPRArr3[i13 + i16];
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = i13 + (i18 << 1);
            FalconFPR falconFPR = falconFPRArr3[i19];
            FalconFPR falconFPR2 = falconFPRArr3[i19 + i16];
            int i21 = i19 + 1;
            FalconFPR falconFPR3 = falconFPRArr3[i21];
            FalconFPR falconFPR4 = falconFPRArr3[i21 + i16];
            ComplexNumberWrapper complexNumberWrapperFPC_ADD = FPC_ADD(falconFPR, falconFPR2, falconFPR3, falconFPR4);
            FalconFPR falconFPR5 = complexNumberWrapperFPC_ADD.f99055re;
            FalconFPR falconFPR6 = complexNumberWrapperFPC_ADD.f99054im;
            int i22 = i11 + i18;
            falconFPRArr[i22] = this.fpr.fpr_half(falconFPR5);
            falconFPRArr[i22 + i17] = this.fpr.fpr_half(falconFPR6);
            ComplexNumberWrapper complexNumberWrapperFPC_SUB = FPC_SUB(falconFPR, falconFPR2, falconFPR3, falconFPR4);
            FalconFPR falconFPR7 = complexNumberWrapperFPC_SUB.f99055re;
            FalconFPR falconFPR8 = complexNumberWrapperFPC_SUB.f99054im;
            FPREngine fPREngine = this.fpr;
            FalconFPR[] falconFPRArr4 = fPREngine.fpr_gm_tab;
            int i23 = (i18 + i16) << 1;
            ComplexNumberWrapper complexNumberWrapperFPC_MUL = FPC_MUL(falconFPR7, falconFPR8, falconFPRArr4[i23], fPREngine.fpr_neg(falconFPRArr4[i23 + 1]));
            FalconFPR falconFPR9 = complexNumberWrapperFPC_MUL.f99055re;
            FalconFPR falconFPR10 = complexNumberWrapperFPC_MUL.f99054im;
            int i24 = i12 + i18;
            falconFPRArr2[i24] = this.fpr.fpr_half(falconFPR9);
            falconFPRArr2[i24 + i17] = this.fpr.fpr_half(falconFPR10);
        }
    }

    void poly_sub(FalconFPR[] falconFPRArr, int i11, FalconFPR[] falconFPRArr2, int i12, int i13) {
        int i14 = 1 << i13;
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = i11 + i15;
            falconFPRArr[i16] = this.fpr.fpr_sub(falconFPRArr[i16], falconFPRArr2[i12 + i15]);
        }
    }
}
