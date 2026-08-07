package org.bouncycastle.pqc.legacy.crypto.gmss;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes10.dex */
public class GMSSRootSig {
    private long big8;
    private int checksum;
    private int counter;
    private GMSSRandom gmssRandom;
    private byte[] hash;
    private int height;

    /* JADX INFO: renamed from: ii, reason: collision with root package name */
    private int f99206ii;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f99207k;
    private int keysize;
    private int mdsize;
    private Digest messDigestOTS;
    private int messagesize;
    private byte[] privateKeyOTS;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f99208r;
    private byte[] seed;
    private byte[] sign;
    private int steps;
    private int test;
    private long test8;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f99209w;

    public GMSSRootSig(Digest digest, int i11, int i12) {
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        this.f99209w = i11;
        this.height = i12;
        this.f99207k = (1 << i11) - 1;
        this.messagesize = (int) Math.ceil(((double) (digestSize << 3)) / ((double) i11));
    }

    private void oneStep() {
        long j11;
        int i11 = this.f99209w;
        if (8 % i11 == 0) {
            int i12 = this.test;
            if (i12 == 0) {
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
                int i13 = this.f99206ii;
                if (i13 < this.mdsize) {
                    byte[] bArr = this.hash;
                    byte b11 = bArr[i13];
                    this.test = this.f99207k & b11;
                    bArr[i13] = (byte) (b11 >>> this.f99209w);
                } else {
                    int i14 = this.checksum;
                    this.test = this.f99207k & i14;
                    this.checksum = i14 >>> this.f99209w;
                }
            } else if (i12 > 0) {
                Digest digest = this.messDigestOTS;
                byte[] bArr2 = this.privateKeyOTS;
                digest.update(bArr2, 0, bArr2.length);
                byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
                this.privateKeyOTS = bArr3;
                this.messDigestOTS.doFinal(bArr3, 0);
                this.test--;
            }
            if (this.test == 0) {
                byte[] bArr4 = this.privateKeyOTS;
                byte[] bArr5 = this.sign;
                int i15 = this.counter;
                int i16 = this.mdsize;
                System.arraycopy(bArr4, 0, bArr5, i15 * i16, i16);
                int i17 = this.counter + 1;
                this.counter = i17;
                if (i17 % (8 / this.f99209w) == 0) {
                    this.f99206ii++;
                    return;
                }
                return;
            }
            return;
        }
        if (i11 < 8) {
            int i18 = this.test;
            if (i18 == 0) {
                int i19 = this.counter;
                if (i19 % 8 == 0) {
                    int i21 = this.f99206ii;
                    int i22 = this.mdsize;
                    if (i21 < i22) {
                        this.big8 = 0L;
                        if (i19 < ((i22 / i11) << 3)) {
                            for (int i23 = 0; i23 < this.f99209w; i23++) {
                                long j12 = this.big8;
                                byte[] bArr6 = this.hash;
                                int i24 = this.f99206ii;
                                this.big8 = j12 ^ ((long) ((bArr6[i24] & 255) << (i23 << 3)));
                                this.f99206ii = i24 + 1;
                            }
                        } else {
                            for (int i25 = 0; i25 < this.mdsize % this.f99209w; i25++) {
                                long j13 = this.big8;
                                byte[] bArr7 = this.hash;
                                int i26 = this.f99206ii;
                                this.big8 = j13 ^ ((long) ((bArr7[i26] & 255) << (i25 << 3)));
                                this.f99206ii = i26 + 1;
                            }
                        }
                    }
                }
                if (this.counter == this.messagesize) {
                    this.big8 = this.checksum;
                }
                this.test = (int) (this.big8 & ((long) this.f99207k));
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
            } else if (i18 > 0) {
                Digest digest2 = this.messDigestOTS;
                byte[] bArr8 = this.privateKeyOTS;
                digest2.update(bArr8, 0, bArr8.length);
                byte[] bArr9 = new byte[this.messDigestOTS.getDigestSize()];
                this.privateKeyOTS = bArr9;
                this.messDigestOTS.doFinal(bArr9, 0);
                this.test--;
            }
            if (this.test == 0) {
                byte[] bArr10 = this.privateKeyOTS;
                byte[] bArr11 = this.sign;
                int i27 = this.counter;
                int i28 = this.mdsize;
                System.arraycopy(bArr10, 0, bArr11, i27 * i28, i28);
                this.big8 >>>= this.f99209w;
                this.counter++;
                return;
            }
            return;
        }
        if (i11 < 57) {
            long j14 = this.test8;
            if (j14 == 0) {
                this.big8 = 0L;
                this.f99206ii = 0;
                int i29 = this.f99208r;
                int i31 = i29 % 8;
                int i32 = i29 >>> 3;
                int i33 = this.mdsize;
                if (i32 < i33) {
                    if (i29 <= (i33 << 3) - i11) {
                        int i34 = i29 + i11;
                        this.f99208r = i34;
                        i33 = (i34 + 7) >>> 3;
                    } else {
                        this.f99208r = i29 + i11;
                    }
                    while (true) {
                        j11 = this.big8;
                        if (i32 >= i33) {
                            break;
                        }
                        int i35 = this.hash[i32] & 255;
                        int i36 = this.f99206ii;
                        this.big8 = j11 ^ ((long) (i35 << (i36 << 3)));
                        this.f99206ii = i36 + 1;
                        i32++;
                    }
                    long j15 = j11 >>> i31;
                    this.big8 = j15;
                    this.test8 = j15 & ((long) this.f99207k);
                } else {
                    int i37 = this.checksum;
                    this.test8 = this.f99207k & i37;
                    this.checksum = i37 >>> i11;
                }
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
            } else if (j14 > 0) {
                Digest digest3 = this.messDigestOTS;
                byte[] bArr12 = this.privateKeyOTS;
                digest3.update(bArr12, 0, bArr12.length);
                byte[] bArr13 = new byte[this.messDigestOTS.getDigestSize()];
                this.privateKeyOTS = bArr13;
                this.messDigestOTS.doFinal(bArr13, 0);
                this.test8--;
            }
            if (this.test8 == 0) {
                byte[] bArr14 = this.privateKeyOTS;
                byte[] bArr15 = this.sign;
                int i38 = this.counter;
                int i39 = this.mdsize;
                System.arraycopy(bArr14, 0, bArr15, i38 * i39, i39);
                this.counter++;
            }
        }
    }

