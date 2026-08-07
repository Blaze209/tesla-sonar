package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes9.dex */
public class TBCPadding implements BlockCipherPadding {
    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i11) {
        int length = bArr.length - i11;
        int i12 = 0;
        if (i11 <= 0 ? (bArr[bArr.length - 1] & 1) == 0 : (bArr[i11 - 1] & 1) == 0) {
            i12 = 255;
        }
        byte b11 = (byte) i12;
        while (i11 < bArr.length) {
            bArr[i11] = b11;
            i11++;
        }
        return length;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "TBC";
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) {
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) {
        int length = bArr.length - 1;
        int i11 = bArr[length] & 255;
        int i12 = -1;
        int i13 = 1;
        while (true) {
            length--;
            if (length < 0) {
                return i13;
            }
            i12 &= (((bArr[length] & 255) ^ i11) - 1) >> 31;
            i13 -= i12;
        }
    }
}
