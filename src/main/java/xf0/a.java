package xf0;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static String a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b11 : bArr) {
            sb2.append("0123456789abcdef".charAt((b11 & 255) >> 4));
            sb2.append("0123456789abcdef".charAt(b11 & 15));
        }
        return sb2.toString();
    }

    public static byte[] b(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length / 2;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            int iDigit = Character.digit(charArray[i12 + 1], 16) | (Character.digit(charArray[i12], 16) << 4);
            if (iDigit > 127) {
                iDigit -= 256;
            }
            bArr[i11] = (byte) iDigit;
        }
        return bArr;
    }
}
