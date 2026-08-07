package org.bouncycastle.pqc.crypto.frodo;

import java.security.SecureRandom;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes10.dex */
class FrodoEngine {
    private static final int len_chi = 16;
    private static final int len_chi_bytes = 2;
    private static final int len_seedA = 128;
    private static final int len_seedA_bytes = 16;
    private static final int len_z = 128;
    private static final int len_z_bytes = 16;
    private static final int mbar = 8;
    static final int nbar = 8;
    private final int B;
    private final int D;
    private final short[] T_chi;
    private final Xof digest;
    private final FrodoMatrixGenerator gen;
    private final int len_ct_bytes;
    private final int len_k;
    private final int len_k_bytes;
    private final int len_mu;
    private final int len_mu_bytes;
    private final int len_pk_bytes;
    private final int len_pkh;
    private final int len_pkh_bytes;
    private final int len_s;
    private final int len_s_bytes;
    private final int len_seedSE;
    private final int len_seedSE_bytes;
    private final int len_sk_bytes;
    private final int len_ss;
    private final int len_ss_bytes;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f99066n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f99067q;

    public FrodoEngine(int i11, int i12, int i13, short[] sArr, Xof xof, FrodoMatrixGenerator frodoMatrixGenerator) {
        this.f99066n = i11;
        this.D = i12;
        this.f99067q = 1 << i12;
        this.B = i13;
        int i14 = i13 * 64;
        this.len_mu = i14;
        this.len_seedSE = i14;
        this.len_s = i14;
        this.len_k = i14;
        this.len_pkh = i14;
        this.len_ss = i14;
        this.len_mu_bytes = i14 / 8;
        this.len_seedSE_bytes = i14 / 8;
        int i15 = i14 / 8;
        this.len_s_bytes = i15;
        this.len_k_bytes = i14 / 8;
        int i16 = i14 / 8;
        this.len_pkh_bytes = i16;
        this.len_ss_bytes = i14 / 8;
        int i17 = ((i12 * i11) * 8) / 8;
        this.len_ct_bytes = ((i12 * 64) / 8) + i17;
        int i18 = i17 + 16;
        this.len_pk_bytes = i18;
        this.len_sk_bytes = i15 + i18 + (i11 * 16) + i16;
        this.T_chi = sArr;
        this.digest = xof;
        this.gen = frodoMatrixGenerator;
    }

