package org.bouncycastle.pqc.legacy.crypto.gmss.util;

import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes10.dex */
public class WinternitzOTSVerify {
    private int mdsize;
    private Digest messDigestOTS;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f99210w;

    public WinternitzOTSVerify(Digest digest, int i11) {
        this.f99210w = i11;
        this.messDigestOTS = digest;
        this.mdsize = digest.getDigestSize();
    }

    private void hashSignatureBlock(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (i12 < 1) {
            System.arraycopy(bArr, i11, bArr2, i13, this.mdsize);
            return;
        }
        this.messDigestOTS.update(bArr, i11, this.mdsize);
        while (true) {
            this.messDigestOTS.doFinal(bArr2, i13);
            i12--;
            if (i12 <= 0) {
                return;
            } else {
                this.messDigestOTS.update(bArr2, i13, this.mdsize);
            }
        }
    }

    public byte[] Verify(byte[] bArr, byte[] bArr2) {
        int i11;
        int i12;
        int i13;
        int i14 = this.mdsize;
        byte[] bArr3 = new byte[i14];
        int i15 = 0;
        this.messDigestOTS.update(bArr, 0, bArr.length);
        this.messDigestOTS.doFinal(bArr3, 0);
        int i16 = this.mdsize << 3;
        int i17 = this.f99210w;
        int i18 = (i16 + (i17 - 1)) / i17;
        boolean z11 = true;
        int log = getLog((i18 << i17) + 1);
        int i19 = this.f99210w;
        int i21 = this.mdsize;
        int i22 = i21 * ((((log + i19) - 1) / i19) + i18);
        if (i22 != bArr2.length) {
            return null;
        }
        byte[] bArr4 = new byte[i22];
        char c11 = '\b';
        if (8 % i19 == 0) {
            int i23 = 8 / i19;
            int i24 = (1 << i19) - 1;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            while (i27 < i14) {
                int i28 = i26;
                int i29 = 0;
                while (i29 < i23) {
                    int i31 = bArr3[i27] & i24;
                    int i32 = i25 + i31;
                    int i33 = this.mdsize;
                    hashSignatureBlock(bArr2, i28 * i33, i24 - i31, bArr4, i33 * i28);
                    bArr3[i27] = (byte) (bArr3[i27] >>> this.f99210w);
                    i28++;
                    i29++;
                    i25 = i32;
                }
                i27++;
                i26 = i28;
            }
            int i34 = (i18 << this.f99210w) - i25;
            int i35 = i26;
            int i36 = 0;
            while (i36 < log) {
                int i37 = this.mdsize;
                hashSignatureBlock(bArr2, i35 * i37, i24 - (i34 & i24), bArr4, i35 * i37);
                int i38 = this.f99210w;
                i34 >>>= i38;
                i35++;
                i36 += i38;
            }
        } else {
            if (i19 >= 8) {
                if (i19 < 57) {
                    int i39 = (i21 << 3) - i19;
                    int i41 = (1 << i19) - 1;
                    byte[] bArr5 = new byte[i21];
                    int i42 = 0;
                    int i43 = 0;
                    int i44 = 0;
                    while (i42 <= i39) {
                        int i45 = i42 >>> 3;
                        int i46 = i42 % 8;
                        char c12 = c11;
                        i42 += this.f99210w;
                        int i47 = (i42 + 7) >>> 3;
                        int i48 = i15;
                        int i49 = i45;
                        long j11 = 0;
                        while (true) {
                            i13 = i39;
                            if (i49 >= i47) {
                                break;
                            }
                            j11 ^= (long) ((bArr3[i49] & 255) << (i48 << 3));
                            i48++;
                            i49++;
                            i39 = i13;
                            bArr3 = bArr3;
                        }
                        byte[] bArr6 = bArr3;
                        long j12 = i41;
                        long j13 = (j11 >>> i46) & j12;
                        i43 = (int) (((long) i43) + j13);
                        int i51 = this.mdsize;
                        System.arraycopy(bArr2, i44 * i51, bArr5, 0, i51);
                        while (j13 < j12) {
                            this.messDigestOTS.update(bArr5, 0, i21);
                            this.messDigestOTS.doFinal(bArr5, 0);
                            j13++;
                        }
                        int i52 = this.mdsize;
                        System.arraycopy(bArr5, 0, bArr4, i44 * i52, i52);
                        i44++;
                        c11 = c12;
                        i39 = i13;
                        bArr3 = bArr6;
                        i15 = 0;
                    }
                    byte[] bArr7 = bArr3;
                    int i53 = i42 >>> 3;
                    if (i53 < this.mdsize) {
                        int i54 = i42 % 8;
                        int i55 = 0;
                        long j14 = 0;
                        while (true) {
                            i12 = this.mdsize;
                            if (i53 >= i12) {
                                break;
                            }
                            j14 ^= (long) ((bArr7[i53] & 255) << (i55 << 3));
                            i55++;
                            i53++;
                        }
                        long j15 = i41;
                        long j16 = (j14 >>> i54) & j15;
                        i43 = (int) (((long) i43) + j16);
                        System.arraycopy(bArr2, i44 * i12, bArr5, 0, i12);
                        while (j16 < j15) {
                            this.messDigestOTS.update(bArr5, 0, i21);
                            this.messDigestOTS.doFinal(bArr5, 0);
                            j16++;
                        }
                        int i56 = this.mdsize;
                        System.arraycopy(bArr5, 0, bArr4, i44 * i56, i56);
                        i44++;
                    }
                    int i57 = (i18 << this.f99210w) - i43;
                    int i58 = 0;
                    while (i58 < log) {
                        int i59 = this.mdsize;
                        System.arraycopy(bArr2, i44 * i59, bArr5, 0, i59);
                        int i61 = i44;
                        for (long j17 = i57 & i41; j17 < i41; j17++) {
                            this.messDigestOTS.update(bArr5, 0, i21);
                            this.messDigestOTS.doFinal(bArr5, 0);
                        }
                        int i62 = this.mdsize;
                        System.arraycopy(bArr5, 0, bArr4, i61 * i62, i62);
                        int i63 = this.f99210w;
                        i57 >>>= i63;
                        i44 = i61 + 1;
                        i58 += i63;
                    }
                    i11 = 0;
                }
                this.messDigestOTS.update(bArr4, i11, i22);
                byte[] bArr8 = new byte[this.mdsize];
                this.messDigestOTS.doFinal(bArr8, i11);
                return bArr8;
            }
            int i64 = i21 / i19;
            int i65 = (1 << i19) - 1;
            int i66 = 0;
            int i67 = 0;
            int i68 = 0;
            int i69 = 0;
            while (i66 < i64) {
                int i71 = i67;
                boolean z12 = z11;
                long j18 = 0;
                for (int i72 = 0; i72 < this.f99210w; i72++) {
                    j18 ^= (long) ((bArr3[i71] & 255) << (i72 << 3));
                    i71++;
                }
                int i73 = 0;
                while (i73 < 8) {
                    int i74 = (int) (j18 & ((long) i65));
                    int i75 = i68 + i74;
                    int i76 = this.mdsize;
                    hashSignatureBlock(bArr2, i69 * i76, i65 - i74, bArr4, i76 * i69);
                    j18 >>>= this.f99210w;
                    i69++;
                    i73++;
                    i68 = i75;
                    i65 = i65;
                    i66 = i66;
                }
                i66++;
                z11 = z12;
                i67 = i71;
            }
            int i77 = i65;
            int i78 = this.mdsize % this.f99210w;
            long j19 = 0;
            for (int i79 = 0; i79 < i78; i79++) {
                j19 ^= (long) ((bArr3[i67] & 255) << (i79 << 3));
                i67++;
            }
            int i81 = i78 << 3;
            int i82 = 0;
            while (i82 < i81) {
                int i83 = (int) (j19 & ((long) i77));
                int i84 = i68 + i83;
                int i85 = this.mdsize;
                hashSignatureBlock(bArr2, i69 * i85, i77 - i83, bArr4, i69 * i85);
                int i86 = this.f99210w;
                j19 >>>= i86;
                i69++;
                i82 += i86;
                i68 = i84;
            }
            int i87 = (i18 << this.f99210w) - i68;
            int i88 = 0;
            while (i88 < log) {
                int i89 = this.mdsize;
                hashSignatureBlock(bArr2, i69 * i89, i77 - (i87 & i77), bArr4, i69 * i89);
                int i91 = this.f99210w;
                i87 >>>= i91;
                i69++;
                i88 += i91;
            }
        }
        i11 = 0;
        this.messDigestOTS.update(bArr4, i11, i22);
        byte[] bArr9 = new byte[this.mdsize];
        this.messDigestOTS.doFinal(bArr9, i11);
        return bArr9;
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

    public int getSignatureLength() {
        int digestSize = this.messDigestOTS.getDigestSize();
        int i11 = this.f99210w;
        int i12 = ((digestSize << 3) + (i11 - 1)) / i11;
        int log = getLog((i12 << i11) + 1);
        int i13 = this.f99210w;
        return digestSize * (i12 + (((log + i13) - 1) / i13));
    }
}
