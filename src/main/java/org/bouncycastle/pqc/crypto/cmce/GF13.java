package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.math.raw.Interleave;

/* JADX INFO: loaded from: classes10.dex */
final class GF13 extends GF {
    GF13() {
    }

    private int gf_mul_ext_par(short s11, short s12, short s13, short s14) {
        int i11 = (s12 & 1) * s11;
        int i12 = (s14 & 1) * s13;
        for (int i13 = 1; i13 < 13; i13++) {
            int i14 = 1 << i13;
            i11 ^= (s12 & i14) * s11;
            i12 ^= (i14 & s14) * s13;
        }
        return i11 ^ i12;
    }

    private short gf_sq2(short s11) {
        return gf_reduce(Interleave.expand16to32(gf_reduce(Interleave.expand16to32(s11))));
    }

    private short gf_sq2mul(short s11, short s12) {
        long j11 = s11;
        long j12 = s12;
        long j13 = (j12 << 18) * (64 & j11);
        long j14 = j11 ^ (j11 << 21);
        long j15 = ((j12 << 15) * (j14 & 8589934624L)) ^ (((((j13 ^ ((268435457 & j14) * j12)) ^ ((j12 << 3) * (536870914 & j14))) ^ ((j12 << 6) * (1073741828 & j14))) ^ ((j12 << 9) * (2147483656L & j14))) ^ ((j12 << 12) * (4294967312L & j14)));
        long j16 = 2305834213120671744L & j15;
        long j17 = j15 ^ ((j16 >>> 26) ^ (((j16 >>> 18) ^ (j16 >>> 20)) ^ (j16 >>> 24)));
        long j18 = 8796025913344L & j17;
        return gf_reduce(((int) (j17 ^ ((j18 >>> 26) ^ (((j18 >>> 18) ^ (j18 >>> 20)) ^ (j18 >>> 24))))) & 67108863);
    }

    private short gf_sqmul(short s11, short s12) {
        long j11 = s11;
        long j12 = s12;
        long j13 = (j12 << 6) * (64 & j11);
        long j14 = j11 ^ (j11 << 7);
        long j15 = ((j12 << 5) * (j14 & 524320)) ^ (((((j13 ^ ((16385 & j14) * j12)) ^ ((j12 << 1) * (32770 & j14))) ^ ((j12 << 2) * (65540 & j14))) ^ ((j12 << 3) * (131080 & j14))) ^ ((j12 << 4) * (262160 & j14)));
        long j16 = 137371844608L & j15;
        return gf_reduce(((int) (j15 ^ ((j16 >>> 26) ^ (((j16 >>> 18) ^ (j16 >>> 20)) ^ (j16 >>> 24))))) & 67108863);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected short gf_frac(short s11, short s12) {
        short sGf_sqmul = gf_sqmul(s11, s11);
        short sGf_sq2mul = gf_sq2mul(sGf_sqmul, sGf_sqmul);
        return gf_sqmul(gf_sq2mul(gf_sq2(gf_sq2mul(gf_sq2(sGf_sq2mul), sGf_sq2mul)), sGf_sq2mul), s12);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected short gf_inv(short s11) {
        return gf_frac(s11, (short) 1);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected short gf_mul(short s11, short s12) {
        int i11 = (s12 & 1) * s11;
        for (int i12 = 1; i12 < 13; i12++) {
            i11 ^= ((1 << i12) & s12) * s11;
        }
        return gf_reduce(i11);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected int gf_mul_ext(short s11, short s12) {
        int i11 = (s12 & 1) * s11;
        for (int i12 = 1; i12 < 13; i12++) {
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
            for (int i18 : iArr) {
                int i19 = (i16 - i11) + i18;
                iArr2[i19] = iArr2[i19] ^ i17;
            }
        }
        for (int i21 = 0; i21 < i11; i21++) {
            sArr[i21] = gf_reduce(iArr2[i21]);
        }
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected short gf_reduce(int i11) {
        int i12 = i11 & 8191;
        int i13 = i11 >>> 13;
        int i14 = ((i13 << 4) ^ (i13 << 3)) ^ (i13 << 1);
        int i15 = i14 >>> 13;
        return (short) ((((i13 ^ i12) ^ i15) ^ (i14 & 8191)) ^ (((i15 << 4) ^ (i15 << 3)) ^ (i15 << 1)));
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
            for (int i16 : iArr) {
                int i17 = (i14 - i11) + i16;
                iArr2[i17] = iArr2[i17] ^ i15;
            }
        }
        for (int i18 = 0; i18 < i11; i18++) {
            sArr[i18] = gf_reduce(iArr2[i18]);
        }
    }
}
