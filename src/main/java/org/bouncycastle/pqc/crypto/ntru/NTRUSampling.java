package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.math.ntru.HPSPolynomial;
import org.bouncycastle.pqc.math.ntru.HRSSPolynomial;
import org.bouncycastle.pqc.math.ntru.Polynomial;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
class NTRUSampling {
    private final NTRUParameterSet params;

    public NTRUSampling(NTRUParameterSet nTRUParameterSet) {
        this.params = nTRUParameterSet;
    }

    private static int mod3(int i11) {
        return i11 % 3;
    }

    public PolynomialPair sampleFg(byte[] bArr) {
        NTRUParameterSet nTRUParameterSet = this.params;
        if (nTRUParameterSet instanceof NTRUHRSSParameterSet) {
            return new PolynomialPair(sampleIidPlus(Arrays.copyOfRange(bArr, 0, nTRUParameterSet.sampleIidBytes())), sampleIidPlus(Arrays.copyOfRange(bArr, this.params.sampleIidBytes(), bArr.length)));
        }
        if (nTRUParameterSet instanceof NTRUHPSParameterSet) {
            return new PolynomialPair((HPSPolynomial) sampleIid(Arrays.copyOfRange(bArr, 0, nTRUParameterSet.sampleIidBytes())), sampleFixedType(Arrays.copyOfRange(bArr, this.params.sampleIidBytes(), bArr.length)));
        }
        throw new IllegalArgumentException("Invalid polynomial type");
    }

    public HPSPolynomial sampleFixedType(byte[] bArr) {
        int i11;
        int i12;
        int iN = this.params.n();
        int iWeight = ((NTRUHPSParameterSet) this.params).weight();
        HPSPolynomial hPSPolynomial = new HPSPolynomial((NTRUHPSParameterSet) this.params);
        int i13 = iN - 1;
        int[] iArr = new int[i13];
        int i14 = 0;
        while (true) {
            i11 = i13 / 4;
            if (i14 >= i11) {
                break;
            }
            int i15 = i14 * 4;
            int i16 = i14 * 15;
            iArr[i15] = ((bArr[i16] & 255) << 2) + ((bArr[i16 + 1] & 255) << 10) + ((bArr[i16 + 2] & 255) << 18) + ((bArr[i16 + 3] & 255) << 26);
            iArr[i15 + 1] = ((bArr[(i14 * 3) + 15] & 192) >> 4) + ((bArr[i16 + 4] & 255) << 4) + ((bArr[i16 + 5] & 255) << 12) + ((bArr[i16 + 6] & 255) << 20) + ((bArr[i16 + 7] & 255) << 28);
            int i17 = ((bArr[(i14 * 7) + 15] & 240) >> 2) + ((bArr[i16 + 8] & 255) << 6) + ((bArr[i16 + 9] & 255) << 14) + ((bArr[i16 + 10] & 255) << 22);
            byte b11 = bArr[i16 + 11];
            iArr[i15 + 2] = i17 + ((b11 & 255) << 30);
            iArr[i15 + 3] = (b11 & 252) + ((bArr[i16 + 12] & 255) << 8) + ((bArr[i16 + 13] & 255) << 16) + ((bArr[i16 + 14] & 255) << 24);
            i14++;
        }
        int i18 = i11 * 4;
        if (i13 > i18) {
            int i19 = i11 * 15;
            iArr[i18] = ((bArr[i19] & 255) << 2) + ((bArr[i19 + 1] & 255) << 10) + ((bArr[i19 + 2] & 255) << 18) + ((bArr[i19 + 3] & 255) << 26);
            iArr[i18 + 1] = ((bArr[(i11 * 3) + 15] & 192) >> 4) + ((bArr[i19 + 4] & 255) << 4) + ((bArr[i19 + 5] & 255) << 12) + ((bArr[i19 + 6] & 255) << 20) + ((bArr[i19 + 7] & 255) << 28);
        }
        int i21 = 0;
        while (true) {
            i12 = iWeight / 2;
            if (i21 >= i12) {
                break;
            }
            iArr[i21] = iArr[i21] | 1;
            i21++;
        }
        while (i12 < iWeight) {
            iArr[i12] = iArr[i12] | 2;
            i12++;
        }
        java.util.Arrays.sort(iArr);
        for (int i22 = 0; i22 < i13; i22++) {
            hPSPolynomial.coeffs[i22] = (short) (iArr[i22] & 3);
        }
        hPSPolynomial.coeffs[i13] = 0;
        return hPSPolynomial;
    }

    public Polynomial sampleIid(byte[] bArr) {
        Polynomial polynomialCreatePolynomial = this.params.createPolynomial();
        for (int i11 = 0; i11 < this.params.n() - 1; i11++) {
            polynomialCreatePolynomial.coeffs[i11] = (short) mod3(bArr[i11] & 255);
        }
        polynomialCreatePolynomial.coeffs[this.params.n() - 1] = 0;
        return polynomialCreatePolynomial;
    }

    public HRSSPolynomial sampleIidPlus(byte[] bArr) {
        int i11;
        int iN = this.params.n();
        HRSSPolynomial hRSSPolynomial = (HRSSPolynomial) sampleIid(bArr);
        int i12 = 0;
        while (true) {
            i11 = iN - 1;
            if (i12 >= i11) {
                break;
            }
            short[] sArr = hRSSPolynomial.coeffs;
            short s11 = sArr[i12];
            sArr[i12] = (short) (s11 | (-(s11 >>> 1)));
            i12++;
        }
        int i13 = 0;
        short s12 = 0;
        while (i13 < i11) {
            short[] sArr2 = hRSSPolynomial.coeffs;
            int i14 = i13 + 1;
            s12 = (short) (s12 + ((short) (sArr2[i14] * sArr2[i13])));
            i13 = i14;
        }
        short s13 = (short) ((-((s12 & HPKE.aead_EXPORT_ONLY) >>> 15)) | 1);
        for (int i15 = 0; i15 < i11; i15 += 2) {
            short[] sArr3 = hRSSPolynomial.coeffs;
            sArr3[i15] = (short) (sArr3[i15] * s13);
        }
        for (int i16 = 0; i16 < i11; i16++) {
            short[] sArr4 = hRSSPolynomial.coeffs;
            short s14 = sArr4[i16];
            sArr4[i16] = (short) ((((s14 & HPKE.aead_EXPORT_ONLY) >>> 15) ^ (s14 & HPKE.aead_EXPORT_ONLY)) & 3);
        }
        return hRSSPolynomial;
    }

    public PolynomialPair sampleRm(byte[] bArr) {
        NTRUParameterSet nTRUParameterSet = this.params;
        if (nTRUParameterSet instanceof NTRUHRSSParameterSet) {
            return new PolynomialPair((HRSSPolynomial) sampleIid(Arrays.copyOfRange(bArr, 0, nTRUParameterSet.sampleIidBytes())), (HRSSPolynomial) sampleIid(Arrays.copyOfRange(bArr, this.params.sampleIidBytes(), bArr.length)));
        }
        if (nTRUParameterSet instanceof NTRUHPSParameterSet) {
            return new PolynomialPair((HPSPolynomial) sampleIid(Arrays.copyOfRange(bArr, 0, nTRUParameterSet.sampleIidBytes())), sampleFixedType(Arrays.copyOfRange(bArr, this.params.sampleIidBytes(), bArr.length)));
        }
        throw new IllegalArgumentException("Invalid polynomial type");
    }
}
