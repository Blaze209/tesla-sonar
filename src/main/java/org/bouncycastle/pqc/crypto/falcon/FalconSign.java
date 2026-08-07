package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes10.dex */
class FalconSign {
    FPREngine fpr = new FPREngine();
    FalconFFT fft = new FalconFFT();
    FalconCommon common = new FalconCommon();

    FalconSign() {
    }

    private static int MKN(int i11) {
        return 1 << i11;
    }

    int do_sign_dyn(SamplerZ samplerZ, SamplerCtx samplerCtx, short[] sArr, int i11, byte[] bArr, int i12, byte[] bArr2, int i13, byte[] bArr3, int i14, byte[] bArr4, int i15, short[] sArr2, int i16, int i17, FalconFPR[] falconFPRArr, int i18) {
        int iMKN = MKN(i17);
        int i19 = i18 + iMKN;
        int i21 = i19 + iMKN;
        int i22 = i21 + iMKN;
        smallints_to_fpr(falconFPRArr, i19, bArr, i12, i17);
        smallints_to_fpr(falconFPRArr, i18, bArr2, i13, i17);
        smallints_to_fpr(falconFPRArr, i22, bArr3, i14, i17);
        smallints_to_fpr(falconFPRArr, i21, bArr4, i15, i17);
        this.fft.FFT(falconFPRArr, i19, i17);
        this.fft.FFT(falconFPRArr, i18, i17);
        this.fft.FFT(falconFPRArr, i22, i17);
        this.fft.FFT(falconFPRArr, i21, i17);
        this.fft.poly_neg(falconFPRArr, i19, i17);
        this.fft.poly_neg(falconFPRArr, i22, i17);
        int i23 = i22 + iMKN;
        int i24 = i23 + iMKN;
        System.arraycopy(falconFPRArr, i19, falconFPRArr, i23, iMKN);
        this.fft.poly_mulselfadj_fft(falconFPRArr, i23, i17);
        System.arraycopy(falconFPRArr, i18, falconFPRArr, i24, iMKN);
        this.fft.poly_muladj_fft(falconFPRArr, i24, falconFPRArr, i21, i17);
        this.fft.poly_mulselfadj_fft(falconFPRArr, i18, i17);
        this.fft.poly_add(falconFPRArr, i18, falconFPRArr, i23, i17);
        System.arraycopy(falconFPRArr, i19, falconFPRArr, i23, iMKN);
        this.fft.poly_muladj_fft(falconFPRArr, i19, falconFPRArr, i22, i17);
        this.fft.poly_add(falconFPRArr, i19, falconFPRArr, i24, i17);
        this.fft.poly_mulselfadj_fft(falconFPRArr, i21, i17);
        System.arraycopy(falconFPRArr, i22, falconFPRArr, i24, iMKN);
        this.fft.poly_mulselfadj_fft(falconFPRArr, i24, i17);
        this.fft.poly_add(falconFPRArr, i21, falconFPRArr, i24, i17);
        int i25 = i24 + iMKN;
        for (int i26 = 0; i26 < iMKN; i26++) {
            falconFPRArr[i24 + i26] = this.fpr.fpr_of(sArr2[i16 + i26]);
        }
        this.fft.FFT(falconFPRArr, i24, i17);
        FalconFPR falconFPR = this.fpr.fpr_inverse_of_q;
        System.arraycopy(falconFPRArr, i24, falconFPRArr, i25, iMKN);
        this.fft.poly_mul_fft(falconFPRArr, i25, falconFPRArr, i23, i17);
        this.fft.poly_mulconst(falconFPRArr, i25, this.fpr.fpr_neg(falconFPR), i17);
        this.fft.poly_mul_fft(falconFPRArr, i24, falconFPRArr, i22, i17);
        this.fft.poly_mulconst(falconFPRArr, i24, falconFPR, i17);
        int i27 = iMKN * 2;
        System.arraycopy(falconFPRArr, i24, falconFPRArr, i22, i27);
        ffSampling_fft_dyntree(samplerZ, samplerCtx, falconFPRArr, i22, falconFPRArr, i23, falconFPRArr, i18, falconFPRArr, i19, falconFPRArr, i21, i17, i17, falconFPRArr, i24);
        System.arraycopy(falconFPRArr, i22, falconFPRArr, i23, i27);
        smallints_to_fpr(falconFPRArr, i19, bArr, i12, i17);
        smallints_to_fpr(falconFPRArr, i18, bArr2, i13, i17);
        smallints_to_fpr(falconFPRArr, i22, bArr3, i14, i17);
        smallints_to_fpr(falconFPRArr, i21, bArr4, i15, i17);
        this.fft.FFT(falconFPRArr, i19, i17);
        this.fft.FFT(falconFPRArr, i18, i17);
        this.fft.FFT(falconFPRArr, i22, i17);
        this.fft.FFT(falconFPRArr, i21, i17);
        this.fft.poly_neg(falconFPRArr, i19, i17);
        this.fft.poly_neg(falconFPRArr, i22, i17);
        int i28 = i25 + iMKN;
        System.arraycopy(falconFPRArr, i23, falconFPRArr, i25, iMKN);
        System.arraycopy(falconFPRArr, i24, falconFPRArr, i28, iMKN);
        this.fft.poly_mul_fft(falconFPRArr, i25, falconFPRArr, i18, i17);
        this.fft.poly_mul_fft(falconFPRArr, i28, falconFPRArr, i21, i17);
        this.fft.poly_add(falconFPRArr, i25, falconFPRArr, i28, i17);
        System.arraycopy(falconFPRArr, i23, falconFPRArr, i28, iMKN);
        this.fft.poly_mul_fft(falconFPRArr, i28, falconFPRArr, i19, i17);
        System.arraycopy(falconFPRArr, i25, falconFPRArr, i23, iMKN);
        this.fft.poly_mul_fft(falconFPRArr, i24, falconFPRArr, i22, i17);
        this.fft.poly_add(falconFPRArr, i24, falconFPRArr, i28, i17);
        this.fft.iFFT(falconFPRArr, i23, i17);
        this.fft.iFFT(falconFPRArr, i24, i17);
        short[] sArr3 = new short[iMKN];
        int i29 = 0;
        int i31 = 0;
        for (int i32 = 0; i32 < iMKN; i32++) {
            int iFpr_rint = (sArr2[i16 + i32] & HPKE.aead_EXPORT_ONLY) - ((int) this.fpr.fpr_rint(falconFPRArr[i23 + i32]));
            i29 += iFpr_rint * iFpr_rint;
            i31 |= i29;
            sArr3[i32] = (short) iFpr_rint;
        }
        int i33 = (-(i31 >>> 31)) | i29;
        short[] sArr4 = new short[iMKN];
        for (int i34 = 0; i34 < iMKN; i34++) {
            sArr4[i34] = (short) (-this.fpr.fpr_rint(falconFPRArr[i24 + i34]));
        }
        if (this.common.is_short_half(i33, sArr4, 0, i17) == 0) {
            return 0;
        }
        System.arraycopy(sArr4, 0, sArr, i11, iMKN);
        return 1;
    }

