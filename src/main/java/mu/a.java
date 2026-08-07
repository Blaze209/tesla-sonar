package mu;

import com.google.android.vending.licensing.util.Base64DecoderException;
import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f92509a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f92510b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f92511c = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, Tnaf.POW_2_WIDTH, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f92512d = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, Tnaf.POW_2_WIDTH, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};

    public static byte[] a(String str) {
        byte[] bytes = str.getBytes();
        return b(bytes, 0, bytes.length);
    }

    public static byte[] b(byte[] bArr, int i11, int i12) {
        return c(bArr, i11, i12, f92511c);
    }

    public static byte[] c(byte[] bArr, int i11, int i12, byte[] bArr2) throws Base64DecoderException {
        byte[] bArr3 = new byte[((i12 * 3) / 4) + 2];
        byte[] bArr4 = new byte[4];
        int i13 = 0;
        int iD = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = i14 + i11;
            byte b11 = (byte) (bArr[i15] & 127);
            byte b12 = bArr2[b11];
            if (b12 < -5) {
                throw new Base64DecoderException("Bad Base64 input character at " + i14 + ": " + ((int) bArr[i15]) + "(decimal)");
            }
            if (b12 >= -1) {
                if (b11 == 61) {
                    int i16 = i12 - i14;
                    byte b13 = (byte) (bArr[(i12 - 1) + i11] & 127);
                    if (i13 == 0 || i13 == 1) {
                        throw new Base64DecoderException("invalid padding byte '=' at byte offset " + i14);
                    }
                    if ((i13 == 3 && i16 > 2) || (i13 == 4 && i16 > 1)) {
                        throw new Base64DecoderException("padding byte '=' falsely signals end of encoded value at offset " + i14);
                    }
                    if (b13 != 61 && b13 != 10) {
                        throw new Base64DecoderException("encoded value has invalid trailing byte");
                    }
                    break;
                    break;
                }
                int i17 = i13 + 1;
                bArr4[i13] = b11;
                if (i17 == 4) {
                    iD += d(bArr4, 0, bArr3, iD, bArr2);
                    i13 = 0;
                } else {
                    i13 = i17;
                }
            }
        }
        if (i13 != 0) {
            if (i13 == 1) {
                throw new Base64DecoderException("single trailing character at offset " + (i12 - 1));
            }
            bArr4[i13] = 61;
            iD += d(bArr4, 0, bArr3, iD, bArr2);
        }
        byte[] bArr5 = new byte[iD];
        System.arraycopy(bArr3, 0, bArr5, 0, iD);
        return bArr5;
    }

    private static int d(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3) {
        byte b11 = bArr[i11 + 2];
        if (b11 == 61) {
            bArr2[i12] = (byte) ((((bArr3[bArr[i11 + 1]] << 24) >>> 12) | ((bArr3[bArr[i11]] << 24) >>> 6)) >>> 16);
            return 1;
        }
        byte b12 = bArr[i11 + 3];
        if (b12 == 61) {
            int i13 = ((bArr3[bArr[i11 + 1]] << 24) >>> 12) | ((bArr3[bArr[i11]] << 24) >>> 6) | ((bArr3[b11] << 24) >>> 18);
            bArr2[i12] = (byte) (i13 >>> 16);
            bArr2[i12 + 1] = (byte) (i13 >>> 8);
            return 2;
        }
        int i14 = ((bArr3[bArr[i11 + 1]] << 24) >>> 12) | ((bArr3[bArr[i11]] << 24) >>> 6) | ((bArr3[b11] << 24) >>> 18) | ((bArr3[b12] << 24) >>> 24);
        bArr2[i12] = (byte) (i14 >> 16);
        bArr2[i12 + 1] = (byte) (i14 >> 8);
        bArr2[i12 + 2] = (byte) i14;
        return 3;
    }

    public static String e(byte[] bArr) {
        return f(bArr, 0, bArr.length, f92509a, true);
    }

    public static String f(byte[] bArr, int i11, int i12, byte[] bArr2, boolean z11) {
        byte[] bArrG = g(bArr, i11, i12, bArr2, Integer.MAX_VALUE);
        int length = bArrG.length;
        while (!z11 && length > 0 && bArrG[length - 1] == 61) {
            length--;
        }
        return new String(bArrG, 0, length);
    }

    public static byte[] g(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        int i14 = ((i12 + 2) / 3) * 4;
        byte[] bArr3 = new byte[i14 + (i14 / i13)];
        int i15 = i12 - 2;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < i15) {
            int i19 = ((bArr[i16 + i11] << 24) >>> 8) | ((bArr[(i16 + 1) + i11] << 24) >>> 16) | ((bArr[(i16 + 2) + i11] << 24) >>> 24);
            bArr3[i17] = bArr2[i19 >>> 18];
            int i21 = i17 + 1;
            bArr3[i21] = bArr2[(i19 >>> 12) & 63];
            bArr3[i17 + 2] = bArr2[(i19 >>> 6) & 63];
            bArr3[i17 + 3] = bArr2[i19 & 63];
            i18 += 4;
            if (i18 == i13) {
                bArr3[i17 + 4] = 10;
                i18 = 0;
                i17 = i21;
            }
            i16 += 3;
            i17 += 4;
        }
        if (i16 < i12) {
            h(bArr, i11 + i16, i12 - i16, bArr3, i17, bArr2);
            if (i18 + 4 == i13) {
                bArr3[i17 + 4] = 10;
            }
        }
        return bArr3;
    }

    private static byte[] h(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, byte[] bArr3) {
        int i14 = (i12 > 0 ? (bArr[i11] << 24) >>> 8 : 0) | (i12 > 1 ? (bArr[i11 + 1] << 24) >>> 16 : 0) | (i12 > 2 ? (bArr[i11 + 2] << 24) >>> 24 : 0);
        if (i12 == 1) {
            bArr2[i13] = bArr3[i14 >>> 18];
            bArr2[i13 + 1] = bArr3[(i14 >>> 12) & 63];
            bArr2[i13 + 2] = 61;
            bArr2[i13 + 3] = 61;
            return bArr2;
        }
        if (i12 == 2) {
            bArr2[i13] = bArr3[i14 >>> 18];
            bArr2[i13 + 1] = bArr3[(i14 >>> 12) & 63];
            bArr2[i13 + 2] = bArr3[(i14 >>> 6) & 63];
            bArr2[i13 + 3] = 61;
            return bArr2;
        }
        if (i12 != 3) {
            return bArr2;
        }
        bArr2[i13] = bArr3[i14 >>> 18];
        bArr2[i13 + 1] = bArr3[(i14 >>> 12) & 63];
        bArr2[i13 + 2] = bArr3[(i14 >>> 6) & 63];
        bArr2[i13 + 3] = bArr3[i14 & 63];
        return bArr2;
    }
}
