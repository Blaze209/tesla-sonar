package org.bouncycastle.pqc.math.ntru;

import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPSParameterSet;

/* JADX INFO: loaded from: classes10.dex */
public class HPSPolynomial extends Polynomial {
    public HPSPolynomial(NTRUHPSParameterSet nTRUHPSParameterSet) {
        super(nTRUHPSParameterSet);
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void lift(Polynomial polynomial) {
        short[] sArr = this.coeffs;
        System.arraycopy(polynomial.coeffs, 0, sArr, 0, sArr.length);
        z3ToZq();
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void sqFromBytes(byte[] bArr) {
        int length = this.coeffs.length;
        int i11 = 0;
        while (i11 < this.params.packDegree() / 8) {
            short[] sArr = this.coeffs;
            int i12 = i11 * 8;
            int i13 = i11 * 11;
            int i14 = bArr[i13] & 255;
            byte b11 = bArr[i13 + 1];
            sArr[i12] = (short) (i14 | ((((short) (b11 & 255)) & 7) << 8));
            byte b12 = bArr[i13 + 2];
            sArr[i12 + 1] = (short) (((b11 & 255) >>> 3) | ((((short) (b12 & 255)) & 63) << 5));
            int i15 = ((b12 & 255) >>> 6) | ((((short) (bArr[i13 + 3] & 255)) & 255) << 2);
            byte b13 = bArr[i13 + 4];
            sArr[i12 + 2] = (short) (i15 | ((((short) (b13 & 255)) & 1) << 10));
            int i16 = (b13 & 255) >>> 1;
            byte b14 = bArr[i13 + 5];
            sArr[i12 + 3] = (short) (i16 | ((((short) (b14 & 255)) & 15) << 7));
            int i17 = (b14 & 255) >>> 4;
            byte b15 = bArr[i13 + 6];
            sArr[i12 + 4] = (short) (((((short) (b15 & 255)) & 127) << 4) | i17);
            int i18 = ((b15 & 255) >>> 7) | ((((short) (bArr[i13 + 7] & 255)) & 255) << 1);
            byte b16 = bArr[i13 + 8];
            sArr[i12 + 5] = (short) (i18 | ((((short) (b16 & 255)) & 3) << 9));
            byte b17 = bArr[i13 + 9];
            sArr[i12 + 6] = (short) (((b16 & 255) >>> 2) | ((((short) (b17 & 255)) & 31) << 6));
            sArr[i12 + 7] = (short) (((b17 & 255) >>> 5) | ((((short) (bArr[i13 + 10] & 255)) & 255) << 3));
            i11++;
        }
        int iPackDegree = this.params.packDegree() & 7;
        if (iPackDegree == 2) {
            short[] sArr2 = this.coeffs;
            int i19 = i11 * 8;
            int i21 = i11 * 11;
            int i22 = bArr[i21] & 255;
            byte b18 = bArr[i21 + 1];
            sArr2[i19] = (short) (i22 | ((((short) (b18 & 255)) & 7) << 8));
            sArr2[i19 + 1] = (short) (((((short) (bArr[i21 + 2] & 255)) & 63) << 5) | ((b18 & 255) >>> 3));
        } else if (iPackDegree == 4) {
            short[] sArr3 = this.coeffs;
            int i23 = i11 * 8;
            int i24 = i11 * 11;
            int i25 = bArr[i24] & 255;
            byte b19 = bArr[i24 + 1];
            sArr3[i23] = (short) (i25 | ((((short) (b19 & 255)) & 7) << 8));
            byte b21 = bArr[i24 + 2];
            sArr3[i23 + 1] = (short) (((b19 & 255) >>> 3) | ((((short) (b21 & 255)) & 63) << 5));
            int i26 = ((((short) (bArr[i24 + 3] & 255)) & 255) << 2) | ((b21 & 255) >>> 6);
            byte b22 = bArr[i24 + 4];
            sArr3[i23 + 2] = (short) (i26 | ((((short) (b22 & 255)) & 1) << 10));
            sArr3[i23 + 3] = (short) (((((short) (bArr[i24 + 5] & 255)) & 15) << 7) | ((b22 & 255) >>> 1));
        }
        this.coeffs[length - 1] = 0;
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
            int i14 = i12 * 11;
            short s11 = sArr[0];
            bArr[i14] = (byte) (s11 & 255);
            short s12 = sArr[1];
            bArr[i14 + 1] = (byte) ((s11 >>> 8) | ((s12 & 31) << 3));
            int i15 = s12 >>> 5;
            short s13 = sArr[2];
            bArr[i14 + 2] = (byte) (i15 | ((s13 & 3) << 6));
            bArr[i14 + 3] = (byte) ((s13 >>> 2) & 255);
            int i16 = s13 >>> 10;
            short s14 = sArr[3];
            bArr[i14 + 4] = (byte) (i16 | ((s14 & 127) << 1));
            short s15 = sArr[4];
            bArr[i14 + 5] = (byte) ((s14 >>> 7) | ((s15 & 15) << 4));
            short s16 = sArr[5];
            bArr[i14 + 6] = (byte) ((s15 >>> 4) | ((s16 & 1) << 7));
            bArr[i14 + 7] = (byte) ((s16 >>> 1) & 255);
            int i17 = s16 >>> 9;
            short s17 = sArr[6];
            bArr[i14 + 8] = (byte) (i17 | ((s17 & 63) << 2));
            short s18 = sArr[7];
            bArr[i14 + 9] = (byte) ((s17 >>> 6) | ((s18 & 7) << 5));
            bArr[i14 + 10] = (byte) (s18 >>> 3);
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
        int iPackDegree = this.params.packDegree() & 7;
        if (iPackDegree == 2) {
            int i21 = i12 * 11;
            short s19 = sArr[0];
            bArr[i21] = (byte) (s19 & 255);
            int i22 = s19 >>> 8;
            short s21 = sArr[1];
            bArr[i21 + 1] = (byte) (i22 | ((s21 & 31) << 3));
            bArr[i21 + 2] = (byte) ((s21 >>> 5) | ((sArr[2] & 3) << 6));
            return bArr;
        }
        if (iPackDegree != 4) {
            return bArr;
        }
        int i23 = i12 * 11;
        short s22 = sArr[0];
        bArr[i23] = (byte) (s22 & 255);
        int i24 = s22 >>> 8;
        short s23 = sArr[1];
        bArr[i23 + 1] = (byte) (i24 | ((s23 & 31) << 3));
        short s24 = sArr[2];
        bArr[i23 + 2] = (byte) ((s23 >>> 5) | ((s24 & 3) << 6));
        bArr[i23 + 3] = (byte) ((s24 >>> 2) & 255);
        int i25 = s24 >>> 10;
        short s25 = sArr[3];
        bArr[i23 + 4] = (byte) (i25 | ((s25 & 127) << 1));
        bArr[i23 + 5] = (byte) ((s25 >>> 7) | ((sArr[4] & 15) << 4));
        return bArr;
    }
}