    int do_sign_tree(SamplerZ samplerZ, SamplerCtx samplerCtx, short[] sArr, int i11, FalconFPR[] falconFPRArr, int i12, short[] sArr2, int i13, int i14, FalconFPR[] falconFPRArr2, int i15) {
        int iMKN = MKN(i14);
        int i16 = i15 + iMKN;
        int iSkoff_b00 = i12 + skoff_b00(i14);
        int iSkoff_b01 = i12 + skoff_b01(i14);
        int iSkoff_b10 = i12 + skoff_b10(i14);
        int iSkoff_b11 = i12 + skoff_b11(i14);
        int iSkoff_tree = i12 + skoff_tree(i14);
        for (int i17 = 0; i17 < iMKN; i17++) {
            falconFPRArr2[i15 + i17] = this.fpr.fpr_of(sArr2[i13 + i17]);
        }
        this.fft.FFT(falconFPRArr2, i15, i14);
        FalconFPR falconFPR = this.fpr.fpr_inverse_of_q;
        System.arraycopy(falconFPRArr2, i15, falconFPRArr2, i16, iMKN);
        this.fft.poly_mul_fft(falconFPRArr2, i16, falconFPRArr, iSkoff_b01, i14);
        this.fft.poly_mulconst(falconFPRArr2, i16, this.fpr.fpr_neg(falconFPR), i14);
        this.fft.poly_mul_fft(falconFPRArr2, i15, falconFPRArr, iSkoff_b11, i14);
        this.fft.poly_mulconst(falconFPRArr2, i15, falconFPR, i14);
        int i18 = i16 + iMKN;
        int i19 = i18 + iMKN;
        ffSampling_fft(samplerZ, samplerCtx, falconFPRArr2, i18, falconFPRArr2, i19, falconFPRArr, iSkoff_tree, falconFPRArr2, i15, falconFPRArr2, i16, i14, falconFPRArr2, i19 + iMKN);
        System.arraycopy(falconFPRArr2, i18, falconFPRArr2, i15, iMKN);
        System.arraycopy(falconFPRArr2, i19, falconFPRArr2, i16, iMKN);
        this.fft.poly_mul_fft(falconFPRArr2, i18, falconFPRArr, iSkoff_b00, i14);
        this.fft.poly_mul_fft(falconFPRArr2, i19, falconFPRArr, iSkoff_b10, i14);
        this.fft.poly_add(falconFPRArr2, i18, falconFPRArr2, i19, i14);
        System.arraycopy(falconFPRArr2, i15, falconFPRArr2, i19, iMKN);
        this.fft.poly_mul_fft(falconFPRArr2, i19, falconFPRArr, iSkoff_b01, i14);
        System.arraycopy(falconFPRArr2, i18, falconFPRArr2, i15, iMKN);
        this.fft.poly_mul_fft(falconFPRArr2, i16, falconFPRArr, iSkoff_b11, i14);
        this.fft.poly_add(falconFPRArr2, i16, falconFPRArr2, i19, i14);
        this.fft.iFFT(falconFPRArr2, i15, i14);
        this.fft.iFFT(falconFPRArr2, i16, i14);
        short[] sArr3 = new short[iMKN];
        int i21 = 0;
        int i22 = 0;
        for (int i23 = 0; i23 < iMKN; i23++) {
            int iFpr_rint = (sArr2[i13 + i23] & HPKE.aead_EXPORT_ONLY) - ((int) this.fpr.fpr_rint(falconFPRArr2[i15 + i23]));
            i21 += iFpr_rint * iFpr_rint;
            i22 |= i21;
            sArr3[i23] = (short) iFpr_rint;
        }
        int i24 = i21 | (-(i22 >>> 31));
        short[] sArr4 = new short[iMKN];
        for (int i25 = 0; i25 < iMKN; i25++) {
            sArr4[i25] = (short) (-this.fpr.fpr_rint(falconFPRArr2[i16 + i25]));
        }
        if (this.common.is_short_half(i24, sArr4, 0, i14) == 0) {
            return 0;
        }
        System.arraycopy(sArr4, 0, sArr, i11, iMKN);
        System.arraycopy(sArr3, 0, falconFPRArr2, i15, iMKN);
        return 1;
    }

