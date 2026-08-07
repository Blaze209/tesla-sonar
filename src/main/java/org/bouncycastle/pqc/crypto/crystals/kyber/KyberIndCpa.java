package org.bouncycastle.pqc.crypto.crystals.kyber;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
class KyberIndCpa {
    public final int KyberGenerateMatrixNBlocks;
    private KyberEngine engine;
    private int eta1;
    private int indCpaBytes;
    private int indCpaPublicKeyBytes;
    private int kyberK;
    private int polyCompressedBytes;
    private int polyVecBytes;
    private int polyVecCompressedBytes;
    private Symmetric symmetric;

    public KyberIndCpa(KyberEngine kyberEngine) {
        this.engine = kyberEngine;
        this.kyberK = kyberEngine.getKyberK();
        this.eta1 = kyberEngine.getKyberEta1();
        this.indCpaPublicKeyBytes = kyberEngine.getKyberPublicKeyBytes();
        this.polyVecBytes = kyberEngine.getKyberPolyVecBytes();
        this.indCpaBytes = kyberEngine.getKyberIndCpaBytes();
        this.polyVecCompressedBytes = kyberEngine.getKyberPolyVecCompressedBytes();
        this.polyCompressedBytes = kyberEngine.getKyberPolyCompressedBytes();
        Symmetric symmetric = kyberEngine.getSymmetric();
        this.symmetric = symmetric;
        int i11 = symmetric.xofBlockBytes;
        this.KyberGenerateMatrixNBlocks = (i11 + 472) / i11;
    }

    private byte[] packCipherText(PolyVec polyVec, Poly poly) {
        byte[] bArr = new byte[this.indCpaBytes];
        System.arraycopy(polyVec.compressPolyVec(), 0, bArr, 0, this.polyVecCompressedBytes);
        System.arraycopy(poly.compressPoly(), 0, bArr, this.polyVecCompressedBytes, this.polyCompressedBytes);
        return bArr;
    }

    private static int rejectionSampling(Poly poly, int i11, int i12, byte[] bArr, int i13) {
        int i14 = 0;
        int i15 = 0;
        while (i14 < i12) {
            int i16 = i15 + 3;
            if (i16 > i13) {
                break;
            }
            short s11 = (short) (bArr[i15] & 255);
            byte b11 = bArr[i15 + 1];
            short s12 = (short) ((s11 | (((short) (b11 & 255)) << 8)) & 4095);
            short s13 = (short) (((((short) (bArr[i15 + 2] & 255)) << 4) | (((short) (b11 & 255)) >> 4)) & 4095);
            if (s12 < 3329) {
                poly.setCoeffIndex(i11 + i14, s12);
                i14++;
            }
            if (i14 < i12 && s13 < 3329) {
                poly.setCoeffIndex(i11 + i14, s13);
                i14++;
            }
            i15 = i16;
        }
        return i14;
    }

    private void unpackCipherText(PolyVec polyVec, Poly poly, byte[] bArr) {
        polyVec.decompressPolyVec(Arrays.copyOfRange(bArr, 0, this.engine.getKyberPolyVecCompressedBytes()));
        poly.decompressPoly(Arrays.copyOfRange(bArr, this.engine.getKyberPolyVecCompressedBytes(), bArr.length));
    }

    public byte[] decrypt(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[KyberEngine.getKyberIndCpaMsgBytes()];
        PolyVec polyVec = new PolyVec(this.engine);
        PolyVec polyVec2 = new PolyVec(this.engine);
        Poly poly = new Poly(this.engine);
        Poly poly2 = new Poly(this.engine);
        unpackCipherText(polyVec, poly, bArr);
        unpackSecretKey(polyVec2, bArr2);
        polyVec.polyVecNtt();
        PolyVec.pointwiseAccountMontgomery(poly2, polyVec2, polyVec, this.engine);
        poly2.polyInverseNttToMont();
        poly2.polySubtract(poly);
        poly2.reduce();
        return poly2.toMsg();
    }

