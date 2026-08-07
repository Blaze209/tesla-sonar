package org.bouncycastle.pqc.crypto.picnic;

import java.lang.reflect.Array;
import java.util.logging.Logger;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes10.dex */
class Tree {
    private static final Logger LOG = Logger.getLogger(Tree.class.getName());
    private static final int MAX_SEED_SIZE_BYTES = 32;
    private int dataSize;
    private int depth;
    private PicnicEngine engine;
    private boolean[] exists;
    private boolean[] haveNode;
    byte[][] nodes;
    private int numLeaves;
    private int numNodes;

    public Tree(PicnicEngine picnicEngine, int i11, int i12) {
        int i13;
        this.engine = picnicEngine;
        int iCeil_log2 = Utils.ceil_log2(i11);
        int i14 = iCeil_log2 + 1;
        this.depth = i14;
        int i15 = ((1 << i14) - 1) - ((1 << iCeil_log2) - i11);
        this.numNodes = i15;
        this.numLeaves = i11;
        this.dataSize = i12;
        this.nodes = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i15, i12);
        int i16 = 0;
        while (true) {
            i13 = this.numNodes;
            if (i16 >= i13) {
                break;
            }
            this.nodes[i16] = new byte[i12];
            i16++;
        }
        this.haveNode = new boolean[i13];
        boolean[] zArr = new boolean[i13];
        this.exists = zArr;
        Arrays.fill(zArr, i13 - this.numLeaves, i13, true);
        for (int i17 = this.numNodes - this.numLeaves; i17 > 0; i17--) {
            int i18 = i17 * 2;
            if (exists(i18 + 1) || exists(i18 + 2)) {
                this.exists[i17] = true;
            }
        }
        this.exists[0] = true;
    }

    private void computeParentHash(int i11, byte[] bArr) {
        if (exists(i11)) {
            int parent = getParent(i11);
            boolean[] zArr = this.haveNode;
            if (zArr[parent]) {
                return;
            }
            int i12 = parent * 2;
            int i13 = i12 + 1;
            if (zArr[i13]) {
                int i14 = i12 + 2;
                if (!exists(i14) || this.haveNode[i14]) {
                    this.engine.digest.update((byte) 3);
                    PicnicEngine picnicEngine = this.engine;
                    picnicEngine.digest.update(this.nodes[i13], 0, picnicEngine.digestSizeBytes);
                    if (hasRightChild(parent)) {
                        PicnicEngine picnicEngine2 = this.engine;
                        picnicEngine2.digest.update(this.nodes[i14], 0, picnicEngine2.digestSizeBytes);
                    }
                    this.engine.digest.update(bArr, 0, 32);
                    this.engine.digest.update(Pack.intToLittleEndian(parent), 0, 2);
                    PicnicEngine picnicEngine3 = this.engine;
                    picnicEngine3.digest.doFinal(this.nodes[parent], 0, picnicEngine3.digestSizeBytes);
                    this.haveNode[parent] = true;
                }
            }
        }
    }

    private boolean contains(int[] iArr, int i11, int i12) {
        for (int i13 = 0; i13 < i11; i13++) {
            if (iArr[i13] == i12) {
                return true;
            }
        }
        return false;
    }

    private boolean exists(int i11) {
        if (i11 >= this.numNodes) {
            return false;
        }
        return this.exists[i11];
    }

    private void expandSeeds(byte[] bArr, int i11) {
        byte[] bArr2;
        int i12;
        byte[] bArr3 = new byte[64];
        int parent = getParent(this.numNodes - 1);
        int i13 = 0;
        while (i13 <= parent) {
            if (this.haveNode[i13]) {
                bArr2 = bArr;
                i12 = i11;
                hashSeed(bArr3, this.nodes[i13], bArr2, (byte) 1, i12, i13);
                int i14 = i13 * 2;
                int i15 = i14 + 1;
                if (!this.haveNode[i15]) {
                    System.arraycopy(bArr3, 0, this.nodes[i15], 0, this.engine.seedSizeBytes);
                    this.haveNode[i15] = true;
                }
                int i16 = i14 + 2;
                if (exists(i16) && !this.haveNode[i16]) {
                    int i17 = this.engine.seedSizeBytes;
                    System.arraycopy(bArr3, i17, this.nodes[i16], 0, i17);
                    this.haveNode[i16] = true;
                }
            } else {
                bArr2 = bArr;
                i12 = i11;
            }
            i13++;
            bArr = bArr2;
            i11 = i12;
        }
    }

    private int getParent(int i11) {
        return (isLeftChild(i11) ? i11 - 1 : i11 - 2) / 2;
    }

    private int[] getRevealedMerkleNodes(int[] iArr, int i11, int[] iArr2) {
        int i12 = this.numNodes;
        int i13 = i12 - this.numLeaves;
        boolean[] zArr = new boolean[i12];
        for (int i14 = 0; i14 < i11; i14++) {
            zArr[iArr[i14] + i13] = true;
        }
        for (int parent = getParent(this.numNodes - 1); parent > 0; parent--) {
            if (exists(parent)) {
                int i15 = parent * 2;
                int i16 = i15 + 2;
                int i17 = i15 + 1;
                if (exists(i16)) {
                    if (zArr[i17] && zArr[i16]) {
                        zArr[parent] = true;
                    }
                } else if (zArr[i17]) {
                    zArr[parent] = true;
                }
            }
        }
        int[] iArr3 = new int[this.numLeaves];
        int i18 = 0;
        for (int i19 = 0; i19 < i11; i19++) {
            int parent2 = iArr[i19] + i13;
            do {
                if (!zArr[getParent(parent2)]) {
                    if (!contains(iArr3, i18, parent2)) {
                        iArr3[i18] = parent2;
                        i18++;
                        break;
                    }
                    break;
                }
                parent2 = getParent(parent2);
            } while (parent2 != 0);
        }
        iArr2[0] = i18;
        return iArr3;
    }

    private int[] getRevealedNodes(int[] iArr, int i11, int[] iArr2) {
        int i12 = this.depth - 1;
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i12, i11);
        for (int i13 = 0; i13 < i11; i13++) {
            int parent = iArr[i13] + (this.numNodes - this.numLeaves);
            iArr3[0][i13] = parent;
            int i14 = 1;
            while (true) {
                parent = getParent(parent);
                if (parent != 0) {
                    iArr3[i14][i13] = parent;
                    i14++;
                }
            }
        }
        int[] iArr4 = new int[this.numLeaves];
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            for (int i17 = 0; i17 < i11; i17++) {
                if (hasSibling(iArr3[i16][i17])) {
                    int sibling = getSibling(iArr3[i16][i17]);
                    if (!contains(iArr3[i16], i11, sibling)) {
                        while (!hasRightChild(sibling) && !isLeafNode(sibling)) {
                            sibling = (sibling * 2) + 1;
                        }
                        if (!contains(iArr4, i15, sibling)) {
                            iArr4[i15] = sibling;
                            i15++;
                        }
                    }
                }
            }
        }
        iArr2[0] = i15;
        return iArr4;
    }

    private int getSibling(int i11) {
        if (!isLeftChild(i11)) {
            return i11 - 1;
        }
        int i12 = i11 + 1;
        if (i12 < this.numNodes) {
            return i12;
        }
        LOG.fine("getSibling: request for node with not sibling");
        return 0;
    }

    private boolean hasRightChild(int i11) {
        return (i11 * 2) + 2 < this.numNodes && exists(i11);
    }

    private boolean hasSibling(int i11) {
        if (exists(i11)) {
            return !isLeftChild(i11) || exists(i11 + 1);
        }
        return false;
    }

    private void hashSeed(byte[] bArr, byte[] bArr2, byte[] bArr3, byte b11, int i11, int i12) {
        this.engine.digest.update(b11);
        PicnicEngine picnicEngine = this.engine;
        picnicEngine.digest.update(bArr2, 0, picnicEngine.seedSizeBytes);
        this.engine.digest.update(bArr3, 0, 32);
        this.engine.digest.update(Pack.shortToLittleEndian((short) (i11 & 65535)), 0, 2);
        this.engine.digest.update(Pack.shortToLittleEndian((short) (65535 & i12)), 0, 2);
        PicnicEngine picnicEngine2 = this.engine;
        picnicEngine2.digest.doFinal(bArr, 0, picnicEngine2.seedSizeBytes * 2);
    }

    private boolean isLeafNode(int i11) {
        return (i11 * 2) + 1 >= this.numNodes;
    }

    private boolean isLeftChild(int i11) {
        return i11 % 2 == 1;
    }

    protected int addMerkleNodes(int[] iArr, int i11, byte[] bArr, int i12) {
        int[] iArr2 = {0};
        int[] revealedMerkleNodes = getRevealedMerkleNodes(iArr, i11, iArr2);
        for (int i13 = 0; i13 < iArr2[0]; i13++) {
            int i14 = this.dataSize;
            i12 -= i14;
            if (i12 < 0) {
                return -1;
            }
            System.arraycopy(bArr, i13 * i14, this.nodes[revealedMerkleNodes[i13]], 0, i14);
            this.haveNode[revealedMerkleNodes[i13]] = true;
        }
        return i12 != 0 ? -1 : 0;
    }

    protected void buildMerkleTree(byte[][] bArr, byte[] bArr2) {
        int i11 = this.numNodes - this.numLeaves;
        for (int i12 = 0; i12 < this.numLeaves; i12++) {
            byte[] bArr3 = bArr[i12];
            if (bArr3 != null) {
                int i13 = i11 + i12;
                System.arraycopy(bArr3, 0, this.nodes[i13], 0, this.dataSize);
                this.haveNode[i13] = true;
            }
        }
        for (int i14 = this.numNodes; i14 > 0; i14--) {
            computeParentHash(i14, bArr2);
        }
    }

    protected void generateSeeds(byte[] bArr, byte[] bArr2, int i11) {
        this.nodes[0] = bArr;
        this.haveNode[0] = true;
        expandSeeds(bArr2, i11);
    }

    protected byte[] getLeaf(int i11) {
        return this.nodes[(this.numNodes - this.numLeaves) + i11];
    }

    protected byte[][] getLeaves() {
        return this.nodes;
    }

    protected int getLeavesOffset() {
        return this.numNodes - this.numLeaves;
    }

    boolean hasLeftChild(Tree tree, int i11) {
        return (i11 * 2) + 1 < this.numNodes;
    }

    protected byte[] openMerkleTree(int[] iArr, int i11, int[] iArr2) {
        int[] iArr3 = new int[1];
        int[] revealedMerkleNodes = getRevealedMerkleNodes(iArr, i11, iArr3);
        int i12 = iArr3[0] * this.dataSize;
        iArr2[0] = i12;
        byte[] bArr = new byte[i12];
        for (int i13 = 0; i13 < iArr3[0]; i13++) {
            byte[] bArr2 = this.nodes[revealedMerkleNodes[i13]];
            int i14 = this.dataSize;
            System.arraycopy(bArr2, 0, bArr, i13 * i14, i14);
        }
        return bArr;
    }

    protected int openMerkleTreeSize(int[] iArr, int i11) {
        int[] iArr2 = new int[1];
        getRevealedMerkleNodes(iArr, i11, iArr2);
        return iArr2[0] * this.engine.digestSizeBytes;
    }

    protected int reconstructSeeds(int[] iArr, int i11, byte[] bArr, int i12, byte[] bArr2, int i13) {
        int[] iArr2 = {0};
        int[] revealedNodes = getRevealedNodes(iArr, i11, iArr2);
        for (int i14 = 0; i14 < iArr2[0]; i14++) {
            int i15 = this.engine.seedSizeBytes;
            i12 -= i15;
            if (i12 < 0) {
                return -1;
            }
            System.arraycopy(bArr, i14 * i15, this.nodes[revealedNodes[i14]], 0, i15);
            this.haveNode[revealedNodes[i14]] = true;
        }
        expandSeeds(bArr2, i13);
        return 0;
    }

    protected int revealSeeds(int[] iArr, int i11, byte[] bArr, int i12) {
        int[] iArr2 = {0};
        int[] revealedNodes = getRevealedNodes(iArr, i11, iArr2);
        for (int i13 = 0; i13 < iArr2[0]; i13++) {
            int i14 = this.engine.seedSizeBytes;
            i12 -= i14;
            if (i12 < 0) {
                LOG.fine("Insufficient sized buffer provided to revealSeeds");
                return 0;
            }
            System.arraycopy(this.nodes[revealedNodes[i13]], 0, bArr, i13 * i14, i14);
        }
        return bArr.length - i12;
    }

    protected int revealSeedsSize(int[] iArr, int i11) {
        int[] iArr2 = {0};
        getRevealedNodes(iArr, i11, iArr2);
        return iArr2[0] * this.engine.seedSizeBytes;
    }

    protected int verifyMerkleTree(byte[][] bArr, byte[] bArr2) {
        int i11 = this.numNodes - this.numLeaves;
        for (int i12 = 0; i12 < this.numLeaves; i12++) {
            byte[] bArr3 = bArr[i12];
            if (bArr3 != null) {
                int i13 = i11 + i12;
                if (this.haveNode[i13]) {
                    return -1;
                }
                if (bArr3 != null) {
                    System.arraycopy(bArr3, 0, this.nodes[i13], 0, this.dataSize);
                    this.haveNode[i13] = true;
                }
            }
        }
        for (int i14 = this.numNodes; i14 > 0; i14--) {
            computeParentHash(i14, bArr2);
        }
        return !this.haveNode[0] ? -1 : 0;
    }
}
