package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes10.dex */
class FalconCodec {
    final byte[] max_fg_bits = {0, 8, 8, 8, 8, 8, 7, 7, 6, 6, 5};
    final byte[] max_FG_bits = {0, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
    final byte[] max_sig_bits = {0, 10, 11, 11, 12, 12, 12, 12, 12, 12, 12};

    FalconCodec() {
    }

    int comp_decode(short[] sArr, int i11, int i12, byte[] bArr, int i13, int i14) {
        int i15 = 1 << i12;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < i15; i19++) {
            if (i18 >= i14) {
                return 0;
            }
            i16 = (i16 << 8) | (bArr[i13 + i18] & 255);
            i18++;
            int i21 = i16 >>> i17;
            int i22 = i21 & 128;
            int i23 = i21 & 127;
            do {
                if (i17 == 0) {
                    if (i18 >= i14) {
                        return 0;
                    }
                    i16 = (i16 << 8) | (bArr[i13 + i18] & 255);
                    i18++;
                    i17 = 8;
                }
                i17--;
                if (((i16 >>> i17) & 1) == 0) {
                    i23 += 128;
                } else {
                    if (i22 != 0 && i23 == 0) {
                        return 0;
                    }
                    int i24 = i11 + i19;
                    if (i22 != 0) {
                        i23 = -i23;
                    }
                    sArr[i24] = (short) i23;
                }
            } while (i23 <= 2047);
            return 0;
        }
        if ((((1 << i17) - 1) & i16) != 0) {
            return 0;
        }
        return i18;
    }

    int comp_encode(byte[] bArr, int i11, int i12, short[] sArr, int i13, int i14) {
        int i15;
        int i16 = 1 << i14;
        for (int i17 = 0; i17 < i16; i17++) {
            short s11 = sArr[i13 + i17];
            if (s11 < -2047 || s11 > 2047) {
                return 0;
            }
        }
        int i18 = 0;
        int i19 = 0;
        int i21 = 0;
        for (int i22 = 0; i22 < i16; i22++) {
            int i23 = i19 << 1;
            short s12 = sArr[i13 + i22];
            if (s12 < 0) {
                i15 = s12;
                i23 |= 1;
                i15 = -s12;
            }
            i15 = s12;
            int i24 = (i23 << 7) | (i15 & 127);
            int i25 = (i15 >>> 7) + 1;
            i19 = (i24 << i25) | 1;
            i18 = i18 + 8 + i25;
            while (i18 >= 8) {
                i18 -= 8;
                if (bArr != null) {
                    if (i21 >= i12) {
                        return 0;
                    }
                    bArr[i11 + i21] = (byte) (i19 >>> i18);
                }
                i21++;
            }
        }
        if (i18 <= 0) {
            return i21;
        }
        if (bArr != null) {
            if (i21 >= i12) {
                return 0;
            }
            bArr[i11 + i21] = (byte) (i19 << (8 - i18));
        }
        return i21 + 1;
    }

