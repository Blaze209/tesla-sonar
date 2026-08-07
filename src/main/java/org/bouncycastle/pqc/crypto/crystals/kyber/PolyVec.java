package org.bouncycastle.pqc.crypto.crystals.kyber;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
class PolyVec {
    private KyberEngine engine;
    private int kyberK;
    private int polyVecBytes;
    Poly[] vec;

    public PolyVec() throws Exception {
        throw new Exception("Requires Parameter");
    }

    public static void pointwiseAccountMontgomery(Poly poly, PolyVec polyVec, PolyVec polyVec2, KyberEngine kyberEngine) {
        Poly poly2 = new Poly(kyberEngine);
        Poly.baseMultMontgomery(poly, polyVec.getVectorIndex(0), polyVec2.getVectorIndex(0));
        for (int i11 = 1; i11 < kyberEngine.getKyberK(); i11++) {
            Poly.baseMultMontgomery(poly2, polyVec.getVectorIndex(i11), polyVec2.getVectorIndex(i11));
            poly.addCoeffs(poly2);
        }
        poly.reduce();
    }

    public void addPoly(PolyVec polyVec) {
        for (int i11 = 0; i11 < this.kyberK; i11++) {
            getVectorIndex(i11).addCoeffs(polyVec.getVectorIndex(i11));
        }
    }

    public byte[] compressPolyVec() {
        conditionalSubQ();
        byte[] bArr = new byte[this.engine.getKyberPolyVecCompressedBytes()];
        int i11 = 32;
        if (this.engine.getKyberPolyVecCompressedBytes() == this.kyberK * 320) {
            short[] sArr = new short[4];
            int i12 = 0;
            for (int i13 = 0; i13 < this.kyberK; i13++) {
                for (int i14 = 0; i14 < 64; i14++) {
                    for (int i15 = 0; i15 < 4; i15++) {
                        sArr[i15] = (short) (((((((long) getVectorIndex(i13).getCoeffIndex((i14 * 4) + i15)) << 10) + 1665) * 1290167) >> 32) & 1023);
                    }
                    short s11 = sArr[0];
                    bArr[i12] = (byte) s11;
                    short s12 = sArr[1];
                    bArr[i12 + 1] = (byte) ((s11 >> 8) | (s12 << 2));
                    int i16 = s12 >> 6;
                    short s13 = sArr[2];
                    bArr[i12 + 2] = (byte) (i16 | (s13 << 4));
                    int i17 = s13 >> 4;
                    short s14 = sArr[3];
                    bArr[i12 + 3] = (byte) (i17 | (s14 << 6));
                    bArr[i12 + 4] = (byte) (s14 >> 2);
                    i12 += 5;
                }
            }
        } else {
            if (this.engine.getKyberPolyVecCompressedBytes() != this.kyberK * 352) {
                throw new RuntimeException("Kyber PolyVecCompressedBytes neither 320 * KyberK or 352 * KyberK!");
            }
            short[] sArr2 = new short[8];
            int i18 = 0;
            int i19 = 0;
            while (i18 < this.kyberK) {
                int i21 = 0;
                while (i21 < i11) {
                    for (int i22 = 0; i22 < 8; i22++) {
                        sArr2[i22] = (short) (((((((long) getVectorIndex(i18).getCoeffIndex((i21 * 8) + i22)) << 11) + 1664) * 645084) >> 31) & 2047);
                    }
                    short s15 = sArr2[0];
                    bArr[i19] = (byte) s15;
                    short s16 = sArr2[1];
                    bArr[i19 + 1] = (byte) ((s15 >> 8) | (s16 << 3));
                    short s17 = sArr2[2];
                    bArr[i19 + 2] = (byte) ((s16 >> 5) | (s17 << 6));
                    bArr[i19 + 3] = (byte) (s17 >> 2);
                    int i23 = s17 >> 10;
                    short s18 = sArr2[3];
                    bArr[i19 + 4] = (byte) (i23 | (s18 << 1));
                    short s19 = sArr2[4];
                    bArr[i19 + 5] = (byte) ((s18 >> 7) | (s19 << 4));
                    short s21 = sArr2[5];
                    bArr[i19 + 6] = (byte) ((s19 >> 4) | (s21 << 7));
                    bArr[i19 + 7] = (byte) (s21 >> 1);
                    int i24 = s21 >> 9;
                    short s22 = sArr2[6];
                    bArr[i19 + 8] = (byte) (i24 | (s22 << 2));
                    int i25 = s22 >> 6;
                    short s23 = sArr2[7];
                    bArr[i19 + 9] = (byte) (i25 | (s23 << 5));
                    bArr[i19 + 10] = (byte) (s23 >> 3);
                    i19 += 11;
                    i21++;
                    i11 = 32;
                }
                i18++;
                i11 = 32;
            }
        }
        return bArr;
    }

    public void conditionalSubQ() {
        for (int i11 = 0; i11 < this.kyberK; i11++) {
            getVectorIndex(i11).conditionalSubQ();
        }
    }

