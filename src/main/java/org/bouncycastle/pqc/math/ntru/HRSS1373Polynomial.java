package org.bouncycastle.pqc.math.ntru;

import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSSParameterSet;

/* JADX INFO: loaded from: classes10.dex */
public class HRSS1373Polynomial extends HRSSPolynomial {
    private static final int K = 86;
    private static final int L = 1376;
    private static final int M = 344;

    public HRSS1373Polynomial(NTRUHRSSParameterSet nTRUHRSSParameterSet) {
        super(nTRUHRSSParameterSet);
    }

    @Override // org.bouncycastle.pqc.math.ntru.HRSSPolynomial, org.bouncycastle.pqc.math.ntru.Polynomial
    public void sqFromBytes(byte[] bArr) {
        int i11 = 0;
        while (i11 < this.params.packDegree() / 4) {
            short[] sArr = this.coeffs;
            int i12 = i11 * 4;
            int i13 = i11 * 7;
            int i14 = bArr[i13] & 255;
            byte b11 = bArr[i13 + 1];
            sArr[i12] = (short) (i14 | ((((short) (b11 & 255)) & 63) << 8));
            int i15 = ((b11 & 255) >>> 6) | (((short) (bArr[i13 + 2] & 255)) << 2);
            byte b12 = bArr[i13 + 3];
            sArr[i12 + 1] = (short) (i15 | (((short) (b12 & 15)) << 10));
            int i16 = ((b12 & 255) >>> 4) | ((((short) (bArr[i13 + 4] & 255)) & 255) << 4);
            byte b13 = bArr[i13 + 5];
            sArr[i12 + 2] = (short) (i16 | (((short) (b13 & 3)) << 12));
            sArr[i12 + 3] = (short) (((b13 & 255) >>> 2) | (((short) (bArr[i13 + 6] & 255)) << 6));
            i11++;
        }
        if (this.params.packDegree() % 4 == 2) {
            short[] sArr2 = this.coeffs;
            int i17 = i11 * 4;
            int i18 = i11 * 7;
            byte b14 = bArr[i18];
            byte b15 = bArr[i18 + 1];
            sArr2[i17] = (short) (b14 | ((b15 & 63) << 8));
            sArr2[i17 + 1] = (short) (((bArr[i18 + 3] & 15) << 10) | (bArr[i18 + 2] << 2) | (b15 >>> 6));
        }
        this.coeffs[this.params.n() - 1] = 0;
    }

    @Override // org.bouncycastle.pqc.math.ntru.HRSSPolynomial, org.bouncycastle.pqc.math.ntru.Polynomial
    public byte[] sqToBytes(int i11) {
        byte[] bArr = new byte[i11];
        short[] sArr = new short[4];
        int i12 = 0;
        while (i12 < this.params.packDegree() / 4) {
            for (int i13 = 0; i13 < 4; i13++) {
                sArr[i13] = (short) Polynomial.modQ(this.coeffs[(i12 * 4) + i13] & HPKE.aead_EXPORT_ONLY, this.params.q());
            }
            int i14 = i12 * 7;
            short s11 = sArr[0];
            bArr[i14] = (byte) (s11 & 255);
            short s12 = sArr[1];
            bArr[i14 + 1] = (byte) ((s11 >>> 8) | ((s12 & 3) << 6));
            bArr[i14 + 2] = (byte) ((s12 >>> 2) & 255);
            short s13 = sArr[2];
            bArr[i14 + 3] = (byte) ((s12 >>> 10) | ((s13 & 15) << 4));
            bArr[i14 + 4] = (byte) ((s13 >>> 4) & 255);
            short s14 = sArr[3];
            bArr[i14 + 5] = (byte) ((s13 >>> 12) | ((s14 & 63) << 2));
            bArr[i14 + 6] = (byte) (s14 >>> 6);
            i12++;
        }
        if (this.params.packDegree() % 4 == 2) {
            sArr[0] = (short) Polynomial.modQ(this.coeffs[this.params.packDegree() - 2] & HPKE.aead_EXPORT_ONLY, this.params.q());
            short sModQ = (short) Polynomial.modQ(this.coeffs[this.params.packDegree() - 1] & HPKE.aead_EXPORT_ONLY, this.params.q());
            sArr[1] = sModQ;
            int i15 = i12 * 7;
            short s15 = sArr[0];
            bArr[i15] = (byte) (s15 & 255);
            bArr[i15 + 1] = (byte) ((s15 >>> 8) | ((sModQ & 3) << 6));
            bArr[i15 + 2] = (byte) ((sModQ >>> 2) & 255);
            bArr[i15 + 3] = (byte) (sModQ >>> 10);
        }
        return bArr;
    }
}
