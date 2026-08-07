package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes9.dex */
public class ZeroBytePadding implements BlockCipherPadding {
    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i11) {
        int length = bArr.length - i11;
        while (i11 < bArr.length) {
            bArr[i11] = 0;
            i11++;
        }
        return length;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "ZeroByte";
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) {
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) {
        int length = bArr.length;
        int i11 = 0;
        int i12 = -1;
        while (true) {
            length--;
            if (length < 0) {
                return i11;
            }
            i12 &= ((bArr[length] & 255) - 1) >> 31;
            i11 -= i12;
        }
    }
}
