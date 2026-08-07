package org.spongycastle.pqc.crypto.sphincs;

import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes10.dex */
class Permute {
    private static final int CHACHA_ROUNDS = 12;

    Permute() {
    }

    public static void permute(int i11, int[] iArr) {
        int i12 = 16;
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i11 % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        int i13 = iArr[0];
        int i14 = iArr[1];
        int i15 = iArr[2];
        char c11 = 3;
        int i16 = iArr[3];
        char c12 = 4;
        int i17 = iArr[4];
        char c13 = 5;
        int i18 = iArr[5];
        char c14 = 6;
        int i19 = iArr[6];
        int i21 = 7;
        int i22 = iArr[7];
        int i23 = 8;
        int i24 = iArr[8];
        int i25 = iArr[9];
        int i26 = iArr[10];
        int i27 = iArr[11];
        int i28 = iArr[12];
        int i29 = iArr[13];
        int i31 = iArr[14];
        int iRotl = iArr[15];
        int iRotl2 = i31;
        int iRotl3 = i29;
        int iRotl4 = i28;
        int i32 = i27;
        int i33 = i26;
        int i34 = i25;
        int i35 = i24;
        int iRotl5 = i22;
        int iRotl6 = i19;
        int iRotl7 = i18;
        int iRotl8 = i17;
        int i36 = i16;
        int i37 = i15;
        int i38 = i14;
        int i39 = i13;
        int i41 = i11;
        while (i41 > 0) {
            int i42 = i39 + iRotl8;
            char c15 = c11;
            int iRotl9 = rotl(iRotl4 ^ i42, i12);
            int i43 = i35 + iRotl9;
            int iRotl10 = rotl(iRotl8 ^ i43, 12);
            int i44 = i42 + iRotl10;
            int iRotl11 = rotl(iRotl9 ^ i44, i23);
            int i45 = i43 + iRotl11;
            int iRotl12 = rotl(iRotl10 ^ i45, i21);
            int i46 = i38 + iRotl7;
            char c16 = c12;
            int iRotl13 = rotl(iRotl3 ^ i46, i12);
            int i47 = i34 + iRotl13;
            int iRotl14 = rotl(iRotl7 ^ i47, 12);
            int i48 = i46 + iRotl14;
            int iRotl15 = rotl(iRotl13 ^ i48, i23);
            int i49 = i47 + iRotl15;
            int iRotl16 = rotl(iRotl14 ^ i49, i21);
            int i51 = i37 + iRotl6;
            char c17 = c13;
            int iRotl17 = rotl(iRotl2 ^ i51, i12);
            int i52 = i33 + iRotl17;
            char c18 = c14;
            int iRotl18 = rotl(iRotl6 ^ i52, 12);
            int i53 = i51 + iRotl18;
            int iRotl19 = rotl(iRotl17 ^ i53, i23);
            int i54 = i52 + iRotl19;
            int iRotl20 = rotl(iRotl18 ^ i54, i21);
            int i55 = i36 + iRotl5;
            int iRotl21 = rotl(iRotl ^ i55, i12);
            int i56 = i32 + iRotl21;
            int iRotl22 = rotl(iRotl5 ^ i56, 12);
            int i57 = i55 + iRotl22;
            int iRotl23 = rotl(iRotl21 ^ i57, i23);
            int i58 = i56 + iRotl23;
            int iRotl24 = rotl(iRotl22 ^ i58, 7);
            int i59 = i44 + iRotl16;
            int iRotl25 = rotl(iRotl23 ^ i59, 16);
            int i61 = i54 + iRotl25;
            int iRotl26 = rotl(iRotl16 ^ i61, 12);
            i39 = i59 + iRotl26;
            iRotl = rotl(iRotl25 ^ i39, 8);
            i33 = i61 + iRotl;
            iRotl7 = rotl(iRotl26 ^ i33, 7);
            int i62 = i48 + iRotl20;
            int iRotl27 = rotl(iRotl11 ^ i62, 16);
            int i63 = i58 + iRotl27;
            int iRotl28 = rotl(iRotl20 ^ i63, 12);
            i38 = i62 + iRotl28;
            iRotl4 = rotl(iRotl27 ^ i38, 8);
            i32 = i63 + iRotl4;
            iRotl6 = rotl(iRotl28 ^ i32, 7);
            int i64 = i53 + iRotl24;
            int iRotl29 = rotl(iRotl15 ^ i64, 16);
            int i65 = i45 + iRotl29;
            int iRotl30 = rotl(iRotl24 ^ i65, 12);
            i37 = i64 + iRotl30;
            iRotl3 = rotl(iRotl29 ^ i37, 8);
            i35 = i65 + iRotl3;
            iRotl5 = rotl(iRotl30 ^ i35, 7);
            int i66 = i57 + iRotl12;
            int iRotl31 = rotl(iRotl19 ^ i66, 16);
            int i67 = i49 + iRotl31;
            int iRotl32 = rotl(iRotl12 ^ i67, 12);
            i36 = i66 + iRotl32;
            iRotl2 = rotl(iRotl31 ^ i36, 8);
            i34 = i67 + iRotl2;
            iRotl8 = rotl(iRotl32 ^ i34, 7);
            i41 -= 2;
            i21 = 7;
            i12 = 16;
            c11 = c15;
            c12 = c16;
            c13 = c17;
            c14 = c18;
            i23 = 8;
        }
        iArr[0] = i39;
        iArr[1] = i38;
        iArr[2] = i37;
        iArr[c11] = i36;
        iArr[c12] = iRotl8;
        iArr[c13] = iRotl7;
        iArr[c14] = iRotl6;
        iArr[i21] = iRotl5;
        iArr[8] = i35;
        iArr[9] = i34;
        iArr[10] = i33;
        iArr[11] = i32;
        iArr[12] = iRotl4;
        iArr[13] = iRotl3;
        iArr[14] = iRotl2;
        iArr[15] = iRotl;
    }

    protected static int rotl(int i11, int i12) {
        return (i11 >>> (-i12)) | (i11 << i12);
    }

    void chacha_permute(byte[] bArr, byte[] bArr2) {
        int[] iArr = new int[16];
        for (int i11 = 0; i11 < 16; i11++) {
            iArr[i11] = Pack.littleEndianToInt(bArr2, i11 * 4);
        }
        permute(12, iArr);
        for (int i12 = 0; i12 < 16; i12++) {
            Pack.intToLittleEndian(iArr[i12], bArr, i12 * 4);
        }
    }
}
