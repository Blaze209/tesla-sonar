package org.spongycastle.crypto.params;

/* JADX INFO: loaded from: classes10.dex */
public class DESedeParameters extends DESParameters {
    public static final int DES_EDE_KEY_LENGTH = 24;

    public DESedeParameters(byte[] bArr) {
        super(bArr);
        if (isWeakKey(bArr, 0, bArr.length)) {
            throw new IllegalArgumentException("attempt to create weak DESede key");
        }
    }

    public static boolean isReal2Key(byte[] bArr, int i11) {
        boolean z11 = false;
        for (int i12 = i11; i12 != i11 + 8; i12++) {
            if (bArr[i12] != bArr[i12 + 8]) {
                z11 = true;
            }
        }
        return z11;
    }

    public static boolean isReal3Key(byte[] bArr, int i11) {
        int i12 = i11;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (true) {
            boolean z14 = true;
            if (i12 == i11 + 8) {
                break;
            }
            byte b11 = bArr[i12];
            byte b12 = bArr[i12 + 8];
            z11 |= b11 != b12;
            byte b13 = bArr[i12 + 16];
            z12 |= b11 != b13;
            if (b12 == b13) {
                z14 = false;
            }
            z13 |= z14;
            i12++;
        }
        return z11 && z12 && z13;
    }

    public static boolean isRealEDEKey(byte[] bArr, int i11) {
        return bArr.length == 16 ? isReal2Key(bArr, i11) : isReal3Key(bArr, i11);
    }

    public static boolean isWeakKey(byte[] bArr, int i11, int i12) {
        while (i11 < i12) {
            if (DESParameters.isWeakKey(bArr, i11)) {
                return true;
            }
            i11 += 8;
        }
        return false;
    }

    public static boolean isWeakKey(byte[] bArr, int i11) {
        return isWeakKey(bArr, i11, bArr.length - i11);
    }
}
