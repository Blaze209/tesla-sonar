package org.bouncycastle.pqc.crypto.sphincsplus;

import java.util.LinkedList;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
class Fors {
    SPHINCSPlusEngine engine;

    public Fors(SPHINCSPlusEngine sPHINCSPlusEngine) {
        this.engine = sPHINCSPlusEngine;
    }

    static int[] message_to_idxs(byte[] bArr, int i11, int i12) {
        int[] iArr = new int[i11];
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            iArr[i14] = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                iArr[i14] = iArr[i14] ^ (((bArr[i13 >> 3] >> (i13 & 7)) & 1) << i15);
                i13++;
            }
        }
        return iArr;
    }

    public byte[] pkFromSig(SIG_FORS[] sig_forsArr, byte[] bArr, byte[] bArr2, ADRS adrs) {
        int i11 = 2;
        byte[][] bArr3 = new byte[2][];
        SPHINCSPlusEngine sPHINCSPlusEngine = this.engine;
        int i12 = sPHINCSPlusEngine.K;
        byte[][] bArr4 = new byte[i12][];
        int i13 = sPHINCSPlusEngine.T;
        int[] iArrMessage_to_idxs = message_to_idxs(bArr, i12, sPHINCSPlusEngine.A);
        int i14 = 0;
        while (i14 < this.engine.K) {
            int i15 = iArrMessage_to_idxs[i14];
            byte[] sk2 = sig_forsArr[i14].getSK();
            adrs.setTreeHeight(0);
            int i16 = (i14 * i13) + i15;
            adrs.setTreeIndex(i16);
            bArr3[0] = this.engine.F(bArr2, adrs, sk2);
            byte[][] authPath = sig_forsArr[i14].getAuthPath();
            adrs.setTreeIndex(i16);
            int i17 = 0;
            while (i17 < this.engine.A) {
                int i18 = i17 + 1;
                adrs.setTreeHeight(i18);
                if ((i15 / (1 << i17)) % i11 == 0) {
                    adrs.setTreeIndex(adrs.getTreeIndex() / i11);
                    bArr3[1] = this.engine.H(bArr2, adrs, bArr3[0], authPath[i17]);
                } else {
                    adrs.setTreeIndex((adrs.getTreeIndex() - 1) / 2);
                    bArr3[1] = this.engine.H(bArr2, adrs, authPath[i17], bArr3[0]);
                }
                bArr3[0] = bArr3[1];
                i17 = i18;
                i11 = i11;
            }
            bArr4[i14] = bArr3[0];
            i14++;
            i11 = i11;
        }
        ADRS adrs2 = new ADRS(adrs);
        adrs2.setType(4);
        adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
        return this.engine.T_l(bArr2, adrs2, Arrays.concatenate(bArr4));
    }

    public SIG_FORS[] sign(byte[] bArr, byte[] bArr2, byte[] bArr3, ADRS adrs) {
        Fors fors = this;
        ADRS adrs2 = new ADRS(adrs);
        SPHINCSPlusEngine sPHINCSPlusEngine = fors.engine;
        int[] iArrMessage_to_idxs = message_to_idxs(bArr, sPHINCSPlusEngine.K, sPHINCSPlusEngine.A);
        SPHINCSPlusEngine sPHINCSPlusEngine2 = fors.engine;
        SIG_FORS[] sig_forsArr = new SIG_FORS[sPHINCSPlusEngine2.K];
        int i11 = sPHINCSPlusEngine2.T;
        int i12 = 0;
        while (i12 < fors.engine.K) {
            int i13 = iArrMessage_to_idxs[i12];
            adrs2.setType(6);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setTreeHeight(0);
            int i14 = i12 * i11;
            adrs2.setTreeIndex(i14 + i13);
            byte[] bArr4 = bArr2;
            byte[] bArr5 = bArr3;
            byte[] bArrPRF = fors.engine.PRF(bArr5, bArr4, adrs2);
            adrs2.changeType(3);
            byte[][] bArr6 = new byte[fors.engine.A][];
            int i15 = 0;
            while (i15 < fors.engine.A) {
                int i16 = 1 << i15;
                bArr6[i15] = fors.treehash(bArr4, (((i13 / i16) ^ 1) * i16) + i14, i15, bArr5, adrs2);
                i15++;
                fors = this;
                bArr4 = bArr2;
                bArr5 = bArr3;
            }
            sig_forsArr[i12] = new SIG_FORS(bArrPRF, bArr6);
            i12++;
            fors = this;
        }
        return sig_forsArr;
    }

    byte[] treehash(byte[] bArr, int i11, int i12, byte[] bArr2, ADRS adrs) {
        LinkedList linkedList = new LinkedList();
        int i13 = 1 << i12;
        if (i11 % i13 != 0) {
            return null;
        }
        ADRS adrs2 = new ADRS(adrs);
        for (int i14 = 0; i14 < i13; i14++) {
            adrs2.setType(6);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setTreeHeight(0);
            adrs2.setTreeIndex(i11 + i14);
            byte[] bArrPRF = this.engine.PRF(bArr2, bArr, adrs2);
            adrs2.changeType(3);
            byte[] bArrF = this.engine.F(bArr2, adrs2, bArrPRF);
            adrs2.setTreeHeight(1);
            while (!linkedList.isEmpty() && ((NodeEntry) linkedList.get(0)).nodeHeight == adrs2.getTreeHeight()) {
                adrs2.setTreeIndex((adrs2.getTreeIndex() - 1) / 2);
                bArrF = this.engine.H(bArr2, adrs2, ((NodeEntry) linkedList.remove(0)).nodeValue, bArrF);
                adrs2.setTreeHeight(adrs2.getTreeHeight() + 1);
            }
            linkedList.add(0, new NodeEntry(bArrF, adrs2.getTreeHeight()));
        }
        return ((NodeEntry) linkedList.get(0)).nodeValue;
    }
}
