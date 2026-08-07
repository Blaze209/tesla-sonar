package nh;

import com.plaid.internal.EnumC4419g;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f95011a = new byte[128];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f95012b = new char[64];

    static {
        int i11 = 0;
        for (int i12 = 0; i12 < 128; i12++) {
            f95011a[i12] = -1;
        }
        for (int i13 = 90; i13 >= 65; i13--) {
            f95011a[i13] = (byte) (i13 - 65);
        }
        for (int i14 = 122; i14 >= 97; i14--) {
            f95011a[i14] = (byte) (i14 - 71);
        }
        for (int i15 = 57; i15 >= 48; i15--) {
            f95011a[i15] = (byte) (i15 + 4);
        }
        byte[] bArr = f95011a;
        bArr[43] = 62;
        bArr[47] = 63;
        for (int i16 = 0; i16 <= 25; i16++) {
            f95012b[i16] = (char) (i16 + 65);
        }
        int i17 = 26;
        int i18 = 0;
        while (i17 <= 51) {
            f95012b[i17] = (char) (i18 + 97);
            i17++;
            i18++;
        }
        int i19 = 52;
        while (i19 <= 61) {
            f95012b[i19] = (char) (i11 + 48);
            i19++;
            i11++;
        }
        char[] cArr = f95012b;
        cArr[62] = '+';
        cArr[63] = '/';
    }

    public static int a(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (!f(cArr[i12])) {
                cArr[i11] = cArr[i12];
                i11++;
            }
        }
        return i11;
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length * 8;
        if (length == 0) {
            return "";
        }
        int i11 = length % 24;
        int i12 = length / 24;
        char[] cArr = new char[(i11 != 0 ? i12 + 1 : i12) * 4];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            byte b11 = bArr[i13];
            int i16 = i13 + 2;
            byte b12 = bArr[i13 + 1];
            i13 += 3;
            byte b13 = bArr[i16];
            byte b14 = (byte) (b12 & 15);
            byte b15 = (byte) (b11 & 3);
            int i17 = b11 & (-128);
            int i18 = b11 >> 2;
            if (i17 != 0) {
                i18 ^= 192;
            }
            byte b16 = (byte) i18;
            int i19 = b12 & (-128);
            int i21 = b12 >> 4;
            if (i19 != 0) {
                i21 ^= EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
            }
            byte b17 = (byte) i21;
            byte b18 = (byte) ((b13 & (-128)) == 0 ? b13 >> 6 : (b13 >> 6) ^ EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
            char[] cArr2 = f95012b;
            cArr[i14] = cArr2[b16];
            cArr[i14 + 1] = cArr2[b17 | (b15 << 4)];
            int i22 = i14 + 3;
            cArr[i14 + 2] = cArr2[(b14 << 2) | b18];
            i14 += 4;
            cArr[i22] = cArr2[b13 & 63];
        }
        if (i11 == 8) {
            byte b19 = bArr[i13];
            byte b21 = (byte) (b19 & 3);
            int i23 = b19 & (-128);
            int i24 = b19 >> 2;
            if (i23 != 0) {
                i24 ^= 192;
            }
            byte b22 = (byte) i24;
            char[] cArr3 = f95012b;
            cArr[i14] = cArr3[b22];
            cArr[i14 + 1] = cArr3[b21 << 4];
            cArr[i14 + 2] = '=';
            cArr[i14 + 3] = '=';
        } else if (i11 == 16) {
            byte b23 = bArr[i13];
            byte b24 = bArr[i13 + 1];
            byte b25 = (byte) (b24 & 15);
            byte b26 = (byte) (b23 & 3);
            int i25 = b23 & (-128);
            int i26 = b23 >> 2;
            if (i25 != 0) {
                i26 ^= 192;
            }
            byte b27 = (byte) i26;
            int i27 = b24 & (-128);
            int i28 = b24 >> 4;
            if (i27 != 0) {
                i28 ^= EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
            }
            byte b28 = (byte) i28;
            char[] cArr4 = f95012b;
            cArr[i14] = cArr4[b27];
            cArr[i14 + 1] = cArr4[b28 | (b26 << 4)];
            cArr[i14 + 2] = cArr4[b25 << 2];
            cArr[i14 + 3] = '=';
        }
        return new String(cArr);
    }

    public static boolean c(char c11) {
        return c11 < 128 && f95011a[c11] != -1;
    }

    public static byte[] d(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int iA = a(charArray);
        if (iA % 4 != 0) {
            return null;
        }
        int i11 = iA / 4;
        if (i11 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i11 * 3];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i11 - 1) {
            int i15 = i13 + 1;
            char c11 = charArray[i13];
            if (c(c11)) {
                int i16 = i13 + 2;
                char c12 = charArray[i15];
                if (c(c12)) {
                    int i17 = i13 + 3;
                    char c13 = charArray[i16];
                    if (c(c13)) {
                        i13 += 4;
                        char c14 = charArray[i17];
                        if (c(c14)) {
                            byte[] bArr2 = f95011a;
                            byte b11 = bArr2[c11];
                            byte b12 = bArr2[c12];
                            byte b13 = bArr2[c13];
                            byte b14 = bArr2[c14];
                            bArr[i14] = (byte) ((b11 << 2) | (b12 >> 4));
                            int i18 = i14 + 2;
                            bArr[i14 + 1] = (byte) (((b12 & 15) << 4) | ((b13 >> 2) & 15));
                            i14 += 3;
                            bArr[i18] = (byte) ((b13 << 6) | b14);
                            i12++;
                        }
                    }
                }
            }
            return null;
        }
        int i19 = i13 + 1;
        char c15 = charArray[i13];
        if (!c(c15)) {
            return null;
        }
        int i21 = i13 + 2;
        char c16 = charArray[i19];
        if (!c(c16)) {
            return null;
        }
        byte[] bArr3 = f95011a;
        byte b15 = bArr3[c15];
        byte b16 = bArr3[c16];
        char c17 = charArray[i21];
        char c18 = charArray[i13 + 3];
        if (c(c17) && c(c18)) {
            byte b17 = bArr3[c17];
            byte b18 = bArr3[c18];
            bArr[i14] = (byte) ((b15 << 2) | (b16 >> 4));
            bArr[i14 + 1] = (byte) (((b16 & 15) << 4) | ((b17 >> 2) & 15));
            bArr[i14 + 2] = (byte) (b18 | (b17 << 6));
            return bArr;
        }
        if (e(c17) && e(c18)) {
            if ((b16 & 15) != 0) {
                return null;
            }
            int i22 = i12 * 3;
            byte[] bArr4 = new byte[i22 + 1];
            System.arraycopy(bArr, 0, bArr4, 0, i22);
            bArr4[i14] = (byte) ((b15 << 2) | (b16 >> 4));
            return bArr4;
        }
        if (e(c17) || !e(c18)) {
            return null;
        }
        byte b19 = bArr3[c17];
        if ((b19 & 3) != 0) {
            return null;
        }
        int i23 = i12 * 3;
        byte[] bArr5 = new byte[i23 + 2];
        System.arraycopy(bArr, 0, bArr5, 0, i23);
        bArr5[i14] = (byte) ((b15 << 2) | (b16 >> 4));
        bArr5[i14 + 1] = (byte) (((b19 >> 2) & 15) | ((b16 & 15) << 4));
        return bArr5;
    }

    public static boolean e(char c11) {
        return c11 == '=';
    }

    public static boolean f(char c11) {
        return c11 == ' ' || c11 == '\r' || c11 == '\n' || c11 == '\t';
    }
}
