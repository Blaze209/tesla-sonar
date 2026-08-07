package org.spongycastle.pqc.crypto.sphincs;

import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes10.dex */
class Horst {
    static final int HORST_K = 32;
    static final int HORST_LOGT = 16;
    static final int HORST_SIGBYTES = 13312;
    static final int HORST_SKBYTES = 32;
    static final int HORST_T = 65536;
    static final int N_MASKS = 32;

    Horst() {
    }

    static void expand_seed(byte[] bArr, byte[] bArr2) {
        Seed.prg(bArr, 0, 2097152L, bArr2, 0);
    }

    static int horst_sign(HashFunctions hashFunctions, byte[] bArr, int i11, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        byte[] bArr6 = new byte[PKIFailureInfo.badSenderNonce];
        byte[] bArr7 = new byte[4194272];
        expand_seed(bArr6, bArr3);
        for (int i12 = 0; i12 < 65536; i12++) {
            hashFunctions.hash_n_n(bArr7, (65535 + i12) * 32, bArr6, i12 * 32);
        }
        for (int i13 = 0; i13 < 16; i13++) {
            long j11 = (1 << (16 - i13)) - 1;
            int i14 = 1 << (15 - i13);
            long j12 = i14 - 1;
            int i15 = 0;
            while (i15 < i14) {
                hashFunctions.hash_2n_n_mask(bArr7, (int) ((((long) i15) + j12) * 32), bArr7, (int) ((((long) (i15 * 2)) + j11) * 32), bArr4, i13 * 64);
                i15++;
                j12 = j12;
            }
        }
        int i16 = 2016;
        int i17 = i11;
        while (i16 < 4064) {
            bArr[i17] = bArr7[i16];
            i16++;
            i17++;
        }
        for (int i18 = 0; i18 < 32; i18++) {
            int i19 = i18 * 2;
            int i21 = (bArr5[i19] & 255) + ((bArr5[i19 + 1] & 255) << 8);
            int i22 = 0;
            while (i22 < 32) {
                bArr[i17] = bArr6[(i21 * 32) + i22];
                i22++;
                i17++;
            }
            int i23 = i21 + 65535;
            for (int i24 = 0; i24 < 10; i24++) {
                int i25 = (i23 & 1) != 0 ? i23 + 1 : i23 - 1;
                int i26 = 0;
                while (i26 < 32) {
                    bArr[i17] = bArr7[(i25 * 32) + i26];
                    i26++;
                    i17++;
                }
                i23 = (i25 - 1) / 2;
            }
        }
        for (int i27 = 0; i27 < 32; i27++) {
            bArr2[i27] = bArr7[i27];
        }
        return HORST_SIGBYTES;
    }

    static int horst_verify(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4) {
        byte[] bArr5 = bArr2;
        byte[] bArr6 = new byte[1024];
        int i12 = i11 + 2048;
        int i13 = 0;
        while (i13 < 32) {
            int i14 = i13 * 2;
            int i15 = (bArr4[i14] & 255) + ((bArr4[i14 + 1] & 255) << 8);
            if ((i15 & 1) == 0) {
                hashFunctions.hash_n_n(bArr6, 0, bArr5, i12);
                for (int i16 = 0; i16 < 32; i16++) {
                    bArr6[i16 + 32] = bArr5[i12 + 32 + i16];
                }
            } else {
                hashFunctions.hash_n_n(bArr6, 32, bArr5, i12);
                for (int i17 = 0; i17 < 32; i17++) {
                    bArr6[i17] = bArr5[i12 + 32 + i17];
                }
            }
            int i18 = i12 + 64;
            int i19 = 1;
            while (i19 < 10) {
                int i21 = i15 >>> 1;
                if ((i21 & 1) == 0) {
                    hashFunctions.hash_2n_n_mask(bArr6, 0, bArr6, 0, bArr3, (i19 - 1) * 64);
                    for (int i22 = 0; i22 < 32; i22++) {
                        bArr6[i22 + 32] = bArr5[i18 + i22];
                    }
                } else {
                    hashFunctions.hash_2n_n_mask(bArr6, 32, bArr6, 0, bArr3, (i19 - 1) * 64);
                    for (int i23 = 0; i23 < 32; i23++) {
                        bArr6[i23] = bArr5[i18 + i23];
                    }
                }
                i18 += 32;
                i19++;
                i15 = i21;
            }
            int i24 = i15 >>> 1;
            hashFunctions.hash_2n_n_mask(bArr6, 0, bArr6, 0, bArr3, 576);
            for (int i25 = 0; i25 < 32; i25++) {
                if (bArr5[(i24 * 32) + i11 + i25] != bArr6[i25]) {
                    for (int i26 = 0; i26 < 32; i26++) {
                        bArr[i26] = 0;
                    }
                    return -1;
                }
            }
            i13++;
            i12 = i18;
        }
        int i27 = 0;
        while (i27 < 32) {
            hashFunctions.hash_2n_n_mask(bArr6, i27 * 32, bArr5, i11 + (i27 * 64), bArr3, 640);
            i27++;
            bArr5 = bArr2;
        }
        for (int i28 = 0; i28 < 16; i28++) {
            hashFunctions.hash_2n_n_mask(bArr6, i28 * 32, bArr6, i28 * 64, bArr3, 704);
        }
        for (int i29 = 0; i29 < 8; i29++) {
            hashFunctions.hash_2n_n_mask(bArr6, i29 * 32, bArr6, i29 * 64, bArr3, 768);
        }
        for (int i31 = 0; i31 < 4; i31++) {
            hashFunctions.hash_2n_n_mask(bArr6, i31 * 32, bArr6, i31 * 64, bArr3, 832);
        }
        for (int i32 = 0; i32 < 2; i32++) {
            hashFunctions.hash_2n_n_mask(bArr6, i32 * 32, bArr6, i32 * 64, bArr3, 896);
        }
        hashFunctions.hash_2n_n_mask(bArr, 0, bArr6, 0, bArr3, 960);
        return 0;
    }
}
