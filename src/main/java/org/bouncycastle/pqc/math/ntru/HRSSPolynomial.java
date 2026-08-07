package org.bouncycastle.pqc.math.ntru;

import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSSParameterSet;

/* JADX INFO: loaded from: classes10.dex */
public class HRSSPolynomial extends Polynomial {
    public HRSSPolynomial(NTRUHRSSParameterSet nTRUHRSSParameterSet) {
        super(nTRUHRSSParameterSet);
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void lift(Polynomial polynomial) {
        int length = this.coeffs.length;
        Polynomial polynomialCreatePolynomial = this.params.createPolynomial();
        short s11 = (short) (3 - (length % 3));
        short[] sArr = polynomialCreatePolynomial.coeffs;
        short[] sArr2 = polynomial.coeffs;
        int i11 = 0;
        int i12 = 2 - s11;
        int i13 = sArr2[0] * i12;
        short s12 = sArr2[1];
        short s13 = sArr2[2];
        sArr[0] = (short) (i13 + (s13 * s11));
        sArr[1] = (short) (s12 * i12);
        sArr[2] = (short) (s13 * i12);
        short s14 = 0;
        for (int i14 = 3; i14 < length; i14++) {
            short[] sArr3 = polynomialCreatePolynomial.coeffs;
            short s15 = sArr3[0];
            short[] sArr4 = polynomial.coeffs;
            sArr3[0] = (short) (s15 + (sArr4[i14] * ((s11 * 2) + s14)));
            int i15 = s14 + s11;
            sArr3[1] = (short) (sArr3[1] + (sArr4[i14] * i15));
            sArr3[2] = (short) (sArr3[2] + (sArr4[i14] * s14));
            s14 = (short) (i15 % 3);
        }
        short[] sArr5 = polynomialCreatePolynomial.coeffs;
        short s16 = sArr5[1];
        short[] sArr6 = polynomial.coeffs;
        short s17 = sArr6[0];
        int i16 = s11 + s14;
        sArr5[1] = (short) (s16 + (s17 * i16));
        short s18 = (short) (sArr5[2] + (s17 * s14));
        sArr5[2] = s18;
        sArr5[2] = (short) (s18 + (sArr6[1] * i16));
        for (int i17 = 3; i17 < length; i17++) {
            short[] sArr7 = polynomialCreatePolynomial.coeffs;
            short s19 = sArr7[i17 - 3];
            short[] sArr8 = polynomial.coeffs;
            sArr7[i17] = (short) (s19 + ((sArr8[i17] + sArr8[i17 - 1] + sArr8[i17 - 2]) * 2));
        }
        polynomialCreatePolynomial.mod3PhiN();
        polynomialCreatePolynomial.z3ToZq();
        this.coeffs[0] = (short) (-polynomialCreatePolynomial.coeffs[0]);
        while (i11 < length - 1) {
            short[] sArr9 = this.coeffs;
            int i18 = i11 + 1;
            short[] sArr10 = polynomialCreatePolynomial.coeffs;
            sArr9[i18] = (short) (sArr10[i11] - sArr10[i18]);
            i11 = i18;
        }
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void sqFromBytes(byte[] bArr) {
        int i11 = 0;
        while (i11 < this.params.packDegree() / 8) {
            short[] sArr = this.coeffs;
            int i12 = i11 * 8;
            int i13 = i11 * 13;
            int i14 = bArr[i13] & 255;
            byte b11 = bArr[i13 + 1];
            sArr[i12] = (short) (i14 | ((((short) (b11 & 255)) & 31) << 8));
            int i15 = ((b11 & 255) >>> 5) | (((short) (bArr[i13 + 2] & 255)) << 3);
            byte b12 = bArr[i13 + 3];
            sArr[i12 + 1] = (short) (i15 | ((((short) (b12 & 255)) & 3) << 11));
            int i16 = (b12 & 255) >>> 2;
            byte b13 = bArr[i13 + 4];
            sArr[i12 + 2] = (short) (i16 | ((((short) (b13 & 255)) & 127) << 6));
            int i17 = ((b13 & 255) >>> 7) | (((short) (bArr[i13 + 5] & 255)) << 1);
            byte b14 = bArr[i13 + 6];
            sArr[i12 + 3] = (short) (i17 | ((((short) (b14 & 255)) & 15) << 9));
            int i18 = (((short) (bArr[i13 + 7] & 255)) << 4) | ((b14 & 255) >>> 4);
            byte b15 = bArr[i13 + 8];
            sArr[i12 + 4] = (short) (i18 | ((((short) (b15 & 255)) & 1) << 12));
            int i19 = (b15 & 255) >>> 1;
            byte b16 = bArr[i13 + 9];
            sArr[i12 + 5] = (short) (i19 | ((((short) (b16 & 255)) & 63) << 7));
            int i21 = (((short) (bArr[i13 + 10] & 255)) << 2) | ((b16 & 255) >>> 6);
            byte b17 = bArr[i13 + 11];
            sArr[i12 + 6] = (short) (i21 | ((((short) (b17 & 255)) & 7) << 10));
            sArr[i12 + 7] = (short) (((b17 & 255) >>> 3) | (((short) (bArr[i13 + 12] & 255)) << 5));
            i11++;
        }
        int iPackDegree = this.params.packDegree() & 7;
        if (iPackDegree == 2) {
            short[] sArr2 = this.coeffs;
            int i22 = i11 * 8;
            int i23 = i11 * 13;
            int i24 = bArr[i23] & 255;
            byte b18 = bArr[i23 + 1];
            sArr2[i22] = (short) (i24 | ((((short) (b18 & 255)) & 31) << 8));
            sArr2[i22 + 1] = (short) (((((short) (bArr[i23 + 3] & 255)) & 3) << 11) | ((b18 & 255) >>> 5) | (((short) (bArr[i23 + 2] & 255)) << 3));
        } else if (iPackDegree == 4) {
            short[] sArr3 = this.coeffs;
            int i25 = i11 * 8;
            int i26 = i11 * 13;
            int i27 = bArr[i26] & 255;
            byte b19 = bArr[i26 + 1];
            sArr3[i25] = (short) (i27 | ((((short) (b19 & 255)) & 31) << 8));
            int i28 = ((b19 & 255) >>> 5) | (((short) (bArr[i26 + 2] & 255)) << 3);
            byte b21 = bArr[i26 + 3];
            sArr3[i25 + 1] = (short) (i28 | ((((short) (b21 & 255)) & 3) << 11));
            byte b22 = bArr[i26 + 4];
            sArr3[i25 + 2] = (short) (((b21 & 255) >>> 2) | ((((short) (b22 & 255)) & 127) << 6));
            sArr3[i25 + 3] = (short) (((((short) (bArr[i26 + 6] & 255)) & 15) << 9) | ((b22 & 255) >>> 7) | (((short) (bArr[i26 + 5] & 255)) << 1));
        }
        this.coeffs[this.params.n() - 1] = 0;
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public byte[] sqToBytes(int i11) {
        byte[] bArr = new byte[i11];
        short[] sArr = new short[8];
        int i12 = 0;
        while (i12 < this.params.packDegree() / 8) {
            for (int i13 = 0; i13 < 8; i13++) {
                sArr[i13] = (short) Polynomial.modQ(this.coeffs[(i12 * 8) + i13] & HPKE.aead_EXPORT_ONLY, this.params.q());
            }
            int i14 = i12 * 13;
            short s11 = sArr[0];
            bArr[i14] = (byte) (s11 & 255);
            short s12 = sArr[1];
            bArr[i14 + 1] = (byte) ((s11 >>> 8) | ((s12 & 7) << 5));
            bArr[i14 + 2] = (byte) ((s12 >>> 3) & 255);
            int i15 = s12 >>> 11;
            short s13 = sArr[2];
            bArr[i14 + 3] = (byte) (i15 | ((s13 & 63) << 2));
            short s14 = sArr[3];
            bArr[i14 + 4] = (byte) ((s13 >>> 6) | ((s14 & 1) << 7));
            bArr[i14 + 5] = (byte) ((s14 >>> 1) & 255);
            int i16 = s14 >>> 9;
            short s15 = sArr[4];
            bArr[i14 + 6] = (byte) (i16 | ((s15 & 15) << 4));
            bArr[i14 + 7] = (byte) ((s15 >>> 4) & 255);
            short s16 = sArr[5];
            bArr[i14 + 8] = (byte) ((s15 >>> 12) | ((s16 & 127) << 1));
            int i17 = s16 >>> 7;
            short s17 = sArr[6];
            bArr[i14 + 9] = (byte) (i17 | ((s17 & 3) << 6));
            bArr[i14 + 10] = (byte) ((s17 >>> 2) & 255);
            short s18 = sArr[7];
            bArr[i14 + 11] = (byte) ((s17 >>> 10) | ((s18 & 31) << 3));
            bArr[i14 + 12] = (byte) (s18 >>> 5);
            i12++;
        }
        int i18 = 0;
        while (true) {
            int i19 = i12 * 8;
            if (i18 >= this.params.packDegree() - i19) {
                break;
            }
            sArr[i18] = (short) Polynomial.modQ(this.coeffs[i19 + i18] & HPKE.aead_EXPORT_ONLY, this.params.q());
            i18++;
        }
        while (i18 < 8) {
            sArr[i18] = 0;
            i18++;
        }
        int iPackDegree = this.params.packDegree() - ((this.params.packDegree() / 8) * 8);
        if (iPackDegree != 2) {
            if (iPackDegree != 4) {
                return bArr;
            }
            int i21 = i12 * 13;
            short s19 = sArr[0];
            bArr[i21] = (byte) (s19 & 255);
            short s21 = sArr[1];
            bArr[i21 + 1] = (byte) ((s19 >>> 8) | ((s21 & 7) << 5));
            bArr[i21 + 2] = (byte) ((s21 >>> 3) & 255);
            int i22 = s21 >>> 11;
            short s22 = sArr[2];
            bArr[i21 + 3] = (byte) (i22 | ((s22 & 63) << 2));
            int i23 = s22 >>> 6;
            short s23 = sArr[3];
            bArr[i21 + 4] = (byte) (i23 | ((s23 & 1) << 7));
            bArr[i21 + 5] = (byte) ((s23 >>> 1) & 255);
            bArr[i21 + 6] = (byte) ((s23 >>> 9) | ((sArr[4] & 15) << 4));
        }
        int i24 = i12 * 13;
        short s24 = sArr[0];
        bArr[i24] = (byte) (s24 & 255);
        int i25 = s24 >>> 8;
        short s25 = sArr[1];
        bArr[i24 + 1] = (byte) (i25 | ((s25 & 7) << 5));
        bArr[i24 + 2] = (byte) ((s25 >>> 3) & 255);
        bArr[i24 + 3] = (byte) ((s25 >>> 11) | ((sArr[2] & 63) << 2));
        return bArr;
    }
}
