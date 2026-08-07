package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.math.raw.Interleave;

/* JADX INFO: loaded from: classes10.dex */
final class GF12 extends GF {
    GF12() {
    }

    private int gf_mul_ext_par(short s11, short s12, short s13, short s14) {
        int i11 = (s12 & 1) * s11;
        int i12 = (s14 & 1) * s13;
        for (int i13 = 1; i13 < 12; i13++) {
            int i14 = 1 << i13;
            i11 ^= (s12 & i14) * s11;
            i12 ^= (i14 & s14) * s13;
        }
        return i11 ^ i12;
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected short gf_frac(short s11, short s12) {
        return gf_mul(gf_inv(s11), s12);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected short gf_inv(short s11) {
        short sGf_mul = gf_mul(gf_sq(s11), s11);
        short sGf_mul2 = gf_mul(gf_sq(gf_sq(sGf_mul)), sGf_mul);
        return gf_sq(gf_mul(gf_sq(gf_mul(gf_sq(gf_sq(gf_mul(gf_sq(gf_sq(gf_sq(gf_sq(sGf_mul2)))), sGf_mul2))), sGf_mul)), s11));
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected short gf_mul(short s11, short s12) {
        int i11 = (s12 & 1) * s11;
        for (int i12 = 1; i12 < 12; i12++) {
            i11 ^= ((1 << i12) & s12) * s11;
        }
        return gf_reduce(i11);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected int gf_mul_ext(short s11, short s12) {
        int i11 = (s12 & 1) * s11;
        for (int i12 = 1; i12 < 12; i12++) {
            i11 ^= ((1 << i12) & s12) * s11;
        }
        return i11;
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected void gf_mul_poly(int i11, int[] iArr, short[] sArr, short[] sArr2, short[] sArr3, int[] iArr2) {
        iArr2[0] = gf_mul_ext(sArr2[0], sArr3[0]);
        for (int i12 = 1; i12 < i11; i12++) {
            int i13 = i12 + i12;
            iArr2[i13 - 1] = 0;
            short s11 = sArr2[i12];
            short s12 = sArr3[i12];
            for (int i14 = 0; i14 < i12; i14++) {
                int i15 = i12 + i14;
                iArr2[i15] = iArr2[i15] ^ gf_mul_ext_par(s11, sArr3[i14], sArr2[i14], s12);
            }
            iArr2[i13] = gf_mul_ext(s11, s12);
        }
        for (int i16 = (i11 - 1) * 2; i16 >= i11; i16--) {
            int i17 = iArr2[i16];
            for (int i18 = 0; i18 < iArr.length - 1; i18++) {
                int i19 = (i16 - i11) + iArr[i18];
                iArr2[i19] = iArr2[i19] ^ i17;
            }
            int i21 = i16 - i11;
            iArr2[i21] = (i17 << 1) ^ iArr2[i21];
        }
        for (int i22 = 0; i22 < i11; i22++) {
            sArr[i22] = gf_reduce(iArr2[i22]);
        }
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected short gf_reduce(int i11) {
        return (short) ((i11 >>> 21) ^ ((((i11 & 4095) ^ (i11 >>> 12)) ^ ((2093056 & i11) >>> 9)) ^ ((14680064 & i11) >>> 18)));
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected short gf_sq(short s11) {
        return gf_reduce(Interleave.expand16to32(s11));
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected int gf_sq_ext(short s11) {
        return Interleave.expand16to32(s11);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected void gf_sqr_poly(int i11, int[] iArr, short[] sArr, short[] sArr2, int[] iArr2) {
        iArr2[0] = gf_sq_ext(sArr2[0]);
        for (int i12 = 1; i12 < i11; i12++) {
            int i13 = i12 + i12;
            iArr2[i13 - 1] = 0;
            iArr2[i13] = gf_sq_ext(sArr2[i12]);
        }
        for (int i14 = (i11 - 1) * 2; i14 >= i11; i14--) {
            int i15 = iArr2[i14];
            for (int i16 = 0; i16 < iArr.length - 1; i16++) {
                int i17 = (i14 - i11) + iArr[i16];
                iArr2[i17] = iArr2[i17] ^ i15;
            }
            int i18 = i14 - i11;
            iArr2[i18] = (i15 << 1) ^ iArr2[i18];
        }
        for (int i19 = 0; i19 < i11; i19++) {
            sArr[i19] = gf_reduce(iArr2[i19]);
        }
    }
}
