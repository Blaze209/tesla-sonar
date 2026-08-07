package org.bouncycastle.pqc.crypto.falcon;

/* JADX INFO: loaded from: classes10.dex */
class FalconCommon {
    static final int[] l2bound = {0, 101498, 208714, 428865, 892039, 1852696, 3842630, 7959734, 16468416, 34034726, 70265242};

    FalconCommon() {
    }

    void hash_to_point_ct(SHAKE256 shake256, short[] sArr, int i11, int i12, short[] sArr2, int i13) {
        int i14;
        short s11;
        char c11;
        int i15;
        char c12;
        short s12;
        short[] sArr3 = new short[63];
        int i16 = 1 << i12;
        int i17 = i16 << 1;
        short s13 = new short[]{0, 65, 67, 71, 77, 86, 100, 122, 154, 205, 287}[i12];
        int i18 = i16 + s13;
        int i19 = 0;
        for (int i21 = 0; i21 < i18; i21++) {
            byte[] bArr = new byte[2];
            shake256.inner_shake256_extract(bArr, 0, 2);
            int i22 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i23 = i22 - ((((i22 - 24578) >>> 31) - 1) & 24578);
            int i24 = i23 - ((((i23 - 24578) >>> 31) - 1) & 24578);
            int i25 = (((i22 - 61445) >>> 31) - 1) | (i24 - ((((i24 - 12289) >>> 31) - 1) & 12289));
            if (i21 < i16) {
                sArr[i11 + i21] = (short) i25;
            } else if (i21 < i17) {
                sArr2[(i13 + i21) - i16] = (short) i25;
            } else {
                sArr3[i21 - i17] = (short) i25;
            }
        }
        int i26 = 1;
        while (i26 <= s13) {
            int i27 = i19;
            int i28 = i27;
            while (i27 < i18) {
                if (i27 < i16) {
                    i14 = i11 + i27;
                    s11 = sArr[i14];
                    c11 = 1;
                } else if (i27 < i17) {
                    i14 = (i13 + i27) - i16;
                    s11 = sArr2[i14];
                    c11 = 2;
                } else {
                    i14 = i27 - i17;
                    s11 = sArr3[i14];
                    c11 = 3;
                }
                int i29 = i27 - i28;
                int i31 = (s11 >>> 15) - 1;
                i28 -= i31;
                if (i27 >= i26) {
                    int i32 = i27 - i26;
                    if (i32 < i16) {
                        i15 = (i11 + i27) - i26;
                        s12 = sArr[i15];
                        c12 = 1;
                    } else if (i32 < i17) {
                        i15 = (i13 + i32) - i16;
                        s12 = sArr2[i15];
                        c12 = 2;
                    } else {
                        i15 = i32 - i17;
                        c12 = 3;
                        s12 = sArr3[i15];
                    }
                    int i33 = i31 & (-(((i29 & i26) + 511) >> 9));
                    if (c11 == 1) {
                        sArr[i14] = (short) (((s11 ^ s12) & i33) ^ s11);
                    } else if (c11 == 2) {
                        sArr2[i14] = (short) (((s11 ^ s12) & i33) ^ s11);
                    } else {
                        sArr3[i14] = (short) (((s11 ^ s12) & i33) ^ s11);
                    }
                    char c13 = c12;
                    if (c13 == 1) {
                        sArr[i15] = (short) (s12 ^ ((s11 ^ s12) & i33));
                    } else if (c13 == 2) {
                        sArr2[i15] = (short) (s12 ^ ((s11 ^ s12) & i33));
                    } else {
                        sArr3[i15] = (short) (s12 ^ ((s11 ^ s12) & i33));
                    }
                }
                i27++;
            }
            i26 <<= 1;
            i19 = 0;
        }
    }

    void hash_to_point_vartime(SHAKE256 shake256, short[] sArr, int i11, int i12) {
        int i13 = 1 << i12;
        while (i13 > 0) {
            byte[] bArr = new byte[2];
            shake256.inner_shake256_extract(bArr, 0, 2);
            int i14 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            if (i14 < 61445) {
                while (i14 >= 12289) {
                    i14 -= 12289;
                }
                sArr[i11] = (short) i14;
                i13--;
                i11++;
            }
        }
    }

    int is_short(short[] sArr, int i11, short[] sArr2, int i12, int i13) {
        int i14 = 1 << i13;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < i14; i17++) {
            short s11 = sArr[i11 + i17];
            int i18 = i15 + (s11 * s11);
            int i19 = i16 | i18;
            short s12 = sArr2[i12 + i17];
            i15 = i18 + (s12 * s12);
            i16 = i19 | i15;
        }
        return (((long) ((-(i16 >>> 31)) | i15)) & 4294967295L) <= ((long) l2bound[i13]) ? 1 : 0;
    }

    int is_short_half(int i11, short[] sArr, int i12, int i13) {
        int i14 = 1 << i13;
        int i15 = -(i11 >>> 31);
        for (int i16 = 0; i16 < i14; i16++) {
            short s11 = sArr[i12 + i16];
            i11 += s11 * s11;
            i15 |= i11;
        }
        return (((long) (i11 | (-(i15 >>> 31)))) & 4294967295L) <= ((long) l2bound[i13]) ? 1 : 0;
    }
}
