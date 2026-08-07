package rb0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f107482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f107483b;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f107482a = charArray;
        int[] iArr = new int[256];
        f107483b = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i11 = 0; i11 < length; i11++) {
            f107483b[f107482a[i11]] = i11;
        }
        f107483b[61] = 0;
    }

    public static final byte[] a(String str) {
        int i11;
        int i12;
        int length = str.length();
        if (length == 0) {
            return new byte[0];
        }
        int i13 = length - 1;
        int i14 = 0;
        while (i14 < i13 && f107483b[str.charAt(i14) & 255] < 0) {
            i14++;
        }
        while (i13 > 0 && f107483b[str.charAt(i13) & 255] < 0) {
            i13--;
        }
        if (str.charAt(i13) == '=') {
            i11 = str.charAt(i13 + (-1)) == '=' ? 2 : 1;
        } else {
            i11 = 0;
        }
        int i15 = (i13 - i14) + 1;
        if (length > 76) {
            i12 = (str.charAt(76) == '\r' ? i15 / 78 : 0) << 1;
        } else {
            i12 = 0;
        }
        int i16 = (((i15 - i12) * 6) >> 3) - i11;
        byte[] bArr = new byte[i16];
        int i17 = (i16 / 3) * 3;
        int i18 = 0;
        int i19 = 0;
        while (i18 < i17) {
            int[] iArr = f107483b;
            int i21 = i14 + 4;
            int i22 = iArr[str.charAt(i14 + 3)] | (iArr[str.charAt(i14 + 1)] << 12) | (iArr[str.charAt(i14)] << 18) | (iArr[str.charAt(i14 + 2)] << 6);
            bArr[i18] = (byte) (i22 >> 16);
            int i23 = i18 + 2;
            bArr[i18 + 1] = (byte) (i22 >> 8);
            i18 += 3;
            bArr[i23] = (byte) i22;
            if (i12 <= 0 || (i19 = i19 + 1) != 19) {
                i14 = i21;
            } else {
                i14 += 6;
                i19 = 0;
            }
        }
        if (i18 < i16) {
            int i24 = 0;
            int i25 = 0;
            while (i14 <= i13 - i11) {
                i24 |= f107483b[str.charAt(i14)] << (18 - (i25 * 6));
                i25++;
                i14++;
            }
            int i26 = 16;
            while (i18 < i16) {
                bArr[i18] = (byte) (i24 >> i26);
                i26 -= 8;
                i18++;
            }
        }
        return bArr;
    }

    public static final char[] b(byte[] bArr, boolean z11) {
        int length = bArr != null ? bArr.length : 0;
        if (length == 0) {
            return new char[0];
        }
        int i11 = (length / 3) * 3;
        int i12 = length - 1;
        int i13 = ((i12 / 3) + 1) << 2;
        int i14 = i13 + (z11 ? ((i13 - 1) / 76) << 1 : 0);
        char[] cArr = new char[i14];
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < i11) {
            int i18 = i15 + 2;
            int i19 = ((bArr[i15 + 1] & 255) << 8) | ((bArr[i15] & 255) << 16);
            i15 += 3;
            int i21 = i19 | (bArr[i18] & 255);
            char[] cArr2 = f107482a;
            cArr[i16] = cArr2[(i21 >>> 18) & 63];
            cArr[i16 + 1] = cArr2[(i21 >>> 12) & 63];
            cArr[i16 + 2] = cArr2[(i21 >>> 6) & 63];
            int i22 = i16 + 4;
            cArr[i16 + 3] = cArr2[i21 & 63];
            if (z11 && (i17 = i17 + 1) == 19 && i22 < i14 - 2) {
                int i23 = i16 + 5;
                cArr[i22] = '\r';
                i16 += 6;
                cArr[i23] = '\n';
                i17 = 0;
            } else {
                i16 = i22;
            }
        }
        int i24 = length - i11;
        if (i24 > 0) {
            int i25 = ((bArr[i11] & 255) << 10) | (i24 == 2 ? (bArr[i12] & 255) << 2 : 0);
            char[] cArr3 = f107482a;
            cArr[i14 - 4] = cArr3[i25 >> 12];
            cArr[i14 - 3] = cArr3[(i25 >>> 6) & 63];
            cArr[i14 - 2] = i24 == 2 ? cArr3[i25 & 63] : '=';
            cArr[i14 - 1] = '=';
        }
        return cArr;
    }

    public static final String c(byte[] bArr, boolean z11) {
        return new String(b(bArr, z11));
    }
}
