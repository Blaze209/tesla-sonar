package org.bouncycastle.pqc.legacy.crypto.gmss.util;

import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes10.dex */
public class WinternitzOTSignature {
    private int checksumsize;
    private GMSSRandom gmssRandom;
    private int keysize;
    private int mdsize;
    private Digest messDigestOTS;
    private int messagesize;
    private byte[][] privateKeyOTS;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f99211w;

    public WinternitzOTSignature(byte[] bArr, Digest digest, int i11) {
        this.f99211w = i11;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        int i12 = (((digestSize << 3) + i11) - 1) / i11;
        this.messagesize = i12;
        int log = getLog((i12 << i11) + 1);
        this.checksumsize = log;
        int i13 = this.messagesize + (((log + i11) - 1) / i11);
        this.keysize = i13;
        this.privateKeyOTS = new byte[i13][];
        int i14 = this.mdsize;
        byte[] bArr2 = new byte[i14];
        System.arraycopy(bArr, 0, bArr2, 0, i14);
        for (int i15 = 0; i15 < this.keysize; i15++) {
            this.privateKeyOTS[i15] = this.gmssRandom.nextSeed(bArr2);
        }
    }

    private void hashPrivateKeyBlock(int i11, int i12, byte[] bArr, int i13) {
        if (i12 < 1) {
            System.arraycopy(this.privateKeyOTS[i11], 0, bArr, i13, this.mdsize);
            return;
        }
        this.messDigestOTS.update(this.privateKeyOTS[i11], 0, this.mdsize);
        while (true) {
            this.messDigestOTS.doFinal(bArr, i13);
            i12--;
            if (i12 <= 0) {
                return;
            } else {
                this.messDigestOTS.update(bArr, i13, this.mdsize);
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

    public byte[][] getPrivateKey() {
        return this.privateKeyOTS;
    }

    public byte[] getPublicKey() {
        int i11 = this.keysize * this.mdsize;
        byte[] bArr = new byte[i11];
        int i12 = (1 << this.f99211w) - 1;
        int i13 = 0;
        for (int i14 = 0; i14 < this.keysize; i14++) {
            hashPrivateKeyBlock(i14, i12, bArr, i13);
            i13 += this.mdsize;
        }
        this.messDigestOTS.update(bArr, 0, i11);
        byte[] bArr2 = new byte[this.mdsize];
        this.messDigestOTS.doFinal(bArr2, 0);
        return bArr2;
    }

    public byte[] getSignature(byte[] bArr) {
        int i11;
        int i12 = this.keysize;
        int i13 = this.mdsize;
        byte[] bArr2 = new byte[i12 * i13];
        byte[] bArr3 = new byte[i13];
        int i14 = 0;
        this.messDigestOTS.update(bArr, 0, bArr.length);
        this.messDigestOTS.doFinal(bArr3, 0);
        int i15 = this.f99211w;
        char c11 = '\b';
        boolean z11 = true;
        if (8 % i15 == 0) {
            int i16 = 8 / i15;
            int i17 = (1 << i15) - 1;
            int i18 = 0;
            int i19 = 0;
            for (int i21 = 0; i21 < i13; i21++) {
                for (int i22 = 0; i22 < i16; i22++) {
                    int i23 = bArr3[i21] & i17;
                    i18 += i23;
                    hashPrivateKeyBlock(i19, i23, bArr2, this.mdsize * i19);
                    bArr3[i21] = (byte) (bArr3[i21] >>> this.f99211w);
                    i19++;
                }
            }
            int i24 = (this.messagesize << this.f99211w) - i18;
            while (i14 < this.checksumsize) {
                hashPrivateKeyBlock(i19, i24 & i17, bArr2, this.mdsize * i19);
                int i25 = this.f99211w;
                i24 >>>= i25;
                i19++;
                i14 += i25;
            }
        } else if (i15 < 8) {
            int i26 = this.mdsize / i15;
            int i27 = (1 << i15) - 1;
            int i28 = 0;
            int i29 = 0;
            int i31 = 0;
            int i32 = 0;
            while (i28 < i26) {
                boolean z12 = z11;
                long j11 = 0;
                for (int i33 = 0; i33 < this.f99211w; i33++) {
                    j11 ^= (long) ((bArr3[i29] & 255) << (i33 << 3));
                    i29++;
                }
                long j12 = j11;
                for (int i34 = 0; i34 < 8; i34++) {
                    int i35 = ((int) j12) & i27;
                    i32 += i35;
                    hashPrivateKeyBlock(i31, i35, bArr2, this.mdsize * i31);
                    j12 >>>= this.f99211w;
                    i31++;
                }
                i28++;
                z11 = z12;
            }
            int i36 = this.mdsize % this.f99211w;
            long j13 = 0;
            for (int i37 = 0; i37 < i36; i37++) {
                j13 ^= (long) ((bArr3[i29] & 255) << (i37 << 3));
                i29++;
            }
            int i38 = i36 << 3;
            int i39 = 0;
            while (i39 < i38) {
                int i41 = ((int) j13) & i27;
                i32 += i41;
                hashPrivateKeyBlock(i31, i41, bArr2, this.mdsize * i31);
                int i42 = this.f99211w;
                j13 >>>= i42;
                i31++;
                i39 += i42;
            }
            int i43 = (this.messagesize << this.f99211w) - i32;
            while (i14 < this.checksumsize) {
                hashPrivateKeyBlock(i31, i43 & i27, bArr2, this.mdsize * i31);
                int i44 = this.f99211w;
                i43 >>>= i44;
                i31++;
                i14 += i44;
            }
        } else if (i15 < 57) {
            int i45 = this.mdsize;
            int i46 = (i45 << 3) - i15;
            int i47 = (1 << i15) - 1;
            byte[] bArr4 = new byte[i45];
            int i48 = 0;
            int i49 = 0;
            int i51 = 0;
            while (i48 <= i46) {
                int i52 = i48 % 8;
                char c12 = c11;
                i48 += this.f99211w;
                int i53 = (i48 + 7) >>> 3;
                int i54 = 0;
                long j14 = 0;
                for (int i55 = i48 >>> 3; i55 < i53; i55++) {
                    j14 ^= (long) ((bArr3[i55] & 255) << (i54 << 3));
                    i54++;
                }
                long j15 = (j14 >>> i52) & ((long) i47);
                i51 = (int) (((long) i51) + j15);
                System.arraycopy(this.privateKeyOTS[i49], 0, bArr4, 0, this.mdsize);
                while (j15 > 0) {
                    this.messDigestOTS.update(bArr4, 0, i45);
                    this.messDigestOTS.doFinal(bArr4, 0);
                    j15--;
                }
                int i56 = this.mdsize;
                System.arraycopy(bArr4, 0, bArr2, i49 * i56, i56);
                i49++;
                c11 = c12;
            }
            int i57 = i48 >>> 3;
            if (i57 < this.mdsize) {
                int i58 = i48 % 8;
                int i59 = 0;
                long j16 = 0;
                while (true) {
                    i11 = this.mdsize;
                    if (i57 >= i11) {
                        break;
                    }
                    j16 ^= (long) ((bArr3[i57] & 255) << (i59 << 3));
                    i59++;
                    i57++;
                }
                long j17 = (j16 >>> i58) & ((long) i47);
                i51 = (int) (((long) i51) + j17);
                System.arraycopy(this.privateKeyOTS[i49], 0, bArr4, 0, i11);
                while (j17 > 0) {
                    this.messDigestOTS.update(bArr4, 0, i45);
                    this.messDigestOTS.doFinal(bArr4, 0);
                    j17--;
                }
                int i61 = this.mdsize;
                System.arraycopy(bArr4, 0, bArr2, i49 * i61, i61);
                i49++;
            }
            int i62 = (this.messagesize << this.f99211w) - i51;
            int i63 = 0;
            while (i63 < this.checksumsize) {
                System.arraycopy(this.privateKeyOTS[i49], 0, bArr4, 0, this.mdsize);
                for (long j18 = i62 & i47; j18 > 0; j18--) {
                    this.messDigestOTS.update(bArr4, 0, i45);
                    this.messDigestOTS.doFinal(bArr4, 0);
                }
                int i64 = this.mdsize;
                System.arraycopy(bArr4, 0, bArr2, i49 * i64, i64);
                int i65 = this.f99211w;
                i62 >>>= i65;
                i49++;
                i63 += i65;
            }
        }
        return bArr2;
    }
}
