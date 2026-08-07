package org.bouncycastle.math.ec.rfc8032;

/* JADX INFO: loaded from: classes10.dex */
abstract class Wnaf {
    Wnaf() {
    }

    static void getSignedVar(int[] iArr, int i11, byte[] bArr) {
        int length = iArr.length * 2;
        int[] iArr2 = new int[length];
        int i12 = iArr[iArr.length - 1] >> 31;
        int length2 = iArr.length;
        int i13 = length;
        while (true) {
            length2--;
            if (length2 < 0) {
                break;
            }
            int i14 = iArr[length2];
            iArr2[i13 - 1] = (i12 << 16) | (i14 >>> 16);
            i13 -= 2;
            iArr2[i13] = i14;
            i12 = i14;
        }
        int i15 = 32 - i11;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < length) {
            int i19 = iArr2[i16];
            while (i17 < 16) {
                int i21 = i19 >>> i17;
                if ((i21 & 1) == i18) {
                    i17++;
                } else {
                    int i22 = (i21 | 1) << i15;
                    bArr[(i16 << 4) + i17] = (byte) (i22 >> i15);
                    i17 += i11;
                    i18 = i22 >>> 31;
                }
            }
            i16++;
            i17 -= 16;
        }
    }
}