    private byte[] ctselect(byte[] bArr, byte[] bArr2, short s11) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr3[i11] = (byte) (((~s11) & bArr[i11] & 255) | (bArr2[i11] & s11 & 255));
        }
        return bArr3;
    }

    private short ctverify(short[] sArr, short[] sArr2, short[] sArr3, short[] sArr4) {
        short s11 = 0;
        for (short s12 = 0; s12 < sArr.length; s12 = (short) (s12 + 1)) {
            s11 = (short) (s11 | (sArr[s12] ^ sArr3[s12]));
        }
        for (short s13 = 0; s13 < sArr2.length; s13 = (short) (s13 + 1)) {
            s11 = (short) ((sArr2[s13] ^ sArr4[s13]) | s11);
        }
        return s11 == 0 ? (short) 0 : (short) -1;
    }

    private byte[] decode(short[] sArr) {
        int i11 = this.B;
        short s11 = (short) ((1 << i11) - 1);
        short s12 = (short) ((1 << this.D) - 1);
        byte[] bArr = new byte[i11 * 8];
        int i12 = 0;
        for (int i13 = 0; i13 < 8; i13++) {
            long j11 = 0;
            for (int i14 = 0; i14 < 8; i14++) {
                int i15 = sArr[i12] & s12;
                int i16 = this.D;
                int i17 = this.B;
                j11 |= ((long) (((short) ((i15 + (1 << ((i16 - i17) - 1))) >> (i16 - i17))) & s11)) << (i17 * i14);
                i12++;
            }
            int i18 = 0;
            while (true) {
                int i19 = this.B;
                if (i18 < i19) {
                    bArr[(i19 * i13) + i18] = (byte) ((j11 >> (i18 * 8)) & 255);
                    i18++;
                }
            }
        }
        return bArr;
    }

    private short[] encode(byte[] bArr) {
        int i11;
        short[] sArr = new short[64];
        int i12 = 0;
        byte b11 = 1;
        for (int i13 = 0; i13 < 8; i13++) {
            for (int i14 = 0; i14 < 8; i14++) {
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    i11 = this.B;
                    if (i15 < i11) {
                        i16 += (1 << i15) * ((bArr[i12] & b11) == b11 ? 1 : 0);
                        b11 = (byte) (b11 << 1);
                        if (b11 == 0) {
                            i12++;
                            b11 = 1;
                        }
                        i15++;
                    }
                }
                sArr[(i13 * 8) + i14] = (short) (i16 * (this.f99067q / (1 << i11)));
            }
        }
        return sArr;
    }

    private short[] matrix_add(short[] sArr, short[] sArr2, int i11, int i12) {
        int i13 = this.f99067q - 1;
        short[] sArr3 = new short[i11 * i12];
        for (int i14 = 0; i14 < i11; i14++) {
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = (i14 * i12) + i15;
                sArr3[i16] = (short) ((sArr[i16] + sArr2[i16]) & i13);
            }
        }
        return sArr3;
    }

    private short[] matrix_mul(short[] sArr, int i11, int i12, short[] sArr2, int i13, int i14) {
        int i15 = this.f99067q - 1;
        short[] sArr3 = new short[i11 * i14];
        for (int i16 = 0; i16 < i11; i16++) {
            for (int i17 = 0; i17 < i14; i17++) {
                int i18 = 0;
                for (int i19 = 0; i19 < i12; i19++) {
                    i18 += sArr[(i16 * i12) + i19] * sArr2[(i19 * i14) + i17];
                }
                sArr3[(i16 * i14) + i17] = (short) (i18 & i15);
            }
        }
        return sArr3;
    }

    private short[] matrix_sub(short[] sArr, short[] sArr2, int i11, int i12) {
        int i13 = this.f99067q - 1;
        short[] sArr3 = new short[i11 * i12];
        for (int i14 = 0; i14 < i11; i14++) {
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = (i14 * i12) + i15;
                sArr3[i16] = (short) ((sArr[i16] - sArr2[i16]) & i13);
            }
        }
        return sArr3;
    }

    private short[] matrix_transpose(short[] sArr, int i11, int i12) {
        short[] sArr2 = new short[i11 * i12];
        for (int i13 = 0; i13 < i12; i13++) {
            for (int i14 = 0; i14 < i11; i14++) {
                sArr2[(i13 * i11) + i14] = sArr[(i14 * i12) + i13];
            }
        }
        return sArr2;
    }

    private byte[] pack(short[] sArr) {
        int length = sArr.length;
        int i11 = (this.D * length) / 8;
        byte[] bArr = new byte[i11];
        short s11 = 0;
        short s12 = 0;
        byte b11 = 0;
        short s13 = 0;
        while (s11 < i11 && (s12 < length || (s12 == length && b11 > 0))) {
            byte b12 = 0;
            while (b12 < 8) {
                int i12 = 8 - b12;
                int iMin = Math.min(i12, (int) b11);
                int i13 = b11 - iMin;
                bArr[s11] = (byte) (bArr[s11] + (((byte) (((short) ((1 << iMin) - 1)) & (s13 >> i13))) << (i12 - iMin)));
                b12 = (byte) (b12 + iMin);
                b11 = (byte) i13;
                if (b11 == 0) {
                    if (s12 >= length) {
                        break;
                    }
                    short s14 = sArr[s12];
                    s12 = (short) (s12 + 1);
                    s13 = s14;
                    b11 = (byte) this.D;
                }
            }
            if (b12 == 8) {
                s11 = (short) (s11 + 1);
            }
        }
        return bArr;
    }

    private short sample(short s11) {
        int i11 = s11 & HPKE.aead_EXPORT_ONLY;
        short s12 = (short) (i11 >>> 1);
        int i12 = 0;
        short s13 = 0;
        while (true) {
            short[] sArr = this.T_chi;
            if (i12 >= sArr.length) {
                break;
            }
            if (s12 > sArr[i12]) {
                s13 = (short) (s13 + 1);
            }
            i12++;
        }
        return i11 % 2 == 1 ? (short) ((s13 * (-1)) & 65535) : s13;
    }

    private short[] sample_matrix(short[] sArr, int i11, int i12, int i13) {
        short[] sArr2 = new short[i12 * i13];
        for (int i14 = 0; i14 < i12; i14++) {
            for (int i15 = 0; i15 < i13; i15++) {
                int i16 = (i14 * i13) + i15;
                sArr2[i16] = sample(sArr[i16 + i11]);
            }
        }
        return sArr2;
    }

    private short[] unpack(byte[] bArr, int i11, int i12) {
        int i13 = i11 * i12;
        short[] sArr = new short[i13];
        short s11 = 0;
        short s12 = 0;
        byte b11 = 0;
        byte b12 = 0;
        while (s11 < i13 && (s12 < bArr.length || (s12 == bArr.length && b11 > 0))) {
            byte b13 = 0;
            while (true) {
                int i14 = this.D;
                if (b13 >= i14) {
                    break;
                }
                int iMin = Math.min(i14 - b13, (int) b11);
                short s13 = (short) (((1 << iMin) - 1) & 65535);
                sArr[s11] = (short) (((sArr[s11] & HPKE.aead_EXPORT_ONLY) + ((((byte) ((((b12 & 255) >>> ((b11 & 255) - iMin)) & (s13 & HPKE.aead_EXPORT_ONLY)) & 255)) & 255) << ((this.D - (b13 & 255)) - iMin))) & 65535);
                b13 = (byte) (b13 + iMin);
                byte b14 = (byte) (b11 - iMin);
                byte b15 = (byte) ((~(s13 << b14)) & b12);
                if (b14 != 0) {
                    b12 = b15;
                    b11 = b14;
                } else {
                    if (s12 >= bArr.length) {
                        b12 = b15;
                        b11 = b14;
                        break;
                    }
                    byte b16 = bArr[s12];
                    s12 = (short) (s12 + 1);
                    b11 = 8;
                    b12 = b16;
                }
            }
            if (b13 == this.D) {
                s11 = (short) (s11 + 1);
            }
        }
        return sArr;
    }

    public int getCipherTextSize() {
        return this.len_ct_bytes;
    }

    public int getPrivateKeySize() {
        return this.len_sk_bytes;
    }

    public int getPublicKeySize() {
        return this.len_pk_bytes;
    }

    public int getSessionKeySize() {
        return this.len_ss_bytes;
    }

    public void kem_dec(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i11 = ((this.f99066n * 8) * this.D) / 8;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, 0, i11);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr2, i11, ((this.D * 64) / 8) + i11);
        int i12 = this.len_s_bytes;
        byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr3, 0, i12);
        int i13 = i12 + 16;
        byte[] bArrCopyOfRange4 = Arrays.copyOfRange(bArr3, i12, i13);
        int i14 = (((this.D * this.f99066n) * 8) / 8) + i13;
        byte[] bArrCopyOfRange5 = Arrays.copyOfRange(bArr3, i13, i14);
        int i15 = ((this.f99066n * 128) / 8) + i14;
        byte[] bArrCopyOfRange6 = Arrays.copyOfRange(bArr3, i14, i15);
        short[] sArr = new short[this.f99066n * 8];
        for (int i16 = 0; i16 < 8; i16++) {
            int i17 = 0;
            while (true) {
                int i18 = this.f99066n;
                if (i17 < i18) {
                    sArr[(i16 * i18) + i17] = Pack.littleEndianToShort(bArrCopyOfRange6, (i18 * i16 * 2) + (i17 * 2));
                    i17++;
                }
            }
        }
        short[] sArrMatrix_transpose = matrix_transpose(sArr, 8, this.f99066n);
        byte[] bArrCopyOfRange7 = Arrays.copyOfRange(bArr3, i15, this.len_pkh_bytes + i15);
        short[] sArrUnpack = unpack(bArrCopyOfRange, 8, this.f99066n);
        short[] sArrUnpack2 = unpack(bArrCopyOfRange2, 8, 8);
        int i19 = this.f99066n;
        byte[] bArrDecode = decode(matrix_sub(sArrUnpack2, matrix_mul(sArrUnpack, 8, i19, sArrMatrix_transpose, i19, 8), 8, 8));
        byte[] bArr4 = new byte[this.len_seedSE_bytes + this.len_k_bytes];
        this.digest.update(bArrCopyOfRange7, 0, this.len_pkh_bytes);
        this.digest.update(bArrDecode, 0, this.len_mu_bytes);
        this.digest.doFinal(bArr4, 0, this.len_seedSE_bytes + this.len_k_bytes);
        int i21 = this.len_seedSE_bytes;
        byte[] bArrCopyOfRange8 = Arrays.copyOfRange(bArr4, i21, this.len_k_bytes + i21);
        int i22 = ((this.f99066n * 16) + 64) * 2;
        byte[] bArr5 = new byte[i22];
        this.digest.update((byte) -106);
        this.digest.update(bArr4, 0, this.len_seedSE_bytes);
        this.digest.doFinal(bArr5, 0, i22);
        int i23 = (this.f99066n * 16) + 64;
        short[] sArr2 = new short[i23];
        for (int i24 = 0; i24 < i23; i24++) {
            sArr2[i24] = Pack.littleEndianToShort(bArr5, i24 * 2);
        }
        short[] sArrSample_matrix = sample_matrix(sArr2, 0, 8, this.f99066n);
        int i25 = this.f99066n;
        short[] sArrSample_matrix2 = sample_matrix(sArr2, i25 * 8, 8, i25);
        short[] sArrGenMatrix = this.gen.genMatrix(bArrCopyOfRange4);
        int i26 = this.f99066n;
        short[] sArrMatrix_add = matrix_add(matrix_mul(sArrSample_matrix, 8, i26, sArrGenMatrix, i26, i26), sArrSample_matrix2, 8, this.f99066n);
        short[] sArrSample_matrix3 = sample_matrix(sArr2, this.f99066n * 16, 8, 8);
        short[] sArrUnpack3 = unpack(bArrCopyOfRange5, this.f99066n, 8);
        int i27 = this.f99066n;
        byte[] bArrCtselect = ctselect(bArrCopyOfRange8, bArrCopyOfRange3, ctverify(sArrUnpack, sArrUnpack2, sArrMatrix_add, matrix_add(matrix_add(matrix_mul(sArrSample_matrix, 8, i27, sArrUnpack3, i27, 8), sArrSample_matrix3, 8, 8), encode(bArrDecode), 8, 8)));
        this.digest.update(bArrCopyOfRange, 0, bArrCopyOfRange.length);
        this.digest.update(bArrCopyOfRange2, 0, bArrCopyOfRange2.length);
        this.digest.update(bArrCtselect, 0, bArrCtselect.length);
        this.digest.doFinal(bArr, 0, this.len_ss_bytes);
    }

    public void kem_enc(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, 0, 16);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr3, 16, this.len_pk_bytes);
        byte[] bArr4 = new byte[this.len_mu_bytes];
        secureRandom.nextBytes(bArr4);
        byte[] bArr5 = new byte[this.len_pkh_bytes];
        this.digest.update(bArr3, 0, this.len_pk_bytes);
        this.digest.doFinal(bArr5, 0, this.len_pkh_bytes);
        byte[] bArr6 = new byte[this.len_seedSE + this.len_k];
        this.digest.update(bArr5, 0, this.len_pkh_bytes);
        this.digest.update(bArr4, 0, this.len_mu_bytes);
        this.digest.doFinal(bArr6, 0, this.len_seedSE_bytes + this.len_k_bytes);
        byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr6, 0, this.len_seedSE_bytes);
        int i11 = this.len_seedSE_bytes;
        byte[] bArrCopyOfRange4 = Arrays.copyOfRange(bArr6, i11, this.len_k_bytes + i11);
        int i12 = ((this.f99066n * 16) + 64) * 2;
        byte[] bArr7 = new byte[i12];
        this.digest.update((byte) -106);
        this.digest.update(bArrCopyOfRange3, 0, bArrCopyOfRange3.length);
        this.digest.doFinal(bArr7, 0, i12);
        int i13 = i12 / 2;
        short[] sArr = new short[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            sArr[i14] = Pack.littleEndianToShort(bArr7, i14 * 2);
        }
        short[] sArrSample_matrix = sample_matrix(sArr, 0, 8, this.f99066n);
        int i15 = this.f99066n;
        short[] sArrSample_matrix2 = sample_matrix(sArr, i15 * 8, 8, i15);
        short[] sArrGenMatrix = this.gen.genMatrix(bArrCopyOfRange);
        int i16 = this.f99066n;
        byte[] bArrPack = pack(matrix_add(matrix_mul(sArrSample_matrix, 8, i16, sArrGenMatrix, i16, i16), sArrSample_matrix2, 8, this.f99066n));
        short[] sArrSample_matrix3 = sample_matrix(sArr, this.f99066n * 16, 8, 8);
        short[] sArrUnpack = unpack(bArrCopyOfRange2, this.f99066n, 8);
        int i17 = this.f99066n;
        byte[] bArrPack2 = pack(matrix_add(matrix_add(matrix_mul(sArrSample_matrix, 8, i17, sArrUnpack, i17, 8), sArrSample_matrix3, 8, 8), encode(bArr4), 8, 8));
        System.arraycopy(Arrays.concatenate(bArrPack, bArrPack2), 0, bArr, 0, this.len_ct_bytes);
        this.digest.update(bArrPack, 0, bArrPack.length);
        this.digest.update(bArrPack2, 0, bArrPack2.length);
        this.digest.update(bArrCopyOfRange4, 0, this.len_k_bytes);
        this.digest.doFinal(bArr2, 0, this.len_s_bytes);
    }

    public void kem_keypair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        byte[] bArr3 = new byte[this.len_s_bytes + this.len_seedSE_bytes + 16];
        secureRandom.nextBytes(bArr3);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, 0, this.len_s_bytes);
        int i11 = this.len_s_bytes;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr3, i11, this.len_seedSE_bytes + i11);
        int i12 = this.len_s_bytes;
        int i13 = this.len_seedSE_bytes;
        byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr3, i12 + i13, i12 + i13 + 16);
        byte[] bArr4 = new byte[16];
        this.digest.update(bArrCopyOfRange3, 0, bArrCopyOfRange3.length);
        this.digest.doFinal(bArr4, 0, 16);
        short[] sArrGenMatrix = this.gen.genMatrix(bArr4);
        int i14 = this.f99066n * 32;
        byte[] bArr5 = new byte[i14];
        this.digest.update((byte) 95);
        this.digest.update(bArrCopyOfRange2, 0, bArrCopyOfRange2.length);
        this.digest.doFinal(bArr5, 0, i14);
        int i15 = this.f99066n * 16;
        short[] sArr = new short[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            sArr[i16] = Pack.littleEndianToShort(bArr5, i16 * 2);
        }
        short[] sArrSample_matrix = sample_matrix(sArr, 0, 8, this.f99066n);
        short[] sArrMatrix_transpose = matrix_transpose(sArrSample_matrix, 8, this.f99066n);
        int i17 = this.f99066n;
        short[] sArrSample_matrix2 = sample_matrix(sArr, i17 * 8, i17, 8);
        int i18 = this.f99066n;
        System.arraycopy(Arrays.concatenate(bArr4, pack(matrix_add(matrix_mul(sArrGenMatrix, i18, i18, sArrMatrix_transpose, i18, 8), sArrSample_matrix2, this.f99066n, 8))), 0, bArr, 0, this.len_pk_bytes);
        int i19 = this.len_pkh_bytes;
        byte[] bArr6 = new byte[i19];
        this.digest.update(bArr, 0, bArr.length);
        this.digest.doFinal(bArr6, 0, i19);
        System.arraycopy(Arrays.concatenate(bArrCopyOfRange, bArr), 0, bArr2, 0, this.len_s_bytes + this.len_pk_bytes);
        for (int i21 = 0; i21 < 8; i21++) {
            int i22 = 0;
            while (true) {
                int i23 = this.f99066n;
                if (i22 < i23) {
                    System.arraycopy(Pack.shortToLittleEndian(sArrSample_matrix[(i23 * i21) + i22]), 0, bArr2, this.len_s_bytes + this.len_pk_bytes + (this.f99066n * i21 * 2) + (i22 * 2), 2);
                    i22++;
                }
            }
        }
        int i24 = this.len_sk_bytes;
        int i25 = this.len_pkh_bytes;
        System.arraycopy(bArr6, 0, bArr2, i24 - i25, i25);
    }
}
