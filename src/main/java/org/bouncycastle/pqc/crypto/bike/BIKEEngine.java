package org.bouncycastle.pqc.crypto.bike;

import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;

/* JADX INFO: loaded from: classes10.dex */
class BIKEEngine {
    private int L_BYTE;
    private int R2_BYTE;
    private int R_BYTE;
    private final BIKERing bikeRing;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    private int f99023hw;
    private int nbIter;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f99024r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f99025t;
    private int tau;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f99026w;

    public BIKEEngine(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f99024r = i11;
        this.f99026w = i12;
        this.f99025t = i13;
        this.nbIter = i15;
        this.tau = i16;
        this.f99023hw = i12 / 2;
        this.L_BYTE = i14 / 8;
        this.R_BYTE = (i11 + 7) >>> 3;
        this.R2_BYTE = ((i11 * 2) + 7) >>> 3;
        this.bikeRing = new BIKERing(i11);
    }

    private void BFIter(byte[] bArr, byte[] bArr2, int i11, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        ctrAll(iArr3, bArr, bArr5);
        int i12 = bArr5[0] & 255;
        int i13 = ((i12 - i11) >> 31) + 1;
        int i14 = ((i12 - (i11 - this.tau)) >> 31) + 1;
        byte b11 = (byte) i13;
        bArr2[0] = (byte) (bArr2[0] ^ b11);
        bArr3[0] = b11;
        bArr4[0] = (byte) i14;
        int i15 = 1;
        while (true) {
            int i16 = this.f99024r;
            if (i15 >= i16) {
                break;
            }
            int i17 = bArr5[i15] & 255;
            int i18 = ((i17 - i11) >> 31) + 1;
            int i19 = ((i17 - (i11 - this.tau)) >> 31) + 1;
            int i21 = i16 - i15;
            byte b12 = (byte) i18;
            bArr2[i21] = (byte) (bArr2[i21] ^ b12);
            bArr3[i15] = b12;
            bArr4[i15] = (byte) i19;
            i15++;
        }
        ctrAll(iArr4, bArr, bArr5);
        int i22 = bArr5[0] & 255;
        int i23 = ((i22 - i11) >> 31) + 1;
        int i24 = ((i22 - (i11 - this.tau)) >> 31) + 1;
        int i25 = this.f99024r;
        byte b13 = (byte) i23;
        bArr2[i25] = (byte) (bArr2[i25] ^ b13);
        bArr3[i25] = b13;
        bArr4[i25] = (byte) i24;
        int i26 = 1;
        while (true) {
            int i27 = this.f99024r;
            if (i26 >= i27) {
                break;
            }
            int i28 = bArr5[i26] & 255;
            int i29 = ((i28 - i11) >> 31) + 1;
            int i31 = ((i28 - (i11 - this.tau)) >> 31) + 1;
            int i32 = (i27 + i27) - i26;
            byte b14 = (byte) i29;
            bArr2[i32] = (byte) (bArr2[i32] ^ b14);
            bArr3[i27 + i26] = b14;
            bArr4[i27 + i26] = (byte) i31;
            i26++;
        }
        for (int i33 = 0; i33 < this.f99024r * 2; i33++) {
            recomputeSyndrome(bArr, i33, iArr, iArr2, bArr3[i33] != 0);
        }
    }

