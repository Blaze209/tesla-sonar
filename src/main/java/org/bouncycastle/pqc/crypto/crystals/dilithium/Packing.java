package org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
class Packing {
    Packing() {
    }

    static byte[] packPublicKey(PolyVecK polyVecK, DilithiumEngine dilithiumEngine) {
        byte[] bArr = new byte[dilithiumEngine.getCryptoPublicKeyBytes() - 32];
        for (int i11 = 0; i11 < dilithiumEngine.getDilithiumK(); i11++) {
            System.arraycopy(polyVecK.getVectorIndex(i11).polyt1Pack(), 0, bArr, i11 * 320, 320);
        }
        return bArr;
    }

    static byte[][] packSecretKey(byte[] bArr, byte[] bArr2, byte[] bArr3, PolyVecK polyVecK, PolyVecL polyVecL, PolyVecK polyVecK2, DilithiumEngine dilithiumEngine) {
        byte[][] bArr4 = new byte[6][];
        bArr4[0] = bArr;
        bArr4[1] = bArr3;
        bArr4[2] = bArr2;
        bArr4[3] = new byte[dilithiumEngine.getDilithiumL() * dilithiumEngine.getDilithiumPolyEtaPackedBytes()];
        for (int i11 = 0; i11 < dilithiumEngine.getDilithiumL(); i11++) {
            polyVecL.getVectorIndex(i11).polyEtaPack(bArr4[3], dilithiumEngine.getDilithiumPolyEtaPackedBytes() * i11);
        }
        bArr4[4] = new byte[dilithiumEngine.getDilithiumK() * dilithiumEngine.getDilithiumPolyEtaPackedBytes()];
        for (int i12 = 0; i12 < dilithiumEngine.getDilithiumK(); i12++) {
            polyVecK2.getVectorIndex(i12).polyEtaPack(bArr4[4], dilithiumEngine.getDilithiumPolyEtaPackedBytes() * i12);
        }
        bArr4[5] = new byte[dilithiumEngine.getDilithiumK() * 416];
        for (int i13 = 0; i13 < dilithiumEngine.getDilithiumK(); i13++) {
            polyVecK.getVectorIndex(i13).polyt0Pack(bArr4[5], i13 * 416);
        }
        return bArr4;
    }

    static byte[] packSignature(byte[] bArr, PolyVecL polyVecL, PolyVecK polyVecK, DilithiumEngine dilithiumEngine) {
        byte[] bArr2 = new byte[dilithiumEngine.getCryptoBytes()];
        System.arraycopy(bArr, 0, bArr2, 0, dilithiumEngine.getDilithiumCTilde());
        int dilithiumCTilde = dilithiumEngine.getDilithiumCTilde();
        for (int i11 = 0; i11 < dilithiumEngine.getDilithiumL(); i11++) {
            System.arraycopy(polyVecL.getVectorIndex(i11).zPack(), 0, bArr2, (dilithiumEngine.getDilithiumPolyZPackedBytes() * i11) + dilithiumCTilde, dilithiumEngine.getDilithiumPolyZPackedBytes());
        }
        int dilithiumL = dilithiumCTilde + (dilithiumEngine.getDilithiumL() * dilithiumEngine.getDilithiumPolyZPackedBytes());
        for (int i12 = 0; i12 < dilithiumEngine.getDilithiumOmega() + dilithiumEngine.getDilithiumK(); i12++) {
            bArr2[dilithiumL + i12] = 0;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < dilithiumEngine.getDilithiumK(); i14++) {
            for (int i15 = 0; i15 < 256; i15++) {
                if (polyVecK.getVectorIndex(i14).getCoeffIndex(i15) != 0) {
                    bArr2[i13 + dilithiumL] = (byte) i15;
                    i13++;
                }
            }
            bArr2[dilithiumEngine.getDilithiumOmega() + dilithiumL + i14] = (byte) i13;
        }
        return bArr2;
    }

