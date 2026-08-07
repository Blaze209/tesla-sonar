package org.bouncycastle.pqc.crypto.crystals.kyber;

import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes10.dex */
class Poly {
    private KyberEngine engine;
    private int eta1;
    private int polyCompressedBytes;
    private Symmetric symmetric;
    private short[] coeffs = new short[256];
    private int eta2 = KyberEngine.getKyberEta2();

    public Poly(KyberEngine kyberEngine) {
        this.engine = kyberEngine;
        this.polyCompressedBytes = kyberEngine.getKyberPolyCompressedBytes();
        this.eta1 = kyberEngine.getKyberEta1();
        this.symmetric = kyberEngine.getSymmetric();
    }

    public static void baseMultMontgomery(Poly poly, Poly poly2, Poly poly3) {
        for (int i11 = 0; i11 < 64; i11++) {
            int i12 = i11 * 4;
            short coeffIndex = poly2.getCoeffIndex(i12);
            int i13 = i12 + 1;
            short coeffIndex2 = poly2.getCoeffIndex(i13);
            short coeffIndex3 = poly3.getCoeffIndex(i12);
            short coeffIndex4 = poly3.getCoeffIndex(i13);
            short[] sArr = Ntt.nttZetas;
            int i14 = i11 + 64;
            Ntt.baseMult(poly, i12, coeffIndex, coeffIndex2, coeffIndex3, coeffIndex4, sArr[i14]);
            int i15 = i12 + 2;
            int i16 = i12 + 3;
            Ntt.baseMult(poly, i15, poly2.getCoeffIndex(i15), poly2.getCoeffIndex(i16), poly3.getCoeffIndex(i15), poly3.getCoeffIndex(i16), (short) (sArr[i14] * (-1)));
        }
    }

    public void addCoeffs(Poly poly) {
        for (int i11 = 0; i11 < 256; i11++) {
            setCoeffIndex(i11, (short) (getCoeffIndex(i11) + poly.getCoeffIndex(i11)));
        }
    }

    public byte[] compressPoly() {
        byte[] bArr = new byte[8];
        byte[] bArr2 = new byte[this.polyCompressedBytes];
        conditionalSubQ();
        int i11 = this.polyCompressedBytes;
        if (i11 == 128) {
            int i12 = 0;
            for (int i13 = 0; i13 < 32; i13++) {
                for (int i14 = 0; i14 < 8; i14++) {
                    bArr[i14] = (byte) (((((getCoeffIndex((i13 * 8) + i14) << 4) + 1665) * 80635) >> 28) & 15);
                }
                bArr2[i12] = (byte) (bArr[0] | (bArr[1] << 4));
                bArr2[i12 + 1] = (byte) (bArr[2] | (bArr[3] << 4));
                bArr2[i12 + 2] = (byte) (bArr[4] | (bArr[5] << 4));
                bArr2[i12 + 3] = (byte) (bArr[6] | (bArr[7] << 4));
                i12 += 4;
            }
        } else {
            if (i11 != 160) {
                throw new RuntimeException("PolyCompressedBytes is neither 128 or 160!");
            }
            int i15 = 0;
            for (int i16 = 0; i16 < 32; i16++) {
                for (int i17 = 0; i17 < 8; i17++) {
                    bArr[i17] = (byte) (((((getCoeffIndex((i16 * 8) + i17) << 5) + 1664) * 40318) >> 27) & 31);
                }
                bArr2[i15] = (byte) (bArr[0] | (bArr[1] << 5));
                bArr2[i15 + 1] = (byte) ((bArr[1] >> 3) | (bArr[2] << 2) | (bArr[3] << 7));
                bArr2[i15 + 2] = (byte) ((bArr[3] >> 1) | (bArr[4] << 4));
                bArr2[i15 + 3] = (byte) ((bArr[4] >> 4) | (bArr[5] << 1) | (bArr[6] << 6));
                bArr2[i15 + 4] = (byte) ((bArr[6] >> 2) | (bArr[7] << 3));
                i15 += 5;
            }
        }
        return bArr2;
    }

    public void conditionalSubQ() {
        for (int i11 = 0; i11 < 256; i11++) {
            setCoeffIndex(i11, Reduce.conditionalSubQ(getCoeffIndex(i11)));
        }
    }

    public void convertToMont() {
        for (int i11 = 0; i11 < 256; i11++) {
            setCoeffIndex(i11, Reduce.montgomeryReduce(getCoeffIndex(i11) * 1353));
        }
    }

