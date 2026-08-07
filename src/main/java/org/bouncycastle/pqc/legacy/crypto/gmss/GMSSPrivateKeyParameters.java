package org.bouncycastle.pqc.legacy.crypto.gmss;

import java.lang.reflect.Array;
import java.util.Vector;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.WinternitzOTSignature;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class GMSSPrivateKeyParameters extends GMSSKeyParameters {
    private int[] K;
    private byte[][][] currentAuthPaths;
    private Vector[][] currentRetain;
    private byte[][] currentRootSig;
    private byte[][] currentSeeds;
    private Vector[] currentStack;
    private Treehash[][] currentTreehash;
    private GMSSDigestProvider digestProvider;
    private GMSSParameters gmssPS;
    private GMSSRandom gmssRandom;
    private int[] heightOfTrees;
    private int[] index;
    private byte[][][] keep;
    private int mdLength;
    private Digest messDigestTrees;
    private int[] minTreehash;
    private byte[][][] nextAuthPaths;
    private GMSSLeaf[] nextNextLeaf;
    private GMSSRootCalc[] nextNextRoot;
    private byte[][] nextNextSeeds;
    private Vector[][] nextRetain;
    private byte[][] nextRoot;
    private GMSSRootSig[] nextRootSig;
    private Vector[] nextStack;
    private Treehash[][] nextTreehash;
    private int numLayer;
    private int[] numLeafs;
    private int[] otsIndex;
    private GMSSLeaf[] upperLeaf;
    private GMSSLeaf[] upperTreehashLeaf;
    private boolean used;

    private GMSSPrivateKeyParameters(GMSSPrivateKeyParameters gMSSPrivateKeyParameters) {
        super(true, gMSSPrivateKeyParameters.getParameters());
        this.used = false;
        this.index = Arrays.clone(gMSSPrivateKeyParameters.index);
        this.currentSeeds = Arrays.clone(gMSSPrivateKeyParameters.currentSeeds);
        this.nextNextSeeds = Arrays.clone(gMSSPrivateKeyParameters.nextNextSeeds);
        this.currentAuthPaths = Arrays.clone(gMSSPrivateKeyParameters.currentAuthPaths);
        this.nextAuthPaths = Arrays.clone(gMSSPrivateKeyParameters.nextAuthPaths);
        this.currentTreehash = gMSSPrivateKeyParameters.currentTreehash;
        this.nextTreehash = gMSSPrivateKeyParameters.nextTreehash;
        this.currentStack = gMSSPrivateKeyParameters.currentStack;
        this.nextStack = gMSSPrivateKeyParameters.nextStack;
        this.currentRetain = gMSSPrivateKeyParameters.currentRetain;
        this.nextRetain = gMSSPrivateKeyParameters.nextRetain;
        this.keep = Arrays.clone(gMSSPrivateKeyParameters.keep);
        this.nextNextLeaf = gMSSPrivateKeyParameters.nextNextLeaf;
        this.upperLeaf = gMSSPrivateKeyParameters.upperLeaf;
        this.upperTreehashLeaf = gMSSPrivateKeyParameters.upperTreehashLeaf;
        this.minTreehash = gMSSPrivateKeyParameters.minTreehash;
        this.gmssPS = gMSSPrivateKeyParameters.gmssPS;
        this.nextRoot = Arrays.clone(gMSSPrivateKeyParameters.nextRoot);
        this.nextNextRoot = gMSSPrivateKeyParameters.nextNextRoot;
        this.currentRootSig = gMSSPrivateKeyParameters.currentRootSig;
        this.nextRootSig = gMSSPrivateKeyParameters.nextRootSig;
        this.digestProvider = gMSSPrivateKeyParameters.digestProvider;
        this.heightOfTrees = gMSSPrivateKeyParameters.heightOfTrees;
        this.otsIndex = gMSSPrivateKeyParameters.otsIndex;
        this.K = gMSSPrivateKeyParameters.K;
        this.numLayer = gMSSPrivateKeyParameters.numLayer;
        this.messDigestTrees = gMSSPrivateKeyParameters.messDigestTrees;
        this.mdLength = gMSSPrivateKeyParameters.mdLength;
        this.gmssRandom = gMSSPrivateKeyParameters.gmssRandom;
        this.numLeafs = gMSSPrivateKeyParameters.numLeafs;
    }

    private void computeAuthPaths(int i11) {
        int i12;
        byte[] publicKey;
        int i13 = this.index[i11];
        int i14 = this.heightOfTrees[i11];
        int i15 = this.K[i11];
        int i16 = 0;
        while (true) {
            i12 = i14 - i15;
            if (i16 >= i12) {
                break;
            }
            this.currentTreehash[i11][i16].updateNextSeed(this.gmssRandom);
            i16++;
        }
        int iHeightOfPhi = heightOfPhi(i13);
        byte[] bArr = new byte[this.mdLength];
        byte[] bArrNextSeed = this.gmssRandom.nextSeed(this.currentSeeds[i11]);
        int i17 = (i13 >>> (iHeightOfPhi + 1)) & 1;
        int i18 = this.mdLength;
        byte[] bArr2 = new byte[i18];
        int i19 = i14 - 1;
        if (iHeightOfPhi < i19 && i17 == 0) {
            System.arraycopy(this.currentAuthPaths[i11][iHeightOfPhi], 0, bArr2, 0, i18);
        }
        int i21 = this.mdLength;
        byte[] bArr3 = new byte[i21];
        if (iHeightOfPhi == 0) {
            if (i11 == this.numLayer - 1) {
                publicKey = new WinternitzOTSignature(bArrNextSeed, this.digestProvider.get(), this.otsIndex[i11]).getPublicKey();
            } else {
                byte[] bArr4 = new byte[i21];
                System.arraycopy(this.currentSeeds[i11], 0, bArr4, 0, i21);
                this.gmssRandom.nextSeed(bArr4);
                byte[] leaf = this.upperLeaf[i11].getLeaf();
                this.upperLeaf[i11].initLeafCalc(bArr4);
                publicKey = leaf;
            }
            System.arraycopy(publicKey, 0, this.currentAuthPaths[i11][0], 0, this.mdLength);
        } else {
            int i22 = i21 << 1;
            byte[] bArr5 = new byte[i22];
            int i23 = iHeightOfPhi - 1;
            System.arraycopy(this.currentAuthPaths[i11][i23], 0, bArr5, 0, i21);
            byte[] bArr6 = this.keep[i11][(int) Math.floor(i23 / 2)];
            int i24 = this.mdLength;
            System.arraycopy(bArr6, 0, bArr5, i24, i24);
            this.messDigestTrees.update(bArr5, 0, i22);
            this.currentAuthPaths[i11][iHeightOfPhi] = new byte[this.messDigestTrees.getDigestSize()];
            this.messDigestTrees.doFinal(this.currentAuthPaths[i11][iHeightOfPhi], 0);
            for (int i25 = 0; i25 < iHeightOfPhi; i25++) {
                if (i25 < i12) {
                    if (this.currentTreehash[i11][i25].wasFinished()) {
                        System.arraycopy(this.currentTreehash[i11][i25].getFirstNode(), 0, this.currentAuthPaths[i11][i25], 0, this.mdLength);
                        this.currentTreehash[i11][i25].destroy();
                    } else {
                        System.err.println("Treehash (" + i11 + "," + i25 + ") not finished when needed in AuthPathComputation");
                    }
                }
                if (i25 < i19 && i25 >= i12) {
                    int i26 = i25 - i12;
                    if (this.currentRetain[i11][i26].size() > 0) {
                        System.arraycopy(this.currentRetain[i11][i26].lastElement(), 0, this.currentAuthPaths[i11][i25], 0, this.mdLength);
                        Vector vector = this.currentRetain[i11][i26];
                        vector.removeElementAt(vector.size() - 1);
                    }
                }
                if (i25 < i12 && ((1 << i25) * 3) + i13 < this.numLeafs[i11]) {
                    this.currentTreehash[i11][i25].initialize();
                }
            }
        }
        if (iHeightOfPhi < i19 && i17 == 0) {
            System.arraycopy(bArr2, 0, this.keep[i11][(int) Math.floor(iHeightOfPhi / 2)], 0, this.mdLength);
        }
        if (i11 != this.numLayer - 1) {
            this.minTreehash[i11] = getMinTreehashIndex(i11);
            return;
        }
        for (int i27 = 1; i27 <= i12 / 2; i27++) {
            int minTreehashIndex = getMinTreehashIndex(i11);
            if (minTreehashIndex >= 0) {
                try {
                    byte[] bArr7 = new byte[this.mdLength];
                    System.arraycopy(this.currentTreehash[i11][minTreehashIndex].getSeedActive(), 0, bArr7, 0, this.mdLength);
                    this.currentTreehash[i11][minTreehashIndex].update(this.gmssRandom, new WinternitzOTSignature(this.gmssRandom.nextSeed(bArr7), this.digestProvider.get(), this.otsIndex[i11]).getPublicKey());
                } catch (Exception e11) {
                    System.out.println(e11);
                }
            }
        }
    }

    private int getMinTreehashIndex(int i11) {
        int i12 = -1;
        for (int i13 = 0; i13 < this.heightOfTrees[i11] - this.K[i11]; i13++) {
            if (this.currentTreehash[i11][i13].wasInitialized() && !this.currentTreehash[i11][i13].wasFinished() && (i12 == -1 || this.currentTreehash[i11][i13].getLowestNodeHeight() < this.currentTreehash[i11][i12].getLowestNodeHeight())) {
                i12 = i13;
            }
        }
        return i12;
    }

    private int heightOfPhi(int i11) {
        if (i11 == 0) {
            return -1;
        }
        int i12 = 0;
        int i13 = 1;
        while (i11 % i13 == 0) {
            i13 *= 2;
            i12++;
        }
        return i12 - 1;
    }

    private void nextTree(int i11) {
        if (i11 > 0) {
            int[] iArr = this.index;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            int i13 = i11;
            boolean z11 = true;
            do {
                i13--;
                if (this.index[i13] < this.numLeafs[i13]) {
                    z11 = false;
                }
                if (!z11) {
                    break;
                }
            } while (i13 > 0);
            if (z11) {
                return;
            }
            this.gmssRandom.nextSeed(this.currentSeeds[i11]);
            this.nextRootSig[i12].updateSign();
            if (i11 > 1) {
                GMSSLeaf[] gMSSLeafArr = this.nextNextLeaf;
                int i14 = i11 - 2;
                gMSSLeafArr[i14] = gMSSLeafArr[i14].nextLeaf();
            }
            GMSSLeaf[] gMSSLeafArr2 = this.upperLeaf;
            gMSSLeafArr2[i12] = gMSSLeafArr2[i12].nextLeaf();
            if (this.minTreehash[i12] >= 0) {
                GMSSLeaf[] gMSSLeafArr3 = this.upperTreehashLeaf;
                gMSSLeafArr3[i12] = gMSSLeafArr3[i12].nextLeaf();
                try {
                    this.currentTreehash[i12][this.minTreehash[i12]].update(this.gmssRandom, this.upperTreehashLeaf[i12].getLeaf());
                    this.currentTreehash[i12][this.minTreehash[i12]].wasFinished();
                } catch (Exception e11) {
                    System.out.println(e11);
                }
            }
            updateNextNextAuthRoot(i11);
            this.currentRootSig[i12] = this.nextRootSig[i12].getSig();
            for (int i15 = 0; i15 < this.heightOfTrees[i11] - this.K[i11]; i15++) {
                Treehash[] treehashArr = this.currentTreehash[i11];
                Treehash[][] treehashArr2 = this.nextTreehash;
                treehashArr[i15] = treehashArr2[i12][i15];
                treehashArr2[i12][i15] = this.nextNextRoot[i12].getTreehash()[i15];
            }
            for (int i16 = 0; i16 < this.heightOfTrees[i11]; i16++) {
                System.arraycopy(this.nextAuthPaths[i12][i16], 0, this.currentAuthPaths[i11][i16], 0, this.mdLength);
                System.arraycopy(this.nextNextRoot[i12].getAuthPath()[i16], 0, this.nextAuthPaths[i12][i16], 0, this.mdLength);
            }
            for (int i17 = 0; i17 < this.K[i11] - 1; i17++) {
                Vector[] vectorArr = this.currentRetain[i11];
                Vector[][] vectorArr2 = this.nextRetain;
                vectorArr[i17] = vectorArr2[i12][i17];
                vectorArr2[i12][i17] = this.nextNextRoot[i12].getRetain()[i17];
            }
            Vector[] vectorArr3 = this.currentStack;
            Vector[] vectorArr4 = this.nextStack;
            vectorArr3[i11] = vectorArr4[i12];
            vectorArr4[i12] = this.nextNextRoot[i12].getStack();
            this.nextRoot[i12] = this.nextNextRoot[i12].getRoot();
            int i18 = this.mdLength;
            byte[] bArr = new byte[i18];
            byte[] bArr2 = new byte[i18];
            System.arraycopy(this.currentSeeds[i12], 0, bArr2, 0, i18);
            this.gmssRandom.nextSeed(bArr2);
            this.gmssRandom.nextSeed(bArr2);
            this.nextRootSig[i12].initSign(this.gmssRandom.nextSeed(bArr2), this.nextRoot[i12]);
            nextKey(i12);
        }
    }

    private void updateKey(int i11) {
        computeAuthPaths(i11);
        if (i11 > 0) {
            if (i11 > 1) {
                GMSSLeaf[] gMSSLeafArr = this.nextNextLeaf;
                int i12 = i11 - 2;
                gMSSLeafArr[i12] = gMSSLeafArr[i12].nextLeaf();
            }
            GMSSLeaf[] gMSSLeafArr2 = this.upperLeaf;
            int i13 = i11 - 1;
            gMSSLeafArr2[i13] = gMSSLeafArr2[i13].nextLeaf();
            int iFloor = (int) Math.floor(((double) (getNumLeafs(i11) * 2)) / ((double) (this.heightOfTrees[i13] - this.K[i13])));
            int i14 = this.index[i11];
            if (i14 % iFloor == 1) {
                if (i14 > 1 && this.minTreehash[i13] >= 0) {
                    try {
                        this.currentTreehash[i13][this.minTreehash[i13]].update(this.gmssRandom, this.upperTreehashLeaf[i13].getLeaf());
                        this.currentTreehash[i13][this.minTreehash[i13]].wasFinished();
                    } catch (Exception e11) {
                        System.out.println(e11);
                    }
                }
                this.minTreehash[i13] = getMinTreehashIndex(i13);
                int i15 = this.minTreehash[i13];
                if (i15 >= 0) {
                    this.upperTreehashLeaf[i13] = new GMSSLeaf(this.digestProvider.get(), this.otsIndex[i13], iFloor, this.currentTreehash[i13][i15].getSeedActive());
                    GMSSLeaf[] gMSSLeafArr3 = this.upperTreehashLeaf;
                    gMSSLeafArr3[i13] = gMSSLeafArr3[i13].nextLeaf();
                }
            } else if (this.minTreehash[i13] >= 0) {
                GMSSLeaf[] gMSSLeafArr4 = this.upperTreehashLeaf;
                gMSSLeafArr4[i13] = gMSSLeafArr4[i13].nextLeaf();
            }
            this.nextRootSig[i13].updateSign();
            if (this.index[i11] == 1) {
                this.nextNextRoot[i13].initialize(new Vector());
            }
            updateNextNextAuthRoot(i11);
        }
    }

    private void updateNextNextAuthRoot(int i11) {
        byte[] bArr = new byte[this.mdLength];
        int i12 = i11 - 1;
        byte[] bArrNextSeed = this.gmssRandom.nextSeed(this.nextNextSeeds[i12]);
        if (i11 == this.numLayer - 1) {
            this.nextNextRoot[i12].update(this.nextNextSeeds[i12], new WinternitzOTSignature(bArrNextSeed, this.digestProvider.get(), this.otsIndex[i11]).getPublicKey());
        } else {
            this.nextNextRoot[i12].update(this.nextNextSeeds[i12], this.nextNextLeaf[i12].getLeaf());
            this.nextNextLeaf[i12].initLeafCalc(this.nextNextSeeds[i12]);
        }
    }

    public byte[][][] getCurrentAuthPaths() {
        return Arrays.clone(this.currentAuthPaths);
    }

    public byte[][] getCurrentSeeds() {
        return Arrays.clone(this.currentSeeds);
    }

    public int getIndex(int i11) {
        return this.index[i11];
    }

    public GMSSDigestProvider getName() {
        return this.digestProvider;
    }

    public int getNumLeafs(int i11) {
        return this.numLeafs[i11];
    }

    public byte[] getSubtreeRootSig(int i11) {
        return this.currentRootSig[i11];
    }

    public boolean isUsed() {
        return this.used;
    }

    public void markUsed() {
        this.used = true;
    }

    public GMSSPrivateKeyParameters nextKey() {
        GMSSPrivateKeyParameters gMSSPrivateKeyParameters = new GMSSPrivateKeyParameters(this);
        gMSSPrivateKeyParameters.nextKey(this.gmssPS.getNumOfLayers() - 1);
        return gMSSPrivateKeyParameters;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GMSSPrivateKeyParameters(int[] iArr, byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, byte[][][] bArr5, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, GMSSLeaf[] gMSSLeafArr, GMSSLeaf[] gMSSLeafArr2, GMSSLeaf[] gMSSLeafArr3, int[] iArr2, byte[][] bArr6, GMSSRootCalc[] gMSSRootCalcArr, byte[][] bArr7, GMSSRootSig[] gMSSRootSigArr, GMSSParameters gMSSParameters, GMSSDigestProvider gMSSDigestProvider) {
        int i11;
        super(true, gMSSParameters);
        int i12 = 1;
        this.used = false;
        Digest digest = gMSSDigestProvider.get();
        this.messDigestTrees = digest;
        this.mdLength = digest.getDigestSize();
        this.gmssPS = gMSSParameters;
        this.otsIndex = gMSSParameters.getWinternitzParameter();
        this.K = gMSSParameters.getK();
        this.heightOfTrees = gMSSParameters.getHeightOfTrees();
        int numOfLayers = this.gmssPS.getNumOfLayers();
        this.numLayer = numOfLayers;
        if (iArr == null) {
            this.index = new int[numOfLayers];
            for (int i13 = 0; i13 < this.numLayer; i13++) {
                this.index[i13] = 0;
            }
        } else {
            this.index = iArr;
        }
        this.currentSeeds = bArr;
        this.nextNextSeeds = bArr2;
        this.currentAuthPaths = Arrays.clone(bArr3);
        this.nextAuthPaths = bArr4;
        if (bArr5 == null) {
            this.keep = new byte[this.numLayer][][];
            int i14 = 0;
            while (i14 < this.numLayer) {
                byte[][][] bArr8 = this.keep;
                int i15 = i12;
                int iFloor = (int) Math.floor(this.heightOfTrees[i14] / 2);
                int[] iArr3 = new int[2];
                iArr3[i15] = this.mdLength;
                iArr3[0] = iFloor;
                bArr8[i14] = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, iArr3);
                i14++;
                i12 = i15;
            }
            i11 = i12;
        } else {
            i11 = 1;
            this.keep = bArr5;
        }
        if (vectorArr == null) {
            this.currentStack = new Vector[this.numLayer];
            for (int i16 = 0; i16 < this.numLayer; i16++) {
                this.currentStack[i16] = new Vector();
            }
        } else {
            this.currentStack = vectorArr;
        }
        if (vectorArr2 == null) {
            this.nextStack = new Vector[this.numLayer - 1];
            for (int i17 = 0; i17 < this.numLayer - 1; i17++) {
                this.nextStack[i17] = new Vector();
            }
        } else {
            this.nextStack = vectorArr2;
        }
        this.currentTreehash = treehashArr;
        this.nextTreehash = treehashArr2;
        this.currentRetain = vectorArr3;
        this.nextRetain = vectorArr4;
        this.nextRoot = bArr6;
        this.digestProvider = gMSSDigestProvider;
        if (gMSSRootCalcArr == null) {
            this.nextNextRoot = new GMSSRootCalc[this.numLayer - 1];
            int i18 = 0;
            while (i18 < this.numLayer - 1) {
                int i19 = i18 + 1;
                this.nextNextRoot[i18] = new GMSSRootCalc(this.heightOfTrees[i19], this.K[i19], this.digestProvider);
                i18 = i19;
            }
        } else {
            this.nextNextRoot = gMSSRootCalcArr;
        }
        this.currentRootSig = bArr7;
        this.numLeafs = new int[this.numLayer];
        for (int i21 = 0; i21 < this.numLayer; i21++) {
            this.numLeafs[i21] = i11 << this.heightOfTrees[i21];
        }
        this.gmssRandom = new GMSSRandom(this.messDigestTrees);
        int i22 = this.numLayer;
        if (i22 <= i11) {
            this.nextNextLeaf = new GMSSLeaf[0];
        } else if (gMSSLeafArr == null) {
            this.nextNextLeaf = new GMSSLeaf[i22 - 2];
            int i23 = 0;
            while (i23 < this.numLayer - 2) {
                int i24 = i23 + 1;
                this.nextNextLeaf[i23] = new GMSSLeaf(gMSSDigestProvider.get(), this.otsIndex[i24], this.numLeafs[i23 + 2], this.nextNextSeeds[i23]);
                i23 = i24;
            }
        } else {
            this.nextNextLeaf = gMSSLeafArr;
        }
        if (gMSSLeafArr2 == null) {
            this.upperLeaf = new GMSSLeaf[this.numLayer - 1];
            int i25 = 0;
            while (i25 < this.numLayer - 1) {
                int i26 = i25 + 1;
                this.upperLeaf[i25] = new GMSSLeaf(gMSSDigestProvider.get(), this.otsIndex[i25], this.numLeafs[i26], this.currentSeeds[i25]);
                i25 = i26;
            }
        } else {
            this.upperLeaf = gMSSLeafArr2;
        }
        if (gMSSLeafArr3 == null) {
            this.upperTreehashLeaf = new GMSSLeaf[this.numLayer - 1];
            int i27 = 0;
            while (i27 < this.numLayer - 1) {
                int i28 = i27 + 1;
                this.upperTreehashLeaf[i27] = new GMSSLeaf(gMSSDigestProvider.get(), this.otsIndex[i27], this.numLeafs[i28]);
                i27 = i28;
            }
        } else {
            this.upperTreehashLeaf = gMSSLeafArr3;
        }
        if (iArr2 == null) {
            this.minTreehash = new int[this.numLayer - 1];
            for (int i29 = 0; i29 < this.numLayer - 1; i29++) {
                this.minTreehash[i29] = -1;
            }
        } else {
            this.minTreehash = iArr2;
        }
        int i31 = this.mdLength;
        byte[] bArr9 = new byte[i31];
        byte[] bArr10 = new byte[i31];
        if (gMSSRootSigArr != null) {
            this.nextRootSig = gMSSRootSigArr;
            return;
        }
        this.nextRootSig = new GMSSRootSig[this.numLayer - 1];
        int i32 = 0;
        while (i32 < this.numLayer - 1) {
            System.arraycopy(bArr[i32], 0, bArr9, 0, this.mdLength);
            this.gmssRandom.nextSeed(bArr9);
            byte[] bArrNextSeed = this.gmssRandom.nextSeed(bArr9);
            int i33 = i32 + 1;
            this.nextRootSig[i32] = new GMSSRootSig(gMSSDigestProvider.get(), this.otsIndex[i32], this.heightOfTrees[i33]);
            this.nextRootSig[i32].initSign(bArrNextSeed, bArr6[i32]);
            i32 = i33;
        }
    }

    private void nextKey(int i11) {
        int i12 = this.numLayer;
        if (i11 == i12 - 1) {
            int[] iArr = this.index;
            iArr[i11] = iArr[i11] + 1;
        }
        if (this.index[i11] != this.numLeafs[i11]) {
            updateKey(i11);
        } else if (i12 != 1) {
            nextTree(i11);
            this.index[i11] = 0;
        }
    }

    public int[] getIndex() {
        return this.index;
    }

    public GMSSPrivateKeyParameters(byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, byte[][] bArr5, byte[][] bArr6, GMSSParameters gMSSParameters, GMSSDigestProvider gMSSDigestProvider) {
        this(null, bArr, bArr2, bArr3, bArr4, null, treehashArr, treehashArr2, vectorArr, vectorArr2, vectorArr3, vectorArr4, null, null, null, null, bArr5, null, bArr6, null, gMSSParameters, gMSSDigestProvider);
    }
}