    int modq_decode(short[] sArr, int i11, int i12, byte[] bArr, int i13, int i14) {
        int i15 = 1 << i12;
        int i16 = ((i15 * 14) + 7) >> 3;
        if (i16 > i14) {
            return 0;
        }
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < i15) {
            int i21 = i13 + 1;
            i18 = (i18 << 8) | (bArr[i13] & 255);
            int i22 = i19 + 8;
            if (i22 >= 14) {
                i19 -= 6;
                int i23 = (i18 >>> i19) & 16383;
                if (i23 >= 12289) {
                    return 0;
                }
                sArr[i11 + i17] = (short) i23;
                i17++;
            } else {
                i19 = i22;
            }
            i13 = i21;
        }
        if ((((1 << i19) - 1) & i18) != 0) {
            return 0;
        }
        return i16;
    }

    int modq_encode(byte[] bArr, int i11, int i12, short[] sArr, int i13, int i14) {
        int i15 = 1 << i14;
        for (int i16 = 0; i16 < i15; i16++) {
            if ((65535 & sArr[i13 + i16]) >= 12289) {
                return 0;
            }
        }
        int i17 = ((i15 * 14) + 7) >> 3;
        if (bArr != null) {
            if (i17 > i12) {
                return 0;
            }
            int i18 = 0;
            int i19 = 0;
            for (int i21 = 0; i21 < i15; i21++) {
                i19 = (i19 << 14) | (sArr[i13 + i21] & HPKE.aead_EXPORT_ONLY);
                i18 += 14;
                while (i18 >= 8) {
                    i18 -= 8;
                    bArr[i11] = (byte) (i19 >> i18);
                    i11++;
                }
            }
            if (i18 > 0) {
                bArr[i11] = (byte) (i19 << (8 - i18));
            }
        }
        return i17;
    }

    int trim_i16_decode(short[] sArr, int i11, int i12, int i13, byte[] bArr, int i14, int i15) {
        int i16 = 1 << i12;
        int i17 = ((i16 * i13) + 7) >> 3;
        if (i17 > i15) {
            return 0;
        }
        int i18 = (1 << i13) - 1;
        int i19 = 1 << (i13 - 1);
        int i21 = i14;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        while (i22 < i16) {
            int i25 = i21 + 1;
            i23 = (i23 << 8) | (bArr[i21] & 255);
            i24 += 8;
            while (i24 >= i13 && i22 < i16) {
                i24 -= i13;
                int i26 = (i23 >>> i24) & i18;
                int i27 = i26 | (-(i26 & i19));
                if (i27 == (-i19)) {
                    return 0;
                }
                sArr[i11 + i22] = (short) (i27 | (-(i27 & i19)));
                i22++;
            }
            i21 = i25;
        }
        if ((((1 << i24) - 1) & i23) != 0) {
            return 0;
        }
        return i17;
    }

    int trim_i16_encode(byte[] bArr, int i11, int i12, short[] sArr, int i13, int i14, int i15) {
        int i16 = 1 << i14;
        int i17 = (1 << (i15 - 1)) - 1;
        int i18 = -i17;
        for (int i19 = 0; i19 < i16; i19++) {
            short s11 = sArr[i13 + i19];
            if (s11 < i18 || s11 > i17) {
                return 0;
            }
        }
        int i21 = ((i16 * i15) + 7) >> 3;
        if (bArr != null) {
            if (i21 > i12) {
                return 0;
            }
            int i22 = (1 << i15) - 1;
            int i23 = 0;
            int i24 = 0;
            for (int i25 = 0; i25 < i16; i25++) {
                i24 = (i24 << i15) | (sArr[i13 + i25] & 4095 & i22);
                i23 += i15;
                while (i23 >= 8) {
                    i23 -= 8;
                    bArr[i11] = (byte) (i24 >> i23);
                    i11++;
                }
            }
            if (i23 > 0) {
                bArr[i11] = (byte) (i24 << (8 - i23));
            }
        }
        return i21;
    }

    int trim_i8_decode(byte[] bArr, int i11, int i12, int i13, byte[] bArr2, int i14, int i15) {
        int i16 = 1 << i12;
        int i17 = ((i16 * i13) + 7) >> 3;
        if (i17 > i15) {
            return 0;
        }
        int i18 = (1 << i13) - 1;
        int i19 = 1 << (i13 - 1);
        int i21 = i14;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        while (i22 < i16) {
            int i25 = i21 + 1;
            i23 = (i23 << 8) | (bArr2[i21] & 255);
            i24 += 8;
            while (i24 >= i13 && i22 < i16) {
                i24 -= i13;
                int i26 = (i23 >>> i24) & i18;
                int i27 = i26 | (-(i26 & i19));
                if (i27 == (-i19)) {
                    return 0;
                }
                bArr[i11 + i22] = (byte) i27;
                i22++;
            }
            i21 = i25;
        }
        if ((((1 << i24) - 1) & i23) != 0) {
            return 0;
        }
        return i17;
    }

    int trim_i8_encode(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14, int i15) {
        int i16 = 1 << i14;
        int i17 = (1 << (i15 - 1)) - 1;
        int i18 = -i17;
        for (int i19 = 0; i19 < i16; i19++) {
            int i21 = bArr2[i13 + i19];
            if (i21 < i18 || i21 > i17) {
                return 0;
            }
        }
        int i22 = ((i16 * i15) + 7) >> 3;
        if (bArr != null) {
            if (i22 > i12) {
                return 0;
            }
            int i23 = (1 << i15) - 1;
            int i24 = 0;
            int i25 = 0;
            for (int i26 = 0; i26 < i16; i26++) {
                i25 = (i25 << i15) | (bArr2[i13 + i26] & 65535 & i23);
                i24 += i15;
                while (i24 >= 8) {
                    i24 -= 8;
                    bArr[i11] = (byte) (i25 >>> i24);
                    i11++;
                }
            }
            if (i24 > 0) {
                bArr[i11] = (byte) (i25 << (8 - i24));
            }
        }
        return i22;
    }
}