    public void decompressPoly(byte[] bArr) {
        char c11 = 4;
        int i11 = 1;
        if (this.engine.getKyberPolyCompressedBytes() == 128) {
            int i12 = 0;
            for (int i13 = 0; i13 < 128; i13++) {
                int i14 = i13 * 2;
                setCoeffIndex(i14, (short) (((((short) (bArr[i12] & 15)) * 3329) + 8) >> 4));
                setCoeffIndex(i14 + 1, (short) (((((short) ((bArr[i12] & 255) >> 4)) * 3329) + 8) >> 4));
                i12++;
            }
            return;
        }
        if (this.engine.getKyberPolyCompressedBytes() != 160) {
            throw new RuntimeException("PolyCompressedBytes is neither 128 or 160!");
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < 32) {
            byte b11 = bArr[i16];
            byte b12 = (byte) (b11 & 255);
            byte b13 = bArr[i16 + 1];
            byte b14 = (byte) (((b11 & 255) >> 5) | ((b13 & 255) << 3));
            byte b15 = (byte) ((b13 & 255) >> 2);
            byte b16 = bArr[i16 + 2];
            char c12 = c11;
            byte b17 = (byte) (((b16 & 255) << i11) | ((b13 & 255) >> 7));
            int i17 = (b16 & 255) >> 4;
            byte b18 = bArr[i16 + 3];
            int i18 = i11;
            byte b19 = (byte) (((b18 & 255) << 4) | i17);
            byte b21 = (byte) ((b18 & 255) >> 1);
            byte b22 = bArr[i16 + 4];
            byte b23 = (byte) (((b22 & 255) << 2) | ((b18 & 255) >> 6));
            byte[] bArr2 = new byte[8];
            bArr2[0] = b12;
            bArr2[i18] = b14;
            bArr2[2] = b15;
            bArr2[3] = b17;
            bArr2[c12] = b19;
            bArr2[5] = b21;
            bArr2[6] = b23;
            bArr2[7] = (byte) ((b22 & 255) >> 3);
            i16 += 5;
            for (int i19 = 0; i19 < 8; i19++) {
                setCoeffIndex((i15 * 8) + i19, (short) ((((bArr2[i19] & 31) * KyberEngine.KyberQ) + 16) >> 5));
            }
            i15++;
            c11 = c12;
            i11 = i18;
        }
    }

    public void fromBytes(byte[] bArr) {
        for (int i11 = 0; i11 < 128; i11++) {
            int i12 = i11 * 2;
            int i13 = i11 * 3;
            int i14 = i13 + 1;
            setCoeffIndex(i12, (short) (((bArr[i13] & 255) | ((bArr[i14] & 255) << 8)) & 4095));
            setCoeffIndex(i12 + 1, (short) ((((long) ((bArr[i14] & 255) >> 4)) | ((long) ((bArr[i13 + 2] & 255) << 4))) & 4095));
        }
    }

    public void fromMsg(byte[] bArr) {
        if (bArr.length != 32) {
            throw new RuntimeException("KYBER_INDCPA_MSGBYTES must be equal to KYBER_N/8 bytes!");
        }
        for (int i11 = 0; i11 < 32; i11++) {
            for (int i12 = 0; i12 < 8; i12++) {
                setCoeffIndex((i11 * 8) + i12, (short) (((short) (((short) (((bArr[i11] & 255) >> i12) & 1)) * (-1))) & 1665));
            }
        }
    }

    public short getCoeffIndex(int i11) {
        return this.coeffs[i11];
    }

    public short[] getCoeffs() {
        return this.coeffs;
    }

    public void getEta1Noise(byte[] bArr, byte b11) {
        byte[] bArr2 = new byte[(this.eta1 * 256) / 4];
        this.symmetric.prf(bArr2, bArr, b11);
        CBD.kyberCBD(this, bArr2, this.eta1);
    }

    public void getEta2Noise(byte[] bArr, byte b11) {
        byte[] bArr2 = new byte[(this.eta2 * 256) / 4];
        this.symmetric.prf(bArr2, bArr, b11);
        CBD.kyberCBD(this, bArr2, this.eta2);
    }

    public void polyInverseNttToMont() {
        setCoeffs(Ntt.invNtt(getCoeffs()));
    }

    public void polyNtt() {
        setCoeffs(Ntt.ntt(getCoeffs()));
        reduce();
    }

    public void polySubtract(Poly poly) {
        for (int i11 = 0; i11 < 256; i11++) {
            setCoeffIndex(i11, (short) (poly.getCoeffIndex(i11) - getCoeffIndex(i11)));
        }
    }

    public void reduce() {
        for (int i11 = 0; i11 < 256; i11++) {
            setCoeffIndex(i11, Reduce.barretReduce(getCoeffIndex(i11)));
        }
    }

    public void setCoeffIndex(int i11, short s11) {
        this.coeffs[i11] = s11;
    }

    public void setCoeffs(short[] sArr) {
        this.coeffs = sArr;
    }

    public byte[] toBytes() {
        byte[] bArr = new byte[KyberEngine.KyberPolyBytes];
        conditionalSubQ();
        for (int i11 = 0; i11 < 128; i11++) {
            int i12 = i11 * 2;
            short coeffIndex = getCoeffIndex(i12);
            short coeffIndex2 = getCoeffIndex(i12 + 1);
            int i13 = i11 * 3;
            bArr[i13] = (byte) coeffIndex;
            bArr[i13 + 1] = (byte) ((coeffIndex >> 8) | (coeffIndex2 << 4));
            bArr[i13 + 2] = (byte) (coeffIndex2 >> 4);
        }
        return bArr;
    }

    public byte[] toMsg() {
        byte[] bArr = new byte[KyberEngine.getKyberIndCpaMsgBytes()];
        conditionalSubQ();
        for (int i11 = 0; i11 < 32; i11++) {
            bArr[i11] = 0;
            for (int i12 = 0; i12 < 8; i12++) {
                bArr[i11] = (byte) (((byte) (((((((getCoeffIndex((i11 * 8) + i12) & HPKE.aead_EXPORT_ONLY) << 1) + 1665) * 80635) >> 28) & 1) << i12)) | bArr[i11]);
            }
        }
        return bArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        int i11 = 0;
        while (true) {
            short[] sArr = this.coeffs;
            if (i11 >= sArr.length) {
                stringBuffer.append("]");
                return stringBuffer.toString();
            }
            stringBuffer.append((int) sArr[i11]);
            if (i11 != this.coeffs.length - 1) {
                stringBuffer.append(", ");
            }
            i11++;
        }
    }
}
