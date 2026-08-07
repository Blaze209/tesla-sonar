package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* JADX INFO: loaded from: classes9.dex */
public class PKCS7Padding implements BlockCipherPadding {
    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i11) {
        byte length = (byte) (bArr.length - i11);
        while (i11 < bArr.length) {
            bArr[i11] = length;
            i11++;
        }
        return length;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "PKCS7";
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) {
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws InvalidCipherTextException {
        byte b11 = bArr[bArr.length - 1];
        int i11 = b11 & 255;
        int length = bArr.length - i11;
        int i12 = ((i11 - 1) | length) >> 31;
        for (int i13 = 0; i13 < bArr.length; i13++) {
            i12 |= (bArr[i13] ^ b11) & (~((i13 - length) >> 31));
        }
        if (i12 == 0) {
            return i11;
        }
        throw new InvalidCipherTextException("pad block corrupted");
    }
}
