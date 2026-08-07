package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes5.dex */
public final class zzgj {
    public static byte[] zza(byte[]... bArr) {
        int i11 = 0;
        int length = 0;
        while (true) {
            if (i11 >= bArr.length) {
                break;
            }
            length += bArr[i11].length;
            i11++;
        }
        byte[] bArr2 = new byte[length];
        int i12 = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i12, length2);
            i12 += length2;
        }
        return bArr2;
    }
}