    public byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        PolyVec polyVec = new PolyVec(this.engine);
        PolyVec polyVec2 = new PolyVec(this.engine);
        PolyVec polyVec3 = new PolyVec(this.engine);
        PolyVec polyVec4 = new PolyVec(this.engine);
        PolyVec[] polyVecArr = new PolyVec[this.engine.getKyberK()];
        Poly poly = new Poly(this.engine);
        Poly poly2 = new Poly(this.engine);
        Poly poly3 = new Poly(this.engine);
        byte[] bArrUnpackPublicKey = unpackPublicKey(polyVec2, bArr2);
        poly3.fromMsg(bArr);
        for (int i11 = 0; i11 < this.kyberK; i11++) {
            polyVecArr[i11] = new PolyVec(this.engine);
        }
        generateMatrix(polyVecArr, bArrUnpackPublicKey, true);
        byte b11 = 0;
        for (int i12 = 0; i12 < this.kyberK; i12++) {
            polyVec.getVectorIndex(i12).getEta1Noise(bArr3, b11);
            b11 = (byte) (b11 + 1);
        }
        for (int i13 = 0; i13 < this.kyberK; i13++) {
            polyVec3.getVectorIndex(i13).getEta2Noise(bArr3, b11);
            b11 = (byte) (b11 + 1);
        }
        poly.getEta2Noise(bArr3, b11);
        polyVec.polyVecNtt();
        for (int i14 = 0; i14 < this.kyberK; i14++) {
            PolyVec.pointwiseAccountMontgomery(polyVec4.getVectorIndex(i14), polyVecArr[i14], polyVec, this.engine);
        }
        PolyVec.pointwiseAccountMontgomery(poly2, polyVec2, polyVec, this.engine);
        polyVec4.polyVecInverseNttToMont();
        poly2.polyInverseNttToMont();
        polyVec4.addPoly(polyVec3);
        poly2.addCoeffs(poly);
        poly2.addCoeffs(poly3);
        polyVec4.reducePoly();
        poly2.reduce();
        return packCipherText(polyVec4, poly2);
    }

    byte[][] generateKeyPair() {
        PolyVec polyVec = new PolyVec(this.engine);
        PolyVec polyVec2 = new PolyVec(this.engine);
        PolyVec polyVec3 = new PolyVec(this.engine);
        byte[] bArr = new byte[32];
        this.engine.getRandomBytes(bArr);
        byte[] bArr2 = new byte[64];
        this.symmetric.hash_g(bArr2, bArr);
        byte[] bArr3 = new byte[32];
        byte[] bArr4 = new byte[32];
        System.arraycopy(bArr2, 0, bArr3, 0, 32);
        System.arraycopy(bArr2, 32, bArr4, 0, 32);
        PolyVec[] polyVecArr = new PolyVec[this.kyberK];
        for (int i11 = 0; i11 < this.kyberK; i11++) {
            polyVecArr[i11] = new PolyVec(this.engine);
        }
        generateMatrix(polyVecArr, bArr3, false);
        byte b11 = 0;
        for (int i12 = 0; i12 < this.kyberK; i12++) {
            polyVec.getVectorIndex(i12).getEta1Noise(bArr4, b11);
            b11 = (byte) (b11 + 1);
        }
        for (int i13 = 0; i13 < this.kyberK; i13++) {
            polyVec3.getVectorIndex(i13).getEta1Noise(bArr4, b11);
            b11 = (byte) (b11 + 1);
        }
        polyVec.polyVecNtt();
        polyVec3.polyVecNtt();
        for (int i14 = 0; i14 < this.kyberK; i14++) {
            PolyVec.pointwiseAccountMontgomery(polyVec2.getVectorIndex(i14), polyVecArr[i14], polyVec, this.engine);
            polyVec2.getVectorIndex(i14).convertToMont();
        }
        polyVec2.addPoly(polyVec3);
        polyVec2.reducePoly();
        return new byte[][]{packPublicKey(polyVec2, bArr3), packSecretKey(polyVec)};
    }

    public void generateMatrix(PolyVec[] polyVecArr, byte[] bArr, boolean z11) {
        byte b11;
        byte b12;
        byte[] bArr2 = new byte[(this.KyberGenerateMatrixNBlocks * this.symmetric.xofBlockBytes) + 2];
        for (int i11 = 0; i11 < this.kyberK; i11++) {
            for (int i12 = 0; i12 < this.kyberK; i12++) {
                Symmetric symmetric = this.symmetric;
                if (z11) {
                    b11 = (byte) i11;
                    b12 = (byte) i12;
                } else {
                    b11 = (byte) i12;
                    b12 = (byte) i11;
                }
                symmetric.xofAbsorb(bArr, b11, b12);
                Symmetric symmetric2 = this.symmetric;
                symmetric2.xofSqueezeBlocks(bArr2, 0, symmetric2.xofBlockBytes * this.KyberGenerateMatrixNBlocks);
                int i13 = this.KyberGenerateMatrixNBlocks * this.symmetric.xofBlockBytes;
                int iRejectionSampling = rejectionSampling(polyVecArr[i11].getVectorIndex(i12), 0, 256, bArr2, i13);
                while (iRejectionSampling < 256) {
                    int i14 = i13 % 3;
                    for (int i15 = 0; i15 < i14; i15++) {
                        bArr2[i15] = bArr2[(i13 - i14) + i15];
                    }
                    Symmetric symmetric3 = this.symmetric;
                    symmetric3.xofSqueezeBlocks(bArr2, i14, symmetric3.xofBlockBytes * 2);
                    i13 = this.symmetric.xofBlockBytes + i14;
                    iRejectionSampling += rejectionSampling(polyVecArr[i11].getVectorIndex(i12), iRejectionSampling, 256 - iRejectionSampling, bArr2, i13);
                }
            }
        }
    }

    public byte[] packPublicKey(PolyVec polyVec, byte[] bArr) {
        byte[] bArr2 = new byte[this.indCpaPublicKeyBytes];
        System.arraycopy(polyVec.toBytes(), 0, bArr2, 0, this.polyVecBytes);
        System.arraycopy(bArr, 0, bArr2, this.polyVecBytes, 32);
        return bArr2;
    }

    public byte[] packSecretKey(PolyVec polyVec) {
        return polyVec.toBytes();
    }

    public byte[] unpackPublicKey(PolyVec polyVec, byte[] bArr) {
        byte[] bArr2 = new byte[32];
        polyVec.fromBytes(bArr);
        System.arraycopy(bArr, this.polyVecBytes, bArr2, 0, 32);
        return bArr2;
    }

    public void unpackSecretKey(PolyVec polyVec, byte[] bArr) {
        polyVec.fromBytes(bArr);
    }
}
