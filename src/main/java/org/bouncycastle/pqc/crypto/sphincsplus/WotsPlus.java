package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes10.dex */
class WotsPlus {
    private final SPHINCSPlusEngine engine;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f99193w;

    WotsPlus(SPHINCSPlusEngine sPHINCSPlusEngine) {
        this.engine = sPHINCSPlusEngine;
        this.f99193w = sPHINCSPlusEngine.WOTS_W;
    }

    void base_w(byte[] bArr, int i11, int i12, int[] iArr, int i13, int i14) {
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < i14) {
            if (i16 == 0) {
                i16 += 8;
                i17 = bArr[i11];
                i11++;
            }
            i16 -= this.engine.WOTS_LOGW;
            iArr[i13] = (i17 >>> i16) & (i12 - 1);
            i15++;
            i13++;
        }
    }

    byte[] chain(byte[] bArr, int i11, int i12, byte[] bArr2, ADRS adrs) {
        if (i12 == 0) {
            return Arrays.clone(bArr);
        }
        if (i11 + i12 > this.f99193w - 1) {
            return null;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            adrs.setHashAddress(i11 + i13);
            bArr = this.engine.F(bArr2, adrs, bArr);
        }
        return bArr;
    }

    public byte[] pkFromSig(byte[] bArr, byte[] bArr2, byte[] bArr3, ADRS adrs) {
        SPHINCSPlusEngine sPHINCSPlusEngine;
        ADRS adrs2 = adrs;
        ADRS adrs3 = new ADRS(adrs2);
        SPHINCSPlusEngine sPHINCSPlusEngine2 = this.engine;
        int[] iArr = new int[sPHINCSPlusEngine2.WOTS_LEN];
        base_w(bArr2, 0, this.f99193w, iArr, 0, sPHINCSPlusEngine2.WOTS_LEN1);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            sPHINCSPlusEngine = this.engine;
            if (i11 >= sPHINCSPlusEngine.WOTS_LEN1) {
                break;
            }
            i12 += (this.f99193w - 1) - iArr[i11];
            i11++;
        }
        int i13 = sPHINCSPlusEngine.WOTS_LEN2;
        int i14 = sPHINCSPlusEngine.WOTS_LOGW;
        byte[] bArrIntToBigEndian = Pack.intToBigEndian(i12 << (8 - ((i13 * i14) % 8)));
        int i15 = 4 - (((i13 * i14) + 7) / 8);
        int i16 = this.f99193w;
        SPHINCSPlusEngine sPHINCSPlusEngine3 = this.engine;
        base_w(bArrIntToBigEndian, i15, i16, iArr, sPHINCSPlusEngine3.WOTS_LEN1, sPHINCSPlusEngine3.WOTS_LEN2);
        SPHINCSPlusEngine sPHINCSPlusEngine4 = this.engine;
        byte[] bArr4 = new byte[sPHINCSPlusEngine4.N];
        byte[][] bArr5 = new byte[sPHINCSPlusEngine4.WOTS_LEN][];
        int i17 = 0;
        while (i17 < this.engine.WOTS_LEN) {
            adrs2.setChainAddress(i17);
            int i18 = this.engine.N;
            System.arraycopy(bArr, i17 * i18, bArr4, 0, i18);
            byte[] bArr6 = bArr4;
            int i19 = iArr[i17];
            bArr5[i17] = chain(bArr6, i19, (this.f99193w - 1) - i19, bArr3, adrs2);
            i17++;
            adrs2 = adrs;
            bArr4 = bArr6;
        }
        adrs3.setType(1);
        adrs3.setKeyPairAddress(adrs.getKeyPairAddress());
        return this.engine.T_l(bArr3, adrs3, Arrays.concatenate(bArr5));
    }

    byte[] pkGen(byte[] bArr, byte[] bArr2, ADRS adrs) {
        ADRS adrs2 = new ADRS(adrs);
        byte[][] bArr3 = new byte[this.engine.WOTS_LEN][];
        int i11 = 0;
        while (i11 < this.engine.WOTS_LEN) {
            ADRS adrs3 = new ADRS(adrs);
            adrs3.setType(5);
            adrs3.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs3.setChainAddress(i11);
            adrs3.setHashAddress(0);
            byte[] bArrPRF = this.engine.PRF(bArr2, bArr, adrs3);
            adrs3.setType(0);
            adrs3.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs3.setChainAddress(i11);
            adrs3.setHashAddress(0);
            byte[] bArr4 = bArr2;
            bArr3[i11] = chain(bArrPRF, 0, this.f99193w - 1, bArr4, adrs3);
            i11++;
            bArr2 = bArr4;
        }
        adrs2.setType(1);
        adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
        return this.engine.T_l(bArr2, adrs2, Arrays.concatenate(bArr3));
    }

    public byte[] sign(byte[] bArr, byte[] bArr2, byte[] bArr3, ADRS adrs) {
        SPHINCSPlusEngine sPHINCSPlusEngine;
        ADRS adrs2 = new ADRS(adrs);
        SPHINCSPlusEngine sPHINCSPlusEngine2 = this.engine;
        int[] iArr = new int[sPHINCSPlusEngine2.WOTS_LEN];
        base_w(bArr, 0, this.f99193w, iArr, 0, sPHINCSPlusEngine2.WOTS_LEN1);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            sPHINCSPlusEngine = this.engine;
            if (i11 >= sPHINCSPlusEngine.WOTS_LEN1) {
                break;
            }
            i12 += (this.f99193w - 1) - iArr[i11];
            i11++;
        }
        int i13 = sPHINCSPlusEngine.WOTS_LOGW;
        if (i13 % 8 != 0) {
            i12 <<= 8 - ((sPHINCSPlusEngine.WOTS_LEN2 * i13) % 8);
        }
        int i14 = ((sPHINCSPlusEngine.WOTS_LEN2 * i13) + 7) / 8;
        byte[] bArrIntToBigEndian = Pack.intToBigEndian(i12);
        int i15 = 4 - i14;
        int i16 = this.f99193w;
        SPHINCSPlusEngine sPHINCSPlusEngine3 = this.engine;
        base_w(bArrIntToBigEndian, i15, i16, iArr, sPHINCSPlusEngine3.WOTS_LEN1, sPHINCSPlusEngine3.WOTS_LEN2);
        byte[][] bArr4 = new byte[this.engine.WOTS_LEN][];
        for (int i17 = 0; i17 < this.engine.WOTS_LEN; i17++) {
            adrs2.setType(5);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setChainAddress(i17);
            adrs2.setHashAddress(0);
            byte[] bArrPRF = this.engine.PRF(bArr3, bArr2, adrs2);
            adrs2.setType(0);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setChainAddress(i17);
            adrs2.setHashAddress(0);
            bArr4[i17] = chain(bArrPRF, 0, iArr[i17], bArr3, adrs2);
        }
        return Arrays.concatenate(bArr4);
    }
}
