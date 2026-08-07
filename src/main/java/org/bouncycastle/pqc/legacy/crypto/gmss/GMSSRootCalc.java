package org.bouncycastle.pqc.legacy.crypto.gmss;

import java.lang.reflect.Array;
import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes10.dex */
public class GMSSRootCalc {
    private byte[][] AuthPath;
    private int K;
    private GMSSDigestProvider digestProvider;
    private int heightOfNextSeed;
    private Vector heightOfNodes;
    private int heightOfTree;
    private int[] index;
    private int indexForNextSeed;
    private boolean isFinished;
    private boolean isInitialized;
    private int mdLength;
    private Digest messDigestTree;
    private Vector[] retain;
    private byte[] root;
    private Vector tailStack;
    private Treehash[] treehash;

    public GMSSRootCalc(int i11, int i12, GMSSDigestProvider gMSSDigestProvider) {
        this.heightOfTree = i11;
        this.digestProvider = gMSSDigestProvider;
        Digest digest = gMSSDigestProvider.get();
        this.messDigestTree = digest;
        int digestSize = digest.getDigestSize();
        this.mdLength = digestSize;
        this.K = i12;
        this.index = new int[i11];
        int[] iArr = {i11, digestSize};
        this.AuthPath = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, iArr);
        this.root = new byte[this.mdLength];
        this.retain = new Vector[this.K - 1];
        for (int i13 = 0; i13 < i12 - 1; i13++) {
            this.retain[i13] = new Vector();
        }
    }

    public byte[][] getAuthPath() {
        return GMSSUtils.clone(this.AuthPath);
    }

    public Vector[] getRetain() {
        return GMSSUtils.clone(this.retain);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.root);
    }

    public Vector getStack() {
        Vector vector = new Vector();
        Enumeration enumerationElements = this.tailStack.elements();
        while (enumerationElements.hasMoreElements()) {
            vector.addElement(enumerationElements.nextElement());
        }
        return vector;
    }

    public byte[][] getStatByte() {
        Vector vector = this.tailStack;
        int size = vector == null ? 0 : vector.size();
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.heightOfTree + 1 + size, 64);
        bArr[0] = this.root;
        int i11 = 0;
        while (i11 < this.heightOfTree) {
            int i12 = i11 + 1;
            bArr[i12] = this.AuthPath[i11];
            i11 = i12;
        }
        for (int i13 = 0; i13 < size; i13++) {
            bArr[this.heightOfTree + 1 + i13] = (byte[]) this.tailStack.elementAt(i13);
        }
        return bArr;
    }

    public int[] getStatInt() {
        Vector vector = this.tailStack;
        int size = vector == null ? 0 : vector.size();
        int i11 = this.heightOfTree;
        int[] iArr = new int[i11 + 8 + size];
        iArr[0] = i11;
        iArr[1] = this.mdLength;
        iArr[2] = this.K;
        iArr[3] = this.indexForNextSeed;
        iArr[4] = this.heightOfNextSeed;
        if (this.isFinished) {
            iArr[5] = 1;
        } else {
            iArr[5] = 0;
        }
        if (this.isInitialized) {
            iArr[6] = 1;
        } else {
            iArr[6] = 0;
        }
        iArr[7] = size;
        for (int i12 = 0; i12 < this.heightOfTree; i12++) {
            iArr[i12 + 8] = this.index[i12];
        }
        for (int i13 = 0; i13 < size; i13++) {
            iArr[this.heightOfTree + 8 + i13] = ((Integer) this.heightOfNodes.elementAt(i13)).intValue();
        }
        return iArr;
    }

    public Treehash[] getTreehash() {
        return GMSSUtils.clone(this.treehash);
    }

    public void initialize(Vector vector) {
        int i11;
        this.treehash = new Treehash[this.heightOfTree - this.K];
        int i12 = 0;
        while (true) {
            i11 = this.heightOfTree;
            if (i12 >= i11 - this.K) {
                break;
            }
            this.treehash[i12] = new Treehash(vector, i12, this.digestProvider.get());
            i12++;
        }
        this.index = new int[i11];
        this.AuthPath = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, this.mdLength);
        this.root = new byte[this.mdLength];
        this.tailStack = new Vector();
        this.heightOfNodes = new Vector();
        this.isInitialized = true;
        this.isFinished = false;
        for (int i13 = 0; i13 < this.heightOfTree; i13++) {
            this.index[i13] = -1;
        }
        this.retain = new Vector[this.K - 1];
        for (int i14 = 0; i14 < this.K - 1; i14++) {
            this.retain[i14] = new Vector();
        }
        this.indexForNextSeed = 3;
        this.heightOfNextSeed = 0;
    }

    public void initializeTreehashSeed(byte[] bArr, int i11) {
        this.treehash[i11].initializeSeed(bArr);
    }

    public String toString() {
        Vector vector = this.tailStack;
        int size = vector == null ? 0 : vector.size();
        String str = "";
        for (int i11 = 0; i11 < this.heightOfTree + 8 + size; i11++) {
            str = str + getStatInt()[i11] + " ";
        }
        for (int i12 = 0; i12 < this.heightOfTree + 1 + size; i12++) {
            str = str + new String(Hex.encode(getStatByte()[i12])) + " ";
        }
        return str + "  " + this.digestProvider.get().getDigestSize();
    }

    public void update(byte[] bArr) {
        if (this.isFinished) {
            System.out.print("Too much updates for Tree!!");
            return;
        }
        if (!this.isInitialized) {
            System.err.println("GMSSRootCalc not initialized!");
            return;
        }
        int[] iArr = this.index;
        int i11 = iArr[0] + 1;
        iArr[0] = i11;
        if (i11 == 1) {
            System.arraycopy(bArr, 0, this.AuthPath[0], 0, this.mdLength);
        } else if (i11 == 3 && this.heightOfTree > this.K) {
            this.treehash[0].setFirstNode(bArr);
        }
        int i12 = this.index[0];
        if ((i12 - 3) % 2 == 0 && i12 >= 3 && this.heightOfTree == this.K) {
            this.retain[0].insertElementAt(bArr, 0);
        }
        if (this.index[0] == 0) {
            this.tailStack.addElement(bArr);
            this.heightOfNodes.addElement(Integers.valueOf(0));
            return;
        }
        int i13 = this.mdLength;
        byte[] bArr2 = new byte[i13];
        int i14 = i13 << 1;
        byte[] bArr3 = new byte[i14];
        System.arraycopy(bArr, 0, bArr2, 0, i13);
        int i15 = 0;
        while (this.tailStack.size() > 0 && i15 == ((Integer) this.heightOfNodes.lastElement()).intValue()) {
            System.arraycopy(this.tailStack.lastElement(), 0, bArr3, 0, this.mdLength);
            Vector vector = this.tailStack;
            vector.removeElementAt(vector.size() - 1);
            Vector vector2 = this.heightOfNodes;
            vector2.removeElementAt(vector2.size() - 1);
            int i16 = this.mdLength;
            System.arraycopy(bArr2, 0, bArr3, i16, i16);
            this.messDigestTree.update(bArr3, 0, i14);
            bArr2 = new byte[this.messDigestTree.getDigestSize()];
            this.messDigestTree.doFinal(bArr2, 0);
            i15++;
            if (i15 < this.heightOfTree) {
                int[] iArr2 = this.index;
                int i17 = iArr2[i15] + 1;
                iArr2[i15] = i17;
                if (i17 == 1) {
                    System.arraycopy(bArr2, 0, this.AuthPath[i15], 0, this.mdLength);
                }
                if (i15 >= this.heightOfTree - this.K) {
                    if (i15 == 0) {
                        System.out.println("M���P");
                    }
                    int i18 = this.index[i15];
                    if ((i18 - 3) % 2 == 0 && i18 >= 3) {
                        this.retain[i15 - (this.heightOfTree - this.K)].insertElementAt(bArr2, 0);
                    }
                } else if (this.index[i15] == 3) {
                    this.treehash[i15].setFirstNode(bArr2);
                }
            }
        }
        this.tailStack.addElement(bArr2);
        this.heightOfNodes.addElement(Integers.valueOf(i15));
        if (i15 == this.heightOfTree) {
            this.isFinished = true;
            this.isInitialized = false;
            this.root = (byte[]) this.tailStack.lastElement();
        }
    }

    public boolean wasFinished() {
        return this.isFinished;
    }

    public boolean wasInitialized() {
        return this.isInitialized;
    }

    public void update(byte[] bArr, byte[] bArr2) {
        int i11 = this.heightOfNextSeed;
        if (i11 < this.heightOfTree - this.K && this.indexForNextSeed - 2 == this.index[0]) {
            initializeTreehashSeed(bArr, i11);
            this.heightOfNextSeed++;
            this.indexForNextSeed *= 2;
        }
        update(bArr2);
    }
}
