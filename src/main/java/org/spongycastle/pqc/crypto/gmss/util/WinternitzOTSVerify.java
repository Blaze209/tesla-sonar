package org.spongycastle.pqc.crypto.gmss.util;

import org.spongycastle.crypto.Digest;

/* JADX INFO: loaded from: classes10.dex */
public class WinternitzOTSVerify {
    private Digest messDigestOTS;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f99757w;

    public WinternitzOTSVerify(Digest digest, int i11) {
        this.f99757w = i11;
        this.messDigestOTS = digest;
    }

    public byte[] Verify(byte[] bArr, byte[] bArr2) {
        int i11;
        int digestSize = this.messDigestOTS.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        int i12 = 0;
        this.messDigestOTS.update(bArr, 0, bArr.length);
        int digestSize2 = this.messDigestOTS.getDigestSize();
        byte[] bArr4 = new byte[digestSize2];
        this.messDigestOTS.doFinal(bArr4, 0);
        int i13 = digestSize << 3;
        int i14 = this.f99757w;
        int i15 = ((i14 - 1) + i13) / i14;
        boolean z11 = true;
        int log = getLog((i15 << i14) + 1);
        int i16 = this.f99757w;
        int i17 = ((((log + i16) - 1) / i16) + i15) * digestSize;
        if (i17 != bArr2.length) {
            return null;
        }
        byte[] bArr5 = new byte[i17];
        int i18 = 8;
        if (8 % i16 == 0) {
            int i19 = 8 / i16;
            int i21 = (1 << i16) - 1;
            byte[] bArr6 = new byte[digestSize];
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            while (i22 < digestSize2) {
                while (i12 < i19) {
                    int i25 = bArr4[i22] & i21;
                    i23 += i25;
                    int i26 = digestSize2;
                    int i27 = i24 * digestSize;
                    byte[] bArr7 = bArr4;
                    System.arraycopy(bArr2, i27, bArr6, 0, digestSize);
                    int i28 = i25;
                    while (i28 < i21) {
                        this.messDigestOTS.update(bArr6, 0, bArr6.length);
                        bArr6 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr6, 0);
                        i28++;
                        i12 = i12;
                        i15 = i15;
                    }
                    System.arraycopy(bArr6, 0, bArr5, i27, digestSize);
                    bArr7[i22] = (byte) (bArr7[i22] >>> this.f99757w);
                    i24++;
                    i12++;
                    digestSize2 = i26;
                    bArr4 = bArr7;
                    i15 = i15;
                }
                i22++;
                i12 = 0;
            }
            int i29 = (i15 << this.f99757w) - i23;
            int i31 = 0;
            while (i31 < log) {
                int i32 = i24 * digestSize;
                System.arraycopy(bArr2, i32, bArr6, 0, digestSize);
                for (int i33 = i29 & i21; i33 < i21; i33++) {
                    this.messDigestOTS.update(bArr6, 0, bArr6.length);
                    bArr6 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr6, 0);
                }
                System.arraycopy(bArr6, 0, bArr5, i32, digestSize);
                int i34 = this.f99757w;
                i29 >>>= i34;
                i24++;
                i31 += i34;
            }
        } else if (i16 < 8) {
            int i35 = digestSize / i16;
            int i36 = (1 << i16) - 1;
            byte[] bArr8 = new byte[digestSize];
            int i37 = 0;
            int i38 = 0;
            int i39 = 0;
            int i41 = 0;
            while (i37 < i35) {
                boolean z12 = z11;
                long j11 = 0;
                for (int i42 = 0; i42 < this.f99757w; i42++) {
                    j11 ^= (long) ((bArr4[i38] & 255) << (i42 << 3));
                    i38++;
                }
                int i43 = 0;
                while (i43 < i18) {
                    int i44 = (int) (j11 & ((long) i36));
                    i39 += i44;
                    int i45 = i41 * digestSize;
                    int i46 = i18;
                    System.arraycopy(bArr2, i45, bArr8, 0, digestSize);
                    while (i44 < i36) {
                        this.messDigestOTS.update(bArr8, 0, bArr8.length);
                        bArr8 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr8, 0);
                        i44++;
                        i35 = i35;
                        i37 = i37;
                    }
                    System.arraycopy(bArr8, 0, bArr5, i45, digestSize);
                    j11 >>>= this.f99757w;
                    i41++;
                    i43++;
                    i18 = i46;
                    i35 = i35;
                }
                i37++;
                z11 = z12;
            }
            int i47 = digestSize % this.f99757w;
            int i48 = 0;
            long j12 = 0;
            while (i48 < i47) {
                j12 ^= (long) ((bArr4[i38] & 255) << (i48 << 3));
                i38++;
                i48++;
                bArr8 = bArr8;
            }
            int i49 = i47 << 3;
            int i51 = 0;
            while (i51 < i49) {
                int i52 = (int) (((long) i36) & j12);
                i39 += i52;
                int i53 = i41 * digestSize;
                System.arraycopy(bArr2, i53, bArr8, 0, digestSize);
                while (i52 < i36) {
                    this.messDigestOTS.update(bArr8, 0, bArr8.length);
                    bArr8 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr8, 0);
                    i52++;
                    i49 = i49;
                    i51 = i51;
                }
                int i54 = i49;
                System.arraycopy(bArr8, 0, bArr5, i53, digestSize);
                int i55 = this.f99757w;
                j12 >>>= i55;
                i41++;
                i51 += i55;
                i49 = i54;
            }
            int i56 = (i15 << this.f99757w) - i39;
            int i57 = 0;
            while (i57 < log) {
                int i58 = i41 * digestSize;
                System.arraycopy(bArr2, i58, bArr8, 0, digestSize);
                for (int i59 = i56 & i36; i59 < i36; i59++) {
                    this.messDigestOTS.update(bArr8, 0, bArr8.length);
                    bArr8 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr8, 0);
                }
                System.arraycopy(bArr8, 0, bArr5, i58, digestSize);
                int i61 = this.f99757w;
                i56 >>>= i61;
                i41++;
                i57 += i61;
            }
        } else if (i16 < 57) {
            int i62 = i13 - i16;
            int i63 = (1 << i16) - 1;
            byte[] bArr9 = new byte[digestSize];
            int i64 = 0;
            int i65 = 0;
            int i66 = 0;
            while (i66 <= i62) {
                int i67 = i66 >>> 3;
                int i68 = i66 % 8;
                i66 += this.f99757w;
                int i69 = (i66 + 7) >>> 3;
                int i71 = 0;
                long j13 = 0;
                while (i67 < i69) {
                    j13 ^= (long) ((bArr4[i67] & 255) << (i71 << 3));
                    i71++;
                    i67++;
                    i62 = i62;
                    i65 = i65;
                }
                int i72 = i62;
                int i73 = i65;
                long j14 = i63;
                long j15 = (j13 >>> i68) & j14;
                i64 = (int) (((long) i64) + j15);
                int i74 = i73 * digestSize;
                System.arraycopy(bArr2, i74, bArr9, 0, digestSize);
                while (j15 < j14) {
                    this.messDigestOTS.update(bArr9, 0, bArr9.length);
                    bArr9 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr9, 0);
                    j15++;
                }
                System.arraycopy(bArr9, 0, bArr5, i74, digestSize);
                i65 = i73 + 1;
                i62 = i72;
            }
            int i75 = i65;
            int i76 = i66 >>> 3;
            if (i76 < digestSize) {
                int i77 = i66 % 8;
                int i78 = 0;
                long j16 = 0;
                while (i76 < digestSize) {
                    j16 ^= (long) ((bArr4[i76] & 255) << (i78 << 3));
                    i78++;
                    i76++;
                }
                long j17 = j16 >>> i77;
                long j18 = i63;
                long j19 = j17 & j18;
                i64 = (int) (((long) i64) + j19);
                int i79 = i75 * digestSize;
                System.arraycopy(bArr2, i79, bArr9, 0, digestSize);
                while (j19 < j18) {
                    this.messDigestOTS.update(bArr9, 0, bArr9.length);
                    bArr9 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr9, 0);
                    j19++;
                    i64 = i64;
                }
                System.arraycopy(bArr9, 0, bArr5, i79, digestSize);
                i11 = i75 + 1;
            } else {
                i11 = i75;
            }
            int i81 = (i15 << this.f99757w) - i64;
            int i82 = 0;
            while (i82 < log) {
                long j21 = i81 & i63;
                int i83 = i11 * digestSize;
                System.arraycopy(bArr2, i83, bArr9, 0, digestSize);
                while (j21 < i63) {
                    this.messDigestOTS.update(bArr9, 0, bArr9.length);
                    bArr9 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr9, 0);
                    j21++;
                    i63 = i63;
                }
                System.arraycopy(bArr9, 0, bArr5, i83, digestSize);
                int i84 = this.f99757w;
                i81 >>>= i84;
                i11++;
                i82 += i84;
                i63 = i63;
            }
        }
        byte[] bArr10 = new byte[digestSize];
        this.messDigestOTS.update(bArr5, 0, i17);
        byte[] bArr11 = new byte[this.messDigestOTS.getDigestSize()];
        this.messDigestOTS.doFinal(bArr11, 0);
        return bArr11;
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
        int i11 = this.f99757w;
        int i12 = ((digestSize << 3) + (i11 - 1)) / i11;
        int log = getLog((i12 << i11) + 1);
        int i13 = this.f99757w;
        return digestSize * (i12 + (((log + i13) - 1) / i13));
    }
}