    void expand_privkey(FalconFPR[] falconFPRArr, int i11, byte[] bArr, int i12, byte[] bArr2, int i13, byte[] bArr3, int i14, byte[] bArr4, int i15, int i16, FalconFPR[] falconFPRArr2, int i17) {
        int iMKN = MKN(i16);
        int iSkoff_b00 = i11 + skoff_b00(i16);
        int iSkoff_b01 = i11 + skoff_b01(i16);
        int iSkoff_b10 = i11 + skoff_b10(i16);
        int iSkoff_b11 = i11 + skoff_b11(i16);
        int iSkoff_tree = i11 + skoff_tree(i16);
        smallints_to_fpr(falconFPRArr, iSkoff_b01, bArr, i12, i16);
        smallints_to_fpr(falconFPRArr, iSkoff_b00, bArr2, i13, i16);
        smallints_to_fpr(falconFPRArr, iSkoff_b11, bArr3, i14, i16);
        smallints_to_fpr(falconFPRArr, iSkoff_b10, bArr4, i15, i16);
        this.fft.FFT(falconFPRArr, iSkoff_b01, i16);
        this.fft.FFT(falconFPRArr, iSkoff_b00, i16);
        this.fft.FFT(falconFPRArr, iSkoff_b11, i16);
        this.fft.FFT(falconFPRArr, iSkoff_b10, i16);
        this.fft.poly_neg(falconFPRArr, iSkoff_b01, i16);
        this.fft.poly_neg(falconFPRArr, iSkoff_b11, i16);
        int i18 = i17 + iMKN;
        int i19 = i18 + iMKN;
        int i21 = i19 + iMKN;
        System.arraycopy(falconFPRArr, iSkoff_b00, falconFPRArr2, i17, iMKN);
        this.fft.poly_mulselfadj_fft(falconFPRArr2, i17, i16);
        System.arraycopy(falconFPRArr, iSkoff_b01, falconFPRArr2, i21, iMKN);
        this.fft.poly_mulselfadj_fft(falconFPRArr2, i21, i16);
        this.fft.poly_add(falconFPRArr2, i17, falconFPRArr2, i21, i16);
        System.arraycopy(falconFPRArr, iSkoff_b00, falconFPRArr2, i18, iMKN);
        this.fft.poly_muladj_fft(falconFPRArr2, i18, falconFPRArr, iSkoff_b10, i16);
        System.arraycopy(falconFPRArr, iSkoff_b01, falconFPRArr2, i21, iMKN);
        this.fft.poly_muladj_fft(falconFPRArr2, i21, falconFPRArr, iSkoff_b11, i16);
        this.fft.poly_add(falconFPRArr2, i18, falconFPRArr2, i21, i16);
        System.arraycopy(falconFPRArr, iSkoff_b10, falconFPRArr2, i19, iMKN);
        this.fft.poly_mulselfadj_fft(falconFPRArr2, i19, i16);
        System.arraycopy(falconFPRArr, iSkoff_b11, falconFPRArr2, i21, iMKN);
        this.fft.poly_mulselfadj_fft(falconFPRArr2, i21, i16);
        this.fft.poly_add(falconFPRArr2, i19, falconFPRArr2, i21, i16);
        ffLDL_fft(falconFPRArr, iSkoff_tree, falconFPRArr2, i17, falconFPRArr2, i18, falconFPRArr2, i19, i16, falconFPRArr2, i21);
        ffLDL_binary_normalize(falconFPRArr, iSkoff_tree, i16, i16);
    }

    void ffLDL_binary_normalize(FalconFPR[] falconFPRArr, int i11, int i12, int i13) {
        int iMKN = MKN(i13);
        if (iMKN == 1) {
            FPREngine fPREngine = this.fpr;
            falconFPRArr[i11] = fPREngine.fpr_mul(fPREngine.fpr_sqrt(falconFPRArr[i11]), this.fpr.fpr_inv_sigma[i12]);
        } else {
            int i14 = i11 + iMKN;
            int i15 = i13 - 1;
            ffLDL_binary_normalize(falconFPRArr, i14, i12, i15);
            ffLDL_binary_normalize(falconFPRArr, i14 + ffLDL_treesize(i15), i12, i15);
        }
    }

