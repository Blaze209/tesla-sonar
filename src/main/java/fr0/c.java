package fr0;

import java.io.Closeable;

/* JADX INFO: loaded from: classes10.dex */
public class c extends a implements Closeable {
    public static byte[] B(String str) {
        byte[] bArr = new byte[4];
        if (str != null) {
            for (int i11 = 0; i11 < Math.min(4, str.length()); i11++) {
                bArr[i11] = (byte) str.charAt(i11);
            }
        }
        return bArr;
    }
}
