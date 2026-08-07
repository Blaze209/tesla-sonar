package yz;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
final class b {
    private static int a(long j11) {
        int i11 = (int) j11;
        if (i11 == j11) {
            return i11;
        }
        throw new IllegalArgumentException(j11 + " cannot be cast to int without changing its value.");
    }

    static int b(int i11, boolean z11) {
        if (i11 == 0) {
            return 0;
        }
        if (!z11) {
            return (((i11 - 1) / 3) + 1) << 2;
        }
        int i12 = (i11 / 3) << 2;
        int i13 = i11 % 3;
        return i13 == 0 ? i12 : i12 + i13 + 1;
    }

    public static byte[] c(String str) {
        if (str == null || str.isEmpty()) {
            return new byte[0];
        }
        byte[] bytes = str.getBytes(l.f126026a);
        int length = bytes.length;
        byte[] bArr = new byte[a((((long) length) * 6) >> 3)];
        int i11 = 0;
        int i12 = 0;
        while (i11 < bytes.length) {
            int i13 = 0;
            int i14 = 0;
            while (i13 < 4 && i11 < length) {
                int i15 = i11 + 1;
                int iD = d(bytes[i11]);
                if (iD >= 0) {
                    i14 |= iD << (18 - (i13 * 6));
                    i13++;
                }
                i11 = i15;
            }
            if (i13 >= 2) {
                int i16 = i12 + 1;
                bArr[i12] = (byte) (i14 >> 16);
                if (i13 >= 3) {
                    int i17 = i12 + 2;
                    bArr[i16] = (byte) (i14 >> 8);
                    if (i13 >= 4) {
                        i12 += 3;
                        bArr[i17] = (byte) i14;
                    } else {
                        i12 = i17;
                    }
                } else {
                    i12 = i16;
                }
            }
        }
        return Arrays.copyOf(bArr, i12);
    }

    static int d(byte b11) {
        int i11 = i(b11, 64) & j(b11, 91);
        int i12 = i(b11, 96) & j(b11, 123);
        int i13 = i(b11, 47) & j(b11, 58);
        int iH = h(b11, 45) | h(b11, 43);
        int iH2 = h(b11, 47) | h(b11, 95);
        return k(i13, b11 + 4, 0) | k(i11, b11 - 65, 0) | k(i12, b11 - 71, 0) | k(iH, 62, 0) | k(iH2, 63, 0) | k(i11 | i12 | i13 | iH | iH2, 0, -1);
    }

    static byte e(int i11) {
        int iJ = j(i11, 26);
        int i12 = i(i11, 25) & j(i11, 52);
        return (byte) (k(i(i11, 51) & j(i11, 62), i11 - 4, 0) | k(iJ, i11 + 65, 0) | k(i12, i11 + 71, 0) | k(h(i11, 62), 43, 0) | k(h(i11, 63), 47, 0));
    }

    static byte f(int i11) {
        int iJ = j(i11, 26);
        int i12 = i(i11, 25) & j(i11, 52);
        return (byte) (k(i(i11, 51) & j(i11, 62), i11 - 4, 0) | k(iJ, i11 + 65, 0) | k(i12, i11 + 71, 0) | k(h(i11, 62), 45, 0) | k(h(i11, 63), 95, 0));
    }

    public static String g(byte[] bArr, boolean z11) {
        int length = bArr != null ? bArr.length : 0;
        if (length == 0) {
            return "";
        }
        int i11 = (length / 3) * 3;
        int iB = b(length, z11);
        byte[] bArr2 = new byte[iB];
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i12 + 2;
            int i15 = ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12] & 255) << 16);
            i12 += 3;
            int i16 = i15 | (bArr[i14] & 255);
            if (z11) {
                bArr2[i13] = f((i16 >>> 18) & 63);
                bArr2[i13 + 1] = f((i16 >>> 12) & 63);
                int i17 = i13 + 3;
                bArr2[i13 + 2] = f((i16 >>> 6) & 63);
                i13 += 4;
                bArr2[i17] = f(i16 & 63);
            } else {
                bArr2[i13] = e((i16 >>> 18) & 63);
                bArr2[i13 + 1] = e((i16 >>> 12) & 63);
                int i18 = i13 + 3;
                bArr2[i13 + 2] = e((i16 >>> 6) & 63);
                i13 += 4;
                bArr2[i18] = e(i16 & 63);
            }
        }
        int i19 = length - i11;
        if (i19 > 0) {
            int i21 = ((bArr[i11] & 255) << 10) | (i19 == 2 ? (bArr[length - 1] & 255) << 2 : 0);
            if (!z11) {
                bArr2[iB - 4] = e(i21 >> 12);
                bArr2[iB - 3] = e((i21 >>> 6) & 63);
                bArr2[iB - 2] = i19 == 2 ? e(i21 & 63) : (byte) 61;
                bArr2[iB - 1] = 61;
            } else if (i19 == 2) {
                bArr2[iB - 3] = f(i21 >> 12);
                bArr2[iB - 2] = f((i21 >>> 6) & 63);
                bArr2[iB - 1] = f(i21 & 63);
            } else {
                bArr2[iB - 2] = f(i21 >> 12);
                bArr2[iB - 1] = f((i21 >>> 6) & 63);
            }
        }
        return new String(bArr2, l.f126026a);
    }

    static int h(int i11, int i12) {
        int i13 = i11 ^ i12;
        return ((~i13) & (i13 - 1)) >>> 63;
    }

    static int i(int i11, int i12) {
        return (int) ((((long) i12) - ((long) i11)) >>> 63);
    }

    static int j(int i11, int i12) {
        return (int) ((((long) i11) - ((long) i12)) >>> 63);
    }

    static int k(int i11, int i12, int i13) {
        return ((i11 - 1) & (i13 ^ i12)) ^ i12;
    }
}