    void ffLDL_fft(FalconFPR[] falconFPRArr, int i11, FalconFPR[] falconFPRArr2, int i12, FalconFPR[] falconFPRArr3, int i13, FalconFPR[] falconFPRArr4, int i14, int i15, FalconFPR[] falconFPRArr5, int i16) {
        int iMKN = MKN(i15);
        if (iMKN == 1) {
            falconFPRArr[i11] = falconFPRArr2[i12];
            return;
        }
        int i17 = iMKN >> 1;
        int i18 = i16 + iMKN;
        int i19 = i16 + (iMKN << 1);
        System.arraycopy(falconFPRArr2, i12, falconFPRArr5, i16, iMKN);
        this.fft.poly_LDLmv_fft(falconFPRArr5, i18, falconFPRArr, i11, falconFPRArr2, i12, falconFPRArr3, i13, falconFPRArr4, i14, i15);
        this.fft.poly_split_fft(falconFPRArr5, i19, falconFPRArr5, i19 + i17, falconFPRArr5, i16, i15);
        int i21 = i16 + i17;
        this.fft.poly_split_fft(falconFPRArr5, i16, falconFPRArr5, i21, falconFPRArr5, i18, i15);
        System.arraycopy(falconFPRArr5, i19, falconFPRArr5, i18, iMKN);
        int i22 = i11 + iMKN;
        int i23 = i15 - 1;
        ffLDL_fft_inner(falconFPRArr, i22, falconFPRArr5, i18, falconFPRArr5, i18 + i17, i23, falconFPRArr5, i19);
        ffLDL_fft_inner(falconFPRArr, i22 + ffLDL_treesize(i23), falconFPRArr5, i16, falconFPRArr5, i21, i23, falconFPRArr5, i19);
    }

    void ffLDL_fft_inner(FalconFPR[] falconFPRArr, int i11, FalconFPR[] falconFPRArr2, int i12, FalconFPR[] falconFPRArr3, int i13, int i14, FalconFPR[] falconFPRArr4, int i15) {
        int iMKN = MKN(i14);
        if (iMKN == 1) {
            falconFPRArr[i11] = falconFPRArr2[i12];
            return;
        }
        int i16 = iMKN >> 1;
        this.fft.poly_LDLmv_fft(falconFPRArr4, i15, falconFPRArr, i11, falconFPRArr2, i12, falconFPRArr3, i13, falconFPRArr2, i12, i14);
        int i17 = i13 + i16;
        this.fft.poly_split_fft(falconFPRArr3, i13, falconFPRArr3, i17, falconFPRArr2, i12, i14);
        int i18 = i12 + i16;
        this.fft.poly_split_fft(falconFPRArr2, i12, falconFPRArr2, i18, falconFPRArr4, i15, i14);
        int i19 = i11 + iMKN;
        int i21 = i14 - 1;
        ffLDL_fft_inner(falconFPRArr, i19, falconFPRArr3, i13, falconFPRArr3, i17, i21, falconFPRArr4, i15);
        ffLDL_fft_inner(falconFPRArr, i19 + ffLDL_treesize(i21), falconFPRArr2, i12, falconFPRArr2, i18, i21, falconFPRArr4, i15);
    }

    int ffLDL_treesize(int i11) {
        return (i11 + 1) << i11;
    }

