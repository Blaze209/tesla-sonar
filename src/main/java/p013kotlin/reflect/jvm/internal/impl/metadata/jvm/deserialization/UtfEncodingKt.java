package p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class UtfEncodingKt {
    public static final byte[] stringsToBytes(String[] strings) {
        s.k(strings, "strings");
        int length = 0;
        for (String str : strings) {
            length += str.length();
        }
        byte[] bArr = new byte[length];
        int i11 = 0;
        for (String str2 : strings) {
            int length2 = str2.length();
            int i12 = 0;
            while (i12 < length2) {
                bArr[i11] = (byte) str2.charAt(i12);
                i12++;
                i11++;
            }
        }
        return bArr;
    }
}
