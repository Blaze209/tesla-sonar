package org.bouncycastle.pqc.crypto.sphincsplus;

import java.util.LinkedList;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
class HT {
    SPHINCSPlusEngine engine;
    final byte[] htPubKey;
    private final byte[] pkSeed;
    private final byte[] skSeed;
    WotsPlus wots;

    public HT(SPHINCSPlusEngine sPHINCSPlusEngine, byte[] bArr, byte[] bArr2) {
        this.skSeed = bArr;
        this.pkSeed = bArr2;
        this.engine = sPHINCSPlusEngine;
        this.wots = new WotsPlus(sPHINCSPlusEngine);
        ADRS adrs = new ADRS();
        adrs.setLayerAddress(sPHINCSPlusEngine.D - 1);
        adrs.setTreeAddress(0L);
        if (bArr != null) {
            this.htPubKey = xmss_PKgen(bArr, bArr2, adrs);
        } else {
            this.htPubKey = null;
        }
    }

    byte[] sign(byte[] bArr, long j11, int i11) {
        ADRS adrs = new ADRS();
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j11);
        HT ht2 = this;
        SIG_XMSS sig_xmssXmss_sign = ht2.xmss_sign(bArr, this.skSeed, i11, this.pkSeed, adrs);
        int i12 = ht2.engine.D;
        SIG_XMSS[] sig_xmssArr = new SIG_XMSS[i12];
        sig_xmssArr[0] = sig_xmssXmss_sign;
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j11);
        byte[] bArrXmss_pkFromSig = ht2.xmss_pkFromSig(i11, sig_xmssXmss_sign, bArr, ht2.pkSeed, adrs);
        int i13 = 1;
        while (true) {
            SPHINCSPlusEngine sPHINCSPlusEngine = ht2.engine;
            if (i13 >= sPHINCSPlusEngine.D) {
                break;
            }
            int i14 = sPHINCSPlusEngine.H_PRIME;
            int i15 = (int) (((long) ((1 << i14) - 1)) & j11);
            j11 >>>= i14;
            adrs.setLayerAddress(i13);
            adrs.setTreeAddress(j11);
            SIG_XMSS sig_xmssXmss_sign2 = ht2.xmss_sign(bArrXmss_pkFromSig, ht2.skSeed, i15, ht2.pkSeed, adrs);
            sig_xmssArr[i13] = sig_xmssXmss_sign2;
            if (i13 < ht2.engine.D - 1) {
                bArrXmss_pkFromSig = ht2.xmss_pkFromSig(i15, sig_xmssXmss_sign2, bArrXmss_pkFromSig, ht2.pkSeed, adrs);
            }
            i13++;
            ht2 = this;
        }
        byte[][] bArr2 = new byte[i12][];
        for (int i16 = 0; i16 != i12; i16++) {
            SIG_XMSS sig_xmss = sig_xmssArr[i16];
            bArr2[i16] = Arrays.concatenate(sig_xmss.sig, Arrays.concatenate(sig_xmss.auth));
        }
        return Arrays.concatenate(bArr2);
    }

    byte[] treehash(byte[] bArr, int i11, int i12, byte[] bArr2, ADRS adrs) {
        ADRS adrs2 = new ADRS(adrs);
        LinkedList linkedList = new LinkedList();
        int i13 = 1 << i12;
        if (i11 % i13 != 0) {
            return null;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            adrs2.setType(0);
            int i15 = i11 + i14;
            adrs2.setKeyPairAddress(i15);
            byte[] bArrPkGen = this.wots.pkGen(bArr, bArr2, adrs2);
            adrs2.setType(2);
            adrs2.setTreeHeight(1);
            adrs2.setTreeIndex(i15);
            while (!linkedList.isEmpty() && ((NodeEntry) linkedList.get(0)).nodeHeight == adrs2.getTreeHeight()) {
                adrs2.setTreeIndex((adrs2.getTreeIndex() - 1) / 2);
                bArrPkGen = this.engine.H(bArr2, adrs2, ((NodeEntry) linkedList.remove(0)).nodeValue, bArrPkGen);
                adrs2.setTreeHeight(adrs2.getTreeHeight() + 1);
            }
            linkedList.add(0, new NodeEntry(bArrPkGen, adrs2.getTreeHeight()));
        }
        return ((NodeEntry) linkedList.get(0)).nodeValue;
    }

    public boolean verify(byte[] bArr, SIG_XMSS[] sig_xmssArr, byte[] bArr2, long j11, int i11, byte[] bArr3) {
        ADRS adrs = new ADRS();
        SIG_XMSS sig_xmss = sig_xmssArr[0];
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j11);
        HT ht2 = this;
        byte[] bArrXmss_pkFromSig = ht2.xmss_pkFromSig(i11, sig_xmss, bArr, bArr2, adrs);
        int i12 = 1;
        while (true) {
            SPHINCSPlusEngine sPHINCSPlusEngine = ht2.engine;
            if (i12 >= sPHINCSPlusEngine.D) {
                return Arrays.areEqual(bArr3, bArrXmss_pkFromSig);
            }
            int i13 = sPHINCSPlusEngine.H_PRIME;
            int i14 = (int) (((long) ((1 << i13) - 1)) & j11);
            j11 >>>= i13;
            SIG_XMSS sig_xmss2 = sig_xmssArr[i12];
            adrs.setLayerAddress(i12);
            adrs.setTreeAddress(j11);
            bArrXmss_pkFromSig = ht2.xmss_pkFromSig(i14, sig_xmss2, bArrXmss_pkFromSig, bArr2, adrs);
            i12++;
            ht2 = this;
        }
    }

    byte[] xmss_PKgen(byte[] bArr, byte[] bArr2, ADRS adrs) {
        return treehash(bArr, 0, this.engine.H_PRIME, bArr2, adrs);
    }

    byte[] xmss_pkFromSig(int i11, SIG_XMSS sig_xmss, byte[] bArr, byte[] bArr2, ADRS adrs) {
        ADRS adrs2 = new ADRS(adrs);
        int i12 = 0;
        adrs2.setType(0);
        adrs2.setKeyPairAddress(i11);
        byte[] wOTSSig = sig_xmss.getWOTSSig();
        byte[][] xmssauth = sig_xmss.getXMSSAUTH();
        byte[] bArrPkFromSig = this.wots.pkFromSig(wOTSSig, bArr, bArr2, adrs2);
        adrs2.setType(2);
        adrs2.setTreeIndex(i11);
        while (i12 < this.engine.H_PRIME) {
            int i13 = i12 + 1;
            adrs2.setTreeHeight(i13);
            if ((i11 / (1 << i12)) % 2 == 0) {
                adrs2.setTreeIndex(adrs2.getTreeIndex() / 2);
                bArrPkFromSig = this.engine.H(bArr2, adrs2, bArrPkFromSig, xmssauth[i12]);
            } else {
                adrs2.setTreeIndex((adrs2.getTreeIndex() - 1) / 2);
                bArrPkFromSig = this.engine.H(bArr2, adrs2, xmssauth[i12], bArrPkFromSig);
            }
            i12 = i13;
        }
        return bArrPkFromSig;
    }

    SIG_XMSS xmss_sign(byte[] bArr, byte[] bArr2, int i11, byte[] bArr3, ADRS adrs) {
        byte[][] bArr4 = new byte[this.engine.H_PRIME][];
        ADRS adrs2 = new ADRS(adrs);
        adrs2.setType(2);
        adrs2.setLayerAddress(adrs.getLayerAddress());
        adrs2.setTreeAddress(adrs.getTreeAddress());
        int i12 = 0;
        while (i12 < this.engine.H_PRIME) {
            int i13 = 1 << i12;
            byte[] bArr5 = bArr2;
            byte[] bArr6 = bArr3;
            bArr4[i12] = treehash(bArr5, (1 ^ (i11 / i13)) * i13, i12, bArr6, adrs2);
            i12++;
            bArr2 = bArr5;
            bArr3 = bArr6;
        }
        byte[] bArr7 = bArr3;
        byte[] bArr8 = bArr2;
        ADRS adrs3 = new ADRS(adrs);
        adrs3.setType(1);
        adrs3.setKeyPairAddress(i11);
        return new SIG_XMSS(this.wots.sign(bArr, bArr8, bArr7, adrs3), bArr4);
    }
}