    void ffSampling_fft(SamplerZ samplerZ, SamplerCtx samplerCtx, FalconFPR[] falconFPRArr, int i11, FalconFPR[] falconFPRArr2, int i12, FalconFPR[] falconFPRArr3, int i13, FalconFPR[] falconFPRArr4, int i14, FalconFPR[] falconFPRArr5, int i15, int i16, FalconFPR[] falconFPRArr6, int i17) {
        if (i16 != 2) {
            if (i16 != 1) {
                int i18 = 1 << i16;
                int i19 = i18 >> 1;
                int i21 = i13 + i18;
                int i22 = i16 - 1;
                int iFfLDL_treesize = i21 + ffLDL_treesize(i22);
                int i23 = i12 + i19;
                this.fft.poly_split_fft(falconFPRArr2, i12, falconFPRArr2, i23, falconFPRArr5, i15, i16);
                int i24 = i17 + i19;
                int i25 = i17 + i18;
                ffSampling_fft(samplerZ, samplerCtx, falconFPRArr6, i17, falconFPRArr6, i24, falconFPRArr3, iFfLDL_treesize, falconFPRArr2, i12, falconFPRArr2, i23, i22, falconFPRArr6, i25);
                this.fft.poly_merge_fft(falconFPRArr2, i12, falconFPRArr6, i17, falconFPRArr6, i24, i16);
                System.arraycopy(falconFPRArr5, i15, falconFPRArr6, i17, i18);
                this.fft.poly_sub(falconFPRArr6, i17, falconFPRArr2, i12, i16);
                this.fft.poly_mul_fft(falconFPRArr6, i17, falconFPRArr3, i13, i16);
                this.fft.poly_add(falconFPRArr6, i17, falconFPRArr4, i14, i16);
                int i26 = i11 + i19;
                this.fft.poly_split_fft(falconFPRArr, i11, falconFPRArr, i26, falconFPRArr6, i17, i16);
                ffSampling_fft(samplerZ, samplerCtx, falconFPRArr6, i17, falconFPRArr6, i24, falconFPRArr3, i21, falconFPRArr, i11, falconFPRArr, i26, i22, falconFPRArr6, i25);
                this.fft.poly_merge_fft(falconFPRArr, i11, falconFPRArr6, i17, falconFPRArr6, i24, i16);
                return;
            }
            FalconFPR falconFPR = falconFPRArr5[i15];
            FalconFPR falconFPR2 = falconFPRArr5[i15 + 1];
            FalconFPR falconFPR3 = falconFPRArr3[i13 + 3];
            FalconFPR falconFPRFpr_of = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPR, falconFPR3));
            falconFPRArr2[i12] = falconFPRFpr_of;
            FalconFPR falconFPRFpr_of2 = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPR2, falconFPR3));
            falconFPRArr2[i12 + 1] = falconFPRFpr_of2;
            FalconFPR falconFPRFpr_sub = this.fpr.fpr_sub(falconFPR, falconFPRFpr_of);
            FalconFPR falconFPRFpr_sub2 = this.fpr.fpr_sub(falconFPR2, falconFPRFpr_of2);
            FalconFPR falconFPR4 = falconFPRArr3[i13];
            FalconFPR falconFPR5 = falconFPRArr3[i13 + 1];
            FPREngine fPREngine = this.fpr;
            FalconFPR falconFPRFpr_sub3 = fPREngine.fpr_sub(fPREngine.fpr_mul(falconFPRFpr_sub, falconFPR4), this.fpr.fpr_mul(falconFPRFpr_sub2, falconFPR5));
            FPREngine fPREngine2 = this.fpr;
            FalconFPR falconFPRFpr_add = fPREngine2.fpr_add(fPREngine2.fpr_mul(falconFPRFpr_sub, falconFPR5), this.fpr.fpr_mul(falconFPRFpr_sub2, falconFPR4));
            FalconFPR falconFPRFpr_add2 = this.fpr.fpr_add(falconFPRFpr_sub3, falconFPRArr4[i14]);
            FalconFPR falconFPRFpr_add3 = this.fpr.fpr_add(falconFPRFpr_add, falconFPRArr4[i14 + 1]);
            FalconFPR falconFPR6 = falconFPRArr3[i13 + 2];
            falconFPRArr[i11] = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPRFpr_add2, falconFPR6));
            falconFPRArr[i11 + 1] = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPRFpr_add3, falconFPR6));
            return;
        }
        FalconFPR falconFPR7 = falconFPRArr5[i15];
        int i27 = i15 + 2;
        FalconFPR falconFPR8 = falconFPRArr5[i27];
        int i28 = i15 + 1;
        FalconFPR falconFPR9 = falconFPRArr5[i28];
        int i29 = i15 + 3;
        FalconFPR falconFPR10 = falconFPRArr5[i29];
        FalconFPR falconFPRFpr_add4 = this.fpr.fpr_add(falconFPR7, falconFPR9);
        FalconFPR falconFPRFpr_add5 = this.fpr.fpr_add(falconFPR8, falconFPR10);
        FalconFPR falconFPRFpr_half = this.fpr.fpr_half(falconFPRFpr_add4);
        FalconFPR falconFPRFpr_half2 = this.fpr.fpr_half(falconFPRFpr_add5);
        FalconFPR falconFPRFpr_sub4 = this.fpr.fpr_sub(falconFPR7, falconFPR9);
        FalconFPR falconFPRFpr_sub5 = this.fpr.fpr_sub(falconFPR8, falconFPR10);
        FPREngine fPREngine3 = this.fpr;
        FalconFPR falconFPRFpr_mul = fPREngine3.fpr_mul(fPREngine3.fpr_add(falconFPRFpr_sub4, falconFPRFpr_sub5), this.fpr.fpr_invsqrt8);
        FPREngine fPREngine4 = this.fpr;
        FalconFPR falconFPRFpr_mul2 = fPREngine4.fpr_mul(fPREngine4.fpr_sub(falconFPRFpr_sub5, falconFPRFpr_sub4), this.fpr.fpr_invsqrt8);
        FalconFPR falconFPR11 = falconFPRArr3[i13 + 11];
        FalconFPR falconFPRFpr_of3 = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPRFpr_mul, falconFPR11));
        FalconFPR falconFPRFpr_of4 = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPRFpr_mul2, falconFPR11));
        FalconFPR falconFPRFpr_sub6 = this.fpr.fpr_sub(falconFPRFpr_mul, falconFPRFpr_of3);
        FalconFPR falconFPRFpr_sub7 = this.fpr.fpr_sub(falconFPRFpr_mul2, falconFPRFpr_of4);
        FalconFPR falconFPR12 = falconFPRArr3[i13 + 8];
        FalconFPR falconFPR13 = falconFPRArr3[i13 + 9];
        FPREngine fPREngine5 = this.fpr;
        FalconFPR falconFPRFpr_sub8 = fPREngine5.fpr_sub(fPREngine5.fpr_mul(falconFPRFpr_sub6, falconFPR12), this.fpr.fpr_mul(falconFPRFpr_sub7, falconFPR13));
        FPREngine fPREngine6 = this.fpr;
        FalconFPR falconFPRFpr_add6 = fPREngine6.fpr_add(fPREngine6.fpr_mul(falconFPRFpr_sub6, falconFPR13), this.fpr.fpr_mul(falconFPRFpr_sub7, falconFPR12));
        FalconFPR falconFPRFpr_add7 = this.fpr.fpr_add(falconFPRFpr_sub8, falconFPRFpr_half);
        FalconFPR falconFPRFpr_add8 = this.fpr.fpr_add(falconFPRFpr_add6, falconFPRFpr_half2);
        FalconFPR falconFPR14 = falconFPRArr3[i13 + 10];
        FalconFPR falconFPRFpr_of5 = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPRFpr_add7, falconFPR14));
        FalconFPR falconFPRFpr_of6 = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPRFpr_add8, falconFPR14));
        FPREngine fPREngine7 = this.fpr;
        FalconFPR falconFPRFpr_mul3 = fPREngine7.fpr_mul(fPREngine7.fpr_sub(falconFPRFpr_of3, falconFPRFpr_of4), this.fpr.fpr_invsqrt2);
        FPREngine fPREngine8 = this.fpr;
        FalconFPR falconFPRFpr_mul4 = fPREngine8.fpr_mul(fPREngine8.fpr_add(falconFPRFpr_of3, falconFPRFpr_of4), this.fpr.fpr_invsqrt2);
        FalconFPR falconFPRFpr_add9 = this.fpr.fpr_add(falconFPRFpr_of5, falconFPRFpr_mul3);
        falconFPRArr2[i12] = falconFPRFpr_add9;
        FalconFPR falconFPRFpr_add10 = this.fpr.fpr_add(falconFPRFpr_of6, falconFPRFpr_mul4);
        falconFPRArr2[i12 + 2] = falconFPRFpr_add10;
        FalconFPR falconFPRFpr_sub9 = this.fpr.fpr_sub(falconFPRFpr_of5, falconFPRFpr_mul3);
        falconFPRArr2[i12 + 1] = falconFPRFpr_sub9;
        FalconFPR falconFPRFpr_sub10 = this.fpr.fpr_sub(falconFPRFpr_of6, falconFPRFpr_mul4);
        falconFPRArr2[i12 + 3] = falconFPRFpr_sub10;
        FalconFPR falconFPRFpr_sub11 = this.fpr.fpr_sub(falconFPRArr5[i15], falconFPRFpr_add9);
        FalconFPR falconFPRFpr_sub12 = this.fpr.fpr_sub(falconFPRArr5[i28], falconFPRFpr_sub9);
        FalconFPR falconFPRFpr_sub13 = this.fpr.fpr_sub(falconFPRArr5[i27], falconFPRFpr_add10);
        FalconFPR falconFPRFpr_sub14 = this.fpr.fpr_sub(falconFPRArr5[i29], falconFPRFpr_sub10);
        FalconFPR falconFPR15 = falconFPRArr3[i13];
        FalconFPR falconFPR16 = falconFPRArr3[i13 + 2];
        FPREngine fPREngine9 = this.fpr;
        FalconFPR falconFPRFpr_sub15 = fPREngine9.fpr_sub(fPREngine9.fpr_mul(falconFPRFpr_sub11, falconFPR15), this.fpr.fpr_mul(falconFPRFpr_sub13, falconFPR16));
        FPREngine fPREngine10 = this.fpr;
        FalconFPR falconFPRFpr_add11 = fPREngine10.fpr_add(fPREngine10.fpr_mul(falconFPRFpr_sub11, falconFPR16), this.fpr.fpr_mul(falconFPRFpr_sub13, falconFPR15));
        FalconFPR falconFPR17 = falconFPRArr3[i13 + 1];
        FalconFPR falconFPR18 = falconFPRArr3[i13 + 3];
        FPREngine fPREngine11 = this.fpr;
        FalconFPR falconFPRFpr_sub16 = fPREngine11.fpr_sub(fPREngine11.fpr_mul(falconFPRFpr_sub12, falconFPR17), this.fpr.fpr_mul(falconFPRFpr_sub14, falconFPR18));
        FPREngine fPREngine12 = this.fpr;
        FalconFPR falconFPRFpr_add12 = fPREngine12.fpr_add(fPREngine12.fpr_mul(falconFPRFpr_sub12, falconFPR18), this.fpr.fpr_mul(falconFPRFpr_sub14, falconFPR17));
        FalconFPR falconFPRFpr_add13 = this.fpr.fpr_add(falconFPRFpr_sub15, falconFPRArr4[i14]);
        FalconFPR falconFPRFpr_add14 = this.fpr.fpr_add(falconFPRFpr_sub16, falconFPRArr4[i14 + 1]);
        FalconFPR falconFPRFpr_add15 = this.fpr.fpr_add(falconFPRFpr_add11, falconFPRArr4[i14 + 2]);
        FalconFPR falconFPRFpr_add16 = this.fpr.fpr_add(falconFPRFpr_add12, falconFPRArr4[i14 + 3]);
        FalconFPR falconFPRFpr_add17 = this.fpr.fpr_add(falconFPRFpr_add13, falconFPRFpr_add14);
        FalconFPR falconFPRFpr_add18 = this.fpr.fpr_add(falconFPRFpr_add15, falconFPRFpr_add16);
        FalconFPR falconFPRFpr_half3 = this.fpr.fpr_half(falconFPRFpr_add17);
        FalconFPR falconFPRFpr_half4 = this.fpr.fpr_half(falconFPRFpr_add18);
        FalconFPR falconFPRFpr_sub17 = this.fpr.fpr_sub(falconFPRFpr_add13, falconFPRFpr_add14);
        FalconFPR falconFPRFpr_sub18 = this.fpr.fpr_sub(falconFPRFpr_add15, falconFPRFpr_add16);
        FPREngine fPREngine13 = this.fpr;
        FalconFPR falconFPRFpr_mul5 = fPREngine13.fpr_mul(fPREngine13.fpr_add(falconFPRFpr_sub17, falconFPRFpr_sub18), this.fpr.fpr_invsqrt8);
        FPREngine fPREngine14 = this.fpr;
        FalconFPR falconFPRFpr_mul6 = fPREngine14.fpr_mul(fPREngine14.fpr_sub(falconFPRFpr_sub18, falconFPRFpr_sub17), this.fpr.fpr_invsqrt8);
        FalconFPR falconFPR19 = falconFPRArr3[i13 + 7];
        FalconFPR falconFPRFpr_of7 = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPRFpr_mul5, falconFPR19));
        FalconFPR falconFPRFpr_of8 = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPRFpr_mul6, falconFPR19));
        FalconFPR falconFPRFpr_sub19 = this.fpr.fpr_sub(falconFPRFpr_mul5, falconFPRFpr_of7);
        FalconFPR falconFPRFpr_sub20 = this.fpr.fpr_sub(falconFPRFpr_mul6, falconFPRFpr_of8);
        FalconFPR falconFPR20 = falconFPRArr3[i13 + 4];
        FalconFPR falconFPR21 = falconFPRArr3[i13 + 5];
        FPREngine fPREngine15 = this.fpr;
        FalconFPR falconFPRFpr_sub21 = fPREngine15.fpr_sub(fPREngine15.fpr_mul(falconFPRFpr_sub19, falconFPR20), this.fpr.fpr_mul(falconFPRFpr_sub20, falconFPR21));
        FPREngine fPREngine16 = this.fpr;
        FalconFPR falconFPRFpr_add19 = fPREngine16.fpr_add(fPREngine16.fpr_mul(falconFPRFpr_sub19, falconFPR21), this.fpr.fpr_mul(falconFPRFpr_sub20, falconFPR20));
        FalconFPR falconFPRFpr_add20 = this.fpr.fpr_add(falconFPRFpr_sub21, falconFPRFpr_half3);
        FalconFPR falconFPRFpr_add21 = this.fpr.fpr_add(falconFPRFpr_add19, falconFPRFpr_half4);
        FalconFPR falconFPR22 = falconFPRArr3[i13 + 6];
        FalconFPR falconFPRFpr_of9 = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPRFpr_add20, falconFPR22));
        FalconFPR falconFPRFpr_of10 = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPRFpr_add21, falconFPR22));
        FPREngine fPREngine17 = this.fpr;
        FalconFPR falconFPRFpr_mul7 = fPREngine17.fpr_mul(fPREngine17.fpr_sub(falconFPRFpr_of7, falconFPRFpr_of8), this.fpr.fpr_invsqrt2);
        FPREngine fPREngine18 = this.fpr;
        FalconFPR falconFPRFpr_mul8 = fPREngine18.fpr_mul(fPREngine18.fpr_add(falconFPRFpr_of7, falconFPRFpr_of8), this.fpr.fpr_invsqrt2);
        falconFPRArr[i11] = this.fpr.fpr_add(falconFPRFpr_of9, falconFPRFpr_mul7);
        falconFPRArr[i11 + 2] = this.fpr.fpr_add(falconFPRFpr_of10, falconFPRFpr_mul8);
        falconFPRArr[i11 + 1] = this.fpr.fpr_sub(falconFPRFpr_of9, falconFPRFpr_mul7);
        falconFPRArr[i11 + 3] = this.fpr.fpr_sub(falconFPRFpr_of10, falconFPRFpr_mul8);
    }

    void ffSampling_fft_dyntree(SamplerZ samplerZ, SamplerCtx samplerCtx, FalconFPR[] falconFPRArr, int i11, FalconFPR[] falconFPRArr2, int i12, FalconFPR[] falconFPRArr3, int i13, FalconFPR[] falconFPRArr4, int i14, FalconFPR[] falconFPRArr5, int i15, int i16, int i17, FalconFPR[] falconFPRArr6, int i18) {
        if (i17 == 0) {
            FalconFPR falconFPR = falconFPRArr3[i13];
            FPREngine fPREngine = this.fpr;
            FalconFPR falconFPRFpr_mul = fPREngine.fpr_mul(fPREngine.fpr_sqrt(falconFPR), this.fpr.fpr_inv_sigma[i16]);
            falconFPRArr[i11] = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPRArr[i11], falconFPRFpr_mul));
            falconFPRArr2[i12] = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPRArr2[i12], falconFPRFpr_mul));
            return;
        }
        int i19 = 1 << i17;
        int i21 = i19 >> 1;
        this.fft.poly_LDL_fft(falconFPRArr3, i13, falconFPRArr4, i14, falconFPRArr5, i15, i17);
        int i22 = i18 + i21;
        this.fft.poly_split_fft(falconFPRArr6, i18, falconFPRArr6, i22, falconFPRArr3, i13, i17);
        System.arraycopy(falconFPRArr6, i18, falconFPRArr3, i13, i19);
        this.fft.poly_split_fft(falconFPRArr6, i18, falconFPRArr6, i22, falconFPRArr5, i15, i17);
        System.arraycopy(falconFPRArr6, i18, falconFPRArr5, i15, i19);
        System.arraycopy(falconFPRArr4, i14, falconFPRArr6, i18, i19);
        System.arraycopy(falconFPRArr3, i13, falconFPRArr4, i14, i21);
        int i23 = i14 + i21;
        System.arraycopy(falconFPRArr5, i15, falconFPRArr4, i23, i21);
        int i24 = i18 + i19;
        int i25 = i24 + i21;
        this.fft.poly_split_fft(falconFPRArr6, i24, falconFPRArr6, i25, falconFPRArr2, i12, i17);
        int i26 = i17 - 1;
        ffSampling_fft_dyntree(samplerZ, samplerCtx, falconFPRArr6, i24, falconFPRArr6, i25, falconFPRArr5, i15, falconFPRArr5, i15 + i21, falconFPRArr4, i23, i16, i26, falconFPRArr6, i24 + i19);
        int i27 = i18 + (i19 << 1);
        this.fft.poly_merge_fft(falconFPRArr6, i27, falconFPRArr6, i24, falconFPRArr6, i25, i17);
        System.arraycopy(falconFPRArr2, i12, falconFPRArr6, i24, i19);
        this.fft.poly_sub(falconFPRArr6, i24, falconFPRArr6, i27, i17);
        System.arraycopy(falconFPRArr6, i27, falconFPRArr2, i12, i19);
        this.fft.poly_mul_fft(falconFPRArr6, i18, falconFPRArr6, i24, i17);
        this.fft.poly_add(falconFPRArr, i11, falconFPRArr6, i18, i17);
        this.fft.poly_split_fft(falconFPRArr6, i18, falconFPRArr6, i22, falconFPRArr, i11, i17);
        ffSampling_fft_dyntree(samplerZ, samplerCtx, falconFPRArr6, i18, falconFPRArr6, i22, falconFPRArr3, i13, falconFPRArr3, i13 + i21, falconFPRArr4, i14, i16, i26, falconFPRArr6, i24);
        this.fft.poly_merge_fft(falconFPRArr, i11, falconFPRArr6, i18, falconFPRArr6, i22, i17);
    }

    void sign_dyn(short[] sArr, int i11, SHAKE256 shake256, byte[] bArr, int i12, byte[] bArr2, int i13, byte[] bArr3, int i14, byte[] bArr4, int i15, short[] sArr2, int i16, int i17, FalconFPR[] falconFPRArr, int i18) {
        SamplerCtx samplerCtx;
        SamplerZ samplerZ;
        do {
            samplerCtx = new SamplerCtx();
            samplerZ = new SamplerZ();
            samplerCtx.sigma_min = this.fpr.fpr_sigma_min[i17];
            samplerCtx.f99065p.prng_init(shake256);
        } while (do_sign_dyn(samplerZ, samplerCtx, sArr, i11, bArr, i12, bArr2, i13, bArr3, i14, bArr4, i15, sArr2, i16, i17, falconFPRArr, i18) == 0);
    }

    void sign_tree(short[] sArr, int i11, SHAKE256 shake256, FalconFPR[] falconFPRArr, int i12, short[] sArr2, int i13, int i14, FalconFPR[] falconFPRArr2, int i15) {
        SamplerCtx samplerCtx;
        SamplerZ samplerZ;
        do {
            samplerCtx = new SamplerCtx();
            samplerZ = new SamplerZ();
            samplerCtx.sigma_min = this.fpr.fpr_sigma_min[i14];
            samplerCtx.f99065p.prng_init(shake256);
        } while (do_sign_tree(samplerZ, samplerCtx, sArr, i11, falconFPRArr, i12, sArr2, i13, i14, falconFPRArr2, i15) == 0);
    }

    int skoff_b00(int i11) {
        return 0;
    }

    int skoff_b01(int i11) {
        return MKN(i11);
    }

    int skoff_b10(int i11) {
        return MKN(i11) * 2;
    }

    int skoff_b11(int i11) {
        return MKN(i11) * 3;
    }

    int skoff_tree(int i11) {
        return MKN(i11) * 4;
    }

    void smallints_to_fpr(FalconFPR[] falconFPRArr, int i11, byte[] bArr, int i12, int i13) {
        int iMKN = MKN(i13);
        for (int i14 = 0; i14 < iMKN; i14++) {
            falconFPRArr[i11 + i14] = this.fpr.fpr_of(bArr[i12 + i14]);
        }
    }
}
