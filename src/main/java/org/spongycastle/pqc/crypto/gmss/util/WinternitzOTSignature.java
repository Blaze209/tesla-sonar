package org.spongycastle.pqc.crypto.gmss.util;

import java.lang.reflect.Array;
import org.spongycastle.crypto.Digest;

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
    private int f99758w;

    public WinternitzOTSignature(byte[] bArr, Digest digest, int i11) {
        this.f99758w = i11;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        double d11 = i11;
        int iCeil = (int) Math.ceil(((double) (digestSize << 3)) / d11);
        this.messagesize = iCeil;
        int log = getLog((iCeil << i11) + 1);
        this.checksumsize = log;
        int iCeil2 = this.messagesize + ((int) Math.ceil(((double) log) / d11));
        this.keysize = iCeil2;
        this.privateKeyOTS = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, iCeil2, this.mdsize);
        int i12 = this.mdsize;
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, 0, bArr2, 0, i12);
        for (int i13 = 0; i13 < this.keysize; i13++) {
            this.privateKeyOTS[i13] = this.gmssRandom.nextSeed(bArr2);
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
        int i11 = this.keysize;
        int i12 = this.mdsize;
        int i13 = i11 * i12;
        byte[] bArr = new byte[i13];
        byte[] bArr2 = new byte[i12];
        int i14 = 1 << this.f99758w;
        for (int i15 = 0; i15 < this.keysize; i15++) {
            Digest digest = this.messDigestOTS;
            byte[] bArr3 = this.privateKeyOTS[i15];
            digest.update(bArr3, 0, bArr3.length);
            byte[] bArr4 = new byte[this.messDigestOTS.getDigestSize()];
            this.messDigestOTS.doFinal(bArr4, 0);
            for (int i16 = 2; i16 < i14; i16++) {
                this.messDigestOTS.update(bArr4, 0, bArr4.length);
                bArr4 = new byte[this.messDigestOTS.getDigestSize()];
                this.messDigestOTS.doFinal(bArr4, 0);
            }
            int i17 = this.mdsize;
            System.arraycopy(bArr4, 0, bArr, i17 * i15, i17);
        }
        this.messDigestOTS.update(bArr, 0, i13);
        byte[] bArr5 = new byte[this.messDigestOTS.getDigestSize()];
        this.messDigestOTS.doFinal(bArr5, 0);
        return bArr5;
    }

    public byte[] getSignature(byte[] bArr) {
        int i11;
        int i12 = this.keysize;
        int i13 = this.mdsize;
        byte[] bArr2 = new byte[i12 * i13];
        byte[] bArr3 = new byte[i13];
        this.messDigestOTS.update(bArr, 0, bArr.length);
        int digestSize = this.messDigestOTS.getDigestSize();
        byte[] bArr4 = new byte[digestSize];
        this.messDigestOTS.doFinal(bArr4, 0);
        int i14 = this.f99758w;
        char c11 = '\b';
        boolean z11 = true;
        if (8 % i14 == 0) {
            int i15 = 8 / i14;
            int i16 = (1 << i14) - 1;
            byte[] bArr5 = new byte[this.mdsize];
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < digestSize; i19++) {
                for (int i21 = 0; i21 < i15; i21++) {
                    int i22 = bArr4[i19] & i16;
                    i17 += i22;
                    System.arraycopy(this.privateKeyOTS[i18], 0, bArr5, 0, this.mdsize);
                    while (i22 > 0) {
                        this.messDigestOTS.update(bArr5, 0, bArr5.length);
                        bArr5 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr5, 0);
                        i22--;
                    }
                    int i23 = this.mdsize;
                    System.arraycopy(bArr5, 0, bArr2, i18 * i23, i23);
                    bArr4[i19] = (byte) (bArr4[i19] >>> this.f99758w);
                    i18++;
                }
            }
            int i24 = (this.messagesize << this.f99758w) - i17;
            int i25 = 0;
            while (i25 < this.checksumsize) {
                System.arraycopy(this.privateKeyOTS[i18], 0, bArr5, 0, this.mdsize);
                for (int i26 = i24 & i16; i26 > 0; i26--) {
                    this.messDigestOTS.update(bArr5, 0, bArr5.length);
                    bArr5 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr5, 0);
                }
                int i27 = this.mdsize;
                System.arraycopy(bArr5, 0, bArr2, i18 * i27, i27);
                int i28 = this.f99758w;
                i24 >>>= i28;
                i18++;
                i25 += i28;
            }
        } else if (i14 < 8) {
            int i29 = this.mdsize;
            int i31 = i29 / i14;
            int i32 = (1 << i14) - 1;
            byte[] bArr6 = new byte[i29];
            int i33 = 0;
            int i34 = 0;
            int i35 = 0;
            int i36 = 0;
            while (i33 < i31) {
                boolean z12 = z11;
                long j11 = 0;
                for (int i37 = 0; i37 < this.f99758w; i37++) {
                    j11 ^= (long) ((bArr4[i34] & 255) << (i37 << 3));
                    i34++;
                }
                for (int i38 = 0; i38 < 8; i38++) {
                    int i39 = (int) (j11 & ((long) i32));
                    i36 += i39;
                    System.arraycopy(this.privateKeyOTS[i35], 0, bArr6, 0, this.mdsize);
                    while (i39 > 0) {
                        this.messDigestOTS.update(bArr6, 0, bArr6.length);
                        bArr6 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr6, 0);
                        i39--;
                    }
                    int i41 = this.mdsize;
                    System.arraycopy(bArr6, 0, bArr2, i35 * i41, i41);
                    j11 >>>= this.f99758w;
                    i35++;
                }
                i33++;
                z11 = z12;
            }
            int i42 = this.mdsize % this.f99758w;
            int i43 = 0;
            long j12 = 0;
            while (i43 < i42) {
                j12 ^= (long) ((bArr4[i34] & 255) << (i43 << 3));
                i34++;
                i43++;
                i42 = i42;
            }
            int i44 = i42 << 3;
            int i45 = 0;
            while (i45 < i44) {
                int i46 = (int) (((long) i32) & j12);
                i36 += i46;
                System.arraycopy(this.privateKeyOTS[i35], 0, bArr6, 0, this.mdsize);
                while (i46 > 0) {
                    this.messDigestOTS.update(bArr6, 0, bArr6.length);
                    bArr6 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr6, 0);
                    i46--;
                }
                int i47 = this.mdsize;
                System.arraycopy(bArr6, 0, bArr2, i35 * i47, i47);
                int i48 = this.f99758w;
                j12 >>>= i48;
                i35++;
                i45 += i48;
            }
            int i49 = (this.messagesize << this.f99758w) - i36;
            int i51 = 0;
            while (i51 < this.checksumsize) {
                System.arraycopy(this.privateKeyOTS[i35], 0, bArr6, 0, this.mdsize);
                for (int i52 = i49 & i32; i52 > 0; i52--) {
                    this.messDigestOTS.update(bArr6, 0, bArr6.length);
                    bArr6 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr6, 0);
                }
                int i53 = this.mdsize;
                System.arraycopy(bArr6, 0, bArr2, i35 * i53, i53);
                int i54 = this.f99758w;
                i49 >>>= i54;
                i35++;
                i51 += i54;
            }
        } else if (i14 < 57) {
            int i55 = this.mdsize;
            int i56 = (i55 << 3) - i14;
            int i57 = (1 << i14) - 1;
            byte[] bArr7 = new byte[i55];
            int i58 = 0;
            int i59 = 0;
            int i61 = 0;
            while (i58 <= i56) {
                int i62 = i58 >>> 3;
                int i63 = i58 % 8;
                i58 += this.f99758w;
                int i64 = (i58 + 7) >>> 3;
                long j13 = 0;
                int i65 = 0;
                while (i62 < i64) {
                    j13 ^= (long) ((bArr4[i62] & 255) << (i65 << 3));
                    i65++;
                    i62++;
                    c11 = c11;
                }
                char c12 = c11;
                long j14 = (j13 >>> i63) & ((long) i57);
                i61 = (int) (((long) i61) + j14);
                System.arraycopy(this.privateKeyOTS[i59], 0, bArr7, 0, this.mdsize);
                while (j14 > 0) {
                    this.messDigestOTS.update(bArr7, 0, bArr7.length);
                    bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr7, 0);
                    j14--;
                }
                int i66 = this.mdsize;
                System.arraycopy(bArr7, 0, bArr2, i59 * i66, i66);
                i59++;
                c11 = c12;
            }
            int i67 = i58 >>> 3;
            if (i67 < this.mdsize) {
                int i68 = i58 % 8;
                long j15 = 0;
                int i69 = 0;
                while (true) {
                    i11 = this.mdsize;
                    if (i67 >= i11) {
                        break;
                    }
                    j15 ^= (long) ((bArr4[i67] & 255) << (i69 << 3));
                    i69++;
                    i67++;
                }
                long j16 = (j15 >>> i68) & ((long) i57);
                i61 = (int) (((long) i61) + j16);
                System.arraycopy(this.privateKeyOTS[i59], 0, bArr7, 0, i11);
                while (j16 > 0) {
                    this.messDigestOTS.update(bArr7, 0, bArr7.length);
                    bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr7, 0);
                    j16--;
                }
                int i71 = this.mdsize;
                System.arraycopy(bArr7, 0, bArr2, i59 * i71, i71);
                i59++;
            }
            int i72 = (this.messagesize << this.f99758w) - i61;
            int i73 = 0;
            while (i73 < this.checksumsize) {
                System.arraycopy(this.privateKeyOTS[i59], 0, bArr7, 0, this.mdsize);
                for (long j17 = i72 & i57; j17 > 0; j17--) {
                    this.messDigestOTS.update(bArr7, 0, bArr7.length);
                    bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr7, 0);
                }
                int i74 = this.mdsize;
                System.arraycopy(bArr7, 0, bArr2, i59 * i74, i74);
                int i75 = this.f99758w;
                i72 >>>= i75;
                i59++;
                i73 += i75;
            }
        }
        return bArr2;
    }
}
