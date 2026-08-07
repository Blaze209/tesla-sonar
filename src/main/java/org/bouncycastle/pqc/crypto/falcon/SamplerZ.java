package org.bouncycastle.pqc.crypto.falcon;

import com.plaid.internal.EnumC4419g;

/* JADX INFO: loaded from: classes10.dex */
class SamplerZ {
    FPREngine fpr = new FPREngine();

    SamplerZ() {
    }

    int BerExp(FalconRNG falconRNG, FalconFPR falconFPR, FalconFPR falconFPR2) {
        int iPrng_get_u8;
        FPREngine fPREngine = this.fpr;
        int iFpr_trunc = (int) fPREngine.fpr_trunc(fPREngine.fpr_mul(falconFPR, fPREngine.fpr_inv_log2));
        FPREngine fPREngine2 = this.fpr;
        long jFpr_expm_p63 = ((this.fpr.fpr_expm_p63(fPREngine2.fpr_sub(falconFPR, fPREngine2.fpr_mul(fPREngine2.fpr_of(iFpr_trunc), this.fpr.fpr_log2)), falconFPR2) << 1) - 1) >>> (iFpr_trunc ^ ((iFpr_trunc ^ 63) & (-((63 - iFpr_trunc) >>> 31))));
        int i11 = 64;
        do {
            i11 -= 8;
            iPrng_get_u8 = (falconRNG.prng_get_u8() & 255) - (((int) (jFpr_expm_p63 >>> i11)) & 255);
            if (iPrng_get_u8 != 0) {
                break;
            }
        } while (i11 > 0);
        return iPrng_get_u8 >>> 31;
    }

    int gaussian0_sampler(FalconRNG falconRNG) {
        int[] iArr = {10745844, 3068844, 3741698, 5559083, 1580863, 8248194, 2260429, 13669192, 2736639, 708981, 4421575, 10046180, 169348, 7122675, 4136815, 30538, 13063405, 7650655, 4132, 14505003, 7826148, 417, 16768101, 11363290, 31, 8444042, 8086568, 1, 12844466, 265321, 0, 1232676, 13644283, 0, 38047, 9111839, 0, 870, 6138264, 0, 14, 12545723, 0, 0, 3104126, 0, 0, 28824, 0, 0, EnumC4419g.SDK_ASSET_ICON_ARROW_UP_VALUE, 0, 0, 1};
        long jPrng_get_u64 = falconRNG.prng_get_u64();
        int i11 = ((int) jPrng_get_u64) & 16777215;
        int i12 = 16777215 & ((int) (jPrng_get_u64 >>> 24));
        int iPrng_get_u8 = ((falconRNG.prng_get_u8() & 255) << 16) | ((int) (jPrng_get_u64 >>> 48));
        int i13 = 0;
        for (int i14 = 0; i14 < 54; i14 += 3) {
            i13 += ((iPrng_get_u8 - iArr[i14]) - (((i12 - iArr[i14 + 1]) - ((i11 - iArr[i14 + 2]) >>> 31)) >>> 31)) >>> 31;
        }
        return i13;
    }

    int sample(SamplerCtx samplerCtx, FalconFPR falconFPR, FalconFPR falconFPR2) {
        return sampler(samplerCtx, falconFPR, falconFPR2);
    }

    int sampler(SamplerCtx samplerCtx, FalconFPR falconFPR, FalconFPR falconFPR2) {
        int iGaussian0_sampler;
        int i11;
        FalconFPR falconFPRFpr_mul;
        FPREngine fPREngine;
        int iFpr_floor = (int) this.fpr.fpr_floor(falconFPR);
        FPREngine fPREngine2 = this.fpr;
        FalconFPR falconFPRFpr_sub = fPREngine2.fpr_sub(falconFPR, fPREngine2.fpr_of(iFpr_floor));
        FPREngine fPREngine3 = this.fpr;
        FalconFPR falconFPRFpr_half = fPREngine3.fpr_half(fPREngine3.fpr_sqr(falconFPR2));
        FalconFPR falconFPRFpr_mul2 = this.fpr.fpr_mul(falconFPR2, samplerCtx.sigma_min);
        do {
            iGaussian0_sampler = gaussian0_sampler(samplerCtx.f99065p);
            int iPrng_get_u8 = samplerCtx.f99065p.prng_get_u8() & 1;
            i11 = iPrng_get_u8 + (((iPrng_get_u8 << 1) - 1) * iGaussian0_sampler);
            FPREngine fPREngine4 = this.fpr;
            falconFPRFpr_mul = fPREngine4.fpr_mul(fPREngine4.fpr_sqr(fPREngine4.fpr_sub(fPREngine4.fpr_of(i11), falconFPRFpr_sub)), falconFPRFpr_half);
            fPREngine = this.fpr;
        } while (BerExp(samplerCtx.f99065p, fPREngine.fpr_sub(falconFPRFpr_mul, fPREngine.fpr_mul(fPREngine.fpr_of(iGaussian0_sampler * iGaussian0_sampler), this.fpr.fpr_inv_2sqrsigma0)), falconFPRFpr_mul2) == 0);
        return iFpr_floor + i11;
    }
}