    public void decompressPolyVec(byte[] bArr) {
        int i11 = 3;
        int i12 = 6;
        short s11 = 2;
        short s12 = 4;
        short s13 = 1;
        if (this.engine.getKyberPolyVecCompressedBytes() == this.kyberK * 320) {
            int i13 = 0;
            for (int i14 = 0; i14 < this.kyberK; i14++) {
                for (int i15 = 0; i15 < 64; i15++) {
                    int i16 = bArr[i13] & 255;
                    byte b11 = bArr[i13 + 1];
                    byte b12 = bArr[i13 + 2];
                    byte b13 = bArr[i13 + 3];
                    short[] sArr = {(short) (i16 | ((short) ((b11 & 255) << 8))), (short) (((b11 & 255) >> 2) | ((short) ((b12 & 255) << 6))), (short) (((b12 & 255) >> 4) | ((short) ((b13 & 255) << 4))), (short) (((b13 & 255) >> 6) | ((short) ((bArr[i13 + 4] & 255) << 2)))};
                    i13 += 5;
                    for (int i17 = 0; i17 < 4; i17++) {
                        this.vec[i14].setCoeffIndex((i15 * 4) + i17, (short) ((((sArr[i17] & 1023) * KyberEngine.KyberQ) + 512) >> 10));
                    }
                }
            }
            return;
        }
        if (this.engine.getKyberPolyVecCompressedBytes() != this.kyberK * 352) {
            throw new RuntimeException("Kyber PolyVecCompressedBytes neither 320 * KyberK or 352 * KyberK!");
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.kyberK; i19++) {
            int i21 = 0;
            while (i21 < 32) {
                int i22 = bArr[i18] & 255;
                byte b14 = bArr[i18 + 1];
                short s14 = (short) (i22 | (((short) (b14 & 255)) << 8));
                byte b15 = bArr[i18 + 2];
                short s15 = (short) (((b14 & 255) >> i11) | (((short) (b15 & 255)) << 5));
                int i23 = ((b15 & 255) >> i12) | (((short) (bArr[i18 + 3] & 255)) << s11);
                byte b16 = bArr[i18 + 4];
                int i24 = i11;
                short s16 = (short) (((short) ((b16 & 255) << 10)) | i23);
                int i25 = (b16 & 255) >> s13;
                byte b17 = bArr[i18 + 5];
                int i26 = i12;
                short s17 = (short) ((((short) (b17 & 255)) << 7) | i25);
                int i27 = (b17 & 255) >> s12;
                byte b18 = bArr[i18 + 6];
                short s18 = s11;
                short s19 = (short) ((((short) (b18 & 255)) << s12) | i27);
                int i28 = ((b18 & 255) >> 7) | (((short) (bArr[i18 + 7] & 255)) << s13);
                byte b19 = bArr[i18 + 8];
                short s21 = s12;
                short s22 = (short) (((short) ((b19 & 255) << 9)) | i28);
                int i29 = (b19 & 255) >> 2;
                byte b21 = bArr[i18 + 9];
                short s23 = s13;
                short s24 = (short) ((((short) (b21 & 255)) << 6) | i29);
                short s25 = (short) (((b21 & 255) >> 5) | (((short) (bArr[i18 + 10] & 255)) << 3));
                short[] sArr2 = new short[8];
                sArr2[0] = s14;
                sArr2[s23] = s15;
                sArr2[s18] = s16;
                sArr2[i24] = s17;
                sArr2[s21] = s19;
                sArr2[5] = s22;
                sArr2[i26] = s24;
                sArr2[7] = s25;
                i18 += 11;
                for (int i31 = 0; i31 < 8; i31++) {
                    this.vec[i19].setCoeffIndex((i21 * 8) + i31, (short) ((((sArr2[i31] & 2047) * KyberEngine.KyberQ) + 1024) >> 11));
                }
                i21++;
                i11 = i24;
                i12 = i26;
                s11 = s18;
                s12 = s21;
                s13 = s23;
            }
        }
    }

    public void fromBytes(byte[] bArr) {
        int i11 = 0;
        while (i11 < this.kyberK) {
            Poly vectorIndex = getVectorIndex(i11);
            int i12 = i11 * KyberEngine.KyberPolyBytes;
            i11++;
            vectorIndex.fromBytes(Arrays.copyOfRange(bArr, i12, i11 * KyberEngine.KyberPolyBytes));
        }
    }

    public Poly getVectorIndex(int i11) {
        return this.vec[i11];
    }

    public void polyVecInverseNttToMont() {
        for (int i11 = 0; i11 < this.kyberK; i11++) {
            getVectorIndex(i11).polyInverseNttToMont();
        }
    }

    public void polyVecNtt() {
        for (int i11 = 0; i11 < this.kyberK; i11++) {
            getVectorIndex(i11).polyNtt();
        }
    }

    public void reducePoly() {
        for (int i11 = 0; i11 < this.kyberK; i11++) {
            getVectorIndex(i11).reduce();
        }
    }

    public byte[] toBytes() {
        byte[] bArr = new byte[this.polyVecBytes];
        for (int i11 = 0; i11 < this.kyberK; i11++) {
            System.arraycopy(this.vec[i11].toBytes(), 0, bArr, i11 * KyberEngine.KyberPolyBytes, KyberEngine.KyberPolyBytes);
        }
        return bArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        for (int i11 = 0; i11 < this.kyberK; i11++) {
            stringBuffer.append(this.vec[i11].toString());
            if (i11 != this.kyberK - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public PolyVec(KyberEngine kyberEngine) {
        this.engine = kyberEngine;
        this.kyberK = kyberEngine.getKyberK();
        this.polyVecBytes = kyberEngine.getKyberPolyVecBytes();
        this.vec = new Poly[this.kyberK];
        for (int i11 = 0; i11 < this.kyberK; i11++) {
            this.vec[i11] = new Poly(kyberEngine);
        }
    }
}