    private void BFIter2(byte[] bArr, byte[] bArr2, int i11, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, byte[] bArr3) {
        int[] iArr5 = new int[this.f99024r * 2];
        ctrAll(iArr3, bArr, bArr3);
        int i12 = (((bArr3[0] & 255) - i11) >> 31) + 1;
        bArr2[0] = (byte) (bArr2[0] ^ ((byte) i12));
        iArr5[0] = i12;
        int i13 = 1;
        while (true) {
            int i14 = this.f99024r;
            if (i13 >= i14) {
                break;
            }
            int i15 = (((bArr3[i13] & 255) - i11) >> 31) + 1;
            int i16 = i14 - i13;
            bArr2[i16] = (byte) (bArr2[i16] ^ ((byte) i15));
            iArr5[i13] = i15;
            i13++;
        }
        ctrAll(iArr4, bArr, bArr3);
        int i17 = (((bArr3[0] & 255) - i11) >> 31) + 1;
        int i18 = this.f99024r;
        bArr2[i18] = (byte) (bArr2[i18] ^ ((byte) i17));
        iArr5[i18] = i17;
        int i19 = 1;
        while (true) {
            int i21 = this.f99024r;
            if (i19 >= i21) {
                break;
            }
            int i22 = (((bArr3[i19] & 255) - i11) >> 31) + 1;
            int i23 = (i21 + i21) - i19;
            bArr2[i23] = (byte) (bArr2[i23] ^ ((byte) i22));
            iArr5[i21 + i19] = i22;
            i19++;
        }
        for (int i24 = 0; i24 < this.f99024r * 2; i24++) {
            recomputeSyndrome(bArr, i24, iArr, iArr2, iArr5[i24] == 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v2 */
    private void BFMaskedIter(byte[] bArr, byte[] bArr2, byte[] bArr3, int i11, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int[] iArr5 = new int[this.f99024r * 2];
        int i12 = 0;
        while (true) {
            if (i12 >= this.f99024r) {
                break;
            }
            if (bArr3[i12] == 1) {
                ?? r11 = ctr(iArr3, bArr, i12) < i11 ? 0 : 1;
                updateNewErrorIndex(bArr2, i12, r11);
                iArr5[i12] = r11;
            }
            i12++;
        }
        int i13 = 0;
        while (true) {
            int i14 = this.f99024r;
            if (i13 >= i14) {
                break;
            }
            if (bArr3[i14 + i13] == 1) {
                ?? r12 = ctr(iArr4, bArr, i13) >= i11 ? 1 : 0;
                updateNewErrorIndex(bArr2, this.f99024r + i13, r12);
                iArr5[this.f99024r + i13] = r12;
            }
            i13++;
        }
        int i15 = 0;
        while (i15 < this.f99024r * 2) {
            int[] iArr6 = iArr;
            int[] iArr7 = iArr2;
            byte[] bArr4 = bArr;
            recomputeSyndrome(bArr4, i15, iArr6, iArr7, iArr5[i15] == 1);
            i15++;
            bArr = bArr4;
            iArr2 = iArr7;
            iArr = iArr6;
        }
    }

    private byte[] BGFDecoder(byte[] bArr, int[] iArr, int[] iArr2) {
        byte[] bArr2 = new byte[this.f99024r * 2];
        int[] columnFromCompactVersion = getColumnFromCompactVersion(iArr);
        int[] columnFromCompactVersion2 = getColumnFromCompactVersion(iArr2);
        int i11 = this.f99024r;
        byte[] bArr3 = new byte[i11 * 2];
        byte[] bArr4 = new byte[i11];
        byte[] bArr5 = new byte[i11 * 2];
        BIKEEngine bIKEEngine = this;
        bIKEEngine.BFIter(bArr, bArr2, threshold(BIKEUtils.getHammingWeight(bArr), this.f99024r), iArr, iArr2, columnFromCompactVersion, columnFromCompactVersion2, bArr3, bArr5, bArr4);
        int i12 = 1;
        bIKEEngine.BFMaskedIter(bArr, bArr2, bArr3, ((bIKEEngine.f99023hw + 1) / 2) + 1, iArr, iArr2, columnFromCompactVersion, columnFromCompactVersion2);
        bIKEEngine.BFMaskedIter(bArr, bArr2, bArr5, ((bIKEEngine.f99023hw + 1) / 2) + 1, iArr, iArr2, columnFromCompactVersion, columnFromCompactVersion2);
        while (i12 < bIKEEngine.nbIter) {
            Arrays.fill(bArr3, (byte) 0);
            bIKEEngine.BFIter2(bArr, bArr2, threshold(BIKEUtils.getHammingWeight(bArr), bIKEEngine.f99024r), iArr, iArr2, columnFromCompactVersion, columnFromCompactVersion2, bArr4);
            i12++;
            bIKEEngine = this;
        }
        if (BIKEUtils.getHammingWeight(bArr) == 0) {
            return bArr2;
        }
        return null;
    }

    private byte[] computeSyndrome(byte[] bArr, byte[] bArr2) {
        long[] jArrCreate = this.bikeRing.create();
        long[] jArrCreate2 = this.bikeRing.create();
        this.bikeRing.decodeBytes(bArr, jArrCreate);
        this.bikeRing.decodeBytes(bArr2, jArrCreate2);
        this.bikeRing.multiply(jArrCreate, jArrCreate2, jArrCreate);
        return this.bikeRing.encodeBitsTransposed(jArrCreate);
    }

    private void convertToCompact(int[] iArr, byte[] bArr) {
        int i11;
        int i12 = 0;
        for (int i13 = 0; i13 < this.R_BYTE; i13++) {
            for (int i14 = 0; i14 < 8 && (i11 = (i13 * 8) + i14) != this.f99024r; i14++) {
                int i15 = (bArr[i13] >> i14) & 1;
                int i16 = -i15;
                iArr[i12] = (i11 & i16) | ((~i16) & iArr[i12]);
                i12 = (i12 + i15) % this.f99023hw;
            }
        }
    }

    private int ctr(int[] iArr, byte[] bArr, int i11) {
        int i12 = this.f99023hw - 4;
        int i13 = 0;
        int i14 = 0;
        while (i13 <= i12) {
            int i15 = iArr[i13] + i11;
            int i16 = this.f99024r;
            int i17 = i15 - i16;
            int i18 = (iArr[i13 + 1] + i11) - i16;
            int i19 = (iArr[i13 + 2] + i11) - i16;
            int i21 = (iArr[i13 + 3] + i11) - i16;
            i14 = i14 + (bArr[i17 + ((i17 >> 31) & i16)] & 255) + (bArr[i18 + ((i18 >> 31) & i16)] & 255) + (bArr[i19 + ((i19 >> 31) & i16)] & 255) + (bArr[i21 + (i16 & (i21 >> 31))] & 255);
            i13 += 4;
        }
        while (i13 < this.f99023hw) {
            int i22 = iArr[i13] + i11;
            int i23 = this.f99024r;
            int i24 = i22 - i23;
            i14 += bArr[i24 + (i23 & (i24 >> 31))] & 255;
            i13++;
        }
        return i14;
    }

    private void ctrAll(int[] iArr, byte[] bArr, byte[] bArr2) {
        int i11 = iArr[0];
        int i12 = this.f99024r - i11;
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        System.arraycopy(bArr, 0, bArr2, i12, i11);
        for (int i13 = 1; i13 < this.f99023hw; i13++) {
            int i14 = iArr[i13];
            int i15 = this.f99024r - i14;
            int i16 = i15 - 4;
            int i17 = 0;
            while (i17 <= i16) {
                int i18 = i14 + i17;
                bArr2[i17] = (byte) (bArr2[i17] + (bArr[i18] & 255));
                int i19 = i17 + 1;
                bArr2[i19] = (byte) (bArr2[i19] + (bArr[i18 + 1] & 255));
                int i21 = i17 + 2;
                bArr2[i21] = (byte) (bArr2[i21] + (bArr[i18 + 2] & 255));
                int i22 = i17 + 3;
                bArr2[i22] = (byte) (bArr2[i22] + (bArr[i18 + 3] & 255));
                i17 += 4;
            }
            while (i17 < i15) {
                bArr2[i17] = (byte) (bArr2[i17] + (bArr[i14 + i17] & 255));
                i17++;
            }
            int i23 = this.f99024r - 4;
            int i24 = i15;
            while (i24 <= i23) {
                bArr2[i24] = (byte) (bArr2[i24] + (bArr[i24 - i15] & 255));
                int i25 = i24 + 1;
                bArr2[i25] = (byte) (bArr2[i25] + (bArr[i25 - i15] & 255));
                int i26 = i24 + 2;
                bArr2[i26] = (byte) (bArr2[i26] + (bArr[i26 - i15] & 255));
                int i27 = i24 + 3;
                bArr2[i27] = (byte) (bArr2[i27] + (bArr[i27 - i15] & 255));
                i24 += 4;
            }
            while (i24 < this.f99024r) {
                bArr2[i24] = (byte) (bArr2[i24] + (bArr[i24 - i15] & 255));
                i24++;
            }
        }
    }

    private byte[] functionH(byte[] bArr) {
        byte[] bArr2 = new byte[this.R_BYTE * 2];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr, 0, bArr.length);
        BIKEUtils.generateRandomByteArray(bArr2, this.f99024r * 2, this.f99025t, sHAKEDigest);
        return bArr2;
    }

    private void functionK(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        byte[] bArr5 = new byte[48];
        SHA3Digest sHA3Digest = new SHA3Digest(KyberEngine.KyberPolyBytes);
        sHA3Digest.update(bArr, 0, bArr.length);
        sHA3Digest.update(bArr2, 0, bArr2.length);
        sHA3Digest.update(bArr3, 0, bArr3.length);
        sHA3Digest.doFinal(bArr5, 0);
        System.arraycopy(bArr5, 0, bArr4, 0, this.L_BYTE);
    }

    private void functionL(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[48];
        SHA3Digest sHA3Digest = new SHA3Digest(KyberEngine.KyberPolyBytes);
        sHA3Digest.update(bArr, 0, bArr.length);
        sHA3Digest.update(bArr2, 0, bArr2.length);
        sHA3Digest.doFinal(bArr4, 0);
        System.arraycopy(bArr4, 0, bArr3, 0, this.L_BYTE);
    }

    private int[] getColumnFromCompactVersion(int[] iArr) {
        int[] iArr2 = new int[this.f99023hw];
        int i11 = 0;
        if (iArr[0] != 0) {
            while (true) {
                int i12 = this.f99023hw;
                if (i11 >= i12) {
                    break;
                }
                iArr2[i11] = this.f99024r - iArr[(i12 - 1) - i11];
                i11++;
            }
        } else {
            iArr2[0] = 0;
            int i13 = 1;
            while (true) {
                int i14 = this.f99023hw;
                if (i13 >= i14) {
                    break;
                }
                iArr2[i13] = this.f99024r - iArr[i14 - i13];
                i13++;
            }
        }
        return iArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void recomputeSyndrome(byte[] bArr, int i11, int[] iArr, int[] iArr2, boolean z11) {
        int i12 = 0;
        if (i11 < this.f99024r) {
            while (i12 < this.f99023hw) {
                int i13 = iArr[i12];
                if (i13 <= i11) {
                    int i14 = i11 - i13;
                    bArr[i14] = bArr[i14] ^ (z11 ? 1 : 0) ? (byte) 1 : (byte) 0;
                } else {
                    int i15 = (this.f99024r + i11) - i13;
                    bArr[i15] = bArr[i15] ^ (z11 ? 1 : 0) ? (byte) 1 : (byte) 0;
                }
                i12++;
            }
            return;
        }
        while (i12 < this.f99023hw) {
            int i16 = iArr2[i12];
            int i17 = this.f99024r;
            if (i16 <= i11 - i17) {
                int i18 = (i11 - i17) - i16;
                bArr[i18] = bArr[i18] ^ (z11 ? 1 : 0) ? (byte) 1 : (byte) 0;
            } else {
                int i19 = (i17 - i16) + (i11 - i17);
                bArr[i19] = bArr[i19] ^ (z11 ? 1 : 0) ? (byte) 1 : (byte) 0;
            }
            i12++;
        }
    }

    private void splitEBytes(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i11 = this.f99024r & 7;
        int i12 = 0;
        System.arraycopy(bArr, 0, bArr2, 0, this.R_BYTE - 1);
        int i13 = this.R_BYTE;
        byte b11 = bArr[i13 - 1];
        byte b12 = (byte) ((-1) << i11);
        bArr2[i13 - 1] = (byte) ((~b12) & b11);
        byte b13 = (byte) (b11 & b12);
        while (true) {
            int i14 = this.R_BYTE;
            if (i12 >= i14) {
                return;
            }
            byte b14 = bArr[i14 + i12];
            bArr3[i12] = (byte) (((b13 & 255) >>> i11) | (b14 << (8 - i11)));
            i12++;
            b13 = b14;
        }
    }

    private int threshold(int i11, int i12) {
        if (i12 == 12323) {
            return thresholdFromParameters(i11, 0.0069722d, 13.53d, 36);
        }
        if (i12 == 24659) {
            return thresholdFromParameters(i11, 0.005265d, 15.2588d, 52);
        }
        if (i12 == 40973) {
            return thresholdFromParameters(i11, 0.00402312d, 17.8785d, 69);
        }
        throw new IllegalArgumentException();
    }

    private static int thresholdFromParameters(int i11, double d11, double d12, int i12) {
        return Math.max(i12, (int) Math.floor((d11 * ((double) i11)) + d12));
    }

    private void updateNewErrorIndex(byte[] bArr, int i11, boolean z11) {
        int i12;
        if (i11 != 0 && i11 != (i12 = this.f99024r)) {
            i11 = i11 > i12 ? ((i12 * 2) - i11) + i12 : i12 - i11;
        }
        bArr[i11] = (byte) ((z11 ? 1 : 0) ^ bArr[i11]);
    }

    public void decaps(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        int i11 = this.f99023hw;
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        convertToCompact(iArr, bArr2);
        convertToCompact(iArr2, bArr3);
        byte[] bArrBGFDecoder = BGFDecoder(computeSyndrome(bArr5, bArr2), iArr, iArr2);
        byte[] bArr7 = new byte[this.R_BYTE * 2];
        BIKEUtils.fromBitArrayToByteArray(bArr7, bArrBGFDecoder, 0, this.f99024r * 2);
        int i12 = this.R_BYTE;
        byte[] bArr8 = new byte[i12];
        byte[] bArr9 = new byte[i12];
        splitEBytes(bArr7, bArr8, bArr9);
        byte[] bArr10 = new byte[this.L_BYTE];
        functionL(bArr8, bArr9, bArr10);
        Bytes.xorTo(this.L_BYTE, bArr6, bArr10);
        byte[] bArrFunctionH = functionH(bArr10);
        int i13 = this.R2_BYTE;
        if (Arrays.areEqual(bArr7, 0, i13, bArrFunctionH, 0, i13)) {
            functionK(bArr10, bArr5, bArr6, bArr);
        } else {
            functionK(bArr4, bArr5, bArr6, bArr);
        }
    }

    public void encaps(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, SecureRandom secureRandom) {
        byte[] bArr5 = new byte[this.L_BYTE];
        secureRandom.nextBytes(bArr5);
        byte[] bArrFunctionH = functionH(bArr5);
        int i11 = this.R_BYTE;
        byte[] bArr6 = new byte[i11];
        byte[] bArr7 = new byte[i11];
        splitEBytes(bArrFunctionH, bArr6, bArr7);
        long[] jArrCreate = this.bikeRing.create();
        long[] jArrCreate2 = this.bikeRing.create();
        this.bikeRing.decodeBytes(bArr6, jArrCreate);
        this.bikeRing.decodeBytes(bArr7, jArrCreate2);
        long[] jArrCreate3 = this.bikeRing.create();
        this.bikeRing.decodeBytes(bArr4, jArrCreate3);
        this.bikeRing.multiply(jArrCreate3, jArrCreate2, jArrCreate3);
        this.bikeRing.add(jArrCreate3, jArrCreate, jArrCreate3);
        this.bikeRing.encodeBytes(jArrCreate3, bArr);
        functionL(bArr6, bArr7, bArr2);
        Bytes.xorTo(this.L_BYTE, bArr5, bArr2);
        functionK(bArr5, bArr, bArr2, bArr3);
    }

    public void genKeyPair(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, SecureRandom secureRandom) {
        byte[] bArr5 = new byte[64];
        secureRandom.nextBytes(bArr5);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr5, 0, this.L_BYTE);
        BIKEUtils.generateRandomByteArray(bArr, this.f99024r, this.f99023hw, sHAKEDigest);
        BIKEUtils.generateRandomByteArray(bArr2, this.f99024r, this.f99023hw, sHAKEDigest);
        long[] jArrCreate = this.bikeRing.create();
        long[] jArrCreate2 = this.bikeRing.create();
        this.bikeRing.decodeBytes(bArr, jArrCreate);
        this.bikeRing.decodeBytes(bArr2, jArrCreate2);
        long[] jArrCreate3 = this.bikeRing.create();
        this.bikeRing.inv(jArrCreate, jArrCreate3);
        this.bikeRing.multiply(jArrCreate3, jArrCreate2, jArrCreate3);
        this.bikeRing.encodeBytes(jArrCreate3, bArr4);
        System.arraycopy(bArr5, this.L_BYTE, bArr3, 0, bArr3.length);
    }

    public int getSessionKeySize() {
        return this.L_BYTE;
    }
}