    public int getLog(int i11) {
        int i12 = 1;
        int i13 = 2;
        while (i13 < i11) {
            i13 <<= 1;
            i12++;
        }
        return i12;
    }

    public byte[] getSig() {
        return this.sign;
    }

    public byte[][] getStatByte() {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 5, this.mdsize);
        bArr[0] = this.privateKeyOTS;
        bArr[1] = this.seed;
        bArr[2] = this.hash;
        bArr[3] = this.sign;
        bArr[4] = getStatLong();
        return bArr;
    }

    public int[] getStatInt() {
        return new int[]{this.counter, this.test, this.f99206ii, this.f99208r, this.steps, this.keysize, this.height, this.f99209w, this.checksum};
    }

    public byte[] getStatLong() {
        long j11 = this.test8;
        long j12 = this.big8;
        return new byte[]{(byte) (j11 & 255), (byte) ((j11 >> 8) & 255), (byte) ((j11 >> 16) & 255), (byte) ((j11 >> 24) & 255), (byte) ((j11 >> 32) & 255), (byte) ((j11 >> 40) & 255), (byte) ((j11 >> 48) & 255), (byte) ((j11 >> 56) & 255), (byte) (j12 & 255), (byte) ((j12 >> 8) & 255), (byte) ((j12 >> 16) & 255), (byte) ((j12 >> 24) & 255), (byte) ((j12 >> 32) & 255), (byte) ((j12 >> 40) & 255), (byte) ((j12 >> 48) & 255), (byte) ((j12 >> 56) & 255)};
    }

    public void initSign(byte[] bArr, byte[] bArr2) {
        int i11;
        int i12;
        this.hash = new byte[this.mdsize];
        this.messDigestOTS.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
        this.hash = bArr3;
        this.messDigestOTS.doFinal(bArr3, 0);
        int i13 = this.mdsize;
        byte[] bArr4 = new byte[i13];
        System.arraycopy(this.hash, 0, bArr4, 0, i13);
        int log = getLog((this.messagesize << this.f99209w) + 1);
        int i14 = this.f99209w;
        int i15 = 8;
        if (8 % i14 == 0) {
            int i16 = 8 / i14;
            i11 = 0;
            for (int i17 = 0; i17 < this.mdsize; i17++) {
                for (int i18 = 0; i18 < i16; i18++) {
                    byte b11 = bArr4[i17];
                    i11 += this.f99207k & b11;
                    bArr4[i17] = (byte) (b11 >>> this.f99209w);
                }
            }
            int i19 = (this.messagesize << this.f99209w) - i11;
            this.checksum = i19;
            int i21 = 0;
            while (i21 < log) {
                i11 += this.f99207k & i19;
                int i22 = this.f99209w;
                i19 >>>= i22;
                i21 += i22;
            }
        } else if (i14 < 8) {
            int i23 = this.mdsize / i14;
            int i24 = 0;
            int i25 = 0;
            for (int i26 = 0; i26 < i23; i26++) {
                long j11 = 0;
                for (int i27 = 0; i27 < this.f99209w; i27++) {
                    j11 ^= (long) ((bArr4[i24] & 255) << (i27 << 3));
                    i24++;
                }
                int i28 = 0;
                while (i28 < i15) {
                    i25 += (int) (((long) this.f99207k) & j11);
                    j11 >>>= this.f99209w;
                    i28++;
                    i15 = i15;
                    i23 = i23;
                }
            }
            int i29 = this.mdsize % this.f99209w;
            long j12 = 0;
            for (int i31 = 0; i31 < i29; i31++) {
                j12 ^= (long) ((bArr4[i24] & 255) << (i31 << 3));
                i24++;
            }
            int i32 = i29 << 3;
            int i33 = 0;
            while (i33 < i32) {
                i25 += (int) (((long) this.f99207k) & j12);
                int i34 = this.f99209w;
                j12 >>>= i34;
                i33 += i34;
            }
            int i35 = (this.messagesize << this.f99209w) - i25;
            this.checksum = i35;
            int i36 = 0;
            i11 = i25;
            while (i36 < log) {
                i11 += this.f99207k & i35;
                int i37 = this.f99209w;
                i35 >>>= i37;
                i36 += i37;
            }
        } else if (i14 < 57) {
            int i38 = 0;
            int i39 = 0;
            while (true) {
                i12 = this.mdsize;
                int i41 = this.f99209w;
                if (i38 > (i12 << 3) - i41) {
                    break;
                }
                int i42 = i38 % 8;
                i38 += i41;
                int i43 = (i38 + 7) >>> 3;
                int i44 = 0;
                long j13 = 0;
                for (int i45 = i38 >>> 3; i45 < i43; i45++) {
                    j13 ^= (long) ((bArr4[i45] & 255) << (i44 << 3));
                    i44++;
                }
                i39 = (int) (((long) i39) + ((j13 >>> i42) & ((long) this.f99207k)));
            }
            int i46 = i38 >>> 3;
            if (i46 < i12) {
                int i47 = i38 % 8;
                int i48 = 0;
                long j14 = 0;
                while (i46 < this.mdsize) {
                    j14 ^= (long) ((bArr4[i46] & 255) << (i48 << 3));
                    i48++;
                    i46++;
                }
                i39 = (int) (((long) i39) + ((j14 >>> i47) & ((long) this.f99207k)));
            }
            int i49 = (this.messagesize << this.f99209w) - i39;
            this.checksum = i49;
            int i51 = 0;
            i11 = i39;
            while (i51 < log) {
                i11 += this.f99207k & i49;
                int i52 = this.f99209w;
                i49 >>>= i52;
                i51 += i52;
            }
        } else {
            i11 = 0;
        }
        int iCeil = this.messagesize + ((int) Math.ceil(((double) log) / ((double) this.f99209w)));
        this.keysize = iCeil;
        this.steps = (int) Math.ceil(((double) (iCeil + i11)) / ((double) (1 << this.height)));
        int i53 = this.keysize;
        int i54 = this.mdsize;
        this.sign = new byte[i53 * i54];
        this.counter = 0;
        this.test = 0;
        this.f99206ii = 0;
        this.test8 = 0L;
        this.f99208r = 0;
        this.privateKeyOTS = new byte[i54];
        byte[] bArr5 = new byte[i54];
        this.seed = bArr5;
        System.arraycopy(bArr, 0, bArr5, 0, i54);
    }

    public String toString() {
        String str = "" + this.big8 + "  ";
        int[] statInt = getStatInt();
        byte[][] statByte = getStatByte();
        for (int i11 = 0; i11 < 9; i11++) {
            str = str + statInt[i11] + " ";
        }
        for (int i12 = 0; i12 < 5; i12++) {
            str = str + new String(Hex.encode(statByte[i12])) + " ";
        }
        return str;
    }

    public boolean updateSign() {
        for (int i11 = 0; i11 < this.steps; i11++) {
            if (this.counter < this.keysize) {
                oneStep();
            }
            if (this.counter == this.keysize) {
                return true;
            }
        }
        return false;
    }

    public GMSSRootSig(Digest digest, byte[][] bArr, int[] iArr) {
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.counter = iArr[0];
        this.test = iArr[1];
        this.f99206ii = iArr[2];
        this.f99208r = iArr[3];
        this.steps = iArr[4];
        this.keysize = iArr[5];
        this.height = iArr[6];
        this.f99209w = iArr[7];
        this.checksum = iArr[8];
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        int i11 = this.f99209w;
        this.f99207k = (1 << i11) - 1;
        this.messagesize = (int) Math.ceil(((double) (digestSize << 3)) / ((double) i11));
        this.privateKeyOTS = bArr[0];
        this.seed = bArr[1];
        this.hash = bArr[2];
        this.sign = bArr[3];
        byte[] bArr2 = bArr[4];
        this.test8 = (((long) (bArr2[2] & 255)) << 16) | ((long) (bArr2[0] & 255)) | (((long) (bArr2[1] & 255)) << 8) | (((long) (bArr2[3] & 255)) << 24) | (((long) (bArr2[4] & 255)) << 32) | (((long) (bArr2[5] & 255)) << 40) | (((long) (bArr2[6] & 255)) << 48) | (((long) (bArr2[7] & 255)) << 56);
        this.big8 = (((long) (bArr2[15] & 255)) << 56) | ((long) (bArr2[8] & 255)) | (((long) (bArr2[9] & 255)) << 8) | (((long) (bArr2[10] & 255)) << 16) | (((long) (bArr2[11] & 255)) << 24) | (((long) (bArr2[12] & 255)) << 32) | (((long) (bArr2[13] & 255)) << 40) | (((long) (bArr2[14] & 255)) << 48);
    }
}
