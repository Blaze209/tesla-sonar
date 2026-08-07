package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* JADX INFO: loaded from: classes9.dex */
public class ISO7816d4Padding implements BlockCipherPadding {
    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i11) {
        int length = bArr.length - i11;
        bArr[i11] = -128;
        while (true) {
            i11++;
            if (i11 >= bArr.length) {
                return length;
            }
            bArr[i11] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "ISO7816-4";
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) {
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws InvalidCipherTextException {
        int length = bArr.length;
        int i11 = -1;
        int i12 = -1;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            int i13 = bArr[length] & 255;
            i11 ^= ((((i13 ^ 128) - 1) >> 31) & i12) & (length ^ i11);
            i12 &= (i13 - 1) >> 31;
        }
        if (i11 >= 0) {
            return bArr.length - i11;
        }
        throw new InvalidCipherTextException("pad block corrupted");
    }
}
