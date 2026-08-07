package org.bouncycastle.pqc.math.ntru;

import com.plaid.internal.EnumC4419g;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Polynomial {
    public short[] coeffs;
    protected NTRUParameterSet params;

    public Polynomial(NTRUParameterSet nTRUParameterSet) {
        this.coeffs = new short[nTRUParameterSet.n()];
        this.params = nTRUParameterSet;
    }

    static short bothNegativeMask(short s11, short s12) {
        return (short) ((s11 & s12) >>> 15);
    }

    static byte mod3(byte b11) {
        return (byte) ((b11 & 255) % 3);
    }

    static int modQ(int i11, int i12) {
        return i11 % i12;
    }

    private void r2InvToRqInv(Polynomial polynomial, Polynomial polynomial2, Polynomial polynomial3, Polynomial polynomial4, Polynomial polynomial5) {
        int length = this.coeffs.length;
        for (int i11 = 0; i11 < length; i11++) {
            polynomial3.coeffs[i11] = (short) (-polynomial2.coeffs[i11]);
        }
        for (int i12 = 0; i12 < length; i12++) {
            this.coeffs[i12] = polynomial.coeffs[i12];
        }
        polynomial4.rqMul(this, polynomial3);
        short[] sArr = polynomial4.coeffs;
        sArr[0] = (short) (sArr[0] + 2);
        polynomial5.rqMul(polynomial4, this);
        polynomial4.rqMul(polynomial5, polynomial3);
        short[] sArr2 = polynomial4.coeffs;
        sArr2[0] = (short) (sArr2[0] + 2);
        rqMul(polynomial4, polynomial5);
        polynomial4.rqMul(this, polynomial3);
        short[] sArr3 = polynomial4.coeffs;
        sArr3[0] = (short) (sArr3[0] + 2);
        polynomial5.rqMul(polynomial4, this);
        polynomial4.rqMul(polynomial5, polynomial3);
        short[] sArr4 = polynomial4.coeffs;
        sArr4[0] = (short) (sArr4[0] + 2);
        rqMul(polynomial4, polynomial5);
    }

    public abstract void lift(Polynomial polynomial);

    public void mod3PhiN() {
        int iN = this.params.n();
        for (int i11 = 0; i11 < iN; i11++) {
            short[] sArr = this.coeffs;
            sArr[i11] = mod3((short) (sArr[i11] + (sArr[iN - 1] * 2)));
        }
    }

    public void modQPhiN() {
        int iN = this.params.n();
        for (int i11 = 0; i11 < iN; i11++) {
            short[] sArr = this.coeffs;
            sArr[i11] = (short) (sArr[i11] - sArr[iN - 1]);
        }
    }

    public void r2Inv(Polynomial polynomial) {
        r2Inv(polynomial, this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial());
    }

    public void rqInv(Polynomial polynomial) {
        rqInv(polynomial, this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial());
    }

    public void rqMul(Polynomial polynomial, Polynomial polynomial2) {
        int i11;
        int length = this.coeffs.length;
        int i12 = 0;
        while (i12 < length) {
            this.coeffs[i12] = 0;
            for (int i13 = 1; i13 < length - i12; i13++) {
                short[] sArr = this.coeffs;
                sArr[i12] = (short) (sArr[i12] + (polynomial.coeffs[i12 + i13] * polynomial2.coeffs[length - i13]));
            }
            int i14 = 0;
            while (true) {
                i11 = i12 + 1;
                if (i14 < i11) {
                    short[] sArr2 = this.coeffs;
                    sArr2[i12] = (short) (sArr2[i12] + (polynomial.coeffs[i12 - i14] * polynomial2.coeffs[i14]));
                    i14++;
                }
            }
            i12 = i11;
        }
    }

    public void rqSumZeroFromBytes(byte[] bArr) {
        int length = this.coeffs.length;
        sqFromBytes(bArr);
        int i11 = length - 1;
        this.coeffs[i11] = 0;
        for (int i12 = 0; i12 < this.params.packDegree(); i12++) {
            short[] sArr = this.coeffs;
            sArr[i11] = (short) (sArr[i11] - sArr[i12]);
        }
    }

    public byte[] rqSumZeroToBytes(int i11) {
        return sqToBytes(i11);
    }

    public void rqToS3(Polynomial polynomial) {
        int length = this.coeffs.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.coeffs[i11] = (short) modQ(polynomial.coeffs[i11] & HPKE.aead_EXPORT_ONLY, this.params.q());
            short sLogQ = (short) (this.coeffs[i11] >>> (this.params.logQ() - 1));
            short[] sArr = this.coeffs;
            sArr[i11] = (short) (sArr[i11] + (sLogQ << (1 - (this.params.logQ() & 1))));
        }
        mod3PhiN();
    }

    public void s3FromBytes(byte[] bArr) {
        int length = this.coeffs.length;
        for (int i11 = 0; i11 < this.params.packDegree() / 5; i11++) {
            byte b11 = bArr[i11];
            short[] sArr = this.coeffs;
            int i12 = i11 * 5;
            sArr[i12] = b11;
            int i13 = b11 & 255;
            sArr[i12 + 1] = (short) ((i13 * 171) >>> 9);
            sArr[i12 + 2] = (short) ((i13 * 57) >>> 9);
            sArr[i12 + 3] = (short) ((i13 * 19) >>> 9);
            sArr[i12 + 4] = (short) ((i13 * EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE) >>> 14);
        }
        if (this.params.packDegree() > (this.params.packDegree() / 5) * 5) {
            int iPackDegree = this.params.packDegree() / 5;
            byte b12 = bArr[iPackDegree];
            int i14 = 0;
            while (true) {
                int i15 = (iPackDegree * 5) + i14;
                if (i15 >= this.params.packDegree()) {
                    break;
                }
                this.coeffs[i15] = b12;
                b12 = (byte) (((b12 & 255) * 171) >> 9);
                i14++;
            }
        }
        this.coeffs[length - 1] = 0;
        mod3PhiN();
    }

    public void s3Inv(Polynomial polynomial) {
        s3Inv(polynomial, this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial());
    }

    public void s3Mul(Polynomial polynomial, Polynomial polynomial2) {
        rqMul(polynomial, polynomial2);
        mod3PhiN();
    }

    public byte[] s3ToBytes(int i11) {
        byte[] bArr = new byte[i11];
        byte b11 = 0;
        for (int i12 = 0; i12 < this.params.packDegree() / 5; i12++) {
            short[] sArr = this.coeffs;
            int i13 = i12 * 5;
            bArr[i12] = (byte) (((((byte) (((((byte) (((((byte) (((((byte) (sArr[i13 + 4] & 255)) * 3) + sArr[i13 + 3]) & 255)) * 3) + sArr[i13 + 2]) & 255)) * 3) + sArr[i13 + 1]) & 255)) * 3) + sArr[i13]) & 255);
        }
        if (this.params.packDegree() > (this.params.packDegree() / 5) * 5) {
            int iPackDegree = this.params.packDegree() / 5;
            int i14 = iPackDegree * 5;
            for (int iPackDegree2 = (this.params.packDegree() - i14) - 1; iPackDegree2 >= 0; iPackDegree2--) {
                b11 = (byte) (((b11 * 3) + this.coeffs[i14 + iPackDegree2]) & 255);
            }
            bArr[iPackDegree] = b11;
        }
        return bArr;
    }

    public abstract void sqFromBytes(byte[] bArr);

    public void sqMul(Polynomial polynomial, Polynomial polynomial2) {
        rqMul(polynomial, polynomial2);
        modQPhiN();
    }

    public abstract byte[] sqToBytes(int i11);

    public void trinaryZqToZ3() {
        int length = this.coeffs.length;
        for (int i11 = 0; i11 < length; i11++) {
            short[] sArr = this.coeffs;
            sArr[i11] = (short) modQ(sArr[i11] & HPKE.aead_EXPORT_ONLY, this.params.q());
            short[] sArr2 = this.coeffs;
            short s11 = sArr2[i11];
            sArr2[i11] = (short) ((s11 ^ (s11 >>> (this.params.logQ() - 1))) & 3);
        }
    }

    public void z3ToZq() {
        int length = this.coeffs.length;
        for (int i11 = 0; i11 < length; i11++) {
            short[] sArr = this.coeffs;
            short s11 = sArr[i11];
            sArr[i11] = (short) (s11 | ((-(s11 >>> 1)) & (this.params.q() - 1)));
        }
    }

    static short mod3(short s11) {
        return (short) ((s11 & HPKE.aead_EXPORT_ONLY) % 3);
    }

    void r2Inv(Polynomial polynomial, Polynomial polynomial2, Polynomial polynomial3, Polynomial polynomial4, Polynomial polynomial5) {
        int i11;
        int length = this.coeffs.length;
        short s11 = 0;
        polynomial5.coeffs[0] = 1;
        for (int i12 = 0; i12 < length; i12++) {
            polynomial2.coeffs[i12] = 1;
        }
        int i13 = 0;
        while (true) {
            i11 = length - 1;
            if (i13 >= i11) {
                break;
            }
            short[] sArr = polynomial.coeffs;
            polynomial3.coeffs[(length - 2) - i13] = (short) ((sArr[i11] ^ sArr[i13]) & 1);
            i13++;
        }
        polynomial3.coeffs[i11] = 0;
        int i14 = 0;
        short s12 = 1;
        for (short s13 = 1; i14 < (i11 * 2) - s13; s13 = 1) {
            for (int i15 = i11; i15 > 0; i15--) {
                short[] sArr2 = polynomial4.coeffs;
                sArr2[i15] = sArr2[i15 - 1];
            }
            polynomial4.coeffs[s11] = s11;
            short s14 = polynomial3.coeffs[s11];
            short s15 = (short) (polynomial2.coeffs[s11] & s14);
            int i16 = -s12;
            short sBothNegativeMask = bothNegativeMask((short) i16, (short) (-s14));
            s12 = (short) (((short) (s12 ^ ((i16 ^ s12) & sBothNegativeMask))) + s13);
            int i17 = s11;
            short s16 = s11;
            while (i17 < length) {
                short[] sArr3 = polynomial2.coeffs;
                short s17 = sArr3[i17];
                short s18 = s16;
                short[] sArr4 = polynomial3.coeffs;
                short s19 = (short) (sBothNegativeMask & (s17 ^ sArr4[i17]));
                sArr3[i17] = (short) (s17 ^ s19);
                sArr4[i17] = (short) (s19 ^ sArr4[i17]);
                short[] sArr5 = polynomial4.coeffs;
                short s21 = sArr5[i17];
                short[] sArr6 = polynomial5.coeffs;
                short s22 = (short) ((sArr6[i17] ^ s21) & sBothNegativeMask);
                sArr5[i17] = (short) (s21 ^ s22);
                sArr6[i17] = (short) (sArr6[i17] ^ s22);
                i17++;
                s16 = s18 == true ? 1 : 0;
            }
            short s23 = s16;
            for (int i18 = s16; i18 < length; i18++) {
                short[] sArr7 = polynomial3.coeffs;
                sArr7[i18] = (short) (sArr7[i18] ^ (polynomial2.coeffs[i18] & s15));
            }
            for (int i19 = s23; i19 < length; i19++) {
                short[] sArr8 = polynomial5.coeffs;
                sArr8[i19] = (short) (sArr8[i19] ^ (polynomial4.coeffs[i19] & s15));
            }
            int i21 = s23;
            while (i21 < i11) {
                short[] sArr9 = polynomial3.coeffs;
                int i22 = i21 + 1;
                sArr9[i21] = sArr9[i22];
                i21 = i22;
            }
            polynomial3.coeffs[i11] = s23;
            i14++;
            s11 = s23;
        }
        short s24 = s11;
        for (int i23 = s24; i23 < i11; i23++) {
            this.coeffs[i23] = polynomial4.coeffs[(length - 2) - i23];
        }
        this.coeffs[i11] = s24;
    }

    void rqInv(Polynomial polynomial, Polynomial polynomial2, Polynomial polynomial3, Polynomial polynomial4, Polynomial polynomial5) {
        polynomial2.r2Inv(polynomial);
        r2InvToRqInv(polynomial2, polynomial, polynomial3, polynomial4, polynomial5);
    }

    void s3Inv(Polynomial polynomial, Polynomial polynomial2, Polynomial polynomial3, Polynomial polynomial4, Polynomial polynomial5) {
        int i11;
        int length = this.coeffs.length;
        short s11 = 0;
        polynomial5.coeffs[0] = 1;
        for (int i12 = 0; i12 < length; i12++) {
            polynomial2.coeffs[i12] = 1;
        }
        int i13 = 0;
        while (true) {
            i11 = length - 1;
            if (i13 >= i11) {
                break;
            }
            short[] sArr = polynomial.coeffs;
            polynomial3.coeffs[(length - 2) - i13] = mod3((short) ((sArr[i13] & 3) + ((sArr[i11] & 3) * 2)));
            i13++;
        }
        polynomial3.coeffs[i11] = 0;
        int i14 = 0;
        short s12 = 1;
        for (short s13 = 1; i14 < (i11 * 2) - s13; s13 = 1) {
            for (int i15 = i11; i15 > 0; i15--) {
                short[] sArr2 = polynomial4.coeffs;
                sArr2[i15] = sArr2[i15 - 1];
            }
            polynomial4.coeffs[s11] = s11;
            short sMod3 = mod3((byte) (polynomial3.coeffs[s11] * 2 * polynomial2.coeffs[s11]));
            int i16 = -s12;
            short sBothNegativeMask = bothNegativeMask((short) i16, (short) (-polynomial3.coeffs[s11]));
            s12 = (short) (((short) (s12 ^ ((i16 ^ s12) & sBothNegativeMask))) + s13);
            int i17 = s11;
            short s14 = s11;
            while (i17 < length) {
                short[] sArr3 = polynomial2.coeffs;
                short s15 = sArr3[i17];
                short s16 = s14;
                short[] sArr4 = polynomial3.coeffs;
                short s17 = (short) (sBothNegativeMask & (s15 ^ sArr4[i17]));
                sArr3[i17] = (short) (s15 ^ s17);
                sArr4[i17] = (short) (s17 ^ sArr4[i17]);
                short[] sArr5 = polynomial4.coeffs;
                short s18 = sArr5[i17];
                short[] sArr6 = polynomial5.coeffs;
                short s19 = (short) ((sArr6[i17] ^ s18) & sBothNegativeMask);
                sArr5[i17] = (short) (s18 ^ s19);
                sArr6[i17] = (short) (sArr6[i17] ^ s19);
                i17++;
                s14 = s16 == true ? 1 : 0;
            }
            short s21 = s14;
            for (int i18 = s14; i18 < length; i18++) {
                short[] sArr7 = polynomial3.coeffs;
                sArr7[i18] = mod3((byte) (sArr7[i18] + (polynomial2.coeffs[i18] * sMod3)));
            }
            for (int i19 = s21; i19 < length; i19++) {
                short[] sArr8 = polynomial5.coeffs;
                sArr8[i19] = mod3((byte) (sArr8[i19] + (polynomial4.coeffs[i19] * sMod3)));
            }
            int i21 = s21;
            while (i21 < i11) {
                short[] sArr9 = polynomial3.coeffs;
                int i22 = i21 + 1;
                sArr9[i21] = sArr9[i22];
                i21 = i22;
            }
            polynomial3.coeffs[i11] = s21;
            i14++;
            s11 = s21;
        }
        short s22 = s11;
        short s23 = polynomial2.coeffs[s22];
        for (int i23 = s22; i23 < i11; i23++) {
            this.coeffs[i23] = mod3((byte) (polynomial4.coeffs[(length - 2) - i23] * s23));
        }
        this.coeffs[i11] = s22;
    }
}
