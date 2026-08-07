package org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.crypto.Xof;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes10.dex */
class BIKEUtils {
    BIKEUtils() {
    }

    protected static int CHECK_BIT(byte[] bArr, int i11) {
        return (bArr[i11 / 8] >>> (i11 % 8)) & 1;
    }

    protected static void SET_BIT(byte[] bArr, int i11) {
        int i12 = i11 / 8;
        bArr[i12] = (byte) (((long) bArr[i12]) | (1 << (i11 % 8)));
    }

    static void fromBitArrayToByteArray(byte[] bArr, byte[] bArr2, int i11, int i12) {
        long j11 = i12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < j11) {
            int i15 = i13 + 8;
            if (i15 >= i12) {
                int i16 = i11 + i13;
                int i17 = bArr2[i16];
                for (int i18 = (i12 - i13) - 1; i18 >= 1; i18--) {
                    i17 |= bArr2[i16 + i18] << i18;
                }
                bArr[i14] = (byte) i17;
            } else {
                int i19 = i13 + i11;
                int i21 = bArr2[i19];
                for (int i22 = 7; i22 >= 1; i22--) {
                    i21 |= bArr2[i19 + i22] << i22;
                }
                bArr[i14] = (byte) i21;
            }
            i14++;
            i13 = i15;
        }
    }

    static void generateRandomByteArray(byte[] bArr, int i11, int i12, Xof xof) {
        byte[] bArr2 = new byte[4];
        for (int i13 = i12 - 1; i13 >= 0; i13--) {
            xof.doOutput(bArr2, 0, 4);
            int iLittleEndianToInt = ((int) (((((long) Pack.littleEndianToInt(bArr2, 0)) & 4294967295L) * ((long) (i11 - i13))) >> 32)) + i13;
            if (CHECK_BIT(bArr, iLittleEndianToInt) != 0) {
                iLittleEndianToInt = i13;
            }
            SET_BIT(bArr, iLittleEndianToInt);
        }
    }

    static int getHammingWeight(byte[] bArr) {
        int i11 = 0;
        for (byte b11 : bArr) {
            i11 += b11;
        }
        return i11;
    }
}
