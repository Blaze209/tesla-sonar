package j$.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class Base64 {
    public static Encoder getEncoder() {
        return Encoder.f82279b;
    }

    public static class Encoder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final char[] f82278a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Encoder f82279b = new Encoder();

        public String encodeToString(byte[] bArr) {
            int length = ((bArr.length + 2) / 3) * 4;
            byte[] bArrCopyOf = new byte[length];
            int length2 = bArr.length;
            int i11 = (length2 / 3) * 3;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                char[] cArr = f82278a;
                if (i12 >= i11) {
                    if (i12 < length2) {
                        int i14 = i12 + 1;
                        int i15 = bArr[i12] & 255;
                        int i16 = i13 + 1;
                        bArrCopyOf[i13] = (byte) cArr[i15 >> 2];
                        if (i14 == length2) {
                            bArrCopyOf[i16] = (byte) cArr[(i15 << 4) & 63];
                            int i17 = i13 + 3;
                            bArrCopyOf[i13 + 2] = 61;
                            i13 += 4;
                            bArrCopyOf[i17] = 61;
                        } else {
                            int i18 = bArr[i14] & 255;
                            bArrCopyOf[i16] = (byte) cArr[((i15 << 4) & 63) | (i18 >> 4)];
                            int i19 = i13 + 3;
                            bArrCopyOf[i13 + 2] = (byte) cArr[(i18 << 2) & 63];
                            i13 += 4;
                            bArrCopyOf[i19] = 61;
                        }
                    }
                    if (i13 != length) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i13);
                    }
                    return new String(bArrCopyOf, 0, 0, bArrCopyOf.length);
                }
                int iMin = Math.min(i12 + i11, i11);
                int i21 = i12;
                int i22 = i13;
                while (i21 < iMin) {
                    int i23 = i21 + 2;
                    int i24 = ((bArr[i21 + 1] & 255) << 8) | ((bArr[i21] & 255) << 16);
                    i21 += 3;
                    int i25 = i24 | (bArr[i23] & 255);
                    bArrCopyOf[i22] = (byte) cArr[(i25 >>> 18) & 63];
                    bArrCopyOf[i22 + 1] = (byte) cArr[(i25 >>> 12) & 63];
                    int i26 = i22 + 3;
                    bArrCopyOf[i22 + 2] = (byte) cArr[(i25 >>> 6) & 63];
                    i22 += 4;
                    bArrCopyOf[i26] = (byte) cArr[i25 & 63];
                }
                int i27 = ((iMin - i12) / 3) * 4;
                i13 += i27;
                if (i27 == -1 && iMin < length2) {
                    throw null;
                }
                i12 = iMin;
            }
        }
    }
}
