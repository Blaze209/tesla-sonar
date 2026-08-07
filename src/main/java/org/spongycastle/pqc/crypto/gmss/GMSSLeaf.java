package org.spongycastle.pqc.crypto.gmss;

import org.spongycastle.crypto.Digest;
import org.spongycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes10.dex */
public class GMSSLeaf {
    private byte[] concHashs;
    private GMSSRandom gmssRandom;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f99750i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f99751j;
    private int keysize;
    private byte[] leaf;
    private int mdsize;
    private Digest messDigestOTS;
    byte[] privateKeyOTS;
    private byte[] seed;
    private int steps;
    private int two_power_w;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f99752w;

    public GMSSLeaf(Digest digest, byte[][] bArr, int[] iArr) {
        this.f99750i = iArr[0];
        this.f99751j = iArr[1];
        this.steps = iArr[2];
        this.f99752w = iArr[3];
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        int iCeil = (int) Math.ceil(((double) (digestSize << 3)) / ((double) this.f99752w));
        this.keysize = iCeil + ((int) Math.ceil(((double) getLog((iCeil << this.f99752w) + 1)) / ((double) this.f99752w)));
        this.two_power_w = 1 << this.f99752w;
        this.privateKeyOTS = bArr[0];
        this.seed = bArr[1];
        this.concHashs = bArr[2];
        this.leaf = bArr[3];
    }

    private int getLog(int i11) {
        int i12 = 1;
        int i13 = 2;
        while (i13 < i11) {
            i13 <<= 1;
            i12++;
        }
        return i12;
    }

    private void updateLeafCalc() {
        byte[] bArr = new byte[this.messDigestOTS.getDigestSize()];
        for (int i11 = 0; i11 < this.steps + 10000; i11++) {
            int i12 = this.f99750i;
            if (i12 == this.keysize && this.f99751j == this.two_power_w - 1) {
                Digest digest = this.messDigestOTS;
                byte[] bArr2 = this.concHashs;
                digest.update(bArr2, 0, bArr2.length);
                byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
                this.leaf = bArr3;
                this.messDigestOTS.doFinal(bArr3, 0);
                return;
            }
            if (i12 == 0 || this.f99751j == this.two_power_w - 1) {
                this.f99750i = i12 + 1;
                this.f99751j = 0;
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
            } else {
                Digest digest2 = this.messDigestOTS;
                byte[] bArr4 = this.privateKeyOTS;
                digest2.update(bArr4, 0, bArr4.length);
                this.privateKeyOTS = bArr;
                this.messDigestOTS.doFinal(bArr, 0);
                int i13 = this.f99751j + 1;
                this.f99751j = i13;
                if (i13 == this.two_power_w - 1) {
                    byte[] bArr5 = this.privateKeyOTS;
                    byte[] bArr6 = this.concHashs;
                    int i14 = this.mdsize;
                    System.arraycopy(bArr5, 0, bArr6, (this.f99750i - 1) * i14, i14);
                }
            }
        }
        throw new IllegalStateException("unable to updateLeaf in steps: " + this.steps + " " + this.f99750i + " " + this.f99751j);
    }

    public byte[] getLeaf() {
        return Arrays.clone(this.leaf);
    }

    public byte[][] getStatByte() {
        int i11 = this.mdsize;
        byte[][] bArr = {new byte[i11], new byte[i11], new byte[this.keysize * i11], new byte[i11]};
        bArr[0] = this.privateKeyOTS;
        bArr[1] = this.seed;
        bArr[2] = this.concHashs;
        bArr[3] = this.leaf;
        return bArr;
    }

    public int[] getStatInt() {
        return new int[]{this.f99750i, this.f99751j, this.steps, this.f99752w};
    }

    void initLeafCalc(byte[] bArr) {
        this.f99750i = 0;
        this.f99751j = 0;
        byte[] bArr2 = new byte[this.mdsize];
        System.arraycopy(bArr, 0, bArr2, 0, this.seed.length);
        this.seed = this.gmssRandom.nextSeed(bArr2);
    }

    GMSSLeaf nextLeaf() {
        GMSSLeaf gMSSLeaf = new GMSSLeaf(this);
        gMSSLeaf.updateLeafCalc();
        return gMSSLeaf;
    }

    public String toString() {
        String str = "";
        for (int i11 = 0; i11 < 4; i11++) {
            str = str + getStatInt()[i11] + " ";
        }
        String str2 = str + " " + this.mdsize + " " + this.keysize + " " + this.two_power_w + " ";
        byte[][] statByte = getStatByte();
        for (int i12 = 0; i12 < 4; i12++) {
            str2 = statByte[i12] != null ? str2 + new String(Hex.encode(statByte[i12])) + " " : str2 + "null ";
        }
        return str2;
    }

    GMSSLeaf(Digest digest, int i11, int i12) {
        this.f99752w = i11;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        double d11 = i11;
        int iCeil = (int) Math.ceil(((double) (digestSize << 3)) / d11);
        int iCeil2 = iCeil + ((int) Math.ceil(((double) getLog((iCeil << i11) + 1)) / d11));
        this.keysize = iCeil2;
        int i13 = 1 << i11;
        this.two_power_w = i13;
        this.steps = (int) Math.ceil(((double) ((((i13 - 1) * iCeil2) + 1) + iCeil2)) / ((double) i12));
        int i14 = this.mdsize;
        this.seed = new byte[i14];
        this.leaf = new byte[i14];
        this.privateKeyOTS = new byte[i14];
        this.concHashs = new byte[i14 * this.keysize];
    }

    public GMSSLeaf(Digest digest, int i11, int i12, byte[] bArr) {
        this.f99752w = i11;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        double d11 = i11;
        int iCeil = (int) Math.ceil(((double) (digestSize << 3)) / d11);
        int iCeil2 = iCeil + ((int) Math.ceil(((double) getLog((iCeil << i11) + 1)) / d11));
        this.keysize = iCeil2;
        int i13 = 1 << i11;
        this.two_power_w = i13;
        this.steps = (int) Math.ceil(((double) ((((i13 - 1) * iCeil2) + 1) + iCeil2)) / ((double) i12));
        int i14 = this.mdsize;
        this.seed = new byte[i14];
        this.leaf = new byte[i14];
        this.privateKeyOTS = new byte[i14];
        this.concHashs = new byte[i14 * this.keysize];
        initLeafCalc(bArr);
    }

    private GMSSLeaf(GMSSLeaf gMSSLeaf) {
        this.messDigestOTS = gMSSLeaf.messDigestOTS;
        this.mdsize = gMSSLeaf.mdsize;
        this.keysize = gMSSLeaf.keysize;
        this.gmssRandom = gMSSLeaf.gmssRandom;
        this.leaf = Arrays.clone(gMSSLeaf.leaf);
        this.concHashs = Arrays.clone(gMSSLeaf.concHashs);
        this.f99750i = gMSSLeaf.f99750i;
        this.f99751j = gMSSLeaf.f99751j;
        this.two_power_w = gMSSLeaf.two_power_w;
        this.f99752w = gMSSLeaf.f99752w;
        this.steps = gMSSLeaf.steps;
        this.seed = Arrays.clone(gMSSLeaf.seed);
        this.privateKeyOTS = Arrays.clone(gMSSLeaf.privateKeyOTS);
    }
}