    static PolyVecK unpackPublicKey(PolyVecK polyVecK, byte[] bArr, DilithiumEngine dilithiumEngine) {
        int i11 = 0;
        while (i11 < dilithiumEngine.getDilithiumK()) {
            Poly vectorIndex = polyVecK.getVectorIndex(i11);
            int i12 = i11 * 320;
            i11++;
            vectorIndex.polyt1Unpack(Arrays.copyOfRange(bArr, i12, (i11 * 320) + 32));
        }
        return polyVecK;
    }

    static void unpackSecretKey(PolyVecK polyVecK, PolyVecL polyVecL, PolyVecK polyVecK2, byte[] bArr, byte[] bArr2, byte[] bArr3, DilithiumEngine dilithiumEngine) {
        for (int i11 = 0; i11 < dilithiumEngine.getDilithiumL(); i11++) {
            polyVecL.getVectorIndex(i11).polyEtaUnpack(bArr2, dilithiumEngine.getDilithiumPolyEtaPackedBytes() * i11);
        }
        for (int i12 = 0; i12 < dilithiumEngine.getDilithiumK(); i12++) {
            polyVecK2.getVectorIndex(i12).polyEtaUnpack(bArr3, dilithiumEngine.getDilithiumPolyEtaPackedBytes() * i12);
        }
        for (int i13 = 0; i13 < dilithiumEngine.getDilithiumK(); i13++) {
            polyVecK.getVectorIndex(i13).polyt0Unpack(bArr, i13 * 416);
        }
    }

    static boolean unpackSignature(PolyVecL polyVecL, PolyVecK polyVecK, byte[] bArr, DilithiumEngine dilithiumEngine) {
        int dilithiumCTilde = dilithiumEngine.getDilithiumCTilde();
        int i11 = 0;
        while (i11 < dilithiumEngine.getDilithiumL()) {
            Poly vectorIndex = polyVecL.getVectorIndex(i11);
            int dilithiumPolyZPackedBytes = (dilithiumEngine.getDilithiumPolyZPackedBytes() * i11) + dilithiumCTilde;
            i11++;
            vectorIndex.zUnpack(Arrays.copyOfRange(bArr, dilithiumPolyZPackedBytes, (dilithiumEngine.getDilithiumPolyZPackedBytes() * i11) + dilithiumCTilde));
        }
        int dilithiumL = dilithiumCTilde + (dilithiumEngine.getDilithiumL() * dilithiumEngine.getDilithiumPolyZPackedBytes());
        int i12 = 0;
        for (int i13 = 0; i13 < dilithiumEngine.getDilithiumK(); i13++) {
            for (int i14 = 0; i14 < 256; i14++) {
                polyVecK.getVectorIndex(i13).setCoeffIndex(i14, 0);
            }
            if ((bArr[dilithiumEngine.getDilithiumOmega() + dilithiumL + i13] & 255) < i12 || (bArr[dilithiumEngine.getDilithiumOmega() + dilithiumL + i13] & 255) > dilithiumEngine.getDilithiumOmega()) {
                return false;
            }
            for (int i15 = i12; i15 < (bArr[dilithiumEngine.getDilithiumOmega() + dilithiumL + i13] & 255); i15++) {
                if (i15 > i12) {
                    int i16 = dilithiumL + i15;
                    if ((bArr[i16] & 255) <= (bArr[i16 - 1] & 255)) {
                        return false;
                    }
                }
                polyVecK.getVectorIndex(i13).setCoeffIndex(bArr[dilithiumL + i15] & 255, 1);
            }
            i12 = bArr[dilithiumEngine.getDilithiumOmega() + dilithiumL + i13];
        }
        while (i12 < dilithiumEngine.getDilithiumOmega()) {
            if ((bArr[dilithiumL + i12] & 255) != 0) {
                return false;
            }
            i12++;
        }
        return true;
    }
}
